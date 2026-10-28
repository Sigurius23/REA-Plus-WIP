package ne3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C26610e implements InterfaceC26629n0 {
    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        source.skip(j7);
    }
}
