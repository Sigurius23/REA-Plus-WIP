package aa3;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0662x0 {

    /* JADX INFO: renamed from: a */
    public C0606b1 f2295a;

    /* JADX INFO: renamed from: b */
    public String f2296b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0662x0)) {
            return false;
        }
        C0662x0 c0662x0 = (C0662x0) obj;
        return AbstractC22676k.m65745e(this.f2295a, c0662x0.f2295a) && AbstractC22676k.m65745e(this.f2296b, c0662x0.f2296b);
    }

    public final int hashCode() {
        int iHashCode = this.f2295a.hashCode() * 31;
        String str = this.f2296b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb4.append(this.f2295a);
        sb4.append(", typeFlexibilityId=");
        return AbstractC25012a.m73377j(sb4, this.f2296b, ')');
    }
}
