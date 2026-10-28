package com.iterable.iterableapi;

import java.util.TimerTask;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C5366r extends TimerTask {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f21811w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5369s f21812x;

    public C5366r(C5369s c5369s, C5392z1 c5392z1, boolean z4) {
        this.f21812x = c5369s;
        this.f21811w = z4;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C5341k c5341k = this.f21812x.f21819w;
        if (c5341k.f21746d == null && c5341k.f21747e == null) {
            AbstractC12350b.m34579a0("IterableAuth", "Email or userId is not available. Skipping token refresh");
        } else {
            C5369s c5369sM16484c = c5341k.m16484c();
            boolean z4 = this.f21811w;
            synchronized (c5369sM16484c) {
                if (!z4) {
                    try {
                        c5369sM16484c.f21822z.getClass();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C5341k.f21742r.m16491l(true);
            }
        }
        this.f21812x.f21817E = false;
    }
}
