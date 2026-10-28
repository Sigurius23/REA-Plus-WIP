.class public final Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
        "",
        "messageId",
        "channelId",
        "channelType",
        "Ll83/a0;",
        "markAsRead",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "type",
        "",
        "messageChars",
        "replyText",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V",
        "cancelNotification",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private static final ACTION_DISMISS:Ljava/lang/String; = "io.getstream.chat.android.DISMISS"

.field private static final ACTION_READ:Ljava/lang/String; = "io.getstream.chat.android.READ"

.field private static final ACTION_REPLY:Ljava/lang/String; = "io.getstream.chat.android.REPLY"

.field public static final Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

.field private static final IMMUTABLE_PENDING_INTENT_FLAGS:I

.field private static final KEY_CHANNEL_ID:Ljava/lang/String; = "id"

.field private static final KEY_CHANNEL_TYPE:Ljava/lang/String; = "type"

.field private static final KEY_MESSAGE_ID:Ljava/lang/String; = "message_id"

.field private static final KEY_TEXT_REPLY:Ljava/lang/String; = "text_reply"

.field private static final MUTABLE_PENDING_INTENT_FLAGS:I


# instance fields
.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->Companion:Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver$Companion;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/high16 v1, 0xc000000

    sput v1, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->IMMUTABLE_PENDING_INTENT_FLAGS:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0xa000000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x8000000

    :goto_0
    sput v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->MUTABLE_PENDING_INTENT_FLAGS:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const-string v0, "NotificationMessageReceiver"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getIMMUTABLE_PENDING_INTENT_FLAGS$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->IMMUTABLE_PENDING_INTENT_FLAGS:I

    return v0
.end method

.method public static final synthetic access$getMUTABLE_PENDING_INTENT_FLAGS$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->MUTABLE_PENDING_INTENT_FLAGS:I

    return v0
.end method

.method private final cancelNotification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[cancelNotification] ChatClient is not initialized, returning."

    const/4 v2, 0x0

    invoke-interface {p1, v1, v0, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/ChatClient;->dismissChannelNotifications(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final markAsRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v0, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[markAsRead] ChatClient is not initialized, returning."

    const/4 v1, 0x0

    invoke-interface {p1, v0, p3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0, p3, p2, p1}, Lio/getstream/chat/android/client/ChatClient;->markMessageRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    check-cast p1, Lo23/k;

    invoke-virtual {p1}, Lo23/k;->enqueue()V

    return-void
.end method

.method private final replyText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 58

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-direct/range {p0 .. p0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[replyText] ChatClient is not initialized, returning."

    const/4 v4, 0x0

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Ll83/k;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct {v0, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object v8

    new-instance v6, Lio/getstream/chat/android/models/Message;

    const v56, 0xffff

    const/16 v57, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, -0x7

    invoke-direct/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x8

    const/4 v9, 0x0

    move-object v7, v1

    move-object v8, v6

    move-object v6, v2

    invoke-static/range {v5 .. v11}, Lio/getstream/chat/android/client/ChatClient;->sendMessage$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)Lo23/d;

    move-result-object v0

    invoke-interface {v0}, Lo23/d;->enqueue()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "type"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x42eb932b

    if-eq v2, v3, :cond_3

    const v3, 0x58ae122b

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "io.getstream.chat.android.READ"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "message_id"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-direct {p0, p2, v0, p1}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->markAsRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    const-string v2, "io.getstream.chat.android.REPLY"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {p2}, Landroidx/core/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_5

    const-string v1, "text_reply"

    invoke-virtual {p2, v1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->replyText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;)V

    :cond_5
    :goto_1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/receivers/NotificationMessageReceiver;->cancelNotification(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
