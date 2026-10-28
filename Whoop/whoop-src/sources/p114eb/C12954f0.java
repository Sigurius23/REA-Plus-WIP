package p114eb;

import android.net.Uri;
import android.os.Bundle;
import e93.AbstractC12889b;
import io.sentry.C20513q6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23465k;
import l83.C23470p;
import l83.EnumC23463i;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p005a3.C0227m1;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12954f0 {

    /* JADX INFO: renamed from: q */
    public static final Pattern f44733q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: r */
    public static final Pattern f44734r = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a */
    public final String f44735a;

    /* JADX INFO: renamed from: b */
    public final String f44736b;

    /* JADX INFO: renamed from: c */
    public final String f44737c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f44738d;

    /* JADX INFO: renamed from: e */
    public final String f44739e;

    /* JADX INFO: renamed from: f */
    public final C23470p f44740f;

    /* JADX INFO: renamed from: g */
    public final C23470p f44741g;

    /* JADX INFO: renamed from: h */
    public final Object f44742h;

    /* JADX INFO: renamed from: i */
    public boolean f44743i;

    /* JADX INFO: renamed from: j */
    public final Object f44744j;

    /* JADX INFO: renamed from: k */
    public final Object f44745k;

    /* JADX INFO: renamed from: l */
    public final Object f44746l;

    /* JADX INFO: renamed from: m */
    public final C23470p f44747m;

    /* JADX INFO: renamed from: n */
    public final String f44748n;

    /* JADX INFO: renamed from: o */
    public final C23470p f44749o;

    /* JADX INFO: renamed from: p */
    public final boolean f44750p;

    public C12954f0(String str, String str2, String str3) {
        this.f44735a = str;
        this.f44736b = str2;
        this.f44737c = str3;
        ArrayList arrayList = new ArrayList();
        this.f44738d = arrayList;
        this.f44740f = AbstractC30060g.m92088H(new C12951e0(this, 6));
        this.f44741g = AbstractC30060g.m92088H(new C12951e0(this, 4));
        EnumC23463i enumC23463i = EnumC23463i.f92935y;
        this.f44742h = AbstractC30060g.m92087G(enumC23463i, new C12951e0(this, 7));
        this.f44744j = AbstractC30060g.m92087G(enumC23463i, new C12951e0(this, 1));
        this.f44745k = AbstractC30060g.m92087G(enumC23463i, new C12951e0(this, 0));
        this.f44746l = AbstractC30060g.m92087G(enumC23463i, new C12951e0(this, 3));
        this.f44747m = AbstractC30060g.m92088H(new C12951e0(this, 2));
        this.f44749o = AbstractC30060g.m92088H(new C12951e0(this, 5));
        if (str != null) {
            StringBuilder sb4 = new StringBuilder("^");
            if (!f44733q.matcher(str).find()) {
                sb4.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            m36426a(strSubstring, arrayList, sb4);
            this.f44750p = (AbstractC39414r.m125876U(sb4, C20513q6.DEFAULT_PROPAGATION_TARGETS, false) || AbstractC39414r.m125876U(sb4, "([^/]+?)", false)) ? false : true;
            sb4.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb4.toString();
            AbstractC22676k.m65749i(string, "uriRegex.toString()");
            this.f44739e = AbstractC39421y.m125926K(string, C20513q6.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        C12945c0 c12945c0 = new C12945c0(str3);
        this.f44748n = AbstractC39421y.m125926K("^(" + c12945c0.m36421c() + "|[*]+)/(" + c12945c0.m36420b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false);
    }

    /* JADX INFO: renamed from: a */
    public static void m36426a(String str, ArrayList arrayList, StringBuilder sb4) {
        Matcher matcher = f44734r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            AbstractC22676k.m65748h(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                sb4.append(Pattern.quote(strSubstring));
            }
            sb4.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            AbstractC22676k.m65749i(strSubstring2, "substring(...)");
            sb4.append(Pattern.quote(strSubstring2));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m36427g(Bundle bundle, String key, String str, C12971l c12971l) {
        if (c12971l == null) {
            bundle.putString(key, str);
            return;
        }
        AbstractC12958g1 abstractC12958g1 = c12971l.f44798a;
        AbstractC22676k.m65750j(key, "key");
        abstractC12958g1.mo36414e(bundle, key, abstractC12958g1.mo36413d(str));
    }

    /* JADX INFO: renamed from: b */
    public final int m36428b(Uri uri) {
        String str;
        if (uri == null || (str = this.f44735a) == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(str).getPathSegments();
        AbstractC22676k.m65749i(requestedPathSegments, "requestedPathSegments");
        AbstractC22676k.m65749i(uriPathSegments, "uriPathSegments");
        return AbstractC25265s.m74106K0(requestedPathSegments, uriPathSegments).size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: c */
    public final ArrayList m36429c() {
        Collection collectionValues = ((Map) this.f44742h.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C12948d0) it.next()).f44726b);
        }
        return AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(this.f44738d, arrayList), (List) this.f44745k.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: d */
    public final Bundle m36430d(Uri deepLink, LinkedHashMap arguments) {
        AbstractC22676k.m65750j(deepLink, "deepLink");
        AbstractC22676k.m65750j(arguments, "arguments");
        Pattern pattern = (Pattern) this.f44740f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(deepLink.toString()) : null;
        if (matcher != null && matcher.matches()) {
            Bundle bundle = new Bundle();
            if (m36431e(matcher, bundle, arguments) && (!((Boolean) this.f44741g.getValue()).booleanValue() || m36432f(deepLink, bundle, arguments))) {
                String fragment = deepLink.getFragment();
                Pattern pattern2 = (Pattern) this.f44747m.getValue();
                Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
                if (matcher2 != null && matcher2.matches()) {
                    List list = (List) this.f44745k.getValue();
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    int i13 = 0;
                    for (Object obj : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        String str = (String) obj;
                        String value = Uri.decode(matcher2.group(i14));
                        C12971l c12971l = (C12971l) arguments.get(str);
                        try {
                            AbstractC22676k.m65749i(value, "value");
                            m36427g(bundle, str, value, c12971l);
                            arrayList.add(C23454a0.f92919a);
                            i13 = i14;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (AbstractC29125c.m88498G(arguments, new C0227m1(bundle, 11)).isEmpty()) {
                    return bundle;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36431e(Matcher matcher, Bundle bundle, Map map) {
        ArrayList arrayList = this.f44738d;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i14));
            C12971l c12971l = (C12971l) map.get(str);
            try {
                AbstractC22676k.m65749i(value, "value");
                m36427g(bundle, str, value, c12971l);
                arrayList2.add(C23454a0.f92919a);
                i13 = i14;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C12954f0)) {
            C12954f0 c12954f0 = (C12954f0) obj;
            if (AbstractC22676k.m65745e(this.f44735a, c12954f0.f44735a) && AbstractC22676k.m65745e(this.f44736b, c12954f0.f44736b) && AbstractC22676k.m65745e(this.f44737c, c12954f0.f44737c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: f */
    public final boolean m36432f(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z4;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.f44742h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            C12948d0 c12948d0 = (C12948d0) entry.getValue();
            List<String> inputParams = uri.getQueryParameters(str);
            if (this.f44743i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                inputParams = AbstractC37056f.m118958J(query);
            }
            AbstractC22676k.m65749i(inputParams, "inputParams");
            Object obj2 = C23454a0.f92919a;
            int i13 = 0;
            Bundle bundleM36273g = AbstractC12889b.m36273g(new C23465k[0]);
            for (String str2 : c12948d0.f44726b) {
                C12971l c12971l = (C12971l) map.get(str2);
                AbstractC12958g1 abstractC12958g1 = c12971l != null ? c12971l.f44798a : null;
                if ((abstractC12958g1 instanceof C13001z0) && !c12971l.f44800c) {
                    switch (((C13001z0) abstractC12958g1).f44923r) {
                        case 0:
                            obj = new boolean[0];
                            break;
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        default:
                            obj = C25271y.f99162w;
                            break;
                        case 2:
                            obj = new float[0];
                            break;
                        case 4:
                            obj = new int[0];
                            break;
                        case 6:
                            obj = new long[0];
                            break;
                        case 8:
                            obj = new String[0];
                            break;
                    }
                    abstractC12958g1.mo36414e(bundleM36273g, str2, obj);
                }
            }
            for (String str3 : inputParams) {
                String str4 = c12948d0.f44725a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return i13;
                }
                ArrayList arrayList = c12948d0.f44726b;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                int i14 = i13;
                for (Object obj3 : arrayList) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    String strGroup = matcher.group(i15);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    int i16 = i13;
                    C12971l c12971l2 = (C12971l) map.get(str5);
                    try {
                        if (bundleM36273g.containsKey(str5)) {
                            if (bundleM36273g.containsKey(str5)) {
                                if (c12971l2 != null) {
                                    AbstractC12958g1 abstractC12958g2 = c12971l2.f44798a;
                                    Object objMo36411a = abstractC12958g2.mo36411a(bundleM36273g, str5);
                                    if (!bundleM36273g.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    abstractC12958g2.mo36414e(bundleM36273g, str5, abstractC12958g2.mo36433c(objMo36411a, strGroup));
                                    objValueOf = obj2;
                                }
                                z4 = i16;
                            } else {
                                z4 = 1;
                            }
                            try {
                                objValueOf = Boolean.valueOf(z4);
                            } catch (IllegalArgumentException unused) {
                                objValueOf = obj2;
                            }
                        } else {
                            m36427g(bundleM36273g, str5, strGroup, c12971l2);
                            objValueOf = obj2;
                        }
                    } catch (IllegalArgumentException unused2) {
                    }
                    arrayList2.add(objValueOf);
                    i14 = i15;
                    i13 = i16;
                }
            }
            bundle.putAll(bundleM36273g);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f44735a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44736b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f44737c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
