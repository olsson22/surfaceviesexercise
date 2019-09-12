package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class MySurfaceView extends SurfaceView {

    //this helps me know what size to draw the image
    private int size;



    public MySurfaceView(Context context, AttributeSet attrs){
        super(context, attrs);
        size = 50;
        setWillNotDraw(false);

    }

    public void onDraw(Canvas canvas){

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4.0f);

        canvas.drawRect(20, 50, 200, 200, paint);

        Bitmap theImg = BitmapFactory.decodeResource(getResources(), R.drawable.redcar);
        // scale the image before drawing it
        Bitmap scaledImg = Bitmap.createScaledBitmap(theImg, size, size, false);
        canvas.drawBitmap(scaledImg, 50,50, null);
    }

    public void setBitmapSize(int progress){
        size = progress;
        invalidate();
    }
}
