package at;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: at.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1964h {

    /* JADX INFO: renamed from: a */
    public static final Charset f7783a = Charset.forName("UTF-8");

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r7 != 4) goto L58;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m5996a(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at.AbstractC1964h.m5996a(java.lang.String):byte[]");
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m5997b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = AbstractC1963g.f7782c;
        int i13 = (length / 3) * 4;
        if (length % 3 > 0) {
            i13 += 4;
        }
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = -1;
        while (true) {
            int i17 = i14 + 3;
            if (i17 > length) {
                break;
            }
            int i18 = (bArr[i14 + 2] & 255) | ((bArr[i14] & 255) << 16) | ((bArr[i14 + 1] & 255) << 8);
            bArr3[i15] = bArr2[(i18 >> 18) & 63];
            bArr3[i15 + 1] = bArr2[(i18 >> 12) & 63];
            bArr3[i15 + 2] = bArr2[(i18 >> 6) & 63];
            bArr3[i15 + 3] = bArr2[i18 & 63];
            int i19 = i15 + 4;
            i16--;
            if (i16 == 0) {
                i15 += 5;
                bArr3[i19] = 10;
                i16 = 19;
            } else {
                i15 = i19;
            }
            i14 = i17;
        }
        if (i14 == length - 1) {
            int i24 = (bArr[i14] & 255) << 4;
            bArr3[i15] = bArr2[(i24 >> 6) & 63];
            bArr3[i15 + 1] = bArr2[i24 & 63];
            bArr3[i15 + 2] = 61;
            bArr3[i15 + 3] = 61;
            return bArr3;
        }
        if (i14 == length - 2) {
            int i25 = ((bArr[i14 + 1] & 255) << 2) | ((bArr[i14] & 255) << 10);
            bArr3[i15] = bArr2[(i25 >> 12) & 63];
            bArr3[i15 + 1] = bArr2[(i25 >> 6) & 63];
            bArr3[i15 + 2] = bArr2[i25 & 63];
            bArr3[i15 + 3] = 61;
        }
        return bArr3;
    }
}
