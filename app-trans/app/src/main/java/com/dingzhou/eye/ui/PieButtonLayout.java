package com.dingzhou.eye.ui;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.dingzhou.eye.R;

public class PieButtonLayout extends FrameLayout {

	/** 圆的角度 */
	private static final int CIRCLE_ANGLE = 360;
	/** 默认内圈半径 */
	private static final int DEFAULT_INNER_RADIUS = 80;
	/** 默认外圈半径 */
	private static final int DEFAULT_RADIUS_INC = 100;
	/** 圆心坐标 */
	private Point mCenter;
	/** 内圈半径 */
	private int mInnerRadius;
	/** 外圈半径 */
	private int mRadiusInc;
	/** 点击事件 */
	private OnItemClickListener mItemClickListener = null;
	/** 按钮集合 */
	private List<PieItem> mItemList;
	/** 按钮平时颜色 */
	private Paint mNormalPaint;
	/** 按钮点击颜色 */
	private Paint mPressedPaint;
	/** 控件的大小*/
	int mItemSize;
	/** Activity标识 */
	private Context mContext;
	/** PieItem 对象 */
	private PieItem mLastTouchItem = null;
	/***/
	private boolean mIsLayoutItems = false;

	private boolean mIsTouchMove = false;

	/**
	 * @param context
	 * @param attrs
	 * @param defStyle
	 */
	public PieButtonLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init(context);
	}

	/**
	 * @param context
	 * @param attrs
	 */
	public PieButtonLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	/**
	 * @param context
	 */
	public PieButtonLayout(final Context context) {
		super(context);
		init(context);
		mContext = context;
		mItemSize = (int) context.getResources().getDimension(R.dimen.pie_button_item_size);
	}

	public void setOnItemClickListener(OnItemClickListener listener) {
		mItemClickListener = listener;
	}

	private void init(Context ctx) {
		mItemList = new ArrayList<PieItem>();
		Resources res = ctx.getResources();

		mInnerRadius = DEFAULT_INNER_RADIUS;
		mRadiusInc = DEFAULT_RADIUS_INC;
		setWillNotDraw(false);
		setDrawingCacheEnabled(false);
		mCenter = new Point(0, 0);
		mNormalPaint = new Paint();
		mNormalPaint.setColor(res.getColor(R.color.pie_button_bg));
		mNormalPaint.setAntiAlias(true);
		mPressedPaint = new Paint();
		mPressedPaint.setColor(res.getColor(R.color.pie_button_pressed));
		mPressedPaint.setAntiAlias(true);
	}

	public void addItem(PieItem item) {
		mItemList.add(item);
	}

	public void setCenter(Point center) {
		mCenter = center;
	}

	public void setCenter(int x, int y) {
		if (mCenter == null) {
			mCenter = new Point(x, y);
		} else {
			mCenter.x = x;
			mCenter.y = y;
		}
	}

	private double angle2arc(int angle) {
		return (angle * Math.PI / 180);
	}

	private int arc2angle(double arc) {
		TLog.d("arc to angle", "arc = " + arc);
		return (int) (arc * 180 / Math.PI);
	}

	/**
	 * @param startAngle
	 * @param endAngle
	 * @param inner
	 * @param outer
	 * @param center
	 * @return
	 */
	private Path makePath(int startAngle, int endAngle, int inner, int outer, Point center) {
		TLog.d("makePath", "start, end = " + startAngle + ", " + endAngle);
		// 0, 360, 0, inner-10, mCenter
		Path path = new Path();
		RectF innerRect = new RectF(center.x - inner, center.y - inner, center.x + inner, center.y + inner);
		RectF outerRect = new RectF(center.x - outer, center.y - outer, center.x + outer, center.y + outer);
		path.arcTo(innerRect, startAngle, endAngle - startAngle, true);
		path.arcTo(outerRect, endAngle, startAngle - endAngle, false);
		path.close();
		return path;
	}

	/**
	 * @param r
	 * @param center
	 * @return
	 */
	private Path makePath(int r, Point center) {
		// 0, 360, 0, inner-10, mCenter
		Path path = new Path();
		path.addCircle(center.x, center.y, r, Direction.CW);
		path.close();
		return path;
	}

	/**
     * 
     */
	private void layoutItems() {
		// TODO layoutItems
		int intervalAngle = 20;
		int inner = mInnerRadius - 10;
		int outer = mInnerRadius + mRadiusInc - 60;
		int incInterval = 2;
		int startAngleInterval = 0;
		int levelStartAngle = 0;

		int itemAngle = CIRCLE_ANGLE / (mItemList.size() - 1) - intervalAngle;
		int startAngle = levelStartAngle + 55;
		TLog.d("layout", "list.size = " + mItemList.size());
		for (PieItem item : mItemList) {
			View view = item.getView();
			view.measure(view.getLayoutParams().width, view.getLayoutParams().height);
			int w = view.getMeasuredWidth();
			int h = view.getMeasuredHeight();

			// show in center
			int r = inner + (outer - inner) / 2;
			double arc = angle2arc(startAngle + 35);
			int x = mCenter.x + (int) (r * Math.cos(arc)) - w / 3;
			int y = mCenter.y + (int) (r * Math.sin(arc)) - h / 3;

			if (item.getState() == 1) {
				view.layout(x, y, x + w, y + h);
				Path path = makePath(inner - 20, mCenter);
				item.setGeometry(0, 360, 0, inner - 20, path);
				continue;
			}
			view.layout(x-10, y-10, x + w, y + h);
			Log.d("viewSize1", view.getWidth() + " " + view.getHeight());
			Path path = makePath(startAngle, startAngle + itemAngle, inner, outer, mCenter);
			item.setGeometry(startAngle, itemAngle, inner, outer, path);
			startAngle += itemAngle + intervalAngle;
		}
		inner += mRadiusInc + incInterval;
		outer += mRadiusInc + incInterval;
		levelStartAngle += startAngleInterval;
	}

	private PieItem findItem(float x, float y) {
		// find the matching item:
		TLog.d("findItem", "x, y = " + x + " ," + y);
		x -= mCenter.x;
		y -= mCenter.y;
		int r = (int) Math.sqrt(x * x + y * y);
		int angle = arc2angle(Math.atan2(y, x));
		angle %= 360;
		if (angle < 0) {
			angle += 360;
		}
		TLog.d("findItem", "r, angle = " + r + " ," + angle);
		for (PieItem item : mItemList) {
			if (isPointInItem(r, angle, item)) {
				return item;
			}
		}
		return null;
	}

	/**
	 * is point with radius r and angle angle in item
	 * 
	 * @param r
	 *            radius
	 * @param angle
	 *            angle witch is belong [0, 360)
	 * @param item
	 * @return yes point in the item, otherwise false
	 */
	private boolean isPointInItem(int r, int angle, PieItem item) {
		if (item.getInnerRadius() <= r && item.getOuterRadius() >= r) {
			while (angle + CIRCLE_ANGLE <= item.getStartAngle() + item.getSweep()) {
				angle += CIRCLE_ANGLE;
			}
			if (item.getStartAngle() <= angle && item.getStartAngle() + item.getSweep() >= angle) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	private int mLastTouchX;
	private int mLastTouchY;

	@Override
	public boolean onTouchEvent(MotionEvent evt) {
		int x = (int) evt.getX();
		int y = (int) evt.getY();
		int action = evt.getActionMasked();
		if (MotionEvent.ACTION_DOWN == action) {
			mLastTouchX = x;
			mLastTouchY = y;
			mIsTouchMove = false;
			mLastTouchItem = findItem(x, y);
			if (mLastTouchItem != null) {
				TLog.d("touch", "item != null startAngle = " + mLastTouchItem.getStartAngle());
				mLastTouchItem.setPressed(true);
				invalidate();
			} else {
				TLog.d("touch", "item == null");
			}
			return true;
		} else if (MotionEvent.ACTION_UP == action) {
			TLog.d("touch", "up");
			if (mLastTouchItem != null) {
				mLastTouchItem.setPressed(false);
				invalidate();
			}
			if (!mIsTouchMove) {
				if (mItemClickListener != null && mLastTouchItem != null) {
					mItemClickListener.onItemClick(mLastTouchItem);
				}
			}
		} else if (MotionEvent.ACTION_CANCEL == action) {
			// mIsTouchMove = true;
		} else if (MotionEvent.ACTION_MOVE == action) {
			if (x != mLastTouchX || y != mLastTouchY) {
				mIsTouchMove = true;
			}
		}
		return false;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		if (!mIsLayoutItems) {
			layoutItems();
			mIsLayoutItems = true;
		}
		int state;
		drawRoundBg(canvas);
		for (PieItem item : mItemList) {
			Paint p = item.isPressed() ? mPressedPaint : mNormalPaint;
			state = canvas.save();
			drawPath(canvas, item.getPath(), p);
			canvas.restoreToCount(state);
			drawItem(canvas, item);
		}
		drawText(canvas);
	}

	private void drawText(Canvas canvas) {
		int x = mCenter.x;
		int y = mCenter.y;
		Paint p = new Paint();
		p.setColor(Color.BLACK);// 设置颜色
		p.setTextSize(30);
		Typeface font = Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD);
		p.setTypeface(font);
		canvas.drawText("LAMP", x - 40, y + 10, p);
	}

	@SuppressLint("NewApi")
	private void drawItem(Canvas canvas, PieItem item) {
		View view = item.getView();
		int state = canvas.save();
		canvas.translate(view.getX(), view.getY());
		view.draw(canvas);
		canvas.restoreToCount(state);
		state = canvas.save();
		canvas.restoreToCount(state);
	}

	private void drawPath(Canvas canvas, Path path, Paint paint) {
		canvas.drawPath(path, paint);
	}

	public PieItem makeItem(int image, int state) {
		ImageView view = new ImageView(mContext);
		view.setImageResource(image);
		view.setMinimumWidth(mItemSize);
		view.setMinimumHeight(mItemSize);
		view.setScaleType(ImageView.ScaleType.CENTER);
		LayoutParams lp = new LayoutParams(mItemSize, mItemSize);
		view.setLayoutParams(lp);
		return new PieItem(view, state);
	}

	private void drawRoundBg(Canvas canvas) {
		// TODO drawRoundBg
		int x = mCenter.x;
		int y = mCenter.y;
		Paint p = new Paint();
		p.setAntiAlias(true);// 设置画笔的锯齿效果true是去除，大家一看效果就明白了
		p.setColor(Color.GRAY);//设置颜色
		canvas.drawCircle(x, y, 140, p);//大圆
		p.setColor(Color.WHITE);//设置颜色
		canvas.drawCircle(x, y, 130, p);//小圆
		// p.setColor(Color.parseColor("#7CFC00"));//设置颜色
		// canvas.drawCircle(x, y, 120, p);//小小圆

	}

	public static interface OnItemClickListener {
		public void onItemClick(PieItem item);
	}
}
