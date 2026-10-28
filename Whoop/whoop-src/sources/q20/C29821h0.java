package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29821h0 extends AbstractC29825j0 {

    /* JADX INFO: renamed from: w */
    public static final C29821h0 f121897w = new C29821h0();
    public static final Parcelable.Creator<C29821h0> CREATOR = new C29831p(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29821h0);
    }

    public final int hashCode() {
        return -1587167398;
    }

    public final String toString() {
        return "None";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
