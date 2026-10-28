package sz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sz.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33124c0 implements Parcelable {
    public static final Parcelable.Creator<C33124c0> CREATOR = new C33133h(8);

    /* JADX INFO: renamed from: E */
    public final C33122b0 f138171E;

    /* JADX INFO: renamed from: F */
    public final boolean f138172F;

    /* JADX INFO: renamed from: G */
    public final boolean f138173G;

    /* JADX INFO: renamed from: H */
    public final List f138174H;

    /* JADX INFO: renamed from: w */
    public final EnumC33131g f138175w;

    /* JADX INFO: renamed from: x */
    public final String f138176x;

    /* JADX INFO: renamed from: y */
    public final String f138177y;

    /* JADX INFO: renamed from: z */
    public final boolean f138178z;

    public /* synthetic */ C33124c0(EnumC33131g enumC33131g, String str, String str2, boolean z4, C33122b0 c33122b0, List list) {
        this(enumC33131g, str, str2, z4, c33122b0, true, true, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33124c0)) {
            return false;
        }
        C33124c0 c33124c0 = (C33124c0) obj;
        return this.f138175w == c33124c0.f138175w && AbstractC22676k.m65745e(this.f138176x, c33124c0.f138176x) && AbstractC22676k.m65745e(this.f138177y, c33124c0.f138177y) && this.f138178z == c33124c0.f138178z && AbstractC22676k.m65745e(this.f138171E, c33124c0.f138171E) && this.f138172F == c33124c0.f138172F && this.f138173G == c33124c0.f138173G && AbstractC22676k.m65745e(this.f138174H, c33124c0.f138174H);
    }

    public final int hashCode() {
        return this.f138174H.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f138171E.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f138175w.hashCode() * 31, 31, this.f138176x), 31, this.f138177y), 31, this.f138178z)) * 31, 31, this.f138172F), 31, this.f138173G);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Config(environment=");
        sb4.append(this.f138175w);
        sb4.append(", merchantCountryCode=");
        sb4.append(this.f138176x);
        sb4.append(", merchantName=");
        AbstractC38963t7.m124390t(sb4, this.f138177y, ", isEmailRequired=", this.f138178z, ", billingAddressConfig=");
        sb4.append(this.f138171E);
        sb4.append(", existingPaymentMethodRequired=");
        sb4.append(this.f138172F);
        sb4.append(", allowCreditCards=");
        sb4.append(this.f138173G);
        sb4.append(", additionalEnabledNetworks=");
        sb4.append(this.f138174H);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f138175w.name());
        dest.writeString(this.f138176x);
        dest.writeString(this.f138177y);
        dest.writeInt(this.f138178z ? 1 : 0);
        this.f138171E.writeToParcel(dest, i13);
        dest.writeInt(this.f138172F ? 1 : 0);
        dest.writeInt(this.f138173G ? 1 : 0);
        dest.writeStringList(this.f138174H);
    }

    public C33124c0(EnumC33131g environment, String merchantCountryCode, String merchantName, boolean z4, C33122b0 billingAddressConfig, boolean z13, boolean z14, List additionalEnabledNetworks) {
        AbstractC22676k.m65750j(environment, "environment");
        AbstractC22676k.m65750j(merchantCountryCode, "merchantCountryCode");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(billingAddressConfig, "billingAddressConfig");
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        this.f138175w = environment;
        this.f138176x = merchantCountryCode;
        this.f138177y = merchantName;
        this.f138178z = z4;
        this.f138171E = billingAddressConfig;
        this.f138172F = z13;
        this.f138173G = z14;
        this.f138174H = additionalEnabledNetworks;
    }
}
