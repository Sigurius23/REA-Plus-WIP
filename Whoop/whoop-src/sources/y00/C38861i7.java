package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38861i7 extends AbstractC38792b8 {

    /* JADX INFO: renamed from: w */
    public static final C38861i7 f167283w = new C38861i7();
    public static final Parcelable.Creator<C38861i7> CREATOR = new C38821e7(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38861i7);
    }

    public final int hashCode() {
        return 1031794127;
    }

    public final String toString() {
        return "BlikAuthorize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
