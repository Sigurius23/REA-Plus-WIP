.class public final Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\u0008\u0016J-\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u00a2\u0006\u0002\u0008\u001aJ%\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\u0008\u001cJK\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0008\u0008\u0003\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0002\u0010 \u001a\u00020\u00052\u0008\u0008\u0002\u0010!\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\u0008\"JM\u0010#\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0003\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0002\u0010 \u001a\u00020\u00052\u0008\u0008\u0002\u0010$\u001a\u00020\u00052\u0008\u0008\u0002\u0010!\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\u0008%J \u0010&\u001a\u00020\'2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;",
        "",
        "<init>",
        "()V",
        "ACTION_READ",
        "",
        "ACTION_REPLY",
        "ACTION_DISMISS",
        "KEY_MESSAGE_ID",
        "KEY_CHANNEL_ID",
        "KEY_CHANNEL_TYPE",
        "KEY_TEXT_REPLY",
        "IMMUTABLE_PENDING_INTENT_FLAGS",
        "",
        "MUTABLE_PENDING_INTENT_FLAGS",
        "createReplyPendingIntent",
        "Landroid/app/PendingIntent;",
        "context",
        "Landroid/content/Context;",
        "notificationId",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "createReplyPendingIntent$stream_chat_android_client_release",
        "createMarkReadPendingIntent",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "createMarkReadPendingIntent$stream_chat_android_client_release",
        "createDismissPendingIntent",
        "createDismissPendingIntent$stream_chat_android_client_release",
        "createMarkReadAction",
        "Landroidx/core/app/NotificationCompat$Action;",
        "icon",
        "title",
        "pendingIntent",
        "createMarkReadAction$stream_chat_android_client_release",
        "createReplyAction",
        "hint",
        "createReplyAction$stream_chat_android_client_release",
        "createNotifyIntent",
        "Landroid/content/Intent;",
        "action",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic createMarkReadAction$stream_chat_android_client_release$default(Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;
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

    invoke-virtual/range {p0 .. p4}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createMarkReadPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;

    move-result-object p5

    move-object v7, p5

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    goto :goto_1

    :cond_2
    move-object v7, p7

    goto :goto_0

    :goto_1
    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createMarkReadAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    return-object p0
.end method

.method private final createNotifyIntent(Landroid/content/Context;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p1, "id"

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "type"

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    return-object v0
.end method

.method public static synthetic createReplyAction$stream_chat_android_client_release$default(Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;ILjava/lang/Object;)Landroidx/core/app/NotificationCompat$Action;
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

    invoke-virtual/range {p0 .. p3}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createReplyPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;

    move-result-object p7

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createReplyAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final createDismissPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "io.getstream.chat.android.DISMISS"

    invoke-direct {p0, p1, p3, v0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createNotifyIntent(Landroid/content/Context;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    invoke-static {}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->access$getIMMUTABLE_PENDING_INTENT_FLAGS$cp()I

    move-result v0

    invoke-static {p1, p2, p3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getBroadcast(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final createMarkReadAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;
    .locals 0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channel"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "message"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "pendingIntent"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/core/app/NotificationCompat$Action$Builder;

    invoke-direct {p1, p5, p6, p7}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final createMarkReadPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "io.getstream.chat.android.READ"

    invoke-direct {p0, p1, p3, v0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createNotifyIntent(Landroid/content/Context;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    const-string v0, "message_id"

    invoke-virtual {p4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, v0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->access$getIMMUTABLE_PENDING_INTENT_FLAGS$cp()I

    move-result p4

    invoke-static {p1, p2, p3, p4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getBroadcast(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final createReplyAction$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;ILjava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Action;
    .locals 0

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channel"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hint"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "pendingIntent"

    invoke-static {p7, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/core/app/RemoteInput$Builder;

    const-string p2, "text_reply"

    invoke-direct {p1, p2}, Landroidx/core/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p6}, Landroidx/core/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroidx/core/app/RemoteInput$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/RemoteInput$Builder;->build()Landroidx/core/app/RemoteInput;

    move-result-object p1

    const-string p2, "build(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Landroidx/core/app/NotificationCompat$Action$Builder;

    invoke-direct {p3, p4, p5, p7}, Landroidx/core/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p1}, Landroidx/core/app/NotificationCompat$Action$Builder;->addRemoteInput(Landroidx/core/app/RemoteInput;)Landroidx/core/app/NotificationCompat$Action$Builder;

    move-result-object p1

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Landroidx/core/app/NotificationCompat$Action$Builder;->setAllowGeneratedReplies(Z)Landroidx/core/app/NotificationCompat$Action$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/app/NotificationCompat$Action$Builder;->build()Landroidx/core/app/NotificationCompat$Action;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final createReplyPendingIntent$stream_chat_android_client_release(Landroid/content/Context;ILio/getstream/chat/android/models/Channel;)Landroid/app/PendingIntent;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "io.getstream.chat.android.REPLY"

    invoke-direct {p0, p1, p3, v0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;->createNotifyIntent(Landroid/content/Context;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p3

    invoke-static {}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->access$getMUTABLE_PENDING_INTENT_FLAGS$cp()I

    move-result v0

    invoke-static {p1, p2, p3, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    const-string p2, "getBroadcast(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
