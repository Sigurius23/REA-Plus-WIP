package n33;

import java.math.BigInteger;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C26241o {

    /* JADX INFO: renamed from: a */
    public final String f104318a;

    /* JADX INFO: renamed from: b */
    public final String f104319b;

    /* JADX INFO: renamed from: c */
    public final Double f104320c;

    /* JADX INFO: renamed from: d */
    public final Long f104321d;

    /* JADX INFO: renamed from: e */
    public final String f104322e;

    /* JADX INFO: renamed from: f */
    public final String f104323f;

    /* JADX INFO: renamed from: g */
    public final String f104324g;

    /* JADX INFO: renamed from: h */
    public final BigInteger f104325h;

    /* JADX INFO: renamed from: i */
    public final BigInteger f104326i;

    /* JADX INFO: renamed from: j */
    public final String f104327j;

    /* JADX INFO: renamed from: k */
    public final Double f104328k;

    /* JADX INFO: renamed from: l */
    public final BigInteger f104329l;

    /* JADX INFO: renamed from: m */
    public final Double f104330m;

    /* JADX INFO: renamed from: n */
    public final Double f104331n;

    /* JADX INFO: renamed from: o */
    public final BigInteger f104332o;

    public C26241o(String str, String str2, Double d3, Long l7, String str3, String str4, String str5, BigInteger bigInteger, BigInteger bigInteger2, String str6, Double d14, BigInteger bigInteger3, Double d15, Double d16, BigInteger bigInteger4) {
        this.f104318a = str;
        this.f104319b = str2;
        this.f104320c = d3;
        this.f104321d = l7;
        this.f104322e = str3;
        this.f104323f = str4;
        this.f104324g = str5;
        this.f104325h = bigInteger;
        this.f104326i = bigInteger2;
        this.f104327j = str6;
        this.f104328k = d14;
        this.f104329l = bigInteger3;
        this.f104330m = d15;
        this.f104331n = d16;
        this.f104332o = bigInteger4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26241o)) {
            return false;
        }
        C26241o c26241o = (C26241o) obj;
        return AbstractC22676k.m65745e(this.f104318a, c26241o.f104318a) && AbstractC22676k.m65745e(this.f104319b, c26241o.f104319b) && AbstractC22676k.m65745e(this.f104320c, c26241o.f104320c) && AbstractC22676k.m65745e(this.f104321d, c26241o.f104321d) && AbstractC22676k.m65745e(this.f104322e, c26241o.f104322e) && AbstractC22676k.m65745e(this.f104323f, c26241o.f104323f) && AbstractC22676k.m65745e(this.f104324g, c26241o.f104324g) && AbstractC22676k.m65745e(this.f104325h, c26241o.f104325h) && AbstractC22676k.m65745e(this.f104326i, c26241o.f104326i) && AbstractC22676k.m65745e(this.f104327j, c26241o.f104327j) && AbstractC22676k.m65745e(this.f104328k, c26241o.f104328k) && AbstractC22676k.m65745e(this.f104329l, c26241o.f104329l) && AbstractC22676k.m65745e(this.f104330m, c26241o.f104330m) && AbstractC22676k.m65745e(this.f104331n, c26241o.f104331n) && AbstractC22676k.m65745e(this.f104332o, c26241o.f104332o);
    }

    public final int hashCode() {
        String str = this.f104318a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104319b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104320c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.f104321d;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.f104322e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f104323f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104324g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigInteger bigInteger = this.f104325h;
        int iHashCode8 = (iHashCode7 + (bigInteger == null ? 0 : bigInteger.hashCode())) * 31;
        BigInteger bigInteger2 = this.f104326i;
        int iHashCode9 = (iHashCode8 + (bigInteger2 == null ? 0 : bigInteger2.hashCode())) * 31;
        String str6 = this.f104327j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.f104328k;
        int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
        BigInteger bigInteger3 = this.f104329l;
        int iHashCode12 = (iHashCode11 + (bigInteger3 == null ? 0 : bigInteger3.hashCode())) * 31;
        Double d15 = this.f104330m;
        int iHashCode13 = (iHashCode12 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f104331n;
        int iHashCode14 = (iHashCode13 + (d16 == null ? 0 : d16.hashCode())) * 31;
        BigInteger bigInteger4 = this.f104332o;
        return iHashCode14 + (bigInteger4 != null ? bigInteger4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcRemoteOutboundRtpAudioStreamStats(id=", this.f104318a, ", type=", this.f104319b, ", timestampUs=");
        sbM32001t.append(this.f104320c);
        sbM32001t.append(", ssrc=");
        sbM32001t.append(this.f104321d);
        sbM32001t.append(", kind=");
        AbstractC11266d.m30444B(sbM32001t, this.f104322e, ", transportId=", this.f104323f, ", codecId=");
        sbM32001t.append(this.f104324g);
        sbM32001t.append(", packetsSent=");
        sbM32001t.append(this.f104325h);
        sbM32001t.append(", bytesSent=");
        sbM32001t.append(this.f104326i);
        sbM32001t.append(", localId=");
        sbM32001t.append(this.f104327j);
        sbM32001t.append(", remoteTimestamp=");
        sbM32001t.append(this.f104328k);
        sbM32001t.append(", reportsSent=");
        sbM32001t.append(this.f104329l);
        sbM32001t.append(", roundTripTime=");
        AbstractC21702c.m61146q(sbM32001t, this.f104330m, ", totalRoundTripTime=", this.f104331n, ", roundTripTimeMeasurements=");
        sbM32001t.append(this.f104332o);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
