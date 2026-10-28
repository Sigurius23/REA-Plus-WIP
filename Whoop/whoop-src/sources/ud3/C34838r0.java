package ud3;

import ne3.C26624l;
import ne3.InterfaceC26618i;

/* JADX INFO: renamed from: ud3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34838r0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C34818h0 f146730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C26624l f146731b;

    public C34838r0(C34818h0 c34818h0, C26624l c26624l) {
        this.f146730a = c34818h0;
        this.f146731b = c26624l;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.f146731b.mo79253d();
    }

    @Override // ud3.AbstractC34846v0
    public final C34818h0 contentType() {
        return this.f146730a;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        interfaceC26618i.mo79191Q(this.f146731b);
    }
}
