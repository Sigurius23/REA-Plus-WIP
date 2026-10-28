.class public Lhms/webrtc/KrispAudioProcessingImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/AudioProcessingFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native nativeDestroy()V
.end method

.method private static native nativeEnable(Z)V
.end method

.method private static native nativeGetAudioProcessorModule()J
.end method

.method private static native nativeInit(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method private static native nativeInitWithData([BLjava/lang/String;)Z
.end method

.method private static native nativeIsEnabled()Z
.end method


# virtual methods
.method public Destroy()V
    .locals 0

    invoke-static {}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeDestroy()V

    return-void
.end method

.method public Enable(Z)V
    .locals 0

    invoke-static {p1}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeEnable(Z)V

    return-void
.end method

.method public Init(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeInit(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public InitWithData([BLjava/lang/String;)Z
    .locals 0

    invoke-static {p1, p2}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeInitWithData([BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public IsEnabled()Z
    .locals 1

    invoke-static {}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeIsEnabled()Z

    move-result v0

    return v0
.end method

.method public createNative()J
    .locals 2

    invoke-static {}, Lhms/webrtc/KrispAudioProcessingImpl;->nativeGetAudioProcessorModule()J

    move-result-wide v0

    return-wide v0
.end method
