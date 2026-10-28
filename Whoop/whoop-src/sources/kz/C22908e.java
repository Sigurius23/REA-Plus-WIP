package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C22908e extends AbstractC22911h {

    /* JADX INFO: renamed from: w */
    public static final C22908e f90456w = new C22908e();
    public static final Parcelable.Creator<C22908e> CREATOR = new C22060h(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22908e);
    }

    public final int hashCode() {
        return -1375852025;
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
