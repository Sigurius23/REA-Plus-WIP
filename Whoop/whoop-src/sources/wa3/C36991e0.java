package wa3;

import java.util.Map;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: wa3.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C36991e0 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: w */
    public final Comparable f158322w;

    /* JADX INFO: renamed from: x */
    public Object f158323x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36983a0 f158324y;

    public C36991e0(C36983a0 c36983a0, Comparable comparable, Object obj) {
        this.f158324y = c36983a0;
        this.f158322w = comparable;
        this.f158323x = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f158322w.compareTo(((C36991e0) obj).f158322w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f158322w;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f158323x;
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
        return this.f158322w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f158323x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f158322w;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f158323x;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f158324y.m118728b();
        Object obj2 = this.f158323x;
        this.f158323x = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f158322w);
        String strValueOf2 = String.valueOf(this.f158323x);
        return AbstractC2875y.m8304q(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
