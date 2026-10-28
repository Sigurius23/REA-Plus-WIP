.class public Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FramerateRange"
.end annotation


# instance fields
.field public max:I

.field public min:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    iput p2, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    iget v2, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    iget p1, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    const v0, 0x10001

    iget v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    mul-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->min:I

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    iget v2, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->max:I

    int-to-float v2, v2

    div-float/2addr v2, v1

    const-string v1, ":"

    const-string v3, "]"

    const-string v4, "["

    invoke-static {v4, v0, v1, v2, v3}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
