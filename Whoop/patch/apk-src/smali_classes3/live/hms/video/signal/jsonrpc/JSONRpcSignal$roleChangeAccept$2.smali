.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/google/gson/JsonObject;"
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
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$roleChangeAccept$2"
    f = "JSONRpcSignal.kt"
    l = {
        0x129
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $requestedBy:Llive/hms/video/sdk/models/HMSPeer;

.field final synthetic $role:Ljava/lang/String;

.field final synthetic $token:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/sdk/models/HMSPeer;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$token:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$role:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$token:Ljava/lang/String;

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$role:Ljava/lang/String;

    iget-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/google/gson/JsonObject;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->label:I

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

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    sget-object v1, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v3, Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;

    iget-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$token:Ljava/lang/String;

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$role:Ljava/lang/String;

    iget-object v6, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->$requestedBy:Llive/hms/video/sdk/models/HMSPeer;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :goto_0
    invoke-direct {v3, v4, v5, v6}, Llive/hms/video/signal/jsonrpc/models/HMSParams$RoleChangeAccept;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$roleChangeAccept$2;->label:I

    const-class v2, Lcom/google/gson/JsonObject;

    invoke-static {p1, v1, v3, v2, p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
