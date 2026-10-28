package io.getstream.chat.android.client.notifications.handler;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.C18999R;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.extensions.MessageExtensionsKt;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Date;
import java.util.Iterator;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B¹\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n\u0012$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0012\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\n\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b!\u0010\"J/\u0010(\u001a\n '*\u0004\u0018\u00010&0&2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,J \u0010.\u001a\u00020*2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\fH\u0082@¢\u0006\u0004\b.\u0010/J&\u00101\u001a\u000200*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b1\u00102J\u001c\u00104\u001a\u000203*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u000203*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0000¢\u0006\u0004\b:\u0010\"J\u001a\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010 \u001a\u00020\u0018H\u0080@¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010DR(\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR2\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010ER&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010DR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010FR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010GR\u0018\u0010K\u001a\u00020H*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;", "", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "notificationManager", "", "notificationChannelId", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "userIconBuilder", "Lkotlin/Function2;", "Lio/getstream/chat/android/models/Message;", "Lio/getstream/chat/android/models/Channel;", "Landroid/content/Intent;", "newMessageIntent", "Lio/getstream/chat/android/models/User;", "", "notificationTextFormatter", "Lkotlin/Function3;", "", "", "Landroidx/core/app/NotificationCompat$Action;", "actionsProvider", "Landroidx/core/app/NotificationCompat$Builder;", "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;", "notificationBuilderTransformer", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "notificationIdFactory", "Lkotlin/Function0;", "currentUserProvider", "<init>", "(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;)V", "notification", "createDefaultNotificationId", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I", "notificationId", "channel", "message", "Landroid/app/PendingIntent;", "kotlin.jvm.PlatformType", "createContentIntent", "(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "restoreMessagingStyle", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$MessagingStyle;", "currentUser", "createMessagingStyle", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;", "Landroidx/core/app/NotificationCompat$MessagingStyle$Message;", "toMessagingStyleMessage", "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Landroidx/core/app/Person;", "person", "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "toPerson", "(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;", "personName", "(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;", "createNotificationId$stream_chat_android_client_release", "createNotificationId", "Landroid/app/Notification;", "createNotification$stream_chat_android_client_release", "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)Ljava/lang/Object;", "createNotification", "Landroid/content/Context;", "Landroid/app/NotificationManager;", "Ljava/lang/String;", "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;", "Lc93/m;", "Lkotlin/jvm/functions/Function3;", "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;", "Lc93/a;", "", "getTimestamp", "(Lio/getstream/chat/android/models/Message;)J", "timestamp", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessagingStyleNotificationFactory {
    private final Function3 actionsProvider;
    private final Context context;
    private final InterfaceC4339a currentUserProvider;
    private final InterfaceC4351m newMessageIntent;
    private final InterfaceC4351m notificationBuilderTransformer;
    private final String notificationChannelId;
    private final NotificationIdFactory notificationIdFactory;
    private final NotificationManager notificationManager;
    private final InterfaceC4351m notificationTextFormatter;
    private final UserIconBuilder userIconBuilder;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory$createMessagingStyle$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory", m100430f = "MessagingStyleNotificationFactory.kt", m100431l = {160}, m100432m = "createMessagingStyle")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193901 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193901(InterfaceC30057d<? super C193901> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessagingStyleNotificationFactory.this.createMessagingStyle(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory$toMessagingStyleMessage$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory", m100430f = "MessagingStyleNotificationFactory.kt", m100431l = {171}, m100432m = "toMessagingStyleMessage")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193911 extends AbstractC32269c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C193911(InterfaceC30057d<? super C193911> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessagingStyleNotificationFactory.this.toMessagingStyleMessage(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory$toPerson$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.handler.MessagingStyleNotificationFactory", m100430f = "MessagingStyleNotificationFactory.kt", m100431l = {184}, m100432m = "toPerson")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193921 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C193921(InterfaceC30057d<? super C193921> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MessagingStyleNotificationFactory.this.toPerson(null, null, this);
        }
    }

    public MessagingStyleNotificationFactory(Context context, NotificationManager notificationManager, String notificationChannelId, UserIconBuilder userIconBuilder, InterfaceC4351m newMessageIntent, InterfaceC4351m notificationTextFormatter, Function3 actionsProvider, InterfaceC4351m notificationBuilderTransformer, NotificationIdFactory notificationIdFactory, InterfaceC4339a currentUserProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(notificationManager, "notificationManager");
        AbstractC22676k.m65750j(notificationChannelId, "notificationChannelId");
        AbstractC22676k.m65750j(userIconBuilder, "userIconBuilder");
        AbstractC22676k.m65750j(newMessageIntent, "newMessageIntent");
        AbstractC22676k.m65750j(notificationTextFormatter, "notificationTextFormatter");
        AbstractC22676k.m65750j(actionsProvider, "actionsProvider");
        AbstractC22676k.m65750j(notificationBuilderTransformer, "notificationBuilderTransformer");
        AbstractC22676k.m65750j(currentUserProvider, "currentUserProvider");
        this.context = context;
        this.notificationManager = notificationManager;
        this.notificationChannelId = notificationChannelId;
        this.userIconBuilder = userIconBuilder;
        this.newMessageIntent = newMessageIntent;
        this.notificationTextFormatter = notificationTextFormatter;
        this.actionsProvider = actionsProvider;
        this.notificationBuilderTransformer = notificationBuilderTransformer;
        this.notificationIdFactory = notificationIdFactory;
        this.currentUserProvider = currentUserProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final User _init_$lambda$0() {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        User currentUser = companion.instance().getCurrentUser();
        return currentUser == null ? companion.instance().getStoredUser$stream_chat_android_client_release() : currentUser;
    }

    private final PendingIntent createContentIntent(int notificationId, Channel channel, Message message) {
        return PendingIntent.getActivity(this.context, notificationId, (Intent) this.newMessageIntent.invoke(message, channel), 201326592);
    }

    private final int createDefaultNotificationId(ChatNotification notification) {
        if (notification instanceof ChatNotification.MessageNew) {
            ChatNotification.MessageNew messageNew = (ChatNotification.MessageNew) notification;
            return (messageNew.getChannel().getType() + ":" + messageNew.getChannel().getId()).hashCode();
        }
        if (notification instanceof ChatNotification.MessageUpdated) {
            ChatNotification.MessageUpdated messageUpdated = (ChatNotification.MessageUpdated) notification;
            return (messageUpdated.getChannel().getType() + ":" + messageUpdated.getChannel().getId() + ":" + messageUpdated.getMessage().getId()).hashCode();
        }
        if (notification instanceof ChatNotification.ReactionNew) {
            ChatNotification.ReactionNew reactionNew = (ChatNotification.ReactionNew) notification;
            return (reactionNew.getMessage().getId() + ":" + reactionNew.getReactionUserId() + ":" + reactionNew.getType()).hashCode();
        }
        if (!(notification instanceof ChatNotification.NotificationReminderDue)) {
            throw new NoWhenBranchMatchedException();
        }
        ChatNotification.NotificationReminderDue notificationReminderDue = (ChatNotification.NotificationReminderDue) notification;
        return (notificationReminderDue.getChannel().getType() + ":" + notificationReminderDue.getChannel().getId() + ":" + notificationReminderDue.getMessage().getId()).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createMessagingStyle(User user, Channel channel, InterfaceC30057d<? super NotificationCompat.MessagingStyle> interfaceC30057d) {
        C193901 c193901;
        if (interfaceC30057d instanceof C193901) {
            c193901 = (C193901) interfaceC30057d;
            int i13 = c193901.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193901.label = i13 - Integer.MIN_VALUE;
            } else {
                c193901 = new C193901(interfaceC30057d);
            }
        } else {
            c193901 = new C193901(interfaceC30057d);
        }
        Object person = c193901.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c193901.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(person);
            Context context = this.context;
            c193901.L$0 = null;
            c193901.L$1 = channel;
            c193901.label = 1;
            person = toPerson(user, context, c193901);
            if (person == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) c193901.L$1;
            AbstractC34132o.m107864I(person);
        }
        NotificationCompat.MessagingStyle groupConversation = new NotificationCompat.MessagingStyle((Person) person).setConversationTitle(channel.getName()).setGroupConversation(!AbstractC39414r.m125890i0(channel.getName()));
        AbstractC22676k.m65749i(groupConversation, "setGroupConversation(...)");
        return groupConversation;
    }

    private final long getTimestamp(Message message) {
        return MessageExtensionsKt.getCreatedAtOrDefault(message, new Date()).getTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object person(Message message, Context context, InterfaceC30057d<? super Person> interfaceC30057d) {
        return toPerson(message.getUser(), context, interfaceC30057d);
    }

    private final String personName(User user, Context context) {
        String name = user.getName();
        if (AbstractC39414r.m125890i0(name)) {
            name = null;
        }
        if (name != null) {
            return name;
        }
        String string = context.getString(C18999R.string.stream_chat_notification_empty_username);
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    private final NotificationCompat.MessagingStyle restoreMessagingStyle(ChatNotification notification) {
        StatusBarNotification statusBarNotification;
        Notification notification2;
        StatusBarNotification[] activeNotifications = this.notificationManager.getActiveNotifications();
        AbstractC22676k.m65749i(activeNotifications, "getActiveNotifications(...)");
        int length = activeNotifications.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                statusBarNotification = null;
                break;
            }
            statusBarNotification = activeNotifications[i13];
            if (statusBarNotification.getId() == createNotificationId$stream_chat_android_client_release(notification)) {
                break;
            }
            i13++;
        }
        if (statusBarNotification == null || (notification2 = statusBarNotification.getNotification()) == null) {
            return null;
        }
        return NotificationCompat.MessagingStyle.extractMessagingStyleFromNotification(notification2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object toMessagingStyleMessage(Message message, Context context, User user, InterfaceC30057d<? super NotificationCompat.MessagingStyle.Message> interfaceC30057d) {
        C193911 c193911;
        CharSequence charSequence;
        long j7;
        if (interfaceC30057d instanceof C193911) {
            c193911 = (C193911) interfaceC30057d;
            int i13 = c193911.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193911.label = i13 - Integer.MIN_VALUE;
            } else {
                c193911 = new C193911(interfaceC30057d);
            }
        } else {
            c193911 = new C193911(interfaceC30057d);
        }
        Object person = c193911.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c193911.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(person);
            charSequence = (CharSequence) this.notificationTextFormatter.invoke(user, message);
            long timestamp = getTimestamp(message);
            c193911.L$0 = null;
            c193911.L$1 = null;
            c193911.L$2 = null;
            c193911.L$3 = charSequence;
            c193911.J$0 = timestamp;
            c193911.label = 1;
            person = toPerson(message.getUser(), context, c193911);
            if (person == obj) {
                return obj;
            }
            j7 = timestamp;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c193911.J$0;
            charSequence = (CharSequence) c193911.L$3;
            AbstractC34132o.m107864I(person);
        }
        return new NotificationCompat.MessagingStyle.Message(charSequence, j7, (Person) person);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object toPerson(User user, Context context, InterfaceC30057d<? super Person> interfaceC30057d) {
        C193921 c193921;
        Person.Builder builder;
        if (interfaceC30057d instanceof C193921) {
            c193921 = (C193921) interfaceC30057d;
            int i13 = c193921.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193921.label = i13 - Integer.MIN_VALUE;
            } else {
                c193921 = new C193921(interfaceC30057d);
            }
        } else {
            c193921 = new C193921(interfaceC30057d);
        }
        Object objBuildIcon = c193921.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193921.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objBuildIcon);
            Person.Builder name = new Person.Builder().setKey(user.getId()).setName(personName(user, context));
            UserIconBuilder userIconBuilder = this.userIconBuilder;
            c193921.L$0 = null;
            c193921.L$1 = null;
            c193921.L$2 = name;
            c193921.label = 1;
            objBuildIcon = userIconBuilder.buildIcon(user, c193921);
            if (objBuildIcon == enumC31071a) {
                return enumC31071a;
            }
            builder = name;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            builder = (Person.Builder) c193921.L$2;
            AbstractC34132o.m107864I(objBuildIcon);
        }
        Person personBuild = builder.setIcon((IconCompat) objBuildIcon).build();
        AbstractC22676k.m65749i(personBuild, "build(...)");
        return personBuild;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0157  */
    /* JADX WARN: Code duplicated, block: B:41:0x017a A[LOOP:1: B:39:0x0174->B:41:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0208 A[LOOP:0: B:59:0x0202->B:61:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object createNotification$stream_chat_android_client_release(ChatNotification chatNotification, InterfaceC30057d<? super Notification> interfaceC30057d) {
        MessagingStyleNotificationFactory$createNotification$1 messagingStyleNotificationFactory$createNotification$1;
        int iCreateNotificationId$stream_chat_android_client_release;
        NotificationCompat.Builder color;
        Message message;
        NotificationCompat.MessagingStyle messagingStyleRestoreMessagingStyle;
        Channel channel;
        User user;
        Channel channel2;
        Message message2;
        NotificationCompat.MessagingStyle messagingStyleRestoreMessagingStyle2;
        User user2;
        ChatNotification chatNotification2;
        int i13;
        NotificationCompat.Builder contentIntent;
        Object messagingStyleMessage;
        NotificationCompat.Builder builder;
        NotificationCompat.MessagingStyle messagingStyle;
        NotificationCompat.Builder style;
        Iterator it;
        int i14;
        NotificationCompat.Builder contentIntent2;
        Object messagingStyleMessage2;
        Message message3;
        NotificationCompat.MessagingStyle messagingStyle2;
        NotificationCompat.Builder style2;
        Iterator it3;
        if (interfaceC30057d instanceof MessagingStyleNotificationFactory$createNotification$1) {
            messagingStyleNotificationFactory$createNotification$1 = (MessagingStyleNotificationFactory$createNotification$1) interfaceC30057d;
            int i15 = messagingStyleNotificationFactory$createNotification$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                messagingStyleNotificationFactory$createNotification$1.label = i15 - Integer.MIN_VALUE;
            } else {
                messagingStyleNotificationFactory$createNotification$1 = new MessagingStyleNotificationFactory$createNotification$1(this, interfaceC30057d);
            }
        } else {
            messagingStyleNotificationFactory$createNotification$1 = new MessagingStyleNotificationFactory$createNotification$1(this, interfaceC30057d);
        }
        Object obj = messagingStyleNotificationFactory$createNotification$1.result;
        Object obj2 = EnumC31071a.f128113w;
        int i16 = messagingStyleNotificationFactory$createNotification$1.label;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            User user3 = (User) this.currentUserProvider.invoke();
            if (user3 == null) {
                return null;
            }
            iCreateNotificationId$stream_chat_android_client_release = createNotificationId$stream_chat_android_client_release(chatNotification);
            color = new NotificationCompat.Builder(this.context, this.notificationChannelId).setSmallIcon(C18999R.drawable.stream_ic_notification).setColor(AbstractC32122c.getColor(this.context, C18999R.color.stream_ic_notification));
            AbstractC22676k.m65749i(color, "setColor(...)");
            if (!(chatNotification instanceof ChatNotification.MessageNew)) {
                if (chatNotification instanceof ChatNotification.MessageUpdated) {
                    ChatNotification.MessageUpdated messageUpdated = (ChatNotification.MessageUpdated) chatNotification;
                    Channel channel3 = messageUpdated.getChannel();
                    message = messageUpdated.getMessage();
                    messagingStyleRestoreMessagingStyle = restoreMessagingStyle(chatNotification);
                    if (messagingStyleRestoreMessagingStyle == null) {
                        messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification;
                        messagingStyleNotificationFactory$createNotification$1.L$1 = user3;
                        messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                        messagingStyleNotificationFactory$createNotification$1.L$3 = channel3;
                        messagingStyleNotificationFactory$createNotification$1.L$4 = message;
                        messagingStyleNotificationFactory$createNotification$1.I$0 = iCreateNotificationId$stream_chat_android_client_release;
                        messagingStyleNotificationFactory$createNotification$1.label = 3;
                        Object objCreateMessagingStyle = createMessagingStyle(user3, channel3, messagingStyleNotificationFactory$createNotification$1);
                        if (objCreateMessagingStyle != obj2) {
                            user = user3;
                            obj = objCreateMessagingStyle;
                            channel = channel3;
                            messagingStyleRestoreMessagingStyle = (NotificationCompat.MessagingStyle) obj;
                            chatNotification2 = chatNotification;
                            i14 = iCreateNotificationId$stream_chat_android_client_release;
                            contentIntent2 = color.setContentIntent(createContentIntent(i14, channel, message));
                            Context context = this.context;
                            messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
                            messagingStyleNotificationFactory$createNotification$1.L$1 = null;
                            messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                            messagingStyleNotificationFactory$createNotification$1.L$3 = channel;
                            messagingStyleNotificationFactory$createNotification$1.L$4 = message;
                            messagingStyleNotificationFactory$createNotification$1.L$5 = null;
                            messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent2;
                            messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle;
                            messagingStyleNotificationFactory$createNotification$1.I$0 = i14;
                            messagingStyleNotificationFactory$createNotification$1.label = 4;
                            messagingStyleMessage2 = toMessagingStyleMessage(message, context, user, messagingStyleNotificationFactory$createNotification$1);
                            if (messagingStyleMessage2 != obj2) {
                                message3 = message;
                                builder = color;
                                messagingStyle2 = messagingStyleRestoreMessagingStyle;
                                style2 = contentIntent2.setStyle(messagingStyle2.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage2));
                                it3 = ((Iterable) this.actionsProvider.invoke(new Integer(i14), channel, message3)).iterator();
                                while (it3.hasNext()) {
                                    style2.addAction((NotificationCompat.Action) it3.next());
                                }
                            }
                        }
                    } else {
                        channel = channel3;
                        user = user3;
                        chatNotification2 = chatNotification;
                        i14 = iCreateNotificationId$stream_chat_android_client_release;
                        contentIntent2 = color.setContentIntent(createContentIntent(i14, channel, message));
                        Context context2 = this.context;
                        messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
                        messagingStyleNotificationFactory$createNotification$1.L$1 = null;
                        messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                        messagingStyleNotificationFactory$createNotification$1.L$3 = channel;
                        messagingStyleNotificationFactory$createNotification$1.L$4 = message;
                        messagingStyleNotificationFactory$createNotification$1.L$5 = null;
                        messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent2;
                        messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle;
                        messagingStyleNotificationFactory$createNotification$1.I$0 = i14;
                        messagingStyleNotificationFactory$createNotification$1.label = 4;
                        messagingStyleMessage2 = toMessagingStyleMessage(message, context2, user, messagingStyleNotificationFactory$createNotification$1);
                        if (messagingStyleMessage2 != obj2) {
                            message3 = message;
                            builder = color;
                            messagingStyle2 = messagingStyleRestoreMessagingStyle;
                            style2 = contentIntent2.setStyle(messagingStyle2.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage2));
                            it3 = ((Iterable) this.actionsProvider.invoke(new Integer(i14), channel, message3)).iterator();
                            while (it3.hasNext()) {
                                style2.addAction((NotificationCompat.Action) it3.next());
                            }
                        }
                    }
                } else if (chatNotification instanceof ChatNotification.ReactionNew) {
                    ChatNotification.ReactionNew reactionNew = (ChatNotification.ReactionNew) chatNotification;
                    color.setContentTitle(reactionNew.getTitle()).setContentText(reactionNew.getBody()).setContentIntent(createContentIntent(iCreateNotificationId$stream_chat_android_client_release, reactionNew.getChannel(), reactionNew.getMessage())).setAutoCancel(true);
                } else {
                    if (!(chatNotification instanceof ChatNotification.NotificationReminderDue)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ChatNotification.NotificationReminderDue notificationReminderDue = (ChatNotification.NotificationReminderDue) chatNotification;
                    color.setContentTitle(this.context.getString(C18999R.string.stream_chat_notification_reminder_due_title)).setContentText((CharSequence) this.notificationTextFormatter.invoke(user3, notificationReminderDue.getMessage())).setContentIntent(createContentIntent(iCreateNotificationId$stream_chat_android_client_release, notificationReminderDue.getChannel(), notificationReminderDue.getMessage())).setAutoCancel(true);
                }
                return ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(color, chatNotification)).build();
            }
            ChatNotification.MessageNew messageNew = (ChatNotification.MessageNew) chatNotification;
            channel2 = messageNew.getChannel();
            message2 = messageNew.getMessage();
            messagingStyleRestoreMessagingStyle2 = restoreMessagingStyle(chatNotification);
            if (messagingStyleRestoreMessagingStyle2 == null) {
                messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification;
                messagingStyleNotificationFactory$createNotification$1.L$1 = user3;
                messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                messagingStyleNotificationFactory$createNotification$1.L$3 = channel2;
                messagingStyleNotificationFactory$createNotification$1.L$4 = message2;
                messagingStyleNotificationFactory$createNotification$1.I$0 = iCreateNotificationId$stream_chat_android_client_release;
                messagingStyleNotificationFactory$createNotification$1.label = 1;
                Object objCreateMessagingStyle2 = createMessagingStyle(user3, channel2, messagingStyleNotificationFactory$createNotification$1);
                if (objCreateMessagingStyle2 != obj2) {
                    user2 = user3;
                    obj = objCreateMessagingStyle2;
                    messagingStyleRestoreMessagingStyle2 = (NotificationCompat.MessagingStyle) obj;
                    chatNotification2 = chatNotification;
                    i13 = iCreateNotificationId$stream_chat_android_client_release;
                    contentIntent = color.setContentIntent(createContentIntent(i13, channel2, message2));
                    Context context3 = this.context;
                    messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
                    messagingStyleNotificationFactory$createNotification$1.L$1 = null;
                    messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                    messagingStyleNotificationFactory$createNotification$1.L$3 = channel2;
                    messagingStyleNotificationFactory$createNotification$1.L$4 = message2;
                    messagingStyleNotificationFactory$createNotification$1.L$5 = null;
                    messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent;
                    messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle2;
                    messagingStyleNotificationFactory$createNotification$1.I$0 = i13;
                    messagingStyleNotificationFactory$createNotification$1.label = 2;
                    messagingStyleMessage = toMessagingStyleMessage(message2, context3, user2, messagingStyleNotificationFactory$createNotification$1);
                    if (messagingStyleMessage != obj2) {
                        builder = color;
                        messagingStyle = messagingStyleRestoreMessagingStyle2;
                        style = contentIntent.setStyle(messagingStyle.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage));
                        it = ((Iterable) this.actionsProvider.invoke(new Integer(i13), channel2, message2)).iterator();
                        while (it.hasNext()) {
                            style.addAction((NotificationCompat.Action) it.next());
                        }
                    }
                }
            } else {
                user2 = user3;
                chatNotification2 = chatNotification;
                i13 = iCreateNotificationId$stream_chat_android_client_release;
                contentIntent = color.setContentIntent(createContentIntent(i13, channel2, message2));
                Context context4 = this.context;
                messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
                messagingStyleNotificationFactory$createNotification$1.L$1 = null;
                messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                messagingStyleNotificationFactory$createNotification$1.L$3 = channel2;
                messagingStyleNotificationFactory$createNotification$1.L$4 = message2;
                messagingStyleNotificationFactory$createNotification$1.L$5 = null;
                messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent;
                messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle2;
                messagingStyleNotificationFactory$createNotification$1.I$0 = i13;
                messagingStyleNotificationFactory$createNotification$1.label = 2;
                messagingStyleMessage = toMessagingStyleMessage(message2, context4, user2, messagingStyleNotificationFactory$createNotification$1);
                if (messagingStyleMessage != obj2) {
                    builder = color;
                    messagingStyle = messagingStyleRestoreMessagingStyle2;
                    style = contentIntent.setStyle(messagingStyle.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage));
                    it = ((Iterable) this.actionsProvider.invoke(new Integer(i13), channel2, message2)).iterator();
                    while (it.hasNext()) {
                        style.addAction((NotificationCompat.Action) it.next());
                    }
                }
            }
            return obj2;
        }
        if (i16 == 1) {
            int i17 = messagingStyleNotificationFactory$createNotification$1.I$0;
            Message message4 = (Message) messagingStyleNotificationFactory$createNotification$1.L$4;
            Channel channel4 = (Channel) messagingStyleNotificationFactory$createNotification$1.L$3;
            NotificationCompat.Builder builder2 = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$2;
            user2 = (User) messagingStyleNotificationFactory$createNotification$1.L$1;
            ChatNotification chatNotification3 = (ChatNotification) messagingStyleNotificationFactory$createNotification$1.L$0;
            AbstractC34132o.m107864I(obj);
            iCreateNotificationId$stream_chat_android_client_release = i17;
            chatNotification = chatNotification3;
            color = builder2;
            channel2 = channel4;
            message2 = message4;
            messagingStyleRestoreMessagingStyle2 = (NotificationCompat.MessagingStyle) obj;
            chatNotification2 = chatNotification;
            i13 = iCreateNotificationId$stream_chat_android_client_release;
            contentIntent = color.setContentIntent(createContentIntent(i13, channel2, message2));
            Context context5 = this.context;
            messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
            messagingStyleNotificationFactory$createNotification$1.L$1 = null;
            messagingStyleNotificationFactory$createNotification$1.L$2 = color;
            messagingStyleNotificationFactory$createNotification$1.L$3 = channel2;
            messagingStyleNotificationFactory$createNotification$1.L$4 = message2;
            messagingStyleNotificationFactory$createNotification$1.L$5 = null;
            messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent;
            messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle2;
            messagingStyleNotificationFactory$createNotification$1.I$0 = i13;
            messagingStyleNotificationFactory$createNotification$1.label = 2;
            messagingStyleMessage = toMessagingStyleMessage(message2, context5, user2, messagingStyleNotificationFactory$createNotification$1);
            if (messagingStyleMessage != obj2) {
                builder = color;
                messagingStyle = messagingStyleRestoreMessagingStyle2;
            }
            return obj2;
        }
        if (i16 != 2) {
            if (i16 == 3) {
                int i18 = messagingStyleNotificationFactory$createNotification$1.I$0;
                Message message5 = (Message) messagingStyleNotificationFactory$createNotification$1.L$4;
                channel = (Channel) messagingStyleNotificationFactory$createNotification$1.L$3;
                NotificationCompat.Builder builder3 = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$2;
                user = (User) messagingStyleNotificationFactory$createNotification$1.L$1;
                ChatNotification chatNotification4 = (ChatNotification) messagingStyleNotificationFactory$createNotification$1.L$0;
                AbstractC34132o.m107864I(obj);
                iCreateNotificationId$stream_chat_android_client_release = i18;
                chatNotification = chatNotification4;
                color = builder3;
                message = message5;
                messagingStyleRestoreMessagingStyle = (NotificationCompat.MessagingStyle) obj;
                chatNotification2 = chatNotification;
                i14 = iCreateNotificationId$stream_chat_android_client_release;
                contentIntent2 = color.setContentIntent(createContentIntent(i14, channel, message));
                Context context6 = this.context;
                messagingStyleNotificationFactory$createNotification$1.L$0 = chatNotification2;
                messagingStyleNotificationFactory$createNotification$1.L$1 = null;
                messagingStyleNotificationFactory$createNotification$1.L$2 = color;
                messagingStyleNotificationFactory$createNotification$1.L$3 = channel;
                messagingStyleNotificationFactory$createNotification$1.L$4 = message;
                messagingStyleNotificationFactory$createNotification$1.L$5 = null;
                messagingStyleNotificationFactory$createNotification$1.L$6 = contentIntent2;
                messagingStyleNotificationFactory$createNotification$1.L$7 = messagingStyleRestoreMessagingStyle;
                messagingStyleNotificationFactory$createNotification$1.I$0 = i14;
                messagingStyleNotificationFactory$createNotification$1.label = 4;
                messagingStyleMessage2 = toMessagingStyleMessage(message, context6, user, messagingStyleNotificationFactory$createNotification$1);
                if (messagingStyleMessage2 != obj2) {
                    message3 = message;
                    builder = color;
                    messagingStyle2 = messagingStyleRestoreMessagingStyle;
                }
                return obj2;
            }
            if (i16 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i14 = messagingStyleNotificationFactory$createNotification$1.I$0;
            messagingStyle2 = (NotificationCompat.MessagingStyle) messagingStyleNotificationFactory$createNotification$1.L$7;
            contentIntent2 = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$6;
            message3 = (Message) messagingStyleNotificationFactory$createNotification$1.L$4;
            channel = (Channel) messagingStyleNotificationFactory$createNotification$1.L$3;
            builder = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$2;
            ChatNotification chatNotification5 = (ChatNotification) messagingStyleNotificationFactory$createNotification$1.L$0;
            AbstractC34132o.m107864I(obj);
            messagingStyleMessage2 = obj;
            chatNotification2 = chatNotification5;
            style2 = contentIntent2.setStyle(messagingStyle2.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage2));
            it3 = ((Iterable) this.actionsProvider.invoke(new Integer(i14), channel, message3)).iterator();
            while (it3.hasNext()) {
                style2.addAction((NotificationCompat.Action) it3.next());
            }
        } else {
            i13 = messagingStyleNotificationFactory$createNotification$1.I$0;
            messagingStyle = (NotificationCompat.MessagingStyle) messagingStyleNotificationFactory$createNotification$1.L$7;
            contentIntent = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$6;
            message2 = (Message) messagingStyleNotificationFactory$createNotification$1.L$4;
            channel2 = (Channel) messagingStyleNotificationFactory$createNotification$1.L$3;
            builder = (NotificationCompat.Builder) messagingStyleNotificationFactory$createNotification$1.L$2;
            ChatNotification chatNotification6 = (ChatNotification) messagingStyleNotificationFactory$createNotification$1.L$0;
            AbstractC34132o.m107864I(obj);
            messagingStyleMessage = obj;
            chatNotification2 = chatNotification6;
        }
        style = contentIntent.setStyle(messagingStyle.addMessage((NotificationCompat.MessagingStyle.Message) messagingStyleMessage));
        it = ((Iterable) this.actionsProvider.invoke(new Integer(i13), channel2, message2)).iterator();
        while (it.hasNext()) {
            style.addAction((NotificationCompat.Action) it.next());
        }
        chatNotification = chatNotification2;
        color = builder;
        return ((NotificationCompat.Builder) this.notificationBuilderTransformer.invoke(color, chatNotification)).build();
    }

    public final int createNotificationId$stream_chat_android_client_release(ChatNotification notification) {
        Integer notificationId;
        AbstractC22676k.m65750j(notification, "notification");
        NotificationIdFactory notificationIdFactory = this.notificationIdFactory;
        return (notificationIdFactory == null || (notificationId = notificationIdFactory.getNotificationId(notification)) == null) ? createDefaultNotificationId(notification) : notificationId.intValue();
    }

    public /* synthetic */ MessagingStyleNotificationFactory(Context context, NotificationManager notificationManager, String str, UserIconBuilder userIconBuilder, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, Function3 function3, InterfaceC4351m interfaceC4351m3, NotificationIdFactory notificationIdFactory, InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, notificationManager, str, userIconBuilder, interfaceC4351m, interfaceC4351m2, function3, interfaceC4351m3, notificationIdFactory, (i13 & 512) != 0 ? new C19383k(8) : interfaceC4339a);
    }
}
