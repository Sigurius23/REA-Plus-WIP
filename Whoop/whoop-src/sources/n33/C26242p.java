package n33;

import java.math.BigInteger;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C26242p {

    /* JADX INFO: renamed from: a */
    public final String f104333a;

    /* JADX INFO: renamed from: b */
    public final String f104334b;

    /* JADX INFO: renamed from: c */
    public final Double f104335c;

    /* JADX INFO: renamed from: d */
    public final Long f104336d;

    /* JADX INFO: renamed from: e */
    public final String f104337e;

    /* JADX INFO: renamed from: f */
    public final String f104338f;

    /* JADX INFO: renamed from: g */
    public final String f104339g;

    /* JADX INFO: renamed from: h */
    public final BigInteger f104340h;

    /* JADX INFO: renamed from: i */
    public final BigInteger f104341i;

    /* JADX INFO: renamed from: j */
    public final String f104342j;

    /* JADX INFO: renamed from: k */
    public final Double f104343k;

    /* JADX INFO: renamed from: l */
    public final BigInteger f104344l;

    /* JADX INFO: renamed from: m */
    public final Double f104345m;

    /* JADX INFO: renamed from: n */
    public final Double f104346n;

    /* JADX INFO: renamed from: o */
    public final BigInteger f104347o;

    public C26242p(String str, String str2, Double d3, Long l7, String str3, String str4, String str5, BigInteger bigInteger, BigInteger bigInteger2, String str6, Double d14, BigInteger bigInteger3, Double d15, Double d16, BigInteger bigInteger4) {
        this.f104333a = str;
        this.f104334b = str2;
        this.f104335c = d3;
        this.f104336d = l7;
        this.f104337e = str3;
        this.f104338f = str4;
        this.f104339g = str5;
        this.f104340h = bigInteger;
        this.f104341i = bigInteger2;
        this.f104342j = str6;
        this.f104343k = d14;
        this.f104344l = bigInteger3;
        this.f104345m = d15;
        this.f104346n = d16;
        this.f104347o = bigInteger4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26242p)) {
            return false;
        }
        C26242p c26242p = (C26242p) obj;
        return AbstractC22676k.m65745e(this.f104333a, c26242p.f104333a) && AbstractC22676k.m65745e(this.f104334b, c26242p.f104334b) && AbstractC22676k.m65745e(this.f104335c, c26242p.f104335c) && AbstractC22676k.m65745e(this.f104336d, c26242p.f104336d) && AbstractC22676k.m65745e(this.f104337e, c26242p.f104337e) && AbstractC22676k.m65745e(this.f104338f, c26242p.f104338f) && AbstractC22676k.m65745e(this.f104339g, c26242p.f104339g) && AbstractC22676k.m65745e(this.f104340h, c26242p.f104340h) && AbstractC22676k.m65745e(this.f104341i, c26242p.f104341i) && AbstractC22676k.m65745e(this.f104342j, c26242p.f104342j) && AbstractC22676k.m65745e(this.f104343k, c26242p.f104343k) && AbstractC22676k.m65745e(this.f104344l, c26242p.f104344l) && AbstractC22676k.m65745e(this.f104345m, c26242p.f104345m) && AbstractC22676k.m65745e(this.f104346n, c26242p.f104346n) && AbstractC22676k.m65745e(this.f104347o, c26242p.f104347o);
    }

    public final int hashCode() {
        String str = this.f104333a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104334b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104335c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.f104336d;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.f104337e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f104338f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104339g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigInteger bigInteger = this.f104340h;
        int iHashCode8 = (iHashCode7 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        BigInteger bigInteger2 = this.f104341i;
        int iHashCode9 = (iHashCode8 + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        String str6 = this.f104342j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.f104343k;
        int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
        BigInteger bigInteger3 = this.f104344l;
        int iHashCode12 = (iHashCode11 + (bigInteger3 == null ? 0 : bigInteger3.hashCode())) * 31;
        Double d15 = this.f104345m;
        int iHashCode13 = (iHashCode12 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f104346n;
        int iHashCode14 = (iHashCode13 + (d16 == null ? 0 : d16.hashCode())) * 31;
        BigInteger bigInteger4 = this.f104347o;
        return iHashCode14 + (bigInteger4 != null ? bigInteger4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcRemoteOutboundRtpVideoStreamStats(id=", this.f104333a, ", type=", this.f104334b, ", timestampUs=");
        sbM32001t.append(this.f104335c);
        sbM32001t.append(", ssrc=");
        sbM32001t.append(this.f104336d);
        sbM32001t.append(", kind=");
        AbstractC11266d.m30444B(sbM32001t, this.f104337e, ", transportId=", this.f104338f, ", codecId=");
        sbM32001t.append(this.f104339g);
        sbM32001t.append(", packetsSent=");
        sbM32001t.append(this.f104340h);
        sbM32001t.append(", bytesSent=");
        sbM32001t.append(this.f104341i);
        sbM32001t.append(", localId=");
        sbM32001t.append(this.f104342j);
        sbM32001t.append(", remoteTimestamp=");
        sbM32001t.append(this.f104343k);
        sbM32001t.append(", reportsSent=");
        sbM32001t.append(this.f104344l);
        sbM32001t.append(", roundTripTime=");
        AbstractC21702c.m61146q(sbM32001t, this.f104345m, ", totalRoundTripTime=", this.f104346n, ", roundTripTimeMeasurements=");
        sbM32001t.append(this.f104347o);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
