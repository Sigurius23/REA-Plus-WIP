.class public final Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/media/Image;",
        "image",
        "Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;",
        "yuvBuffer",
        "",
        "needCreateAllocations",
        "(Landroid/media/Image;Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;)Z",
        "Landroid/graphics/Bitmap;",
        "output",
        "Ll83/a0;",
        "yuvToRgb",
        "(Landroid/media/Image;Landroid/graphics/Bitmap;)V",
        "Landroid/renderscript/RenderScript;",
        "kotlin.jvm.PlatformType",
        "rs",
        "Landroid/renderscript/RenderScript;",
        "Landroid/renderscript/ScriptIntrinsicYuvToRGB;",
        "scriptYuvToRgb",
        "Landroid/renderscript/ScriptIntrinsicYuvToRGB;",
        "Ljava/nio/ByteBuffer;",
        "yuvBits",
        "Ljava/nio/ByteBuffer;",
        "",
        "bytes",
        "[B",
        "Landroid/renderscript/Allocation;",
        "inputAllocation",
        "Landroid/renderscript/Allocation;",
        "outputAllocation",
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
.field private bytes:[B

.field private inputAllocation:Landroid/renderscript/Allocation;

.field private outputAllocation:Landroid/renderscript/Allocation;

.field private final rs:Landroid/renderscript/RenderScript;

.field private final scriptYuvToRgb:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

.field private yuvBits:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/renderscript/RenderScript;->create(Landroid/content/Context;)Landroid/renderscript/RenderScript;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->rs:Landroid/renderscript/RenderScript;

    invoke-static {p1}, Landroid/renderscript/Element;->U8_4(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->create(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->scriptYuvToRgb:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    const/4 p1, 0x0

    new-array p1, p1, [B

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    return-void
.end method

.method private final needCreateAllocations(Landroid/media/Image;Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;)Z
    .locals 2

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v0

    invoke-virtual {v0}, Landroid/renderscript/Type;->getX()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object v0

    invoke-virtual {v0}, Landroid/renderscript/Type;->getY()I

    move-result v0

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/renderscript/Allocation;->getType()Landroid/renderscript/Type;

    move-result-object p1

    invoke-virtual {p1}, Landroid/renderscript/Type;->getYuv()I

    move-result p1

    invoke-virtual {p2}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getType()I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    array-length p1, p1

    invoke-virtual {p2}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/Buffer;->capacity()I

    move-result p2

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final declared-synchronized yuvToRgb(Landroid/media/Image;Landroid/graphics/Bitmap;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->yuvBits:Ljava/nio/ByteBuffer;

    invoke-direct {v0, p1, v1}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;-><init>(Landroid/media/Image;Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->yuvBits:Ljava/nio/ByteBuffer;

    invoke-direct {p0, p1, v0}, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->needCreateAllocations(Landroid/media/Image;Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Landroid/renderscript/Type$Builder;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->rs:Landroid/renderscript/RenderScript;

    invoke-static {v2}, Landroid/renderscript/Element;->U8(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/renderscript/Type$Builder;-><init>(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setX(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setY(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getType()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setYuvFormat(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->rs:Landroid/renderscript/RenderScript;

    invoke-virtual {v1}, Landroid/renderscript/Type$Builder;->create()Landroid/renderscript/Type;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v2, v1, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;I)Landroid/renderscript/Allocation;

    move-result-object v1

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    new-instance v1, Landroid/renderscript/Type$Builder;

    iget-object v2, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->rs:Landroid/renderscript/RenderScript;

    invoke-static {v2}, Landroid/renderscript/Element;->RGBA_8888(Landroid/renderscript/RenderScript;)Landroid/renderscript/Element;

    move-result-object v4

    invoke-direct {v1, v2, v4}, Landroid/renderscript/Type$Builder;-><init>(Landroid/renderscript/RenderScript;Landroid/renderscript/Element;)V

    invoke-virtual {p1}, Landroid/media/Image;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/renderscript/Type$Builder;->setX(I)Landroid/renderscript/Type$Builder;

    move-result-object v1

    invoke-virtual {p1}, Landroid/media/Image;->getHeight()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/renderscript/Type$Builder;->setY(I)Landroid/renderscript/Type$Builder;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->rs:Landroid/renderscript/RenderScript;

    invoke-virtual {p1}, Landroid/renderscript/Type$Builder;->create()Landroid/renderscript/Type;

    move-result-object p1

    invoke-static {v1, p1, v3}, Landroid/renderscript/Allocation;->createTyped(Landroid/renderscript/RenderScript;Landroid/renderscript/Type;I)Landroid/renderscript/Allocation;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->outputAllocation:Landroid/renderscript/Allocation;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Llive/hms/video/media/capturers/camera/utils/YuvByteBuffer;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    invoke-virtual {p1, v0}, Landroid/renderscript/Allocation;->copyFrom([B)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->bytes:[B

    invoke-virtual {p1, v0}, Landroid/renderscript/Allocation;->copyFrom([B)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->scriptYuvToRgb:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->inputAllocation:Landroid/renderscript/Allocation;

    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->setInput(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->scriptYuvToRgb:Landroid/renderscript/ScriptIntrinsicYuvToRGB;

    iget-object v0, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->outputAllocation:Landroid/renderscript/Allocation;

    invoke-virtual {p1, v0}, Landroid/renderscript/ScriptIntrinsicYuvToRGB;->forEach(Landroid/renderscript/Allocation;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/camera/utils/YuvToRgbConverter;->outputAllocation:Landroid/renderscript/Allocation;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/renderscript/Allocation;->copyTo(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
