package n33;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C26228b {

    /* JADX INFO: renamed from: a */
    public final String f104004a;

    /* JADX INFO: renamed from: b */
    public final String f104005b;

    /* JADX INFO: renamed from: c */
    public final Double f104006c;

    /* JADX INFO: renamed from: d */
    public final String f104007d;

    /* JADX INFO: renamed from: e */
    public final Long f104008e;

    /* JADX INFO: renamed from: f */
    public final String f104009f;

    /* JADX INFO: renamed from: g */
    public final String f104010g;

    /* JADX INFO: renamed from: h */
    public final Long f104011h;

    public C26228b(String str, String str2, Double d3, String str3, Long l7, String str4, String str5, Long l12) {
        this.f104004a = str;
        this.f104005b = str2;
        this.f104006c = d3;
        this.f104007d = str3;
        this.f104008e = l7;
        this.f104009f = str4;
        this.f104010g = str5;
        this.f104011h = l12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26228b)) {
            return false;
        }
        C26228b c26228b = (C26228b) obj;
        return AbstractC22676k.m65745e(this.f104004a, c26228b.f104004a) && AbstractC22676k.m65745e(this.f104005b, c26228b.f104005b) && AbstractC22676k.m65745e(this.f104006c, c26228b.f104006c) && AbstractC22676k.m65745e(this.f104007d, c26228b.f104007d) && AbstractC22676k.m65745e(this.f104008e, c26228b.f104008e) && AbstractC22676k.m65745e(this.f104009f, c26228b.f104009f) && AbstractC22676k.m65745e(this.f104010g, c26228b.f104010g) && AbstractC22676k.m65745e(this.f104011h, c26228b.f104011h);
    }

    public final int hashCode() {
        String str = this.f104004a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f104005b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d3 = this.f104006c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str3 = this.f104007d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l7 = this.f104008e;
        int iHashCode5 = (iHashCode4 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str4 = this.f104009f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f104010g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l12 = this.f104011h;
        return iHashCode7 + (l12 != null ? l12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("RtcCodecStats(id=", this.f104004a, ", type=", this.f104005b, ", timestampUs=");
        sbM32001t.append(this.f104006c);
        sbM32001t.append(", sdpFmtpLine=");
        sbM32001t.append(this.f104007d);
        sbM32001t.append(", payloadType=");
        sbM32001t.append(this.f104008e);
        sbM32001t.append(", transportId=");
        sbM32001t.append(this.f104009f);
        sbM32001t.append(", mimeType=");
        sbM32001t.append(this.f104010g);
        sbM32001t.append(", clockRate=");
        sbM32001t.append(this.f104011h);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
