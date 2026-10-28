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

/* JADX INFO: renamed from: y00.a2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38776a2 implements InterfaceC38786b2 {
    public static final Parcelable.Creator<C38776a2> CREATOR = new C38992x0(19);

    /* JADX INFO: renamed from: E */
    public final String f166902E;

    /* JADX INFO: renamed from: F */
    public final String f166903F;

    /* JADX INFO: renamed from: G */
    public final List f166904G;

    /* JADX INFO: renamed from: H */
    public final List f166905H;

    /* JADX INFO: renamed from: I */
    public final String f166906I;

    /* JADX INFO: renamed from: J */
    public final C38993x1 f166907J;

    /* JADX INFO: renamed from: K */
    public final String f166908K;

    /* JADX INFO: renamed from: w */
    public final String f166909w;

    /* JADX INFO: renamed from: x */
    public final String f166910x;

    /* JADX INFO: renamed from: y */
    public final String f166911y;

    /* JADX INFO: renamed from: z */
    public final String f166912z;

    public C38776a2(String clientSecret, String str, String str2, String str3, String str4, String str5, ArrayList customPaymentMethods, List externalPaymentMethods, String appId, C38993x1 link, String str6) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(appId, "appId");
        AbstractC22676k.m65750j(link, "link");
        this.f166909w = clientSecret;
        this.f166910x = str;
        this.f166911y = str2;
        this.f166912z = str3;
        this.f166902E = str4;
        this.f166903F = str5;
        this.f166904G = customPaymentMethods;
        this.f166905H = externalPaymentMethods;
        this.f166906I = appId;
        this.f166907J = link;
        this.f166908K = str6;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: E */
    public final String mo124313E() {
        return this.f166911y;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: Q */
    public final String mo124314Q() {
        return this.f166903F;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: U */
    public final C38993x1 mo124315U() {
        return this.f166907J;
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
        if (!(obj instanceof C38776a2)) {
            return false;
        }
        C38776a2 c38776a2 = (C38776a2) obj;
        return AbstractC22676k.m65745e(this.f166909w, c38776a2.f166909w) && AbstractC22676k.m65745e(this.f166910x, c38776a2.f166910x) && AbstractC22676k.m65745e(this.f166911y, c38776a2.f166911y) && AbstractC22676k.m65745e(this.f166912z, c38776a2.f166912z) && AbstractC22676k.m65745e(this.f166902E, c38776a2.f166902E) && AbstractC22676k.m65745e(this.f166903F, c38776a2.f166903F) && AbstractC22676k.m65745e(this.f166904G, c38776a2.f166904G) && AbstractC22676k.m65745e(this.f166905H, c38776a2.f166905H) && AbstractC22676k.m65745e(this.f166906I, c38776a2.f166906I) && AbstractC22676k.m65745e(this.f166907J, c38776a2.f166907J) && AbstractC22676k.m65745e(this.f166908K, c38776a2.f166908K);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: f0 */
    public final List mo124317f0() {
        return AbstractC37056f.m118958J("payment_method_preference.setup_intent.payment_method");
    }

    @Override // y00.InterfaceC38786b2
    public final String getClientSecret() {
        return this.f166909w;
    }

    @Override // y00.InterfaceC38786b2
    public final String getType() {
        return "setup_intent";
    }

    public final int hashCode() {
        int iHashCode = this.f166909w.hashCode() * 31;
        String str = this.f166910x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166911y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166912z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f166902E;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f166903F;
        int iM73368a = AbstractC25012a.m73368a(this.f166907J.f167840w, AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f166904G), 31, this.f166905H), 31, this.f166906I), 31);
        String str6 = this.f166908K;
        return iM73368a + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: l */
    public final String mo124318l() {
        return this.f166912z;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r */
    public final List mo124319r() {
        return this.f166905H;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r0 */
    public final String mo124320r0() {
        return this.f166906I;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: s0 */
    public final String mo124321s0() {
        return this.f166910x;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t */
    public final String mo124322t() {
        return this.f166902E;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t0 */
    public final List mo124323t0() {
        return this.f166904G;
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SetupIntentType(clientSecret=", this.f166909w, ", locale=", this.f166910x, ", customerSessionClientSecret=");
        AbstractC11266d.m30444B(sbM32001t, this.f166911y, ", legacyCustomerEphemeralKey=", this.f166912z, ", savedPaymentMethodSelectionId=");
        AbstractC11266d.m30444B(sbM32001t, this.f166902E, ", mobileSessionId=", this.f166903F, ", customPaymentMethods=");
        AbstractC21702c.m61148s(sbM32001t, this.f166904G, ", externalPaymentMethods=", this.f166905H, ", appId=");
        sbM32001t.append(this.f166906I);
        sbM32001t.append(", link=");
        sbM32001t.append(this.f166907J);
        sbM32001t.append(", countryOverride=");
        return AbstractC25012a.m73376i(this.f166908K, ")", sbM32001t);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: u0 */
    public final String mo124324u0() {
        return this.f166908K;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166909w);
        dest.writeString(this.f166910x);
        dest.writeString(this.f166911y);
        dest.writeString(this.f166912z);
        dest.writeString(this.f166902E);
        dest.writeString(this.f166903F);
        dest.writeStringList(this.f166904G);
        dest.writeStringList(this.f166905H);
        dest.writeString(this.f166906I);
        this.f166907J.writeToParcel(dest, i13);
        dest.writeString(this.f166908K);
    }
}
