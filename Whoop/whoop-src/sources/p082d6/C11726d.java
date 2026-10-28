package p082d6;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d6.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C11726d {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f37887a;

    /* JADX INFO: renamed from: b */
    public final Set f37888b;

    public C11726d(SharedPreferences prefs, Set set) {
        AbstractC22676k.m65750j(prefs, "prefs");
        this.f37887a = prefs;
        this.f37888b = set;
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap m31329a() {
        Map<String, ?> all = this.f37887a.getAll();
        AbstractC22676k.m65749i(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f37888b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC25265s.m74103I1((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
