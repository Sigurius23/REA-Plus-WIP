.class public interface abstract Lhms/webrtc/VideoEncoder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhms/webrtc/VideoEncoder$Callback;,
        Lhms/webrtc/VideoEncoder$EncoderInfo;,
        Lhms/webrtc/VideoEncoder$RateControlParameters;,
        Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;,
        Lhms/webrtc/VideoEncoder$ScalingSettings;,
        Lhms/webrtc/VideoEncoder$BitrateAllocation;,
        Lhms/webrtc/VideoEncoder$CodecSpecificInfoAV1;,
        Lhms/webrtc/VideoEncoder$CodecSpecificInfoH264;,
        Lhms/webrtc/VideoEncoder$CodecSpecificInfoVP9;,
        Lhms/webrtc/VideoEncoder$CodecSpecificInfoVP8;,
        Lhms/webrtc/VideoEncoder$CodecSpecificInfo;,
        Lhms/webrtc/VideoEncoder$EncodeInfo;,
        Lhms/webrtc/VideoEncoder$Capabilities;,
        Lhms/webrtc/VideoEncoder$Settings;
    }
.end annotation


# virtual methods
.method public createNativeVideoEncoder()J
    .locals 2
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public abstract encode(Lhms/webrtc/VideoFrame;Lhms/webrtc/VideoEncoder$EncodeInfo;)Lhms/webrtc/VideoCodecStatus;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public getEncoderInfo()Lhms/webrtc/VideoEncoder$EncoderInfo;
    .locals 3
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    new-instance v0, Lhms/webrtc/VideoEncoder$EncoderInfo;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhms/webrtc/VideoEncoder$EncoderInfo;-><init>(IZ)V

    return-object v0
.end method

.method public abstract getImplementationName()Ljava/lang/String;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public getResolutionBitrateLimits()[Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lhms/webrtc/VideoEncoder$ResolutionBitrateLimits;

    return-object v0
.end method

.method public abstract getScalingSettings()Lhms/webrtc/VideoEncoder$ScalingSettings;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract initEncode(Lhms/webrtc/VideoEncoder$Settings;Lhms/webrtc/VideoEncoder$Callback;)Lhms/webrtc/VideoCodecStatus;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public isHardwareEncoder()Z
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    const/4 v0, 0x1

    return v0
.end method

.method public abstract release()Lhms/webrtc/VideoCodecStatus;
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract setRateAllocation(Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;
.end method

.method public setRates(Lhms/webrtc/VideoEncoder$RateControlParameters;)Lhms/webrtc/VideoCodecStatus;
    .locals 2
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-wide v0, p1, Lhms/webrtc/VideoEncoder$RateControlParameters;->framerateFps:D

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget-object p1, p1, Lhms/webrtc/VideoEncoder$RateControlParameters;->bitrate:Lhms/webrtc/VideoEncoder$BitrateAllocation;

    invoke-interface {p0, p1, v0}, Lhms/webrtc/VideoEncoder;->setRateAllocation(Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;

    move-result-object p1

    return-object p1
.end method
