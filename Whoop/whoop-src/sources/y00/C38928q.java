package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.profileinstaller.ProfileVerifier;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C38928q implements InterfaceC38946s {
    public static final Parcelable.Creator<C38928q> CREATOR = new C38873k(3);

    /* JADX INFO: renamed from: E */
    public final String f167561E;

    /* JADX INFO: renamed from: F */
    public String f167562F;

    /* JADX INFO: renamed from: G */
    public final Boolean f167563G;

    /* JADX INFO: renamed from: H */
    public final boolean f167564H;

    /* JADX INFO: renamed from: I */
    public final AbstractC38970u5 f167565I;

    /* JADX INFO: renamed from: J */
    public final String f167566J;

    /* JADX INFO: renamed from: K */
    public final C38994x2 f167567K;

    /* JADX INFO: renamed from: L */
    public final EnumC38910o f167568L;

    /* JADX INFO: renamed from: M */
    public final C38919p f167569M;

    /* JADX INFO: renamed from: N */
    public final String f167570N;

    /* JADX INFO: renamed from: O */
    public final Boolean f167571O;

    /* JADX INFO: renamed from: P */
    public final String f167572P;

    /* JADX INFO: renamed from: Q */
    public final C38780a6 f167573Q;

    /* JADX INFO: renamed from: R */
    public final C38901n f167574R;

    /* JADX INFO: renamed from: S */
    public final String f167575S;

    /* JADX INFO: renamed from: w */
    public final C38809d5 f167576w;

    /* JADX INFO: renamed from: x */
    public final String f167577x;

    /* JADX INFO: renamed from: y */
    public final C38998x6 f167578y;

    /* JADX INFO: renamed from: z */
    public final String f167579z;

    public C38928q(C38809d5 c38809d5, String str, C38998x6 c38998x6, String str2, String clientSecret, String str3, Boolean bool, boolean z4, AbstractC38970u5 abstractC38970u5, String str4, C38994x2 c38994x2, EnumC38910o enumC38910o, C38919p c38919p, String str5, Boolean bool2, String str6, C38780a6 c38780a6, C38901n c38901n, String str7) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f167576w = c38809d5;
        this.f167577x = str;
        this.f167578y = c38998x6;
        this.f167579z = str2;
        this.f167561E = clientSecret;
        this.f167562F = str3;
        this.f167563G = bool;
        this.f167564H = z4;
        this.f167565I = abstractC38970u5;
        this.f167566J = str4;
        this.f167567K = c38994x2;
        this.f167568L = enumC38910o;
        this.f167569M = c38919p;
        this.f167570N = str5;
        this.f167571O = bool2;
        this.f167572P = str6;
        this.f167573Q = c38780a6;
        this.f167574R = c38901n;
        this.f167575S = str7;
    }

    @Override // y00.InterfaceC38946s
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C38928q mo124367w0() {
        String str = this.f167562F;
        String clientSecret = this.f167561E;
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        return new C38928q(this.f167576w, this.f167577x, this.f167578y, this.f167579z, clientSecret, str, this.f167563G, true, this.f167565I, this.f167566J, this.f167567K, this.f167568L, this.f167569M, this.f167570N, this.f167571O, this.f167572P, this.f167573Q, this.f167574R, this.f167575S);
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Map mapM124385o;
        Map mapM95645u;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("client_secret", this.f167561E), new C23465k("use_stripe_sdk", Boolean.valueOf(this.f167564H)));
        Boolean bool = this.f167563G;
        Map mapM114688p = bool != null ? AbstractC36095b.m114688p(bool, "save_payment_method") : null;
        Map map = C25272z.f99163w;
        if (mapM114688p == null) {
            mapM114688p = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM73990Y, mapM114688p);
        String str = this.f167566J;
        Map mapM95645u2 = str != null ? AbstractC31061c.m95645u("mandate", str) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u2);
        C38809d5 c38809d5 = this.f167576w;
        C38994x2 c38994x2 = this.f167567K;
        if (c38994x2 != null) {
            mapM124385o = c38994x2.mo124325c0();
        } else {
            mapM124385o = (c38809d5 != null && c38809d5.f167027x && str == null) ? AbstractC38963t7.m124385o("customer_acceptance", AbstractC25247g0.m73990Y(new C23465k("type", "online"), new C23465k("online", AbstractC36095b.m114688p(Boolean.TRUE, "infer_from_client")))) : null;
        }
        Map mapM124385o2 = mapM124385o != null ? AbstractC38963t7.m124385o("mandate_data", mapM124385o) : null;
        if (mapM124385o2 == null) {
            mapM124385o2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM124385o2);
        String str2 = this.f167562F;
        Map mapM95645u3 = str2 != null ? AbstractC31061c.m95645u("return_url", str2) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM95645u3);
        AbstractC38970u5 abstractC38970u5 = this.f167565I;
        Map mapM124385o3 = abstractC38970u5 != null ? AbstractC38963t7.m124385o("payment_method_options", abstractC38970u5.mo124325c0()) : null;
        if (mapM124385o3 == null) {
            mapM124385o3 = map;
        }
        LinkedHashMap linkedHashMapM73995d4 = AbstractC25247g0.m73995d0(linkedHashMapM73995d3, mapM124385o3);
        EnumC38910o enumC38910o = this.f167568L;
        Map mapM95645u4 = enumC38910o != null ? AbstractC31061c.m95645u("setup_future_usage", enumC38910o.f167492w) : null;
        if (mapM95645u4 == null) {
            mapM95645u4 = map;
        }
        LinkedHashMap linkedHashMapM73995d5 = AbstractC25247g0.m73995d0(linkedHashMapM73995d4, mapM95645u4);
        Boolean bool2 = this.f167571O;
        Map mapM114688p2 = bool2 != null ? AbstractC36095b.m114688p(bool2, "set_as_default_payment_method") : null;
        if (mapM114688p2 == null) {
            mapM114688p2 = map;
        }
        LinkedHashMap linkedHashMapM73995d6 = AbstractC25247g0.m73995d0(linkedHashMapM73995d5, mapM114688p2);
        C38919p c38919p = this.f167569M;
        Map mapM124385o4 = c38919p != null ? AbstractC38963t7.m124385o("shipping", c38919p.mo124325c0()) : null;
        if (mapM124385o4 == null) {
            mapM124385o4 = map;
        }
        LinkedHashMap linkedHashMapM73995d7 = AbstractC25247g0.m73995d0(linkedHashMapM73995d6, mapM124385o4);
        C38780a6 c38780a6 = this.f167573Q;
        Map mapM124385o5 = c38780a6 != null ? AbstractC38963t7.m124385o("radar_options", c38780a6.mo124325c0()) : null;
        if (mapM124385o5 == null) {
            mapM124385o5 = map;
        }
        LinkedHashMap linkedHashMapM73995d8 = AbstractC25247g0.m73995d0(linkedHashMapM73995d7, mapM124385o5);
        if (c38809d5 != null) {
            mapM95645u = AbstractC38963t7.m124385o("payment_method_data", c38809d5.mo124325c0());
        } else {
            String str3 = this.f167577x;
            if (str3 != null) {
                mapM95645u = AbstractC31061c.m95645u("payment_method", str3);
            } else {
                String str4 = this.f167575S;
                if (str4 != null) {
                    mapM95645u = AbstractC31061c.m95645u("confirmation_token", str4);
                } else {
                    C38998x6 c38998x6 = this.f167578y;
                    if (c38998x6 != null) {
                        mapM95645u = AbstractC38963t7.m124385o("source_data", c38998x6.mo124325c0());
                    } else {
                        String str5 = this.f167579z;
                        mapM95645u = str5 != null ? AbstractC31061c.m95645u("source", str5) : map;
                    }
                }
            }
        }
        LinkedHashMap linkedHashMapM73995d9 = AbstractC25247g0.m73995d0(linkedHashMapM73995d8, mapM95645u);
        String str6 = this.f167570N;
        Map mapM95645u5 = str6 != null ? AbstractC31061c.m95645u("receipt_email", str6) : null;
        if (mapM95645u5 == null) {
            mapM95645u5 = map;
        }
        LinkedHashMap linkedHashMapM73995d10 = AbstractC25247g0.m73995d0(linkedHashMapM73995d9, mapM95645u5);
        C38901n c38901n = this.f167574R;
        Map mapM124385o6 = c38901n != null ? AbstractC38963t7.m124385o("client_attribution_metadata", c38901n.mo124325c0()) : null;
        if (mapM124385o6 != null) {
            map = mapM124385o6;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d10, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38928q)) {
            return false;
        }
        C38928q c38928q = (C38928q) obj;
        return AbstractC22676k.m65745e(this.f167576w, c38928q.f167576w) && AbstractC22676k.m65745e(this.f167577x, c38928q.f167577x) && AbstractC22676k.m65745e(this.f167578y, c38928q.f167578y) && AbstractC22676k.m65745e(this.f167579z, c38928q.f167579z) && AbstractC22676k.m65745e(this.f167561E, c38928q.f167561E) && AbstractC22676k.m65745e(this.f167562F, c38928q.f167562F) && AbstractC22676k.m65745e(this.f167563G, c38928q.f167563G) && this.f167564H == c38928q.f167564H && AbstractC22676k.m65745e(this.f167565I, c38928q.f167565I) && AbstractC22676k.m65745e(this.f167566J, c38928q.f167566J) && AbstractC22676k.m65745e(this.f167567K, c38928q.f167567K) && this.f167568L == c38928q.f167568L && AbstractC22676k.m65745e(this.f167569M, c38928q.f167569M) && AbstractC22676k.m65745e(this.f167570N, c38928q.f167570N) && AbstractC22676k.m65745e(this.f167571O, c38928q.f167571O) && AbstractC22676k.m65745e(this.f167572P, c38928q.f167572P) && AbstractC22676k.m65745e(this.f167573Q, c38928q.f167573Q) && AbstractC22676k.m65745e(this.f167574R, c38928q.f167574R) && AbstractC22676k.m65745e(this.f167575S, c38928q.f167575S);
    }

    @Override // y00.InterfaceC38946s
    public final String getClientSecret() {
        return this.f167561E;
    }

    @Override // y00.InterfaceC38946s
    public final String getReturnUrl() {
        return this.f167562F;
    }

    public final int hashCode() {
        C38809d5 c38809d5 = this.f167576w;
        int iHashCode = (c38809d5 == null ? 0 : c38809d5.hashCode()) * 31;
        String str = this.f167577x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C38998x6 c38998x6 = this.f167578y;
        int iHashCode3 = (iHashCode2 + (c38998x6 == null ? 0 : c38998x6.hashCode())) * 31;
        String str2 = this.f167579z;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f167561E);
        String str3 = this.f167562F;
        int iHashCode4 = (iM30450d + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f167563G;
        int iM8289b = AbstractC2875y.m8289b((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f167564H);
        AbstractC38970u5 abstractC38970u5 = this.f167565I;
        int iHashCode5 = (iM8289b + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode())) * 31;
        String str4 = this.f167566J;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C38994x2 c38994x2 = this.f167567K;
        int iHashCode7 = (iHashCode6 + (c38994x2 == null ? 0 : c38994x2.f167841w.hashCode())) * 31;
        EnumC38910o enumC38910o = this.f167568L;
        int iHashCode8 = (iHashCode7 + (enumC38910o == null ? 0 : enumC38910o.hashCode())) * 31;
        C38919p c38919p = this.f167569M;
        int iHashCode9 = (iHashCode8 + (c38919p == null ? 0 : c38919p.hashCode())) * 31;
        String str5 = this.f167570N;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.f167571O;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f167572P;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C38780a6 c38780a6 = this.f167573Q;
        int iHashCode13 = (iHashCode12 + (c38780a6 == null ? 0 : c38780a6.hashCode())) * 31;
        C38901n c38901n = this.f167574R;
        int iHashCode14 = (iHashCode13 + (c38901n == null ? 0 : c38901n.hashCode())) * 31;
        String str7 = this.f167575S;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f167562F;
        StringBuilder sb4 = new StringBuilder("ConfirmPaymentIntentParams(paymentMethodCreateParams=");
        sb4.append(this.f167576w);
        sb4.append(", paymentMethodId=");
        sb4.append(this.f167577x);
        sb4.append(", sourceParams=");
        sb4.append(this.f167578y);
        sb4.append(", sourceId=");
        sb4.append(this.f167579z);
        sb4.append(", clientSecret=");
        AbstractC11266d.m30444B(sb4, this.f167561E, ", returnUrl=", str, ", savePaymentMethod=");
        sb4.append(this.f167563G);
        sb4.append(", useStripeSdk=");
        sb4.append(this.f167564H);
        sb4.append(", paymentMethodOptions=");
        sb4.append(this.f167565I);
        sb4.append(", mandateId=");
        sb4.append(this.f167566J);
        sb4.append(", mandateData=");
        sb4.append(this.f167567K);
        sb4.append(", setupFutureUsage=");
        sb4.append(this.f167568L);
        sb4.append(", shipping=");
        sb4.append(this.f167569M);
        sb4.append(", receiptEmail=");
        sb4.append(this.f167570N);
        sb4.append(", setAsDefaultPaymentMethod=");
        AbstractC13673n.m38576w(this.f167571O, ", paymentMethodCode=", this.f167572P, ", radarOptions=", sb4);
        sb4.append(this.f167573Q);
        sb4.append(", clientAttributionMetadata=");
        sb4.append(this.f167574R);
        sb4.append(", confirmationTokenId=");
        return AbstractC25012a.m73376i(this.f167575S, ")", sb4);
    }

    @Override // y00.InterfaceC38946s
    /* JADX INFO: renamed from: v0 */
    public final void mo124366v0(String str) {
        this.f167562F = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38809d5 c38809d5 = this.f167576w;
        if (c38809d5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38809d5.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167577x);
        C38998x6 c38998x6 = this.f167578y;
        if (c38998x6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38998x6.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167579z);
        dest.writeString(this.f167561E);
        dest.writeString(this.f167562F);
        Boolean bool = this.f167563G;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        dest.writeInt(this.f167564H ? 1 : 0);
        dest.writeParcelable(this.f167565I, i13);
        dest.writeString(this.f167566J);
        C38994x2 c38994x2 = this.f167567K;
        if (c38994x2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38994x2.writeToParcel(dest, i13);
        }
        EnumC38910o enumC38910o = this.f167568L;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
        C38919p c38919p = this.f167569M;
        if (c38919p == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38919p.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167570N);
        Boolean bool2 = this.f167571O;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool2);
        }
        dest.writeString(this.f167572P);
        C38780a6 c38780a6 = this.f167573Q;
        if (c38780a6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38780a6.writeToParcel(dest, i13);
        }
        C38901n c38901n = this.f167574R;
        if (c38901n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38901n.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167575S);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38928q(C38809d5 c38809d5, String str, String str2, Boolean bool, AbstractC38970u5 abstractC38970u5, C38994x2 c38994x2, EnumC38910o enumC38910o, C38919p c38919p, Boolean bool2, String str3, C38780a6 c38780a6, C38901n c38901n, String str4, int i13) {
        String str5;
        C38809d5 c38809d6 = (i13 & 1) != 0 ? null : c38809d5;
        String str6 = (i13 & 2) != 0 ? null : str;
        Boolean bool3 = (i13 & 64) != 0 ? null : bool;
        boolean z4 = (i13 & 128) == 0;
        AbstractC38970u5 abstractC38970u6 = (i13 & 256) != 0 ? null : abstractC38970u5;
        C38994x2 c38994x3 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c38994x2;
        EnumC38910o enumC38910o2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : enumC38910o;
        C38919p c38919p2 = (i13 & 4096) != 0 ? null : c38919p;
        Boolean bool4 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : bool2;
        if ((32768 & i13) != 0) {
            str5 = c38809d6 != null ? c38809d6.f167026w : null;
        } else {
            str5 = str3;
        }
        this(c38809d6, str6, null, null, str2, null, bool3, z4, abstractC38970u6, null, c38994x3, enumC38910o2, c38919p2, null, bool4, str5, (65536 & i13) != 0 ? null : c38780a6, (131072 & i13) != 0 ? null : c38901n, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? null : str4);
    }
}
