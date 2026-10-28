package l10;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16689l1;
import h20.EnumC16660g2;
import java.util.List;
import p000.AbstractC11266d;
import p266jz.C22060h;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C23217b implements Parcelable {
    public static final Parcelable.Creator<C23217b> CREATOR = new C22060h(17);

    /* JADX INFO: renamed from: E */
    public final Long f91923E;

    /* JADX INFO: renamed from: F */
    public final String f91924F;

    /* JADX INFO: renamed from: G */
    public final C16689l1 f91925G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35320a f91926H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35322b f91927I;

    /* JADX INFO: renamed from: J */
    public final List f91928J;

    /* JADX INFO: renamed from: w */
    public final EnumC16660g2 f91929w;

    /* JADX INFO: renamed from: x */
    public final String f91930x;

    /* JADX INFO: renamed from: y */
    public final String f91931y;

    /* JADX INFO: renamed from: z */
    public final String f91932z;

    public C23217b(EnumC16660g2 enumC16660g2, String merchantName, String merchantCountryCode, String str, Long l7, String str2, C16689l1 billingDetailsCollectionConfiguration, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, List additionalEnabledNetworks) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(merchantCountryCode, "merchantCountryCode");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        this.f91929w = enumC16660g2;
        this.f91930x = merchantName;
        this.f91931y = merchantCountryCode;
        this.f91932z = str;
        this.f91923E = l7;
        this.f91924F = str2;
        this.f91925G = billingDetailsCollectionConfiguration;
        this.f91926H = cardBrandFilter;
        this.f91927I = cardFundingFilter;
        this.f91928J = additionalEnabledNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23217b)) {
            return false;
        }
        C23217b c23217b = (C23217b) obj;
        return this.f91929w == c23217b.f91929w && AbstractC22676k.m65745e(this.f91930x, c23217b.f91930x) && AbstractC22676k.m65745e(this.f91931y, c23217b.f91931y) && AbstractC22676k.m65745e(this.f91932z, c23217b.f91932z) && AbstractC22676k.m65745e(this.f91923E, c23217b.f91923E) && AbstractC22676k.m65745e(this.f91924F, c23217b.f91924F) && AbstractC22676k.m65745e(this.f91925G, c23217b.f91925G) && AbstractC22676k.m65745e(this.f91926H, c23217b.f91926H) && AbstractC22676k.m65745e(this.f91927I, c23217b.f91927I) && AbstractC22676k.m65745e(this.f91928J, c23217b.f91928J);
    }

    public final int hashCode() {
        EnumC16660g2 enumC16660g2 = this.f91929w;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((enumC16660g2 == null ? 0 : enumC16660g2.hashCode()) * 31, 31, this.f91930x), 31, this.f91931y);
        String str = this.f91932z;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.f91923E;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.f91924F;
        return this.f91928J.hashCode() + ((this.f91927I.hashCode() + ((this.f91926H.hashCode() + ((this.f91925G.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Config(environment=");
        sb4.append(this.f91929w);
        sb4.append(", merchantName=");
        sb4.append(this.f91930x);
        sb4.append(", merchantCountryCode=");
        AbstractC11266d.m30444B(sb4, this.f91931y, ", merchantCurrencyCode=", this.f91932z, ", customAmount=");
        sb4.append(this.f91923E);
        sb4.append(", customLabel=");
        sb4.append(this.f91924F);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f91925G);
        sb4.append(", cardBrandFilter=");
        sb4.append(this.f91926H);
        sb4.append(", cardFundingFilter=");
        sb4.append(this.f91927I);
        sb4.append(", additionalEnabledNetworks=");
        sb4.append(this.f91928J);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        EnumC16660g2 enumC16660g2 = this.f91929w;
        if (enumC16660g2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC16660g2.name());
        }
        dest.writeString(this.f91930x);
        dest.writeString(this.f91931y);
        dest.writeString(this.f91932z);
        Long l7 = this.f91923E;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f91924F);
        this.f91925G.writeToParcel(dest, i13);
        dest.writeParcelable(this.f91926H, i13);
        dest.writeParcelable(this.f91927I, i13);
        dest.writeStringList(this.f91928J);
    }
}
