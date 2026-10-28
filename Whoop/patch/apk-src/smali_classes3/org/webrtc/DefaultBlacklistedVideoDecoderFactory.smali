.class public Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoDecoderFactory;


# static fields
.field private static final TAG:Ljava/lang/String; = "DefaultBlacklistedVideoDecoderFactory"

.field private static final defaultBlacklistedPredicate:Ljava/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Predicate<",
            "Lorg/webrtc/VideoDecoder;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final hardwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

.field private final isHardwareDecoderBlacklisted:Ljava/util/function/Predicate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Predicate<",
            "Lorg/webrtc/VideoDecoder;",
            ">;"
        }
    .end annotation
.end field

.field private final platformSoftwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

.field private final softwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory$1;

    invoke-direct {v0}, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory$1;-><init>()V

    sput-object v0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->defaultBlacklistedPredicate:Ljava/util/function/Predicate;

    return-void
.end method

.method public constructor <init>(Lorg/webrtc/EglBase$Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;-><init>(Lorg/webrtc/EglBase$Context;Ljava/util/function/Predicate;)V

    return-void
.end method

.method public constructor <init>(Lorg/webrtc/EglBase$Context;Ljava/util/function/Predicate;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/webrtc/EglBase$Context;",
            "Ljava/util/function/Predicate<",
            "Lorg/webrtc/VideoDecoder;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lorg/webrtc/HardwareVideoDecoderFactory;

    invoke-direct {v0, p1}, Lorg/webrtc/HardwareVideoDecoderFactory;-><init>(Lorg/webrtc/EglBase$Context;)V

    iput-object v0, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->hardwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    .line 4
    new-instance v0, Lorg/webrtc/SoftwareVideoDecoderFactory;

    invoke-direct {v0}, Lorg/webrtc/SoftwareVideoDecoderFactory;-><init>()V

    iput-object v0, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->softwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    .line 5
    new-instance v0, Lorg/webrtc/PlatformSoftwareVideoDecoderFactory;

    invoke-direct {v0, p1}, Lorg/webrtc/PlatformSoftwareVideoDecoderFactory;-><init>(Lorg/webrtc/EglBase$Context;)V

    iput-object v0, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    if-nez p2, :cond_0

    .line 6
    sget-object p1, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->defaultBlacklistedPredicate:Ljava/util/function/Predicate;

    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->defaultBlacklistedPredicate:Ljava/util/function/Predicate;

    invoke-interface {p2, p1}, Ljava/util/function/Predicate;->or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->isHardwareDecoderBlacklisted:Ljava/util/function/Predicate;

    return-void
.end method

.method public static bridge synthetic a(Lorg/webrtc/VideoDecoder;)Z
    .locals 0

    invoke-static {p0}, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->isExynosVP9(Lorg/webrtc/VideoDecoder;)Z

    move-result p0

    return p0
.end method

.method private static isExynosVP9(Lorg/webrtc/VideoDecoder;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Lorg/webrtc/VideoDecoder;->getImplementationName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v1, "exynos"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "vp9"

    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v0
.end method


# virtual methods
.method public createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;
    .locals 3

    iget-object v0, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->softwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v0, p1}, Lorg/webrtc/VideoDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;

    move-result-object v0

    iget-object v1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->hardwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v1, p1}, Lorg/webrtc/VideoDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;

    move-result-object v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v0, p1}, Lorg/webrtc/VideoDecoderFactory;->createDecoder(Lorg/webrtc/VideoCodecInfo;)Lorg/webrtc/VideoDecoder;

    move-result-object v0

    :cond_0
    iget-object p1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->isHardwareDecoderBlacklisted:Ljava/util/function/Predicate;

    invoke-interface {p1, v1}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {v1}, Lorg/webrtc/VideoDecoder;->getImplementationName()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Hardware decoder is blacklisted: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "DefaultBlacklistedVideoDecoderFactory"

    invoke-static {v1, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    if-eqz v1, :cond_2

    if-eqz v0, :cond_2

    new-instance p1, Lorg/webrtc/VideoDecoderFallback;

    invoke-direct {p1, v0, v1}, Lorg/webrtc/VideoDecoderFallback;-><init>(Lorg/webrtc/VideoDecoder;Lorg/webrtc/VideoDecoder;)V

    return-object p1

    :cond_2
    if-eqz v1, :cond_3

    return-object v1

    :cond_3
    return-object v0
.end method

.method public getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->softwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v1}, Lorg/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->hardwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v1}, Lorg/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->platformSoftwareVideoDecoderFactory:Lorg/webrtc/VideoDecoderFactory;

    invoke-interface {v1}, Lorg/webrtc/VideoDecoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    new-array v1, v1, [Lorg/webrtc/VideoCodecInfo;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/VideoCodecInfo;

    return-object v0
.end method
