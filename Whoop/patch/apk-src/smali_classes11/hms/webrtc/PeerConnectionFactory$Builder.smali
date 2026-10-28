.class public Lhms/webrtc/PeerConnectionFactory$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnectionFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private audioDecoderFactoryFactory:Lhms/webrtc/AudioDecoderFactoryFactory;

.field private audioDeviceModule:Lhms/webrtc/audio/AudioDeviceModule;

.field private audioEncoderFactoryFactory:Lhms/webrtc/AudioEncoderFactoryFactory;

.field private audioProcessingFactory:Lhms/webrtc/AudioProcessingFactory;

.field private fecControllerFactoryFactory:Lhms/webrtc/FecControllerFactoryFactoryInterface;

.field private neteqFactoryFactory:Lhms/webrtc/NetEqFactoryFactory;

.field private networkControllerFactoryFactory:Lhms/webrtc/NetworkControllerFactoryFactory;

.field private networkStatePredictorFactoryFactory:Lhms/webrtc/NetworkStatePredictorFactoryFactory;

.field private options:Lhms/webrtc/PeerConnectionFactory$Options;

.field private videoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

.field private videoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lhms/webrtc/BuiltinAudioEncoderFactoryFactory;

    invoke-direct {v0}, Lhms/webrtc/BuiltinAudioEncoderFactoryFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioEncoderFactoryFactory:Lhms/webrtc/AudioEncoderFactoryFactory;

    .line 4
    new-instance v0, Lhms/webrtc/BuiltinAudioDecoderFactoryFactory;

    invoke-direct {v0}, Lhms/webrtc/BuiltinAudioDecoderFactoryFactory;-><init>()V

    iput-object v0, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDecoderFactoryFactory:Lhms/webrtc/AudioDecoderFactoryFactory;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lhms/webrtc/PeerConnectionFactory$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public createPeerConnectionFactory()Lhms/webrtc/PeerConnectionFactory;
    .locals 24

    move-object/from16 v0, p0

    invoke-static {}, Lhms/webrtc/PeerConnectionFactory;->a()V

    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lhms/webrtc/audio/AudioDeviceModule;

    if-nez v1, :cond_0

    invoke-static {}, Lhms/webrtc/ContextUtils;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lhms/webrtc/audio/JavaAudioDeviceModule;->builder(Landroid/content/Context;)Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lhms/webrtc/audio/JavaAudioDeviceModule$Builder;->createAudioDeviceModule()Lhms/webrtc/audio/JavaAudioDeviceModule;

    move-result-object v1

    iput-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lhms/webrtc/audio/AudioDeviceModule;

    :cond_0
    invoke-static {}, Lhms/webrtc/ContextUtils;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->options:Lhms/webrtc/PeerConnectionFactory$Options;

    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lhms/webrtc/audio/AudioDeviceModule;

    invoke-interface {v1}, Lhms/webrtc/audio/AudioDeviceModule;->getNativeAudioDeviceModulePointer()J

    move-result-wide v4

    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioEncoderFactoryFactory:Lhms/webrtc/AudioEncoderFactoryFactory;

    invoke-interface {v1}, Lhms/webrtc/AudioEncoderFactoryFactory;->createNativeAudioEncoderFactory()J

    move-result-wide v6

    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDecoderFactoryFactory:Lhms/webrtc/AudioDecoderFactoryFactory;

    invoke-interface {v1}, Lhms/webrtc/AudioDecoderFactoryFactory;->createNativeAudioDecoderFactory()J

    move-result-wide v8

    iget-object v10, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->videoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    iget-object v11, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->videoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioProcessingFactory:Lhms/webrtc/AudioProcessingFactory;

    const-wide/16 v12, 0x0

    if-nez v1, :cond_1

    move-wide v14, v12

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Lhms/webrtc/AudioProcessingFactory;->createNative()J

    move-result-wide v14

    :goto_0
    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->fecControllerFactoryFactory:Lhms/webrtc/FecControllerFactoryFactoryInterface;

    if-nez v1, :cond_2

    move-wide/from16 v16, v12

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Lhms/webrtc/FecControllerFactoryFactoryInterface;->createNative()J

    move-result-wide v16

    :goto_1
    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->networkControllerFactoryFactory:Lhms/webrtc/NetworkControllerFactoryFactory;

    if-nez v1, :cond_3

    move-wide/from16 v18, v12

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Lhms/webrtc/NetworkControllerFactoryFactory;->createNativeNetworkControllerFactory()J

    move-result-wide v18

    :goto_2
    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->networkStatePredictorFactoryFactory:Lhms/webrtc/NetworkStatePredictorFactoryFactory;

    if-nez v1, :cond_4

    move-wide/from16 v20, v12

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Lhms/webrtc/NetworkStatePredictorFactoryFactory;->createNativeNetworkStatePredictorFactory()J

    move-result-wide v20

    :goto_3
    iget-object v1, v0, Lhms/webrtc/PeerConnectionFactory$Builder;->neteqFactoryFactory:Lhms/webrtc/NetEqFactoryFactory;

    if-nez v1, :cond_5

    :goto_4
    move-wide/from16 v22, v20

    move-wide/from16 v20, v12

    move-wide v12, v14

    move-wide/from16 v14, v16

    move-wide/from16 v16, v18

    move-wide/from16 v18, v22

    goto :goto_5

    :cond_5
    invoke-interface {v1}, Lhms/webrtc/NetEqFactoryFactory;->createNativeNetEqFactory()J

    move-result-wide v12

    goto :goto_4

    :goto_5
    invoke-static/range {v2 .. v21}, Lhms/webrtc/PeerConnectionFactory;->b(Landroid/content/Context;Lhms/webrtc/PeerConnectionFactory$Options;JJJLhms/webrtc/VideoEncoderFactory;Lhms/webrtc/VideoDecoderFactory;JJJJJ)Lhms/webrtc/PeerConnectionFactory;

    move-result-object v1

    return-object v1
