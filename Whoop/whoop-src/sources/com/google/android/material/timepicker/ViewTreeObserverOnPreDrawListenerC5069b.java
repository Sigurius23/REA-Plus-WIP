package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC5069b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ClockFaceView f21359w;

    public ViewTreeObserverOnPreDrawListenerC5069b(ClockFaceView clockFaceView) {
        this.f21359w = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f21359w;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f21342z.f21355z) - clockFaceView.f21335L;
        if (height != clockFaceView.f21362x) {
            clockFaceView.f21362x = height;
            clockFaceView.mo15913f();
            ClockHandView clockHandView = clockFaceView.f21342z;
            clockHandView.f21350L = clockFaceView.f21362x;
            clockHandView.invalidate();
        }
        return true;
    }
}
