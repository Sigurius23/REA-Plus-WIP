package ne3;

import java.util.Arrays;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ne3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC26602a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f105832a;

    static {
        C26622k c26622k = C26624l.f105882z;
        f105832a = C26622k.m79241b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").f105883w;
        C26622k.m79241b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    }

    /* JADX INFO: renamed from: a */
    public static final byte[] m79145a(String str) {
        int i13;
        char cCharAt;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i14 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i14];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            char cCharAt2 = str.charAt(i18);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i13 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i13 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i13 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i13 = 62;
            } else {
                if (cCharAt2 == '/' || cCharAt2 == '_') {
                    i13 = 63;
                } else if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                    return null;
                }
            }
            i16 = (i16 << 6) | i13;
            i15++;
            if (i15 % 4 == 0) {
                bArr[i17] = (byte) (i16 >> 16);
                int i19 = i17 + 2;
                bArr[i17 + 1] = (byte) (i16 >> 8);
                i17 += 3;
                bArr[i19] = (byte) i16;
            }
        }
        int i24 = i15 % 4;
        if (i24 == 1) {
            return null;
        }
        if (i24 == 2) {
            bArr[i17] = (byte) ((i16 << 12) >> 16);
            i17++;
        } else if (i24 == 3) {
            int i25 = i16 << 6;
            int i26 = i17 + 1;
            bArr[i17] = (byte) (i25 >> 16);
            i17 += 2;
            bArr[i26] = (byte) (i25 >> 8);
        }
        if (i17 == i14) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i17);
        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static String m79146b(byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        byte[] map = f105832a;
        AbstractC22676k.m65750j(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            byte b = bArr[i13];
            int i15 = i13 + 2;
            byte b6 = bArr[i13 + 1];
            i13 += 3;
            byte b8 = bArr[i15];
            bArr2[i14] = map[(b & 255) >> 2];
            bArr2[i14 + 1] = map[((b & 3) << 4) | ((b6 & 255) >> 4)];
            int i16 = i14 + 3;
            bArr2[i14 + 2] = map[((b6 & 15) << 2) | ((b8 & 255) >> 6)];
            i14 += 4;
            bArr2[i16] = map[b8 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b14 = bArr[i13];
            bArr2[i14] = map[(b14 & 255) >> 2];
            bArr2[i14 + 1] = map[(b14 & 3) << 4];
            bArr2[i14 + 2] = 61;
            bArr2[i14 + 3] = 61;
        } else if (length2 == 2) {
            int i17 = i13 + 1;
            byte b15 = bArr[i13];
            byte b16 = bArr[i17];
            bArr2[i14] = map[(b15 & 255) >> 2];
            bArr2[i14 + 1] = map[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr2[i14 + 2] = map[(b16 & 15) << 2];
            bArr2[i14 + 3] = 61;
        }
        return new String(bArr2, AbstractC39397a.f169546a);
    }
}
