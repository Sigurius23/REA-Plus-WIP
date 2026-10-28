package com.whoop.service.push.notifications;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/service/push/notifications/NotificationDismissedReceiver;", "Landroid/content/BroadcastReceiver;", "Lof3/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Ll83/a0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "a", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class NotificationDismissedReceiver extends BroadcastReceiver implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x */
    public static final int f29514x = 8;

    /* JADX INFO: renamed from: com.whoop.service.push.notifications.NotificationDismissedReceiver$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/service/push/notifications/NotificationDismissedReceiver$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "notificationType", "", "flags", "requestCode", "Landroid/app/PendingIntent;", "a", "(Landroid/content/Context;Ljava/lang/String;II)Landroid/app/PendingIntent;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ PendingIntent m24516b(Companion companion, Context context, String str, int i13, int i14, int i15, Object obj) {
            if ((i15 & 4) != 0) {
                i13 = 0;
            }
            if ((i15 & 8) != 0) {
                i14 = 0;
            }
            return companion.m24517a(context, str, i13, i14);
        }

        /* JADX INFO: renamed from: a */
        public final PendingIntent m24517a(Context context, String notificationType, int flags, int requestCode) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(notificationType, "notificationType");
            Intent intent = new Intent(context, (Class<?>) NotificationDismissedReceiver.class);
            intent.putExtra("NotificationType", notificationType);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, requestCode, intent, 67108864 | flags);
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
    public void onReceive(Context context, Intent intent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        ((InterfaceC40188b) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).getDispatcher().m129020W(intent.getStringExtra("NotificationType"));
    }
}
