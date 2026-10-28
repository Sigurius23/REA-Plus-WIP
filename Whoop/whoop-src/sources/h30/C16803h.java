package h30;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16803h implements InterfaceC16804i {
    public static final Parcelable.Creator<C16803h> CREATOR = new C16054r0(12);

    /* JADX INFO: renamed from: w */
    public final Throwable f64566w;

    public C16803h(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f64566w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16803h) && AbstractC22676k.m65745e(this.f64566w, ((C16803h) obj).f64566w);
    }

    public final int hashCode() {
        return this.f64566w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f64566w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f64566w);
    }
}
