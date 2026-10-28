package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26376x0 {

    /* JADX INFO: renamed from: a */
    public final long f104815a;

    public C26376x0(long j7) {
        this.f104815a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26376x0) && this.f104815a == ((C26376x0) obj).f104815a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104815a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104815a, "SdpPtime(value=", ")");
    }
}
