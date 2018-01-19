package com.example.harshithabshekharap.walmartassignment;

/**
 * Created by Harshitha.bshekharap on 1/19/2018.
 */

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {

    String customFont;

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        style(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        style(context, attrs);

    }

    private void style(Context context, AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomFontTextView);
        int cf = (a.getInteger(R.styleable.CustomFontTextView_fontName, 0));
        int fontName = 0;
        switch (cf)
        {
            case 1:
                fontName = R.string.monospace;
                break;
            case 2:
                fontName = R.string.serif_small_caps;
                break;

            default:
                fontName = R.string.monospace;
                break;
        }

        customFont = getResources().getString(fontName);

        Typeface tf = Typeface.create(customFont,Typeface.BOLD);
        setTypeface(tf);
        a.recycle();
    }
}
