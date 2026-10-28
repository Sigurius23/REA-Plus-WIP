package n83;

import d93.InterfaceC11823d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n83.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C26462e implements Map.Entry, InterfaceC11823d {

    /* JADX INFO: renamed from: w */
    public final C26463f f105100w;

    /* JADX INFO: renamed from: x */
    public final int f105101x;

    /* JADX INFO: renamed from: y */
    public final int f105102y;

    public C26462e(C26463f map, int i13) {
        AbstractC22676k.m65750j(map, "map");
        this.f105100w = map;
        this.f105101x = i13;
        this.f105102y = map.f105107H;
    }

    /* JADX INFO: renamed from: a */
    public final void m78378a() {
        if (this.f105100w.f105107H != this.f105102y) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return AbstractC22676k.m65745e(entry.getKey(), getKey()) && AbstractC22676k.m65745e(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        m78378a();
        return this.f105100w.f105113w[this.f105101x];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        m78378a();
        Object[] objArr = this.f105100w.f105114x;
        AbstractC22676k.m65747g(objArr);
        return objArr[this.f105101x];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m78378a();
        C26463f c26463f = this.f105100w;
        c26463f.m78381c();
        Object[] objArr = c26463f.f105114x;
        if (objArr == null) {
            int length = c26463f.f105113w.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            c26463f.f105114x = objArr;
        }
        int i13 = this.f105101x;
        Object obj2 = objArr[i13];
        objArr[i13] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getKey());
        sb4.append('=');
        sb4.append(getValue());
        return sb4.toString();
    }
}
