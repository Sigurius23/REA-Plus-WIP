.class public final Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t*\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\t*\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\u00022\u0010\u0008\u0002\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u001a\u001c\u0010\u0013\u001a\u00020\u0002*\u00020\u00022\u0010\u0008\u0002\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012\u001a\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\n\u0010\u0016\u001a\u00060\u0011j\u0002`\u0012H\u0000\u001a\u0018\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\t*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0018\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00150\t*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "isAnonymousChannel",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "isPinned",
        "isArchive",
        "isMutedFor",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "getUsersExcludingCurrent",
        "",
        "currentUser",
        "getMembersExcludingCurrent",
        "Lio/getstream/chat/android/models/Member;",
        "countUnreadMentionsForUser",
        "",
        "currentUserUnreadCount",
        "currentUserId",
        "",
        "Lio/getstream/chat/android/models/UserId;",
        "syncUnreadCountWithReads",
        "userRead",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "userId",
        "readsOf",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "deliveredReadsOf",
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
.method public static final countUnreadMentionsForUser(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)I
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->userRead(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-static {v4, v0}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->wasCreatedAfter(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move-object p0, v2

    :goto_2
    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    return v2

    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->containsUserMention(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result v0

    if-eqz v0, :cond_5

    add-int/lit8 v2, v2, 0x1

    if-ltz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {}, Lwb3/f;->c0()V

    throw v1

    :cond_7
    return v2
.end method

.method public static final currentUserUnreadCount(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->userRead(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic currentUserUnreadCount$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->currentUserUnreadCount(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final deliveredReadsOf(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v2

    :cond_1
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v3

    invoke-static {p1, v3}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static final getMembersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic getMembersExcludingCurrent$default(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getMembersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final getUsersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getMembersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p0

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public static synthetic getUsersExcludingCurrent$default(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getUsersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final isAnonymousChannel(Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->isAnonymousChannelId(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final isArchive(Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Member;->getArchivedAt()Ljava/util/Date;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final isMutedFor(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelMute;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelMute;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_3
    return v1
.end method

.method public static final isPinned(Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Member;->getPinnedAt()Ljava/util/Date;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final readsOf(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v2

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v3

    invoke-static {p1, v3}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v2

    if-ltz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static final syncUnreadCountWithReads(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
    .locals 40

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->currentUserUnreadCount(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)I

    move-result v19

    const/16 v38, 0x7

    const/16 v39, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

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

    const v37, -0x20001

    invoke-static/range {v1 .. v39}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic syncUnreadCountWithReads$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    invoke-static {p0, p1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->syncUnreadCountWithReads(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object p0

    return-object p0
.end method

.method public static final userRead(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;)Lio/getstream/chat/android/models/ChannelUserRead;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lio/getstream/chat/android/models/ChannelUserRead;

    return-object v0
.end method
