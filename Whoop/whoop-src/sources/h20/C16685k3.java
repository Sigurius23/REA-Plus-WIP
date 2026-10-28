package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.k3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16685k3 implements Parcelable {
    public static final Parcelable.Creator<C16685k3> CREATOR = new C16654f2(21);

    /* JADX INFO: renamed from: w */
    public final Integer f64155w;

    /* JADX INFO: renamed from: x */
    public final Float f64156x;

    /* JADX INFO: renamed from: y */
    public final Integer f64157y;

    /* JADX INFO: renamed from: z */
    public final Float f64158z;

    public C16685k3(Integer num, Float f13, Integer num2, Float f14) {
        this.f64155w = num;
        this.f64156x = f13;
        this.f64157y = num2;
        this.f64158z = f14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16685k3)) {
            return false;
        }
        C16685k3 c16685k3 = (C16685k3) obj;
        return AbstractC22676k.m65745e(this.f64155w, c16685k3.f64155w) && AbstractC22676k.m65745e(this.f64156x, c16685k3.f64156x) && AbstractC22676k.m65745e(this.f64157y, c16685k3.f64157y) && AbstractC22676k.m65745e(this.f64158z, c16685k3.f64158z);
    }

    public final int hashCode() {
        Integer num = this.f64155w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f13 = this.f64156x;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Integer num2 = this.f64157y;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f14 = this.f64158z;
        return iHashCode3 + (f14 != null ? f14.hashCode() : 0);
    }

    public final String toString() {
        return "Font(fontFamily=" + this.f64155w + ", fontSizeSp=" + this.f64156x + ", fontWeight=" + this.f64157y + ", letterSpacingSp=" + this.f64158z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f64155w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Float f13 = this.f64156x;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
        Integer num2 = this.f64157y;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        Float f14 = this.f64158z;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
    }
}
