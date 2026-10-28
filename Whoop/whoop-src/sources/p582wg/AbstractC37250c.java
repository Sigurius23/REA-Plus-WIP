package p582wg;

import androidx.profileinstaller.ProfileVerifier;

/* JADX INFO: renamed from: wg.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC37250c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f159367a = 0;

    static {
        try {
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m119389a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i13 = 0; i13 != length; i13++) {
            cArr[i13] = (char) (bArr[i13] & 255);
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m119390b(byte[] bArr) {
        char c3;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i14 < bArr.length) {
            int i16 = i15 + 1;
            byte b = bArr[i14];
            if ((b & 240) == 240) {
                i15 += 2;
                i14 += 4;
            } else {
                if ((b & 224) == 224) {
                    i14 += 3;
                } else {
                    i14 = (b & 192) == 192 ? i14 + 2 : i14 + 1;
                }
                i15 = i16;
            }
        }
        char[] cArr = new char[i15];
        int i17 = 0;
        while (i13 < bArr.length) {
            byte b6 = bArr[i13];
            if ((b6 & 240) == 240) {
                int i18 = (((((b6 & 3) << 18) | ((bArr[i13 + 1] & 63) << 12)) | ((bArr[i13 + 2] & 63) << 6)) | (bArr[i13 + 3] & 63)) - ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                char c7 = (char) ((i18 >> 10) | 55296);
                c3 = (char) ((i18 & 1023) | 56320);
                cArr[i17] = c7;
                i13 += 4;
                i17++;
            } else if ((b6 & 224) == 224) {
                c3 = (char) (((b6 & 15) << 12) | ((bArr[i13 + 1] & 63) << 6) | (bArr[i13 + 2] & 63));
                i13 += 3;
            } else if ((b6 & 208) == 208 || (b6 & 192) == 192) {
                int i19 = (b6 & 31) << 6;
                byte b8 = bArr[i13 + 1];
                c3 = (char) (i19 | (b8 & 63));
                i13 += 2;
            } else {
                c3 = (char) (b6 & 255);
                i13++;
            }
            cArr[i17] = c3;
            i17++;
        }
        return new String(cArr);
    }
}
