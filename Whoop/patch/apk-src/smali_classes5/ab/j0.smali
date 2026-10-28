.class public final Lab/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Lx8/n;

.field public final d:Landroid/util/SparseIntArray;

.field public final e:Lab/g;

.field public final f:Lqa/j;

.field public final g:Landroid/util/SparseArray;

.field public final h:Landroid/util/SparseBooleanArray;

.field public final i:Landroid/util/SparseBooleanArray;

.field public final j:Lab/b0;

.field public k:Lab/a0;

.field public l:Lt9/q;

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILqa/j;Lx8/s;Lab/g;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lab/j0;->e:Lab/g;

    iput p1, p0, Lab/j0;->a:I

    iput-object p2, p0, Lab/j0;->f:Lqa/j;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lab/j0;->b:Ljava/util/List;

    new-instance p1, Lx8/n;

    const/16 p2, 0x24b8

    new-array p2, p2, [B

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lx8/n;-><init>([BI)V

    iput-object p1, p0, Lab/j0;->c:Lx8/n;

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lab/j0;->h:Landroid/util/SparseBooleanArray;

    new-instance p2, Landroid/util/SparseBooleanArray;

    invoke-direct {p2}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p2, p0, Lab/j0;->i:Landroid/util/SparseBooleanArray;

    new-instance p2, Landroid/util/SparseArray;

    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    iput-object p2, p0, Lab/j0;->g:Landroid/util/SparseArray;

    new-instance p4, Landroid/util/SparseIntArray;

    invoke-direct {p4}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p4, p0, Lab/j0;->d:Landroid/util/SparseIntArray;

    new-instance p4, Lab/b0;

    const/4 v0, 0x1

    invoke-direct {p4, v0}, Lab/b0;-><init>(I)V

    iput-object p4, p0, Lab/j0;->j:Lab/b0;

    sget-object p4, Lt9/q;->u:Lt9/p;

    iput-object p4, p0, Lab/j0;->l:Lt9/q;

    const/4 p4, -0x1

    iput p4, p0, Lab/j0;->q:I

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    invoke-virtual {p2}, Landroid/util/SparseArray;->clear()V

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p4

    move v0, p3

    :goto_0
    if-ge v0, p4, :cond_0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab/m0;

    invoke-virtual {p2, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lab/f0;

    new-instance p4, Lqg3/d;

    invoke-direct {p4, p0}, Lqg3/d;-><init>(Lab/j0;)V

    invoke-direct {p1, p4}, Lab/f0;-><init>(Lab/e0;)V

    invoke-virtual {p2, p3, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 17

    move-object/from16 v1, p0

    move-wide/from16 v2, p3

    iget-object v0, v1, Lab/j0;->g:Landroid/util/SparseArray;

    iget-object v4, v1, Lab/j0;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const-wide/16 v8, 0x0

    if-ge v7, v5, :cond_4

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lx8/s;

    monitor-enter v10

    :try_start_0
    iget-wide v11, v10, Lx8/s;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v10

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v11, v11, v13

    const/4 v12, 0x1

    if-nez v11, :cond_0

    move v11, v12

    goto :goto_1

    :cond_0
    move v11, v6

    :goto_1
    if-nez v11, :cond_2

    invoke-virtual {v10}, Lx8/s;->d()J

    move-result-wide v15

    cmp-long v11, v15, v13

    if-eqz v11, :cond_1

    cmp-long v8, v15, v8

    if-eqz v8, :cond_1

    cmp-long v8, v15, v2

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    move v12, v6

    :goto_2
    move v11, v12

    :cond_2
    if-eqz v11, :cond_3

    invoke-virtual {v10, v2, v3}, Lx8/s;->e(J)V

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_4
    cmp-long v4, v2, v8

    if-eqz v4, :cond_5

    iget-object v4, v1, Lab/j0;->k:Lab/a0;

    if-eqz v4, :cond_5

    invoke-virtual {v4, v2, v3}, Lt9/h;->e(J)V

    :cond_5
    iget-object v2, v1, Lab/j0;->c:Lx8/n;

    invoke-virtual {v2, v6}, Lx8/n;->C(I)V

    iget-object v2, v1, Lab/j0;->d:Landroid/util/SparseIntArray;

    invoke-virtual {v2}, Landroid/util/SparseIntArray;->clear()V

    :goto_3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v6, v2, :cond_6

    invoke-virtual {v0, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lab/m0;

    invoke-interface {v2}, Lab/m0;->a()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    return-void
.end method

.method public final g(Lt9/q;)V
    .locals 2

    iget v0, p0, Lab/j0;->a:I

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lb9/b;

    iget-object v1, p0, Lab/j0;->f:Lqa/j;

    invoke-direct {v0, p1, v1}, Lb9/b;-><init>(Lt9/q;Lqa/j;)V

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lab/j0;->l:Lt9/q;

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 6

    iget-object v0, p0, Lab/j0;->c:Lx8/n;

    iget-object v0, v0, Lx8/n;->a:[B

    check-cast p1, Lt9/k;

    const/4 v1, 0x0

    const/16 v2, 0x3ac

    invoke-virtual {p1, v0, v1, v2, v1}, Lt9/k;->c([BIIZ)Z

    move v2, v1

    :goto_0
    const/16 v3, 0xbc

    if-ge v2, v3, :cond_2

    move v3, v1

    :goto_1
    const/4 v4, 0x5

    if-ge v3, v4, :cond_1

    mul-int/lit16 v4, v3, 0xbc

    add-int/2addr v4, v2

    aget-byte v4, v0, v4

    const/16 v5, 0x47

    if-eq v4, v5, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Lt9/k;->n(I)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v12

    iget-boolean v3, v0, Lab/j0;->n:Z

    const/16 v4, 0x47

    const-wide/16 v17, -0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_14

    cmp-long v3, v12, v17

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    iget-object v9, v0, Lab/j0;->j:Lab/b0;

    if-eqz v3, :cond_f

    iget-boolean v3, v9, Lab/b0;->d:Z

    if-nez v3, :cond_f

    iget v3, v0, Lab/j0;->q:I

    iget-object v10, v9, Lab/b0;->b:Lx8/s;

    iget-object v11, v9, Lab/b0;->c:Lx8/n;

    if-gtz v3, :cond_0

    invoke-virtual {v9, v1}, Lab/b0;->a(Lt9/o;)V

    return v6

    :cond_0
    iget-boolean v12, v9, Lab/b0;->f:Z

    const v13, 0x1b8a0

    if-nez v12, :cond_7

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v14

    int-to-long v12, v13

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v10, v12

    int-to-long v12, v10

    sub-long/2addr v14, v12

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v12

    cmp-long v12, v12, v14

    if-eqz v12, :cond_1

    iput-wide v14, v2, Lt9/s;->a:J

    return v5

    :cond_1
    invoke-virtual {v11, v10}, Lx8/n;->C(I)V

    invoke-interface {v1}, Lt9/o;->e()V

    iget-object v2, v11, Lx8/n;->a:[B

    invoke-interface {v1, v2, v6, v10}, Lt9/o;->p([BII)V

    iget v1, v11, Lx8/n;->b:I

    iget v2, v11, Lx8/n;->c:I

    add-int/lit16 v10, v2, -0xbc

    :goto_0
    if-lt v10, v1, :cond_6

    iget-object v12, v11, Lx8/n;->a:[B

    const/4 v13, -0x4

    move v14, v6

    :goto_1
    const/4 v15, 0x4

    if-gt v13, v15, :cond_5

    mul-int/lit16 v15, v13, 0xbc

    add-int/2addr v15, v10

    if-lt v15, v1, :cond_3

    if-ge v15, v2, :cond_3

    aget-byte v15, v12, v15

    if-eq v15, v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v14, v5

    const/4 v15, 0x5

    if-ne v14, v15, :cond_4

    invoke-static {v11, v10, v3}, Lug/m;->L(Lx8/n;II)J

    move-result-wide v12

    cmp-long v14, v12, v7

    if-eqz v14, :cond_5

    move-wide v7, v12

    goto :goto_3

    :cond_3
    :goto_2
    move v14, v6

    :cond_4
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v10, -0x1

    goto :goto_0

    :cond_6
    :goto_3
    iput-wide v7, v9, Lab/b0;->h:J

    iput-boolean v5, v9, Lab/b0;->f:Z

    return v6

    :cond_7
    iget-wide v14, v9, Lab/b0;->h:J

    cmp-long v12, v14, v7

    if-nez v12, :cond_8

    invoke-virtual {v9, v1}, Lab/b0;->a(Lt9/o;)V

    return v6

    :cond_8
    iget-boolean v12, v9, Lab/b0;->e:Z

    if-nez v12, :cond_d

    int-to-long v12, v13

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v14

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    long-to-int v10, v12

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v12

    int-to-long v14, v6

    cmp-long v12, v12, v14

    if-eqz v12, :cond_9

    iput-wide v14, v2, Lt9/s;->a:J

    return v5

    :cond_9
    invoke-virtual {v11, v10}, Lx8/n;->C(I)V

    invoke-interface {v1}, Lt9/o;->e()V

    iget-object v2, v11, Lx8/n;->a:[B

    invoke-interface {v1, v2, v6, v10}, Lt9/o;->p([BII)V

    iget v1, v11, Lx8/n;->b:I

    iget v2, v11, Lx8/n;->c:I

    :goto_4
    if-ge v1, v2, :cond_c

    iget-object v10, v11, Lx8/n;->a:[B

    aget-byte v10, v10, v1

    if-eq v10, v4, :cond_a

    goto :goto_5

    :cond_a
    invoke-static {v11, v1, v3}, Lug/m;->L(Lx8/n;II)J

    move-result-wide v12

    cmp-long v10, v12, v7

    if-eqz v10, :cond_b

    move-wide v7, v12

    goto :goto_6

    :cond_b
    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_c
    :goto_6
    iput-wide v7, v9, Lab/b0;->g:J

    iput-boolean v5, v9, Lab/b0;->e:Z

    return v6

    :cond_d
    iget-wide v2, v9, Lab/b0;->g:J

    cmp-long v4, v2, v7

    if-nez v4, :cond_e

    invoke-virtual {v9, v1}, Lab/b0;->a(Lt9/o;)V

    return v6

    :cond_e
    invoke-virtual {v10, v2, v3}, Lx8/s;->b(J)J

    move-result-wide v2

    iget-wide v4, v9, Lab/b0;->h:J

    invoke-virtual {v10, v4, v5}, Lx8/s;->c(J)J

    move-result-wide v4

    sub-long/2addr v4, v2

    iput-wide v4, v9, Lab/b0;->i:J

    invoke-virtual {v9, v1}, Lab/b0;->a(Lt9/o;)V

    return v6

    :cond_f
    iget-boolean v3, v0, Lab/j0;->o:Z

    if-nez v3, :cond_11

    iput-boolean v5, v0, Lab/j0;->o:Z

    move v3, v6

    move-wide v10, v7

    iget-wide v6, v9, Lab/b0;->i:J

    cmp-long v8, v6, v10

    if-eqz v8, :cond_10

    move v8, v3

    new-instance v3, Lab/a0;

    iget-object v9, v9, Lab/b0;->b:Lx8/s;

    iget v10, v0, Lab/j0;->q:I

    move v11, v4

    new-instance v4, Lng3/o;

    const/16 v14, 0x1d

    const/4 v15, 0x0

    invoke-direct {v4, v14, v15}, Lng3/o;-><init>(IZ)V

    move v14, v5

    new-instance v5, Lab/h0;

    invoke-direct {v5, v10, v9}, Lab/h0;-><init>(ILx8/s;)V

    const-wide/16 v9, 0x1

    add-long/2addr v9, v6

    move/from16 v16, v14

    const-wide/16 v14, 0xbc

    move/from16 v19, v16

    const/16 v16, 0x3ac

    move/from16 v21, v8

    move-wide v8, v9

    move/from16 v20, v11

    const-wide/16 v10, 0x0

    move/from16 v1, v21

    invoke-direct/range {v3 .. v16}, Lt9/h;-><init>(Lt9/e;Lt9/g;JJJJJI)V

    iput-object v3, v0, Lab/j0;->k:Lab/a0;

    iget-object v4, v0, Lab/j0;->l:Lt9/q;

    iget-object v3, v3, Lt9/h;->c:Ljava/lang/Object;

    check-cast v3, Lt9/c;

    invoke-interface {v4, v3}, Lt9/q;->v(Lt9/e0;)V

    goto :goto_7

    :cond_10
    move v1, v3

    move/from16 v19, v5

    iget-object v3, v0, Lab/j0;->l:Lt9/q;

    new-instance v4, Lt9/t;

    invoke-direct {v4, v6, v7}, Lt9/t;-><init>(J)V

    invoke-interface {v3, v4}, Lt9/q;->v(Lt9/e0;)V

    goto :goto_7

    :cond_11
    move/from16 v19, v5

    move v1, v6

    :goto_7
    iget-boolean v3, v0, Lab/j0;->p:Z

    if-eqz v3, :cond_12

    iput-boolean v1, v0, Lab/j0;->p:Z

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v3, v4}, Lab/j0;->b(JJ)V

    invoke-interface/range {p1 .. p1}, Lt9/o;->getPosition()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-eqz v5, :cond_12

    iput-wide v3, v2, Lt9/s;->a:J

    return v19

    :cond_12
    iget-object v3, v0, Lab/j0;->k:Lab/a0;

    if-eqz v3, :cond_13

    iget-object v4, v3, Lt9/h;->e:Ljava/lang/Object;

    check-cast v4, Lt9/d;

    if-eqz v4, :cond_13

    move-object/from16 v4, p1

    invoke-virtual {v3, v4, v2}, Lt9/h;->a(Lt9/o;Lt9/s;)I

    move-result v1

    return v1

    :cond_13
    move-object/from16 v4, p1

    goto :goto_8

    :cond_14
    move-object v4, v1

    move/from16 v19, v5

    move v1, v6

    :goto_8
    iget-object v2, v0, Lab/j0;->c:Lx8/n;

    iget-object v3, v2, Lx8/n;->a:[B

    iget v5, v2, Lx8/n;->b:I

    rsub-int v5, v5, 0x24b8

    const/16 v6, 0xbc

    if-ge v5, v6, :cond_16

    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v5

    if-lez v5, :cond_15

    iget v7, v2, Lx8/n;->b:I

    invoke-static {v3, v7, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_15
    invoke-virtual {v2, v5, v3}, Lx8/n;->D(I[B)V

    :cond_16
    :goto_9
    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v5

    iget-object v7, v0, Lab/j0;->g:Landroid/util/SparseArray;

    if-ge v5, v6, :cond_1a

    iget v5, v2, Lx8/n;->c:I

    rsub-int v8, v5, 0x24b8

    invoke-interface {v4, v3, v5, v8}, Lu8/h;->read([BII)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_19

    move v6, v1

    :goto_a
    invoke-virtual {v7}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v6, v1, :cond_18

    invoke-virtual {v7, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lab/m0;

    instance-of v2, v1, Lab/z;

    if-eqz v2, :cond_17

    check-cast v1, Lab/z;

    iget v2, v1, Lab/z;->c:I

    const/4 v3, 0x3

    if-ne v2, v3, :cond_17

    iget v2, v1, Lab/z;->j:I

    if-ne v2, v9, :cond_17

    new-instance v2, Lx8/n;

    invoke-direct {v2}, Lx8/n;-><init>()V

    move/from16 v14, v19

    invoke-virtual {v1, v14, v2}, Lab/z;->b(ILx8/n;)V

    :cond_17
    add-int/lit8 v6, v6, 0x1

    const/16 v19, 0x1

    goto :goto_a

    :cond_18
    return v9

    :cond_19
    add-int/2addr v5, v8

    invoke-virtual {v2, v5}, Lx8/n;->E(I)V

    const/16 v19, 0x1

    goto :goto_9

    :cond_1a
    iget v3, v2, Lx8/n;->b:I

    iget v4, v2, Lx8/n;->c:I

    iget-object v5, v2, Lx8/n;->a:[B

    :goto_b
    if-ge v3, v4, :cond_1b

    aget-byte v8, v5, v3

    const/16 v11, 0x47

    if-eq v8, v11, :cond_1b

    add-int/lit8 v3, v3, 0x1

    goto :goto_b

    :cond_1b
    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    add-int/2addr v3, v6

    iget v4, v2, Lx8/n;->c:I

    if-le v3, v4, :cond_1c

    return v1

    :cond_1c
    invoke-virtual {v2}, Lx8/n;->g()I

    move-result v5

    const/high16 v6, 0x800000

    and-int/2addr v6, v5

    if-eqz v6, :cond_1d

    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    return v1

    :cond_1d
    const/high16 v6, 0x400000

    and-int/2addr v6, v5

    if-eqz v6, :cond_1e

    const/4 v6, 0x1

    goto :goto_c

    :cond_1e
    move v6, v1

    :goto_c
    const v8, 0x1fff00

    and-int/2addr v8, v5

    shr-int/lit8 v8, v8, 0x8

    and-int/lit8 v9, v5, 0x20

    if-eqz v9, :cond_1f

    const/4 v9, 0x1

    goto :goto_d

    :cond_1f
    move v9, v1

    :goto_d
    and-int/lit8 v10, v5, 0x10

    if-eqz v10, :cond_20

    invoke-virtual {v7, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lab/m0;

    goto :goto_e

    :cond_20
    const/4 v7, 0x0

    :goto_e
    if-nez v7, :cond_21

    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    return v1

    :cond_21
    and-int/lit8 v5, v5, 0xf

    add-int/lit8 v10, v5, -0x1

    iget-object v11, v0, Lab/j0;->d:Landroid/util/SparseIntArray;

    invoke-virtual {v11, v8, v10}, Landroid/util/SparseIntArray;->get(II)I

    move-result v10

    invoke-virtual {v11, v8, v5}, Landroid/util/SparseIntArray;->put(II)V

    if-ne v10, v5, :cond_22

    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    return v1

    :cond_22
    const/16 v19, 0x1

    add-int/lit8 v10, v10, 0x1

    and-int/lit8 v10, v10, 0xf

    if-eq v5, v10, :cond_23

    invoke-interface {v7}, Lab/m0;->a()V

    :cond_23
    if-eqz v9, :cond_25

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v5

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v9

    and-int/lit8 v9, v9, 0x40

    if-eqz v9, :cond_24

    const/4 v9, 0x2

    goto :goto_f

    :cond_24
    move v9, v1

    :goto_f
    or-int/2addr v6, v9

    const/16 v19, 0x1

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v2, v5}, Lx8/n;->G(I)V

    :cond_25
    iget-boolean v5, v0, Lab/j0;->n:Z

    if-nez v5, :cond_26

    iget-object v9, v0, Lab/j0;->i:Landroid/util/SparseBooleanArray;

    invoke-virtual {v9, v8, v1}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result v8

    if-nez v8, :cond_27

    :cond_26
    invoke-virtual {v2, v3}, Lx8/n;->E(I)V

    invoke-interface {v7, v6, v2}, Lab/m0;->b(ILx8/n;)V

    invoke-virtual {v2, v4}, Lx8/n;->E(I)V

    :cond_27
    if-nez v5, :cond_28

    iget-boolean v4, v0, Lab/j0;->n:Z

    if-eqz v4, :cond_28

    cmp-long v4, v12, v17

    if-eqz v4, :cond_28

    const/4 v14, 0x1

    iput-boolean v14, v0, Lab/j0;->p:Z

    :cond_28
    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    return v1
.end method

.method public final release()V
    .locals 0

    return-void
.end method
