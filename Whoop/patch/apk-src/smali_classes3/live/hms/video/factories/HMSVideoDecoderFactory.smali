.class public final Llive/hms/video/factories/HMSVideoDecoderFactory;
.super Lhms/webrtc/DefaultVideoDecoderFactory;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/factories/HMSVideoDecoderFactory;",
        "Lhms/webrtc/DefaultVideoDecoderFactory;",
        "Lhms/webrtc/EglBase$Context;",
        "eglContext",
        "",
        "forceSoftwareDecoder",
        "<init>",
        "(Lhms/webrtc/EglBase$Context;Z)V",
        "Lhms/webrtc/VideoCodecInfo;",
        "codecType",
        "Lhms/webrtc/VideoDecoder;",
        "createDecoder",
        "(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;",
        "Z",
        "getForceSoftwareDecoder",
        "()Z",
        "Lhms/webrtc/HardwareVideoDecoderFactory;",
        "hardwareVideoDecoderFactory$delegate",
        "Ll83/h;",
        "getHardwareVideoDecoderFactory",
        "()Lhms/webrtc/HardwareVideoDecoderFactory;",
        "hardwareVideoDecoderFactory",
        "Lhms/webrtc/SoftwareVideoDecoderFactory;",
        "softwareVideoDecoderFactory$delegate",
        "getSoftwareVideoDecoderFactory",
        "()Lhms/webrtc/SoftwareVideoDecoderFactory;",
        "softwareVideoDecoderFactory",
        "Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;",
        "platformSoftwareVideoDecoderFactory$delegate",
        "getPlatformSoftwareVideoDecoderFactory",
        "()Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;",
        "platformSoftwareVideoDecoderFactory",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final forceSoftwareDecoder:Z

.field private final hardwareVideoDecoderFactory$delegate:Ll83/h;

.field private final platformSoftwareVideoDecoderFactory$delegate:Ll83/h;

.field private final softwareVideoDecoderFactory$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lhms/webrtc/EglBase$Context;Z)V
    .locals 1

    const-string v0, "eglContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lhms/webrtc/DefaultVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;)V

    .line 3
    iput-boolean p2, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->forceSoftwareDecoder:Z

    .line 4
    new-instance p2, Llive/hms/video/factories/d;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Llive/hms/video/factories/d;-><init>(Lhms/webrtc/EglBase$Context;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->hardwareVideoDecoderFactory$delegate:Ll83/h;

    .line 5
    new-instance p2, Llh1/a;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Llh1/a;-><init>(I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->softwareVideoDecoderFactory$delegate:Ll83/h;

    .line 6
    new-instance p2, Llive/hms/video/factories/d;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Llive/hms/video/factories/d;-><init>(Lhms/webrtc/EglBase$Context;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->platformSoftwareVideoDecoderFactory$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lhms/webrtc/EglBase$Context;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Llive/hms/video/factories/HMSVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;Z)V

    return-void
.end method

.method public static synthetic a()Lhms/webrtc/SoftwareVideoDecoderFactory;
    .locals 1

    invoke-static {}, Llive/hms/video/factories/HMSVideoDecoderFactory;->softwareVideoDecoderFactory_delegate$lambda$1()Lhms/webrtc/SoftwareVideoDecoderFactory;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;
    .locals 0

    invoke-static {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->platformSoftwareVideoDecoderFactory_delegate$lambda$2(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/HardwareVideoDecoderFactory;
    .locals 0

    invoke-static {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->hardwareVideoDecoderFactory_delegate$lambda$0(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/HardwareVideoDecoderFactory;

    move-result-object p0

    return-object p0
.end method

.method private final getHardwareVideoDecoderFactory()Lhms/webrtc/HardwareVideoDecoderFactory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->hardwareVideoDecoderFactory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/HardwareVideoDecoderFactory;

    return-object v0
.end method

.method private final getPlatformSoftwareVideoDecoderFactory()Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->platformSoftwareVideoDecoderFactory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    return-object v0
.end method

.method private final getSoftwareVideoDecoderFactory()Lhms/webrtc/SoftwareVideoDecoderFactory;
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->softwareVideoDecoderFactory$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhms/webrtc/SoftwareVideoDecoderFactory;

    return-object v0
.end method

.method private static final hardwareVideoDecoderFactory_delegate$lambda$0(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/HardwareVideoDecoderFactory;
    .locals 1

    const-string v0, "$eglContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhms/webrtc/HardwareVideoDecoderFactory;

    invoke-direct {v0, p0}, Lhms/webrtc/HardwareVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;)V

    return-object v0
.end method

.method private static final platformSoftwareVideoDecoderFactory_delegate$lambda$2(Lhms/webrtc/EglBase$Context;)Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;
    .locals 1

    const-string v0, "$eglContext"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    invoke-direct {v0, p0}, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;-><init>(Lhms/webrtc/EglBase$Context;)V

    return-object v0
.end method

.method private static final softwareVideoDecoderFactory_delegate$lambda$1()Lhms/webrtc/SoftwareVideoDecoderFactory;
    .locals 1

    new-instance v0, Lhms/webrtc/SoftwareVideoDecoderFactory;

    invoke-direct {v0}, Lhms/webrtc/SoftwareVideoDecoderFactory;-><init>()V

    return-object v0
.end method


# virtual methods
.method public createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;
    .locals 3

    invoke-direct {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->getSoftwareVideoDecoderFactory()Lhms/webrtc/SoftwareVideoDecoderFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/SoftwareVideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v0

    invoke-direct {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->getHardwareVideoDecoderFactory()Lhms/webrtc/HardwareVideoDecoderFactory;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Lhms/webrtc/HardwareVideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v1

    if-nez v0, :cond_0

    invoke-direct {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->getPlatformSoftwareVideoDecoderFactory()Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-direct {p0}, Llive/hms/video/factories/HMSVideoDecoderFactory;->getPlatformSoftwareVideoDecoderFactory()Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;

    move-result-object v0

    invoke-virtual {v0, p1}, Lhms/webrtc/PlatformSoftwareVideoDecoderFactory;->createDecoder(Lhms/webrtc/VideoCodecInfo;)Lhms/webrtc/VideoDecoder;

    move-result-object v0

    :cond_0
    iget-boolean p1, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->forceSoftwareDecoder:Z

    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    new-instance p1, Lhms/webrtc/VideoDecoderFallback;

    invoke-direct {p1, v0, v1}, Lhms/webrtc/VideoDecoderFallback;-><init>(Lhms/webrtc/VideoDecoder;Lhms/webrtc/VideoDecoder;)V

    return-object p1

    :cond_2
    if-nez v1, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0

    :cond_3
    return-object v1
.end method

.method public final getForceSoftwareDecoder()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/factories/HMSVideoDecoderFactory;->forceSoftwareDecoder:Z

    return v0
.end method
