.class public interface abstract Lhms/webrtc/VideoDecoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
