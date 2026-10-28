.class public final Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$Companion;,
        Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010\"\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 g2\u00020\u0001:\u0001gB\u00c3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0004\u0012$\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u0013\u0012\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00180\u0004\u0012\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010.\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020%H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u00020%2\u0006\u00105\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u00086\u0010*J\u0017\u00108\u001a\u00020%2\u0006\u00107\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010:\u001a\u00020%2\u0006\u00107\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008:\u00109J\u0015\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00140;H\u0002\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010>\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u001f\u0010@\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\'\u0010B\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u00107\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008B\u0010CJ%\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u00140;2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u001f\u0010F\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008F\u0010/J\u001f\u0010G\u001a\u00020%2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008G\u0010/J\u000f\u0010H\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008H\u00101J\u000f\u0010I\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008I\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010JR&\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010KR\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010LR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010MR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010NR(\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010KR2\u0010\u0017\u001a \u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010OR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010PR\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010T\u001a\u0004\u0008U\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Y\u0010T\u001a\u0004\u0008Z\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008^\u0010T\u001a\u0004\u0008_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008c\u0010T\u001a\u0004\u0008d\u0010e\u00a8\u0006h"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationHandler;",
        "Landroid/content/Context;",
        "context",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Channel;",
        "Landroid/content/Intent;",
        "newMessageIntent",
        "Lkotlin/Function0;",
        "Landroid/app/NotificationChannel;",
        "notificationChannel",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "userIconBuilder",
        "La13/c;",
        "permissionHandler",
        "Lio/getstream/chat/android/models/User;",
        "",
        "notificationTextFormatter",
        "Lkotlin/Function3;",
        "",
        "",
        "Landroidx/core/app/NotificationCompat$Action;",
        "actionsProvider",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "notificationBuilderTransformer",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/PushMessage;",
        "",
        "onNewPushMessage",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "notificationIdFactory",
        "<init>",
        "(Landroid/content/Context;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V",
        "La13/e;",
        "status",
        "Ll83/a0;",
        "onNotificationPermissionStatus",
        "(La13/e;)V",
        "notification",
        "showNotification",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V",
        "",
        "channelType",
        "channelId",
        "dismissChannelNotifications",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "dismissAllNotifications",
        "()V",
        "message",
        "onPushMessage",
        "(Lio/getstream/chat/android/models/PushMessage;)Z",
        "chatNotification",
        "showNotificationInternal",
        "notificationId",
        "trackNotificationId",
        "(I)V",
        "removeNotificationId",
        "",
        "getShownNotifications",
        "()Ljava/util/Set;",
        "getNotificationChannelId",
        "()Ljava/lang/String;",
        "getChannelNotificationsKey",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "trackChannelNotificationId",
        "(Ljava/lang/String;Ljava/lang/String;I)V",
        "getChannelNotificationIds",
        "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;",
        "dismissTrackedChannelNotifications",
        "clearTrackedChannelNotificationIds",
        "dismissAllTrackedChannelNotifications",
        "clearAllTrackedChannelNotificationIds",
        "Landroid/content/Context;",
        "Lc93/m;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "La13/c;",
        "Lkotlin/jvm/functions/Function3;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences$delegate",
        "getSharedPreferences",
        "()Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Landroid/app/NotificationManager;",
        "notificationManager$delegate",
        "getNotificationManager",
        "()Landroid/app/NotificationManager;",
        "notificationManager",
        "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;",
        "factory$delegate",
        "getFactory",
        "()Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;",
        "factory",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$Companion;

.field private static final KEY_NOTIFICATIONS_SHOWN:Ljava/lang/String; = "KEY_NOTIFICATIONS_SHOWN"

.field private static final KEY_PREFIX_CHANNEL_NOTIFICATIONS:Ljava/lang/String; = "KEY_CHANNEL_NOTIFICATIONS_"

.field private static final SHARED_PREFERENCES_NAME:Ljava/lang/String; = "stream_notifications.sp"


# instance fields
.field private final actionsProvider:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final factory$delegate:Ll83/h;

.field private final logger$delegate:Ll83/h;

.field private final newMessageIntent:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final notificationChannel:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

.field private final notificationManager$delegate:Ll83/h;

.field private final notificationTextFormatter:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final onNewPushMessage:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final permissionHandler:La13/c;

.field private final sharedPreferences$delegate:Ll83/h;

