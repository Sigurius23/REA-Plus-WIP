.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->cancelEphemeralMessage(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/Message;)Lo23/d;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$cancelEphemeralMessage$2"
    f = "ChatClientStateExtensions.kt"
    l = {
        0x1c5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $message:Lio/getstream/chat/android/models/Message;

.field final synthetic $this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

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

    new-instance p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;-><init>(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;Lq83/d;)V

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
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/internal/ValidationKt;->validateCidWithResult(Ljava/lang/String;)Ln23/h;

    move-result-object p1

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_7

    :try_start_1
    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->getLogic(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-interface {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->getLogic(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->getLogic(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->removeLocalMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$this_cancelEphemeralMessage:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->$message:Lio/getstream/chat/android/models/Message;

    const/4 v3, 0x0

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->L$0:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$cancelEphemeralMessage$2;->label:I

    invoke-virtual {p1, v1, p0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_1
    new-instance p1, Ln23/g;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_6
    const-string p1, "Only ephemeral message can be canceled"

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_2
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not cancel ephemeral message"

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_8

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
