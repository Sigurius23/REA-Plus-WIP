package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.whoop.data.repositories.C6656c;
import io.sentry.C20315e;
import io.sentry.C20337g0;
import io.sentry.C20371i4;
import io.sentry.C20426m7;
import io.sentry.C20438n7;
import io.sentry.EnumC20374i7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20432n1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C20381c;
import io.sentry.internal.gestures.EnumC20380b;
import io.sentry.protocol.EnumC20479g0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import p047c9.C4312c;
import p088dc.AbstractC11895b;
import p213i7.C18194g;

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.g */
/* JADX INFO: loaded from: classes5.dex */
public final class GestureDetectorOnGestureListenerC20091g implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: F */
    public EnumC20089e f75468F;

    /* JADX INFO: renamed from: G */
    public final C20090f f75469G;

    /* JADX INFO: renamed from: w */
    public final WeakReference f75470w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC20308d1 f75471x;

    /* JADX INFO: renamed from: y */
    public final SentryAndroidOptions f75472y;

    /* JADX INFO: renamed from: z */
    public C20381c f75473z = null;

    /* JADX INFO: renamed from: E */
    public InterfaceC20432n1 f75467E = null;

    public GestureDetectorOnGestureListenerC20091g(Activity activity, C20371i4 c20371i4, SentryAndroidOptions sentryAndroidOptions) {
        EnumC20089e enumC20089e = EnumC20089e.Unknown;
        this.f75468F = enumC20089e;
        C20090f c20090f = new C20090f();
        c20090f.f75463a = enumC20089e;
        c20090f.f75465c = 0.0f;
        c20090f.f75466d = 0.0f;
        this.f75469G = c20090f;
        this.f75470w = new WeakReference(activity);
        this.f75471x = c20371i4;
        this.f75472y = sentryAndroidOptions;
    }

    /* JADX INFO: renamed from: a */
    public final void m55966a(C20381c c20381c, EnumC20089e enumC20089e, Map map, MotionEvent motionEvent) {
        String str;
        if (this.f75472y.isEnableUserInteractionBreadcrumbs()) {
            int i13 = AbstractC20088d.f75462a[enumC20089e.ordinal()];
            if (i13 == 1) {
                str = "click";
            } else if (i13 != 2) {
                str = i13 != 3 ? "unknown" : "swipe";
            } else {
                str = "scroll";
            }
            C20337g0 c20337g0 = new C20337g0();
            c20337g0.m56493d(motionEvent, "android:motionEvent");
            c20337g0.m56493d(c20381c.m56601f(), "android:view");
            this.f75471x.mo56429i(C20315e.m56468d(str, c20381c.m56599d(), c20381c.m56596a(), c20381c.m56600e(), map), c20337g0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m55967b(String str) {
        Activity activity = (Activity) this.f75470w.get();
        SentryAndroidOptions sentryAndroidOptions = this.f75472y;
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11895b.m31996o("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11895b.m31996o("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11895b.m31996o("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m55968c(C20381c c20381c, EnumC20089e enumC20089e) {
        String str;
        boolean z4 = enumC20089e == EnumC20089e.Click || !(enumC20089e == this.f75468F && c20381c.equals(this.f75473z));
        SentryAndroidOptions sentryAndroidOptions = this.f75472y;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        InterfaceC20308d1 interfaceC20308d1 = this.f75471x;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z4) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    interfaceC20308d1.mo56439s(new C18194g(18));
                }
                this.f75473z = c20381c;
                this.f75468F = enumC20089e;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f75470w.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String strM56597b = c20381c.m56597b();
        InterfaceC20432n1 interfaceC20432n1 = this.f75467E;
        if (interfaceC20432n1 != null) {
            if (!z4 && !interfaceC20432n1.mo56452e()) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, AbstractC11895b.m31996o("The view with id: ", strM56597b, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f75467E.mo56515r();
                    return;
                }
                return;
            }
            m55969d(EnumC20374i7.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + strM56597b;
        int i13 = AbstractC20088d.f75462a[enumC20089e.ordinal()];
        if (i13 == 1) {
            str = "click";
        } else if (i13 != 2) {
            str = i13 != 3 ? "unknown" : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        C20438n7 c20438n7 = new C20438n7();
        c20438n7.f76519f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        c20438n7.f76521h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        c20438n7.f76520g = sentryAndroidOptions.getIdleTimeout();
        c20438n7.f45696a = true;
        c20438n7.f45699d = "auto.ui.gesture_listener." + c20381c.m56598c();
        InterfaceC20432n1 interfaceC20432n1Mo56444x = interfaceC20308d1.mo56444x(new C20426m7(str2, EnumC20479g0.COMPONENT, strConcat, null), c20438n7);
        interfaceC20308d1.mo56439s(new C4312c(18, this, interfaceC20432n1Mo56444x));
        this.f75467E = interfaceC20432n1Mo56444x;
        this.f75473z = c20381c;
        this.f75468F = enumC20089e;
    }

    /* JADX INFO: renamed from: d */
    public final void m55969d(EnumC20374i7 enumC20374i7) {
        InterfaceC20432n1 interfaceC20432n1 = this.f75467E;
        if (interfaceC20432n1 != null) {
            if (interfaceC20432n1.mo56450c() == null) {
                this.f75467E.mo56456l(enumC20374i7);
            } else {
                this.f75467E.mo56453g();
            }
        }
        this.f75471x.mo56439s(new C6656c(this, 8));
        this.f75467E = null;
        if (this.f75473z != null) {
            this.f75473z = null;
        }
        this.f75468F = EnumC20089e.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        C20090f c20090f = this.f75469G;
        c20090f.f75464b = null;
        c20090f.f75463a = EnumC20089e.Unknown;
        c20090f.f75465c = 0.0f;
        c20090f.f75466d = 0.0f;
        c20090f.f75465c = motionEvent.getX();
        c20090f.f75466d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        this.f75469G.f75463a = EnumC20089e.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        View viewM55967b = m55967b("onScroll");
        if (viewM55967b != null && motionEvent != null) {
            C20090f c20090f = this.f75469G;
            if (c20090f.f75463a == EnumC20089e.Unknown) {
                float x3 = motionEvent.getX();
                float y13 = motionEvent.getY();
                EnumC20380b enumC20380b = EnumC20380b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f75472y;
                C20381c c20381cM55971a = AbstractC20093i.m55971a(sentryAndroidOptions, viewM55967b, x3, y13, enumC20380b);
                if (c20381cM55971a == null) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    c20090f.f75463a = EnumC20089e.Scroll;
                    return false;
                }
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Scroll target found: ".concat(c20381cM55971a.m56597b()), new Object[0]);
                c20090f.f75464b = c20381cM55971a;
                c20090f.f75463a = EnumC20089e.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewM55967b = m55967b("onSingleTapUp");
        if (viewM55967b != null && motionEvent != null) {
            float x3 = motionEvent.getX();
            float y13 = motionEvent.getY();
            EnumC20380b enumC20380b = EnumC20380b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f75472y;
            C20381c c20381cM55971a = AbstractC20093i.m55971a(sentryAndroidOptions, viewM55967b, x3, y13, enumC20380b);
            if (c20381cM55971a == null) {
                sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            EnumC20089e enumC20089e = EnumC20089e.Click;
            m55966a(c20381cM55971a, enumC20089e, Collections.EMPTY_MAP, motionEvent);
            m55968c(c20381cM55971a, enumC20089e);
        }
        return false;
    }
}
