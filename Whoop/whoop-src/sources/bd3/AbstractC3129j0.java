package bd3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bd3.j0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3129j0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f12273a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f12274b;

    static {
        String[] strArr = new String[93];
        for (int i13 = 0; i13 < 32; i13++) {
            strArr[i13] = "\\u" + m8989b(i13 >> 12) + m8989b(i13 >> 8) + m8989b(i13 >> 4) + m8989b(i13);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f12273a = strArr;
        byte[] bArr = new byte[93];
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f12274b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static final void m8988a(StringBuilder sb4, String value) {
        AbstractC22676k.m65750j(value, "value");
        sb4.append('\"');
        int length = value.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = value.charAt(i14);
            String[] strArr = f12273a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb4.append((CharSequence) value, i13, i14);
                sb4.append(strArr[cCharAt]);
                i13 = i14 + 1;
            }
        }
        if (i13 != 0) {
            sb4.append((CharSequence) value, i13, value.length());
        } else {
            sb4.append(value);
        }
        sb4.append('\"');
    }

    /* JADX INFO: renamed from: b */
    public static final char m8989b(int i13) {
        int i14 = i13 & 15;
        return (char) (i14 < 10 ? i14 + 48 : i14 + 87);
    }
}