.end method

.method public setAudioDecoderFactoryFactory(Lhms/webrtc/AudioDecoderFactoryFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDecoderFactoryFactory:Lhms/webrtc/AudioDecoderFactoryFactory;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAudioDeviceModule(Lhms/webrtc/audio/AudioDeviceModule;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioDeviceModule:Lhms/webrtc/audio/AudioDeviceModule;

    return-object p0
.end method

.method public setAudioEncoderFactoryFactory(Lhms/webrtc/AudioEncoderFactoryFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioEncoderFactoryFactory:Lhms/webrtc/AudioEncoderFactoryFactory;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setAudioProcessingFactory(Lhms/webrtc/AudioProcessingFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->audioProcessingFactory:Lhms/webrtc/AudioProcessingFactory;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "PeerConnectionFactory builder does not accept a null AudioProcessingFactory."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setFecControllerFactoryFactoryInterface(Lhms/webrtc/FecControllerFactoryFactoryInterface;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->fecControllerFactoryFactory:Lhms/webrtc/FecControllerFactoryFactoryInterface;

    return-object p0
.end method

.method public setNetEqFactoryFactory(Lhms/webrtc/NetEqFactoryFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->neteqFactoryFactory:Lhms/webrtc/NetEqFactoryFactory;

    return-object p0
.end method

.method public setNetworkControllerFactoryFactory(Lhms/webrtc/NetworkControllerFactoryFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->networkControllerFactoryFactory:Lhms/webrtc/NetworkControllerFactoryFactory;

    return-object p0
.end method

.method public setNetworkStatePredictorFactoryFactory(Lhms/webrtc/NetworkStatePredictorFactoryFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->networkStatePredictorFactoryFactory:Lhms/webrtc/NetworkStatePredictorFactoryFactory;

    return-object p0
.end method

.method public setOptions(Lhms/webrtc/PeerConnectionFactory$Options;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->options:Lhms/webrtc/PeerConnectionFactory$Options;

    return-object p0
.end method

.method public setVideoDecoderFactory(Lhms/webrtc/VideoDecoderFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->videoDecoderFactory:Lhms/webrtc/VideoDecoderFactory;

    return-object p0
.end method

.method public setVideoEncoderFactory(Lhms/webrtc/VideoEncoderFactory;)Lhms/webrtc/PeerConnectionFactory$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionFactory$Builder;->videoEncoderFactory:Lhms/webrtc/VideoEncoderFactory;

    return-object p0
.end method
