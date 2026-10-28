package p441qx;

import java.util.Map;

/* JADX INFO: renamed from: qx.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C30712g0 implements Map.Entry {

    /* JADX INFO: renamed from: E */
    public C30712g0 f126461E;

    /* JADX INFO: renamed from: F */
    public final Object f126462F;

    /* JADX INFO: renamed from: G */
    public final int f126463G;

    /* JADX INFO: renamed from: H */
    public Object f126464H;

    /* JADX INFO: renamed from: I */
    public int f126465I;

    /* JADX INFO: renamed from: w */
    public C30712g0 f126466w;

    /* JADX INFO: renamed from: x */
    public C30712g0 f126467x;

    /* JADX INFO: renamed from: y */
    public C30712g0 f126468y;

    /* JADX INFO: renamed from: z */
    public C30712g0 f126469z;

    public C30712g0() {
        this.f126462F = null;
        this.f126463G = -1;
        this.f126461E = this;
        this.f126469z = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f126462F;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f126464H;
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
        return this.f126462F;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f126464H;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f126462F;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f126464H;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f126464H;
        this.f126464H = obj;
        return obj2;
    }

    public final String toString() {
        return this.f126462F + "=" + this.f126464H;
    }

    public C30712g0(C30712g0 c30712g0, Object obj, int i13, C30712g0 c30712g1, C30712g0 c30712g2) {
        this.f126466w = c30712g0;
        this.f126462F = obj;
        this.f126463G = i13;
        this.f126465I = 1;
        this.f126469z = c30712g1;
        this.f126461E = c30712g2;
        c30712g2.f126469z = this;
        c30712g1.f126461E = this;
    }
}
