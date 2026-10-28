.class public final Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/ChatNotifications;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012JG\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0016\u0008\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010\'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J!\u0010-\u001a\u00020\u00102\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008/\u00100J!\u00101\u001a\u00020\u00102\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u00081\u0010.J\u001a\u00102\u001a\u00020\u00102\u0008\u0010*\u001a\u0004\u0018\u00010)H\u0096@\u00a2\u0006\u0004\u00082\u00103J\u001f\u00107\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u000209H\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0010\u0010<\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008<\u0010=J\u001f\u0010>\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010B\u001a\u00020\u00102\u0006\u0010A\u001a\u00020@H\u0016\u00a2\u0006\u0004\u0008B\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008I\u0010J\u001a\u0004\u0008K\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u001a\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00130Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010V\u00a8\u0006W"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;",
        "Lio/getstream/chat/android/client/notifications/ChatNotifications;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "handler",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "notificationConfig",
        "Landroid/content/Context;",
        "context",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "api",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Landroid/content/Context;Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;)V",
        "Lio/getstream/chat/android/models/PushMessage;",
        "message",
        "Ll83/a0;",
        "handlePushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;)V",
        "",
        "type",
        "channelId",
        "channelType",
        "messageId",
        "",
        "",
        "payload",
        "obtainNotificationData",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "Lio/getstream/chat/android/client/events/NewMessageEvent;",
        "event",
        "onNewMessageEvent",
        "(Lio/getstream/chat/android/client/events/NewMessageEvent;)V",
        "Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;",
        "onNotificationReminderDueEvent",
        "(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)V",
        "cancelLoadDataWork",
        "()V",
        "",
        "wasNotificationDisplayed",
        "(Ljava/lang/String;)Z",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Lio/getstream/chat/android/models/Device;",
        "device",
        "setDeviceForUser",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V",
        "onSetUser",
        "(Lio/getstream/chat/android/models/User;)V",
        "setDevice",
        "deleteDevice",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "pushMessage",
        "Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;",
        "pushNotificationReceivedListener",
        "onPushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "onChatEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "onLogout",
        "(Lq83/d;)Ljava/lang/Object;",
        "dismissChannelNotifications",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "notification",
        "displayNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "Landroid/content/Context;",
        "Lbc3/c0;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;",
        "pushTokenUpdateHandler",
        "Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;",
        "",
        "showedMessages",
        "Ljava/util/Set;",
        "La13/d;",
        "permissionManager",
        "La13/d;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

.field private final logger$delegate:Ll83/h;

.field private final notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

.field private final permissionManager:La13/d;

.field private final pushTokenUpdateHandler:Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;

.field private final scope:Lbc3/c0;

