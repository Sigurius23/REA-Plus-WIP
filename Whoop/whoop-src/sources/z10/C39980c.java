package z10;

import android.os.Parcel;
import android.os.Parcelable;
import f20.EnumC14023b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import w10.InterfaceC36692d;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39980c extends AbstractC39982e {
    public static final Parcelable.Creator<C39980c> CREATOR = new C38821e7(23);

    /* JADX INFO: renamed from: E */
    public final String f172534E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC36692d f172535F;

    /* JADX INFO: renamed from: G */
    public final boolean f172536G;

    /* JADX INFO: renamed from: H */
    public final EnumC14023b f172537H;

    /* JADX INFO: renamed from: I */
    public final String f172538I;

    /* JADX INFO: renamed from: y */
    public final String f172539y;

    /* JADX INFO: renamed from: z */
    public final String f172540z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39980c(String publishableKey, String str, String clientSecret, InterfaceC36692d configuration, boolean z4, EnumC14023b enumC14023b, String str2) {
        super(clientSecret, z4);
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f172539y = publishableKey;
        this.f172540z = str;
        this.f172534E = clientSecret;
        this.f172535F = configuration;
        this.f172536G = z4;
        this.f172537H = enumC14023b;
        this.f172538I = str2;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: b */
    public final boolean mo128211b() {
        return this.f172536G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39980c)) {
            return false;
        }
        C39980c c39980c = (C39980c) obj;
        return AbstractC22676k.m65745e(this.f172539y, c39980c.f172539y) && AbstractC22676k.m65745e(this.f172540z, c39980c.f172540z) && AbstractC22676k.m65745e(this.f172534E, c39980c.f172534E) && AbstractC22676k.m65745e(this.f172535F, c39980c.f172535F) && this.f172536G == c39980c.f172536G && this.f172537H == c39980c.f172537H && AbstractC22676k.m65745e(this.f172538I, c39980c.f172538I);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: f */
    public final InterfaceC36692d mo128207f() {
        return this.f172535F;
    }

    @Override // z10.AbstractC39982e
    public final String getClientSecret() {
        return this.f172534E;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: h */
    public final EnumC14023b mo128208h() {
        return this.f172537H;
    }

    public final int hashCode() {
        int iHashCode = this.f172539y.hashCode() * 31;
        String str = this.f172540z;
        int iM8289b = AbstractC2875y.m8289b((this.f172535F.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f172534E)) * 31, 31, this.f172536G);
        EnumC14023b enumC14023b = this.f172537H;
        int iHashCode2 = (iM8289b + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31;
        String str2 = this.f172538I;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: i */
    public final String mo128209i() {
        return this.f172539y;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: k */
    public final String mo128210k() {
        return this.f172540z;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ForPaymentIntent(publishableKey=", this.f172539y, ", stripeAccountId=", this.f172540z, ", clientSecret=");
        sbM32001t.append(this.f172534E);
        sbM32001t.append(", configuration=");
        sbM32001t.append(this.f172535F);
        sbM32001t.append(", attachToIntent=");
        sbM32001t.append(this.f172536G);
        sbM32001t.append(", financialConnectionsAvailability=");
        sbM32001t.append(this.f172537H);
        sbM32001t.append(", hostedSurface=");
        return AbstractC25012a.m73376i(this.f172538I, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f172539y);
        dest.writeString(this.f172540z);
        dest.writeString(this.f172534E);
        dest.writeParcelable(this.f172535F, i13);
        dest.writeInt(this.f172536G ? 1 : 0);
        EnumC14023b enumC14023b = this.f172537H;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        dest.writeString(this.f172538I);
    }
}
