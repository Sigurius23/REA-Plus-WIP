package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C1572d {

    /* JADX INFO: renamed from: a */
    public final HashMap f6197a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f6198b;

    public C1572d(HashMap map) {
        this.f6198b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1632v enumC1632v = (EnumC1632v) entry.getValue();
            List arrayList = (List) this.f6197a.get(enumC1632v);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f6197a.put(enumC1632v, arrayList);
            }
            arrayList.add((C1576e) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m4974a(List list, InterfaceC1585g0 interfaceC1585g0, EnumC1632v enumC1632v, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C1576e c1576e = (C1576e) list.get(size);
                Method method = c1576e.f6207b;
                try {
                    int i13 = c1576e.f6206a;
                    if (i13 == 0) {
                        method.invoke(obj, null);
                    } else if (i13 == 1) {
                        method.invoke(obj, interfaceC1585g0);
                    } else if (i13 == 2) {
                        method.invoke(obj, interfaceC1585g0, enumC1632v);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Failed to call observer method", e13.getCause());
                }
            }
        }
    }
}
