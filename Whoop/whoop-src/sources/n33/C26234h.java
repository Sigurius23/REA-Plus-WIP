package n33;

import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C26234h {

    /* JADX INFO: renamed from: a */
    public final String f104174a;

    /* JADX INFO: renamed from: b */
    public final String f104175b;

    /* JADX INFO: renamed from: c */
    public final Double f104176c;

    /* JADX INFO: renamed from: d */
    public final String f104177d;

    /* JADX INFO: renamed from: e */
    public final Boolean f104178e;

    /* JADX INFO: renamed from: f */
    public final String f104179f;

    /* JADX INFO: renamed from: g */
    public final String f104180g;

    /* JADX INFO: renamed from: h */
    public final Boolean f104181h;

    /* JADX INFO: renamed from: i */
    public final Boolean f104182i;

    /* JADX INFO: renamed from: j */
    public final String f104183j;

    /* JADX INFO: renamed from: k */
    public final Double f104184k;

    /* JADX INFO: renamed from: l */
    public final Double f104185l;

    /* JADX INFO: renamed from: m */
    public final Double f104186m;

    public C26234h(String str, String str2, Double d3, String str3, Boolean bool, String str4, String str5, Boolean bool2, Boolean bool3, String str6, Double d14, Double d15, Double d16) {
        this.f104174a = str;
        this.f104175b = str2;
        this.f104176c = d3;
        this.f104177d = str3;
        this.f104178e = bool;
        this.f104179f = str4;
        this.f104180g = str5;
        this.f104181h = bool2;
        this.f104182i = bool3;
        this.f104183j = str6;
        this.f104184k = d14;
        this.f104185l = d15;
        this.f104186m = d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26234h)) {
            return false;
        }
        C26234h c26234h = (C26234h) obj;
        return AbstractC22676k.m65745e(this.f104174a, c26234h.f104174a) && AbstractC22676k.m65745e(this.f104175b, c26234h.f104175b) && AbstractC22676k.m65745e(this.f104176c, c26234h.f104176c) && AbstractC22676k.m65745e(this.f104177d, c26234h.f104177d) && AbstractC22676k.m65745e(this.f104178e, c26234h.f104178e) && AbstractC22676k.m65745e(this.f104179f, c26234h.f104179f) && AbstractC22676k.m65745e(this.f104180g, c26234h.f104180g) && AbstractC22676k.m65745e(this.f104181h, c26234h.f104181h) && AbstractC22676k.m65745e(this.f104182i, c26234h.f104182i) && AbstractC22676k.m65745e(this.f104183j, c26234h.f104183j) && AbstractC22676k.m65745e(this.f104184k, c26234h.f104184k) && AbstractC22676k.m65745e(this.f104185l, c26234h.f104185l) && AbstractC22676k.m65745e(this.f104186m, c26234h.f104186m);
    }

    public final int hashCode() {
        String str = this.f104174a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104175b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104176c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.f104177d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f104178e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f104179f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104180g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f104181h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f104182i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.f104183j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.f104184k;
        int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f104185l;
        int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f104186m;
        return iHashCode12 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcMediaStreamAudioTrackSenderStats(id=", this.f104174a, ", type=", this.f104175b, ", timestampUs=");
        sbM32001t.append(this.f104176c);
        sbM32001t.append(", trackIdentifier=");
        sbM32001t.append(this.f104177d);
        sbM32001t.append(", ended=");
        AbstractC13673n.m38576w(this.f104178e, ", kind=", this.f104179f, ", priority=", sbM32001t);
        AbstractC36095b.m114692t(this.f104181h, this.f104180g, ", remoteSource=", ", detached=", sbM32001t);
        AbstractC13673n.m38576w(this.f104182i, ", mediaSourceId=", this.f104183j, ", audioLevel=", sbM32001t);
        AbstractC21702c.m61146q(sbM32001t, this.f104184k, ", totalAudioEnergy=", this.f104185l, ", totalSamplesDuration=");
        sbM32001t.append(this.f104186m);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
