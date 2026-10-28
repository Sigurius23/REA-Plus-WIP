package t23;

import jh3.AbstractC21702c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t23.y1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33481y1 {

    /* JADX INFO: renamed from: a */
    public final String f139786a;

    /* JADX INFO: renamed from: b */
    public final Double f139787b;

    /* JADX INFO: renamed from: c */
    public final Long f139788c;

    /* JADX INFO: renamed from: d */
    public final Long f139789d;

    /* JADX INFO: renamed from: e */
    public final Double f139790e;

    /* JADX INFO: renamed from: f */
    public final Double f139791f;

    public C33481y1(String str, Double d3, Long l7, Long l12, Double d14, Double d15) {
        this.f139786a = str;
        this.f139787b = d3;
        this.f139788c = l7;
        this.f139789d = l12;
        this.f139790e = d14;
        this.f139791f = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33481y1)) {
            return false;
        }
        C33481y1 c33481y1 = (C33481y1) obj;
        return AbstractC22676k.m65745e(this.f139786a, c33481y1.f139786a) && AbstractC22676k.m65745e(this.f139787b, c33481y1.f139787b) && AbstractC22676k.m65745e(this.f139788c, c33481y1.f139788c) && AbstractC22676k.m65745e(this.f139789d, c33481y1.f139789d) && AbstractC22676k.m65745e(this.f139790e, c33481y1.f139790e) && AbstractC22676k.m65745e(this.f139791f, c33481y1.f139791f);
    }

    public final int hashCode() {
        String str = this.f139786a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d3 = this.f139787b;
        int iHashCode2 = (iHashCode + (d3 == null ? 0 : d3.hashCode())) * 31;
        Long l7 = this.f139788c;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.f139789d;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Double d14 = this.f139790e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f139791f;
        return iHashCode5 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MediaStatsInfo(qualityLimit=");
        sb4.append(this.f139786a);
        sb4.append(", jitter=");
        sb4.append(this.f139787b);
        sb4.append(", width=");
        AbstractC21702c.m61147r(sb4, this.f139788c, ", height=", this.f139789d, ", fps=");
        sb4.append(this.f139790e);
        sb4.append(", deviceLatency=");
        sb4.append(this.f139791f);
        sb4.append(")");
        return sb4.toString();
    }
}
