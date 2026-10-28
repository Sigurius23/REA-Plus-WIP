package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* JADX INFO: renamed from: android.support.v4.media.session.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1084r {
    /* JADX INFO: renamed from: a */
    public static Bundle m3246a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    /* JADX INFO: renamed from: b */
    public static void m3247b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
