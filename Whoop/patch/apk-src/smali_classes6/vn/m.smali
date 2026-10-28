.class public final Lvn/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/r0;


# instance fields
.field public final w:I

.field public final x:Lvn/q;

.field public y:I


# direct methods
.method public constructor <init>(Lvn/q;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/m;->x:Lvn/q;

    iput p2, p0, Lvn/m;->w:I

    const/4 p1, -0x1

    iput p1, p0, Lvn/m;->y:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget v0, p0, Lvn/m;->y:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    iget-object v0, p0, Lvn/m;->x:Lvn/q;

    invoke-virtual {v0}, Lvn/q;->s()V

    iget-object v3, v0, Lvn/q;->k0:[I

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lvn/q;->k0:[I

    iget v4, p0, Lvn/m;->w:I

    aget v3, v3, v4

    const/4 v5, -0x2

    if-ne v3, v2, :cond_2

    iget-object v1, v0, Lvn/q;->j0:Ljava/util/Set;

    iget-object v0, v0, Lvn/q;->i0:Lsn/x0;

    invoke-virtual {v0, v4}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, -0x3

    goto :goto_2

    :cond_1
    :goto_1
    move v3, v5

    goto :goto_2

    :cond_2
    iget-object v0, v0, Lvn/q;->n0:[Z

    aget-boolean v2, v0, v3

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    aput-boolean v1, v0, v3

    :goto_2
    iput v3, p0, Lvn/m;->y:I

    return-void
.end method

.method public final b()Z
    .locals 3

    iget v0, p0, Lvn/m;->y:I

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lvn/m;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lvn/m;->y:I

    iget-object v1, p0, Lvn/m;->x:Lvn/q;

    invoke-virtual {v1}, Lvn/q;->C()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lvn/q;->V:[Lvn/p;

    aget-object v0, v2, v0

    iget-boolean v1, v1, Lvn/q;->t0:Z

    invoke-virtual {v0, v1}, Lsn/q0;->p(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final c()V
    .locals 4

    iget v0, p0, Lvn/m;->y:I

    const/4 v1, -0x2

    iget-object v2, p0, Lvn/m;->x:Lvn/q;

    if-eq v0, v1, :cond_3

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {v2}, Lvn/q;->E()V

    return-void

    :cond_0
    const/4 v1, -0x3

    if-eq v0, v1, :cond_2

    invoke-virtual {v2}, Lvn/q;->E()V

    iget-object v1, v2, Lvn/q;->V:[Lvn/p;

    aget-object v0, v1, v0

    iget-object v1, v0, Lsn/q0;->h:Lty/c;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lty/c;->r()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lsn/q0;->h:Lty/c;

    invoke-virtual {v0}, Lty/c;->n()Lcom/google/android/exoplayer2/drm/DrmSession$DrmSessionException;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v0

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/SampleQueueMappingException;

    invoke-virtual {v2}, Lvn/q;->s()V

    iget-object v1, v2, Lvn/q;->i0:Lsn/x0;

    iget v2, p0, Lvn/m;->w:I

    invoke-virtual {v1, v2}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v1, v1, Lsn/w0;->y:[Lrm/c0;

    aget-object v1, v1, v2

    iget-object v1, v1, Lrm/c0;->L:Ljava/lang/String;

    const/16 v2, 0x3c

    invoke-static {v2, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Unable to bind a sample queue to TrackGroup with mime type "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Lvn/m;->y:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_0

    const/4 v1, -0x2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Lxl/a;Lum/c;I)I
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Lvn/m;->y:I

    const/4 v4, -0x3

    if-ne v3, v4, :cond_0

    const/4 v1, 0x4

    invoke-virtual {v2, v1}, La9/a;->a(I)V

    const/4 v1, -0x4

    return v1

    :cond_0
    invoke-virtual {v0}, Lvn/m;->d()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v0, Lvn/m;->y:I

    iget-object v5, v0, Lvn/m;->x:Lvn/q;

    iget-object v6, v5, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v5}, Lvn/q;->C()Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_1
    move/from16 v19, v4

    goto/16 :goto_7

    :cond_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_9

    move v7, v8

    :goto_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-ge v7, v9, :cond_5

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvn/j;

    iget v9, v9, Lvn/j;->k:I

    iget-object v10, v5, Lvn/q;->V:[Lvn/p;

    array-length v10, v10

    move v11, v8

    :goto_1
    if-ge v11, v10, :cond_4

    iget-object v12, v5, Lvn/q;->n0:[Z

    aget-boolean v12, v12, v11

    if-eqz v12, :cond_3

    iget-object v12, v5, Lvn/q;->V:[Lvn/p;

    aget-object v12, v12, v11

    invoke-virtual {v12}, Lsn/q0;->s()I

    move-result v12

    if-ne v12, v9, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    sget v9, Llo/y;->a:I

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-gt v7, v9, :cond_8

    if-ltz v7, :cond_8

    if-eqz v7, :cond_6

    invoke-virtual {v6, v8, v7}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->clear()V

    :cond_6
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvn/j;

    iget-object v12, v7, Lun/a;->d:Lrm/c0;

    iget-object v9, v5, Lvn/q;->g0:Lrm/c0;

    invoke-virtual {v12, v9}, Lrm/c0;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    iget-object v9, v5, Lvn/q;->K:Lsn/z;

    iget v11, v5, Lvn/q;->x:I

    iget v13, v7, Lun/a;->e:I

    iget-object v14, v7, Lun/a;->f:Ljava/lang/Object;

    move/from16 v19, v4

    move-object/from16 v20, v5

    iget-wide v4, v7, Lun/a;->g:J

    new-instance v7, Ll9/y;

    invoke-virtual {v9, v4, v5}, Lsn/z;->a(J)J

    move-result-wide v15

    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x1

    move-object v4, v9

    move-object v9, v7

    invoke-direct/range {v9 .. v18}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {v4, v9}, Lsn/z;->b(Ll9/y;)V

    move-object/from16 v4, v20

    goto :goto_3

    :cond_7
    move/from16 v19, v4

    move-object v4, v5

    :goto_3
    iput-object v12, v4, Lvn/q;->g0:Lrm/c0;

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_9
    move/from16 v19, v4

    move-object v4, v5

    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lvn/j;

    iget-boolean v5, v5, Lvn/j;->K:Z

    if-nez v5, :cond_a

    goto :goto_7

    :cond_a
    iget-object v5, v4, Lvn/q;->V:[Lvn/p;

    aget-object v5, v5, v3

    iget-boolean v7, v4, Lvn/q;->t0:Z

    move/from16 v9, p3

    invoke-virtual {v5, v1, v2, v9, v7}, Lsn/q0;->t(Lxl/a;Lum/c;IZ)I

    move-result v2

    const/4 v5, -0x5

    if-ne v2, v5, :cond_e

    iget-object v5, v1, Lxl/a;->y:Ljava/lang/Object;

    check-cast v5, Lrm/c0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v7, v4, Lvn/q;->b0:I

    if-ne v3, v7, :cond_d

    iget-object v7, v4, Lvn/q;->V:[Lvn/p;

    aget-object v3, v7, v3

    invoke-virtual {v3}, Lsn/q0;->s()I

    move-result v3

    :goto_5
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v8, v7, :cond_b

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvn/j;

    iget v7, v7, Lvn/j;->k:I

    if-eq v7, v3, :cond_b

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v8, v3, :cond_c

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvn/j;

    iget-object v3, v3, Lun/a;->d:Lrm/c0;

    goto :goto_6

    :cond_c
    iget-object v3, v4, Lvn/q;->f0:Lrm/c0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_6
    invoke-virtual {v5, v3}, Lrm/c0;->c(Lrm/c0;)Lrm/c0;

    move-result-object v5

    :cond_d
    iput-object v5, v1, Lxl/a;->y:Ljava/lang/Object;

    :cond_e
    return v2

    :goto_7
    return v19
.end method

.method public final j(J)I
    .locals 4

    invoke-virtual {p0}, Lvn/m;->d()Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, Lvn/m;->y:I

    iget-object v1, p0, Lvn/m;->x:Lvn/q;

    invoke-virtual {v1}, Lvn/q;->C()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v2, v1, Lvn/q;->V:[Lvn/p;

    aget-object v2, v2, v0

    iget-boolean v3, v1, Lvn/q;->t0:Z

    invoke-virtual {v2, p1, p2, v3}, Lsn/q0;->n(JZ)I

    move-result p1

    iget-object p2, v1, Lvn/q;->N:Ljava/util/ArrayList;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    invoke-static {p2, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_3

    move-object p2, v1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p2, 0x0

    :goto_1
    check-cast p2, Lvn/j;

    if-eqz p2, :cond_5

    iget-boolean v1, p2, Lvn/j;->K:Z

    if-nez v1, :cond_5

    invoke-virtual {v2}, Lsn/q0;->l()I

    move-result v1

    invoke-virtual {p2, v0}, Lvn/j;->e(I)I

    move-result p2

    sub-int/2addr p2, v1

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :cond_5
    invoke-virtual {v2, p1}, Lsn/q0;->w(I)V

    return p1

    :cond_6
    :goto_2
    const/4 p1, 0x0

    return p1
.end method
