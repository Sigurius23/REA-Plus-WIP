.class public final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeMessagesListState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeMessagesListState$$inlined$flatMapLatest$1"
    f = "MessageListController.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V
    .locals 0

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v0, p3, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/channel/state/ChannelState;

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v5

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessagesState()Lec3/f2;

    move-result-object v6

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getReads()Lec3/f2;

    move-result-object v7

    iget-object v8, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v8}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_showSystemMessagesState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v8

    iget-object v9, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v9}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_dateSeparatorHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v9

    iget-object v10, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageFooterVisibilityState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v10

    iget-object v11, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v11}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messagePositionHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v11

    iget-object v12, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v12}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getTypingUsers()Lec3/f2;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v13}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v13

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfNewerMessages()Lec3/f2;

    move-result-object v14

    iget-object v15, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUnreadLabelState()Lec3/p1;

    move-result-object v15

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v16

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getEndOfOlderMessages()Lec3/f2;

    move-result-object v4

    move/from16 v17, v3

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getOriginalTranslationsStore(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->getOriginalTextMessageIds()Lec3/f2;

    move-result-object v3

    move-object/from16 p1, v3

    const/16 v3, 0xd

    new-array v3, v3, [Lec3/l;

    const/16 v18, 0x0

    aput-object v6, v3, v18

    aput-object v7, v3, v17

    const/4 v6, 0x2

    aput-object v8, v3, v6

    const/4 v6, 0x3

    aput-object v9, v3, v6

    const/4 v6, 0x4

    aput-object v10, v3, v6

    const/4 v6, 0x5

    aput-object v11, v3, v6

    const/4 v6, 0x6

    aput-object v12, v3, v6

    const/4 v6, 0x7

    aput-object v13, v3, v6

    const/16 v6, 0x8

    aput-object v14, v3, v6

    const/16 v6, 0x9

    aput-object v15, v3, v6

    const/16 v6, 0xa

    aput-object v16, v3, v6

    const/16 v6, 0xb

    aput-object v4, v3, v6

    const/16 v4, 0xc

    aput-object p1, v3, v4

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v4, v3, v6, v5}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$lambda$11$$inlined$combine$1;-><init>([Lec3/l;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Channel;)V

    invoke-static {v4}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object v3

    const/4 v4, 0x0

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    move/from16 v4, v17

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeMessagesListState$$inlined$flatMapLatest$1;->label:I

    invoke-static {v2, v3, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
