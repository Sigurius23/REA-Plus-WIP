package p581we;

import bc3.AbstractC3006f0;
import java.io.IOException;
import p085d9.C11799p;
import p326mf.C25484d;
import p508ty.C34249c;
import p647yf.C39498k;
import p647yf.InterfaceC39508u;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import sz.C33151q;

/* JADX INFO: renamed from: we.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37177b implements InterfaceC39508u {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39508u f158970w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f158971x;

    /* JADX INFO: renamed from: y */
    public final C11799p f158972y;

    public C37177b(InterfaceC39508u delegate, C37199o signer, C37187g c37187g, byte[] previousSignature, C25484d c25484d, InterfaceC30063j coroutineContext) {
        AbstractC22676k.m65750j(delegate, "delegate");
        AbstractC22676k.m65750j(signer, "signer");
        AbstractC22676k.m65750j(previousSignature, "previousSignature");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        this.f158970w = delegate;
        this.f158971x = coroutineContext;
        this.f158972y = new C11799p(new C34249c(delegate), signer, c37187g, previousSignature, c25484d);
    }

    @Override // p647yf.InterfaceC39508u
    /* JADX INFO: renamed from: c0 */
    public final long mo119145c0(C39498k sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95636l(j7, "Invalid limit (", ") must be >= 0L").toString());
        }
        if (((Boolean) AbstractC3006f0.m8699E(this.f158971x, new C33151q(this, null, 13))).booleanValue()) {
            return ((C39498k) this.f158972y.f38306g).mo119145c0(sink, j7);
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f158970w.close();
    }
}
