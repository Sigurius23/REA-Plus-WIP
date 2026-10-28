.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->removeMessageFocus(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$removeMessageFocus$1"
    f = "MessageListController.kt"
    l = {
        0x5c3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $messageId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->$messageId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->$messageId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->label:I

    const-wide/16 v2, 0x7d0

    invoke-static {v2, v3, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getMessagesState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->$messageId:Ljava/lang/String;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v5, v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v5, :cond_3

    move-object v6, v3

    check-cast v6, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object v16, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFocusRemoved;

    const/16 v21, 0x3dff

    const/16 v22, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v6 .. v22}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZZZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;ZZLio/getstream/chat/android/ui/common/state/messages/list/MessageFocusState;Ljava/util/List;ZLjava/util/Set;ZILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    move-result-object v3

    :cond_3
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    const/16 v16, 0xffe

    const/16 v17, 0x0

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

    invoke-static/range {v3 .. v17}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$setMessageListState(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v2

    :goto_2
    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->$messageId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$removeMessageFocus$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$setRemoveFocusedMessageJob$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ll83/k;)V

    :cond_6
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
