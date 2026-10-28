.class public Lhms/webrtc/LibvpxVp8Decoder;
.super Lhms/webrtc/WrappedNativeVideoDecoder;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lhms/webrtc/WrappedNativeVideoDecoder;-><init>()V

    return-void
.end method

.method public static native nativeCreateDecoder()J
.end method


# virtual methods
.method public createNativeVideoDecoder()J
    .locals 2

    invoke-static {}, Lhms/webrtc/LibvpxVp8Decoder;->nativeCreateDecoder()J

    move-result-wide v0

    return-wide v0
.end method
