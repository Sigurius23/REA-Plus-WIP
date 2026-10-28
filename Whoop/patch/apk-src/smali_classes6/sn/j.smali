.class public final Lsn/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/u;


# instance fields
.field public final a:Ld1/j;

.field public final b:Lb30/m;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lwm/g;)V
    .locals 2

    new-instance v0, Ld1/j;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, Ld1/j;-><init>(Landroid/content/Context;I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lsn/j;->a:Ld1/j;

    new-instance p1, Lb30/m;

    invoke-direct {p1, v0, p2}, Lb30/m;-><init>(Ld1/j;Lwm/g;)V

    iput-object p1, p0, Lsn/j;->b:Lb30/m;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lsn/j;->c:J

    iput-wide p1, p0, Lsn/j;->d:J

    iput-wide p1, p0, Lsn/j;->e:J

    const p1, -0x800001

    iput p1, p0, Lsn/j;->f:F

    iput p1, p0, Lsn/j;->g:F

    return-void
.end method

.method public static b(Ljava/lang/Class;Ld1/j;)Lsn/u;
    .locals 1

    :try_start_0
    const-class v0, Lko/k;

    filled-new-array {v0}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsn/u;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method public final a(Lrm/k0;)Lsn/a;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lrm/k0;->x:Lrm/i0;

    iget-object v3, v1, Lrm/k0;->y:Lrm/h0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lrm/k0;->x:Lrm/i0;

    iget-object v4, v2, Lrm/i0;->a:Landroid/net/Uri;

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    const-string v6, "ssai"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    throw v5

    :cond_1
    :goto_0
    iget-object v4, v2, Lrm/i0;->a:Landroid/net/Uri;

    sget v6, Llo/y;->a:I

    invoke-virtual {v4}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v6, :cond_2

    const-string v12, "rtsp"

    invoke-static {v12, v6}, Lrg/j;->h(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v4, v8

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v4}, Lrg/j;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, ".mpd"

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_1

    :cond_4
    const-string v6, ".m3u8"

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    sget-object v6, Llo/y;->h:Ljava/util/regex/Pattern;

    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v4, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v6, "format=mpd-time-csf"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    :goto_1
    move v4, v10

    goto :goto_4

    :cond_6
    const-string v6, "format=m3u8-aapl"

    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    :goto_2
    move v4, v9

    goto :goto_4

    :cond_7
    move v4, v11

    goto :goto_4

    :cond_8
    :goto_3
    move v4, v7

    :goto_4
    iget-object v6, v0, Lsn/j;->b:Lb30/m;

    iget-object v12, v6, Lb30/m;->F:Ljava/lang/Object;

    check-cast v12, Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lsn/u;

    if-eqz v13, :cond_9

    goto/16 :goto_9

    :cond_9
    iget-object v13, v6, Lb30/m;->z:Ljava/lang/Object;

    check-cast v13, Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lyr/i;

    goto/16 :goto_8

    :cond_a
    const-class v14, Lsn/u;

    if-eqz v4, :cond_f

    if-eq v4, v11, :cond_e

    if-eq v4, v9, :cond_d

    if-eq v4, v8, :cond_c

    if-eq v4, v7, :cond_b

    goto :goto_6

    :cond_b
    :try_start_0
    new-instance v7, Lb9/n;

    const/4 v8, 0x5

    invoke-direct {v7, v6, v8}, Lb9/n;-><init>(Ljava/lang/Object;I)V

    goto :goto_7

    :cond_c
    const-string v7, "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v14}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Ll9/n;

    invoke-direct {v8, v11, v7}, Ll9/n;-><init>(ILjava/lang/Class;)V

    :goto_5
    move-object v7, v8

    goto :goto_7

    :cond_d
    const-class v7, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    invoke-virtual {v7, v14}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Lsn/i;

    invoke-direct {v8, v6, v7, v9}, Lsn/i;-><init>(Lb30/m;Ljava/lang/Class;I)V

    goto :goto_5

    :cond_e
    const-string v7, "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v14}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Lsn/i;

    invoke-direct {v8, v6, v7, v11}, Lsn/i;-><init>(Lb30/m;Ljava/lang/Class;I)V

    goto :goto_5

    :cond_f
    const-string v7, "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7, v14}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    new-instance v8, Lsn/i;

    invoke-direct {v8, v6, v7, v10}, Lsn/i;-><init>(Lb30/m;Ljava/lang/Class;I)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    :goto_6
    move-object v7, v5

    :goto_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v13, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v7, :cond_10

    iget-object v6, v6, Lb30/m;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/HashSet;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_10
    move-object v6, v7

    :goto_8
    if-nez v6, :cond_11

    move-object v13, v5

    goto :goto_9

    :cond_11
    invoke-interface {v6}, Lyr/i;->get()Ljava/lang/Object;

    move-result-object v6

    move-object v13, v6

    check-cast v13, Lsn/u;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v12, v6, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_9
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v7, 0x44

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "No suitable media source factory found for content type: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v4}, Llo/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lrm/h0;->a()Lf9/t;

    move-result-object v4

    iget-wide v6, v3, Lrm/h0;->w:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v6, v8

    if-nez v6, :cond_12

    iget-wide v6, v0, Lsn/j;->c:J

    iput-wide v6, v4, Lf9/t;->a:J

    :cond_12
    iget v6, v3, Lrm/h0;->z:F

    const v7, -0x800001

    cmpl-float v6, v6, v7

    if-nez v6, :cond_13

    iget v6, v0, Lsn/j;->f:F

    iput v6, v4, Lf9/t;->d:F

    :cond_13
    iget v6, v3, Lrm/h0;->E:F

    cmpl-float v6, v6, v7

    if-nez v6, :cond_14

    iget v6, v0, Lsn/j;->g:F

    iput v6, v4, Lf9/t;->e:F

    :cond_14
    iget-wide v6, v3, Lrm/h0;->x:J

    cmp-long v6, v6, v8

    if-nez v6, :cond_15

    iget-wide v6, v0, Lsn/j;->d:J

    iput-wide v6, v4, Lf9/t;->b:J

    :cond_15
    iget-wide v6, v3, Lrm/h0;->y:J

    cmp-long v6, v6, v8

    if-nez v6, :cond_16

    iget-wide v6, v0, Lsn/j;->e:J

    iput-wide v6, v4, Lf9/t;->c:J

    :cond_16
    invoke-virtual {v4}, Lf9/t;->a()Lrm/h0;

    move-result-object v4

    invoke-virtual {v4, v3}, Lrm/h0;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    new-instance v6, Lng3/o;

    const/16 v7, 0x16

    invoke-direct {v6, v7}, Lng3/o;-><init>(I)V

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v6, Lzr/w0;->E:Lzr/w0;

    iget-object v6, v1, Lrm/k0;->E:Lrm/g0;

    new-instance v8, Lrm/e0;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iget-wide v14, v6, Lrm/f0;->w:J

    iput-wide v14, v8, Lrm/e0;->a:J

    iget-wide v14, v6, Lrm/f0;->x:J

    iput-wide v14, v8, Lrm/e0;->b:J

    iget-boolean v9, v6, Lrm/f0;->y:Z

    iput-boolean v9, v8, Lrm/e0;->c:Z

    iget-boolean v9, v6, Lrm/f0;->z:Z

    iput-boolean v9, v8, Lrm/e0;->d:Z

    iget-boolean v6, v6, Lrm/f0;->E:Z

    iput-boolean v6, v8, Lrm/e0;->e:Z

    iget-object v6, v1, Lrm/k0;->w:Ljava/lang/String;

    iget-object v1, v1, Lrm/k0;->z:Lrm/m0;

    invoke-virtual {v3}, Lrm/h0;->a()Lf9/t;

    iget-object v3, v2, Lrm/i0;->a:Landroid/net/Uri;

    iget-object v9, v2, Lrm/i0;->b:Ljava/util/List;

    iget-object v2, v2, Lrm/i0;->c:Lzr/g0;

    new-instance v12, Lng3/o;

    invoke-direct {v12, v7}, Lng3/o;-><init>(I)V

    invoke-virtual {v4}, Lrm/h0;->a()Lf9/t;

    move-result-object v4

    if-eqz v3, :cond_17

    new-instance v7, Lrm/i0;

    invoke-direct {v7, v3, v5, v9, v2}, Lrm/i0;-><init>(Landroid/net/Uri;Lrm/f1;Ljava/util/List;Lzr/g0;)V

    move-object/from16 v17, v7

    goto :goto_a

    :cond_17
    move-object/from16 v17, v5

    :goto_a
    new-instance v14, Lrm/k0;

    if-eqz v6, :cond_18

    :goto_b
    move-object v15, v6

    goto :goto_c

    :cond_18
    const-string v6, ""

    goto :goto_b

    :goto_c
    new-instance v2, Lrm/g0;

    invoke-direct {v2, v8}, Lrm/f0;-><init>(Lrm/e0;)V

    invoke-virtual {v4}, Lf9/t;->a()Lrm/h0;

    move-result-object v18

    if-eqz v1, :cond_19

    :goto_d
    move-object/from16 v19, v1

    move-object/from16 v16, v2

    goto :goto_e

    :cond_19
    sget-object v1, Lrm/m0;->h0:Lrm/m0;

    goto :goto_d

    :goto_e
    invoke-direct/range {v14 .. v19}, Lrm/k0;-><init>(Ljava/lang/String;Lrm/g0;Lrm/i0;Lrm/h0;Lrm/m0;)V

    goto :goto_f

    :cond_1a
    move-object v14, v1

    :goto_f
    iget-object v1, v14, Lrm/k0;->x:Lrm/i0;

    invoke-interface {v13, v14}, Lsn/u;->a(Lrm/k0;)Lsn/a;

    move-result-object v2

    iget-object v1, v1, Lrm/i0;->c:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1b

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v11

    new-array v3, v3, [Lsn/a;

    aput-object v2, v3, v10

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-gtz v2, :cond_1c

    new-instance v2, Lsn/f0;

    invoke-direct {v2, v3}, Lsn/f0;-><init>([Lsn/a;)V

    :cond_1b
    move-object v7, v2

    goto :goto_10

    :cond_1c
    iget-object v2, v0, Lsn/j;->a:Ld1/j;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrm/j0;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v11}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Lsn/z;

    invoke-direct {v2, v10}, Lsn/z;-><init>(I)V

    new-instance v2, Lsn/z;

    invoke-direct {v2, v11}, Lsn/z;-><init>(I)V

    sget-object v2, Lzr/g0;->x:Lzr/e0;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget-object v2, Lzr/w0;->E:Lzr/w0;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v5

    :goto_10
    iget-object v1, v14, Lrm/k0;->E:Lrm/g0;

    iget-wide v2, v1, Lrm/f0;->w:J

    iget-wide v4, v1, Lrm/f0;->x:J

    const-wide/16 v8, 0x0

    cmp-long v6, v2, v8

    if-nez v6, :cond_1d

    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v6, v4, v8

    if-nez v6, :cond_1d

    iget-boolean v6, v1, Lrm/f0;->z:Z

    if-nez v6, :cond_1d

    return-object v7

    :cond_1d
    new-instance v6, Lsn/e;

    invoke-static {v2, v3}, Llo/y;->z(J)J

    move-result-wide v8

    invoke-static {v4, v5}, Llo/y;->z(J)J

    move-result-wide v2

    iget-boolean v4, v1, Lrm/f0;->E:Z

    xor-int/lit8 v12, v4, 0x1

    iget-boolean v13, v1, Lrm/f0;->y:Z

    iget-boolean v14, v1, Lrm/f0;->z:Z

    move-wide v10, v2

    invoke-direct/range {v6 .. v14}, Lsn/e;-><init>(Lsn/a;JJZZZ)V

    return-object v6
.end method
