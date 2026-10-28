.class public final Lgl/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Lwk/g;

.field public static final g:Lwk/g;

.field public static final h:Lwk/g;

.field public static final i:Lwk/g;

.field public static final j:Lqt/e;

.field public static final k:Ljava/util/ArrayDeque;


# instance fields
.field public final a:Lal/b;

.field public final b:Landroid/util/DisplayMetrics;

.field public final c:Lal/g;

.field public final d:Ljava/util/ArrayList;

.field public final e:Lgl/s;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat"

    sget-object v1, Lwk/b;->y:Lwk/b;

    invoke-static {v1, v0}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lgl/m;->f:Lwk/g;

    const-string v0, "com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace"

    sget-object v1, Lwk/i;->w:Lwk/i;

    invoke-static {v1, v0}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lgl/m;->g:Lwk/g;

    sget-object v0, Lgl/k;->b:Lgl/k;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize"

    invoke-static {v0, v1}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v1

    sput-object v1, Lgl/m;->h:Lwk/g;

    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode"

    invoke-static {v0, v1}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lgl/m;->i:Lwk/g;

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "image/vnd.wap.wbmp"

    const-string v2, "image/x-ico"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    new-instance v0, Lqt/e;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lgl/m;->j:Lqt/e;

    sget-object v0, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    sget-object v1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    sget-object v2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    invoke-static {v0, v1, v2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    sget-object v0, Ltl/l;->a:[C

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    sput-object v0, Lgl/m;->k:Ljava/util/ArrayDeque;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lal/b;Lal/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lgl/s;->a()Lgl/s;

    move-result-object v0

    iput-object v0, p0, Lgl/m;->e:Lgl/s;

    iput-object p1, p0, Lgl/m;->d:Ljava/util/ArrayList;

    const-string p1, "Argument must not be null"

    invoke-static {p2, p1}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lgl/m;->b:Landroid/util/DisplayMetrics;

    iput-object p3, p0, Lgl/m;->a:Lal/b;

    iput-object p4, p0, Lgl/m;->c:Lal/g;

    return-void
.end method

.method public static c(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/l;Lal/b;)Landroid/graphics/Bitmap;
    .locals 9

    const-string v0, "Downsampler"

    iget-boolean v1, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    if-nez v1, :cond_0

    invoke-interface {p2}, Lgl/l;->k()V

    invoke-virtual {p0}, La33/d;->R()V

    :cond_0
    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget-object v3, p1, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    invoke-static {}, Lgl/w;->c()Ljava/util/concurrent/locks/Lock;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0, p1}, La33/d;->j(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {}, Lgl/w;->c()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p0

    :catch_0
    move-exception v4

    :try_start_1
    new-instance v5, Ljava/io/IOException;

    const-string v6, "Exception decoding bitmap, outWidth: "

    const-string v7, ", outHeight: "

    const-string v8, ", outMimeType: "

    invoke-static {v1, v2, v6, v7, v8}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", inBitmap: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lgl/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v5, v1, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Failed to decode with inBitmap, trying again without Bitmap re-use"

    invoke-static {v0, v1, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    iget-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_2

    :try_start_2
    invoke-interface {p3, v0}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p1, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {p0, p1, p2, p3}, Lgl/m;->c(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/l;Lal/b;)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_1
    :try_start_3
    throw v5

    :cond_2
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception p0

    invoke-static {}, Lgl/w;->c()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0
.end method

.method public static d(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/graphics/BitmapFactory$Options;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    const/4 v2, 0x1

    iput v2, p0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    iput-boolean v1, p0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iput v1, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    iput-object v0, p0, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    iput-boolean v2, p0, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    return-void
.end method


# virtual methods
.method public final a(La33/d;IILwk/h;Lgl/l;)Lgl/c;
    .locals 14

    move-object/from16 v0, p4

    iget-object v2, p0, Lgl/m;->c:Lal/g;

    const/high16 v3, 0x10000

    const-class v4, [B

    invoke-virtual {v2, v3, v4}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, [B

    const-class v2, Lgl/m;

    monitor-enter v2

    :try_start_0
    sget-object v13, Lgl/m;->k:Ljava/util/ArrayDeque;

    monitor-enter v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v13}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/BitmapFactory$Options;

    monitor-exit v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    if-nez v3, :cond_0

    :try_start_2
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-static {v3}, Lgl/m;->e(Landroid/graphics/BitmapFactory$Options;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_0
    :goto_0
    monitor-exit v2

    iput-object v12, v3, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    sget-object v2, Lgl/m;->f:Lwk/g;

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lwk/b;

    sget-object v2, Lgl/m;->g:Lwk/g;

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lwk/i;

    sget-object v2, Lgl/k;->g:Lwk/g;

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lgl/k;

    sget-object v2, Lgl/m;->h:Lwk/g;

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    sget-object v2, Lgl/m;->i:Lwk/g;

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v0, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v11, p5

    move v7, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    :try_start_3
    invoke-virtual/range {v1 .. v11}, Lgl/m;->b(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/k;Lwk/b;Lwk/i;ZIIZLgl/l;)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, Lgl/m;->a:Lal/b;

    invoke-static {v2, v0}, Lgl/c;->b(Lal/b;Landroid/graphics/Bitmap;)Lgl/c;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-static {v3}, Lgl/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    monitor-enter v13

    :try_start_4
    invoke-virtual {v13, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v2, p0, Lgl/m;->c:Lal/g;

    invoke-virtual {v2, v12}, Lal/g;->g(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0

    :catchall_2
    move-exception v0

    invoke-static {v3}, Lgl/m;->e(Landroid/graphics/BitmapFactory$Options;)V

    sget-object v4, Lgl/m;->k:Ljava/util/ArrayDeque;

    monitor-enter v4

    :try_start_6
    invoke-virtual {v4, v3}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    iget-object v2, p0, Lgl/m;->c:Lal/g;

    invoke-virtual {v2, v12}, Lal/g;->g(Ljava/lang/Object;)V

    throw v0

    :catchall_3
    move-exception v0

    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :catchall_4
    move-exception v0

    :try_start_8
    monitor-exit v13
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    throw v0

    :goto_3
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    throw v0
.end method

.method public final b(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/k;Lwk/b;Lwk/i;ZIIZLgl/l;)Landroid/graphics/Bitmap;
    .locals 42

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v5, p7

    move/from16 v6, p8

    move-object/from16 v7, p10

    const-string v8, ", target density: "

    const-string v9, ", density: "

    const-string v10, "x"

    const-string v11, "Downsampler"

    invoke-static {}, Ltl/g;->b()J

    move-result-wide v12

    iget-object v14, v1, Lgl/m;->a:Lal/b;

    const/4 v15, 0x1

    iput-boolean v15, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v2, v3, v7, v14}, Lgl/m;->c(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/l;Lal/b;)Landroid/graphics/Bitmap;

    move/from16 v16, v15

    const/4 v15, 0x0

    iput-boolean v15, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    move/from16 v17, v15

    iget v15, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    move-wide/from16 v18, v12

    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v15, v12}, [I

    move-result-object v12

    aget v13, v12, v17

    aget v12, v12, v16

    iget-object v15, v3, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    move-object/from16 v20, v15

    const/4 v15, -0x1

    if-eq v13, v15, :cond_0

    if-ne v12, v15, :cond_1

    :cond_0
    move/from16 p6, v17

    :cond_1
    invoke-virtual {v2}, La33/d;->s()I

    move-result v15

    move/from16 v21, v15

    invoke-static/range {v21 .. v21}, Lgl/w;->d(I)I

    move-result v15

    invoke-static/range {v21 .. v21}, Lgl/w;->e(I)Z

    move-result v22

    const/16 v4, 0x5a

    const/high16 v1, -0x80000000

    if-ne v5, v1, :cond_4

    if-eq v15, v4, :cond_3

    const/16 v4, 0x10e

    if-ne v15, v4, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v24, v13

    goto :goto_1

    :cond_3
    const/16 v4, 0x10e

    :goto_0
    move/from16 v24, v12

    goto :goto_1

    :cond_4
    const/16 v4, 0x10e

    move/from16 v24, v5

    :goto_1
    if-ne v6, v1, :cond_7

    const/16 v1, 0x5a

    if-eq v15, v1, :cond_6

    if-ne v15, v4, :cond_5

    goto :goto_2

    :cond_5
    move v1, v12

    goto :goto_3

    :cond_6
    :goto_2
    move v1, v13

    goto :goto_3

    :cond_7
    move v1, v6

    :goto_3
    invoke-virtual {v2}, La33/d;->t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v4

    const-string v6, "]"

    const/high16 v25, 0x3f800000    # 1.0f

    if-lez v13, :cond_1c

    if-gtz v12, :cond_8

    move-object v0, v6

    move-object v6, v8

    move-object v8, v9

    move-object/from16 p3, v14

    move/from16 v5, v24

    const/4 v9, 0x3

    move v14, v12

    goto/16 :goto_11

    :cond_8
    const/16 v5, 0x5a

    if-eq v15, v5, :cond_a

    const/16 v5, 0x10e

    if-ne v15, v5, :cond_9

    goto :goto_5

    :cond_9
    move-object/from16 v23, v6

    move v6, v13

    move/from16 v5, v24

    move-object/from16 v24, v9

    move v9, v12

    :goto_4
    move-object/from16 v26, v8

    goto :goto_6

    :cond_a
    :goto_5
    move-object/from16 v23, v6

    move v6, v12

    move/from16 v5, v24

    move-object/from16 v24, v9

    move v9, v13

    goto :goto_4

    :goto_6
    invoke-virtual {v0, v6, v9, v5, v1}, Lgl/k;->b(IIII)F

    move-result v8

    const/16 v27, 0x0

    cmpg-float v27, v8, v27

    if-lez v27, :cond_1b

    move/from16 v27, v8

    invoke-virtual {v0, v6, v9, v5, v1}, Lgl/k;->a(IIII)I

    move-result v8

    if-eqz v8, :cond_1a

    move/from16 v28, v15

    int-to-float v15, v6

    move/from16 v29, v6

    mul-float v6, v27, v15

    move/from16 v31, v12

    move/from16 v30, v13

    float-to-double v12, v6

    const-wide/high16 v32, 0x3fe0000000000000L    # 0.5

    add-double v12, v12, v32

    double-to-int v6, v12

    int-to-float v12, v9

    mul-float v13, v27, v12

    move/from16 v23, v12

    float-to-double v12, v13

    add-double v12, v12, v32

    double-to-int v12, v12

    div-int v6, v29, v6

    div-int v12, v9, v12

    move/from16 v13, v16

    if-ne v8, v13, :cond_b

    invoke-static {v6, v12}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_7

    :cond_b
    invoke-static {v6, v12}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_7
    invoke-static {v6}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v6

    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    if-ne v8, v13, :cond_c

    int-to-float v8, v6

    div-float v12, v25, v27

    cmpg-float v8, v8, v12

    if-gez v8, :cond_c

    shl-int/lit8 v6, v6, 0x1

    :cond_c
    iput v6, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->JPEG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v4, v8, :cond_d

    const/16 v4, 0x8

    invoke-static {v6, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v15, v4

    float-to-double v8, v15

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-int v8, v8

    div-float v12, v23, v4

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v4, v12

    div-int/lit8 v9, v6, 0x8

    if-lez v9, :cond_14

    div-int/2addr v8, v9

    div-int/2addr v4, v9

    goto :goto_b

    :cond_d
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v4, v8, :cond_13

    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->PNG_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v4, v8, :cond_e

    goto :goto_a

    :cond_e
    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v4, v8, :cond_12

    sget-object v8, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->WEBP_A:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne v4, v8, :cond_f

    goto :goto_9

    :cond_f
    rem-int v4, v29, v6

    if-nez v4, :cond_10

    rem-int v4, v9, v6

    if-eqz v4, :cond_11

    :cond_10
    const/4 v13, 0x1

    goto :goto_8

    :cond_11
    div-int v8, v29, v6

    div-int v4, v9, v6

    goto :goto_b

    :goto_8
    iput-boolean v13, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-static {v2, v3, v7, v14}, Lgl/m;->c(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/l;Lal/b;)Landroid/graphics/Bitmap;

    move/from16 v4, v17

    iput-boolean v4, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v8, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v9, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    filled-new-array {v8, v9}, [I

    move-result-object v8

    aget v9, v8, v4

    aget v4, v8, v13

    move v8, v9

    goto :goto_b

    :cond_12
    :goto_9
    int-to-float v4, v6

    div-float/2addr v15, v4

    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    move-result v8

    div-float v12, v23, v4

    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    move-result v4

    goto :goto_b

    :cond_13
    :goto_a
    int-to-float v4, v6

    div-float/2addr v15, v4

    float-to-double v8, v15

    invoke-static {v8, v9}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-int v8, v8

    div-float v12, v23, v4

    float-to-double v12, v12

    invoke-static {v12, v13}, Ljava/lang/Math;->floor(D)D

    move-result-wide v12

    double-to-int v4, v12

    :cond_14
    :goto_b
    invoke-virtual {v0, v8, v4, v5, v1}, Lgl/k;->b(IIII)F

    move-result v0

    float-to-double v12, v0

    const-wide/high16 v34, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, v12, v34

    if-gtz v0, :cond_15

    move-wide/from16 v36, v12

    goto :goto_c

    :cond_15
    div-double v36, v34, v12

    :goto_c
    const-wide v38, 0x41dfffffffc00000L    # 2.147483647E9

    mul-double v36, v36, v38

    move-object v9, v14

    invoke-static/range {v36 .. v37}, Ljava/lang/Math;->round(D)J

    move-result-wide v14

    long-to-int v14, v14

    move-wide/from16 v36, v12

    int-to-double v12, v14

    mul-double v12, v12, v36

    add-double v12, v12, v32

    double-to-int v12, v12

    int-to-float v13, v12

    int-to-float v14, v14

    div-float/2addr v13, v14

    float-to-double v13, v13

    div-double v13, v36, v13

    move-wide/from16 v40, v13

    int-to-double v12, v12

    mul-double v13, v40, v12

    add-double v13, v13, v32

    double-to-int v12, v13

    iput v12, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-gtz v0, :cond_16

    move-wide/from16 v34, v36

    goto :goto_d

    :cond_16
    div-double v34, v34, v36

    :goto_d
    mul-double v34, v34, v38

    invoke-static/range {v34 .. v35}, Ljava/lang/Math;->round(D)J

    move-result-wide v12

    long-to-int v0, v12

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    iget v12, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v12, :cond_17

    if-lez v0, :cond_17

    if-eq v12, v0, :cond_17

    const/4 v13, 0x1

    iput-boolean v13, v3, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    :goto_e
    const/4 v12, 0x2

    goto :goto_f

    :cond_17
    const/4 v12, 0x0

    iput v12, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    iput v12, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    goto :goto_e

    :goto_f
    invoke-static {v11, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "Calculate scaling, source: ["

    const-string v12, "], degreesToRotate: "

    move/from16 v13, v30

    move/from16 v14, v31

    invoke-static {v13, v14, v0, v10, v12}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", target: ["

    move/from16 v15, v28

    invoke-static {v0, v15, v12, v5, v10}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v12, "], power of two scaled: ["

    invoke-static {v0, v1, v12, v8, v10}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "], exact scale factor: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v4, v27

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, ", power of 2 sample size: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", adjusted scale factor: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 p3, v9

    move-wide/from16 v8, v36

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-object/from16 v6, v26

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v8, v24

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_18
    :goto_10
    move-object/from16 v4, p0

    goto/16 :goto_12

    :cond_19
    move-object/from16 p3, v9

    move-object/from16 v8, v24

    move-object/from16 v6, v26

    move/from16 v13, v30

    move/from16 v14, v31

    goto :goto_10

    :cond_1a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Cannot round with null rounding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    move v4, v8

    move v14, v12

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Cannot scale with factor: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, " from: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source: ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "], target: ["

    invoke-static {v3, v13, v10, v14, v0}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    move-object/from16 v0, v23

    invoke-static {v3, v5, v10, v1, v0}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1c
    move-object v0, v6

    move-object v6, v8

    move-object v8, v9

    move-object/from16 p3, v14

    move/from16 v5, v24

    move v14, v12

    const/4 v9, 0x3

    :goto_11
    invoke-static {v11, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v12

    if-eqz v12, :cond_18

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v12, "Unable to determine dimensions for: "

    invoke-direct {v9, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " with target ["

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_10

    :goto_12
    iget-object v9, v4, Lgl/m;->e:Lgl/s;

    const/4 v0, 0x0

    if-eqz p6, :cond_21

    iget-boolean v12, v9, Lgl/s;->a:Z

    if-eqz v12, :cond_1d

    if-eqz v22, :cond_1e

    :cond_1d
    move/from16 v23, v1

    goto :goto_16

    :cond_1e
    if-ltz v5, :cond_1d

    if-ltz v1, :cond_1d

    const-string v12, "Excluding HARDWARE bitmap config because we\'re over the file descriptor limit, file descriptors "

    monitor-enter v9

    :try_start_0
    iget v15, v9, Lgl/s;->c:I

    const/16 v22, 0x1

    add-int/lit8 v15, v15, 0x1

    iput v15, v9, Lgl/s;->c:I

    move/from16 v23, v1

    const/16 v1, 0x32

    if-lt v15, v1, :cond_20

    iput v0, v9, Lgl/s;->c:I

    sget-object v1, Lgl/s;->e:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    iget v15, v9, Lgl/s;->b:I

    if-ge v1, v15, :cond_1f

    move/from16 v15, v22

    goto :goto_13

    :cond_1f
    move v15, v0

    :goto_13
    iput-boolean v15, v9, Lgl/s;->d:Z

    if-nez v15, :cond_20

    const-string v15, "Downsampler"

    const/4 v0, 0x5

    invoke-static {v15, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "Downsampler"

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", limit "

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v9, Lgl/s;->b:I

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_14

    :catchall_0
    move-exception v0

    goto :goto_15

    :cond_20
    :goto_14
    iget-boolean v0, v9, Lgl/s;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v9

    if-eqz v0, :cond_22

    move/from16 v0, v22

    goto :goto_17

    :goto_15
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_21
    move/from16 v23, v1

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_22
    :goto_16
    const/4 v0, 0x0

    :goto_17
    if-eqz v0, :cond_23

    sget-object v1, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iput-object v1, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    const/4 v12, 0x0

    iput-boolean v12, v3, Landroid/graphics/BitmapFactory$Options;->inMutable:Z

    goto :goto_18

    :cond_23
    const/4 v12, 0x0

    :goto_18
    if-eqz v0, :cond_25

    :cond_24
    const/4 v1, 0x1

    goto :goto_1b

    :cond_25
    sget-object v0, Lwk/b;->w:Lwk/b;

    move-object/from16 v1, p4

    if-eq v1, v0, :cond_28

    :try_start_2
    invoke-virtual {v2}, La33/d;->t()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->hasAlpha()Z

    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_19

    :catch_0
    move-exception v0

    const/4 v9, 0x3

    invoke-static {v11, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_26

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v15, "Cannot determine whether the image has alpha or not from header, format "

    invoke-direct {v9, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_26
    move v0, v12

    :goto_19
    if-eqz v0, :cond_27

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_1a

    :cond_27
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_1a
    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne v0, v1, :cond_24

    const/4 v1, 0x1

    iput-boolean v1, v3, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    goto :goto_1b

    :cond_28
    const/4 v1, 0x1

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    :goto_1b
    if-ltz v13, :cond_29

    if-ltz v14, :cond_29

    if-eqz p9, :cond_29

    move/from16 v1, v23

    goto/16 :goto_1e

    :cond_29
    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    if-lez v0, :cond_2a

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    if-lez v5, :cond_2a

    if-eq v0, v5, :cond_2a

    move v5, v1

    goto :goto_1c

    :cond_2a
    move v5, v12

    :goto_1c
    if-eqz v5, :cond_2b

    int-to-float v0, v0

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    int-to-float v5, v5

    div-float v25, v0, v5

    :cond_2b
    move/from16 v0, v25

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    int-to-float v9, v13

    int-to-float v15, v5

    div-float/2addr v9, v15

    float-to-double v1, v9

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    int-to-float v2, v14

    div-float/2addr v2, v15

    move/from16 v30, v13

    float-to-double v12, v2

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v2, v12

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    const/4 v12, 0x2

    invoke-static {v11, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_2c

    const-string v9, "Calculated target ["

    const-string v12, "] for source ["

    invoke-static {v1, v2, v9, v10, v12}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v12, "], sampleSize: "

    move/from16 v13, v30

    invoke-static {v9, v13, v10, v14, v12}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", targetDensity: "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", density multiplier: "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1d

    :cond_2c
    move/from16 v13, v30

    :goto_1d
    move v5, v1

    move v1, v2

    :goto_1e
    if-lez v5, :cond_2f

    if-lez v1, :cond_2f

    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v0, v2, :cond_2d

    goto :goto_21

    :cond_2d
    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->outConfig:Landroid/graphics/Bitmap$Config;

    if-nez v2, :cond_2e

    :goto_1f
    move-object/from16 v9, p3

    goto :goto_20

    :cond_2e
    move-object v0, v2

    goto :goto_1f

    :goto_20
    invoke-interface {v9, v5, v1, v0}, Lal/b;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    goto :goto_22

    :cond_2f
    :goto_21
    move-object/from16 v9, p3

    :goto_22
    sget-object v0, Lwk/i;->x:Lwk/i;

    move-object/from16 v1, p5

    if-ne v1, v0, :cond_30

    iget-object v0, v3, Landroid/graphics/BitmapFactory$Options;->outColorSpace:Landroid/graphics/ColorSpace;

    if-eqz v0, :cond_30

    invoke-virtual {v0}, Landroid/graphics/ColorSpace;->isWideGamut()Z

    move-result v0

    if-eqz v0, :cond_30

    const/4 v15, 0x1

    goto :goto_23

    :cond_30
    const/4 v15, 0x0

    :goto_23
    if-eqz v15, :cond_31

    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    goto :goto_24

    :cond_31
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    :goto_24
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredColorSpace:Landroid/graphics/ColorSpace;

    move-object/from16 v2, p1

    invoke-static {v2, v3, v7, v9}, Lgl/m;->c(La33/d;Landroid/graphics/BitmapFactory$Options;Lgl/l;Lal/b;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-interface {v7, v9, v0}, Lgl/l;->i(Lal/b;Landroid/graphics/Bitmap;)V

    const/4 v12, 0x2

    invoke-static {v11, v12}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_32

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Decoded "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lgl/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " from ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] "

    const-string v5, " with inBitmap "

    move-object/from16 v7, v20

    invoke-static {v14, v2, v7, v5, v1}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v2, v3, Landroid/graphics/BitmapFactory$Options;->inBitmap:Landroid/graphics/Bitmap;

    invoke-static {v2}, Lgl/m;->d(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " for ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, p7

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v2, p8

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "], sample size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inDensity:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v3, Landroid/graphics/BitmapFactory$Options;->inTargetDensity:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", thread: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", duration: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v18 .. v19}, Ltl/g;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_32
    if-eqz v0, :cond_33

    iget-object v1, v4, Lgl/m;->b:Landroid/util/DisplayMetrics;

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->setDensity(I)V

    move/from16 v1, v21

    invoke-static {v9, v0, v1}, Lgl/w;->f(Lal/b;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    invoke-interface {v9, v0}, Lal/b;->h(Landroid/graphics/Bitmap;)V

    goto :goto_25

    :cond_33
    const/4 v1, 0x0

    :cond_34
    :goto_25
    return-object v1
.end method
