package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* JADX INFO: renamed from: android.support.v4.media.session.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1081o implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4204a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4204a) {
            case 0:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.f4158w = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 3:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.f4164w = parcel.readInt();
                parcelableVolumeInfo.f4166y = parcel.readInt();
                parcelableVolumeInfo.f4167z = parcel.readInt();
                parcelableVolumeInfo.f4163E = parcel.readInt();
                parcelableVolumeInfo.f4165x = parcel.readInt();
                return parcelableVolumeInfo;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i13) {
        switch (this.f4204a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i13];
            case 1:
                return new MediaSessionCompat$QueueItem[i13];
            case 2:
                return new MediaSessionCompat$Token[i13];
            case 3:
                return new ParcelableVolumeInfo[i13];
            default:
                return new PlaybackStateCompat[i13];
        }
    }
}
