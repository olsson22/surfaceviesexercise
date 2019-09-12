package com.example.myapplication;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    public SeekBar mySB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar mySB = findViewById(R.id.mySeekBar);
        MySurfaceView theSV = findViewById(R.id.surfaceView);

        seekBarListener mySbListener = new seekBarListener(theSV);
        mySB.setOnSeekBarChangeListener(mySbListener);







    }
}
