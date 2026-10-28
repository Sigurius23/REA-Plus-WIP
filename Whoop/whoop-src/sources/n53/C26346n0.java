package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26346n0 {

    /* JADX INFO: renamed from: a */
    public final long f104692a;

    public C26346n0(long j7) {
        this.f104692a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26346n0) && this.f104692a == ((C26346n0) obj).f104692a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104692a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104692a, "SdpMaxptime(value=", ")");
    }
}
