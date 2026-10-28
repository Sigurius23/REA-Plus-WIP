package com.whoop.realtime.presentation.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopViewPager extends ViewPager {

    /* JADX INFO: renamed from: L0 */
    private boolean f28931L0;

    public WhoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28931L0 = true;
    }

    /* JADX INFO: renamed from: K */
    public boolean m24008K() {
        return this.f28931L0;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (m24008K()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m24008K()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setPagingEnabled(boolean z4) {
        this.f28931L0 = z4;
    }
}
