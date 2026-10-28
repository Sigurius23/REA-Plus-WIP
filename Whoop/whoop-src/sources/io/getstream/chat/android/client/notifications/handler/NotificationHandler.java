package io.getstream.chat.android.client.notifications.handler;

import a13.EnumC0147e;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationReminderDueEvent;
import io.getstream.chat.android.models.PushMessage;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "", "Lio/getstream/chat/android/client/events/NewMessageEvent;", NotificationCompat.CATEGORY_EVENT, "", "onChatEvent", "(Lio/getstream/chat/android/client/events/NewMessageEvent;)Z", "Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;", "onNotificationReminderDueEvent", "(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)Z", "Lio/getstream/chat/android/models/PushMessage;", "message", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;)Z", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notification", "Ll83/a0;", "showNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "", "channelType", "channelId", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "dismissAllNotifications", "()V", "La13/e;", NotificationCompat.CATEGORY_STATUS, "onNotificationPermissionStatus", "(La13/e;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface NotificationHandler {
    void dismissAllNotifications();

    void dismissChannelNotifications(String channelType, String channelId);

    default boolean onChatEvent(NewMessageEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return true;
    }

    void onNotificationPermissionStatus(EnumC0147e status);

    default boolean onNotificationReminderDueEvent(NotificationReminderDueEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return true;
    }

    default boolean onPushMessage(PushMessage message) {
        AbstractC22676k.m65750j(message, "message");
        return false;
    }

    void showNotification(ChatNotification notification);
}
