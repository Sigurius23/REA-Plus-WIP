package c10;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c10.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C3827j extends AbstractC3830m {

    /* JADX INFO: renamed from: w */
    public static final C3827j f15664w = new C3827j();
    public static final Parcelable.Creator<C3827j> CREATOR = new C2125b(6);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C3827j);
    }

    public final int hashCode() {
        return -85410951;
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