.field private final showedMessages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Landroid/content/Context;Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;)V
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->context:Landroid/content/Context;

    .line 5
    iput-object p5, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->scope:Lbc3/c0;

    .line 6
    const-string p1, "Chat:Notifications"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->logger$delegate:Ll83/h;

    .line 7
    new-instance p1, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;

    invoke-direct {p1, p4}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;-><init>(Lio/getstream/chat/android/client/api/ChatApi;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->pushTokenUpdateHandler:Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;

    .line 8
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->showedMessages:Ljava/util/Set;

    .line 9
    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    .line 10
    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->getRequestPermissionOnAppLaunch()Lc93/a;

    move-result-object p2

    .line 11
    new-instance p3, Lhb2/c;

    const/16 p4, 0x16

    invoke-direct {p3, p0, p4}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    .line 12
    const-string p4, "requestPermissionOnAppLaunch"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance p4, La13/d;

    .line 14
    sget-object p5, La13/i;->E:Lio/sentry/hints/j;

    invoke-virtual {p5, p1}, Lio/sentry/hints/j;->q(Landroid/app/Application;)La13/i;

    move-result-object p1

    .line 15
    invoke-direct {p4, p1, p2, p3}, La13/d;-><init>(La13/i;Lc93/a;Lkotlin/jvm/functions/Function1;)V

    .line 16
    const-string p2, "Push:Notifications-PM"

    .line 17
    const-string p3, "[initialize] no args"

    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    iget-object p1, p1, La13/i;->w:Ljava/util/ArrayList;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    iput-object p4, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->permissionManager:La13/d;

    .line 20
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object p1

    .line 21
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    .line 22
    sget-object p3, Lb23/g;->z:Lb23/g;

    .line 23
    iget-object p4, p1, Lb23/k;->a:Ljava/lang/String;

    .line 24
    invoke-interface {p2, p3, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 25
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 26
    const-string p2, "<init> no args"

    const/4 p5, 0x0

    .line 27
    invoke-interface {p1, p3, p4, p2, p5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Landroid/content/Context;Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 28
    sget-object p5, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p5}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p5

    invoke-static {p5}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 29
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;-><init>(Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;Landroid/content/Context;Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getPushTokenUpdateHandler$p(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;)Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->pushTokenUpdateHandler:Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;La13/e;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->permissionManager$lambda$1(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;La13/e;)Ll83/a0;

    return-void
.end method

.method private final cancelLoadDataWork()V
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->Companion:Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;->cancel(Landroid/content/Context;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handlePushMessage(Lio/getstream/chat/android/models/PushMessage;)V
    .locals 7

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v2, v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getChannelId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getChannelType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getExtraData()Ljava/util/Map;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->obtainNotificationData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final obtainNotificationData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, ", channelCid: "

    const-string v4, ":"

    const-string v5, "[obtainNotificationData] type: "

    invoke-static {v5, p1, v1, p2, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, ", messageId: "

    move-object/from16 v10, p4

    invoke-static {v1, p3, v4, v10}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move-object/from16 v10, p4

    :goto_0
    sget-object v5, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker;->Companion:Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;

    iget-object v6, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->context:Landroid/content/Context;

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v11, p5

    invoke-virtual/range {v5 .. v11}, Lio/getstream/chat/android/client/notifications/LoadNotificationDataWorker$Companion;->start(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic obtainNotificationData$default(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->obtainNotificationData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final onNewMessageEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;)V
    .locals 6

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v5, "[onNewMessageEvent] event: "

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->onChatEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;)Z

    return-void
.end method

.method private final onNotificationReminderDueEvent(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onNotificationReminderDueEvent] event: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->onNotificationReminderDueEvent(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)Z

    return-void
.end method

.method private static final onSetUser$lambda$7$lambda$6(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;Lio/getstream/chat/android/models/User;Ly03/a;)Ll83/a0;
    .locals 0

    const-string p0, "pushDevice"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final permissionManager$lambda$1(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;La13/e;)Ll83/a0;
    .locals 5

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onPermissionStatus] status: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->onNotificationPermissionStatus(La13/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setDeviceForUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[setDeviceForUser] userId: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", device: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl$setDeviceForUser$2;

    invoke-direct {v1, p0, p1, p2, v4}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl$setDeviceForUser$2;-><init>(Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v4, v4, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final wasNotificationDisplayed(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->showedMessages:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    const-string v5, "[deleteDevice] userId: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->pushTokenUpdateHandler:Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;->deleteDevice(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final displayNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 5

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[displayNotification] notification: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->showedMessages:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->showedMessages:Ljava/util/Set;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->showNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->showNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V

    return-void
.end method

.method public final onChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 6

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onChatEvent] event: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->onNewMessageEvent(Lio/getstream/chat/android/client/events/NewMessageEvent;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->onNotificationReminderDueEvent(Lio/getstream/chat/android/client/events/NotificationReminderDueEvent;)V

    return-void

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onChatEvent] ChatEvent not supported: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final onLogout(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->z:Lb23/g;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[onLogout]"

    const/4 v3, 0x0

    invoke-interface {p1, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->permissionManager:La13/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Push:Notifications-PM"

    const-string v1, "[stop] no args"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    iput-boolean v0, p1, La13/d;->d:Z

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->dismissAllNotifications()V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->cancelLoadDataWork()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onPushMessage(Lio/getstream/chat/android/models/PushMessage;Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;)V
    .locals 5

    const-string v0, "pushMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pushNotificationReceivedListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onPushMessage] message: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getChannelType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/PushMessage;->getChannelId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lio/getstream/chat/android/client/notifications/PushNotificationReceivedListener;->onPushNotificationReceived(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->getShouldShowNotificationOnPush()Lc93/a;

    move-result-object p2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handler:Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;->onPushMessage(Lio/getstream/chat/android/models/PushMessage;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->handlePushMessage(Lio/getstream/chat/android/models/PushMessage;)V

    :cond_1
    return-void
.end method

.method public final onSetUser(Lio/getstream/chat/android/models/User;)V
    .locals 6

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[onSetUser] user: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->permissionManager:La13/d;

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->getRequestPermissionOnAppLaunch()Lc93/a;

    move-result-object v0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v4, p1

    :cond_1
    if-eqz v4, :cond_2

    const-string p1, "Push:Notifications-PM"

    const-string v0, "[start] no args"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v4}, La13/d;->c()V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->notificationConfig:Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->getPushDeviceGenerators()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public final setDevice(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V
    .locals 7

    const-string v0, "device"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[setDevice] userId: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", device: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/ChatNotificationsImpl;->setDeviceForUser(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)V

    return-void
.end method
