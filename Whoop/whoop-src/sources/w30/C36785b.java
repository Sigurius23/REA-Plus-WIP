package w30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: w30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36785b implements InterfaceC36786c {

    /* JADX INFO: renamed from: w */
    public static final C36785b f157369w = new C36785b();
    public static final Parcelable.Creator<C36785b> CREATOR = new C35467g0(15);

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
