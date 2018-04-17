package com.osrc.zdar.oimekeyboard;

import android.content.Context;
import android.graphics.Canvas;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

/**
 * Created by anmoluppal on 24/03/18.
 * <p>
 * Custom implementation of Android Keyboard view.
 */

public class OIMEKeyboardView extends KeyboardView {

    public OIMEKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OIMEKeyboardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
