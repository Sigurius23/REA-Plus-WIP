package p452r7;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r7.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31005c0 implements Comparable {

    /* JADX INFO: renamed from: w */
    public final double f127992w;

    public C31005c0(double d3) {
        this.f127992w = d3;
    }

    /* JADX INFO: renamed from: a */
    public final double m95542a() {
        return this.f127992w;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31005c0 other = (C31005c0) obj;
        AbstractC22676k.m65750j(other, "other");
        return Double.compare(this.f127992w, other.f127992w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C31005c0) {
            return this.f127992w == ((C31005c0) obj).f127992w;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f127992w);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f127992w);
        sb4.append('%');
        return sb4.toString();
    }
}
