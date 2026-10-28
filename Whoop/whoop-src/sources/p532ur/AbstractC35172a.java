package p532ur;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;

/* JADX INFO: renamed from: ur.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35172a implements Parcelable {
    public static final Parcelable.Creator<AbstractC35172a> CREATOR = new C32854e(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        C35174c c35174c = (C35174c) this;
        parcel.writeParcelable(c35174c.f149280w, 0);
        parcel.writeInt(c35174c.f149281x ? 1 : 0);
    }
}
