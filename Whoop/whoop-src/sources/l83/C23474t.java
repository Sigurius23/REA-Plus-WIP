package l83;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C23474t implements Comparable {

    /* JADX INFO: renamed from: w */
    public final int f92952w;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC22676k.m65751k(this.f92952w ^ Integer.MIN_VALUE, ((C23474t) obj).f92952w ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23474t) {
            return this.f92952w == ((C23474t) obj).f92952w;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92952w);
    }

    public final String toString() {
        return String.valueOf(((long) this.f92952w) & 4294967295L);
    }
}
