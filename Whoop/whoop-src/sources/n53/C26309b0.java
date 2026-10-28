package n53;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: n53.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26309b0 {

    /* JADX INFO: renamed from: a */
    public final long f104546a;

    public C26309b0(long j7) {
        this.f104546a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26309b0) && this.f104546a == ((C26309b0) obj).f104546a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f104546a);
    }

    public final String toString() {
        return AbstractC31061c.m95636l(this.f104546a, "SdpFramerate(value=", ")");
    }
}
