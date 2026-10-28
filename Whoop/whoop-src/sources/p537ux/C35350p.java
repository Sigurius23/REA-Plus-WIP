package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C35350p implements Parcelable {
    public static final Parcelable.Creator<C35350p> CREATOR = new C35332g(4);

    /* JADX INFO: renamed from: E */
    public final Long f150581E;

    /* JADX INFO: renamed from: F */
    public final String f150582F;

    /* JADX INFO: renamed from: G */
    public final EnumC35346n f150583G;

    /* JADX INFO: renamed from: w */
    public final String f150584w;

    /* JADX INFO: renamed from: x */
    public final EnumC35348o f150585x;

    /* JADX INFO: renamed from: y */
    public final String f150586y;

    /* JADX INFO: renamed from: z */
    public final String f150587z;

    public C35350p(String currencyCode, EnumC35348o totalPriceStatus, String str, String str2, Long l7, String str3, EnumC35346n enumC35346n) {
        AbstractC22676k.m65750j(currencyCode, "currencyCode");
        AbstractC22676k.m65750j(totalPriceStatus, "totalPriceStatus");
        this.f150584w = currencyCode;
        this.f150585x = totalPriceStatus;
        this.f150586y = str;
        this.f150587z = str2;
        this.f150581E = l7;
        this.f150582F = str3;
        this.f150583G = enumC35346n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35350p)) {
            return false;
        }
        C35350p c35350p = (C35350p) obj;
        return AbstractC22676k.m65745e(this.f150584w, c35350p.f150584w) && this.f150585x == c35350p.f150585x && AbstractC22676k.m65745e(this.f150586y, c35350p.f150586y) && AbstractC22676k.m65745e(this.f150587z, c35350p.f150587z) && AbstractC22676k.m65745e(this.f150581E, c35350p.f150581E) && AbstractC22676k.m65745e(this.f150582F, c35350p.f150582F) && this.f150583G == c35350p.f150583G;
    }

    public final int hashCode() {
        int iHashCode = (this.f150585x.hashCode() + (this.f150584w.hashCode() * 31)) * 31;
        String str = this.f150586y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f150587z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l7 = this.f150581E;
        int iHashCode4 = (iHashCode3 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str3 = this.f150582F;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC35346n enumC35346n = this.f150583G;
        return iHashCode5 + (enumC35346n != null ? enumC35346n.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TransactionInfo(currencyCode=");
        sb4.append(this.f150584w);
        sb4.append(", totalPriceStatus=");
        sb4.append(this.f150585x);
        sb4.append(", countryCode=");
        AbstractC11266d.m30444B(sb4, this.f150586y, ", transactionId=", this.f150587z, ", totalPrice=");
        sb4.append(this.f150581E);
        sb4.append(", totalPriceLabel=");
        sb4.append(this.f150582F);
        sb4.append(", checkoutOption=");
        sb4.append(this.f150583G);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f150584w);
        dest.writeString(this.f150585x.name());
        dest.writeString(this.f150586y);
        dest.writeString(this.f150587z);
        Long l7 = this.f150581E;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f150582F);
        EnumC35346n enumC35346n = this.f150583G;
        if (enumC35346n == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC35346n.name());
        }
    }
}
