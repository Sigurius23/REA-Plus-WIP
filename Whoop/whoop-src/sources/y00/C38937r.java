package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C38937r implements InterfaceC38946s {
    public static final Parcelable.Creator<C38937r> CREATOR = new C38873k(5);

    /* JADX INFO: renamed from: E */
    public final boolean f167609E;

    /* JADX INFO: renamed from: F */
    public final String f167610F;

    /* JADX INFO: renamed from: G */
    public final C38994x2 f167611G;

    /* JADX INFO: renamed from: H */
    public final Boolean f167612H;

    /* JADX INFO: renamed from: I */
    public final String f167613I;

    /* JADX INFO: renamed from: J */
    public final AbstractC38970u5 f167614J;

    /* JADX INFO: renamed from: K */
    public final C38780a6 f167615K;

    /* JADX INFO: renamed from: L */
    public final C38901n f167616L;

    /* JADX INFO: renamed from: M */
    public final String f167617M;

    /* JADX INFO: renamed from: w */
    public final String f167618w;

    /* JADX INFO: renamed from: x */
    public final String f167619x;

    /* JADX INFO: renamed from: y */
    public final C38809d5 f167620y;

    /* JADX INFO: renamed from: z */
    public String f167621z;

    public C38937r(String clientSecret, String str, C38809d5 c38809d5, String str2, boolean z4, String str3, C38994x2 c38994x2, Boolean bool, String str4, AbstractC38970u5 abstractC38970u5, C38780a6 c38780a6, C38901n c38901n, String str5) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f167618w = clientSecret;
        this.f167619x = str;
        this.f167620y = c38809d5;
        this.f167621z = str2;
        this.f167609E = z4;
        this.f167610F = str3;
        this.f167611G = c38994x2;
        this.f167612H = bool;
        this.f167613I = str4;
        this.f167614J = abstractC38970u5;
        this.f167615K = c38780a6;
        this.f167616L = c38901n;
        this.f167617M = str5;
    }

    @Override // y00.InterfaceC38946s
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C38937r mo124367w0() {
        String str = this.f167621z;
        String clientSecret = this.f167618w;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        return new C38937r(clientSecret, this.f167619x, this.f167620y, str, true, this.f167610F, this.f167611G, this.f167612H, this.f167613I, null, this.f167615K, this.f167616L, this.f167617M, 512);
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Map mapM124385o;
        Map mapM95645u;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("client_secret", this.f167618w), new C23465k("use_stripe_sdk", Boolean.valueOf(this.f167609E)));
        String str = this.f167621z;
        Map mapM95645u2 = str != null ? AbstractC31061c.m95645u("return_url", str) : null;
        Map map = C25272z.f99163w;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM73990Y, mapM95645u2);
        String str2 = this.f167610F;
        Map mapM95645u3 = str2 != null ? AbstractC31061c.m95645u("mandate", str2) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u3);
        C38809d5 c38809d5 = this.f167620y;
        C38994x2 c38994x2 = this.f167611G;
        if (c38994x2 != null) {
            mapM124385o = c38994x2.mo124325c0();
        } else {
            mapM124385o = (c38809d5 != null && c38809d5.f167027x && str2 == null) ? AbstractC38963t7.m124385o("customer_acceptance", AbstractC25247g0.m73990Y(new C23465k("type", "online"), new C23465k("online", AbstractC36095b.m114688p(Boolean.TRUE, "infer_from_client")))) : null;
        }
        Map mapM124385o2 = mapM124385o != null ? AbstractC38963t7.m124385o("mandate_data", mapM124385o) : null;
        if (mapM124385o2 == null) {
            mapM124385o2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM124385o2);
        Boolean bool = this.f167612H;
        Map mapM114688p = bool != null ? AbstractC36095b.m114688p(bool, "set_as_default_payment_method") : null;
        if (mapM114688p == null) {
            mapM114688p = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM114688p);
        C38780a6 c38780a6 = this.f167615K;
        Map mapM124385o3 = c38780a6 != null ? AbstractC38963t7.m124385o("radar_options", c38780a6.mo124325c0()) : null;
        if (mapM124385o3 == null) {
            mapM124385o3 = map;
        }
        LinkedHashMap linkedHashMapM73995d4 = AbstractC25247g0.m73995d0(linkedHashMapM73995d3, mapM124385o3);
        if (c38809d5 != null) {
            mapM95645u = AbstractC38963t7.m124385o("payment_method_data", c38809d5.mo124325c0());
        } else {
            String str3 = this.f167619x;
            if (str3 != null) {
                mapM95645u = AbstractC31061c.m95645u("payment_method", str3);
            } else {
                String str4 = this.f167617M;
                mapM95645u = str4 != null ? AbstractC31061c.m95645u("confirmation_token", str4) : map;
            }
        }
        LinkedHashMap linkedHashMapM73995d5 = AbstractC25247g0.m73995d0(linkedHashMapM73995d4, mapM95645u);
        C38901n c38901n = this.f167616L;
        Map mapM124385o4 = c38901n != null ? AbstractC38963t7.m124385o("client_attribution_metadata", c38901n.mo124325c0()) : null;
        if (mapM124385o4 != null) {
            map = mapM124385o4;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d5, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38937r)) {
            return false;
        }
        C38937r c38937r = (C38937r) obj;
        return AbstractC22676k.m65745e(this.f167618w, c38937r.f167618w) && AbstractC22676k.m65745e(this.f167619x, c38937r.f167619x) && AbstractC22676k.m65745e(this.f167620y, c38937r.f167620y) && AbstractC22676k.m65745e(this.f167621z, c38937r.f167621z) && this.f167609E == c38937r.f167609E && AbstractC22676k.m65745e(this.f167610F, c38937r.f167610F) && AbstractC22676k.m65745e(this.f167611G, c38937r.f167611G) && AbstractC22676k.m65745e(this.f167612H, c38937r.f167612H) && AbstractC22676k.m65745e(this.f167613I, c38937r.f167613I) && AbstractC22676k.m65745e(this.f167614J, c38937r.f167614J) && AbstractC22676k.m65745e(this.f167615K, c38937r.f167615K) && AbstractC22676k.m65745e(this.f167616L, c38937r.f167616L) && AbstractC22676k.m65745e(this.f167617M, c38937r.f167617M);
    }

    @Override // y00.InterfaceC38946s
    public final /* synthetic */ String getClientSecret() {
        return this.f167618w;
    }

    @Override // y00.InterfaceC38946s
    public final String getReturnUrl() {
        return this.f167621z;
    }

    public final int hashCode() {
        int iHashCode = this.f167618w.hashCode() * 31;
        String str = this.f167619x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C38809d5 c38809d5 = this.f167620y;
        int iHashCode3 = (iHashCode2 + (c38809d5 == null ? 0 : c38809d5.hashCode())) * 31;
        String str2 = this.f167621z;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f167609E);
        String str3 = this.f167610F;
        int iHashCode4 = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
        C38994x2 c38994x2 = this.f167611G;
        int iHashCode5 = (iHashCode4 + (c38994x2 == null ? 0 : c38994x2.f167841w.hashCode())) * 31;
        Boolean bool = this.f167612H;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f167613I;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        AbstractC38970u5 abstractC38970u5 = this.f167614J;
        int iHashCode8 = (iHashCode7 + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        C38780a6 c38780a6 = this.f167615K;
        int iHashCode9 = (iHashCode8 + (c38780a6 == null ? 0 : c38780a6.hashCode())) * 31;
        C38901n c38901n = this.f167616L;
        int iHashCode10 = (iHashCode9 + (c38901n == null ? 0 : c38901n.hashCode())) * 31;
        String str5 = this.f167617M;
        return iHashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f167621z;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConfirmSetupIntentParams(clientSecret=", this.f167618w, ", paymentMethodId=", this.f167619x, ", paymentMethodCreateParams=");
        sbM32001t.append(this.f167620y);
        sbM32001t.append(", returnUrl=");
        sbM32001t.append(str);
        sbM32001t.append(", useStripeSdk=");
        AbstractC38963t7.m124391u(sbM32001t, this.f167609E, ", mandateId=", this.f167610F, ", mandateData=");
        sbM32001t.append(this.f167611G);
        sbM32001t.append(", setAsDefaultPaymentMethod=");
        sbM32001t.append(this.f167612H);
        sbM32001t.append(", paymentMethodCode=");
        sbM32001t.append(this.f167613I);
        sbM32001t.append(", paymentMethodOptions=");
        sbM32001t.append(this.f167614J);
        sbM32001t.append(", radarOptions=");
        sbM32001t.append(this.f167615K);
        sbM32001t.append(", clientAttributionMetadata=");
        sbM32001t.append(this.f167616L);
        sbM32001t.append(", confirmationTokenId=");
        return AbstractC25012a.m73376i(this.f167617M, ")", sbM32001t);
    }

    @Override // y00.InterfaceC38946s
    /* JADX INFO: renamed from: v0 */
    public final void mo124366v0(String str) {
        this.f167621z = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167618w);
        dest.writeString(this.f167619x);
        C38809d5 c38809d5 = this.f167620y;
        if (c38809d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38809d5.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167621z);
        dest.writeInt(this.f167609E ? 1 : 0);
        dest.writeString(this.f167610F);
        C38994x2 c38994x2 = this.f167611G;
        if (c38994x2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38994x2.writeToParcel(dest, i13);
        }
        Boolean bool = this.f167612H;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        dest.writeString(this.f167613I);
        dest.writeParcelable(this.f167614J, i13);
        C38780a6 c38780a6 = this.f167615K;
        if (c38780a6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38780a6.writeToParcel(dest, i13);
        }
        C38901n c38901n = this.f167616L;
        if (c38901n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38901n.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167617M);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38937r(String str, String str2, C38809d5 c38809d5, String str3, boolean z4, String str4, C38994x2 c38994x2, Boolean bool, String str5, C38889l5 c38889l5, C38780a6 c38780a6, C38901n c38901n, String str6, int i13) {
        String str7;
        String str8 = (i13 & 2) != 0 ? null : str2;
        C38809d5 c38809d6 = (i13 & 4) != 0 ? null : c38809d5;
        String str9 = (i13 & 8) != 0 ? null : str3;
        boolean z13 = (i13 & 16) != 0 ? false : z4;
        String str10 = (i13 & 32) != 0 ? null : str4;
        C38994x2 c38994x3 = (i13 & 64) != 0 ? null : c38994x2;
        Boolean bool2 = (i13 & 128) != 0 ? null : bool;
        if ((i13 & 256) != 0) {
            str7 = c38809d6 != null ? c38809d6.f167026w : null;
        } else {
            str7 = str5;
        }
        this(str, str8, c38809d6, str9, z13, str10, c38994x3, bool2, str7, (i13 & 512) != 0 ? null : c38889l5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c38780a6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c38901n, (i13 & 4096) != 0 ? null : str6);
    }
}
