package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.s2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16732s2 implements Parcelable {
    public static final Parcelable.Creator<C16732s2> CREATOR = new C16654f2(8);

    /* JADX INFO: renamed from: w */
    public final String f64282w;

    /* JADX INFO: renamed from: x */
    public final String f64283x;

    /* JADX INFO: renamed from: y */
    public final String f64284y;

    public C16732s2(String businessName, String networkId, String externalId) {
        AbstractC22676k.m65750j(businessName, "businessName");
        AbstractC22676k.m65750j(networkId, "networkId");
        AbstractC22676k.m65750j(externalId, "externalId");
        this.f64282w = businessName;
        this.f64283x = networkId;
        this.f64284y = externalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16732s2)) {
            return false;
        }
        C16732s2 c16732s2 = (C16732s2) obj;
        return AbstractC22676k.m65745e(this.f64282w, c16732s2.f64282w) && AbstractC22676k.m65745e(this.f64283x, c16732s2.f64283x) && AbstractC22676k.m65745e(this.f64284y, c16732s2.f64284y);
    }

    public final int hashCode() {
        return this.f64284y.hashCode() + AbstractC11266d.m30450d(this.f64282w.hashCode() * 31, 31, this.f64283x);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f64284y, ")", AbstractC11895b.m32001t("SellerDetails(businessName=", this.f64282w, ", networkId=", this.f64283x, ", externalId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64282w);
        dest.writeString(this.f64283x);
        dest.writeString(this.f64284y);
    }
}
