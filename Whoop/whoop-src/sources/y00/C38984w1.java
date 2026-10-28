package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jh3.AbstractC21702c;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.w1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38984w1 implements InterfaceC38786b2 {
    public static final Parcelable.Creator<C38984w1> CREATOR = new C38992x0(15);

    /* JADX INFO: renamed from: E */
    public final String f167804E;

    /* JADX INFO: renamed from: F */
    public final String f167805F;

    /* JADX INFO: renamed from: G */
    public final String f167806G;

    /* JADX INFO: renamed from: H */
    public final String f167807H;

    /* JADX INFO: renamed from: I */
    public final String f167808I;

    /* JADX INFO: renamed from: J */
    public final C39011z1 f167809J;

    /* JADX INFO: renamed from: K */
    public final C38993x1 f167810K;

    /* JADX INFO: renamed from: L */
    public final String f167811L;

    /* JADX INFO: renamed from: w */
    public final String f167812w;

    /* JADX INFO: renamed from: x */
    public final C38775a1 f167813x;

    /* JADX INFO: renamed from: y */
    public final List f167814y;

    /* JADX INFO: renamed from: z */
    public final List f167815z;

    public C38984w1(String str, C38775a1 deferredIntentParams, ArrayList customPaymentMethods, List externalPaymentMethods, String str2, String str3, String str4, String str5, String appId, C39011z1 c39011z1, C38993x1 link, String str6) {
        AbstractC22676k.m65750j(deferredIntentParams, "deferredIntentParams");
        AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
        AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
        AbstractC22676k.m65750j(appId, "appId");
        AbstractC22676k.m65750j(link, "link");
        this.f167812w = str;
        this.f167813x = deferredIntentParams;
        this.f167814y = customPaymentMethods;
        this.f167815z = externalPaymentMethods;
        this.f167804E = str2;
        this.f167805F = str3;
        this.f167806G = str4;
        this.f167807H = str5;
        this.f167808I = appId;
        this.f167809J = c39011z1;
        this.f167810K = link;
        this.f167811L = str6;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: E */
    public final String mo124313E() {
        return this.f167805F;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: Q */
    public final String mo124314Q() {
        return this.f167807H;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: U */
    public final C38993x1 mo124315U() {
        return this.f167810K;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: W */
    public final C39011z1 mo124316W() {
        return this.f167809J;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38984w1)) {
            return false;
        }
        C38984w1 c38984w1 = (C38984w1) obj;
        return AbstractC22676k.m65745e(this.f167812w, c38984w1.f167812w) && AbstractC22676k.m65745e(this.f167813x, c38984w1.f167813x) && AbstractC22676k.m65745e(this.f167814y, c38984w1.f167814y) && AbstractC22676k.m65745e(this.f167815z, c38984w1.f167815z) && AbstractC22676k.m65745e(this.f167804E, c38984w1.f167804E) && AbstractC22676k.m65745e(this.f167805F, c38984w1.f167805F) && AbstractC22676k.m65745e(this.f167806G, c38984w1.f167806G) && AbstractC22676k.m65745e(this.f167807H, c38984w1.f167807H) && AbstractC22676k.m65745e(this.f167808I, c38984w1.f167808I) && AbstractC22676k.m65745e(this.f167809J, c38984w1.f167809J) && AbstractC22676k.m65745e(this.f167810K, c38984w1.f167810K) && AbstractC22676k.m65745e(this.f167811L, c38984w1.f167811L);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: f0 */
    public final List mo124317f0() {
        return C25271y.f99162w;
    }

    @Override // y00.InterfaceC38786b2
    public final String getClientSecret() {
        return null;
    }

    @Override // y00.InterfaceC38786b2
    public final String getType() {
        return "deferred_intent";
    }

    public final int hashCode() {
        String str = this.f167812w;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((this.f167813x.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f167814y), 31, this.f167815z);
        String str2 = this.f167804E;
        int iHashCode = (iM31983b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167805F;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167806G;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167807H;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f167808I);
        C39011z1 c39011z1 = this.f167809J;
        int iM73368a = AbstractC25012a.m73368a(this.f167810K.f167840w, (iM30450d + (c39011z1 == null ? 0 : c39011z1.hashCode())) * 31, 31);
        String str6 = this.f167811L;
        return iM73368a + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: l */
    public final String mo124318l() {
        return this.f167806G;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r */
    public final List mo124319r() {
        return this.f167815z;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: r0 */
    public final String mo124320r0() {
        return this.f167808I;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: s0 */
    public final String mo124321s0() {
        return this.f167812w;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t */
    public final String mo124322t() {
        return this.f167804E;
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: t0 */
    public final List mo124323t0() {
        return this.f167814y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("DeferredIntentType(locale=");
        sb4.append(this.f167812w);
        sb4.append(", deferredIntentParams=");
        sb4.append(this.f167813x);
        sb4.append(", customPaymentMethods=");
        AbstractC21702c.m61148s(sb4, this.f167814y, ", externalPaymentMethods=", this.f167815z, ", savedPaymentMethodSelectionId=");
        AbstractC11266d.m30444B(sb4, this.f167804E, ", customerSessionClientSecret=", this.f167805F, ", legacyCustomerEphemeralKey=");
        AbstractC11266d.m30444B(sb4, this.f167806G, ", mobileSessionId=", this.f167807H, ", appId=");
        sb4.append(this.f167808I);
        sb4.append(", sellerDetails=");
        sb4.append(this.f167809J);
        sb4.append(", link=");
        sb4.append(this.f167810K);
        sb4.append(", countryOverride=");
        sb4.append(this.f167811L);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // y00.InterfaceC38786b2
    /* JADX INFO: renamed from: u0 */
    public final String mo124324u0() {
        return this.f167811L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167812w);
        this.f167813x.writeToParcel(dest, i13);
        dest.writeStringList(this.f167814y);
        dest.writeStringList(this.f167815z);
        dest.writeString(this.f167804E);
        dest.writeString(this.f167805F);
        dest.writeString(this.f167806G);
        dest.writeString(this.f167807H);
        dest.writeString(this.f167808I);
        C39011z1 c39011z1 = this.f167809J;
        if (c39011z1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39011z1.writeToParcel(dest, i13);
        }
        this.f167810K.writeToParcel(dest, i13);
        dest.writeString(this.f167811L);
    }

    public /* synthetic */ C38984w1(C38775a1 c38775a1, ArrayList arrayList, List list, String str, String str2, String str3, String str4, String str5, C39011z1 c39011z1, C38993x1 c38993x1, String str6) {
        this(Locale.getDefault().toLanguageTag(), c38775a1, arrayList, list, str, str2, str3, str4, str5, c39011z1, c38993x1, str6);
    }
}
