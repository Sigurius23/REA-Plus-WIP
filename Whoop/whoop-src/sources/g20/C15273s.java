package g20;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C15273s extends AbstractC15276v {

    /* JADX INFO: renamed from: w */
    public static final C15273s f57359w = new C15273s();
    public static final Parcelable.Creator<C15273s> CREATOR = new C13433b(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C15273s);
    }

    public final int hashCode() {
        return -953289798;
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
