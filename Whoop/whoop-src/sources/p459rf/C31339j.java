package p459rf;

import gf.C15762c;
import java.io.IOException;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import p424qg.C30335d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rf.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C31339j implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26633p0 f128957w;

    /* JADX INFO: renamed from: x */
    public final C30335d f128958x;

    /* JADX INFO: renamed from: y */
    public final C15762c f128959y;

    public C31339j(InterfaceC26620j delegate, C30335d counter, C15762c c15762c) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(counter, "counter");
        this.f128957w = delegate;
        this.f128958x = counter;
        this.f128959y = c15762c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f128957w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        long jMo9164h1 = this.f128957w.mo9164h1(sink, j7);
        if (jMo9164h1 > 0) {
            C30335d.m92690a(this.f128958x, jMo9164h1, this.f128959y);
        }
        return jMo9164h1;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f128957w.timeout();
    }
}
