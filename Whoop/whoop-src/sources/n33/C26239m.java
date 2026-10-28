package n33;

import d13.AbstractC11478a;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C26239m {

    /* JADX INFO: renamed from: a */
    public final String f104288a;

    /* JADX INFO: renamed from: b */
    public final String f104289b;

    /* JADX INFO: renamed from: c */
    public final Double f104290c;

    /* JADX INFO: renamed from: d */
    public final Long f104291d;

    /* JADX INFO: renamed from: e */
    public final String f104292e;

    /* JADX INFO: renamed from: f */
    public final String f104293f;

    /* JADX INFO: renamed from: g */
    public final String f104294g;

    /* JADX INFO: renamed from: h */
    public final Long f104295h;

    /* JADX INFO: renamed from: i */
    public final Integer f104296i;

    /* JADX INFO: renamed from: j */
    public final Double f104297j;

    /* JADX INFO: renamed from: k */
    public final String f104298k;

    /* JADX INFO: renamed from: l */
    public final Double f104299l;

    /* JADX INFO: renamed from: m */
    public final Double f104300m;

    /* JADX INFO: renamed from: n */
    public final Double f104301n;

    /* JADX INFO: renamed from: o */
    public final Integer f104302o;

    public C26239m(String str, String str2, Double d3, Long l7, String str3, String str4, String str5, Long l12, Integer num, Double d14, String str6, Double d15, Double d16, Double d17, Integer num2) {
        this.f104288a = str;
        this.f104289b = str2;
        this.f104290c = d3;
        this.f104291d = l7;
        this.f104292e = str3;
        this.f104293f = str4;
        this.f104294g = str5;
        this.f104295h = l12;
        this.f104296i = num;
        this.f104297j = d14;
        this.f104298k = str6;
        this.f104299l = d15;
        this.f104300m = d16;
        this.f104301n = d17;
        this.f104302o = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26239m)) {
            return false;
        }
        C26239m c26239m = (C26239m) obj;
        return AbstractC22676k.m65745e(this.f104288a, c26239m.f104288a) && AbstractC22676k.m65745e(this.f104289b, c26239m.f104289b) && AbstractC22676k.m65745e(this.f104290c, c26239m.f104290c) && AbstractC22676k.m65745e(this.f104291d, c26239m.f104291d) && AbstractC22676k.m65745e(this.f104292e, c26239m.f104292e) && AbstractC22676k.m65745e(this.f104293f, c26239m.f104293f) && AbstractC22676k.m65745e(this.f104294g, c26239m.f104294g) && AbstractC22676k.m65745e(this.f104295h, c26239m.f104295h) && AbstractC22676k.m65745e(this.f104296i, c26239m.f104296i) && AbstractC22676k.m65745e(this.f104297j, c26239m.f104297j) && AbstractC22676k.m65745e(this.f104298k, c26239m.f104298k) && AbstractC22676k.m65745e(this.f104299l, c26239m.f104299l) && AbstractC22676k.m65745e(this.f104300m, c26239m.f104300m) && AbstractC22676k.m65745e(this.f104301n, c26239m.f104301n) && AbstractC22676k.m65745e(this.f104302o, c26239m.f104302o);
    }

    public final int hashCode() {
        String str = this.f104288a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104289b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104290c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.f104291d;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.f104292e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f104293f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104294g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l12 = this.f104295h;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f104296i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.f104297j;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str6 = this.f104298k;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d15 = this.f104299l;
        int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f104300m;
        int iHashCode13 = (iHashCode12 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f104301n;
        int iHashCode14 = (iHashCode13 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Integer num2 = this.f104302o;
        return iHashCode14 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcRemoteInboundRtpAudioStreamStats(id=", this.f104288a, ", type=", this.f104289b, ", timestampUs=");
        sbM32001t.append(this.f104290c);
        sbM32001t.append(", ssrc=");
        sbM32001t.append(this.f104291d);
        sbM32001t.append(", kind=");
        AbstractC11266d.m30444B(sbM32001t, this.f104292e, ", transportId=", this.f104293f, ", codecId=");
        sbM32001t.append(this.f104294g);
        sbM32001t.append(", packetsReceived=");
        sbM32001t.append(this.f104295h);
        sbM32001t.append(", packetsLost=");
        sbM32001t.append(this.f104296i);
        sbM32001t.append(", jitter=");
        sbM32001t.append(this.f104297j);
        sbM32001t.append(", localId=");
        sbM32001t.append(this.f104298k);
        sbM32001t.append(", roundTripTime=");
        sbM32001t.append(this.f104299l);
        sbM32001t.append(", totalRoundTripTime=");
        AbstractC21702c.m61146q(sbM32001t, this.f104300m, ", fractionLost=", this.f104301n, ", roundTripTimeMeasurements=");
        return AbstractC11478a.m30859k(sbM32001t, this.f104302o, ")");
    }
}
