package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.q3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16721q3 implements Parcelable {
    public static final Parcelable.Creator<C16721q3> CREATOR = new C16654f2(22);

    /* JADX INFO: renamed from: w */
    public final boolean f64261w;

    /* JADX INFO: renamed from: x */
    public final C16703n3 f64262x;

    /* JADX INFO: renamed from: y */
    public final C16707o1 f64263y;

    public C16721q3(boolean z4, C16703n3 visibility, C16707o1 buttonThemes) {
        AbstractC22676k.m65750j(visibility, "visibility");
        AbstractC22676k.m65750j(buttonThemes, "buttonThemes");
        this.f64261w = z4;
        this.f64262x = visibility;
        this.f64263y = buttonThemes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16721q3)) {
            return false;
        }
        C16721q3 c16721q3 = (C16721q3) obj;
        return this.f64261w == c16721q3.f64261w && AbstractC22676k.m65745e(this.f64262x, c16721q3.f64262x) && AbstractC22676k.m65745e(this.f64263y, c16721q3.f64263y);
    }

    public final int hashCode() {
        return this.f64263y.f64235w.hashCode() + ((this.f64262x.hashCode() + (Boolean.hashCode(this.f64261w) * 31)) * 31);
    }

    public final String toString() {
        return "WalletButtonsConfiguration(willDisplayExternally=" + this.f64261w + ", visibility=" + this.f64262x + ", buttonThemes=" + this.f64263y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f64261w ? 1 : 0);
        this.f64262x.writeToParcel(dest, i13);
        this.f64263y.writeToParcel(dest, i13);
    }
}
