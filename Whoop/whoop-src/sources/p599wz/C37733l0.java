package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37733l0 implements InterfaceC37739n0 {

    /* JADX INFO: renamed from: w */
    public static final C37733l0 f161684w = new C37733l0();
    public static final Parcelable.Creator<C37733l0> CREATOR = new C37677f(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C37733l0);
    }

    public final int hashCode() {
        return 115601132;
    }

    @Override // p599wz.InterfaceC37739n0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC38794c0 mo121146n0() {
        return AbstractC37740n1.m121156e(this);
    }

    public final String toString() {
        return "Full";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
