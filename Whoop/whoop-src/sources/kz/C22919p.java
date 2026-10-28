package kz;

import android.os.Parcel;
import android.os.Parcelable;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C22919p implements Parcelable {
    public static final Parcelable.Creator<C22919p> CREATOR = new C22060h(16);

    /* JADX INFO: renamed from: w */
    public final String f90472w;

    /* JADX INFO: renamed from: x */
    public final String f90473x;

    /* JADX INFO: renamed from: y */
    public final String f90474y;

    /* JADX INFO: renamed from: z */
    public final boolean f90475z;

    public C22919p(String encodedPaymentMethod, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(encodedPaymentMethod, "encodedPaymentMethod");
        this.f90472w = encodedPaymentMethod;
        this.f90473x = str;
        this.f90474y = str2;
        this.f90475z = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22919p)) {
            return false;
        }
        C22919p c22919p = (C22919p) obj;
        return AbstractC22676k.m65745e(this.f90472w, c22919p.f90472w) && AbstractC22676k.m65745e(this.f90473x, c22919p.f90473x) && AbstractC22676k.m65745e(this.f90474y, c22919p.f90474y) && this.f90475z == c22919p.f90475z;
    }

    public final int hashCode() {
        int iHashCode = this.f90472w.hashCode() * 31;
        String str = this.f90473x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90474y;
        return Boolean.hashCode(this.f90475z) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("InstantDebitsResult(encodedPaymentMethod=", this.f90472w, ", last4=", this.f90473x, ", bankName="), this.f90474y, ", eligibleForIncentive=", this.f90475z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f90472w);
        dest.writeString(this.f90473x);
        dest.writeString(this.f90474y);
        dest.writeInt(this.f90475z ? 1 : 0);
    }
}
