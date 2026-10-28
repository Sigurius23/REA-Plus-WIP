package com.whoop.service.push.notifications;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p479s4.AbstractC32126g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import z82.C40193g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/service/push/notifications/NotificationClickedReceiver;", "Landroid/content/BroadcastReceiver;", "Lof3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NotificationClickedReceiver extends BroadcastReceiver implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x */
    public static final int f29512x = 8;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.NotificationClickedReceiver$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/service/push/notifications/NotificationClickedReceiver$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "notificationType", "Landroid/app/PendingIntent;", "contentPendingIntent", "", "requestCode", "flags", "a", "(Landroid/content/Context;Ljava/lang/String;Landroid/app/PendingIntent;II)Landroid/app/PendingIntent;", "KEY_NOTIFICATION_TYPE", "Ljava/lang/String;", "KEY_CONTENT_PENDING_INTENT", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ PendingIntent m24514b(Companion companion, Context context, String str, PendingIntent pendingIntent, int i13, int i14, int i15, Object obj) {
            if ((i15 & 16) != 0) {
                i14 = 0;
            }
            return companion.m24515a(context, str, pendingIntent, i13, i14);
        }

        /* JADX INFO: renamed from: a */
        public final PendingIntent m24515a(Context context, String notificationType, PendingIntent contentPendingIntent, int requestCode, int flags) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(notificationType, "notificationType");
            AbstractC22676k.m65750j(contentPendingIntent, "contentPendingIntent");
            Intent intent = new Intent(context, (Class<?>) NotificationClickedReceiver.class);
            intent.putExtra("NotificationType", notificationType);
            intent.putExtra("ContentPendingIntent", contentPendingIntent);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, requestCode, intent, 201326592 | flags);
            AbstractC22676k.m65749i(broadcast, "getBroadcast(...)");
            return broadcast;
        }

        private Companion() {
        }
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws PendingIntent.CanceledException {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        String stringExtra = intent.getStringExtra("NotificationType");
        if (stringExtra != null) {
            ((C40193g) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40193g.class), null)).m129073a(stringExtra);
        }
        PendingIntent pendingIntent = (PendingIntent) AbstractC32126g.m100043h(intent, "ContentPendingIntent", PendingIntent.class);
        if (pendingIntent != null) {
            pendingIntent.send();
        }
    }
}
