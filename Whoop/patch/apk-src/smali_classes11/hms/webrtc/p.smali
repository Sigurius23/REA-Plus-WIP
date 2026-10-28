.class public final synthetic Lhms/webrtc/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoDecoder$Callback;
.implements Lhms/webrtc/VideoEncoder$Callback;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lhms/webrtc/p;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDecodedFrame(Lhms/webrtc/VideoFrame;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/p;->a:J

    invoke-static {v0, v1, p1, p2, p3}, Lhms/webrtc/VideoDecoderWrapper;->a(JLhms/webrtc/VideoFrame;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method

.method public onEncodedFrame(Lhms/webrtc/EncodedImage;Lhms/webrtc/VideoEncoder$CodecSpecificInfo;)V
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/p;->a:J

    invoke-static {v0, v1, p1, p2}, Lhms/webrtc/VideoEncoderWrapper;->a(JLhms/webrtc/EncodedImage;Lhms/webrtc/VideoEncoder$CodecSpecificInfo;)V

    return-void
.end method
