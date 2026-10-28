package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.t4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38960t4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38960t4> CREATOR = new C38858i4(7);

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
