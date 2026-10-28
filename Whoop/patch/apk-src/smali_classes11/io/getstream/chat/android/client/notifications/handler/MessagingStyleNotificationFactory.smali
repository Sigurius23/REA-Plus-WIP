.class public final Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u00b9\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\n\u0012\u001a\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n\u0012$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140\u0012\u0012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\n\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\u0008\u0002\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J/\u0010(\u001a\n \'*\u0004\u0018\u00010&0&2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000c2\u0006\u0010%\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u0019\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010 \u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008+\u0010,J \u0010.\u001a\u00020*2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008.\u0010/J&\u00101\u001a\u000200*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010-\u001a\u0004\u0018\u00010\u000fH\u0082@\u00a2\u0006\u0004\u00081\u00102J\u001c\u00104\u001a\u000203*\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u00084\u00105J\u001c\u00106\u001a\u000203*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u00086\u00107J\u001b\u00108\u001a\u00020\u0006*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008:\u0010\"J\u001a\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010 \u001a\u00020\u0018H\u0080@\u00a2\u0006\u0004\u0008=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010BR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010CR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010DR(\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010DR2\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010ER&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010DR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010FR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010GR\u0018\u0010K\u001a\u00020H*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010J\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroid/app/NotificationManager;",
        "notificationManager",
        "",
        "notificationChannelId",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "userIconBuilder",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Channel;",
        "Landroid/content/Intent;",
        "newMessageIntent",
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
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "notificationIdFactory",
        "Lkotlin/Function0;",
        "currentUserProvider",
        "<init>",
        "(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;)V",
        "notification",
        "createDefaultNotificationId",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I",
        "notificationId",
        "channel",
        "message",
        "Landroid/app/PendingIntent;",
        "kotlin.jvm.PlatformType",
        "createContentIntent",
        "(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;",
        "Landroidx/core/app/NotificationCompat$MessagingStyle;",
        "restoreMessagingStyle",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$MessagingStyle;",
        "currentUser",
        "createMessagingStyle",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;",
        "Landroidx/core/app/NotificationCompat$MessagingStyle$Message;",
        "toMessagingStyleMessage",
        "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Landroidx/core/app/Person;",
        "person",
        "(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;",
        "toPerson",
        "(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;",
        "personName",
        "(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;",
        "createNotificationId$stream_chat_android_client_release",
        "createNotificationId",
        "Landroid/app/Notification;",
        "createNotification$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)Ljava/lang/Object;",
        "createNotification",
        "Landroid/content/Context;",
        "Landroid/app/NotificationManager;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
        "Lc93/m;",
        "Lkotlin/jvm/functions/Function3;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
        "Lc93/a;",
        "",
        "getTimestamp",
        "(Lio/getstream/chat/android/models/Message;)J",
        "timestamp",
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
.field private final actionsProvider:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;

.field private final currentUserProvider:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final newMessageIntent:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final notificationBuilderTransformer:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final notificationChannelId:Ljava/lang/String;

.field private final notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

.field private final notificationManager:Landroid/app/NotificationManager;

.field private final notificationTextFormatter:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/NotificationManager;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;",
            "Lc93/m;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/m;",
            "Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationChannelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userIconBuilder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newMessageIntent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationTextFormatter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionsProvider"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationBuilderTransformer"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUserProvider"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationManager:Landroid/app/NotificationManager;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationChannelId:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->newMessageIntent:Lc93/m;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationTextFormatter:Lc93/m;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->actionsProvider:Lkotlin/jvm/functions/Function3;

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationBuilderTransformer:Lc93/m;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->currentUserProvider:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    .line 12
    new-instance v0, Lio/getstream/chat/android/client/k;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    move-object v12, v0

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    goto :goto_1

    :cond_0
    move-object/from16 v12, p10

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;-><init>(Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()Lio/getstream/chat/android/models/User;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getStoredUser$stream_chat_android_client_release()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v1
.end method

.method public static synthetic a()Lio/getstream/chat/android/models/User;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->_init_$lambda$0()Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$createMessagingStyle(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createMessagingStyle(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$person(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->person(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toMessagingStyleMessage(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toMessagingStyleMessage(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPerson(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toPerson(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createContentIntent(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->newMessageIntent:Lc93/m;

    invoke-interface {v1, p3, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/content/Intent;

    const/high16 p3, 0xc000000

    invoke-static {v0, p1, p2, p3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method private final createDefaultNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I
    .locals 4

    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    const-string v1, ":"

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getReactionUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getType()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    return p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final createMessagingStyle(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Landroidx/core/app/NotificationCompat$MessagingStyle;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;

    iget v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    iget-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createMessagingStyle$1;->label:I

    invoke-direct {p0, p1, p3, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toPerson(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Landroidx/core/app/Person;

    new-instance p1, Landroidx/core/app/NotificationCompat$MessagingStyle;

    invoke-direct {p1, p3}, Landroidx/core/app/NotificationCompat$MessagingStyle;-><init>(Landroidx/core/app/Person;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$MessagingStyle;->setConversationTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    xor-int/2addr p2, v3

    invoke-virtual {p1, p2}, Landroidx/core/app/NotificationCompat$MessagingStyle;->setGroupConversation(Z)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object p1

    const-string p2, "setGroupConversation(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final getTimestamp(Lio/getstream/chat/android/models/Message;)J
    .locals 2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0
.end method

.method private final person(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Landroidx/core/app/Person;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toPerson(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final personName(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    sget p1, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_empty_username:I

    invoke-virtual {p2, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p1
.end method

.method private final restoreMessagingStyle(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$MessagingStyle;
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationManager:Landroid/app/NotificationManager;

    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    move-result-object v0

    const-string v1, "getActiveNotifications(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    invoke-virtual {v4}, Landroid/service/notification/StatusBarNotification;->getId()I

    move-result v5

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createNotificationId$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v6

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroidx/core/app/NotificationCompat$MessagingStyle;->extractMessagingStyleFromNotification(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v3
.end method

.method private final toMessagingStyleMessage(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Landroid/content/Context;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Landroidx/core/app/NotificationCompat$MessagingStyle$Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->J$0:J

    iget-object p3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$3:Ljava/lang/Object;

    check-cast p3, Ljava/lang/CharSequence;

    iget-object v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$1:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-object v0, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationTextFormatter:Lc93/m;

    invoke-interface {p4, p3, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/CharSequence;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->getTimestamp(Lio/getstream/chat/android/models/Message;)J

    move-result-wide v4

    const/4 p4, 0x0

    iput-object p4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$0:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$1:Ljava/lang/Object;

    iput-object p4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->L$3:Ljava/lang/Object;

    iput-wide v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->J$0:J

    iput v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toMessagingStyleMessage$1;->label:I

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toPerson(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-wide p1, v4

    :goto_1
    check-cast p4, Landroidx/core/app/Person;

    new-instance v0, Landroidx/core/app/NotificationCompat$MessagingStyle$Message;

    invoke-direct {v0, p3, p1, p2, p4}, Landroidx/core/app/NotificationCompat$MessagingStyle$Message;-><init>(Ljava/lang/CharSequence;JLandroidx/core/app/Person;)V

    return-object v0
.end method

.method private final toPerson(Lio/getstream/chat/android/models/User;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Landroidx/core/app/Person;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;

    iget v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$2:Ljava/lang/Object;

    check-cast p1, Landroidx/core/app/Person$Builder;

    iget-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$1:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    iget-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/User;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Landroidx/core/app/Person$Builder;

    invoke-direct {p3}, Landroidx/core/app/Person$Builder;-><init>()V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/core/app/Person$Builder;->setKey(Ljava/lang/String;)Landroidx/core/app/Person$Builder;

    move-result-object p3

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->personName(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/core/app/Person$Builder;->setName(Ljava/lang/CharSequence;)Landroidx/core/app/Person$Builder;

    move-result-object p2

    iget-object p3, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->userIconBuilder:Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$toPerson$1;->label:I

    invoke-interface {p3, p1, v0}, Lio/getstream/chat/android/client/notifications/handler/UserIconBuilder;->buildIcon(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p2

    :goto_1
    check-cast p3, Landroidx/core/graphics/drawable/IconCompat;

    invoke-virtual {p1, p3}, Landroidx/core/app/Person$Builder;->setIcon(Landroidx/core/graphics/drawable/IconCompat;)Landroidx/core/app/Person$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/Person$Builder;->build()Landroidx/core/app/Person;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final createNotification$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
            "Lq83/d<",
            "-",
            "Landroid/app/Notification;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;

    iget v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;-><init>(Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iget-object v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$7:Ljava/lang/Object;

    check-cast v1, Landroidx/core/app/NotificationCompat$MessagingStyle;

    iget-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$6:Ljava/lang/Object;

    check-cast v2, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$5:Ljava/lang/Object;

    check-cast v3, Landroidx/core/app/NotificationCompat$MessagingStyle;

    iget-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    check-cast v5, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v0, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v0

    move-object v0, p2

    move-object p2, v11

    goto/16 :goto_a

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    iget-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    check-cast v5, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v2

    move v2, p1

    move-object p1, v8

    move-object v8, v5

    move-object v5, v11

    goto/16 :goto_6

    :cond_3
    iget p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iget-object v1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$7:Ljava/lang/Object;

    check-cast v1, Landroidx/core/app/NotificationCompat$MessagingStyle;

    iget-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$6:Ljava/lang/Object;

    check-cast v2, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$5:Ljava/lang/Object;

    check-cast v3, Landroidx/core/app/NotificationCompat$MessagingStyle;

    iget-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    check-cast v5, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v0, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v0

    move-object v0, p2

    move-object p2, v11

    goto/16 :goto_4

    :cond_4
    iget p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Message;

    iget-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    check-cast v4, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/User;

    iget-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/notifications/handler/ChatNotification;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v2

    move v2, p1

    move-object p1, v8

    move-object v8, v4

    move-object v4, v3

    move-object v3, v11

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->currentUserProvider:Lc93/a;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/User;

    if-nez p2, :cond_6

    return-object v7

    :cond_6
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createNotificationId$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result v2

    new-instance v8, Landroidx/core/app/NotificationCompat$Builder;

    iget-object v9, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    iget-object v10, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationChannelId:Ljava/lang/String;

    invoke-direct {v8, v9, v10}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget v9, Lio/getstream/chat/android/client/R$drawable;->stream_ic_notification:I

    invoke-virtual {v8, v9}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v8

    iget-object v9, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    sget v10, Lio/getstream/chat/android/client/R$color;->stream_ic_notification:I

    invoke-static {v9, v10}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v8, v9}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v8

    const-string v9, "setColor(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v9, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    if-eqz v9, :cond_b

    move-object v3, p1

    check-cast v3, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->restoreMessagingStyle(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object v9

    if-nez v9, :cond_8

    iput-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iput v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    invoke-direct {p0, p2, v4, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createMessagingStyle(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_7

    goto/16 :goto_9

    :cond_7
    move-object v11, v6

    move-object v6, p2

    move-object p2, v11

    :goto_1
    check-cast p2, Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-object v9, p2

    :goto_2
    move-object p2, p1

    move p1, v2

    goto :goto_3

    :cond_8
    move-object v6, p2

    goto :goto_2

    :goto_3
    invoke-direct {p0, p1, v4, v3}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createContentIntent(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    iget-object v10, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$5:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$7:Ljava/lang/Object;

    iput p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    invoke-direct {p0, v3, v10, v6, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toMessagingStyleMessage(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    goto/16 :goto_9

    :cond_9
    move-object v5, v8

    move-object v1, v9

    :goto_4
    check-cast v0, Landroidx/core/app/NotificationCompat$MessagingStyle$Message;

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$MessagingStyle;->addMessage(Landroidx/core/app/NotificationCompat$MessagingStyle$Message;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->actionsProvider:Lkotlin/jvm/functions/Function3;

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v1, v2, v4, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_5

    :cond_a
    move-object p1, p2

    move-object v8, v5

    goto/16 :goto_c

    :cond_b
    instance-of v5, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    if-eqz v5, :cond_f

    move-object v5, p1

    check-cast v5, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v6

    invoke-virtual {v5}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->restoreMessagingStyle(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object v9

    if-nez v9, :cond_d

    iput-object p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    invoke-direct {p0, p2, v6, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createMessagingStyle(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_c

    goto :goto_9

    :cond_c
    move-object v11, v6

    move-object v6, p2

    move-object p2, v4

    move-object v4, v11

    :goto_6
    check-cast p2, Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-object v9, p2

    :goto_7
    move-object p2, p1

    move p1, v2

    goto :goto_8

    :cond_d
    move-object v4, v6

    move-object v6, p2

    goto :goto_7

    :goto_8
    invoke-direct {p0, p1, v4, v5}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createContentIntent(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v2

    iget-object v10, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    iput-object p2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$5:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$6:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->L$7:Ljava/lang/Object;

    iput p1, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory$createNotification$1;->label:I

    invoke-direct {p0, v5, v10, v6, v0}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->toMessagingStyleMessage(Lio/getstream/chat/android/models/Message;Landroid/content/Context;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_e

    :goto_9
    return-object v1

    :cond_e
    move-object v3, v5

    move-object v5, v8

    move-object v1, v9

    :goto_a
    check-cast v0, Landroidx/core/app/NotificationCompat$MessagingStyle$Message;

    invoke-virtual {v1, v0}, Landroidx/core/app/NotificationCompat$MessagingStyle;->addMessage(Landroidx/core/app/NotificationCompat$MessagingStyle$Message;)Landroidx/core/app/NotificationCompat$MessagingStyle;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setStyle(Landroidx/core/app/NotificationCompat$Style;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->actionsProvider:Lkotlin/jvm/functions/Function3;

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v1, v2, v4, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/core/app/NotificationCompat$Action;

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->addAction(Landroidx/core/app/NotificationCompat$Action;)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_b

    :cond_f
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    if-eqz v0, :cond_10

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getBody()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-direct {p0, v2, v1, p2}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createContentIntent(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    goto :goto_c

    :cond_10
    instance-of v0, p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->context:Landroid/content/Context;

    sget v1, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_reminder_due_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationTextFormatter:Lc93/m;

    move-object v3, p1

    check-cast v3, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-interface {v1, p2, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {v0, p2}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    invoke-virtual {v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v3}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {p0, v2, v0, v1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createContentIntent(ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    :goto_c
    iget-object p2, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationBuilderTransformer:Lc93/m;

    invoke-interface {p2, v8, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/app/NotificationCompat$Builder;

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object p1

    return-object p1

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final createNotificationId$stream_chat_android_client_release(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I
    .locals 1

    const-string v0, "notification"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->notificationIdFactory:Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationIdFactory;->getNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/notifications/handler/MessagingStyleNotificationFactory;->createDefaultNotificationId(Lio/getstream/chat/android/client/notifications/handler/ChatNotification;)I

    move-result p1

    return p1
.end method
