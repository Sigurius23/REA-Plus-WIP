.class public Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/audio/JavaAudioDeviceModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private audioAttributes:Landroid/media/AudioAttributes;

.field private audioFormat:I

.field private final audioManager:Landroid/media/AudioManager;

.field private audioRecordErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;

.field private audioRecordStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;

.field private audioSource:I

.field private audioTrackErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

.field private audioTrackStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

.field private final context:Landroid/content/Context;

.field private enableVolumeLogger:Z

.field private inputSampleRate:I

.field private outputSampleRate:I

.field private samplesReadyCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;

.field private scheduler:Ljava/util/concurrent/ScheduledExecutorService;

.field private useHardwareAcousticEchoCanceler:Z

.field private useHardwareNoiseSuppressor:Z

.field private useLowLatency:Z

.field private useStereoInput:Z

.field private useStereoOutput:Z


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x7

    .line 3
    iput v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioSource:I

    const/4 v0, 0x2

    .line 4
    iput v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioFormat:I

    .line 5
    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInAcousticEchoCancelerSupported()Z

    move-result v0

    iput-boolean v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareAcousticEchoCanceler:Z

    .line 6
    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInNoiseSuppressorSupported()Z

    move-result v0

    iput-boolean v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareNoiseSuppressor:Z

    .line 7
    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->context:Landroid/content/Context;

    .line 8
    const-string v0, "audio"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioManager:Landroid/media/AudioManager;

    .line 9
    invoke-static {p1}, Lhms/webrtc/audio/WebRtcAudioManager;->getSampleRate(Landroid/media/AudioManager;)I

    move-result v0

    iput v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->inputSampleRate:I

    .line 10
    invoke-static {p1}, Lhms/webrtc/audio/WebRtcAudioManager;->getSampleRate(Landroid/media/AudioManager;)I

    move-result p1

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->outputSampleRate:I

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useLowLatency:Z

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->enableVolumeLogger:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public createAudioDeviceModule()Lhms/webrtc/audio/JavaAudioDeviceModule;
    .locals 13

    const-string v0, "createAudioDeviceModule"

    const-string v1, "JavaAudioDeviceModule"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareNoiseSuppressor:Z

    if-eqz v0, :cond_0

    const-string v0, "HW NS will be used."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInNoiseSuppressorSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Overriding default behavior; now using WebRTC NS!"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v0, "HW NS will not be used."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-boolean v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareAcousticEchoCanceler:Z

    if-eqz v0, :cond_2

    const-string v0, "HW AEC will be used."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInAcousticEchoCancelerSupported()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Overriding default behavior; now using WebRTC AEC!"

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v0, "HW AEC will not be used."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-boolean v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useLowLatency:Z

    if-eqz v0, :cond_4

    const-string v0, "Low latency mode will be used."

    invoke-static {v1, v0}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_5

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioRecord;->newDefaultScheduler()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    :cond_5
    move-object v3, v0

    new-instance v1, Lhms/webrtc/audio/WebRtcAudioRecord;

    iget-object v2, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->context:Landroid/content/Context;

    iget-object v4, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioManager:Landroid/media/AudioManager;

    iget v5, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioSource:I

    iget v6, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioFormat:I

    iget-object v7, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioRecordErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;

    iget-object v8, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioRecordStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;

    iget-object v9, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->samplesReadyCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;

    iget-boolean v10, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareAcousticEchoCanceler:Z

    iget-boolean v11, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareNoiseSuppressor:Z

    invoke-direct/range {v1 .. v11}, Lhms/webrtc/audio/WebRtcAudioRecord;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Landroid/media/AudioManager;IILhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;ZZ)V

    new-instance v2, Lhms/webrtc/audio/WebRtcAudioTrack;

    iget-object v3, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->context:Landroid/content/Context;

    iget-object v4, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioManager:Landroid/media/AudioManager;

    iget-object v5, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioAttributes:Landroid/media/AudioAttributes;

    iget-object v6, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioTrackErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    iget-object v7, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioTrackStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

    iget-boolean v8, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useLowLatency:Z

    iget-boolean v9, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->enableVolumeLogger:Z

    invoke-direct/range {v2 .. v9}, Lhms/webrtc/audio/WebRtcAudioTrack;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Landroid/media/AudioAttributes;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;ZZ)V

    new-instance v4, Lhms/webrtc/audio/JavaAudioDeviceModule;

    iget-object v5, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->context:Landroid/content/Context;

    iget-object v6, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioManager:Landroid/media/AudioManager;

    iget v9, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->inputSampleRate:I

    iget v10, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->outputSampleRate:I

    iget-boolean v11, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useStereoInput:Z

    iget-boolean v12, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useStereoOutput:Z

    move-object v7, v1

    move-object v8, v2

    invoke-direct/range {v4 .. v12}, Lhms/webrtc/audio/JavaAudioDeviceModule;-><init>(Landroid/content/Context;Landroid/media/AudioManager;Lhms/webrtc/audio/WebRtcAudioRecord;Lhms/webrtc/audio/WebRtcAudioTrack;IIZZ)V

    return-object v4
