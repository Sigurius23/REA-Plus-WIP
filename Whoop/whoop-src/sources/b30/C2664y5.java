package b30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.y5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2664y5 implements InterfaceC2481a6 {

    /* JADX INFO: renamed from: w */
    public static final C2664y5 f10428w = new C2664y5();
    public static final Parcelable.Creator<C2664y5> CREATOR = new C2650w5(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
