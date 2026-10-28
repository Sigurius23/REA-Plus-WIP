package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39984g implements InterfaceC39987j {

    /* JADX INFO: renamed from: w */
    public static final C39984g f172551w = new C39984g();
    public static final Parcelable.Creator<C39984g> CREATOR = new C38821e7(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C39984g);
    }

    public final int hashCode() {
        return 1430639253;
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
