.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0003"
    }
    d2 = {
        "stringify",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
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
.method public static final stringify(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;)Ljava/lang/String;
    .locals 4
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    const-string v1, ")"

    if-eqz v0, :cond_0

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine()Z

    move-result p0

    const-string v2, "MessageItemState(message.text: "

    const-string v3, ", isMine: "

    invoke-static {v2, v0, v3, v1, p0}, Lnh3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    if-eqz v0, :cond_1

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "DateSeparatorItemState(date: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    if-eqz v0, :cond_2

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;->getReplyCount()I

    move-result p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ThreadDateSeparatorItemState(date: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", replyCount: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;

    if-eqz v0, :cond_3

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p0

    const-string v0, "SystemMessageItemState(message.text: "

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;

    if-eqz v0, :cond_4

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ModeratedMessageItemState(message.text: "

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    if-eqz v0, :cond_5

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;->getTypingUsers()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    const-string v0, "TypingItemState(typingUsers.size: "

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    if-eqz v0, :cond_6

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;->getUnreadCount()I

    move-result p0

    const-string v0, "UnreadSeparatorItemState(unreadCount: "

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    if-eqz v0, :cond_7

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StartOfTheChannelItemState(channel.name: "

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of p0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;

    if-eqz p0, :cond_8

    const-string p0, "EmptyThreadPlaceholderItemState"

    return-object p0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
