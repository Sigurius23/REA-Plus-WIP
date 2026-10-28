.class public final Lp1/f0;
.super Lz1/a0;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public final x:Lc93/a;

.field public final y:Lp1/o2;

.field public z:Lp1/e0;


# direct methods
.method public constructor <init>(Lc93/a;Lp1/o2;)V
    .locals 2

    invoke-direct {p0}, Lz1/a0;-><init>()V

    iput-object p1, p0, Lp1/f0;->x:Lc93/a;

    iput-object p2, p0, Lp1/f0;->y:Lp1/o2;

    new-instance p1, Lp1/e0;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object p2

    invoke-virtual {p2}, Lz1/f;->g()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Lp1/e0;-><init>(J)V

    iput-object p1, p0, Lp1/f0;->z:Lp1/e0;

    return-void
.end method


# virtual methods
.method public final N()Lz1/b0;
    .locals 1

    iget-object v0, p0, Lp1/f0;->z:Lp1/e0;

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    iget-object v1, p0, Lp1/f0;->z:Lp1/e0;

    invoke-static {v1, v0}, Lz1/l;->j(Lz1/b0;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lp1/e0;

    const/4 v2, 0x1

    iget-object v3, p0, Lp1/f0;->x:Lc93/a;

    invoke-virtual {p0, v1, v0, v2, v3}, Lp1/f0;->x(Lp1/e0;Lz1/f;ZLc93/a;)Lp1/e0;

    move-result-object v0

    iget-object v0, v0, Lp1/e0;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final m0(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/e0;

    iput-object p1, p0, Lp1/f0;->z:Lp1/e0;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lp1/f0;->z:Lp1/e0;

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lp1/e0;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DerivedState(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lp1/f0;->z:Lp1/e0;

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lp1/e0;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lp1/e0;->c(Lp1/f0;Lz1/f;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lp1/e0;->f:Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "<Not calculated>"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lp1/e0;Lz1/f;ZLc93/a;)Lp1/e0;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-virtual {v0, v1, v2}, Lp1/e0;->c(Lp1/f0;Lz1/f;)Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz p3, :cond_8

    invoke-static {}, Lp1/x;->q()Lr1/c;

    move-result-object v3

    iget-object v5, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v6, v3, Lr1/c;->y:I

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v5, v7

    check-cast v8, Lp1/p;

    invoke-virtual {v8}, Lp1/p;->b()V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v5, v0, Lp1/e0;->e:La0/m0;

    sget-object v6, Lp1/p2;->a:Ls/m2;

    invoke-virtual {v6}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lx1/d;

    if-nez v7, :cond_1

    new-instance v7, Lx1/d;

    invoke-direct {v7}, Lx1/d;-><init>()V

    invoke-virtual {v6, v7}, Ls/m2;->s(Ljava/lang/Object;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    :goto_1
    iget v6, v7, Lx1/d;->a:I

    iget-object v8, v5, La0/m0;->b:[Ljava/lang/Object;

    iget-object v9, v5, La0/m0;->c:[I

    iget-object v5, v5, La0/m0;->a:[J

    array-length v10, v5

    add-int/lit8 v10, v10, -0x2

    if-ltz v10, :cond_6

    const/4 v11, 0x0

    :goto_2
    aget-wide v12, v5, v11

    not-long v14, v12

    const/16 v16, 0x7

    shl-long v14, v14, v16

    and-long/2addr v14, v12

    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v14, v14, v16

    cmp-long v14, v14, v16

    if-eqz v14, :cond_5

    sub-int v14, v11, v10

    not-int v14, v14

    ushr-int/lit8 v14, v14, 0x1f

    const/16 v15, 0x8

    rsub-int/lit8 v14, v14, 0x8

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v14, :cond_4

    const-wide/16 v17, 0xff

    and-long v17, v12, v17

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_2

    shl-int/lit8 v17, v11, 0x3

    add-int v17, v17, v4

    aget-object v18, v8, v17

    aget v17, v9, v17

    move/from16 p3, v15

    move-object/from16 v15, v18

    check-cast v15, Lz1/z;

    add-int v2, v6, v17

    iput v2, v7, Lx1/d;->a:I

    invoke-virtual/range {p2 .. p2}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2, v15}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_2
    move/from16 p3, v15

    :cond_3
    :goto_4
    shr-long v12, v12, p3

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, p2

    move/from16 v15, p3

    goto :goto_3

    :cond_4
    move v2, v15

    if-ne v14, v2, :cond_6

    :cond_5
    if-eq v11, v10, :cond_6

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p2

    goto :goto_2

    :cond_6
    iput v6, v7, Lx1/d;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v3, :cond_8

    aget-object v5, v2, v4

    check-cast v5, Lp1/p;

    invoke-virtual {v5}, Lp1/p;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :goto_6
    iget-object v2, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    const/4 v4, 0x0

    :goto_7
    if-ge v4, v3, :cond_7

    aget-object v5, v2, v4

    check-cast v5, Lp1/p;

    invoke-virtual {v5}, Lp1/p;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_7
    throw v0

    :cond_8
    return-object v0

    :cond_9
    new-instance v2, La0/m0;

    invoke-direct {v2}, La0/m0;-><init>()V

    sget-object v3, Lp1/p2;->a:Ls/m2;

    invoke-virtual {v3}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx1/d;

    if-nez v4, :cond_a

    new-instance v4, Lx1/d;

    invoke-direct {v4}, Lx1/d;-><init>()V

    invoke-virtual {v3, v4}, Ls/m2;->s(Ljava/lang/Object;)V

    :cond_a
    iget v3, v4, Lx1/d;->a:I

    invoke-static {}, Lp1/x;->q()Lr1/c;

    move-result-object v5

    iget-object v6, v5, Lr1/c;->w:[Ljava/lang/Object;

    iget v7, v5, Lr1/c;->y:I

    const/4 v8, 0x0

    :goto_8
    if-ge v8, v7, :cond_b

    aget-object v9, v6, v8

    check-cast v9, Lp1/p;

    invoke-virtual {v9}, Lp1/p;->b()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_b
    add-int/lit8 v6, v3, 0x1

    :try_start_1
    iput v6, v4, Lx1/d;->a:I

    new-instance v6, Lp1/d0;

    invoke-direct {v6, v1, v4, v2, v3}, Lp1/d0;-><init>(Lp1/f0;Lx1/d;La0/m0;I)V

    move-object/from16 v7, p4

    invoke-static {v7, v6}, Lyl/a;->f(Lc93/a;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v6

    iput v3, v4, Lx1/d;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    iget-object v3, v5, Lr1/c;->w:[Ljava/lang/Object;

    iget v4, v5, Lr1/c;->y:I

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_c

    aget-object v7, v3, v5

    check-cast v7, Lp1/p;

    invoke-virtual {v7}, Lp1/p;->a()V

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_c
    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_2
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    iget-object v5, v0, Lp1/e0;->f:Ljava/lang/Object;

    sget-object v7, Lp1/e0;->h:Ljava/lang/Object;

    if-eq v5, v7, :cond_d

    iget-object v7, v1, Lp1/f0;->y:Lp1/o2;

    if-eqz v7, :cond_d

    invoke-interface {v7, v6, v5}, Lp1/o2;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_d

    iput-object v2, v0, Lp1/e0;->e:La0/m0;

    invoke-virtual {v0, v1, v4}, Lp1/e0;->d(Lp1/f0;Lz1/f;)I

    move-result v2

    iput v2, v0, Lp1/e0;->g:I

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_b

    :cond_d
    iget-object v0, v1, Lp1/f0;->z:Lp1/e0;

    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {v0, v1}, Lz1/l;->m(Lz1/b0;Lz1/z;)Lz1/b0;

    move-result-object v5

    invoke-virtual {v5, v0}, Lz1/b0;->a(Lz1/b0;)V

    invoke-virtual {v4}, Lz1/f;->g()J

    move-result-wide v7

    iput-wide v7, v5, Lz1/b0;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    monitor-exit v3

    move-object v0, v5

    check-cast v0, Lp1/e0;

    iput-object v2, v0, Lp1/e0;->e:La0/m0;

    invoke-virtual {v0, v1, v4}, Lp1/e0;->d(Lp1/f0;Lz1/f;)I

    move-result v2

    iput v2, v0, Lp1/e0;->g:I

    iput-object v6, v0, Lp1/e0;->f:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_a
    monitor-exit v3

    sget-object v2, Lp1/p2;->a:Ls/m2;

    invoke-virtual {v2}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx1/d;

    if-eqz v2, :cond_e

    iget v2, v2, Lx1/d;->a:I

    if-nez v2, :cond_e

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    invoke-virtual {v2}, Lz1/f;->m()V

    monitor-enter v3

    :try_start_5
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v2

    invoke-virtual {v2}, Lz1/f;->g()J

    move-result-wide v4

    iput-wide v4, v0, Lp1/e0;->c:J

    invoke-virtual {v2}, Lz1/f;->h()I

    move-result v2

    iput v2, v0, Lp1/e0;->d:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    monitor-exit v3

    return-object v0

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_e
    return-object v0

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v3

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_b
    monitor-exit v3

    throw v0

    :catchall_4
    move-exception v0

    iget-object v2, v5, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v5, Lr1/c;->y:I

    const/4 v4, 0x0

    :goto_c
    if-ge v4, v3, :cond_f

    aget-object v5, v2, v4

    check-cast v5, Lp1/p;

    invoke-virtual {v5}, Lp1/p;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_c

    :cond_f
    throw v0
.end method

.method public final y()Lp1/e0;
    .locals 4

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    iget-object v1, p0, Lp1/f0;->z:Lp1/e0;

    invoke-static {v1, v0}, Lz1/l;->j(Lz1/b0;Lz1/f;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lp1/e0;

    const/4 v2, 0x0

    iget-object v3, p0, Lp1/f0;->x:Lc93/a;

    invoke-virtual {p0, v1, v0, v2, v3}, Lp1/f0;->x(Lp1/e0;Lz1/f;ZLc93/a;)Lp1/e0;

    move-result-object v0

    return-object v0
.end method
