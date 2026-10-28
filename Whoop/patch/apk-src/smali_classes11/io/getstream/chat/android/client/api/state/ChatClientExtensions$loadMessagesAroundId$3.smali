.class final Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->loadMessagesAroundId(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
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
    c = "io.getstream.chat.android.client.api.state.ChatClientExtensions$loadMessagesAroundId$3"
    f = "ChatClientStateExtensions.kt"
    l = {
        0x1ab
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $cid:Ljava/lang/String;

.field final synthetic $messageId:Ljava/lang/String;

.field final synthetic $this_loadMessagesAroundId:Lio/getstream/chat/android/client/ChatClient;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$this_loadMessagesAroundId:Lio/getstream/chat/android/client/ChatClient;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$messageId:Ljava/lang/String;

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

    new-instance p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$cid:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$this_loadMessagesAroundId:Lio/getstream/chat/android/client/ChatClient;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$messageId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$0:Ljava/lang/Object;

    check-cast v0, Ln23/h;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$cid:Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/internal/ValidationKt;->validateCidWithResult(Ljava/lang/String;)Ln23/h;

    move-result-object p1

    instance-of v1, p1, Ln23/g;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$cid:Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v1, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$this_loadMessagesAroundId:Lio/getstream/chat/android/client/ChatClient;

    invoke-static {v3}, Lio/getstream/chat/android/client/internal/state/extensions/internal/ChatClientKt;->getLogic(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    move-result-object v3

    invoke-virtual {v3, v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->$messageId:Ljava/lang/String;

    const/4 v3, 0x0

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$1:Ljava/lang/Object;

    iput-object v3, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->L$2:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/api/state/ChatClientExtensions$loadMessagesAroundId$3;->label:I

    invoke-interface {p1, v1, p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->loadAround(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln23/h;

    return-object p1

    :cond_3
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
