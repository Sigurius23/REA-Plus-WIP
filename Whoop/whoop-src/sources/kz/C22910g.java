package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C22910g extends AbstractC22911h {
    public static final Parcelable.Creator<C22910g> CREATOR = new C22060h(12);

    /* JADX INFO: renamed from: w */
    public final Throwable f90460w;

    public C22910g(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f90460w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22910g) && AbstractC22676k.m65745e(this.f90460w, ((C22910g) obj).f90460w);
    }

    public final int hashCode() {
        return this.f90460w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f90460w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f90460w);
    }
}
