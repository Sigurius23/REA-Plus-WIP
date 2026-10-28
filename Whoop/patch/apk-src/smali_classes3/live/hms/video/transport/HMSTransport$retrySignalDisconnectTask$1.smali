.class final Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;
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
    c = "live.hms.video.transport.HMSTransport$retrySignalDisconnectTask$1"
    f = "HMSTransport.kt"
    l = {
        0xe0,
        0xed
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
            "Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

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

    new-instance v0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {v0, v1, p1}, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->I$0:I

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, p0

    goto :goto_0

    :catch_0
    move-object v10, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getSignal$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/signal/ISignal;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/signal/ISignal;->isConnected()Z

    move-result p1

    if-nez p1, :cond_4

    :try_start_1
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getSignal$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/signal/ISignal;

    move-result-object p1

    invoke-interface {p1}, Llive/hms/video/signal/ISignal;->close()V

    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getConnectParameters$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/models/ConnectParameters;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {p1}, Llive/hms/video/transport/models/ConnectParameters;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Llive/hms/video/transport/models/ConnectParameters;->getEndpoint()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Llive/hms/video/transport/models/ConnectParameters;->getPeerId()Ljava/lang/String;

    move-result-object v8

    iput v4, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->I$0:I

    iput v4, p0, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->label:I
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v9, 0x0

    const/16 v11, 0x8

    const/4 v12, 0x0

    move-object v10, p0

    :try_start_2
    invoke-static/range {v5 .. v12}, Llive/hms/video/transport/HMSTransport;->internalConnect$default(Llive/hms/video/transport/HMSTransport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_0
    check-cast p1, Llive/hms/video/signal/init/InitConfig;
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    :goto_1
    move v1, v3

    goto :goto_2

    :cond_4
    move-object v10, p0

    move v1, v4

    :goto_2
    iget-object p1, v10, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$isRenegotiationDone$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, v10, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getPublishConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/publish/HMSPublishConnection;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Llive/hms/video/connection/HMSConnection;->getIceConnectionState()Lhms/webrtc/PeerConnection$IceConnectionState;

    move-result-object p1

    sget-object v5, Lhms/webrtc/PeerConnection$IceConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$IceConnectionState;

    if-eq p1, v5, :cond_8

    if-eqz v1, :cond_6

    iget-object p1, v10, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getRetryPublishIceFailedTask$p(Llive/hms/video/transport/HMSTransport;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    iput v2, v10, Llive/hms/video/transport/HMSTransport$retrySignalDisconnectTask$1;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    move v1, v4

    goto :goto_5

    :cond_6
    move v1, v3

    goto :goto_5

    :cond_7
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_8
    :goto_5
    if-eqz v1, :cond_9

    move v3, v4

    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
