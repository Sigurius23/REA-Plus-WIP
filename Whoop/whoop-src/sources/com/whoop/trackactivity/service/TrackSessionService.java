package com.whoop.trackactivity.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import vk2.C36091c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/trackactivity/service/TrackSessionService;", "Landroid/app/Service;", "<init>", "()V", "", "gpsTrackingEnabled", "", "a", "(Z)I", "Landroid/content/Intent;", "intent", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TrackSessionService extends Service {

    /* JADX INFO: renamed from: x */
    public static final int f31445x = 8;

    /* JADX INFO: renamed from: a */
    private final int m26522a(boolean gpsTrackingEnabled) {
        return gpsTrackingEnabled ? 8 : 16;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("com.whoop.trackactivity.EXTRA_GPS_TRACKING_ENABLED", false) : false;
        Notification notificationM114638a = C36091c.f154231a.m114638a(this);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(128, notificationM114638a, m26522a(booleanExtra));
            return 2;
        }
        startForeground(128, notificationM114638a);
        return 2;
    }
}
