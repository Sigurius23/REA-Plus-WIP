package ud3;

import ne3.InterfaceC26618i;

/* JADX INFO: renamed from: ud3.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34842t0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C34818h0 f146749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f146750b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte[] f146751c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f146752d;

    public C34842t0(C34818h0 c34818h0, byte[] bArr, int i13, int i14) {
        this.f146749a = c34818h0;
        this.f146750b = i13;
        this.f146751c = bArr;
        this.f146752d = i14;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        return this.f146750b;
    }

    @Override // ud3.AbstractC34846v0
    public final C34818h0 contentType() {
        return this.f146749a;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) {
        interfaceC26618i.write(this.f146751c, this.f146752d, this.f146750b);
    }
}
