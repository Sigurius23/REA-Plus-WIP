.class Lhms/webrtc/audio/VolumeLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/audio/VolumeLogger$LogVolumeTask;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "VolumeLogger"

.field private static final THREAD_NAME:Ljava/lang/String; = "WebRtcVolumeLevelLoggerThread"

.field private static final TIMER_PERIOD_IN_SECONDS:I = 0x1e


# instance fields
.field private final audioManager:Landroid/media/AudioManager;

.field private timer:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Landroid/media/AudioManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/audio/VolumeLogger;->audioManager:Landroid/media/AudioManager;

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/audio/VolumeLogger;)Landroid/media/AudioManager;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/audio/VolumeLogger;->audioManager:Landroid/media/AudioManager;

    return-object p0
.end method


# virtual methods
.method public start()V
    .locals 9

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "start"

    const-string v2, "VolumeLogger"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/VolumeLogger;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lhms/webrtc/audio/VolumeLogger;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    invoke-static {v0}, Lhms/webrtc/audio/WebRtcAudioUtils;->modeToString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "audio mode is: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/util/Timer;

    const-string v0, "WebRtcVolumeLevelLoggerThread"

    invoke-direct {v3, v0}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lhms/webrtc/audio/VolumeLogger;->timer:Ljava/util/Timer;

    new-instance v4, Lhms/webrtc/audio/VolumeLogger$LogVolumeTask;

    iget-object v0, p0, Lhms/webrtc/audio/VolumeLogger;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    iget-object v1, p0, Lhms/webrtc/audio/VolumeLogger;->audioManager:Landroid/media/AudioManager;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    invoke-direct {v4, p0, v0, v1}, Lhms/webrtc/audio/VolumeLogger$LogVolumeTask;-><init>(Lhms/webrtc/audio/VolumeLogger;II)V

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x7530

    invoke-virtual/range {v3 .. v8}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public stop()V
    .locals 3

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "stop"

    const-string v2, "VolumeLogger"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/VolumeLogger;->timer:Ljava/util/Timer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/audio/VolumeLogger;->timer:Ljava/util/Timer;

    :cond_0
    return-void
.end method
