package zyh.example.com.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by zyh on 10/23/16.
 */

    public class SampleView extends View {
        private static final int LAYER_FLAGS = Canvas.MATRIX_SAVE_FLAG | Canvas.CLIP_SAVE_FLAG 		| Canvas.HAS_ALPHA_LAYER_SAVE_FLAG | Canvas.FULL_COLOR_LAYER_SAVE_FLAG 		| Canvas.CLIP_TO_LAYER_SAVE_FLAG;
        private Paint mPaint;
        public SampleView(Context context) {
            super(context);
            setFocusable(true);
            mPaint = new Paint();
            mPaint.setAntiAlias(true);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            mPaint.setColor(Color.RED);
            canvas.drawCircle(75, 75, 75, mPaint);
          //  canvas.saveLayerAlpha(0, 0, 200, 200, 0x88, LAYER_FLAGS);
           // canvas.restore();
            canvas.translate(200, 200);
            mPaint.setColor(Color.BLUE);
            canvas.drawCircle(75, 75, 75, mPaint);
           // canvas.saveLayerAlpha(0, 0, 300, 300, 0x88, LAYER_FLAGS);
           // canvas.restore();
            canvas.translate(50, 50);
            mPaint.setColor(Color.BLACK);
            canvas.drawCircle(75, 75, 75, mPaint);
          //  canvas.saveLayerAlpha(0, 0, 300, 300, 0x88, LAYER_FLAGS);
           // canvas.restore();
            //
             }
}


