package n33;

import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C26227a {

    /* JADX INFO: renamed from: a */
    public final String f103990a;

    /* JADX INFO: renamed from: b */
    public final String f103991b;

    /* JADX INFO: renamed from: c */
    public final Double f103992c;

    /* JADX INFO: renamed from: d */
    public final String f103993d;

    /* JADX INFO: renamed from: e */
    public final String f103994e;

    /* JADX INFO: renamed from: f */
    public final Double f103995f;

    /* JADX INFO: renamed from: g */
    public final Double f103996g;

    /* JADX INFO: renamed from: h */
    public final Double f103997h;

    /* JADX INFO: renamed from: i */
    public final Double f103998i;

    /* JADX INFO: renamed from: j */
    public final Double f103999j;

    /* JADX INFO: renamed from: k */
    public final Double f104000k;

    /* JADX INFO: renamed from: l */
    public final Long f104001l;

    /* JADX INFO: renamed from: m */
    public final Double f104002m;

    /* JADX INFO: renamed from: n */
    public final Long f104003n;

    public C26227a(String str, String str2, Double d3, String str3, String str4, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Long l7, Double d24, Long l12) {
        this.f103990a = str;
        this.f103991b = str2;
        this.f103992c = d3;
        this.f103993d = str3;
        this.f103994e = str4;
        this.f103995f = d14;
        this.f103996g = d15;
        this.f103997h = d16;
        this.f103998i = d17;
        this.f103999j = d18;
        this.f104000k = d19;
        this.f104001l = l7;
        this.f104002m = d24;
        this.f104003n = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26227a)) {
            return false;
        }
        C26227a c26227a = (C26227a) obj;
        return AbstractC22676k.m65745e(this.f103990a, c26227a.f103990a) && AbstractC22676k.m65745e(this.f103991b, c26227a.f103991b) && AbstractC22676k.m65745e(this.f103992c, c26227a.f103992c) && AbstractC22676k.m65745e(this.f103993d, c26227a.f103993d) && AbstractC22676k.m65745e(this.f103994e, c26227a.f103994e) && AbstractC22676k.m65745e(this.f103995f, c26227a.f103995f) && AbstractC22676k.m65745e(this.f103996g, c26227a.f103996g) && AbstractC22676k.m65745e(this.f103997h, c26227a.f103997h) && AbstractC22676k.m65745e(this.f103998i, c26227a.f103998i) && AbstractC22676k.m65745e(this.f103999j, c26227a.f103999j) && AbstractC22676k.m65745e(this.f104000k, c26227a.f104000k) && AbstractC22676k.m65745e(this.f104001l, c26227a.f104001l) && AbstractC22676k.m65745e(this.f104002m, c26227a.f104002m) && AbstractC22676k.m65745e(this.f104003n, c26227a.f104003n);
    }

    public final int hashCode() {
        String str = this.f103990a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f103991b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f103992c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.f103993d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f103994e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d14 = this.f103995f;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f103996g;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f103997h;
        int iHashCode8 = (iHashCode7 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f103998i;
        int iHashCode9 = (iHashCode8 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f103999j;
        int iHashCode10 = (iHashCode9 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f104000k;
        int iHashCode11 = (iHashCode10 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Long l7 = this.f104001l;
        int iHashCode12 = (iHashCode11 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Double d24 = this.f104002m;
        int iHashCode13 = (iHashCode12 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Long l12 = this.f104003n;
        return iHashCode13 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcAudioSourceStats(id=", this.f103990a, ", type=", this.f103991b, ", timestampUs=");
        sbM32001t.append(this.f103992c);
        sbM32001t.append(", kind=");
        sbM32001t.append(this.f103993d);
        sbM32001t.append(", trackIdentifier=");
        sbM32001t.append(this.f103994e);
        sbM32001t.append(", audioLevel=");
        sbM32001t.append(this.f103995f);
        sbM32001t.append(", totalAudioEnergy=");
        AbstractC21702c.m61146q(sbM32001t, this.f103996g, ", totalSamplesDuration=", this.f103997h, ", echoReturnLoss=");
        AbstractC21702c.m61146q(sbM32001t, this.f103998i, ", echoReturnLossEnhancement=", this.f103999j, ", droppedSamplesDuration=");
        sbM32001t.append(this.f104000k);
        sbM32001t.append(", droppedSamplesEvents=");
        sbM32001t.append(this.f104001l);
        sbM32001t.append(", totalCaptureDelay=");
        sbM32001t.append(this.f104002m);
        sbM32001t.append(", totalSamplesCaptured=");
        sbM32001t.append(this.f104003n);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
