package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.a4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16626a4 extends AbstractC16632b4 {
    public static final Parcelable.Creator<C16626a4> CREATOR = new C16654f2(28);

    /* JADX INFO: renamed from: w */
    public final Throwable f63963w;

    public C16626a4(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f63963w = error;
    }

    /* JADX INFO: renamed from: b */
    public final Throwable m47223b() {
        return this.f63963w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16626a4) && AbstractC22676k.m65745e(this.f63963w, ((C16626a4) obj).f63963w);
    }

    public final int hashCode() {
        return this.f63963w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f63963w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f63963w);
    }
}
