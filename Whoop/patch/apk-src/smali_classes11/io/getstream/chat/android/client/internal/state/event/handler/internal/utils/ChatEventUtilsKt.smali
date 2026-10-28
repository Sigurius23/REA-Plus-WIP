.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0008H\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\tH\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\nH\u0000\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u000bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u000c"
    }
    d2 = {
        "realType",
        "",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "getRealType",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;",
        "toChannelUserRead",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "Lio/getstream/chat/android/client/events/MessageReadEvent;",
        "Lio/getstream/chat/android/client/events/MessageDeliveredEvent;",
        "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;",
        "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;",
        "Lio/getstream/chat/android/client/events/MarkAllReadEvent;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getRealType(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/client/events/ConnectedEvent;

    if-eqz v0, :cond_0

    const-string p0, "connection.connected"

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/ChatEvent;->getType()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final toChannelUserRead(Lio/getstream/chat/android/client/events/MarkAllReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MarkAllReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 23
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MarkAllReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 24
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MarkAllReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 25
    new-instance v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toChannelUserRead(Lio/getstream/chat/android/client/events/MessageDeliveredEvent;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 8
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v7

    .line 9
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v5

    .line 11
    new-instance v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toChannelUserRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 2
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 3
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 4
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v6

    .line 5
    new-instance v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 14
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 15
    new-instance v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 18
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getLastReadMessageAt()Ljava/util/Date;

    move-result-object v5

    .line 19
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getUnreadMessages()I

    move-result v4

    .line 20
    invoke-virtual {p0}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v6

    .line 21
    new-instance v1, Lio/getstream/chat/android/models/ChannelUserRead;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
