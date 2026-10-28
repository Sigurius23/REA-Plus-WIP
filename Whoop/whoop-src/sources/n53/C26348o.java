package n53;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C26348o {

    /* JADX INFO: renamed from: a */
    public final long f104695a;

    /* JADX INFO: renamed from: b */
    public final String f104696b;

    public C26348o(long j7, String ip3) {
        AbstractC22676k.m65750j(ip3, "ip");
        this.f104695a = j7;
        this.f104696b = ip3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26348o)) {
            return false;
        }
        C26348o c26348o = (C26348o) obj;
        return this.f104695a == c26348o.f104695a && AbstractC22676k.m65745e(this.f104696b, c26348o.f104696b);
    }

    public final int hashCode() {
        return this.f104696b.hashCode() + (Long.hashCode(this.f104695a) * 31);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpConnection(version=", ", ip=", this.f104695a, this.f104696b);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
