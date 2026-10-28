.class final Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->observeUnreadLabelState()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "",
        "shouldShowButton",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channel",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "read",
        "Ll83/a0;",
        "<anonymous>",
        "(ZLio/getstream/chat/android/client/channel/state/ChannelState;Lio/getstream/chat/android/models/ChannelUserRead;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.list.MessageListController$observeUnreadLabelState$3"
    f = "MessageListController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

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
            "Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lio/getstream/chat/android/client/channel/state/ChannelState;

    check-cast p3, Lio/getstream/chat/android/models/ChannelUserRead;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->invoke(ZLio/getstream/chat/android/client/channel/state/ChannelState;Lio/getstream/chat/android/models/ChannelUserRead;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(ZLio/getstream/chat/android/client/channel/state/ChannelState;Lio/getstream/chat/android/models/ChannelUserRead;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-direct {v0, v1, p4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Lq83/d;)V

    iput-boolean p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->Z$0:Z

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->Z$0:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->L$1:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/ChannelUserRead;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->label:I

    if-nez v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    if-eqz v2, :cond_4

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->isStartedForThread()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    if-eqz v2, :cond_4

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getLastProcessedReadMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, p1

    :goto_1
    if-eqz v2, :cond_4

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$observeUnreadLabelState$3;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$setLastProcessedReadMessageId$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;Ljava/lang/String;)V

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getUnreadLabelCalculator$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;

    move-result-object v4

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessages()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->access$getClientState$p(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;)Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v5

    invoke-interface {v5}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v5

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/User;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, p1

    :goto_2
    invoke-virtual {v4, v2, v1, v5, v0}, Lio/getstream/chat/android/ui/common/feature/messages/list/UnreadLabelCalculator;->calculateUnreadLabel(Lio/getstream/chat/android/models/ChannelUserRead;Ljava/util/List;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController$UnreadLabel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->getUnreadLabelState()Lec3/p1;

    move-result-object v1

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, p1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :cond_4
    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
