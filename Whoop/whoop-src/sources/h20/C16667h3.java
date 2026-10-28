package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.h3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16667h3 implements Parcelable {
    public static final Parcelable.Creator<C16667h3> CREATOR = new C16654f2(18);

    /* JADX INFO: renamed from: x */
    public static final C16667h3 f64099x = new C16667h3(-1.0f);

    /* JADX INFO: renamed from: w */
    public final float f64100w;

    public C16667h3(float f13) {
        this.f64100w = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16667h3) && Float.compare(this.f64100w, ((C16667h3) obj).f64100w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64100w);
    }

    public final String toString() {
        return "Spacing(spacingDp=" + this.f64100w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f64100w);
    }
}
