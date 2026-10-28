package p483s8;

import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;

/* JADX INFO: renamed from: s8.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C32251d extends C32252e {
    @Override // p483s8.C32252e, androidx.core.app.NotificationCompat.Style
    public final void apply(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC32248a.m100346d(notificationBuilderWithBuilderAccessor.getBuilder(), AbstractC32248a.m100344b(AbstractC32250c.m100349a(AbstractC32249b.m100348a(), null, 0, null, Boolean.FALSE), null, this.f133498a));
        } else {
            AbstractC32248a.m100346d(notificationBuilderWithBuilderAccessor.getBuilder(), AbstractC32248a.m100344b(AbstractC32249b.m100348a(), null, this.f133498a));
        }
    }

    @Override // p483s8.C32252e, androidx.core.app.NotificationCompat.Style
    public final RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    @Override // p483s8.C32252e, androidx.core.app.NotificationCompat.Style
    public final RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }

    @Override // androidx.core.app.NotificationCompat.Style
    public final RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        return null;
    }
}
