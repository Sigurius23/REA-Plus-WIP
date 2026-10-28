package io.getstream.chat.android.client.notifications.handler;

import a11.C0134l;
import a13.EnumC0147e;
import a13.InterfaceC0145c;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.PushMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 g2\u00020\u0001:\u0001gBÃ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0013\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00180\u0004\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020%H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001cH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020%2\u0006\u00105\u001a\u00020\u0019H\u0002¢\u0006\u0004\b6\u0010*J\u0017\u00108\u001a\u00020%2\u0006\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020%2\u0006\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u00109J\u0015\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020+H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\b@\u0010AJ'\u0010B\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00140;2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\bF\u0010/J\u001f\u0010G\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002¢\u0006\u0004\bG\u0010/J\u000f\u0010H\u001a\u00020%H\u0002¢\u0006\u0004\bH\u00101J\u000f\u0010I\u001a\u00020%H\u0002¢\u0006\u0004\bI\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010JR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010KR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR(\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR2\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010OR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010T\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010T\u001a\u0004\bd\u0010e¨\u0006h"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;", "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Channel;", "Landroid/content/Intent;", "newMessageIntent", "Lkotlin/Function0;", "Landroid/app/NotificationChannel;", "notificationChannel", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "userIconBuilder", "La13/c;", "permissionHandler", "Lio/getstream/chat/android/models/User;", "", "notificationTextFormatter", "Lkotlin/Function3;", "", "", "Landroidx/core/app/NotificationCompat$Action;", "actionsProvider", "Landroidx/core/app/NotificationCompat$Builder;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notificationBuilderTransformer", "Lkotlin/Function1;", "Lio/getstream/chat/android/models/PushMessage;", "", "onNewPushMessage", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "notificationIdFactory", "<init>", "(Landroid/content/Context;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V", "La13/e;", NotificationCompat.CATEGORY_STATUS, "Ll83/a0;", "onNotificationPermissionStatus", "(La13/e;)V", "notification", "showNotification", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V", "", "channelType", "channelId", "dismissChannelNotifications", "(Ljava/lang/String;Ljava/lang/String;)V", "dismissAllNotifications", "()V", "message", "onPushMessage", "(Lio/getstream/chat/android/models/PushMessage;)Z", "chatNotification", "showNotificationInternal", "notificationId", "trackNotificationId", "(I)V", "removeNotificationId", "", "getShownNotifications", "()Ljava/util/Set;", "getNotificationChannelId", "()Ljava/lang/String;", "getChannelNotificationsKey", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "trackChannelNotificationId", "(Ljava/lang/String;Ljava/lang/String;I)V", "getChannelNotificationIds", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;", "dismissTrackedChannelNotifications", "clearTrackedChannelNotificationIds", "dismissAllTrackedChannelNotifications", "clearAllTrackedChannelNotificationIds", "Landroid/content/Context;", "Lc93/m;", "Lc93/a;", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "La13/c;", "Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function1;", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Landroid/content/SharedPreferences;", "sharedPreferences$delegate", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/app/NotificationManager;", "notificationManager$delegate", "getNotificationManager", "()Landroid/app/NotificationManager;", "notificationManager", "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;", "factory$delegate", "getFactory", "()Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;", "factory", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagingStyleNotificationHandler implements NotificationHandler {
    private static final Companion Companion = new Companion();
    private static final String KEY_NOTIFICATIONS_SHOWN = "KEY_NOTIFICATIONS_SHOWN";
    private static final String KEY_PREFIX_CHANNEL_NOTIFICATIONS = "KEY_CHANNEL_NOTIFICATIONS_";
    private static final String SHARED_PREFERENCES_NAME = "stream_notifications.sp";
    private final Function3 actionsProvider;
    private final Context context;

    /* JADX INFO: renamed from: factory$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h factory;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC4351m newMessageIntent;
    private final InterfaceC4339a notificationChannel;
    private final NotificationIdFactory notificationIdFactory;

    /* JADX INFO: renamed from: notificationManager$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h notificationManager;
    private final InterfaceC4351m notificationTextFormatter;
    private final Function1 onNewPushMessage;
    private final InterfaceC0145c permissionHandler;

    /* JADX INFO: renamed from: sharedPreferences$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h sharedPreferences;
    private final UserIconBuilder userIconBuilder;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$Companion;", "", "<init>", "()V", "SHARED_PREFERENCES_NAME", "", MessagingStyleNotificationHandler.KEY_NOTIFICATIONS_SHOWN, "KEY_PREFIX_CHANNEL_NOTIFICATIONS", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC0147e.values().length];
            try {
                EnumC0147e enumC0147e = EnumC0147e.f459w;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC0147e enumC0147e2 = EnumC0147e.f459w;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC0147e enumC0147e3 = EnumC0147e.f459w;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC0147e enumC0147e4 = EnumC0147e.f459w;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationHandler$showNotificationInternal$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationHandler$showNotificationInternal$1", m100430f = "MessagingStyleNotificationHandler.kt", m100431l = {123}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C193931 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ ChatNotification $chatNotification;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C193931(ChatNotification chatNotification, InterfaceC30057d<? super C193931> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$chatNotification = chatNotification;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MessagingStyleNotificationHandler.this.new C193931(this.$chatNotification, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C193931) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            int i13;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.label;
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                int iCreateNotificationId$stream_chat_android_client_release = MessagingStyleNotificationHandler.this.getFactory().createNotificationId$stream_chat_android_client_release(this.$chatNotification);
                MessagingStyleNotificationFactory factory = MessagingStyleNotificationHandler.this.getFactory();
                ChatNotification chatNotification = this.$chatNotification;
                this.I$0 = iCreateNotificationId$stream_chat_android_client_release;
                this.label = 1;
                Object objCreateNotification$stream_chat_android_client_release = factory.createNotification$stream_chat_android_client_release(chatNotification, this);
                if (objCreateNotification$stream_chat_android_client_release == enumC31071a) {
                    return enumC31071a;
                }
                i13 = iCreateNotificationId$stream_chat_android_client_release;
                obj = objCreateNotification$stream_chat_android_client_release;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i13 = this.I$0;
                AbstractC34132o.m107864I(obj);
            }
            Notification notification = (Notification) obj;
            if (notification != null) {
                ChatNotification chatNotification2 = this.$chatNotification;
                if (chatNotification2 instanceof ChatNotification.MessageNew) {
                    Channel channel = ((ChatNotification.MessageNew) chatNotification2).getChannel();
                    MessagingStyleNotificationHandler.this.trackChannelNotificationId(channel.getType(), channel.getId(), i13);
                } else {
                    MessagingStyleNotificationHandler.this.trackNotificationId(i13);
                }
                MessagingStyleNotificationHandler.this.getNotificationManager().notify(i13, notification);
            } else {
                C2345k logger = MessagingStyleNotificationHandler.this.getLogger();
                ChatNotification chatNotification3 = this.$chatNotification;
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[showNotificationInternal] Failed to create notification for: " + chatNotification3, null);
                }
            }
            return C23454a0.f92919a;
        }
    }

    public MessagingStyleNotificationHandler(Context context, InterfaceC4351m newMessageIntent, InterfaceC4339a notificationChannel, UserIconBuilder userIconBuilder, InterfaceC0145c interfaceC0145c, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer, Function1 onNewPushMessage, NotificationIdFactory notificationIdFactory) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationChannel, "notificationChannel");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        AbstractC22676k.m65750j(onNewPushMessage, "onNewPushMessage");
        this.context = context;
        this.newMessageIntent = newMessageIntent;
        this.notificationChannel = notificationChannel;
        this.userIconBuilder = userIconBuilder;
        this.permissionHandler = interfaceC0145c;
        this.notificationTextFormatter = notificationTextFormatter;
        this.actionsProvider = actionsProvider;
        this.onNewPushMessage = onNewPushMessage;
        this.notificationIdFactory = notificationIdFactory;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MsnHandler");
        final int i13 = 0;
        this.sharedPreferences = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.notifications.handler.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessagingStyleNotificationHandler f73941x;

            {
                this.f73941x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MessagingStyleNotificationHandler.m54879b(this.f73941x);
                    default:
                        return MessagingStyleNotificationHandler.notificationManager_delegate$lambda$2(this.f73941x);
                }
            }
        });
        final int i14 = 1;
        this.notificationManager = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: io.getstream.chat.android.client.notifications.handler.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MessagingStyleNotificationHandler f73941x;

            {
                this.f73941x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MessagingStyleNotificationHandler.m54879b(this.f73941x);
                    default:
                        return MessagingStyleNotificationHandler.notificationManager_delegate$lambda$2(this.f73941x);
                }
            }
        });
        this.factory = AbstractC30060g.m92088H(new C0134l(20, this, notificationBuilderTransformer));
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m54879b(MessagingStyleNotificationHandler messagingStyleNotificationHandler) {
        return messagingStyleNotificationHandler.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    private final void clearAllTrackedChannelNotificationIds() {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        Set<String> setKeySet = getSharedPreferences().getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            AbstractC22676k.m65747g(str);
            if (AbstractC39421y.m125930O(str, KEY_PREFIX_CHANNEL_NOTIFICATIONS, false)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            editorEdit.remove((String) it.next());
        }
        editorEdit.apply();
    }

    private final void clearTrackedChannelNotificationIds(String channelType, String channelId) {
        String channelNotificationsKey = getChannelNotificationsKey(channelType, channelId);
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        editorEdit.remove(channelNotificationsKey);
        editorEdit.apply();
    }

    private final void dismissAllTrackedChannelNotifications() {
        Set<String> setKeySet = getSharedPreferences().getAll().keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            AbstractC22676k.m65747g(str);
            if (AbstractC39421y.m125930O(str, KEY_PREFIX_CHANNEL_NOTIFICATIONS, false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            SharedPreferences sharedPreferences = getSharedPreferences();
            Set<String> set = C25235a0.f99113w;
            Set<String> stringSet = sharedPreferences.getStringSet(str2, set);
            if (stringSet != null) {
                set = stringSet;
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str3 : set) {
                AbstractC22676k.m65747g(str3);
                Integer numM125932Q = AbstractC39421y.m125932Q(str3);
                if (numM125932Q != null) {
                    arrayList3.add(numM125932Q);
                }
            }
            AbstractC25265s.m74141p0(arrayList2, arrayList3);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getNotificationManager().cancel(((Number) it.next()).intValue());
        }
    }

    private final void dismissTrackedChannelNotifications(String channelType, String channelId) {
        Iterator<T> it = getChannelNotificationIds(channelType, channelId).iterator();
        while (it.hasNext()) {
            getNotificationManager().cancel(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagingStyleNotificationFactory factory_delegate$lambda$3(MessagingStyleNotificationHandler messagingStyleNotificationHandler, InterfaceC4351m interfaceC4351m) {
        return new MessagingStyleNotificationFactory(messagingStyleNotificationHandler.context, messagingStyleNotificationHandler.getNotificationManager(), messagingStyleNotificationHandler.getNotificationChannelId(), messagingStyleNotificationHandler.userIconBuilder, messagingStyleNotificationHandler.newMessageIntent, messagingStyleNotificationHandler.notificationTextFormatter, messagingStyleNotificationHandler.actionsProvider, interfaceC4351m, messagingStyleNotificationHandler.notificationIdFactory, null, 512, null);
    }

    private final Set<Integer> getChannelNotificationIds(String channelType, String channelId) {
        Set<String> stringSet = getSharedPreferences().getStringSet(getChannelNotificationsKey(channelType, channelId), null);
        if (stringSet == null) {
            stringSet = C25235a0.f99113w;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringSet) {
            AbstractC22676k.m65747g(str);
            Integer numM125932Q = AbstractC39421y.m125932Q(str);
            if (numM125932Q != null) {
                arrayList.add(numM125932Q);
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    private final String getChannelNotificationsKey(String channelType, String channelId) {
        return AbstractC31061c.m95640p(KEY_PREFIX_CHANNEL_NOTIFICATIONS, channelType, ":", channelId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MessagingStyleNotificationFactory getFactory() {
        return (MessagingStyleNotificationFactory) this.factory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final String getNotificationChannelId() {
        String id4 = ((NotificationChannel) this.notificationChannel.invoke()).getId();
        AbstractC22676k.m65747g(id4);
        return id4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationManager getNotificationManager() {
        return (NotificationManager) this.notificationManager.getValue();
    }

    private final SharedPreferences getSharedPreferences() {
        Object value = this.sharedPreferences.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    private final Set<Integer> getShownNotifications() {
        Set<String> stringSet = getSharedPreferences().getStringSet(KEY_NOTIFICATIONS_SHOWN, null);
        if (stringSet == null) {
            stringSet = C25235a0.f99113w;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotificationManager notificationManager_delegate$lambda$2(MessagingStyleNotificationHandler messagingStyleNotificationHandler) {
        Object systemService = messagingStyleNotificationHandler.context.getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel((NotificationChannel) messagingStyleNotificationHandler.notificationChannel.invoke());
        return notificationManager;
    }

    private final void removeNotificationId(int notificationId) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(Integer.valueOf(notificationId), getShownNotifications());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34604y, 10));
        Iterator it = linkedHashSetM34604y.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(KEY_NOTIFICATIONS_SHOWN, AbstractC25265s.m74103I1(arrayList));
        editorEdit.apply();
    }

    private final void showNotificationInternal(ChatNotification chatNotification) {
        ChatClient.INSTANCE.instance().launch$stream_chat_android_client_release(new C193931(chatNotification, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackChannelNotificationId(String channelType, String channelId, int notificationId) {
        String channelNotificationsKey = getChannelNotificationsKey(channelType, channelId);
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(Integer.valueOf(notificationId), getChannelNotificationIds(channelType, channelId));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34555D, 10));
        Iterator it = linkedHashSetM34555D.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(channelNotificationsKey, AbstractC25265s.m74103I1(arrayList));
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackNotificationId(int notificationId) {
        SharedPreferences.Editor editorEdit = getSharedPreferences().edit();
        LinkedHashSet linkedHashSetM34555D = AbstractC12350b.m34555D(Integer.valueOf(notificationId), getShownNotifications());
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34555D, 10));
        Iterator it = linkedHashSetM34555D.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        editorEdit.putStringSet(KEY_NOTIFICATIONS_SHOWN, AbstractC25265s.m74103I1(arrayList));
        editorEdit.apply();
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void dismissAllNotifications() {
        Iterator<T> it = getShownNotifications().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            getNotificationManager().cancel(iIntValue);
            removeNotificationId(iIntValue);
        }
        dismissAllTrackedChannelNotifications();
        clearAllTrackedChannelNotificationIds();
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void dismissChannelNotifications(String channelType, String channelId) {
        AbstractC22676k.m65750j(channelType, "channelType");
        AbstractC22676k.m65750j(channelId, "channelId");
        dismissTrackedChannelNotifications(channelType, channelId);
        clearTrackedChannelNotificationIds(channelType, channelId);
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void onNotificationPermissionStatus(EnumC0147e status) {
        AbstractC22676k.m65750j(status, "status");
        int iOrdinal = status.ordinal();
        if (iOrdinal == 0) {
            InterfaceC0145c interfaceC0145c = this.permissionHandler;
            if (interfaceC0145c != null) {
                interfaceC0145c.onPermissionRequested();
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            InterfaceC0145c interfaceC0145c2 = this.permissionHandler;
            if (interfaceC0145c2 != null) {
                interfaceC0145c2.onPermissionGranted();
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            InterfaceC0145c interfaceC0145c3 = this.permissionHandler;
            if (interfaceC0145c3 != null) {
                interfaceC0145c3.onPermissionDenied();
                return;
            }
            return;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC0145c interfaceC0145c4 = this.permissionHandler;
        if (interfaceC0145c4 != null) {
            interfaceC0145c4.onPermissionRationale();
        }
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final boolean onPushMessage(PushMessage message) {
        AbstractC22676k.m65750j(message, "message");
        return ((Boolean) this.onNewPushMessage.invoke(message)).booleanValue();
    }

    @Override // io.getstream.chat.android.client.notifications.handler.NotificationHandler
    public final void showNotification(ChatNotification notification) {
        AbstractC22676k.m65750j(notification, "notification");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[showNotification] notification: " + notification, null);
        }
        showNotificationInternal(notification);
    }
}
