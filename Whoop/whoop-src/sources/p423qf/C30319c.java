package p423qf;

import java.io.IOException;
import p091dg.C12002a;
import p551vf.C35943h;
import p647yf.AbstractC39506s;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29131i;
import pf.InterfaceC29123a;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: qf.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30319c extends AbstractC39506s implements InterfaceC29123a {

    /* JADX INFO: renamed from: y */
    public final InterfaceC29123a f124397y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30319c(InterfaceC29123a delegate) {
        super(delegate);
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f124397y = delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f124397y.close();
    }

    @Override // pf.InterfaceC29123a
    public final AbstractC29131i getConfig() {
        return this.f124397y.getConfig();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f124397y.getCoroutineContext();
    }

    @Override // pf.InterfaceC29123a
    /* JADX INFO: renamed from: z0 */
    public final Object mo88491z0(C12002a c12002a, C35943h c35943h, InterfaceC30057d interfaceC30057d) {
        return this.f124397y.mo88491z0(c12002a, c35943h, interfaceC30057d);
    }
}
