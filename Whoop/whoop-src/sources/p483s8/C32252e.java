package p483s8;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;

/* JADX INFO: renamed from: s8.e */
/* JADX INFO: loaded from: classes5.dex */
public class C32252e extends NotificationCompat.Style {

    /* JADX INFO: renamed from: a */
    public MediaSessionCompat$Token f133498a;

    @Override // androidx.core.app.NotificationCompat.Style
    public void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC32248a.m100346d(notificationBuilderWithBuilderAccessor.getBuilder(), AbstractC32248a.m100344b(AbstractC32250c.m100349a(AbstractC32248a.m100343a(), null, 0, null, Boolean.FALSE), null, this.f133498a));
        } else {
            AbstractC32248a.m100346d(notificationBuilderWithBuilderAccessor.getBuilder(), AbstractC32248a.m100344b(AbstractC32248a.m100343a(), null, this.f133498a));
        }
    }

    @Override // androidx.core.app.NotificationCompat.Style
    public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat.Style
    public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }
}
