package io.getstream.video.android.core.notifications.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/getstream/video/android/core/notifications/internal/DismissNotificationActivity;", "Landroid/app/Activity;", "<init>", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class DismissNotificationActivity extends Activity {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74906w = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NotificationManagerCompat.from(this).cancel(getIntent().getIntExtra("KEY_NOTIFICATION_ID", 0));
        finish();
    }
}
