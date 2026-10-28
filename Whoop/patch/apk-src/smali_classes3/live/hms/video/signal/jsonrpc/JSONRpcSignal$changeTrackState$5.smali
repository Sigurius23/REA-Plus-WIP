.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->changeTrackState(ZLlive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$changeTrackState$5"
    f = "JSONRpcSignal.kt"
    l = {
        0x143
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $mute:Z

.field final synthetic $roles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $source:Ljava/lang/String;

.field final synthetic $type:Llive/hms/video/media/tracks/HMSTrackType;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/media/tracks/HMSTrackType;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$roles:Ljava/util/List;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$type:Llive/hms/video/media/tracks/HMSTrackType;

    iput-object p4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$source:Ljava/lang/String;

    iput-boolean p5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$mute:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$roles:Ljava/util/List;

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$type:Llive/hms/video/media/tracks/HMSTrackType;

    iget-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$source:Ljava/lang/String;

    iget-boolean v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$mute:Z

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->label:I

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

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    sget-object v1, Llive/hms/video/signal/HMSSignalMethod;->CHANGE_TRACK_MUTE_STATE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    new-instance v3, Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$roles:Ljava/util/List;

    iget-object v6, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$type:Llive/hms/video/media/tracks/HMSTrackType;

    iget-object v7, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$source:Ljava/lang/String;

    iget-boolean v8, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->$mute:Z

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v8}, Llive/hms/video/signal/jsonrpc/models/HMSParams$TrackUpdateAllRequest;-><init>(Ljava/lang/String;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrackType;Ljava/lang/String;Z)V

    iput v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$changeTrackState$5;->label:I

    const-class v2, Lcom/google/gson/JsonObject;

    invoke-static {p1, v1, v3, v2, p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
