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

/* JADX INFO: renamed from: z10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C39981d extends AbstractC39982e {
    public static final Parcelable.Creator<C39981d> CREATOR = new C38821e7(24);

    /* JADX INFO: renamed from: E */
    public final String f172541E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC36692d f172542F;

    /* JADX INFO: renamed from: G */
    public final boolean f172543G;

    /* JADX INFO: renamed from: H */
    public final EnumC14023b f172544H;

    /* JADX INFO: renamed from: I */
    public final String f172545I;

    /* JADX INFO: renamed from: y */
    public final String f172546y;

    /* JADX INFO: renamed from: z */
    public final String f172547z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39981d(String publishableKey, String str, String clientSecret, InterfaceC36692d configuration, boolean z4, EnumC14023b enumC14023b, String str2) {
        super(clientSecret, z4);
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(configuration, "configuration");
        this.f172546y = publishableKey;
        this.f172547z = str;
        this.f172541E = clientSecret;
        this.f172542F = configuration;
        this.f172543G = z4;
        this.f172544H = enumC14023b;
        this.f172545I = str2;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: b */
    public final boolean mo128211b() {
        return this.f172543G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39981d)) {
            return false;
        }
        C39981d c39981d = (C39981d) obj;
        return AbstractC22676k.m65745e(this.f172546y, c39981d.f172546y) && AbstractC22676k.m65745e(this.f172547z, c39981d.f172547z) && AbstractC22676k.m65745e(this.f172541E, c39981d.f172541E) && AbstractC22676k.m65745e(this.f172542F, c39981d.f172542F) && this.f172543G == c39981d.f172543G && this.f172544H == c39981d.f172544H && AbstractC22676k.m65745e(this.f172545I, c39981d.f172545I);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: f */
    public final InterfaceC36692d mo128207f() {
        return this.f172542F;
    }

    @Override // z10.AbstractC39982e
    public final String getClientSecret() {
        return this.f172541E;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: h */
    public final EnumC14023b mo128208h() {
        return this.f172544H;
    }

    public final int hashCode() {
        int iHashCode = this.f172546y.hashCode() * 31;
        String str = this.f172547z;
        int iM8289b = AbstractC2875y.m8289b((this.f172542F.hashCode() + AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f172541E)) * 31, 31, this.f172543G);
        EnumC14023b enumC14023b = this.f172544H;
        int iHashCode2 = (iM8289b + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31;
        String str2 = this.f172545I;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: i */
    public final String mo128209i() {
        return this.f172546y;
    }

    @Override // z10.AbstractC39982e
    /* JADX INFO: renamed from: k */
    public final String mo128210k() {
        return this.f172547z;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ForSetupIntent(publishableKey=", this.f172546y, ", stripeAccountId=", this.f172547z, ", clientSecret=");
        sbM32001t.append(this.f172541E);
        sbM32001t.append(", configuration=");
        sbM32001t.append(this.f172542F);
        sbM32001t.append(", attachToIntent=");
        sbM32001t.append(this.f172543G);
        sbM32001t.append(", financialConnectionsAvailability=");
        sbM32001t.append(this.f172544H);
        sbM32001t.append(", hostedSurface=");
        return AbstractC25012a.m73376i(this.f172545I, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f172546y);
        dest.writeString(this.f172547z);
        dest.writeString(this.f172541E);
        dest.writeParcelable(this.f172542F, i13);
        dest.writeInt(this.f172543G ? 1 : 0);
        EnumC14023b enumC14023b = this.f172544H;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        dest.writeString(this.f172545I);
    }
}
