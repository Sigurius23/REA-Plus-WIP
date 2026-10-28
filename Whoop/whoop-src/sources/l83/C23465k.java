package l83;

import d13.AbstractC11478a;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C23465k implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Object f92937w;

    /* JADX INFO: renamed from: x */
    public final Object f92938x;

    public C23465k(Object obj, Object obj2) {
        this.f92937w = obj;
        this.f92938x = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23465k)) {
            return false;
        }
        C23465k c23465k = (C23465k) obj;
        return AbstractC22676k.m65745e(this.f92937w, c23465k.f92937w) && AbstractC22676k.m65745e(this.f92938x, c23465k.f92938x);
    }

    public final int hashCode() {
        Object obj = this.f92937w;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f92938x;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append(this.f92937w);
        sb4.append(", ");
        return AbstractC11478a.m30860l(sb4, this.f92938x, ')');
    }
}
