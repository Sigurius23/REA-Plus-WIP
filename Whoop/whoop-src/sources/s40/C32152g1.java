package s40;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s40.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32152g1 implements Parcelable {
    public static final Parcelable.Creator<C32152g1> CREATOR = new C29912j0(27);

    /* JADX INFO: renamed from: w */
    public final Parcelable f133200w;

    /* JADX INFO: renamed from: x */
    public final String f133201x;

    /* JADX INFO: renamed from: y */
    public final boolean f133202y;

    public C32152g1(Parcelable parcelable, String str, boolean z4) {
        this.f133200w = parcelable;
        this.f133201x = str;
        this.f133202y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32152g1)) {
            return false;
        }
        C32152g1 c32152g1 = (C32152g1) obj;
        return AbstractC22676k.m65745e(this.f133200w, c32152g1.f133200w) && AbstractC22676k.m65745e(this.f133201x, c32152g1.f133201x) && this.f133202y == c32152g1.f133202y;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f133200w;
        int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
        String str = this.f133201x;
        return Boolean.hashCode(this.f133202y) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("StripeEditTextState(superState=");
        sb4.append(this.f133200w);
        sb4.append(", errorMessage=");
        sb4.append(this.f133201x);
        sb4.append(", shouldShowError=");
        return AbstractC18489d0.m53372m(sb4, this.f133202y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f133200w, i13);
        dest.writeString(this.f133201x);
        dest.writeInt(this.f133202y ? 1 : 0);
    }
}
