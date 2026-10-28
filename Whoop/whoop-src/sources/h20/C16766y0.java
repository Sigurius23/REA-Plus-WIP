package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16766y0 implements Parcelable {
    public static final Parcelable.Creator<C16766y0> CREATOR = new C16699n(9);

    /* JADX INFO: renamed from: w */
    public final int f64441w;

    /* JADX INFO: renamed from: x */
    public final int f64442x;

    public C16766y0(int i13, int i14) {
        this.f64441w = i13;
        this.f64442x = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16766y0)) {
            return false;
        }
        C16766y0 c16766y0 = (C16766y0) obj;
        return this.f64441w == c16766y0.f64441w && this.f64442x == c16766y0.f64442x;
    }

    public final int hashCode() {
        return (this.f64441w * 31) + this.f64442x;
    }

    public final String toString() {
        return AbstractC25012a.m73372e(this.f64441w, this.f64442x, "Colors(separatorColor=", ", checkmarkColor=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f64441w);
        dest.writeInt(this.f64442x);
    }
}
