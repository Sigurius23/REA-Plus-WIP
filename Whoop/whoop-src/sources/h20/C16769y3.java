package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16769y3 extends AbstractC16632b4 {
    public static final Parcelable.Creator<C16769y3> CREATOR = new C16654f2(26);

    /* JADX INFO: renamed from: w */
    public final boolean f64450w;

    public C16769y3(boolean z4) {
        this.f64450w = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16769y3) && this.f64450w == ((C16769y3) obj).f64450w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64450w);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Canceled(irrelevantValueForGeneratedCode=", ")", this.f64450w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f64450w ? 1 : 0);
    }
}
