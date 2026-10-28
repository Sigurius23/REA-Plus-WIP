package io.getstream.chat.android.client.notifications;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p213i7.C18194g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH&¢\u0006\u0004\b \u0010!ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/ChatNotifications;", "", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ll83/a0;", "onSetUser", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/Device;", "device", "setDevice", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V", "deleteDevice", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/PushMessage;", "pushMessage", "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "pushNotificationReceivedListener", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "onChatEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "onLogout", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notification", "displayNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "", "channelType", "channelId", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatNotifications {
    static /* synthetic */ void onPushMessage$default(ChatNotifications chatNotifications, PushMessage pushMessage, PushNotificationReceivedListener pushNotificationReceivedListener, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPushMessage");
        }
        if ((i13 & 2) != 0) {
            pushNotificationReceivedListener = new C18194g(9);
        }
        chatNotifications.onPushMessage(pushMessage, pushNotificationReceivedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static void onPushMessage$lambda$0(String str, String str2) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(str2, "<unused var>");
    }

    Object deleteDevice(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void dismissChannelNotifications(String channelType, String channelId);

    void displayNotification(ChatNotification notification);

    void onChatEvent(ChatEvent event);

    Object onLogout(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    void onPushMessage(PushMessage pushMessage, PushNotificationReceivedListener pushNotificationReceivedListener);

    void onSetUser(User user);

    void setDevice(User user, Device device);
}
