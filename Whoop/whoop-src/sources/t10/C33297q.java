package t10;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C33297q implements InterfaceC33299s {

    /* JADX INFO: renamed from: w */
    public static final C33297q f138864w = new C33297q();
    public static final Parcelable.Creator<C33297q> CREATOR = new C32854e(4);

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
