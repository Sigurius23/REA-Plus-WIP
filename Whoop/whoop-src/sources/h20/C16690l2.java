package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.l2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16690l2 implements InterfaceC16702n2 {

    /* JADX INFO: renamed from: w */
    public static final C16690l2 f64193w = new C16690l2();
    public static final Parcelable.Creator<C16690l2> CREATOR = new C16654f2(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16690l2);
    }

    public final int hashCode() {
        return -131175288;
    }

    public final String toString() {
        return "Default";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
