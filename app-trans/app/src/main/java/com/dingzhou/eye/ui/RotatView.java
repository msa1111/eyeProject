package com.dingzhou.eye.ui;

import com.dingzhou.eye.FragmentLeft;
import com.dingzhou.eye.SelectChange.TxtViewVessel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
public class RotatView extends View {
	float o_x;//???????x
	float o_y;//???????y
	Handler handler;//????????handler
	int delayedTime = 20;//handler???????????
	static final int play = 0;//???????????????
	static final int stop = 1;//?????????????????
//	double currentTime = 0;//??μ???????,????????????????????????????.
	int width;//??????
	int height;//??????
	//view????????????:?????????????????view???????Σ???????????????????
	double maxwidth;
	Bitmap rotatBitmap;//???????
	private PaintFlagsDrawFilter pfd;//?????
	private FragmentLeft mContext;
	public RotatView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}
	//?????handler??????????
	private void init() 
	{
		pfd = new PaintFlagsDrawFilter(0, Paint.ANTI_ALIAS_FLAG | Paint.FILTER_BITMAP_FLAG);
		// vRecord = new VRecord();
		handler = new Handler() {
			@Override
			public void handleMessage(Message msg) {

				double detaTime = System.currentTimeMillis();
				switch (msg.what) {

				case play: {
					if (isClockWise) {
						speed = speed * detaTime;
						if (speed <= 0) {
							return;
						} else {
							handler.sendEmptyMessageDelayed(play, delayedTime);
						}
					} else {
						speed = speed * detaTime;
						if (speed >= 0) {
							return;
						} else {
							handler.sendEmptyMessageDelayed(play, delayedTime);
						}
					}

					addDegree((float) (speed * detaTime + (detaTime * detaTime) / 2));

					// if (a < a_max) {
					// a = (float)(a + a_add*detaTime);
					// System.out.println("a:"+a);
					// }
					System.currentTimeMillis();
					invalidate();

					break;
				}
				case stop: {
					speed = 0;
					handler.removeMessages(play);
				}
				}

				super.handleMessage(msg);
			}
		};
		// ??????????????
		initSize();
	}

	public void setRotatBitmap(Bitmap bitmap) {
		rotatBitmap = bitmap;
		initSize();
		postInvalidate();
	}

	public void setRotatDrawableResource(int id, FragmentLeft context) {

		BitmapDrawable drawable = (BitmapDrawable) getContext().getResources().getDrawable(id);

		setRotatDrawable(drawable);

		mContext = context;
	}

	public void setRotatDrawable(BitmapDrawable drawable) {
		rotatBitmap = drawable.getBitmap();
		initSize();
		postInvalidate();
	}

	private void initSize() {
		if (rotatBitmap == null) {

			// throw new NoBitMapError("Error,No bitmap in RotatView!");
			return;
		}
		width = rotatBitmap.getWidth();
		height = rotatBitmap.getHeight();

		maxwidth = Math.sqrt(width * width + height * height);
		//maxwidth = 200;
		o_x = o_y = (float) (maxwidth / 2);// ??????????
	}

	//??????????????????????????????360????????????????????????????
	private void addDegree(float added) {
		deta_degree += added;
		if (deta_degree > 360 || deta_degree < -360) {
			deta_degree = deta_degree % 360;
		}
		

	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) 
	{
		Paint paint = new Paint();
		Matrix matrix = new Matrix();
		// ???????λ??
		matrix.setTranslate((float) width / 2, (float) height / 2);
		// ????
		matrix.preRotate(deta_degree);
		// ????
		matrix.preTranslate(-(float) width / 2, -(float) height / 2);
		// ??λ?????view??????
		matrix.postTranslate((float) (maxwidth - width) / 2, (float) (maxwidth - height) / 2);
		// ?????
		canvas.setDrawFilter(pfd);
		canvas.drawBitmap(rotatBitmap, matrix, paint);
		super.onDraw(canvas);
	}

	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		// ???????????????????????????????ε?????????
		setMeasuredDimension((int) maxwidth, (int) maxwidth);
	}
	float down_x;//???????????x??????
	float down_y;//???????????y??????
	float target_x;//??????x??????
	float target_y;//??????y??????
	float up_x;//???????x??????
	float up_y;//???????y??????
	float current_degree;//????????(??? view ??????????)
	float up_degree;//??????????(??? view ??????????)
	float deta_degree;//??????????????(??? view ??????????)
	double lastMoveTime = 0;//??????????????????
	double speed = 0;//??????(??/????)
	// VRecord vRecord;//????????
	boolean isClockWise;//???????????

	@Override
	public boolean onTouchEvent(MotionEvent event) 
	{
		if (rotatBitmap == null) {
			throw new NoBitMapError("Error,No bitmap in RotatView!");
		}
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN: {
			down_x = event.getX();
			down_y = event.getY();
			current_degree = detaDegree(o_x, o_y, down_x, down_y);
			// vRecord.reset();
			// handler.sendEmptyMessage(stop);
			break;
		}
		case MotionEvent.ACTION_MOVE: {
			down_x = target_x = event.getX();
			down_y = target_y = event.getY();
			float degree = detaDegree(o_x, o_y, target_x, target_y);
			// ?????????????
			float dete = (degree - current_degree);
			// ???С??-90????? ??????????????????350->17,
			if (dete < -270) {
				dete = dete + 360;
				// ???????90????? ??????????????????-350->-17,
			} else if (dete > 270) {
				dete = dete - 360;
			}
			lastMoveTime = System.currentTimeMillis();
			// vRecord.add(dete, lastMoveTime);
			
			if(Math.abs(dete)<15.0) break;
			if(dete>0)dete = (float) 10.0;
			else dete = (float) -10.0;
				
			if(!_isTextSetting)setText(dete);
			current_degree = degree;
			addDegree(dete);
			postInvalidate();

			break;
		}
		case MotionEvent.ACTION_CANCEL:
		case MotionEvent.ACTION_UP: {
			double lastupTime = System.currentTimeMillis();
			double detaTime = lastupTime - lastMoveTime;
			up_x = event.getX();
			up_y = event.getY();
			up_degree = detaDegree(o_x, o_y, up_x, up_y);
		// ??????????
		// speed = speed + vRecord.getSpeed();
		//	if (speed > 0) {
		//		speed = Math.min(VRecord.max_speed, speed);
		//	} else {
		//		speed = Math.max(-VRecord.max_speed, speed);
		//	}
			if (speed > 0) {
				isClockWise = true;
				// v = 1;
			} else {
				isClockWise = false;
				// v = -1;
			}
			System.currentTimeMillis();
			handler.sendEmptyMessage(0);
			break;
		}
		}
		return true;
	}

	private boolean _isTextSetting = false;
	private void setText(float degree) {
		// TODO Auto-generated method stub
		_isTextSetting = true;
		TxtViewVessel vessel = TxtViewVessel.getInstance(mContext);
		if (degree<0)//isClockWise) {
		{
			vessel.ChangeText(-1);
		} else {
			vessel.ChangeText(1);
		}
		_isTextSetting = false;
	}

	/**
	 * ??????(src_x,src_y)???????????????????????(target_x,target_y)??????x???н?
	 * ????????÷????к???????????н?
	 * 
	 * @param src_x
	 * @param src_y
	 * @param target_x
	 * @param target_y
	 * @return
	 */
	float detaDegree(float src_x, float src_y, float target_x, float target_y) {

		float detaX = target_x - src_x;
		float detaY = target_y - src_y;
		double d;
		if (detaX != 0) {
			float tan = Math.abs(detaY / detaX);

			if (detaX > 0) {

				if (detaY >= 0) {
					d = Math.atan(tan);

				} else {
					d = 2 * Math.PI - Math.atan(tan);
				}

			} else {
				if (detaY >= 0) {

					d = Math.PI - Math.atan(tan);
				} else {
					d = Math.PI + Math.atan(tan);
				}
			}

		} else {
			if (detaY > 0) {
				d = Math.PI / 2;
			} else {

				d = -Math.PI / 2;
			}
		}
		return (float) ((d * 180) / Math.PI);
		//return (float) ((d * 180) / Math.PI);
	}

	/**
	 *
	 * 
	 * @author sun.shine
	 */
	static class NoBitMapError extends RuntimeException {

		/**
         * 
         */
		private static final long serialVersionUID = 1L;

		public NoBitMapError(String detailMessage) {
			super(detailMessage);
		}

	}

	/**
	 * ???????? ??????????? ?????????????????????????<br>
	 * ????????????????????????????????????????????
	 * 
	 * @author sun.shine
	 */
	static class VRecord {
		/**
		 * ?????е???Ч????
		 */
		int addCount;
		/**
		 * ??????????????
		 */
		public static final int length = 15;
		/**
		 *
		 */
		double[][] record = new double[length][2];

		/**
		 * ???????????????<br>
		 * ??????????????и???????????length??????????????length???????
		 * 
		 * @param detadegree
		 * @param time
		 */
		public void add(double detadegree, double time) {

			for (int i = length - 1; i > 0; i--) {
				record[i][0] = record[i - 1][0];
				record[i][1] = record[i - 1][1];
			}
			record[0][0] = detadegree;
			record[0][1] = time;
			addCount++;
		}

		/**
		 * ??????
		 */
		public static final double max_speed = 1;

		/**
		 * ??????????????????????????????<br>
		 * ????????????????????????????????????????????????????????<br>
		 * ??????????{@link VRecord#max_speed}
		 * 
		 * @return
		 */
		public double getSpeed() {

			if (addCount == 0) {
				return 0;
			}
			int maxIndex = Math.min(addCount, length) - 1;

			if ((record[0][1] - record[maxIndex][1]) == 0) {
				return 0;
			}

			double detaTime = record[0][1] - record[maxIndex][1];
			double sumdegree = 0;
			for (int i = 0; i < length - 1; i++) {

				sumdegree += record[i][0];
				// System.out.println(record[i][0]);
			}

			// System.out.println("----------");
			// System.out.println(sumdegree);
			// System.out.println(detaTime);
			double result = sumdegree / detaTime;
			if (result > 0) {
				return Math.min(result, max_speed);
			} else {
				return Math.max(result, -max_speed);
			}
			// System.out.println("v=" + result);

		}

		/**
		 * ????
		 */
		public void reset() {
			addCount = 0;
			for (int i = length - 1; i > 0; i--) {
				record[i][0] = 0;
				record[i][1] = 0;
			}
		}
	}

	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		if (rotatBitmap != null) {
			rotatBitmap.recycle();
			rotatBitmap = null;
		}
	}
}
