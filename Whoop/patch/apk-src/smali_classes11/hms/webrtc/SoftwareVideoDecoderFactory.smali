.class public Lhms/webrtc/SoftwareVideoDecoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoDecoderFactory;


# static fields
.field private static final TAG:Ljava/lang/String; = "SoftwareVideoDecoderFactory"


# instance fields
.field private final nativeFactory:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeCreateFactory()J

    move-result-wide v0

    iput-wide v0, p0, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeFactory:J

    return-void
.end method

.method private static native nativeCreateDecoder(JLhms/webrtc/VideoCodecInfo;)J
.end method

.method private static native nativeCreateFactory()J
.end method

.method private static native nativeGetSupportedCodecs(J)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lhms/webrtc/VideoCodecInfo;",
            ">;"
        }
    .end annotation
.end method


# virtual methods
.method public createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;
    .locals 4

    iget-wide v0, p0, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeFactory:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeCreateDecoder(JLhms/webrtc/VideoCodecInfo;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to create decoder for unsupported format. "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SoftwareVideoDecoderFactory"

    invoke-static {v0, p1}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lhms/webrtc/SoftwareVideoDecoderFactory$1;

    invoke-direct {p1, p0, v0, v1}, Lhms/webrtc/SoftwareVideoDecoderFactory$1;-><init>(Lhms/webrtc/SoftwareVideoDecoderFactory;J)V

    return-object p1
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeFactory:J

    invoke-static {v0, v1}, Lhms/webrtc/SoftwareVideoDecoderFactory;->nativeGetSupportedCodecs(J)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
