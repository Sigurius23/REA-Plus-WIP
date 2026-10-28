package sr;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: sr.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C32906n {

    /* JADX INFO: renamed from: a */
    public final long f137126a;

    public C32906n(long j7) {
        this.f137126a = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C32906n) && this.f137126a == ((C32906n) obj).f137126a;
    }

    public final int hashCode() {
        long j7 = this.f137126a;
        return (((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return AbstractC11266d.m30457k(this.f137126a, ", webViewRequestMode=0}", new StringBuilder("PrepareIntegrityTokenRequest{cloudProjectNumber="));
    }
}
