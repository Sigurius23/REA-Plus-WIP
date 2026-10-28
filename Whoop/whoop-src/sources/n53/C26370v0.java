package n53;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26370v0 {

    /* JADX INFO: renamed from: a */
    public final String f104791a;

    /* JADX INFO: renamed from: b */
    public final long f104792b;

    /* JADX INFO: renamed from: c */
    public final long f104793c;

    /* JADX INFO: renamed from: d */
    public final String f104794d;

    /* JADX INFO: renamed from: e */
    public final long f104795e;

    /* JADX INFO: renamed from: f */
    public final String f104796f;

    public C26370v0(String username, long j7, long j13, String netType, long j14, String address) {
        AbstractC22676k.m65750j(username, "username");
        AbstractC22676k.m65750j(netType, "netType");
        AbstractC22676k.m65750j(address, "address");
        this.f104791a = username;
        this.f104792b = j7;
        this.f104793c = j13;
        this.f104794d = netType;
        this.f104795e = j14;
        this.f104796f = address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26370v0)) {
            return false;
        }
        C26370v0 c26370v0 = (C26370v0) obj;
        return AbstractC22676k.m65745e(this.f104791a, c26370v0.f104791a) && this.f104792b == c26370v0.f104792b && this.f104793c == c26370v0.f104793c && AbstractC22676k.m65745e(this.f104794d, c26370v0.f104794d) && this.f104795e == c26370v0.f104795e && AbstractC22676k.m65745e(this.f104796f, c26370v0.f104796f);
    }

    public final int hashCode() {
        return this.f104796f.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30451e(AbstractC11266d.m30451e(this.f104791a.hashCode() * 31, this.f104792b, 31), this.f104793c, 31), 31, this.f104794d), this.f104795e, 31);
    }

    public final String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("SdpOrigin(username=", this.f104791a, this.f104792b, ", sessionId=");
        AbstractC2875y.m8285A(sbM32000s, ", sessionVersion=", this.f104793c, ", netType=");
        sbM32000s.append(this.f104794d);
        sbM32000s.append(", ipVer=");
        sbM32000s.append(this.f104795e);
        return AbstractC2875y.m8304q(sbM32000s, ", address=", this.f104796f, ")");
    }
}
