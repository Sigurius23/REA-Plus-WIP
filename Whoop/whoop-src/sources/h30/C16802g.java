package h30;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16802g implements InterfaceC16804i {

    /* JADX INFO: renamed from: w */
    public static final C16802g f64565w = new C16802g();
    public static final Parcelable.Creator<C16802g> CREATOR = new C16054r0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16802g);
    }

    public final int hashCode() {
        return -1217733236;
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
