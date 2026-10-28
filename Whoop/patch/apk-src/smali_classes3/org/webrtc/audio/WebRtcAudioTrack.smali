.class Lorg/webrtc/audio/WebRtcAudioTrack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;
    }
.end annotation


# static fields
.field private static final AUDIO_TRACK_START:I = 0x0

.field private static final AUDIO_TRACK_STOP:I = 0x1

.field private static final AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS:J = 0x7d0L

.field private static final BITS_PER_SAMPLE:I = 0x10

.field private static final BUFFERS_PER_SECOND:I = 0x64

.field private static final CALLBACK_BUFFER_SIZE_MS:I = 0xa

.field private static final DEFAULT_USAGE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "WebRtcAudioTrackExternal"


# instance fields
.field public audioAttributes:Landroid/media/AudioAttributes;

.field private final audioManager:Landroid/media/AudioManager;

.field private final audioSamplesReadyCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;

.field private audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

.field private audioTrack:Landroid/media/AudioTrack;

.field private byteBuffer:Ljava/nio/ByteBuffer;

.field private cachedBufferSizeFactor:D

.field private cachedChannels:I

.field private cachedSampleRate:I

.field private checkPlayState:Z

.field private final context:Landroid/content/Context;

.field private emptyBytes:[B

.field private final errorCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

.field private initialBufferSizeInFrames:I

.field private nativeAudioTrack:J

.field private volatile speakerMute:Z

.field private final stateCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

.field private final threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

.field private useLowLatency:Z

.field private final volumeLogger:Lorg/webrtc/audio/VolumeLogger;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/AudioManager;)V
    .locals 9
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 1
    invoke-direct/range {v0 .. v8}, Lorg/webrtc/audio/WebRtcAudioTrack;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/media/AudioAttributes;Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;ZZ)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/media/AudioAttributes;Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;ZZ)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-direct {v0}, Lorg/webrtc/ThreadUtils$ThreadChecker;-><init>()V

    iput-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->checkPlayState:Z

    .line 5
    invoke-virtual {v0}, Lorg/webrtc/ThreadUtils$ThreadChecker;->detachThread()V

    .line 6
    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->context:Landroid/content/Context;

    .line 7
    iput-object p2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    .line 8
    iput-object p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    .line 9
    iput-object p4, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->errorCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    .line 10
    iput-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->stateCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

    if-eqz p8, :cond_0

    .line 11
    new-instance p1, Lorg/webrtc/audio/VolumeLogger;

    invoke-direct {p1, p2}, Lorg/webrtc/audio/VolumeLogger;-><init>(Landroid/media/AudioManager;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->volumeLogger:Lorg/webrtc/audio/VolumeLogger;

    .line 12
    iput-object p6, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioSamplesReadyCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;

    .line 13
    iput-boolean p7, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->useLowLatency:Z

    .line 14
    invoke-static {}, Lorg/webrtc/audio/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "ctor"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "WebRtcAudioTrackExternal"

    invoke-static {p2, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private GetPlayoutUnderrunCount()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getUnderrunCount()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public static bridge synthetic a(Lorg/webrtc/audio/WebRtcAudioTrack;)Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioSamplesReadyCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$PlaybackSamplesReadyCallback;

    return-object p0
.end method

.method private static applyAttributesOnQOrHigher(Landroid/media/AudioAttributes$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioAttributes$Builder;
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    invoke-virtual {p1}, Landroid/media/AudioAttributes;->getAllowedCapturePolicy()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/media/AudioAttributes$Builder;->setAllowedCapturePolicy(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p0

    return-object p0
.end method

.method private static assertTrue(Z)V
    .locals 1

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    const-string v0, "Expected condition to be true"

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0
.end method

.method public static bridge synthetic b(Lorg/webrtc/audio/WebRtcAudioTrack;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    return-object p0
.end method

.method public static bridge synthetic c(Lorg/webrtc/audio/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method private channelCountToConfiguration(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    return p1

    :cond_0
    const/16 p1, 0xc

    return p1
.end method

.method private static createAudioTrackBeforeOreo(IIILandroid/media/AudioAttributes;)Landroid/media/AudioTrack;
    .locals 8

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "createAudioTrackBeforeOreo"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logNativeOutputSampleRate(I)V

    new-instance v2, Landroid/media/AudioTrack;

    invoke-static {p3}, Lorg/webrtc/audio/WebRtcAudioTrack;->getAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioAttributes;

    move-result-object v3

    new-instance p3, Landroid/media/AudioFormat$Builder;

    invoke-direct {p3}, Landroid/media/AudioFormat$Builder;-><init>()V

    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object p3

    invoke-virtual {p3, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    move v5, p2

    invoke-direct/range {v2 .. v7}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v2
.end method

.method private static createAudioTrackOnOreoOrHigher(IIILandroid/media/AudioAttributes;)Landroid/media/AudioTrack;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1a
    .end annotation

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "createAudioTrackOnOreoOrHigher"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logNativeOutputSampleRate(I)V

    new-instance v0, Landroid/media/AudioTrack$Builder;

    invoke-direct {v0}, Landroid/media/AudioTrack$Builder;-><init>()V

    invoke-static {p3}, Lorg/webrtc/audio/WebRtcAudioTrack;->getAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioAttributes;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    move-result-object p3

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack$Builder;->setPerformanceMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack$Builder;->setSessionId(I)Landroid/media/AudioTrack$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(Lorg/webrtc/audio/WebRtcAudioTrack;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->checkPlayState:Z

    return p0
.end method

.method private doAudioTrackStateCallback(I)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "doAudioTrackStateCallback: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->stateCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

    if-eqz v0, :cond_2

    if-nez p1, :cond_0

    invoke-interface {v0}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;->onWebRtcAudioTrackStart()V

    return-void

    :cond_0
    const/4 v2, 0x1

    if-ne p1, v2, :cond_1

    invoke-interface {v0}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;->onWebRtcAudioTrackStop()V

    return-void

    :cond_1
    const-string p1, "Invalid audio state"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static bridge synthetic e(Lorg/webrtc/audio/WebRtcAudioTrack;)[B
    .locals 0

    iget-object p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->emptyBytes:[B

    return-object p0
.end method

.method public static bridge synthetic f(Lorg/webrtc/audio/WebRtcAudioTrack;)J
    .locals 2

    iget-wide v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->nativeAudioTrack:J

    return-wide v0
.end method

.method public static bridge synthetic g(Lorg/webrtc/audio/WebRtcAudioTrack;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->speakerMute:Z

    return p0
.end method

.method private getAudioAttributes(I)Landroid/media/AudioAttributes;
    .locals 2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/4 v0, 0x2

    .line 12
    :cond_0
    new-instance v1, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 13
    invoke-virtual {v1, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 14
    invoke-virtual {p1, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p1

    return-object p1
.end method

.method private static getAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioAttributes;
    .locals 3

    .line 1
    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    const/4 v1, 0x2

    .line 2
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    if-eqz p0, :cond_2

    .line 4
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getUsage()I

    move-result v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getUsage()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getContentType()I

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getContentType()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 8
    :cond_1
    invoke-virtual {p0}, Landroid/media/AudioAttributes;->getFlags()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setFlags(I)Landroid/media/AudioAttributes$Builder;

    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_2

    .line 10
    invoke-static {v0, p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->applyAttributesOnQOrHigher(Landroid/media/AudioAttributes$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    .line 11
    :cond_2
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object p0

    return-object p0
.end method

.method private getBufferSizeInFrames()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result v0

    return v0
.end method

.method private getInitialBufferSizeInFrames()I
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->initialBufferSizeInFrames:I

    return v0
.end method

.method private getStreamMaxVolume()I
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "getStreamMaxVolume"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    return v0
.end method

.method private getStreamVolume()I
    .locals 2
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "getStreamVolume"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    return v0
.end method

.method public static bridge synthetic h(Lorg/webrtc/audio/WebRtcAudioTrack;)Z
    .locals 0

    iget-boolean p0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->useLowLatency:Z

    return p0
.end method

.method public static bridge synthetic i(Lorg/webrtc/audio/WebRtcAudioTrack;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->doAudioTrackStateCallback(I)V

    return-void
.end method

.method private initPlayout(IIDZ)I
    .locals 4
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    if-eqz p5, :cond_0

    iget-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {p5}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    :cond_0
    iput p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedSampleRate:I

    iput p2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedChannels:I

    iput-wide p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedBufferSizeFactor:D

    const-string p5, ", channels="

    const-string v0, ", bufferSizeFactor="

    const-string v1, "initPlayout(sampleRate="

    invoke-static {p1, p2, v1, p5, v0}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p5

    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const-string v0, "WebRtcAudioTrackExternal"

    invoke-static {v0, p5}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    mul-int/lit8 p5, p2, 0x2

    div-int/lit8 v1, p1, 0x64

    mul-int/2addr v1, p5

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p5

    iput-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p5}, Ljava/nio/Buffer;->capacity()I

    move-result p5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "byteBuffer.capacity: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {v0, p5}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p5}, Ljava/nio/Buffer;->capacity()I

    move-result p5

    new-array p5, p5, [B

    iput-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->emptyBytes:[B

    iget-wide v1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->nativeAudioTrack:J

    iget-object p5, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-static {v1, v2, p5}, Lorg/webrtc/audio/WebRtcAudioTrack;->nativeCacheDirectBufferAddress(JLjava/nio/ByteBuffer;)V

    invoke-direct {p0, p2}, Lorg/webrtc/audio/WebRtcAudioTrack;->channelCountToConfiguration(I)I

    move-result p2

    const/4 p5, 0x2

    invoke-static {p1, p2, p5}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result p5

    int-to-double v1, p5

    mul-double/2addr v1, p3

    double-to-int p5, v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "minBufferSizeInBytes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    const/4 v1, -0x1

    if-ge p5, v0, :cond_1

    const-string p1, "AudioTrack.getMinBufferSize returns an invalid value."

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    return v1

    :cond_1
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpl-double p3, p3, v2

    if-lez p3, :cond_2

    const/4 p3, 0x0

    iput-boolean p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->useLowLatency:Z

    :cond_2
    iget-object p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz p3, :cond_3

    const-string p1, "Conflict with existing AudioTrack."

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    return v1

    :cond_3
    :try_start_0
    iget-boolean p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->useLowLatency:Z

    if-eqz p3, :cond_4

    iget-object p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {p1, p2, p5, p3}, Lorg/webrtc/audio/WebRtcAudioTrack;->createAudioTrackOnOreoOrHigher(IIILandroid/media/AudioAttributes;)Landroid/media/AudioTrack;

    move-result-object p1

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_4
    iget-object p3, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    invoke-static {p1, p2, p5, p3}, Lorg/webrtc/audio/WebRtcAudioTrack;->createAudioTrackBeforeOreo(IIILandroid/media/AudioAttributes;)Landroid/media/AudioTrack;

    move-result-object p1

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_5

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result p1

    iput p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->initialBufferSizeInFrames:I

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logMainParameters()V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logMainParametersExtended()V

    return p5

    :cond_6
    :goto_1
    const-string p1, "Initialization of audio track failed."

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->releaseAudioResources()V

    return v1

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->releaseAudioResources()V

    return v1
.end method

.method public static bridge synthetic j(Lorg/webrtc/audio/WebRtcAudioTrack;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackError(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic k(Z)V
    .locals 0

    invoke-static {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->assertTrue(Z)V

    return-void
.end method

.method public static bridge synthetic l(IJ)V
    .locals 0

    invoke-static {p1, p2, p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->nativeGetPlayoutData(JI)V

    return-void
.end method

.method private logBufferCapacityInFrames()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferCapacityInFrames()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AudioTrack: buffer capacity in frames: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logBufferSizeInFrames()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "AudioTrack: buffer size in frames: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logMainParameters()V
    .locals 7

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iget-object v1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getChannelCount()I

    move-result v1

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v2}, Landroid/media/AudioTrack;->getSampleRate()I

    move-result v2

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v3

    const-string v4, ", channels: "

    const-string v5, ", sample rate: "

    const-string v6, "AudioTrack: session ID: "

    invoke-static {v0, v1, v6, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", max gain: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logMainParametersExtended()V
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logBufferSizeInFrames()V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logBufferCapacityInFrames()V

    return-void
.end method

.method private static logNativeOutputSampleRate(I)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/media/AudioTrack;->getNativeOutputSampleRate(I)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "nativeOutputSampleRate: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WebRtcAudioTrackExternal"

    invoke-static {v2, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eq p0, v0, :cond_0

    const-string p0, "Unable to use fast mode since requested sample rate is not native"

    invoke-static {v2, p0}, Lorg/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private logUnderrunCount()V
    .locals 3

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getUnderrunCount()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "underrun count: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static native nativeCacheDirectBufferAddress(JLjava/nio/ByteBuffer;)V
.end method

.method private static native nativeGetPlayoutData(JI)V
.end method

.method private releaseAudioResources()V
    .locals 2

    const-string v0, "WebRtcAudioTrackExternal"

    const-string v1, "releaseAudioResources"

    invoke-static {v0, v1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioTrackError(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Run-time playback error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->context:Landroid/content/Context;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-static {v1, v0, v2}, Lorg/webrtc/audio/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;Landroid/content/Context;Landroid/media/AudioManager;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->errorCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;->onWebRtcAudioTrackError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioTrackInitError(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Init playout error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->context:Landroid/content/Context;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-static {v1, v0, v2}, Lorg/webrtc/audio/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;Landroid/content/Context;Landroid/media/AudioManager;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->errorCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;->onWebRtcAudioTrackInitError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioTrackStartError(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Start playout error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->context:Landroid/content/Context;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-static {v1, v0, v2}, Lorg/webrtc/audio/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;Landroid/content/Context;Landroid/media/AudioManager;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->errorCallback:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;->onWebRtcAudioTrackStartError(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setStreamVolume(I)Z
    .locals 3
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setStreamVolume("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isVolumeFixed()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const-string p1, "The device implements a fixed volume policy."

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0, v2, p1, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    const/4 p1, 0x1

    return p1
.end method

.method private startPlayout(Z)Z
    .locals 3
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {p1}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    :cond_0
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->volumeLogger:Lorg/webrtc/audio/VolumeLogger;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/webrtc/audio/VolumeLogger;->start()V

    :cond_1
    const-string p1, "WebRtcAudioTrackExternal"

    const-string v0, "startPlayout"

    invoke-static {p1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    move p1, v0

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    invoke-static {p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->assertTrue(Z)V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    if-nez p1, :cond_3

    move p1, v0

    goto :goto_1

    :cond_3
    move p1, v1

    :goto_1
    invoke-static {p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->assertTrue(Z)V

    :try_start_0
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->play()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result p1

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    sget-object p1, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->AUDIO_TRACK_START_STATE_MISMATCH:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const-string v2, "AudioTrack.play failed - incorrect state :"

    invoke-static {v0, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackStartError(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->releaseAudioResources()V

    return v1

    :cond_4
    new-instance p1, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    const-string v1, "AudioTrackJavaThread"

    invoke-direct {p1, p0, v1}, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;-><init>(Lorg/webrtc/audio/WebRtcAudioTrack;Ljava/lang/String;)V

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return v0

    :catch_0
    move-exception p1

    sget-object v0, Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;->AUDIO_TRACK_START_EXCEPTION:Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v2, "AudioTrack.play failed: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->reportWebRtcAudioTrackStartError(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->releaseAudioResources()V

    return v1
.end method

.method private stopPlayout(Z)Z
    .locals 4
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    if-eqz p1, :cond_0

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->threadChecker:Lorg/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {p1}, Lorg/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    :cond_0
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->volumeLogger:Lorg/webrtc/audio/VolumeLogger;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/webrtc/audio/VolumeLogger;->stop()V

    :cond_1
    const-string p1, "stopPlayout"

    const-string v0, "WebRtcAudioTrackExternal"

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    move p1, v1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->assertTrue(Z)V

    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->logUnderrunCount()V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {p1}, Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;->stopThread()V

    const-string p1, "Stopping the AudioTrackThread..."

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    const-wide/16 v2, 0x7d0

    invoke-static {p1, v2, v3}, Lorg/webrtc/ThreadUtils;->joinUninterruptibly(Ljava/lang/Thread;J)Z

    move-result p1

    if-nez p1, :cond_3

    const-string p1, "Join of AudioTrackThread timed out."

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->context:Landroid/content/Context;

    iget-object v2, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-static {v0, p1, v2}, Lorg/webrtc/audio/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;Landroid/content/Context;Landroid/media/AudioManager;)V

    :cond_3
    const-string p1, "AudioTrackThread has now been stopped."

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioThread:Lorg/webrtc/audio/WebRtcAudioTrack$AudioTrackThread;

    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz p1, :cond_4

    const-string p1, "Calling AudioTrack.stop..."

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V

    const-string p1, "AudioTrack.stop is done."

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lorg/webrtc/audio/WebRtcAudioTrack;->doAudioTrackStateCallback(I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AudioTrack.stop failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-direct {p0}, Lorg/webrtc/audio/WebRtcAudioTrack;->releaseAudioResources()V

    return v1
.end method


# virtual methods
.method public setNativeAudioTrack(J)V
    .locals 0
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation

    iput-wide p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->nativeAudioTrack:J

    return-void
.end method

.method public setSpeakerMute(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setSpeakerMute("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->speakerMute:Z

    return-void
.end method

.method public updateAudioTrackUsage(I)Z
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "updateAudioTrackUsage(usage="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrackExternal"

    invoke-static {v1, v0}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->getAudioAttributes(I)Landroid/media/AudioAttributes;

    move-result-object p1

    iput-object p1, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    return v2

    :cond_0
    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/AudioAttributes;->getUsage()I

    move-result v0

    if-ne v0, p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Usage is already set to "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", no update needed"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    iget-object v0, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v4, 0x3

    if-ne v0, v4, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v3

    :goto_0
    if-eqz v0, :cond_3

    const-string v4, "Stopping current playout for usage change"

    invoke-static {v1, v4}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lorg/webrtc/audio/WebRtcAudioTrack;->stopPlayout(Z)Z

    move-result v4

    if-nez v4, :cond_3

    const-string p1, "Failed to stop playout before usage change"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_3
    invoke-direct {p0, p1}, Lorg/webrtc/audio/WebRtcAudioTrack;->getAudioAttributes(I)Landroid/media/AudioAttributes;

    move-result-object v4

    iput-object v4, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->audioAttributes:Landroid/media/AudioAttributes;

    iget v6, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedSampleRate:I

    iget v7, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedChannels:I

    iget-wide v8, p0, Lorg/webrtc/audio/WebRtcAudioTrack;->cachedBufferSizeFactor:D

    const-string v4, ", channels="

    const-string v5, ", usage="

    const-string v10, "Using cached sampleRate="

    invoke-static {v6, v7, v10, v4, v5}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x0

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Lorg/webrtc/audio/WebRtcAudioTrack;->initPlayout(IIDZ)I

    move-result v4

    if-gez v4, :cond_4

    const-string p1, "Failed to reinitialize AudioTrack with new usage"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Successfully updated usage to "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_5

    const-string p1, "Restarting playout with new usage"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lorg/webrtc/audio/WebRtcAudioTrack;->startPlayout(Z)Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "Failed to restart playout after usage change"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_5
    return v2
.end method
