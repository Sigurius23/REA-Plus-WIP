package p623xr;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: xr.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C38619o {

    /* JADX INFO: renamed from: a */
    public final int f166129a;

    /* JADX INFO: renamed from: b */
    public final long f166130b;

    public C38619o(int i13, long j7) {
        this.f166129a = i13;
        this.f166130b = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C38619o)) {
            return false;
        }
        C38619o c38619o = (C38619o) obj;
        return this.f166129a == c38619o.f166129a && this.f166130b == c38619o.f166130b;
    }

    public final int hashCode() {
        long j7 = this.f166130b;
        return ((int) ((j7 >>> 32) ^ j7)) ^ ((this.f166129a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("EventRecord{eventType=");
        sb4.append(this.f166129a);
        sb4.append(", eventTimestamp=");
        return AbstractC11266d.m30457k(this.f166130b, "}", sb4);
    }
}
