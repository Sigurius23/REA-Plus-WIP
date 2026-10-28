package g20;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C15274t extends AbstractC15276v {

    /* JADX INFO: renamed from: w */
    public static final C15274t f57360w = new C15274t();
    public static final Parcelable.Creator<C15274t> CREATOR = new C13433b(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C15274t);
    }

    public final int hashCode() {
        return -1366725814;
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
