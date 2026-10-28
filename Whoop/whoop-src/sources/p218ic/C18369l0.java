package p218ic;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: ic.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18369l0 {

    /* JADX INFO: renamed from: a */
    public final long f71507a;

    /* JADX INFO: renamed from: b */
    public final long f71508b;

    public C18369l0(long j7, long j13) {
        this.f71507a = j7;
        this.f71508b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18369l0.class.equals(obj.getClass())) {
            C18369l0 c18369l0 = (C18369l0) obj;
            if (c18369l0.f71507a == this.f71507a && c18369l0.f71508b == this.f71508b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f71508b) + (Long.hashCode(this.f71507a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
        sb4.append(this.f71507a);
        sb4.append(", flexIntervalMillis=");
        return AbstractC2875y.m8302o(sb4, this.f71508b, '}');
    }
}
