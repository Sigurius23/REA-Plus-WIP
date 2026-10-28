.class public Lhms/webrtc/voiceengine/WebRtcAudioRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;,
        Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;,
        Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;,
        Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;,
        Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;
    }
.end annotation


# static fields
.field private static final AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS:J = 0x7d0L

.field private static final BITS_PER_SAMPLE:I = 0x10

.field private static final BUFFERS_PER_SECOND:I = 0x64

.field private static final BUFFER_SIZE_FACTOR:I = 0x2

.field private static final CALLBACK_BUFFER_SIZE_MS:I = 0xa

.field private static final DEBUG:Z = false

.field private static final DEFAULT_AUDIO_SOURCE:I

.field private static final TAG:Ljava/lang/String; = "WebRtcAudioRecord"

.field private static audioSamplesReadyCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;

.field private static audioSource:I

.field private static errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;

.field private static volatile microphoneMute:Z


# instance fields
.field private audioRecord:Landroid/media/AudioRecord;

.field private audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

.field private byteBuffer:Ljava/nio/ByteBuffer;

.field private effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

.field private emptyBytes:[B

.field private final nativeAudioRecord:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->getDefaultAudioSource()I

    move-result v0

    sput v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->DEFAULT_AUDIO_SOURCE:I

    sput v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSource:I

    return-void
.end method

.method public constructor <init>(J)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ctor"

    const-string v2, "WebRtcAudioRecord"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-wide p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->nativeAudioRecord:J

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioEffects;->create()Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    move-result-object p1

    iput-object p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    return-void
.end method

.method public static bridge synthetic a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

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

.method public static bridge synthetic b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->byteBuffer:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static bridge synthetic c(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)[B
    .locals 0

    iget-object p0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->emptyBytes:[B

    return-object p0
.end method

.method private channelCountToConfiguration(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const/16 p1, 0x10

    return p1

    :cond_0
    const/16 p1, 0xc

    return p1
.end method

.method public static bridge synthetic d(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)J
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->nativeAudioRecord:J

    return-wide v0
.end method

.method public static bridge synthetic e(Lhms/webrtc/voiceengine/WebRtcAudioRecord;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->nativeDataIsRecorded(IJ)V

    return-void
.end method

.method private enableBuiltInAEC(Z)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "enableBuiltInAEC("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    if-nez v0, :cond_0

    const-string p1, "Built-in AEC is not supported on this platform"

    invoke-static {v1, p1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioEffects;->setAEC(Z)Z

    move-result p1

    return p1
.end method

.method private enableBuiltInNS(Z)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "enableBuiltInNS("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    if-nez v0, :cond_0

    const-string p1, "Built-in NS is not supported on this platform"

    invoke-static {v1, p1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioEffects;->setNS(Z)Z

    move-result p1

    return p1
.end method

.method public static bridge synthetic f(Lhms/webrtc/voiceengine/WebRtcAudioRecord;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordError(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic g()Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;
    .locals 1

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSamplesReadyCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;

    return-object v0
.end method

.method private static getDefaultAudioSource()I
    .locals 1

    const/4 v0, 0x7

    return v0
.end method

.method public static bridge synthetic h()Z
    .locals 1

    sget-boolean v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->microphoneMute:Z

    return v0
.end method

.method public static bridge synthetic i(Z)V
    .locals 0

    invoke-static {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->assertTrue(Z)V

    return-void
.end method

.method private initRecording(II)I
    .locals 12

    const-string v0, ", channels="

    const-string v1, ")"

    const-string v2, "initRecording(sampleRate="

    invoke-static {p1, p2, v2, v0, v1}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    const/4 v2, -0x1

    if-eqz v0, :cond_0

    const-string p1, "InitRecording called twice without StopRecording."

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordInitError(Ljava/lang/String;)V

    return v2

    :cond_0
    mul-int/lit8 v0, p2, 0x2

    div-int/lit8 v3, p1, 0x64

    mul-int/2addr v0, v3

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    const-string v4, "byteBuffer.capacity: "

    invoke-static {v0, v4, v1}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->emptyBytes:[B

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->byteBuffer:Ljava/nio/ByteBuffer;

    iget-wide v4, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->nativeAudioRecord:J

    invoke-direct {p0, v0, v4, v5}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->nativeCacheDirectBufferAddress(Ljava/nio/ByteBuffer;J)V

    invoke-direct {p0, p2}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->channelCountToConfiguration(I)I

    move-result v9

    const/4 p2, 0x2

    invoke-static {p1, v9, p2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    move-result v0

    if-eq v0, v2, :cond_4

    const/4 v4, -0x2

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AudioRecord.getMinBufferSize: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    mul-int/2addr v0, p2

    iget-object p2, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->byteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v11

    const-string p2, "bufferSizeInBytes: "

    invoke-static {v11, p2, v1}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v6, Landroid/media/AudioRecord;

    sget v7, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSource:I

    const/4 v10, 0x2

    move v8, p1

    invoke-direct/range {v6 .. v11}, Landroid/media/AudioRecord;-><init>(IIIII)V

    iput-object v6, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v6}, Landroid/media/AudioRecord;->getState()I

    move-result p1

    const/4 p2, 0x1

    if-eq p1, p2, :cond_2

    const-string p1, "Failed to create a new AudioRecord instance"

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->releaseAudioResources()V

    return v2

    :cond_2
    iget-object p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    if-eqz p1, :cond_3

    iget-object p2, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {p2}, Landroid/media/AudioRecord;->getAudioSessionId()I

    move-result p2

    invoke-virtual {p1, p2}, Lhms/webrtc/voiceengine/WebRtcAudioEffects;->enable(I)V

    :cond_3
    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->logMainParameters()V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->logMainParametersExtended()V

    return v3

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "AudioRecord ctor error: "

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordInitError(Ljava/lang/String;)V

    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->releaseAudioResources()V

    return v2

    :cond_4
    :goto_0
    const-string p1, "AudioRecord.getMinBufferSize failed: "

    invoke-static {v0, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordInitError(Ljava/lang/String;)V

    return v2
.end method

.method private logMainParameters()V
    .locals 6

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getAudioSessionId()I

    move-result v0

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v1}, Landroid/media/AudioRecord;->getChannelCount()I

    move-result v1

    iget-object v2, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v2}, Landroid/media/AudioRecord;->getSampleRate()I

    move-result v2

    const-string v3, ", channels: "

    const-string v4, ", sample rate: "

    const-string v5, "AudioRecord: session ID: "

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private logMainParametersExtended()V
    .locals 3

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getBufferSizeInFrames()I

    move-result v0

    const-string v1, "AudioRecord: buffer size in frames: "

    const-string v2, "WebRtcAudioRecord"

    invoke-static {v0, v1, v2}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private native nativeCacheDirectBufferAddress(Ljava/nio/ByteBuffer;J)V
.end method

.method private native nativeDataIsRecorded(IJ)V
.end method

.method private releaseAudioResources()V
    .locals 2

    const-string v0, "WebRtcAudioRecord"

    const-string v1, "releaseAudioResources"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioRecordError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Run-time recording error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;->onWebRtcAudioRecordError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioRecordInitError(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Init recording error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;->onWebRtcAudioRecordInitError(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private reportWebRtcAudioRecordStartError(Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Start recording error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;->onWebRtcAudioRecordStartError(Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static declared-synchronized setAudioSource(I)V
    .locals 5

    const-string v0, "Audio source is changed from: "

    const-class v1, Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    monitor-enter v1

    :try_start_0
    const-string v2, "WebRtcAudioRecord"

    sget v3, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSource:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " to "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    sput p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSource:I
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

.method public static setErrorCallback(Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;)V
    .locals 2

    const-string v0, "WebRtcAudioRecord"

    const-string v1, "Set error callback"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    sput-object p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->errorCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordErrorCallback;

    return-void
.end method

.method public static setMicrophoneMute(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setMicrophoneMute("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    sput-boolean p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->microphoneMute:Z

    return-void
.end method

.method public static setOnAudioSamplesReady(Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;)V
    .locals 0

    sput-object p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioSamplesReadyCallback:Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;

    return-void
.end method

.method private startRecording()Z
    .locals 4

    const-string v0, "WebRtcAudioRecord"

    const-string v1, "startRecording"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->assertTrue(Z)V

    :try_start_0
    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    sget-object v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;->AUDIO_RECORD_START_STATE_MISMATCH:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioRecord:Landroid/media/AudioRecord;

    invoke-virtual {v1}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v1

    const-string v3, "AudioRecord.startRecording failed - incorrect state :"

    invoke-static {v1, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordStartError(Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;Ljava/lang/String;)V

    return v2

    :cond_2
    new-instance v0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    const-string v2, "AudioRecordJavaThread"

    invoke-direct {v0, p0, v2}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;-><init>(Lhms/webrtc/voiceengine/WebRtcAudioRecord;Ljava/lang/String;)V

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return v1

    :catch_0
    move-exception v0

    sget-object v1, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;->AUDIO_RECORD_START_EXCEPTION:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v3, "AudioRecord.startRecording failed: "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->reportWebRtcAudioRecordStartError(Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordStartErrorCode;Ljava/lang/String;)V

    return v2
.end method

.method private stopRecording()Z
    .locals 5

    const-string v0, "stopRecording"

    const-string v1, "WebRtcAudioRecord"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->assertTrue(Z)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    invoke-virtual {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->stopThread()V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    const-wide/16 v3, 0x7d0

    invoke-static {v0, v3, v4}, Lhms/webrtc/ThreadUtils;->joinUninterruptibly(Ljava/lang/Thread;J)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Join of AudioRecordJavaThread timed out"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->logAudioState(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->audioThread:Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->effects:Lhms/webrtc/voiceengine/WebRtcAudioEffects;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lhms/webrtc/voiceengine/WebRtcAudioEffects;->release()V

    :cond_2
    invoke-direct {p0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->releaseAudioResources()V

    return v2
.end method
