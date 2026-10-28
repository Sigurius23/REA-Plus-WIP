package qb3;

import d13.AbstractC11478a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qb3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C30187a {

    /* JADX INFO: renamed from: a */
    public final Object f123579a;

    /* JADX INFO: renamed from: b */
    public final Object f123580b;

    public C30187a(Object obj, Object obj2) {
        this.f123579a = obj;
        this.f123580b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30187a)) {
            return false;
        }
        C30187a c30187a = (C30187a) obj;
        return AbstractC22676k.m65745e(this.f123579a, c30187a.f123579a) && AbstractC22676k.m65745e(this.f123580b, c30187a.f123580b);
    }

    public final int hashCode() {
        Object obj = this.f123579a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f123580b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ApproximationBounds(lower=");
        sb4.append(this.f123579a);
        sb4.append(", upper=");
        return AbstractC11478a.m30860l(sb4, this.f123580b, ')');
    }
}
