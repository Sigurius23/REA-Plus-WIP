package mm;

import java.util.Set;

/* JADX INFO: renamed from: mm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C25678b {

    /* JADX INFO: renamed from: a */
    public final long f101007a;

    /* JADX INFO: renamed from: b */
    public final long f101008b;

    /* JADX INFO: renamed from: c */
    public final Set f101009c;

    public C25678b(long j7, long j13, Set set) {
        this.f101007a = j7;
        this.f101008b = j13;
        this.f101009c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25678b) {
            C25678b c25678b = (C25678b) obj;
            if (this.f101007a == c25678b.f101007a && this.f101008b == c25678b.f101008b && this.f101009c.equals(c25678b.f101009c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f101007a;
        int i13 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j13 = this.f101008b;
        return ((i13 ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003) ^ this.f101009c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f101007a + ", maxAllowedDelay=" + this.f101008b + ", flags=" + this.f101009c + "}";
    }
}
