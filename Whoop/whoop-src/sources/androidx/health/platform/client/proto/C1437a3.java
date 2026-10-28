package androidx.health.platform.client.proto;

import java.util.Map;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.a3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1437a3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: w */
    public final Comparable f6018w;

    /* JADX INFO: renamed from: x */
    public Object f6019x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1546w2 f6020y;

    public C1437a3(C1546w2 c1546w2, Comparable comparable, Object obj) {
        this.f6020y = c1546w2;
        this.f6018w = comparable;
        this.f6019x = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6018w.compareTo(((C1437a3) obj).f6018w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6018w;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f6019x;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6018w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6019x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6018w;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6019x;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6020y.m4929b();
        Object obj2 = this.f6019x;
        this.f6019x = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6018w + "=" + this.f6019x;
    }
}
