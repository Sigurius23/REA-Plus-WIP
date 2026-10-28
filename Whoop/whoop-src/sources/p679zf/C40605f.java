package p679zf;

import java.io.IOException;
import ne3.InterfaceC26620j;
import p647yf.C39498k;
import p647yf.InterfaceC39508u;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C40605f implements InterfaceC39508u {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f174968w;

    public C40605f(InterfaceC26620j interfaceC26620j) {
        this.f174968w = interfaceC26620j;
    }

    @Override // p647yf.InterfaceC39508u
    /* JADX INFO: renamed from: c0 */
    public final long mo119145c0(C39498k sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        return this.f174968w.mo9164h1(sink.f169914w, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f174968w.close();
    }
}
