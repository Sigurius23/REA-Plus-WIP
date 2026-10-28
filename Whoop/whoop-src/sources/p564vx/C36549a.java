package p564vx;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: vx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36549a implements InterfaceC36551c {

    /* JADX INFO: renamed from: w */
    public static final C36549a f156471w = new C36549a();
    public static final Parcelable.Creator<C36549a> CREATOR = new C35467g0(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C36549a);
    }

    public final int hashCode() {
        return 642243785;
    }

    public final String toString() {
        return "Observer";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
