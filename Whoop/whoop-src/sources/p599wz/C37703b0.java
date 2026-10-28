package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37703b0 implements Parcelable {
    public static final Parcelable.Creator<C37703b0> CREATOR = new C37677f(9);

    /* JADX INFO: renamed from: w */
    public final Float f161560w;

    /* JADX INFO: renamed from: x */
    public final Float f161561x;

    public C37703b0(Float f13, Float f14) {
        this.f161560w = f13;
        this.f161561x = f14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37703b0)) {
            return false;
        }
        C37703b0 c37703b0 = (C37703b0) obj;
        return AbstractC22676k.m65745e(this.f161560w, c37703b0.f161560w) && AbstractC22676k.m65745e(this.f161561x, c37703b0.f161561x);
    }

    public final int hashCode() {
        Float f13 = this.f161560w;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.f161561x;
        return iHashCode + (f14 != null ? f14.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryButton(cornerRadiusDp=" + this.f161560w + ", heightDp=" + this.f161561x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Float f13 = this.f161560w;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
        Float f14 = this.f161561x;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
    }
}
