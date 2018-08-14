package com.example.jiaodian.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View implements View.OnTouchListener, Runnable {

    float xt = 0.0f;
    float sxt = 200.0f;
    float syt = 200.0f;
    float yt = 0.0f;
    boolean toRight = true;
    float width = 0;
    Handler timer;
    int text = 0;


    public MyView (Context context, @Nullable AttributeSet attrs) {
        super (context, attrs);
        this.setOnTouchListener (this);
        timer = new Handler ();
        timer.postDelayed(this,10);
    }

    @Override
    protected void onDraw (Canvas canvas) {
        super.onDraw (canvas);
        Paint p = new Paint ();
        p.setColor (Color.BLUE);
        width = canvas.getWidth();
        yt = canvas.getHeight()/2.0f;
        canvas.drawCircle (xt, canvas.getHeight ()/2.0f, 50, p);
        Paint q = new Paint ();
        q.setColor (Color.RED);
        canvas.drawCircle(sxt, syt, 10, q);
        Paint r = new Paint();
        r.setColor(Color.BLACK);
        r.setTextSize(50.0f);
        String asdf = Integer.toString(text);
        canvas.drawText(asdf,50.0f,80.0f,r);

    }

    @Override
    public boolean onTouch (View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            sxt = motionEvent.getX ();
            syt = motionEvent.getY();
            float d =(float) Math.sqrt((xt-sxt)*(xt-sxt)+(yt-syt)*(yt-syt));
            if (d < 50) {
                text += 1;
            }
            this.invalidate();
        }
//        TextView textView = findViewById(R.id.TextView)
        return true;
    }

    @Override
    public void run () {
        if (xt < 50.0f) {
            toRight = true;
        }
        else if (xt > width - 50) {
            toRight = false;
        }
        if (toRight) {
            xt += 2.0f;
        }
        else {
            xt -= 2.0f;
        }
        this.invalidate();
        timer.postDelayed(this, 10);
    }
}