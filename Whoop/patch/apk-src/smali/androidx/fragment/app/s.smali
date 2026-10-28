.class public final Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/ViewGroup;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static f(La0/g;Landroid/view/View;)V
    .locals 4

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-static {p0, v2}, Landroidx/fragment/app/s;->f(La0/g;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final j(Landroid/view/ViewGroup;Landroidx/fragment/app/o1;)Landroidx/fragment/app/s;
    .locals 2

    const-string v0, "container"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/o1;->K()Lio/sentry/hints/j;

    move-result-object p1

    const-string v0, "fragmentManager.specialEffectsControllerFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0a0b9f

    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroidx/fragment/app/s;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/fragment/app/s;

    return-object v0

    :cond_0
    new-instance v0, Landroidx/fragment/app/s;

    invoke-direct {v0, p0}, Landroidx/fragment/app/s;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static k(Ljava/util/ArrayList;)Z
    .locals 5

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :cond_0
    :goto_0
    move v2, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/p2;

    iget-object v3, v2, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v2, v2, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/o2;

    invoke-virtual {v3}, Landroidx/fragment/app/o2;->b()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_3
    move v2, v4

    goto :goto_1

    :cond_4
    if-eqz v2, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/p2;

    iget-object v2, v2, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    return v1

    :cond_6
    return v4
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/p2;)V
    .locals 3

    const-string v0, "operation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Landroidx/fragment/app/p2;->i:Z

    if-eqz v0, :cond_0

    iget v0, p1, Landroidx/fragment/app/p2;->a:I

    iget-object v1, p1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireView()Landroid/view/View;

    move-result-object v1

    const-string v2, "operation.fragment.requireView()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2}, Lr;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, Landroidx/fragment/app/p2;->i:Z

    :cond_0
    return-void
.end method

