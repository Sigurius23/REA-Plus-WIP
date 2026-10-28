package p080d4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p097ds.InterfaceFutureC12319v;

/* JADX INFO: renamed from: d4.l */
/* JADX INFO: loaded from: classes.dex */
public final class C11653l implements InterfaceFutureC12319v {

    /* JADX INFO: renamed from: w */
    public final WeakReference f37633w;

    /* JADX INFO: renamed from: x */
    public final C11652k f37634x = new C11652k(this);

    public C11653l(C11650i c11650i) {
        this.f37633w = new WeakReference(c11650i);
    }

    @Override // p097ds.InterfaceFutureC12319v
    /* JADX INFO: renamed from: a */
    public final void mo31061a(Runnable runnable, Executor executor) {
        this.f37634x.mo31061a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        C11650i c11650i = (C11650i) this.f37633w.get();
        boolean zCancel = this.f37634x.cancel(z4);
        if (zCancel && c11650i != null) {
            c11650i.f37628a = null;
            c11650i.f37629b = null;
            c11650i.f37630c.m31066j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f37634x.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37634x.f37625w instanceof C11642a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f37634x.isDone();
    }

    public final String toString() {
        return this.f37634x.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f37634x.get(j7, timeUnit);
    }
}
