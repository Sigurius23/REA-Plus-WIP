.class final Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;
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
    c = "live.hms.video.transport.HMSTransport$retryPublishIceFailedTask$1"
    f = "HMSTransport.kt"
    l = {
        0xc6,
        0xc7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

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
            "Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

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

    new-instance v0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {v0, v1, p1}, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->label:I

    const-string v2, "HMSTransport"

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lbc3/s;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "Ignore publish renegotiation since this is called after peer connection is close or not created yet"

    invoke-static {v2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getPublishConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/publish/HMSPublishConnection;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Llive/hms/video/connection/HMSConnection;->getIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object p1

    sget-object v1, Lhms/webrtc/PeerConnection$IceConnectionState;->CONNECTED:Lhms/webrtc/PeerConnection$IceConnectionState;

    if-eq p1, v1, :cond_5

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v7

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;

    move-result-object p1

    new-instance v6, Llive/hms/video/transport/models/TransportCallbackTriple;

    sget-object v8, Llive/hms/video/error/HMSAction;->RestartIce:Llive/hms/video/error/HMSAction;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Llive/hms/video/transport/models/TransportCallbackTriple;-><init>(Lbc3/s;Llive/hms/video/error/HMSAction;Ljava/util/HashMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "publish-renegotiation-callback"

    invoke-interface {p1, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    sget-object v1, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v1}, Llive/hms/video/factories/MediaConstraintsFactory;->makeIceRestartPublishOfferConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object v1

    iput-object v7, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->label:I

    invoke-static {p1, v1, p0}, Llive/hms/video/transport/HMSTransport;->access$performPublishRenegotiation(Llive/hms/video/transport/HMSTransport;Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v7

    :goto_0
    iput-object v5, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/transport/HMSTransport$retryPublishIceFailedTask$1;->label:I

    check-cast v1, Lbc3/t;

    invoke-virtual {v1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :goto_2
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Renegotiation could not be performed due to : "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5
.end method
