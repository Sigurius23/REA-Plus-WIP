package n33;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C26244r {

    /* JADX INFO: renamed from: a */
    public final String f104350a;

    /* JADX INFO: renamed from: b */
    public final String f104351b;

    /* JADX INFO: renamed from: c */
    public final Double f104352c;

    /* JADX INFO: renamed from: d */
    public final String f104353d;

    /* JADX INFO: renamed from: e */
    public final String f104354e;

    /* JADX INFO: renamed from: f */
    public final Long f104355f;

    /* JADX INFO: renamed from: g */
    public final Long f104356g;

    /* JADX INFO: renamed from: h */
    public final Double f104357h;

    /* JADX INFO: renamed from: i */
    public final Long f104358i;

    public C26244r(String str, String str2, Double d3, String str3, String str4, Long l7, Long l12, Double d14, Long l13) {
        this.f104350a = str;
        this.f104351b = str2;
        this.f104352c = d3;
        this.f104353d = str3;
        this.f104354e = str4;
        this.f104355f = l7;
        this.f104356g = l12;
        this.f104357h = d14;
        this.f104358i = l13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26244r)) {
            return false;
        }
        C26244r c26244r = (C26244r) obj;
        return AbstractC22676k.m65745e(this.f104350a, c26244r.f104350a) && AbstractC22676k.m65745e(this.f104351b, c26244r.f104351b) && AbstractC22676k.m65745e(this.f104352c, c26244r.f104352c) && AbstractC22676k.m65745e(this.f104353d, c26244r.f104353d) && AbstractC22676k.m65745e(this.f104354e, c26244r.f104354e) && AbstractC22676k.m65745e(this.f104355f, c26244r.f104355f) && AbstractC22676k.m65745e(this.f104356g, c26244r.f104356g) && AbstractC22676k.m65745e(this.f104357h, c26244r.f104357h) && AbstractC22676k.m65745e(this.f104358i, c26244r.f104358i);
    }

    public final int hashCode() {
        String str = this.f104350a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104351b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104352c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.f104353d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f104354e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l7 = this.f104355f;
        int iHashCode6 = (iHashCode5 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.f104356g;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d14 = this.f104357h;
        int iHashCode8 = (iHashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l13 = this.f104358i;
        return iHashCode8 + (l13 != null ? l13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcVideoSourceStats(id=", this.f104350a, ", type=", this.f104351b, ", timestampUs=");
        sbM32001t.append(this.f104352c);
        sbM32001t.append(", kind=");
        sbM32001t.append(this.f104353d);
        sbM32001t.append(", trackIdentifier=");
        sbM32001t.append(this.f104354e);
        sbM32001t.append(", width=");
        sbM32001t.append(this.f104355f);
        sbM32001t.append(", height=");
        sbM32001t.append(this.f104356g);
        sbM32001t.append(", framesPerSecond=");
        sbM32001t.append(this.f104357h);
        sbM32001t.append(", frames=");
        sbM32001t.append(this.f104358i);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
