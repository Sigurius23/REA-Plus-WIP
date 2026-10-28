.class public interface abstract Lhms/webrtc/VideoProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/CapturerObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;
    }
.end annotation


# direct methods
.method public static applyFrameAdaptationParameters(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;)Lhms/webrtc/VideoFrame;
    .locals 7

    iget-boolean v0, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->drop:Z

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    iget v1, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->cropX:I

    iget v2, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->cropY:I

    iget v3, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->cropWidth:I

    iget v4, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->cropHeight:I

    iget v5, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->scaleWidth:I

    iget v6, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->scaleHeight:I

    invoke-interface/range {v0 .. v6}, Lhms/webrtc/VideoFrame$Buffer;->cropAndScale(IIIIII)Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    new-instance v1, Lhms/webrtc/VideoFrame;

    invoke-virtual {p0}, Lhms/webrtc/VideoFrame;->getRotation()I

    move-result p0

    iget-wide v2, p1, Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;->timestampNs:J

    invoke-direct {v1, v0, p0, v2, v3}, Lhms/webrtc/VideoFrame;-><init>(Lhms/webrtc/VideoFrame$Buffer;IJ)V

    return-object v1
.end method


# virtual methods
.method public onFrameCaptured(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;)V
    .locals 0

    invoke-static {p1, p2}, Lhms/webrtc/VideoProcessor;->applyFrameAdaptationParameters(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoProcessor$FrameAdaptationParameters;)Lhms/webrtc/VideoFrame;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lhms/webrtc/CapturerObserver;->onFrameCaptured(Lhms/webrtc/VideoFrame;)V

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->release()V

    :cond_0
    return-void
.end method

.method public abstract setSink(Lhms/webrtc/VideoSink;)V
.end method
