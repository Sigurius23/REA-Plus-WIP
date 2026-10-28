.class Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/HardwareVideoEncoderWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CropSizeCalculator"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CropSizeCalculator"


# instance fields
.field private final alignment:I

.field private final cropX:I

.field private final cropY:I

.field private final originalHeight:I

.field private final originalWidth:I


# direct methods
.method public constructor <init>(III)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->alignment:I

    iput p2, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalWidth:I

    iput p3, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalHeight:I

    rem-int v0, p2, p1

    iput v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropX:I

    rem-int v0, p3, p1

    iput v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropY:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedWidth()I

    move-result v0

    invoke-virtual {p0}, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->getCroppedHeight()I

    move-result v1

    const-string v2, "init(): alignment="

    const-string v3, " size="

    const-string v4, "x"

    invoke-static {p1, p2, v2, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, " => "

    invoke-static {p1, p3, p2, v0, v4}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CropSizeCalculator"

    invoke-static {p2, p1}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic a(Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;)I
    .locals 0

    iget p0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropX:I

    return p0
.end method

.method public static bridge synthetic b(Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;)I
    .locals 0

    iget p0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropY:I

    return p0
.end method


# virtual methods
.method public getCroppedHeight()I
    .locals 2

    iget v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalHeight:I

    iget v1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropY:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public getCroppedWidth()I
    .locals 2

    iget v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalWidth:I

    iget v1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropX:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public hasFrameSizeChanged(II)Z
    .locals 5

    iget v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalWidth:I

    if-ne v0, p1, :cond_0

    iget v1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalHeight:I

    if-ne v1, p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget v1, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->originalHeight:I

    const-string v2, "frame size has changed: "

    const-string v3, " => "

    const-string v4, "x"

    invoke-static {v0, v1, v2, v4, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CropSizeCalculator"

    invoke-static {p2, p1}, Lorg/webrtc/Logging;->v(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public isCropRequired()Z
    .locals 1

    iget v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropX:I

    if-nez v0, :cond_1

    iget v0, p0, Lorg/webrtc/HardwareVideoEncoderWrapper$CropSizeCalculator;->cropY:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
