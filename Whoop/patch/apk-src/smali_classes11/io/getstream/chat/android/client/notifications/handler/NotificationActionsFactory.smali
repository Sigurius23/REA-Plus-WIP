.class public final Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012JF\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0003\u0010\u000e\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J \u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;",
        "",
        "<init>",
        "()V",
        "createMarkReadAction",
        "Landroidx/core/app/NotificationCompat$Action;",
        "context",
        "Landroid/content/Context;",
        "notificationId",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "icon",
        "title",
        "",
        "pendingIntent",
        "Landroid/app/PendingIntent;",
        "createReplyAction",
        "hint",
        "createMarkReadPendingIntent",
        "createReplyPendingIntent",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->INSTANCE:Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createMarkReadAction$default(Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;
    .locals 8

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const p5, 0x1080057

    :cond_0
    move v5, p5

    and-int/lit8 p5, p8, 0x20

    if-eqz p5, :cond_1

    sget p5, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_read:I

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p6

    const-string p5, "getString(...)"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v6, p6

    and-int/lit8 p5, p8, 0x40

    if-eqz p5, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p5, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    invoke-virtual {p5, p1, p2, p3, p4}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createMarkReadPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object p7

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->createMarkReadAction(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    return-object p0
.end method

.method private final createMarkReadPendingIntent(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    invoke-virtual {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createMarkReadPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public static createReplyAction$default(Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;
    .locals 8

    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_0

    const p4, 0x1080050

    :cond_0
    move v4, p4

    and-int/lit8 p4, p8, 0x10

    const-string v0, "getString(...)"

    if-eqz p4, :cond_1

    sget p4, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_reply:I

    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p8, 0x20

    if-eqz p4, :cond_2

    sget p4, Lio/getstream/chat/android/client/R$string;->stream_chat_notification_type_hint:I

    invoke-virtual {p1, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p6

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object v6, p6

    and-int/lit8 p4, p8, 0x40

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p4, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    invoke-virtual {p4, p1, p2, p3}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createReplyPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;

    move-result-object p7

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/notifications/handler/NotificationActionsFactory;->createReplyAction(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    return-object p0
.end method

.method private final createReplyPendingIntent(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    invoke-virtual {v0, p1, p2, p3}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createReplyPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final createMarkReadAction(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingIntent"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createMarkReadAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    return-object p1
.end method

.method public final createReplyAction(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hint"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingIntent"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createReplyAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    return-object p1
.end method
