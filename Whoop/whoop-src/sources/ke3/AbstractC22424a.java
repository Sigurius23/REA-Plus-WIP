package ke3;

import ne3.C26616h;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ke3.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22424a {

    /* JADX INFO: renamed from: a */
    public static final char[] f87748a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static String m64603a(int i13, String str, int i14, int i15, String str2) {
        int i16 = (i15 & 1) != 0 ? 0 : i13;
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        int i17 = i14;
        boolean z4 = (i15 & 8) == 0;
        boolean z13 = (i15 & 16) == 0;
        boolean z14 = (i15 & 32) == 0;
        boolean z15 = (i15 & 64) == 0;
        AbstractC22676k.m65750j(str, "<this>");
        return m64604b(str, i16, i17, str2, z4, z13, z14, z15, 128);
    }

    /* JADX INFO: renamed from: b */
    public static String m64604b(String str, int i13, int i14, String str2, boolean z4, boolean z13, boolean z14, boolean z15, int i15) {
        boolean z16;
        boolean z17 = false;
        int i16 = (i15 & 1) != 0 ? 0 : i13;
        int length = (i15 & 2) != 0 ? str.length() : i14;
        boolean z18 = (i15 & 8) != 0 ? false : z4;
        boolean z19 = (i15 & 16) != 0 ? false : z13;
        boolean z24 = (i15 & 64) != 0 ? false : z15;
        AbstractC22676k.m65750j(str, "<this>");
        int iCharCount = i16;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i17 = 128;
            int i18 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z24) || AbstractC39414r.m125875T(str2, (char) iCodePointAt, false) || ((iCodePointAt == 37 && (!z18 || (z19 && !m64605c(iCharCount, length, str)))) || (iCodePointAt == 43 && z14)))) {
                C26616h c26616h = new C26616h();
                c26616h.m79231t1(i16, iCharCount, str);
                C26616h c26616h2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (z18 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        z16 = z17;
                    } else {
                        if (iCodePointAt2 == i18 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c26616h.m79232u1("+");
                        } else if (iCodePointAt2 == 43 && z14) {
                            c26616h.m79232u1(z18 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 < i18 || iCodePointAt2 == 127 || (iCodePointAt2 >= i17 && !z24)) {
                                z16 = false;
                            } else {
                                z16 = false;
                                if (!AbstractC39414r.m125875T(str2, (char) iCodePointAt2, false) && (iCodePointAt2 != 37 || (z18 && (!z19 || m64605c(iCharCount, length, str))))) {
                                    c26616h.m79234v1(iCodePointAt2);
                                }
                            }
                            if (c26616h2 == null) {
                                c26616h2 = new C26616h();
                            }
                            c26616h2.m79234v1(iCodePointAt2);
                            while (!c26616h2.mo79222o()) {
                                byte b = c26616h2.readByte();
                                c26616h.m79219m1(37);
                                char[] cArr = f87748a;
                                c26616h.m79219m1(cArr[((b & 255) >> 4) & 15]);
                                c26616h.m79219m1(cArr[b & 15]);
                            }
                        }
                        z16 = false;
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    z17 = z16;
                    i17 = 128;
                    i18 = 32;
                }
                return c26616h.m79194S0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i16, length);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m64605c(int i13, int i14, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int i15 = i13 + 2;
        return i15 < i14 && str.charAt(i13) == '%' && AbstractC37172f.m119129n(str.charAt(i13 + 1)) != -1 && AbstractC37172f.m119129n(str.charAt(i15)) != -1;
    }

    /* JADX INFO: renamed from: d */
    public static String m64606d(int i13, int i14, int i15, String str) {
        int i16;
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        boolean z4 = (i15 & 4) == 0;
        AbstractC22676k.m65750j(str, "<this>");
        int iCharCount = i13;
        while (iCharCount < i14) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z4)) {
                C26616h c26616h = new C26616h();
                c26616h.m79231t1(i13, iCharCount, str);
                while (iCharCount < i14) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i16 = iCharCount + 2) < i14) {
                        int iM119129n = AbstractC37172f.m119129n(str.charAt(iCharCount + 1));
                        int iM119129n2 = AbstractC37172f.m119129n(str.charAt(i16));
                        if (iM119129n == -1 || iM119129n2 == -1) {
                            c26616h.m79234v1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c26616h.m79219m1((iM119129n << 4) + iM119129n2);
                            iCharCount = Character.charCount(iCodePointAt) + i16;
                        }
                    } else if (iCodePointAt == 43 && z4) {
                        c26616h.m79219m1(32);
                        iCharCount++;
                    } else {
                        c26616h.m79234v1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c26616h.m79194S0();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i13, i14);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }
}
