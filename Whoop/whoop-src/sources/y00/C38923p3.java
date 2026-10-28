package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38923p3 implements InterfaceC38932q3 {

    /* JADX INFO: renamed from: w */
    public static final C38923p3 f167550w = new C38923p3();
    public static final Parcelable.Creator<C38923p3> CREATOR = new C38967u2(12);

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: I */
    public final boolean mo124361I() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38923p3);
    }

    public final int hashCode() {
        return 436825404;
    }

    public final String toString() {
        return "Refresh";
    }

    @Override // y00.InterfaceC38932q3
    /* JADX INFO: renamed from: u */
    public final long mo124362u() {
        return 0L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
