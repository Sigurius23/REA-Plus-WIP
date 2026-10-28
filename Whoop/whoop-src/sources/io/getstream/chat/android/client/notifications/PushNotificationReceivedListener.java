package io.getstream.chat.android.client.notifications;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "", "", "channelType", "channelId", "Ll83/a0;", "onPushNotificationReceived", "(Ljava/lang/String;Ljava/lang/String;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface PushNotificationReceivedListener {
    void onPushNotificationReceived(String channelType, String channelId);
}
