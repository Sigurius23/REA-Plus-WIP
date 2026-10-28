package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C1081o(3);

    /* JADX INFO: renamed from: E */
    public int f4163E;

    /* JADX INFO: renamed from: w */
    public int f4164w;

    /* JADX INFO: renamed from: x */
    public int f4165x;

    /* JADX INFO: renamed from: y */
    public int f4166y;

    /* JADX INFO: renamed from: z */
    public int f4167z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f4164w);
        parcel.writeInt(this.f4166y);
        parcel.writeInt(this.f4167z);
        parcel.writeInt(this.f4163E);
        parcel.writeInt(this.f4165x);
    }
}
