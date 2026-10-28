package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.util.ScheduledExecutorServiceC20236d;
import io.sentry.util.C20579a;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import m83.AbstractC25265s;
import p006a4.AbstractC0354a;
import p014aj.C0928c;
import p087db.ViewOnLayoutChangeListenerC11857k;
import p249jc.AbstractC21598x;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20203e0 implements Closeable, InterfaceC20206g {

    /* JADX INFO: renamed from: E */
    public final ScheduledExecutorService f75882E;

    /* JADX INFO: renamed from: F */
    public final AtomicBoolean f75883F;

    /* JADX INFO: renamed from: G */
    public final ArrayList f75884G;

    /* JADX INFO: renamed from: H */
    public final Point f75885H;

    /* JADX INFO: renamed from: I */
    public final WeakHashMap f75886I;

    /* JADX INFO: renamed from: J */
    public final C20579a f75887J;

    /* JADX INFO: renamed from: K */
    public final C20579a f75888K;

    /* JADX INFO: renamed from: L */
    public final C20579a f75889L;

    /* JADX INFO: renamed from: M */
    public volatile RunnableC20182b0 f75890M;

    /* JADX INFO: renamed from: N */
    public volatile HandlerThread f75891N;

    /* JADX INFO: renamed from: O */
    public volatile Handler f75892O;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f75893w;

    /* JADX INFO: renamed from: x */
    public final ReplayIntegration f75894x;

    /* JADX INFO: renamed from: y */
    public final ReplayIntegration f75895y;

    /* JADX INFO: renamed from: z */
    public final C0928c f75896z;

    public C20203e0(C20513q6 c20513q6, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, C0928c mainLooperHandler, ScheduledExecutorServiceC20236d replayExecutor) {
        AbstractC22676k.m65750j(mainLooperHandler, "mainLooperHandler");
        AbstractC22676k.m65750j(replayExecutor, "replayExecutor");
        this.f75893w = c20513q6;
        this.f75894x = replayIntegration;
        this.f75895y = replayIntegration2;
        this.f75896z = mainLooperHandler;
        this.f75882E = replayExecutor;
        this.f75883F = new AtomicBoolean(false);
        this.f75884G = new ArrayList();
        this.f75885H = new Point();
        this.f75886I = new WeakHashMap();
        this.f75887J = new C20579a();
        this.f75888K = new C20579a();
        this.f75889L = new C20579a();
    }

    /* JADX INFO: renamed from: J */
    public final void m56123J() {
        RunnableC20182b0 runnableC20182b0 = this.f75890M;
        if (runnableC20182b0 != null) {
            ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v = runnableC20182b0.f75815y;
            if (viewTreeObserverOnDrawListenerC20241v != null) {
                viewTreeObserverOnDrawListenerC20241v.f76030y.set(false);
                WeakReference weakReference = viewTreeObserverOnDrawListenerC20241v.f76029x;
                viewTreeObserverOnDrawListenerC20241v.m56157c(weakReference != null ? (View) weakReference.get() : null);
                WeakReference weakReference2 = viewTreeObserverOnDrawListenerC20241v.f76029x;
                if (weakReference2 != null) {
                    weakReference2.clear();
                }
                viewTreeObserverOnDrawListenerC20241v.f76027E.close();
            }
            runnableC20182b0.f75815y = null;
            runnableC20182b0.f75812E.getAndSet(false);
        }
        C20535s c20535sM56711a = this.f75888K.m56711a();
        try {
            this.f75890M = null;
            AbstractC21598x.m60698r(c20535sM56711a, null);
            this.f75883F.set(false);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.android.replay.InterfaceC20206g
    /* JADX INFO: renamed from: b */
    public final void mo56124b(View root, boolean z4) {
        ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v;
        ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v2;
        ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v3;
        AbstractC22676k.m65750j(root, "root");
        C20535s c20535sM56711a = this.f75887J.m56711a();
        try {
            if (!z4) {
                View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f75886I.remove(root);
                if (onLayoutChangeListener != null) {
                    root.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                RunnableC20182b0 runnableC20182b0 = this.f75890M;
                if (runnableC20182b0 != null && (viewTreeObserverOnDrawListenerC20241v2 = runnableC20182b0.f75815y) != null) {
                    viewTreeObserverOnDrawListenerC20241v2.m56157c(root);
                }
                AbstractC25265s.m74132j1(this.f75884G, new C20201d0(root, 0));
                WeakReference weakReference = (WeakReference) AbstractC25265s.m74114R0(this.f75884G);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !root.equals(view)) {
                    RunnableC20182b0 runnableC20182b1 = this.f75890M;
                    if (runnableC20182b1 != null && (viewTreeObserverOnDrawListenerC20241v = runnableC20182b1.f75815y) != null) {
                        viewTreeObserverOnDrawListenerC20241v.m56155a(view);
                    }
                    m56125h(view);
                    WeakHashMap weakHashMap = this.f75886I;
                    if (!weakHashMap.containsKey(view)) {
                        ViewOnLayoutChangeListenerC11857k viewOnLayoutChangeListenerC11857k = new ViewOnLayoutChangeListenerC11857k(this, 2);
                        weakHashMap.put(view, viewOnLayoutChangeListenerC11857k);
                        view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC11857k);
                    }
                }
            } else {
                if (AbstractC35902e.m113937D(root) == null) {
                    this.f75893w.getLogger().mo16066m(EnumC20436n5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    AbstractC21598x.m60698r(c20535sM56711a, null);
                    return;
                }
                this.f75884G.add(new WeakReference(root));
                RunnableC20182b0 runnableC20182b2 = this.f75890M;
                if (runnableC20182b2 != null && (viewTreeObserverOnDrawListenerC20241v3 = runnableC20182b2.f75815y) != null) {
                    viewTreeObserverOnDrawListenerC20241v3.m56155a(root);
                }
                m56125h(root);
                WeakHashMap weakHashMap2 = this.f75886I;
                if (!weakHashMap2.containsKey(root)) {
                    ViewOnLayoutChangeListenerC11857k viewOnLayoutChangeListenerC11857k2 = new ViewOnLayoutChangeListenerC11857k(this, 2);
                    weakHashMap2.put(root, viewOnLayoutChangeListenerC11857k2);
                    root.addOnLayoutChangeListener(viewOnLayoutChangeListenerC11857k2);
                }
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        reset();
        C0928c c0928c = this.f75896z;
        RunnableC20182b0 runnableC20182b0 = this.f75890M;
        Handler handler = (Handler) c0928c.f3421x;
        if (runnableC20182b0 != null) {
            handler.removeCallbacks(runnableC20182b0);
        }
        C20535s c20535sM56711a = this.f75889L.m56711a();
        try {
            Handler handler2 = this.f75892O;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f75891N;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            AbstractC21598x.m60698r(c20535sM56711a, null);
            m56123J();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(c20535sM56711a, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m56125h(View root) {
        AbstractC22676k.m65750j(root, "root");
        if (root.getWidth() <= 0 || root.getHeight() <= 0) {
            ViewTreeObserverOnPreDrawListenerC20184c0 viewTreeObserverOnPreDrawListenerC20184c0 = new ViewTreeObserverOnPreDrawListenerC20184c0(this, root);
            if (root.getViewTreeObserver() == null || !root.getViewTreeObserver().isAlive()) {
                return;
            }
            try {
                root.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC20184c0);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        int width = root.getWidth();
        Point point = this.f75885H;
        if (width == point.x && root.getHeight() == point.y) {
            return;
        }
        point.set(root.getWidth(), root.getHeight());
        this.f75895y.m56099o0(root.getWidth(), root.getHeight());
    }

    /* JADX INFO: renamed from: i */
    public final Handler m56126i() {
        if (this.f75892O == null) {
            C20535s c20535sM56711a = this.f75889L.m56711a();
            try {
                if (this.f75892O == null) {
                    this.f75891N = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f75891N;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f75891N;
                    AbstractC22676k.m65747g(handlerThread2);
                    this.f75892O = new Handler(handlerThread2.getLooper());
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
        Handler handler = this.f75892O;
        AbstractC22676k.m65747g(handler);
        return handler;
    }

    /* JADX INFO: renamed from: k */
    public final void m56127k(C20253w c20253w) {
        RunnableC20182b0 runnableC20182b0;
        ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v;
        if (this.f75883F.get()) {
            if (this.f75890M == null) {
                C20535s c20535sM56711a = this.f75888K.m56711a();
                try {
                    if (this.f75890M == null) {
                        this.f75890M = new RunnableC20182b0(this.f75893w, this.f75896z);
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
            RunnableC20182b0 runnableC20182b1 = this.f75890M;
            if (runnableC20182b1 != null) {
                runnableC20182b1.f75816z = c20253w;
            }
            RunnableC20182b0 runnableC20182b2 = this.f75890M;
            if (runnableC20182b2 != null) {
                runnableC20182b2.f75815y = new ViewTreeObserverOnDrawListenerC20241v(this.f75893w, this.f75894x, c20253w, this);
            }
            WeakReference weakReference = (WeakReference) AbstractC25265s.m74114R0(this.f75884G);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (runnableC20182b0 = this.f75890M) != null && (viewTreeObserverOnDrawListenerC20241v = runnableC20182b0.f75815y) != null) {
                viewTreeObserverOnDrawListenerC20241v.m56155a(view);
            }
            C0928c c0928c = this.f75896z;
            RunnableC20182b0 runnableC20182b3 = this.f75890M;
            Handler handler = (Handler) c0928c.f3421x;
            if (runnableC20182b3 != null) {
                handler.removeCallbacks(runnableC20182b3);
            }
            C0928c c0928c2 = this.f75896z;
            RunnableC20182b0 runnableC20182b4 = this.f75890M;
            if (runnableC20182b4 == null ? false : ((Handler) c0928c2.f3421x).postDelayed(runnableC20182b4, 100L)) {
                return;
            }
            this.f75893w.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m56128m() {
        RunnableC20182b0 runnableC20182b0 = this.f75890M;
        if (runnableC20182b0 != null) {
            ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v = runnableC20182b0.f75815y;
            if (viewTreeObserverOnDrawListenerC20241v != null) {
                viewTreeObserverOnDrawListenerC20241v.f76030y.set(false);
                WeakReference weakReference = viewTreeObserverOnDrawListenerC20241v.f76029x;
                viewTreeObserverOnDrawListenerC20241v.m56157c(weakReference != null ? (View) weakReference.get() : null);
            }
            runnableC20182b0.f75812E.getAndSet(false);
        }
    }

    public final void reset() {
        ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v;
        this.f75885H.set(0, 0);
        C20535s c20535sM56711a = this.f75887J.m56711a();
        try {
            Iterator it = this.f75884G.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f75886I.remove(view);
                    if (onLayoutChangeListener != null) {
                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                    }
                    RunnableC20182b0 runnableC20182b0 = this.f75890M;
                    if (runnableC20182b0 != null && (viewTreeObserverOnDrawListenerC20241v = runnableC20182b0.f75815y) != null) {
                        viewTreeObserverOnDrawListenerC20241v.m56157c(view);
                    }
                }
            }
            this.f75884G.clear();
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

    /* JADX INFO: renamed from: s */
    public final void m56129s() {
        View view;
        RunnableC20182b0 runnableC20182b0 = this.f75890M;
        if (runnableC20182b0 != null) {
            C0928c c0928c = runnableC20182b0.f75814x;
            C20513q6 c20513q6 = runnableC20182b0.f75813w;
            if (c20513q6.getSessionReplay().f77072n) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v = runnableC20182b0.f75815y;
            if (viewTreeObserverOnDrawListenerC20241v != null) {
                WeakReference weakReference = viewTreeObserverOnDrawListenerC20241v.f76029x;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    AbstractC0354a.m961a(view, viewTreeObserverOnDrawListenerC20241v);
                }
                viewTreeObserverOnDrawListenerC20241v.f76030y.set(true);
            }
            runnableC20182b0.f75812E.getAndSet(true);
            ((Handler) c0928c.f3421x).removeCallbacks(runnableC20182b0);
            if (((Handler) c0928c.f3421x).post(runnableC20182b0)) {
                return;
            }
            c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m56130x() {
        this.f75883F.getAndSet(true);
    }
}
