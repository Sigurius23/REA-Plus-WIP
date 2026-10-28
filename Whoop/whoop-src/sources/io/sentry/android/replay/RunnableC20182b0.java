package io.sentry.android.replay;

import android.os.Handler;
import ih0.AbstractC18489d0;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import java.util.concurrent.atomic.AtomicBoolean;
import p014aj.C0928c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC20182b0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final AtomicBoolean f75812E;

    /* JADX INFO: renamed from: w */
    public final C20513q6 f75813w;

    /* JADX INFO: renamed from: x */
    public final C0928c f75814x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserverOnDrawListenerC20241v f75815y;

    /* JADX INFO: renamed from: z */
    public C20253w f75816z;

    public RunnableC20182b0(C20513q6 c20513q6, C0928c mainLooperHandler) {
        AbstractC22676k.m65750j(mainLooperHandler, "mainLooperHandler");
        this.f75813w = c20513q6;
        this.f75814x = mainLooperHandler;
        this.f75812E = new AtomicBoolean(true);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f75812E.get();
        C20513q6 c20513q6 = this.f75813w;
        if (!z4) {
            if (c20513q6.getSessionReplay().f77072n) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                return;
            }
            return;
        }
        try {
            if (c20513q6.getSessionReplay().f77072n) {
                c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "Capturing a frame.", new Object[0]);
            }
            ViewTreeObserverOnDrawListenerC20241v viewTreeObserverOnDrawListenerC20241v = this.f75815y;
            if (viewTreeObserverOnDrawListenerC20241v != null) {
                viewTreeObserverOnDrawListenerC20241v.m56156b();
            }
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to capture a frame", th3);
        }
        if (c20513q6.getSessionReplay().f77072n) {
            InterfaceC20602v0 logger = c20513q6.getLogger();
            EnumC20436n5 enumC20436n5 = EnumC20436n5.DEBUG;
            StringBuilder sb4 = new StringBuilder("Posting the capture runnable again, frame rate is ");
            C20253w c20253w = this.f75816z;
            logger.mo16066m(enumC20436n5, AbstractC18489d0.m53371l(sb4, c20253w != null ? c20253w.f76073e : 1, " fps."), new Object[0]);
        }
        C20253w c20253w2 = this.f75816z;
        if (((Handler) this.f75814x.f3421x).postDelayed(this, 1000 / ((long) (c20253w2 != null ? c20253w2.f76073e : 1)))) {
            return;
        }
        c20513q6.getLogger().mo16066m(EnumC20436n5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
    }
}
