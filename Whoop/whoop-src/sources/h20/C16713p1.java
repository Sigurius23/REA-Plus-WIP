package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16713p1 extends AbstractC16737t1 {

    /* JADX INFO: renamed from: w */
    public static final C16713p1 f64245w = new C16713p1();
    public static final Parcelable.Creator<C16713p1> CREATOR = new C16699n(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C16713p1);
    }

    public final int hashCode() {
        return 1733345294;
    }

    public final String toString() {
        return "All";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
