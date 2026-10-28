package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: com.google.android.material.timepicker.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C5075h extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ TimePickerView f21365w;

    public C5075h(TimePickerView timePickerView) {
        this.f21365w = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i13 = TimePickerView.f21356x;
        this.f21365w.getClass();
        return false;
    }
}
