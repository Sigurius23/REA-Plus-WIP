.class public final Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/diagnostics/ITransportListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/diagnostics/HMSDiagnostics;-><init>(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J!\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "live/hms/video/diagnostics/HMSDiagnostics$transportListener$1",
        "Llive/hms/video/diagnostics/ITransportListener;",
        "Ll83/a0;",
        "onInitFetched",
        "()V",
        "",
        "websocketUrl",
        "onWebSocketConnected",
        "(Ljava/lang/String;)V",
        "",
        "isPublish",
        "onICEConnected",
        "(Z)V",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;Z)V",
        "onMediaCaptured",
        "onMediaPublished",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;Z)V",
        "",
        "quality",
        "onNetworkQuality",
        "(I)V",
        "onCompleted",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onRTCTrackAdded",
        "(Llive/hms/video/media/tracks/HMSTrack;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
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
.field final synthetic this$0:Llive/hms/video/diagnostics/HMSDiagnostics;


# direct methods
.method public constructor <init>(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompleted()V
    .locals 0

    return-void
.end method

.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onICEConnected(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onICEConnected , isPublish :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDiagnostic"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p1

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/MediaServerReport;->setPublishICEConnected$lib_release(Z)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setPublishICEConnected$lib_release(Z)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isSubscribeICEConnected$lib_release()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->ICE_ESTABLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    return-void

    :cond_0
    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p1

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/MediaServerReport;->setSubcribeICEConnected$lib_release(Z)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setSubscribeICEConnected$lib_release(Z)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isPublishICEConnected$lib_release()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p1

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->ICE_ESTABLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {p1, v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, v0}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_1
    return-void
.end method

.method public onIceCandidate(Lhms/webrtc/IceCandidate;Z)V
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "null cannot be cast to non-null type java.util.ArrayList<hms.webrtc.IceCandidate>"

    if-eqz p2, :cond_0

    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getPublishIceCandidatesGathered()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getSubscribeIceCandidatesGathered()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onInitFetched()V
    .locals 2

    const-string v0, "HMSDiagnostic"

    const-string v1, "onInitFetched"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getSignallingReport()Llive/hms/video/diagnostics/models/SignallingReport;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/SignallingReport;->setInitConnected$lib_release(Z)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->INIT_FETCHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    return-void
.end method

.method public onMediaCaptured()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_CAPTURED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    return-void
.end method

.method public onMediaPublished()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->MEDIA_PUBLISHED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    return-void
.end method

.method public onNetworkQuality(I)V
    .locals 2

    if-gez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$setLastNetworkQualityUpdatedAt$p(Llive/hms/video/diagnostics/HMSDiagnostics;J)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$addPendingCQSTillNow(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v0

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$updateAverageCQSInResult(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    return-void
.end method

.method public onRTCTrackAdded(Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 2

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    if-eqz v0, :cond_0

    const-string v0, "HMSDiagnostic"

    const-string v1, "Setting volume of remote track to 0"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type hms.webrtc.AudioTrack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lhms/webrtc/AudioTrack;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1}, Lhms/webrtc/AudioTrack;->setVolume(D)V

    :cond_0
    return-void
.end method

.method public onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getPublishICECandidatePairSelected()Llive/hms/video/diagnostics/models/IceCandidatePair;

    move-result-object p2

    if-eqz p1, :cond_0

    iget-object v1, p1, Lhms/webrtc/CandidatePairChangeEvent;->local:Lhms/webrtc/IceCandidate;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p2, v1}, Llive/hms/video/diagnostics/models/IceCandidatePair;->setLocal$lib_release(Lhms/webrtc/IceCandidate;)V

    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getPublishICECandidatePairSelected()Llive/hms/video/diagnostics/models/IceCandidatePair;

    move-result-object p2

    if-eqz p1, :cond_1

    iget-object v0, p1, Lhms/webrtc/CandidatePairChangeEvent;->remote:Lhms/webrtc/IceCandidate;

    :cond_1
    invoke-virtual {p2, v0}, Llive/hms/video/diagnostics/models/IceCandidatePair;->setRemote$lib_release(Lhms/webrtc/IceCandidate;)V

    return-void

    :cond_2
    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getSubscribeICECandidatePairSelected()Llive/hms/video/diagnostics/models/IceCandidatePair;

    move-result-object p2

    if-eqz p1, :cond_3

    iget-object v1, p1, Lhms/webrtc/CandidatePairChangeEvent;->local:Lhms/webrtc/IceCandidate;

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    invoke-virtual {p2, v1}, Llive/hms/video/diagnostics/models/IceCandidatePair;->setLocal$lib_release(Lhms/webrtc/IceCandidate;)V

    iget-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/diagnostics/models/MediaServerReport;->getSubscribeICECandidatePairSelected()Llive/hms/video/diagnostics/models/IceCandidatePair;

    move-result-object p2

    if-eqz p1, :cond_4

    iget-object v0, p1, Lhms/webrtc/CandidatePairChangeEvent;->remote:Lhms/webrtc/IceCandidate;

    :cond_4
    invoke-virtual {p2, v0}, Llive/hms/video/diagnostics/models/IceCandidatePair;->setRemote$lib_release(Lhms/webrtc/IceCandidate;)V

    return-void
.end method

.method public onWebSocketConnected(Ljava/lang/String;)V
    .locals 2

    const-string v0, "websocketUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "HMSDiagnostic"

    const-string v1, "onWebSocketConnected"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->SIGNAL_CONNECTED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->SIGNAL_CONNECTED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getSignallingReport()Llive/hms/video/diagnostics/models/SignallingReport;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/SignallingReport;->setConnected$lib_release(Z)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getSignallingReport()Llive/hms/video/diagnostics/models/SignallingReport;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/diagnostics/models/SignallingReport;->setWebsocketUrl$lib_release(Ljava/lang/String;)V

    return-void
.end method
