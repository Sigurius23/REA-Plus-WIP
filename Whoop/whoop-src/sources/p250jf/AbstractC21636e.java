package p250jf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import m83.AbstractC25265s;
import m83.C25271y;
import p163g1.C14954a7;
import p710im1.C18689p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import vg.C35971r;
import vg.InterfaceC35965l;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import yb3.C39412p;

/* JADX INFO: renamed from: jf.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21636e {

    /* JADX INFO: renamed from: a */
    public static final C14954a7 f83072a;

    /* JADX INFO: renamed from: b */
    public static final C14954a7 f83073b;

    /* JADX INFO: renamed from: c */
    public static final C14954a7 f83074c;

    /* JADX INFO: renamed from: d */
    public static final C14954a7 f83075d;

    static {
        int i13 = 1;
        f83072a = new C14954a7(C21633b.f83069w, i13);
        f83073b = new C14954a7(C21634c.f83070w, i13);
        f83074c = new C14954a7(C21635d.f83071w, i13);
        f83075d = new C14954a7(new C18689p0(25), i13);
    }

    /* JADX INFO: renamed from: a */
    public static final C39412p m60880a(String literal, String str) {
        StringBuilder sb4 = new StringBuilder("^");
        AbstractC22676k.m65750j(literal, "literal");
        String strQuote = Pattern.quote(literal);
        AbstractC22676k.m65749i(strQuote, "quote(...)");
        sb4.append(strQuote);
        sb4.append("(?i)");
        String strQuote2 = Pattern.quote(str);
        AbstractC22676k.m65749i(strQuote2, "quote(...)");
        sb4.append(strQuote2);
        sb4.append('$');
        return new C39412p(sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public static final Object m60881b(C21632a c21632a, InterfaceC35965l platform) {
        Object objInvoke;
        AbstractC22676k.m65750j(c21632a, "<this>");
        AbstractC22676k.m65750j(platform, "platform");
        String key = c21632a.f83066b;
        C35971r c35971r = (C35971r) platform;
        AbstractC22676k.m65750j(key, "key");
        String property = System.getProperty(key);
        if (property == null) {
            property = c35971r.m114207b(c21632a.f83067c);
        }
        return (property == null || (objInvoke = c21632a.f83065a.invoke(property)) == null) ? c21632a.f83068d : objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m60882c(C21637f c21637f, InterfaceC35967n platform) {
        String str;
        String strM114207b;
        Object objInvoke;
        AbstractC22676k.m65750j(c21637f, "<this>");
        AbstractC22676k.m65750j(platform, "platform");
        Iterator it = c21637f.m60888d().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                strM114207b = null;
                break;
            }
            String key = (String) it.next();
            AbstractC22676k.m65750j(key, "key");
            strM114207b = System.getProperty(key);
        } while (strM114207b == null);
        if (strM114207b != null) {
            str = strM114207b;
            break;
        }
        Iterator it3 = c21637f.m60886b().iterator();
        while (it3.hasNext()) {
            strM114207b = ((C35971r) platform).m114207b((String) it3.next());
            if (strM114207b != null) {
                str = strM114207b;
                break;
            }
        }
        return (str == null || (objInvoke = c21637f.m60887c().invoke(str)) == null) ? c21637f.m60885a() : objInvoke;
    }

    /* JADX INFO: renamed from: d */
    public static final String m60883d(Map map, C39412p c39412p) {
        String str;
        Iterator it = map.entrySet().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (c39412p.m125851e(str2)) {
                str = str3;
            }
        } while (str == null);
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static C21637f m60884e(C21632a c21632a, List list) {
        AbstractC22676k.m65750j(c21632a, "<this>");
        return new C21637f(c21632a.f83065a, AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c21632a.f83066b), list), AbstractC25265s.m74129g1(AbstractC37056f.m118958J(c21632a.f83067c), C25271y.f99162w), c21632a.f83068d);
    }
}
