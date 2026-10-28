package z30;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C40038a {

    /* JADX INFO: renamed from: a */
    public String f172751a;

    /* JADX INFO: renamed from: b */
    public final String f172752b;

    /* JADX INFO: renamed from: c */
    public final String f172753c;

    /* JADX INFO: renamed from: d */
    public String f172754d;

    /* JADX INFO: renamed from: e */
    public String f172755e;

    /* JADX INFO: renamed from: f */
    public final String f172756f;

    /* JADX INFO: renamed from: g */
    public final String f172757g;

    public C40038a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f172751a = str;
        this.f172752b = str2;
        this.f172753c = str3;
        this.f172754d = str4;
        this.f172755e = str5;
        this.f172756f = str6;
        this.f172757g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40038a)) {
            return false;
        }
        C40038a c40038a = (C40038a) obj;
        return AbstractC22676k.m65745e(this.f172751a, c40038a.f172751a) && AbstractC22676k.m65745e(this.f172752b, c40038a.f172752b) && AbstractC22676k.m65745e(this.f172753c, c40038a.f172753c) && AbstractC22676k.m65745e(this.f172754d, c40038a.f172754d) && AbstractC22676k.m65745e(this.f172755e, c40038a.f172755e) && AbstractC22676k.m65745e(this.f172756f, c40038a.f172756f) && AbstractC22676k.m65745e(this.f172757g, c40038a.f172757g);
    }

    public final int hashCode() {
        String str = this.f172751a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f172752b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f172753c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f172754d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f172755e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f172756f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f172757g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f172751a;
        String str2 = this.f172754d;
        String str3 = this.f172755e;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Address(locality=", str, ", country=", this.f172752b, ", addressLine1=");
        AbstractC11266d.m30444B(sbM32001t, this.f172753c, ", addressLine2=", str2, ", administrativeArea=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", dependentLocality=", this.f172756f, ", postalCode=");
        return AbstractC25012a.m73376i(this.f172757g, ")", sbM32001t);
    }
}
