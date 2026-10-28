package z10;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import f20.EnumC14023b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import w10.InterfaceC36692d;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39978a extends AbstractC39982e {
    public static final Parcelable.Creator<C39978a> CREATOR = new C38821e7(21);

    /* JADX INFO: renamed from: E */
    public final InterfaceC36692d f172516E;

    /* JADX INFO: renamed from: F */
    public final EnumC14023b f172517F;

    /* JADX INFO: renamed from: G */
    public final String f172518G;

    /* JADX INFO: renamed from: H */
    public final String f172519H;

    /* JADX INFO: renamed from: I */
    public final String f172520I;

    /* JADX INFO: renamed from: J */
    public final String f172521J;

    /* JADX INFO: renamed from: K */
    public final Integer f172522K;

    /* JADX INFO: renamed from: L */
    public final String f172523L;

    /* JADX INFO: renamed from: y */
    public final String f172524y;

    /* JADX INFO: renamed from: z */
    public final String f172525z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39978a(String publishableKey, String str, InterfaceC36692d configuration, EnumC14023b enumC14023b, String str2, String elementsSessionId, String str3, String str4, Integer num, String str5) {
        super(null, false);
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
        this.f172524y = publishableKey;
        this.f172525z = str;
        this.f172516E = configuration;
        this.f172517F = enumC14023b;
        this.f172518G = str2;
        this.f172519H = elementsSessionId;
        this.f172520I = str3;
        this.f172521J = str4;
        this.f172522K = num;
        this.f172523L = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39978a)) {
            return false;
        }
        C39978a c39978a = (C39978a) obj;
        return AbstractC22676k.m65745e(this.f172524y, c39978a.f172524y) && AbstractC22676k.m65745e(this.f172525z, c39978a.f172525z) && AbstractC22676k.m65745e(this.f172516E, c39978a.f172516E) && this.f172517F == c39978a.f172517F && AbstractC22676k.m65745e(this.f172518G, c39978a.f172518G) && AbstractC22676k.m65745e(this.f172519H, c39978a.f172519H) && AbstractC22676k.m65745e(this.f172520I, c39978a.f172520I) && AbstractC22676k.m65745e(this.f172521J, c39978a.f172521J) && AbstractC22676k.m65745e(this.f172522K, c39978a.f172522K) && AbstractC22676k.m65745e(this.f172523L, c39978a.f172523L);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: f */
    public final InterfaceC36692d mo128207f() {
        return this.f172516E;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: h */
    public final EnumC14023b mo128208h() {
        return this.f172517F;
    }

    public final int hashCode() {
        int iHashCode = this.f172524y.hashCode() * 31;
        String str = this.f172525z;
        int iHashCode2 = (this.f172516E.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        EnumC14023b enumC14023b = this.f172517F;
        int iHashCode3 = (iHashCode2 + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31;
        String str2 = this.f172518G;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f172519H);
        String str3 = this.f172520I;
        int iHashCode4 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f172521J;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f172522K;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f172523L;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: i */
    public final String mo128209i() {
        return this.f172524y;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: k */
    public final String mo128210k() {
        return this.f172525z;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ForDeferredPaymentIntent(publishableKey=", this.f172524y, ", stripeAccountId=", this.f172525z, ", configuration=");
        sbM32001t.append(this.f172516E);
        sbM32001t.append(", financialConnectionsAvailability=");
        sbM32001t.append(this.f172517F);
        sbM32001t.append(", hostedSurface=");
        AbstractC11266d.m30444B(sbM32001t, this.f172518G, ", elementsSessionId=", this.f172519H, ", customerId=");
        AbstractC11266d.m30444B(sbM32001t, this.f172520I, ", onBehalfOf=", this.f172521J, ", amount=");
        sbM32001t.append(this.f172522K);
        sbM32001t.append(", currency=");
        sbM32001t.append(this.f172523L);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f172524y);
        dest.writeString(this.f172525z);
        dest.writeParcelable(this.f172516E, i13);
        EnumC14023b enumC14023b = this.f172517F;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        dest.writeString(this.f172518G);
        dest.writeString(this.f172519H);
        dest.writeString(this.f172520I);
        dest.writeString(this.f172521J);
        Integer num = this.f172522K;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f172523L);
    }
}
