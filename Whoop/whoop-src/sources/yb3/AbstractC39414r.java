package yb3;

import d62.C11739e;
import e93.AbstractC12889b;
import i93.C18282h;
import i93.C18284j;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25264r;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import w20.C36727q;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import xb3.C38177l;

/* JADX INFO: renamed from: yb3.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39414r extends AbstractC39421y {
    /* JADX INFO: renamed from: A0 */
    public static boolean m125855A0(String str, CharSequence prefix) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(prefix, "prefix");
        return prefix instanceof String ? AbstractC39421y.m125930O(str, (String) prefix, false) : m125897p0(str, 0, prefix, 0, prefix.length(), false);
    }

    /* JADX INFO: renamed from: B0 */
    public static final String m125856B0(CharSequence charSequence, C18284j range) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(range, "range");
        return charSequence.subSequence(range.f71133w, range.f71134x + 1).toString();
    }

    /* JADX INFO: renamed from: C0 */
    public static String m125857C0(String str, C18284j range) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(range, "range");
        return AbstractC18489d0.m53368i(range.f71134x, str, 1, range.f71133w, "substring(...)");
    }

    /* JADX INFO: renamed from: D0 */
    public static String m125858D0(char c3, String str, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125887f0 = m125887f0(str, c3, 0, false, 6);
        if (iM125887f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM125887f0 + 1, str.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: E0 */
    public static String m125859E0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(delimiter, "delimiter");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125888g0 = m125888g0(str, delimiter, 0, false, 6);
        if (iM125888g0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(delimiter.length() + iM125888g0, str.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: F0 */
    public static String m125860F0(char c3, String str, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125892k0 = m125892k0(str, c3, 0, 6);
        if (iM125892k0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM125892k0 + 1, str.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: G0 */
    public static String m125861G0(String str, String str2, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125893l0 = m125893l0(str, str2, 0, 6);
        if (iM125893l0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(str2.length() + iM125893l0, str.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: H0 */
    public static String m125862H0(String missingDelimiterValue, char c3) {
        AbstractC22676k.m65750j(missingDelimiterValue, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125887f0 = m125887f0(missingDelimiterValue, c3, 0, false, 6);
        if (iM125887f0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM125887f0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: I0 */
    public static String m125863I0(String missingDelimiterValue, String str) {
        AbstractC22676k.m65750j(missingDelimiterValue, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125888g0 = m125888g0(missingDelimiterValue, str, 0, false, 6);
        if (iM125888g0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iM125888g0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: J0 */
    public static String m125864J0(char c3, String str, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125892k0 = m125892k0(str, c3, 0, 6);
        if (iM125892k0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM125892k0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: K0 */
    public static String m125865K0(String str, String str2, String missingDelimiterValue) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(missingDelimiterValue, "missingDelimiterValue");
        int iM125893l0 = m125893l0(str, str2, 0, 6);
        if (iM125893l0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM125893l0);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: L0 */
    public static String m125866L0(int i13, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String strSubstring = str.substring(0, i13);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: M0 */
    public static String m125867M0(int i13, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String strSubstring = str.substring(length - i13);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: N0 */
    public static Boolean m125868N0(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.equals(MediaConstraintsFactory.kValueTrue)) {
            return Boolean.TRUE;
        }
        if (str.equals(MediaConstraintsFactory.kValueFalse)) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: O0 */
    public static CharSequence m125869O0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i13 = 0;
        boolean z4 = false;
        while (i13 <= length) {
            boolean zM113784i = AbstractC35846d.m113784i(charSequence.charAt(!z4 ? i13 : length));
            if (z4) {
                if (!zM113784i) {
                    break;
                }
                length--;
            } else if (zM113784i) {
                i13++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i13, length + 1);
    }

    /* JADX INFO: renamed from: P0 */
    public static String m125870P0(String str, char... cArr) {
        int length = str.length() - 1;
        int i13 = 0;
        boolean z4 = false;
        while (i13 <= length) {
            boolean zM74052Y = AbstractC25260n.m74052Y(cArr, str.charAt(!z4 ? i13 : length));
            if (z4) {
                if (!zM74052Y) {
                    break;
                }
                length--;
            } else if (zM74052Y) {
                i13++;
            } else {
                z4 = true;
            }
        }
        return str.subSequence(i13, length + 1).toString();
    }

    /* JADX INFO: renamed from: Q0 */
    public static CharSequence m125871Q0(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i13 = length - 1;
            if (!AbstractC35846d.m113784i(str.charAt(length))) {
                return str.subSequence(0, length + 1);
            }
            if (i13 < 0) {
                return "";
            }
            length = i13;
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static String m125872R0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC22676k.m65750j(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i13 = length - 1;
            if (!AbstractC25260n.m74052Y(cArr, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i13 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i13;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: S */
    public static ArrayList m125873S(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC12889b.m36277i(2, 2);
        int length = charSequence.length();
        int i13 = 0;
        ArrayList arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        while (i13 >= 0 && i13 < length) {
            int i14 = i13 + 2;
            CharSequence it = charSequence.subSequence(i13, (i14 < 0 || i14 > length) ? length : i14);
            AbstractC22676k.m65750j(it, "it");
            arrayList.add(it.toString());
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: S0 */
    public static String m125874S0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        AbstractC22676k.m65750j(str, "<this>");
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            if (!AbstractC25260n.m74052Y(cArr, str.charAt(i13))) {
                charSequenceSubSequence = str.subSequence(i13, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: T */
    public static boolean m125875T(CharSequence charSequence, char c3, boolean z4) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        return m125887f0(charSequence, c3, 0, z4, 2) >= 0;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m125876U(CharSequence charSequence, CharSequence other, boolean z4) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(other, "other");
        if (other instanceof String) {
            if (m125888g0(charSequence, (String) other, 0, z4, 2) >= 0) {
                return true;
            }
        } else if (m125886e0(charSequence, other, 0, charSequence.length(), z4, false) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static String m125878W(int i13, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i13 > length) {
            i13 = length;
        }
        String strSubstring = str.substring(i13);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: X */
    public static String m125879X(int i13, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length() - i13;
        if (length < 0) {
            length = 0;
        }
        return m125866L0(length, str);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m125880Y(CharSequence charSequence, CharSequence suffix) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(suffix, "suffix");
        return ((charSequence instanceof String) && (suffix instanceof String)) ? AbstractC39421y.m125920E((String) charSequence, (String) suffix, false) : m125897p0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), false);
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m125881Z(String str, char c3) {
        AbstractC22676k.m65750j(str, "<this>");
        return str.length() > 0 && AbstractC35846d.m113781f(str.charAt(m125884c0(str)), c3, false);
    }

    /* JADX INFO: renamed from: a0 */
    public static char m125882a0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: b0 */
    public static Character m125883b0(String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    /* JADX INFO: renamed from: c0 */
    public static int m125884c0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: d0 */
    public static final int m125885d0(CharSequence charSequence, String string, int i13, boolean z4) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(string, "string");
        return (z4 || !(charSequence instanceof String)) ? m125886e0(charSequence, string, i13, charSequence.length(), z4, false) : ((String) charSequence).indexOf(string, i13);
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m125886e0(CharSequence charSequence, CharSequence charSequence2, int i13, int i14, boolean z4, boolean z13) {
        C18282h c18282h;
        if (z13) {
            int iM125884c0 = m125884c0(charSequence);
            if (i13 > iM125884c0) {
                i13 = iM125884c0;
            }
            if (i14 < 0) {
                i14 = 0;
            }
            c18282h = new C18282h(i13, i14, -1);
        } else {
            if (i13 < 0) {
                i13 = 0;
            }
            int length = charSequence.length();
            if (i14 > length) {
                i14 = length;
            }
            c18282h = new C18284j(i13, i14, 1);
        }
        boolean z14 = charSequence instanceof String;
        int i15 = c18282h.f71135y;
        int i16 = c18282h.f71134x;
        int i17 = c18282h.f71133w;
        if (!z14 || !(charSequence2 instanceof String)) {
            boolean z15 = z4;
            if ((i15 > 0 && i17 <= i16) || (i15 < 0 && i16 <= i17)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z16 = z15;
                    z15 = z16;
                    if (m125897p0(charSequence4, 0, charSequence3, i17, charSequence2.length(), z16)) {
                        return i17;
                    }
                    if (i17 != i16) {
                        i17 += i15;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    }
                }
            }
        } else if ((i15 > 0 && i17 <= i16) || (i15 < 0 && i16 <= i17)) {
            int i18 = i17;
            while (true) {
                String str = (String) charSequence2;
                boolean z17 = z4;
                if (AbstractC39421y.m125924I(0, i18, str.length(), str, (String) charSequence, z17)) {
                    return i18;
                }
                if (i18 != i16) {
                    i18 += i15;
                    z4 = z17;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f0 */
    public static int m125887f0(CharSequence charSequence, char c3, int i13, boolean z4, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        AbstractC22676k.m65750j(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? m125889h0(charSequence, new char[]{c3}, i13, z4) : ((String) charSequence).indexOf(c3, i13);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ int m125888g0(CharSequence charSequence, String str, int i13, boolean z4, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            z4 = false;
        }
        return m125885d0(charSequence, str, i13, z4);
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m125889h0(CharSequence charSequence, char[] cArr, int i13, boolean z4) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC25260n.m74036L0(cArr), i13);
        }
        if (i13 < 0) {
            i13 = 0;
        }
        int iM125884c0 = m125884c0(charSequence);
        if (i13 > iM125884c0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i13);
            for (char c3 : cArr) {
                if (AbstractC35846d.m113781f(c3, cCharAt, z4)) {
                    return i13;
                }
            }
            if (i13 == iM125884c0) {
                return -1;
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static boolean m125890i0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        for (int i13 = 0; i13 < charSequence.length(); i13++) {
            if (!AbstractC35846d.m113784i(charSequence.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j0 */
    public static char m125891j0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(m125884c0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX INFO: renamed from: k0 */
    public static int m125892k0(CharSequence charSequence, char c3, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = m125884c0(charSequence);
        }
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c3, i13);
        }
        char[] cArr = {c3};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(AbstractC25260n.m74036L0(cArr), i13);
        }
        int iM125884c0 = m125884c0(charSequence);
        if (i13 > iM125884c0) {
            i13 = iM125884c0;
        }
        while (-1 < i13) {
            if (AbstractC35846d.m113781f(cArr[0], charSequence.charAt(i13), false)) {
                return i13;
            }
            i13--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m125893l0(CharSequence charSequence, String string, int i13, int i14) {
        if ((i14 & 2) != 0) {
            i13 = m125884c0(charSequence);
        }
        int i15 = i13;
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(string, "string");
        return !(charSequence instanceof String) ? m125886e0(charSequence, string, i15, 0, false, true) : ((String) charSequence).lastIndexOf(string, i15);
    }

    /* JADX INFO: renamed from: m0 */
    public static List m125894m0(CharSequence charSequence) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        return AbstractC38176k.m122276E(new C25264r(charSequence, 4));
    }

    /* JADX INFO: renamed from: n0 */
    public static String m125895n0(int i13, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC22676k.m65750j(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Desired length ", " is less than zero."));
        }
        if (i13 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb4 = new StringBuilder(i13);
            int length = i13 - str.length();
            int i14 = 1;
            if (1 <= length) {
                while (true) {
                    sb4.append('0');
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                }
            }
            sb4.append((CharSequence) str);
            charSequenceSubSequence = sb4;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: o0 */
    public static C39399c m125896o0(CharSequence charSequence, String[] strArr, int i13) {
        m125903v0(i13);
        return new C39399c(charSequence, i13, new C11739e(AbstractC25260n.m74048W(strArr), 2));
    }

    /* JADX INFO: renamed from: p0 */
    public static final boolean m125897p0(CharSequence charSequence, int i13, CharSequence other, int i14, int i15, boolean z4) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(other, "other");
        if (i14 < 0 || i13 < 0 || i13 > charSequence.length() - i15 || i14 > other.length() - i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (!AbstractC35846d.m113781f(charSequence.charAt(i13 + i16), other.charAt(i14 + i16), z4)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q0 */
    public static String m125898q0(String str, String prefix) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(prefix, "prefix");
        if (!m125855A0(str, prefix)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: r0 */
    public static CharSequence m125899r0(int i13, int i14, String str) {
        AbstractC22676k.m65750j(str, "<this>");
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(AbstractC25012a.m73372e(i14, i13, "End index (", ") is less than start index (", ")."));
        }
        if (i14 == i13) {
            return str.subSequence(0, str.length());
        }
        StringBuilder sb4 = new StringBuilder(str.length() - (i14 - i13));
        sb4.append((CharSequence) str, 0, i13);
        sb4.append((CharSequence) str, i14, str.length());
        return sb4;
    }

    /* JADX INFO: renamed from: s0 */
    public static String m125900s0(String str, String suffix) {
        AbstractC22676k.m65750j(str, "<this>");
        AbstractC22676k.m65750j(suffix, "suffix");
        if (!m125880Y(str, suffix)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: t0 */
    public static String m125901t0(String str, String str2, String str3) {
        AbstractC22676k.m65750j(str, "<this>");
        if (str.length() < str3.length() + str2.length() || !m125855A0(str, str2) || !m125880Y(str, str3)) {
            return str;
        }
        String strSubstring = str.substring(str2.length(), str.length() - str3.length());
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: u0 */
    public static StringBuilder m125902u0(CharSequence charSequence, int i13, int i14, CharSequence replacement) {
        AbstractC22676k.m65750j(charSequence, "<this>");
        AbstractC22676k.m65750j(replacement, "replacement");
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(AbstractC25012a.m73372e(i14, i13, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(charSequence, 0, i13);
        sb4.append(replacement);
        sb4.append(charSequence, i14, charSequence.length());
        return sb4;
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m125903v0(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Limit must be non-negative, but was ").toString());
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static final List m125904w0(CharSequence charSequence, int i13, String str) {
        m125903v0(i13);
        int iM125885d0 = m125885d0(charSequence, str, 0, false);
        if (iM125885d0 == -1 || i13 == 1) {
            return AbstractC37056f.m118958J(charSequence.toString());
        }
        boolean z4 = i13 > 0;
        int i14 = 10;
        if (z4 && i13 <= 10) {
            i14 = i13;
        }
        ArrayList arrayList = new ArrayList(i14);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iM125885d0).toString());
            length = str.length() + iM125885d0;
            if (z4 && arrayList.size() == i13 - 1) {
                break;
            }
            iM125885d0 = m125885d0(charSequence, str, length, false);
        } while (iM125885d0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public static List m125905x0(CharSequence charSequence, char[] cArr, int i13, int i14) {
        if ((i14 & 4) != 0) {
            i13 = 0;
        }
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (cArr.length == 1) {
            return m125904w0(charSequence, i13, String.valueOf(cArr[0]));
        }
        m125903v0(i13);
        C38177l c38177l = new C38177l(new C39399c(charSequence, i13, new C36727q(cArr, 15)));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c38177l, 10));
        Iterator it = c38177l.iterator();
        while (it.hasNext()) {
            arrayList.add(m125856B0(charSequence, (C18284j) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static List m125906y0(CharSequence charSequence, String[] strArr, int i13) {
        int i14 = (i13 & 4) != 0 ? 0 : 2;
        AbstractC22676k.m65750j(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m125904w0(charSequence, i14, str);
            }
        }
        C38177l c38177l = new C38177l(m125896o0(charSequence, strArr, i14));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c38177l, 10));
        Iterator it = c38177l.iterator();
        while (it.hasNext()) {
            arrayList.add(m125856B0(charSequence, (C18284j) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z0 */
    public static boolean m125907z0(String str, char c3) {
        AbstractC22676k.m65750j(str, "<this>");
        return str.length() > 0 && AbstractC35846d.m113781f(str.charAt(0), c3, false);
    }
}
