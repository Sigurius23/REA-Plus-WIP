package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16659g1 implements Parcelable {
    public static final Parcelable.Creator<C16659g1> CREATOR = new C16699n(8);

    /* JADX INFO: renamed from: E */
    public static final C16659g1 f64059E = new C16659g1(C16641d1.f63991J);

    /* JADX INFO: renamed from: w */
    public final AbstractC16653f1 f64060w;

    /* JADX INFO: renamed from: x */
    public final C16678j2 f64061x;

    /* JADX INFO: renamed from: y */
    public final C16685k3 f64062y;

    /* JADX INFO: renamed from: z */
    public final C16685k3 f64063z;

    public C16659g1(AbstractC16653f1 style, C16678j2 c16678j2, C16685k3 c16685k3, C16685k3 c16685k4) {
        AbstractC22676k.m65750j(style, "style");
        this.f64060w = style;
        this.f64061x = c16678j2;
        this.f64062y = c16685k3;
        this.f64063z = c16685k4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16659g1)) {
            return false;
        }
        C16659g1 c16659g1 = (C16659g1) obj;
        return AbstractC22676k.m65745e(this.f64060w, c16659g1.f64060w) && AbstractC22676k.m65745e(this.f64061x, c16659g1.f64061x) && AbstractC22676k.m65745e(this.f64062y, c16659g1.f64062y) && AbstractC22676k.m65745e(this.f64063z, c16659g1.f64063z);
    }

    public final int hashCode() {
        int iHashCode = this.f64060w.hashCode() * 31;
        C16678j2 c16678j2 = this.f64061x;
        int iHashCode2 = (iHashCode + (c16678j2 == null ? 0 : c16678j2.hashCode())) * 31;
        C16685k3 c16685k3 = this.f64062y;
        int iHashCode3 = (iHashCode2 + (c16685k3 == null ? 0 : c16685k3.hashCode())) * 31;
        C16685k3 c16685k4 = this.f64063z;
        return iHashCode3 + (c16685k4 != null ? c16685k4.hashCode() : 0);
    }

    public final String toString() {
        return "Embedded(style=" + this.f64060w + ", paymentMethodIconMargins=" + this.f64061x + ", titleFont=" + this.f64062y + ", subtitleFont=" + this.f64063z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64060w, i13);
        C16678j2 c16678j2 = this.f64061x;
        if (c16678j2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16678j2.writeToParcel(dest, i13);
        }
        C16685k3 c16685k3 = this.f64062y;
        if (c16685k3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16685k3.writeToParcel(dest, i13);
        }
        C16685k3 c16685k4 = this.f64063z;
        if (c16685k4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16685k4.writeToParcel(dest, i13);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16659g1(AbstractC16653f1 style) {
        this(style, null, null, null);
        AbstractC22676k.m65750j(style, "style");
    }
}
