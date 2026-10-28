package w20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C36723m implements InterfaceC36725o {

    /* JADX INFO: renamed from: w */
    public static final C36723m f157212w = new C36723m();
    public static final Parcelable.Creator<C36723m> CREATOR = new C36720j(1);

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
