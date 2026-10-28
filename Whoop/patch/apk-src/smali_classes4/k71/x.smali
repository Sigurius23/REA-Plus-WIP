.class public final synthetic Lk71/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p10, p0, Lk71/x;->w:I

    iput-object p1, p0, Lk71/x;->x:Ljava/lang/Object;

    iput-object p2, p0, Lk71/x;->y:Ljava/lang/Object;

    iput-object p3, p0, Lk71/x;->z:Ljava/lang/Object;

    iput-object p4, p0, Lk71/x;->E:Ljava/lang/Object;

    iput-object p5, p0, Lk71/x;->F:Ljava/lang/Object;

    iput-object p6, p0, Lk71/x;->G:Ljava/lang/Object;

    iput-object p7, p0, Lk71/x;->H:Ljava/lang/Object;

    iput-object p8, p0, Lk71/x;->I:Ljava/lang/Object;

    iput-object p9, p0, Lk71/x;->J:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    move-object/from16 v1, p0

    iget v0, v1, Lk71/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lk71/x;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/y1;

    iget-object v0, v1, Lk71/x;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, La0/w0;

    iget-object v0, v1, Lk71/x;->z:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, La0/w0;

    iget-object v0, v1, Lk71/x;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    iget-object v0, v1, Lk71/x;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    iget-object v0, v1, Lk71/x;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, La0/w0;

    iget-object v0, v1, Lk71/x;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    iget-object v0, v1, Lk71/x;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, La0/w0;

    iget-object v0, v1, Lk71/x;->J:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    move-object/from16 v10, p1

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v12

    :try_start_0
    invoke-virtual {v2}, Lp1/y1;->x()Z

    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_13

    monitor-exit v12

    const/4 v12, 0x1

    if-eqz v13, :cond_2

    const-string v13, "Recomposer:animation"

    invoke-static {v13}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_1
    iget-object v13, v2, Lp1/y1;->b:Lp1/e;

    invoke-virtual {v13, v10, v11}, Lp1/e;->a(J)V

    sget-object v10, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v11, Lz1/l;->j:Lz1/a;

    iget-object v11, v11, Lz1/b;->h:La0/w0;

    if-eqz v11, :cond_0

    invoke-virtual {v11}, La0/w0;->h()Z

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v11, v12, :cond_0

    move v11, v12

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    :goto_0
    :try_start_3
    monitor-exit v10

    if-eqz v11, :cond_1

    invoke-static {}, Lz1/l;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v10

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_2
    :goto_1
    const-string v10, "Recomposer:recompose"

    invoke-static {v10}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_5
    invoke-virtual {v2}, Lp1/y1;->F()Z

    iget-object v10, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    iget-object v11, v2, Lp1/y1;->i:Lr1/c;

    iget-object v13, v11, Lr1/c;->w:[Ljava/lang/Object;

    iget v11, v11, Lr1/c;->y:I

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v11, :cond_3

    aget-object v16, v13, v15

    move-object/from16 v12, v16

    check-cast v12, Lp1/w;

    move-object v14, v3

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v15, 0x1

    const/4 v12, 0x1

    goto :goto_2

    :catchall_2
    move-exception v0

    goto/16 :goto_29

    :cond_3
    iget-object v11, v2, Lp1/y1;->i:Lr1/c;

    invoke-virtual {v11}, Lr1/c;->g()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    monitor-exit v10

    invoke-virtual {v8}, La0/w0;->b()V

    invoke-virtual {v9}, La0/w0;->b()V

    :goto_3
    move-object v10, v3

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_4

    move-object v10, v4

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    const/4 v12, 0x1

    goto/16 :goto_1a

    :cond_5
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    instance-of v10, v0, Lz1/b;

    if-eqz v10, :cond_6

    new-instance v17, Lz1/d0;

    move-object/from16 v18, v0

    check-cast v18, Lz1/b;

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lz1/d0;-><init>(Lz1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V

    const/4 v13, 0x0

    goto :goto_4

    :catchall_3
    move-exception v0

    goto/16 :goto_2a

    :cond_6
    new-instance v10, Lz1/e0;

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-direct {v10, v0, v11, v12, v13}, Lz1/e0;-><init>(Lz1/f;Lkotlin/jvm/functions/Function1;ZZ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object/from16 v17, v10

    :goto_4
    :try_start_8
    invoke-virtual/range {v17 .. v17}, Lz1/f;->j()Lz1/f;

    move-result-object v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    :try_start_9
    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    iget-wide v14, v2, Lp1/y1;->a:J

    const-wide/16 v18, 0x1

    add-long v14, v14, v18

    iput-wide v14, v2, Lp1/y1;->a:J
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    :try_start_a
    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    move v12, v13

    :goto_5
    if-ge v12, v0, :cond_7

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp1/w;

    invoke-virtual {v7, v14}, La0/w0;->a(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :catchall_4
    move-exception v0

    goto :goto_7

    :cond_7
    move-object v0, v5

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    move v12, v13

    :goto_6
    if-ge v12, v0, :cond_8

    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp1/w;

    invoke-virtual {v14}, Lp1/w;->d()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    add-int/lit8 v12, v12, 0x1

    goto :goto_6

    :cond_8
    :try_start_b
    invoke-interface {v5}, Ljava/util/List;->clear()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    goto :goto_9

    :catchall_5
    move-exception v0

    goto/16 :goto_18

    :goto_7
    :try_start_c
    invoke-virtual {v2, v0, v11}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    invoke-static/range {v2 .. v9}, Lp1/x1;->f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :try_start_d
    invoke-interface {v5}, Ljava/util/List;->clear()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :try_start_e
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    :goto_8
    :try_start_f
    invoke-virtual/range {v17 .. v17}, Lz1/f;->c()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    goto/16 :goto_17

    :catchall_6
    move-exception v0

    goto/16 :goto_19

    :catchall_7
    move-exception v0

    :try_start_10
    invoke-interface {v5}, Ljava/util/List;->clear()V

    throw v0

    :cond_9
    :goto_9
    invoke-virtual {v6}, La0/w0;->h()Z

    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    const-wide/16 v18, 0xff

    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    const/16 p1, 0x7

    if-eqz v0, :cond_f

    :try_start_11
    invoke-virtual {v7, v6}, La0/w0;->j(La0/w0;)V

    iget-object v0, v6, La0/w0;->b:[Ljava/lang/Object;

    iget-object v13, v6, La0/w0;->a:[J

    const-wide/16 v22, 0x80

    array-length v14, v13

    add-int/lit8 v14, v14, -0x2

    if-ltz v14, :cond_d

    const/4 v15, 0x0

    :goto_a
    const/16 v24, 0x8

    aget-wide v11, v13, v15
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    not-long v3, v11

    shl-long v3, v3, p1

    and-long/2addr v3, v11

    and-long v3, v3, v20

    cmp-long v3, v3, v20

    if-eqz v3, :cond_c

    sub-int v3, v15, v14

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    rsub-int/lit8 v3, v3, 0x8

    const/4 v4, 0x0

    :goto_b
    if-ge v4, v3, :cond_b

    and-long v27, v11, v18

    cmp-long v27, v27, v22

    if-gez v27, :cond_a

    shl-int/lit8 v27, v15, 0x3

    add-int v27, v27, v4

    :try_start_12
    aget-object v27, v0, v27

    check-cast v27, Lp1/w;

    invoke-virtual/range {v27 .. v27}, Lp1/w;->f()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    goto :goto_d

    :catchall_8
    move-exception v0

    :goto_c
    const/4 v3, 0x0

    goto :goto_e

    :cond_a
    :goto_d
    shr-long v11, v11, v24

    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_b
    move/from16 v4, v24

    if-ne v3, v4, :cond_e

    :cond_c
    if-eq v15, v14, :cond_e

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    goto :goto_a

    :catchall_9
    move-exception v0

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    goto :goto_c

    :cond_d
    move-object/from16 v25, v3

    move-object/from16 v26, v4

    :cond_e
    :try_start_13
    invoke-virtual {v6}, La0/w0;->b()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    goto :goto_f

    :goto_e
    :try_start_14
    invoke-virtual {v2, v0, v3}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    invoke-static/range {v2 .. v9}, Lp1/x1;->f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    :try_start_15
    invoke-virtual {v6}, La0/w0;->b()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_5

    :try_start_16
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    goto/16 :goto_8

    :catchall_a
    move-exception v0

    :try_start_17
    invoke-virtual {v6}, La0/w0;->b()V

    throw v0

    :cond_f
    const-wide/16 v22, 0x80

    :goto_f
    invoke-virtual {v7}, La0/w0;->h()Z

    move-result v0
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_5

    if-eqz v0, :cond_14

    :try_start_18
    iget-object v0, v7, La0/w0;->b:[Ljava/lang/Object;

    iget-object v11, v7, La0/w0;->a:[J

    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    if-ltz v12, :cond_13

    const/4 v13, 0x0

    :goto_10
    aget-wide v14, v11, v13
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    not-long v3, v14

    shl-long v3, v3, p1

    and-long/2addr v3, v14

    and-long v3, v3, v20

    cmp-long v3, v3, v20

    if-eqz v3, :cond_12

    sub-int v3, v13, v12

    not-int v3, v3

    ushr-int/lit8 v3, v3, 0x1f

    const/16 v24, 0x8

    rsub-int/lit8 v3, v3, 0x8

    const/4 v4, 0x0

    :goto_11
    if-ge v4, v3, :cond_11

    and-long v27, v14, v18

    cmp-long v27, v27, v22

    if-gez v27, :cond_10

    shl-int/lit8 v27, v13, 0x3

    add-int v27, v27, v4

    :try_start_19
    aget-object v27, v0, v27

    check-cast v27, Lp1/w;

    invoke-virtual/range {v27 .. v27}, Lp1/w;->g()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_b

    :cond_10
    move-object/from16 v27, v0

    const/16 v0, 0x8

    goto :goto_13

    :catchall_b
    move-exception v0

    :goto_12
    const/4 v3, 0x0

    goto :goto_15

    :goto_13
    shr-long/2addr v14, v0

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, v27

    goto :goto_11

    :cond_11
    move-object/from16 v27, v0

    const/16 v0, 0x8

    if-ne v3, v0, :cond_13

    goto :goto_14

    :cond_12
    move-object/from16 v27, v0

    const/16 v0, 0x8

    :goto_14
    if-eq v13, v12, :cond_13

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    move-object/from16 v0, v27

    goto :goto_10

    :catchall_c
    move-exception v0

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    goto :goto_12

    :cond_13
    :try_start_1a
    invoke-virtual {v7}, La0/w0;->b()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    goto :goto_16

    :goto_15
    :try_start_1b
    invoke-virtual {v2, v0, v3}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    invoke-static/range {v2 .. v9}, Lp1/x1;->f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_d

    :try_start_1c
    invoke-virtual {v7}, La0/w0;->b()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    :try_start_1d
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    goto/16 :goto_8

    :catchall_d
    move-exception v0

    :try_start_1e
    invoke-virtual {v7}, La0/w0;->b()V

    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_5

    :cond_14
    :goto_16
    :try_start_1f
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_6

    :try_start_20
    invoke-virtual/range {v17 .. v17}, Lz1/f;->c()V

    iget-object v3, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v3
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_3

    :try_start_21
    invoke-virtual {v2}, Lp1/y1;->w()Lbc3/k;
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_e

    :try_start_22
    monitor-exit v3

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v0

    invoke-virtual {v0}, Lz1/f;->m()V

    invoke-virtual {v9}, La0/w0;->b()V

    invoke-virtual {v8}, La0/w0;->b()V

    const/4 v3, 0x0

    iput-object v3, v2, Lp1/y1;->q:Ljava/util/LinkedHashSet;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_3

    :goto_17
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto/16 :goto_28

    :catchall_e
    move-exception v0

    :try_start_23
    monitor-exit v3

    throw v0
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_3

    :goto_18
    :try_start_24
    invoke-static {v10}, Lz1/f;->q(Lz1/f;)V

    throw v0
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_6

    :goto_19
    :try_start_25
    invoke-virtual/range {v17 .. v17}, Lz1/f;->c()V

    throw v0
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_3

    :goto_1a
    :try_start_26
    move-object v10, v3

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_1b
    if-ge v11, v10, :cond_16

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lp1/w;

    invoke-virtual {v2, v13, v8}, Lp1/y1;->D(Lp1/w;La0/w0;)Lp1/w;

    move-result-object v14

    if-eqz v14, :cond_15

    move-object v15, v5

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :catchall_f
    move-exception v0

    const/4 v14, 0x0

    goto/16 :goto_27

    :cond_15
    :goto_1c
    invoke-virtual {v9, v13}, La0/w0;->a(Ljava/lang/Object;)Z
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_f

    add-int/lit8 v11, v11, 0x1

    goto :goto_1b

    :cond_16
    :try_start_27
    invoke-interface {v3}, Ljava/util/List;->clear()V

    invoke-virtual {v8}, La0/w0;->h()Z

    move-result v10

    if-nez v10, :cond_18

    iget-object v10, v2, Lp1/y1;->i:Lr1/c;

    iget v10, v10, Lr1/c;->y:I

    if-eqz v10, :cond_17

    goto :goto_1d

    :cond_17
    move-object/from16 v17, v0

    goto/16 :goto_22

    :cond_18
    :goto_1d
    iget-object v10, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v10
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_3

    :try_start_28
    invoke-virtual {v2}, Lp1/y1;->z()Ljava/util/List;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v13

    const/4 v14, 0x0

    :goto_1e
    if-ge v14, v13, :cond_1a

    invoke-interface {v11, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lp1/w;

    invoke-virtual {v9, v15}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_19

    invoke-virtual {v15, v0}, Lp1/w;->v(Ljava/util/Set;)Z

    move-result v17

    if-eqz v17, :cond_19

    move-object v12, v3

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :catchall_10
    move-exception v0

    goto/16 :goto_26

    :cond_19
    :goto_1f
    add-int/lit8 v14, v14, 0x1

    const/4 v12, 0x1

    goto :goto_1e

    :cond_1a
    iget-object v11, v2, Lp1/y1;->i:Lr1/c;

    iget v12, v11, Lr1/c;->y:I

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_20
    if-ge v13, v12, :cond_1d

    iget-object v15, v11, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v15, v15, v13

    check-cast v15, Lp1/w;

    invoke-virtual {v9, v15}, La0/w0;->c(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_1b

    invoke-interface {v3, v15}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_1b

    move-object/from16 v17, v0

    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    goto :goto_21

    :cond_1b
    move-object/from16 v17, v0

    if-lez v14, :cond_1c

    iget-object v0, v11, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v15, v13, v14

    aget-object v18, v0, v13

    aput-object v18, v0, v15

    :cond_1c
    :goto_21
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v0, v17

    goto :goto_20

    :cond_1d
    move-object/from16 v17, v0

    iget-object v0, v11, Lr1/c;->w:[Ljava/lang/Object;

    sub-int v13, v12, v14

    const/4 v14, 0x0

    invoke-static {v0, v13, v12, v14}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput v13, v11, Lr1/c;->y:I
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_10

    :try_start_29
    monitor-exit v10

    :goto_22
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_3

    if-eqz v0, :cond_1f

    :try_start_2a
    invoke-static {v4, v2}, Lp1/x1;->h(Ljava/util/List;Lp1/y1;)V

    :goto_23
    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v2, v4, v8}, Lp1/y1;->C(Ljava/util/List;La0/w0;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v6, v10}, La0/w0;->k(Ljava/lang/Object;)V

    goto :goto_24

    :cond_1e
    invoke-static {v4, v2}, Lp1/x1;->h(Ljava/util/List;Lp1/y1;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_11

    goto :goto_23

    :catchall_11
    move-exception v0

    const/4 v14, 0x0

    goto :goto_25

    :cond_1f
    move-object/from16 v0, v17

    goto/16 :goto_3

    :goto_25
    :try_start_2b
    invoke-virtual {v2, v0, v14}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    invoke-static/range {v2 .. v9}, Lp1/x1;->f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V

    goto/16 :goto_17

    :goto_26
    monitor-exit v10

    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_3

    :goto_27
    :try_start_2c
    invoke-virtual {v2, v0, v14}, Lp1/y1;->E(Ljava/lang/Throwable;Lp1/w;)V

    invoke-static/range {v2 .. v9}, Lp1/x1;->f(Lp1/y1;Ljava/util/List;Ljava/util/List;Ljava/util/List;La0/w0;La0/w0;La0/w0;La0/w0;)V
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_12

    :try_start_2d
    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_3

    goto/16 :goto_17

    :goto_28
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_12
    move-exception v0

    :try_start_2e
    invoke-interface {v3}, Ljava/util/List;->clear()V

    throw v0

    :goto_29
    monitor-exit v10

    throw v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_3

    :goto_2a
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :catchall_13
    move-exception v0

    monitor-exit v12

    throw v0

    :pswitch_0
    iget-object v0, v1, Lk71/x;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lj71/c;

    iget-object v0, v1, Lk71/x;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, Lk71/x;->z:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v0, v1, Lk71/x;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    iget-object v0, v1, Lk71/x;->F:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly81/e;

    iget-object v0, v1, Lk71/x;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v0, v1, Lk71/x;->H:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lp1/c1;

    iget-object v0, v1, Lk71/x;->I:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lp1/c1;

    iget-object v0, v1, Lk71/x;->J:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lp1/c1;

    move-object/from16 v11, p1

    check-cast v11, Ld61/a;

    invoke-static/range {v2 .. v11}, Lk71/z;->m(Lj71/c;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Ld61/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
