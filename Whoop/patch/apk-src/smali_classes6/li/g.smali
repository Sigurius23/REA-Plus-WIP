.class public final Lli/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/k;


# instance fields
.field public final a:Lsh/q;

.field public final b:Lfi/o;


# direct methods
.method public constructor <init>(Lsh/q;Lfi/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/g;->a:Lsh/q;

    iput-object p2, p0, Lli/g;->b:Lfi/o;

    return-void
.end method


# virtual methods
.method public final a(Lq83/d;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "Failed to decode frame at "

    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/16 v11, 0x1d

    :try_start_0
    iget-object v3, v1, Lli/g;->a:Lsh/q;

    invoke-virtual {v1, v2, v3}, Lli/g;->c(Landroid/media/MediaMetadataRetriever;Lsh/q;)V

    const/16 v3, 0x18

    invoke-virtual {v2, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_d

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x5a

    const/16 v5, 0x13

    const/16 v6, 0x12

    if-eq v3, v4, :cond_3

    const/16 v4, 0x10e

    if-eq v3, v4, :cond_3

    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    move v14, v3

    move v15, v4

    goto :goto_4

    :cond_3
    invoke-virtual {v2, v5}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    :goto_3
    invoke-virtual {v2, v6}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_4
    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    iget-object v3, v1, Lli/g;->b:Lfi/o;

    if-lez v14, :cond_8

    if-lez v15, :cond_8

    :try_start_1
    iget-object v4, v3, Lfi/o;->b:Lgi/i;

    iget-object v5, v3, Lfi/o;->c:Lgi/g;

    sget-object v6, Lfi/j;->b:Lf93/a;

    invoke-static {v3, v6}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lgi/i;

    invoke-static {v14, v15, v4, v5, v6}, Ls/s;->f(IILgi/i;Lgi/g;Lgi/i;)J

    move-result-wide v6

    const/16 v4, 0x20

    shr-long v12, v6, v4

    long-to-int v4, v12

    const-wide v12, 0xffffffffL

    and-long/2addr v6, v12

    long-to-int v6, v6

    invoke-static {v14, v15, v4, v6, v5}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v4

    iget-object v6, v3, Lfi/o;->d:Lgi/d;

    sget-object v7, Lgi/d;->x:Lgi/d;

    if-ne v6, v7, :cond_5

    cmpl-double v6, v4, v16

    if-lez v6, :cond_5

    move-wide/from16 v4, v16

    :cond_5
    int-to-double v6, v14

    mul-double/2addr v6, v4

    invoke-static {v6, v7}, Le93/b;->W(D)I

    move-result v6

    int-to-double v7, v15

    mul-double/2addr v4, v7

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result v4

    const-string v5, "px must be > 0."

    new-instance v7, Lgi/i;

    if-lez v6, :cond_7

    new-instance v8, Lgi/a;

    invoke-direct {v8, v6}, Lgi/a;-><init>(I)V

    if-lez v4, :cond_6

    new-instance v5, Lgi/a;

    invoke-direct {v5, v4}, Lgi/a;-><init>(I)V

    invoke-direct {v7, v8, v5}, Lgi/i;-><init>(Lgi/c;Lgi/c;)V

    :goto_5
    move-object v12, v7

    goto :goto_6

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    sget-object v7, Lgi/i;->c:Lgi/i;

    goto :goto_5

    :goto_6
    sget-object v4, Lli/a;->b:Lf93/a;

    invoke-static {v3, v4}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_9

    goto :goto_7

    :cond_9
    sget-object v4, Lli/a;->c:Lf93/a;

    invoke-static {v3, v4}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    const-wide/16 v18, 0x0

    cmpl-double v8, v4, v18

    if-ltz v8, :cond_b

    const/16 v8, 0x9

    invoke-virtual {v2, v8}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-static {v8}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    :cond_a
    const/16 v8, 0x3e8

    int-to-long v9, v8

    long-to-double v6, v6

    mul-double/2addr v4, v6

    invoke-static {v4, v5}, Le93/b;->Y(D)J

    move-result-wide v4

    mul-long/2addr v4, v9

    goto :goto_7

    :cond_b
    move-wide v4, v6

    :goto_7
    iget-object v6, v12, Lgi/i;->a:Lgi/c;

    iget-object v7, v12, Lgi/i;->b:Lgi/c;

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v8, Lli/a;->a:Lf93/a;

    invoke-static {v3, v8}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    const/4 v13, 0x0

    if-ltz v10, :cond_d

    invoke-static {v3, v8}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    sget-object v7, Lfi/k;->b:Lf93/a;

    invoke-static {v3, v7}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/Bitmap$Config;

    new-instance v8, Landroid/media/MediaMetadataRetriever$BitmapParams;

    invoke-direct {v8}, Landroid/media/MediaMetadataRetriever$BitmapParams;-><init>()V

    invoke-virtual {v8, v7}, Landroid/media/MediaMetadataRetriever$BitmapParams;->setPreferredConfig(Landroid/graphics/Bitmap$Config;)V

    invoke-virtual {v2, v6, v8}, Landroid/media/MediaMetadataRetriever;->getFrameAtIndex(ILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    move-wide/from16 v20, v4

    move-object v5, v3

    move-wide/from16 v3, v20

    :goto_8
    move-object v13, v6

    goto :goto_9

    :cond_c
    move-wide/from16 v20, v4

    move-object v5, v3

    move-wide/from16 v3, v20

    goto :goto_9

    :cond_d
    instance-of v8, v6, Lgi/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v10, Lli/a;->d:Lf93/a;

    if-eqz v8, :cond_e

    :try_start_2
    instance-of v8, v7, Lgi/a;

    if-eqz v8, :cond_e

    invoke-static {v3, v10}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    check-cast v6, Lgi/a;

    iget v6, v6, Lgi/a;->a:I

    check-cast v7, Lgi/a;

    iget v7, v7, Lgi/a;->a:I

    sget-object v10, Lfi/k;->b:Lf93/a;

    invoke-static {v3, v10}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/graphics/Bitmap$Config;

    move-object/from16 v20, v10

    move-object v10, v3

    move-wide v3, v4

    move v5, v8

    move-object/from16 v8, v20

    invoke-static/range {v2 .. v8}, Lb5/a;->d(Landroid/media/MediaMetadataRetriever;JIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v13

    move-object v5, v10

    goto :goto_9

    :cond_e
    move-wide/from16 v20, v4

    move-object v5, v3

    move-wide/from16 v3, v20

    invoke-static {v5, v10}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    sget-object v7, Lfi/k;->b:Lf93/a;

    invoke-static {v5, v7}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4, v6, v7}, Lb5/a;->c(Landroid/media/MediaMetadataRetriever;JILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v15

    goto :goto_8

    :cond_f
    :goto_9
    if-eqz v13, :cond_19

    invoke-virtual {v1, v13, v12}, Lli/g;->b(Landroid/graphics/Bitmap;Lgi/i;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-lez v14, :cond_10

    if-lez v15, :cond_10

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget-object v6, v5, Lfi/o;->c:Lgi/g;

    invoke-static {v14, v15, v3, v4, v6}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v3

    cmpg-double v3, v3, v16

    if-gez v3, :cond_11

    :cond_10
    const/4 v3, 0x1

    goto :goto_a

    :cond_11
    const/4 v3, 0x0

    :goto_a
    new-instance v4, Lsh/i;

    iget-object v5, v5, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    new-instance v6, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v6, v5, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-static {v6}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Lsh/i;-><init>(Lrh/j;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-lt v9, v11, :cond_18

    instance-of v0, v2, Ljava/lang/AutoCloseable;

    if-eqz v0, :cond_12

    check-cast v2, Ljava/lang/AutoCloseable;

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v4

    :cond_12
    instance-of v0, v2, Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_17

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v0

    if-ne v2, v0, :cond_13

    goto :goto_c

    :cond_13
    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v13, 0x0

    :cond_14
    :goto_b
    if-nez v0, :cond_15

    :try_start_3
    sget-object v3, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1

    invoke-interface {v2, v5, v6, v3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_b

    :catch_0
    if-nez v13, :cond_14

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v13, 0x1

    goto :goto_b

    :cond_15
    if-eqz v13, :cond_16

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_16
    :goto_c
    return-object v4

    :cond_17
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    return-object v4

    :cond_18
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    return-object v4

    :cond_19
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " microseconds."

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_d
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v3, v11, :cond_1e

    instance-of v3, v2, Ljava/lang/AutoCloseable;

    if-nez v3, :cond_1d

    instance-of v3, v2, Ljava/util/concurrent/ExecutorService;

    if-eqz v3, :cond_1c

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    move-result-object v3

    if-eq v2, v3, :cond_1f

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    move-result v3

    if-nez v3, :cond_1f

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const/4 v13, 0x0

    :cond_1a
    :goto_e
    if-nez v3, :cond_1b

    :try_start_5
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1

    const-wide/16 v5, 0x1

    :try_start_6
    invoke-interface {v2, v5, v6, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_e

    :catch_1
    const-wide/16 v5, 0x1

    :catch_2
    if-nez v13, :cond_1a

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    const/4 v13, 0x1

    goto :goto_e

    :cond_1b
    if-eqz v13, :cond_1f

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_f

    :cond_1c
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    goto :goto_f

    :cond_1d
    check-cast v2, Ljava/lang/AutoCloseable;

    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    goto :goto_f

    :cond_1e
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V

    :cond_1f
    :goto_f
    throw v0
.end method

.method public final b(Landroid/graphics/Bitmap;Lgi/i;)Landroid/graphics/Bitmap;
    .locals 8

    iget-object v0, p2, Lgi/i;->b:Lgi/c;

    iget-object p2, p2, Lgi/i;->a:Lgi/c;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    iget-object v3, p0, Lli/g;->b:Lfi/o;

    if-ne v1, v2, :cond_0

    invoke-static {v3}, Lfi/k;->a(Lfi/o;)Landroid/graphics/Bitmap$Config;

    move-result-object v1

    if-ne v1, v2, :cond_4

    :cond_0
    iget-object v1, v3, Lfi/o;->d:Lgi/d;

    sget-object v4, Lgi/d;->x:Lgi/d;

    if-ne v1, v4, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    instance-of v5, p2, Lgi/a;

    if-eqz v5, :cond_2

    move-object v5, p2

    check-cast v5, Lgi/a;

    iget v5, v5, Lgi/a;->a:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    :goto_0
    instance-of v6, v0, Lgi/a;

    if-eqz v6, :cond_3

    move-object v6, v0

    check-cast v6, Lgi/a;

    iget v6, v6, Lgi/a;->a:I

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    :goto_1
    iget-object v7, v3, Lfi/o;->c:Lgi/g;

    invoke-static {v1, v4, v5, v6, v7}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v4

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpg-double v1, v4, v6

    if-nez v1, :cond_4

    :goto_2
    return-object p1

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    instance-of v5, p2, Lgi/a;

    if-eqz v5, :cond_5

    check-cast p2, Lgi/a;

    iget p2, p2, Lgi/a;->a:I

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    :goto_3
    instance-of v5, v0, Lgi/a;

    if-eqz v5, :cond_6

    check-cast v0, Lgi/a;

    iget v0, v0, Lgi/a;->a:I

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    :goto_4
    iget-object v5, v3, Lfi/o;->c:Lgi/g;

    invoke-static {v1, v4, p2, v0, v5}, Ls/s;->g(IIIILgi/g;)D

    move-result-wide v0

    double-to-float p2, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, p2

    invoke-static {v1}, Le93/b;->X(F)I

    move-result v1

    sget-object v4, Lfi/k;->b:Lf93/a;

    invoke-static {v3, v4}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap$Config;

    if-ne v5, v2, :cond_7

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_5

    :cond_7
    invoke-static {v3, v4}, Lrh/o;->f(Lfi/o;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap$Config;

    :goto_5
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, p2, p2}, Landroid/graphics/Canvas;->scale(FF)V

    const/4 p2, 0x0

    invoke-virtual {v1, p1, p2, p2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-object v0
.end method

.method public final c(Landroid/media/MediaMetadataRetriever;Lsh/q;)V
    .locals 6

    invoke-interface {p2}, Lsh/q;->c()Ls2/a;

    move-result-object v0

    instance-of v1, v0, Lli/d;

    if-eqz v1, :cond_0

    check-cast v0, Lli/d;

    iget-object p2, v0, Lli/d;->a:Landroid/media/MediaDataSource;

    invoke-virtual {p1, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    return-void

    :cond_0
    instance-of v1, v0, Lsh/a;

    iget-object v2, p0, Lli/g;->b:Lfi/o;

    if-eqz v1, :cond_1

    iget-object p2, v2, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p2

    check-cast v0, Lsh/a;

    iget-object v0, v0, Lsh/a;->a:Ljava/lang/String;

    invoke-virtual {p2, v0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p2

    :try_start_0
    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {p2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    instance-of v1, v0, Lsh/g;

    if-eqz v1, :cond_2

    iget-object p2, v2, Lfi/o;->a:Landroid/content/Context;

    check-cast v0, Lsh/g;

    iget-object v0, v0, Lsh/g;->a:Lrh/y;

    iget-object v0, v0, Lrh/y;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    return-void

    :cond_2
    instance-of v1, v0, Lsh/r;

    if-eqz v1, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "android.resource://"

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast v0, Lsh/r;

    iget-object v1, v0, Lsh/r;->a:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, v0, Lsh/r;->b:I

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-interface {p2}, Lsh/q;->getFileSystem()Lne3/p;

    move-result-object v0

    sget-object v1, Lne3/p;->w:Lne3/a0;

    if-ne v0, v1, :cond_4

    invoke-interface {p2}, Lsh/q;->D0()Lne3/e0;

    move-result-object p2

    invoke-virtual {p2}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-interface {p2}, Lsh/q;->getFileSystem()Lne3/p;

    move-result-object v0

    invoke-interface {p2}, Lsh/q;->D0()Lne3/e0;

    move-result-object p2

    invoke-virtual {v0, p2}, Lne3/p;->b0(Lne3/e0;)Lne3/z;

    move-result-object p2

    new-instance v0, Lgl/z;

    invoke-direct {v0, p2}, Lgl/z;-><init>(Lne3/z;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    return-void
.end method
