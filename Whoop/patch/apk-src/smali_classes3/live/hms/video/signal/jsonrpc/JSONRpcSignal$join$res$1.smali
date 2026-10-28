.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Llive/hms/video/connection/models/HMSSessionDescription;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$join$res$1"
    f = "JSONRpcSignal.kt"
    l = {
        0xd4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $params:Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

    invoke-direct {v0, v1, v2, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    sget-object v1, Llive/hms/video/signal/HMSSignalMethod;->JOIN:Llive/hms/video/signal/HMSSignalMethod;

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->$params:Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

    iput v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$res$1;->label:I

    const-class v2, Llive/hms/video/connection/models/HMSSessionDescription;

    invoke-static {p1, v1, v3, v2, p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
