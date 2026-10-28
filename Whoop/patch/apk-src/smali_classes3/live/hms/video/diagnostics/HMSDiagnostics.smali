.class public final Llive/hms/video/diagnostics/HMSDiagnostics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/diagnostics/HMSDiagnostics$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001;\u0018\u0000 O2\u00020\u0001:\u0001OB\u001b\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J\r\u0010\u0017\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J)\u0010\u001d\u001a\u00020\u000c2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u001f\u0010\u0010J\u000f\u0010 \u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008 \u0010\u0010J\u000f\u0010!\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008$\u0010\u0010J\u000f\u0010%\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008%\u0010\u0010J\u001f\u0010\'\u001a\u00020\u000c2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00104\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0017\u00107\u001a\u0002068\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u001e\u0010G\u001a\n\u0018\u00010Ej\u0004\u0018\u0001`F8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010N\u00a8\u0006P"
    }
    d2 = {
        "Llive/hms/video/diagnostics/HMSDiagnostics;",
        "",
        "Llive/hms/video/sdk/SDKDelegate;",
        "delegate",
        "",
        "customerUserId",
        "<init>",
        "(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)V",
        "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;",
        "cameraFacing",
        "Llive/hms/video/diagnostics/HMSCameraCheckListener;",
        "listener",
        "Ll83/a0;",
        "startCameraCheck",
        "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;)V",
        "stopCameraCheck",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;",
        "startMicCheck",
        "(Landroid/content/Context;Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;)V",
        "stopMicCheck",
        "startSpeakerCheck",
        "stopSpeakerCheck",
        "region",
        "Llive/hms/video/diagnostics/ConnectivityCheckListener;",
        "",
        "timeInMillis",
        "startConnectivityCheck",
        "(Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;J)V",
        "stopConnectivityCheck",
        "updateAverageCQSInResult",
        "setConnectivityCheckValues",
        "tearDownDiagnostic",
        "leaveConnectivityTestRoom",
        "addPendingCQSTillNow",
        "handleTestCompletion",
        "authToken",
        "joinConnectivityTestRoom",
        "(Ljava/lang/String;J)V",
        "Llive/hms/video/sdk/SDKDelegate;",
        "connectivityCheckListener",
        "Llive/hms/video/diagnostics/ConnectivityCheckListener;",
        "Llive/hms/video/diagnostics/models/ConnectivityCheckResult;",
        "result",
        "Llive/hms/video/diagnostics/models/ConnectivityCheckResult;",
        "Landroid/media/MediaRecorder;",
        "recorder",
        "Landroid/media/MediaRecorder;",
        "recordingPath",
        "Ljava/lang/String;",
        "lastNetworkQualityUpdatedAt",
        "J",
        "Landroid/os/Handler;",
        "handler",
        "Landroid/os/Handler;",
        "getHandler",
        "()Landroid/os/Handler;",
        "live/hms/video/diagnostics/HMSDiagnostics$transportListener$1",
        "transportListener",
        "Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;",
        "Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "videoTrack",
        "Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "getVideoTrack",
        "()Llive/hms/video/media/tracks/HMSLocalVideoTrack;",
        "setVideoTrack",
        "(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V",
        "Ljava/lang/Runnable;",
        "Lkotlinx/coroutines/Runnable;",
        "runnable",
        "Ljava/lang/Runnable;",
        "Landroid/media/MediaPlayer;",
        "mp",
        "Landroid/media/MediaPlayer;",
        "",
        "isPreparing",
        "Z",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/diagnostics/HMSDiagnostics$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSDiagnostic"


# instance fields
.field private connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

.field private final delegate:Llive/hms/video/sdk/SDKDelegate;

.field private final handler:Landroid/os/Handler;

.field private isPreparing:Z

.field private lastNetworkQualityUpdatedAt:J

.field private mp:Landroid/media/MediaPlayer;

.field private recorder:Landroid/media/MediaRecorder;

.field private recordingPath:Ljava/lang/String;

.field private result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

.field private runnable:Ljava/lang/Runnable;

.field private final transportListener:Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;

.field private videoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/diagnostics/HMSDiagnostics$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/diagnostics/HMSDiagnostics;->Companion:Llive/hms/video/diagnostics/HMSDiagnostics$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Ljava/lang/String;)V
    .locals 0

    const-string p2, "delegate"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->delegate:Llive/hms/video/sdk/SDKDelegate;

    new-instance p2, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-direct {p2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;-><init>()V

    iput-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKDelegate;->startAudioManager$lib_release()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->handler:Landroid/os/Handler;

    new-instance p1, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;

    invoke-direct {p1, p0}, Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->transportListener:Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/diagnostics/HMSDiagnostics;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->startSpeakerCheck$lambda$3(Llive/hms/video/diagnostics/HMSDiagnostics;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static final synthetic access$addPendingCQSTillNow(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->addPendingCQSTillNow()V

    return-void
.end method

.method public static final synthetic access$getConnectivityCheckListener$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/ConnectivityCheckListener;
    .locals 0

    iget-object p0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    return-object p0
.end method

.method public static final synthetic access$getDelegate$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/sdk/SDKDelegate;
    .locals 0

    iget-object p0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->delegate:Llive/hms/video/sdk/SDKDelegate;

    return-object p0
.end method

.method public static final synthetic access$getRecorder$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Landroid/media/MediaRecorder;
    .locals 0

    iget-object p0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    return-object p0
.end method

.method public static final synthetic access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;
    .locals 0

    iget-object p0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    return-object p0
.end method

.method public static final synthetic access$getRunnable$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->runnable:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static final synthetic access$handleTestCompletion(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->handleTestCompletion()V

    return-void
.end method

.method public static final synthetic access$joinConnectivityTestRoom(Llive/hms/video/diagnostics/HMSDiagnostics;Ljava/lang/String;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/diagnostics/HMSDiagnostics;->joinConnectivityTestRoom(Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic access$leaveConnectivityTestRoom(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->leaveConnectivityTestRoom()V

    return-void
.end method

.method public static final synthetic access$setLastNetworkQualityUpdatedAt$p(Llive/hms/video/diagnostics/HMSDiagnostics;J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->lastNetworkQualityUpdatedAt:J

    return-void
.end method

.method public static final synthetic access$updateAverageCQSInResult(Llive/hms/video/diagnostics/HMSDiagnostics;)V
    .locals 0

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->updateAverageCQSInResult()V

    return-void
.end method

.method private final addPendingCQSTillNow()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->lastNetworkQualityUpdatedAt:J

    sub-long/2addr v0, v2

    const/16 v2, 0x3e8

    int-to-long v2, v2

    div-long/2addr v0, v2

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v2}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v3}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-wide/16 v2, -0x1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->lastNetworkQualityUpdatedAt:J

    :cond_1
    return-void
.end method

.method private final handleTestCompletion()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->COMPLETED:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    if-eqz v0, :cond_1

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onCompleted(Llive/hms/video/diagnostics/models/ConnectivityCheckResult;)V

    :cond_1
    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->tearDownDiagnostic()V

    return-void
.end method

.method private final joinConnectivityTestRoom(Ljava/lang/String;J)V
    .locals 10

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->delegate:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->transportListener:Llive/hms/video/diagnostics/HMSDiagnostics$transportListener$1;

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/SDKDelegate;->addDiagnosticListener(Llive/hms/video/diagnostics/ITransportListener;)V

    new-instance v2, Llive/hms/video/sdk/models/HMSConfig;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const-string v3, "diagnostic-test"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-direct/range {v2 .. v9}, Llive/hms/video/sdk/models/HMSConfig;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    move-object v4, v2

    new-instance v2, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1;

    move-object v3, p0

    move-wide v5, p2

    invoke-direct/range {v2 .. v7}, Llive/hms/video/diagnostics/HMSDiagnostics$joinConnectivityTestRoom$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/sdk/models/HMSConfig;JLq83/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, p3, v2, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final leaveConnectivityTestRoom()V
    .locals 4

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/diagnostics/HMSDiagnostics$leaveConnectivityTestRoom$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llive/hms/video/diagnostics/HMSDiagnostics$leaveConnectivityTestRoom$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final setConnectivityCheckValues()V
    .locals 3

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    sget-object v1, Llive/hms/video/diagnostics/models/ConnectivityState;->STARTING:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Llive/hms/video/diagnostics/ConnectivityCheckListener;->onConnectivityStateChanged(Llive/hms/video/diagnostics/models/ConnectivityState;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->setTestTimestamp$lib_release(Ljava/lang/Long;)V

    return-void
.end method

.method public static synthetic startCameraCheck$default(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p1, Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;->FRONT:Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics;->startCameraCheck(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;)V

    return-void
.end method

.method public static synthetic startConnectivityCheck$default(Llive/hms/video/diagnostics/HMSDiagnostics;Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;JILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/16 p3, 0x4e20

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/diagnostics/HMSDiagnostics;->startConnectivityCheck(Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;J)V

    return-void
.end method

.method private static final startSpeakerCheck$lambda$3(Llive/hms/video/diagnostics/HMSDiagnostics;Landroid/media/MediaPlayer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->isPreparing:Z

    return-void
.end method

.method private final tearDownDiagnostic()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    new-instance v0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->lastNetworkQualityUpdatedAt:J

    return-void
.end method

.method private final updateAverageCQSInResult()V
    .locals 7

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getNetworkQualityValues$lib_release()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    float-to-double v5, v5

    add-double/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->c0()V

    const/4 v0, 0x0

    throw v0

    :cond_1
    if-nez v4, :cond_2

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    goto :goto_1

    :cond_2
    int-to-double v4, v4

    div-double v1, v2, v4

    :goto_1
    double-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/MediaServerReport;->setConnectionQualityScore$lib_release(Ljava/lang/Float;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final getHandler()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public final getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->videoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    return-object v0
.end method

.method public final setVideoTrack(Llive/hms/video/media/tracks/HMSLocalVideoTrack;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->videoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    return-void
.end method

.method public final startCameraCheck(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/diagnostics/HMSCameraCheckListener;)V
    .locals 2

    const-string v0, "cameraFacing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "listener"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Llive/hms/video/diagnostics/HMSDiagnostics$startCameraCheck$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/diagnostics/HMSCameraCheckListener;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v1, v1, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final startConnectivityCheck(Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;J)V
    .locals 6

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "HMSDiagnostic"

    const-string v1, "startConnectivityCheck called"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->connectivityCheckListener:Llive/hms/video/diagnostics/ConnectivityCheckListener;

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->setConnectivityCheckValues()V

    sget-object p2, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;

    const/4 v5, 0x0

    move-object v2, p0

    move-object v1, p1

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;-><init>(Ljava/lang/String;Llive/hms/video/diagnostics/HMSDiagnostics;JLq83/d;)V

    const/4 p1, 0x3

    const/4 p3, 0x0

    invoke-static {p2, p3, p3, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final startMicCheck(Landroid/content/Context;Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/media/MediaRecorder;

    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$startMicCheck$$inlined$Runnable$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startMicCheck$$inlined$Runnable$1;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;)V

    iput-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->runnable:Ljava/lang/Runnable;

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->runnable:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    iget-object v3, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->handler:Landroid/os/Handler;

    const-wide/16 v4, 0xa

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    :cond_2
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string v3, "MediaUtil#micAvailTestFile"

    invoke-direct {v0, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recordingPath:Ljava/lang/String;

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    :cond_4
    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->prepare()V

    :cond_5
    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/media/MediaRecorder;->start()V

    :cond_6
    invoke-interface {p2}, Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;->onSuccess()V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getAudioInputReport()Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

    move-result-object p1

    invoke-virtual {p1, v2}, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;->setPassed(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v5, p1

    goto :goto_4

    :cond_8
    :goto_3
    const-string p1, "Exception in starting mic"

    goto :goto_2

    :goto_4
    sget-object v2, Llive/hms/video/error/ErrorFactory$TracksErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$TracksErrors;

    sget-object v3, Llive/hms/video/error/ErrorFactory$Action;->TRACK:Llive/hms/video/error/ErrorFactory$Action;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v9, 0x30

    const/4 v10, 0x0

    const-string v4, "microphone"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Llive/hms/video/error/ErrorFactory$TracksErrors;->CantAccessCaptureDevice$default(Llive/hms/video/error/ErrorFactory$TracksErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    invoke-interface {p2, p1}, Llive/hms/video/diagnostics/HMSAudioDeviceCheckListener;->onError(Llive/hms/video/error/HMSException;)V

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getAudioInputReport()Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

    move-result-object p1

    invoke-virtual {p1, v1}, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;->setPassed(Z)V

    return-void
.end method

.method public final startSpeakerCheck()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->isPreparing:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    iput-boolean v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->isPreparing:Z

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recordingPath:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    iget-object v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recordingPath:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_1
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_4

    const-string v2, "https://100ms.live/test-audio.wav"

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    :cond_4
    :goto_2
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_5

    new-instance v2, Llive/hms/video/diagnostics/a;

    invoke-direct {v2, p0}, Llive/hms/video/diagnostics/a;-><init>(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    invoke-virtual {v0, v2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    :cond_5
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    :cond_6
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getAudioOutputReport()Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

    move-result-object v0

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;->setPassed(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, " error while playing :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDiagnostic"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->result:Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/DeviceTestReport;->getAudioOutputReport()Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;->setPassed(Z)V

    return-void
.end method

.method public final stopCameraCheck()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->videoTrack:Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->stopCapturing$lib_release()V

    :cond_0
    return-void
.end method

.method public final stopConnectivityCheck()V
    .locals 2

    const-string v0, "HMSDiagnostic"

    const-string v1, "stopConnectivityCheck called"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/diagnostics/HMSDiagnostics;->leaveConnectivityTestRoom()V

    return-void
.end method

.method public final stopMicCheck()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->handler:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->recorder:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    :cond_1
    return-void
.end method

.method public final stopSpeakerCheck()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_0
    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics;->mp:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method
