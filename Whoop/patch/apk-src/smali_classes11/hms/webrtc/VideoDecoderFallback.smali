.class public Lhms/webrtc/VideoDecoderFallback;
.super Lhms/webrtc/WrappedNativeVideoDecoder;
.source "SourceFile"


# instance fields
.field private final fallback:Lhms/webrtc/VideoDecoder;

.field private final primary:Lhms/webrtc/VideoDecoder;


# direct methods
.method public constructor <init>(Lhms/webrtc/VideoDecoder;Lhms/webrtc/VideoDecoder;)V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/WrappedNativeVideoDecoder;-><init>()V

    iput-object p1, p0, Lhms/webrtc/VideoDecoderFallback;->fallback:Lhms/webrtc/VideoDecoder;

    iput-object p2, p0, Lhms/webrtc/VideoDecoderFallback;->primary:Lhms/webrtc/VideoDecoder;

    return-void
.end method

.method private static native nativeCreateDecoder(Lhms/webrtc/VideoDecoder;Lhms/webrtc/VideoDecoder;)J
.end method


# virtual methods
.method public createNativeVideoDecoder()J
    .locals 2

    iget-object v0, p0, Lhms/webrtc/VideoDecoderFallback;->fallback:Lhms/webrtc/VideoDecoder;

    iget-object v1, p0, Lhms/webrtc/VideoDecoderFallback;->primary:Lhms/webrtc/VideoDecoder;

    invoke-static {v0, v1}, Lhms/webrtc/VideoDecoderFallback;->nativeCreateDecoder(Lhms/webrtc/VideoDecoder;Lhms/webrtc/VideoDecoder;)J

    move-result-wide v0

    return-wide v0
.end method
