.class final Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImageWrapper"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;",
        "",
        "image",
        "Landroid/media/Image;",
        "<init>",
        "(Landroid/media/Image;)V",
        "width",
        "",
        "getWidth",
        "()I",
        "height",
        "getHeight",
        "y",
        "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;",
        "getY",
        "()Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;",
        "u",
        "getU",
        "v",
        "getV",
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
.field private final height:I

.field private final u:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

.field private final v:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

.field private final width:I

.field private final y:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 9

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v0

    iput v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->width:I

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v1

    iput v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->height:I

    new-instance v2, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v0, v1, v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v2, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->y:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    new-instance v3, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    div-int/lit8 v5, v0, 0x2

    div-int/lit8 v6, v1, 0x2

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v7

    const/4 v8, 0x1

    aget-object v7, v7, v8

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v5, v6, v7}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v3, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->u:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    new-instance v5, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    const/4 v6, 0x2

    div-int/2addr v0, v6

    div-int/2addr v1, v6

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object p1

    aget-object p1, p1, v6

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v0, v1, p1}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;-><init>(IILandroid/media/Image$Plane;)V

    iput-object v5, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->v:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    invoke-virtual {v2}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result p1

    if-ne p1, v8, :cond_3

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result p1

    invoke-virtual {v5}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getRowStride()I

    move-result p1

    invoke-virtual {v5}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getRowStride()I

    move-result v0

    if-ne p1, v0, :cond_2

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result p1

    if-eq p1, v8, :cond_1

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result p1

    if-ne p1, v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Supported pixel strides for U and V planes are 1 and 2"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "U and V planes must have the same pixel and row strides but got pixel="

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " row="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getRowStride()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " for U and pixel="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " and row="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getRowStride()I

    move-result v0

    const-string v1, " for V"

    invoke-static {p1, v0, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Pixel stride for Y plane must be 1 but got "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->getPixelStride()I

    move-result v0

    const-string v1, " instead."

    invoke-static {p1, v0, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->height:I

    return v0
.end method

.method public final getU()Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->u:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    return-object v0
.end method

.method public final getV()Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->v:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->width:I

    return v0
.end method

.method public final getY()Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$ImageWrapper;->y:Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;

    return-object v0
.end method
