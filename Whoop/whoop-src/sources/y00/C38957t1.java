package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.List;
import java.util.Map;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.t1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38957t1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38957t1> CREATOR = new C38992x0(14);

    /* JADX INFO: renamed from: E */
    public final boolean f167680E;

    /* JADX INFO: renamed from: F */
    public final C38904n2 f167681F;

    /* JADX INFO: renamed from: G */
    public final boolean f167682G;

    /* JADX INFO: renamed from: H */
    public final boolean f167683H;

    /* JADX INFO: renamed from: I */
    public final boolean f167684I;

    /* JADX INFO: renamed from: J */
    public final boolean f167685J;

    /* JADX INFO: renamed from: K */
    public final boolean f167686K;

    /* JADX INFO: renamed from: L */
    public final boolean f167687L;

    /* JADX INFO: renamed from: M */
    public final boolean f167688M;

    /* JADX INFO: renamed from: N */
    public final List f167689N;

    /* JADX INFO: renamed from: w */
    public final List f167690w;

    /* JADX INFO: renamed from: x */
    public final boolean f167691x;

    /* JADX INFO: renamed from: y */
    public final EnumC38922p2 f167692y;

    /* JADX INFO: renamed from: z */
    public final Map f167693z;

    public C38957t1(List linkFundingSources, boolean z4, EnumC38922p2 enumC38922p2, Map map, boolean z13, C38904n2 c38904n2, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, List linkSupportedPaymentMethodsOnboardingEnabled) {
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        AbstractC22676k.m65750j(linkSupportedPaymentMethodsOnboardingEnabled, "linkSupportedPaymentMethodsOnboardingEnabled");
        this.f167690w = linkFundingSources;
        this.f167691x = z4;
        this.f167692y = enumC38922p2;
        this.f167693z = map;
        this.f167680E = z13;
        this.f167681F = c38904n2;
        this.f167682G = z14;
        this.f167683H = z15;
        this.f167684I = z16;
        this.f167685J = z17;
        this.f167686K = z18;
        this.f167687L = z19;
        this.f167688M = z24;
        this.f167689N = linkSupportedPaymentMethodsOnboardingEnabled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38957t1)) {
            return false;
        }
        C38957t1 c38957t1 = (C38957t1) obj;
        return AbstractC22676k.m65745e(this.f167690w, c38957t1.f167690w) && this.f167691x == c38957t1.f167691x && this.f167692y == c38957t1.f167692y && AbstractC22676k.m65745e(this.f167693z, c38957t1.f167693z) && this.f167680E == c38957t1.f167680E && AbstractC22676k.m65745e(this.f167681F, c38957t1.f167681F) && this.f167682G == c38957t1.f167682G && this.f167683H == c38957t1.f167683H && this.f167684I == c38957t1.f167684I && this.f167685J == c38957t1.f167685J && this.f167686K == c38957t1.f167686K && this.f167687L == c38957t1.f167687L && this.f167688M == c38957t1.f167688M && AbstractC22676k.m65745e(this.f167689N, c38957t1.f167689N);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f167690w.hashCode() * 31, 31, this.f167691x);
        EnumC38922p2 enumC38922p2 = this.f167692y;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.f167693z, (iM8289b + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31, 31), 31, this.f167680E);
        C38904n2 c38904n2 = this.f167681F;
        return this.f167689N.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b2 + (c38904n2 != null ? c38904n2.hashCode() : 0)) * 31, 31, this.f167682G), 31, this.f167683H), 31, this.f167684I), 31, this.f167685J), 31, this.f167686K), 31, this.f167687L), 31, this.f167688M);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkSettings(linkFundingSources=");
        sb4.append(this.f167690w);
        sb4.append(", linkPassthroughModeEnabled=");
        sb4.append(this.f167691x);
        sb4.append(", linkMode=");
        sb4.append(this.f167692y);
        sb4.append(", linkFlags=");
        sb4.append(this.f167693z);
        sb4.append(", disableLinkSignup=");
        sb4.append(this.f167680E);
        sb4.append(", linkConsumerIncentive=");
        sb4.append(this.f167681F);
        sb4.append(", useAttestationEndpoints=");
        AbstractC38963t7.m124392v(sb4, this.f167682G, ", suppress2faModal=", this.f167683H, ", disableLinkRuxInFlowController=");
        AbstractC38963t7.m124392v(sb4, this.f167684I, ", linkEnableDisplayableDefaultValuesInEce=", this.f167685J, ", linkMobileSkipWalletInFlowController=");
        AbstractC38963t7.m124392v(sb4, this.f167686K, ", linkSignUpOptInFeatureEnabled=", this.f167687L, ", linkSignUpOptInInitialValue=");
        sb4.append(this.f167688M);
        sb4.append(", linkSupportedPaymentMethodsOnboardingEnabled=");
        sb4.append(this.f167689N);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeStringList(this.f167690w);
        dest.writeInt(this.f167691x ? 1 : 0);
        EnumC38922p2 enumC38922p2 = this.f167692y;
        if (enumC38922p2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38922p2.name());
        }
        Map map = this.f167693z;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
        dest.writeInt(this.f167680E ? 1 : 0);
        dest.writeParcelable(this.f167681F, i13);
        dest.writeInt(this.f167682G ? 1 : 0);
        dest.writeInt(this.f167683H ? 1 : 0);
        dest.writeInt(this.f167684I ? 1 : 0);
        dest.writeInt(this.f167685J ? 1 : 0);
        dest.writeInt(this.f167686K ? 1 : 0);
        dest.writeInt(this.f167687L ? 1 : 0);
        dest.writeInt(this.f167688M ? 1 : 0);
        dest.writeStringList(this.f167689N);
    }
}
