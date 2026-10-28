package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.C20201d0;
import io.sentry.android.replay.InterfaceC20206g;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.util.C20579a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m83.AbstractC25265s;
import p249jc.AbstractC21598x;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20208b implements InterfaceC20206g {

    /* JADX INFO: renamed from: w */
    public final C20513q6 f75912w;

    /* JADX INFO: renamed from: x */
    public final ReplayIntegration f75913x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f75914y = new ArrayList();

    /* JADX INFO: renamed from: z */
    public final C20579a f75915z = new C20579a();

    /* JADX INFO: renamed from: E */
    public final WeakHashMap f75910E = new WeakHashMap();

    /* JADX INFO: renamed from: F */
    public final C20579a f75911F = new C20579a();

    public C20208b(C20513q6 c20513q6, ReplayIntegration replayIntegration) {
        this.f75912w = c20513q6;
        this.f75913x = replayIntegration;
    }

    /* JADX INFO: renamed from: a */
    public final void m56132a(View view) throws IllegalAccessException {
        WeakHashMap weakHashMap = this.f75910E;
        Window windowM113937D = AbstractC35902e.m113937D(view);
        C20513q6 c20513q6 = this.f75912w;
        if (windowM113937D == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        C20579a c20579a = this.f75911F;
        C20535s c20535sM56711a = c20579a.m56711a();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowM113937D);
            if ((weakReference != null ? (WindowCallbackC20207a) weakReference.get() : null) != null) {
                AbstractC21598x.m60698r(c20535sM56711a, null);
                return;
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
            WindowCallbackC20207a windowCallbackC20207a = new WindowCallbackC20207a(c20513q6, this.f75913x, windowM113937D.getCallback());
            windowM113937D.setCallback(windowCallbackC20207a);
            C20535s c20535sM56711a2 = c20579a.m56711a();
            try {
                weakHashMap.put(windowM113937D, new WeakReference(windowCallbackC20207a));
                AbstractC21598x.m60698r(c20535sM56711a2, null);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(c20535sM56711a2, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC21598x.m60698r(c20535sM56711a, th5);
                throw th6;
            }
        }
    }

    @Override // io.sentry.android.replay.InterfaceC20206g
    /* JADX INFO: renamed from: b */
    public final void mo56124b(View root, boolean z4) {
        AbstractC22676k.m65750j(root, "root");
        C20535s c20535sM56711a = this.f75915z.m56711a();
        ArrayList arrayList = this.f75914y;
        try {
            if (z4) {
                arrayList.add(new WeakReference(root));
                m56132a(root);
            } else {
                m56134d(root);
                AbstractC25265s.m74132j1(arrayList, new C20201d0(root, 1));
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56133c() {
        ArrayList arrayList = this.f75914y;
        C20535s c20535sM56711a = this.f75915z.m56711a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    m56134d(view);
                }
            }
            arrayList.clear();
            AbstractC21598x.m60698r(c20535sM56711a, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m56134d(View view) throws IllegalAccessException {
        Window windowM113937D = AbstractC35902e.m113937D(view);
        if (windowM113937D == null) {
            this.f75912w.getLogger().mo16066m(EnumC20436n5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowM113937D.getCallback();
        if (callback instanceof WindowCallbackC20207a) {
            windowM113937D.setCallback(((WindowCallbackC20207a) callback).f75907w);
            C20535s c20535sM56711a = this.f75911F.m56711a();
            try {
                AbstractC21598x.m60698r(c20535sM56711a, null);
                return;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC21598x.m60698r(c20535sM56711a, th3);
                    throw th4;
                }
            }
        }
        C20535s c20535sM56711a2 = this.f75911F.m56711a();
        try {
            WeakReference weakReference = (WeakReference) this.f75910E.get(windowM113937D);
            WindowCallbackC20207a windowCallbackC20207a = weakReference != null ? (WindowCallbackC20207a) weakReference.get() : null;
            AbstractC21598x.m60698r(c20535sM56711a2, null);
            if (windowCallbackC20207a != null) {
                windowCallbackC20207a.f75909y = null;
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                AbstractC21598x.m60698r(c20535sM56711a2, th5);
                throw th6;
            }
        }
    }
}