.method public final b(ZLjava/util/ArrayList;)V
    .locals 27

    move-object/from16 v0, p0

    move/from16 v14, p1

    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "Unknown visibility "

    const/16 v4, 0x8

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v7, "operation.fragment.mView"

    const/4 v15, 0x2

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroidx/fragment/app/p2;

    iget-object v10, v9, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v10, v10, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Landroid/view/View;->getAlpha()F

    move-result v11

    cmpg-float v11, v11, v6

    if-nez v11, :cond_1

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-nez v11, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v10

    if-eqz v10, :cond_3

    if-eq v10, v5, :cond_0

    if-ne v10, v4, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v10, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget v9, v9, Landroidx/fragment/app/p2;->a:I

    if-eq v9, v15, :cond_0

    goto :goto_1

    :cond_4
    move-object v2, v8

    :goto_1
    check-cast v2, Landroidx/fragment/app/p2;

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    move-object/from16 v9, p2

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Landroidx/fragment/app/p2;

    iget-object v12, v11, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v12, v12, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-static {v12, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12}, Landroid/view/View;->getAlpha()F

    move-result v13

    cmpg-float v13, v13, v6

    if-nez v13, :cond_6

    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v13

    if-nez v13, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    move-result v12

    if-eqz v12, :cond_5

    if-eq v12, v5, :cond_8

    if-ne v12, v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-static {v12, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    :goto_2
    iget v11, v11, Landroidx/fragment/app/p2;->a:I

    if-ne v11, v15, :cond_5

    goto :goto_3

    :cond_9
    move-object v10, v8

    :goto_3
    move-object v4, v10

    check-cast v4, Landroidx/fragment/app/p2;

    invoke-static {v15}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    const-string v3, "FragmentManager"

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "Executing operations from "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " to "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v9}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/p2;

    iget-object v6, v6, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/fragment/app/p2;

    iget-object v10, v10, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v10, v10, Landroidx/fragment/app/m0;->mAnimationInfo:Landroidx/fragment/app/i0;

    iget-object v11, v6, Landroidx/fragment/app/m0;->mAnimationInfo:Landroidx/fragment/app/i0;

    iget v12, v11, Landroidx/fragment/app/i0;->b:I

    iput v12, v10, Landroidx/fragment/app/i0;->b:I

    iget v12, v11, Landroidx/fragment/app/i0;->c:I

    iput v12, v10, Landroidx/fragment/app/i0;->c:I

    iget v12, v11, Landroidx/fragment/app/i0;->d:I

    iput v12, v10, Landroidx/fragment/app/i0;->d:I

    iget v11, v11, Landroidx/fragment/app/i0;->e:I

    iput v11, v10, Landroidx/fragment/app/i0;->e:I

    goto :goto_4

    :cond_b
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v7, :cond_e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/fragment/app/p2;

    new-instance v11, Landroidx/fragment/app/g;

    invoke-direct {v11, v7, v14}, Landroidx/fragment/app/g;-><init>(Landroidx/fragment/app/p2;Z)V

    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, Landroidx/fragment/app/r;

    if-eqz v14, :cond_c

    if-ne v7, v2, :cond_d

    :goto_6
    move v9, v10

    goto :goto_7

    :cond_c
    if-ne v7, v4, :cond_d

    goto :goto_6

    :cond_d
    :goto_7
    invoke-direct {v11, v7, v14, v9}, Landroidx/fragment/app/r;-><init>(Landroidx/fragment/app/p2;ZZ)V

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, Landroidx/fragment/app/n2;

    invoke-direct {v9, v0, v7, v10}, Landroidx/fragment/app/n2;-><init>(Landroidx/fragment/app/s;Landroidx/fragment/app/p2;I)V

    iget-object v7, v7, Landroidx/fragment/app/p2;->d:Ljava/util/ArrayList;

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_e
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_f
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Landroidx/fragment/app/r;

    invoke-virtual {v11}, Landroidx/fragment/app/l;->a()Z

    move-result v11

    if-nez v11, :cond_f

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_11
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Landroidx/fragment/app/r;

    invoke-virtual {v11}, Landroidx/fragment/app/r;->b()Landroidx/fragment/app/k2;

    move-result-object v11

    if-eqz v11, :cond_11

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_12
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v7, v5

    move-object v5, v8

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroidx/fragment/app/r;

    invoke-virtual {v11}, Landroidx/fragment/app/r;->b()Landroidx/fragment/app/k2;

    move-result-object v12

    if-eqz v5, :cond_14

    if-ne v12, v5, :cond_13

    goto :goto_b

    :cond_13
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v11, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v2, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned Transition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v11, Landroidx/fragment/app/r;->b:Ljava/lang/Object;

    const-string v3, " which uses a different Transition type than other Fragments."

    invoke-static {v1, v3, v2}, Lb9/y;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_14
    :goto_b
    move-object v5, v12

    goto :goto_a

    :cond_15
    if-nez v5, :cond_16

    move-object/from16 v21, v1

    move v0, v9

    move/from16 v16, v10

    move/from16 v20, v15

    move-object v15, v3

    goto/16 :goto_1d

    :cond_16
    move-object v6, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v8

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, La0/g;

    invoke-direct {v12, v9}, La0/f1;-><init>(I)V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, La0/g;

    invoke-direct {v10, v9}, La0/f1;-><init>(I)V

    move-object/from16 v17, v13

    new-instance v13, La0/g;

    invoke-direct {v13, v9}, La0/f1;-><init>(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v18

    move-object/from16 v19, v6

    move-object v6, v11

    :goto_c
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_2d

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v11, v20

    check-cast v11, Landroidx/fragment/app/r;

    iget-object v11, v11, Landroidx/fragment/app/r;->d:Ljava/lang/Object;

    if-eqz v11, :cond_2c

    if-eqz v2, :cond_2c

    move/from16 v20, v15

    iget-object v15, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    if-eqz v4, :cond_2b

    iget-object v6, v4, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v5, v11}, Landroidx/fragment/app/k2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v5, v11}, Landroidx/fragment/app/k2;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6}, Landroidx/fragment/app/m0;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v9

    move-object/from16 v21, v1

    const-string v1, "lastIn.fragment.sharedElementSourceNames"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Landroidx/fragment/app/m0;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v1

    move-object/from16 v22, v5

    const-string v5, "firstOut.fragment.sharedElementSourceNames"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15}, Landroidx/fragment/app/m0;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v5

    move-object/from16 v23, v7

    const-string v7, "firstOut.fragment.sharedElementTargetNames"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v7

    move-object/from16 v24, v8

    const/4 v8, 0x0

    :goto_d
    const/4 v14, -0x1

    if-ge v8, v7, :cond_18

    move/from16 v16, v7

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v7

    if-eq v7, v14, :cond_17

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v9, v7, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_17
    add-int/lit8 v8, v8, 0x1

    move/from16 v7, v16

    goto :goto_d

    :cond_18
    invoke-virtual {v6}, Landroidx/fragment/app/m0;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v1

    const-string v5, "lastIn.fragment.sharedElementTargetNames"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_19

    invoke-virtual {v15}, Landroidx/fragment/app/m0;->getExitTransitionCallback()Landroidx/core/app/SharedElementCallback;

    move-result-object v5

    invoke-virtual {v6}, Landroidx/fragment/app/m0;->getEnterTransitionCallback()Landroidx/core/app/SharedElementCallback;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v15}, Landroidx/fragment/app/m0;->getEnterTransitionCallback()Landroidx/core/app/SharedElementCallback;

    move-result-object v5

    invoke-virtual {v6}, Landroidx/fragment/app/m0;->getExitTransitionCallback()Landroidx/core/app/SharedElementCallback;

    move-result-object v7

    new-instance v8, Ll83/k;

    invoke-direct {v8, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_e
    iget-object v5, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Landroidx/core/app/SharedElementCallback;

    iget-object v7, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Landroidx/core/app/SharedElementCallback;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v8

    move/from16 v16, v14

    const/4 v14, 0x0

    :goto_f
    const-string v0, "enteringNames[i]"

    move-object/from16 v17, v11

    const-string v11, "exitingNames[i]"

    if-ge v14, v8, :cond_1a

    move/from16 v25, v8

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v12, v8, v11}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v11, v17

    move/from16 v8, v25

    goto :goto_f

    :cond_1a
    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v8

    if-eqz v8, :cond_1c

    const-string v8, ">>> entering view names <<<"

    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_10
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    move-object/from16 v25, v8

    const-string v8, "Name: "

    if-eqz v14, :cond_1b

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    move-object/from16 v26, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v8, v25

    move-object/from16 v0, v26

    goto :goto_10

    :cond_1b
    move-object/from16 v26, v0

    const-string v0, ">>> exiting view names <<<"

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    move-object/from16 v25, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    move-object/from16 v0, v25

    goto :goto_11

    :cond_1c
    move-object/from16 v26, v0

    :cond_1d
    iget-object v0, v15, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const-string v8, "firstOut.fragment.mView"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v0}, Landroidx/fragment/app/s;->f(La0/g;Landroid/view/View;)V

    invoke-virtual {v10, v9}, La0/g;->n(Ljava/util/Collection;)Z

    if-eqz v5, :cond_22

    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_1e

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v8, "Executing exit callback for operation "

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1e
    invoke-virtual {v5, v9, v10}, Landroidx/core/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_23

    :goto_12
    add-int/lit8 v5, v0, -0x1

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v10, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    if-nez v8, :cond_1f

    invoke-virtual {v12, v0}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_13

    :cond_1f
    sget-object v14, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v8}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_20

    invoke-virtual {v12, v0}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v8}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v12, v8, v0}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_20
    :goto_13
    if-gez v5, :cond_21

    goto :goto_14

    :cond_21
    move v0, v5

    goto :goto_12

    :cond_22
    invoke-virtual {v10}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v12, v0}, La0/g;->n(Ljava/util/Collection;)Z

    :cond_23
    :goto_14
    iget-object v0, v6, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const-string v5, "lastIn.fragment.mView"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v13, v0}, Landroidx/fragment/app/s;->f(La0/g;Landroid/view/View;)V

    invoke-virtual {v13, v1}, La0/g;->n(Ljava/util/Collection;)Z

    invoke-virtual {v12}, La0/g;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v13, v0}, La0/g;->n(Ljava/util/Collection;)Z

    if-eqz v7, :cond_28

    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_24

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "Executing enter callback for operation "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_24
    invoke-virtual {v7, v1, v13}, Landroidx/core/app/SharedElementCallback;->onMapSharedElements(Ljava/util/List;Ljava/util/Map;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_29

    :goto_15
    add-int/lit8 v5, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v6, v26

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v13, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    if-nez v7, :cond_25

    invoke-static {v12, v0}, Landroidx/fragment/app/d2;->b(La0/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v12, v0}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_16

    :cond_25
    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v7}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_26

    invoke-static {v12, v0}, Landroidx/fragment/app/d2;->b(La0/g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-static {v7}, Lh5/h0;->f(Landroid/view/View;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v12, v0, v7}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    :goto_16
    if-gez v5, :cond_27

    goto :goto_17

    :cond_27
    move v0, v5

    move-object/from16 v26, v6

    goto :goto_15

    :cond_28
    invoke-static {v12, v13}, Landroidx/fragment/app/d2;->c(La0/g;La0/g;)V

    :cond_29
    :goto_17
    invoke-virtual {v12}, La0/g;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {v10}, La0/g;->entrySet()Ljava/util/Set;

    move-result-object v5

    new-instance v6, La0/a1;

    const/4 v7, 0x6

    invoke-direct {v6, v0, v7}, La0/a1;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x0

    invoke-static {v5, v6, v0}, Lm83/s;->C0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z

    invoke-virtual {v12}, La0/g;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v13}, La0/g;->entrySet()Ljava/util/Set;

    move-result-object v6

    new-instance v8, La0/a1;

    invoke-direct {v8, v5, v7}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v6, v8, v0}, Lm83/s;->C0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Z)Z

    invoke-virtual {v12}, La0/f1;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_2a

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Ignoring shared elements transition "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v6, v17

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " between "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " and "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->clear()V

    move/from16 v14, p1

    move-object/from16 v17, v1

    move-object/from16 v16, v9

    move/from16 v15, v20

    move-object/from16 v1, v21

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    const/4 v6, 0x0

    :goto_18
    const/4 v11, 0x0

    move v9, v0

    :goto_19
    move-object/from16 v0, p0

    goto/16 :goto_c

    :cond_2a
    move-object/from16 v6, v17

    move/from16 v14, p1

    move-object/from16 v17, v1

    move-object/from16 v16, v9

    move/from16 v15, v20

    move-object/from16 v1, v21

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    goto :goto_18

    :cond_2b
    move-object/from16 v21, v1

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move v0, v9

    goto :goto_1a

    :cond_2c
    move-object/from16 v21, v1

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move v0, v9

    move/from16 v20, v15

    :goto_1a
    move/from16 v14, p1

    move v9, v0

    move/from16 v15, v20

    move-object/from16 v1, v21

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    const/4 v11, 0x0

    goto :goto_19

    :cond_2d
    move-object/from16 v21, v1

    move-object/from16 v22, v5

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move v0, v9

    move/from16 v20, v15

    if-nez v6, :cond_30

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2f

    :cond_2e
    move-object v15, v3

    const/16 v16, 0x1

    goto :goto_1d

    :cond_2f
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/r;

    iget-object v5, v5, Landroidx/fragment/app/r;->b:Ljava/lang/Object;

    if-nez v5, :cond_30

    goto :goto_1b

    :cond_30
    new-instance v1, Landroidx/fragment/app/q;

    move/from16 v14, p1

    move-object v15, v3

    move-object v9, v12

    move-object/from16 v11, v16

    move-object/from16 v5, v22

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    const/16 v16, 0x1

    move-object v3, v2

    move-object v12, v10

    move-object/from16 v10, v17

    move-object/from16 v2, v19

    invoke-direct/range {v1 .. v14}, Landroidx/fragment/app/q;-><init>(Ljava/util/ArrayList;Landroidx/fragment/app/p2;Landroidx/fragment/app/p2;Landroidx/fragment/app/k2;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;La0/g;Ljava/util/ArrayList;Ljava/util/ArrayList;La0/g;La0/g;Z)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_31

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/r;

    iget-object v3, v3, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v3, v3, Landroidx/fragment/app/p2;->j:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_31
    :goto_1d
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/g;

    iget-object v4, v4, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v4, v4, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1e

    :cond_32
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v9, v0

    :cond_33
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_38

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/g;

    move-object/from16 v5, p0

    iget-object v6, v5, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    iget-object v7, v4, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    const-string v8, "context"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Landroidx/fragment/app/g;->b(Landroid/content/Context;)Landroidx/fragment/app/s0;

    move-result-object v6

    if-nez v6, :cond_34

    goto :goto_1f

    :cond_34
    iget-object v6, v6, Landroidx/fragment/app/s0;->b:Landroid/animation/AnimatorSet;

    if-nez v6, :cond_35

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :cond_35
    iget-object v6, v7, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v8, v7, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_36

    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v4

    if-eqz v4, :cond_33

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "Ignoring Animator set on "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " as this Fragment was involved in a Transition."

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1f

    :cond_36
    iget v6, v7, Landroidx/fragment/app/p2;->a:I

    const/4 v8, 0x3

    if-ne v6, v8, :cond_37

    iput-boolean v0, v7, Landroidx/fragment/app/p2;->i:Z

    :cond_37
    new-instance v6, Landroidx/fragment/app/i;

    invoke-direct {v6, v4}, Landroidx/fragment/app/i;-><init>(Landroidx/fragment/app/g;)V

    iget-object v4, v7, Landroidx/fragment/app/p2;->j:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v9, v16

    goto :goto_1f

    :cond_38
    move-object/from16 v5, p0

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_39
    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/g;

    iget-object v3, v1, Landroidx/fragment/app/l;->a:Landroidx/fragment/app/p2;

    iget-object v4, v3, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    const-string v6, "Ignoring Animation set on "

    if-nez v2, :cond_3a

    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_39

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " as Animations cannot run alongside Transitions."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_20

    :cond_3a
    if-eqz v9, :cond_3b

    invoke-static/range {v20 .. v20}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_39

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " as Animations cannot run alongside Animators."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_20

    :cond_3b
    new-instance v4, Landroidx/fragment/app/f;

    invoke-direct {v4, v1}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/g;)V

    iget-object v1, v3, Landroidx/fragment/app/p2;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_3c
    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 7

    const-string v0, "operations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/p2;

    iget-object v3, v3, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/o2;

    iget-object v6, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6}, Landroidx/fragment/app/o2;->d(Landroid/view/ViewGroup;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    move v2, v3

    :goto_2
    if-ge v2, v1, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/p2;

    invoke-virtual {p0, v4}, Landroidx/fragment/app/s;->a(Landroidx/fragment/app/p2;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_3
    if-ge v3, v0, :cond_4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/p2;

    iget-object v2, v1, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/p2;->b()V

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    return-void
.end method

.method public final d(IILandroidx/fragment/app/z1;)V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p3, Landroidx/fragment/app/z1;->c:Landroidx/fragment/app/m0;

    const-string v2, "fragmentStateManager.fragment"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Landroidx/fragment/app/s;->g(Landroidx/fragment/app/m0;)Landroidx/fragment/app/p2;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p3, Landroidx/fragment/app/z1;->c:Landroidx/fragment/app/m0;

    iget-boolean v2, v1, Landroidx/fragment/app/m0;->mTransitioning:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Landroidx/fragment/app/s;->h(Landroidx/fragment/app/m0;)Landroidx/fragment/app/p2;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, p2}, Landroidx/fragment/app/p2;->d(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :cond_2
    :try_start_1
    new-instance v1, Landroidx/fragment/app/p2;

    invoke-direct {v1, p1, p2, p3}, Landroidx/fragment/app/p2;-><init>(IILandroidx/fragment/app/z1;)V

    iget-object p1, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Landroidx/fragment/app/n2;

    const/4 p2, 0x0

    invoke-direct {p1, p0, v1, p2}, Landroidx/fragment/app/n2;-><init>(Landroidx/fragment/app/s;Landroidx/fragment/app/p2;I)V

    iget-object p2, v1, Landroidx/fragment/app/p2;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Landroidx/fragment/app/n2;

    const/4 p2, 0x2

    invoke-direct {p1, p0, v1, p2}, Landroidx/fragment/app/n2;-><init>(Landroidx/fragment/app/s;Landroidx/fragment/app/p2;I)V

    iget-object p2, v1, Landroidx/fragment/app/p2;->d:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final e()V
    .locals 9

    iget-boolean v0, p0, Landroidx/fragment/app/s;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/s;->i()V

    iput-boolean v1, p0, Landroidx/fragment/app/s;->e:Z

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/p2;

    iget-object v6, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_2

    iget-object v6, v4, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-boolean v6, v6, Landroidx/fragment/app/m0;->mTransitioning:Z

    if-eqz v6, :cond_2

    goto :goto_1

    :catchall_0
    move-exception v1

    goto/16 :goto_8

    :cond_2
    move v5, v1

    :goto_1
    iput-boolean v5, v4, Landroidx/fragment/app/p2;->g:Z

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/p2;

    iget-boolean v6, p0, Landroidx/fragment/app/s;->d:Z

    if-eqz v6, :cond_6

    invoke-static {v4}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SpecialEffectsController: Completing non-seekable operation "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/p2;->b()V

    goto :goto_3

    :cond_6
    invoke-static {v4}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v4

    if-eqz v4, :cond_7

    const-string v4, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SpecialEffectsController: Cancelling operation "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iget-object v4, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v3, v4}, Landroidx/fragment/app/p2;->a(Landroid/view/ViewGroup;)V

    :goto_3
    iput-boolean v1, p0, Landroidx/fragment/app/s;->d:Z

    iget-boolean v4, v3, Landroidx/fragment/app/p2;->f:Z

    if-nez v4, :cond_4

    iget-object v4, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    iget-object v2, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    invoke-virtual {p0}, Landroidx/fragment/app/s;->n()V

    iget-object v2, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_9

    monitor-exit v0

    return-void

    :cond_9
    :try_start_1
    iget-object v3, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-static {v4}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v3

    if-eqz v3, :cond_a

    const-string v3, "FragmentManager"

    const-string v6, "SpecialEffectsController: Executing pending operations"

    invoke-static {v3, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-boolean v3, p0, Landroidx/fragment/app/s;->e:Z

    invoke-virtual {p0, v3, v2}, Landroidx/fragment/app/s;->b(ZLjava/util/ArrayList;)V

    invoke-static {v2}, Landroidx/fragment/app/s;->k(Ljava/util/ArrayList;)Z

    move-result v3

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v7, v5

    :cond_b
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/p2;

    iget-object v8, v8, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-boolean v8, v8, Landroidx/fragment/app/m0;->mTransitioning:Z

    if-nez v8, :cond_b

    move v7, v1

    goto :goto_4

    :cond_c
    if-eqz v7, :cond_d

    if-nez v3, :cond_d

    goto :goto_5

    :cond_d
    move v5, v1

    :goto_5
    iput-boolean v5, p0, Landroidx/fragment/app/s;->d:Z

    invoke-static {v4}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v5

    if-eqz v5, :cond_e

    const-string v5, "FragmentManager"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SpecialEffectsController: Operation seekable = "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, " \ntransition = "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    if-nez v7, :cond_f

    invoke-virtual {p0, v2}, Landroidx/fragment/app/s;->m(Ljava/util/List;)V

    invoke-virtual {p0, v2}, Landroidx/fragment/app/s;->c(Ljava/util/List;)V

    goto :goto_7

    :cond_f
    if-eqz v3, :cond_10

    invoke-virtual {p0, v2}, Landroidx/fragment/app/s;->m(Ljava/util/List;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v5, v1

    :goto_6
    if-ge v5, v3, :cond_10

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/fragment/app/p2;

    invoke-virtual {p0, v6}, Landroidx/fragment/app/s;->a(Landroidx/fragment/app/p2;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_10
    :goto_7
    iput-boolean v1, p0, Landroidx/fragment/app/s;->e:Z

    invoke-static {v4}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_11

    const-string v1, "FragmentManager"

    const-string v2, "SpecialEffectsController: Finished executing pending operations"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_11
    monitor-exit v0

    return-void

    :goto_8
    monitor-exit v0

    throw v1
.end method

.method public final g(Landroidx/fragment/app/m0;)Landroidx/fragment/app/p2;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/p2;

    iget-object v3, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v2, v2, Landroidx/fragment/app/p2;->e:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Landroidx/fragment/app/p2;

    return-object v1
.end method

.method public final h(Landroidx/fragment/app/m0;)Landroidx/fragment/app/p2;
    .locals 4

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroidx/fragment/app/p2;

    iget-object v3, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-boolean v2, v2, Landroidx/fragment/app/p2;->e:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Landroidx/fragment/app/p2;

    return-object v1
.end method

.method public final i()V
    .locals 10

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "FragmentManager"

    const-string v2, "SpecialEffectsController: Forcing all operations to complete"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    iget-object v2, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/s;->n()V

    iget-object v3, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v3}, Landroidx/fragment/app/s;->m(Ljava/util/List;)V

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/p2;

    iput-boolean v6, v5, Landroidx/fragment/app/p2;->g:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/p2;

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v5

    if-eqz v5, :cond_3

    if-eqz v1, :cond_2

    const-string v5, ""

    goto :goto_2

    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Container "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, " is not attached to window. "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_2
    const-string v7, "FragmentManager"

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SpecialEffectsController: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Cancelling running operation "

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iget-object v5, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v4, v5}, Landroidx/fragment/app/p2;->a(Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_4
    iget-object v3, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/p2;

    iput-boolean v6, v5, Landroidx/fragment/app/p2;->g:Z

    goto :goto_3

    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/fragment/app/p2;

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v5

    if-eqz v5, :cond_7

    if-eqz v1, :cond_6

    const-string v5, ""

    goto :goto_5

    :cond_6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Container "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " is not attached to window. "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_5
    const-string v6, "FragmentManager"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SpecialEffectsController: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "Cancelling pending operation "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iget-object v5, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v4, v5}, Landroidx/fragment/app/p2;->a(Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_8
    monitor-exit v2

    return-void

    :goto_6
    monitor-exit v2

    throw v0
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/s;->n()V

    iget-object v1, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/fragment/app/p2;

    iget-object v5, v4, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v5, v5, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const-string v6, "operation.fragment.mView"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/view/View;->getAlpha()F

    move-result v6

    const/4 v7, 0x0

    cmpg-float v6, v6, v7

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-nez v6, :cond_1

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eqz v5, :cond_3

    if-eq v5, v8, :cond_4

    const/16 v6, 0x8

    if-ne v5, v6, :cond_2

    const/4 v8, 0x3

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown visibility "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move v8, v7

    :cond_4
    :goto_0
    iget v4, v4, Landroidx/fragment/app/p2;->a:I

    if-ne v4, v7, :cond_0

    if-eq v8, v7, :cond_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_5
    move-object v2, v3

    :goto_1
    check-cast v2, Landroidx/fragment/app/p2;

    if-eqz v2, :cond_6

    iget-object v3, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->isPostponed()Z

    move-result v1

    goto :goto_2

    :cond_7
    const/4 v1, 0x0

    :goto_2
    iput-boolean v1, p0, Landroidx/fragment/app/s;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0

    throw v1
.end method

.method public final m(Ljava/util/List;)V
    .locals 11

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_7

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/p2;

    iget-object v4, v3, Landroidx/fragment/app/p2;->l:Landroidx/fragment/app/z1;

    iget-boolean v5, v3, Landroidx/fragment/app/p2;->h:Z

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v5, 0x1

    iput-boolean v5, v3, Landroidx/fragment/app/p2;->h:Z

    iget v5, v3, Landroidx/fragment/app/p2;->b:I

    const/4 v6, 0x2

    const-string v7, " for Fragment "

    const-string v8, "FragmentManager"

    const-string v9, "fragmentStateManager.fragment"

    if-ne v5, v6, :cond_4

    iget-object v5, v4, Landroidx/fragment/app/z1;->c:Landroidx/fragment/app/m0;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v5, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-virtual {v5, v9}, Landroidx/fragment/app/m0;->setFocusedView(Landroid/view/View;)V

    invoke-static {v6}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v6

    if-eqz v6, :cond_1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v10, "requestFocus: Saved focused view "

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v8, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v3, v3, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->requireView()Landroid/view/View;

    move-result-object v3

    const-string v6, "this.fragment.requireView()"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v6, :cond_2

    invoke-virtual {v4}, Landroidx/fragment/app/z1;->b()V

    invoke-virtual {v3, v7}, Landroid/view/View;->setAlpha(F)V

    :cond_2
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v4

    cmpg-float v4, v4, v7

    if-nez v4, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_3

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    invoke-virtual {v5}, Landroidx/fragment/app/m0;->getPostOnViewCreatedAlpha()F

    move-result v4

    invoke-virtual {v3, v4}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1

    :cond_4
    const/4 v3, 0x3

    if-ne v5, v3, :cond_6

    iget-object v3, v4, Landroidx/fragment/app/z1;->c:Landroidx/fragment/app/m0;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroidx/fragment/app/m0;->requireView()Landroid/view/View;

    move-result-object v4

    const-string v5, "fragment.requireView()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Clearing focus "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " on view "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v8, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->clearFocus()V

    :cond_6
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_7
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/p2;

    iget-object v2, v2, Landroidx/fragment/app/p2;->k:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_8
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    :goto_3
    if-ge v1, v0, :cond_9

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/o2;

    iget-object v3, p0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-virtual {v2, v3}, Landroidx/fragment/app/o2;->g(Landroid/view/ViewGroup;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    return-void
.end method

.method public final n()V
    .locals 5

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/p2;

    iget v2, v1, Landroidx/fragment/app/p2;->b:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_0

    iget-object v2, v1, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->requireView()Landroid/view/View;

    move-result-object v2

    const-string v4, "fragment.requireView()"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x4

    if-eq v2, v3, :cond_2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    const/4 v3, 0x3

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown visibility "

    invoke-static {v2, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    const/4 v2, 0x1

    invoke-virtual {v1, v3, v2}, Landroidx/fragment/app/p2;->d(II)V

    goto :goto_0

    :cond_3
    return-void
.end method
