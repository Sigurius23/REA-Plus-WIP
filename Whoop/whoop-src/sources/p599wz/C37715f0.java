package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37715f0 implements Parcelable {
    public static final Parcelable.Creator<C37715f0> CREATOR = new C37677f(13);

    /* JADX INFO: renamed from: w */
    public final String f161584w;

    /* JADX INFO: renamed from: x */
    public final String f161585x;

    /* JADX INFO: renamed from: y */
    public final String f161586y;

    /* JADX INFO: renamed from: z */
    public final String f161587z;

    public C37715f0(String str, String str2, String str3, String str4) {
        this.f161584w = str;
        this.f161585x = str2;
        this.f161586y = str3;
        this.f161587z = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37715f0)) {
            return false;
        }
        C37715f0 c37715f0 = (C37715f0) obj;
        return AbstractC22676k.m65745e(this.f161584w, c37715f0.f161584w) && AbstractC22676k.m65745e(this.f161585x, c37715f0.f161585x) && AbstractC22676k.m65745e(this.f161586y, c37715f0.f161586y) && AbstractC22676k.m65745e(this.f161587z, c37715f0.f161587z);
    }

    public final int hashCode() {
        String str = this.f161584w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f161585x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f161586y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f161587z;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("CustomerInfo(name=", this.f161584w, ", email=", this.f161585x, ", phone="), this.f161586y, ", billingCountryCode=", this.f161587z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f161584w);
        dest.writeString(this.f161585x);
        dest.writeString(this.f161586y);
        dest.writeString(this.f161587z);
    }
}
