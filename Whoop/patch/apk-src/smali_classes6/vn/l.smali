.class public final Lvn/l;
.super Lsn/a;
.source "SourceFile"


# instance fields
.field public final h:Lvn/i;

.field public final i:Lrm/i0;

.field public final j:Lty/c;

.field public final k:Lng3/n;

.field public final l:Lvm/h;

.field public final m:Lg73/d;

.field public final n:Z

.field public final o:I

.field public final p:Lwn/c;

.field public final q:J

.field public final r:Lrm/k0;

.field public s:Lrm/h0;

.field public t:Lko/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "goog.exo.hls"

    invoke-static {v0}, Lrm/a0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lrm/k0;Lty/c;Lvn/c;Lng3/n;Lvm/h;Lg73/d;Lwn/c;JZI)V
    .locals 1

    invoke-direct {p0}, Lsn/a;-><init>()V

    iget-object v0, p1, Lrm/k0;->x:Lrm/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, p0, Lvn/l;->i:Lrm/i0;

    iput-object p1, p0, Lvn/l;->r:Lrm/k0;

    iget-object p1, p1, Lrm/k0;->y:Lrm/h0;

    iput-object p1, p0, Lvn/l;->s:Lrm/h0;

    iput-object p2, p0, Lvn/l;->j:Lty/c;

    iput-object p3, p0, Lvn/l;->h:Lvn/i;

    iput-object p4, p0, Lvn/l;->k:Lng3/n;

    iput-object p5, p0, Lvn/l;->l:Lvm/h;

    iput-object p6, p0, Lvn/l;->m:Lg73/d;

    iput-object p7, p0, Lvn/l;->p:Lwn/c;

    iput-wide p8, p0, Lvn/l;->q:J

    iput-boolean p10, p0, Lvn/l;->n:Z

    iput p11, p0, Lvn/l;->o:I

    return-void
.end method

.method public static p(JLjava/util/List;)Lwn/e;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/e;

    iget-wide v3, v2, Lwn/h;->E:J

    cmp-long v5, v3, p0

    if-gtz v5, :cond_0

    iget-boolean v5, v2, Lwn/e;->L:Z

    if-eqz v5, :cond_0

    move-object v0, v2

    goto :goto_1

    :cond_0
    cmp-long v2, v3, p0

    if-lez v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a(Lsn/v;Lko/o;J)Lsn/s;
    .locals 14

    new-instance v8, Lsn/z;

    iget-object v0, p0, Lsn/a;->c:Lsn/z;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    invoke-direct {v8, v0, v1, p1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    new-instance v6, Lsn/z;

    iget-object v0, p0, Lsn/a;->d:Lsn/z;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v6, v0, v1, p1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    new-instance v0, Lvn/k;

    iget-object v4, p0, Lvn/l;->t:Lko/j0;

    iget-object v13, p0, Lsn/a;->g:Lsm/f;

    invoke-static {v13}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Lvn/l;->h:Lvn/i;

    iget-object v2, p0, Lvn/l;->p:Lwn/c;

    iget-object v3, p0, Lvn/l;->j:Lty/c;

    iget-object v5, p0, Lvn/l;->l:Lvm/h;

    iget-object v7, p0, Lvn/l;->m:Lg73/d;

    iget-object v10, p0, Lvn/l;->k:Lng3/n;

    iget-boolean v11, p0, Lvn/l;->n:Z

    iget v12, p0, Lvn/l;->o:I

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v13}, Lvn/k;-><init>(Lvn/i;Lwn/c;Lty/c;Lko/j0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;Lko/o;Lng3/n;ZILsm/f;)V

    return-object v0
.end method

.method public final f()Lrm/k0;
    .locals 1

    iget-object v0, p0, Lvn/l;->r:Lrm/k0;

    return-object v0
.end method

