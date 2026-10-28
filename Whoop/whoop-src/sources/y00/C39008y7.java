package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.y7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39008y7 extends AbstractC38792b8 {

    /* JADX INFO: renamed from: w */
    public static final C39008y7 f167900w = new C39008y7();
    public static final Parcelable.Creator<C39008y7> CREATOR = new C38821e7(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C39008y7);
    }

    public final int hashCode() {
        return -1021414879;
    }

    public final String toString() {
        return "UpiAwaitNotification";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
