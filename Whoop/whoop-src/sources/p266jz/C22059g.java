package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C22059g extends AbstractC22063k {

    /* JADX INFO: renamed from: w */
    public static final C22059g f85571w = new C22059g();
    public static final Parcelable.Creator<C22059g> CREATOR = new C16054r0(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22059g);
    }

    public final int hashCode() {
        return -890158026;
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
