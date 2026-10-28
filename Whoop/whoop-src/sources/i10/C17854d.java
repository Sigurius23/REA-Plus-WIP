package i10;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17854d extends AbstractC17857g {

    /* JADX INFO: renamed from: w */
    public static final C17854d f69476w = new C17854d();
    public static final Parcelable.Creator<C17854d> CREATOR = new C16054r0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C17854d);
    }

    public final int hashCode() {
        return 52141336;
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
