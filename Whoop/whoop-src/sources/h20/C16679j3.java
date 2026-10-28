package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.j3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16679j3 implements Parcelable {
    public static final Parcelable.Creator<C16679j3> CREATOR = new C16654f2(20);

    /* JADX INFO: renamed from: w */
    public final C16685k3 f64141w;

    public C16679j3(C16685k3 c16685k3) {
        this.f64141w = c16685k3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16679j3) && AbstractC22676k.m65745e(this.f64141w, ((C16679j3) obj).f64141w);
    }

    public final int hashCode() {
        C16685k3 c16685k3 = this.f64141w;
        if (c16685k3 == null) {
            return 0;
        }
        return c16685k3.hashCode();
    }

    public final String toString() {
        return "Custom(h1=" + this.f64141w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16685k3 c16685k3 = this.f64141w;
        if (c16685k3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16685k3.writeToParcel(dest, i13);
        }
    }
}
