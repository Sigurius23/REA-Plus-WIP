package p679zf;

import java.io.IOException;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26633p0;
import p647yf.C39498k;
import p647yf.InterfaceC39508u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zf.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C40607h implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39508u f174970w;

    public C40607h(InterfaceC39508u delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f174970w = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f174970w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        return this.f174970w.mo119145c0(new C39498k(sink), j7);
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }
}
