package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C22062j extends AbstractC22063k {
    public static final Parcelable.Creator<C22062j> CREATOR = new C22060h(1);

    /* JADX INFO: renamed from: w */
    public final Throwable f85575w;

    public C22062j(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f85575w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22062j) && AbstractC22676k.m65745e(this.f85575w, ((C22062j) obj).f85575w);
    }

    public final int hashCode() {
        return this.f85575w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f85575w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f85575w);
    }
}
