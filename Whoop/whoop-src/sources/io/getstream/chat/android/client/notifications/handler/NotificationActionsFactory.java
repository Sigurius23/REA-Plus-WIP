package io.getstream.chat.android.client.notifications.handler;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.client.receivers.NotificationMessageReceiver;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012JF\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;", "", "<init>", "()V", "createMarkReadAction", "Landroidx/core/app/NotificationCompat$Action;", "context", "Landroid/content/Context;", "notificationId", "", "channel", "Lio/getstream/chat/android/models/Channel;", "message", "Lio/getstream/chat/android/models/Message;", "icon", "title", "", "pendingIntent", "Landroid/app/PendingIntent;", "createReplyAction", "hint", "createMarkReadPendingIntent", "createReplyPendingIntent", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NotificationActionsFactory {
    public static final NotificationActionsFactory INSTANCE = new NotificationActionsFactory();

    private NotificationActionsFactory() {
    }

    public static NotificationCompat.Action createMarkReadAction$default(NotificationActionsFactory notificationActionsFactory, Context context, int i13, Channel channel, Message message, int i14, String str, PendingIntent pendingIntent, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            i14 = R.drawable.ic_menu_view;
        }
        int i16 = i14;
        if ((i15 & 32) != 0) {
            str = context.getString(C18999R.string.stream_chat_notification_read);
            AbstractC22676k.m65749i(str, "getString(...)");
        }
        String str2 = str;
        if ((i15 & 64) != 0) {
            notificationActionsFactory.getClass();
            pendingIntent = NotificationMessageReceiver.INSTANCE.createMarkReadPendingIntent$stream_chat_android_client_release(context, i13, channel, message);
        }
        return notificationActionsFactory.createMarkReadAction(context, i13, channel, message, i16, str2, pendingIntent);
    }

    private final PendingIntent createMarkReadPendingIntent(Context context, int notificationId, Channel channel, Message message) {
        return NotificationMessageReceiver.INSTANCE.createMarkReadPendingIntent$stream_chat_android_client_release(context, notificationId, channel, message);
    }

    public static NotificationCompat.Action createReplyAction$default(NotificationActionsFactory notificationActionsFactory, Context context, int i13, Channel channel, int i14, String str, String str2, PendingIntent pendingIntent, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            i14 = R.drawable.ic_menu_send;
        }
        int i16 = i14;
        if ((i15 & 16) != 0) {
            str = context.getString(C18999R.string.stream_chat_notification_reply);
            AbstractC22676k.m65749i(str, "getString(...)");
        }
        String str3 = str;
        if ((i15 & 32) != 0) {
            str2 = context.getString(C18999R.string.stream_chat_notification_type_hint);
            AbstractC22676k.m65749i(str2, "getString(...)");
        }
        String str4 = str2;
        if ((i15 & 64) != 0) {
            notificationActionsFactory.getClass();
            pendingIntent = NotificationMessageReceiver.INSTANCE.createReplyPendingIntent$stream_chat_android_client_release(context, i13, channel);
        }
        return notificationActionsFactory.createReplyAction(context, i13, channel, i16, str3, str4, pendingIntent);
    }

    private final PendingIntent createReplyPendingIntent(Context context, int notificationId, Channel channel) {
        return NotificationMessageReceiver.INSTANCE.createReplyPendingIntent$stream_chat_android_client_release(context, notificationId, channel);
    }

    public final NotificationCompat.Action createMarkReadAction(Context context, int notificationId, Channel channel, Message message, int icon, String title, PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        return NotificationMessageReceiver.INSTANCE.createMarkReadAction$stream_chat_android_client_release(context, notificationId, channel, message, icon, title, pendingIntent);
    }

    public final NotificationCompat.Action createReplyAction(Context context, int notificationId, Channel channel, int icon, String title, String hint, PendingIntent pendingIntent) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(pendingIntent, "pendingIntent");
        return NotificationMessageReceiver.INSTANCE.createReplyAction$stream_chat_android_client_release(context, notificationId, channel, icon, title, hint, pendingIntent);
    }
}
