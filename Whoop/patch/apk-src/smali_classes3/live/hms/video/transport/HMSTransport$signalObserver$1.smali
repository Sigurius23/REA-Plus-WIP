.class public final Llive/hms/video/transport/HMSTransport$signalObserver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/signal/ISignalEventsObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/transport/HMSTransport;-><init>(Landroid/content/Context;Llive/hms/video/transport/ITransportObserver;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/connection/subscribe/RemoteTrackFactory;Llive/hms/video/utils/HMSAgentOs;Llive/hms/video/transport/IsQaLink;Llive/hms/video/sdk/OfflineAnalyticsPeerInfo;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Llive/hms/video/network/HMSNetworkManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/HMSTransport$signalObserver$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J \u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "live/hms/video/transport/HMSTransport$signalObserver$1",
        "Llive/hms/video/signal/ISignalEventsObserver;",
        "Llive/hms/video/connection/models/HMSSessionDescription;",
        "jsep",
        "Ll83/a0;",
        "onOffer",
        "(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/connection/models/HMSTrickle;",
        "trickle",
        "onTrickle",
        "(Llive/hms/video/connection/models/HMSTrickle;)V",
        "Lcom/google/gson/JsonObject;",
        "message",
        "onNotification",
        "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onServerError",
        "(Llive/hms/video/error/HMSException;)V",
        "exception",
        "onFailure",
        "Llive/hms/video/transport/models/TransportFailureCategory;",
        "tfc",
        "Lbc3/s;",
        "",
        "getDependency",
        "(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/transport/HMSTransport;


# direct methods
.method public constructor <init>(Llive/hms/video/transport/HMSTransport;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDependency(Llive/hms/video/transport/models/TransportFailureCategory;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Lq83/d<",
            "-",
            "Lbc3/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getRetryScheduler$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/RetryScheduler;

    move-result-object p2

    invoke-virtual {p2, p1}, Llive/hms/video/transport/RetryScheduler;->getDependecyForCategory(Llive/hms/video/transport/models/TransportFailureCategory;)Lbc3/s;

    move-result-object p1

    return-object p1
.end method

.method public onFailure(Llive/hms/video/error/HMSException;)V
    .locals 4

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v1}, Llive/hms/video/transport/HMSTransport;->access$getSignal$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/signal/ISignal;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/events/AnalyticsEventsService;->removeTransport(Llive/hms/video/events/IAnalyticsTransport;)Z

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onFailure$1;-><init>(Llive/hms/video/transport/HMSTransport;Llive/hms/video/error/HMSException;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$isTearDownInProgress$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Disconnected:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v0}, Llive/hms/video/transport/HMSTransport;->getState()Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Llive/hms/video/transport/ITransportObserver;->onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Ignoring "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as leave in progress"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HMSTransport"

    invoke-virtual {p2, v0, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public onOffer(Llive/hms/video/connection/models/HMSSessionDescription;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/models/HMSSessionDescription;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "[SUBSCRIBE] Adding "

    instance-of v3, v0, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;

    iget v4, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;

    invoke-direct {v3, v1, v0}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;-><init>(Llive/hms/video/transport/HMSTransport$signalObserver$1;Lq83/d;)V

    :goto_0
    iget-object v0, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    const-string v6, "Ignore remote offer since it is called after peer connection is closed or not created yet"

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    const-string v10, "subscribeConnection"

    const/4 v11, 0x0

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const-string v13, "HMSTransport"

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v8, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v2, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$4:Ljava/lang/Object;

    check-cast v2, Lhms/webrtc/SessionDescription;

    iget-object v4, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    check-cast v4, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    iget-object v6, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v3, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    check-cast v3, Llive/hms/video/transport/HMSTransport$signalObserver$1;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v3

    goto/16 :goto_7

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/transport/HMSTransport;

    iget-object v6, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    check-cast v6, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v8, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    check-cast v8, Llive/hms/video/transport/HMSTransport$signalObserver$1;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v7, v8

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v5, v0

    move-object v0, v8

    goto/16 :goto_7

    :cond_3
    iget-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$4:Ljava/lang/Object;

    check-cast v5, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v9, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    check-cast v9, Llive/hms/video/transport/HMSTransport;

    iget-object v14, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    check-cast v14, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v15, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    check-cast v15, Llive/hms/video/connection/models/HMSSessionDescription;

    iget-object v7, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    check-cast v7, Llive/hms/video/transport/HMSTransport$signalObserver$1;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v14

    move-object v14, v15

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v5, v0

    move-object v0, v7

    goto/16 :goto_7

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v0, "[role=SUBSCRIBE] onOffer renegotiation START \u23f0"

    invoke-static {v13, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {v13, v6}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_5
    :try_start_3
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/PeerConnection;->connectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v0

    sget-object v5, Lhms/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    if-ne v0, v5, :cond_6

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "[role=SUBSCRIBE] remote offer  IGNORED as PeerConnection is closed \u274c"

    invoke-virtual {v0, v13, v2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :catch_3
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    goto/16 :goto_7

    :cond_6
    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v5

    if-eqz v5, :cond_14

    iget-object v0, v1, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual/range {p1 .. p1}, Llive/hms/video/connection/models/HMSSessionDescription;->native()Lhms/webrtc/SessionDescription;

    move-result-object v7

    iput-object v1, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    move-object/from16 v14, p1

    iput-object v14, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    iput-object v0, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    iput-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$4:Ljava/lang/Object;

    iput v9, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    invoke-virtual {v5, v7, v3}, Llive/hms/video/connection/HMSConnection;->setRemoteDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    if-ne v7, v4, :cond_7

    goto/16 :goto_5

    :cond_7
    move-object v9, v0

    move-object v7, v1

    move-object v0, v5

    :goto_1
    :try_start_4
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " ice-candidates ["

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lhms/webrtc/IceCandidate;

    invoke-virtual {v5, v15}, Llive/hms/video/connection/HMSConnection;->addIceCandidate(Lhms/webrtc/IceCandidate;)Z

    goto :goto_2

    :cond_8
    invoke-virtual {v5}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v14}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-static {v9}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v14}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v15

    if-eqz v15, :cond_b

    invoke-virtual {v15}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v15

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    const-string v0, "SFUMIGRATION"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[role=SUBSCRIBE] node-mismatch the current peerConnection is old node id :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Llive/hms/video/connection/HMSConnection;->getNodeInfo()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " and the offer is from node id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Llive/hms/video/connection/models/HMSSessionDescription;->getSfuNodeId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  \u274c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_a
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :cond_b
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :cond_c
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :cond_d
    :goto_3
    invoke-static {v9}, Llive/hms/video/transport/HMSTransport;->access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v2

    if-nez v2, :cond_e

    invoke-static {v13, v6}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_e
    sget-object v2, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v2}, Llive/hms/video/factories/MediaConstraintsFactory;->makeSubscribeAnswerConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object v2

    iput-object v7, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$4:Ljava/lang/Object;

    iput v8, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    invoke-virtual {v5, v2, v3}, Llive/hms/video/connection/HMSConnection;->createAnswer(Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_f

    goto :goto_5

    :cond_f
    move-object v6, v0

    move-object v0, v2

    move-object v2, v5

    move-object v5, v9

    :goto_4
    check-cast v0, Lhms/webrtc/SessionDescription;

    invoke-static {v5}, Llive/hms/video/transport/HMSTransport;->access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v8

    if-nez v8, :cond_10

    const-string v0, "Ignore local answer since it is called after peer connection is closed or not created yet"

    invoke-static {v13, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_10
    invoke-static {v5}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v8

    if-eqz v8, :cond_13

    invoke-virtual {v8}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->getNativeConnection()Lhms/webrtc/PeerConnection;

    move-result-object v8

    invoke-virtual {v8}, Lhms/webrtc/PeerConnection;->connectionState()Lhms/webrtc/PeerConnection$PeerConnectionState;

    move-result-object v8

    sget-object v9, Lhms/webrtc/PeerConnection$PeerConnectionState;->CLOSED:Lhms/webrtc/PeerConnection$PeerConnectionState;

    if-ne v8, v9, :cond_11

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "[role=SUBSCRIBE] local answer as IGNORED as PeerConnection is closed \u274c"

    invoke-virtual {v0, v13, v2}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_11
    iput-object v7, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$0:Ljava/lang/Object;

    iput-object v6, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$1:Ljava/lang/Object;

    iput-object v5, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$2:Ljava/lang/Object;

    iput-object v2, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$3:Ljava/lang/Object;

    iput-object v0, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v3, Llive/hms/video/transport/HMSTransport$signalObserver$1$onOffer$1;->label:I

    invoke-virtual {v2, v0, v3}, Llive/hms/video/connection/HMSConnection;->setLocalDescription(Lhms/webrtc/SessionDescription;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-ne v3, v4, :cond_12

    :goto_5
    return-object v4

    :cond_12
    move-object v4, v2

    move-object v3, v7

    move-object v2, v0

    :goto_6
    :try_start_5
    invoke-virtual {v4}, Llive/hms/video/connection/HMSConnection;->getSignal()Llive/hms/video/signal/ISignal;

    move-result-object v0

    sget-object v4, Llive/hms/video/connection/models/HMSSessionDescription;->Companion:Llive/hms/video/connection/models/HMSSessionDescription$Companion;

    invoke-virtual {v5}, Llive/hms/video/transport/HMSTransport;->getNodeID()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v2, v6}, Llive/hms/video/connection/models/HMSSessionDescription$Companion;->from(Lhms/webrtc/SessionDescription;Ljava/lang/String;)Llive/hms/video/connection/models/HMSSessionDescription;

    move-result-object v2

    invoke-virtual {v5}, Llive/hms/video/transport/HMSTransport;->getNodeID()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Llive/hms/video/signal/ISignal;->answer(Llive/hms/video/connection/models/HMSSessionDescription;Ljava/lang/String;)V

    const-string v0, "[role=SUBSCRIBE] onOffer renegotiation DONE \u2705"

    invoke-static {v13, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    goto/16 :goto_9

    :cond_13
    :try_start_6
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    :cond_14
    :try_start_7
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11

    :cond_15
    invoke-static {v10}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v11
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    :goto_7
    instance-of v2, v5, Llive/hms/video/error/HMSException;

    if-eqz v2, :cond_16

    move-object v3, v5

    check-cast v3, Llive/hms/video/error/HMSException;

    invoke-virtual {v3}, Llive/hms/video/error/HMSException;->getCode()I

    move-result v3

    const/16 v4, 0x1a5

    if-ne v3, v4, :cond_16

    return-object v12

    :cond_16
    const-string v3, "[role=SUBSCRIBE] onOffer renegotiation FAILED \u274c"

    invoke-static {v13, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    sget-object v4, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    invoke-static {v3, v4}, Llive/hms/video/transport/HMSTransport;->access$setState(Llive/hms/video/transport/HMSTransport;Llive/hms/video/transport/models/TransportState;)V

    if-nez v2, :cond_18

    sget-object v2, Llive/hms/video/error/ErrorFactory$GenericErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$GenericErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->SUBSCRIBE:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_17

    const-string v4, "Renegotiation with offer received from server failed"

    :cond_17
    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Llive/hms/video/error/ErrorFactory$GenericErrors;->Unknown$default(Llive/hms/video/error/ErrorFactory$GenericErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object v2

    goto :goto_8

    :cond_18
    move-object v2, v5

    check-cast v2, Llive/hms/video/error/HMSException;

    :goto_8
    iget-object v3, v0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v3}, Llive/hms/video/transport/HMSTransport;->access$getCallbacks$p(Llive/hms/video/transport/HMSTransport;)Ljava/util/HashMap;

    move-result-object v3

    const-string v4, "subscribe-renegotiation-callback"

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/transport/models/TransportCallbackTriple;

    if-nez v3, :cond_19

    iget-object v4, v0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-virtual {v4}, Llive/hms/video/transport/HMSTransport;->getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v4

    sget-object v5, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v5, v2}, Llive/hms/video/events/AnalyticsEventFactory;->subscribeFail(Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v5

    invoke-virtual {v4, v5}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v4

    invoke-virtual {v4}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    iget-object v0, v0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object v0

    invoke-interface {v0, v2}, Llive/hms/video/transport/ITransportObserver;->onNonFatalError(Llive/hms/video/error/HMSException;)V

    :cond_19
    if-eqz v3, :cond_1a

    invoke-virtual {v3}, Llive/hms/video/transport/models/TransportCallbackTriple;->getDeferred()Lbc3/s;

    move-result-object v0

    if-eqz v0, :cond_1a

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v2}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :cond_1a
    :goto_9
    return-object v12
.end method

.method public onServerError(Llive/hms/video/error/HMSException;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getCode()I

    move-result v0

    const v1, 0xa029

    if-ne v0, v1, :cond_0

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/transport/HMSTransport$signalObserver$1$onServerError$1;

    iget-object v2, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Llive/hms/video/transport/HMSTransport$signalObserver$1$onServerError$1;-><init>(Llive/hms/video/transport/HMSTransport;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v3, v3, v1, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object v0

    sget-object v1, Llive/hms/video/transport/models/TransportState;->Failed:Llive/hms/video/transport/models/TransportState;

    invoke-interface {v0, v1, p1}, Llive/hms/video/transport/ITransportObserver;->onStateChange(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public onTrickle(Llive/hms/video/connection/models/HMSTrickle;)V
    .locals 4

    const-string v0, "trickle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$isPeerConnectionReady$p(Llive/hms/video/transport/HMSTransport;)Z

    move-result v0

    const-string v1, "HMSTransport"

    if-nez v0, :cond_0

    const-string p1, "Ignore trickle since it is called after peer connection is closed or not created yet"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v0

    sget-object v2, Llive/hms/video/transport/HMSTransport$signalObserver$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getSubscribeConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "subscribeConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    iget-object v0, p0, Llive/hms/video/transport/HMSTransport$signalObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {v0}, Llive/hms/video/transport/HMSTransport;->access$getPublishConnection$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/connection/publish/HMSPublishConnection;

    move-result-object v0

    if-eqz v0, :cond_5

    :goto_0
    invoke-virtual {v0}, Llive/hms/video/connection/HMSConnection;->getRemoteDescription()Lhms/webrtc/SessionDescription;

    move-result-object v2

    const-string v3, "[role="

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "] Adding ice-candidate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSIceCandidate;->native()Lhms/webrtc/IceCandidate;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/connection/HMSConnection;->addIceCandidate(Lhms/webrtc/IceCandidate;)Z

    return-void

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "] Queuing ice-candidate="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Llive/hms/video/connection/HMSConnection;->getCandidates()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSTrickle;->getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/connection/models/HMSIceCandidate;->native()Lhms/webrtc/IceCandidate;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_5
    const-string p1, "publishConnection"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method
