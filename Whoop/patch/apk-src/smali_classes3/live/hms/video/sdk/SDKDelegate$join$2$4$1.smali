.class final Llive/hms/video/sdk/SDKDelegate$join$2$4$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate$join$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "live.hms.video.sdk.SDKDelegate$join$2$4$1"
    f = "SDKDelegate.kt"
    l = {
        0x5f6,
        0x5fe,
        0x60c,
        0x617
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Llive/hms/video/sdk/models/HMSConfig;

.field final synthetic $hasNameChanged:Z

.field final synthetic $hmsLocalPeer:Llive/hms/video/sdk/models/HMSLocalPeer;

.field final synthetic $it:Llive/hms/video/sdk/models/HMSLocalPeer;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/models/HMSLocalPeer;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/models/HMSConfig;",
            "Llive/hms/video/sdk/models/HMSLocalPeer;",
            "Llive/hms/video/sdk/models/HMSLocalPeer;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$join$2$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hmsLocalPeer:Llive/hms/video/sdk/models/HMSLocalPeer;

    iput-object p4, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$it:Llive/hms/video/sdk/models/HMSLocalPeer;

    iput-boolean p5, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hasNameChanged:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hmsLocalPeer:Llive/hms/video/sdk/models/HMSLocalPeer;

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$it:Llive/hms/video/sdk/models/HMSLocalPeer;

    iget-boolean v5, p0, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hasNameChanged:Z

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSConfig;Llive/hms/video/sdk/models/HMSLocalPeer;Llive/hms/video/sdk/models/HMSLocalPeer;ZLq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v7, p0

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->label:I

    const-string v12, "SDKDelegate"

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v15, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v0, :cond_4

    if-eq v0, v9, :cond_3

    if-eq v0, v8, :cond_2

    if-eq v0, v15, :cond_1

    if-ne v0, v14, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_7

    :catch_1
    move-exception v0

    goto/16 :goto_8

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :cond_3
    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/sdk/SDKDelegate;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportState$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/models/TransportState;

    move-result-object v0

    sget-object v1, Llive/hms/video/transport/models/TransportState;->SignalConnected:Llive/hms/video/transport/models/TransportState;

    if-eq v0, v1, :cond_6

    iget-object v10, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSConfig;->getInitEndpoint()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hmsLocalPeer:Llive/hms/video/sdk/models/HMSLocalPeer;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Llive/hms/video/sdk/models/enums/RetrySchedulerState;->JOINED:Llive/hms/video/sdk/models/enums/RetrySchedulerState;

    iget-object v5, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v5}, Llive/hms/video/sdk/SDKDelegate;->access$getPerformanceMeasurement(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PerformanceMeasurement;

    move-result-object v5

    iget-object v6, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v6}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v14

    invoke-static {v6, v14}, Llive/hms/video/sdk/SDKDelegate;->access$setSdkStoreConfig(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/SDKStore;)Lkotlin/jvm/functions/Function1;

    move-result-object v6

    iput-object v10, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->L$0:Ljava/lang/Object;

    iput v9, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->label:I

    invoke-interface/range {v0 .. v7}, Llive/hms/video/transport/ITransport;->connect(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/enums/RetrySchedulerState;Llive/hms/video/sdk/models/PerformanceMeasurement;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_5

    goto/16 :goto_9

    :cond_5
    :goto_0
    check-cast v0, Llive/hms/video/signal/init/InitConfig;

    invoke-static {v10, v0}, Llive/hms/video/sdk/SDKDelegate;->access$setInitConfig$p(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/signal/init/InitConfig;)V

    :cond_6
    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$updateConfig(Llive/hms/video/sdk/SDKDelegate;)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;

    move-result-object v1

    if-eqz v1, :cond_7

    sget-object v3, Llive/hms/video/sdk/featureflags/Features$SERVER_SIDE_SUBSCRIBE_DEGRADATION;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SERVER_SIDE_SUBSCRIBE_DEGRADATION;

    invoke-virtual {v1, v3}, Llive/hms/video/sdk/featureflags/FeatureFlags;->isFeatureEnabled(Llive/hms/video/sdk/featureflags/Features;)Z

    move-result v1

    if-ne v1, v9, :cond_7

    move v1, v9

    goto :goto_1

    :cond_7
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Llive/hms/video/sdk/SDKDelegate;->access$setSssd$p(Llive/hms/video/sdk/SDKDelegate;Z)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;

    move-result-object v1

    if-eqz v1, :cond_8

    sget-object v3, Llive/hms/video/sdk/featureflags/Features$NON_WEBRTC_DISABLE_OFFER;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$NON_WEBRTC_DISABLE_OFFER;

    invoke-virtual {v1, v3}, Llive/hms/video/sdk/featureflags/FeatureFlags;->isFeatureEnabled(Llive/hms/video/sdk/featureflags/Features;)Z

    move-result v1

    if-ne v1, v9, :cond_8

    move v1, v9

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    invoke-static {v0, v1}, Llive/hms/video/sdk/SDKDelegate;->access$setNonWebRTCDisableOffer$p(Llive/hms/video/sdk/SDKDelegate;Z)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$isOnPolicyChangeHandled$p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSConfig;->getAuthtoken()Ljava/lang/String;

    move-result-object v1

    iget-object v3, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hmsLocalPeer:Llive/hms/video/sdk/models/HMSLocalPeer;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSConfig;->getUserName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSConfig;->getMetadata()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v6}, Llive/hms/video/sdk/SDKDelegate;->access$getSssd$p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v6

    iget-object v10, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v10}, Llive/hms/video/sdk/SDKDelegate;->access$shouldJoinAsWebrtcPeer(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v10

    iget-object v14, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$config:Llive/hms/video/sdk/models/HMSConfig;

    invoke-virtual {v14}, Llive/hms/video/sdk/models/HMSConfig;->getInitEndpoint()Ljava/lang/String;

    move-result-object v14

    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v2}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore;->getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;

    move-result-object v2

    if-eqz v2, :cond_9

    sget-object v15, Llive/hms/video/sdk/featureflags/Features$SIMULCAST;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SIMULCAST;

    invoke-virtual {v2, v15}, Llive/hms/video/sdk/featureflags/FeatureFlags;->isFeatureEnabled(Llive/hms/video/sdk/featureflags/Features;)Z

    move-result v2

    if-ne v2, v9, :cond_9

    goto :goto_3

    :cond_9
    const/4 v9, 0x0

    :goto_3
    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v2}, Llive/hms/video/sdk/SDKDelegate;->access$getIceGatheringOnAnyAddressPorts$p(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v2

    iput-object v13, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->L$0:Ljava/lang/Object;

    iput v8, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->label:I
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    move v8, v9

    move v9, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move v6, v10

    move-object v10, v7

    move-object v7, v14

    :try_start_3
    invoke-interface/range {v0 .. v10}, Llive/hms/video/transport/ITransport;->join(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_2

    move-object v7, v10

    if-ne v0, v11, :cond_a

    goto/16 :goto_9

    :cond_a
    :goto_4
    :try_start_4
    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$onJoinSuccess(Llive/hms/video/sdk/SDKDelegate;)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$it:Llive/hms/video/sdk/models/HMSLocalPeer;

    const/4 v2, 0x3

    iput v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->label:I

    invoke-static {v0, v1, v7}, Llive/hms/video/sdk/SDKDelegate;->access$publishLocalTracks(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSLocalPeer;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_b

    goto :goto_9

    :cond_b
    :goto_5
    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getNoiseCancellationReportingUseCase$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/NoiseCancellationReportingUseCase;

    move-result-object v0

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1}, Llive/hms/video/sdk/SDKDelegate;->access$shouldJoinAsWebrtcPeer(Llive/hms/video/sdk/SDKDelegate;)Z

    move-result v1

    iget-object v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v2}, Llive/hms/video/sdk/SDKDelegate;->access$getHmsTrackSettings$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/media/settings/HMSTrackSettings;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Llive/hms/video/sdk/NoiseCancellationReportingUseCase;->peerJoined(ZLlive/hms/video/media/settings/HMSTrackSettings;)V

    goto :goto_6

    :catch_2
    move-exception v0

    move-object v7, v10

    goto :goto_7

    :catch_3
    move-exception v0

    move-object v7, v10

    goto :goto_8

    :cond_c
    const-string v0, "Waiting for on-policy-change mesage..."

    invoke-static {v12, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0, v9}, Llive/hms/video/sdk/SDKDelegate;->access$setWaitingForPolicyToJoin$p(Llive/hms/video/sdk/SDKDelegate;Z)V

    :goto_6
    iget-boolean v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->$hasNameChanged:Z

    if-eqz v0, :cond_d

    iget-object v0, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->NAME_CHANGED:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    invoke-direct {v2, v3, v0}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v0}, Llive/hms/video/sdk/SDKDelegate;->access$fireUpdates(Llive/hms/video/sdk/SDKDelegate;Ljava/util/List;)V
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_a

    :goto_7
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "join: failed because peer connection is already closed \u274c "

    invoke-virtual {v1, v12, v2, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_a

    :goto_8
    iget-object v1, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object v13, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v7, Llive/hms/video/sdk/SDKDelegate$join$2$4$1;->label:I

    invoke-static {v1, v0, v7}, Llive/hms/video/sdk/SDKDelegate;->access$onJoinError(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/error/HMSException;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_d

    :goto_9
    return-object v11

    :cond_d
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
