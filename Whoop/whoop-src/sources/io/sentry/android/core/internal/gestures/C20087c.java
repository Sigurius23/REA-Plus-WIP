package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import io.sentry.C20535s;
import io.sentry.util.C20579a;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20087c {

    /* JADX INFO: renamed from: a */
    public final GestureDetectorOnGestureListenerC20091g f75449a;

    /* JADX INFO: renamed from: b */
    public final int f75450b;

    /* JADX INFO: renamed from: c */
    public final int f75451c;

    /* JADX INFO: renamed from: d */
    public final int f75452d;

    /* JADX INFO: renamed from: e */
    public boolean f75453e;

    /* JADX INFO: renamed from: f */
    public boolean f75454f;

    /* JADX INFO: renamed from: g */
    public float f75455g;

    /* JADX INFO: renamed from: h */
    public float f75456h;

    /* JADX INFO: renamed from: i */
    public float f75457i;

    /* JADX INFO: renamed from: j */
    public float f75458j;

    /* JADX INFO: renamed from: k */
    public MotionEvent f75459k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f75460l;

    /* JADX INFO: renamed from: m */
    public final C20579a f75461m = new C20579a();

    public C20087c(Context context, GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g) {
        this.f75449a = gestureDetectorOnGestureListenerC20091g;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.f75450b = scaledTouchSlop * scaledTouchSlop;
        this.f75451c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f75452d = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: a */
    public final void m55965a() {
        C20535s c20535sM56711a = this.f75461m.m56711a();
        try {
            MotionEvent motionEvent = this.f75459k;
            this.f75459k = null;
            VelocityTracker velocityTracker = this.f75460l;
            this.f75460l = null;
            c20535sM56711a.close();
            if (motionEvent != null) {
                motionEvent.recycle();
            }
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
