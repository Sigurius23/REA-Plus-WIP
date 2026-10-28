.class public final Lab/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/n;


# instance fields
.field public final a:Lx8/s;

.field public final b:Landroid/util/SparseArray;

.field public final c:Lx8/n;

.field public final d:Lab/b0;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Lab/a0;

.field public j:Lt9/q;

.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lx8/s;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lx8/s;-><init>(J)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lab/d0;->a:Lx8/s;

    new-instance v0, Lx8/n;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lx8/n;-><init>(I)V

    iput-object v0, p0, Lab/d0;->c:Lx8/n;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lab/d0;->b:Landroid/util/SparseArray;

    new-instance v0, Lab/b0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lab/b0;-><init>(I)V

    iput-object v0, p0, Lab/d0;->d:Lab/b0;

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 7

    iget-object p1, p0, Lab/d0;->b:Landroid/util/SparseArray;

    iget-object p2, p0, Lab/d0;->a:Lx8/s;

    monitor-enter p2

    :try_start_0
    iget-wide v0, p2, Lx8/s;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p2}, Lx8/s;->d()J

    move-result-wide v5

    cmp-long v0, v5, v2

    if-eqz v0, :cond_1

    const-wide/16 v2, 0x0

    cmp-long v0, v5, v2

    if-eqz v0, :cond_1

    cmp-long v0, v5, p3

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    move v0, v1

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {p2, p3, p4}, Lx8/s;->e(J)V

    :cond_3
    iget-object p2, p0, Lab/d0;->i:Lab/a0;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p3, p4}, Lt9/h;->e(J)V

    :cond_4
    move p2, v4

    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p3

    if-ge p2, p3, :cond_5

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lab/c0;

    iput-boolean v4, p3, Lab/c0;->f:Z

    iget-object p3, p3, Lab/c0;->a:Lab/j;

    invoke-interface {p3}, Lab/j;->a()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g(Lt9/q;)V
    .locals 0

    iput-object p1, p0, Lab/d0;->j:Lt9/q;

    return-void
.end method

