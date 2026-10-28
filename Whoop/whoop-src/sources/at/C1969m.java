package at;

import com.google.crypto.tink.internal.AbstractC5078a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import se.AbstractC32411b;

/* JADX INFO: renamed from: at.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C1969m {

    /* JADX INFO: renamed from: a */
    public final byte[] f7800a;

    /* JADX INFO: renamed from: b */
    public final byte[] f7801b;

    public C1969m() {
        this.f7800a = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        byte[] bArr = new byte[128];
        this.f7801b = bArr;
        int i13 = 0;
        for (int i14 = 0; i14 < bArr.length; i14++) {
            bArr[i14] = -1;
        }
        while (true) {
            byte[] bArr2 = this.f7800a;
            if (i13 >= bArr2.length) {
                return;
            }
            bArr[bArr2[i13]] = (byte) i13;
            i13++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m6012a(int i13, int i14, String str) {
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != ' ') {
                break;
            }
            i13++;
        }
        return i13;
    }

    /* JADX INFO: renamed from: f */
    public static C1969m m6013f() {
        byte[] bArrM101079W = AbstractC32411b.m101079W(32);
        if (bArrM101079W.length == 32) {
            return new C1969m(AbstractC5078a.m15943p(AbstractC5078a.m15935h(bArrM101079W)), bArrM101079W);
        }
        throw new IllegalArgumentException("Given secret seed length is not 32");
    }

    /* JADX INFO: renamed from: b */
    public void m6014b(ByteArrayOutputStream byteArrayOutputStream, String str) throws IOException {
        int i13;
        int i14;
        int i15;
        char cCharAt;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == ' ')) {
            length--;
        }
        if (length == 0) {
            return;
        }
        int i16 = length;
        int i17 = 0;
        while (i16 > 0 && i17 != 4) {
            char cCharAt2 = str.charAt(i16 - 1);
            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != '\t' && cCharAt2 != ' ') {
                i17++;
            }
            i16--;
        }
        int iM6012a = m6012a(0, i16, str);
        int i18 = 0;
        while (true) {
            byte[] bArr2 = this.f7801b;
            if (iM6012a >= i16) {
                if (i18 > 0) {
                    byteArrayOutputStream.write(bArr, 0, i18);
                }
                int iM6012a2 = m6012a(iM6012a, length, str);
                int iM6012a3 = m6012a(iM6012a2 + 1, length, str);
                int iM6012a4 = m6012a(iM6012a3 + 1, length, str);
                int iM6012a5 = m6012a(iM6012a4 + 1, length, str);
                char cCharAt3 = str.charAt(iM6012a2);
                char cCharAt4 = str.charAt(iM6012a3);
                char cCharAt5 = str.charAt(iM6012a4);
                char cCharAt6 = str.charAt(iM6012a5);
                if (cCharAt5 != '=') {
                    if (cCharAt6 == '=') {
                        byte b = bArr2[cCharAt3];
                        byte b6 = bArr2[cCharAt4];
                        byte b8 = bArr2[cCharAt5];
                        if ((b | b6 | b8) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b << 2) | (b6 >> 4));
                        i14 = b6 << 4;
                        i15 = b8 >> 2;
                    } else {
                        byte b14 = bArr2[cCharAt3];
                        byte b15 = bArr2[cCharAt4];
                        byte b16 = bArr2[cCharAt5];
                        byte b17 = bArr2[cCharAt6];
                        if ((b14 | b15 | b16 | b17) < 0) {
                            throw new IOException("invalid characters encountered at end of base64 data");
                        }
                        byteArrayOutputStream.write((b14 << 2) | (b15 >> 4));
                        byteArrayOutputStream.write((b15 << 4) | (b16 >> 2));
                        i13 = b17 | (b16 << 6);
                    }
                    byteArrayOutputStream.write(i13);
                    return;
                }
                if (cCharAt6 != '=') {
                    throw new IOException("invalid characters encountered at end of base64 data");
                }
                byte b18 = bArr2[cCharAt3];
                byte b19 = bArr2[cCharAt4];
                if ((b18 | b19) < 0) {
                    throw new IOException("invalid characters encountered at end of base64 data");
                }
                i14 = b18 << 2;
                i15 = b19 >> 4;
                i13 = i14 | i15;
                byteArrayOutputStream.write(i13);
                return;
            }
            int i19 = iM6012a + 1;
            byte b24 = bArr2[str.charAt(iM6012a)];
            int iM6012a6 = m6012a(i19, i16, str);
            int i24 = iM6012a6 + 1;
            byte b25 = bArr2[str.charAt(iM6012a6)];
            int iM6012a7 = m6012a(i24, i16, str);
            int i25 = iM6012a7 + 1;
            byte b26 = bArr2[str.charAt(iM6012a7)];
            int iM6012a8 = m6012a(i25, i16, str);
            int i26 = iM6012a8 + 1;
            byte b27 = bArr2[str.charAt(iM6012a8)];
            if ((b24 | b25 | b26 | b27) < 0) {
                throw new IOException("invalid characters encountered in base64 data");
            }
            bArr[i18] = (byte) ((b24 << 2) | (b25 >> 4));
            int i27 = i18 + 2;
            bArr[i18 + 1] = (byte) ((b25 << 4) | (b26 >> 2));
            i18 += 3;
            bArr[i27] = (byte) (b27 | (b26 << 6));
            if (i18 == 54) {
                byteArrayOutputStream.write(bArr);
                i18 = 0;
            }
            iM6012a = m6012a(i26, i16, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m6015c(byte[] bArr, int i13, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr2;
        if (i13 < 0) {
            return;
        }
        byte[] bArr3 = new byte[72];
        int i14 = i13;
        int i15 = 0;
        while (i14 > 0) {
            int iMin = Math.min(54, i14);
            int i16 = i15 + iMin;
            int i17 = i16 - 2;
            int i18 = 0;
            int i19 = i15;
            while (true) {
                bArr2 = this.f7800a;
                if (i19 >= i17) {
                    break;
                }
                byte b = bArr[i19];
                int i24 = i19 + 2;
                int i25 = bArr[i19 + 1] & 255;
                i19 += 3;
                byte b6 = bArr[i24];
                bArr3[i18] = bArr2[(b >>> 2) & 63];
                bArr3[i18 + 1] = bArr2[((b << 4) | (i25 >>> 4)) & 63];
                int i26 = i18 + 3;
                bArr3[i18 + 2] = bArr2[((i25 << 2) | ((b6 & 255) >>> 6)) & 63];
                i18 += 4;
                bArr3[i26] = bArr2[b6 & 63];
            }
            int i27 = iMin - (i19 - i15);
            if (i27 == 1) {
                int i28 = bArr[i19] & 255;
                bArr3[i18] = bArr2[(i28 >>> 2) & 63];
                bArr3[i18 + 1] = bArr2[(i28 << 4) & 63];
                int i29 = i18 + 3;
                bArr3[i18 + 2] = 61;
                i18 += 4;
                bArr3[i29] = 61;
            } else if (i27 == 2) {
                int i34 = i19 + 1;
                int i35 = bArr[i19] & 255;
                int i36 = bArr[i34] & 255;
                bArr3[i18] = bArr2[(i35 >>> 2) & 63];
                bArr3[i18 + 1] = bArr2[((i35 << 4) | (i36 >>> 4)) & 63];
                int i37 = i18 + 3;
                bArr3[i18 + 2] = bArr2[(i36 << 2) & 63];
                i18 += 4;
                bArr3[i37] = 61;
            }
            byteArrayOutputStream.write(bArr3, 0, i18);
            i14 -= iMin;
            i15 = i16;
        }
    }

    /* JADX INFO: renamed from: d */
    public byte[] m6016d() {
        byte[] bArr = this.f7801b;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    public byte[] m6017e() {
        byte[] bArr = this.f7800a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C1969m(byte[] bArr, byte[] bArr2) {
        this.f7800a = bArr;
        this.f7801b = bArr2;
    }
}
