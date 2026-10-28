package mp;

/* JADX INFO: renamed from: mp.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25784l0 extends C25789n0 {

    /* JADX INFO: renamed from: e */
    public final char[] f101509e;

    public C25784l0(C25781k0 c25781k0) {
        super(c25781k0, (Character) null);
        this.f101509e = new char[512];
        char[] cArr = c25781k0.f101501b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i13 = 0; i13 < 256; i13++) {
            char[] cArr2 = this.f101509e;
            cArr2[i13] = cArr[i13 >>> 4];
            cArr2[i13 | 256] = cArr[i13 & 15];
        }
    }

    @Override // mp.C25789n0
    /* JADX INFO: renamed from: a */
    public final void mo76023a(StringBuilder sb4, byte[] bArr, int i13) {
        AbstractC25753b.m76001m(0, i13, bArr.length);
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = bArr[i14] & 255;
            char[] cArr = this.f101509e;
            sb4.append(cArr[i15]);
            sb4.append(cArr[i15 | 256]);
        }
    }
}
