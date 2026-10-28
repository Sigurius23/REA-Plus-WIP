package mp;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mp.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25799s0 extends C25801t0 {

    /* JADX INFO: renamed from: E */
    public final int f101535E;

    /* JADX INFO: renamed from: z */
    public final int f101536z;

    public C25799s0(byte[] bArr, int i13, int i14) {
        super(bArr);
        C25801t0.m76047j(i13, i13 + i14, bArr.length);
        this.f101536z = i13;
        this.f101535E = i14;
    }

    @Override // mp.C25801t0
    /* JADX INFO: renamed from: a */
    public final byte mo76039a(int i13) {
        int i14 = this.f101535E;
        if (((i14 - (i13 + 1)) | i13) >= 0) {
            return this.f101541x[this.f101536z + i13];
        }
        if (i13 < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "Index > length: ", ", "));
    }

    @Override // mp.C25801t0
    /* JADX INFO: renamed from: c */
    public final byte mo76040c(int i13) {
        return this.f101541x[this.f101536z + i13];
    }

    @Override // mp.C25801t0
    /* JADX INFO: renamed from: d */
    public final int mo76041d() {
        return this.f101536z;
    }

    @Override // mp.C25801t0
    /* JADX INFO: renamed from: e */
    public final int mo76042e() {
        return this.f101535E;
    }

    @Override // mp.C25801t0
    /* JADX INFO: renamed from: f */
    public final void mo76043f(int i13, byte[] bArr) {
        System.arraycopy(this.f101541x, this.f101536z, bArr, 0, i13);
    }
}
