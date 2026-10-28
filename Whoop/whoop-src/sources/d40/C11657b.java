package d40;

import p031b9.AbstractC2875y;
import p208i2.C17919x;

/* JADX INFO: renamed from: d40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11657b {

    /* JADX INFO: renamed from: a */
    public final long f37639a;

    /* JADX INFO: renamed from: b */
    public final long f37640b;

    public C11657b(long j7, long j13) {
        this.f37639a = j7;
        this.f37640b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11657b)) {
            return false;
        }
        C11657b c11657b = (C11657b) obj;
        return C17919x.m51542d(this.f37639a, c11657b.f37639a) && C17919x.m51542d(this.f37640b, c11657b.f37640b);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f37640b) + (Long.hashCode(this.f37639a) * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("EmbeddedDisclosureColors(separatorColor=", C17919x.m51548j(this.f37639a), ", disclosureColor=", C17919x.m51548j(this.f37640b), ")");
    }
}
