package sz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: sz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C33139k implements Parcelable {
    public static final Parcelable.Creator<C33139k> CREATOR = new C33133h(1);

    /* JADX INFO: renamed from: E */
    public final C33137j f138209E;

    /* JADX INFO: renamed from: F */
    public final boolean f138210F;

    /* JADX INFO: renamed from: G */
    public final boolean f138211G;

    /* JADX INFO: renamed from: H */
    public final List f138212H;

    /* JADX INFO: renamed from: w */
    public final EnumC33131g f138213w;

    /* JADX INFO: renamed from: x */
    public final String f138214x;

    /* JADX INFO: renamed from: y */
    public final String f138215y;

    /* JADX INFO: renamed from: z */
    public final boolean f138216z;

    public C33139k(EnumC33131g environment, String merchantCountryCode, String merchantName, boolean z4, C33137j billingAddressConfig, boolean z13, boolean z14, ArrayList additionalEnabledNetworks) {
        AbstractC22676k.m65750j(environment, "environment");
        AbstractC22676k.m65750j(merchantCountryCode, "merchantCountryCode");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(billingAddressConfig, "billingAddressConfig");
        AbstractC22676k.m65750j(additionalEnabledNetworks, "additionalEnabledNetworks");
        this.f138213w = environment;
        this.f138214x = merchantCountryCode;
        this.f138215y = merchantName;
        this.f138216z = z4;
        this.f138209E = billingAddressConfig;
        this.f138210F = z13;
        this.f138211G = z14;
        this.f138212H = additionalEnabledNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33139k)) {
            return false;
        }
        C33139k c33139k = (C33139k) obj;
        return this.f138213w == c33139k.f138213w && AbstractC22676k.m65745e(this.f138214x, c33139k.f138214x) && AbstractC22676k.m65745e(this.f138215y, c33139k.f138215y) && this.f138216z == c33139k.f138216z && AbstractC22676k.m65745e(this.f138209E, c33139k.f138209E) && this.f138210F == c33139k.f138210F && this.f138211G == c33139k.f138211G && AbstractC22676k.m65745e(this.f138212H, c33139k.f138212H);
    }

    public final int hashCode() {
        return this.f138212H.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f138209E.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f138213w.hashCode() * 31, 31, this.f138214x), 31, this.f138215y), 31, this.f138216z)) * 31, 31, this.f138210F), 31, this.f138211G);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Config(environment=");
        sb4.append(this.f138213w);
        sb4.append(", merchantCountryCode=");
        sb4.append(this.f138214x);
        sb4.append(", merchantName=");
        AbstractC38963t7.m124390t(sb4, this.f138215y, ", isEmailRequired=", this.f138216z, ", billingAddressConfig=");
        sb4.append(this.f138209E);
        sb4.append(", existingPaymentMethodRequired=");
        sb4.append(this.f138210F);
        sb4.append(", allowCreditCards=");
        sb4.append(this.f138211G);
        sb4.append(", additionalEnabledNetworks=");
        sb4.append(this.f138212H);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f138213w.name());
        dest.writeString(this.f138214x);
        dest.writeString(this.f138215y);
        dest.writeInt(this.f138216z ? 1 : 0);
        this.f138209E.writeToParcel(dest, i13);
        dest.writeInt(this.f138210F ? 1 : 0);
        dest.writeInt(this.f138211G ? 1 : 0);
        dest.writeStringList(this.f138212H);
    }
}
