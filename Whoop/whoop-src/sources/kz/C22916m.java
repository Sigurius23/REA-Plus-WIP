package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C22916m extends AbstractC22917n {
    public static final Parcelable.Creator<C22916m> CREATOR = new C22060h(15);

    /* JADX INFO: renamed from: w */
    public final Throwable f90471w;

    public C22916m(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f90471w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22916m) && AbstractC22676k.m65745e(this.f90471w, ((C22916m) obj).f90471w);
    }

    public final int hashCode() {
        return this.f90471w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f90471w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f90471w);
    }
}
