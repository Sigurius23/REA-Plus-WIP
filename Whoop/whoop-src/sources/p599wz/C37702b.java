package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37702b implements InterfaceC37711e {

    /* JADX INFO: renamed from: w */
    public static final C37702b f161559w = new C37702b();
    public static final Parcelable.Creator<C37702b> CREATOR = new C37677f(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C37702b);
    }

    public final int hashCode() {
        return -56225397;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
