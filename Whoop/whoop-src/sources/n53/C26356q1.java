package n53;

import p000.AbstractC11266d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: n53.q1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26356q1 {

    /* JADX INFO: renamed from: a */
    public final long f104769a;

    /* JADX INFO: renamed from: b */
    public final long f104770b;

    public C26356q1(long j7, long j13) {
        this.f104769a = j7;
        this.f104770b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26356q1)) {
            return false;
        }
        C26356q1 c26356q1 = (C26356q1) obj;
        return this.f104769a == c26356q1.f104769a && this.f104770b == c26356q1.f104770b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104770b) + (Long.hashCode(this.f104769a) * 31);
    }

    public final String toString() {
        return AbstractC11266d.m30457k(this.f104770b, ")", AbstractC39383f.m125596b(this.f104769a, "SdpTiming(start=", ", stop="));
    }
}
