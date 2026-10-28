.class public final Le33/y;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Le33/j0;


# direct methods
.method public constructor <init>(Le33/j0;)V
    .locals 0

    iput-object p1, p0, Le33/y;->w:Le33/j0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Le33/y;->w:Le33/j0;

    iget-object v1, v0, Le33/j0;->a:Landroid/content/Context;

    invoke-static {v1}, Lorg/webrtc/PeerConnectionFactory$InitializationOptions;->builder(Landroid/content/Context;)Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    move-result-object v1

    new-instance v2, Le33/v;

    invoke-direct {v2, v0}, Le33/v;-><init>(Le33/j0;)V

    iget-object v3, v0, Le33/j0;->e:Lorg/webrtc/Logging$Severity;

    invoke-virtual {v1, v2, v3}, Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->setInjectableLogger(Lorg/webrtc/Loggable;Lorg/webrtc/Logging$Severity;)Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/PeerConnectionFactory$InitializationOptions$Builder;->createInitializationOptions()Lorg/webrtc/PeerConnectionFactory$InitializationOptions;

    move-result-object v1

    invoke-static {v1}, Lorg/webrtc/PeerConnectionFactory;->initialize(Lorg/webrtc/PeerConnectionFactory$InitializationOptions;)V

    iget-object v1, v0, Le33/j0;->b:Lt23/l;

    iget-object v2, v0, Le33/j0;->c:Lt23/l;

    invoke-virtual {v2}, Lt23/l;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lstream/video/sfu/models/AudioBitrateProfile;

    iput-object v2, v0, Le33/j0;->f:Lstream/video/sfu/models/AudioBitrateProfile;

    sget-object v3, Lstream/video/sfu/models/AudioBitrateProfile;->AUDIO_BITRATE_PROFILE_MUSIC_HIGH_QUALITY:Lstream/video/sfu/models/AudioBitrateProfile;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    const/16 v3, 0x1d

    if-eqz v2, :cond_2

    :cond_1
    move v6, v5

    goto :goto_1

    :cond_2
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v6, v3, :cond_1

    move v6, v4

    :goto_1
    if-eqz v2, :cond_4

    :cond_3
    move v2, v5

    goto :goto_2

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v3, :cond_3

    move v2, v4

    :goto_2
    iget-object v3, v0, Le33/j0;->a:Landroid/content/Context;

    invoke-static {v3}, Lorg/webrtc/audio/JavaAudioDeviceModule;->builder(Landroid/content/Context;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v3

    invoke-virtual {v3, v6}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setUseHardwareAcousticEchoCanceler(Z)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v3

    invoke-virtual {v1}, Lt23/l;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_5

    new-instance v6, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v6}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v1}, Lt23/l;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v6, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v1

    invoke-virtual {v3, v1}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    :cond_5
    invoke-virtual {v3, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setUseHardwareNoiseSuppressor(Z)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/z;

    invoke-direct {v2, v0}, Le33/z;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioRecordErrorCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/a0;

    invoke-direct {v2, v0}, Le33/a0;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioTrackErrorCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/b0;

    invoke-direct {v2, v0}, Le33/b0;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioRecordStateCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/c0;

    invoke-direct {v2, v0}, Le33/c0;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioTrackStateCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/v;

    invoke-direct {v2, v0}, Le33/v;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setSamplesReadyCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    new-instance v2, Le33/v;

    invoke-direct {v2, v0}, Le33/v;-><init>(Le33/j0;)V

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setAudioBufferCallback(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioBufferCallback;)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    invoke-virtual {v1, v4}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->setUseStereoOutput(Z)Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lorg/webrtc/audio/JavaAudioDeviceModule$Builder;->createAudioDeviceModule()Lorg/webrtc/audio/JavaAudioDeviceModule;

    move-result-object v1

    invoke-virtual {v1, v5}, Lorg/webrtc/audio/JavaAudioDeviceModule;->setMicrophoneMute(Z)V

    invoke-virtual {v1, v5}, Lorg/webrtc/audio/JavaAudioDeviceModule;->setSpeakerMute(Z)V

    iput-object v1, v0, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    iget-boolean v1, v0, Le33/j0;->r:Z

    if-eqz v1, :cond_9

    iget-object v1, v0, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    if-eqz v1, :cond_6

    iget-object v2, v0, Le33/j0;->q:Landroid/media/AudioDeviceInfo;

    invoke-virtual {v1, v2}, Lorg/webrtc/audio/JavaAudioDeviceModule;->setPreferredInputDevice(Landroid/media/AudioDeviceInfo;)V

    :cond_6
    invoke-virtual {v0}, Le33/j0;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    iget-object v4, v0, Le33/j0;->q:Landroid/media/AudioDeviceInfo;

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    move-result-object v4

    goto :goto_3

    :cond_7
    move-object v4, v6

    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[createFactory] Applied pending preferred input device: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v1, v4, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    iput-boolean v5, v0, Le33/j0;->r:Z

    :cond_9
    iget-object v1, v0, Le33/j0;->c:Lt23/l;

    invoke-virtual {v1}, Lt23/l;->invoke()Ljava/lang/Object;

    invoke-static {}, Lorg/webrtc/PeerConnectionFactory;->builder()Lorg/webrtc/PeerConnectionFactory$Builder;

    move-result-object v1

    iget-object v2, v0, Le33/j0;->m:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf33/a;

    invoke-virtual {v1, v2}, Lorg/webrtc/PeerConnectionFactory$Builder;->setVideoDecoderFactory(Lorg/webrtc/VideoDecoderFactory;)Lorg/webrtc/PeerConnectionFactory$Builder;

    move-result-object v1

    iget-object v2, v0, Le33/j0;->n:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/webrtc/SimulcastAlignedVideoEncoderFactory;

    invoke-virtual {v1, v2}, Lorg/webrtc/PeerConnectionFactory$Builder;->setVideoEncoderFactory(Lorg/webrtc/VideoEncoderFactory;)Lorg/webrtc/PeerConnectionFactory$Builder;

    move-result-object v1

    iget-object v0, v0, Le33/j0;->p:Lorg/webrtc/audio/JavaAudioDeviceModule;

    invoke-virtual {v1, v0}, Lorg/webrtc/PeerConnectionFactory$Builder;->setAudioDeviceModule(Lorg/webrtc/audio/AudioDeviceModule;)Lorg/webrtc/PeerConnectionFactory$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lorg/webrtc/PeerConnectionFactory$Builder;->createPeerConnectionFactory()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v0

    const-string v1, "createPeerConnectionFactory(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
