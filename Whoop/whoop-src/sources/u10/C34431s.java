package u10;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u10.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C34431s implements InterfaceC34432t {

    /* JADX INFO: renamed from: w */
    public static final C34431s f144674w = new C34431s();
    public static final Parcelable.Creator<C34431s> CREATOR = new C32854e(16);

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
