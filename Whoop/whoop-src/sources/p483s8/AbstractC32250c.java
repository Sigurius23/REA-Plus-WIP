package p483s8;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* JADX INFO: renamed from: s8.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32250c {
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: a */
    public static Notification.MediaStyle m100349a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i13, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i13, pendingIntent);
        }
        return mediaStyle;
    }
}
