package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import f20.EnumC14023b;
import h20.C16671i1;
import h20.C16689l1;
import i20.C17928b;
import java.util.List;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.InterfaceC35471i0;
import y00.AbstractC38963t7;
import y00.C38901n;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: wz.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37718g0 implements Parcelable {
    public static final Parcelable.Creator<C37718g0> CREATOR = new C37677f(12);

    /* JADX INFO: renamed from: E */
    public final String f161605E;

    /* JADX INFO: renamed from: F */
    public final C37715f0 f161606F;

    /* JADX INFO: renamed from: G */
    public final C17928b f161607G;

    /* JADX INFO: renamed from: H */
    public final boolean f161608H;

    /* JADX INFO: renamed from: I */
    public final Map f161609I;

    /* JADX INFO: renamed from: J */
    public final C37712e0 f161610J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC35320a f161611K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC35322b f161612L;

    /* JADX INFO: renamed from: M */
    public final EnumC14023b f161613M;

    /* JADX INFO: renamed from: N */
    public final C16689l1 f161614N;

    /* JADX INFO: renamed from: O */
    public final C16671i1 f161615O;

    /* JADX INFO: renamed from: P */
    public final boolean f161616P;

    /* JADX INFO: renamed from: Q */
    public final boolean f161617Q;

    /* JADX INFO: renamed from: R */
    public final boolean f161618R;

    /* JADX INFO: renamed from: S */
    public final String f161619S;

    /* JADX INFO: renamed from: T */
    public final EnumC38922p2 f161620T;

    /* JADX INFO: renamed from: U */
    public final boolean f161621U;

    /* JADX INFO: renamed from: V */
    public final String f161622V;

    /* JADX INFO: renamed from: W */
    public final boolean f161623W;

    /* JADX INFO: renamed from: X */
    public final boolean f161624X;

    /* JADX INFO: renamed from: Y */
    public final boolean f161625Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f161626Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f161627a0;

    /* JADX INFO: renamed from: b0 */
    public final C37709d0 f161628b0;

    /* JADX INFO: renamed from: c0 */
    public final boolean f161629c0;

    /* JADX INFO: renamed from: d0 */
    public final boolean f161630d0;

    /* JADX INFO: renamed from: e0 */
    public final String f161631e0;

    /* JADX INFO: renamed from: f0 */
    public final InterfaceC35471i0 f161632f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f161633g0;

    /* JADX INFO: renamed from: h0 */
    public final List f161634h0;

    /* JADX INFO: renamed from: i0 */
    public final C38901n f161635i0;

    /* JADX INFO: renamed from: w */
    public final InterfaceC38802c8 f161636w;

    /* JADX INFO: renamed from: x */
    public final String f161637x;

    /* JADX INFO: renamed from: y */
    public final String f161638y;

    /* JADX INFO: renamed from: z */
    public final String f161639z;

    public C37718g0(InterfaceC38802c8 stripeIntent, String merchantName, String str, String str2, String str3, C37715f0 customerInfo, C17928b c17928b, boolean z4, Map map, C37712e0 c37712e0, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, EnumC14023b enumC14023b, C16689l1 billingDetailsCollectionConfiguration, C16671i1 c16671i1, boolean z13, boolean z14, boolean z15, String elementsSessionId, EnumC38922p2 enumC38922p2, boolean z16, String str4, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, C37709d0 c37709d0, boolean z26, boolean z27, String str5, InterfaceC35471i0 saveConsentBehavior, boolean z28, List linkSupportedPaymentMethodsOnboardingEnabled, C38901n clientAttributionMetadata) {
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(customerInfo, "customerInfo");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
        AbstractC22676k.m65750j(saveConsentBehavior, "saveConsentBehavior");
        AbstractC22676k.m65750j(linkSupportedPaymentMethodsOnboardingEnabled, "linkSupportedPaymentMethodsOnboardingEnabled");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        this.f161636w = stripeIntent;
        this.f161637x = merchantName;
        this.f161638y = str;
        this.f161639z = str2;
        this.f161605E = str3;
        this.f161606F = customerInfo;
        this.f161607G = c17928b;
        this.f161608H = z4;
        this.f161609I = map;
        this.f161610J = c37712e0;
        this.f161611K = cardBrandFilter;
        this.f161612L = cardFundingFilter;
        this.f161613M = enumC14023b;
        this.f161614N = billingDetailsCollectionConfiguration;
        this.f161615O = c16671i1;
        this.f161616P = z13;
        this.f161617Q = z14;
        this.f161618R = z15;
        this.f161619S = elementsSessionId;
        this.f161620T = enumC38922p2;
        this.f161621U = z16;
        this.f161622V = str4;
        this.f161623W = z17;
        this.f161624X = z18;
        this.f161625Y = z19;
        this.f161626Z = z24;
        this.f161627a0 = z25;
        this.f161628b0 = c37709d0;
        this.f161629c0 = z26;
        this.f161630d0 = z27;
        this.f161631e0 = str5;
        this.f161632f0 = saveConsentBehavior;
        this.f161633g0 = z28;
        this.f161634h0 = linkSupportedPaymentMethodsOnboardingEnabled;
        this.f161635i0 = clientAttributionMetadata;
    }

    /* JADX INFO: renamed from: b */
    public final String m121145b() {
        if (this.f161626Z) {
            return this.f161631e0;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37718g0)) {
            return false;
        }
        C37718g0 c37718g0 = (C37718g0) obj;
        return AbstractC22676k.m65745e(this.f161636w, c37718g0.f161636w) && AbstractC22676k.m65745e(this.f161637x, c37718g0.f161637x) && AbstractC22676k.m65745e(this.f161638y, c37718g0.f161638y) && AbstractC22676k.m65745e(this.f161639z, c37718g0.f161639z) && AbstractC22676k.m65745e(this.f161605E, c37718g0.f161605E) && AbstractC22676k.m65745e(this.f161606F, c37718g0.f161606F) && AbstractC22676k.m65745e(this.f161607G, c37718g0.f161607G) && this.f161608H == c37718g0.f161608H && AbstractC22676k.m65745e(this.f161609I, c37718g0.f161609I) && AbstractC22676k.m65745e(this.f161610J, c37718g0.f161610J) && AbstractC22676k.m65745e(this.f161611K, c37718g0.f161611K) && AbstractC22676k.m65745e(this.f161612L, c37718g0.f161612L) && this.f161613M == c37718g0.f161613M && AbstractC22676k.m65745e(this.f161614N, c37718g0.f161614N) && AbstractC22676k.m65745e(this.f161615O, c37718g0.f161615O) && this.f161616P == c37718g0.f161616P && this.f161617Q == c37718g0.f161617Q && this.f161618R == c37718g0.f161618R && AbstractC22676k.m65745e(this.f161619S, c37718g0.f161619S) && this.f161620T == c37718g0.f161620T && this.f161621U == c37718g0.f161621U && AbstractC22676k.m65745e(this.f161622V, c37718g0.f161622V) && this.f161623W == c37718g0.f161623W && this.f161624X == c37718g0.f161624X && this.f161625Y == c37718g0.f161625Y && this.f161626Z == c37718g0.f161626Z && this.f161627a0 == c37718g0.f161627a0 && AbstractC22676k.m65745e(this.f161628b0, c37718g0.f161628b0) && this.f161629c0 == c37718g0.f161629c0 && this.f161630d0 == c37718g0.f161630d0 && AbstractC22676k.m65745e(this.f161631e0, c37718g0.f161631e0) && AbstractC22676k.m65745e(this.f161632f0, c37718g0.f161632f0) && this.f161633g0 == c37718g0.f161633g0 && AbstractC22676k.m65745e(this.f161634h0, c37718g0.f161634h0) && AbstractC22676k.m65745e(this.f161635i0, c37718g0.f161635i0);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f161636w.hashCode() * 31, 31, this.f161637x);
        String str = this.f161638y;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f161639z;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f161605E;
        int iHashCode3 = (this.f161606F.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        C17928b c17928b = this.f161607G;
        int iM11821e = AbstractC3855a.m11821e(this.f161609I, AbstractC2875y.m8289b((iHashCode3 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f161608H), 31);
        C37712e0 c37712e0 = this.f161610J;
        int iHashCode4 = (this.f161612L.hashCode() + ((this.f161611K.hashCode() + ((iM11821e + (c37712e0 == null ? 0 : c37712e0.hashCode())) * 31)) * 31)) * 31;
        EnumC14023b enumC14023b = this.f161613M;
        int iHashCode5 = (this.f161614N.hashCode() + ((iHashCode4 + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31)) * 31;
        C16671i1 c16671i1 = this.f161615O;
        int iM30450d2 = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode5 + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31, 31, this.f161616P), 31, this.f161617Q), 31, this.f161618R), 31, this.f161619S);
        EnumC38922p2 enumC38922p2 = this.f161620T;
        int iM8289b = AbstractC2875y.m8289b((iM30450d2 + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31, 31, this.f161621U);
        String str4 = this.f161622V;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f161623W), 31, this.f161624X), 31, this.f161625Y), 31, this.f161626Z), 31, this.f161627a0);
        C37709d0 c37709d0 = this.f161628b0;
        int iM8289b3 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b2 + (c37709d0 == null ? 0 : c37709d0.hashCode())) * 31, 31, this.f161629c0), 31, this.f161630d0);
        String str5 = this.f161631e0;
        return this.f161635i0.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b((this.f161632f0.hashCode() + ((iM8289b3 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31, 31, this.f161633g0), 31, this.f161634h0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkConfiguration(stripeIntent=");
        sb4.append(this.f161636w);
        sb4.append(", merchantName=");
        sb4.append(this.f161637x);
        sb4.append(", sellerBusinessName=");
        AbstractC11266d.m30444B(sb4, this.f161638y, ", merchantCountryCode=", this.f161639z, ", merchantLogoUrl=");
        sb4.append(this.f161605E);
        sb4.append(", customerInfo=");
        sb4.append(this.f161606F);
        sb4.append(", shippingDetails=");
        sb4.append(this.f161607G);
        sb4.append(", passthroughModeEnabled=");
        sb4.append(this.f161608H);
        sb4.append(", flags=");
        sb4.append(this.f161609I);
        sb4.append(", cardBrandChoice=");
        sb4.append(this.f161610J);
        sb4.append(", cardBrandFilter=");
        sb4.append(this.f161611K);
        sb4.append(", cardFundingFilter=");
        sb4.append(this.f161612L);
        sb4.append(", financialConnectionsAvailability=");
        sb4.append(this.f161613M);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f161614N);
        sb4.append(", defaultBillingDetails=");
        sb4.append(this.f161615O);
        sb4.append(", useAttestationEndpointsForLink=");
        sb4.append(this.f161616P);
        sb4.append(", suppress2faModal=");
        AbstractC38963t7.m124392v(sb4, this.f161617Q, ", disableRuxInFlowController=", this.f161618R, ", elementsSessionId=");
        sb4.append(this.f161619S);
        sb4.append(", linkMode=");
        sb4.append(this.f161620T);
        sb4.append(", allowDefaultOptIn=");
        AbstractC38963t7.m124391u(sb4, this.f161621U, ", googlePlacesApiKey=", this.f161622V, ", collectMissingBillingDetailsForExistingPaymentMethods=");
        AbstractC38963t7.m124392v(sb4, this.f161623W, ", allowUserEmailEdits=", this.f161624X, ", allowLogOut=");
        AbstractC38963t7.m124392v(sb4, this.f161625Y, ", enableDisplayableDefaultValuesInEce=", this.f161626Z, ", skipWalletInFlowController=");
        sb4.append(this.f161627a0);
        sb4.append(", linkAppearance=");
        sb4.append(this.f161628b0);
        sb4.append(", linkSignUpOptInFeatureEnabled=");
        AbstractC38963t7.m124392v(sb4, this.f161629c0, ", linkSignUpOptInInitialValue=", this.f161630d0, ", customerId=");
        sb4.append(this.f161631e0);
        sb4.append(", saveConsentBehavior=");
        sb4.append(this.f161632f0);
        sb4.append(", forceSetupFutureUseBehaviorAndNewMandate=");
        AbstractC25012a.m73391x(", linkSupportedPaymentMethodsOnboardingEnabled=", ", clientAttributionMetadata=", sb4, this.f161634h0, this.f161633g0);
        sb4.append(this.f161635i0);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161636w, i13);
        dest.writeString(this.f161637x);
        dest.writeString(this.f161638y);
        dest.writeString(this.f161639z);
        dest.writeString(this.f161605E);
        this.f161606F.writeToParcel(dest, i13);
        C17928b c17928b = this.f161607G;
        if (c17928b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c17928b.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f161608H ? 1 : 0);
        Map map = this.f161609I;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        C37712e0 c37712e0 = this.f161610J;
        if (c37712e0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c37712e0.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f161611K, i13);
        dest.writeParcelable(this.f161612L, i13);
        EnumC14023b enumC14023b = this.f161613M;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        this.f161614N.writeToParcel(dest, i13);
        C16671i1 c16671i1 = this.f161615O;
        if (c16671i1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16671i1.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f161616P ? 1 : 0);
        dest.writeInt(this.f161617Q ? 1 : 0);
        dest.writeInt(this.f161618R ? 1 : 0);
        dest.writeString(this.f161619S);
        EnumC38922p2 enumC38922p2 = this.f161620T;
        if (enumC38922p2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38922p2.name());
        }
        dest.writeInt(this.f161621U ? 1 : 0);
        dest.writeString(this.f161622V);
        dest.writeInt(this.f161623W ? 1 : 0);
        dest.writeInt(this.f161624X ? 1 : 0);
        dest.writeInt(this.f161625Y ? 1 : 0);
        dest.writeInt(this.f161626Z ? 1 : 0);
        dest.writeInt(this.f161627a0 ? 1 : 0);
        C37709d0 c37709d0 = this.f161628b0;
        if (c37709d0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c37709d0.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f161629c0 ? 1 : 0);
        dest.writeInt(this.f161630d0 ? 1 : 0);
        dest.writeString(this.f161631e0);
        dest.writeParcelable(this.f161632f0, i13);
        dest.writeInt(this.f161633g0 ? 1 : 0);
        dest.writeStringList(this.f161634h0);
        dest.writeParcelable(this.f161635i0, i13);
    }
}
