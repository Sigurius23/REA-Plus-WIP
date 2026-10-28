package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C33143m extends AbstractC33147o {

    /* JADX INFO: renamed from: w */
    public static final C33143m f138229w = new C33143m();
    public static final Parcelable.Creator<C33143m> CREATOR = new C33133h(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C33143m);
    }

    public final int hashCode() {
        return -693310069;
    }

    public final String toString() {
        return "Completed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
