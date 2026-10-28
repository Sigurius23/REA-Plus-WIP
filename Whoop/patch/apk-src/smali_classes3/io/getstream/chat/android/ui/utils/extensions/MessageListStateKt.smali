.class public final Lio/getstream/chat/android/ui/utils/extensions/MessageListStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "toMessageListItemWrapper",
        "Lio/getstream/chat/android/ui/model/MessageListItemWrapper;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
        "isInThread",
        "",
        "prevNewMessageState",
        "Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;",
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
.method public static final toMessageListItemWrapper(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;ZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;)Lio/getstream/chat/android/ui/model/MessageListItemWrapper;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/MessageListItemKt;->toUiMessageListItem(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingNewerMessages()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    :cond_2
    move-object v3, v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getNewMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x1

    xor-int/lit8 v4, p2, 0x1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getNewMessageState()Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v8

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    instance-of v2, v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$TypingItem;

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    :goto_2
    move v5, v0

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getEndOfNewMessagesReached()Z

    move-result v7

    new-instance v2, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    move v6, p1

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/ui/model/MessageListItemWrapper;-><init>(Ljava/util/List;ZZZZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;)V

    return-object v2
.end method

.method public static synthetic toMessageListItemWrapper$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;ZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;ILjava/lang/Object;)Lio/getstream/chat/android/ui/model/MessageListItemWrapper;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageListStateKt;->toMessageListItemWrapper(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;ZLio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;)Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    move-result-object p0

    return-object p0
.end method
