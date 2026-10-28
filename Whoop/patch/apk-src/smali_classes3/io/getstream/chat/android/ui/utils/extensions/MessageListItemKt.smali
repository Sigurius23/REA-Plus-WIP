.class public final Lio/getstream/chat/android/ui/utils/extensions/MessageListItemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toUiMessageListItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
        "stream-chat-android-ui-components_release"
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
.method public static final toUiMessageListItem(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    if-eqz v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/DateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;-><init>(Ljava/util/Date;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;

    if-eqz v0, :cond_1

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/SystemMessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;

    if-eqz v0, :cond_2

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ModeratedMessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    const/16 v11, 0x1fe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    if-eqz v0, :cond_3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;->getDate()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/ThreadDateSeparatorItemState;->getReplyCount()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;-><init>(Ljava/util/Date;I)V

    return-object v0

    :cond_3
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    if-eqz v0, :cond_4

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;->getTypingUsers()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_4
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v0, :cond_5

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getGroupPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMine()Z

    move-result v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessageReadBy()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isInThread()Z

    move-result v6

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageRead()Z

    move-result v7

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->isMessageDelivered()Z

    move-result v8

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getShowMessageFooter()Z

    move-result v9

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getShowOriginalText()Z

    move-result v10

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZLjava/util/List;ZZZZZ)V

    return-object v1

    :cond_5
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/EmptyThreadPlaceholderItemState;

    if-eqz v0, :cond_6

    sget-object p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadPlaceholderItem;

    return-object p0

    :cond_6
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    if-eqz v0, :cond_7

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/UnreadSeparatorItemState;->getUnreadCount()I

    move-result p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;-><init>(I)V

    return-object v0

    :cond_7
    instance-of v0, p0, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    if-eqz v0, :cond_8

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/StartOfTheChannelItemState;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$StartOfTheChannelItem;-><init>(Lio/getstream/chat/android/models/Channel;)V

    return-object v0

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
