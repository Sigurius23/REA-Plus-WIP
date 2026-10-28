package mp;

/* JADX INFO: renamed from: mp.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25787m0 extends C25789n0 {
    /* JADX WARN: Illegal instructions before constructor call */
    public C25787m0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new C25781k0(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override // mp.C25789n0
    /* JADX INFO: renamed from: a */
    public final void mo76023a(StringBuilder sb4, byte[] bArr, int i13) {
        int i14 = 0;
        AbstractC25753b.m76001m(0, i13, bArr.length);
        for (int i15 = i13; i15 >= 3; i15 -= 3) {
            int i16 = ((bArr[i14 + 1] & 255) << 8) | ((bArr[i14] & 255) << 16) | (bArr[i14 + 2] & 255);
            C25781k0 c25781k0 = this.f101517a;
            char[] cArr = c25781k0.f101501b;
            char[] cArr2 = c25781k0.f101501b;
            sb4.append(cArr[i16 >>> 18]);
            sb4.append(cArr2[(i16 >>> 12) & 63]);
            sb4.append(cArr2[(i16 >>> 6) & 63]);
            sb4.append(cArr2[i16 & 63]);
            i14 += 3;
        }
        if (i14 < i13) {
            m76027b(sb4, bArr, i14, i13 - i14);
        }
    }
}
