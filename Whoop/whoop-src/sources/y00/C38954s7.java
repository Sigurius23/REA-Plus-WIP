package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.s7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38954s7 extends AbstractC38990w7 {

    /* JADX INFO: renamed from: w */
    public static final C38954s7 f167673w = new C38954s7();
    public static final Parcelable.Creator<C38954s7> CREATOR = new C38821e7(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C38954s7);
    }

    public final int hashCode() {
        return -208193446;
    }

    public final String toString() {
        return "IntentConfirmationChallenge";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
