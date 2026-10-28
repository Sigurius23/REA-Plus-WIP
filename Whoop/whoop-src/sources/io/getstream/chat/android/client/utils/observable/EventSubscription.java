package io.getstream.chat.android.client.utils.observable;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.events.ChatEvent;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/utils/observable/EventSubscription;", "Lio/getstream/chat/android/client/utils/observable/Disposable;", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "onNext", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface EventSubscription extends Disposable {
    void onNext(ChatEvent event);
}
