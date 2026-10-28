package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37724i0 implements InterfaceC37739n0 {
    public static final Parcelable.Creator<C37724i0> CREATOR = new C37677f(14);

    /* JADX INFO: renamed from: w */
    public final boolean f161656w;

    public C37724i0(boolean z4) {
        this.f161656w = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37724i0) && this.f161656w == ((C37724i0) obj).f161656w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161656w);
    }

    @Override // p599wz.InterfaceC37739n0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC38794c0 mo121146n0() {
        return AbstractC37740n1.m121156e(this);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Authentication(existingOnly=", ")", this.f161656w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f161656w ? 1 : 0);
    }
}
