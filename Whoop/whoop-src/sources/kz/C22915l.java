package kz;

import android.os.Parcel;
import android.os.Parcelable;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C22915l extends AbstractC22917n {
    public static final Parcelable.Creator<C22915l> CREATOR = new C22060h(14);

    /* JADX INFO: renamed from: w */
    public final String f90467w;

    /* JADX INFO: renamed from: x */
    public final String f90468x;

    /* JADX INFO: renamed from: y */
    public final String f90469y;

    /* JADX INFO: renamed from: z */
    public final boolean f90470z;

    public C22915l(String encodedPaymentMethod, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(encodedPaymentMethod, "encodedPaymentMethod");
        this.f90467w = encodedPaymentMethod;
        this.f90468x = str;
        this.f90469y = str2;
        this.f90470z = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22915l)) {
            return false;
        }
        C22915l c22915l = (C22915l) obj;
        return AbstractC22676k.m65745e(this.f90467w, c22915l.f90467w) && AbstractC22676k.m65745e(this.f90468x, c22915l.f90468x) && AbstractC22676k.m65745e(this.f90469y, c22915l.f90469y) && this.f90470z == c22915l.f90470z;
    }

    public final int hashCode() {
        int iHashCode = this.f90467w.hashCode() * 31;
        String str = this.f90468x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90469y;
        return Boolean.hashCode(this.f90470z) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return AbstractC21702c.m61137h(AbstractC11895b.m32001t("Completed(encodedPaymentMethod=", this.f90467w, ", last4=", this.f90468x, ", bankName="), this.f90469y, ", eligibleForIncentive=", this.f90470z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f90467w);
        dest.writeString(this.f90468x);
        dest.writeString(this.f90469y);
        dest.writeInt(this.f90470z ? 1 : 0);
    }
}
