.class public final Le9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/g;
.implements Lp9/l;


# instance fields
.field public final synthetic w:Le9/h;


# direct methods
.method public synthetic constructor <init>(Le9/h;)V
    .locals 0

    iput-object p1, p0, Le9/d;->w:Le9/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Le9/d;->w:Le9/h;

    sget-object v1, Lq9/b;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-boolean v2, Lq9/b;->c:Z

    if-eqz v2, :cond_0

    sget-wide v2, Lq9/b;->d:J

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-wide v2, v0, Le9/h;->L:J

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Le9/h;->w(Z)V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Le9/d;->w:Le9/h;

    iget-object v1, v0, Le9/h;->A:Lp9/k;

    invoke-virtual {v1}, Lp9/k;->c()V

    iget-object v0, v0, Le9/h;->C:Landroidx/media3/exoplayer/dash/DashManifestStaleException;

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method

.method public p(Lp9/i;JJ)V
    .locals 19

    move-wide/from16 v0, p2

    move-object/from16 v2, p1

    check-cast v2, Lp9/n;

    move-object/from16 v3, p0

    iget-object v4, v3, Le9/d;->w:Le9/h;

    new-instance v6, Ll9/t;

    iget-wide v7, v2, Lp9/n;->w:J

    iget-object v5, v2, Lp9/n;->z:Lz8/m;

    iget-object v5, v5, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v5, v4, Le9/h;->m:Ljc/b;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v4, Le9/h;->q:Lg9/d;

    iget v7, v2, Lp9/n;->y:I

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v8, -0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v15}, Lg9/d;->d(Ll9/t;IILu8/p;ILjava/lang/Object;JJ)V

    iget-object v5, v2, Lp9/n;->F:Ljava/lang/Object;

    check-cast v5, Lf9/c;

    iget-object v6, v4, Le9/h;->H:Lf9/c;

    const/4 v7, 0x0

    if-nez v6, :cond_0

    move v6, v7

    goto :goto_0

    :cond_0
    iget-object v6, v6, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    invoke-virtual {v5, v7}, Lf9/c;->a(I)Lf9/h;

    move-result-object v8

    iget-wide v8, v8, Lf9/h;->b:J

    move v10, v7

    :goto_1
    if-ge v10, v6, :cond_1

    iget-object v11, v4, Le9/h;->H:Lf9/c;

    invoke-virtual {v11, v10}, Lf9/c;->a(I)Lf9/h;

    move-result-object v11

    iget-wide v11, v11, Lf9/h;->b:J

    cmp-long v11, v11, v8

    if-gez v11, :cond_1

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_1
    iget-boolean v8, v5, Lf9/c;->d:Z

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x1

    if-eqz v8, :cond_5

    sub-int/2addr v6, v10

    iget-object v8, v5, Lf9/c;->m:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    if-le v6, v8, :cond_2

    const-string v0, "DashMediaSource"

    const-string v1, "Loaded out of sync manifest"

    invoke-static {v0, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-wide v13, v4, Le9/h;->N:J

    cmp-long v6, v13, v11

    move-wide v15, v11

    if-eqz v6, :cond_4

    iget-wide v11, v5, Lf9/c;->h:J

    const-wide/16 v17, 0x3e8

    mul-long v11, v11, v17

    cmp-long v6, v11, v13

    if-gtz v6, :cond_4

    const-string v0, "DashMediaSource"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "Loaded stale dynamic manifest: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v5, v5, Lf9/c;->h:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v4, Le9/h;->N:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    iget v0, v4, Le9/h;->M:I

    add-int/lit8 v1, v0, 0x1

    iput v1, v4, Le9/h;->M:I

    iget-object v1, v4, Le9/h;->m:Ljc/b;

    iget v2, v2, Lp9/n;->y:I

    invoke-virtual {v1, v2}, Ljc/b;->q(I)I

    move-result v1

    if-ge v0, v1, :cond_3

    iget v0, v4, Le9/h;->M:I

    sub-int/2addr v0, v9

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v1, 0x1388

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v0, v0

    iget-object v2, v4, Le9/h;->D:Landroid/os/Handler;

    iget-object v4, v4, Le9/h;->v:Le9/c;

    invoke-virtual {v2, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_3
    new-instance v0, Landroidx/media3/exoplayer/dash/DashManifestStaleException;

    invoke-direct {v0}, Landroidx/media3/exoplayer/dash/DashManifestStaleException;-><init>()V

    iput-object v0, v4, Le9/h;->C:Landroidx/media3/exoplayer/dash/DashManifestStaleException;

    return-void

    :cond_4
    iput v7, v4, Le9/h;->M:I

    goto :goto_3

    :cond_5
    move-wide v15, v11

    :goto_3
    iput-object v5, v4, Le9/h;->H:Lf9/c;

    iget-boolean v6, v4, Le9/h;->I:Z

    iget-boolean v5, v5, Lf9/c;->d:Z

    and-int/2addr v5, v6

    iput-boolean v5, v4, Le9/h;->I:Z

    sub-long v5, v0, p4

    iput-wide v5, v4, Le9/h;->J:J

    iput-wide v0, v4, Le9/h;->K:J

    iget v0, v4, Le9/h;->O:I

    add-int/2addr v0, v10

    iput v0, v4, Le9/h;->O:I

    iget-object v1, v4, Le9/h;->t:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, v2, Lp9/n;->x:Lz8/g;

    iget-object v0, v0, Lz8/g;->a:Landroid/net/Uri;

    iget-object v5, v4, Le9/h;->F:Landroid/net/Uri;

    if-ne v0, v5, :cond_7

    iget-object v0, v4, Le9/h;->H:Lf9/c;

    iget-object v0, v0, Lf9/c;->k:Landroid/net/Uri;

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    iget-object v0, v2, Lp9/n;->z:Lz8/m;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    :goto_4
    iput-object v0, v4, Le9/h;->F:Landroid/net/Uri;

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :cond_7
    :goto_5
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, v4, Le9/h;->H:Lf9/c;

    iget-boolean v1, v0, Lf9/c;->d:Z

    if-eqz v1, :cond_11

    iget-wide v1, v4, Le9/h;->L:J

    cmp-long v1, v1, v15

    if-nez v1, :cond_11

    iget-object v0, v0, Lf9/c;->i:Lf9/u;

    if-eqz v0, :cond_10

    iget-object v1, v0, Lf9/u;->b:Ljava/lang/String;

    const-string v2, "urn:mpeg:dash:utc:direct:2014"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    const-string v2, "urn:mpeg:dash:utc:direct:2012"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_9

    :cond_8
    const-string v2, "urn:mpeg:dash:utc:http-iso:2014"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    const-string v2, "urn:mpeg:dash:utc:http-iso:2012"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_8

    :cond_9
    const-string v2, "urn:mpeg:dash:utc:http-xsdate:2014"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    const-string v2, "urn:mpeg:dash:utc:http-xsdate:2012"

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_7

    :cond_a
    const-string v0, "urn:mpeg:dash:utc:ntp:2014"

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "urn:mpeg:dash:utc:ntp:2012"

    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported UTC timing scheme"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Le9/h;->v(Ljava/io/IOException;)V

    return-void

    :cond_c
    :goto_6
    invoke-virtual {v4}, Le9/h;->t()V

    return-void

    :cond_d
    :goto_7
    new-instance v1, Lu00/e;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lu00/e;-><init>(I)V

    invoke-virtual {v4, v0, v1}, Le9/h;->x(Lf9/u;Lp9/m;)V

    return-void

    :cond_e
    :goto_8
    new-instance v1, Le9/f;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v0, v1}, Le9/h;->x(Lf9/u;Lp9/m;)V

    return-void

    :cond_f
    :goto_9
    :try_start_1
    iget-object v0, v0, Lf9/u;->c:Ljava/lang/String;

    invoke-static {v0}, Lx8/t;->M(Ljava/lang/String;)J

    move-result-wide v0

    iget-wide v5, v4, Le9/h;->K:J

    sub-long/2addr v0, v5

    iput-wide v0, v4, Le9/h;->L:J

    invoke-virtual {v4, v9}, Le9/h;->w(Z)V
    :try_end_1
    .catch Landroidx/media3/common/ParserException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    invoke-virtual {v4, v0}, Le9/h;->v(Ljava/io/IOException;)V

    :goto_a
    return-void

    :cond_10
    invoke-virtual {v4}, Le9/h;->t()V

    return-void

    :cond_11
    invoke-virtual {v4, v9}, Le9/h;->w(Z)V

    return-void

    :goto_b
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public q(Lp9/i;JJZ)V
    .locals 0

    check-cast p1, Lp9/n;

    iget-object p2, p0, Le9/d;->w:Le9/h;

    invoke-virtual {p2, p1}, Le9/h;->u(Lp9/n;)V

    return-void
.end method

.method public r(Lp9/i;Ljava/io/IOException;I)Lbb/f;
    .locals 14

    move-object/from16 v11, p2

    check-cast p1, Lp9/n;

    new-instance v1, Ll9/t;

    iget-wide v2, p1, Lp9/n;->w:J

    iget-object v0, p1, Lp9/n;->z:Lz8/m;

    iget-object v0, v0, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v2, p1, Lp9/n;->y:I

    iget-object p1, p0, Le9/d;->w:Le9/h;

    iget-object v0, p1, Le9/h;->m:Ljc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, v11, Landroidx/media3/common/ParserException;

    const/4 v3, 0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_1

    instance-of v0, v11, Ljava/io/FileNotFoundException;

    if-nez v0, :cond_1

    instance-of v0, v11, Landroidx/media3/datasource/HttpDataSource$CleartextNotPermittedException;

    if-nez v0, :cond_1

    instance-of v0, v11, Landroidx/media3/exoplayer/upstream/Loader$UnexpectedLoaderException;

    if-nez v0, :cond_1

    invoke-static {v11}, Landroidx/media3/datasource/DataSourceException;->a(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p3, -0x1

    mul-int/lit16 v0, v0, 0x3e8

    const/16 v6, 0x1388

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-long v6, v0

    goto :goto_1

    :cond_1
    :goto_0
    move-wide v6, v4

    :goto_1
    cmp-long v0, v6, v4

    const/4 v4, 0x0

    if-nez v0, :cond_2

    sget-object v0, Lp9/k;->E:Lbb/f;

    :goto_2
    move-object v13, v0

    goto :goto_3

    :cond_2
    new-instance v0, Lbb/f;

    const/4 v5, 0x0

    invoke-direct {v0, v4, v6, v7, v5}, Lbb/f;-><init>(IJB)V

    goto :goto_2

    :goto_3
    iget v0, v13, Lbb/f;->a:I

    if-eqz v0, :cond_3

    if-ne v0, v3, :cond_4

    :cond_3
    move v4, v3

    :cond_4
    xor-int/lit8 v12, v4, 0x1

    iget-object v0, p1, Le9/h;->q:Lg9/d;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v12}, Lg9/d;->e(Ll9/t;IILu8/p;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v13
.end method

.method public w(Lp9/i;JI)V
    .locals 15

    move-object/from16 v0, p1

    check-cast v0, Lp9/n;

    if-nez p4, :cond_0

    new-instance v1, Ll9/t;

    iget-wide v2, v0, Lp9/n;->w:J

    iget-object v2, v0, Lp9/n;->x:Lz8/g;

    invoke-direct {v1, v2}, Ll9/t;-><init>(Lz8/g;)V

    :goto_0
    move-object v4, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ll9/t;

    iget-wide v2, v0, Lp9/n;->w:J

    iget-object v2, v0, Lp9/n;->z:Lz8/m;

    iget-object v2, v2, Lz8/m;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :goto_1
    iget-object v1, p0, Le9/d;->w:Le9/h;

    iget-object v3, v1, Le9/h;->q:Lg9/d;

    iget v5, v0, Lp9/n;->y:I

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v14, p4

    invoke-virtual/range {v3 .. v14}, Lg9/d;->f(Ll9/t;IILu8/p;ILjava/lang/Object;JJI)V

    return-void
.end method
