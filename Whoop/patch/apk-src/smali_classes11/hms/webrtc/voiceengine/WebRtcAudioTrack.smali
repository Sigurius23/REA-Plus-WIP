.class public Lhms/webrtc/voiceengine/WebRtcAudioTrack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;,
        Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;,
        Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;,
        Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;
    }
.end annotation


# static fields
.field private static final AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS:J = 0x7d0L

.field private static final BITS_PER_SAMPLE:I = 0x10

.field private static final BUFFERS_PER_SECOND:I = 0x64

.field private static final CALLBACK_BUFFER_SIZE_MS:I = 0xa

.field private static final DEBUG:Z = false

.field private static final DEFAULT_USAGE:I = 0x2

.field private static final TAG:Ljava/lang/String; = "WebRtcAudioTrack"

.field private static errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback; = null

.field private static errorCallbackOld:Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback; = null

.field private static volatile speakerMute:Z = false

.field private static usageAttribute:I = 0x2


# instance fields
.field private final audioManager:Landroid/media/AudioManager;

.field private audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

.field private audioTrack:Landroid/media/AudioTrack;

.field private byteBuffer:Ljava/nio/ByteBuffer;

.field private emptyBytes:[B

.field private final nativeAudioTrack:J

.field private final threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;


# direct methods
.method public constructor <init>(J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-direct {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;-><init>()V

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ctor"

    const-string v2, "WebRtcAudioTrack"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-wide p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->nativeAudioTrack:J

    invoke-static {}, Lhms/webrtc/ContextUtils;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/voiceengine/WebRtcAudioTrack;)Landroid/media/AudioTrack;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

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

.method public static bridge synthetic b(Lhms/webrtc/voiceengine/WebRtcAudioTrack;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static bridge synthetic c(Lhms/webrtc/voiceengine/WebRtcAudioTrack;)[B
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->emptyBytes:[B

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

.method private static createAudioTrack(III)Landroid/media/AudioTrack;
    .locals 9

    const-string v0, "createAudioTrack"

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/media/AudioTrack;->getNativeOutputSampleRate(I)I

    move-result v0

    const-string v2, "nativeOutputSampleRate: "

    invoke-static {v0, v2, v1}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    if-eq p0, v0, :cond_0

    const-string v0, "Unable to use fast mode since requested sample rate is not native"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->usageAttribute:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "A non default usage attribute is used: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v3, Landroid/media/AudioTrack;

    new-instance v0, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v0}, Landroid/media/AudioAttributes$Builder;-><init>()V

    sget v1, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->usageAttribute:I

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v4

    new-instance v0, Landroid/media/AudioFormat$Builder;

    invoke-direct {v0}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v0, v2}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    move v6, p2

    invoke-direct/range {v3 .. v8}, Landroid/media/AudioTrack;-><init>(Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V

    return-object v3
.end method

.method public static bridge synthetic d(Lhms/webrtc/voiceengine/WebRtcAudioTrack;)J
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->nativeAudioTrack:J

    return-wide v0
.end method

.method public static bridge synthetic e(Lhms/webrtc/voiceengine/WebRtcAudioTrack;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->nativeGetPlayoutData(IJ)V

    return-void
.end method

.method public static bridge synthetic f(Lhms/webrtc/voiceengine/WebRtcAudioTrack;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackError(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic g()Z
    .locals 1

    sget-boolean v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->speakerMute:Z

    return v0
.end method

.method private getBufferSizeInFrames()I
    .locals 1

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result v0

    return v0
.end method

.method private getStreamMaxVolume()I
    .locals 2

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "getStreamMaxVolume"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v0

    return v0
.end method

.method private getStreamVolume()I
    .locals 2

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "getStreamVolume"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v0

    return v0
.end method

.method public static bridge synthetic h(Z)V
    .locals 0

    invoke-static {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    return-void
.end method

.method private initPlayout(IID)I
    .locals 4

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initPlayout(sampleRate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", channels="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bufferSizeFactor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    mul-int/lit8 v0, p2, 0x2

    div-int/lit8 v2, p1, 0x64

    mul-int/2addr v2, v0

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    const-string v2, "byteBuffer.capacity: "

    invoke-static {v0, v2, v1}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->emptyBytes:[B

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    iget-wide v2, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->nativeAudioTrack:J

    invoke-direct {p0, v0, v2, v3}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->nativeCacheDirectBufferAddress(Ljava/nio/ByteBuffer;J)V

    invoke-direct {p0, p2}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->channelCountToConfiguration(I)I

    move-result p2

    const/4 v0, 0x2

    invoke-static {p1, p2, v0}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    move-result v0

    int-to-double v2, v0

    mul-double/2addr v2, p3

    double-to-int p3, v2

    const-string p4, "minBufferSizeInBytes: "

    invoke-static {p3, p4, v1}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iget-object p4, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p4}, Ljava/nio/Buffer;->capacity()I

    move-result p4

    const/4 v0, -0x1

    if-ge p3, p4, :cond_0

    const-string p1, "AudioTrack.getMinBufferSize returns an invalid value."

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    return v0

    :cond_0
    iget-object p4, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz p4, :cond_1

    const-string p1, "Conflict with existing AudioTrack."

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    return v0

    :cond_1
    :try_start_0
    invoke-static {p1, p2, p3}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->createAudioTrack(III)Landroid/media/AudioTrack;

    move-result-object p1

    iput-object p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/media/AudioTrack;->getState()I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->logMainParameters()V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->logMainParametersExtended()V

    return p3

    :cond_3
    :goto_0
    const-string p1, "Initialization of audio track failed."

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->releaseAudioResources()V

    return v0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->releaseAudioResources()V

    return v0
.end method

.method private logBufferCapacityInFrames()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferCapacityInFrames()I

    move-result v0

    const-string v1, "AudioTrack: buffer capacity in frames: "

    const-string v2, "WebRtcAudioTrack"

    invoke-static {v0, v1, v2}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logBufferSizeInFrames()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getBufferSizeInFrames()I

    move-result v0

    const-string v1, "AudioTrack: buffer size in frames: "

    const-string v2, "WebRtcAudioTrack"

    invoke-static {v0, v1, v2}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logMainParameters()V
    .locals 7

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    move-result v0

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getChannelCount()I

    move-result v1

    iget-object v2, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

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

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logMainParametersExtended()V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->logBufferSizeInFrames()V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->logBufferCapacityInFrames()V

    return-void
.end method

.method private logUnderrunCount()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getUnderrunCount()I

    move-result v0

    const-string v1, "underrun count: "

    const-string v2, "WebRtcAudioTrack"

    invoke-static {v0, v1, v2}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private native nativeCacheDirectBufferAddress(Ljava/nio/ByteBuffer;J)V
.end method

.method private native nativeGetPlayoutData(IJ)V
.end method

.method private releaseAudioResources()V
    .locals 2

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "releaseAudioResources"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioTrackError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Run-time playback error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallbackOld:Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;->onWebRtcAudioTrackError(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;->onWebRtcAudioTrackError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private reportWebRtcAudioTrackInitError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Init playout error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallbackOld:Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;->onWebRtcAudioTrackInitError(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;->onWebRtcAudioTrackInitError(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private reportWebRtcAudioTrackStartError(Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Start playout error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallbackOld:Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;->onWebRtcAudioTrackStartError(Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;->onWebRtcAudioTrackStartError(Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static declared-synchronized setAudioTrackUsageAttribute(I)V
    .locals 4

    const-string v0, "Default usage attribute is changed from: 2 to "

    const-class v1, Lhms/webrtc/voiceengine/WebRtcAudioTrack;

    monitor-enter v1

    :try_start_0
    const-string v2, "WebRtcAudioTrack"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    sput p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->usageAttribute:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static setErrorCallback(Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;)V
    .locals 2

    .line 3
    const-string v0, "WebRtcAudioTrack"

    const-string v1, "Set extended error callback"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    sput-object p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioTrack$ErrorCallback;

    return-void
.end method

.method public static setErrorCallback(Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const-string v0, "WebRtcAudioTrack"

    const-string v1, "Set error callback (deprecated"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sput-object p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->errorCallbackOld:Lhms/webrtc/voiceengine/WebRtcAudioTrack$WebRtcAudioTrackErrorCallback;

    return-void
.end method

.method public static setSpeakerMute(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setSpeakerMute("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    sput-boolean p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->speakerMute:Z

    return-void
.end method

.method private setStreamVolume(I)Z
    .locals 4

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setStreamVolume("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->isVolumeFixed()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "The device implements a fixed volume policy."

    invoke-static {v1, p1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioManager:Landroid/media/AudioManager;

    invoke-virtual {v0, v3, p1, v3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    return v2
.end method

.method private startPlayout()Z
    .locals 4

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "WebRtcAudioTrack"

    const-string v1, "startPlayout"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    :try_start_0
    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->play()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;->AUDIO_TRACK_START_STATE_MISMATCH:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioTrack:Landroid/media/AudioTrack;

    invoke-virtual {v1}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v1

    const-string v3, "AudioTrack.play failed - incorrect state :"

    invoke-static {v1, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackStartError(Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->releaseAudioResources()V

    return v2

    :cond_2
    new-instance v0, Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    const-string v2, "AudioTrackJavaThread"

    invoke-direct {v0, p0, v2}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;-><init>(Lhms/webrtc/voiceengine/WebRtcAudioTrack;Ljava/lang/String;)V

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return v1

    :catch_0
    move-exception v0

    sget-object v1, Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;->AUDIO_TRACK_START_EXCEPTION:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "AudioTrack.play failed: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->reportWebRtcAudioTrackStartError(Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackStartErrorCode;Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->releaseAudioResources()V

    return v2
.end method

.method private stopPlayout()Z
    .locals 5

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->threadChecker:Lhms/webrtc/ThreadUtils$ThreadChecker;

    invoke-virtual {v0}, Lhms/webrtc/ThreadUtils$ThreadChecker;->checkIsOnValidThread()V

    const-string v0, "stopPlayout"

    const-string v1, "WebRtcAudioTrack"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->assertTrue(Z)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->logUnderrunCount()V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {v0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;->stopThread()V

    const-string v0, "Stopping the AudioTrackThread..."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    const-wide/16 v3, 0x7d0

    invoke-static {v0, v3, v4}, Lhms/webrtc/ThreadUtils;->joinUninterruptibly(Ljava/lang/Thread;J)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Join of AudioTrackThread timed out."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    :cond_1
    const-string v0, "AudioTrackThread has now been stopped."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioTrack$AudioTrackThread;

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioTrack;->releaseAudioResources()V

    return v2
.end method
