package n33;

import d13.AbstractC11478a;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C26240n {

    /* JADX INFO: renamed from: a */
    public final String f104303a;

    /* JADX INFO: renamed from: b */
    public final String f104304b;

    /* JADX INFO: renamed from: c */
    public final Double f104305c;

    /* JADX INFO: renamed from: d */
    public final Long f104306d;

    /* JADX INFO: renamed from: e */
    public final String f104307e;

    /* JADX INFO: renamed from: f */
    public final String f104308f;

    /* JADX INFO: renamed from: g */
    public final String f104309g;

    /* JADX INFO: renamed from: h */
    public final Long f104310h;

    /* JADX INFO: renamed from: i */
    public final Integer f104311i;

    /* JADX INFO: renamed from: j */
    public final Double f104312j;

    /* JADX INFO: renamed from: k */
    public final String f104313k;

    /* JADX INFO: renamed from: l */
    public final Double f104314l;

    /* JADX INFO: renamed from: m */
    public final Double f104315m;

    /* JADX INFO: renamed from: n */
    public final Double f104316n;

    /* JADX INFO: renamed from: o */
    public final Integer f104317o;

    public C26240n(String str, String str2, Double d3, Long l7, String str3, String str4, String str5, Long l12, Integer num, Double d14, String str6, Double d15, Double d16, Double d17, Integer num2) {
        this.f104303a = str;
        this.f104304b = str2;
        this.f104305c = d3;
        this.f104306d = l7;
        this.f104307e = str3;
        this.f104308f = str4;
        this.f104309g = str5;
        this.f104310h = l12;
        this.f104311i = num;
        this.f104312j = d14;
        this.f104313k = str6;
        this.f104314l = d15;
        this.f104315m = d16;
        this.f104316n = d17;
        this.f104317o = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26240n)) {
            return false;
        }
        C26240n c26240n = (C26240n) obj;
        return AbstractC22676k.m65745e(this.f104303a, c26240n.f104303a) && AbstractC22676k.m65745e(this.f104304b, c26240n.f104304b) && AbstractC22676k.m65745e(this.f104305c, c26240n.f104305c) && AbstractC22676k.m65745e(this.f104306d, c26240n.f104306d) && AbstractC22676k.m65745e(this.f104307e, c26240n.f104307e) && AbstractC22676k.m65745e(this.f104308f, c26240n.f104308f) && AbstractC22676k.m65745e(this.f104309g, c26240n.f104309g) && AbstractC22676k.m65745e(this.f104310h, c26240n.f104310h) && AbstractC22676k.m65745e(this.f104311i, c26240n.f104311i) && AbstractC22676k.m65745e(this.f104312j, c26240n.f104312j) && AbstractC22676k.m65745e(this.f104313k, c26240n.f104313k) && AbstractC22676k.m65745e(this.f104314l, c26240n.f104314l) && AbstractC22676k.m65745e(this.f104315m, c26240n.f104315m) && AbstractC22676k.m65745e(this.f104316n, c26240n.f104316n) && AbstractC22676k.m65745e(this.f104317o, c26240n.f104317o);
    }

    public final int hashCode() {
        String str = this.f104303a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104304b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104305c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.f104306d;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.f104307e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f104308f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104309g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l12 = this.f104310h;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f104311i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f104312j;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str6 = this.f104313k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d15 = this.f104314l;
        int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f104315m;
        int iHashCode13 = (iHashCode12 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f104316n;
        int iHashCode14 = (iHashCode13 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num2 = this.f104317o;
        return iHashCode14 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcRemoteInboundRtpVideoStreamStats(id=", this.f104303a, ", type=", this.f104304b, ", timestampUs=");
        sbM32001t.append(this.f104305c);
        sbM32001t.append(", ssrc=");
        sbM32001t.append(this.f104306d);
        sbM32001t.append(", kind=");
        AbstractC11266d.m30444B(sbM32001t, this.f104307e, ", transportId=", this.f104308f, ", codecId=");
        sbM32001t.append(this.f104309g);
        sbM32001t.append(", packetsReceived=");
        sbM32001t.append(this.f104310h);
        sbM32001t.append(", packetsLost=");
        sbM32001t.append(this.f104311i);
        sbM32001t.append(", jitter=");
        sbM32001t.append(this.f104312j);
        sbM32001t.append(", localId=");
        sbM32001t.append(this.f104313k);
        sbM32001t.append(", roundTripTime=");
        sbM32001t.append(this.f104314l);
        sbM32001t.append(", totalRoundTripTime=");
        AbstractC21702c.m61146q(sbM32001t, this.f104315m, ", fractionLost=", this.f104316n, ", roundTripTimeMeasurements=");
        return AbstractC11478a.m30859k(sbM32001t, this.f104317o, ")");
    }
}
