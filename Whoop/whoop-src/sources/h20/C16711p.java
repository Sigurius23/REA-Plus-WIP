package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C16711p extends AbstractC16723r {

    /* JADX INFO: renamed from: w */
    public static final C16711p f64242w = new C16711p();
    public static final Parcelable.Creator<C16711p> CREATOR = new C16699n(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16711p);
    }

    public final int hashCode() {
        return 523547124;
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
