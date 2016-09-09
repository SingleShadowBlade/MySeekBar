package com.gjl.myseekbar;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements DoubleSeekBar.OnSeekBarChangeListener {
    private MySeekBar mySeekBar;
    private RangeBar rb;
    private DoubleSeekBar dsb;
    private TextView tv_low,tv_high;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySeekBar = (MySeekBar) findViewById(R.id.mySeekBar);
        rb = (RangeBar) findViewById(R.id.rb);
        dsb = (DoubleSeekBar) findViewById(R.id.dsb);
        dsb.setOnSeekBarChangeListener(this);
        tv_low= (TextView) findViewById(R.id.tv_low);
        tv_high= (TextView) findViewById(R.id.tv_high);
    }
    @Override
    public void onProgressBefore() {

    }

    @Override
    public void onProgressChanged(DoubleSeekBar seekBar, int progressLow, int progressHigh) {
        Log.e("tag","progressLow"+progressLow);
        Log.e("tag","progressHigh"+progressHigh);
        tv_low.setText(""+progressLow);
        tv_high.setText(""+progressHigh);
    }

    @Override
    public void onProgressAfter() {

    }
}
