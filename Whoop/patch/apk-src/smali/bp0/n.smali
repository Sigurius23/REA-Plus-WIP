.class public final synthetic Lbp0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lbp0/n;->w:I

    iput-object p2, p0, Lbp0/n;->x:Ljava/lang/Object;

    iput-object p3, p0, Lbp0/n;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbp0/n;->w:I

    iput-object p1, p0, Lbp0/n;->y:Ljava/lang/Object;

    iput-object p2, p0, Lbp0/n;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, Lbp0/n;->w:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lp3/j;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Lp3/a0;

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function1;

    iget-object v0, v2, Lp3/j;->d:Lp3/m;

    iget-object v12, v2, Lp3/j;->a:Laj/c;

    iget-object v3, v2, Lp3/j;->f:La6/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v9, Lp3/a0;->a:Lp3/i;

    instance-of v7, v6, Lp3/l;

    if-nez v7, :cond_0

    const/4 v0, 0x0

    goto/16 :goto_1d

    :cond_0
    check-cast v6, Lp3/l;

    iget-object v6, v6, Lp3/l;->F:Ljava/util/List;

    iget-object v7, v9, Lp3/a0;->b:Lp3/r;

    iget v8, v9, Lp3/a0;->c:I

    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v13

    invoke-direct {v10, v13}, Ljava/util/ArrayList;-><init>(I)V

    move-object v13, v6

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v14

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v14, :cond_2

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lp3/x;

    iget-object v15, v15, Lp3/x;->b:Lp3/r;

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_1

    if-nez v8, :cond_1

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_15

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v13}, Ljava/util/Collection;->size()I

    move-result v5

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v5, :cond_5

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lp3/x;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v8, :cond_4

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    move-object v6, v4

    :goto_2
    check-cast v6, Ljava/util/List;

    sget-object v4, Lp3/r;->x:Lp3/r;

    invoke-virtual {v7, v4}, Lp3/r;->a(Lp3/r;)I

    move-result v4

    iget v5, v7, Lp3/r;->w:I

    if-gez v4, :cond_f

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v7, :cond_c

    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp3/x;

    iget-object v14, v14, Lp3/x;->b:Lp3/r;

    iget v15, v14, Lp3/r;->w:I

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v17

    if-gez v17, :cond_8

    move-object/from16 v17, v4

    if-eqz v8, :cond_7

    iget v4, v8, Lp3/r;->w:I

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-lez v4, :cond_a

    :cond_7
    move-object v8, v14

    goto :goto_4

    :cond_8
    move-object/from16 v17, v4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-lez v4, :cond_b

    if-eqz v10, :cond_9

    iget v4, v10, Lp3/r;->w:I

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-gez v4, :cond_a

    :cond_9
    move-object v10, v14

    :cond_a
    :goto_4
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v4, v17

    goto :goto_3

    :cond_b
    move-object v8, v14

    move-object v10, v8

    goto :goto_5

    :cond_c
    move-object/from16 v17, v4

    :goto_5
    if-nez v8, :cond_d

    move-object v8, v10

    :cond_d
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_6
    if-ge v5, v4, :cond_2e

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lp3/x;

    iget-object v13, v13, Lp3/x;->b:Lp3/r;

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_f
    sget-object v4, Lp3/r;->y:Lp3/r;

    invoke-virtual {v7, v4}, Lp3/r;->a(Lp3/r;)I

    move-result v7

    if-lez v7, :cond_18

    move-object v4, v6

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_7
    if-ge v13, v7, :cond_15

    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp3/x;

    iget-object v14, v14, Lp3/x;->b:Lp3/r;

    iget v15, v14, Lp3/r;->w:I

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v17

    if-gez v17, :cond_11

    move-object/from16 v17, v4

    if-eqz v8, :cond_10

    iget v4, v8, Lp3/r;->w:I

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-lez v4, :cond_13

    :cond_10
    move-object v8, v14

    goto :goto_8

    :cond_11
    move-object/from16 v17, v4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-lez v4, :cond_14

    if-eqz v10, :cond_12

    iget v4, v10, Lp3/r;->w:I

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v4

    if-gez v4, :cond_13

    :cond_12
    move-object v10, v14

    :cond_13
    :goto_8
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v4, v17

    goto :goto_7

    :cond_14
    move-object v8, v14

    move-object v10, v8

    goto :goto_9

    :cond_15
    move-object/from16 v17, v4

    :goto_9
    if-nez v10, :cond_16

    goto :goto_a

    :cond_16
    move-object v8, v10

    :goto_a
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_b
    if-ge v5, v4, :cond_2e

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lp3/x;

    iget-object v13, v13, Lp3/x;->b:Lp3/r;

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_17

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_18
    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_c
    if-ge v14, v8, :cond_1f

    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lp3/x;

    iget-object v15, v15, Lp3/x;->b:Lp3/r;

    move-object/from16 v17, v7

    iget v7, v15, Lp3/r;->w:I

    move/from16 v18, v8

    iget v8, v4, Lp3/r;->w:I

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-lez v7, :cond_19

    goto :goto_d

    :cond_19
    iget v7, v15, Lp3/r;->w:I

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v8

    if-gez v8, :cond_1b

    if-eqz v10, :cond_1a

    iget v8, v10, Lp3/r;->w:I

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-lez v7, :cond_1d

    :cond_1a
    move-object v10, v15

    goto :goto_d

    :cond_1b
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v8

    if-lez v8, :cond_1e

    if-eqz v13, :cond_1c

    iget v8, v13, Lp3/r;->w:I

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-gez v7, :cond_1d

    :cond_1c
    move-object v13, v15

    :cond_1d
    :goto_d
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v7, v17

    move/from16 v8, v18

    goto :goto_c

    :cond_1e
    move-object v10, v15

    move-object v13, v10

    goto :goto_e

    :cond_1f
    move-object/from16 v17, v7

    :goto_e
    if-nez v13, :cond_20

    goto :goto_f

    :cond_20
    move-object v10, v13

    :goto_f
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_10
    if-ge v8, v7, :cond_22

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lp3/x;

    iget-object v14, v14, Lp3/x;->b:Lp3/r;

    invoke-static {v14, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_21

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2d

    sget-object v4, Lp3/r;->y:Lp3/r;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v7, :cond_2a

    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp3/x;

    iget-object v14, v14, Lp3/x;->b:Lp3/r;

    if-eqz v4, :cond_23

    iget v15, v14, Lp3/r;->w:I

    move/from16 v18, v7

    iget v7, v4, Lp3/r;->w:I

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-gez v7, :cond_24

    goto :goto_12

    :cond_23
    move/from16 v18, v7

    :cond_24
    iget v7, v14, Lp3/r;->w:I

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v15

    if-gez v15, :cond_26

    if-eqz v8, :cond_25

    iget v15, v8, Lp3/r;->w:I

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-lez v7, :cond_28

    :cond_25
    move-object v8, v14

    goto :goto_12

    :cond_26
    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v15

    if-lez v15, :cond_29

    if-eqz v10, :cond_27

    iget v15, v10, Lp3/r;->w:I

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-gez v7, :cond_28

    :cond_27
    move-object v10, v14

    :cond_28
    :goto_12
    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v18

    goto :goto_11

    :cond_29
    move-object v8, v14

    move-object v10, v8

    :cond_2a
    if-nez v10, :cond_2b

    goto :goto_13

    :cond_2b
    move-object v8, v10

    :goto_13
    new-instance v10, Ljava/util/ArrayList;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v10, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_14
    if-ge v5, v4, :cond_2e

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, Lp3/x;

    iget-object v13, v13, Lp3/x;->b:Lp3/r;

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2c

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2c
    add-int/lit8 v5, v5, 0x1

    goto :goto_14

    :cond_2d
    move-object v10, v4

    :cond_2e
    :goto_15
    iget-object v4, v0, Lp3/m;->a:La3/p;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v5

    if-lez v5, :cond_33

    const/4 v5, 0x0

    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp3/x;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v4, La3/p;->z:Ljava/lang/Object;

    check-cast v6, Ljc/b;

    monitor-enter v6

    :try_start_0
    new-instance v7, Lp3/e;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v7, v5}, Lp3/e;-><init>(Lp3/x;)V

    iget-object v8, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v8, La0/a0;

    invoke-virtual {v8, v7}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lp3/d;

    if-nez v8, :cond_2f

    iget-object v8, v4, La3/p;->y:Ljava/lang/Object;

    check-cast v8, La0/v0;

    invoke-virtual {v8, v7}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lp3/d;

    goto :goto_16

    :catchall_0
    move-exception v0

    goto :goto_1b

    :cond_2f
    :goto_16
    if-eqz v8, :cond_30

    iget-object v4, v8, Lp3/d;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v6

    goto :goto_19

    :cond_30
    monitor-exit v6

    :try_start_1
    invoke-virtual {v12, v5}, Laj/c;->N(Lp3/x;)Landroid/graphics/Typeface;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_17

    :catch_0
    invoke-virtual {v3, v9}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lp3/e;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v7, v5}, Lp3/e;-><init>(Lp3/x;)V

    iget-object v8, v4, La3/p;->z:Ljava/lang/Object;

    check-cast v8, Ljc/b;

    monitor-enter v8

    if-nez v6, :cond_31

    :try_start_2
    iget-object v4, v4, La3/p;->y:Ljava/lang/Object;

    check-cast v4, La0/v0;

    new-instance v10, Lp3/d;

    const/4 v13, 0x0

    invoke-direct {v10, v13}, Lp3/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v7, v10}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_18

    :catchall_1
    move-exception v0

    goto :goto_1a

    :cond_31
    iget-object v4, v4, La3/p;->x:Ljava/lang/Object;

    check-cast v4, La0/a0;

    new-instance v10, Lp3/d;

    invoke-direct {v10, v6}, Lp3/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v7, v10}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_18
    monitor-exit v8

    move-object v4, v6

    :goto_19
    if-nez v4, :cond_32

    invoke-virtual {v3, v9}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :cond_32
    iget v3, v9, Lp3/a0;->d:I

    iget-object v6, v9, Lp3/a0;->b:Lp3/r;

    iget v7, v9, Lp3/a0;->c:I

    invoke-static {v3, v4, v5, v6, v7}, Lj93/l0;->d0(ILjava/lang/Object;Lp3/x;Lp3/r;I)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ll83/k;

    const/4 v13, 0x0

    invoke-direct {v4, v13, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1c

    :goto_1a
    monitor-exit v8

    throw v0

    :goto_1b
    monitor-exit v6

    throw v0

    :cond_33
    invoke-virtual {v3, v9}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Ll83/k;

    const/4 v13, 0x0

    invoke-direct {v4, v13, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1c
    iget-object v3, v4, Ll83/k;->w:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Ljava/util/List;

    iget-object v8, v4, Ll83/k;->x:Ljava/lang/Object;

    if-nez v7, :cond_34

    new-instance v0, Lp3/d0;

    const/4 v3, 0x1

    invoke-direct {v0, v8, v3}, Lp3/d0;-><init>(Ljava/lang/Object;Z)V

    goto :goto_1d

    :cond_34
    const/4 v3, 0x1

    new-instance v6, Lp3/c;

    iget-object v10, v0, Lp3/m;->a:La3/p;

    invoke-direct/range {v6 .. v12}, Lp3/c;-><init>(Ljava/util/List;Ljava/lang/Object;Lp3/a0;La3/p;Lkotlin/jvm/functions/Function1;Laj/c;)V

    iget-object v0, v0, Lp3/m;->b:Lhc3/d;

    sget-object v4, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, Lkd/f;

    const/16 v7, 0x18

    const/4 v13, 0x0

    invoke-direct {v5, v6, v13, v7}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v13, v4, v5, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Lp3/c0;

    invoke-direct {v0, v6}, Lp3/c0;-><init>(Lp3/c;)V

    :goto_1d
    if-nez v0, :cond_3a

    iget-object v0, v2, Lp3/j;->e:Laj/d;

    iget-object v0, v0, Laj/d;->w:Ljava/lang/Object;

    iget-object v0, v9, Lp3/a0;->a:Lp3/i;

    iget v2, v9, Lp3/a0;->c:I

    iget-object v3, v9, Lp3/a0;->b:Lp3/r;

    if-eqz v0, :cond_35

    instance-of v4, v0, Lp3/f;

    if-eqz v4, :cond_36

    :cond_35
    const/4 v13, 0x0

    goto :goto_1e

    :cond_36
    instance-of v4, v0, Lp3/t;

    if-eqz v4, :cond_37

    check-cast v0, Lp3/t;

    iget-object v0, v0, Lp3/t;->F:Ljava/lang/String;

    invoke-static {v0, v3, v2}, Ljc/a;->i(Ljava/lang/String;Lp3/r;I)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_1f

    :cond_37
    instance-of v2, v0, Lp3/u;

    if-eqz v2, :cond_38

    check-cast v0, Lp3/u;

    invoke-virtual {v0}, Lp3/u;->a()Lq30/u0;

    move-result-object v0

    invoke-virtual {v0}, Lq30/u0;->C()Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_1f

    :cond_38
    const/4 v4, 0x0

    goto :goto_20

    :goto_1e
    invoke-static {v13, v3, v2}, Ljc/a;->i(Ljava/lang/String;Lp3/r;I)Landroid/graphics/Typeface;

    move-result-object v0

    :goto_1f
    new-instance v4, Lp3/d0;

    const/4 v3, 0x1

    invoke-direct {v4, v0, v3}, Lp3/d0;-><init>(Ljava/lang/Object;Z)V

    :goto_20
    if-eqz v4, :cond_39

    move-object v0, v4

    goto :goto_21

    :cond_39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Could not load font"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3a
    :goto_21
    return-object v0

    :pswitch_0
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lp1/w;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, La0/w0;

    invoke-virtual {v2, v0}, Lp1/w;->z(Ljava/lang/Object;)V

    if-eqz v3, :cond_3b

    invoke-virtual {v3, v0}, La0/w0;->a(Ljava/lang/Object;)Z

    :cond_3b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v3, Lc03/c;

    invoke-static {v2, v3, v0}, Lm80/g;->c(Lkotlin/jvm/functions/Function1;Lc03/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ll0/c2;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Landroid/view/View;

    check-cast v0, Lp1/i0;

    iget-object v0, v2, Ll0/c2;->u:Ll0/v0;

    iget v4, v2, Ll0/c2;->t:I

    if-nez v4, :cond_3d

    sget-object v4, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v3, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_3c

    invoke-virtual {v3}, Landroid/view/View;->requestApplyInsets()V

    :cond_3c
    invoke-virtual {v3, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-static {v3, v0}, Lh5/p0;->q(Landroid/view/View;Landroidx/datastore/preferences/protobuf/l;)V

    :cond_3d
    iget v0, v2, Ll0/c2;->t:I

    const/16 v16, 0x1

    add-int/lit8 v0, v0, 0x1

    iput v0, v2, Ll0/c2;->t:I

    new-instance v0, Lb3/s0;

    const/4 v4, 0x6

    invoke-direct {v0, v4, v2, v3}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_3
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ll0/j1;

    iget-object v4, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v4, Ly2/j1;

    check-cast v0, Ly2/i1;

    iget-boolean v5, v2, Ll0/j1;->S:Z

    if-eqz v5, :cond_3e

    iget v3, v2, Ll0/j1;->O:F

    invoke-interface {v0, v3}, Ly3/c;->F(F)I

    move-result v3

    iget v2, v2, Ll0/j1;->P:F

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-static {v4, v3, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_22

    :cond_3e
    iget v5, v2, Ll0/j1;->O:F

    invoke-interface {v0, v5}, Ly3/c;->F(F)I

    move-result v5

    iget v2, v2, Ll0/j1;->P:F

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-virtual {v0, v4, v5, v2, v3}, Ly2/i1;->f(Ly2/j1;IIF)V

    :goto_22
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ll0/h1;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Ly2/j1;

    move-object v4, v0

    check-cast v4, Ly2/i1;

    iget-object v0, v2, Ll0/h1;->O:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/j;

    iget-wide v6, v0, Ly3/j;->a:J

    iget-boolean v0, v2, Ll0/h1;->P:Z

    const-wide v2, 0xffffffffL

    const/16 v8, 0x20

    if-eqz v0, :cond_3f

    shr-long v8, v6, v8

    long-to-int v0, v8

    and-long/2addr v2, v6

    long-to-int v2, v2

    invoke-static {v5, v0, v2, v4}, Ly2/i1;->o(Ly2/j1;IILy2/i1;)V

    goto :goto_23

    :cond_3f
    shr-long v8, v6, v8

    long-to-int v0, v8

    and-long/2addr v2, v6

    long-to-int v7, v2

    const/4 v8, 0x0

    const/16 v9, 0xc

    move v6, v0

    invoke-static/range {v4 .. v9}, Ly2/i1;->s(Ly2/i1;Ly2/j1;IILkotlin/jvm/functions/Function1;I)V

    :goto_23
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ll0/g1;

    iget-object v4, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v4, Ly2/j1;

    check-cast v0, Ly2/i1;

    iget-boolean v5, v2, Ll0/g1;->Q:Z

    if-eqz v5, :cond_40

    iget v3, v2, Ll0/g1;->O:F

    invoke-interface {v0, v3}, Ly3/c;->F(F)I

    move-result v3

    iget v2, v2, Ll0/g1;->P:F

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-static {v4, v3, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_24

    :cond_40
    iget v5, v2, Ll0/g1;->O:F

    invoke-interface {v0, v5}, Ly3/c;->F(F)I

    move-result v5

    iget v2, v2, Ll0/g1;->P:F

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-virtual {v0, v4, v5, v2, v3}, Ly2/i1;->f(Ly2/j1;IIF)V

    :goto_24
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lkd1/m;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v0, Lp1/i0;

    invoke-static {v2, v3, v0}, Lkd1/p;->a(Lkd1/m;Ljava/lang/Object;Lp1/i0;)Lp1/h0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v3, Lkd1/l;

    invoke-static {v2, v3, v0}, Lk71/z;->j(Lkotlin/jvm/functions/Function1;Lkd1/l;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v3, Lk71/c0;

    invoke-static {v2, v3, v0}, Lk71/q;->b(Lkotlin/jvm/functions/Function1;Lk71/c0;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v3, Lk71/m;

    invoke-static {v2, v3, v0}, Lk71/j;->p(Lkotlin/jvm/functions/Function1;Lk71/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lk01/e;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v0}, Lk01/d;->c(Lk01/e;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ljy1/c;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Ljy1/c;->d(Ljy1/c;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ljy1/c;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ljy1/a;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Ljy1/c;->e(Ljy1/c;Ljy1/a;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v3, Lny0/h;

    invoke-static {v2, v3, v0}, Ljs1/l;->e(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lf0/r1;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v2, v3, v0}, Lim1/t0;->m(Lf0/r1;Lp1/c1;Z)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Li2/j;

    iget-object v2, v1, Lbp0/n;->y:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Li2/t;

    check-cast v0, Lk2/c;

    move-object v3, v0

    check-cast v3, La3/p0;

    invoke-virtual {v3}, La3/p0;->a()V

    const/4 v7, 0x0

    const/16 v8, 0x3c

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ll83/k;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ll83/k;

    check-cast v0, Ly81/i;

    invoke-static {v2, v3, v0}, Ldc1/g;->a(Ll83/k;Ll83/k;Ly81/i;)Li2/t;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ld0/z1;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ld0/v1;

    check-cast v0, Lp1/i0;

    iget-object v0, v2, Ld0/z1;->i:Lz1/p;

    invoke-virtual {v0, v3}, Lz1/p;->add(Ljava/lang/Object;)Z

    new-instance v0, Lb3/s0;

    const/4 v4, 0x4

    invoke-direct {v0, v4, v2, v3}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_12
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ld0/z1;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ld0/z1;

    check-cast v0, Lp1/i0;

    iget-object v0, v2, Ld0/z1;->j:Lz1/p;

    invoke-virtual {v0, v3}, Lz1/p;->add(Ljava/lang/Object;)Z

    new-instance v0, Lb3/s0;

    const/4 v4, 0x3

    invoke-direct {v0, v4, v2, v3}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_13
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ld0/z1;

    check-cast v0, Lp1/i0;

    sget-object v0, Lbc3/d0;->z:Lbc3/d0;

    new-instance v4, Ld0/x1;

    const/4 v13, 0x0

    invoke-direct {v4, v3, v13}, Ld0/x1;-><init>(Ld0/z1;Lq83/d;)V

    const/4 v3, 0x1

    invoke-static {v2, v13, v0, v4, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, Ld0/y1;

    invoke-direct {v0}, Ld0/y1;-><init>()V

    return-object v0

    :pswitch_14
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ld0/l0;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ld0/j0;

    check-cast v0, Lp1/i0;

    iget-object v0, v2, Ld0/l0;->a:Lr1/c;

    invoke-virtual {v0, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object v0, v2, Ld0/l0;->b:Lp1/k1;

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v0, Lb3/s0;

    const/4 v4, 0x2

    invoke-direct {v0, v4, v2, v3}, Lb3/s0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :pswitch_15
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/onboarding/OnboardingStatus;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->d(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Lcom/whoop/data/onboarding/OnboardingStatus;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/ConfigurationDto;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;->c(Lcom/whoop/data/local/room/dao/wipeable/ConfigurationsDao_Impl;Lcom/whoop/data/local/room/entity/ConfigurationDto;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    check-cast v0, Ltb/a;

    invoke-static {v2, v3, v0}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->f(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Ln2/a;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Ln2/a;

    check-cast v0, Lch/f;

    instance-of v4, v0, Lcoil/compose/AsyncImagePainter$State$Loading;

    if-eqz v4, :cond_41

    check-cast v0, Lcoil/compose/AsyncImagePainter$State$Loading;

    goto :goto_25

    :cond_41
    instance-of v4, v0, Lcoil/compose/AsyncImagePainter$State$Error;

    if-eqz v4, :cond_43

    check-cast v0, Lcoil/compose/AsyncImagePainter$State$Error;

    iget-object v4, v0, Lcoil/compose/AsyncImagePainter$State$Error;->a:Lmh/e;

    invoke-virtual {v4}, Lmh/e;->c()Ljava/lang/Throwable;

    move-result-object v4

    instance-of v4, v4, Lcoil/request/NullRequestDataException;

    if-eqz v4, :cond_42

    if-eqz v2, :cond_43

    invoke-static {v0, v2}, Lcoil/compose/AsyncImagePainter$State$Error;->b(Lcoil/compose/AsyncImagePainter$State$Error;Ln2/a;)Lcoil/compose/AsyncImagePainter$State$Error;

    move-result-object v0

    goto :goto_25

    :cond_42
    if-eqz v3, :cond_43

    invoke-static {v0, v3}, Lcoil/compose/AsyncImagePainter$State$Error;->b(Lcoil/compose/AsyncImagePainter$State$Error;Ln2/a;)Lcoil/compose/AsyncImagePainter$State$Error;

    move-result-object v0

    :cond_43
    :goto_25
    return-object v0

    :pswitch_1a
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcg/j;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lcg/t;

    check-cast v0, Ljava/lang/String;

    const-string v4, "it"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v2, Lcg/j;->z:Lbd3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcg/r;->d:Lcg/r;

    invoke-virtual {v3, v4}, Lcg/t;->a(Lcg/t;)Z

    move-result v3

    if-eqz v3, :cond_44

    invoke-virtual {v2, v0}, Lbd3/k;->e(Ljava/lang/String;)V

    goto :goto_26

    :cond_44
    new-instance v3, La1/e;

    sget-object v4, Ltg/g;->i:Ltg/g;

    const/16 v5, 0x13

    invoke-direct {v3, v4, v5}, La1/e;-><init>(Ltg/g;I)V

    invoke-virtual {v2, v0, v3}, Lbd3/k;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :goto_26
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1b
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Lcc3/b;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/lifecycle/m;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, v2, Lcc3/b;->w:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1c
    iget-object v2, v1, Lbp0/n;->x:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    iget-object v3, v1, Lbp0/n;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v0, Lp1/i0;

    invoke-static {v2, v3, v0}, Lbp0/s;->j(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;Lp1/i0;)Lp1/h0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
