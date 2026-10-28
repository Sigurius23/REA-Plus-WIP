.class public final Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/plugin/video/HMSVideoPlugin;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 N2\u00020\u0001:\u0001NB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ1\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010/\u001a\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u0016\u0010;\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010=\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010<R\u0016\u0010>\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u0016\u0010?\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010<R\u0016\u0010@\u001a\u00020\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008@\u0010<R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0016\u0010H\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010GR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010IR\u001c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00100J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u001c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00100J8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010L\u00a8\u0006O"
    }
    d2 = {
        "Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;",
        "Llive/hms/video/plugin/video/HMSVideoPlugin;",
        "Llive/hms/video/sdk/HMSSDK;",
        "hmsSDK",
        "Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;",
        "hmsBitmapUpdateListener",
        "<init>",
        "(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;)V",
        "",
        "newWidth",
        "newHeight",
        "Ll83/a0;",
        "initInputTextureBuffer",
        "(II)V",
        "Landroid/graphics/Bitmap;",
        "newBitmap",
        "",
        "frameTs",
        "Llive/hms/video/sdk/HMSPluginResultListener;",
        "outputListener",
        "startTime",
        "drawOutputBitmapOnFrame",
        "(Landroid/graphics/Bitmap;JLlive/hms/video/sdk/HMSPluginResultListener;J)V",
        "Llive/hms/video/plugin/video/HMSVideoPluginType;",
        "getPluginType",
        "()Llive/hms/video/plugin/video/HMSVideoPluginType;",
        "Lhms/webrtc/VideoFrame;",
        "inputVideoFrame",
        "",
        "skipProcessing",
        "processVideoFrame",
        "(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V",
        "stop",
        "()V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "isSupported",
        "()Z",
        "init",
        "(Lq83/d;)Ljava/lang/Object;",
        "key",
        "setKey",
        "(Ljava/lang/String;)V",
        "Llive/hms/video/sdk/HMSSDK;",
        "getHmsSDK",
        "()Llive/hms/video/sdk/HMSSDK;",
        "Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;",
        "getHmsBitmapUpdateListener",
        "()Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;",
        "Lhms/webrtc/YuvConverter;",
        "yuvConverter",
        "Lhms/webrtc/YuvConverter;",
        "Lhms/webrtc/VideoFrame$TextureBuffer;",
        "inputTextureBuffer",
        "Lhms/webrtc/VideoFrame$TextureBuffer;",
        "Lhms/webrtc/SurfaceTextureHelper;",
        "surfTextureHelper",
        "Lhms/webrtc/SurfaceTextureHelper;",
        "inputWidth",
        "I",
        "inputHeight",
        "originalWidth",
        "originalHeight",
        "originalFps",
        "",
        "imageAspectRatio",
        "F",
        "inputFrameBitmap",
        "Landroid/graphics/Bitmap;",
        "effectsKey",
        "Ljava/lang/String;",
        "name",
        "Llive/hms/video/sdk/HMSPluginResultListener;",
        "Ljava/util/concurrent/ConcurrentLinkedDeque;",
        "startTimeQueue",
        "Ljava/util/concurrent/ConcurrentLinkedDeque;",
        "inputTimeQueue",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;

.field private static final DEFAULT_BLUR_PERCENTAGE:I

.field private static MIN_API_LEVEL:I = 0x0

.field public static final TAG:Ljava/lang/String; = "HMSBitmapPlugin"

.field private static textures:[I


# instance fields
.field private effectsKey:Ljava/lang/String;

.field private final hmsBitmapUpdateListener:Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;

.field private final hmsSDK:Llive/hms/video/sdk/HMSSDK;

.field private imageAspectRatio:F

.field private inputFrameBitmap:Landroid/graphics/Bitmap;

.field private inputHeight:I

.field private inputTextureBuffer:Lhms/webrtc/VideoFrame$TextureBuffer;

.field private inputTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private inputWidth:I

.field private name:Ljava/lang/String;

.field private originalFps:I

.field private originalHeight:I

.field private originalWidth:I

.field private outputListener:Llive/hms/video/sdk/HMSPluginResultListener;

.field private startTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedDeque<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

.field private final yuvConverter:Lhms/webrtc/YuvConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->Companion:Llive/hms/video/plugin/video/utils/HMSBitmapPlugin$Companion;

    const/4 v0, 0x1

    new-array v0, v0, [I

    sput-object v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->textures:[I

    const/16 v0, 0x15

    sput v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->MIN_API_LEVEL:I

    const/16 v0, 0x4b

    sput v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->DEFAULT_BLUR_PERCENTAGE:I

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/HMSSDK;Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;)V
    .locals 1

    const-string v0, "hmsSDK"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsBitmapUpdateListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsSDK:Llive/hms/video/sdk/HMSSDK;

    iput-object p2, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsBitmapUpdateListener:Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;

    new-instance p1, Lhms/webrtc/YuvConverter;

    invoke-direct {p1}, Lhms/webrtc/YuvConverter;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->yuvConverter:Lhms/webrtc/YuvConverter;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->imageAspectRatio:F

    const-string p1, "@100mslive/hms-bitmap-plugin"

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->name:Ljava/lang/String;

    sget-object p1, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->textures:[I

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {v0, p1, p2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->startTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedDeque;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    return-void
.end method

.method public static synthetic a(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V
    .locals 0

    invoke-static/range {p0 .. p6}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->drawOutputBitmapOnFrame$lambda$3(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V

    return-void
.end method

.method public static final synthetic access$getDEFAULT_BLUR_PERCENTAGE$cp()I
    .locals 1

    sget v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->DEFAULT_BLUR_PERCENTAGE:I

    return v0
.end method

.method public static final synthetic access$getMIN_API_LEVEL$cp()I
    .locals 1

    sget v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->MIN_API_LEVEL:I

    return v0
.end method

.method public static final synthetic access$getTextures$cp()[I
    .locals 1

    sget-object v0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->textures:[I

    return-object v0
.end method

.method public static final synthetic access$setMIN_API_LEVEL$cp(I)V
    .locals 0

    sput p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->MIN_API_LEVEL:I

    return-void
.end method

.method public static final synthetic access$setTextures$cp([I)V
    .locals 0

    sput-object p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->textures:[I

    return-void
.end method

.method private final drawOutputBitmapOnFrame(Landroid/graphics/Bitmap;JLlive/hms/video/sdk/HMSPluginResultListener;J)V
    .locals 9

    if-eqz p1, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lhd3/a;

    move-object v3, p0

    move-object v2, p1

    move-wide v5, p2

    move-object v4, p4

    move-wide v7, p5

    invoke-direct/range {v1 .. v8}, Lhd3/a;-><init>(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final drawOutputBitmapOnFrame$lambda$3(Landroid/graphics/Bitmap;Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;Llive/hms/video/sdk/HMSPluginResultListener;JJ)V
    .locals 3

    const-string v0, "$newBitmap"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xde1

    const/16 v1, 0x2801

    const/16 v2, 0x2600

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v1, 0x2800

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v1, 0x0

    invoke-static {v0, v1, p0, v1}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    iget-object p0, p1, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->yuvConverter:Lhms/webrtc/YuvConverter;

    iget-object p1, p1, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputTextureBuffer:Lhms/webrtc/VideoFrame$TextureBuffer;

    invoke-virtual {p0, p1}, Lhms/webrtc/YuvConverter;->convert(Lhms/webrtc/VideoFrame$TextureBuffer;)Lhms/webrtc/VideoFrame$I420Buffer;

    move-result-object p0

    if-eqz p2, :cond_0

    new-instance p1, Lhms/webrtc/VideoFrame;

    const/16 v0, 0xb4

    invoke-direct {p1, p0, v0, p3, p4}, Lhms/webrtc/VideoFrame;-><init>(Lhms/webrtc/VideoFrame$Buffer;IJ)V

    invoke-interface {p2, p1}, Llive/hms/video/sdk/HMSPluginResultListener;->onOutputResult(Lhms/webrtc/VideoFrame;)V

    :cond_0
    sget-object p0, Llive/hms/video/sdk/ProcessTimeVariables;->INSTANCE:Llive/hms/video/sdk/ProcessTimeVariables;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    sub-long/2addr p3, p5

    invoke-virtual {p0, p3, p4}, Llive/hms/video/sdk/ProcessTimeVariables;->setTimeTakenWithoutML(J)V

    if-eqz p2, :cond_1

    invoke-interface {p2, p0}, Llive/hms/video/sdk/HMSPluginResultListener;->onTimeTaken(Llive/hms/video/sdk/ProcessTimeVariables;)V

    :cond_1
    return-void
.end method

.method private final initInputTextureBuffer(II)V
    .locals 9

    iget v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputWidth:I

    if-ne v0, p1, :cond_1

    iget v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputHeight:I

    if-eq v0, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputWidth:I

    iput p2, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputHeight:I

    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    iput p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->imageAspectRatio:F

    iget-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputTextureBuffer:Lhms/webrtc/VideoFrame$TextureBuffer;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lhms/webrtc/VideoFrame$Buffer;->release()V

    :cond_2
    iget v1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputWidth:I

    iget v2, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputHeight:I

    sget-object v3, Lhms/webrtc/VideoFrame$TextureBuffer$Type;->RGB:Lhms/webrtc/VideoFrame$TextureBuffer$Type;

    sget-object p1, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->textures:[I

    const/4 p2, 0x0

    aget v4, p1, p2

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/high16 p1, -0x40800000    # -1.0f

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postScale(FF)Z

    iget-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lhms/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v6

    iget-object v7, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->yuvConverter:Lhms/webrtc/YuvConverter;

    new-instance v0, Lhms/webrtc/TextureBufferImpl;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Lhms/webrtc/TextureBufferImpl;-><init>(IILhms/webrtc/VideoFrame$TextureBuffer$Type;ILandroid/graphics/Matrix;Landroid/os/Handler;Lhms/webrtc/YuvConverter;Ljava/lang/Runnable;)V

    iput-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputTextureBuffer:Lhms/webrtc/VideoFrame$TextureBuffer;

    return-void
.end method

.method private static final processVideoFrame$lambda$1()Ll83/a0;
    .locals 2

    const-string v0, "HMSBitmapPlugin"

    const-string v1, "Could not convert webrtc YUV frame to Bitmap"

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final getHmsBitmapUpdateListener()Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsBitmapUpdateListener:Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;

    return-object v0
.end method

.method public final getHmsSDK()Llive/hms/video/sdk/HMSSDK;
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsSDK:Llive/hms/video/sdk/HMSSDK;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPluginType()Llive/hms/video/plugin/video/HMSVideoPluginType;
    .locals 1

    sget-object v0, Llive/hms/video/plugin/video/HMSVideoPluginType;->TRANSFORM:Llive/hms/video/plugin/video/HMSVideoPluginType;

    return-object v0
.end method

.method public init(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public isSupported()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget v1, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->MIN_API_LEVEL:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public processVideoFrame(Lhms/webrtc/VideoFrame;Llive/hms/video/sdk/HMSPluginResultListener;Ljava/lang/Boolean;)V
    .locals 9

    const-string p3, "inputVideoFrame"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v0, "~~ New input frame received ~~"

    const-string v1, "HMSBitmapPlugin"

    invoke-virtual {p3, v1, v0}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p2, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->outputListener:Llive/hms/video/sdk/HMSPluginResultListener;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->startTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputTimeQueue:Ljava/util/concurrent/ConcurrentLinkedDeque;

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentLinkedDeque;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsSDK:Llive/hms/video/sdk/HMSSDK;

    invoke-virtual {v0}, Llive/hms/video/sdk/HMSSDK;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSLocalPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getTextureHelper()Lhms/webrtc/SurfaceTextureHelper;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    iput-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->surfTextureHelper:Lhms/webrtc/SurfaceTextureHelper;

    :cond_1
    sget-object v0, Llive/hms/video/utils/VideoFrameToBitmapConverter;->Companion:Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, p1, v3, v4, v2}, Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;->convertToBitmap$default(Llive/hms/video/utils/VideoFrameToBitmapConverter$Companion;Lhms/webrtc/VideoFrame;ZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->inputFrameBitmap:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "~~ Time taken to convert input to bitmap :: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-long/2addr v2, v7

    const-string v5, " ms"

    invoke-static {v2, v3, v5, v4}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v1, v2}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-direct {p0, p3, v1}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->initInputTextureBuffer(II)V

    iget-object p3, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->hmsBitmapUpdateListener:Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;

    invoke-interface {p3, v0}, Llive/hms/video/plugin/video/utils/HMSBitmapUpdateListener;->onFrame(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {p1}, Lhms/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v4

    move-object v2, p0

    move-object v6, p2

    invoke-direct/range {v2 .. v8}, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->drawOutputBitmapOnFrame(Landroid/graphics/Bitmap;JLlive/hms/video/sdk/HMSPluginResultListener;J)V

    :cond_2
    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Llive/hms/video/plugin/video/HMSVideoPlugin$DefaultImpls;->setKey(Llive/hms/video/plugin/video/HMSVideoPlugin;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->effectsKey:Ljava/lang/String;

    return-void
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->originalWidth:I

    iput v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->originalHeight:I

    iput v0, p0, Llive/hms/video/plugin/video/utils/HMSBitmapPlugin;->originalFps:I

    return-void
.end method
