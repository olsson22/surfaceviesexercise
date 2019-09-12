package com.example.myapplication;

import android.widget.SeekBar;

public class seekBarListener implements SeekBar.OnSeekBarChangeListener {

        private MySurfaceView mySv;

    public seekBarListener(MySurfaceView theSV){
        mySv = theSV;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        // I want to change the size of the bitmap
        // need to tell the surfaceview to change the bitmap size
        mySv.setBitmapSize(progress);


    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {


    }
}
