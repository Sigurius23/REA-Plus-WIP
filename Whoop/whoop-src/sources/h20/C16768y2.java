package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.y2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16768y2 implements Parcelable {
    public static final Parcelable.Creator<C16768y2> CREATOR = new C16654f2(10);

    /* JADX INFO: renamed from: w */
    public final C16774z2 f64446w;

    /* JADX INFO: renamed from: x */
    public final C16774z2 f64447x;

    /* JADX INFO: renamed from: y */
    public final C16625a3 f64448y;

    /* JADX INFO: renamed from: z */
    public final C16631b3 f64449z;

    public C16768y2(C16774z2 colorsLight, C16774z2 colorsDark, C16625a3 shape, C16631b3 typography) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        AbstractC22676k.m65750j(shape, "shape");
        AbstractC22676k.m65750j(typography, "typography");
        this.f64446w = colorsLight;
        this.f64447x = colorsDark;
        this.f64448y = shape;
        this.f64449z = typography;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16768y2)) {
            return false;
        }
        C16768y2 c16768y2 = (C16768y2) obj;
        return AbstractC22676k.m65745e(this.f64446w, c16768y2.f64446w) && AbstractC22676k.m65745e(this.f64447x, c16768y2.f64447x) && AbstractC22676k.m65745e(this.f64448y, c16768y2.f64448y) && AbstractC22676k.m65745e(this.f64449z, c16768y2.f64449z);
    }

    public final int hashCode() {
        return this.f64449z.hashCode() + ((this.f64448y.hashCode() + ((this.f64447x.hashCode() + (this.f64446w.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PrimaryButton(colorsLight=" + this.f64446w + ", colorsDark=" + this.f64447x + ", shape=" + this.f64448y + ", typography=" + this.f64449z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f64446w.writeToParcel(dest, i13);
        this.f64447x.writeToParcel(dest, i13);
        this.f64448y.writeToParcel(dest, i13);
        this.f64449z.writeToParcel(dest, i13);
    }
}
