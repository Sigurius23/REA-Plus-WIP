.class public Lorg/webrtc/ExternalAudioProcessingFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/AudioProcessingFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;
    }
.end annotation


# instance fields
.field private apmPtr:J

.field private capturePostProcessingPtr:J

.field private renderPreProcessingPtr:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeGetDefaultApm()J

    move-result-wide v0

    iput-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    iput-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    return-void
.end method

.method private checkExternalAudioProcessorExists()V
    .locals 4

    iget-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "ExternalAudioProcessor has been disposed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static native nativeDestroy()V
.end method

.method private static native nativeGetDefaultApm()J
.end method

.method private static native nativeSetBypassFlagForCapturePost(Z)V
.end method

.method private static native nativeSetBypassFlagForRenderPre(Z)V
.end method

.method private static native nativeSetCapturePostProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)J
.end method

.method private static native nativeSetRenderPreProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)J
.end method


# virtual methods
.method public createNative(J)J
    .locals 2

    iget-wide p1, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    invoke-static {}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeGetDefaultApm()J

    move-result-wide p1

    iput-wide p1, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    :cond_0
    iget-wide p1, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    return-wide p1
.end method

.method public destroy()V
    .locals 5

    invoke-direct {p0}, Lorg/webrtc/ExternalAudioProcessingFactory;->checkExternalAudioProcessorExists()V

    iget-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-static {v0, v1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    iput-wide v2, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    :cond_0
    iget-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    invoke-static {v0, v1}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    iput-wide v2, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    :cond_1
    invoke-static {}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeDestroy()V

    iput-wide v2, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->apmPtr:J

    return-void
.end method

.method public setBypassFlagForCapturePost(Z)V
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/ExternalAudioProcessingFactory;->checkExternalAudioProcessorExists()V

    invoke-static {p1}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeSetBypassFlagForCapturePost(Z)V

    return-void
.end method

.method public setBypassFlagForRenderPre(Z)V
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/ExternalAudioProcessingFactory;->checkExternalAudioProcessorExists()V

    invoke-static {p1}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeSetBypassFlagForRenderPre(Z)V

    return-void
.end method

.method public setCapturePostProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)V
    .locals 6

    invoke-direct {p0}, Lorg/webrtc/ExternalAudioProcessingFactory;->checkExternalAudioProcessorExists()V

    invoke-static {p1}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeSetCapturePostProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)J

    move-result-wide v0

    iget-wide v2, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    invoke-static {v2, v3}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    iput-wide v4, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    :cond_0
    iput-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->capturePostProcessingPtr:J

    return-void
.end method

.method public setRenderPreProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)V
    .locals 6

    invoke-direct {p0}, Lorg/webrtc/ExternalAudioProcessingFactory;->checkExternalAudioProcessorExists()V

    invoke-static {p1}, Lorg/webrtc/ExternalAudioProcessingFactory;->nativeSetRenderPreProcessing(Lorg/webrtc/ExternalAudioProcessingFactory$AudioProcessing;)J

    move-result-wide v0

    iget-wide v2, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    const-wide/16 v4, 0x0

    cmp-long p1, v2, v4

    if-eqz p1, :cond_0

    invoke-static {v2, v3}, Lorg/webrtc/JniCommon;->nativeReleaseRef(J)V

    iput-wide v4, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    :cond_0
    iput-wide v0, p0, Lorg/webrtc/ExternalAudioProcessingFactory;->renderPreProcessingPtr:J

    return-void
.end method
