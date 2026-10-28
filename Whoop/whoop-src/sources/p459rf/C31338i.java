package p459rf;

import gf.C15762c;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26629n0;
import p424qg.C30335d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rf.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31338i implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26618i f128954w;

    /* JADX INFO: renamed from: x */
    public final C30335d f128955x;

    /* JADX INFO: renamed from: y */
    public final C15762c f128956y;

    public C31338i(InterfaceC26618i interfaceC26618i, C30335d counter, C15762c c15762c) {
        AbstractC22676k.m65750j(counter, "counter");
        this.f128954w = interfaceC26618i;
        this.f128955x = counter;
        this.f128956y = c15762c;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC26618i interfaceC26618i = this.f128954w;
        interfaceC26618i.mo79203e();
        interfaceC26618i.close();
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        this.f128954w.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f128954w.timeout();
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        this.f128954w.write(source, j7);
        C30335d.m92690a(this.f128955x, j7, this.f128956y);
    }
}
