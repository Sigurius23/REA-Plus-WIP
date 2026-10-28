package pg3;

import ne3.InterfaceC26618i;
import ud3.AbstractC34846v0;
import ud3.C34818h0;

/* JADX INFO: renamed from: pg3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29210r0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC34846v0 f118209a;

    /* JADX INFO: renamed from: b */
    public final C34818h0 f118210b;

    public C29210r0(AbstractC34846v0 abstractC34846v0, C34818h0 c34818h0) {
        this.f118209a = abstractC34846v0;
        this.f118210b = c34818h0;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.f118209a.contentLength();
    }

    @Override // ud3.AbstractC34846v0
    public final C34818h0 contentType() {
        return this.f118210b;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        this.f118209a.writeTo(interfaceC26618i);
    }
}
