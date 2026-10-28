package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.client.events.ChannelTruncatedEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedByUserEvent;
import io.getstream.chat.android.client.events.ChannelUpdatedEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.MessageDeletedEvent;
import io.getstream.chat.android.client.events.MessageUpdatedEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationMessageNewEvent;
import io.getstream.chat.android.client.events.NotificationThreadMessageNewEvent;
import io.getstream.chat.android.client.events.ReactionDeletedEvent;
import io.getstream.chat.android.client.events.ReactionNewEvent;
import io.getstream.chat.android.client.events.ReactionUpdateEvent;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"enrichIfNeeded", "Lio/getstream/chat/android/client/events/ChatEvent;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatEventKt {
    public static final ChatEvent enrichIfNeeded(ChatEvent chatEvent) {
        AbstractC22676k.m65750j(chatEvent, "<this>");
        if (chatEvent instanceof NewMessageEvent) {
            NewMessageEvent newMessageEvent = (NewMessageEvent) chatEvent;
            return NewMessageEvent.copy$default(newMessageEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(newMessageEvent.getMessage(), newMessageEvent.getCid()), 0, 0, 0, null, 3967, null);
        }
        if (chatEvent instanceof MessageDeletedEvent) {
            MessageDeletedEvent messageDeletedEvent = (MessageDeletedEvent) chatEvent;
            return MessageDeletedEvent.copy$default(messageDeletedEvent, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(messageDeletedEvent.getMessage(), messageDeletedEvent.getCid()), null, false, null, false, 1983, null);
        }
        if (chatEvent instanceof MessageUpdatedEvent) {
            MessageUpdatedEvent messageUpdatedEvent = (MessageUpdatedEvent) chatEvent;
            return MessageUpdatedEvent.copy$default(messageUpdatedEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(messageUpdatedEvent.getMessage(), messageUpdatedEvent.getCid()), 127, null);
        }
        if (chatEvent instanceof ReactionNewEvent) {
            ReactionNewEvent reactionNewEvent = (ReactionNewEvent) chatEvent;
            return ReactionNewEvent.copy$default(reactionNewEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(reactionNewEvent.getMessage(), reactionNewEvent.getCid()), null, 383, null);
        }
        if (chatEvent instanceof ReactionUpdateEvent) {
            ReactionUpdateEvent reactionUpdateEvent = (ReactionUpdateEvent) chatEvent;
            return ReactionUpdateEvent.copy$default(reactionUpdateEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(reactionUpdateEvent.getMessage(), reactionUpdateEvent.getCid()), null, 383, null);
        }
        if (chatEvent instanceof ReactionDeletedEvent) {
            ReactionDeletedEvent reactionDeletedEvent = (ReactionDeletedEvent) chatEvent;
            return ReactionDeletedEvent.copy$default(reactionDeletedEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(reactionDeletedEvent.getMessage(), reactionDeletedEvent.getCid()), null, 383, null);
        }
        if (chatEvent instanceof ChannelUpdatedEvent) {
            ChannelUpdatedEvent channelUpdatedEvent = (ChannelUpdatedEvent) chatEvent;
            Message message = channelUpdatedEvent.getMessage();
            return ChannelUpdatedEvent.copy$default(channelUpdatedEvent, null, null, null, null, null, null, null, message != null ? MessageExtensionsKt.enrichWithCid(message, channelUpdatedEvent.getCid()) : null, 127, null);
        }
        if (chatEvent instanceof ChannelTruncatedEvent) {
            ChannelTruncatedEvent channelTruncatedEvent = (ChannelTruncatedEvent) chatEvent;
            Message message2 = channelTruncatedEvent.getMessage();
            return ChannelTruncatedEvent.copy$default(channelTruncatedEvent, null, null, null, null, null, null, null, null, message2 != null ? MessageExtensionsKt.enrichWithCid(message2, channelTruncatedEvent.getCid()) : null, 255, null);
        }
        if (chatEvent instanceof ChannelUpdatedByUserEvent) {
            ChannelUpdatedByUserEvent channelUpdatedByUserEvent = (ChannelUpdatedByUserEvent) chatEvent;
            Message message3 = channelUpdatedByUserEvent.getMessage();
            return ChannelUpdatedByUserEvent.copy$default(channelUpdatedByUserEvent, null, null, null, null, null, null, null, null, message3 != null ? MessageExtensionsKt.enrichWithCid(message3, channelUpdatedByUserEvent.getCid()) : null, 255, null);
        }
        if (chatEvent instanceof NotificationMessageNewEvent) {
            NotificationMessageNewEvent notificationMessageNewEvent = (NotificationMessageNewEvent) chatEvent;
            return NotificationMessageNewEvent.copy$default(notificationMessageNewEvent, null, null, null, null, null, null, null, MessageExtensionsKt.enrichWithCid(notificationMessageNewEvent.getMessage(), notificationMessageNewEvent.getCid()), 0, 0, 895, null);
        }
        if (!(chatEvent instanceof NotificationThreadMessageNewEvent)) {
            return chatEvent;
        }
        NotificationThreadMessageNewEvent notificationThreadMessageNewEvent = (NotificationThreadMessageNewEvent) chatEvent;
        return NotificationThreadMessageNewEvent.copy$default(notificationThreadMessageNewEvent, null, null, null, null, MessageExtensionsKt.enrichWithCid(notificationThreadMessageNewEvent.getMessage(), notificationThreadMessageNewEvent.getCid()), null, null, null, 0, 0, MessageListItemViewType.TYPING_INDICATOR, null);
    }
}
