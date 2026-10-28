package io.getstream.chat.android.client.api.event;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.events.ChannelDeletedEvent;
import io.getstream.chat.android.client.events.ChannelHiddenEvent;
import io.getstream.chat.android.client.events.ChannelVisibleEvent;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.CidEvent;
import io.getstream.chat.android.client.events.HasChannel;
import io.getstream.chat.android.client.events.NotificationChannelDeletedEvent;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/BaseChatEventHandler;", "Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "<init>", "()V", "handleChannelEvent", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", NotificationCompat.CATEGORY_EVENT, "Lio/getstream/chat/android/client/events/HasChannel;", "filter", "Lio/getstream/chat/android/models/FilterObject;", "handleCidEvent", "Lio/getstream/chat/android/client/events/CidEvent;", "cachedChannel", "Lio/getstream/chat/android/models/Channel;", "handleChatEvent", "Lio/getstream/chat/android/client/events/ChatEvent;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseChatEventHandler implements ChatEventHandler {
    public EventHandlingResult handleChannelEvent(HasChannel event, FilterObject filter) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(filter, "filter");
        if (event instanceof ChannelDeletedEvent) {
            return new EventHandlingResult.Remove(((ChannelDeletedEvent) event).getCid());
        }
        if (event instanceof NotificationChannelDeletedEvent) {
            return new EventHandlingResult.Remove(((NotificationChannelDeletedEvent) event).getCid());
        }
        if (event instanceof ChannelHiddenEvent) {
            return new EventHandlingResult.Remove(((ChannelHiddenEvent) event).getCid());
        }
        return event instanceof ChannelVisibleEvent ? new EventHandlingResult.WatchAndAdd(((ChannelVisibleEvent) event).getCid()) : EventHandlingResult.Skip.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.getstream.chat.android.client.api.event.ChatEventHandler
    public final EventHandlingResult handleChatEvent(ChatEvent event, FilterObject filter, Channel cachedChannel) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(filter, "filter");
        if (event instanceof HasChannel) {
            return handleChannelEvent((HasChannel) event, filter);
        }
        return event instanceof CidEvent ? handleCidEvent((CidEvent) event, filter, cachedChannel) : EventHandlingResult.Skip.INSTANCE;
    }

    public EventHandlingResult handleCidEvent(CidEvent event, FilterObject filter, Channel cachedChannel) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(filter, "filter");
        return EventHandlingResult.Skip.INSTANCE;
    }
}
