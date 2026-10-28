package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.CountryCode;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C39000y implements Parcelable {
    public static final Parcelable.Creator<C39000y> CREATOR = new C38873k(11);

    /* JADX INFO: renamed from: E */
    public final String f167863E;

    /* JADX INFO: renamed from: F */
    public final String f167864F;

    /* JADX INFO: renamed from: G */
    public final CountryCode f167865G;

    /* JADX INFO: renamed from: w */
    public final String f167866w;

    /* JADX INFO: renamed from: x */
    public final String f167867x;

    /* JADX INFO: renamed from: y */
    public final String f167868y;

    /* JADX INFO: renamed from: z */
    public final String f167869z;

    public C39000y(String str, String str2, String str3, String str4, String str5, String str6, CountryCode countryCode) {
        this.f167866w = str;
        this.f167867x = str2;
        this.f167868y = str3;
        this.f167869z = str4;
        this.f167863E = str5;
        this.f167864F = str6;
        this.f167865G = countryCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39000y)) {
            return false;
        }
        C39000y c39000y = (C39000y) obj;
        return AbstractC22676k.m65745e(this.f167866w, c39000y.f167866w) && AbstractC22676k.m65745e(this.f167867x, c39000y.f167867x) && AbstractC22676k.m65745e(this.f167868y, c39000y.f167868y) && AbstractC22676k.m65745e(this.f167869z, c39000y.f167869z) && AbstractC22676k.m65745e(this.f167863E, c39000y.f167863E) && AbstractC22676k.m65745e(this.f167864F, c39000y.f167864F) && AbstractC22676k.m65745e(this.f167865G, c39000y.f167865G);
    }

    public final int hashCode() {
        String str = this.f167866w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167867x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167868y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167869z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167863E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167864F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CountryCode countryCode = this.f167865G;
        return iHashCode6 + (countryCode != null ? countryCode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BillingAddress(name=", this.f167866w, ", line1=", this.f167867x, ", line2=");
        AbstractC11266d.m30444B(sbM32001t, this.f167868y, ", administrativeArea=", this.f167869z, ", locality=");
        AbstractC11266d.m30444B(sbM32001t, this.f167863E, ", postalCode=", this.f167864F, ", countryCode=");
        sbM32001t.append(this.f167865G);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167866w);
        dest.writeString(this.f167867x);
        dest.writeString(this.f167868y);
        dest.writeString(this.f167869z);
        dest.writeString(this.f167863E);
        dest.writeString(this.f167864F);
        dest.writeParcelable(this.f167865G, i13);
    }
}
