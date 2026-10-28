package c10;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c10.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C3828k extends AbstractC3830m {

    /* JADX INFO: renamed from: w */
    public static final C3828k f15665w = new C3828k();
    public static final Parcelable.Creator<C3828k> CREATOR = new C2125b(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3828k);
    }

    public final int hashCode() {
        return -232285333;
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
