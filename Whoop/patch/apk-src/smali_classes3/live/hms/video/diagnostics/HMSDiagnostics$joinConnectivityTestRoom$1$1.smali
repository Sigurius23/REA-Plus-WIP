.class public final Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/HMSUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000W\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008&\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "live/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1",
        "Llive/hms/video/sdk/HMSUpdateListener;",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "room",
        "Ll83/a0;",
        "onJoin",
        "(Llive/hms/video/sdk/models/HMSRoom;)V",
        "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "type",
        "hmsRoom",
        "onRoomUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V",
        "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peer",
        "onPeerUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V",
        "Llive/hms/video/sdk/models/enums/HMSTrackUpdate;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onTrackUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V",
        "Llive/hms/video/sdk/models/HMSRoleChangeRequest;",
        "request",
        "onRoleChangeRequest",
        "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V",
        "Llive/hms/video/sdk/models/HMSMessage;",
        "message",
        "onMessageReceived",
        "(Llive/hms/video/sdk/models/HMSMessage;)V",
        "Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;",
        "details",
        "onChangeTrackStateRequest",
        "(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onReconnecting",
        "(Llive/hms/video/error/HMSException;)V",
        "onError",
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
.field final synthetic $timeInMillis:J

.field final synthetic this$0:Llive/hms/video/diagnostics/HMSDiagnostics;


# direct methods
.method public constructor <init>(Llive/hms/video/diagnostics/HMSDiagnostics;J)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iput-wide p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->$timeInMillis:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    invoke-static {p0}, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->onJoin$lambda$0(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    return-void
.end method

.method private static final onJoin$lambda$0(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$leaveConnectivityTestRoom(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    return-void
.end method


# virtual methods
.method public onChangeTrackStateRequest(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V
    .locals 1

    const-string v0, "details"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "error :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDiagnostic"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getErrors()Ljava/util/List;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.error.HMSException>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->isTerminal()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Terminal error received. Completing the test"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$handleTestCompletion(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    :cond_0
    return-void
.end method

.method public onJoin(Llive/hms/video/sdk/models/HMSRoom;)V
    .locals 4

    const-string v0, "room"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "HMSDiagnostic"

    const-string v0, "Joined Diagnostic room"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getDelegate$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/sdk/SDKDelegate;

    move-result-object p1

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1;

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-direct {v0, v1}, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1$onJoin$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    invoke-virtual {p1, v0}, Llive/hms/video/sdk/SDKDelegate;->addStatsObserver(Llive/hms/video/connection/stats/HMSStatsObserver;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-virtual {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->getHandler()Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    new-instance v1, Lio/sentry/c7;

    const/16 v2, 0x1b

    invoke-direct {v1, v0, v2}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    iget-wide v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->$timeInMillis:J

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onMessageReceived(Llive/hms/video/sdk/models/HMSMessage;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPeerUpdate(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "peer"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPermissionsRequested(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->onPermissionsRequested(Llive/hms/video/sdk/HMSUpdateListener;Ljava/util/List;)V

    return-void
.end method

.method public onReconnected()V
    .locals 0

    invoke-static {p0}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->onReconnected(Llive/hms/video/sdk/HMSUpdateListener;)V

    return-void
.end method

.method public onReconnecting(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "HMSDiagnostic"

    const-string v0, "onReconnecting"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$addPendingCQSTillNow(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$updateAverageCQSInResult(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    return-void
.end method

.method public onRemovedFromRoom(Llive/hms/video/sdk/models/HMSRemovedFromRoom;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->onRemovedFromRoom(Llive/hms/video/sdk/HMSUpdateListener;Llive/hms/video/sdk/models/HMSRemovedFromRoom;)V

    return-void
.end method

.method public onRoleChangeRequest(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onRoomUpdate(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hmsRoom"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onSessionStoreAvailable(Llive/hms/video/sessionstore/HmsSessionStore;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->onSessionStoreAvailable(Llive/hms/video/sdk/HMSUpdateListener;Llive/hms/video/sessionstore/HmsSessionStore;)V

    return-void
.end method

.method public onTrackUpdate(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "onTrackUpdate :: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " track :: "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSDiagnostic"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onTranscripts(Llive/hms/video/sdk/transcripts/HmsTranscripts;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->onTranscripts(Llive/hms/video/sdk/HMSUpdateListener;Llive/hms/video/sdk/transcripts/HmsTranscripts;)V

    return-void
.end method

.method public peerListUpdated(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;->peerListUpdated(Llive/hms/video/sdk/HMSUpdateListener;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
