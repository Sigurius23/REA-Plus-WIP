package yb3;

import ih0.AbstractC18489d0;
import java.util.Arrays;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: yb3.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC39401e {

    /* JADX INFO: renamed from: a */
    public static final int[] f169562a;

    /* JADX INFO: renamed from: b */
    public static final int[] f169563b;

    /* JADX INFO: renamed from: c */
    public static final long[] f169564c;

    static {
        int[] iArr = new int[256];
        int i13 = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            iArr[i14] = "0123456789abcdef".charAt(i14 & 15) | ("0123456789abcdef".charAt(i14 >> 4) << '\b');
        }
        f169562a = iArr;
        int[] iArr2 = new int[256];
        for (int i15 = 0; i15 < 256; i15++) {
            iArr2[i15] = "0123456789ABCDEF".charAt(i15 & 15) | ("0123456789ABCDEF".charAt(i15 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i16 = 0; i16 < 256; i16++) {
            iArr3[i16] = -1;
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i17)] = i18;
            i17++;
            i18++;
        }
        int i19 = 0;
        int i24 = 0;
        while (i19 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i19)] = i24;
            i19++;
            i24++;
        }
        f169563b = iArr3;
        long[] jArr = new long[256];
        for (int i25 = 0; i25 < 256; i25++) {
            jArr[i25] = -1;
        }
        int i26 = 0;
        int i27 = 0;
        while (i26 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i26)] = i27;
            i26++;
            i27++;
        }
        int i28 = 0;
        while (i13 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i13)] = i28;
            i13++;
            i28++;
        }
        f169564c = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m125836a(String str) {
        long j7;
        C39404h format = C39404h.f169570d;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(format, "format");
        int length = str.length();
        AbstractC30060g.m92124n(0, length, str.length());
        if (length == 0) {
            return new byte[0];
        }
        C39402f c39402f = format.f169572b;
        if (c39402f.f169566a) {
            byte[] bArr = null;
            if (c39402f.f169567b) {
                if ((length & 1) == 0) {
                    int i13 = length >> 1;
                    bArr = new byte[i13];
                    int i14 = 0;
                    for (int i15 = 0; i15 < i13; i15++) {
                        bArr[i15] = m125837b(i14, str);
                        i14 += 2;
                    }
                }
                j7 = 2;
            } else {
                long j13 = 0;
                long j14 = j13 + 2 + j13 + j13;
                long j15 = length;
                j7 = 2;
                int i16 = (int) ((j15 + j13) / j14);
                if ((((long) i16) * j14) - j13 == j15) {
                    bArr = new byte[i16];
                    int i17 = i16 - 1;
                    int i18 = 0;
                    for (int i19 = 0; i19 < i17; i19++) {
                        bArr[i19] = m125837b(i18, str);
                        i18 += 2;
                    }
                    bArr[i17] = m125837b(i18, str);
                }
            }
            if (bArr != null) {
                return bArr;
            }
        } else {
            j7 = 2;
        }
        boolean z4 = c39402f.f169568c;
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j16 = 0;
        long j17 = j16 + j7 + j16;
        long j18 = Integer.MAX_VALUE;
        long j19 = ((j18 - 1) * j16) + (j17 * j18);
        long j24 = length;
        long jM125839d = m125839d(1, j24, j19);
        long j25 = j24 - ((1 + j19) * jM125839d);
        long jM125839d2 = m125839d(2, j25, j19);
        long j26 = j25 - ((j19 + ((long) 2)) * jM125839d2);
        long jM125839d3 = m125839d(0, j26, j17);
        int i24 = (int) (((long) (j26 - ((j17 + j16) * jM125839d3) > 0 ? 1 : 0)) + (jM125839d2 * j18) + (jM125839d * j18) + jM125839d3);
        byte[] bArr2 = new byte[i24];
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i25 < length) {
            if (i27 == Integer.MAX_VALUE) {
                if (str.charAt(i25) == '\r') {
                    int i29 = i25 + 1;
                    i25 = (i29 >= length || str.charAt(i29) != '\n') ? i29 : i25 + 2;
                } else {
                    if (str.charAt(i25) != '\n') {
                        StringBuilder sbM30466t = AbstractC11266d.m30466t(i25, "Expected a new line at index ", ", but was ");
                        sbM30466t.append(str.charAt(i25));
                        throw new NumberFormatException(sbM30466t.toString());
                    }
                    i25++;
                }
                i27 = 0;
                i28 = 0;
            } else if (i28 == Integer.MAX_VALUE) {
                for (int i34 = 0; i34 < 2; i34++) {
                    if (!AbstractC35846d.m113781f("  ".charAt(i34), str.charAt(i25 + i34), z4)) {
                        int i35 = 2 + i25;
                        if (i35 <= length) {
                            length = i35;
                        }
                        String strSubstring = str.substring(i25, length);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        throw new NumberFormatException(AbstractC11266d.m30456j(i25, "Expected group separator \"  \" at index ", ", but was ", strSubstring));
                    }
                }
                i25 += 2;
                i28 = 0;
            }
            i27++;
            i28++;
            if (length - 2 < i25) {
                String strSubstring2 = str.substring(i25, length);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                StringBuilder sbM53373n = AbstractC18489d0.m53373n(i25, "Expected exactly 2 hexadecimal digits at index ", ", but was \"", strSubstring2, "\" of length ");
                sbM53373n.append(length - i25);
                throw new NumberFormatException(sbM53373n.toString());
            }
            bArr2[i26] = m125837b(i25, str);
            i25 += 2;
            i26++;
        }
        if (i26 == i24) {
            return bArr2;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, i26);
        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static final byte m125837b(int i13, String str) {
        int[] iArr;
        int i14;
        int i15;
        char cCharAt = str.charAt(i13);
        if ((cCharAt >>> '\b') != 0 || (i14 = (iArr = f169563b)[cCharAt]) < 0) {
            m125838c(i13, str);
            throw null;
        }
        int i16 = i13 + 1;
        char cCharAt2 = str.charAt(i16);
        if ((cCharAt2 >>> '\b') == 0 && (i15 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i14 << 4) | i15);
        }
        m125838c(i16, str);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static final void m125838c(int i13, String str) {
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Expected a hexadecimal digit at index ", ", but was ");
        sbM30466t.append(str.charAt(i13));
        throw new NumberFormatException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: d */
    public static final long m125839d(int i13, long j7, long j13) {
        if (j7 <= 0 || j13 <= 0) {
            return 0L;
        }
        long j14 = i13;
        return (j7 + j14) / (j13 + j14);
    }
}
