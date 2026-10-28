.class public final Lio/getstream/chat/android/ui/common/state/messages/list/MessageListStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a \u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\n\u0008\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u0002H\u0080\u0008\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "stringify",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "lastItemOrNull",
        "T",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
        "(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
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
.method public static final lastItemOrNull(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;",
            ">(",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
            ")TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v1

    :cond_0
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v1
.end method

.method public static final stringify(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Ljava/lang/String;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getNewMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfNewMessagesReached()Z

    move-result v2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfOldMessagesReached()Z

    move-result v3

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoading()Z

    move-result v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages()Z

    move-result v5

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages()Z

    move-result v6

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getParentMessageId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getUnreadCount()I

    move-result v9

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getUnreadLabel()Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object v10

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getSelectedMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;

    move-result-object p0

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "MessageListState(messageItems.size: "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", newMessageState: "

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", endOfNewMessagesReached: "

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", endOfOldMessagesReached: "

    const-string v1, ", isLoading: "

    invoke-static {v11, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", isLoadingNewerMessages: "

    const-string v1, ", isLoadingOlderMessages: "

    invoke-static {v11, v4, v0, v5, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", currentUser.id: "

    const-string v1, ", parentMessageId: "

    invoke-static {v11, v6, v0, v7, v1}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", unreadCount: "

    const-string v1, ", unreadLabel: "

    invoke-static {v9, v8, v0, v1, v11}, Ld;->x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedMessageState: "

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v11, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
