.class public Lhms/webrtc/VideoEncoderFallback;
.super Lhms/webrtc/WrappedNativeVideoEncoder;
.source "SourceFile"


# instance fields
.field private final fallback:Lhms/webrtc/VideoEncoder;

.field private final primary:Lhms/webrtc/VideoEncoder;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoEncoder;Lhms/webrtc/VideoEncoder;)V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/WrappedNativeVideoEncoder;-><init>()V

    iput-object p1, p0, Lhms/webrtc/VideoEncoderFallback;->fallback:Lhms/webrtc/VideoEncoder;

    iput-object p2, p0, Lhms/webrtc/VideoEncoderFallback;->primary:Lhms/webrtc/VideoEncoder;

    return-void
.end method

.method private static native nativeCreateEncoder(Lhms/webrtc/VideoEncoder;Lhms/webrtc/VideoEncoder;)J
.end method


# virtual methods
.method public createNativeVideoEncoder()J
    .locals 2

    iget-object v0, p0, Lhms/webrtc/VideoEncoderFallback;->fallback:Lhms/webrtc/VideoEncoder;

    iget-object v1, p0, Lhms/webrtc/VideoEncoderFallback;->primary:Lhms/webrtc/VideoEncoder;

    invoke-static {v0, v1}, Lhms/webrtc/VideoEncoderFallback;->nativeCreateEncoder(Lhms/webrtc/VideoEncoder;Lhms/webrtc/VideoEncoder;)J

    move-result-wide v0

    return-wide v0
.end method

.method public isHardwareEncoder()Z
    .locals 1

    iget-object v0, p0, Lhms/webrtc/VideoEncoderFallback;->primary:Lhms/webrtc/VideoEncoder;

    invoke-interface {v0}, Lhms/webrtc/VideoEncoder;->isHardwareEncoder()Z

    move-result v0

    return v0
.end method