.method public final g()V
    .locals 4

    iget-object v0, p0, Lvn/l;->p:Lwn/c;

    iget-object v1, v0, Lwn/c;->G:Lko/c0;

    if-eqz v1, :cond_2

    iget-object v2, v1, Lko/c0;->c:Ljava/io/IOException;

    if-nez v2, :cond_1

    iget-object v1, v1, Lko/c0;->b:Lko/z;

    if-eqz v1, :cond_2

    iget v2, v1, Lko/z;->w:I

    iget-object v3, v1, Lko/z;->z:Ljava/io/IOException;

    if-eqz v3, :cond_2

    iget v1, v1, Lko/z;->E:I

    if-gt v1, v2, :cond_0

    goto :goto_0

    :cond_0
    throw v3

    :cond_1
    throw v2

    :cond_2
    :goto_0
    iget-object v1, v0, Lwn/c;->K:Landroid/net/Uri;

    if-eqz v1, :cond_7

    iget-object v0, v0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/b;

    iget-object v1, v0, Lwn/b;->x:Lko/c0;

    iget-object v2, v1, Lko/c0;->c:Ljava/io/IOException;

    if-nez v2, :cond_6

    iget-object v1, v1, Lko/c0;->b:Lko/z;

    if-eqz v1, :cond_4

    iget v2, v1, Lko/z;->w:I

    iget-object v3, v1, Lko/z;->z:Ljava/io/IOException;

    if-eqz v3, :cond_4

    iget v1, v1, Lko/z;->E:I

    if-gt v1, v2, :cond_3

    goto :goto_1

    :cond_3
    throw v3

    :cond_4
    :goto_1
    iget-object v0, v0, Lwn/b;->J:Ljava/io/IOException;

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    throw v0

    :cond_6
    throw v2

    :cond_7
    :goto_2
    return-void
.end method

