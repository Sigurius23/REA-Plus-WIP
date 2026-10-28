package gf;

import d13.AbstractC11478a;
import d93.InterfaceC11820a;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gf.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C15769j implements Map.Entry, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Object f59434w;

    /* JADX INFO: renamed from: x */
    public final Object f59435x;

    public C15769j(Object obj, Object obj2) {
        this.f59434w = obj;
        this.f59435x = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15769j)) {
            return false;
        }
        C15769j c15769j = (C15769j) obj;
        return AbstractC22676k.m65745e(this.f59434w, c15769j.f59434w) && AbstractC22676k.m65745e(this.f59435x, c15769j.f59435x);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f59434w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f59435x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f59434w;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f59435x;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Entry(key=");
        sb4.append(this.f59434w);
        sb4.append(", value=");
        return AbstractC11478a.m30860l(sb4, this.f59435x, ')');
    }
}
