.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->scrollToFirstUnreadMessage()V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$scrollToFirstUnreadMessage$1$3$1"
    f = "MessageListController.kt"
    l = {
        0x299
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

.field final synthetic $unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getCid$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v1, v3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessagesAroundId(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->label:I

    check-cast p1, Lo23/h;

    invoke-virtual {p1, p0}, Lo23/h;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$this_run:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$scrollToFirstUnreadMessage$1$3$1;->$unreadLabel:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_3

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$focusUnreadMessage(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_4

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
