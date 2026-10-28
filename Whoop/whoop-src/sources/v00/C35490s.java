package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C35490s extends AbstractC35455a0 {

    /* JADX INFO: renamed from: w */
    public static final C35490s f151071w = new C35490s();
    public static final Parcelable.Creator<C35490s> CREATOR = new C35332g(21);

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
