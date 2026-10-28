package io.getstream.chat.android.client.api.event;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/api/event/ChatEventHandler;", "", "handleChatEvent", "Lio/getstream/chat/android/client/api/event/EventHandlingResult;", NotificationCompat.CATEGORY_EVENT, "Lio/getstream/chat/android/client/events/ChatEvent;", "filter", "Lio/getstream/chat/android/models/FilterObject;", "cachedChannel", "Lio/getstream/chat/android/models/Channel;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatEventHandler {
    EventHandlingResult handleChatEvent(ChatEvent event, FilterObject filter, Channel cachedChannel);
}
