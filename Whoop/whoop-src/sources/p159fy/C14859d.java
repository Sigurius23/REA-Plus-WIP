package p159fy;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fy.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14859d implements Parcelable {

    /* JADX INFO: renamed from: w */
    public static final C14859d f55485w = new C14859d();
    public static final Parcelable.Creator<C14859d> CREATOR = new C13433b(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C14859d);
    }

    public final int hashCode() {
        return 1608486069;
    }

    public final String toString() {
        return "PassiveChallengeWarmerCompleted";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
