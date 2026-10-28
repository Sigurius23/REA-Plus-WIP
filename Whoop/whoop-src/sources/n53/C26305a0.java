package n53;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26305a0 {

    /* JADX INFO: renamed from: a */
    public final long f104538a;

    /* JADX INFO: renamed from: b */
    public final String f104539b;

    public C26305a0(long j7, String config) {
        AbstractC22676k.m65750j(config, "config");
        this.f104538a = j7;
        this.f104539b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26305a0)) {
            return false;
        }
        C26305a0 c26305a0 = (C26305a0) obj;
        return this.f104538a == c26305a0.f104538a && AbstractC22676k.m65745e(this.f104539b, c26305a0.f104539b);
    }

    public final int hashCode() {
        return this.f104539b.hashCode() + (Long.hashCode(this.f104538a) * 31);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpFmtp(payload=", ", config=", this.f104538a, this.f104539b);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
