package ud3;

import com.iterable.iterableapi.C5378v;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import ke3.AbstractC22424a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37172f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ud3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34810e0 {

    /* JADX INFO: renamed from: a */
    public final String f146562a;

    /* JADX INFO: renamed from: b */
    public final String f146563b;

    /* JADX INFO: renamed from: c */
    public final String f146564c;

    /* JADX INFO: renamed from: d */
    public final String f146565d;

    /* JADX INFO: renamed from: e */
    public final int f146566e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f146567f;

    /* JADX INFO: renamed from: g */
    public final List f146568g;

    /* JADX INFO: renamed from: h */
    public final String f146569h;

    /* JADX INFO: renamed from: i */
    public final String f146570i;

    public C34810e0(String str, String str2, String str3, String str4, int i13, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f146562a = str;
        this.f146563b = str2;
        this.f146564c = str3;
        this.f146565d = str4;
        this.f146566e = i13;
        this.f146567f = arrayList;
        this.f146568g = arrayList2;
        this.f146569h = str5;
        this.f146570i = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m109872a() {
        if (this.f146564c.length() == 0) {
            return "";
        }
        int length = this.f146562a.length() + 3;
        String str = this.f146570i;
        String strSubstring = str.substring(AbstractC39414r.m125887f0(str, ':', length, false, 4) + 1, AbstractC39414r.m125887f0(str, '@', 0, false, 6));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public final String m109873b() {
        int length = this.f146562a.length() + 3;
        String str = this.f146570i;
        int iM125887f0 = AbstractC39414r.m125887f0(str, '/', length, false, 4);
        String strSubstring = str.substring(iM125887f0, AbstractC37172f.m119121f(iM125887f0, str.length(), str, "?#"));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m109874c() {
        int length = this.f146562a.length() + 3;
        String str = this.f146570i;
        int iM125887f0 = AbstractC39414r.m125887f0(str, '/', length, false, 4);
        int iM119121f = AbstractC37172f.m119121f(iM125887f0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iM125887f0 < iM119121f) {
            int i13 = iM125887f0 + 1;
            int iM119120e = AbstractC37172f.m119120e('/', i13, iM119121f, str);
            String strSubstring = str.substring(i13, iM119120e);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM125887f0 = iM119120e;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m109875d() {
        if (this.f146568g == null) {
            return null;
        }
        String str = this.f146570i;
        int iM125887f0 = AbstractC39414r.m125887f0(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iM125887f0, AbstractC37172f.m119120e('#', iM125887f0, str.length(), str));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final String m109876e() {
        if (this.f146563b.length() == 0) {
            return "";
        }
        int length = this.f146562a.length() + 3;
        String str = this.f146570i;
        String strSubstring = str.substring(length, AbstractC37172f.m119121f(length, str.length(), str, ":@"));
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C34810e0) && AbstractC22676k.m65745e(((C34810e0) obj).f146570i, this.f146570i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m109877f() {
        return AbstractC22676k.m65745e(this.f146562a, "https");
    }

    /* JADX INFO: renamed from: g */
    public final C5378v m109878g() {
        int i13;
        C5378v c5378v = new C5378v(1);
        ArrayList arrayList = (ArrayList) c5378v.f21856g;
        String scheme = this.f146562a;
        c5378v.f21851b = scheme;
        c5378v.f21853d = m109876e();
        c5378v.f21854e = m109872a();
        c5378v.f21855f = this.f146565d;
        AbstractC22676k.m65750j(scheme, "scheme");
        if (scheme.equals("http")) {
            i13 = 80;
        } else {
            i13 = scheme.equals("https") ? 443 : -1;
        }
        int i14 = this.f146566e;
        c5378v.f21852c = i14 != i13 ? i14 : -1;
        arrayList.clear();
        arrayList.addAll(m109874c());
        String strM109875d = m109875d();
        String strSubstring = null;
        c5378v.f21857h = strM109875d != null ? C5378v.m16524e(AbstractC22424a.m64603a(0, strM109875d, 0, 83, " \"'<>#")) : null;
        if (this.f146569h != null) {
            String str = this.f146570i;
            strSubstring = str.substring(AbstractC39414r.m125887f0(str, '#', 0, false, 6) + 1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        }
        c5378v.f21858i = strSubstring;
        return c5378v;
    }

    /* JADX INFO: renamed from: h */
    public final C5378v m109879h(String link) {
        AbstractC22676k.m65750j(link, "link");
        try {
            C5378v c5378v = new C5378v(1);
            c5378v.m16528d(this, link);
            return c5378v;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.f146570i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m109880i() {
        List list = this.f146568g;
        if (list == null) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        C34841t.m109915b(sb4, list);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public final String m109881j() {
        C5378v c5378vM109879h = m109879h("/...");
        AbstractC22676k.m65747g(c5378vM109879h);
        c5378vM109879h.f21853d = AbstractC22424a.m64603a(0, "", 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        c5378vM109879h.f21854e = AbstractC22424a.m64603a(0, "", 0, 123, " \"':;<=>@[]^`{}|/\\?#");
        return c5378vM109879h.m16526b().f146570i;
    }

    /* JADX INFO: renamed from: k */
    public final URI m109882k() {
        String strReplaceAll;
        C5378v c5378vM109878g = m109878g();
        ArrayList arrayList = (ArrayList) c5378vM109878g.f21856g;
        String str = (String) c5378vM109878g.f21855f;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC22676k.m65749i(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c5378vM109878g.f21855f = strReplaceAll;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.set(i13, AbstractC22424a.m64603a(0, (String) arrayList.get(i13), 0, 99, "[]"));
        }
        ArrayList arrayList2 = (ArrayList) c5378vM109878g.f21857h;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String str2 = (String) arrayList2.get(i14);
                arrayList2.set(i14, str2 != null ? AbstractC22424a.m64603a(0, str2, 0, 67, "\\^`{|}") : null);
            }
        }
        String str3 = (String) c5378vM109878g.f21858i;
        c5378vM109878g.f21858i = str3 != null ? AbstractC22424a.m64603a(0, str3, 0, 35, " \"#<>\\^`{|}") : null;
        String input = c5378vM109878g.toString();
        try {
            return new URI(input);
        } catch (URISyntaxException e5) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC22676k.m65749i(patternCompile2, "compile(...)");
                AbstractC22676k.m65750j(input, "input");
                String strReplaceAll2 = patternCompile2.matcher(input).replaceAll("");
                AbstractC22676k.m65749i(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC22676k.m65747g(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    public final String toString() {
        return this.f146570i;
    }
}
