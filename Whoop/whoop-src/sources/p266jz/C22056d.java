package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import java.io.Serializable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22056d implements Parcelable, Serializable {
    public static final Parcelable.Creator<C22056d> CREATOR = new C16054r0(27);

    /* JADX INFO: renamed from: w */
    public final String f85558w;

    /* JADX INFO: renamed from: x */
    public final String f85559x;

    /* JADX INFO: renamed from: y */
    public final String f85560y;

    public C22056d(String str, String str2, String str3) {
        this.f85558w = str;
        this.f85559x = str2;
        this.f85560y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22056d)) {
            return false;
        }
        C22056d c22056d = (C22056d) obj;
        return AbstractC22676k.m65745e(this.f85558w, c22056d.f85558w) && AbstractC22676k.m65745e(this.f85559x, c22056d.f85559x) && AbstractC22676k.m65745e(this.f85560y, c22056d.f85560y);
    }

    public final int hashCode() {
        String str = this.f85558w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f85559x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f85560y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f85560y, ")", AbstractC11895b.m32001t("PrefillDetails(email=", this.f85558w, ", phone=", this.f85559x, ", phoneCountryCode="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f85558w);
        dest.writeString(this.f85559x);
        dest.writeString(this.f85560y);
    }
}
