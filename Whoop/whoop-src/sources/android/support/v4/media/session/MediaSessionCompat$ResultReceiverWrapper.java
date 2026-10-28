package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new C1081o(0);

    /* JADX INFO: renamed from: w */
    public ResultReceiver f4158w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        this.f4158w.writeToParcel(parcel, i13);
    }
}
