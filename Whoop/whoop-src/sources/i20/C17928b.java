package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17928b implements Parcelable {
    public static final Parcelable.Creator<C17928b> CREATOR = new C17925a(0);

    /* JADX INFO: renamed from: w */
    public final String f69683w;

    /* JADX INFO: renamed from: x */
    public final C16760x0 f69684x;

    /* JADX INFO: renamed from: y */
    public final String f69685y;

    /* JADX INFO: renamed from: z */
    public final Boolean f69686z;

    public C17928b(String str, C16760x0 c16760x0, String str2, Boolean bool) {
        this.f69683w = str;
        this.f69684x = c16760x0;
        this.f69685y = str2;
        this.f69686z = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17928b)) {
            return false;
        }
        C17928b c17928b = (C17928b) obj;
        return AbstractC22676k.m65745e(this.f69683w, c17928b.f69683w) && AbstractC22676k.m65745e(this.f69684x, c17928b.f69684x) && AbstractC22676k.m65745e(this.f69685y, c17928b.f69685y) && AbstractC22676k.m65745e(this.f69686z, c17928b.f69686z);
    }

    public final int hashCode() {
        String str = this.f69683w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C16760x0 c16760x0 = this.f69684x;
        int iHashCode2 = (iHashCode + (c16760x0 == null ? 0 : c16760x0.hashCode())) * 31;
        String str2 = this.f69685y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f69686z;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "AddressDetails(name=" + this.f69683w + ", address=" + this.f69684x + ", phoneNumber=" + this.f69685y + ", isCheckboxSelected=" + this.f69686z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f69683w);
        C16760x0 c16760x0 = this.f69684x;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
        dest.writeString(this.f69685y);
        Boolean bool = this.f69686z;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
