package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: com.google.android.material.timepicker.i */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnTouchListenerC5076i implements View.OnTouchListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ GestureDetector f21366w;

    public ViewOnTouchListenerC5076i(GestureDetector gestureDetector) {
        this.f21366w = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f21366w.onTouchEvent(motionEvent);
        }
        return false;
    }
}
