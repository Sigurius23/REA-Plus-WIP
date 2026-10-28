.class public final Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/connection/stats/HMSStatsObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->onJoin(Llive/hms/video/sdk/models/HMSRoom;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "live/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1",
        "Llive/hms/video/connection/stats/HMSStatsObserver;",
        "Llive/hms/video/connection/stats/HMSRTCStatsReport;",
        "rtcStats",
        "Ll83/a0;",
        "onRTCStats",
        "(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V",
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

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocalAudioStats(Llive/hms/video/connection/stats/HMSLocalAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/connection/stats/HMSStatsObserver$DefaultImpls;->onLocalAudioStats(Llive/hms/video/connection/stats/HMSStatsObserver;Llive/hms/video/connection/stats/HMSLocalAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    return-void
.end method

.method public onLocalVideoStats(Ljava/util/List;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/connection/stats/HMSLocalVideoStats;",
            ">;",
            "Llive/hms/video/media/tracks/HMSTrack;",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ")V"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/connection/stats/HMSStatsObserver$DefaultImpls;->onLocalVideoStats(Llive/hms/video/connection/stats/HMSStatsObserver;Ljava/util/List;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    return-void
.end method

.method public onRTCStats(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V
    .locals 2

    const-string v0, "rtcStats"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cumulative stats: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDiagnostic"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object v0

    invoke-virtual {v0, p1}, Llive/hms/video/diagnostics/models/MediaServerReport;->setStats$lib_release(Llive/hms/video/connection/stats/HMSRTCStatsReport;)V

    return-void
.end method

.method public onRemoteAudioStats(Llive/hms/video/connection/stats/HMSRemoteAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/connection/stats/HMSStatsObserver$DefaultImpls;->onRemoteAudioStats(Llive/hms/video/connection/stats/HMSStatsObserver;Llive/hms/video/connection/stats/HMSRemoteAudioStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    return-void
.end method

.method public onRemoteVideoStats(Llive/hms/video/connection/stats/HMSRemoteVideoStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/connection/stats/HMSStatsObserver$DefaultImpls;->onRemoteVideoStats(Llive/hms/video/connection/stats/HMSStatsObserver;Llive/hms/video/connection/stats/HMSRemoteVideoStats;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    return-void
.end method
