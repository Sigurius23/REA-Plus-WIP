.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->updatePollOption(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$updatePollOption$1"
    f = "MessageListController.kt"
    l = {
        0x96e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $message:Lio/getstream/chat/android/models/Message;

.field final synthetic $option:Lio/getstream/chat/android/models/Option;

.field final synthetic $poll:Lio/getstream/chat/android/models/Poll;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Option;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Poll;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/models/Option;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$poll:Lio/getstream/chat/android/models/Poll;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$message:Lio/getstream/chat/android/models/Message;

    iput-object p4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$option:Lio/getstream/chat/android/models/Option;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$poll:Lio/getstream/chat/android/models/Poll;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$option:Lio/getstream/chat/android/models/Option;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Option;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$option:Lio/getstream/chat/android/models/Option;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Vote;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Vote;->getOptionId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    check-cast v3, Lio/getstream/chat/android/models/Vote;

    if-eqz v3, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$poll:Lio/getstream/chat/android/models/Poll;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v4, v3}, Lio/getstream/chat/android/client/ChatClient;->removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$poll:Lio/getstream/chat/android/models/Poll;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->$option:Lio/getstream/chat/android/models/Option;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v1, v3, v4}, Lio/getstream/chat/android/client/ChatClient;->castPollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    :goto_1
    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$updatePollOption$1;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