.field private final userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->Companion:Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc93/m;Lc93/a;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;La13/c;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lc93/m;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "La13/c;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationBuilderTransformer"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNewPushMessage"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->newMessageIntent:Lc93/m;

    iput-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationChannel:Lc93/a;

    iput-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    iput-object p5, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->permissionHandler:La13/c;

    iput-object p6, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationTextFormatter:Lc93/m;

    iput-object p7, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->actionsProvider:Lkotlin/jvm/functions/Function3;

    iput-object p9, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->onNewPushMessage:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    const-string p1, "Chat:MsnHandler"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->logger$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/b;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/notifications/handler/b;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->sharedPreferences$delegate:Ll83/h;

    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/b;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/client/notifications/handler/b;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationManager$delegate:Ll83/h;

    new-instance p1, La11/l;

    const/16 p2, 0x14

    invoke-direct {p1, p2, p0, p8}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->factory$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->factory_delegate$lambda$3(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getFactory(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getFactory()Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNotificationManager(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/app/NotificationManager;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$trackChannelNotificationId(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->trackChannelNotificationId(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$trackNotificationId(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;I)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->trackNotificationId(I)V

    return-void
.end method

.method public static b(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/content/SharedPreferences;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->context:Landroid/content/Context;

    const-string v0, "stream_notifications.sp"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/app/NotificationManager;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationManager_delegate$lambda$2(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/app/NotificationManager;

    move-result-object p0

    return-object p0
.end method

.method private final clearAllTrackedChannelNotificationIds()V
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v5, "KEY_CHANNEL_NOTIFICATIONS_"

    const/4 v6, 0x0

    invoke-static {v4, v5, v6}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final clearTrackedChannelNotificationIds(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getChannelNotificationsKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final dismissAllTrackedChannelNotifications()V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v4, "KEY_CHANNEL_NOTIFICATIONS_"

    const/4 v5, 0x0

    invoke-static {v3, v4, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v3

    sget-object v4, Lm83/a0;->w:Lm83/a0;

    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v2

    :goto_2
    check-cast v4, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_4

    :cond_6
    return-void
.end method

.method private final dismissTrackedChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getChannelNotificationIds(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/NotificationManager;->cancel(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final factory_delegate$lambda$3(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lc93/m;)Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;
    .locals 13

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->context:Landroid/content/Context;

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationChannelId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    iget-object v5, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->newMessageIntent:Lc93/m;

    iget-object v6, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationTextFormatter:Lc93/m;

    iget-object v7, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->actionsProvider:Lkotlin/jvm/functions/Function3;

    iget-object v9, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    const/16 v11, 0x200

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v8, p1

    invoke-direct/range {v0 .. v12}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;-><init>(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final getChannelNotificationIds(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getChannelNotificationsKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method private final getChannelNotificationsKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "KEY_CHANNEL_NOTIFICATIONS_"

    const-string v1, ":"

    invoke-static {v0, p1, v1, p2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getFactory()Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->factory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getNotificationChannelId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationChannel:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationChannel;

    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method private final getNotificationManager()Landroid/app/NotificationManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationManager$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    return-object v0
.end method

.method private final getSharedPreferences()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->sharedPreferences$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private final getShownNotifications()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "KEY_NOTIFICATIONS_SHOWN"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private static final notificationManager_delegate$lambda$2(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/app/NotificationManager;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->context:Landroid/content/Context;

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->notificationChannel:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/NotificationChannel;

    invoke-virtual {v0, p0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    return-object v0
.end method

.method private final removeNotificationId(I)V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getShownNotifications()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Ldt/b;->y(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    const-string v1, "KEY_NOTIFICATIONS_SHOWN"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private static final sharedPreferences_delegate$lambda$0(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;)Landroid/content/SharedPreferences;
    .locals 2

    iget-object p0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->context:Landroid/content/Context;

    const-string v0, "stream_notifications.sp"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private final showNotificationInternal(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler$showNotificationInternal$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->launch$stream_chat_android_client_release(Lc93/m;)Lbc3/k1;

    return-void
.end method

.method private final trackChannelNotificationId(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getChannelNotificationsKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getChannelNotificationIds(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;

    move-result-object p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2, p1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method private final trackNotificationId(I)V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getSharedPreferences()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getShownNotifications()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    const-string v1, "KEY_NOTIFICATIONS_SHOWN"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method


# virtual methods
.method public final dismissAllNotifications()V
    .locals 3

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getShownNotifications()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getNotificationManager()Landroid/app/NotificationManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/app/NotificationManager;->cancel(I)V

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->removeNotificationId(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->dismissAllTrackedChannelNotifications()V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->clearAllTrackedChannelNotificationIds()V

    return-void
.end method

.method public final dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->dismissTrackedChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->clearTrackedChannelNotificationIds(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onNotificationPermissionStatus(La13/e;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->permissionHandler:La13/c;

    if-eqz p1, :cond_4

    invoke-interface {p1}, La13/c;->onPermissionRationale()V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->permissionHandler:La13/c;

    if-eqz p1, :cond_4

    invoke-interface {p1}, La13/c;->onPermissionDenied()V

    return-void

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->permissionHandler:La13/c;

    if-eqz p1, :cond_4

    invoke-interface {p1}, La13/c;->onPermissionGranted()V

    return-void

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->permissionHandler:La13/c;

    if-eqz p1, :cond_4

    invoke-interface {p1}, La13/c;->onPermissionRequested()V

    :cond_4
    return-void
.end method

.method public final onPushMessage(Lio/getstream/chat/android/models/PushMessage;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->onNewPushMessage:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final showNotification(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V
    .locals 5

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[showNotification] notification: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationHandler;->showNotificationInternal(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)V

    return-void
.end method
