package androidx.health.platform.client.proto;

import java.util.Map;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1485k1 {
    /* JADX INFO: renamed from: a */
    public static int m4677a(int i13, Object obj, Object obj2) {
        C1480j1 c1480j1 = (C1480j1) obj;
        C1475i1 c1475i1 = (C1475i1) obj2;
        int iM94754c = 0;
        if (c1480j1.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c1480j1.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            c1475i1.getClass();
            int iM4656C = C1483k.m4656C(i13);
            int iM4633a = C1475i1.m4633a(c1475i1.f6052a, key, value);
            iM94754c = AbstractC30802r.m94754c(iM4633a, iM4633a, iM4656C, iM94754c);
        }
        return iM94754c;
    }

    /* JADX INFO: renamed from: b */
    public static C1480j1 m4678b(Object obj, Object obj2) {
        C1480j1 c1480j1M4652c = (C1480j1) obj;
        C1480j1 c1480j1 = (C1480j1) obj2;
        if (!c1480j1.isEmpty()) {
            if (!c1480j1M4652c.f6055w) {
                c1480j1M4652c = c1480j1M4652c.m4652c();
            }
            c1480j1M4652c.m4651b();
            if (!c1480j1.isEmpty()) {
                c1480j1M4652c.putAll(c1480j1);
            }
        }
        return c1480j1M4652c;
    }
}
