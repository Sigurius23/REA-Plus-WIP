.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Lq83/d;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 2
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v1

    .line 3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    .line 4
    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 5
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    .line 6
    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    .line 7
    instance-of v4, v4, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    instance-of v1, v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v1, :cond_2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    goto :goto_2

    :cond_3
    move-object v1, v3

    .line 8
    :goto_2
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    .line 9
    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getLastLoadedThreadMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/models/Message;

    move-result-object v4

    .line 10
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v5

    .line 11
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v5, v6}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v5

    .line 12
    :cond_4
    invoke-interface {v5}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 13
    invoke-interface {v5}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v6

    .line 14
    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    .line 15
    instance-of v7, v7, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_5
    move-object v6, v3

    .line 16
    :goto_3
    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;

    .line 17
    invoke-static {v2, v1, v4, v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getNewMessageState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/common/state/messages/list/TypingItemState;)Lio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;

    move-result-object v17

    .line 18
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_threadListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v2

    const/16 v20, 0xdff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v7, p1

    invoke-static/range {v7 .. v21}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v4

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-virtual {v2, v3, v4}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz v17, :cond_6

    .line 20
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v2, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$setLastLoadedThreadMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;)V

    .line 21
    :cond_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;->emit(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
