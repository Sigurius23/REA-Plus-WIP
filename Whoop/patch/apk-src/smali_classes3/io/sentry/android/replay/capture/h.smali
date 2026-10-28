.class public final Lio/sentry/android/replay/capture/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lio/sentry/d1;Lio/sentry/q6;JLjava/util/Date;Lio/sentry/protocol/v;IIILio/sentry/r6;Lio/sentry/android/replay/k;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/k;
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    const-string v14, "options"

    move-object/from16 v15, p1

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentSegmentTimestamp"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayId"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replayType"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v12, :cond_27

    iget-object v5, v12, Lio/sentry/android/replay/k;->w:Lio/sentry/q6;

    const-wide/32 v6, 0x493e0

    move-wide/from16 v8, p2

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v16

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    move-wide v7, v6

    new-instance v6, Ljava/io/File;

    invoke-virtual {v12}, Lio/sentry/android/replay/k;->i()Ljava/io/File;

    move-result-object v0

    const-string v9, ".mp4"

    invoke-static {v4, v9}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v0, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v9, v12, Lio/sentry/android/replay/k;->F:Lio/sentry/util/a;

    iget-object v10, v12, Lio/sentry/android/replay/k;->z:Lio/sentry/util/a;

    iget-object v15, v12, Lio/sentry/android/replay/k;->I:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v18, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v20

    cmp-long v0, v20, v18

    if-lez v0, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    :cond_0
    move-object/from16 v20, v5

    invoke-virtual {v9}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v5

    :try_start_0
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    move-object/from16 p2, v0

    move-object/from16 v21, v14

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v1, v0

    goto/16 :goto_1c

    :cond_1
    invoke-static {v15}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :goto_1
    const/4 v14, 0x0

    invoke-static {v5, v14}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    invoke-virtual/range {v20 .. v20}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v6, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v7, "No captured frames, skipping generating a video segment"

    new-array v8, v5, [Ljava/lang/Object;

    invoke-interface {v0, v6, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    const/4 v3, 0x0

    const/4 v7, 0x0

    goto/16 :goto_11

    :cond_2
    invoke-virtual {v10}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v14

    :try_start_1
    new-instance v0, Lio/sentry/android/replay/video/d;

    move/from16 v23, v5

    new-instance v5, Lio/sentry/android/replay/video/a;

    move-wide v2, v7

    move-object/from16 v24, v10

    move-object/from16 v13, v20

    move/from16 v8, p7

    move/from16 v7, p8

    move/from16 v10, p12

    move-object/from16 v20, v9

    move/from16 v9, p11

    invoke-direct/range {v5 .. v10}, Lio/sentry/android/replay/video/a;-><init>(Ljava/io/File;IIII)V

    invoke-direct {v0, v13, v5}, Lio/sentry/android/replay/video/d;-><init>(Lio/sentry/q6;Lio/sentry/android/replay/video/a;)V

    iget-object v5, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v5, Landroid/media/MediaCodec;

    iget-object v10, v0, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    invoke-interface {v10}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/media/MediaFormat;

    move-object/from16 v25, v13

    const/4 v7, 0x0

    const/4 v13, 0x1

    invoke-virtual {v5, v10, v7, v7, v13}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-virtual {v5}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v10

    iput-object v10, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/media/MediaCodec;->start()V

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lio/sentry/android/replay/video/d;->b(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    invoke-static {v14, v7}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    iput-object v0, v12, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;

    const/16 v0, 0x3e8

    int-to-long v13, v0

    move-wide/from16 v26, v13

    int-to-long v13, v9

    div-long v13, v26, v13

    invoke-static/range {p2 .. p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    add-long v9, v2, v16

    const-wide/high16 v16, -0x8000000000000000L

    cmp-long v5, v9, v16

    if-gtz v5, :cond_3

    sget-object v2, Li93/m;->z:Li93/m;

    sget-object v2, Li93/m;->z:Li93/m;

    goto :goto_3

    :cond_3
    new-instance v5, Li93/m;

    const-wide/16 v16, 0x1

    sub-long v7, v9, v16

    invoke-direct {v5, v2, v3, v7, v8}, Li93/m;-><init>(JJ)V

    move-object v2, v5

    :goto_3
    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    cmp-long v3, v13, v18

    if-lez v3, :cond_4

    const/4 v5, 0x1

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v5, v3}, Le93/b;->h(ZLjava/lang/Number;)V

    iget-wide v7, v2, Li93/k;->w:J

    move-wide/from16 v27, v7

    iget-wide v7, v2, Li93/k;->x:J

    iget-wide v2, v2, Li93/k;->y:J

    cmp-long v2, v2, v18

    if-lez v2, :cond_5

    move-wide/from16 v31, v13

    goto :goto_5

    :cond_5
    neg-long v2, v13

    move-wide/from16 v31, v2

    :goto_5
    new-instance v26, Li93/k;

    move-wide/from16 v29, v7

    invoke-direct/range {v26 .. v32}, Li93/k;-><init>(JJJ)V

    move-object/from16 v2, v26

    cmp-long v3, v31, v18

    iget-wide v7, v2, Li93/k;->x:J

    if-lez v3, :cond_6

    cmp-long v2, v27, v7

    if-lez v2, :cond_7

    :cond_6
    if-gez v3, :cond_e

    cmp-long v2, v7, v27

    if-gtz v2, :cond_e

    :cond_7
    const/4 v5, 0x0

    :goto_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/android/replay/l;

    add-long v16, v27, v13

    move-wide/from16 v29, v7

    iget-wide v7, v3, Lio/sentry/android/replay/l;->b:J

    cmp-long v26, v27, v7

    if-gtz v26, :cond_8

    cmp-long v26, v7, v16

    if-gtz v26, :cond_8

    move-object v7, v3

    goto :goto_9

    :cond_8
    cmp-long v3, v7, v16

    if-lez v3, :cond_9

    goto :goto_8

    :cond_9
    move-wide/from16 v7, v29

    goto :goto_7

    :cond_a
    move-wide/from16 v29, v7

    :goto_8
    move-object v7, v0

    :goto_9
    move-object v0, v7

    check-cast v0, Lio/sentry/android/replay/l;

    if-nez v0, :cond_b

    goto :goto_d

    :cond_b
    :try_start_2
    iget-object v0, v0, Lio/sentry/android/replay/l;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual/range {v24 .. v24}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v3, v12, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;

    if-eqz v3, :cond_c

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lio/sentry/android/replay/video/d;->c(Landroid/graphics/Bitmap;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_c
    const/4 v3, 0x0

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object v3, v0

    goto :goto_b

    :goto_a
    :try_start_4
    invoke-static {v2, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    add-int/lit8 v5, v5, 0x1

    :cond_d
    move-object/from16 v3, p2

    move-object v0, v7

    goto :goto_e

    :catchall_2
    move-exception v0

    goto :goto_c

    :goto_b
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_6
    invoke-static {v2, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_c
    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v8, "Unable to decode bitmap and encode it into a video, skipping frame"

    invoke-interface {v2, v3, v8, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_d
    if-eqz v7, :cond_d

    move-object v0, v7

    check-cast v0, Lio/sentry/android/replay/l;

    iget-object v0, v0, Lio/sentry/android/replay/l;->a:Ljava/io/File;

    invoke-virtual {v12, v0}, Lio/sentry/android/replay/k;->h(Ljava/io/File;)V

    invoke-virtual/range {v20 .. v20}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_7
    invoke-static {v15}, Lkotlin/jvm/internal/m0;->a(Ljava/util/AbstractCollection;)Ljava/util/Collection;

    invoke-interface {v15, v7}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    move-object/from16 v3, p2

    invoke-interface {v3, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    goto :goto_e

    :catchall_4
    move-exception v0

    move-object v1, v0

    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_e
    cmp-long v2, v27, v29

    if-eqz v2, :cond_f

    add-long v27, v27, v31

    move-object/from16 p2, v3

    move-wide/from16 v7, v29

    goto/16 :goto_6

    :cond_e
    const/4 v5, 0x0

    :cond_f
    if-nez v5, :cond_10

    invoke-virtual/range {v25 .. v25}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Generated a video with no frames, not capturing a replay segment"

    const/4 v5, 0x0

    new-array v7, v5, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v7}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lio/sentry/android/replay/k;->h(Ljava/io/File;)V

    goto/16 :goto_2

    :cond_10
    invoke-virtual/range {v24 .. v24}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_9
    iget-object v0, v12, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lio/sentry/android/replay/video/d;->i()V

    goto :goto_f

    :catchall_6
    move-exception v0

    move-object v1, v0

    goto/16 :goto_19

    :cond_11
    :goto_f
    iget-object v0, v12, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;

    if-eqz v0, :cond_13

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/b;

    iget v3, v0, Lio/sentry/android/replay/video/b;->e:I

    if-nez v3, :cond_12

    goto :goto_10

    :cond_12
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-wide v7, v0, Lio/sentry/android/replay/video/b;->f:J

    iget-wide v13, v0, Lio/sentry/android/replay/video/b;->a:J

    add-long/2addr v7, v13

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v7, v8, v0}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v18

    :cond_13
    :goto_10
    move-wide/from16 v7, v18

    const/4 v3, 0x0

    iput-object v3, v12, Lio/sentry/android/replay/k;->G:Lio/sentry/android/replay/video/d;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    invoke-static {v2, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {v12, v9, v10}, Lio/sentry/android/replay/k;->m(J)Ljava/lang/String;

    new-instance v0, Lio/sentry/android/replay/e;

    invoke-direct {v0, v6, v5, v7, v8}, Lio/sentry/android/replay/e;-><init>(Ljava/io/File;IJ)V

    move-object v7, v0

    :goto_11
    if-nez v7, :cond_14

    goto/16 :goto_1d

    :cond_14
    iget-object v0, v7, Lio/sentry/android/replay/e;->a:Ljava/io/File;

    iget v2, v7, Lio/sentry/android/replay/e;->b:I

    iget-wide v5, v7, Lio/sentry/android/replay/e;->c:J

    if-nez p14, :cond_16

    new-instance v7, Lkotlin/jvm/internal/g0;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    sget-object v8, Lm83/y;->w:Lm83/y;

    iput-object v8, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v1, :cond_15

    new-instance v8, Lio/sentry/android/replay/m;

    const/4 v13, 0x1

    invoke-direct {v8, v7, v13}, Lio/sentry/android/replay/m;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-interface {v1, v8}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    :cond_15
    iget-object v1, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    goto :goto_12

    :cond_16
    move-object/from16 v1, p14

    :goto_12
    invoke-virtual/range {p4 .. p4}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    add-long/2addr v7, v5

    invoke-static {v7, v8}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v7

    const-string v8, "getDateTime(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lio/sentry/s6;

    invoke-direct {v8}, Lio/sentry/s6;-><init>()V

    move-object/from16 v9, p5

    iput-object v9, v8, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    iput-object v9, v8, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    iput v4, v8, Lio/sentry/s6;->T:I

    iput-object v7, v8, Lio/sentry/s6;->U:Ljava/util/Date;

    move-object/from16 v9, p4

    iput-object v9, v8, Lio/sentry/s6;->V:Ljava/util/Date;

    iput-object v11, v8, Lio/sentry/s6;->R:Lio/sentry/r6;

    iput-object v0, v8, Lio/sentry/s6;->P:Ljava/io/File;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Lio/sentry/rrweb/j;

    invoke-direct {v11}, Lio/sentry/rrweb/j;-><init>()V

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    iput-wide v12, v11, Lio/sentry/rrweb/b;->x:J

    move/from16 v12, p7

    iput v12, v11, Lio/sentry/rrweb/j;->z:I

    move/from16 v13, p8

    iput v13, v11, Lio/sentry/rrweb/j;->E:I

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, Lio/sentry/rrweb/m;

    invoke-direct {v11}, Lio/sentry/rrweb/m;-><init>()V

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v14

    iput-wide v14, v11, Lio/sentry/rrweb/b;->x:J

    iput v4, v11, Lio/sentry/rrweb/m;->z:I

    iput-wide v5, v11, Lio/sentry/rrweb/m;->F:J

    iput v2, v11, Lio/sentry/rrweb/m;->K:I

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v5

    iput-wide v5, v11, Lio/sentry/rrweb/m;->E:J

    move/from16 v2, p11

    iput v2, v11, Lio/sentry/rrweb/m;->M:I

    iput v12, v11, Lio/sentry/rrweb/m;->I:I

    iput v13, v11, Lio/sentry/rrweb/m;->J:I

    const/4 v5, 0x0

    iput v5, v11, Lio/sentry/rrweb/m;->N:I

    iput v5, v11, Lio/sentry/rrweb/m;->O:I

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v3

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/e;

    if-eqz v2, :cond_18

    iget-object v11, v2, Lio/sentry/e;->G:Ljava/lang/String;

    const-string v12, "network.event"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    iget-object v2, v2, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v11, "getData(...)"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "action"

    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_17

    move-object v2, v3

    :cond_17
    const-string v11, "NETWORK_AVAILABLE"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v6, Lio/sentry/e;->G:Ljava/lang/String;

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v6, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v11, "network_type"

    invoke-interface {v2, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v6}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    const-wide/16 v13, 0x1388

    add-long/2addr v11, v13

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    cmp-long v2, v11, v13

    if-ltz v2, :cond_18

    const/4 v2, 0x1

    goto :goto_14

    :cond_18
    move v2, v5

    :goto_14
    invoke-virtual {v6}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    invoke-virtual {v9}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    cmp-long v11, v11, v13

    if-gez v11, :cond_19

    if-eqz v2, :cond_1e

    :cond_19
    invoke-virtual {v6}, Lio/sentry/e;->b()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v11

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v13

    cmp-long v2, v11, v13

    if-gez v2, :cond_1e

    invoke-virtual/range {p1 .. p1}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v2

    invoke-interface {v2}, Lio/sentry/v3;->J()Lio/sentry/u3;

    move-result-object v2

    invoke-interface {v2, v6}, Lio/sentry/u3;->a(Lio/sentry/e;)Lio/sentry/rrweb/b;

    move-result-object v2

    if-eqz v2, :cond_1e

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v11, v2, Lio/sentry/rrweb/a;

    if-eqz v11, :cond_1a

    move-object v11, v2

    check-cast v11, Lio/sentry/rrweb/a;

    goto :goto_15

    :cond_1a
    move-object v11, v3

    :goto_15
    if-eqz v11, :cond_1b

    iget-object v11, v11, Lio/sentry/rrweb/a;->F:Ljava/lang/String;

    goto :goto_16

    :cond_1b
    move-object v11, v3

    :goto_16
    const-string v12, "navigation"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1e

    check-cast v2, Lio/sentry/rrweb/a;

    iget-object v11, v2, Lio/sentry/rrweb/a;->I:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v12, "to"

    if-eqz v11, :cond_1c

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_1d

    :cond_1c
    move-object v11, v3

    :cond_1d
    instance-of v11, v11, Ljava/lang/String;

    if-eqz v11, :cond_1e

    iget-object v2, v2, Lio/sentry/rrweb/a;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v11, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :cond_1e
    move-object v2, v6

    goto/16 :goto_13

    :cond_1f
    if-eqz p13, :cond_20

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v13, p13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {v0, v13}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    :cond_20
    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    new-instance v3, Lb2/z;

    const/16 v5, 0xf

    invoke-direct {v3, v5, v9, v10}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface/range {p15 .. p15}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const-string v6, "iterator(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_21
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/rrweb/b;

    iget-wide v11, v6, Lio/sentry/rrweb/b;->x:J

    cmp-long v7, v11, v1

    if-gez v7, :cond_21

    invoke-virtual {v3, v6}, Lb2/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_17

    :cond_22
    if-nez v4, :cond_26

    new-instance v1, Lio/sentry/rrweb/k;

    sget-object v2, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    invoke-direct {v1, v2}, Lio/sentry/rrweb/b;-><init>(Lio/sentry/rrweb/c;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lio/sentry/rrweb/k;->z:Ljava/util/HashMap;

    move-object/from16 v3, v21

    iput-object v3, v1, Lio/sentry/rrweb/k;->y:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v3

    if-eqz v3, :cond_23

    const-string v5, "nativeSdkName"

    iget-object v6, v3, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "nativeSdkVersion"

    iget-object v3, v3, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    invoke-virtual/range {p1 .. p1}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    iget-object v5, v3, Lio/sentry/u6;->f:Ljava/lang/Double;

    iget-object v6, v3, Li63/j;->b:Ljava/io/Serializable;

    check-cast v6, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v7, "errorSampleRate"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "sessionSampleRate"

    iget-object v7, v3, Lio/sentry/u6;->e:Ljava/lang/Double;

    invoke-virtual {v2, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.widget.ImageView"

    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v7, "maskAllImages"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.widget.TextView"

    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v7, "maskAllText"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Lio/sentry/u6;->g:Lio/sentry/t6;

    invoke-virtual {v5}, Lio/sentry/t6;->serializedName()Ljava/lang/String;

    move-result-object v5

    const-string v7, "quality"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "maskedViewClasses"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Li63/j;->c:Ljava/util/Collection;

    check-cast v5, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v6, "unmaskedViewClasses"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Lio/sentry/u6;->o:Lio/sentry/j4;

    sget-object v6, Lio/sentry/j4;->PIXEL_COPY:Lio/sentry/j4;

    if-ne v5, v6, :cond_24

    const-string v5, "pixelCopy"

    goto :goto_18

    :cond_24
    const-string v5, "canvas"

    :goto_18
    const-string v6, "screenshotStrategy"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Lio/sentry/u6;->q:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    const/16 v22, 0x1

    xor-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "networkDetailHasUrls"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Lio/sentry/u6;->q:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "networkDetailAllowUrls"

    iget-object v6, v3, Lio/sentry/u6;->q:Ljava/util/List;

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "networkRequestHeaders"

    iget-object v6, v3, Lio/sentry/u6;->t:Ljava/util/List;

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "networkResponseHeaders"

    iget-object v6, v3, Lio/sentry/u6;->u:Ljava/util/List;

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v5, v3, Lio/sentry/u6;->s:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "networkCaptureBodies"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v3, Lio/sentry/u6;->r:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_25

    const-string v5, "networkDetailDenyUrls"

    iget-object v3, v3, Lio/sentry/u6;->r:Ljava/util/List;

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_25
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_26
    new-instance v1, Lio/sentry/x3;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/x3;->w:Ljava/lang/Integer;

    new-instance v2, Lio/sentry/android/replay/capture/g;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v10, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/x3;->x:Ljava/util/List;

    iput-object v0, v8, Lio/sentry/s6;->W:Ljava/util/List;

    new-instance v0, Lio/sentry/android/replay/capture/i;

    invoke-direct {v0, v8, v1}, Lio/sentry/android/replay/capture/i;-><init>(Lio/sentry/s6;Lio/sentry/x3;)V

    return-object v0

    :goto_19
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :catchall_7
    move-exception v0

    invoke-static {v2, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_1a
    move-object v1, v0

    goto :goto_1b

    :catchall_8
    move-exception v0

    goto :goto_1a

    :goto_1b
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    :catchall_9
    move-exception v0

    invoke-static {v14, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_1c
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    :catchall_a
    move-exception v0

    invoke-static {v5, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_27
    :goto_1d
    sget-object v0, Lio/sentry/android/replay/capture/j;->a:Lio/sentry/android/replay/capture/j;

    return-object v0
.end method
