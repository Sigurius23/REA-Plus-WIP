.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeThreadMessagesState(Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;)V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeThreadMessagesState$1"
    f = "MessageListController.kt"
    l = {
        0x354
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $endOfOlderMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic $members:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic $messages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic $reads:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field final synthetic $threadId:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$endOfOlderMessages:Lec3/f2;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$messages:Lec3/f2;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$reads:Lec3/f2;

    iput-object p5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$members:Lec3/f2;

    iput-object p6, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$threadId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->invokeSuspend$lambda$2(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$2(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;)Ll83/a0;
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListState;->getMessageItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageListItemState;

    instance-of v2, v2, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    instance-of p1, v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    if-eqz p1, :cond_2

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageItemState;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    :cond_3
    invoke-static {p0, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$setLastLoadedThreadMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$endOfOlderMessages:Lec3/f2;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$messages:Lec3/f2;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$reads:Lec3/f2;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$members:Lec3/f2;

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$threadId:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUser()Lec3/f2;

    move-result-object v3

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$1;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v6, Lec3/j1;

    const/4 v8, 0x0

    invoke-direct {v6, v3, v5, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v6, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$endOfOlderMessages:Lec3/f2;

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v5, v6, v7}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$2;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    new-instance v6, Lec3/j1;

    invoke-direct {v6, v3, v5, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v6, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$messages:Lec3/f2;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$reads:Lec3/f2;

    iget-object v5, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v5}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_showSystemMessagesState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v5

    iget-object v6, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v6}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_threadDateSeparatorHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v6

    iget-object v9, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v9}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messageFooterVisibilityState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v9

    iget-object v10, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v10}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_messagePositionHandler$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v10

    iget-object v11, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v11}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getTypingUsers()Lec3/f2;

    move-result-object v11

    iget-object v12, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v12}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v12

    iget-object v13, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$members:Lec3/f2;

    iget-object v14, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v14}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getOwnCapabilities()Lec3/f2;

    move-result-object v14

    iget-object v15, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v15}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getOriginalTranslationsStore(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;

    move-result-object v15

    invoke-virtual {v15}, Lio/getstream/chat/android/ui/common/feature/messages/translations/MessageOriginalTranslationsStore;->getOriginalTextMessageIds()Lec3/f2;

    move-result-object v15

    move/from16 v16, v4

    const/16 v4, 0xb

    new-array v4, v4, [Lec3/l;

    aput-object v1, v4, v8

    aput-object v3, v4, v16

    const/4 v1, 0x2

    aput-object v5, v4, v1

    const/4 v1, 0x3

    aput-object v6, v4, v1

    const/4 v1, 0x4

    aput-object v9, v4, v1

    const/4 v1, 0x5

    aput-object v10, v4, v1

    const/4 v1, 0x6

    aput-object v11, v4, v1

    const/4 v1, 0x7

    aput-object v12, v4, v1

    const/16 v1, 0x8

    aput-object v13, v4, v1

    const/16 v1, 0x9

    aput-object v14, v4, v1

    const/16 v1, 0xa

    aput-object v15, v4, v1

    iget-object v1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->$threadId:Ljava/lang/String;

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1;

    invoke-direct {v5, v4, v1, v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$invokeSuspend$$inlined$combine$1;-><init>([Lec3/l;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;)V

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/list/g;

    invoke-direct {v3, v1, v8}, Lio/getstream/chat/android/ui/common/feature/messages/list/g;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;I)V

    invoke-static {v5, v3}, Lio/getstream/chat/android/ui/common/utils/extensions/FlowKt;->onFirst(Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;

    move-result-object v1

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;

    iget-object v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1$5;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)V

    iput-object v7, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->L$0:Ljava/lang/Object;

    move/from16 v4, v16

    iput v4, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeThreadMessagesState$1;->label:I

    check-cast v1, Lec3/j1;

    invoke-virtual {v1, v3, v0}, Lec3/j1;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
