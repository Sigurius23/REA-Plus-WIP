.class Lorg/webrtc/SimulcastVideoEncoderFactory$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/webrtc/SimulcastVideoEncoderFactory;->getSupportedCodecs()[Lorg/webrtc/VideoCodecInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/webrtc/VideoCodecInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/SimulcastVideoEncoderFactory;


# direct methods
.method public constructor <init>(Lorg/webrtc/SimulcastVideoEncoderFactory;)V
    .locals 0

    iput-object p1, p0, Lorg/webrtc/SimulcastVideoEncoderFactory$1;->this$0:Lorg/webrtc/SimulcastVideoEncoderFactory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lorg/webrtc/VideoCodecInfo;

    check-cast p2, Lorg/webrtc/VideoCodecInfo;

    invoke-virtual {p0, p1, p2}, Lorg/webrtc/SimulcastVideoEncoderFactory$1;->compare(Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)I

    move-result p1

    return p1
.end method

.method public compare(Lorg/webrtc/VideoCodecInfo;Lorg/webrtc/VideoCodecInfo;)I
    .locals 2

    .line 2
    iget-object v0, p1, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    iget-object v1, p2, Lorg/webrtc/VideoCodecInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 3
    :cond_0
    iget-object p1, p1, Lorg/webrtc/VideoCodecInfo;->scalabilityModes:Ljava/util/List;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v0

    .line 4
    :goto_0
    iget-object p2, p2, Lorg/webrtc/VideoCodecInfo;->scalabilityModes:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_2

    move p2, v1

    goto :goto_1

    :cond_2
    move p2, v0

    :goto_1
    if-eqz p1, :cond_3

    if-nez p2, :cond_3

    const/4 p1, -0x1

    return p1

    :cond_3
    if-nez p1, :cond_4

    if-eqz p2, :cond_4

    return v1

    :cond_4
    return v0
.end method
