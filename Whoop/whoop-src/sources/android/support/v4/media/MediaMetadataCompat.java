package android.support.v4.media;

import a10.C0113a;
import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C1082p;
import p002a0.C0022g;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: y */
    public static final C0022g f4149y;

    /* JADX INFO: renamed from: w */
    public final Bundle f4150w;

    /* JADX INFO: renamed from: x */
    public MediaMetadata f4151x;

    static {
        C0022g c0022g = new C0022g(0);
        f4149y = c0022g;
        c0022g.put("android.media.metadata.TITLE", 1);
        c0022g.put("android.media.metadata.ARTIST", 1);
        c0022g.put("android.media.metadata.DURATION", 0);
        c0022g.put("android.media.metadata.ALBUM", 1);
        c0022g.put("android.media.metadata.AUTHOR", 1);
        c0022g.put("android.media.metadata.WRITER", 1);
        c0022g.put("android.media.metadata.COMPOSER", 1);
        c0022g.put("android.media.metadata.COMPILATION", 1);
        c0022g.put("android.media.metadata.DATE", 1);
        c0022g.put("android.media.metadata.YEAR", 0);
        c0022g.put("android.media.metadata.GENRE", 1);
        c0022g.put("android.media.metadata.TRACK_NUMBER", 0);
        c0022g.put("android.media.metadata.NUM_TRACKS", 0);
        c0022g.put("android.media.metadata.DISC_NUMBER", 0);
        c0022g.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0022g.put("android.media.metadata.ART", 2);
        c0022g.put("android.media.metadata.ART_URI", 1);
        c0022g.put("android.media.metadata.ALBUM_ART", 2);
        c0022g.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0022g.put("android.media.metadata.USER_RATING", 3);
        c0022g.put("android.media.metadata.RATING", 3);
        c0022g.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0022g.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0022g.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0022g.put("android.media.metadata.DISPLAY_ICON", 2);
        c0022g.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0022g.put("android.media.metadata.MEDIA_ID", 1);
        c0022g.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0022g.put("android.media.metadata.MEDIA_URI", 1);
        c0022g.put("android.media.metadata.ADVERTISEMENT", 0);
        c0022g.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0113a(22);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f4150w = bundle2;
        C1082p.m3218a(bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeBundle(this.f4150w);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f4150w = parcel.readBundle(C1082p.class.getClassLoader());
    }
}
