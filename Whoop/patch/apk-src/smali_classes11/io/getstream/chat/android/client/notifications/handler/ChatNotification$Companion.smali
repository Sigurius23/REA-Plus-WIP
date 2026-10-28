.class public final Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/notifications/handler/ChatNotification;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J=\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u00a2\u0006\u0002\u0008\u0012J0\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;",
        "",
        "<init>",
        "()V",
        "TYPE_MESSAGE_NEW",
        "",
        "TYPE_MESSAGE_UPDATED",
        "TYPE_REACTION_NEW",
        "TYPE_NOTIFICATION_REMINDER_DUE",
        "create",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;",
        "type",
        "payload",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "create$stream_chat_android_client_release",
        "createReactionNewNotification",
        "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;",
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

.method private final createReactionNewNotification(Ljava/util/Map;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;"
        }
    .end annotation

    const-string v0, "title"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-nez v4, :cond_1

    return-object v2

    :cond_1
    const-string v0, "body"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/String;

    move-object v5, v0

    goto :goto_1

    :cond_2
    move-object v5, v2

    :goto_1
    if-nez v5, :cond_3

    return-object v2

    :cond_3
    const-string v0, "reaction_type"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/lang/String;

    move-object v6, v0

    goto :goto_2

    :cond_4
    move-object v6, v2

    :goto_2
    if-nez v6, :cond_5

    return-object v2

    :cond_5
    const-string v0, "reaction_user_id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_6

    check-cast v0, Ljava/lang/String;

    move-object v7, v0

    goto :goto_3

    :cond_6
    move-object v7, v2

    :goto_3
    if-nez v7, :cond_7

    return-object v2

    :cond_7
    const-string v0, "reaction_user_image"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_8

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    :cond_8
    move-object v8, v2

    new-instance v3, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    move-object v9, p2

    move-object v10, p3

    invoke-direct/range {v3 .. v10}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V

    return-object v3
.end method


# virtual methods
.method public final create$stream_chat_android_client_release(Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/notifications/handler/ChatNotification;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lio/getstream/chat/android/client/notifications/handler/ChatNotification;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "notification.reminder_due"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;

    invoke-direct {p1, p3, p4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$NotificationReminderDue;-><init>(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V

    return-object p1

    :sswitch_1
    const-string p2, "message.new"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;

    invoke-direct {p1, p3, p4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageNew;-><init>(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V

    return-object p1

    :sswitch_2
    const-string p2, "message.updated"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;

    invoke-direct {p1, p3, p4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$MessageUpdated;-><init>(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)V

    return-object p1

    :sswitch_3
    const-string v0, "reaction.new"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_3
    invoke-direct {p0, p2, p3, p4}, Lio/getstream/chat/android/client/notifications/handler/ChatNotification$Companion;->createReactionNewNotification(Ljava/util/Map;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/notifications/handler/ChatNotification$ReactionNew;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x6659cfa5 -> :sswitch_3
        -0x37b9062c -> :sswitch_2
        -0x341bc8c7 -> :sswitch_1
        -0x29d05b36 -> :sswitch_0
    .end sparse-switch
.end method
