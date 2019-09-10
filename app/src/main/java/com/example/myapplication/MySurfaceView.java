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

    public MySurfaceView(Context context, AttributeSet attrs){
        super(context, attrs);

        setWillNotDraw(false);

    }

    public void onDraw(Canvas canvas){

        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4.0f);

        canvas.drawRect(20, 50, 200, 200, paint);

        Bitmap theImg = BitmapFactory.decodeResource(getResources(), R.drawable.redcar);
        canvas.drawBitmap(theImg, 200, 300, null);
    }
}
