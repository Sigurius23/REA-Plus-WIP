.class public final Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/utils/VideoFrameToBitmapConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "convertToBitmap",
        "Landroid/graphics/Bitmap;",
        "videoFrame",
        "Lhms/webrtc/VideoFrame;",
        "applyRotation",
        "",
        "convertI420ToArgb",
        "i420Buffer",
        "Lhms/webrtc/VideoFrame$I420Buffer;",
        "rotateBitmap",
        "bitmap",
        "degrees",
        "",
        "getByteArrayFromByteBuffer",
        "",
        "byteBuffer",
        "Ljava/nio/ByteBuffer;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;-><init>()V

    return-void
.end method

.method private final convertI420ToArgb(Lhms/webrtc/VideoFrame$I420Buffer;)Landroid/graphics/Bitmap;
    .locals 15

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v13

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v14

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataY()Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v0, "getDataY(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataU()Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v0, "getDataU(...)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getDataV()Ljava/nio/ByteBuffer;

    move-result-object v4

    const-string v0, "getDataV(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideY()I

    move-result v2

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideU()I

    move-result v8

    invoke-interface/range {p1 .. p1}, Lhms/webrtc/VideoFrame$I420Buffer;->getStrideV()I

    move-result v5

    mul-int v0, v13, v14

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v10

    const-string v0, "allocateDirect(...)"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    mul-int/lit8 v11, v13, 0x4

    const/4 v12, 0x0

    sget-object v0, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v0 .. v14}, Lio/github/crow_misia/libyuv/Yuv;->convertI420ToARGB(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIII)V

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v13, v14, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Landroid/graphics/Bitmap;->copyPixelsFromBuffer(Ljava/nio/Buffer;)V

    return-object v0
.end method

.method public static synthetic convertToBitmap$default(Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;Lhms/webrtc/VideoFrame;ZILjava/lang/Object;)Landroid/graphics/Bitmap;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;->convertToBitmap(Lhms/webrtc/VideoFrame;Z)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final getByteArrayFromByteBuffer(Ljava/nio/ByteBuffer;)[B
    .locals 3

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return-object v1
.end method

.method private final rotateBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 7

    if-nez p2, :cond_0

    return-object p1

    :cond_0
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p2, p2

    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final convertToBitmap(Lhms/webrtc/VideoFrame;Z)Landroid/graphics/Bitmap;
    .locals 4

    const-string v0, "videoFrame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getBuffer()Lhms/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->toI420()Lhms/webrtc/VideoFrame$I420Buffer;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p2, :cond_1

    :try_start_0
    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getRotation()I

    move-result p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, v0}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;->convertI420ToArgb(Lhms/webrtc/VideoFrame$I420Buffer;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    invoke-direct {p0, v2, p1}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;->rotateBitmap(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    return-object v2

    :goto_1
    :try_start_1
    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "VideoFrameToBitmapConverter"

    const-string v3, "Error converting VideoFrame to Bitmap"

    invoke-virtual {p2, v2, v3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    return-object v1

    :goto_2
    invoke-interface {v0}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    throw p1
.end method
