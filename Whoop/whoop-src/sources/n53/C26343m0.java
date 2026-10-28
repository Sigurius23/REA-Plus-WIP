package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26343m0 {

    /* JADX INFO: renamed from: a */
    public final long f104673a;

    public C26343m0(long j7) {
        this.f104673a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26343m0) && this.f104673a == ((C26343m0) obj).f104673a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104673a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104673a, "SdpMaxmessagesize(value=", ")");
    }
}
