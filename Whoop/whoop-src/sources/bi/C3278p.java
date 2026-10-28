package bi;

import b30.C2557k2;
import d33.C11622q;
import j43.AbstractC21321e;
import j43.C21319c;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25265s;
import p294l3.C23249d0;
import p510u0.C34327j0;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bi.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C3278p {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f12803a;

    public C3278p(C11622q c11622q) {
        this.f12803a = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: c */
    public static String m9546c(int i13, int i14, String str) {
        return i13 + '-' + i14 + '-' + str;
    }

    /* JADX INFO: renamed from: a */
    public void m9547a(String str, long j7, long j13, C37816b c37816b) {
        this.f12803a.put(str, new C34327j0(new C23249d0(j7, j13, 4), new C37816b(new C2557k2(c37816b, 8), true, -905386904)));
    }

    /* JADX INFO: renamed from: b */
    public C21319c m9548b(String callType) {
        AbstractC22676k.m65750j(callType, "callType");
        LinkedHashMap linkedHashMap = this.f12803a;
        C21319c c21319c = (C21319c) linkedHashMap.get(callType);
        if (c21319c != null) {
            return c21319c;
        }
        C21319c c21319c2 = (C21319c) linkedHashMap.get("ALL_CALL_TYPES");
        if (c21319c2 != null) {
            return c21319c2;
        }
        throw new IllegalArgumentException("No configuration found for ".concat(callType));
    }

    /* JADX INFO: renamed from: d */
    public void m9549d(String str) {
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        this.f12803a.put(lowerCase, AbstractC37056f.m118964P(str));
    }

    public C3278p(C3279q c3279q) {
        Map map = c3279q.f12805a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC25265s.m74097F1((Collection) entry.getValue()));
        }
        this.f12803a = linkedHashMap;
    }

    public C3278p(int i13) {
        switch (i13) {
            case 2:
                this.f12803a = new LinkedHashMap();
                break;
            case 3:
                this.f12803a = new LinkedHashMap();
                break;
            case 4:
            default:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.f12803a = linkedHashMap;
                linkedHashMap.put("ALL_CALL_TYPES", AbstractC21321e.f81531a);
                linkedHashMap.put("livestream", AbstractC21321e.f81532b);
                break;
            case 5:
                this.f12803a = new LinkedHashMap();
                break;
            case 6:
                this.f12803a = new LinkedHashMap();
                break;
            case 7:
                this.f12803a = new LinkedHashMap();
                break;
        }
    }
}
