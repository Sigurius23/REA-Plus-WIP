package rd3;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: rd3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31252a {

    /* JADX INFO: renamed from: a */
    public static final char[] f128755a = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: a */
    public static String m96274a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b = bArr[i13];
            int i14 = i13 * 3;
            char[] cArr2 = f128755a;
            cArr[i14] = cArr2[(b & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b & 15];
            if (i13 != bArr.length - 1) {
                cArr[i14 + 2] = '-';
            }
        }
        return "(0x) ".concat(new String(cArr));
    }

    /* JADX INFO: renamed from: b */
    public static String m96275b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "null";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i13 = 0; i13 < bArr.length; i13++) {
            byte b = bArr[i13];
            int i14 = i13 * 2;
            char[] cArr2 = f128755a;
            cArr[i14] = cArr2[(b & 255) >>> 4];
            cArr[i14 + 1] = cArr2[b & 15];
        }
        return "0x".concat(new String(cArr));
    }

    /* JADX INFO: renamed from: c */
    public static String m96276c(int i13) {
        switch (i13) {
            case 1:
                return "LE 1M";
            case 2:
                return "LE 2M";
            case 3:
                return "LE 1M or LE 2M";
            case 4:
                return "LE Coded";
            case 5:
                return "LE 1M or LE Coded";
            case 6:
                return "LE 2M or LE Coded";
            case 7:
                return "LE 1M, LE 2M or LE Coded";
            default:
                return AbstractC2875y.m8296i(i13, "UNKNOWN (", ")");
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m96277d(int i13) {
        if (i13 == 1) {
            return "LE 1M";
        }
        if (i13 != 2) {
            return i13 != 3 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "LE Coded";
        }
        return "LE 2M";
    }

    /* JADX INFO: renamed from: e */
    public static String m96278e(int i13) {
        if (i13 == 1) {
            return "WRITE COMMAND";
        }
        if (i13 != 2) {
            return i13 != 4 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "WRITE SIGNED";
        }
        return "WRITE REQUEST";
    }
}
