package y00;

import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: y00.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38893m0 {

    /* JADX INFO: renamed from: a */
    public final String f167428a;

    /* JADX INFO: renamed from: b */
    public final String f167429b;

    /* JADX INFO: renamed from: c */
    public final String f167430c;

    /* JADX INFO: renamed from: d */
    public final String f167431d;

    /* JADX INFO: renamed from: e */
    public final EnumC38922p2 f167432e;

    /* JADX INFO: renamed from: f */
    public final String f167433f;

    /* JADX INFO: renamed from: g */
    public final Integer f167434g;

    /* JADX INFO: renamed from: h */
    public final String f167435h;

    public C38893m0(String uniqueId, String str, String str2, String str3, EnumC38922p2 enumC38922p2, String str4, Integer num, String str5) {
        EnumC38862i8 enumC38862i8 = EnumC38862i8.Automatic;
        AbstractC22676k.m65750j(uniqueId, "uniqueId");
        this.f167428a = uniqueId;
        this.f167429b = str;
        this.f167430c = str2;
        this.f167431d = str3;
        this.f167432e = enumC38922p2;
        this.f167433f = str4;
        this.f167434g = num;
        this.f167435h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38893m0)) {
            return false;
        }
        C38893m0 c38893m0 = (C38893m0) obj;
        if (!AbstractC22676k.m65745e(this.f167428a, c38893m0.f167428a)) {
            return false;
        }
        EnumC38862i8 enumC38862i8 = EnumC38862i8.Automatic;
        return AbstractC22676k.m65745e(this.f167429b, c38893m0.f167429b) && AbstractC22676k.m65745e(this.f167430c, c38893m0.f167430c) && AbstractC22676k.m65745e(this.f167431d, c38893m0.f167431d) && this.f167432e == c38893m0.f167432e && AbstractC22676k.m65745e(this.f167433f, c38893m0.f167433f) && AbstractC22676k.m65745e(this.f167434g, c38893m0.f167434g) && AbstractC22676k.m65745e(this.f167435h, c38893m0.f167435h);
    }

    public final int hashCode() {
        int iHashCode = (EnumC38862i8.Automatic.hashCode() + (this.f167428a.hashCode() * 923521)) * 31;
        String str = this.f167429b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167430c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167431d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC38922p2 enumC38922p2 = this.f167432e;
        int iHashCode5 = (iHashCode4 + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31;
        String str4 = this.f167433f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f167434g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f167435h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        EnumC38862i8 enumC38862i8 = EnumC38862i8.Automatic;
        StringBuilder sb4 = new StringBuilder("CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=");
        sb4.append(this.f167428a);
        sb4.append(", initialInstitution=null, manualEntryOnly=null, searchSession=null, verificationMethod=");
        sb4.append(enumC38862i8);
        sb4.append(", hostedSurface=");
        AbstractC11266d.m30444B(sb4, this.f167429b, ", customer=", this.f167430c, ", onBehalfOf=");
        sb4.append(this.f167431d);
        sb4.append(", linkMode=");
        sb4.append(this.f167432e);
        sb4.append(", product=");
        AbstractC30007c.m91853w(this.f167434g, this.f167433f, ", amount=", ", currency=", sb4);
        return AbstractC25012a.m73376i(this.f167435h, ")", sb4);
    }
}
