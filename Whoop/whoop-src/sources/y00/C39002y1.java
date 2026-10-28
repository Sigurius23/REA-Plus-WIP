package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import jh3.AbstractC21702c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.y1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39002y1 implements InterfaceC38786b2 {
    public static final Parcelable.Creator<C39002y1> CREATOR = new C38992x0(17);

    /* JADX INFO: renamed from: E */
    public final String f167872E;

    /* JADX INFO: renamed from: F */
    public final String f167873F;

    /* JADX INFO: renamed from: G */
    public final List f167874G;

    /* JADX INFO: renamed from: H */
    public final List f167875H;

    /* JADX INFO: renamed from: I */
    public final String f167876I;

    /* JADX INFO: renamed from: J */
    public final C38993x1 f167877J;

    /* JADX INFO: renamed from: K */
    public final String f167878K;

    /* JADX INFO: renamed from: w */
    public final String f167879w;

    /* JADX INFO: renamed from: x */
    public final String f167880x;

    /* JADX INFO: renamed from: y */
    public final String f167881y;

    /* JADX INFO: renamed from: z */
    public final String f167882z;

    public C39002y1(String clientSecret, String str, String str2, String str3, String str4, String str5, ArrayList customPaymentMethods, List externalPaymentMethods, String appId, C38993x1 link, String str6) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(appId, "appId");
        AbstractC22676k.m65750j(link, "link");
        this.f167879w = clientSecret;
        this.f167880x = str;
        this.f167881y = str2;
        this.f167882z = str3;
        this.f167872E = str4;
        this.f167873F = str5;
        this.f167874G = customPaymentMethods;
        this.f167875H = externalPaymentMethods;
        this.f167876I = appId;
        this.f167877J = link;
        this.f167878K = str6;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: E */
    public final String mo124313E() {
        return this.f167881y;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: Q */
    public final String mo124314Q() {
        return this.f167873F;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: U */
    public final C38993x1 mo124315U() {
        return this.f167877J;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: W */
    public final C39011z1 mo124316W() {
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
        if (!(obj instanceof C39002y1)) {
            return false;
        }
        C39002y1 c39002y1 = (C39002y1) obj;
        return AbstractC22676k.m65745e(this.f167879w, c39002y1.f167879w) && AbstractC22676k.m65745e(this.f167880x, c39002y1.f167880x) && AbstractC22676k.m65745e(this.f167881y, c39002y1.f167881y) && AbstractC22676k.m65745e(this.f167882z, c39002y1.f167882z) && AbstractC22676k.m65745e(this.f167872E, c39002y1.f167872E) && AbstractC22676k.m65745e(this.f167873F, c39002y1.f167873F) && AbstractC22676k.m65745e(this.f167874G, c39002y1.f167874G) && AbstractC22676k.m65745e(this.f167875H, c39002y1.f167875H) && AbstractC22676k.m65745e(this.f167876I, c39002y1.f167876I) && AbstractC22676k.m65745e(this.f167877J, c39002y1.f167877J) && AbstractC22676k.m65745e(this.f167878K, c39002y1.f167878K);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: f0 */
    public final List mo124317f0() {
        return AbstractC37056f.m118958J("payment_method_preference.payment_intent.payment_method");
    }

    @Override // y00.InterfaceC38786b2
    public final String getClientSecret() {
        return this.f167879w;
    }

    @Override // y00.InterfaceC38786b2
    public final String getType() {
        return "payment_intent";
    }

    public final int hashCode() {
        int iHashCode = this.f167879w.hashCode() * 31;
        String str = this.f167880x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167881y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167882z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167872E;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167873F;
        int iM73368a = AbstractC25012a.m73368a(this.f167877J.f167840w, AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f167874G), 31, this.f167875H), 31, this.f167876I), 31);
        String str6 = this.f167878K;
        return iM73368a + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: l */
    public final String mo124318l() {
        return this.f167882z;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r */
    public final List mo124319r() {
        return this.f167875H;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r0 */
    public final String mo124320r0() {
        return this.f167876I;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: s0 */
    public final String mo124321s0() {
        return this.f167880x;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t */
    public final String mo124322t() {
        return this.f167872E;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t0 */
    public final List mo124323t0() {
        return this.f167874G;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentIntentType(clientSecret=", this.f167879w, ", locale=", this.f167880x, ", customerSessionClientSecret=");
        AbstractC11266d.m30444B(sbM32001t, this.f167881y, ", legacyCustomerEphemeralKey=", this.f167882z, ", savedPaymentMethodSelectionId=");
        AbstractC11266d.m30444B(sbM32001t, this.f167872E, ", mobileSessionId=", this.f167873F, ", customPaymentMethods=");
        AbstractC21702c.m61148s(sbM32001t, this.f167874G, ", externalPaymentMethods=", this.f167875H, ", appId=");
        sbM32001t.append(this.f167876I);
        sbM32001t.append(", link=");
        sbM32001t.append(this.f167877J);
        sbM32001t.append(", countryOverride=");
        return AbstractC25012a.m73376i(this.f167878K, ")", sbM32001t);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: u0 */
    public final String mo124324u0() {
        return this.f167878K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167879w);
        dest.writeString(this.f167880x);
        dest.writeString(this.f167881y);
        dest.writeString(this.f167882z);
        dest.writeString(this.f167872E);
        dest.writeString(this.f167873F);
        dest.writeStringList(this.f167874G);
        dest.writeStringList(this.f167875H);
        dest.writeString(this.f167876I);
        this.f167877J.writeToParcel(dest, i13);
        dest.writeString(this.f167878K);
    }
}
