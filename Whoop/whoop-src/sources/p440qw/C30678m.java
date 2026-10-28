package p440qw;

import java.util.Map;

/* JADX INFO: renamed from: qw.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C30678m implements Map.Entry {

    /* JADX INFO: renamed from: E */
    public C30678m f126227E;

    /* JADX INFO: renamed from: F */
    public final Object f126228F;

    /* JADX INFO: renamed from: G */
    public final boolean f126229G;

    /* JADX INFO: renamed from: H */
    public Object f126230H;

    /* JADX INFO: renamed from: I */
    public int f126231I;

    /* JADX INFO: renamed from: w */
    public C30678m f126232w;

    /* JADX INFO: renamed from: x */
    public C30678m f126233x;

    /* JADX INFO: renamed from: y */
    public C30678m f126234y;

    /* JADX INFO: renamed from: z */
    public C30678m f126235z;

    public C30678m(boolean z4) {
        this.f126228F = null;
        this.f126229G = z4;
        this.f126227E = this;
        this.f126235z = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f126228F;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f126230H;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f126228F;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f126230H;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f126228F;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f126230H;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f126229G) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f126230H;
        this.f126230H = obj;
        return obj2;
    }

    public final String toString() {
        return this.f126228F + "=" + this.f126230H;
    }

    public C30678m(boolean z4, C30678m c30678m, Object obj, C30678m c30678m2, C30678m c30678m3) {
        this.f126232w = c30678m;
        this.f126228F = obj;
        this.f126229G = z4;
        this.f126231I = 1;
        this.f126235z = c30678m2;
        this.f126227E = c30678m3;
        c30678m3.f126235z = this;
        c30678m2.f126227E = this;
    }
}
