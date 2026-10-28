package g32;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g32.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lg32/a;", "", "", "city", "country", "line1", "line2", "postalCode", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15301a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String city;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String country;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String line1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String line2;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String postalCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String state;

    public C15301a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15301a)) {
            return false;
        }
        C15301a c15301a = (C15301a) other;
        return AbstractC22676k.m65745e(this.city, c15301a.city) && AbstractC22676k.m65745e(this.country, c15301a.country) && AbstractC22676k.m65745e(this.line1, c15301a.line1) && AbstractC22676k.m65745e(this.line2, c15301a.line2) && AbstractC22676k.m65745e(this.postalCode, c15301a.postalCode) && AbstractC22676k.m65745e(this.state, c15301a.state);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.city;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line1;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.line2;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.city;
        String str2 = this.country;
        String str3 = this.line1;
        String str4 = this.line2;
        String str5 = this.postalCode;
        String str6 = this.state;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Address(city=", str, ", country=", str2, ", line1=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", line2=", str4, ", postalCode=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", state=", str6, ")");
    }
}
