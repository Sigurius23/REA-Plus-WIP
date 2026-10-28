package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33126d0 extends AbstractC33132g0 {

    /* JADX INFO: renamed from: w */
    public static final C33126d0 f138188w = new C33126d0();
    public static final Parcelable.Creator<C33126d0> CREATOR = new C33133h(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C33126d0);
    }

    public final int hashCode() {
        return -299418266;
    }

    public final String toString() {
        return "Canceled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
