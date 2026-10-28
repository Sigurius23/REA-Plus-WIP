.class public final Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008*\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u001a2\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\r2\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u001ab\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u000f\u001a\u000c\u0010\u0019\u001a\u00020\u0006*\u00020\u0002H\u0002\u001a(\u0010\u001a\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u001a\u0016\u0010\u001b\u001a\u00020\u0006*\u00020\u00022\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u001c"
    }
    d2 = {
        "initials",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "getInitials",
        "(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;",
        "isDirectMessaging",
        "",
        "getPreviewMessage",
        "Lio/getstream/chat/android/models/Message;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "getDisplayName",
        "context",
        "Landroid/content/Context;",
        "fallback",
        "",
        "maxMembers",
        "getMembersStatusText",
        "countCurrentUserAsOnlineMember",
        "countOtherUsersAsOnlineMembers",
        "userOnlineResId",
        "userLastSeenJustNowResId",
        "userLastSeenResId",
        "memberCountResId",
        "memberCountWithOnlineResId",
        "includesCurrentUser",
        "nameFromMembers",
        "isOneToOne",
        "stream-chat-android-ui-common_release"
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
.method public static synthetic a(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getPreviewMessage$lambda$0(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getPreviewMessage$lambda$1(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getPreviewMessage$lambda$3(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getPreviewMessage$lambda$2(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lio/getstream/chat/android/models/User;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->nameFromMembers$lambda$9(Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final getDisplayName(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;II)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0, p1, p2, p4}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->nameFromMembers(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "getString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object p0

    :cond_2
    return-object v0
.end method

.method public static synthetic getDisplayName$default(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;IIILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p2

    invoke-interface {p2}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p2

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x2

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getDisplayName(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getInitials(Lio/getstream/chat/android/models/Channel;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/StringKt;->initials(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getMembersStatusText(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;ZZIIIII)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isOneToOne(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    if-eqz p4, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/models/Member;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p4

    invoke-virtual {p4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p4

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p8

    goto :goto_0

    :cond_1
    move-object p8, v1

    :goto_0
    invoke-static {p4, p8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-static {p0, p1, p5, p6, p7}, Lio/getstream/chat/android/ui/common/utils/extensions/UserKt;->getLastSeenText(Lio/getstream/chat/android/models/User;Landroid/content/Context;III)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Collection contains no element matching the predicate."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    const-string p0, ""

    return-object p0

    :cond_4
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result p6

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result p7

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p7

    filled-new-array {p7}, [Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p5, p8, p6, p7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    const-string p6, "getQuantityString(...)"

    invoke-static {p5, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of p6, p0, Ljava/util/Collection;

    const/4 p7, 0x0

    if-eqz p6, :cond_5

    move-object p6, p0

    check-cast p6, Ljava/util/Collection;

    invoke-interface {p6}, Ljava/util/Collection;->isEmpty()Z

    move-result p6

    if-eqz p6, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move p6, p7

    :cond_6
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p8

    if-eqz p8, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p8

    check-cast p8, Lio/getstream/chat/android/models/Member;

    invoke-virtual {p8}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getOnline()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p8}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p8

    invoke-virtual {p8}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p8

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_7
    move-object v0, v1

    :goto_2
    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p8

    if-eqz p8, :cond_8

    move p8, p3

    goto :goto_3

    :cond_8
    move p8, p4

    :goto_3
    if-eqz p8, :cond_9

    const/4 p8, 0x1

    goto :goto_4

    :cond_9
    move p8, p7

    :goto_4
    if-eqz p8, :cond_6

    add-int/lit8 p6, p6, 0x1

    if-ltz p6, :cond_a

    goto :goto_1

    :cond_a
    invoke-static {}, Lwb3/f;->c0()V

    throw v1

    :cond_b
    move p7, p6

    :goto_5
    if-lez p7, :cond_c

    invoke-static {p7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p5, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p9, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0

    :cond_c
    return-object p5
.end method

.method public static synthetic getMembersStatusText$default(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;ZZIIIIIILjava/lang/Object;)Ljava/lang/String;
    .locals 1

    and-int/lit8 p11, p10, 0x4

    const/4 v0, 0x1

    if-eqz p11, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p10, p10, 0x8

    if-eqz p10, :cond_1

    move p4, v0

    :cond_1
    invoke-static/range {p0 .. p9}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->getMembersStatusText(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;ZZIIIII)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getPreviewMessage(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/PendingMessage;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->isInsideSearch()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getCachedLatestMessages()Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p0

    :goto_1
    check-cast p0, Ljava/util/Collection;

    invoke-static {v0}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p0, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {p0, v0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    new-instance v2, Lxb3/f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    new-instance p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;-><init>(Lio/getstream/chat/android/models/User;I)V

    invoke-static {v2, p0}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-static {p0, p1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p0

    new-instance p1, Lxb3/e;

    invoke-direct {p1, p0}, Lxb3/e;-><init>(Lxb3/f;)V

    invoke-virtual {p1}, Lxb3/e;->hasNext()Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lxb3/e;->hasNext()Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    move-object p0, v1

    check-cast p0, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v0

    invoke-static {p0, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p0

    :cond_4
    invoke-virtual {p1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v3

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_5

    move-object v1, v0

    move-object p0, v2

    :cond_5
    invoke-virtual {p1}, Lxb3/e;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    :goto_2
    check-cast v1, Lio/getstream/chat/android/models/Message;

    return-object v1
.end method

.method private static final getPreviewMessage$lambda$0(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final getPreviewMessage$lambda$1(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final getPreviewMessage$lambda$2(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final getPreviewMessage$lambda$3(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isRegular(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isSystem(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final includesCurrentUser(Lio/getstream/chat/android/models/Channel;)Z
    .locals 2

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->includesCurrentUser(Lio/getstream/chat/android/models/Channel;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isOneToOne(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Z
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "!members"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v2
.end method

.method private static final nameFromMembers(Lio/getstream/chat/android/models/Channel;Landroid/content/Context;Lio/getstream/chat/android/models/User;I)Ljava/lang/String;
    .locals 6

    invoke-static {p0, p2}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getUsersExcludingCurrent(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p2, 0x1a

    invoke-direct {v4, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    const/16 v5, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    sub-int/2addr p0, p3

    if-gtz p0, :cond_0

    return-object p2

    :cond_0
    sget p3, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_channel_list_untitled_channel_plus_more:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p3, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/Member;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final nameFromMembers$lambda$9(Lio/getstream/chat/android/models/User;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
