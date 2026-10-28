package p483s8;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: renamed from: s8.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32248a {
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m100343a() {
        return new Notification.MediaStyle();
    }

    /* JADX INFO: renamed from: b */
    public static Notification.MediaStyle m100344b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m100347e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m100345c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f4160x);
        }
        return mediaStyle;
    }

    /* JADX INFO: renamed from: c */
    public static void m100345c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* JADX INFO: renamed from: d */
    public static void m100346d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* JADX INFO: renamed from: e */
    public static void m100347e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
