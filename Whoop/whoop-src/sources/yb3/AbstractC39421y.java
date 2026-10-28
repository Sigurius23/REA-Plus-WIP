package yb3;

import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.Comparator;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: yb3.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39421y extends AbstractC39420x {
    /* JADX INFO: renamed from: A */
    public static String m125916A(byte[] bArr) {
        AbstractC22676k.m65750j(bArr, "<this>");
        return new String(bArr, AbstractC39397a.f169546a);
    }

    /* JADX INFO: renamed from: B */
    public static String m125917B(byte[] bArr, int i13, int i14, boolean z4) {
        AbstractC22676k.m65750j(bArr, "<this>");
        AbstractC30060g.m92124n(i13, i14, bArr.length);
        if (!z4) {
            return new String(bArr, i13, i14 - i13, AbstractC39397a.f169546a);
        }
        CharsetDecoder charsetDecoderNewDecoder = AbstractC39397a.f169546a.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        String string = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr, i13, i14 - i13)).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m125918C(int i13, int i14, int i15, byte[] bArr) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        return m125917B(bArr, i13, i14, false);
    }

    /* JADX INFO: renamed from: D */
    public static byte[] m125919D(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        return bytes;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m125920E(String str, String suffix, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(suffix, "suffix");
        return !z4 ? str.endsWith(suffix) : m125924I(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m125921F(String str, String str2, boolean z4) {
        if (str == null) {
            return str2 == null;
        }
        return !z4 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: G */
    public static void m125922G() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC22676k.m65749i(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    /* JADX INFO: renamed from: H */
    public static final void m125923H(String input) {
        AbstractC22676k.m65750j(input, "input");
        throw new NumberFormatException(AbstractC31061c.m95633i('\'', "Invalid number format: '", input));
    }

    /* JADX INFO: renamed from: I */
    public static boolean m125924I(int i13, int i14, int i15, String str, String other, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(other, "other");
        return !z4 ? str.regionMatches(i13, other, i14, i15) : str.regionMatches(z4, i13, other, i14, i15);
    }

    /* JADX INFO: renamed from: J */
    public static String m125925J(int i13, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC31061c.m95639o("Count 'n' must be non-negative, but was ", i13, '.').toString());
        }
        if (i13 == 0) {
            return "";
        }
        int i14 = 1;
        if (i13 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i13];
            for (int i15 = 0; i15 < i13; i15++) {
                cArr[i15] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb4 = new StringBuilder(str.length() * i13);
        if (1 <= i13) {
            while (true) {
                sb4.append((CharSequence) str);
                if (i14 == i13) {
                    break;
                }
                i14++;
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65747g(string);
        return string;
    }

    /* JADX INFO: renamed from: K */
    public static String m125926K(String str, String oldValue, String newValue, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(oldValue, "oldValue");
        AbstractC22676k.m65750j(newValue, "newValue");
        int i13 = 0;
        int iM125885d0 = AbstractC39414r.m125885d0(str, oldValue, 0, z4);
        if (iM125885d0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i14 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb4 = new StringBuilder(length2);
        do {
            sb4.append((CharSequence) str, i13, iM125885d0);
            sb4.append(newValue);
            i13 = iM125885d0 + length;
            if (iM125885d0 >= str.length()) {
                break;
            }
            iM125885d0 = AbstractC39414r.m125885d0(str, oldValue, iM125885d0 + i14, z4);
        } while (iM125885d0 > 0);
        sb4.append((CharSequence) str, i13, str.length());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: L */
    public static String m125927L(String str, char c3, char c7) {
        AbstractC22676k.m65750j(str, "<this>");
        String strReplace = str.replace(c3, c7);
        AbstractC22676k.m65749i(strReplace, "replace(...)");
        return strReplace;
    }

    /* JADX INFO: renamed from: M */
    public static String m125928M(String str, String str2, String newValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(newValue, "newValue");
        int iM125888g0 = AbstractC39414r.m125888g0(str, str2, 0, false, 2);
        return iM125888g0 < 0 ? str : AbstractC39414r.m125902u0(str, iM125888g0, str2.length() + iM125888g0, newValue).toString();
    }

    /* JADX INFO: renamed from: N */
    public static boolean m125929N(String str, int i13, String str2, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        return !z4 ? str.startsWith(str2, i13) : m125924I(i13, 0, str2.length(), str, str2, z4);
    }

    /* JADX INFO: renamed from: O */
    public static boolean m125930O(String str, String prefix, boolean z4) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(prefix, "prefix");
        return !z4 ? str.startsWith(prefix) : m125924I(0, 0, prefix.length(), str, prefix, z4);
    }

    /* JADX INFO: renamed from: P */
    public static Integer m125931P(int i13, String str) {
        boolean z4;
        int i14;
        int i15;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC35846d.m113779c(i13);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i16 = 0;
        char cCharAt = str.charAt(0);
        int i17 = -2147483647;
        if (AbstractC22676k.m65751k(cCharAt, 48) < 0) {
            i14 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i17 = Integer.MIN_VALUE;
                z4 = true;
            }
        } else {
            z4 = false;
            i14 = 0;
        }
        int i18 = -59652323;
        while (i14 < length) {
            int iDigit = Character.digit((int) str.charAt(i14), i13);
            if (iDigit < 0) {
                return null;
            }
            if ((i16 < i18 && (i18 != -59652323 || i16 < (i18 = i17 / i13))) || (i15 = i16 * i13) < i17 + iDigit) {
                return null;
            }
            i16 = i15 - iDigit;
            i14++;
        }
        return z4 ? Integer.valueOf(i16) : Integer.valueOf(-i16);
    }

    /* JADX INFO: renamed from: Q */
    public static Integer m125932Q(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        return m125931P(10, str);
    }

    /* JADX INFO: renamed from: R */
    public static Long m125933R(String str) {
        boolean z4;
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC35846d.m113779c(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        long j7 = -9223372036854775807L;
        if (AbstractC22676k.m65751k(cCharAt, 48) < 0) {
            z4 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z4 = false;
                i13 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j7 = Long.MIN_VALUE;
                i13 = 1;
            }
        } else {
            z4 = false;
        }
        long j13 = 0;
        long j14 = -256204778801521550L;
        while (i13 < length) {
            int iDigit = Character.digit((int) str.charAt(i13), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j13 < j14) {
                if (j14 != -256204778801521550L) {
                    return null;
                }
                j14 = j7 / ((long) 10);
                if (j13 < j14) {
                    return null;
                }
            }
            long j15 = j13 * ((long) 10);
            long j16 = iDigit;
            if (j15 < j7 + j16) {
                return null;
            }
            j13 = j15 - j16;
            i13++;
        }
        return z4 ? Long.valueOf(j13) : Long.valueOf(-j13);
    }

    /* JADX INFO: renamed from: z */
    public static String m125934z(char[] cArr, int i13, int i14) {
        AbstractC30060g.m92124n(i13, i14, cArr.length);
        return new String(cArr, i13, i14 - i13);
    }
}
