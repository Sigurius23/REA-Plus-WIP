package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29817f0 extends AbstractC29825j0 {

    /* JADX INFO: renamed from: w */
    public static final C29817f0 f121885w = new C29817f0();
    public static final Parcelable.Creator<C29817f0> CREATOR = new C29831p(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29817f0);
    }

    public final int hashCode() {
        return 763345101;
    }

    public final String toString() {
        return "GooglePay";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
