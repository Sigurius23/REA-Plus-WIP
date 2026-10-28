package l83;

import d13.AbstractC11478a;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C23471q implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Object f92947w;

    /* JADX INFO: renamed from: x */
    public final Object f92948x;

    /* JADX INFO: renamed from: y */
    public final Object f92949y;

    public C23471q(Object obj, Object obj2, Object obj3) {
        this.f92947w = obj;
        this.f92948x = obj2;
        this.f92949y = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23471q)) {
            return false;
        }
        C23471q c23471q = (C23471q) obj;
        return AbstractC22676k.m65745e(this.f92947w, c23471q.f92947w) && AbstractC22676k.m65745e(this.f92948x, c23471q.f92948x) && AbstractC22676k.m65745e(this.f92949y, c23471q.f92949y);
    }

    public final int hashCode() {
        Object obj = this.f92947w;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f92948x;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f92949y;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append(this.f92947w);
        sb4.append(", ");
        sb4.append(this.f92948x);
        sb4.append(", ");
        return AbstractC11478a.m30860l(sb4, this.f92949y, ')');
    }
}
