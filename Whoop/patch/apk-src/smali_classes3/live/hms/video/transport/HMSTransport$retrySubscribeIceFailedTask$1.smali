.class final Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/HMSTransport;-><init>(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "live.hms.video.transport.HMSTransport$retrySubscribeIceFailedTask$1"
    f = "HMSTransport.kt"
    l = {
        0x10c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field label:I

.field final synthetic this$0:Llive/hms/video/transport/HMSTransport;


# direct methods
.method public constructor <init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/HMSTransport;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {v0, v1, p1}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->label:I

    const/4 v2, 0x0

    const-string v3, "subscribe-renegotiation-callback"

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    iget v0, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->I$0:I

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "retrySubscribeIceFailedTask: Subscribe IceState="

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v5}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v5

    const-string v6, "subscribeConnection"

    const/4 v7, 0x0

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Llive/hms/video/connection/HMSConnection;->getIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "HMSTransport"

    invoke-virtual {p1, v5, v1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Llive/hms/video/connection/HMSConnection;->getIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object p1

    sget-object v1, Lhms/webrtc/PeerConnection$IceConnectionState;->CONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

    if-eq p1, v1, :cond_2

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v9

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v8, Llive/hms/video/transport/models/TransportCallbackTriple;

    sget-object v10, Llive/hms/video/error/HMSAction;->RestartIce:Llive/hms/video/error/HMSAction;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Llive/hms/video/transport/models/TransportCallbackTriple;-><init>(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v3, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    new-instance p1, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1$1;

    invoke-direct {p1, v9, v7}, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1$1;-><init>(Lbc3/s;Lq83/d;)V

    iput v4, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->I$0:I

    iput v4, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->label:I

    const-wide/32 v5, 0xea60

    invoke-static {v5, v6, p1, p0}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_0
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySubscribeIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v4

    :goto_0
    if-eqz v0, :cond_3

    move v2, v4

    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v7
.end method
