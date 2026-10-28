package my;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d10.AbstractC11464a;
import d13.AbstractC11478a;
import h20.AbstractC16737t1;
import h20.C16624a2;
import h20.C16636c2;
import h20.C16661g3;
import h20.C16665h1;
import h20.C16666h2;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16721q3;
import h20.C16756w2;
import h20.C16773z1;
import h20.EnumC16673i3;
import h20.InterfaceC16630b2;
import i20.C17928b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import jh3.AbstractC21702c;
import mn.C25704b;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p599wz.C37709d0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import py.C29612a;
import py.C29613b;
import py.C29614c;
import py.C29615d;
import y00.AbstractC38963t7;
import y00.EnumC38853i;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: my.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26027a implements Parcelable {
    public static final Parcelable.Creator<C26027a> CREATOR = new C25704b(3);

    /* JADX INFO: renamed from: E */
    public final C16671i1 f102950E;

    /* JADX INFO: renamed from: F */
    public final C17928b f102951F;

    /* JADX INFO: renamed from: G */
    public final boolean f102952G;

    /* JADX INFO: renamed from: H */
    public final boolean f102953H;

    /* JADX INFO: renamed from: I */
    public final C16689l1 f102954I;

    /* JADX INFO: renamed from: J */
    public final List f102955J;

    /* JADX INFO: renamed from: K */
    public final boolean f102956K;

    /* JADX INFO: renamed from: L */
    public final List f102957L;

    /* JADX INFO: renamed from: M */
    public final List f102958M;

    /* JADX INFO: renamed from: N */
    public final AbstractC16737t1 f102959N;

    /* JADX INFO: renamed from: O */
    public final List f102960O;

    /* JADX INFO: renamed from: P */
    public final List f102961P;

    /* JADX INFO: renamed from: Q */
    public final C16661g3 f102962Q;

    /* JADX INFO: renamed from: R */
    public final String f102963R;

    /* JADX INFO: renamed from: S */
    public final C37709d0 f102964S;

    /* JADX INFO: renamed from: T */
    public final Map f102965T;

    /* JADX INFO: renamed from: U */
    public final C16721q3 f102966U;

    /* JADX INFO: renamed from: V */
    public final boolean f102967V;

    /* JADX INFO: renamed from: W */
    public final String f102968W;

    /* JADX INFO: renamed from: X */
    public final C16665h1 f102969X;

    /* JADX INFO: renamed from: w */
    public final String f102970w;

    /* JADX INFO: renamed from: x */
    public final C16636c2 f102971x;

    /* JADX INFO: renamed from: y */
    public final C16666h2 f102972y;

    /* JADX INFO: renamed from: z */
    public final C16756w2 f102973z;

    public C26027a(String merchantDisplayName, C16636c2 c16636c2, C16666h2 c16666h2, C16756w2 link, C16671i1 c16671i1, C17928b c17928b, boolean z4, boolean z13, C16689l1 billingDetailsCollectionConfiguration, List preferredNetworks, boolean z14, List paymentMethodOrder, List externalPaymentMethods, AbstractC16737t1 cardBrandAcceptance, List allowedCardFundingTypes, List customPaymentMethods, C16661g3 c16661g3, String str, C37709d0 c37709d0, Map termsDisplay, C16721q3 c16721q3, boolean z15, String str2, C16665h1 appearance) {
        AbstractC22676k.m65750j(merchantDisplayName, "merchantDisplayName");
        AbstractC22676k.m65750j(link, "link");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(cardBrandAcceptance, "cardBrandAcceptance");
        AbstractC22676k.m65750j(allowedCardFundingTypes, "allowedCardFundingTypes");
        AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
        AbstractC22676k.m65750j(termsDisplay, "termsDisplay");
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f102970w = merchantDisplayName;
        this.f102971x = c16636c2;
        this.f102972y = c16666h2;
        this.f102973z = link;
        this.f102950E = c16671i1;
        this.f102951F = c17928b;
        this.f102952G = z4;
        this.f102953H = z13;
        this.f102954I = billingDetailsCollectionConfiguration;
        this.f102955J = preferredNetworks;
        this.f102956K = z14;
        this.f102957L = paymentMethodOrder;
        this.f102958M = externalPaymentMethods;
        this.f102959N = cardBrandAcceptance;
        this.f102960O = allowedCardFundingTypes;
        this.f102961P = customPaymentMethods;
        this.f102962Q = c16661g3;
        this.f102963R = str;
        this.f102964S = c37709d0;
        this.f102965T = termsDisplay;
        this.f102966U = c16721q3;
        this.f102967V = z15;
        this.f102968W = str2;
        this.f102969X = appearance;
    }

    /* JADX INFO: renamed from: b */
    public final void m77435b(String callbackIdentifier, boolean z4) {
        Object obj;
        String str;
        AbstractC22676k.m65750j(callbackIdentifier, "callbackIdentifier");
        if (AbstractC39414r.m125890i0(this.f102970w)) {
            throw new IllegalArgumentException("When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string.");
        }
        C16636c2 c16636c2 = this.f102971x;
        if (c16636c2 != null && (str = c16636c2.f63983w) != null && AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
        }
        for (String str2 : this.f102958M) {
            if (!AbstractC39421y.m125930O(str2, "external_", false) && !z4) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("External payment method '", str2, "' does not start with 'external_'. All external payment methods must use the 'external_' prefix. See https://docs.stripe.com/payments/external-payment-methods?platform=android#available-external-payment-methods"));
            }
        }
        AbstractC11464a.m30761a(callbackIdentifier);
        if (c16636c2 != null) {
            String input = c16636c2.f63984x;
            InterfaceC16630b2 interfaceC16630b2 = c16636c2.f63985y;
            if (interfaceC16630b2 != null) {
                if (interfaceC16630b2 instanceof C16624a2) {
                    String str3 = ((C16624a2) interfaceC16630b2).f63959w;
                    if (!AbstractC22676k.m65745e(str3, input)) {
                        throw new IllegalArgumentException("Conflicting ephemeralKeySecrets between CustomerConfiguration and CustomerConfiguration.customerAccessType");
                    }
                    if (AbstractC39414r.m125890i0(str3) || AbstractC39414r.m125890i0(input)) {
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
                    }
                    Pattern patternCompile = Pattern.compile("^ek_[^_](.)+$");
                    AbstractC22676k.m65749i(patternCompile, "compile(...)");
                    if (patternCompile.matcher(str3).matches()) {
                        Pattern patternCompile2 = Pattern.compile("^ek_[^_](.)+$");
                        AbstractC22676k.m65749i(patternCompile2, "compile(...)");
                        AbstractC22676k.m65750j(input, "input");
                        if (patternCompile2.matcher(input).matches()) {
                            return;
                        }
                    }
                    throw new IllegalArgumentException("`ephemeralKeySecret` format does not match expected client secret formatting");
                }
                if (!(interfaceC16630b2 instanceof C16773z1)) {
                    throw new NoWhenBranchMatchedException();
                }
                String customerSessionClientSecret = ((C16773z1) interfaceC16630b2).f64473w;
                AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
                if (AbstractC39414r.m125890i0(customerSessionClientSecret)) {
                    obj = C29612a.f120955a;
                } else if (AbstractC39421y.m125930O(customerSessionClientSecret, "ek_", false)) {
                    obj = C29613b.f120956a;
                } else {
                    obj = !AbstractC39421y.m125930O(customerSessionClientSecret, "cuss_", false) ? C29614c.f120957a : C29615d.f120958a;
                }
                if (obj instanceof C29612a) {
                    throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the customerSessionClientSecret cannot be an empty string.");
                }
                if (obj instanceof C29613b) {
                    throw new IllegalArgumentException("Argument looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                }
                if (obj instanceof C29614c) {
                    throw new IllegalArgumentException("Argument does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                }
                if (!(obj instanceof C29615d)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26027a)) {
            return false;
        }
        C26027a c26027a = (C26027a) obj;
        return AbstractC22676k.m65745e(this.f102970w, c26027a.f102970w) && AbstractC22676k.m65745e(this.f102971x, c26027a.f102971x) && AbstractC22676k.m65745e(this.f102972y, c26027a.f102972y) && AbstractC22676k.m65745e(this.f102973z, c26027a.f102973z) && AbstractC22676k.m65745e(this.f102950E, c26027a.f102950E) && AbstractC22676k.m65745e(this.f102951F, c26027a.f102951F) && this.f102952G == c26027a.f102952G && this.f102953H == c26027a.f102953H && AbstractC22676k.m65745e(this.f102954I, c26027a.f102954I) && AbstractC22676k.m65745e(this.f102955J, c26027a.f102955J) && this.f102956K == c26027a.f102956K && AbstractC22676k.m65745e(this.f102957L, c26027a.f102957L) && AbstractC22676k.m65745e(this.f102958M, c26027a.f102958M) && AbstractC22676k.m65745e(this.f102959N, c26027a.f102959N) && AbstractC22676k.m65745e(this.f102960O, c26027a.f102960O) && AbstractC22676k.m65745e(this.f102961P, c26027a.f102961P) && AbstractC22676k.m65745e(this.f102962Q, c26027a.f102962Q) && AbstractC22676k.m65745e(this.f102963R, c26027a.f102963R) && AbstractC22676k.m65745e(this.f102964S, c26027a.f102964S) && AbstractC22676k.m65745e(this.f102965T, c26027a.f102965T) && AbstractC22676k.m65745e(this.f102966U, c26027a.f102966U) && this.f102967V == c26027a.f102967V && AbstractC22676k.m65745e(this.f102968W, c26027a.f102968W) && AbstractC22676k.m65745e(this.f102969X, c26027a.f102969X);
    }

    public final int hashCode() {
        int iHashCode = this.f102970w.hashCode() * 31;
        C16636c2 c16636c2 = this.f102971x;
        int iHashCode2 = (iHashCode + (c16636c2 == null ? 0 : c16636c2.hashCode())) * 31;
        C16666h2 c16666h2 = this.f102972y;
        int iHashCode3 = (this.f102973z.hashCode() + ((iHashCode2 + (c16666h2 == null ? 0 : c16666h2.hashCode())) * 31)) * 31;
        C16671i1 c16671i1 = this.f102950E;
        int iHashCode4 = (iHashCode3 + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f102951F;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.f102959N.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11895b.m31983b((this.f102954I.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode4 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f102952G), 31, this.f102953H)) * 31, 31, this.f102955J), 31, this.f102956K), 31, this.f102957L), 31, this.f102958M)) * 31, 31, this.f102960O), 31, this.f102961P);
        C16661g3 c16661g3 = this.f102962Q;
        int iHashCode5 = (iM31983b + (c16661g3 == null ? 0 : c16661g3.hashCode())) * 31;
        String str = this.f102963R;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        C37709d0 c37709d0 = this.f102964S;
        int iM11821e = AbstractC3855a.m11821e(this.f102965T, (iHashCode6 + (c37709d0 == null ? 0 : c37709d0.hashCode())) * 31, 31);
        C16721q3 c16721q3 = this.f102966U;
        int iM8289b = AbstractC2875y.m8289b((iM11821e + (c16721q3 == null ? 0 : c16721q3.hashCode())) * 31, 31, this.f102967V);
        String str2 = this.f102968W;
        return this.f102969X.hashCode() + ((iM8289b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CommonConfiguration(merchantDisplayName=");
        sb4.append(this.f102970w);
        sb4.append(", customer=");
        sb4.append(this.f102971x);
        sb4.append(", googlePay=");
        sb4.append(this.f102972y);
        sb4.append(", link=");
        sb4.append(this.f102973z);
        sb4.append(", defaultBillingDetails=");
        sb4.append(this.f102950E);
        sb4.append(", shippingDetails=");
        sb4.append(this.f102951F);
        sb4.append(", allowsDelayedPaymentMethods=");
        AbstractC38963t7.m124392v(sb4, this.f102952G, ", allowsPaymentMethodsRequiringShippingAddress=", this.f102953H, ", billingDetailsCollectionConfiguration=");
        sb4.append(this.f102954I);
        sb4.append(", preferredNetworks=");
        sb4.append(this.f102955J);
        sb4.append(", allowsRemovalOfLastSavedPaymentMethod=");
        AbstractC25012a.m73391x(", paymentMethodOrder=", ", externalPaymentMethods=", sb4, this.f102957L, this.f102956K);
        sb4.append(this.f102958M);
        sb4.append(", cardBrandAcceptance=");
        sb4.append(this.f102959N);
        sb4.append(", allowedCardFundingTypes=");
        AbstractC21702c.m61148s(sb4, this.f102960O, ", customPaymentMethods=", this.f102961P, ", shopPayConfiguration=");
        sb4.append(this.f102962Q);
        sb4.append(", googlePlacesApiKey=");
        sb4.append(this.f102963R);
        sb4.append(", linkAppearance=");
        sb4.append(this.f102964S);
        sb4.append(", termsDisplay=");
        sb4.append(this.f102965T);
        sb4.append(", walletButtons=");
        sb4.append(this.f102966U);
        sb4.append(", opensCardScannerAutomatically=");
        sb4.append(this.f102967V);
        sb4.append(", userOverrideCountry=");
        sb4.append(this.f102968W);
        sb4.append(", appearance=");
        sb4.append(this.f102969X);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f102970w);
        dest.writeParcelable(this.f102971x, i13);
        dest.writeParcelable(this.f102972y, i13);
        dest.writeParcelable(this.f102973z, i13);
        dest.writeParcelable(this.f102950E, i13);
        dest.writeParcelable(this.f102951F, i13);
        dest.writeInt(this.f102952G ? 1 : 0);
        dest.writeInt(this.f102953H ? 1 : 0);
        dest.writeParcelable(this.f102954I, i13);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f102955J, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC38853i) itM30863o.next()).name());
        }
        dest.writeInt(this.f102956K ? 1 : 0);
        dest.writeStringList(this.f102957L);
        dest.writeStringList(this.f102958M);
        dest.writeParcelable(this.f102959N, i13);
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f102960O, dest);
        while (itM30863o2.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o2.next(), i13);
        }
        Iterator itM30863o3 = AbstractC11478a.m30863o(this.f102961P, dest);
        while (itM30863o3.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o3.next(), i13);
        }
        dest.writeParcelable(this.f102962Q, i13);
        dest.writeString(this.f102963R);
        dest.writeParcelable(this.f102964S, i13);
        Map map = this.f102965T;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i13);
            dest.writeString(((EnumC16673i3) entry.getValue()).name());
        }
        dest.writeParcelable(this.f102966U, i13);
        dest.writeInt(this.f102967V ? 1 : 0);
        dest.writeString(this.f102968W);
        dest.writeParcelable(this.f102969X, i13);
    }
}
