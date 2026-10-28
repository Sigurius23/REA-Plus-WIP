package io.seon.androidsdk.service;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.seon.androidsdk.service.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20691r0 {

    /* JADX INFO: renamed from: c */
    public final long f77446c;

    /* JADX INFO: renamed from: a */
    public volatile Object f77444a = null;

    /* JADX INFO: renamed from: b */
    public volatile long f77445b = -1;

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f77447d = new ReentrantLock();

    public C20691r0(long j7) {
        this.f77446c = j7;
    }

    /* JADX INFO: renamed from: a */
    public final Object m56879a(InterfaceC20695t0 interfaceC20695t0) {
        this.f77447d.lock();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (System.currentTimeMillis() - this.f77445b >= this.f77446c || this.f77445b == -1) {
                this.f77444a = interfaceC20695t0.mo56800a();
                this.f77445b = jCurrentTimeMillis;
            }
        } catch (Throwable unused) {
        }
        this.f77447d.unlock();
        return this.f77444a;
    }
}
