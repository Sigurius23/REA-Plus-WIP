package z10;

import android.os.Parcel;
import android.os.Parcelable;
import f20.EnumC14023b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import w10.InterfaceC36692d;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39979b extends AbstractC39982e {
    public static final Parcelable.Creator<C39979b> CREATOR = new C38821e7(22);

    /* JADX INFO: renamed from: E */
    public final InterfaceC36692d f172526E;

    /* JADX INFO: renamed from: F */
    public final String f172527F;

    /* JADX INFO: renamed from: G */
    public final EnumC14023b f172528G;

    /* JADX INFO: renamed from: H */
    public final String f172529H;

    /* JADX INFO: renamed from: I */
    public final String f172530I;

    /* JADX INFO: renamed from: J */
    public final String f172531J;

    /* JADX INFO: renamed from: y */
    public final String f172532y;

    /* JADX INFO: renamed from: z */
    public final String f172533z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39979b(String publishableKey, String str, InterfaceC36692d configuration, String str2, EnumC14023b enumC14023b, String elementsSessionId, String str3, String str4) {
        super(null, false);
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
        this.f172532y = publishableKey;
        this.f172533z = str;
        this.f172526E = configuration;
        this.f172527F = str2;
        this.f172528G = enumC14023b;
        this.f172529H = elementsSessionId;
        this.f172530I = str3;
        this.f172531J = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39979b)) {
            return false;
        }
        C39979b c39979b = (C39979b) obj;
        return AbstractC22676k.m65745e(this.f172532y, c39979b.f172532y) && AbstractC22676k.m65745e(this.f172533z, c39979b.f172533z) && AbstractC22676k.m65745e(this.f172526E, c39979b.f172526E) && AbstractC22676k.m65745e(this.f172527F, c39979b.f172527F) && this.f172528G == c39979b.f172528G && AbstractC22676k.m65745e(this.f172529H, c39979b.f172529H) && AbstractC22676k.m65745e(this.f172530I, c39979b.f172530I) && AbstractC22676k.m65745e(this.f172531J, c39979b.f172531J);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: f */
    public final InterfaceC36692d mo128207f() {
        return this.f172526E;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: h */
    public final EnumC14023b mo128208h() {
        return this.f172528G;
    }

    public final int hashCode() {
        int iHashCode = this.f172532y.hashCode() * 31;
        String str = this.f172533z;
        int iHashCode2 = (this.f172526E.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f172527F;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC14023b enumC14023b = this.f172528G;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31, 31, this.f172529H);
        String str3 = this.f172530I;
        int iHashCode4 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f172531J;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: i */
    public final String mo128209i() {
        return this.f172532y;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: k */
    public final String mo128210k() {
        return this.f172533z;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ForDeferredSetupIntent(publishableKey=", this.f172532y, ", stripeAccountId=", this.f172533z, ", configuration=");
        sbM32001t.append(this.f172526E);
        sbM32001t.append(", hostedSurface=");
        sbM32001t.append(this.f172527F);
        sbM32001t.append(", financialConnectionsAvailability=");
        sbM32001t.append(this.f172528G);
        sbM32001t.append(", elementsSessionId=");
        sbM32001t.append(this.f172529H);
        sbM32001t.append(", customerId=");
        return AbstractC11266d.m30464r(sbM32001t, this.f172530I, ", onBehalfOf=", this.f172531J, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f172532y);
        dest.writeString(this.f172533z);
        dest.writeParcelable(this.f172526E, i13);
        dest.writeString(this.f172527F);
        EnumC14023b enumC14023b = this.f172528G;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        dest.writeString(this.f172529H);
        dest.writeString(this.f172530I);
        dest.writeString(this.f172531J);
    }
}
