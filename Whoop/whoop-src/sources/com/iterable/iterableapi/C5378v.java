package com.iterable.iterableapi;

import java.util.ArrayList;
import java.util.Iterator;
import ke3.AbstractC22424a;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;
import ud3.C34841t;
import wb3.AbstractC37056f;
import wd3.AbstractC37171e;
import wd3.AbstractC37172f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: com.iterable.iterableapi.v */
/* JADX INFO: loaded from: classes.dex */
public final class C5378v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f21850a;

    /* JADX INFO: renamed from: b */
    public String f21851b;

    /* JADX INFO: renamed from: c */
    public int f21852c;

    /* JADX INFO: renamed from: d */
    public Object f21853d;

    /* JADX INFO: renamed from: e */
    public Object f21854e;

    /* JADX INFO: renamed from: f */
    public Object f21855f;

    /* JADX INFO: renamed from: g */
    public final Object f21856g;

    /* JADX INFO: renamed from: h */
    public Object f21857h;

    /* JADX INFO: renamed from: i */
    public Object f21858i;

    public C5378v(int i13) {
        this.f21850a = i13;
        switch (i13) {
            case 1:
                this.f21853d = "";
                this.f21854e = "";
                this.f21852c = -1;
                this.f21856g = AbstractC37056f.m118964P("");
                break;
            default:
                this.f21852c = 6;
                this.f21855f = new C5306b0();
                C5352m2 c5352m2 = new C5352m2();
                c5352m2.f21773a = 6000L;
                this.f21856g = c5352m2;
                this.f21857h = new String[0];
                this.f21858i = new C5326g0();
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static ArrayList m16524e(String str) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 <= str.length()) {
            int iM125887f0 = AbstractC39414r.m125887f0(str, '&', i13, false, 4);
            if (iM125887f0 == -1) {
                iM125887f0 = str.length();
            }
            int iM125887f1 = AbstractC39414r.m125887f0(str, '=', i13, false, 4);
            if (iM125887f1 == -1 || iM125887f1 > iM125887f0) {
                String strSubstring = str.substring(i13, iM125887f0);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i13, iM125887f1);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iM125887f1 + 1, iM125887f0);
                AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i13 = iM125887f0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m16525a(String name, String str) {
        AbstractC22676k.m65750j(name, "name");
        if (((ArrayList) this.f21857h) == null) {
            this.f21857h = new ArrayList();
        }
        ArrayList arrayList = (ArrayList) this.f21857h;
        AbstractC22676k.m65747g(arrayList);
        arrayList.add(AbstractC22424a.m64603a(0, name, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList2 = (ArrayList) this.f21857h;
        AbstractC22676k.m65747g(arrayList2);
        arrayList2.add(str != null ? AbstractC22424a.m64603a(0, str, 0, 91, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }

    /* JADX INFO: renamed from: b */
    public C34810e0 m16526b() {
        ArrayList arrayList;
        String str = this.f21851b;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strM64606d = AbstractC22424a.m64606d(0, 0, 7, (String) this.f21853d);
        String strM64606d2 = AbstractC22424a.m64606d(0, 0, 7, (String) this.f21854e);
        String str2 = (String) this.f21855f;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iM16527c = m16527c();
        ArrayList arrayList2 = (ArrayList) this.f21856g;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(AbstractC22424a.m64606d(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f21857h;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? AbstractC22424a.m64606d(0, 0, 3, str3) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.f21858i;
        return new C34810e0(str, strM64606d, strM64606d2, str2, iM16527c, arrayList3, arrayList, str4 != null ? AbstractC22424a.m64606d(0, 0, 7, str4) : null, toString());
    }

    /* JADX INFO: renamed from: c */
    public int m16527c() {
        int i13 = this.f21852c;
        if (i13 != -1) {
            return i13;
        }
        String str = this.f21851b;
        AbstractC22676k.m65747g(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x002e  */
    /* JADX INFO: renamed from: d */
    public void m16528d(C34810e0 c34810e0, String input) {
        int i13;
        int iM119121f;
        int i14;
        char cCharAt;
        ArrayList arrayList = (ArrayList) this.f21856g;
        AbstractC22676k.m65750j(input, "input");
        byte[] bArr = AbstractC37172f.f158958a;
        int iM119125j = AbstractC37172f.m119125j(0, input.length(), input);
        int iM119126k = AbstractC37172f.m119126k(iM119125j, input.length(), input);
        if (iM119126k - iM119125j < 2) {
            i13 = -1;
            break;
        }
        char cCharAt2 = input.charAt(iM119125j);
        char c3 = 'a';
        if ((AbstractC22676k.m65751k(cCharAt2, 97) < 0 || AbstractC22676k.m65751k(cCharAt2, 122) > 0) && (AbstractC22676k.m65751k(cCharAt2, 65) < 0 || AbstractC22676k.m65751k(cCharAt2, 90) > 0)) {
            i13 = -1;
            break;
        }
        i13 = iM119125j + 1;
        while (true) {
            if (i13 < iM119126k) {
                char cCharAt3 = input.charAt(i13);
                if ((c3 > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    if (cCharAt3 != ':') {
                        break;
                    } else {
                        break;
                    }
                } else {
                    i13++;
                    c3 = 'a';
                }
            }
            i13 = -1;
            break;
        }
        if (i13 == -1) {
            if (c34810e0 == null) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Expected URL scheme 'http' or 'https' but no scheme was found for ", input.length() > 6 ? AbstractC39414r.m125866L0(6, input).concat("...") : input));
            }
            this.f21851b = c34810e0.f146562a;
        } else if (AbstractC39421y.m125929N(input, iM119125j, "https:", true)) {
            this.f21851b = "https";
            iM119125j += 6;
        } else {
            if (!AbstractC39421y.m125929N(input, iM119125j, "http:", true)) {
                StringBuilder sb4 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                String strSubstring = input.substring(0, i13);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(strSubstring);
                sb4.append('\'');
                throw new IllegalArgumentException(sb4.toString());
            }
            this.f21851b = "http";
            iM119125j += 5;
        }
        int i15 = 0;
        for (int i16 = iM119125j; i16 < iM119126k && ((cCharAt = input.charAt(i16)) == '/' || cCharAt == '\\'); i16++) {
            i15++;
        }
        char c7 = '#';
        if (i15 >= 2 || c34810e0 == null || !AbstractC22676k.m65745e(c34810e0.f146562a, this.f21851b)) {
            int i17 = iM119125j + i15;
            boolean z4 = false;
            boolean z13 = false;
            while (true) {
                iM119121f = AbstractC37172f.m119121f(i17, iM119126k, input, "@/\\?#");
                byte bCharAt = iM119121f != iM119126k ? input.charAt(iM119121f) : (byte) -1;
                if (bCharAt == -1 || bCharAt == c7 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (z4) {
                        this.f21854e = ((String) this.f21854e) + "%40" + AbstractC22424a.m64603a(i17, input, iM119121f, 112, " \"':;<=>@[]^`{}|/\\?#");
                        z4 = z4;
                    } else {
                        boolean z14 = z4;
                        int iM119120e = AbstractC37172f.m119120e(':', i17, iM119121f, input);
                        String strM64603a = AbstractC22424a.m64603a(i17, input, iM119120e, 112, " \"':;<=>@[]^`{}|/\\?#");
                        if (z13) {
                            strM64603a = AbstractC2875y.m8304q(new StringBuilder(), (String) this.f21853d, "%40", strM64603a);
                        }
                        this.f21853d = strM64603a;
                        if (iM119120e != iM119121f) {
                            this.f21854e = AbstractC22424a.m64603a(iM119120e + 1, input, iM119121f, 112, " \"':;<=>@[]^`{}|/\\?#");
                            z4 = true;
                        } else {
                            z4 = z14;
                        }
                        z13 = true;
                    }
                    i17 = iM119121f + 1;
                    c7 = '#';
                }
            }
            int i18 = i17;
            while (true) {
                if (i18 >= iM119121f) {
                    i18 = iM119121f;
                    break;
                }
                char cCharAt4 = input.charAt(i18);
                if (cCharAt4 == ':') {
                    break;
                }
                if (cCharAt4 == '[') {
                    do {
                        i18++;
                        if (i18 >= iM119121f) {
                            break;
                        }
                    } while (input.charAt(i18) != ']');
                }
                i18++;
            }
            int i19 = i18 + 1;
            if (i19 < iM119121f) {
                this.f21855f = AbstractC37171e.m119115b(AbstractC22424a.m64606d(i17, i18, 4, input));
                try {
                    i14 = Integer.parseInt(AbstractC22424a.m64603a(i19, input, iM119121f, 120, ""));
                    if (1 > i14 || i14 >= 65536) {
                        i14 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f21852c = i14;
                if (i14 == -1) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                    String strSubstring2 = input.substring(i19, iM119121f);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                    sb5.append(strSubstring2);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.f21855f = AbstractC37171e.m119115b(AbstractC22424a.m64606d(i17, i18, 4, input));
                String str = this.f21851b;
                AbstractC22676k.m65747g(str);
                this.f21852c = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
            }
            if (((String) this.f21855f) == null) {
                StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                String strSubstring3 = input.substring(i17, i18);
                AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                sb6.append(strSubstring3);
                sb6.append('\"');
                throw new IllegalArgumentException(sb6.toString().toString());
            }
            iM119125j = iM119121f;
        } else {
            this.f21853d = c34810e0.m109876e();
            this.f21854e = c34810e0.m109872a();
            this.f21855f = c34810e0.f146565d;
            this.f21852c = c34810e0.f146566e;
            arrayList.clear();
            arrayList.addAll(c34810e0.m109874c());
            if (iM119125j == iM119126k || input.charAt(iM119125j) == '#') {
                String strM109875d = c34810e0.m109875d();
                this.f21857h = strM109875d != null ? m16524e(AbstractC22424a.m64603a(0, strM109875d, 0, 83, " \"'<>#")) : null;
            }
        }
        int iM119121f2 = AbstractC37172f.m119121f(iM119125j, iM119126k, input, "?#");
        if (iM119125j != iM119121f2) {
            char cCharAt5 = input.charAt(iM119125j);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM119125j++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM119125j < iM119121f2) {
                int iM119121f3 = AbstractC37172f.m119121f(iM119125j, iM119121f2, input, "/\\");
                boolean z15 = iM119121f3 < iM119121f2;
                String strM64603a2 = AbstractC22424a.m64603a(iM119125j, input, iM119121f3, 112, " \"<>^`{}|/\\?#");
                if (!strM64603a2.equals(".") && !strM64603a2.equalsIgnoreCase("%2e")) {
                    if (!strM64603a2.equals("..") && !strM64603a2.equalsIgnoreCase("%2e.") && !strM64603a2.equalsIgnoreCase(".%2e") && !strM64603a2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) AbstractC25012a.m73371d(arrayList, 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM64603a2);
                        } else {
                            arrayList.add(strM64603a2);
                        }
                        if (z15) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM119125j = z15 ? iM119121f3 + 1 : iM119121f3;
            }
        }
        if (iM119121f2 < iM119126k && input.charAt(iM119121f2) == '?') {
            int iM119120e2 = AbstractC37172f.m119120e('#', iM119121f2, iM119126k, input);
            this.f21857h = m16524e(AbstractC22424a.m64603a(iM119121f2 + 1, input, iM119120e2, 80, " \"'<>#"));
            iM119121f2 = iM119120e2;
        }
        if (iM119121f2 >= iM119126k || input.charAt(iM119121f2) != '#') {
            return;
        }
        this.f21858i = AbstractC22424a.m64603a(iM119121f2 + 1, input, iM119126k, 48, "");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    public String toString() {
        switch (this.f21850a) {
            case 1:
                StringBuilder sb4 = new StringBuilder();
                String str = this.f21851b;
                if (str != null) {
                    sb4.append(str);
                    sb4.append("://");
                } else {
                    sb4.append("//");
                }
                if (((String) this.f21853d).length() > 0 || ((String) this.f21854e).length() > 0) {
                    sb4.append((String) this.f21853d);
                    if (((String) this.f21854e).length() > 0) {
                        sb4.append(':');
                        sb4.append((String) this.f21854e);
                    }
                    sb4.append('@');
                }
                String str2 = (String) this.f21855f;
                if (str2 != null) {
                    if (AbstractC39414r.m125875T(str2, ':', false)) {
                        sb4.append('[');
                        sb4.append((String) this.f21855f);
                        sb4.append(']');
                    } else {
                        sb4.append((String) this.f21855f);
                    }
                }
                int i13 = -1;
                if (this.f21852c != -1 || this.f21851b != null) {
                    int iM16527c = m16527c();
                    String str3 = this.f21851b;
                    if (str3 == null) {
                        sb4.append(':');
                        sb4.append(iM16527c);
                    } else {
                        if (str3.equals("http")) {
                            i13 = 80;
                        } else if (str3.equals("https")) {
                            i13 = 443;
                        }
                        if (iM16527c != i13) {
                            sb4.append(':');
                            sb4.append(iM16527c);
                        }
                    }
                }
                ArrayList arrayList = (ArrayList) this.f21856g;
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    sb4.append('/');
                    sb4.append((String) arrayList.get(i14));
                }
                if (((ArrayList) this.f21857h) != null) {
                    sb4.append('?');
                    ArrayList arrayList2 = (ArrayList) this.f21857h;
                    AbstractC22676k.m65747g(arrayList2);
                    C34841t.m109915b(sb4, arrayList2);
                }
                if (((String) this.f21858i) != null) {
                    sb4.append('#');
                    sb4.append((String) this.f21858i);
                }
                return sb4.toString();
            default:
                return super.toString();
        }
    }
}
