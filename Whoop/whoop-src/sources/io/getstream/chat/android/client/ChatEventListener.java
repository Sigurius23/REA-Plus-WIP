package io.getstream.chat.android.client;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.events.ChatEvent;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/ChatEventListener;", "Lio/getstream/chat/android/client/events/ChatEvent;", "EventT", "", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatEventListener<EventT extends ChatEvent> {
    void onEvent(EventT event);
}
