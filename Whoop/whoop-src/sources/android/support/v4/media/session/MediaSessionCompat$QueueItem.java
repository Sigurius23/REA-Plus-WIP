package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C1081o(1);

    /* JADX INFO: renamed from: w */
    public final MediaDescriptionCompat f4156w;

    /* JADX INFO: renamed from: x */
    public final long f4157x;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f4156w = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f4157x = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("MediaSession.QueueItem {Description=");
        sb4.append(this.f4156w);
        sb4.append(", Id=");
        return AbstractC11266d.m30457k(this.f4157x, " }", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        this.f4156w.writeToParcel(parcel, i13);
        parcel.writeLong(this.f4157x);
    }
}
