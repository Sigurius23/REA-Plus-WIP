package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38901n;

/* JADX INFO: renamed from: sz.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33142l0 implements Parcelable {
    public static final Parcelable.Creator<C33142l0> CREATOR = new C33133h(12);

    /* JADX INFO: renamed from: E */
    public final String f138220E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35320a f138221F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35322b f138222G;

    /* JADX INFO: renamed from: H */
    public final C38901n f138223H;

    /* JADX INFO: renamed from: I */
    public final boolean f138224I;

    /* JADX INFO: renamed from: w */
    public final C33124c0 f138225w;

    /* JADX INFO: renamed from: x */
    public final String f138226x;

    /* JADX INFO: renamed from: y */
    public final long f138227y;

    /* JADX INFO: renamed from: z */
    public final String f138228z;

    public C33142l0(C33124c0 config, String currencyCode, long j7, String str, String str2, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, C38901n c38901n, boolean z4) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(currencyCode, "currencyCode");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f138225w = config;
        this.f138226x = currencyCode;
        this.f138227y = j7;
        this.f138228z = str;
        this.f138220E = str2;
        this.f138221F = cardBrandFilter;
        this.f138222G = cardFundingFilter;
        this.f138223H = c38901n;
        this.f138224I = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33142l0)) {
            return false;
        }
        C33142l0 c33142l0 = (C33142l0) obj;
        return AbstractC22676k.m65745e(this.f138225w, c33142l0.f138225w) && AbstractC22676k.m65745e(this.f138226x, c33142l0.f138226x) && this.f138227y == c33142l0.f138227y && AbstractC22676k.m65745e(this.f138228z, c33142l0.f138228z) && AbstractC22676k.m65745e(this.f138220E, c33142l0.f138220E) && AbstractC22676k.m65745e(this.f138221F, c33142l0.f138221F) && AbstractC22676k.m65745e(this.f138222G, c33142l0.f138222G) && AbstractC22676k.m65745e(this.f138223H, c33142l0.f138223H) && this.f138224I == c33142l0.f138224I;
    }

    public final int hashCode() {
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30450d(this.f138225w.hashCode() * 31, 31, this.f138226x), this.f138227y, 31);
        String str = this.f138228z;
        int iHashCode = (iM30451e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138220E;
        int iHashCode2 = (this.f138222G.hashCode() + ((this.f138221F.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        C38901n c38901n = this.f138223H;
        return Boolean.hashCode(this.f138224I) + ((iHashCode2 + (c38901n != null ? c38901n.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Args(config=" + this.f138225w + ", currencyCode=" + this.f138226x + ", amount=" + this.f138227y + ", label=" + this.f138228z + ", transactionId=" + this.f138220E + ", cardBrandFilter=" + this.f138221F + ", cardFundingFilter=" + this.f138222G + ", clientAttributionMetadata=" + this.f138223H + ", isElements=" + this.f138224I + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f138225w.writeToParcel(dest, i13);
        dest.writeString(this.f138226x);
        dest.writeLong(this.f138227y);
        dest.writeString(this.f138228z);
        dest.writeString(this.f138220E);
        dest.writeParcelable(this.f138221F, i13);
        dest.writeParcelable(this.f138222G, i13);
        C38901n c38901n = this.f138223H;
        if (c38901n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38901n.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f138224I ? 1 : 0);
    }
}
