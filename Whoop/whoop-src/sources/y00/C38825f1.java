package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38825f1 implements InterfaceC38845h1 {

    /* JADX INFO: renamed from: w */
    public static final C38825f1 f167082w = new C38825f1();
    public static final Parcelable.Creator<C38825f1> CREATOR = new C38992x0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38825f1);
    }

    public final int hashCode() {
        return -269074152;
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
