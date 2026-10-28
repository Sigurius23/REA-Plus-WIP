package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.android.replay.screenshot.C20223c;
import io.sentry.android.replay.screenshot.C20228h;
import io.sentry.android.replay.screenshot.InterfaceC20229i;
import io.sentry.android.replay.util.C20233a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import p006a4.AbstractC0354a;
import p021av.C2088b;
import p550vd.AbstractC35902e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.v */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnDrawListenerC20241v implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: E */
    public final InterfaceC20229i f76027E;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f76028w;

    /* JADX INFO: renamed from: x */
    public WeakReference f76029x;

    /* JADX INFO: renamed from: y */
    public final AtomicBoolean f76030y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: z */
    public final AtomicBoolean f76031z;

    public ViewTreeObserverOnDrawListenerC20241v(C20513q6 c20513q6, ReplayIntegration replayIntegration, C20253w c20253w, C20203e0 c20203e0) {
        InterfaceC20229i c20223c;
        this.f76028w = c20513q6;
        C20233a c20233a = new C20233a();
        this.f76031z = new AtomicBoolean(false);
        int i13 = AbstractC20232u.f76010a[c20513q6.getSessionReplay().f77073o.ordinal()];
        if (i13 == 1) {
            c20223c = new C20223c(c20513q6, replayIntegration, c20253w, c20203e0);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c20223c = new C20228h(c20203e0, replayIntegration, c20513q6, c20253w, c20233a, new C2088b(this, 23));
        }
        this.f76027E = c20223c;
    }

    /* JADX INFO: renamed from: a */
    public final void m56155a(View root) {
        AbstractC22676k.m65750j(root, "root");
        WeakReference weakReference = this.f76029x;
        m56157c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f76029x;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f76029x = new WeakReference(root);
        AbstractC0354a.m961a(root, this);
        this.f76031z.set(true);
        this.f76027E.onContentChanged();
    }

    /* JADX INFO: renamed from: b */
    public final void m56156b() {
        C20513q6 c20513q6 = this.f76028w;
        boolean z4 = c20513q6.getSessionReplay().f77072n;
        AtomicBoolean atomicBoolean = this.f76030y;
        if (z4) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (c20513q6.getSessionReplay().f77072n) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z13 = c20513q6.getSessionReplay().f77072n;
        InterfaceC20229i interfaceC20229i = this.f76027E;
        AtomicBoolean atomicBoolean2 = this.f76031z;
        if (z13) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(interfaceC20229i.mo56142a()));
        }
        if (!atomicBoolean2.get()) {
            interfaceC20229i.mo56143b();
            return;
        }
        WeakReference weakReference = this.f76029x;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (AbstractC35902e.m113937D(view) == null) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            interfaceC20229i.mo56144c(view);
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.WARNING, "Failed to capture replay recording", th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56157c(View view) {
        this.f76028w.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f76030y.get()) {
            WeakReference weakReference = this.f76029x;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.f76028w.getLogger().mo16066m(EnumC20436n5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.f76031z.set(true);
                this.f76027E.onContentChanged();
            }
        }
    }
}
