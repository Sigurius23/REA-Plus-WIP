.class public final Lbc/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public w:Lbc/w;

.field public x:Landroid/view/ViewGroup;


# virtual methods
.method public final onPreDraw()Z
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lbc/z;->w:Lbc/w;

    iget-object v2, v0, Lbc/z;->x:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v3, Lbc/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v3

    const/4 v7, 0x1

    if-nez v3, :cond_0

    move v9, v7

    goto/16 :goto_10

    :cond_0
    invoke-static {}, Lbc/a0;->b()La0/g;

    move-result-object v3

    invoke-virtual {v3, v2}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-nez v4, :cond_2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v2, v4}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 v6, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-lez v6, :cond_1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_0
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lbc/y;

    invoke-direct {v4, v0, v3}, Lbc/y;-><init>(Lbc/z;La0/g;)V

    invoke-virtual {v1, v4}, Lbc/w;->a(Lbc/u;)V

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lbc/w;->h(Landroid/view/ViewGroup;Z)V

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbc/w;

    invoke-virtual {v6, v2}, Lbc/w;->E(Landroid/view/View;)V

    goto :goto_1

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lbc/w;->K:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lbc/w;->L:Ljava/util/ArrayList;

    iget-object v4, v1, Lbc/w;->G:La00/g;

    iget-object v6, v1, Lbc/w;->H:La00/g;

    new-instance v8, La0/g;

    iget-object v9, v4, La00/g;->x:Ljava/lang/Object;

    check-cast v9, La0/g;

    invoke-direct {v8, v9}, La0/g;-><init>(La0/g;)V

    new-instance v9, La0/g;

    iget-object v10, v6, La00/g;->x:Ljava/lang/Object;

    check-cast v10, La0/g;

    invoke-direct {v9, v10}, La0/g;-><init>(La0/g;)V

    move v10, v3

    :goto_2
    iget-object v11, v1, Lbc/w;->J:[I

    array-length v12, v11

    if-ge v10, v12, :cond_f

    aget v11, v11, v10

    if-eq v11, v7, :cond_c

    const/4 v12, 0x2

    if-eq v11, v12, :cond_a

    const/4 v12, 0x3

    if-eq v11, v12, :cond_8

    const/4 v12, 0x4

    if-eq v11, v12, :cond_4

    move-object v5, v6

    move/from16 v18, v7

    goto/16 :goto_9

    :cond_4
    iget-object v11, v4, La00/g;->z:Ljava/lang/Object;

    check-cast v11, La0/y;

    iget-object v12, v6, La00/g;->z:Ljava/lang/Object;

    check-cast v12, La0/y;

    invoke-virtual {v11}, La0/y;->i()I

    move-result v13

    move v14, v3

    :goto_3
    if-ge v14, v13, :cond_7

    invoke-virtual {v11, v14}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    if-eqz v15, :cond_6

    invoke-virtual {v1, v15}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v16

    if-eqz v16, :cond_6

    move-object/from16 v17, v6

    invoke-virtual {v11, v14}, La0/y;->f(I)J

    move-result-wide v5

    invoke-virtual {v12, v5, v6}, La0/y;->c(J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    if-eqz v5, :cond_5

    invoke-virtual {v1, v5}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v8, v15}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbc/e0;

    invoke-virtual {v9, v5}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v3, v18

    check-cast v3, Lbc/e0;

    if-eqz v6, :cond_5

    if-eqz v3, :cond_5

    move/from16 v18, v7

    iget-object v7, v1, Lbc/w;->K:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v15}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v5}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_5
    :goto_4
    move/from16 v18, v7

    goto :goto_5

    :cond_6
    move-object/from16 v17, v6

    goto :goto_4

    :goto_5
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v17

    move/from16 v7, v18

    const/4 v3, 0x0

    goto :goto_3

    :cond_7
    move/from16 v18, v7

    move-object v5, v6

    goto/16 :goto_9

    :cond_8
    move-object/from16 v17, v6

    move/from16 v18, v7

    iget-object v3, v4, La00/g;->y:Ljava/lang/Object;

    check-cast v3, Landroid/util/SparseArray;

    move-object/from16 v5, v17

    iget-object v6, v5, La00/g;->y:Ljava/lang/Object;

    check-cast v6, Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v7

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v7, :cond_e

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_9

    invoke-virtual {v1, v12}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_9

    invoke-virtual {v3, v11}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v13

    invoke-virtual {v6, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    if-eqz v13, :cond_9

    invoke-virtual {v1, v13}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-virtual {v8, v12}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lbc/e0;

    invoke-virtual {v9, v13}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lbc/e0;

    if-eqz v14, :cond_9

    if-eqz v15, :cond_9

    iget-object v0, v1, Lbc/w;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v12}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v13}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_a
    move-object v5, v6

    move/from16 v18, v7

    iget-object v0, v4, La00/g;->E:Ljava/lang/Object;

    check-cast v0, La0/g;

    iget-object v3, v5, La00/g;->E:Ljava/lang/Object;

    check-cast v3, La0/g;

    iget v6, v0, La0/f1;->y:I

    const/4 v7, 0x0

    :goto_7
    if-ge v7, v6, :cond_e

    invoke-virtual {v0, v7}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    if-eqz v11, :cond_b

    invoke-virtual {v1, v11}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-virtual {v0, v7}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v3, v12}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-eqz v12, :cond_b

    invoke-virtual {v1, v12}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_b

    invoke-virtual {v8, v11}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lbc/e0;

    invoke-virtual {v9, v12}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lbc/e0;

    if-eqz v13, :cond_b

    if-eqz v14, :cond_b

    iget-object v15, v1, Lbc/w;->K:Ljava/util/ArrayList;

    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v13, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v11}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9, v12}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_c
    move-object v5, v6

    move/from16 v18, v7

    iget v0, v8, La0/f1;->y:I

    add-int/lit8 v0, v0, -0x1

    :goto_8
    if-ltz v0, :cond_e

    invoke-virtual {v8, v0}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_d

    invoke-virtual {v1, v3}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v9, v3}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc/e0;

    if-eqz v3, :cond_d

    iget-object v6, v3, Lbc/e0;->b:Landroid/view/View;

    invoke-virtual {v1, v6}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v8, v0}, La0/f1;->i(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbc/e0;

    iget-object v7, v1, Lbc/w;->K:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_e
    :goto_9
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move-object v6, v5

    move/from16 v7, v18

    const/4 v3, 0x0

    goto/16 :goto_2

    :cond_f
    move/from16 v18, v7

    const/4 v0, 0x0

    :goto_a
    iget v3, v8, La0/f1;->y:I

    if-ge v0, v3, :cond_11

    invoke-virtual {v8, v0}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc/e0;

    iget-object v4, v3, Lbc/e0;->b:Landroid/view/View;

    invoke-virtual {v1, v4}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v4, v1, Lbc/w;->K:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Lbc/w;->L:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_11
    const/4 v0, 0x0

    :goto_b
    iget v3, v9, La0/f1;->y:I

    if-ge v0, v3, :cond_13

    invoke-virtual {v9, v0}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc/e0;

    iget-object v4, v3, Lbc/e0;->b:Landroid/view/View;

    invoke-virtual {v1, v4}, Lbc/w;->x(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_12

    iget-object v4, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, v1, Lbc/w;->K:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_12
    const/4 v4, 0x0

    :goto_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_13
    invoke-static {}, Lbc/w;->r()La0/g;

    move-result-object v0

    iget v3, v0, La0/f1;->y:I

    invoke-virtual {v2}, Landroid/view/View;->getWindowId()Landroid/view/WindowId;

    move-result-object v4

    add-int/lit8 v3, v3, -0x1

    :goto_d
    if-ltz v3, :cond_1b

    invoke-virtual {v0, v3}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/animation/Animator;

    if-eqz v5, :cond_16

    invoke-virtual {v0, v5}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lbc/q;

    if-eqz v6, :cond_16

    iget-object v7, v6, Lbc/q;->e:Lbc/w;

    iget-object v8, v6, Lbc/q;->a:Landroid/view/View;

    if-eqz v8, :cond_16

    iget-object v9, v6, Lbc/q;->d:Landroid/view/WindowId;

    invoke-virtual {v4, v9}, Landroid/view/WindowId;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    iget-object v6, v6, Lbc/q;->c:Lbc/e0;

    move/from16 v9, v18

    invoke-virtual {v1, v8, v9}, Lbc/w;->t(Landroid/view/View;Z)Lbc/e0;

    move-result-object v10

    invoke-virtual {v1, v8, v9}, Lbc/w;->p(Landroid/view/View;Z)Lbc/e0;

    move-result-object v11

    if-nez v10, :cond_14

    if-nez v11, :cond_14

    iget-object v9, v1, Lbc/w;->H:La00/g;

    iget-object v9, v9, La00/g;->x:Ljava/lang/Object;

    check-cast v9, La0/g;

    invoke-virtual {v9, v8}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Lbc/e0;

    :cond_14
    if-nez v10, :cond_15

    if-eqz v11, :cond_16

    :cond_15
    invoke-virtual {v7, v6, v11}, Lbc/w;->w(Lbc/e0;Lbc/e0;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-virtual {v7}, Lbc/w;->q()Lbc/w;

    move-result-object v6

    iget-object v8, v7, Lbc/w;->N:Ljava/util/ArrayList;

    iget-object v6, v6, Lbc/w;->Y:Lbc/t;

    if-eqz v6, :cond_17

    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, v5}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-nez v5, :cond_16

    sget-object v5, Lbc/v;->d:Lab/a;

    const/4 v6, 0x0

    invoke-virtual {v7, v7, v5, v6}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    iget-boolean v5, v7, Lbc/w;->R:Z

    if-nez v5, :cond_1a

    const/4 v9, 0x1

    iput-boolean v9, v7, Lbc/w;->R:Z

    sget-object v5, Lbc/v;->c:Lab/a;

    invoke-virtual {v7, v7, v5, v6}, Lbc/w;->z(Lbc/w;Lbc/v;Z)V

    goto :goto_f

    :cond_16
    const/4 v6, 0x0

    goto :goto_f

    :cond_17
    const/4 v6, 0x0

    invoke-virtual {v5}, Landroid/animation/Animator;->isRunning()Z

    move-result v7

    if-nez v7, :cond_19

    invoke-virtual {v5}, Landroid/animation/Animator;->isStarted()Z

    move-result v7

    if-eqz v7, :cond_18

    goto :goto_e

    :cond_18
    invoke-virtual {v0, v5}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_19
    :goto_e
    invoke-virtual {v5}, Landroid/animation/Animator;->cancel()V

    :cond_1a
    :goto_f
    add-int/lit8 v3, v3, -0x1

    const/16 v18, 0x1

    goto/16 :goto_d

    :cond_1b
    iget-object v3, v1, Lbc/w;->G:La00/g;

    iget-object v4, v1, Lbc/w;->H:La00/g;

    iget-object v5, v1, Lbc/w;->K:Ljava/util/ArrayList;

    iget-object v6, v1, Lbc/w;->L:Ljava/util/ArrayList;

    invoke-virtual/range {v1 .. v6}, Lbc/w;->l(Landroid/view/ViewGroup;La00/g;La00/g;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    iget-object v0, v1, Lbc/w;->Y:Lbc/t;

    if-nez v0, :cond_1c

    invoke-virtual {v1}, Lbc/w;->F()V

    const/16 v18, 0x1

    return v18

    :cond_1c
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v0, v2, :cond_1e

    invoke-virtual {v1}, Lbc/w;->B()V

    iget-object v0, v1, Lbc/w;->Y:Lbc/t;

    iget-object v2, v0, Lbc/t;->g:Lbc/c0;

    iget-wide v3, v2, Lbc/w;->X:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-nez v3, :cond_1d

    const-wide/16 v5, 0x1

    :cond_1d
    iget-wide v3, v0, Lbc/t;->a:J

    invoke-virtual {v2, v5, v6, v3, v4}, Lbc/c0;->G(JJ)V

    iput-wide v5, v0, Lbc/t;->a:J

    iget-object v0, v1, Lbc/w;->Y:Lbc/t;

    const/4 v9, 0x1

    iput-boolean v9, v0, Lbc/t;->b:Z

    return v9

    :cond_1e
    const/4 v9, 0x1

    :goto_10
    return v9
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lbc/z;->x:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v0, Lbc/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-static {}, Lbc/a0;->b()La0/g;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc/w;

    invoke-virtual {v1, p1}, Lbc/w;->E(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbc/z;->w:Lbc/w;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lbc/w;->i(Z)V

    return-void
.end method
