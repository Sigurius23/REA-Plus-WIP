package yb3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yb3.x */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39420x extends AbstractC39419w {
    /* JADX INFO: renamed from: v */
    public static final boolean m125912v(String str) {
        int i13;
        if (str.length() == 0) {
            return false;
        }
        int i14 = (str.charAt(0) == '-' || str.charAt(0) == '+') ? 1 : 0;
        int i15 = i14;
        while (i15 < str.length() && Character.isDigit(str.charAt(i15))) {
            i15++;
        }
        if (i15 == str.length()) {
            return i15 - i14 > 0;
        }
        if (str.charAt(i15) == '.') {
            i15++;
            if (i15 == str.length()) {
                return i15 - i14 > 1;
            }
            while (i15 < str.length() && Character.isDigit(str.charAt(i15))) {
                i15++;
            }
        }
        if (i15 == str.length()) {
            return true;
        }
        if ((str.charAt(i15) != 'e' && str.charAt(i15) != 'E') || (i13 = i15 + 1) == str.length()) {
            return false;
        }
        if (str.charAt(i13) == '+' || str.charAt(i13) == '-') {
            i13 = i15 + 2;
        }
        if (i13 == str.length()) {
            return false;
        }
        while (i13 < str.length() && Character.isDigit(str.charAt(i13))) {
            i13++;
        }
        return i13 == str.length();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX INFO: renamed from: w */
    public static final boolean m125913w(String str) {
        char c3;
        boolean z4;
        boolean z13;
        int i13;
        boolean z14;
        String str2;
        boolean z15;
        boolean z16 = true;
        int length = str.length() - 1;
        int i14 = 0;
        while (true) {
            c3 = ' ';
            if (i14 > length || str.charAt(i14) > ' ') {
                break;
            }
            i14++;
        }
        if (i14 > length) {
            return false;
        }
        while (length > i14 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i14) == '+' || str.charAt(i14) == '-') {
            i14++;
        }
        if (i14 > length) {
            return false;
        }
        if (str.charAt(i14) != '0') {
            z4 = true;
            z13 = false;
        } else {
            int i15 = i14 + 1;
            if (i15 > length) {
                return true;
            }
            if ((str.charAt(i15) | ' ') == 120) {
                int i16 = i14 + 2;
                int i17 = i16;
                while (true) {
                    if (i17 > length) {
                        z4 = z16;
                        break;
                    }
                    char cCharAt = str.charAt(i17);
                    z4 = z16;
                    if (((cCharAt - '0') & 65535) >= 10 && (((cCharAt | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i17++;
                    z16 = z4;
                }
                boolean z17 = i16 != i17 ? z4 : false;
                if (i17 <= length) {
                    if (str.charAt(i17) == '.') {
                        int i18 = i17 + 1;
                        int i19 = i18;
                        while (i19 <= length) {
                            char cCharAt2 = str.charAt(i19);
                            char c7 = c3;
                            if (((cCharAt2 - '0') & 65535) >= 10 && (((cCharAt2 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i19++;
                            c3 = c7;
                        }
                        z15 = i18 != i19 ? z4 : false;
                        i17 = i19;
                    } else {
                        z15 = false;
                    }
                    if (z17 || z15) {
                        i14 = i17;
                    }
                    if (i14 != -1 || i14 > length) {
                        return false;
                    }
                    z13 = z4;
                }
                i14 = -1;
                if (i14 != -1) {
                }
                return false;
            }
            z4 = true;
            z13 = false;
        }
        if (!z13) {
            int i24 = i14;
            while (i24 <= length && ((str.charAt(i24) - '0') & 65535) < 10) {
                i24++;
            }
            boolean z18 = i14 != i24 ? z4 : false;
            if (i24 > length) {
                i14 = i24;
            } else {
                if (str.charAt(i24) == '.') {
                    int i25 = i24 + 1;
                    i13 = i25;
                    while (i13 <= length && ((str.charAt(i13) - '0') & 65535) < 10) {
                        i13++;
                    }
                    if (i25 != i13) {
                        z14 = z4;
                    }
                    if (!z18 || z14) {
                        i14 = i13;
                    } else {
                        if (length == i13 + 2) {
                            str2 = "NaN";
                        } else {
                            str2 = length == i13 + 7 ? "Infinity" : null;
                        }
                        i14 = (str2 != null && AbstractC39414r.m125885d0(str, str2, i13, false) == i13) ? length + 1 : -1;
                    }
                } else {
                    i13 = i24;
                }
                z14 = false;
                if (z18) {
                    i14 = i13;
                } else {
                    i14 = i13;
                }
            }
            if (i14 == -1) {
                return false;
            }
            if (i14 > length) {
                return z4;
            }
        }
        int i26 = i14 + 1;
        int iCharAt = str.charAt(i14) | ' ';
        if (iCharAt != (z13 ? 112 : 101)) {
            if (z13 || (!(iCharAt == 102 || iCharAt == 100) || i26 <= length)) {
                return false;
            }
            return z4;
        }
        if (i26 > length) {
            return false;
        }
        if ((str.charAt(i26) == '+' || str.charAt(i26) == '-') && (i26 = i14 + 2) > length) {
            return false;
        }
        while (i26 <= length && ((str.charAt(i26) - '0') & 65535) < 10) {
            i26++;
        }
        if (i26 > length) {
            return z4;
        }
        if (i26 != length) {
            return false;
        }
        int iCharAt2 = str.charAt(i26) | ' ';
        if (iCharAt2 == 102 || iCharAt2 == 100) {
            return z4;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static Double m125914x(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        try {
            if (m125913w(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static Float m125915y(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        try {
            if (m125913w(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
