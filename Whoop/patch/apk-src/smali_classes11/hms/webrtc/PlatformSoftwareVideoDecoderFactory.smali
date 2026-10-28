.class public Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;
.super Lhms/webrtc/MediaCodecVideoDecoderFactory;
.source "SourceFile"


# static fields
.field private static final defaultAllowedPredicate:Lhms/webrtc/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhms/webrtc/Predicate<",
            "Landroid/media/MediaCodecInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory$1;

    invoke-direct {v0}, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory$1;-><init>()V

    sput-object v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;->defaultAllowedPredicate:Lhms/webrtc/Predicate;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/EglBase$Context;)V
    .locals 1

    sget-object v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;->defaultAllowedPredicate:Lhms/webrtc/Predicate;

    invoke-direct {p0, p1, v0}, Lhms/webrtc/MediaCodecVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;Lhms/webrtc/Predicate;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;
    .locals 0

    invoke-super {p0, p1}, Lhms/webrtc/MediaCodecVideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 1

    invoke-super {p0}, Lhms/webrtc/MediaCodecVideoDecoderFactory;->getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;

    move-result-object v0

    return-object v0
.end method
