package p452r7;

import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: r7.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31021k0 implements Comparable {

    /* JADX INFO: renamed from: w */
    public final double f128013w;

    public C31021k0(double d3) {
        this.f128013w = d3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31021k0 other = (C31021k0) obj;
        AbstractC22676k.m65750j(other, "other");
        return Double.compare(this.f128013w, other.f128013w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31021k0) && this.f128013w == ((C31021k0) obj).f128013w;
    }

    public final int hashCode() {
        return Double.hashCode(this.f128013w);
    }

    public final String toString() {
        return AbstractC30007c.m91836f(this.f128013w, " Celsius", new StringBuilder());
    }
}
