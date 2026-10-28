package be3;

import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26637r0;
import ne3.C26640t;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: be3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3180b implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final C26640t f12474w;

    /* JADX INFO: renamed from: x */
    public boolean f12475x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3185g f12476y;

    public C3180b(C3185g c3185g) {
        this.f12476y = c3185g;
        this.f12474w = new C26640t(((C26617h0) c3185g.f12490c.f132770y).f105867w.timeout());
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f12475x) {
            return;
        }
        this.f12475x = true;
        ((C26617h0) this.f12476y.f12490c.f132770y).mo79193S("0\r\n\r\n");
        C26640t c26640t = this.f12474w;
        C26637r0 c26637r0 = c26640t.f105912e;
        c26640t.f105912e = C26637r0.f105903d;
        c26637r0.mo79278a();
        c26637r0.mo79279b();
        this.f12476y.f12491d = 3;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final synchronized void flush() {
        if (this.f12475x) {
            return;
        }
        ((C26617h0) this.f12476y.f12490c.f132770y).flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f12474w;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        if (this.f12475x) {
            throw new IllegalStateException("closed");
        }
        if (j7 == 0) {
            return;
        }
        C26617h0 c26617h0 = (C26617h0) this.f12476y.f12490c.f132770y;
        if (c26617h0.f105869y) {
            throw new IllegalStateException("closed");
        }
        c26617h0.f105868x.m79224o1(j7);
        c26617h0.m79237b();
        c26617h0.mo79193S("\r\n");
        c26617h0.write(source, j7);
        c26617h0.mo79193S("\r\n");
    }
}
