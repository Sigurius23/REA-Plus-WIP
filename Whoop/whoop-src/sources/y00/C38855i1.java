package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38855i1 implements InterfaceC38875k1 {

    /* JADX INFO: renamed from: w */
    public static final C38855i1 f167268w = new C38855i1();
    public static final Parcelable.Creator<C38855i1> CREATOR = new C38992x0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38855i1);
    }

    public final int hashCode() {
        return -1145758141;
    }

    public final String toString() {
        return "Disabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
