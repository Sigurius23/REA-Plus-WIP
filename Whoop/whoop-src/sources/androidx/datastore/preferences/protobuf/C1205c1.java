package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1205c1 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: w */
    public final Comparable f5364w;

    /* JADX INFO: renamed from: x */
    public Object f5365x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1202b1 f5366y;

    public C1205c1(C1202b1 c1202b1, Map.Entry entry) {
        this(c1202b1, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m3790a() {
        return this.f5364w;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5364w.compareTo(((C1205c1) obj).f5364w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f5364w;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f5365x;
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
        return this.f5364w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5365x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5364w;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5365x;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5366y.m3781b();
        Object obj2 = this.f5365x;
        this.f5365x = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5364w + "=" + this.f5365x;
    }

    public C1205c1(C1202b1 c1202b1, Comparable comparable, Object obj) {
        this.f5366y = c1202b1;
        this.f5364w = comparable;
        this.f5365x = obj;
    }
}
