.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;",
        "",
        "<init>",
        "()V",
        "calculateUnreadLabel",
        "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
        "channelUserRead",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "messages",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "currentUserId",
        "",
        "shouldShowButton",
        "",
        "calculateStandardUnreadLabel",
        "unreadMessages",
        "calculateUnreadLabelWithOwnMessagesFirst",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final calculateStandardUnreadLabel(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;Z)",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_6

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result p1

    if-eqz p3, :cond_5

    check-cast p2, Ljava/lang/Iterable;

    instance-of p3, p2, Ljava/util/Collection;

    if-eqz p3, :cond_3

    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/models/Message;

    invoke-static {p3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result p3

    if-nez p3, :cond_4

    const/4 p2, 0x1

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p2, 0x0

    :goto_4
    new-instance p3, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-direct {p3, p1, v0, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;-><init>(ILjava/lang/String;Z)V

    return-object p3

    :cond_6
    return-object v1
.end method

.method private final calculateUnreadLabelWithOwnMessagesFirst(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_1
    const/4 p3, 0x1

    if-lez v3, :cond_3

    sub-int/2addr v3, p3

    goto :goto_2

    :cond_3
    move v3, v5

    :goto_2
    if-eq v3, v5, :cond_4

    invoke-static {v3, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    if-eqz v0, :cond_8

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result p1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz p4, :cond_7

    check-cast p2, Ljava/lang/Iterable;

    instance-of p4, p2, Ljava/util/Collection;

    if-eqz p4, :cond_5

    move-object p4, p2

    check-cast p4, Ljava/util/Collection;

    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-eqz p4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lio/getstream/chat/android/models/Message;

    invoke-static {p4}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result p4

    if-nez p4, :cond_6

    move v2, p3

    :cond_7
    :goto_4
    new-instance p2, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-direct {p2, p1, v0, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;-><init>(ILjava/lang/String;Z)V

    return-object p2

    :cond_8
    return-object v1
.end method


# virtual methods
.method public final calculateUnreadLabel(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/lang/String;",
            "Z)",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;"
        }
    .end annotation

    const-string v0, "channelUserRead"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messages"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_0
    move-object v2, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    check-cast v2, Ljava/util/Collection;

    invoke-static {v3, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_3
    move-object v0, v1

    :goto_2
    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_8

    move-object p2, v2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_7

    move-object p2, v2

    check-cast p2, Ljava/lang/Iterable;

    instance-of v0, p2, Ljava/util/Collection;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_6
    :goto_3
    return-object v1

    :cond_7
    :goto_4
    invoke-direct {p0, p1, v2, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;->calculateStandardUnreadLabel(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move v4, v3

    goto :goto_5

    :cond_9
    move v4, v1

    :goto_5
    if-eqz v4, :cond_a

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p2

    if-ne p2, v3, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    move v1, v3

    :cond_a
    if-eqz v4, :cond_c

    if-eqz v1, :cond_b

    goto :goto_6

    :cond_b
    invoke-direct {p0, p1, v2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;->calculateUnreadLabelWithOwnMessagesFirst(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_6
    invoke-direct {p0, p1, v2, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;->calculateStandardUnreadLabel(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object p1

    return-object p1
.end method
