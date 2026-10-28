package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C1082p;
import p131f.C13766d;

/* JADX INFO: loaded from: classes5.dex */
class MediaBrowserCompat$ItemReceiver extends C13766d {
    @Override // p131f.C13766d
    /* JADX INFO: renamed from: b */
    public final void mo3134b(int i13, Bundle bundle) {
        if (bundle != null) {
            bundle = C1082p.m3219d(bundle);
        }
        if (i13 != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
