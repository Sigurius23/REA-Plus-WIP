package s40;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.CountryCode;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s40.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32154h0 implements Parcelable {
    public static final Parcelable.Creator<C32154h0> CREATOR = new C29912j0(26);

    /* JADX INFO: renamed from: w */
    public final CountryCode f133208w;

    /* JADX INFO: renamed from: x */
    public final Parcelable f133209x;

    public C32154h0(CountryCode countryCode, Parcelable parcelable) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        this.f133208w = countryCode;
        this.f133209x = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32154h0)) {
            return false;
        }
        C32154h0 c32154h0 = (C32154h0) obj;
        return AbstractC22676k.m65745e(this.f133208w, c32154h0.f133208w) && AbstractC22676k.m65745e(this.f133209x, c32154h0.f133209x);
    }

    public final int hashCode() {
        int iHashCode = this.f133208w.hashCode() * 31;
        Parcelable parcelable = this.f133209x;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    public final String toString() {
        return "SelectedCountryState(countryCode=" + this.f133208w + ", superState=" + this.f133209x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f133208w, i13);
        dest.writeParcelable(this.f133209x, i13);
    }
}
