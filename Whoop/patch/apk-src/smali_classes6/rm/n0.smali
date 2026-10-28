.class public final Lrm/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:[Lsn/r0;

.field public d:Z

.field public e:Z

.field public f:Lrm/o0;

.field public g:Z

.field public final h:[Z

.field public final i:[Lrm/d;

.field public final j:Lio/r;

.field public final k:Lb9/b1;

.field public l:Lrm/n0;

.field public m:Lsn/x0;

.field public n:Lio/x;

.field public o:J


# direct methods
.method public constructor <init>([Lrm/d;JLio/r;Lko/o;Lb9/b1;Lrm/o0;Lio/x;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/n0;->i:[Lrm/d;

    iput-wide p2, p0, Lrm/n0;->o:J

    iput-object p4, p0, Lrm/n0;->j:Lio/r;

    iput-object p6, p0, Lrm/n0;->k:Lb9/b1;

    iget-object p2, p7, Lrm/o0;->a:Lsn/v;

    iget-object p3, p2, Lsn/t;->a:Ljava/lang/Object;

    iput-object p3, p0, Lrm/n0;->b:Ljava/lang/Object;

    iput-object p7, p0, Lrm/n0;->f:Lrm/o0;

    sget-object p3, Lsn/x0;->z:Lsn/x0;

    iput-object p3, p0, Lrm/n0;->m:Lsn/x0;

    iput-object p8, p0, Lrm/n0;->n:Lio/x;

    array-length p3, p1

    new-array p3, p3, [Lsn/r0;

    iput-object p3, p0, Lrm/n0;->c:[Lsn/r0;

    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lrm/n0;->h:[Z

    iget-wide p3, p7, Lrm/o0;->b:J

    iget-wide v5, p7, Lrm/o0;->d:J

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p2, Lsn/t;->a:Ljava/lang/Object;

    check-cast p1, Landroid/util/Pair;

    iget-object p7, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    invoke-virtual {p2, p1}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object p1

    iget-object p2, p6, Lb9/b1;->d:Ljava/util/HashMap;

    invoke-virtual {p2, p7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lrm/t0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p7, p6, Lb9/b1;->f:Ljava/util/HashSet;

    invoke-virtual {p7, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object p7, p6, Lb9/b1;->e:Ljava/util/HashMap;

    invoke-virtual {p7, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lrm/s0;

    if-eqz p7, :cond_0

    iget-object p8, p7, Lrm/s0;->a:Lsn/a;

    iget-object p7, p7, Lrm/s0;->b:Lrm/r0;

    invoke-virtual {p8, p7}, Lsn/a;->d(Lsn/w;)V

    :cond_0
    iget-object p7, p2, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {p7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p7, p2, Lrm/t0;->a:Lsn/q;

    invoke-virtual {p7, p1, p5, p3, p4}, Lsn/q;->s(Lsn/v;Lko/o;J)Lsn/n;

    move-result-object v1

    iget-object p1, p6, Lb9/b1;->c:Ljava/util/IdentityHashMap;

    invoke-virtual {p1, v1, p2}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p6}, Lb9/b1;->e()V

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v5, p1

    if-eqz p1, :cond_1

    new-instance v0, Lsn/c;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lsn/c;-><init>(Lsn/s;ZJJ)V

    move-object v1, v0

    :cond_1
    iput-object v1, p0, Lrm/n0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lio/x;JZ[Z)J
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget v4, v1, Lio/x;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    if-nez p4, :cond_0

    iget-object v4, v0, Lrm/n0;->n:Lio/x;

    invoke-virtual {v1, v4, v3}, Lio/x;->a(Lio/x;I)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    iget-object v4, v0, Lrm/n0;->h:[Z

    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move v3, v2

    :goto_2
    iget-object v4, v0, Lrm/n0;->i:[Lrm/d;

    array-length v6, v4

    const/4 v7, -0x2

    iget-object v8, v0, Lrm/n0;->c:[Lsn/r0;

    if-ge v3, v6, :cond_3

    aget-object v4, v4, v3

    iget v4, v4, Lrm/d;->w:I

    if-ne v4, v7, :cond_2

    const/4 v4, 0x0

    aput-object v4, v8, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v0}, Lrm/n0;->b()V

    iput-object v1, v0, Lrm/n0;->n:Lio/x;

    invoke-virtual {v0}, Lrm/n0;->c()V

    iget-object v10, v1, Lio/x;->c:[Lio/o;

    iget-object v11, v0, Lrm/n0;->h:[Z

    iget-object v12, v0, Lrm/n0;->c:[Lsn/r0;

    iget-object v9, v0, Lrm/n0;->a:Ljava/lang/Object;

    move-wide/from16 v14, p2

    move-object/from16 v13, p5

    invoke-interface/range {v9 .. v15}, Lsn/s;->j([Lio/o;[Z[Lsn/r0;[ZJ)J

    move-result-wide v9

    move v3, v2

    :goto_3
    array-length v6, v4

    if-ge v3, v6, :cond_5

    aget-object v6, v4, v3

    iget v6, v6, Lrm/d;->w:I

    if-ne v6, v7, :cond_4

    iget-object v6, v0, Lrm/n0;->n:Lio/x;

    invoke-virtual {v6, v3}, Lio/x;->b(I)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v6, Lng3/o;

    const/16 v11, 0x19

    const/4 v12, 0x0

    invoke-direct {v6, v11, v12}, Lng3/o;-><init>(IZ)V

    aput-object v6, v8, v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_5
    iput-boolean v2, v0, Lrm/n0;->e:Z

    move v3, v2

    :goto_4
    array-length v6, v8

    if-ge v3, v6, :cond_9

    aget-object v6, v8, v3

    if-eqz v6, :cond_6

    invoke-virtual {v1, v3}, Lio/x;->b(I)Z

    move-result v6

    invoke-static {v6}, Llo/a;->i(Z)V

    aget-object v6, v4, v3

    iget v6, v6, Lrm/d;->w:I

    if-eq v6, v7, :cond_8

    iput-boolean v5, v0, Lrm/n0;->e:Z

    goto :goto_6

    :cond_6
    iget-object v6, v1, Lio/x;->c:[Lio/o;

    aget-object v6, v6, v3

    if-nez v6, :cond_7

    move v6, v5

    goto :goto_5

    :cond_7
    move v6, v2

    :goto_5
    invoke-static {v6}, Llo/a;->i(Z)V

    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    return-wide v9
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lrm/n0;->l:Lrm/n0;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lrm/n0;->n:Lio/x;

    iget v2, v1, Lio/x;->a:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lio/x;->b(I)Z

    move-result v1

    iget-object v2, p0, Lrm/n0;->n:Lio/x;

    iget-object v2, v2, Lio/x;->c:[Lio/o;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lio/o;->a()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lrm/n0;->l:Lrm/n0;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lrm/n0;->n:Lio/x;

    iget v2, v1, Lio/x;->a:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lio/x;->b(I)Z

    move-result v1

    iget-object v2, p0, Lrm/n0;->n:Lio/x;

    iget-object v2, v2, Lio/x;->c:[Lio/o;

    aget-object v2, v2, v0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lio/o;->b()V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d()J
    .locals 5

    iget-boolean v0, p0, Lrm/n0;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lrm/n0;->f:Lrm/o0;

    iget-wide v0, v0, Lrm/o0;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lrm/n0;->e:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrm/n0;->a:Ljava/lang/Object;

    invoke-interface {v0}, Lsn/t0;->m()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lrm/n0;->f:Lrm/o0;

    iget-wide v0, v0, Lrm/o0;->e:J

    return-wide v0

    :cond_2
    return-wide v3
.end method

.method public final e()J
    .locals 4

    iget-object v0, p0, Lrm/n0;->f:Lrm/o0;

    iget-wide v0, v0, Lrm/o0;->b:J

    iget-wide v2, p0, Lrm/n0;->o:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final f()V
    .locals 3

    invoke-virtual {p0}, Lrm/n0;->b()V

    iget-object v0, p0, Lrm/n0;->a:Ljava/lang/Object;

    :try_start_0
    instance-of v1, v0, Lsn/c;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, p0, Lrm/n0;->k:Lb9/b1;

    if-eqz v1, :cond_0

    :try_start_1
    check-cast v0, Lsn/c;

    iget-object v0, v0, Lsn/c;->w:Lsn/s;

    invoke-virtual {v2, v0}, Lb9/b1;->k(Lsn/s;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lb9/b1;->k(Lsn/s;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :goto_0
    const-string v1, "MediaPeriodHolder"

    const-string v2, "Period release failed."

    invoke-static {v1, v2, v0}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(FLrm/o1;)Lio/x;
    .locals 36

    move-object/from16 v0, p0

    iget-object v1, v0, Lrm/n0;->m:Lsn/x0;

    iget-object v2, v0, Lrm/n0;->j:Lio/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v0, Lrm/n0;->i:[Lrm/d;

    array-length v4, v3

    const/4 v5, 0x1

    add-int/2addr v4, v5

    new-array v4, v4, [I

    array-length v6, v3

    add-int/2addr v6, v5

    new-array v7, v6, [[Lsn/w0;

    array-length v8, v3

    add-int/2addr v8, v5

    new-array v8, v8, [[[I

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    if-ge v10, v6, :cond_0

    iget v11, v1, Lsn/x0;->w:I

    new-array v12, v11, [Lsn/w0;

    aput-object v12, v7, v10

    new-array v11, v11, [[I

    aput-object v11, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    array-length v6, v3

    new-array v10, v6, [I

    move v11, v9

    :goto_1
    if-ge v11, v6, :cond_1

    aget-object v12, v3, v11

    invoke-virtual {v12}, Lrm/d;->y()I

    move-result v12

    aput v12, v10, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    move v6, v9

    :goto_2
    iget v11, v1, Lsn/x0;->w:I

    if-ge v6, v11, :cond_a

    invoke-virtual {v1, v6}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v11

    iget-object v12, v11, Lsn/w0;->y:[Lrm/c0;

    iget v13, v11, Lsn/w0;->w:I

    aget-object v14, v12, v9

    iget-object v14, v14, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v14}, Llo/m;->g(Ljava/lang/String;)I

    move-result v14

    const/4 v15, 0x5

    if-ne v14, v15, :cond_2

    move v14, v5

    goto :goto_3

    :cond_2
    move v14, v9

    :goto_3
    array-length v15, v3

    move/from16 v16, v5

    move/from16 v17, v16

    move/from16 p2, v9

    move/from16 v5, p2

    :goto_4
    array-length v0, v3

    if-ge v9, v0, :cond_7

    aget-object v0, v3, v9

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move/from16 v1, p2

    move v2, v1

    :goto_5
    if-ge v1, v13, :cond_3

    move/from16 v20, v1

    aget-object v1, v12, v20

    invoke-virtual {v0, v1}, Lrm/d;->x(Lrm/c0;)I

    move-result v1

    and-int/lit8 v1, v1, 0x7

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/lit8 v1, v20, 0x1

    goto :goto_5

    :cond_3
    aget v0, v4, v9

    if-nez v0, :cond_4

    move/from16 v0, v16

    goto :goto_6

    :cond_4
    move/from16 v0, p2

    :goto_6
    if-gt v2, v5, :cond_5

    if-ne v2, v5, :cond_6

    if-eqz v14, :cond_6

    if-nez v17, :cond_6

    if-eqz v0, :cond_6

    :cond_5
    move/from16 v17, v0

    move v5, v2

    move v15, v9

    :cond_6
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    goto :goto_4

    :cond_7
    move-object/from16 v18, v1

    move-object/from16 v19, v2

    array-length v0, v3

    if-ne v15, v0, :cond_8

    new-array v0, v13, [I

    goto :goto_8

    :cond_8
    aget-object v0, v3, v15

    new-array v1, v13, [I

    move/from16 v2, p2

    :goto_7
    if-ge v2, v13, :cond_9

    aget-object v5, v12, v2

    invoke-virtual {v0, v5}, Lrm/d;->x(Lrm/c0;)I

    move-result v5

    aput v5, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_9
    move-object v0, v1

    :goto_8
    aget v1, v4, v15

    aget-object v2, v7, v15

    aput-object v11, v2, v1

    aget-object v2, v8, v15

    aput-object v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    aput v1, v4, v15

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v0, p0

    move/from16 v9, p2

    move/from16 v5, v16

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    goto/16 :goto_2

    :cond_a
    move-object/from16 v19, v2

    move/from16 v16, v5

    move/from16 p2, v9

    array-length v0, v3

    new-array v0, v0, [Lsn/x0;

    array-length v1, v3

    new-array v1, v1, [Ljava/lang/String;

    array-length v2, v3

    new-array v2, v2, [I

    move/from16 v5, p2

    :goto_9
    array-length v6, v3

    if-ge v5, v6, :cond_b

    aget v6, v4, v5

    new-instance v9, Lsn/x0;

    aget-object v11, v7, v5

    invoke-static {v6, v11}, Llo/y;->B(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Lsn/w0;

    invoke-direct {v9, v11}, Lsn/x0;-><init>([Lsn/w0;)V

    aput-object v9, v0, v5

    aget-object v9, v8, v5

    invoke-static {v6, v9}, Llo/y;->B(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [[I

    aput-object v6, v8, v5

    aget-object v6, v3, v5

    invoke-virtual {v6}, Lrm/d;->h()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v1, v5

    aget-object v6, v3, v5

    iget v6, v6, Lrm/d;->w:I

    aput v6, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_b
    array-length v1, v3

    aget v1, v4, v1

    new-instance v4, Lsn/x0;

    array-length v3, v3

    aget-object v3, v7, v3

    invoke-static {v1, v3}, Llo/y;->B(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lsn/w0;

    invoke-direct {v4, v1}, Lsn/x0;-><init>([Lsn/w0;)V

    new-instance v1, Lio/q;

    invoke-direct {v1, v2, v0, v8, v4}, Lio/q;-><init>([I[Lsn/x0;[[[ILsn/x0;)V

    move-object/from16 v3, v19

    check-cast v3, Lio/m;

    iget-object v5, v3, Lio/m;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/f;

    iget v6, v1, Lio/q;->a:I

    new-array v7, v6, [Lio/n;

    new-instance v9, Lc9/c;

    const/4 v11, 0x3

    invoke-direct {v9, v11, v5, v10}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v10, Ldb/k0;

    const/16 v11, 0xa

    invoke-direct {v10, v11}, Ldb/k0;-><init>(I)V

    const/4 v11, 0x2

    invoke-static {v11, v1, v8, v9, v10}, Lio/m;->e(ILio/q;[[[ILio/j;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v9

    if-eqz v9, :cond_c

    iget-object v10, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lio/n;

    aput-object v9, v7, v10

    :cond_c
    move/from16 v9, p2

    :goto_a
    if-ge v9, v6, :cond_e

    aget v10, v2, v9

    if-ne v11, v10, :cond_d

    aget-object v10, v0, v9

    iget v10, v10, Lsn/x0;->w:I

    if-lez v10, :cond_d

    move/from16 v9, v16

    goto :goto_b

    :cond_d
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_e
    move/from16 v9, p2

    :goto_b
    new-instance v10, Lea2/v;

    const/4 v12, 0x1

    invoke-direct {v10, v5, v9, v12}, Lea2/v;-><init>(Ljava/lang/Object;ZI)V

    new-instance v9, Ldb/k0;

    const/16 v12, 0xb

    invoke-direct {v9, v12}, Ldb/k0;-><init>(I)V

    move/from16 v12, v16

    invoke-static {v12, v1, v8, v10, v9}, Lio/m;->e(ILio/q;[[[ILio/j;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v9

    if-eqz v9, :cond_f

    iget-object v10, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v12, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Lio/n;

    aput-object v12, v7, v10

    :cond_f
    if-nez v9, :cond_10

    const/4 v9, 0x0

    goto :goto_c

    :cond_10
    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lio/n;

    iget-object v12, v9, Lio/n;->a:Lsn/w0;

    iget-object v9, v9, Lio/n;->b:[I

    aget v9, v9, p2

    iget-object v12, v12, Lsn/w0;->y:[Lrm/c0;

    aget-object v9, v12, v9

    iget-object v9, v9, Lrm/c0;->y:Ljava/lang/String;

    :goto_c
    new-instance v12, Lc9/c;

    const/4 v13, 0x4

    invoke-direct {v12, v13, v5, v9}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v9, Ldb/k0;

    const/16 v13, 0xc

    invoke-direct {v9, v13}, Ldb/k0;-><init>(I)V

    const/4 v13, 0x3

    invoke-static {v13, v1, v8, v12, v9}, Lio/m;->e(ILio/q;[[[ILio/j;Ljava/util/Comparator;)Landroid/util/Pair;

    move-result-object v9

    if-eqz v9, :cond_11

    iget-object v12, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v9, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v9, Lio/n;

    aput-object v9, v7, v12

    :cond_11
    move/from16 v9, p2

    :goto_d
    if-ge v9, v6, :cond_19

    aget v12, v2, v9

    if-eq v12, v11, :cond_18

    const/4 v14, 0x1

    if-eq v12, v14, :cond_18

    if-eq v12, v13, :cond_18

    aget-object v12, v0, v9

    aget-object v14, v8, v9

    move/from16 v15, p2

    move/from16 v17, v15

    const/4 v10, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_e
    iget v13, v12, Lsn/x0;->w:I

    if-ge v15, v13, :cond_16

    invoke-virtual {v12, v15}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v13

    aget-object v21, v14, v15

    move-object/from16 v22, v0

    move-object/from16 v11, v19

    move/from16 v19, v17

    move-object/from16 v17, v10

    move/from16 v10, p2

    :goto_f
    iget v0, v13, Lsn/w0;->w:I

    if-ge v10, v0, :cond_15

    aget v0, v21, v10

    move-object/from16 v23, v2

    iget-boolean v2, v5, Lio/f;->j0:Z

    invoke-static {v0, v2}, Lio/m;->b(IZ)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, v13, Lsn/w0;->y:[Lrm/c0;

    aget-object v0, v0, v10

    new-instance v2, Lio/e;

    move-object/from16 v24, v8

    aget v8, v21, v10

    invoke-direct {v2, v0, v8}, Lio/e;-><init>(Lrm/c0;I)V

    if-eqz v11, :cond_12

    iget-boolean v0, v2, Lio/e;->x:Z

    iget-boolean v8, v11, Lio/e;->x:Z

    move/from16 v25, v9

    sget-object v9, Lzr/y;->a:Lzr/w;

    invoke-virtual {v9, v0, v8}, Lzr/w;->c(ZZ)Lzr/y;

    move-result-object v0

    iget-boolean v8, v2, Lio/e;->w:Z

    iget-boolean v9, v11, Lio/e;->w:Z

    invoke-virtual {v0, v8, v9}, Lzr/y;->c(ZZ)Lzr/y;

    move-result-object v0

    invoke-virtual {v0}, Lzr/y;->e()I

    move-result v0

    if-lez v0, :cond_14

    goto :goto_10

    :cond_12
    move/from16 v25, v9

    :goto_10
    move-object v11, v2

    move/from16 v19, v10

    move-object/from16 v17, v13

    goto :goto_11

    :cond_13
    move-object/from16 v24, v8

    move/from16 v25, v9

    :cond_14
    :goto_11
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v23

    move-object/from16 v8, v24

    move/from16 v9, v25

    goto :goto_f

    :cond_15
    move-object/from16 v23, v2

    move-object/from16 v24, v8

    move/from16 v25, v9

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v10, v17

    move/from16 v17, v19

    move-object/from16 v0, v22

    move-object/from16 v19, v11

    const/4 v11, 0x2

    goto :goto_e

    :cond_16
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    move-object/from16 v24, v8

    move/from16 v25, v9

    if-nez v10, :cond_17

    move-object/from16 v0, v18

    goto :goto_12

    :cond_17
    new-instance v0, Lio/n;

    filled-new-array/range {v17 .. v17}, [I

    move-result-object v2

    move/from16 v8, p2

    invoke-direct {v0, v8, v10, v2}, Lio/n;-><init>(ILsn/w0;[I)V

    :goto_12
    aput-object v0, v7, v25

    goto :goto_13

    :cond_18
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    move-object/from16 v24, v8

    move/from16 v25, v9

    const/16 v18, 0x0

    :goto_13
    add-int/lit8 v9, v25, 0x1

    move-object/from16 v0, v22

    move-object/from16 v2, v23

    move-object/from16 v8, v24

    const/16 p2, 0x0

    const/4 v11, 0x2

    const/4 v13, 0x3

    goto/16 :goto_d

    :cond_19
    move-object/from16 v22, v0

    move-object/from16 v23, v2

    move-object/from16 v24, v8

    const/16 v18, 0x0

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    const/4 v2, 0x0

    :goto_14
    if-ge v2, v6, :cond_1b

    aget-object v8, v22, v2

    const/4 v9, 0x0

    :goto_15
    iget v10, v8, Lsn/x0;->w:I

    if-ge v9, v10, :cond_1a

    iget-object v10, v5, Lio/w;->X:Lio/u;

    invoke-virtual {v8, v9}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v11

    iget-object v10, v10, Lio/u;->w:Lzr/b1;

    invoke-virtual {v10, v11}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/t;

    invoke-static {v0, v10, v2}, Lio/m;->c(Landroid/util/SparseArray;Lio/t;I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_1a
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_1b
    const/4 v2, 0x0

    :goto_16
    const/4 v8, -0x1

    iget v9, v4, Lsn/x0;->w:I

    if-ge v2, v9, :cond_1c

    iget-object v9, v5, Lio/w;->X:Lio/u;

    invoke-virtual {v4, v2}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v10

    iget-object v9, v9, Lio/u;->w:Lzr/b1;

    invoke-virtual {v9, v10}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/t;

    invoke-static {v0, v9, v8}, Lio/m;->c(Landroid/util/SparseArray;Lio/t;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_1c
    const/4 v2, 0x0

    :goto_17
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v10

    if-ge v2, v10, :cond_20

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v11

    iget-object v12, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Lio/t;

    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    const/4 v13, 0x0

    :goto_18
    if-ge v13, v6, :cond_1f

    if-ne v10, v13, :cond_1d

    new-instance v14, Lio/n;

    iget-object v15, v12, Lio/t;->w:Lsn/w0;

    iget-object v8, v12, Lio/t;->x:Lzr/g0;

    invoke-static {v8}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object v8

    move-object/from16 v19, v0

    const/4 v0, 0x0

    invoke-direct {v14, v0, v15, v8}, Lio/n;-><init>(ILsn/w0;[I)V

    aput-object v14, v7, v13

    goto :goto_19

    :cond_1d
    move-object/from16 v19, v0

    aget v0, v23, v13

    if-ne v0, v11, :cond_1e

    aput-object v18, v7, v13

    :cond_1e
    :goto_19
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v19

    const/4 v8, -0x1

    goto :goto_18

    :cond_1f
    move-object/from16 v19, v0

    add-int/lit8 v2, v2, 0x1

    const/4 v8, -0x1

    goto :goto_17

    :cond_20
    const/4 v8, 0x0

    :goto_1a
    if-ge v8, v6, :cond_23

    aget-object v0, v22, v8

    iget-object v2, v5, Lio/f;->m0:Landroid/util/SparseArray;

    invoke-virtual {v2, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_22

    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_22

    aget-object v0, v22, v8

    iget-object v2, v5, Lio/f;->m0:Landroid/util/SparseArray;

    invoke-virtual {v2, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_21

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/h;

    :cond_21
    aput-object v18, v7, v8

    :cond_22
    add-int/lit8 v8, v8, 0x1

    goto :goto_1a

    :cond_23
    const/4 v8, 0x0

    :goto_1b
    if-ge v8, v6, :cond_26

    aget v0, v23, v8

    iget-object v2, v5, Lio/f;->n0:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2, v8}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v2

    if-nez v2, :cond_24

    iget-object v2, v5, Lio/w;->Y:Lzr/j0;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_25

    :cond_24
    aput-object v18, v7, v8

    :cond_25
    add-int/lit8 v8, v8, 0x1

    goto :goto_1b

    :cond_26
    iget-object v0, v3, Lio/m;->c:Lg73/d;

    iget-object v2, v3, Lio/r;->b:Lko/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    move v8, v3

    :goto_1c
    array-length v10, v7

    const-wide/16 v11, 0x0

    const/4 v13, 0x1

    if-ge v8, v10, :cond_28

    aget-object v10, v7, v8

    if-eqz v10, :cond_27

    iget-object v10, v10, Lio/n;->b:[I

    array-length v10, v10

    if-le v10, v13, :cond_27

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v10

    new-instance v13, Lio/a;

    invoke-direct {v13, v11, v12, v11, v12}, Lio/a;-><init>(JJ)V

    invoke-virtual {v10, v13}, Lzr/a0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_27
    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1d
    add-int/lit8 v8, v8, 0x1

    goto :goto_1c

    :cond_28
    array-length v8, v7

    new-array v10, v8, [[J

    move v14, v3

    :goto_1e
    array-length v15, v7

    if-ge v14, v15, :cond_2b

    aget-object v15, v7, v14

    if-nez v15, :cond_29

    new-array v15, v3, [J

    aput-object v15, v10, v14

    move-object/from16 v28, v2

    move/from16 v19, v3

    goto :goto_20

    :cond_29
    move/from16 v19, v3

    iget-object v3, v15, Lio/n;->b:[I

    array-length v11, v3

    new-array v11, v11, [J

    aput-object v11, v10, v14

    move/from16 v11, v19

    :goto_1f
    array-length v12, v3

    if-ge v11, v12, :cond_2a

    aget-object v12, v10, v14

    iget-object v13, v15, Lio/n;->a:Lsn/w0;

    aget v26, v3, v11

    iget-object v13, v13, Lsn/w0;->y:[Lrm/c0;

    aget-object v13, v13, v26

    iget v13, v13, Lrm/c0;->H:I

    move-object/from16 v28, v2

    move-object/from16 v26, v3

    int-to-long v2, v13

    aput-wide v2, v12, v11

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v3, v26

    move-object/from16 v2, v28

    const/4 v13, 0x1

    goto :goto_1f

    :cond_2a
    move-object/from16 v28, v2

    aget-object v2, v10, v14

    invoke-static {v2}, Ljava/util/Arrays;->sort([J)V

    :goto_20
    add-int/lit8 v14, v14, 0x1

    move/from16 v3, v19

    move-object/from16 v2, v28

    const-wide/16 v11, 0x0

    const/4 v13, 0x1

    goto :goto_1e

    :cond_2b
    move-object/from16 v28, v2

    move/from16 v19, v3

    new-array v2, v8, [I

    new-array v3, v8, [J

    move/from16 v11, v19

    :goto_21
    if-ge v11, v8, :cond_2d

    aget-object v12, v10, v11

    array-length v13, v12

    if-nez v13, :cond_2c

    const-wide/16 v12, 0x0

    goto :goto_22

    :cond_2c
    aget-wide v12, v12, v19

    :goto_22
    aput-wide v12, v3, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_21

    :cond_2d
    invoke-static {v0, v3}, Lio/b;->u(Ljava/util/ArrayList;[J)V

    const/4 v11, 0x2

    const-string v12, "expectedValuesPerKey"

    invoke-static {v11, v12}, Lzr/q;->c(ILjava/lang/String;)V

    new-instance v11, Ljava/util/TreeMap;

    sget-object v12, Lzr/u0;->x:Lzr/u0;

    invoke-direct {v11, v12}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    new-instance v12, Lzr/r0;

    invoke-direct {v12}, Lzr/r0;-><init>()V

    new-instance v13, Lzr/s0;

    invoke-direct {v13, v11}, Lzr/s0;-><init>(Ljava/util/Map;)V

    iput-object v12, v13, Lzr/s0;->F:Lzr/r0;

    move/from16 v11, v19

    :goto_23
    if-ge v11, v8, :cond_33

    aget-object v12, v10, v11

    array-length v14, v12

    const/4 v15, 0x1

    if-gt v14, v15, :cond_2e

    move-object/from16 v20, v2

    move/from16 v21, v8

    move-object v8, v10

    move/from16 v29, v11

    goto/16 :goto_28

    :cond_2e
    array-length v12, v12

    new-array v14, v12, [D

    move-object/from16 v20, v2

    move/from16 v15, v19

    :goto_24
    aget-object v2, v10, v11

    move/from16 v21, v8

    array-length v8, v2

    const-wide/16 v26, 0x0

    if-ge v15, v8, :cond_30

    move-object v8, v10

    move/from16 v29, v11

    aget-wide v10, v2, v15

    const-wide/16 v30, -0x1

    cmp-long v2, v10, v30

    if-nez v2, :cond_2f

    goto :goto_25

    :cond_2f
    long-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    move-result-wide v26

    :goto_25
    aput-wide v26, v14, v15

    add-int/lit8 v15, v15, 0x1

    move-object v10, v8

    move/from16 v8, v21

    move/from16 v11, v29

    goto :goto_24

    :cond_30
    move-object v8, v10

    move/from16 v29, v11

    add-int/lit8 v12, v12, -0x1

    aget-wide v10, v14, v12

    aget-wide v30, v14, v19

    sub-double v10, v10, v30

    move/from16 v2, v19

    :goto_26
    if-ge v2, v12, :cond_32

    aget-wide v30, v14, v2

    add-int/lit8 v2, v2, 0x1

    aget-wide v32, v14, v2

    add-double v30, v30, v32

    const-wide/high16 v32, 0x3fe0000000000000L    # 0.5

    mul-double v30, v30, v32

    cmpl-double v15, v10, v26

    if-nez v15, :cond_31

    const-wide/high16 v30, 0x3ff0000000000000L    # 1.0

    goto :goto_27

    :cond_31
    aget-wide v32, v14, v19

    sub-double v30, v30, v32

    div-double v30, v30, v10

    :goto_27
    invoke-static/range {v30 .. v31}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    move/from16 v30, v2

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v13, v15, v2}, Lzr/s0;->d(Ljava/lang/Double;Ljava/lang/Integer;)Z

    move/from16 v2, v30

    goto :goto_26

    :cond_32
    :goto_28
    add-int/lit8 v11, v29, 0x1

    move-object v10, v8

    move-object/from16 v2, v20

    move/from16 v8, v21

    goto :goto_23

    :cond_33
    move-object/from16 v20, v2

    move-object v8, v10

    iget-object v2, v13, Lzr/o;->x:Lzr/n;

    if-nez v2, :cond_34

    new-instance v2, Lzr/n;

    const/4 v10, 0x0

    invoke-direct {v2, v10, v13}, Lzr/n;-><init>(ILjava/io/Serializable;)V

    iput-object v2, v13, Lzr/o;->x:Lzr/n;

    :cond_34
    invoke-static {v2}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v2

    move/from16 v10, v19

    :goto_29
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v11

    if-ge v10, v11, :cond_35

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    aget v12, v20, v11

    const/16 v25, 0x1

    add-int/lit8 v12, v12, 0x1

    aput v12, v20, v11

    aget-object v13, v8, v11

    aget-wide v12, v13, v12

    aput-wide v12, v3, v11

    invoke-static {v0, v3}, Lio/b;->u(Ljava/util/ArrayList;[J)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_29

    :cond_35
    move/from16 v2, v19

    :goto_2a
    array-length v8, v7

    if-ge v2, v8, :cond_37

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_36

    aget-wide v10, v3, v2

    const-wide/16 v12, 0x2

    mul-long/2addr v10, v12

    aput-wide v10, v3, v2

    :cond_36
    add-int/lit8 v2, v2, 0x1

    goto :goto_2a

    :cond_37
    invoke-static {v0, v3}, Lio/b;->u(Ljava/util/ArrayList;[J)V

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v2

    move/from16 v3, v19

    :goto_2b
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v3, v8, :cond_39

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lzr/d0;

    if-nez v8, :cond_38

    sget-object v8, Lzr/w0;->E:Lzr/w0;

    goto :goto_2c

    :cond_38
    invoke-virtual {v8}, Lzr/d0;->f()Lzr/w0;

    move-result-object v8

    :goto_2c
    invoke-virtual {v2, v8}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2b

    :cond_39
    invoke-virtual {v2}, Lzr/d0;->f()Lzr/w0;

    move-result-object v0

    array-length v2, v7

    new-array v2, v2, [Lio/o;

    const/4 v3, 0x0

    move v8, v3

    :goto_2d
    array-length v10, v7

    if-ge v8, v10, :cond_3d

    aget-object v10, v7, v8

    if-eqz v10, :cond_3c

    iget-object v11, v10, Lio/n;->b:[I

    array-length v12, v11

    if-nez v12, :cond_3a

    goto :goto_2f

    :cond_3a
    array-length v12, v11

    const/4 v13, 0x1

    if-ne v12, v13, :cond_3b

    new-instance v12, Lio/p;

    iget-object v10, v10, Lio/n;->a:Lsn/w0;

    aget v11, v11, v3

    filled-new-array {v11}, [I

    move-result-object v11

    invoke-direct {v12, v10, v11}, Lio/c;-><init>(Lsn/w0;[I)V

    goto :goto_2e

    :cond_3b
    iget-object v10, v10, Lio/n;->a:Lsn/w0;

    invoke-virtual {v0, v8}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v35, v12

    check-cast v35, Lzr/g0;

    new-instance v25, Lio/b;

    const/16 v12, 0x2710

    int-to-long v12, v12

    const/16 v14, 0x61a8

    int-to-long v14, v14

    move-wide/from16 v33, v14

    move-object/from16 v26, v10

    move-object/from16 v27, v11

    move-wide/from16 v29, v12

    move-wide/from16 v31, v14

    invoke-direct/range {v25 .. v35}, Lio/b;-><init>(Lsn/w0;[ILko/e;JJJLzr/g0;)V

    move-object/from16 v12, v25

    :goto_2e
    aput-object v12, v2, v8

    :cond_3c
    :goto_2f
    add-int/lit8 v8, v8, 0x1

    goto :goto_2d

    :cond_3d
    new-array v0, v6, [Lrm/g1;

    const/4 v8, 0x0

    :goto_30
    if-ge v8, v6, :cond_41

    aget v3, v23, v8

    iget-object v7, v5, Lio/f;->n0:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7, v8}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v7

    if-nez v7, :cond_40

    iget-object v7, v5, Lio/w;->Y:Lzr/j0;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7, v3}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3e

    goto :goto_31

    :cond_3e
    aget v3, v23, v8

    const/4 v7, -0x2

    if-eq v3, v7, :cond_3f

    aget-object v3, v2, v8

    if-eqz v3, :cond_40

    :cond_3f
    sget-object v3, Lrm/g1;->b:Lrm/g1;

    goto :goto_32

    :cond_40
    :goto_31
    move-object/from16 v3, v18

    :goto_32
    aput-object v3, v0, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_30

    :cond_41
    iget-boolean v3, v5, Lio/f;->k0:Z

    if-eqz v3, :cond_4c

    const/4 v3, -0x1

    const/4 v5, -0x1

    const/4 v8, 0x0

    :goto_33
    if-ge v8, v6, :cond_4a

    aget v7, v23, v8

    aget-object v10, v2, v8

    const/4 v14, 0x1

    const/4 v11, 0x2

    if-eq v7, v14, :cond_43

    if-ne v7, v11, :cond_42

    goto :goto_35

    :cond_42
    :goto_34
    const/4 v7, -0x1

    goto :goto_39

    :cond_43
    :goto_35
    if-eqz v10, :cond_42

    aget-object v12, v24, v8

    aget-object v13, v22, v8

    invoke-interface {v10}, Lio/o;->j()Lsn/w0;

    move-result-object v14

    iget-object v13, v13, Lsn/x0;->x:Lzr/w0;

    invoke-virtual {v13, v14}, Lzr/g0;->indexOf(Ljava/lang/Object;)I

    move-result v13

    if-ltz v13, :cond_44

    goto :goto_36

    :cond_44
    const/4 v13, -0x1

    :goto_36
    const/4 v14, 0x0

    :goto_37
    invoke-interface {v10}, Lio/o;->length()I

    move-result v15

    if-ge v14, v15, :cond_46

    aget-object v15, v12, v13

    invoke-interface {v10, v14}, Lio/o;->e(I)I

    move-result v18

    aget v15, v15, v18

    const/16 v11, 0x20

    and-int/2addr v15, v11

    if-eq v15, v11, :cond_45

    goto :goto_34

    :cond_45
    add-int/lit8 v14, v14, 0x1

    const/4 v11, 0x2

    goto :goto_37

    :cond_46
    const/4 v14, 0x1

    if-ne v7, v14, :cond_48

    const/4 v7, -0x1

    if-eq v5, v7, :cond_47

    :goto_38
    const/4 v12, 0x0

    goto :goto_3a

    :cond_47
    move v5, v8

    goto :goto_39

    :cond_48
    const/4 v7, -0x1

    if-eq v3, v7, :cond_49

    goto :goto_38

    :cond_49
    move v3, v8

    :goto_39
    add-int/lit8 v8, v8, 0x1

    goto :goto_33

    :cond_4a
    const/4 v7, -0x1

    const/4 v12, 0x1

    :goto_3a
    if-eq v5, v7, :cond_4b

    if-eq v3, v7, :cond_4b

    const/4 v7, 0x1

    goto :goto_3b

    :cond_4b
    const/4 v7, 0x0

    :goto_3b
    and-int/2addr v7, v12

    if-eqz v7, :cond_4c

    new-instance v7, Lrm/g1;

    const/4 v14, 0x1

    invoke-direct {v7, v14}, Lrm/g1;-><init>(Z)V

    aput-object v7, v0, v5

    aput-object v7, v0, v3

    goto :goto_3c

    :cond_4c
    const/4 v14, 0x1

    :goto_3c
    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    iget-object v2, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [Lio/o;

    new-instance v3, Lzr/d0;

    const/4 v5, 0x4

    invoke-direct {v3, v5}, Lzr/a0;-><init>(I)V

    const/4 v8, 0x0

    :goto_3d
    if-ge v8, v6, :cond_51

    iget-object v5, v1, Lio/q;->c:[Lsn/x0;

    aget-object v5, v5, v8

    aget-object v7, v2, v8

    const/4 v10, 0x0

    :goto_3e
    iget v11, v5, Lsn/x0;->w:I

    if-ge v10, v11, :cond_50

    invoke-virtual {v5, v10}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v11

    iget v12, v11, Lsn/w0;->w:I

    new-array v13, v12, [I

    new-array v15, v12, [Z

    const/4 v14, 0x0

    :goto_3f
    if-ge v14, v12, :cond_4f

    move-object/from16 v18, v2

    iget-object v2, v1, Lio/q;->d:[[[I

    aget-object v2, v2, v8

    aget-object v2, v2, v10

    aget v2, v2, v14

    and-int/lit8 v2, v2, 0x7

    aput v2, v13, v14

    if-eqz v7, :cond_4d

    invoke-interface {v7}, Lio/o;->j()Lsn/w0;

    move-result-object v2

    invoke-virtual {v2, v11}, Lsn/w0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4d

    invoke-interface {v7, v14}, Lio/o;->i(I)I

    move-result v2

    move-object/from16 v19, v5

    const/4 v5, -0x1

    if-eq v2, v5, :cond_4e

    const/4 v2, 0x1

    goto :goto_40

    :cond_4d
    move-object/from16 v19, v5

    const/4 v5, -0x1

    :cond_4e
    const/4 v2, 0x0

    :goto_40
    aput-boolean v2, v15, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v2, v18

    move-object/from16 v5, v19

    goto :goto_3f

    :cond_4f
    move-object/from16 v18, v2

    move-object/from16 v19, v5

    const/4 v5, -0x1

    iget-object v2, v1, Lio/q;->b:[I

    aget v2, v2, v8

    new-instance v12, Lrm/p1;

    invoke-direct {v12, v11, v13, v2, v15}, Lrm/p1;-><init>(Lsn/w0;[II[Z)V

    invoke-virtual {v3, v12}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v2, v18

    move-object/from16 v5, v19

    const/4 v14, 0x1

    goto :goto_3e

    :cond_50
    move-object/from16 v18, v2

    const/4 v5, -0x1

    add-int/lit8 v8, v8, 0x1

    const/4 v14, 0x1

    goto :goto_3d

    :cond_51
    const/4 v8, 0x0

    :goto_41
    if-ge v8, v9, :cond_52

    invoke-virtual {v4, v8}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v2

    iget v5, v2, Lsn/w0;->w:I

    new-array v6, v5, [I

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([II)V

    iget-object v10, v2, Lsn/w0;->y:[Lrm/c0;

    aget-object v10, v10, v7

    iget-object v10, v10, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v10}, Llo/m;->g(Ljava/lang/String;)I

    move-result v10

    new-array v5, v5, [Z

    new-instance v11, Lrm/p1;

    invoke-direct {v11, v2, v6, v10, v5}, Lrm/p1;-><init>(Lsn/w0;[II[Z)V

    invoke-virtual {v3, v11}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_41

    :cond_52
    const/4 v7, 0x0

    new-instance v2, Lrm/q1;

    invoke-virtual {v3}, Lzr/d0;->f()Lzr/w0;

    move-result-object v3

    invoke-direct {v2, v3}, Lrm/q1;-><init>(Lzr/g0;)V

    new-instance v3, Lio/x;

    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [Lrm/g1;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, [Lio/o;

    invoke-direct {v3, v4, v0, v2, v1}, Lio/x;-><init>([Lrm/g1;[Lio/o;Lrm/q1;Lio/q;)V

    iget-object v0, v3, Lio/x;->c:[Lio/o;

    array-length v1, v0

    move v9, v7

    :goto_42
    if-ge v9, v1, :cond_54

    aget-object v2, v0, v9

    move/from16 v4, p1

    if-eqz v2, :cond_53

    invoke-interface {v2, v4}, Lio/o;->f(F)V

    :cond_53
    add-int/lit8 v9, v9, 0x1

    goto :goto_42

    :cond_54
    return-object v3
.end method

.method public final h()V
    .locals 5

    iget-object v0, p0, Lrm/n0;->a:Ljava/lang/Object;

    instance-of v1, v0, Lsn/c;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lrm/n0;->f:Lrm/o0;

    iget-wide v1, v1, Lrm/o0;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    :cond_0
    check-cast v0, Lsn/c;

    const-wide/16 v3, 0x0

    iput-wide v3, v0, Lsn/c;->E:J

    iput-wide v1, v0, Lsn/c;->F:J

    :cond_1
    return-void
.end method