.method public final i(Lko/j0;)V
    .locals 13

    iput-object p1, p0, Lvn/l;->t:Lko/j0;

    iget-object p1, p0, Lvn/l;->l:Lvm/h;

    invoke-interface {p1}, Lvm/h;->prepare()V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lsn/a;->g:Lsm/f;

    invoke-static {v1}, Llo/a;->j(Ljava/lang/Object;)V

    invoke-interface {p1, v0, v1}, Lvm/h;->c(Landroid/os/Looper;Lsm/f;)V

    new-instance v2, Lsn/z;

    iget-object p1, p0, Lsn/a;->c:Lsn/z;

    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {v2, p1, v0, v1}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iget-object p1, p0, Lvn/l;->i:Lrm/i0;

    iget-object p1, p1, Lrm/i0;->a:Landroid/net/Uri;

    iget-object v3, p0, Lvn/l;->p:Lwn/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object v1

    iput-object v1, v3, Lwn/c;->H:Landroid/os/Handler;

    iput-object v2, v3, Lwn/c;->F:Lsn/z;

    iput-object p0, v3, Lwn/c;->I:Lvn/l;

    new-instance v1, Lko/e0;

    iget-object v4, v3, Lwn/c;->w:Lty/c;

    iget-object v4, v4, Lty/c;->x:Ljava/lang/Object;

    check-cast v4, Lko/k;

    invoke-interface {v4}, Lko/k;->createDataSource()Lko/l;

    move-result-object v4

    iget-object v5, v3, Lwn/c;->x:Lwn/p;

    invoke-interface {v5}, Lwn/p;->c()Lko/d0;

    move-result-object v5

    invoke-direct {v1, v4, p1, v5}, Lko/e0;-><init>(Lko/l;Landroid/net/Uri;Lko/d0;)V

    iget-object p1, v3, Lwn/c;->G:Lko/c0;

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Llo/a;->i(Z)V

    new-instance p1, Lko/c0;

    const-string v0, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    invoke-direct {p1, v0}, Lko/c0;-><init>(Ljava/lang/String;)V

    iput-object p1, v3, Lwn/c;->G:Lko/c0;

    iget-object v0, v3, Lwn/c;->y:Lg73/d;

    iget v4, v1, Lko/e0;->c:I

    invoke-virtual {v0, v4}, Lg73/d;->h(I)I

    move-result v0

    invoke-virtual {p1, v1, v3, v0}, Lko/c0;->d(Lko/a0;Lko/y;I)J

    new-instance v3, Lsn/m;

    iget-object p1, v1, Lko/e0;->b:Lko/n;

    invoke-direct {v3, p1}, Lsn/m;-><init>(Lko/n;)V

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v2 .. v12}, Lsn/z;->i(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final k(Lsn/s;)V
    .locals 12

    check-cast p1, Lvn/k;

    iget-object v0, p1, Lvn/k;->x:Lwn/c;

    iget-object v0, v0, Lwn/c;->E:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p1, Lvn/k;->S:[Lvn/q;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    aget-object v5, v0, v3

    iget-boolean v6, v5, Lvn/q;->d0:Z

    if-eqz v6, :cond_1

    iget-object v6, v5, Lvn/q;->V:[Lvn/p;

    array-length v7, v6

    move v8, v2

    :goto_1
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    invoke-virtual {v9}, Lsn/q0;->g()V

    iget-object v10, v9, Lsn/q0;->h:Lty/c;

    if-eqz v10, :cond_0

    iget-object v11, v9, Lsn/q0;->e:Lsn/z;

    invoke-virtual {v10, v11}, Lty/c;->u(Lsn/z;)V

    iput-object v4, v9, Lsn/q0;->h:Lty/c;

    iput-object v4, v9, Lsn/q0;->g:Lrm/c0;

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    iget-object v6, v5, Lvn/q;->J:Lko/c0;

    invoke-virtual {v6, v5}, Lko/c0;->c(Lko/b0;)V

    iget-object v6, v5, Lvn/q;->R:Landroid/os/Handler;

    invoke-virtual {v6, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v4, 0x1

    iput-boolean v4, v5, Lvn/q;->h0:Z

    iget-object v4, v5, Lvn/q;->S:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v4, p1, Lvn/k;->P:Lsn/r;

    return-void
.end method

.method public final m()V
    .locals 5

    iget-object v0, p0, Lvn/l;->p:Lwn/c;

    const/4 v1, 0x0

    iput-object v1, v0, Lwn/c;->K:Landroid/net/Uri;

    iput-object v1, v0, Lwn/c;->L:Lwn/j;

    iput-object v1, v0, Lwn/c;->J:Lwn/m;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v2, v0, Lwn/c;->N:J

    iget-object v2, v0, Lwn/c;->G:Lko/c0;

    invoke-virtual {v2, v1}, Lko/c0;->c(Lko/b0;)V

    iput-object v1, v0, Lwn/c;->G:Lko/c0;

    iget-object v2, v0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwn/b;

    iget-object v4, v4, Lwn/b;->x:Lko/c0;

    invoke-virtual {v4, v1}, Lko/c0;->c(Lko/b0;)V

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lwn/c;->H:Landroid/os/Handler;

    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, v0, Lwn/c;->H:Landroid/os/Handler;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lvn/l;->l:Lvm/h;

    invoke-interface {v0}, Lvm/h;->release()V

    return-void
.end method

.method public final q(Lwn/j;)V
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-boolean v2, v1, Lwn/j;->p:Z

    iget-boolean v3, v1, Lwn/j;->g:Z

    iget-object v4, v1, Lwn/j;->r:Lzr/g0;

    iget-wide v5, v1, Lwn/j;->u:J

    iget-wide v7, v1, Lwn/j;->e:J

    iget v9, v1, Lwn/j;->d:I

    iget-wide v10, v1, Lwn/j;->h:J

    if-eqz v2, :cond_0

    invoke-static {v10, v11}, Llo/y;->G(J)J

    move-result-wide v14

    move-wide/from16 v19, v14

    goto :goto_0

    :cond_0
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    const/4 v2, 0x1

    const/4 v14, 0x2

    if-eq v9, v14, :cond_2

    if-ne v9, v2, :cond_1

    goto :goto_1

    :cond_1
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_2

    :cond_2
    :goto_1
    move-wide/from16 v17, v19

    :goto_2
    new-instance v32, Lvn/c;

    iget-object v15, v0, Lvn/l;->p:Lwn/c;

    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v12, v15, Lwn/c;->J:Lwn/m;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct/range {v32 .. v32}, Ljava/lang/Object;-><init>()V

    new-instance v33, Lwn/d;

    iget-object v13, v12, Lwn/n;->a:Ljava/lang/String;

    iget-object v14, v12, Lwn/n;->b:Ljava/util/List;

    iget-object v2, v12, Lwn/m;->e:Ljava/util/List;

    move-object/from16 v36, v2

    iget-object v2, v12, Lwn/m;->f:Ljava/util/List;

    move-object/from16 v37, v2

    iget-object v2, v12, Lwn/m;->g:Ljava/util/List;

    move-object/from16 v38, v2

    iget-object v2, v12, Lwn/m;->h:Ljava/util/List;

    move-object/from16 v39, v2

    iget-object v2, v12, Lwn/m;->i:Ljava/util/List;

    move-object/from16 v40, v2

    iget-object v2, v12, Lwn/m;->j:Lrm/c0;

    move-object/from16 v41, v2

    iget-object v2, v12, Lwn/m;->k:Ljava/util/List;

    move-object/from16 v42, v2

    iget-boolean v2, v12, Lwn/n;->c:Z

    move/from16 v43, v2

    iget-object v2, v12, Lwn/m;->l:Ljava/util/Map;

    iget-object v12, v12, Lwn/m;->m:Ljava/util/List;

    move-object/from16 v44, v2

    move-object/from16 v45, v12

    move-object/from16 v34, v13

    move-object/from16 v35, v14

    invoke-direct/range {v33 .. v45}, Lwn/m;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lrm/c0;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V

    iget-boolean v2, v15, Lwn/c;->M:Z

    if-eqz v2, :cond_13

    iget-object v2, v1, Lwn/j;->v:Lwn/i;

    iget-wide v14, v15, Lwn/c;->N:J

    sub-long v25, v10, v14

    iget-boolean v14, v1, Lwn/j;->o:Z

    if-eqz v14, :cond_3

    add-long v27, v25, v5

    goto :goto_3

    :cond_3
    move-wide/from16 v27, v21

    :goto_3
    iget-boolean v15, v1, Lwn/j;->p:Z

    if-eqz v15, :cond_5

    sget v15, Llo/y;->a:I

    iget-wide v12, v0, Lvn/l;->q:J

    cmp-long v15, v12, v21

    if-nez v15, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    goto :goto_4

    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v33

    add-long v12, v33, v12

    :goto_4
    invoke-static {v12, v13}, Llo/y;->z(J)J

    move-result-wide v12

    add-long/2addr v10, v5

    sub-long/2addr v12, v10

    move-wide/from16 v35, v12

    goto :goto_5

    :cond_5
    const-wide/16 v35, 0x0

    :goto_5
    iget-object v10, v0, Lvn/l;->s:Lrm/h0;

    iget-wide v10, v10, Lrm/h0;->w:J

    cmp-long v12, v10, v21

    if-eqz v12, :cond_6

    invoke-static {v10, v11}, Llo/y;->z(J)J

    move-result-wide v10

    :goto_6
    move-wide/from16 v33, v10

    goto :goto_8

    :cond_6
    cmp-long v10, v7, v21

    if-eqz v10, :cond_7

    sub-long v10, v5, v7

    goto :goto_7

    :cond_7
    iget-wide v10, v2, Lwn/i;->d:J

    cmp-long v12, v10, v21

    if-eqz v12, :cond_8

    iget-wide v12, v1, Lwn/j;->n:J

    cmp-long v12, v12, v21

    if-eqz v12, :cond_8

    goto :goto_7

    :cond_8
    iget-wide v10, v2, Lwn/i;->c:J

    cmp-long v12, v10, v21

    if-eqz v12, :cond_9

    goto :goto_7

    :cond_9
    const-wide/16 v10, 0x3

    iget-wide v12, v1, Lwn/j;->m:J

    mul-long/2addr v10, v12

    :goto_7
    add-long v10, v10, v35

    goto :goto_6

    :goto_8
    add-long v37, v5, v35

    invoke-static/range {v33 .. v38}, Llo/y;->i(JJJ)J

    move-result-wide v5

    iget-object v10, v0, Lvn/l;->r:Lrm/k0;

    iget-object v10, v10, Lrm/k0;->y:Lrm/h0;

    iget v11, v10, Lrm/h0;->z:F

    const v12, -0x800001

    cmpl-float v11, v11, v12

    const/4 v13, 0x0

    if-nez v11, :cond_a

    iget v10, v10, Lrm/h0;->E:F

    cmpl-float v10, v10, v12

    if-nez v10, :cond_a

    iget-wide v10, v2, Lwn/i;->c:J

    cmp-long v10, v10, v21

    if-nez v10, :cond_a

    iget-wide v10, v2, Lwn/i;->d:J

    cmp-long v2, v10, v21

    if-nez v2, :cond_a

    const/4 v2, 0x1

    goto :goto_9

    :cond_a
    move v2, v13

    :goto_9
    invoke-static {v5, v6}, Llo/y;->G(J)J

    move-result-wide v40

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v2, :cond_b

    move/from16 v46, v5

    goto :goto_a

    :cond_b
    iget-object v6, v0, Lvn/l;->s:Lrm/h0;

    iget v6, v6, Lrm/h0;->z:F

    move/from16 v46, v6

    :goto_a
    if-eqz v2, :cond_c

    :goto_b
    move/from16 v47, v5

    goto :goto_c

    :cond_c
    iget-object v2, v0, Lvn/l;->s:Lrm/h0;

    iget v5, v2, Lrm/h0;->E:F

    goto :goto_b

    :goto_c
    new-instance v39, Lrm/h0;

    const-wide v42, -0x7fffffffffffffffL    # -4.9E-324

    move-wide/from16 v44, v42

    invoke-direct/range {v39 .. v47}, Lrm/h0;-><init>(JJJFF)V

    move-object/from16 v2, v39

    iput-object v2, v0, Lvn/l;->s:Lrm/h0;

    cmp-long v2, v7, v21

    if-eqz v2, :cond_d

    goto :goto_d

    :cond_d
    invoke-static/range {v40 .. v41}, Llo/y;->z(J)J

    move-result-wide v5

    sub-long v7, v37, v5

    :goto_d
    if-eqz v3, :cond_e

    move-wide v2, v7

    :goto_e
    const/4 v4, 0x2

    goto :goto_f

    :cond_e
    iget-object v2, v1, Lwn/j;->s:Lzr/g0;

    invoke-static {v7, v8, v2}, Lvn/l;->p(JLjava/util/List;)Lwn/e;

    move-result-object v2

    if-eqz v2, :cond_f

    iget-wide v2, v2, Lwn/h;->E:J

    goto :goto_e

    :cond_f
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_10

    const-wide/16 v2, 0x0

    goto :goto_e

    :cond_10
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v4, v2, v3}, Llo/y;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/g;

    iget-object v3, v2, Lwn/g;->M:Lzr/g0;

    invoke-static {v7, v8, v3}, Lvn/l;->p(JLjava/util/List;)Lwn/e;

    move-result-object v3

    if-eqz v3, :cond_11

    iget-wide v2, v3, Lwn/h;->E:J

    goto :goto_e

    :cond_11
    iget-wide v2, v2, Lwn/h;->E:J

    goto :goto_e

    :goto_f
    if-ne v9, v4, :cond_12

    iget-boolean v4, v1, Lwn/j;->f:Z

    if-eqz v4, :cond_12

    const/16 v31, 0x1

    goto :goto_10

    :cond_12
    move/from16 v31, v13

    :goto_10
    new-instance v16, Lsn/v0;

    iget-wide v4, v1, Lwn/j;->u:J

    const/16 v23, 0x1

    xor-int/lit8 v30, v14, 0x1

    iget-object v1, v0, Lvn/l;->r:Lrm/k0;

    iget-object v6, v0, Lvn/l;->s:Lrm/h0;

    const/16 v29, 0x1

    move-object/from16 v33, v1

    move-wide/from16 v23, v4

    move-object/from16 v34, v6

    move-wide/from16 v21, v27

    move-wide/from16 v27, v2

    invoke-direct/range {v16 .. v34}, Lsn/v0;-><init>(JJJJJJZZZLvn/c;Lrm/k0;Lrm/h0;)V

    :goto_11
    move-object/from16 v1, v16

    goto :goto_15

    :cond_13
    cmp-long v2, v7, v21

    if-eqz v2, :cond_17

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_13

    :cond_14
    if-nez v3, :cond_16

    cmp-long v2, v7, v5

    if-nez v2, :cond_15

    goto :goto_12

    :cond_15
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v4, v2, v3}, Llo/y;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result v2

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwn/g;

    iget-wide v7, v2, Lwn/h;->E:J

    :cond_16
    :goto_12
    move-wide/from16 v27, v7

    goto :goto_14

    :cond_17
    :goto_13
    const-wide/16 v27, 0x0

    :goto_14
    new-instance v16, Lsn/v0;

    iget-wide v1, v1, Lwn/j;->u:J

    iget-object v3, v0, Lvn/l;->r:Lrm/k0;

    const/16 v34, 0x0

    const-wide/16 v25, 0x0

    const/16 v29, 0x1

    const/16 v30, 0x0

    const/16 v31, 0x1

    move-wide/from16 v23, v1

    move-wide/from16 v21, v1

    move-object/from16 v33, v3

    invoke-direct/range {v16 .. v34}, Lsn/v0;-><init>(JJJJJJZZZLvn/c;Lrm/k0;Lrm/h0;)V

    goto :goto_11

    :goto_15
    invoke-virtual {v0, v1}, Lsn/a;->j(Lrm/o1;)V

    return-void
.end method
