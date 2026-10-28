.class final Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PlaneWrapper"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;",
        "",
        "width",
        "",
        "height",
        "plane",
        "Landroid/media/Image$Plane;",
        "<init>",
        "(IILandroid/media/Image$Plane;)V",
        "getWidth",
        "()I",
        "getHeight",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "getBuffer",
        "()Ljava/nio/ByteBuffer;",
        "rowStride",
        "getRowStride",
        "pixelStride",
        "getPixelStride",
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
.field private final buffer:Ljava/nio/ByteBuffer;

.field private final height:I

.field private final pixelStride:I

.field private final rowStride:I

.field private final width:I


# direct methods
.method public constructor <init>(IILandroid/media/Image$Plane;)V
    .locals 1

    const-string v0, "plane"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->width:I

    iput p2, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->height:I

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string p2, "getBuffer(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->buffer:Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getRowStride()I

    move-result p1

    iput p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->rowStride:I

    invoke-virtual {p3}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result p1

    iput p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->pixelStride:I

    return-void
.end method


# virtual methods
.method public final getBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->buffer:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->height:I

    return v0
.end method

.method public final getPixelStride()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->pixelStride:I

    return v0
.end method

.method public final getRowStride()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->rowStride:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer$PlaneWrapper;->width:I

    return v0
.end method
