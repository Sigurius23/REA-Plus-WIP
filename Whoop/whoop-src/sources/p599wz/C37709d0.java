package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37709d0 implements Parcelable {
    public static final Parcelable.Creator<C37709d0> CREATOR = new C37677f(8);

    /* JADX INFO: renamed from: w */
    public final C37700a0 f161573w;

    /* JADX INFO: renamed from: x */
    public final C37700a0 f161574x;

    /* JADX INFO: renamed from: y */
    public final EnumC37706c0 f161575y;

    /* JADX INFO: renamed from: z */
    public final C37703b0 f161576z;

    public C37709d0(C37700a0 lightColors, C37700a0 darkColors, EnumC37706c0 style, C37703b0 primaryButton) {
        AbstractC22676k.m65750j(lightColors, "lightColors");
        AbstractC22676k.m65750j(darkColors, "darkColors");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        this.f161573w = lightColors;
        this.f161574x = darkColors;
        this.f161575y = style;
        this.f161576z = primaryButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37709d0)) {
            return false;
        }
        C37709d0 c37709d0 = (C37709d0) obj;
        return AbstractC22676k.m65745e(this.f161573w, c37709d0.f161573w) && AbstractC22676k.m65745e(this.f161574x, c37709d0.f161574x) && this.f161575y == c37709d0.f161575y && AbstractC22676k.m65745e(this.f161576z, c37709d0.f161576z);
    }

    public final int hashCode() {
        return this.f161576z.hashCode() + ((this.f161575y.hashCode() + ((this.f161574x.hashCode() + (this.f161573w.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LinkAppearance(lightColors=" + this.f161573w + ", darkColors=" + this.f161574x + ", style=" + this.f161575y + ", primaryButton=" + this.f161576z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f161573w.writeToParcel(dest, i13);
        this.f161574x.writeToParcel(dest, i13);
        this.f161575y.writeToParcel(dest, i13);
        this.f161576z.writeToParcel(dest, i13);
    }
}
