package p541v2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: v2.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C35558a {

    /* JADX INFO: renamed from: a */
    public long f151278a;

    /* JADX INFO: renamed from: b */
    public float f151279b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35558a)) {
            return false;
        }
        C35558a c35558a = (C35558a) obj;
        return this.f151278a == c35558a.f151278a && Float.compare(this.f151279b, c35558a.f151279b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f151279b) + (Long.hashCode(this.f151278a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DataPointAtTime(time=");
        sb4.append(this.f151278a);
        sb4.append(", dataPoint=");
        return AbstractC30802r.m94763l(sb4, this.f151279b, ')');
    }
}
