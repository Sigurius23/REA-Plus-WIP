.class public final Lp0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/j0;
.implements Lp0/z0;
.implements Lp0/k0;


# instance fields
.field public final a:I

.field public final b:La3/p;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public d:Ly3/a;

.field public e:Ly2/s1;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/Object;

.field public j:Z

.field public k:Lcom/iterable/iterableapi/u1;

.field public l:Z

.field public m:J

.field public n:J

.field public o:J

.field public final synthetic p:Lb9/b;


# direct methods
.method public constructor <init>(Lb9/b;ILa3/p;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/y0;->p:Lb9/b;

    iput p2, p0, Lp0/y0;->a:I

    iput-object p3, p0, Lp0/y0;->b:La3/p;

    iput-object p4, p0, Lp0/y0;->c:Lkotlin/jvm/functions/Function1;

    sget-object p1, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {p1}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/y0;->o:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/y0;->l:Z

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lp0/y0;->e:Ly2/s1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ly2/s1;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp0/y0;->e:Ly2/s1;

    iput-object v0, p0, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    return-void
.end method

.method public final c(Lm/k0;)Z
    .locals 3

    iget-object v0, p0, Lp0/y0;->p:Lb9/b;

    iget-boolean v0, v0, Lb9/b;->x:Z

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-boolean v0, p0, Lp0/y0;->l:Z

    if-eqz v0, :cond_1

    const-string v0, "compose:lazy:prefetch:execute:urgent"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lp0/y0;->d(Lm/k0;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1}, Lp0/y0;->d(Lm/k0;)Z

    move-result p1

    :goto_0
    const-string v0, "compose:lazy:prefetch:execute:item"

    const-wide/16 v1, -0x1

    invoke-static {v1, v2, v0}, La4/a;->F(JLjava/lang/String;)V

    return p1
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Lp0/y0;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/y0;->g:Z

    invoke-virtual {p0}, Lp0/y0;->b()V

    :cond_0
    return-void
.end method

.method public final d(Lm/k0;)Z
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Lp0/y0;->a:I

    int-to-long v2, v0

    const-string v4, "compose:lazy:prefetch:execute:item"

    invoke-static {v2, v3, v4}, La4/a;->F(JLjava/lang/String;)V

    iget-object v5, v1, Lp0/y0;->p:Lb9/b;

    iget-object v6, v5, Lb9/b;->y:Ljava/lang/Object;

    check-cast v6, Lp0/a0;

    iget-object v6, v6, Lp0/a0;->b:Lo0/i;

    invoke-virtual {v6}, Lo0/i;->invoke()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lp0/b0;

    iget-boolean v7, v1, Lp0/y0;->g:Z

    const/4 v8, 0x0

    if-nez v7, :cond_21

    invoke-interface {v6}, Lp0/b0;->getItemCount()I

    move-result v7

    if-ltz v0, :cond_21

    if-ge v0, v7, :cond_21

    invoke-interface {v6, v0}, Lp0/b0;->c(I)Ljava/lang/Object;

    move-result-object v7

    iget-object v9, v1, Lp0/y0;->i:Ljava/lang/Object;

    if-eqz v9, :cond_0

    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-virtual {v1}, Lp0/y0;->b()V

    return v8

    :cond_0
    invoke-interface {v6, v0}, Lp0/b0;->a(I)Ljava/lang/Object;

    move-result-object v6

    iget-object v9, v1, Lp0/y0;->b:La3/p;

    iget-object v10, v9, La3/p;->z:Ljava/lang/Object;

    check-cast v10, Lp0/b;

    iget-object v11, v9, La3/p;->y:Ljava/lang/Object;

    const/4 v12, -0x1

    if-ne v11, v6, :cond_1

    if-eqz v10, :cond_1

    goto :goto_0

    :cond_1
    iget-object v10, v9, La3/p;->x:Ljava/lang/Object;

    check-cast v10, La0/v0;

    invoke-virtual {v10, v6}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_2

    new-instance v11, Lp0/b;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    iput v12, v11, Lp0/b;->d:I

    invoke-virtual {v10, v6, v11}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    move-object v10, v11

    check-cast v10, Lp0/b;

    iput-object v6, v9, La3/p;->y:Ljava/lang/Object;

    iput-object v10, v9, La3/p;->z:Ljava/lang/Object;

    :goto_0
    invoke-virtual {v1}, Lp0/y0;->f()Z

    invoke-virtual/range {p1 .. p1}, Lm/k0;->a()J

    move-result-wide v13

    iput-wide v13, v1, Lp0/y0;->m:J

    sget-object v9, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {v9}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v8

    iput-wide v8, v1, Lp0/y0;->o:J

    const-wide/16 v8, 0x0

    iput-wide v8, v1, Lp0/y0;->n:J

    const-string v15, "compose:lazy:prefetch:available_time_nanos"

    invoke-static {v13, v14, v15}, La4/a;->F(JLjava/lang/String;)V

    invoke-virtual {v1}, Lp0/y0;->f()Z

    move-result v13

    const/4 v14, 0x1

    move-wide v15, v8

    if-nez v13, :cond_a

    iget-wide v8, v1, Lp0/y0;->m:J

    iget-wide v11, v10, Lp0/b;->a:J

    invoke-virtual {v1, v8, v9, v11, v12}, Lp0/y0;->i(JJ)Z

    move-result v8

    if-eqz v8, :cond_9

    const-string v8, "compose:lazy:prefetch:compose"

    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    iget-object v8, v1, Lp0/y0;->e:Ly2/s1;

    if-nez v8, :cond_3

    goto :goto_1

    :cond_3
    const-string v8, "Request was already composed!"

    invoke-static {v8}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v8, v5, Lb9/b;->y:Ljava/lang/Object;

    check-cast v8, Lp0/a0;

    invoke-virtual {v8, v0, v7, v6}, Lp0/a0;->a(ILjava/lang/Object;Ljava/lang/Object;)Lc93/m;

    move-result-object v0

    iput-object v7, v1, Lp0/y0;->i:Ljava/lang/Object;

    iget-object v5, v5, Lb9/b;->z:Ljava/lang/Object;

    check-cast v5, Ly2/u1;

    invoke-virtual {v5}, Ly2/u1;->a()Ly2/n0;

    move-result-object v5

    iget-object v6, v5, Ly2/n0;->w:La3/n0;

    invoke-virtual {v6}, La3/n0;->X()Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Ly2/n0;->d()V

    iget-object v8, v5, Ly2/n0;->G:La0/v0;

    invoke-virtual {v8, v7}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    iget-object v8, v5, Ly2/n0;->L:La0/v0;

    invoke-virtual {v8, v7}, La0/v0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v5, Ly2/n0;->J:La0/v0;

    invoke-virtual {v8, v7}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_6

    invoke-virtual {v5, v7}, Ly2/n0;->j(Ljava/lang/Object;)La3/n0;

    move-result-object v9

    if-eqz v9, :cond_5

    invoke-virtual {v6}, La3/n0;->r()Ljava/util/List;

    move-result-object v11

    check-cast v11, Lr1/b;

    iget-object v11, v11, Lr1/b;->w:Lr1/c;

    invoke-virtual {v11, v9}, Lr1/c;->j(Ljava/lang/Object;)I

    move-result v11

    invoke-virtual {v6}, La3/n0;->r()Ljava/util/List;

    move-result-object v12

    check-cast v12, Lr1/b;

    iget-object v12, v12, Lr1/b;->w:Lr1/c;

    iget v12, v12, Lr1/c;->y:I

    iput-boolean v14, v6, La3/n0;->P:Z

    invoke-virtual {v6, v11, v12, v14}, La3/n0;->i0(III)V

    const/4 v11, 0x0

    iput-boolean v11, v6, La3/n0;->P:Z

    iget v12, v5, Ly2/n0;->O:I

    add-int/2addr v12, v14

    iput v12, v5, Ly2/n0;->O:I

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, La3/n0;->r()Ljava/util/List;

    move-result-object v9

    check-cast v9, Lr1/b;

    iget-object v9, v9, Lr1/b;->w:Lr1/c;

    iget v9, v9, Lr1/c;->y:I

    new-instance v12, La3/n0;

    const/4 v11, 0x2

    invoke-direct {v12, v11}, La3/n0;-><init>(I)V

    iput-boolean v14, v6, La3/n0;->P:Z

    invoke-virtual {v6, v9, v12}, La3/n0;->O(ILa3/n0;)V

    const/4 v11, 0x0

    iput-boolean v11, v6, La3/n0;->P:Z

    iget v9, v5, Ly2/n0;->O:I

    add-int/2addr v9, v14

    iput v9, v5, Ly2/n0;->O:I

    move-object v9, v12

    :goto_2
    invoke-virtual {v8, v7, v9}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_6
    check-cast v9, La3/n0;

    const/4 v11, 0x0

    invoke-virtual {v5, v9, v7, v11, v0}, Ly2/n0;->i(La3/n0;Ljava/lang/Object;ZLc93/m;)V

    :cond_7
    :goto_3
    invoke-virtual {v6}, La3/n0;->X()Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Ly2/l0;

    invoke-direct {v0}, Ly2/l0;-><init>()V

    goto :goto_4

    :cond_8
    new-instance v0, Ly2/m0;

    invoke-direct {v0, v5, v7}, Ly2/m0;-><init>(Ly2/n0;Ljava/lang/Object;)V

    :goto_4
    iput-object v0, v1, Lp0/y0;->e:Ly2/s1;

    iput-boolean v14, v1, Lp0/y0;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v1}, Lp0/y0;->j()V

    iget-wide v5, v1, Lp0/y0;->n:J

    iget-wide v7, v10, Lp0/b;->a:J

    invoke-static {v5, v6, v7, v8}, Lp0/b;->a(JJ)J

    move-result-wide v5

    iput-wide v5, v10, Lp0/b;->a:J

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_9
    :goto_5
    invoke-virtual {v1}, Lp0/y0;->f()Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_10

    :cond_a
    iget-boolean v0, v1, Lp0/y0;->j:Z

    if-nez v0, :cond_b

    iget-wide v5, v1, Lp0/y0;->m:J

    cmp-long v0, v5, v15

    if-lez v0, :cond_19

    const-string v0, "compose:lazy:prefetch:resolve-nested"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    invoke-virtual {v1}, Lp0/y0;->h()Lcom/iterable/iterableapi/u1;

    move-result-object v0

    iput-object v0, v1, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    iput-boolean v14, v1, Lp0/y0;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_6

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_b
    :goto_6
    iget-object v0, v1, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    if-eqz v0, :cond_17

    iget v5, v10, Lp0/b;->d:I

    iget-boolean v6, v1, Lp0/y0;->l:Z

    iget-object v7, v0, Lcom/iterable/iterableapi/u1;->e:Ljava/lang/Object;

    check-cast v7, [Ljava/util/List;

    iget v8, v0, Lcom/iterable/iterableapi/u1;->a:I

    iget-object v9, v0, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v12

    if-lt v8, v12, :cond_c

    goto/16 :goto_f

    :cond_c
    iget-object v8, v0, Lcom/iterable/iterableapi/u1;->f:Ljava/lang/Object;

    check-cast v8, Lp0/y0;

    iget-boolean v8, v8, Lp0/y0;->g:Z

    if-eqz v8, :cond_d

    const-string v8, "Should not execute nested prefetch on canceled request"

    invoke-static {v8}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_d
    const-string v8, "compose:lazy:prefetch:update_nested_prefetch_count"

    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_2
    move-object v8, v9

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v12, 0x0

    :goto_7
    if-ge v12, v8, :cond_e

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v11, v17

    check-cast v11, Lp0/l0;

    iput v5, v11, Lp0/l0;->d:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_7

    :catchall_2
    move-exception v0

    goto/16 :goto_e

    :cond_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    const-string v5, "compose:lazy:prefetch:nested"

    invoke-static {v5}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :goto_8
    :try_start_3
    iget v5, v0, Lcom/iterable/iterableapi/u1;->a:I

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v8

    if-ge v5, v8, :cond_16

    iget v5, v0, Lcom/iterable/iterableapi/u1;->a:I

    aget-object v5, v7, v5

    if-nez v5, :cond_11

    invoke-virtual/range {p1 .. p1}, Lm/k0;->a()J

    move-result-wide v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    cmp-long v5, v11, v15

    if-gtz v5, :cond_f

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v14

    :cond_f
    :try_start_4
    iget v5, v0, Lcom/iterable/iterableapi/u1;->a:I

    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp0/l0;

    iget-object v11, v8, Lp0/l0;->a:Lkotlin/jvm/functions/Function1;

    if-nez v11, :cond_10

    sget-object v8, Lm83/y;->w:Lm83/y;

    goto :goto_9

    :cond_10
    new-instance v12, Lp0/i0;

    iget v13, v8, Lp0/l0;->d:I

    invoke-direct {v12, v8, v13}, Lp0/i0;-><init>(Lp0/l0;I)V

    invoke-interface {v11, v12}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v11, v12, Lp0/i0;->b:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    iput v12, v8, Lp0/l0;->f:I

    move-object v8, v11

    :goto_9
    aput-object v8, v7, v5

    goto :goto_a

    :catchall_3
    move-exception v0

    goto :goto_d

    :cond_11
    :goto_a
    iget v5, v0, Lcom/iterable/iterableapi/u1;->a:I

    aget-object v5, v7, v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_b
    iget v8, v0, Lcom/iterable/iterableapi/u1;->b:I

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v11

    if-ge v8, v11, :cond_15

    iget v8, v0, Lcom/iterable/iterableapi/u1;->b:I

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp0/z0;

    if-eqz v6, :cond_13

    instance-of v11, v8, Lp0/y0;

    if-eqz v11, :cond_12

    move-object v11, v8

    check-cast v11, Lp0/y0;

    goto :goto_c

    :cond_12
    const/4 v11, 0x0

    :goto_c
    if-eqz v11, :cond_13

    iput-boolean v14, v11, Lp0/y0;->l:Z

    :cond_13
    iput-boolean v14, v0, Lcom/iterable/iterableapi/u1;->c:Z

    check-cast v8, Lp0/y0;

    move-object/from16 v12, p1

    invoke-virtual {v8, v12}, Lp0/y0;->c(Lm/k0;)Z

    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v8, :cond_14

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return v14

    :cond_14
    :try_start_5
    iget v8, v0, Lcom/iterable/iterableapi/u1;->b:I

    add-int/2addr v8, v14

    iput v8, v0, Lcom/iterable/iterableapi/u1;->b:I

    goto :goto_b

    :cond_15
    move-object/from16 v12, p1

    const/4 v11, 0x0

    iput v11, v0, Lcom/iterable/iterableapi/u1;->b:I

    iget v5, v0, Lcom/iterable/iterableapi/u1;->a:I

    add-int/2addr v5, v14

    iput v5, v0, Lcom/iterable/iterableapi/u1;->a:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto/16 :goto_8

    :cond_16
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_f

    :goto_d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :goto_e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_17
    :goto_f
    iget-object v0, v1, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    if-eqz v0, :cond_18

    iget-boolean v0, v0, Lcom/iterable/iterableapi/u1;->c:Z

    if-ne v0, v14, :cond_18

    invoke-virtual {v1}, Lp0/y0;->j()V

    invoke-static {v2, v3, v4}, La4/a;->F(JLjava/lang/String;)V

    iget-object v0, v1, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    if-eqz v0, :cond_18

    const/4 v11, 0x0

    iput-boolean v11, v0, Lcom/iterable/iterableapi/u1;->c:Z

    :cond_18
    iget-object v0, v1, Lp0/y0;->d:Ly3/a;

    iget-boolean v2, v1, Lp0/y0;->f:Z

    if-nez v2, :cond_1a

    if-eqz v0, :cond_1a

    iget-wide v2, v1, Lp0/y0;->m:J

    iget-wide v4, v10, Lp0/b;->c:J

    invoke-virtual {v1, v2, v3, v4, v5}, Lp0/y0;->i(JJ)Z

    move-result v2

    if-eqz v2, :cond_19

    const-string v2, "compose:lazy:prefetch:measure"

    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_6
    iget-wide v2, v0, Ly3/a;->a:J

    invoke-virtual {v1, v2, v3}, Lp0/y0;->g(J)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-virtual {v1}, Lp0/y0;->j()V

    iget-wide v2, v1, Lp0/y0;->n:J

    iget-wide v4, v10, Lp0/b;->c:J

    invoke-static {v2, v3, v4, v5}, Lp0/b;->a(JJ)J

    move-result-wide v2

    iput-wide v2, v10, Lp0/b;->c:J

    iget-object v0, v1, Lp0/y0;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_1a

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :catchall_4
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_19
    :goto_10
    return v14

    :cond_1a
    :goto_11
    iget-object v0, v1, Lp0/y0;->k:Lcom/iterable/iterableapi/u1;

    iget-boolean v2, v1, Lp0/y0;->f:Z

    if-eqz v2, :cond_20

    iget-boolean v2, v1, Lp0/y0;->j:Z

    if-eqz v2, :cond_20

    if-eqz v0, :cond_20

    iget-object v0, v0, Lcom/iterable/iterableapi/u1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const v4, 0x7fffffff

    move v6, v4

    const/4 v5, 0x0

    :goto_12
    if-ge v5, v3, :cond_1b

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp0/l0;

    iget v7, v7, Lp0/l0;->e:I

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_12

    :cond_1b
    if-ne v6, v4, :cond_1c

    const/4 v6, 0x0

    :cond_1c
    iget v3, v10, Lp0/b;->d:I

    const/4 v13, -0x1

    if-ne v3, v13, :cond_1d

    move v3, v6

    goto :goto_13

    :cond_1d
    mul-int/lit8 v3, v3, 0x3

    add-int/2addr v3, v6

    div-int/lit8 v3, v3, 0x4

    :goto_13
    iput v3, v10, Lp0/b;->d:I

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v5, v4

    const/4 v3, 0x0

    :goto_14
    if-ge v3, v2, :cond_1e

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp0/l0;

    iget v7, v7, Lp0/l0;->f:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_1e
    if-ne v5, v4, :cond_1f

    const/4 v5, 0x0

    :cond_1f
    if-ge v5, v6, :cond_20

    move-wide v2, v15

    iput-wide v2, v10, Lp0/b;->c:J

    const/4 v11, 0x0

    return v11

    :cond_20
    const/4 v11, 0x0

    return v11

    :cond_21
    move v11, v8

    invoke-virtual {v1}, Lp0/y0;->b()V

    return v11
.end method

.method public final e(I)J
    .locals 2

    iget-object v0, p0, Lp0/y0;->e:Ly2/s1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ly2/s1;->a(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lp0/y0;->h:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final g(J)V
    .locals 3

    iget-boolean v0, p0, Lp0/y0;->g:Z

    if-eqz v0, :cond_0

    const-string v0, "Callers should check whether the request is still valid before calling performMeasure()"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Lp0/y0;->f:Z

    if-eqz v0, :cond_1

    const-string v0, "Request was already measured!"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/y0;->f:Z

    iget-object v0, p0, Lp0/y0;->e:Ly2/s1;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ly2/s1;->b()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2, p1, p2}, Ly2/s1;->d(IJ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    const-string p1, "performComposition() must be called before performMeasure()"

    invoke-static {p1}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final h()Lcom/iterable/iterableapi/u1;
    .locals 4

    iget-object v0, p0, Lp0/y0;->e:Ly2/s1;

    if-eqz v0, :cond_1

    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lbd3/k0;

    const/4 v3, 0x7

    invoke-direct {v2, v1, v3}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-interface {v0, v2}, Ly2/s1;->c(Lbd3/k0;)V

    iget-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/iterable/iterableapi/u1;

    invoke-direct {v1, p0, v0}, Lcom/iterable/iterableapi/u1;-><init>(Lp0/y0;Ljava/util/List;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const-string v0, "Should precompose before resolving nested prefetch states"

    invoke-static {v0}, Lk0/a;->b(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public final i(JJ)Z
    .locals 1

    iget-boolean v0, p0, Lp0/y0;->l:Z

    if-eqz v0, :cond_0

    const-wide/16 p3, 0x0

    :cond_0
    cmp-long p1, p1, p3

    if-lez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final j()V
    .locals 6

    sget-object v0, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {v0}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    iget-wide v2, p0, Lp0/y0;->o:J

    invoke-static {v0, v1, v2, v3}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->minus-6eNON_k(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    move-result-wide v2

    iput-wide v2, p0, Lp0/y0;->n:J

    iget-wide v4, p0, Lp0/y0;->m:J

    sub-long/2addr v4, v2

    iput-wide v4, p0, Lp0/y0;->m:J

    iput-wide v0, p0, Lp0/y0;->o:J

    const-string v0, "compose:lazy:prefetch:available_time_nanos"

    invoke-static {v4, v5, v0}, La4/a;->F(JLjava/lang/String;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HandleAndRequestImpl { index = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lp0/y0;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", constraints = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lp0/y0;->d:Ly3/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isComposed = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp0/y0;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isMeasured = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp0/y0;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isCanceled = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lp0/y0;->g:Z

    const-string v2, " }"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
