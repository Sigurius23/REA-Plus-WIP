.class public final Lq33/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoProcessor;


# instance fields
.field public final a:Lkotlin/jvm/internal/m;

.field public final b:Lkotlin/jvm/internal/m;

.field public c:Lorg/webrtc/VideoSink;

.field public final d:Lorg/webrtc/YuvConverter;

.field public e:I

.field public f:I

.field public g:Lorg/webrtc/TextureBufferImpl;

.field public h:Lorg/webrtc/VideoFrame$I420Buffer;

.field public final i:[I

.field public j:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lc93/a;Lc93/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lkotlin/jvm/internal/m;

    iput-object p1, p0, Lq33/b;->a:Lkotlin/jvm/internal/m;

    check-cast p2, Lkotlin/jvm/internal/m;

    iput-object p2, p0, Lq33/b;->b:Lkotlin/jvm/internal/m;

    new-instance p1, Lorg/webrtc/YuvConverter;

    invoke-direct {p1}, Lorg/webrtc/YuvConverter;-><init>()V

    iput-object p1, p0, Lq33/b;->d:Lorg/webrtc/YuvConverter;

    const/4 p1, 0x1

    new-array p2, p1, [I

    iput-object p2, p0, Lq33/b;->i:[I

    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    return-void
.end method


# virtual methods
.method public final onCapturerStarted(Z)V
    .locals 0

    return-void
.end method

.method public final onCapturerStopped()V
    .locals 0

    return-void
.end method

.method public final onFrameCaptured(Lorg/webrtc/VideoFrame;)V
    .locals 31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "frame"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lq33/b;->a:Lkotlin/jvm/internal/m;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq33/a;

    if-nez v3, :cond_0

    iget-object v0, v1, Lq33/b;->c:Lorg/webrtc/VideoSink;

    if-eqz v0, :cond_1a

    invoke-interface {v0, v2}, Lorg/webrtc/VideoSink;->onFrame(Lorg/webrtc/VideoFrame;)V

    return-void

    :cond_0
    instance-of v4, v3, Lq33/a;

    if-eqz v4, :cond_1b

    sget-object v0, Lq33/c;->a:Ll83/p;

    invoke-virtual {v2}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->toI420()Lorg/webrtc/VideoFrame$I420Buffer;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    :try_start_0
    new-instance v8, Lr53/f;

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideY()I

    move-result v6

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataY()Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v9, "getDataY(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v8, v6, v7}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    new-instance v9, Lr53/f;

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideU()I

    move-result v6

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataU()Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v10, "getDataU(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, v6, v7}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    new-instance v10, Lr53/f;

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getStrideV()I

    move-result v6

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$I420Buffer;->getDataV()Ljava/nio/ByteBuffer;

    move-result-object v7

    const-string v11, "getDataV(...)"

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v10, v6, v7}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getWidth()I

    move-result v11

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->getHeight()I

    move-result v12

    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13, v4, v4, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    new-instance v6, Lr53/e;

    const/4 v7, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v14}, Lr53/e;-><init>(Ljava/nio/ByteBuffer;Lr53/f;Lr53/f;Lr53/f;IILandroid/graphics/Rect;Lr53/a;)V

    invoke-virtual {v2}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v7

    invoke-static {v6, v7}, Lq33/c;->a(Lr53/e;I)Lr53/e;

    move-result-object v6

    iget v10, v6, Lr53/e;->H:I

    iget v11, v6, Lr53/e;->I:I

    new-instance v12, Landroid/graphics/Rect;

    invoke-direct {v12, v4, v4, v10, v11}, Landroid/graphics/Rect;-><init>(IIII)V

    shl-int/lit8 v7, v10, 0x2

    mul-int v8, v7, v11

    new-instance v9, Lr53/d;

    invoke-direct {v9, v8}, Lr53/d;-><init>(I)V

    invoke-static {v9}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Ldp/d;->v(Ljava/util/List;)[Ljava/nio/ByteBuffer;

    move-result-object v8

    aget-object v8, v8, v4

    new-instance v9, Lr53/b;

    move-object v13, v9

    new-instance v9, Lr53/f;

    invoke-direct {v9, v7, v8}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    move-object v7, v13

    new-instance v13, Lr53/a;

    invoke-direct {v13, v8, v4}, Lr53/a;-><init>(Ljava/nio/ByteBuffer;I)V

    invoke-direct/range {v7 .. v13}, Lr53/b;-><init>(Ljava/nio/ByteBuffer;Lr53/f;IILandroid/graphics/Rect;Lr53/a;)V

    invoke-virtual {v6, v7}, Lr53/e;->h(Lr53/b;)V

    invoke-virtual {v7}, Lr53/b;->h()Landroid/graphics/Bitmap;

    move-result-object v8

    invoke-virtual {v6}, Lr53/c;->close()V

    invoke-virtual {v7}, Lr53/c;->close()V

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v5, v8

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v6, Lq33/c;->a:Ll83/p;

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb23/k;

    iget-object v7, v6, Lb23/k;->c:Lb23/e;

    iget-object v8, v6, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->F:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    iget-object v6, v6, Lb23/k;->b:Lb23/j;

    const-string v7, "Failed to convert VideoFrame to Bitmap"

    invoke-interface {v6, v9, v8, v7, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    iput-object v5, v1, Lq33/b;->j:Landroid/graphics/Bitmap;

    if-eqz v5, :cond_1a

    iget-object v0, v1, Lq33/b;->c:Lorg/webrtc/VideoSink;

    if-eqz v0, :cond_1a

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    iget-object v5, v1, Lq33/b;->j:Landroid/graphics/Bitmap;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    iget-object v6, v1, Lq33/b;->b:Lkotlin/jvm/internal/m;

    invoke-interface {v6}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lorg/webrtc/SurfaceTextureHelper;

    iget-object v7, v1, Lq33/b;->h:Lorg/webrtc/VideoFrame$I420Buffer;

    if-eqz v7, :cond_3

    invoke-interface {v7}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    :cond_3
    iget v7, v1, Lq33/b;->e:I

    if-ne v7, v0, :cond_4

    iget v7, v1, Lq33/b;->f:I

    if-eq v7, v5, :cond_6

    :cond_4
    iput v0, v1, Lq33/b;->e:I

    iput v5, v1, Lq33/b;->f:I

    iget-object v0, v1, Lq33/b;->g:Lorg/webrtc/TextureBufferImpl;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lorg/webrtc/VideoFrame$Buffer;->release()V

    :cond_5
    sget-object v10, Lorg/webrtc/VideoFrame$TextureBuffer$Type;->RGB:Lorg/webrtc/VideoFrame$TextureBuffer$Type;

    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v5, -0x40800000    # -1.0f

    invoke-virtual {v12, v0, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    new-instance v7, Lorg/webrtc/TextureBufferImpl;

    iget v8, v1, Lq33/b;->e:I

    iget v9, v1, Lq33/b;->f:I

    iget-object v0, v1, Lq33/b;->i:[I

    aget v11, v0, v4

    invoke-virtual {v6}, Lorg/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v13

    iget-object v14, v1, Lq33/b;->d:Lorg/webrtc/YuvConverter;

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v15}, Lorg/webrtc/TextureBufferImpl;-><init>(IILorg/webrtc/VideoFrame$TextureBuffer$Type;ILandroid/graphics/Matrix;Landroid/os/Handler;Lorg/webrtc/YuvConverter;Ljava/lang/Runnable;)V

    iput-object v7, v1, Lq33/b;->g:Lorg/webrtc/TextureBufferImpl;

    :cond_6
    iget-object v8, v1, Lq33/b;->j:Landroid/graphics/Bitmap;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x4

    const/16 v5, 0x60

    const/16 v6, 0x50

    invoke-static {v6, v0, v5}, Le93/b;->n(III)I

    move-result v0

    if-lez v0, :cond_18

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    if-eqz v5, :cond_18

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_c

    :cond_7
    iget-object v3, v3, Lq33/a;->a:Lb30/m;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    add-int/lit8 v5, v11, -0x1

    add-int/lit8 v6, v15, -0x1

    mul-int v7, v11, v15

    invoke-static {v11, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    iget-object v10, v3, Lb30/m;->x:Ljava/lang/Object;

    check-cast v10, [I

    array-length v10, v10

    if-ge v10, v7, :cond_8

    new-array v10, v7, [I

    iput-object v10, v3, Lb30/m;->x:Ljava/lang/Object;

    new-array v10, v7, [I

    iput-object v10, v3, Lb30/m;->y:Ljava/lang/Object;

    new-array v10, v7, [I

    iput-object v10, v3, Lb30/m;->z:Ljava/lang/Object;

    new-array v7, v7, [I

    iput-object v7, v3, Lb30/m;->E:Ljava/lang/Object;

    :cond_8
    iget-object v7, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v7, [I

    array-length v7, v7

    if-ge v7, v9, :cond_9

    new-array v7, v9, [I

    iput-object v7, v3, Lb30/m;->F:Ljava/lang/Object;

    :cond_9
    iget-object v7, v3, Lb30/m;->x:Ljava/lang/Object;

    move-object v9, v7

    check-cast v9, [I

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x0

    move v14, v11

    invoke-virtual/range {v8 .. v15}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    add-int v7, v0, v0

    add-int/lit8 v9, v7, 0x1

    add-int/lit8 v10, v0, 0x1

    add-int/lit8 v7, v7, 0x2

    shr-int/lit8 v7, v7, 0x1

    mul-int/2addr v7, v7

    mul-int/lit16 v12, v7, 0x100

    new-array v13, v12, [I

    move v14, v4

    :goto_1
    if-ge v14, v12, :cond_a

    div-int v16, v14, v7

    aput v16, v13, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_a
    mul-int/lit8 v7, v9, 0x3

    new-array v7, v7, [I

    move v12, v4

    move v14, v12

    move/from16 v16, v14

    :goto_2
    if-ge v12, v15, :cond_10

    neg-int v4, v0

    if-gt v4, v0, :cond_c

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :goto_3
    iget-object v2, v3, Lb30/m;->x:Ljava/lang/Object;

    check-cast v2, [I

    move-object/from16 v26, v2

    move-object/from16 v27, v7

    const/4 v2, 0x0

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int/2addr v2, v14

    aget v2, v26, v2

    add-int v7, v4, v0

    mul-int/lit8 v7, v7, 0x3

    move/from16 v26, v7

    shr-int/lit8 v7, v2, 0x10

    and-int/lit16 v7, v7, 0xff

    aput v7, v27, v26

    add-int/lit8 v7, v26, 0x1

    move/from16 v28, v7

    shr-int/lit8 v7, v2, 0x8

    and-int/lit16 v7, v7, 0xff

    aput v7, v27, v28

    add-int/lit8 v7, v26, 0x2

    and-int/lit16 v2, v2, 0xff

    aput v2, v27, v7

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v2

    sub-int v2, v10, v2

    aget v26, v27, v26

    mul-int v29, v26, v2

    add-int v17, v29, v17

    aget v28, v27, v28

    mul-int v29, v28, v2

    add-int v18, v29, v18

    aget v7, v27, v7

    mul-int/2addr v2, v7

    add-int v19, v2, v19

    if-lez v4, :cond_b

    add-int v23, v23, v26

    add-int v24, v24, v28

    add-int v25, v25, v7

    goto :goto_4

    :cond_b
    add-int v20, v20, v26

    add-int v21, v21, v28

    add-int v22, v22, v7

    :goto_4
    if-eq v4, v0, :cond_d

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v7, v27

    goto :goto_3

    :cond_c
    move-object/from16 v27, v7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :cond_d
    move v4, v0

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v11, :cond_f

    iget-object v7, v3, Lb30/m;->y:Ljava/lang/Object;

    check-cast v7, [I

    aget v26, v13, v17

    aput v26, v7, v14

    iget-object v7, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v7, [I

    aget v26, v13, v18

    aput v26, v7, v14

    iget-object v7, v3, Lb30/m;->E:Ljava/lang/Object;

    check-cast v7, [I

    aget v26, v13, v19

    aput v26, v7, v14

    sub-int v17, v17, v20

    sub-int v18, v18, v21

    sub-int v19, v19, v22

    sub-int v7, v4, v0

    add-int/2addr v7, v9

    rem-int/2addr v7, v9

    mul-int/lit8 v7, v7, 0x3

    aget v26, v27, v7

    sub-int v20, v20, v26

    add-int/lit8 v26, v7, 0x1

    aget v28, v27, v26

    sub-int v21, v21, v28

    add-int/lit8 v28, v7, 0x2

    aget v29, v27, v28

    sub-int v22, v22, v29

    move/from16 v29, v2

    if-nez v12, :cond_e

    iget-object v2, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, [I

    move-object/from16 v30, v2

    add-int v2, v29, v10

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    aput v2, v30, v29

    :cond_e
    iget-object v2, v3, Lb30/m;->x:Ljava/lang/Object;

    check-cast v2, [I

    move-object/from16 v30, v2

    iget-object v2, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v2, [I

    aget v2, v2, v29

    add-int v2, v16, v2

    aget v2, v30, v2

    move/from16 v30, v4

    shr-int/lit8 v4, v2, 0x10

    and-int/lit16 v4, v4, 0xff

    aput v4, v27, v7

    shr-int/lit8 v4, v2, 0x8

    and-int/lit16 v4, v4, 0xff

    aput v4, v27, v26

    and-int/lit16 v2, v2, 0xff

    aput v2, v27, v28

    aget v4, v27, v7

    add-int v23, v23, v4

    aget v4, v27, v26

    add-int v24, v24, v4

    add-int v25, v25, v2

    add-int v17, v17, v23

    add-int v18, v18, v24

    add-int v19, v19, v25

    add-int/lit8 v4, v30, 0x1

    rem-int/2addr v4, v9

    mul-int/lit8 v2, v4, 0x3

    aget v7, v27, v2

    add-int v20, v20, v7

    add-int/lit8 v26, v2, 0x1

    aget v26, v27, v26

    add-int v21, v21, v26

    add-int/lit8 v2, v2, 0x2

    aget v2, v27, v2

    add-int v22, v22, v2

    sub-int v23, v23, v7

    sub-int v24, v24, v26

    sub-int v25, v25, v2

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v2, v29, 0x1

    goto/16 :goto_5

    :cond_f
    add-int v16, v16, v11

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, p1

    move-object/from16 v7, v27

    const/4 v4, 0x0

    goto/16 :goto_2

    :cond_10
    move-object/from16 v27, v7

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v11, :cond_17

    neg-int v4, v0

    mul-int v5, v4, v11

    move/from16 v20, v2

    if-gt v4, v0, :cond_14

    move v2, v4

    move v4, v5

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_7
    const/4 v5, 0x0

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v23

    add-int v23, v23, v20

    add-int v5, v2, v0

    mul-int/lit8 v5, v5, 0x3

    move/from16 v24, v4

    iget-object v4, v3, Lb30/m;->y:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    aput v4, v27, v5

    add-int/lit8 v4, v5, 0x1

    move/from16 v25, v4

    iget-object v4, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    aput v4, v27, v25

    add-int/lit8 v4, v5, 0x2

    move/from16 v26, v4

    iget-object v4, v3, Lb30/m;->E:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    aput v4, v27, v26

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v4, v10, v4

    move/from16 v28, v4

    iget-object v4, v3, Lb30/m;->y:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    mul-int v4, v4, v28

    add-int v21, v4, v21

    iget-object v4, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    mul-int v4, v4, v28

    add-int v22, v4, v22

    iget-object v4, v3, Lb30/m;->E:Ljava/lang/Object;

    check-cast v4, [I

    aget v4, v4, v23

    mul-int v4, v4, v28

    add-int/2addr v7, v4

    if-lez v2, :cond_11

    aget v4, v27, v5

    add-int v17, v17, v4

    aget v4, v27, v25

    add-int v18, v18, v4

    aget v4, v27, v26

    add-int v19, v19, v4

    goto :goto_8

    :cond_11
    aget v4, v27, v5

    add-int/2addr v12, v4

    aget v4, v27, v25

    add-int/2addr v14, v4

    aget v4, v27, v26

    add-int v16, v16, v4

    :goto_8
    if-ge v2, v6, :cond_12

    add-int v4, v24, v11

    goto :goto_9

    :cond_12
    move/from16 v4, v24

    :goto_9
    if-eq v2, v0, :cond_13

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_13
    move/from16 v2, v21

    goto :goto_a

    :cond_14
    const/4 v2, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    :goto_a
    move/from16 v21, v0

    move v4, v2

    move/from16 v5, v20

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v15, :cond_16

    move/from16 v23, v0

    iget-object v0, v3, Lb30/m;->x:Ljava/lang/Object;

    check-cast v0, [I

    aget v24, v0, v5

    const/high16 v25, -0x1000000

    and-int v24, v24, v25

    aget v25, v13, v4

    shl-int/lit8 v25, v25, 0x10

    or-int v24, v24, v25

    aget v25, v13, v22

    shl-int/lit8 v25, v25, 0x8

    or-int v24, v24, v25

    aget v25, v13, v7

    or-int v24, v24, v25

    aput v24, v0, v5

    sub-int/2addr v4, v12

    sub-int v22, v22, v14

    sub-int v7, v7, v16

    sub-int v0, v21, v23

    add-int/2addr v0, v9

    rem-int/2addr v0, v9

    mul-int/lit8 v0, v0, 0x3

    aget v24, v27, v0

    sub-int v12, v12, v24

    add-int/lit8 v24, v0, 0x1

    aget v25, v27, v24

    sub-int v14, v14, v25

    add-int/lit8 v25, v0, 0x2

    aget v26, v27, v25

    sub-int v16, v16, v26

    move/from16 v26, v0

    if-nez v20, :cond_15

    iget-object v0, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, [I

    move-object/from16 v28, v0

    add-int v0, v2, v10

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    mul-int/2addr v0, v11

    aput v0, v28, v2

    :cond_15
    iget-object v0, v3, Lb30/m;->F:Ljava/lang/Object;

    check-cast v0, [I

    aget v0, v0, v2

    add-int v0, v20, v0

    move/from16 v28, v0

    iget-object v0, v3, Lb30/m;->y:Ljava/lang/Object;

    check-cast v0, [I

    aget v0, v0, v28

    aput v0, v27, v26

    iget-object v0, v3, Lb30/m;->z:Ljava/lang/Object;

    check-cast v0, [I

    aget v0, v0, v28

    aput v0, v27, v24

    iget-object v0, v3, Lb30/m;->E:Ljava/lang/Object;

    check-cast v0, [I

    aget v0, v0, v28

    aput v0, v27, v25

    aget v25, v27, v26

    add-int v17, v17, v25

    aget v24, v27, v24

    add-int v18, v18, v24

    add-int v19, v19, v0

    add-int v4, v4, v17

    add-int v22, v22, v18

    add-int v7, v7, v19

    add-int/lit8 v21, v21, 0x1

    rem-int v21, v21, v9

    mul-int/lit8 v0, v21, 0x3

    aget v24, v27, v0

    add-int v12, v12, v24

    add-int/lit8 v25, v0, 0x1

    aget v25, v27, v25

    add-int v14, v14, v25

    add-int/lit8 v0, v0, 0x2

    aget v0, v27, v0

    add-int v16, v16, v0

    sub-int v17, v17, v24

    sub-int v18, v18, v25

    sub-int v19, v19, v0

    add-int/2addr v5, v11

    add-int/lit8 v2, v2, 0x1

    move/from16 v0, v23

    goto/16 :goto_b

    :cond_16
    move/from16 v23, v0

    add-int/lit8 v2, v20, 0x1

    goto/16 :goto_6

    :cond_17
    iget-object v0, v3, Lb30/m;->x:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, [I

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x0

    move v14, v11

    invoke-virtual/range {v8 .. v15}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    :cond_18
    :goto_c
    const/16 v0, 0x2801

    const/16 v2, 0xde1

    const/16 v3, 0x2600

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2800

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    iget-object v0, v1, Lq33/b;->j:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v2, v5, v0, v5}, Landroid/opengl/GLUtils;->texImage2D(IILandroid/graphics/Bitmap;I)V

    iget-object v0, v1, Lq33/b;->d:Lorg/webrtc/YuvConverter;

    iget-object v2, v1, Lq33/b;->g:Lorg/webrtc/TextureBufferImpl;

    invoke-virtual {v0, v2}, Lorg/webrtc/YuvConverter;->convert(Lorg/webrtc/VideoFrame$TextureBuffer;)Lorg/webrtc/VideoFrame$I420Buffer;

    move-result-object v0

    iput-object v0, v1, Lq33/b;->h:Lorg/webrtc/VideoFrame$I420Buffer;

    iget-object v2, v1, Lq33/b;->c:Lorg/webrtc/VideoSink;

    if-eqz v2, :cond_19

    new-instance v3, Lorg/webrtc/VideoFrame;

    invoke-virtual/range {p1 .. p1}, Lorg/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v6

    invoke-direct {v3, v0, v5, v6, v7}, Lorg/webrtc/VideoFrame;-><init>(Lorg/webrtc/VideoFrame$Buffer;IJ)V

    invoke-interface {v2, v3}, Lorg/webrtc/VideoSink;->onFrame(Lorg/webrtc/VideoFrame;)V

    :cond_19
    iget-object v0, v1, Lq33/b;->j:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1a

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1a
    return-void

    :cond_1b
    new-instance v2, Ljava/lang/Error;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Unsupported video filter type "

    invoke-static {v0, v3}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final setSink(Lorg/webrtc/VideoSink;)V
    .locals 0

    iput-object p1, p0, Lq33/b;->c:Lorg/webrtc/VideoSink;

    return-void
.end method
