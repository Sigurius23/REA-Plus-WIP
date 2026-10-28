package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C16705o extends AbstractC16723r {

    /* JADX INFO: renamed from: w */
    public static final C16705o f64232w = new C16705o();
    public static final Parcelable.Creator<C16705o> CREATOR = new C16699n(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16705o);
    }

    public final int hashCode() {
        return -1307955248;
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
