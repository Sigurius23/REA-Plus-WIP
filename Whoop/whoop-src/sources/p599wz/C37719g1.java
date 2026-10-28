package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import b10.EnumC2228d;
import p000.AbstractC11266d;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: wz.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37719g1 implements Parcelable {
    public static final Parcelable.Creator<C37719g1> CREATOR = new C37677f(23);

    /* JADX INFO: renamed from: E */
    public final String f161640E;

    /* JADX INFO: renamed from: F */
    public final EnumC37721h0 f161641F;

    /* JADX INFO: renamed from: G */
    public final C37708d f161642G;

    /* JADX INFO: renamed from: H */
    public final String f161643H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC37739n0 f161644I;

    /* JADX INFO: renamed from: w */
    public final C37718g0 f161645w;

    /* JADX INFO: renamed from: x */
    public final C35459c0 f161646x;

    /* JADX INFO: renamed from: y */
    public final EnumC2228d f161647y;

    /* JADX INFO: renamed from: z */
    public final String f161648z;

    public C37719g1(C37718g0 configuration, C35459c0 paymentMethodMetadata, EnumC2228d requestSurface, String publishableKey, String str, EnumC37721h0 linkExpressMode, C37708d linkAccountInfo, String paymentElementCallbackIdentifier, InterfaceC37739n0 launchMode) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(launchMode, "launchMode");
        this.f161645w = configuration;
        this.f161646x = paymentMethodMetadata;
        this.f161647y = requestSurface;
        this.f161648z = publishableKey;
        this.f161640E = str;
        this.f161641F = linkExpressMode;
        this.f161642G = linkAccountInfo;
        this.f161643H = paymentElementCallbackIdentifier;
        this.f161644I = launchMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37719g1)) {
            return false;
        }
        C37719g1 c37719g1 = (C37719g1) obj;
        return AbstractC22676k.m65745e(this.f161645w, c37719g1.f161645w) && AbstractC22676k.m65745e(this.f161646x, c37719g1.f161646x) && this.f161647y == c37719g1.f161647y && AbstractC22676k.m65745e(this.f161648z, c37719g1.f161648z) && AbstractC22676k.m65745e(this.f161640E, c37719g1.f161640E) && this.f161641F == c37719g1.f161641F && AbstractC22676k.m65745e(this.f161642G, c37719g1.f161642G) && AbstractC22676k.m65745e(this.f161643H, c37719g1.f161643H) && AbstractC22676k.m65745e(this.f161644I, c37719g1.f161644I);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f161647y.hashCode() + ((this.f161646x.hashCode() + (this.f161645w.hashCode() * 31)) * 31)) * 31, 31, this.f161648z);
        String str = this.f161640E;
        return this.f161644I.hashCode() + AbstractC11266d.m30450d((this.f161642G.hashCode() + ((this.f161641F.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f161643H);
    }

    public final String toString() {
        return "NativeLinkArgs(configuration=" + this.f161645w + ", paymentMethodMetadata=" + this.f161646x + ", requestSurface=" + this.f161647y + ", publishableKey=" + this.f161648z + ", stripeAccountId=" + this.f161640E + ", linkExpressMode=" + this.f161641F + ", linkAccountInfo=" + this.f161642G + ", paymentElementCallbackIdentifier=" + this.f161643H + ", launchMode=" + this.f161644I + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161645w, i13);
        dest.writeParcelable(this.f161646x, i13);
        dest.writeString(this.f161647y.name());
        dest.writeString(this.f161648z);
        dest.writeString(this.f161640E);
        dest.writeString(this.f161641F.name());
        dest.writeParcelable(this.f161642G, i13);
        dest.writeString(this.f161643H);
        dest.writeParcelable(this.f161644I, i13);
    }
}
