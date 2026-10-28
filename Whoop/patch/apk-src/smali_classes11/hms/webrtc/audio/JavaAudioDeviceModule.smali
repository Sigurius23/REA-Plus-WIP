.class public Lhms/webrtc/audio/JavaAudioDeviceModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/audio/AudioDeviceModule;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioSamples;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode;,
        Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "JavaAudioDeviceModule"


# instance fields
.field private final audioInput:Lhms/webrtc/audio/WebRtcAudioRecord;

.field private final audioManager:Landroid/media/AudioManager;

.field private final audioOutput:Lhms/webrtc/audio/WebRtcAudioTrack;

.field private final context:Landroid/content/Context;

.field private final inputSampleRate:I

.field private nativeAudioDeviceModule:J

.field private final nativeLock:Ljava/lang/Object;

.field private final outputSampleRate:I

.field private final useStereoInput:Z

.field private final useStereoOutput:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/AudioManager;Lhms/webrtc/audio/WebRtcAudioRecord;Lhms/webrtc/audio/WebRtcAudioTrack;IIZZ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeLock:Ljava/lang/Object;

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->context:Landroid/content/Context;

    iput-object p2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioManager:Landroid/media/AudioManager;

    iput-object p3, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioInput:Lhms/webrtc/audio/WebRtcAudioRecord;

    iput-object p4, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioOutput:Lhms/webrtc/audio/WebRtcAudioTrack;

    iput p5, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->inputSampleRate:I

    iput p6, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->outputSampleRate:I

    iput-boolean p7, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->useStereoInput:Z

    iput-boolean p8, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->useStereoOutput:Z

    return-void
.end method

.method public static builder(Landroid/content/Context;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 2

    new-instance v0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public static isBuiltInAcousticEchoCancelerSupported()Z
    .locals 1

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioEffects;->isAcousticEchoCancelerSupported()Z

    move-result v0

    return v0
.end method

.method public static isBuiltInNoiseSuppressorSupported()Z
    .locals 1

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioEffects;->isNoiseSuppressorSupported()Z

    move-result v0

    return v0
.end method

.method private static native nativeCreateAudioDeviceModule(Landroid/content/Context;Landroid/media/AudioManager;Lhms/webrtc/audio/WebRtcAudioRecord;Lhms/webrtc/audio/WebRtcAudioTrack;IIZZ)J
.end method


# virtual methods
.method public getNativeAudioDeviceModulePointer()J
    .locals 10

    iget-object v1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeLock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-wide v2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeAudioDeviceModule:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->context:Landroid/content/Context;

    iget-object v3, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioManager:Landroid/media/AudioManager;

    iget-object v4, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioInput:Lhms/webrtc/audio/WebRtcAudioRecord;

    iget-object v5, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioOutput:Lhms/webrtc/audio/WebRtcAudioTrack;

    iget v6, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->inputSampleRate:I

    iget v7, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->outputSampleRate:I

    iget-boolean v8, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->useStereoInput:Z

    iget-boolean v9, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->useStereoOutput:Z

    invoke-static/range {v2 .. v9}, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeCreateAudioDeviceModule(Landroid/content/Context;Landroid/media/AudioManager;Lhms/webrtc/audio/WebRtcAudioRecord;Lhms/webrtc/audio/WebRtcAudioTrack;IIZZ)J

    move-result-wide v2

    iput-wide v2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeAudioDeviceModule:J

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-wide v2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeAudioDeviceModule:J

    monitor-exit v1

    return-wide v2

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public release()V
    .locals 6

    iget-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeAudioDeviceModule:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    invoke-static {v1, v2}, Lhms/webrtc/JniCommon;->nativeReleaseRef(J)V

    iput-wide v3, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->nativeAudioDeviceModule:J

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public setMicrophoneMute(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setMicrophoneMute: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaAudioDeviceModule"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioInput:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-virtual {v0, p1}, Lhms/webrtc/audio/WebRtcAudioRecord;->setMicrophoneMute(Z)V

    return-void
.end method

.method public setPreferredInputDevice(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setPreferredInputDevice: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaAudioDeviceModule"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioInput:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-virtual {v0, p1}, Lhms/webrtc/audio/WebRtcAudioRecord;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)V

    return-void
.end method

.method public setSpeakerMute(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setSpeakerMute: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaAudioDeviceModule"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule;->audioOutput:Lhms/webrtc/audio/WebRtcAudioTrack;

    invoke-virtual {v0, p1}, Lhms/webrtc/audio/WebRtcAudioTrack;->setSpeakerMute(Z)V

    return-void
.end method
