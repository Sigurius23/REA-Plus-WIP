.class public final Lwn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/y;


# instance fields
.field public E:J

.field public F:J

.field public G:J

.field public H:J

.field public I:Z

.field public J:Ljava/io/IOException;

.field public final synthetic K:Lwn/c;

.field public final w:Landroid/net/Uri;

.field public final x:Lko/c0;

.field public final y:Lko/l;

.field public z:Lwn/j;


# direct methods
.method public constructor <init>(Lwn/c;Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwn/b;->K:Lwn/c;

    iput-object p2, p0, Lwn/b;->w:Landroid/net/Uri;

    new-instance p2, Lko/c0;

    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    invoke-direct {p2, v0}, Lko/c0;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lwn/b;->x:Lko/c0;

    iget-object p1, p1, Lwn/c;->w:Lty/c;

    iget-object p1, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast p1, Lko/k;

    invoke-interface {p1}, Lko/k;->createDataSource()Lko/l;

    move-result-object p1

    iput-object p1, p0, Lwn/b;->y:Lko/l;

    return-void
.end method

.method public static a(Lwn/b;J)Z
    .locals 7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    add-long/2addr v0, p1

    iput-wide v0, p0, Lwn/b;->H:J

    iget-object p1, p0, Lwn/b;->w:Landroid/net/Uri;

    iget-object p0, p0, Lwn/b;->K:Lwn/c;

    iget-object p2, p0, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {p1, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lwn/c;->J:Lwn/m;

    iget-object p1, p1, Lwn/m;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    move v3, p2

    :goto_0
    if-ge v3, v0, :cond_1

    iget-object v4, p0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwn/l;

    iget-object v5, v5, Lwn/l;->a:Landroid/net/Uri;

    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/b;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v5, v4, Lwn/b;->H:J

    cmp-long v5, v1, v5

    if-lez v5, :cond_0

    iget-object p1, v4, Lwn/b;->w:Landroid/net/Uri;

    iput-object p1, p0, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lwn/c;->b(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v4, p0}, Lwn/b;->d(Landroid/net/Uri;)V

    return p2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return p2
.end method


# virtual methods
.method public final b(Landroid/net/Uri;)V
    .locals 14

    iget-object v0, p0, Lwn/b;->K:Lwn/c;

    iget-object v1, v0, Lwn/c;->x:Lwn/p;

    iget-object v2, v0, Lwn/c;->J:Lwn/m;

    iget-object v3, p0, Lwn/b;->z:Lwn/j;

    invoke-interface {v1, v2, v3}, Lwn/p;->f(Lwn/m;Lwn/j;)Lko/d0;

    move-result-object v1

    new-instance v2, Lko/e0;

    iget-object v3, p0, Lwn/b;->y:Lko/l;

    invoke-direct {v2, v3, p1, v1}, Lko/e0;-><init>(Lko/l;Landroid/net/Uri;Lko/d0;)V

    iget-object p1, v0, Lwn/c;->y:Lg73/d;

    iget v5, v2, Lko/e0;->c:I

    invoke-virtual {p1, v5}, Lg73/d;->h(I)I

    move-result p1

    iget-object v1, p0, Lwn/b;->x:Lko/c0;

    invoke-virtual {v1, v2, p0, p1}, Lko/c0;->d(Lko/a0;Lko/y;I)J

    iget-object v3, v0, Lwn/c;->F:Lsn/z;

    new-instance v4, Lsn/m;

    iget-object p1, v2, Lko/e0;->b:Lko/n;

    invoke-direct {v4, p1}, Lsn/m;-><init>(Lko/n;)V

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v3 .. v13}, Lsn/z;->i(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final c(Lko/a0;)V
    .locals 14

    check-cast p1, Lko/e0;

    iget-object v0, p1, Lko/e0;->f:Ljava/lang/Object;

    check-cast v0, Lwn/n;

    new-instance v2, Lsn/m;

    iget-object p1, p1, Lko/e0;->d:Lko/i0;

    iget-object p1, p1, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    instance-of p1, v0, Lwn/j;

    if-eqz p1, :cond_0

    check-cast v0, Lwn/j;

    invoke-virtual {p0, v0}, Lwn/b;->e(Lwn/j;)V

    iget-object p1, p0, Lwn/b;->K:Lwn/c;

    iget-object v1, p1, Lwn/c;->F:Lsn/z;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x4

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v11}, Lsn/z;->e(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    goto :goto_0

    :cond_0
    const-string p1, "Loaded playlist has unexpected type."

    invoke-static {p1}, Lcom/google/android/exoplayer2/ParserException;->b(Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v12

    iput-object v12, p0, Lwn/b;->J:Ljava/io/IOException;

    iget-object p1, p0, Lwn/b;->K:Lwn/c;

    iget-object v1, p1, Lwn/c;->F:Lsn/z;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x4

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x1

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    :goto_0
    iget-object p1, p0, Lwn/b;->K:Lwn/c;

    iget-object p1, p1, Lwn/c;->y:Lg73/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final d(Landroid/net/Uri;)V
    .locals 7

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lwn/b;->H:J

    iget-boolean v0, p0, Lwn/b;->I:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lwn/b;->x:Lko/c0;

    invoke-virtual {v0}, Lko/c0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, v0, Lko/c0;->c:Ljava/io/IOException;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lwn/b;->G:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    const/4 v4, 0x1

    iput-boolean v4, p0, Lwn/b;->I:Z

    iget-object v4, p0, Lwn/b;->K:Lwn/c;

    iget-object v4, v4, Lwn/c;->H:Landroid/os/Handler;

    new-instance v5, Lr5/b;

    const/16 v6, 0x11

    invoke-direct {v5, v6, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sub-long/2addr v2, v0

    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lwn/b;->b(Landroid/net/Uri;)V

    :cond_2
    return-void
.end method

.method public final e(Lwn/j;)V
    .locals 70

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lwn/b;->z:Lwn/j;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    iput-wide v3, v0, Lwn/b;->E:J

    iget-object v5, v0, Lwn/b;->K:Lwn/c;

    iget-object v6, v5, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_5

    iget-wide v9, v1, Lwn/j;->k:J

    iget-wide v11, v2, Lwn/j;->k:J

    cmp-long v9, v9, v11

    if-lez v9, :cond_0

    goto :goto_0

    :cond_0
    if-gez v9, :cond_2

    :cond_1
    const/4 v9, 0x0

    goto :goto_1

    :cond_2
    iget-object v9, v1, Lwn/j;->r:Lzr/g0;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    iget-object v10, v2, Lwn/j;->r:Lzr/g0;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v9, v10

    if-eqz v9, :cond_4

    if-lez v9, :cond_1

    :cond_3
    :goto_0
    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    iget-object v9, v1, Lwn/j;->s:Lzr/g0;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    iget-object v10, v2, Lwn/j;->s:Lzr/g0;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-gt v9, v10, :cond_3

    if-ne v9, v10, :cond_1

    iget-boolean v9, v1, Lwn/j;->o:Z

    if-eqz v9, :cond_1

    iget-boolean v9, v2, Lwn/j;->o:Z

    if-nez v9, :cond_1

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :goto_1
    iget-object v10, v1, Lwn/j;->r:Lzr/g0;

    iget-wide v11, v1, Lwn/j;->k:J

    const-wide/16 v36, 0x0

    if-nez v9, :cond_8

    iget-boolean v9, v1, Lwn/j;->o:Z

    if-eqz v9, :cond_7

    iget-boolean v9, v2, Lwn/j;->o:Z

    if-eqz v9, :cond_6

    move-object v10, v2

    move-object/from16 v65, v6

    move-wide v8, v11

    const/4 v6, 0x0

    const/16 v64, 0x1

    goto/16 :goto_c

    :cond_6
    new-instance v38, Lwn/j;

    iget v9, v2, Lwn/j;->d:I

    iget-object v10, v2, Lwn/n;->a:Ljava/lang/String;

    iget-object v14, v2, Lwn/n;->b:Ljava/util/List;

    move-object/from16 v41, v14

    iget-wide v13, v2, Lwn/j;->e:J

    iget-boolean v15, v2, Lwn/j;->g:Z

    const/16 v64, 0x1

    iget-wide v7, v2, Lwn/j;->h:J

    move-object/from16 v65, v6

    iget-boolean v6, v2, Lwn/j;->i:Z

    move/from16 v47, v6

    iget v6, v2, Lwn/j;->j:I

    move/from16 v48, v6

    move-wide/from16 v45, v7

    iget-wide v6, v2, Lwn/j;->k:J

    iget v8, v2, Lwn/j;->l:I

    move-wide/from16 v49, v6

    iget-wide v6, v2, Lwn/j;->m:J

    move-wide/from16 v52, v6

    iget-wide v6, v2, Lwn/j;->n:J

    move-wide/from16 v54, v6

    iget-boolean v6, v2, Lwn/n;->c:Z

    iget-boolean v7, v2, Lwn/j;->p:Z

    move/from16 v56, v6

    iget-object v6, v2, Lwn/j;->q:Lvm/c;

    move-object/from16 v59, v6

    iget-object v6, v2, Lwn/j;->r:Lzr/g0;

    move-object/from16 v60, v6

    iget-object v6, v2, Lwn/j;->s:Lzr/g0;

    move-object/from16 v61, v6

    iget-object v6, v2, Lwn/j;->v:Lwn/i;

    move-object/from16 v62, v6

    iget-object v6, v2, Lwn/j;->t:Lzr/b1;

    const/16 v57, 0x1

    move-object/from16 v63, v6

    move/from16 v58, v7

    move/from16 v51, v8

    move/from16 v39, v9

    move-object/from16 v40, v10

    move-wide/from16 v42, v13

    move/from16 v44, v15

    invoke-direct/range {v38 .. v63}, Lwn/j;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLvm/c;Ljava/util/List;Ljava/util/List;Lwn/i;Ljava/util/Map;)V

    move-wide v8, v11

    move-object/from16 v10, v38

    :goto_2
    const/4 v6, 0x0

    goto/16 :goto_c

    :cond_7
    move-object/from16 v65, v6

    const/16 v64, 0x1

    move-object v10, v2

    move-wide v8, v11

    goto :goto_2

    :cond_8
    move-object/from16 v65, v6

    const/16 v64, 0x1

    iget-boolean v6, v1, Lwn/j;->p:Z

    if-eqz v6, :cond_9

    iget-wide v6, v1, Lwn/j;->h:J

    :goto_3
    move-wide/from16 v17, v6

    goto :goto_7

    :cond_9
    iget-object v6, v5, Lwn/c;->L:Lwn/j;

    if-eqz v6, :cond_a

    iget-wide v6, v6, Lwn/j;->h:J

    goto :goto_4

    :cond_a
    move-wide/from16 v6, v36

    :goto_4
    if-nez v2, :cond_b

    goto :goto_3

    :cond_b
    iget-wide v8, v2, Lwn/j;->h:J

    iget-wide v13, v2, Lwn/j;->k:J

    iget-object v15, v2, Lwn/j;->r:Lzr/g0;

    move-wide/from16 v17, v6

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v6

    move-wide/from16 v19, v8

    sub-long v7, v11, v13

    long-to-int v7, v7

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_c

    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn/g;

    goto :goto_5

    :cond_c
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_d

    iget-wide v6, v7, Lwn/h;->E:J

    :goto_6
    add-long v6, v19, v6

    goto :goto_3

    :cond_d
    int-to-long v6, v6

    sub-long v8, v11, v13

    cmp-long v6, v6, v8

    if-nez v6, :cond_e

    iget-wide v6, v2, Lwn/j;->u:J

    goto :goto_6

    :cond_e
    :goto_7
    iget-boolean v6, v1, Lwn/j;->i:Z

    if-eqz v6, :cond_f

    iget v6, v1, Lwn/j;->j:I

    move/from16 v20, v6

    move-object/from16 v32, v10

    const/4 v7, 0x0

    goto :goto_b

    :cond_f
    iget-object v6, v5, Lwn/c;->L:Lwn/j;

    if-eqz v6, :cond_10

    iget v6, v6, Lwn/j;->j:I

    goto :goto_8

    :cond_10
    const/4 v6, 0x0

    :goto_8
    if-nez v2, :cond_12

    :cond_11
    const/4 v7, 0x0

    goto :goto_a

    :cond_12
    iget-wide v7, v2, Lwn/j;->k:J

    sub-long v7, v11, v7

    long-to-int v7, v7

    iget-object v8, v2, Lwn/j;->r:Lzr/g0;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ge v7, v9, :cond_13

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn/g;

    goto :goto_9

    :cond_13
    const/4 v7, 0x0

    :goto_9
    if-eqz v7, :cond_11

    iget v6, v2, Lwn/j;->j:I

    iget v7, v7, Lwn/h;->z:I

    add-int/2addr v6, v7

    const/4 v7, 0x0

    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/g;

    iget v8, v8, Lwn/h;->z:I

    sub-int/2addr v6, v8

    :goto_a
    move/from16 v20, v6

    move-object/from16 v32, v10

    :goto_b
    new-instance v10, Lwn/j;

    move-wide v8, v11

    iget v11, v1, Lwn/j;->d:I

    iget-object v12, v1, Lwn/n;->a:Ljava/lang/String;

    iget-object v13, v1, Lwn/n;->b:Ljava/util/List;

    iget-wide v14, v1, Lwn/j;->e:J

    iget-boolean v6, v1, Lwn/j;->g:Z

    move-wide/from16 v21, v8

    iget-wide v7, v1, Lwn/j;->k:J

    iget v9, v1, Lwn/j;->l:I

    move/from16 v19, v6

    move-wide/from16 v23, v7

    iget-wide v6, v1, Lwn/j;->m:J

    move-wide/from16 v25, v6

    iget-wide v6, v1, Lwn/j;->n:J

    iget-boolean v8, v1, Lwn/n;->c:Z

    move-wide/from16 v27, v6

    iget-boolean v6, v1, Lwn/j;->o:Z

    iget-boolean v7, v1, Lwn/j;->p:Z

    move/from16 v29, v6

    iget-object v6, v1, Lwn/j;->q:Lvm/c;

    move-object/from16 v31, v6

    iget-object v6, v1, Lwn/j;->s:Lzr/g0;

    move-object/from16 v33, v6

    iget-object v6, v1, Lwn/j;->v:Lwn/i;

    move-object/from16 v34, v6

    iget-object v6, v1, Lwn/j;->t:Lzr/b1;

    move/from16 v16, v19

    const/16 v30, 0x0

    const/16 v19, 0x1

    move-object/from16 v35, v6

    move-object/from16 v6, v30

    move/from16 v30, v7

    move-wide/from16 v66, v27

    move/from16 v28, v8

    move-wide/from16 v68, v23

    move/from16 v23, v9

    move-wide/from16 v8, v21

    move-wide/from16 v21, v68

    move-wide/from16 v24, v25

    move-wide/from16 v26, v66

    invoke-direct/range {v10 .. v35}, Lwn/j;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLvm/c;Ljava/util/List;Ljava/util/List;Lwn/i;Ljava/util/Map;)V

    :goto_c
    iput-object v10, v0, Lwn/b;->z:Lwn/j;

    iget-object v7, v0, Lwn/b;->w:Landroid/net/Uri;

    if-eq v10, v2, :cond_16

    iput-object v6, v0, Lwn/b;->J:Ljava/io/IOException;

    iput-wide v3, v0, Lwn/b;->F:J

    iget-object v1, v5, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, v5, Lwn/c;->L:Lwn/j;

    if-nez v1, :cond_14

    iget-boolean v1, v10, Lwn/j;->o:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v5, Lwn/c;->M:Z

    iget-wide v8, v10, Lwn/j;->h:J

    iput-wide v8, v5, Lwn/c;->N:J

    :cond_14
    iput-object v10, v5, Lwn/c;->L:Lwn/j;

    iget-object v1, v5, Lwn/c;->I:Lvn/l;

    invoke-virtual {v1, v10}, Lvn/l;->q(Lwn/j;)V

    :cond_15
    invoke-virtual/range {v65 .. v65}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwn/q;

    invoke-interface {v6}, Lwn/q;->o()V

    goto :goto_d

    :cond_16
    iget-boolean v10, v10, Lwn/j;->o:Z

    if-nez v10, :cond_19

    iget-object v1, v1, Lwn/j;->r:Lzr/g0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    int-to-long v10, v1

    add-long v11, v8, v10

    iget-object v1, v0, Lwn/b;->z:Lwn/j;

    iget-wide v8, v1, Lwn/j;->k:J

    cmp-long v8, v11, v8

    if-gez v8, :cond_17

    new-instance v13, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker$PlaylistResetException;

    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    move/from16 v8, v64

    goto :goto_f

    :cond_17
    iget-wide v8, v0, Lwn/b;->F:J

    sub-long v8, v3, v8

    long-to-double v8, v8

    iget-wide v10, v1, Lwn/j;->m:J

    invoke-static {v10, v11}, Llo/y;->G(J)J

    move-result-wide v10

    long-to-double v10, v10

    const-wide/high16 v12, 0x400c000000000000L    # 3.5

    mul-double/2addr v10, v12

    cmpl-double v1, v8, v10

    if-lez v1, :cond_18

    new-instance v13, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistTracker$PlaylistStuckException;

    invoke-direct {v13}, Ljava/io/IOException;-><init>()V

    :goto_e
    const/4 v8, 0x0

    goto :goto_f

    :cond_18
    move-object v13, v6

    goto :goto_e

    :goto_f
    if-eqz v13, :cond_19

    iput-object v13, v0, Lwn/b;->J:Ljava/io/IOException;

    new-instance v1, Lai/j;

    move/from16 v6, v64

    invoke-direct {v1, v13, v6}, Lai/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual/range {v65 .. v65}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwn/q;

    invoke-interface {v9, v7, v1, v8}, Lwn/q;->l(Landroid/net/Uri;Lai/j;Z)Z

    goto :goto_10

    :cond_19
    iget-object v1, v0, Lwn/b;->z:Lwn/j;

    iget-object v6, v1, Lwn/j;->v:Lwn/i;

    iget-wide v8, v1, Lwn/j;->m:J

    iget-boolean v6, v6, Lwn/i;->e:Z

    if-nez v6, :cond_1b

    if-eq v1, v2, :cond_1a

    :goto_11
    move-wide/from16 v36, v8

    goto :goto_12

    :cond_1a
    const-wide/16 v1, 0x2

    div-long/2addr v8, v1

    goto :goto_11

    :cond_1b
    :goto_12
    invoke-static/range {v36 .. v37}, Llo/y;->G(J)J

    move-result-wide v1

    add-long/2addr v1, v3

    iput-wide v1, v0, Lwn/b;->G:J

    iget-object v1, v0, Lwn/b;->z:Lwn/j;

    iget-wide v1, v1, Lwn/j;->n:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-nez v1, :cond_1c

    iget-object v1, v5, Lwn/c;->K:Landroid/net/Uri;

    invoke-virtual {v7, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_22

    :cond_1c
    iget-object v1, v0, Lwn/b;->z:Lwn/j;

    iget-boolean v2, v1, Lwn/j;->o:Z

    if-nez v2, :cond_22

    iget-object v1, v1, Lwn/j;->v:Lwn/i;

    iget-wide v5, v1, Lwn/i;->a:J

    cmp-long v2, v5, v3

    if-nez v2, :cond_1d

    iget-boolean v1, v1, Lwn/i;->e:Z

    if-nez v1, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-virtual {v7}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    iget-object v2, v0, Lwn/b;->z:Lwn/j;

    iget-object v5, v2, Lwn/j;->v:Lwn/i;

    iget-boolean v5, v5, Lwn/i;->e:Z

    if-eqz v5, :cond_1f

    iget-wide v5, v2, Lwn/j;->k:J

    iget-object v2, v2, Lwn/j;->r:Lzr/g0;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v7, v2

    add-long/2addr v5, v7

    const-string v2, "_HLS_msn"

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    iget-object v2, v0, Lwn/b;->z:Lwn/j;

    iget-wide v5, v2, Lwn/j;->n:J

    cmp-long v5, v5, v3

    if-eqz v5, :cond_1f

    iget-object v2, v2, Lwn/j;->s:Lzr/g0;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_1e

    invoke-static {v2}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/e;

    iget-boolean v2, v2, Lwn/e;->M:Z

    if-eqz v2, :cond_1e

    add-int/lit8 v5, v5, -0x1

    :cond_1e
    const-string v2, "_HLS_part"

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_1f
    iget-object v2, v0, Lwn/b;->z:Lwn/j;

    iget-object v2, v2, Lwn/j;->v:Lwn/i;

    iget-wide v5, v2, Lwn/i;->a:J

    cmp-long v3, v5, v3

    if-eqz v3, :cond_21

    iget-boolean v2, v2, Lwn/i;->b:Z

    if-eqz v2, :cond_20

    const-string v2, "v2"

    goto :goto_13

    :cond_20
    const-string v2, "YES"

    :goto_13
    const-string v3, "_HLS_skip"

    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_21
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v7

    :goto_14
    invoke-virtual {v0, v7}, Lwn/b;->d(Landroid/net/Uri;)V

    :cond_22
    return-void
.end method

.method public final p(Lko/a0;Z)V
    .locals 11

    check-cast p1, Lko/e0;

    new-instance v1, Lsn/m;

    iget-wide v2, p1, Lko/e0;->a:J

    iget-object p1, p1, Lko/e0;->d:Lko/i0;

    iget-object p1, p1, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object p1, p0, Lwn/b;->K:Lwn/c;

    iget-object p2, p1, Lwn/c;->y:Lg73/d;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p1, Lwn/c;->F:Lsn/z;

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v2, 0x4

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v10}, Lsn/z;->c(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final q(Lko/a0;Ljava/io/IOException;I)Lbb/f;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v1, p1

    check-cast v1, Lko/e0;

    new-instance v2, Lsn/m;

    iget-wide v3, v1, Lko/e0;->a:J

    iget v3, v1, Lko/e0;->c:I

    iget-object v1, v1, Lko/e0;->d:Lko/i0;

    iget-object v1, v1, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-string v4, "_HLS_msn"

    invoke-virtual {v1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v13, 0x1

    if-eqz v1, :cond_0

    move v1, v13

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    instance-of v5, v12, Lcom/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser$DeltaUpdateException;

    sget-object v14, Lko/c0;->e:Lbb/f;

    iget-object v6, v0, Lwn/b;->w:Landroid/net/Uri;

    iget-object v7, v0, Lwn/b;->K:Lwn/c;

    if-nez v1, :cond_1

    if-eqz v5, :cond_3

    :cond_1
    instance-of v1, v12, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    if-eqz v1, :cond_2

    move-object v1, v12

    check-cast v1, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    iget v1, v1, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;->y:I

    goto :goto_1

    :cond_2
    const v1, 0x7fffffff

    :goto_1
    if-nez v5, :cond_a

    const/16 v5, 0x190

    if-eq v1, v5, :cond_a

    const/16 v5, 0x1f7

    if-ne v1, v5, :cond_3

    goto/16 :goto_7

    :cond_3
    new-instance v1, Lai/j;

    move/from16 v5, p3

    invoke-direct {v1, v12, v5}, Lai/j;-><init>(Ljava/lang/Object;I)V

    iget-object v5, v7, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v8, v4

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x1

    if-eqz v9, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwn/q;

    invoke-interface {v9, v6, v1, v4}, Lwn/q;->l(Landroid/net/Uri;Lai/j;Z)Z

    move-result v9

    xor-int/2addr v9, v10

    or-int/2addr v8, v9

    goto :goto_2

    :cond_4
    iget-object v15, v7, Lwn/c;->y:Lg73/d;

    if-eqz v8, :cond_6

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lg73/d;->i(Lai/j;)J

    move-result-wide v5

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v5, v8

    if-eqz v1, :cond_5

    new-instance v1, Lbb/f;

    invoke-direct {v1, v4, v5, v6, v4}, Lbb/f;-><init>(IJB)V

    :goto_3
    move-object v14, v1

    goto :goto_4

    :cond_5
    sget-object v1, Lko/c0;->f:Lbb/f;

    goto :goto_3

    :cond_6
    :goto_4
    iget v1, v14, Lbb/f;->a:I

    if-eqz v1, :cond_8

    if-ne v1, v10, :cond_7

    goto :goto_5

    :cond_7
    move/from16 v16, v4

    goto :goto_6

    :cond_8
    :goto_5
    move/from16 v16, v10

    :goto_6
    xor-int/lit8 v13, v16, 0x1

    iget-object v1, v7, Lwn/c;->F:Lsn/z;

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_9

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_9
    return-object v14

    :cond_a
    :goto_7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iput-wide v4, v0, Lwn/b;->G:J

    invoke-virtual {v0, v6}, Lwn/b;->d(Landroid/net/Uri;)V

    iget-object v1, v7, Lwn/c;->F:Lsn/z;

    sget v4, Llo/y;->a:I

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v12, p2

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-object v14
.end method
