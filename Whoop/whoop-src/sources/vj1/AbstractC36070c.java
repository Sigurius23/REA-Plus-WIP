package vj1;

import ak1.C0948a;
import hy0.EnumC17727b2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vj1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lak1/a;", "analyticsState", "Lvj1/d;", "a", "(Lak1/a;)Lvj1/d;", "", "source", "b", "(Ljava/lang/String;Lak1/a;)Lvj1/d;", "health-monitor_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36070c {
    /* JADX INFO: renamed from: a */
    public static final C36071d m114550a(C0948a c0948a) {
        if (c0948a == null) {
            return new C36071d(null, null, "health_monitor", null, null, 27, null);
        }
        String strName = c0948a.getHighestSeverityStatus().name();
        String strValueOf = c0948a.getMetricsWithValues() != 0 ? String.valueOf(c0948a.getMetricsInRange() / c0948a.getMetricsWithValues()) : null;
        Map<String, EnumC17727b2> mapM2386d = c0948a.m2386d();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM2386d.size()));
        Iterator<T> it = mapM2386d.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((EnumC17727b2) entry.getValue()).name());
        }
        return new C36071d(strName, null, "health_monitor", strValueOf, AbstractC25247g0.m73995d0(linkedHashMap, AbstractC25247g0.m73990Y(new C23465k("valid_data_count", String.valueOf(c0948a.getMetricsWithValues())), new C23465k("positive_status_count", String.valueOf(c0948a.getMetricsInRange())))), 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C36071d m114551b(String str, C0948a c0948a) {
        C36071d c36071dM114550a = m114550a(c0948a);
        Map<String, String> mapM114557f = c36071dM114550a.m114557f();
        Map<String, String> mapM95645u = C25272z.f99163w;
        if (mapM114557f == null) {
            mapM114557f = mapM95645u;
        }
        if (str != null) {
            mapM95645u = AbstractC31061c.m95645u("source", str);
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM114557f, mapM95645u);
        String lowerCase = "Open".toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return C36071d.m114552b(c36071dM114550a, null, lowerCase, null, null, linkedHashMapM73995d0, 13, null);
    }
}
