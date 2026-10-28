package m30;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m30.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24985a implements InterfaceC24987c, Parcelable {

    /* JADX INFO: renamed from: w */
    public final String f97782w;

    /* JADX INFO: renamed from: x */
    public final String f97783x;

    /* JADX INFO: renamed from: y */
    public final int f97784y;

    public AbstractC24985a(Parcel parcel) {
        this.f97782w = parcel.readString();
        this.f97783x = parcel.readString();
        this.f97784y = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f97782w);
        parcel.writeString(this.f97783x);
        parcel.writeInt(this.f97784y);
    }
}
