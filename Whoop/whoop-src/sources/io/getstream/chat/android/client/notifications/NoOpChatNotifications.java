package io.getstream.chat.android.client.notifications;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/NoOpChatNotifications;", "Lio/getstream/chat/android/client/notifications/ChatNotifications;", "<init>", "()V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Ll83/a0;", "onSetUser", "(Lio/getstream/chat/android/models/User;)V", "Lio/getstream/chat/android/models/Device;", "device", "setDevice", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V", "deleteDevice", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/models/PushMessage;", "pushMessage", "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "pushNotificationReceivedListener", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", NotificationCompat.CATEGORY_EVENT, "onChatEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "onLogout", "(Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notification", "displayNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "", "channelType", "channelId", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NoOpChatNotifications implements ChatNotifications {
    public static final NoOpChatNotifications INSTANCE = new NoOpChatNotifications();

    private NoOpChatNotifications() {
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final Object deleteDevice(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void dismissChannelNotifications(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void displayNotification(ChatNotification notification) {
        AbstractC22676k.m65750j(notification, "notification");
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onChatEvent(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final Object onLogout(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onPushMessage(PushMessage pushMessage, PushNotificationReceivedListener pushNotificationReceivedListener) {
        AbstractC22676k.m65750j(pushMessage, "pushMessage");
        AbstractC22676k.m65750j(pushNotificationReceivedListener, "pushNotificationReceivedListener");
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onSetUser(User user) {
        AbstractC22676k.m65750j(user, "user");
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void setDevice(User user, Device device) {
        AbstractC22676k.m65750j(device, "device");
    }
}
