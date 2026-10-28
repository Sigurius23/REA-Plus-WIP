package h30;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16801f implements InterfaceC16804i {

    /* JADX INFO: renamed from: w */
    public static final C16801f f64564w = new C16801f();
    public static final Parcelable.Creator<C16801f> CREATOR = new C16054r0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16801f);
    }

    public final int hashCode() {
        return 991179064;
    }

    public final String toString() {
        return "Canceled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
