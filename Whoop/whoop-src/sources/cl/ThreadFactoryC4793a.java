package cl;

import java.util.concurrent.ThreadFactory;
import p010a9.C0582g;

/* JADX INFO: renamed from: cl.a */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC4793a implements ThreadFactory {

    /* JADX INFO: renamed from: w */
    public final String f19714w;

    /* JADX INFO: renamed from: x */
    public final boolean f19715x;

    /* JADX INFO: renamed from: y */
    public int f19716y;

    public ThreadFactoryC4793a(String str, boolean z4) {
        this.f19714w = str;
        this.f19715x = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        C0582g c0582g;
        c0582g = new C0582g(this, runnable, "glide-" + this.f19714w + "-thread-" + this.f19716y);
        this.f19716y = this.f19716y + 1;
        return c0582g;
    }
}
