.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;
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
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$onMessage$2"
    f = "JSONRpcSignal.kt"
    l = {
        0x348,
        0x218
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $method:Ljava/lang/String;

.field final synthetic $response:Lcom/google/gson/JsonObject;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lcom/google/gson/JsonObject;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$method:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$response:Lcom/google/gson/JsonObject;

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

    new-instance p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$method:Ljava/lang/String;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$response:Lcom/google/gson/JsonObject;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Lcom/google/gson/JsonObject;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->label:I

    const-string v2, "SFUMIGRATION"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$3:Ljava/lang/Object;

    check-cast v1, Lcom/google/gson/JsonObject;

    iget-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$2:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v6, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$0:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v7

    move-object v7, v1

    move-object v1, v6

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-static {p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$getMutex(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;)Lmc3/a;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$method:Ljava/lang/String;

    iget-object v6, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->$response:Lcom/google/gson/JsonObject;

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$1:Ljava/lang/Object;

    iput-object v6, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$2:Ljava/lang/Object;

    iput-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$3:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->label:I

    invoke-interface {p1, p0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v6

    :goto_0
    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " received. Taking lock"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->getObserver()Llive/hms/video/signal/ISignalEventsObserver;

    move-result-object v4

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$0:Ljava/lang/Object;

    iput-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->L$3:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$onMessage$2;->label:I

    invoke-interface {v4, v7, p0}, Llive/hms/video/signal/ISignalEventsObserver;->onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v3, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move-object v0, v1

    move-object v1, p1

    :goto_2
    :try_start_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " Handling done. Unlocking "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    :goto_3
    invoke-interface {v1, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method
