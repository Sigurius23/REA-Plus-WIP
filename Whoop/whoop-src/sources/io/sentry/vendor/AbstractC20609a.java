package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: io.sentry.vendor.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC20609a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f77126a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: a */
    public static byte[] m56730a(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        int i13 = (length / 3) * 4;
        int i14 = length % 3;
        if (i14 == 1) {
            i13 += 2;
        } else if (i14 == 2) {
            i13 += 3;
        }
        byte[] bArr3 = new byte[i13];
        int i15 = 0;
        int i16 = 0;
        int i17 = -1;
        while (true) {
            int i18 = i15 + 3;
            bArr2 = f77126a;
            if (i18 > length) {
                break;
            }
            int i19 = (bArr[i15 + 2] & 255) | ((bArr[i15] & 255) << 16) | ((bArr[i15 + 1] & 255) << 8);
            bArr3[i16] = bArr2[(i19 >> 18) & 63];
            bArr3[i16 + 1] = bArr2[(i19 >> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i19 >> 6) & 63];
            bArr3[i16 + 3] = bArr2[i19 & 63];
            int i24 = i16 + 4;
            i17--;
            if (i17 == 0) {
                i16 += 5;
                bArr3[i24] = 10;
                i17 = 19;
            } else {
                i16 = i24;
            }
            i15 = i18;
        }
        if (i15 == length - 1) {
            int i25 = (bArr[i15] & 255) << 4;
            bArr3[i16] = bArr2[(i25 >> 6) & 63];
            bArr3[i16 + 1] = bArr2[i25 & 63];
            return bArr3;
        }
        if (i15 == length - 2) {
            int i26 = ((bArr[i15 + 1] & 255) << 2) | ((bArr[i15] & 255) << 10);
            bArr3[i16] = bArr2[(i26 >> 12) & 63];
            bArr3[i16 + 1] = bArr2[(i26 >> 6) & 63];
            bArr3[i16 + 2] = bArr2[i26 & 63];
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static String m56731b(byte[] bArr) {
        try {
            return new String(m56730a(bArr), "US-ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