.end method

.method public setAudioAttributes(Landroid/media/AudioAttributes;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioAttributes:Landroid/media/AudioAttributes;

    return-object p0
.end method

.method public setAudioFormat(I)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioFormat:I

    return-object p0
.end method

.method public setAudioRecordErrorCallback(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioRecordErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;

    return-object p0
.end method

.method public setAudioRecordStateCallback(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioRecordStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;

    return-object p0
.end method

.method public setAudioSource(I)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioSource:I

    return-object p0
.end method

.method public setAudioTrackErrorCallback(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioTrackErrorCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;

    return-object p0
.end method

.method public setAudioTrackStateCallback(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->audioTrackStateCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;

    return-object p0
.end method

.method public setEnableVolumeLogger(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->enableVolumeLogger:Z

    return-object p0
.end method

.method public setInputSampleRate(I)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 2

    const-string v0, "JavaAudioDeviceModule"

    const-string v1, "Input sample rate overridden to: "

    invoke-static {p1, v1, v0}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->inputSampleRate:I

    return-object p0
.end method

.method public setOutputSampleRate(I)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 2

    const-string v0, "JavaAudioDeviceModule"

    const-string v1, "Output sample rate overridden to: "

    invoke-static {p1, v1, v0}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->outputSampleRate:I

    return-object p0
.end method

.method public setSampleRate(I)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 2

    const-string v0, "JavaAudioDeviceModule"

    const-string v1, "Input/Output sample rate overridden to: "

    invoke-static {p1, v1, v0}, Lhc3/i;->k(ILjava/lang/String;Ljava/lang/String;)V

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->inputSampleRate:I

    iput p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->outputSampleRate:I

    return-object p0
.end method

.method public setSamplesReadyCallback(Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->samplesReadyCallback:Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;

    return-object p0
.end method

.method public setScheduler(Ljava/util/concurrent/ScheduledExecutorService;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->scheduler:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public setUseHardwareAcousticEchoCanceler(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInAcousticEchoCancelerSupported()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "JavaAudioDeviceModule"

    const-string v0, "HW AEC not supported"

    invoke-static {p1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareAcousticEchoCanceler:Z

    return-object p0
.end method

.method public setUseHardwareNoiseSuppressor(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {}, Lhms/webrtc/audio/JavaAudioDeviceModule;->isBuiltInNoiseSuppressorSupported()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "JavaAudioDeviceModule"

    const-string v0, "HW NS not supported"

    invoke-static {p1, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useHardwareNoiseSuppressor:Z

    return-object p0
.end method

.method public setUseLowLatency(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useLowLatency:Z

    return-object p0
.end method

.method public setUseStereoInput(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useStereoInput:Z

    return-object p0
.end method

.method public setUseStereoOutput(Z)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;
    .locals 0

    iput-boolean p1, p0, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->useStereoOutput:Z

    return-object p0
.end method
