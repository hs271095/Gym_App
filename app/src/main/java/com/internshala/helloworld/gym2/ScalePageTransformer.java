package com.internshala.helloworld.gym2;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import android.view.View;

public class ScalePageTransformer implements ViewPager.PageTransformer {
    private static final float SCALE_FACTOR = 0.95f;

    private final ViewPager mViewPager;

    public ScalePageTransformer(ViewPager viewPager) {
        this.mViewPager = viewPager;
    }

    @SuppressLint("NewApi")
    @Override
    public void transformPage(View page, float position) {
        if (position <= 0) {
            // apply zoom effect and offset translation only for pages to
            // the left
            final float transformValue = Math.abs(Math.abs(position) - 1) * (1.0f - SCALE_FACTOR) + SCALE_FACTOR;
            int pageWidth = mViewPager.getWidth();
            final float translateValue = position * -pageWidth;
            page.setScaleX(transformValue);
            page.setScaleY(transformValue);
            if (translateValue > -pageWidth) {
                page.setTranslationX(translateValue);
            } else {
                page.setTranslationX(0);
            }
        }
    }

}
