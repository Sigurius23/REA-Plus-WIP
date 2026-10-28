package r30;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: r30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C30899d implements Parcelable {
    public static final Parcelable.Creator<C30899d> CREATOR = new C29912j0(11);

    /* JADX INFO: renamed from: w */
    public final String f127399w;

    /* JADX INFO: renamed from: x */
    public final String f127400x;

    /* JADX INFO: renamed from: y */
    public final String f127401y;

    public C30899d(String str, String str2, String str3) {
        this.f127399w = str;
        this.f127400x = str2;
        this.f127401y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30899d)) {
            return false;
        }
        C30899d c30899d = (C30899d) obj;
        return AbstractC22676k.m65745e(this.f127399w, c30899d.f127399w) && AbstractC22676k.m65745e(this.f127400x, c30899d.f127400x) && AbstractC22676k.m65745e(this.f127401y, c30899d.f127401y);
    }

    public final int hashCode() {
        String str = this.f127399w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f127400x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f127401y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f127401y, ")", AbstractC11895b.m32001t("Image(mediumUrl=", this.f127399w, ", highUrl=", this.f127400x, ", extraHighUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127399w);
        dest.writeString(this.f127400x);
        dest.writeString(this.f127401y);
    }
}
