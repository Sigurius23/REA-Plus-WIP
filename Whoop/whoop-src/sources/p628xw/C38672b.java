package p628xw;

import rs.AbstractC31780b;

/* JADX INFO: renamed from: xw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38672b extends C38671a {
    /* JADX INFO: renamed from: c */
    public static C38672b m124049c(byte[] bArr) {
        int i13;
        String str;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i14 = length / 3;
            int i15 = i14 * 3;
            if (length == 0) {
                i13 = 0;
            } else {
                i13 = i14 << 2;
                int i16 = length % 3;
                if (i16 != 0) {
                    i13 = i13 + i16 + 1;
                }
            }
            byte[] bArr2 = new byte[i13];
            int i17 = 0;
            int i18 = 0;
            while (i17 < i15) {
                int i19 = i17 + 2;
                int i24 = ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17] & 255) << 16);
                i17 += 3;
                int i25 = i24 | (bArr[i19] & 255);
                bArr2[i18] = AbstractC31780b.m98688i((i25 >>> 18) & 63);
                bArr2[i18 + 1] = AbstractC31780b.m98688i((i25 >>> 12) & 63);
                int i26 = i18 + 3;
                bArr2[i18 + 2] = AbstractC31780b.m98688i((i25 >>> 6) & 63);
                i18 += 4;
                bArr2[i26] = AbstractC31780b.m98688i(i25 & 63);
            }
            int i27 = length - i15;
            if (i27 > 0) {
                int i28 = ((bArr[i15] & 255) << 10) | (i27 == 2 ? (bArr[length - 1] & 255) << 2 : 0);
                if (i27 == 2) {
                    bArr2[i13 - 3] = AbstractC31780b.m98688i(i28 >> 12);
                    bArr2[i13 - 2] = AbstractC31780b.m98688i((i28 >>> 6) & 63);
                    bArr2[i13 - 1] = AbstractC31780b.m98688i(i28 & 63);
                } else {
                    bArr2[i13 - 2] = AbstractC31780b.m98688i(i28 >> 12);
                    bArr2[i13 - 1] = AbstractC31780b.m98688i((i28 >>> 6) & 63);
                }
            }
            str = new String(bArr2, AbstractC38676f.f166480a);
        }
        return new C38672b(str);
    }

    /* JADX INFO: renamed from: d */
    public static C38672b m124050d(String str) {
        if (str == null) {
            return null;
        }
        return new C38672b(str);
    }

    @Override // p628xw.C38671a
    public final boolean equals(Object obj) {
        if (obj instanceof C38672b) {
            return this.f166476w.equals(((C38671a) obj).f166476w);
        }
        return false;
    }
}
