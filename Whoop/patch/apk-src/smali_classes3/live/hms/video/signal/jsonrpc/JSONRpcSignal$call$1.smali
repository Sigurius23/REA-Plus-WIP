.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->call(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls83/c;"
    }
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
        0x8d
    }
    m = "call"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->result:Ljava/lang/Object;

    iget p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->label:I

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$call$1;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
