.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->focusThreadMessage(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$focusThreadMessage$1"
    f = "MessageListController.kt"
    l = {
        0x5a9,
        0x5ac
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $parentMessageId:Ljava/lang/String;

.field final synthetic $threadMessageId:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$parentMessageId:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$threadMessageId:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$parentMessageId:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$threadMessageId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$get_mode$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    instance-of v1, p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v1, :cond_3

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$parentMessageId:Ljava/lang/String;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$parentMessageId:Ljava/lang/String;

    iput-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->label:I

    invoke-static {p1, v1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$enterThreadSequential(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->$threadMessageId:Ljava/lang/String;

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getMessageUsingCache(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    iput-object v4, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->label:I

    check-cast p1, Lo23/h;

    invoke-virtual {p1, p0}, Lo23/h;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getFocusedMessage$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lec3/p1;

    move-result-object v0

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_6

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lio/getstream/chat/android/models/Message;

    goto :goto_3

    :cond_6
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$focusThreadMessage$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "[focusThreadMessage] -> Could not focus thread parent: "

    const-string v6, "."

    invoke-static {v2, p1, v6}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v5, v3, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v4}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