.method public final h(Lt9/o;)Z
    .locals 9

    const/16 v0, 0xe

    new-array v1, v0, [B

    check-cast p1, Lt9/k;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0, v2}, Lt9/k;->c([BIIZ)Z

    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v0, v5

    const/4 v5, 0x3

    aget-byte v7, v1, v5

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v0, v7

    const/16 v7, 0x1ba

    if-eq v7, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    aget-byte v7, v1, v0

    and-int/lit16 v7, v7, 0xc4

    const/16 v8, 0x44

    if-eq v7, v8, :cond_1

    goto :goto_0

    :cond_1
    const/4 v7, 0x6

    aget-byte v7, v1, v7

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_2

    goto :goto_0

    :cond_2
    aget-byte v7, v1, v6

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_3

    goto :goto_0

    :cond_3
    const/16 v0, 0x9

    aget-byte v0, v1, v0

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_4

    goto :goto_0

    :cond_4
    const/16 v0, 0xc

    aget-byte v0, v1, v0

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_5

    goto :goto_0

    :cond_5
    const/16 v0, 0xd

    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x7

    invoke-virtual {p1, v0, v2}, Lt9/k;->C(IZ)Z

    invoke-virtual {p1, v1, v2, v5, v2}, Lt9/k;->c([BIIZ)Z

    aget-byte p1, v1, v2

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr p1, v0

    aget-byte v0, v1, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    if-ne v3, p1, :cond_6

    return v3

    :cond_6
    :goto_0
    return v2
.end method

.method public final i(Lt9/o;Lt9/s;)I
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lab/d0;->j:Lt9/q;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v13

    const-wide/16 v18, -0x1

    cmp-long v3, v13, v18

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v7, 0x1ba

    iget-object v8, v0, Lab/d0;->d:Lab/b0;

    const/4 v9, 0x4

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_a

    iget-boolean v12, v8, Lab/b0;->d:Z

    if-nez v12, :cond_a

    iget-object v3, v8, Lab/b0;->b:Lx8/s;

    iget-object v12, v8, Lab/b0;->c:Lx8/n;

    iget-boolean v13, v8, Lab/b0;->f:Z

    const-wide/16 v14, 0x4e20

    if-nez v13, :cond_3

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    long-to-int v13, v13

    int-to-long v14, v13

    sub-long/2addr v3, v14

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v14

    cmp-long v14, v14, v3

    if-eqz v14, :cond_0

    iput-wide v3, v2, Lt9/s;->a:J

    return v10

    :cond_0
    invoke-virtual {v12, v13}, Lx8/n;->C(I)V

    invoke-interface {v1}, Lt9/o;->e()V

    iget-object v2, v12, Lx8/n;->a:[B

    invoke-interface {v1, v2, v11, v13}, Lt9/o;->p([BII)V

    iget v1, v12, Lx8/n;->b:I

    iget v2, v12, Lx8/n;->c:I

    sub-int/2addr v2, v9

    :goto_0
    if-lt v2, v1, :cond_2

    iget-object v3, v12, Lx8/n;->a:[B

    invoke-static {v2, v3}, Lab/b0;->b(I[B)I

    move-result v3

    if-ne v3, v7, :cond_1

    add-int/lit8 v3, v2, 0x4

    invoke-virtual {v12, v3}, Lx8/n;->F(I)V

    invoke-static {v12}, Lab/b0;->c(Lx8/n;)J

    move-result-wide v3

    cmp-long v9, v3, v5

    if-eqz v9, :cond_1

    move-wide v5, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput-wide v5, v8, Lab/b0;->h:J

    iput-boolean v10, v8, Lab/b0;->f:Z

    return v11

    :cond_3
    move-wide/from16 v20, v5

    const/16 v16, 0x3

    iget-wide v4, v8, Lab/b0;->h:J

    cmp-long v4, v4, v20

    if-nez v4, :cond_4

    invoke-virtual {v8, v1}, Lab/b0;->a(Lt9/o;)V

    return v11

    :cond_4
    iget-boolean v4, v8, Lab/b0;->e:Z

    if-nez v4, :cond_8

    invoke-interface {v1}, Lt9/o;->getLength()J

    move-result-wide v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v3, v3

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v4

    int-to-long v13, v11

    cmp-long v4, v4, v13

    if-eqz v4, :cond_5

    iput-wide v13, v2, Lt9/s;->a:J

    return v10

    :cond_5
    invoke-virtual {v12, v3}, Lx8/n;->C(I)V

    invoke-interface {v1}, Lt9/o;->e()V

    iget-object v2, v12, Lx8/n;->a:[B

    invoke-interface {v1, v2, v11, v3}, Lt9/o;->p([BII)V

    iget v1, v12, Lx8/n;->b:I

    iget v2, v12, Lx8/n;->c:I

    :goto_2
    add-int/lit8 v3, v2, -0x3

    if-ge v1, v3, :cond_7

    iget-object v3, v12, Lx8/n;->a:[B

    invoke-static {v1, v3}, Lab/b0;->b(I[B)I

    move-result v3

    if-ne v3, v7, :cond_6

    add-int/lit8 v3, v1, 0x4

    invoke-virtual {v12, v3}, Lx8/n;->F(I)V

    invoke-static {v12}, Lab/b0;->c(Lx8/n;)J

    move-result-wide v3

    cmp-long v5, v3, v20

    if-eqz v5, :cond_6

    move-wide v5, v3

    goto :goto_3

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    move-wide/from16 v5, v20

    :goto_3
    iput-wide v5, v8, Lab/b0;->g:J

    iput-boolean v10, v8, Lab/b0;->e:Z

    return v11

    :cond_8
    iget-wide v4, v8, Lab/b0;->g:J

    cmp-long v2, v4, v20

    if-nez v2, :cond_9

    invoke-virtual {v8, v1}, Lab/b0;->a(Lt9/o;)V

    return v11

    :cond_9
    invoke-virtual {v3, v4, v5}, Lx8/s;->b(J)J

    move-result-wide v4

    iget-wide v6, v8, Lab/b0;->h:J

    invoke-virtual {v3, v6, v7}, Lx8/s;->c(J)J

    move-result-wide v2

    sub-long/2addr v2, v4

    iput-wide v2, v8, Lab/b0;->i:J

    invoke-virtual {v8, v1}, Lab/b0;->a(Lt9/o;)V

    return v11

    :cond_a
    move-wide/from16 v20, v5

    const/16 v16, 0x3

    iget-boolean v4, v0, Lab/d0;->k:Z

    if-nez v4, :cond_c

    iput-boolean v10, v0, Lab/d0;->k:Z

    iget-wide v4, v8, Lab/b0;->i:J

    cmp-long v6, v4, v20

    if-eqz v6, :cond_b

    move-wide v5, v4

    new-instance v4, Lab/a0;

    iget-object v8, v8, Lab/b0;->b:Lx8/s;

    move-wide/from16 v20, v5

    new-instance v5, Lng3/o;

    const/16 v6, 0x1d

    const/4 v12, 0x0

    invoke-direct {v5, v6, v12}, Lng3/o;-><init>(IZ)V

    new-instance v6, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v6, v8}, Lio/sentry/internal/debugmeta/c;-><init>(Lx8/s;)V

    const-wide/16 v22, 0x1

    add-long v22, v20, v22

    move/from16 v8, v16

    const-wide/16 v15, 0xbc

    const/16 v17, 0x3e8

    move/from16 v24, v11

    const-wide/16 v11, 0x0

    move/from16 v25, v3

    move v3, v9

    move-wide/from16 v7, v20

    move-wide/from16 v9, v22

    invoke-direct/range {v4 .. v17}, Lt9/h;-><init>(Lt9/e;Lt9/g;JJJJJI)V

    iput-object v4, v0, Lab/d0;->i:Lab/a0;

    iget-object v5, v0, Lab/d0;->j:Lt9/q;

    iget-object v4, v4, Lt9/h;->c:Ljava/lang/Object;

    check-cast v4, Lt9/c;

    invoke-interface {v5, v4}, Lt9/q;->v(Lt9/e0;)V

    goto :goto_4

    :cond_b
    move/from16 v25, v3

    move-wide v5, v4

    move v3, v9

    iget-object v4, v0, Lab/d0;->j:Lt9/q;

    new-instance v7, Lt9/t;

    invoke-direct {v7, v5, v6}, Lt9/t;-><init>(J)V

    invoke-interface {v4, v7}, Lt9/q;->v(Lt9/e0;)V

    goto :goto_4

    :cond_c
    move/from16 v25, v3

    move v3, v9

    :goto_4
    iget-object v4, v0, Lab/d0;->i:Lab/a0;

    if-eqz v4, :cond_d

    iget-object v5, v4, Lt9/h;->e:Ljava/lang/Object;

    check-cast v5, Lt9/d;

    if-eqz v5, :cond_d

    invoke-virtual {v4, v1, v2}, Lt9/h;->a(Lt9/o;Lt9/s;)I

    move-result v1

    return v1

    :cond_d
    invoke-interface {v1}, Lt9/o;->e()V

    if-eqz v25, :cond_e

    invoke-interface {v1}, Lt9/o;->g()J

    move-result-wide v4

    sub-long/2addr v13, v4

    goto :goto_5

    :cond_e
    move-wide/from16 v13, v18

    :goto_5
    cmp-long v2, v13, v18

    if-eqz v2, :cond_f

    const-wide/16 v4, 0x4

    cmp-long v2, v13, v4

    if-gez v2, :cond_f

    goto :goto_6

    :cond_f
    iget-object v2, v0, Lab/d0;->c:Lx8/n;

    iget-object v4, v2, Lx8/n;->a:[B

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-interface {v1, v4, v6, v3, v5}, Lt9/o;->c([BIIZ)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_6

    :cond_10
    invoke-virtual {v2, v6}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->g()I

    move-result v4

    const/16 v7, 0x1b9

    if-ne v4, v7, :cond_11

    :goto_6
    const/4 v1, -0x1

    return v1

    :cond_11
    const/16 v7, 0x1ba

    if-ne v4, v7, :cond_12

    iget-object v3, v2, Lx8/n;->a:[B

    const/16 v4, 0xa

    invoke-interface {v1, v3, v6, v4}, Lt9/o;->p([BII)V

    const/16 v3, 0x9

    invoke-virtual {v2, v3}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v2

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0xe

    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    return v6

    :cond_12
    const/16 v7, 0x1bb

    const/4 v8, 0x2

    const/4 v9, 0x6

    if-ne v4, v7, :cond_13

    iget-object v3, v2, Lx8/n;->a:[B

    invoke-interface {v1, v3, v6, v8}, Lt9/o;->p([BII)V

    invoke-virtual {v2, v6}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->z()I

    move-result v2

    add-int/2addr v2, v9

    invoke-interface {v1, v2}, Lt9/o;->n(I)V

    return v6

    :cond_13
    and-int/lit16 v7, v4, -0x100

    const/16 v10, 0x8

    shr-int/2addr v7, v10

    if-eq v7, v5, :cond_14

    invoke-interface {v1, v5}, Lt9/o;->n(I)V

    return v6

    :cond_14
    and-int/lit16 v7, v4, 0xff

    iget-object v11, v0, Lab/d0;->b:Landroid/util/SparseArray;

    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lab/c0;

    iget-boolean v13, v0, Lab/d0;->e:Z

    if-nez v13, :cond_1a

    if-nez v12, :cond_18

    const/16 v13, 0xbd

    const-string v14, "video/mp2p"

    if-ne v7, v13, :cond_15

    new-instance v4, Lab/c;

    invoke-direct {v4, v14}, Lab/c;-><init>(Ljava/lang/String;)V

    iput-boolean v5, v0, Lab/d0;->f:Z

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v13

    iput-wide v13, v0, Lab/d0;->h:J

    goto :goto_7

    :cond_15
    and-int/lit16 v13, v4, 0xe0

    const/16 v15, 0xc0

    const/4 v3, 0x0

    if-ne v13, v15, :cond_16

    new-instance v4, Lab/v;

    invoke-direct {v4, v3, v6, v14}, Lab/v;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iput-boolean v5, v0, Lab/d0;->f:Z

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v13

    iput-wide v13, v0, Lab/d0;->h:J

    goto :goto_7

    :cond_16
    and-int/lit16 v4, v4, 0xf0

    const/16 v13, 0xe0

    if-ne v4, v13, :cond_17

    new-instance v4, Lab/l;

    invoke-direct {v4, v3, v14}, Lab/l;-><init>(Lxl/a;Ljava/lang/String;)V

    iput-boolean v5, v0, Lab/d0;->g:Z

    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v13

    iput-wide v13, v0, Lab/d0;->h:J

    goto :goto_7

    :cond_17
    move-object v4, v3

    :goto_7
    if-eqz v4, :cond_18

    new-instance v3, Lab/l0;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x100

    invoke-direct {v3, v7, v14, v12, v13}, Lab/l0;-><init>(IIIB)V

    iget-object v12, v0, Lab/d0;->j:Lt9/q;

    invoke-interface {v4, v12, v3}, Lab/j;->i(Lt9/q;Lab/l0;)V

    new-instance v12, Lab/c0;

    iget-object v3, v0, Lab/d0;->a:Lx8/s;

    invoke-direct {v12, v4, v3}, Lab/c0;-><init>(Lab/j;Lx8/s;)V

    invoke-virtual {v11, v7, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_18
    iget-boolean v3, v0, Lab/d0;->f:Z

    if-eqz v3, :cond_19

    iget-boolean v3, v0, Lab/d0;->g:Z

    if-eqz v3, :cond_19

    iget-wide v3, v0, Lab/d0;->h:J

    const-wide/16 v13, 0x2000

    add-long/2addr v3, v13

    goto :goto_8

    :cond_19
    const-wide/32 v3, 0x100000

    :goto_8
    invoke-interface {v1}, Lt9/o;->getPosition()J

    move-result-wide v13

    cmp-long v3, v13, v3

    if-lez v3, :cond_1a

    iput-boolean v5, v0, Lab/d0;->e:Z

    iget-object v3, v0, Lab/d0;->j:Lt9/q;

    invoke-interface {v3}, Lt9/q;->l()V

    :cond_1a
    iget-object v3, v2, Lx8/n;->a:[B

    invoke-interface {v1, v3, v6, v8}, Lt9/o;->p([BII)V

    invoke-virtual {v2, v6}, Lx8/n;->F(I)V

    invoke-virtual {v2}, Lx8/n;->z()I

    move-result v3

    add-int/2addr v3, v9

    if-nez v12, :cond_1b

    invoke-interface {v1, v3}, Lt9/o;->n(I)V

    return v6

    :cond_1b
    invoke-virtual {v2, v3}, Lx8/n;->C(I)V

    iget-object v4, v2, Lx8/n;->a:[B

    invoke-interface {v1, v4, v6, v3}, Lt9/o;->readFully([BII)V

    invoke-virtual {v2, v9}, Lx8/n;->F(I)V

    iget-object v1, v12, Lab/c0;->a:Lab/j;

    iget-object v3, v12, Lab/c0;->c:Llo/s;

    iget-object v4, v3, Llo/s;->b:[B

    const/4 v8, 0x3

    invoke-virtual {v2, v4, v6, v8}, Lx8/n;->e([BII)V

    invoke-virtual {v3, v6}, Llo/s;->q(I)V

    invoke-virtual {v3, v10}, Llo/s;->t(I)V

    invoke-virtual {v3}, Llo/s;->h()Z

    move-result v4

    iput-boolean v4, v12, Lab/c0;->d:Z

    invoke-virtual {v3}, Llo/s;->h()Z

    move-result v4

    iput-boolean v4, v12, Lab/c0;->e:Z

    invoke-virtual {v3, v9}, Llo/s;->t(I)V

    invoke-virtual {v3, v10}, Llo/s;->i(I)I

    move-result v4

    iget-object v7, v3, Llo/s;->b:[B

    invoke-virtual {v2, v7, v6, v4}, Lx8/n;->e([BII)V

    invoke-virtual {v3, v6}, Llo/s;->q(I)V

    iget-object v4, v12, Lab/c0;->b:Lx8/s;

    const-wide/16 v7, 0x0

    iput-wide v7, v12, Lab/c0;->g:J

    iget-boolean v7, v12, Lab/c0;->d:Z

    if-eqz v7, :cond_1d

    const/4 v7, 0x4

    invoke-virtual {v3, v7}, Llo/s;->t(I)V

    const/4 v8, 0x3

    invoke-virtual {v3, v8}, Llo/s;->i(I)I

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x1e

    shl-long/2addr v7, v9

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    const/16 v10, 0xf

    invoke-virtual {v3, v10}, Llo/s;->i(I)I

    move-result v11

    shl-int/2addr v11, v10

    int-to-long v13, v11

    or-long/2addr v7, v13

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    invoke-virtual {v3, v10}, Llo/s;->i(I)I

    move-result v11

    int-to-long v13, v11

    or-long/2addr v7, v13

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    iget-boolean v11, v12, Lab/c0;->f:Z

    if-nez v11, :cond_1c

    iget-boolean v11, v12, Lab/c0;->e:Z

    if-eqz v11, :cond_1c

    const/4 v11, 0x4

    invoke-virtual {v3, v11}, Llo/s;->t(I)V

    const/4 v11, 0x3

    invoke-virtual {v3, v11}, Llo/s;->i(I)I

    move-result v11

    int-to-long v13, v11

    shl-long/2addr v13, v9

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    invoke-virtual {v3, v10}, Llo/s;->i(I)I

    move-result v9

    shl-int/2addr v9, v10

    move-wide/from16 p1, v7

    int-to-long v6, v9

    or-long/2addr v6, v13

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    invoke-virtual {v3, v10}, Llo/s;->i(I)I

    move-result v8

    int-to-long v8, v8

    or-long/2addr v6, v8

    invoke-virtual {v3, v5}, Llo/s;->t(I)V

    invoke-virtual {v4, v6, v7}, Lx8/s;->b(J)J

    iput-boolean v5, v12, Lab/c0;->f:Z

    move-wide/from16 v5, p1

    goto :goto_9

    :cond_1c
    move-wide v5, v7

    :goto_9
    invoke-virtual {v4, v5, v6}, Lx8/s;->b(J)J

    move-result-wide v3

    iput-wide v3, v12, Lab/c0;->g:J

    :cond_1d
    iget-wide v3, v12, Lab/c0;->g:J

    const/4 v7, 0x4

    invoke-interface {v1, v7, v3, v4}, Lab/j;->d(IJ)V

    invoke-interface {v1, v2}, Lab/j;->c(Lx8/n;)V

    const/4 v6, 0x0

    invoke-interface {v1, v6}, Lab/j;->e(Z)V

    iget-object v1, v2, Lx8/n;->a:[B

    array-length v1, v1

    invoke-virtual {v2, v1}, Lx8/n;->E(I)V

    return v6
.end method

.method public final release()V
    .locals 0

    return-void
.end method
