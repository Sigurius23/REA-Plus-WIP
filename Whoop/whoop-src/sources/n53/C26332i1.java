package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.i1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26332i1 {

    /* JADX INFO: renamed from: a */
    public final long f104661a;

    public C26332i1(long j7) {
        this.f104661a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26332i1) && this.f104661a == ((C26332i1) obj).f104661a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104661a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104661a, "SdpSctpport(value=", ")");
    }
}
