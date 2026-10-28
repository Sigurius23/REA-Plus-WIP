package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.whoop.android.R;
import p014aj.C0929d;
import p184h5.C16858b;
import p211i5.C18091d;
import p211i5.C18093f;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C5070c extends C16858b {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ClockFaceView f21360d;

    public C5070c(ClockFaceView clockFaceView) {
        this.f21360d = clockFaceView;
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: d */
    public final void mo5304d(View view, C18093f c18093f) {
        AccessibilityNodeInfo accessibilityNodeInfo = c18093f.f70317a;
        this.f64777a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f21360d.f21331H.get(iIntValue - 1));
        }
        c18093f.m51955j(C0929d.m2336s(0, 1, iIntValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c18093f.m51948b(C18091d.f70301e);
    }

    @Override // p184h5.C16858b
    /* JADX INFO: renamed from: g */
    public final boolean mo5307g(View view, int i13, Bundle bundle) {
        if (i13 != 16) {
            return super.mo5307g(view, i13, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f21360d;
        view.getHitRect(clockFaceView.f21328E);
        float fCenterX = clockFaceView.f21328E.centerX();
        float fCenterY = clockFaceView.f21328E.centerY();
        clockFaceView.f21342z.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.f21342z.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
