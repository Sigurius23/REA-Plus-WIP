package n53;

import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.b1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26310b1 {

    /* JADX INFO: renamed from: a */
    public final long f104547a;

    /* JADX INFO: renamed from: b */
    public final String f104548b;

    /* JADX INFO: renamed from: c */
    public final Long f104549c;

    /* JADX INFO: renamed from: d */
    public final String f104550d;

    public C26310b1(long j7, String str, Long l7, String str2) {
        this.f104547a = j7;
        this.f104548b = str;
        this.f104549c = l7;
        this.f104550d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26310b1)) {
            return false;
        }
        C26310b1 c26310b1 = (C26310b1) obj;
        return this.f104547a == c26310b1.f104547a && AbstractC22676k.m65745e(this.f104548b, c26310b1.f104548b) && AbstractC22676k.m65745e(this.f104549c, c26310b1.f104549c) && AbstractC22676k.m65745e(this.f104550d, c26310b1.f104550d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f104547a) * 31;
        String str = this.f104548b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.f104549c;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f104550d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpRtcp(port=", ", netType=", this.f104547a, this.f104548b);
        sbM114685m.append(", ipVer=");
        sbM114685m.append(this.f104549c);
        sbM114685m.append(", address=");
        sbM114685m.append(this.f104550d);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
