package i63;

import androidx.room.AbstractC1772c1;
import ih0.AbstractC18489d0;
import io.ktor.http.URLParserException;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p026b2.C2312r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i63.a0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18158a0 {

    /* JADX INFO: renamed from: a */
    public static final List f70467a = AbstractC37056f.m118958J("");

    /* JADX INFO: renamed from: a */
    public static final int m52159a(int i13, int i14, String str) {
        boolean z4 = false;
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (cCharAt == '[') {
                z4 = true;
            } else if (cCharAt == ']') {
                z4 = false;
            } else if (cCharAt == ':' && !z4) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final void m52160b(C18187z c18187z, String urlString) {
        AbstractC22676k.m65750j(c18187z, "<this>");
        AbstractC22676k.m65750j(urlString, "urlString");
        if (AbstractC39414r.m125890i0(urlString)) {
            return;
        }
        try {
            m52161c(c18187z, urlString);
        } catch (Throwable th3) {
            throw new URLParserException(urlString, th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:246:0x00e4 A[EDGE_INSN: B:246:0x00e4->B:79:0x00e4 BREAK  A[LOOP:3: B:63:0x00b9->B:77:0x00dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dc A[LOOP:3: B:63:0x00b9->B:77:0x00dc, LOOP_END] */
    /* JADX INFO: renamed from: c */
    public static final void m52161c(C18187z c18187z, String urlString) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        List listM125905x0;
        int iIntValue;
        char lowerCase;
        AbstractC22676k.m65750j(c18187z, "<this>");
        AbstractC22676k.m65750j(urlString, "urlString");
        int length = urlString.length();
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                i19 = -1;
                break;
            } else if (!AbstractC35846d.m113784i(urlString.charAt(i19))) {
                break;
            } else {
                i19++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 < 0) {
            length2 = -1;
            break;
        }
        while (true) {
            int i24 = length2 - 1;
            if (!AbstractC35846d.m113784i(urlString.charAt(length2))) {
                break;
            }
            if (i24 < 0) {
                length2 = -1;
                break;
            }
            length2 = i24;
        }
        int i25 = length2 + 1;
        char cCharAt = urlString.charAt(i19);
        char c3 = 'A';
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i13 = i19;
            i14 = i13;
        } else {
            i13 = i19;
            i14 = -1;
        }
        while (true) {
            if (i13 < i25) {
                char cCharAt2 = urlString.charAt(i13);
                if (cCharAt2 == ':') {
                    if (i14 != -1) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Illegal character in scheme at position "));
                    }
                    i15 = i13 - i19;
                    break;
                } else if (cCharAt2 != '/' && cCharAt2 != '?' && cCharAt2 != '#') {
                    if (i14 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                        i14 = i13;
                    }
                    i13++;
                }
            }
            i15 = -1;
            break;
        }
        if (i15 > 0) {
            String strM53368i = AbstractC18489d0.m53368i(i19, urlString, i15, i19, "this as java.lang.String…ing(startIndex, endIndex)");
            C18160b0 c18160b0 = C18160b0.f70470c;
            int length3 = strM53368i.length();
            int i26 = 0;
            while (true) {
                if (i26 >= length3) {
                    i16 = 1;
                    i26 = -1;
                    break;
                }
                char cCharAt3 = strM53368i.charAt(i26);
                if ('A' <= cCharAt3) {
                    i16 = 1;
                    if (cCharAt3 < '[') {
                        lowerCase = (char) (cCharAt3 + ' ');
                    }
                    if (lowerCase != cCharAt3) {
                        break;
                    } else {
                        i26++;
                    }
                } else {
                    i16 = 1;
                }
                lowerCase = (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3;
                if (lowerCase != cCharAt3) {
                    break;
                    break;
                }
                i26++;
            }
            if (i26 != -1) {
                StringBuilder sb4 = new StringBuilder(strM53368i.length());
                sb4.append((CharSequence) strM53368i, 0, i26);
                int iM125884c0 = AbstractC39414r.m125884c0(strM53368i);
                if (i26 <= iM125884c0) {
                    while (true) {
                        char cCharAt4 = strM53368i.charAt(i26);
                        if (c3 <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ' ');
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb4.append(cCharAt4);
                        if (i26 == iM125884c0) {
                            break;
                        }
                        i26++;
                        c3 = 'A';
                    }
                }
                strM53368i = sb4.toString();
                AbstractC22676k.m65749i(strM53368i, "StringBuilder(capacity).…builderAction).toString()");
            }
            C18160b0 c18160b1 = (C18160b0) C18160b0.f70471d.get(strM53368i);
            if (c18160b1 == null) {
                c18160b1 = new C18160b0(strM53368i, 0);
            }
            c18187z.f70534a = c18160b1;
            i19 += i15 + 1;
        } else {
            i16 = 1;
        }
        int i27 = 0;
        while (true) {
            i17 = i19 + i27;
            if (i17 >= i25 || urlString.charAt(i17) != '/') {
                break;
            } else {
                i27++;
            }
        }
        if (c18187z.f70534a.f70472a.equals("file")) {
            if (i27 != 2) {
                if (i27 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                c18187z.f70535b = "";
                String strSubstring = urlString.substring(i17, i25);
                AbstractC22676k.m65749i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                AbstractC1772c1.m5377N(c18187z, "/".concat(strSubstring));
                return;
            }
            int iM125887f0 = AbstractC39414r.m125887f0(urlString, '/', i17, false, 4);
            if (iM125887f0 == -1 || iM125887f0 == i25) {
                String strSubstring2 = urlString.substring(i17, i25);
                AbstractC22676k.m65749i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                c18187z.f70535b = strSubstring2;
                return;
            } else {
                String strSubstring3 = urlString.substring(i17, iM125887f0);
                AbstractC22676k.m65749i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                c18187z.f70535b = strSubstring3;
                String strSubstring4 = urlString.substring(iM125887f0, i25);
                AbstractC22676k.m65749i(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
                AbstractC1772c1.m5377N(c18187z, strSubstring4);
                return;
            }
        }
        if (c18187z.f70534a.f70472a.equals("mailto")) {
            if (i27 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iM125888g0 = AbstractC39414r.m125888g0(urlString, "@", i17, false, 4);
            if (iM125888g0 == -1) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring5 = urlString.substring(i17, iM125888g0);
            AbstractC22676k.m65749i(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
            String strM52154d = AbstractC18157a.m52154d(strSubstring5);
            c18187z.f70538e = strM52154d != null ? AbstractC18157a.m52156f(strM52154d, false) : null;
            String strSubstring6 = urlString.substring(iM125888g0 + 1, i25);
            AbstractC22676k.m65749i(strSubstring6, "this as java.lang.String…ing(startIndex, endIndex)");
            c18187z.f70535b = strSubstring6;
            return;
        }
        if (i27 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i28 = 0;
                for (int i29 = 5; i28 < i29; i29 = 5) {
                    cArr[i28] = "@/\\?#".charAt(i28);
                    i28++;
                }
                int iM125889h0 = AbstractC39414r.m125889h0(urlString, cArr, i17, false);
                Integer numValueOf = Integer.valueOf(iM125889h0);
                if (iM125889h0 <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i25;
                if (iIntValue >= i25 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iM52159a = m52159a(i17, iIntValue, urlString);
                if (iM52159a != -1) {
                    String strSubstring7 = urlString.substring(i17, iM52159a);
                    AbstractC22676k.m65749i(strSubstring7, "this as java.lang.String…ing(startIndex, endIndex)");
                    c18187z.f70538e = strSubstring7;
                    String strSubstring8 = urlString.substring(iM52159a + 1, iIntValue);
                    AbstractC22676k.m65749i(strSubstring8, "this as java.lang.String…ing(startIndex, endIndex)");
                    c18187z.f70539f = strSubstring8;
                } else {
                    String strSubstring9 = urlString.substring(i17, iIntValue);
                    AbstractC22676k.m65749i(strSubstring9, "this as java.lang.String…ing(startIndex, endIndex)");
                    c18187z.f70538e = strSubstring9;
                }
                i17 = iIntValue + 1;
            }
            int iM52159a2 = m52159a(i17, iIntValue, urlString);
            Integer numValueOf2 = Integer.valueOf(iM52159a2);
            if (iM52159a2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring10 = urlString.substring(i17, iIntValue2);
            AbstractC22676k.m65749i(strSubstring10, "this as java.lang.String…ing(startIndex, endIndex)");
            c18187z.f70535b = strSubstring10;
            int i34 = iIntValue2 + 1;
            if (i34 < iIntValue) {
                String strSubstring11 = urlString.substring(i34, iIntValue);
                AbstractC22676k.m65749i(strSubstring11, "this as java.lang.String…ing(startIndex, endIndex)");
                c18187z.f70536c = Integer.parseInt(strSubstring11);
            } else {
                c18187z.f70536c = 0;
            }
            i17 = iIntValue;
        }
        List list = f70467a;
        C25271y c25271y = C25271y.f99162w;
        if (i17 >= i25) {
            if (urlString.charAt(length2) != '/') {
                list = c25271y;
            }
            AbstractC22676k.m65750j(list, "<set-?>");
            c18187z.f70541h = list;
            return;
        }
        c18187z.f70541h = i27 == 0 ? AbstractC25265s.m74086A0(i16, c18187z.f70541h) : c25271y;
        char[] cArr2 = new char[2];
        for (int i35 = 0; i35 < 2; i35++) {
            cArr2[i35] = "?#".charAt(i35);
        }
        int iM125889h1 = AbstractC39414r.m125889h0(urlString, cArr2, i17, false);
        Integer numValueOf3 = Integer.valueOf(iM125889h1);
        if (iM125889h1 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i25;
        if (iIntValue3 > i17) {
            String strSubstring12 = urlString.substring(i17, iIntValue3);
            AbstractC22676k.m65749i(strSubstring12, "this as java.lang.String…ing(startIndex, endIndex)");
            List list2 = (c18187z.f70541h.size() == 1 && ((CharSequence) AbstractC25265s.m74096F0(c18187z.f70541h)).length() == 0) ? c25271y : c18187z.f70541h;
            if (strSubstring12.equals("/")) {
                listM125905x0 = list;
                i18 = 1;
            } else {
                i18 = 1;
                listM125905x0 = AbstractC39414r.m125905x0(strSubstring12, new char[]{'/'}, 0, 6);
            }
            if (i27 != i18) {
                list = c25271y;
            }
            c18187z.f70541h = AbstractC25265s.m74129g1(list2, AbstractC25265s.m74129g1(list, listM125905x0));
            i17 = iIntValue3;
        }
        if (i17 < i25 && urlString.charAt(i17) == '?') {
            int i36 = i17 + 1;
            if (i36 == i25) {
                c18187z.f70537d = true;
                i17 = i25;
            } else {
                int iM125887f1 = AbstractC39414r.m125887f0(urlString, '#', i36, false, 4);
                Integer numValueOf4 = iM125887f1 > 0 ? Integer.valueOf(iM125887f1) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i25;
                String strSubstring13 = urlString.substring(i36, iIntValue4);
                AbstractC22676k.m65749i(strSubstring13, "this as java.lang.String…ing(startIndex, endIndex)");
                AbstractC37056f.m118968W(6, strSubstring13).mo52166c(new C2312r(c18187z, 7));
                i17 = iIntValue4;
            }
        }
        if (i17 >= i25 || urlString.charAt(i17) != '#') {
            return;
        }
        String strSubstring14 = urlString.substring(i17 + 1, i25);
        AbstractC22676k.m65749i(strSubstring14, "this as java.lang.String…ing(startIndex, endIndex)");
        c18187z.f70540g = strSubstring14;
    }
}
