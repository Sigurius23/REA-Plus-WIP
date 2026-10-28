package d40;

import p031b9.AbstractC2875y;
import p208i2.C17919x;

/* JADX INFO: renamed from: d40.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11656a {

    /* JADX INFO: renamed from: a */
    public final long f37637a;

    /* JADX INFO: renamed from: b */
    public final long f37638b;

    public C11656a(long j7, long j13) {
        this.f37637a = j7;
        this.f37638b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11656a)) {
            return false;
        }
        C11656a c11656a = (C11656a) obj;
        return C17919x.m51542d(this.f37637a, c11656a.f37637a) && C17919x.m51542d(this.f37638b, c11656a.f37638b);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f37638b) + (Long.hashCode(this.f37637a) * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("EmbeddedCheckmarkColors(separatorColor=", C17919x.m51548j(this.f37637a), ", checkmarkColor=", C17919x.m51548j(this.f37638b), ")");
    }
}
