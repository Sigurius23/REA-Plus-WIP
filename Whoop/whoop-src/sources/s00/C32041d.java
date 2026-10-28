package s00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32041d extends AbstractC32044g {

    /* JADX INFO: renamed from: w */
    public static final C32041d f132915w = new C32041d();
    public static final Parcelable.Creator<C32041d> CREATOR = new C29912j0(19);

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
