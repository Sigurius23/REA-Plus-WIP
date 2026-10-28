package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z10.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C39992o extends AbstractC39995r {

    /* JADX INFO: renamed from: w */
    public static final C39992o f172567w = new C39992o();
    public static final Parcelable.Creator<C39992o> CREATOR = new C39988k(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C39992o);
    }

    public final int hashCode() {
        return -338128877;
    }

    public final String toString() {
        return "Cancelled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
