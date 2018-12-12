package com.dingzhou.eye;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.lidroid.xutils.util.LogUtils;

public class PermissionActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premisson);
        //监听蓝牙
        regiestBroast();

        //如果蓝牙开启直接进入主页面
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if(defaultAdapter.isEnabled()) {
            startActivity(new Intent(this,MainActivity.class));
        }

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS),0);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    }



    //监听蓝牙连接状态
    private void regiestBroast() {
        IntentFilter connectedFilter = new IntentFilter(BluetoothAdapter.ACTION_STATE_CHANGED);
        registerReceiver(stateChangeReceiver, connectedFilter);
    }

    private BroadcastReceiver stateChangeReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int action = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE,
                    BluetoothAdapter.ERROR);
            switch (action) {
                case BluetoothAdapter.STATE_OFF:
//                    Log.d("tag", "STATE_OFF 手机蓝牙关闭");
                    break;
                case BluetoothAdapter.STATE_TURNING_OFF:
//                    Log.d("tag", "STATE_TURNING_OFF 手机蓝牙正在关闭");
                    break;
                case BluetoothAdapter.STATE_ON:
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if(defaultAdapter.isEnabled()) {
                        startActivity(new Intent(PermissionActivity.this,MainActivity.class));
                    }
                    break;
                case BluetoothAdapter.STATE_TURNING_ON:

                    break;
            }
        }
    };

}
