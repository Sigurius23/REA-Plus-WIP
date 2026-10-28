.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


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
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Z)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1$2"
    f = "MessageListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic Z$0:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->Z$0:Z

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->invoke(ZLq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->Z$0:Z

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->label:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_threadListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v16

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_threadListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    if-eqz v4, :cond_0

    const/4 v2, 0x0

    :goto_0
    move v7, v2

    goto :goto_1

    :cond_0
    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_threadListState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v2

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->isLoadingOlderMessages()Z

    move-result v2

    goto :goto_0

    :goto_1
    const/16 v14, 0xfdb

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v1 .. v15}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;Ljava/util/List;ZZZZZLio/getstream/chat/android/models/User;Ljava/lang/String;ILio/getstream/chat/android/ui/common/state/messages/list/NewMessageState;Lio/getstream/chat/android/ui/common/state/messages/list/SelectedMessageState;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;

    move-result-object v1

    move-object/from16 v2, v16

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
