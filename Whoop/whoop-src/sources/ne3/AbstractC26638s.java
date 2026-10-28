package ne3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26638s implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26633p0 f105907w;

    public AbstractC26638s(InterfaceC26633p0 delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f105907w = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f105907w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        return this.f105907w.mo9164h1(sink, j7);
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105907w.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f105907w + ')';
    }
}
