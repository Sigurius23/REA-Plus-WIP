package kc3;

import bc3.AbstractC3076z;
import hc3.AbstractC17167b;
import hc3.C17185r;

/* JADX INFO: renamed from: kc3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C22365e extends AbstractC22368h {

    /* JADX INFO: renamed from: x */
    public static final C22365e f87318x;

    static {
        int i13 = AbstractC22371k.f87326c;
        int i14 = AbstractC22371k.f87327d;
        long j7 = AbstractC22371k.f87328e;
        String str = AbstractC22371k.f87324a;
        C22365e c22365e = new C22365e();
        c22365e.f87320w = new ExecutorC22363c(j7, str, i13, i14);
        f87318x = c22365e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        if (i13 >= AbstractC22371k.f87326c) {
            return str != null ? new C17185r(this, str) : this;
        }
        return super.limitedParallelism(i13, str);
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return "Dispatchers.Default";
    }
}
