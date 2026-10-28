.class public Lhms/webrtc/SoftwareVideoEncoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/VideoEncoderFactory;


# static fields
.field private static final TAG:Ljava/lang/String; = "SoftwareVideoEncoderFactory"


# instance fields
.field private final nativeFactory:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeCreateFactory()J

    move-result-wide v0

    iput-wide v0, p0, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeFactory:J

    return-void
.end method

.method private static native nativeCreateEncoder(JLhms/webrtc/VideoCodecInfo;)J
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
.method public createEncoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoEncoder;
    .locals 4

    iget-wide v0, p0, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeFactory:J

    invoke-static {v0, v1, p1}, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeCreateEncoder(JLhms/webrtc/VideoCodecInfo;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Trying to create encoder for unsupported format. "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SoftwareVideoEncoderFactory"

    invoke-static {v0, p1}, Lhms/webrtc/Logging;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lhms/webrtc/SoftwareVideoEncoderFactory$1;

    invoke-direct {p1, p0, v0, v1}, Lhms/webrtc/SoftwareVideoEncoderFactory$1;-><init>(Lhms/webrtc/SoftwareVideoEncoderFactory;J)V

    return-object p1
.end method

.method public getSupportedCodecs()[Lhms/webrtc/VideoCodecInfo;
    .locals 2

    iget-wide v0, p0, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeFactory:J

    invoke-static {v0, v1}, Lhms/webrtc/SoftwareVideoEncoderFactory;->nativeGetSupportedCodecs(J)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lhms/webrtc/VideoCodecInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhms/webrtc/VideoCodecInfo;

    return-object v0
.end method
