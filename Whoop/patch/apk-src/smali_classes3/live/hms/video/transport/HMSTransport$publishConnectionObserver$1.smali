.class public final Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/publish/IPublishConnectionObserver;


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
        Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u00020\u00022\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "live/hms/video/transport/HMSTransport$publishConnectionObserver$1",
        "Llive/hms/video/connection/publish/IPublishConnectionObserver;",
        "Ll83/a0;",
        "onRenegotiationNeeded",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/PeerConnection$IceConnectionState;",
        "newState",
        "onIceConnectionChange",
        "(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;",
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

    iput-object p1, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onIceCandidate(Lhms/webrtc/IceCandidate;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/IceCandidate;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Llive/hms/video/transport/ITransportObserver;->onIceCandidate(Lhms/webrtc/IceCandidate;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onIceConnectionChange(Lhms/webrtc/PeerConnection$IceConnectionState;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/PeerConnection$IceConnectionState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[role=PUBLISH] onIceConnectionChange state :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSTransport"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p1}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p1

    invoke-interface {p1, v1}, Llive/hms/video/transport/ITransportObserver;->onICEConnected(Z)V

    :goto_0
    return-object v0

    :cond_1
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    sget-object v1, Llive/hms/video/connection/models/HMSConnectionRole;->PUBLISH:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-static {p1, v1, p2}, Llive/hms/video/transport/HMSTransport;->access$handleIceConnectionFailed(Llive/hms/video/transport/HMSTransport;Llive/hms/video/connection/models/HMSConnectionRole;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    return-object v0
.end method

.method public onRenegotiationNeeded(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;

    iget v1, v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;

    invoke-direct {v0, p0, p1}, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;-><init>(Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    sget-object v2, Llive/hms/video/factories/MediaConstraintsFactory;->INSTANCE:Llive/hms/video/factories/MediaConstraintsFactory;

    invoke-virtual {v2}, Llive/hms/video/factories/MediaConstraintsFactory;->makePublishOfferConstraints()Lhms/webrtc/MediaConstraints;

    move-result-object v2

    iput v3, v0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1$onRenegotiationNeeded$1;->label:I

    invoke-static {p1, v2, v0}, Llive/hms/video/transport/HMSTransport;->access$performPublishRenegotiation(Llive/hms/video/transport/HMSTransport;Lhms/webrtc/MediaConstraints;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Renegotiation didnt complete due to : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSTransport"

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/CandidatePairChangeEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Llive/hms/video/transport/HMSTransport$publishConnectionObserver$1;->this$0:Llive/hms/video/transport/HMSTransport;

    invoke-static {p2}, Llive/hms/video/transport/HMSTransport;->access$getObserver$p(Llive/hms/video/transport/HMSTransport;)Llive/hms/video/transport/ITransportObserver;

    move-result-object p2

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Llive/hms/video/transport/ITransportObserver;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
