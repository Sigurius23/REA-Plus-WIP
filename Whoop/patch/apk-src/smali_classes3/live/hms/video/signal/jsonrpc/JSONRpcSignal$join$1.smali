.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal"
    f = "JSONRpcSignal.kt"
    l = {
        0xd3
    }
    m = "join"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->result:Ljava/lang/Object;

    iget p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->label:I

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$join$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->join(Ljava/lang/String;Ljava/lang/String;ZLlive/hms/video/connection/models/HMSSessionDescription;Llive/hms/video/sdk/models/IRetryAttemptTracking;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
