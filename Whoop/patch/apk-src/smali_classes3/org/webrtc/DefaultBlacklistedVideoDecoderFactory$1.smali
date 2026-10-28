.class Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/function/Predicate<",
        "Lorg/webrtc/VideoDecoder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lorg/webrtc/VideoDecoder;

    invoke-virtual {p0, p1}, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory$1;->test(Lorg/webrtc/VideoDecoder;)Z

    move-result p1

    return p1
.end method

.method public test(Lorg/webrtc/VideoDecoder;)Z
    .locals 0

    .line 2
    invoke-static {p1}, Lorg/webrtc/DefaultBlacklistedVideoDecoderFactory;->a(Lorg/webrtc/VideoDecoder;)Z

    move-result p1

    return p1
.end method
