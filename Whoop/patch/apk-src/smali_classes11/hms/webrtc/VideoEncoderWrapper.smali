.class Lhms/webrtc/VideoEncoderWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(JLhms/webrtc/EncodedImage;Lhms/webrtc/VideoEncoder$CodecSpecificInfo;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lhms/webrtc/VideoEncoderWrapper;->lambda$createEncoderCallback$0(JLhms/webrtc/EncodedImage;Lhms/webrtc/VideoEncoder$CodecSpecificInfo;)V

    return-void
.end method

.method public static createEncoderCallback(J)Lhms/webrtc/VideoEncoder$Callback;
    .locals 1
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    new-instance v0, Lhms/webrtc/p;

    invoke-direct {v0, p0, p1}, Lhms/webrtc/p;-><init>(J)V

    return-object v0
.end method

.method public static getScalingSettingsHigh(Lhms/webrtc/VideoEncoder$ScalingSettings;)Ljava/lang/Integer;
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-object p0, p0, Lhms/webrtc/VideoEncoder$ScalingSettings;->high:Ljava/lang/Integer;

    return-object p0
.end method

.method public static getScalingSettingsLow(Lhms/webrtc/VideoEncoder$ScalingSettings;)Ljava/lang/Integer;
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-object p0, p0, Lhms/webrtc/VideoEncoder$ScalingSettings;->low:Ljava/lang/Integer;

    return-object p0
.end method

.method public static getScalingSettingsOn(Lhms/webrtc/VideoEncoder$ScalingSettings;)Z
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    iget-boolean p0, p0, Lhms/webrtc/VideoEncoder$ScalingSettings;->on:Z

    return p0
.end method

.method private static synthetic lambda$createEncoderCallback$0(JLhms/webrtc/EncodedImage;Lhms/webrtc/VideoEncoder$CodecSpecificInfo;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lhms/webrtc/VideoEncoderWrapper;->nativeOnEncodedFrame(JLhms/webrtc/EncodedImage;)V

    return-void
.end method

.method private static native nativeOnEncodedFrame(JLhms/webrtc/EncodedImage;)V
.end method
