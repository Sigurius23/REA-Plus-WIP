package p452r7;

import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: r7.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31019j0 implements Comparable {

    /* JADX INFO: renamed from: x */
    public static final C31017i0 f128007x = new C31017i0();

    /* JADX INFO: renamed from: w */
    public final double f128008w;

    public C31019j0(double d3) {
        this.f128008w = d3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31019j0 other = (C31019j0) obj;
        AbstractC22676k.m65750j(other, "other");
        return Double.compare(this.f128008w, other.f128008w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31019j0) {
            return this.f128008w == ((C31019j0) obj).f128008w;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f128008w);
    }

    public final String toString() {
        return AbstractC30007c.m91836f(this.f128008w, " mmHg", new StringBuilder());
    }
}
