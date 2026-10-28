.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->onMessage(Lud3/e1;Ljava/lang/String;)V
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
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$5"
    f = "JSONRpcSignal.kt"
    l = {
        0x348,
        0x233
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

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

    new-instance p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    invoke-direct {p1, v0, v1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$2:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/signal/jsonrpc/models/HMSParams;

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$1:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-static {p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$getMutex(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;)Lmc3/a;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$2:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v3, v1

    move-object v1, v5

    :goto_0
    :try_start_1
    invoke-virtual {v3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type live.hms.video.signal.jsonrpc.models.HMSParams.Offer"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    invoke-virtual {v1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;->toSDP()Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object v1

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->L$2:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$5;->label:I

    invoke-interface {v3, v1, p0}, Llive/hms/video/signal/ISignalEventsObserver;->onOffer(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, p1

    :goto_2
    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    :goto_3
    invoke-interface {v0, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
