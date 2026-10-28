package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.hints.C20363j;
import io.sentry.internal.gestures.C20381c;
import java.util.Collections;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C20092h extends AbstractWindowCallbackC20094j {

    /* JADX INFO: renamed from: E */
    public final C20513q6 f75474E;

    /* JADX INFO: renamed from: F */
    public final C20363j f75475F;

    /* JADX INFO: renamed from: G */
    public volatile boolean f75476G;

    /* JADX INFO: renamed from: x */
    public final Window.Callback f75477x;

    /* JADX INFO: renamed from: y */
    public final GestureDetectorOnGestureListenerC20091g f75478y;

    /* JADX INFO: renamed from: z */
    public final C20087c f75479z;

    public C20092h(Window.Callback callback, Activity activity, GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g, C20513q6 c20513q6) {
        C20087c c20087c = new C20087c(activity, gestureDetectorOnGestureListenerC20091g);
        C20363j c20363j = new C20363j(28);
        super(callback);
        this.f75477x = callback;
        this.f75478y = gestureDetectorOnGestureListenerC20091g;
        this.f75474E = c20513q6;
        this.f75479z = c20087c;
        this.f75475F = c20363j;
    }

    /* JADX INFO: renamed from: a */
    public final void m55970a(MotionEvent motionEvent) {
        String str;
        if (this.f75476G) {
            return;
        }
        C20087c c20087c = this.f75479z;
        int i13 = c20087c.f75451c;
        GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g = c20087c.f75449a;
        C20535s c20535sM56711a = c20087c.f75461m.m56711a();
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (c20087c.f75460l == null) {
                c20087c.f75460l = VelocityTracker.obtain();
            }
            c20087c.f75460l.addMovement(motionEvent);
            if (actionMasked == 0) {
                c20087c.f75455g = motionEvent.getX();
                float y13 = motionEvent.getY();
                c20087c.f75456h = y13;
                c20087c.f75457i = c20087c.f75455g;
                c20087c.f75458j = y13;
                c20087c.f75453e = true;
                c20087c.f75454f = false;
                MotionEvent motionEvent2 = c20087c.f75459k;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                c20087c.f75459k = MotionEvent.obtain(motionEvent);
                gestureDetectorOnGestureListenerC20091g.onDown(motionEvent);
            } else if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float x3 = motionEvent.getX();
                    float y14 = motionEvent.getY();
                    float f13 = x3 - c20087c.f75455g;
                    float f14 = y14 - c20087c.f75456h;
                    if ((f14 * f14) + (f13 * f13) > c20087c.f75450b) {
                        gestureDetectorOnGestureListenerC20091g.onScroll(c20087c.f75459k, motionEvent, c20087c.f75457i - x3, c20087c.f75458j - y14);
                        c20087c.f75453e = false;
                        c20087c.f75457i = x3;
                        c20087c.f75458j = y14;
                    }
                } else if (actionMasked == 3) {
                    c20087c.m55965a();
                } else if (actionMasked == 5) {
                    c20087c.f75453e = false;
                    c20087c.f75454f = true;
                }
            } else if (c20087c.f75454f) {
                c20087c.m55965a();
            } else {
                if (c20087c.f75453e) {
                    gestureDetectorOnGestureListenerC20091g.onSingleTapUp(motionEvent);
                } else {
                    int pointerId = motionEvent.getPointerId(0);
                    c20087c.f75460l.computeCurrentVelocity(1000, c20087c.f75452d);
                    float xVelocity = c20087c.f75460l.getXVelocity(pointerId);
                    float yVelocity = c20087c.f75460l.getYVelocity(pointerId);
                    float f15 = i13;
                    if (Math.abs(xVelocity) > f15 || Math.abs(yVelocity) > f15) {
                        gestureDetectorOnGestureListenerC20091g.onFling(c20087c.f75459k, motionEvent, xVelocity, yVelocity);
                    }
                }
                c20087c.m55965a();
            }
            c20535sM56711a.close();
            if (motionEvent.getActionMasked() == 1) {
                GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g2 = this.f75478y;
                View viewM55967b = gestureDetectorOnGestureListenerC20091g2.m55967b("onUp");
                C20090f c20090f = gestureDetectorOnGestureListenerC20091g2.f75469G;
                C20381c c20381c = c20090f.f75464b;
                if (viewM55967b == null || c20381c == null) {
                    return;
                }
                EnumC20089e enumC20089e = c20090f.f75463a;
                EnumC20089e enumC20089e2 = EnumC20089e.Unknown;
                if (enumC20089e == enumC20089e2) {
                    gestureDetectorOnGestureListenerC20091g2.f75472y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                    return;
                }
                float x5 = motionEvent.getX() - c20090f.f75465c;
                float y15 = motionEvent.getY() - c20090f.f75466d;
                if (Math.abs(x5) > Math.abs(y15)) {
                    str = x5 > 0.0f ? "right" : "left";
                } else {
                    str = y15 > 0.0f ? "down" : "up";
                }
                gestureDetectorOnGestureListenerC20091g2.m55966a(c20381c, c20090f.f75463a, Collections.singletonMap("direction", str), motionEvent);
                gestureDetectorOnGestureListenerC20091g2.m55968c(c20381c, c20090f.f75463a);
                c20090f.f75464b = null;
                c20090f.f75463a = enumC20089e2;
                c20090f.f75465c = 0.0f;
                c20090f.f75466d = 0.0f;
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

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC20094j, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.f75475F.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                m55970a(motionEventObtain);
            } catch (Throwable th3) {
                C20513q6 c20513q6 = this.f75474E;
                if (c20513q6 != null) {
                    try {
                        c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Error dispatching touch event", th3);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.f75481w.dispatchTouchEvent(motionEvent);
    }
}
