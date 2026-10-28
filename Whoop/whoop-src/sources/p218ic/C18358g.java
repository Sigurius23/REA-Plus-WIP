package p218ic;

import ib0.C18332c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: ic.g */
/* JADX INFO: loaded from: classes.dex */
public final class C18358g {

    /* JADX INFO: renamed from: b */
    public static final C18358g f71479b;

    /* JADX INFO: renamed from: a */
    public final HashMap f71480a;

    static {
        C18358g c18358g = new C18358g(new LinkedHashMap());
        AbstractC29125c.m88515X(c18358g);
        f71479b = c18358g;
    }

    public C18358g(C18358g other) {
        AbstractC22676k.m65750j(other, "other");
        this.f71480a = new HashMap(other.f71480a);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52858a(String str, boolean z4) {
        Object objValueOf = Boolean.valueOf(z4);
        Object obj = this.f71480a.get(str);
        if (obj instanceof Boolean) {
            objValueOf = obj;
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX INFO: renamed from: b */
    public final long m52859b(String str, long j7) {
        Object objValueOf = Long.valueOf(j7);
        Object obj = this.f71480a.get(str);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    /* JADX INFO: renamed from: c */
    public final String m52860c(String str) {
        Object obj = this.f71480a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m52861d(String str) {
        Object obj = this.f71480a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && C18358g.class.equals(obj.getClass())) {
                HashMap map = ((C18358g) obj).f71480a;
                HashMap map2 = this.f71480a;
                Set<String> setKeySet = map2.keySet();
                if (AbstractC22676k.m65745e(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = AbstractC25260n.m74058b0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f71480a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return AbstractC25012a.m73376i(AbstractC25265s.m74110N0(this.f71480a.entrySet(), null, null, null, new C18332c(3), 31), "}", new StringBuilder("Data {"));
    }

    public C18358g(LinkedHashMap values) {
        AbstractC22676k.m65750j(values, "values");
        this.f71480a = new HashMap(values);
    }
}
