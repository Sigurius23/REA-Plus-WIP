.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;
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
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$6"
    f = "JSONRpcSignal.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $method:Llive/hms/video/signal/HMSSignalMethod;

.field final synthetic $params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/models/HMSParams;Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Llive/hms/video/signal/HMSSignalMethod;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$method:Llive/hms/video/signal/HMSSignalMethod;

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

    new-instance p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$method:Llive/hms/video/signal/HMSSignalMethod;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;-><init>(Llive/hms/video/signal/jsonrpc/models/HMSParams;Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    const-string v0, "null cannot be cast to non-null type live.hms.video.signal.jsonrpc.models.HMSParams.OnError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-virtual {p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object p1

    sget-object v0, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    check-cast v1, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;

    invoke-virtual {v1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;->getCode()I

    move-result v1

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$method:Llive/hms/video/signal/HMSSignalMethod;

    invoke-virtual {v2}, Llive/hms/video/signal/HMSSignalMethod;->toErrorAction()Llive/hms/video/error/ErrorFactory$Action;

    move-result-object v2

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$6;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    check-cast v3, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;

    invoke-virtual {v3}, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;->ServerErrors$default(Llive/hms/video/error/ErrorFactory$WebsocketMethodErrors;ILlive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v0

    invoke-interface {p1, v0}, Llive/hms/video/signal/ISignalEventsObserver;->onServerError(Llive/hms/video/error/HMSException;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
