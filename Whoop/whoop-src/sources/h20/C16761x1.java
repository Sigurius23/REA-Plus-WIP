package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import i20.C17928b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38853i;

/* JADX INFO: renamed from: h20.x1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16761x1 implements Parcelable {
    public static final Parcelable.Creator<C16761x1> CREATOR = new C16699n(25);

    /* JADX INFO: renamed from: E */
    public final C17928b f64402E;

    /* JADX INFO: renamed from: F */
    public final boolean f64403F;

    /* JADX INFO: renamed from: G */
    public final boolean f64404G;

    /* JADX INFO: renamed from: H */
    public final C16665h1 f64405H;

    /* JADX INFO: renamed from: I */
    public final String f64406I;

    /* JADX INFO: renamed from: J */
    public final C16689l1 f64407J;

    /* JADX INFO: renamed from: K */
    public final List f64408K;

    /* JADX INFO: renamed from: L */
    public final boolean f64409L;

    /* JADX INFO: renamed from: M */
    public final List f64410M;

    /* JADX INFO: renamed from: N */
    public final List f64411N;

    /* JADX INFO: renamed from: O */
    public final EnumC16762x2 f64412O;

    /* JADX INFO: renamed from: P */
    public final AbstractC16737t1 f64413P;

    /* JADX INFO: renamed from: Q */
    public final List f64414Q;

    /* JADX INFO: renamed from: R */
    public final List f64415R;

    /* JADX INFO: renamed from: S */
    public final C16756w2 f64416S;

    /* JADX INFO: renamed from: T */
    public final C16721q3 f64417T;

    /* JADX INFO: renamed from: U */
    public final C16661g3 f64418U;

    /* JADX INFO: renamed from: V */
    public final String f64419V;

    /* JADX INFO: renamed from: W */
    public final Map f64420W;

    /* JADX INFO: renamed from: X */
    public final boolean f64421X;

    /* JADX INFO: renamed from: Y */
    public final String f64422Y;

    /* JADX INFO: renamed from: w */
    public final String f64423w;

    /* JADX INFO: renamed from: x */
    public final C16636c2 f64424x;

    /* JADX INFO: renamed from: y */
    public final C16666h2 f64425y;

    /* JADX INFO: renamed from: z */
    public final C16671i1 f64426z;

    public C16761x1(String merchantDisplayName, C16636c2 c16636c2, C16666h2 c16666h2, C16671i1 c16671i1, C17928b c17928b, boolean z4, boolean z13, C16665h1 appearance, String str, C16689l1 billingDetailsCollectionConfiguration, List preferredNetworks, boolean z14, List paymentMethodOrder, List externalPaymentMethods, EnumC16762x2 paymentMethodLayout, AbstractC16737t1 cardBrandAcceptance, List allowedCardFundingTypes, List customPaymentMethods, C16756w2 link, C16721q3 walletButtons, C16661g3 c16661g3, String str2, Map termsDisplay, boolean z15, String str3) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        AbstractC22676k.m65750j(appearance, "appearance");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(paymentMethodLayout, "paymentMethodLayout");
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        AbstractC22676k.m65750j(allowedCardFundingTypes, "allowedCardFundingTypes");
        AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
        AbstractC22676k.m65750j(link, "link");
        AbstractC22676k.m65750j(walletButtons, "walletButtons");
        AbstractC22676k.m65750j(termsDisplay, "termsDisplay");
        this.f64423w = merchantDisplayName;
        this.f64424x = c16636c2;
        this.f64425y = c16666h2;
        this.f64426z = c16671i1;
        this.f64402E = c17928b;
        this.f64403F = z4;
        this.f64404G = z13;
        this.f64405H = appearance;
        this.f64406I = str;
        this.f64407J = billingDetailsCollectionConfiguration;
        this.f64408K = preferredNetworks;
        this.f64409L = z14;
        this.f64410M = paymentMethodOrder;
        this.f64411N = externalPaymentMethods;
        this.f64412O = paymentMethodLayout;
        this.f64413P = cardBrandAcceptance;
        this.f64414Q = allowedCardFundingTypes;
        this.f64415R = customPaymentMethods;
        this.f64416S = link;
        this.f64417T = walletButtons;
        this.f64418U = c16661g3;
        this.f64419V = str2;
        this.f64420W = termsDisplay;
        this.f64421X = z15;
        this.f64422Y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16761x1)) {
            return false;
        }
        C16761x1 c16761x1 = (C16761x1) obj;
        return AbstractC22676k.m65745e(this.f64423w, c16761x1.f64423w) && AbstractC22676k.m65745e(this.f64424x, c16761x1.f64424x) && AbstractC22676k.m65745e(this.f64425y, c16761x1.f64425y) && AbstractC22676k.m65745e(this.f64426z, c16761x1.f64426z) && AbstractC22676k.m65745e(this.f64402E, c16761x1.f64402E) && this.f64403F == c16761x1.f64403F && this.f64404G == c16761x1.f64404G && AbstractC22676k.m65745e(this.f64405H, c16761x1.f64405H) && AbstractC22676k.m65745e(this.f64406I, c16761x1.f64406I) && AbstractC22676k.m65745e(this.f64407J, c16761x1.f64407J) && AbstractC22676k.m65745e(this.f64408K, c16761x1.f64408K) && this.f64409L == c16761x1.f64409L && AbstractC22676k.m65745e(this.f64410M, c16761x1.f64410M) && AbstractC22676k.m65745e(this.f64411N, c16761x1.f64411N) && this.f64412O == c16761x1.f64412O && AbstractC22676k.m65745e(this.f64413P, c16761x1.f64413P) && AbstractC22676k.m65745e(this.f64414Q, c16761x1.f64414Q) && AbstractC22676k.m65745e(this.f64415R, c16761x1.f64415R) && AbstractC22676k.m65745e(this.f64416S, c16761x1.f64416S) && AbstractC22676k.m65745e(this.f64417T, c16761x1.f64417T) && AbstractC22676k.m65745e(this.f64418U, c16761x1.f64418U) && AbstractC22676k.m65745e(this.f64419V, c16761x1.f64419V) && AbstractC22676k.m65745e(this.f64420W, c16761x1.f64420W) && this.f64421X == c16761x1.f64421X && AbstractC22676k.m65745e(this.f64422Y, c16761x1.f64422Y);
    }

    public final int hashCode() {
        int iHashCode = this.f64423w.hashCode() * 31;
        C16636c2 c16636c2 = this.f64424x;
        int iHashCode2 = (iHashCode + (c16636c2 == null ? 0 : c16636c2.hashCode())) * 31;
        C16666h2 c16666h2 = this.f64425y;
        int iHashCode3 = (iHashCode2 + (c16666h2 == null ? 0 : c16666h2.hashCode())) * 31;
        C16671i1 c16671i1 = this.f64426z;
        int iHashCode4 = (iHashCode3 + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f64402E;
        int iHashCode5 = (this.f64405H.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f64403F), 31, this.f64404G)) * 31;
        String str = this.f64406I;
        int iHashCode6 = (this.f64417T.hashCode() + ((this.f64416S.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.f64413P.hashCode() + ((this.f64412O.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((this.f64407J.hashCode() + ((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f64408K), 31, this.f64409L), 31, this.f64410M), 31, this.f64411N)) * 31)) * 31, 31, this.f64414Q), 31, this.f64415R)) * 31)) * 31;
        C16661g3 c16661g3 = this.f64418U;
        int iHashCode7 = (iHashCode6 + (c16661g3 == null ? 0 : c16661g3.hashCode())) * 31;
        String str2 = this.f64419V;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.f64420W, (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.f64421X);
        String str3 = this.f64422Y;
        return iM8289b + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Configuration(merchantDisplayName=");
        sb4.append(this.f64423w);
        sb4.append(", customer=");
        sb4.append(this.f64424x);
        sb4.append(", googlePay=");
        sb4.append(this.f64425y);
        sb4.append(", defaultBillingDetails=");
        sb4.append(this.f64426z);
        sb4.append(", shippingDetails=");
        sb4.append(this.f64402E);
        sb4.append(", allowsDelayedPaymentMethods=");
        sb4.append(this.f64403F);
        sb4.append(", allowsPaymentMethodsRequiringShippingAddress=");
        sb4.append(this.f64404G);
        sb4.append(", appearance=");
        sb4.append(this.f64405H);
        sb4.append(", primaryButtonLabel=");
        sb4.append(this.f64406I);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f64407J);
        sb4.append(", preferredNetworks=");
        AbstractC26725a.m79512p(", allowsRemovalOfLastSavedPaymentMethod=", ", paymentMethodOrder=", sb4, this.f64408K, this.f64409L);
        AbstractC21702c.m61148s(sb4, this.f64410M, ", externalPaymentMethods=", this.f64411N, ", paymentMethodLayout=");
        sb4.append(this.f64412O);
        sb4.append(", cardBrandAcceptance=");
        sb4.append(this.f64413P);
        sb4.append(", allowedCardFundingTypes=");
        AbstractC21702c.m61148s(sb4, this.f64414Q, ", customPaymentMethods=", this.f64415R, ", link=");
        sb4.append(this.f64416S);
        sb4.append(", walletButtons=");
        sb4.append(this.f64417T);
        sb4.append(", shopPayConfiguration=");
        sb4.append(this.f64418U);
        sb4.append(", googlePlacesApiKey=");
        sb4.append(this.f64419V);
        sb4.append(", termsDisplay=");
        sb4.append(this.f64420W);
        sb4.append(", opensCardScannerAutomatically=");
        sb4.append(this.f64421X);
        sb4.append(", userOverrideCountry=");
        return AbstractC25012a.m73376i(this.f64422Y, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64423w);
        C16636c2 c16636c2 = this.f64424x;
        if (c16636c2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16636c2.writeToParcel(dest, i13);
        }
        C16666h2 c16666h2 = this.f64425y;
        if (c16666h2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16666h2.writeToParcel(dest, i13);
        }
        C16671i1 c16671i1 = this.f64426z;
        if (c16671i1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16671i1.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f64402E, i13);
        dest.writeInt(this.f64403F ? 1 : 0);
        dest.writeInt(this.f64404G ? 1 : 0);
        this.f64405H.writeToParcel(dest, i13);
        dest.writeString(this.f64406I);
        this.f64407J.writeToParcel(dest, i13);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f64408K, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38853i) itM30863o.next()).name());
        }
        dest.writeInt(this.f64409L ? 1 : 0);
        dest.writeStringList(this.f64410M);
        dest.writeStringList(this.f64411N);
        dest.writeString(this.f64412O.name());
        dest.writeParcelable(this.f64413P, i13);
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f64414Q, dest);
        while (itM30863o2.hasNext()) {
            ((EnumC16743u1) itM30863o2.next()).writeToParcel(dest, i13);
        }
        Iterator itM30863o3 = AbstractC11478a.m30863o(this.f64415R, dest);
        while (itM30863o3.hasNext()) {
            ((C16767y1) itM30863o3.next()).writeToParcel(dest, i13);
        }
        this.f64416S.writeToParcel(dest, i13);
        this.f64417T.writeToParcel(dest, i13);
        C16661g3 c16661g3 = this.f64418U;
        if (c16661g3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16661g3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f64419V);
        Map map = this.f64420W;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i13);
            dest.writeString(((EnumC16673i3) entry.getValue()).name());
        }
        dest.writeInt(this.f64421X ? 1 : 0);
        dest.writeString(this.f64422Y);
    }
}
