package n53;

import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C26345n {

    /* JADX INFO: renamed from: a */
    public final String f104679a;

    /* JADX INFO: renamed from: b */
    public final long f104680b;

    /* JADX INFO: renamed from: c */
    public final String f104681c;

    /* JADX INFO: renamed from: d */
    public final long f104682d;

    /* JADX INFO: renamed from: e */
    public final String f104683e;

    /* JADX INFO: renamed from: f */
    public final long f104684f;

    /* JADX INFO: renamed from: g */
    public final String f104685g;

    /* JADX INFO: renamed from: h */
    public final String f104686h;

    /* JADX INFO: renamed from: i */
    public final Long f104687i;

    /* JADX INFO: renamed from: j */
    public final String f104688j;

    /* JADX INFO: renamed from: k */
    public final Long f104689k;

    /* JADX INFO: renamed from: l */
    public final Long f104690l;

    /* JADX INFO: renamed from: m */
    public final Long f104691m;

    public C26345n(String foundation, long j7, String transport, long j13, String ip3, long j14, String type, String str, Long l7, String str2, Long l12, Long l13, Long l14) {
        AbstractC22676k.m65750j(foundation, "foundation");
        AbstractC22676k.m65750j(transport, "transport");
        AbstractC22676k.m65750j(ip3, "ip");
        AbstractC22676k.m65750j(type, "type");
        this.f104679a = foundation;
        this.f104680b = j7;
        this.f104681c = transport;
        this.f104682d = j13;
        this.f104683e = ip3;
        this.f104684f = j14;
        this.f104685g = type;
        this.f104686h = str;
        this.f104687i = l7;
        this.f104688j = str2;
        this.f104689k = l12;
        this.f104690l = l13;
        this.f104691m = l14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26345n)) {
            return false;
        }
        C26345n c26345n = (C26345n) obj;
        return AbstractC22676k.m65745e(this.f104679a, c26345n.f104679a) && this.f104680b == c26345n.f104680b && AbstractC22676k.m65745e(this.f104681c, c26345n.f104681c) && this.f104682d == c26345n.f104682d && AbstractC22676k.m65745e(this.f104683e, c26345n.f104683e) && this.f104684f == c26345n.f104684f && AbstractC22676k.m65745e(this.f104685g, c26345n.f104685g) && AbstractC22676k.m65745e(this.f104686h, c26345n.f104686h) && AbstractC22676k.m65745e(this.f104687i, c26345n.f104687i) && AbstractC22676k.m65745e(this.f104688j, c26345n.f104688j) && AbstractC22676k.m65745e(this.f104689k, c26345n.f104689k) && AbstractC22676k.m65745e(this.f104690l, c26345n.f104690l) && AbstractC22676k.m65745e(this.f104691m, c26345n.f104691m);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30451e(AbstractC11266d.m30450d(AbstractC11266d.m30451e(this.f104679a.hashCode() * 31, this.f104680b, 31), 31, this.f104681c), this.f104682d, 31), 31, this.f104683e), this.f104684f, 31), 31, this.f104685g);
        String str = this.f104686h;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.f104687i;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f104688j;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f104689k;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f104690l;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.f104691m;
        return iHashCode5 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32000s = AbstractC11895b.m32000s("SdpCandidates(foundation=", this.f104679a, this.f104680b, ", component=");
        sbM32000s.append(", transport=");
        sbM32000s.append(this.f104681c);
        sbM32000s.append(", priority=");
        sbM32000s.append(this.f104682d);
        sbM32000s.append(", ip=");
        sbM32000s.append(this.f104683e);
        AbstractC2875y.m8285A(sbM32000s, ", port=", this.f104684f, ", type=");
        AbstractC11266d.m30444B(sbM32000s, this.f104685g, ", raddr=", this.f104686h, ", rport=");
        sbM32000s.append(this.f104687i);
        sbM32000s.append(", tcptype=");
        sbM32000s.append(this.f104688j);
        sbM32000s.append(", generation=");
        AbstractC21702c.m61147r(sbM32000s, this.f104689k, ", networkId=", this.f104690l, ", networkCost=");
        sbM32000s.append(this.f104691m);
        sbM32000s.append(")");
        return sbM32000s.toString();
    }
}
