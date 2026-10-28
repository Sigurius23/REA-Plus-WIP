package io.getstream.chat.android.client.notifications;

import a13.C0146d;
import a13.C0151i;
import a13.EnumC0147e;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.events.NewMessageEvent;
import io.getstream.chat.android.client.events.NotificationReminderDueEvent;
import io.getstream.chat.android.client.notifications.handler.ChatNotification;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationHandler;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.PushMessage;
import io.getstream.chat.android.models.User;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p708hb2.C17095c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import y03.AbstractC39026a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JG\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010(J!\u0010-\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b1\u0010.J\u001a\u00102\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010)H\u0096@¢\u0006\u0004\b2\u00103J\u001f\u00107\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00130Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006W"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;", "Lio/getstream/chat/android/client/notifications/ChatNotifications;", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "handler", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "notificationConfig", "Landroid/content/Context;", "context", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "Lbc3/c0;", "scope", "<init>", "(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Landroid/content/Context;Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;)V", "Lio/getstream/chat/android/models/PushMessage;", "message", "Ll83/a0;", "handlePushMessage", "(Lio/getstream/chat/android/models/PushMessage;)V", "", "type", "channelId", "channelType", "messageId", "", "", "payload", "obtainNotificationData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lio/getstream/chat/android/client/events/NewMessageEvent;", NotificationCompat.CATEGORY_EVENT, "onNewMessageEvent", "(Lio/getstream/chat/android/client/events/NewMessageEvent;)V", "Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;", "onNotificationReminderDueEvent", "(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)V", "cancelLoadDataWork", "()V", "", "wasNotificationDisplayed", "(Ljava/lang/String;)Z", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/models/Device;", "device", "setDeviceForUser", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V", "onSetUser", "(Lio/getstream/chat/android/models/User;)V", "setDevice", "deleteDevice", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "pushMessage", "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;", "pushNotificationReceivedListener", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V", "Lio/getstream/chat/android/client/events/ChatEvent;", "onChatEvent", "(Lio/getstream/chat/android/client/events/ChatEvent;)V", "onLogout", "(Lq83/d;)Ljava/lang/Object;", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notification", "displayNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;", "Landroid/content/Context;", "Lbc3/c0;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;", "pushTokenUpdateHandler", "Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;", "", "showedMessages", "Ljava/util/Set;", "La13/d;", "permissionManager", "La13/d;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatNotificationsImpl implements ChatNotifications {
    private final Context context;
    private final NotificationHandler handler;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final NotificationConfig notificationConfig;
    private final C0146d permissionManager;
    private final PushTokenUpdateHandler pushTokenUpdateHandler;
    private final InterfaceC2994c0 scope;
    private final Set<String> showedMessages;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.ChatNotificationsImpl$setDeviceForUser$2 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.ChatNotificationsImpl$setDeviceForUser$2", m100430f = "ChatNotifications.kt", m100431l = {264}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193862 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Device $device;
        final /* synthetic */ User $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193862(User user, Device device, InterfaceC30057d<? super C193862> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$user = user;
            this.$device = device;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChatNotificationsImpl.this.new C193862(this.$user, this.$device, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193862) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                PushTokenUpdateHandler pushTokenUpdateHandler = ChatNotificationsImpl.this.pushTokenUpdateHandler;
                User user = this.$user;
                Device device = this.$device;
                this.label = 1;
                if (pushTokenUpdateHandler.addDevice(user, device, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    public ChatNotificationsImpl(NotificationHandler handler, NotificationConfig notificationConfig, Context context, ChatApi api, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(handler, "handler");
        AbstractC22676k.m65750j(notificationConfig, "notificationConfig");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(scope, "scope");
        this.handler = handler;
        this.notificationConfig = notificationConfig;
        this.context = context;
        this.scope = scope;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:Notifications");
        this.pushTokenUpdateHandler = new PushTokenUpdateHandler(api);
        this.showedMessages = new LinkedHashSet();
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        InterfaceC4339a requestPermissionOnAppLaunch = notificationConfig.getRequestPermissionOnAppLaunch();
        C17095c c17095c = new C17095c(this, 22);
        AbstractC22676k.m65750j(requestPermissionOnAppLaunch, "requestPermissionOnAppLaunch");
        C0151i c0151iM56534q = C0151i.f468E.m56534q((Application) applicationContext);
        C0146d c0146d = new C0146d(c0151iM56534q, requestPermissionOnAppLaunch, c17095c);
        Log.d("Push:Notifications-PM", "[initialize] no args");
        c0151iM56534q.f470w.add(c0146d);
        this.permissionManager = c0146d;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "<init> no args", null);
        }
    }

    private final void cancelLoadDataWork() {
        LoadNotificationDataWorker.INSTANCE.cancel(this.context);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void handlePushMessage(PushMessage message) {
        String type = message.getType();
        if (type == null) {
            type = "";
        }
        obtainNotificationData(type, message.getChannelId(), message.getChannelType(), message.getMessageId(), message.getExtraData());
    }

    private final void obtainNotificationData(String type, String channelId, String channelType, String messageId, Map<String, ? extends Object> payload) {
        String str;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str2 = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            str = messageId;
            logger.f9274b.log(enumC2341g, str2, AbstractC2875y.m8304q(AbstractC11895b.m32001t("[obtainNotificationData] type: ", type, ", channelCid: ", channelId, ":"), channelType, ", messageId: ", str), null);
        } else {
            str = messageId;
        }
        LoadNotificationDataWorker.INSTANCE.start(this.context, type, channelId, channelType, str, payload);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void obtainNotificationData$default(ChatNotificationsImpl chatNotificationsImpl, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            map = C25272z.f99163w;
        }
        chatNotificationsImpl.obtainNotificationData(str, str2, str3, str4, map);
    }

    private final void onNewMessageEvent(NewMessageEvent event) {
        User currentUser = ChatClient.INSTANCE.instance().getCurrentUser();
        if (AbstractC22676k.m65745e(event.getMessage().getUser().getId(), currentUser != null ? currentUser.getId() : null)) {
            return;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onNewMessageEvent] event: " + event, null);
        }
        this.handler.onChatEvent(event);
    }

    private final void onNotificationReminderDueEvent(NotificationReminderDueEvent event) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onNotificationReminderDueEvent] event: " + event, null);
        }
        this.handler.onNotificationReminderDueEvent(event);
    }

    private static final C23454a0 onSetUser$lambda$7$lambda$6(ChatNotificationsImpl chatNotificationsImpl, User user, AbstractC39026a pushDevice) {
        AbstractC22676k.m65750j(pushDevice, "pushDevice");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 permissionManager$lambda$1(ChatNotificationsImpl chatNotificationsImpl, EnumC0147e status) {
        AbstractC22676k.m65750j(status, "status");
        C2345k logger = chatNotificationsImpl.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onPermissionStatus] status: " + status, null);
        }
        chatNotificationsImpl.handler.onNotificationPermissionStatus(status);
        return C23454a0.f92919a;
    }

    private final void setDeviceForUser(User user, Device device) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setDeviceForUser] userId: " + (user != null ? user.getId() : null) + ", device: " + device, null);
        }
        AbstractC3006f0.m8732z(this.scope, null, null, new C193862(user, device, null), 3);
    }

    private final boolean wasNotificationDisplayed(String messageId) {
        return this.showedMessages.contains(messageId);
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final Object deleteDevice(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30461o("[deleteDevice] userId: ", user != null ? user.getId() : null), null);
        }
        Object objDeleteDevice = this.pushTokenUpdateHandler.deleteDevice(user, interfaceC30057d);
        return objDeleteDevice == EnumC31071a.f128113w ? objDeleteDevice : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void dismissChannelNotifications(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        this.handler.dismissChannelNotifications(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void displayNotification(ChatNotification notification) {
        AbstractC22676k.m65750j(notification, "notification");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[displayNotification] notification: " + notification, null);
        }
        if (!(notification instanceof ChatNotification.MessageNew)) {
            this.handler.showNotification(notification);
            return;
        }
        ChatNotification.MessageNew messageNew = (ChatNotification.MessageNew) notification;
        if (this.showedMessages.contains(messageNew.getMessage().getId())) {
            return;
        }
        this.showedMessages.add(messageNew.getMessage().getId());
        this.handler.showNotification(notification);
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onChatEvent(ChatEvent event) {
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onChatEvent] event: " + event, null);
        }
        if (event instanceof NewMessageEvent) {
            onNewMessageEvent((NewMessageEvent) event);
            return;
        }
        if (event instanceof NotificationReminderDueEvent) {
            onNotificationReminderDueEvent((NotificationReminderDueEvent) event);
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
            logger2.f9274b.log(enumC2341g, str2, "[onChatEvent] ChatEvent not supported: " + event, null);
        }
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final Object onLogout(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onLogout]", null);
        }
        C0146d c0146d = this.permissionManager;
        c0146d.getClass();
        Log.d("Push:Notifications-PM", "[stop] no args");
        c0146d.f457d = false;
        this.handler.dismissAllNotifications();
        cancelLoadDataWork();
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onPushMessage(PushMessage pushMessage, PushNotificationReceivedListener pushNotificationReceivedListener) {
        AbstractC22676k.m65750j(pushMessage, "pushMessage");
        AbstractC22676k.m65750j(pushNotificationReceivedListener, "pushNotificationReceivedListener");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onPushMessage] message: " + pushMessage, null);
        }
        pushNotificationReceivedListener.onPushNotificationReceived(pushMessage.getChannelType(), pushMessage.getChannelId());
        if (!((Boolean) this.notificationConfig.getShouldShowNotificationOnPush().invoke()).booleanValue() || this.handler.onPushMessage(pushMessage)) {
            return;
        }
        handlePushMessage(pushMessage);
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void onSetUser(User user) {
        AbstractC22676k.m65750j(user, "user");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onSetUser] user: " + user, null);
        }
        C0146d c0146d = ((Boolean) this.notificationConfig.getRequestPermissionOnAppLaunch().invoke()).booleanValue() ? this.permissionManager : null;
        if (c0146d != null) {
            Log.d("Push:Notifications-PM", "[start] no args");
            c0146d.m363c();
        }
        Iterator<T> it = this.notificationConfig.getPushDeviceGenerators().iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
    }

    @Override // io.getstream.chat.android.client.notifications.ChatNotifications
    public final void setDevice(User user, Device device) {
        AbstractC22676k.m65750j(device, "device");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[setDevice] userId: " + (user != null ? user.getId() : null) + ", device: " + device, null);
        }
        setDeviceForUser(user, device);
    }

    public /* synthetic */ ChatNotificationsImpl(NotificationHandler notificationHandler, NotificationConfig notificationConfig, Context context, ChatApi chatApi, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationHandler, notificationConfig, context, chatApi, (i13 & 16) != 0 ? AbstractC3006f0.m8708b(DispatcherProvider.INSTANCE.getIO()) : interfaceC2994c0);
    }
}
