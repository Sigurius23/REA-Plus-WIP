package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p482s7.AbstractC32237a;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.EnumC29820h;
import y00.EnumC38941r3;

/* JADX INFO: renamed from: v00.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35465f0 implements InterfaceC35471i0 {

    /* JADX INFO: renamed from: w */
    public static final C35465f0 f151003w = new C35465f0();
    public static final Parcelable.Creator<C35465f0> CREATOR = new C35332g(29);

    @Override // v00.InterfaceC35471i0
    /* JADX INFO: renamed from: L */
    public final EnumC38941r3 mo112545L(boolean z4, EnumC29820h enumC29820h) {
        return AbstractC32237a.m100287a(this, z4, enumC29820h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C35465f0);
    }

    public final int hashCode() {
        return -1481436890;
    }

    public final String toString() {
        return "Enabled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
