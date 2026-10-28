package b30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.z5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2671z5 implements InterfaceC2481a6 {

    /* JADX INFO: renamed from: w */
    public static final C2671z5 f10463w = new C2671z5();
    public static final Parcelable.Creator<C2671z5> CREATOR = new C2650w5(2);

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
