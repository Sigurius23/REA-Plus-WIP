package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16760x0 implements Parcelable {
    public static final Parcelable.Creator<C16760x0> CREATOR = new C16699n(6);

    /* JADX INFO: renamed from: E */
    public final String f64396E;

    /* JADX INFO: renamed from: F */
    public final String f64397F;

    /* JADX INFO: renamed from: w */
    public final String f64398w;

    /* JADX INFO: renamed from: x */
    public final String f64399x;

    /* JADX INFO: renamed from: y */
    public final String f64400y;

    /* JADX INFO: renamed from: z */
    public final String f64401z;

    public C16760x0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f64398w = str;
        this.f64399x = str2;
        this.f64400y = str3;
        this.f64401z = str4;
        this.f64396E = str5;
        this.f64397F = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16760x0)) {
            return false;
        }
        C16760x0 c16760x0 = (C16760x0) obj;
        return AbstractC22676k.m65745e(this.f64398w, c16760x0.f64398w) && AbstractC22676k.m65745e(this.f64399x, c16760x0.f64399x) && AbstractC22676k.m65745e(this.f64400y, c16760x0.f64400y) && AbstractC22676k.m65745e(this.f64401z, c16760x0.f64401z) && AbstractC22676k.m65745e(this.f64396E, c16760x0.f64396E) && AbstractC22676k.m65745e(this.f64397F, c16760x0.f64397F);
    }

    public final int hashCode() {
        String str = this.f64398w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f64399x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64400y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f64401z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64396E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f64397F;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Address(city=", this.f64398w, ", country=", this.f64399x, ", line1=");
        AbstractC11266d.m30444B(sbM32001t, this.f64400y, ", line2=", this.f64401z, ", postalCode=");
        return AbstractC11266d.m30464r(sbM32001t, this.f64396E, ", state=", this.f64397F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64398w);
        dest.writeString(this.f64399x);
        dest.writeString(this.f64400y);
        dest.writeString(this.f64401z);
        dest.writeString(this.f64396E);
        dest.writeString(this.f64397F);
    }
}
