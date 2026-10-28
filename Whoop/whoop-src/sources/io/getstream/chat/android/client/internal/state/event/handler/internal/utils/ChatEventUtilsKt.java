package io.getstream.chat.android.client.internal.state.event.handler.internal.utils;

import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.ConnectedEvent;
import io.getstream.chat.android.client.events.MarkAllReadEvent;
import io.getstream.chat.android.client.events.MessageDeliveredEvent;
import io.getstream.chat.android.client.events.MessageReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkReadEvent;
import io.getstream.chat.android.client.events.NotificationMarkUnreadEvent;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.models.ChannelUserRead;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\bH\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\tH\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\nH\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u000bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, m65681d2 = {"realType", "", "Lio/getstream/chat/android/client/events/ChatEvent;", "getRealType", "(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;", "toChannelUserRead", "Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/client/events/MessageReadEvent;", "Lio/getstream/chat/android/client/events/MessageDeliveredEvent;", "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;", "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;", "Lio/getstream/chat/android/client/events/MarkAllReadEvent;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatEventUtilsKt {
    public static final String getRealType(ChatEvent chatEvent) {
        AbstractC22676k.m65750j(chatEvent, "<this>");
        return chatEvent instanceof ConnectedEvent ? "connection.connected" : chatEvent.getType();
    }

    public static final ChannelUserRead toChannelUserRead(MessageReadEvent messageReadEvent) {
        AbstractC22676k.m65750j(messageReadEvent, "<this>");
        return new ChannelUserRead(messageReadEvent.getUser(), messageReadEvent.getCreatedAt(), 0, messageReadEvent.getCreatedAt(), messageReadEvent.getLastReadMessageId(), null, null, 96, null);
    }

    public static final ChannelUserRead toChannelUserRead(MessageDeliveredEvent messageDeliveredEvent) {
        AbstractC22676k.m65750j(messageDeliveredEvent, "<this>");
        return new ChannelUserRead(messageDeliveredEvent.getUser(), messageDeliveredEvent.getCreatedAt(), 0, MessageKt.getNEVER(), null, messageDeliveredEvent.getLastDeliveredAt(), messageDeliveredEvent.getLastDeliveredMessageId());
    }

    public static final ChannelUserRead toChannelUserRead(NotificationMarkReadEvent notificationMarkReadEvent) {
        AbstractC22676k.m65750j(notificationMarkReadEvent, "<this>");
        return new ChannelUserRead(notificationMarkReadEvent.getUser(), notificationMarkReadEvent.getCreatedAt(), 0, notificationMarkReadEvent.getCreatedAt(), null, null, null, 96, null);
    }

    public static final ChannelUserRead toChannelUserRead(NotificationMarkUnreadEvent notificationMarkUnreadEvent) {
        AbstractC22676k.m65750j(notificationMarkUnreadEvent, "<this>");
        return new ChannelUserRead(notificationMarkUnreadEvent.getUser(), notificationMarkUnreadEvent.getCreatedAt(), notificationMarkUnreadEvent.getUnreadMessages(), notificationMarkUnreadEvent.getLastReadMessageAt(), notificationMarkUnreadEvent.getLastReadMessageId(), null, null, 96, null);
    }

    public static final ChannelUserRead toChannelUserRead(MarkAllReadEvent markAllReadEvent) {
        AbstractC22676k.m65750j(markAllReadEvent, "<this>");
        return new ChannelUserRead(markAllReadEvent.getUser(), markAllReadEvent.getCreatedAt(), 0, markAllReadEvent.getCreatedAt(), null, null, null, 96, null);
    }
}
