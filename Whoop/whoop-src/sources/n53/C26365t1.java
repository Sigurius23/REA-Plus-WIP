package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.t1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26365t1 {

    /* JADX INFO: renamed from: a */
    public final long f104786a;

    public C26365t1(long j7) {
        this.f104786a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26365t1) && this.f104786a == ((C26365t1) obj).f104786a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104786a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104786a, "SdpVersion(value=", ")");
    }
}
