.class public interface abstract Lhms/webrtc/VideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/VideoEncoderFactory$VideoEncoderSelector;
    }
.end annotation


# virtual methods
.method public abstract createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public getEncoderSelector()Lhms/webrtc/VideoEncoderFactory$VideoEncoderSelector;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getImplementations()[Lhms/webrtc/VideoCodecInfo;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-interface {p0}, Lhms/webrtc/VideoEncoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v0

    return-object v0
.end method

.method public abstract getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method
