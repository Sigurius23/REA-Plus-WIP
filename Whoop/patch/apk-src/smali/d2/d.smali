.class public final Ld2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final E:J

.field public F:Ld2/a;

.field public G:Z

.field public final H:Ldc3/h;

.field public final I:Landroid/os/Handler;

.field public J:La0/g0;

.field public K:J

.field public final L:La0/g0;

.field public M:Lb3/w2;

.field public N:Z

.field public final O:Landroidx/lifecycle/z0;

.field public final w:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final x:Landroidx/room/u0;

.field public y:Le3/a;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/room/u0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Ld2/d;->x:Landroidx/room/u0;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ld2/d;->z:Ljava/util/ArrayList;

    const-wide/16 v0, 0x64

    iput-wide v0, p0, Ld2/d;->E:J

    sget-object p2, Ld2/a;->w:Ld2/a;

    iput-object p2, p0, Ld2/d;->F:Ld2/a;

    const/4 p2, 0x1

    iput-boolean p2, p0, Ld2/d;->G:Z

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p2, v1, v0}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p2

    iput-object p2, p0, Ld2/d;->H:Ldc3/h;

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Ld2/d;->I:Landroid/os/Handler;

    sget-object p2, La0/t;->a:La0/g0;

    const-string v0, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ld2/d;->J:La0/g0;

    new-instance v1, La0/g0;

    invoke-direct {v1}, La0/g0;-><init>()V

    iput-object v1, p0, Ld2/d;->L:La0/g0;

    new-instance v1, Lb3/w2;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object p1

    invoke-virtual {p1}, Li3/r;->a()Li3/p;

    move-result-object p1

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1, p2}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    iput-object v1, p0, Ld2/d;->M:Lb3/w2;

    new-instance p1, Landroidx/lifecycle/z0;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ld2/d;->O:Landroidx/lifecycle/z0;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Ld2/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld2/c;

    iget v1, v0, Ld2/c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld2/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld2/c;

    invoke-direct {v0, p0, p1}, Ld2/c;-><init>(Ld2/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld2/c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld2/c;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Ld2/c;->w:Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Ld2/c;->w:Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld2/d;->H:Ldc3/h;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ldc3/c;

    invoke-direct {v2, p1}, Ldc3/c;-><init>(Ldc3/h;)V

    :cond_4
    :goto_1
    iput-object v2, v0, Ld2/c;->w:Ldc3/c;

    iput v4, v0, Ld2/c;->z:I

    invoke-virtual {v2, v0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v2}, Ldc3/c;->c()Ljava/lang/Object;

    invoke-virtual {p0}, Ld2/d;->e()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Ld2/d;->f()V

    :cond_6
    iget-boolean p1, p0, Ld2/d;->N:Z

    if-nez p1, :cond_7

    iput-boolean v4, p0, Ld2/d;->N:Z

    iget-object p1, p0, Ld2/d;->I:Landroid/os/Handler;

    iget-object v5, p0, Ld2/d;->O:Landroidx/lifecycle/z0;

    invoke-virtual {p1, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_7
    iput-object v2, v0, Ld2/c;->w:Ldc3/c;

    iput v3, v0, Ld2/c;->z:I

    iget-wide v5, p0, Ld2/d;->E:J

    invoke-static {v5, v6, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_3
    return-object v1

    :cond_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(La0/s;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, La0/s;->b:[I

    iget-object v3, v1, La0/s;->a:[J

    array-length v4, v3

    add-int/lit8 v4, v4, -0x2

    if-ltz v4, :cond_14

    const/4 v6, 0x0

    :goto_0
    aget-wide v7, v3, v6

    not-long v9, v7

    const/4 v11, 0x7

    shl-long/2addr v9, v11

    and-long/2addr v9, v7

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v9, v12

    cmp-long v9, v9, v12

    if-eqz v9, :cond_13

    sub-int v9, v6, v4

    not-int v9, v9

    ushr-int/lit8 v9, v9, 0x1f

    const/16 v10, 0x8

    rsub-int/lit8 v9, v9, 0x8

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v9, :cond_12

    const-wide/16 v15, 0xff

    and-long v17, v7, v15

    const-wide/16 v19, 0x80

    cmp-long v17, v17, v19

    if-gez v17, :cond_11

    shl-int/lit8 v17, v6, 0x3

    add-int v17, v17, v14

    aget v5, v2, v17

    move/from16 v17, v11

    iget-object v11, v0, Ld2/d;->L:La0/g0;

    invoke-virtual {v11, v5}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lb3/w2;

    invoke-virtual {v1, v5}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li3/q;

    const/16 v21, 0x0

    if-eqz v5, :cond_0

    iget-object v5, v5, Li3/q;->a:Li3/p;

    goto :goto_2

    :cond_0
    move-object/from16 v5, v21

    :goto_2
    if-eqz v5, :cond_10

    move-wide/from16 v22, v12

    iget v12, v5, Li3/p;->g:I

    iget-object v5, v5, Li3/p;->d:Li3/l;

    if-nez v11, :cond_8

    iget-object v11, v5, Li3/l;->w:La0/v0;

    iget-object v13, v11, La0/v0;->b:[Ljava/lang/Object;

    iget-object v11, v11, La0/v0;->a:[J

    move-wide/from16 v24, v15

    array-length v15, v11

    add-int/lit8 v15, v15, -0x2

    move-object/from16 v26, v2

    if-ltz v15, :cond_6

    move/from16 v16, v10

    const/4 v10, 0x0

    :goto_3
    aget-wide v1, v11, v10

    move-wide/from16 v27, v7

    not-long v7, v1

    shl-long v7, v7, v17

    and-long/2addr v7, v1

    and-long v7, v7, v22

    cmp-long v7, v7, v22

    if-eqz v7, :cond_5

    sub-int v7, v10, v15

    not-int v7, v7

    ushr-int/lit8 v7, v7, 0x1f

    rsub-int/lit8 v7, v7, 0x8

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v7, :cond_4

    and-long v29, v1, v24

    cmp-long v29, v29, v19

    if-gez v29, :cond_2

    shl-int/lit8 v29, v10, 0x3

    add-int v29, v29, v8

    aget-object v29, v13, v29

    move-wide/from16 v30, v1

    move-object/from16 v1, v29

    check-cast v1, Li3/y;

    sget-object v2, Li3/u;->a:Li3/y;

    sget-object v2, Li3/u;->A:Li3/y;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v5, v2}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/g;

    goto :goto_5

    :cond_1
    move-object/from16 v1, v21

    :goto_5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Ld2/d;->j(ILjava/lang/String;)V

    goto :goto_6

    :cond_2
    move-wide/from16 v30, v1

    :cond_3
    :goto_6
    shr-long v1, v30, v16

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_4
    move/from16 v1, v16

    if-ne v7, v1, :cond_7

    :cond_5
    if-eq v10, v15, :cond_7

    add-int/lit8 v10, v10, 0x1

    move-wide/from16 v7, v27

    const/16 v16, 0x8

    goto :goto_3

    :cond_6
    move-wide/from16 v27, v7

    :cond_7
    move v15, v14

    goto/16 :goto_d

    :cond_8
    move-object/from16 v26, v2

    move-wide/from16 v27, v7

    move-wide/from16 v24, v15

    iget-object v1, v5, Li3/l;->w:La0/v0;

    iget-object v2, v1, La0/v0;->b:[Ljava/lang/Object;

    iget-object v1, v1, La0/v0;->a:[J

    array-length v7, v1

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_7

    move-object v13, v1

    move-object v10, v2

    const/4 v8, 0x0

    :goto_7
    aget-wide v1, v13, v8

    move-object/from16 v29, v13

    move v15, v14

    not-long v13, v1

    shl-long v13, v13, v17

    and-long/2addr v13, v1

    and-long v13, v13, v22

    cmp-long v13, v13, v22

    if-eqz v13, :cond_e

    sub-int v13, v8, v7

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v16, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v13, :cond_d

    and-long v30, v1, v24

    cmp-long v30, v30, v19

    if-gez v30, :cond_c

    shl-int/lit8 v30, v8, 0x3

    add-int v30, v30, v14

    aget-object v30, v10, v30

    move-wide/from16 v31, v1

    move-object/from16 v1, v30

    check-cast v1, Li3/y;

    sget-object v2, Li3/u;->a:Li3/y;

    sget-object v2, Li3/u;->A:Li3/y;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v11, Lb3/w2;->a:Li3/l;

    invoke-static {v1, v2}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_9

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/g;

    goto :goto_9

    :cond_9
    move-object/from16 v1, v21

    :goto_9
    invoke-static {v5, v2}, Li3/s;->d(Li3/l;Li3/y;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_a

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/g;

    goto :goto_a

    :cond_a
    move-object/from16 v2, v21

    :goto_a
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v12, v1}, Ld2/d;->j(ILjava/lang/String;)V

    :cond_b
    :goto_b
    const/16 v1, 0x8

    goto :goto_c

    :cond_c
    move-wide/from16 v31, v1

    goto :goto_b

    :goto_c
    shr-long v30, v31, v1

    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v1, v30

    goto :goto_8

    :cond_d
    const/16 v1, 0x8

    if-ne v13, v1, :cond_f

    :cond_e
    if-eq v8, v7, :cond_f

    add-int/lit8 v8, v8, 0x1

    move v14, v15

    move-object/from16 v13, v29

    goto/16 :goto_7

    :cond_f
    :goto_d
    const/16 v1, 0x8

    goto :goto_e

    :cond_10
    const-string v1, "no value for specified key"

    invoke-static {v1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v1

    throw v1

    :cond_11
    move-object/from16 v26, v2

    move-wide/from16 v27, v7

    move/from16 v17, v11

    move-wide/from16 v22, v12

    move v15, v14

    move v1, v10

    :goto_e
    shr-long v7, v27, v1

    add-int/lit8 v14, v15, 0x1

    move v10, v1

    move/from16 v11, v17

    move-wide/from16 v12, v22

    move-object/from16 v2, v26

    move-object/from16 v1, p1

    goto/16 :goto_1

    :cond_12
    move-object/from16 v26, v2

    move v1, v10

    if-ne v9, v1, :cond_14

    goto :goto_f

    :cond_13
    move-object/from16 v26, v2

    :goto_f
    if-eq v6, v4, :cond_14

    add-int/lit8 v6, v6, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    goto/16 :goto_0

    :cond_14
    return-void
.end method

.method public final c(Li3/p;Lc93/m;)V
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-static {v0, p1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Li3/p;

    invoke-virtual {p0}, Ld2/d;->d()La0/s;

    move-result-object v5

    iget v4, v4, Li3/p;->g:I

    invoke-virtual {v5, v4}, La0/s;->a(I)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d()La0/s;
    .locals 2

    iget-boolean v0, p0, Ld2/d;->G:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld2/d;->G:Z

    iget-object v0, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v0

    invoke-static {v0}, Li3/s;->b(Li3/r;)La0/g0;

    move-result-object v0

    iput-object v0, p0, Ld2/d;->J:La0/g0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ld2/d;->K:J

    :cond_0
    iget-object v0, p0, Ld2/d;->J:La0/g0;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Ld2/d;->y:Le3/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f()V
    .locals 7

    iget-object v0, p0, Ld2/d;->y:Le3/a;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v1, v2, :cond_1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Ld2/d;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_5

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld2/e;

    iget-object v5, v4, Ld2/e;->c:Ld2/f;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_3

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    iget v4, v4, Ld2/e;->a:I

    int-to-long v4, v4

    invoke-virtual {v0, v4, v5}, Le3/a;->b(J)Landroid/view/autofill/AutofillId;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v0, v4}, Le3/a;->e(Landroid/view/autofill/AutofillId;)V

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    iget-object v4, v4, Ld2/e;->d:Lbu/c;

    if-eqz v4, :cond_4

    iget-object v4, v4, Lbu/c;->w:Ljava/lang/Object;

    check-cast v4, Landroid/view/ViewStructure;

    invoke-virtual {v0, v4}, Le3/a;->d(Landroid/view/ViewStructure;)V

    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Le3/a;->a()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_6
    :goto_2
    return-void
.end method

.method public final g(Li3/p;Lb3/w2;)V
    .locals 5

    new-instance v0, La3/n1;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p2, p0}, La3/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v0}, Ld2/d;->c(Li3/p;Lc93/m;)V

    const/4 p2, 0x4

    invoke-static {p2, p1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li3/p;

    invoke-virtual {p0}, Ld2/d;->d()La0/s;

    move-result-object v2

    iget v3, v1, Li3/p;->g:I

    invoke-virtual {v2, v3}, La0/s;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Ld2/d;->L:La0/g0;

    invoke-virtual {v2, v3}, La0/s;->a(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    check-cast v2, Lb3/w2;

    invoke-virtual {p0, v1, v2}, Ld2/d;->g(Li3/p;Lb3/w2;)V

    goto :goto_1

    :cond_0
    const-string p1, "node not present in pruned tree before this change"

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final j(ILjava/lang/String;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld2/d;->y:Le3/a;

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Le3/a;->b(J)Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1, p2}, Le3/a;->f(Landroid/view/autofill/AutofillId;Ljava/lang/String;)V

    return-void

    :cond_2
    const-string p1, "Invalid content capture ID"

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1
.end method

.method public final l(ILi3/p;)V
    .locals 13

    invoke-virtual {p0}, Ld2/d;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p2, Li3/p;->d:Li3/l;

    iget-object v0, v0, Li3/l;->w:La0/v0;

    sget-object v1, Li3/u;->C:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    check-cast v1, Ljava/lang/Boolean;

    iget-object v3, p0, Ld2/d;->F:Ld2/a;

    sget-object v4, Ld2/a;->w:Ld2/a;

    if-ne v3, v4, :cond_3

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    sget-object v1, Li3/k;->l:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    move-object v0, v2

    :cond_2
    check-cast v0, Li3/a;

    if-eqz v0, :cond_5

    iget-object v0, v0, Li3/a;->b:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    iget-object v3, p0, Ld2/d;->F:Ld2/a;

    sget-object v4, Ld2/a;->x:Ld2/a;

    if-ne v3, v4, :cond_5

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Li3/k;->l:Li3/y;

    invoke-virtual {v0, v1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    move-object v0, v2

    :cond_4
    check-cast v0, Li3/a;

    if-eqz v0, :cond_5

    iget-object v0, v0, Li3/a;->b:Ll83/e;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_5

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    :cond_5
    :goto_0
    iget v4, p2, Li3/p;->g:I

    iget-object v0, p0, Ld2/d;->y:Le3/a;

    if-nez v0, :cond_6

    :goto_1
    move-object v8, v2

    goto/16 :goto_3

    :cond_6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-ge v1, v3, :cond_7

    goto :goto_1

    :cond_7
    iget-object v1, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v1}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v1

    invoke-virtual {p2}, Li3/p;->l()Li3/p;

    move-result-object v3

    iget v5, p2, Li3/p;->g:I

    if-eqz v3, :cond_8

    iget v1, v3, Li3/p;->g:I

    int-to-long v6, v1

    invoke-virtual {v0, v6, v7}, Le3/a;->b(J)Landroid/view/autofill/AutofillId;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_8
    int-to-long v6, v5

    invoke-virtual {v0, v1, v6, v7}, Le3/a;->c(Landroid/view/autofill/AutofillId;J)Lbu/c;

    move-result-object v0

    if-nez v0, :cond_9

    goto :goto_1

    :cond_9
    iget-object v1, v0, Lbu/c;->w:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Landroid/view/ViewStructure;

    iget-object v1, p2, Li3/p;->d:Li3/l;

    sget-object v3, Li3/u;->J:Li3/y;

    iget-object v7, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v7, v3}, La0/v0;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_1

    :cond_a
    invoke-virtual {v6}, Landroid/view/ViewStructure;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_b

    const-string v8, "android.view.contentcapture.EventTimestamp"

    iget-wide v9, p0, Ld2/d;->K:J

    invoke-virtual {v3, v8, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX"

    invoke-virtual {v3, v8, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_b
    sget-object p1, Li3/u;->y:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_c

    move-object p1, v2

    :cond_c
    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_d

    invoke-virtual {v6, v5, v2, v2, p1}, Landroid/view/ViewStructure;->setId(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_d
    sget-object p1, Li3/u;->m:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_e

    move-object p1, v2

    :cond_e
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_f

    const-string p1, "android.widget.ViewGroup"

    invoke-virtual {v6, p1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    :cond_f
    sget-object p1, Li3/u;->A:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_10

    move-object p1, v2

    :cond_10
    check-cast p1, Ljava/util/List;

    const/16 v3, 0x3e

    const-string v5, "\n"

    if-eqz p1, :cond_11

    const-string v8, "android.widget.TextView"

    invoke-virtual {v6, v8}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    invoke-static {v3, v5, p1, v2}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    :cond_11
    sget-object p1, Li3/u;->E:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_12

    move-object p1, v2

    :cond_12
    check-cast p1, Ll3/g;

    if-eqz p1, :cond_13

    const-string v8, "android.widget.EditText"

    invoke-virtual {v6, v8}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Landroid/view/ViewStructure;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    sget-object p1, Li3/u;->a:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_14

    move-object p1, v2

    :cond_14
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_15

    invoke-static {v3, v5, p1, v2}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Landroid/view/ViewStructure;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_15
    sget-object p1, Li3/u;->x:Li3/y;

    invoke-virtual {v7, p1}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_16

    move-object p1, v2

    :cond_16
    check-cast p1, Li3/i;

    if-eqz p1, :cond_17

    iget p1, p1, Li3/i;->a:I

    invoke-static {p1}, Lb3/o0;->p(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_17

    invoke-virtual {v6, p1}, Landroid/view/ViewStructure;->setClassName(Ljava/lang/String;)V

    :cond_17
    invoke-static {v1}, Lb3/o0;->l(Li3/l;)Ll3/r0;

    move-result-object p1

    if-eqz p1, :cond_18

    iget-object p1, p1, Ll3/r0;->a:Ll3/q0;

    iget-object v1, p1, Ll3/q0;->b:Ll3/v0;

    iget-object p1, p1, Ll3/q0;->g:Ly3/c;

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v7, v1, Ll3/m0;->b:J

    invoke-static {v7, v8}, Ly3/o;->c(J)F

    move-result v1

    invoke-interface {p1}, Ly3/c;->getDensity()F

    move-result v3

    mul-float/2addr v3, v1

    invoke-interface {p1}, Ly3/c;->m0()F

    move-result p1

    mul-float/2addr p1, v3

    const/4 v1, 0x0

    invoke-virtual {v6, p1, v1, v1, v1}, Landroid/view/ViewStructure;->setTextStyle(FIII)V

    :cond_18
    invoke-virtual {p2}, Li3/p;->d()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object p1

    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v1

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-eqz v1, :cond_19

    move-object v2, p1

    :cond_19
    if-eqz v2, :cond_1a

    invoke-virtual {p2, v2}, Li3/p;->a(Landroidx/compose/ui/node/NodeCoordinator;)Lh2/c;

    move-result-object p1

    goto :goto_2

    :cond_1a
    sget-object p1, Lh2/c;->e:Lh2/c;

    :goto_2
    iget v1, p1, Lh2/c;->a:F

    float-to-int v7, v1

    iget v2, p1, Lh2/c;->b:F

    float-to-int v8, v2

    iget v3, p1, Lh2/c;->c:F

    sub-float/2addr v3, v1

    float-to-int v11, v3

    iget p1, p1, Lh2/c;->d:F

    sub-float/2addr p1, v2

    float-to-int v12, p1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v6 .. v12}, Landroid/view/ViewStructure;->setDimens(IIIIII)V

    move-object v8, v0

    :goto_3
    if-nez v8, :cond_1b

    goto :goto_4

    :cond_1b
    new-instance v3, Ld2/e;

    iget-wide v5, p0, Ld2/d;->K:J

    sget-object v7, Ld2/f;->w:Ld2/f;

    invoke-direct/range {v3 .. v8}, Ld2/e;-><init>(IJLd2/f;Lbu/c;)V

    iget-object p1, p0, Ld2/d;->z:Ljava/util/ArrayList;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    new-instance p1, Lb2/r;

    const/4 v0, 0x4

    invoke-direct {p1, p0, v0}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p2, p1}, Ld2/d;->c(Li3/p;Lc93/m;)V

    return-void
.end method

.method public final n(Li3/p;)V
    .locals 7

    invoke-virtual {p0}, Ld2/d;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v2, p1, Li3/p;->g:I

    new-instance v1, Ld2/e;

    iget-wide v3, p0, Ld2/d;->K:J

    sget-object v5, Ld2/f;->x:Ld2/f;

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ld2/e;-><init>(IJLd2/f;Lbu/c;)V

    iget-object v0, p0, Ld2/d;->z:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x4

    invoke-static {v0, p1}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/p;

    invoke-virtual {p0, v2}, Ld2/d;->n(Li3/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final o()V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Ld2/d;->L:La0/g0;

    invoke-virtual {v1}, La0/g0;->c()V

    invoke-virtual {v0}, Ld2/d;->d()La0/s;

    move-result-object v2

    iget-object v3, v2, La0/s;->b:[I

    iget-object v4, v2, La0/s;->c:[Ljava/lang/Object;

    iget-object v2, v2, La0/s;->a:[J

    array-length v5, v2

    add-int/lit8 v5, v5, -0x2

    if-ltz v5, :cond_3

    const/4 v7, 0x0

    :goto_0
    aget-wide v8, v2, v7

    not-long v10, v8

    const/4 v12, 0x7

    shl-long/2addr v10, v12

    and-long/2addr v10, v8

    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v10, v12

    cmp-long v10, v10, v12

    if-eqz v10, :cond_2

    sub-int v10, v7, v5

    not-int v10, v10

    ushr-int/lit8 v10, v10, 0x1f

    const/16 v11, 0x8

    rsub-int/lit8 v10, v10, 0x8

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v10, :cond_1

    const-wide/16 v13, 0xff

    and-long/2addr v13, v8

    const-wide/16 v15, 0x80

    cmp-long v13, v13, v15

    if-gez v13, :cond_0

    shl-int/lit8 v13, v7, 0x3

    add-int/2addr v13, v12

    aget v14, v3, v13

    aget-object v13, v4, v13

    check-cast v13, Li3/q;

    new-instance v15, Lb3/w2;

    iget-object v13, v13, Li3/q;->a:Li3/p;

    invoke-virtual {v0}, Ld2/d;->d()La0/s;

    move-result-object v6

    invoke-direct {v15, v13, v6}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    invoke-virtual {v1, v14, v15}, La0/g0;->h(ILjava/lang/Object;)V

    :cond_0
    shr-long/2addr v8, v11

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    if-ne v10, v11, :cond_3

    :cond_2
    if-eq v7, v5, :cond_3

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    new-instance v1, Lb3/w2;

    iget-object v2, v0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object v2

    invoke-virtual {v2}, Li3/r;->a()Li3/p;

    move-result-object v2

    invoke-virtual {v0}, Ld2/d;->d()La0/s;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lb3/w2;-><init>(Li3/p;La0/s;)V

    iput-object v1, v0, Ld2/d;->M:Lb3/w2;

    return-void
.end method

.method public final onStart(Landroidx/lifecycle/g0;)V
    .locals 1

    iget-object p1, p0, Ld2/d;->x:Landroidx/room/u0;

    invoke-virtual {p1}, Landroidx/room/u0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le3/a;

    iput-object p1, p0, Ld2/d;->y:Le3/a;

    iget-object p1, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object p1

    invoke-virtual {p1}, Li3/r;->a()Li3/p;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Ld2/d;->l(ILi3/p;)V

    invoke-virtual {p0}, Ld2/d;->f()V

    return-void
.end method

.method public final onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    iget-object p1, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()Li3/r;

    move-result-object p1

    invoke-virtual {p1}, Li3/r;->a()Li3/p;

    move-result-object p1

    invoke-virtual {p0, p1}, Ld2/d;->n(Li3/p;)V

    invoke-virtual {p0}, Ld2/d;->f()V

    const/4 p1, 0x0

    iput-object p1, p0, Ld2/d;->y:Le3/a;

    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Ld2/d;->I:Landroid/os/Handler;

    iget-object v0, p0, Ld2/d;->O:Landroidx/lifecycle/z0;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ld2/d;->y:Le3/a;

    return-void
.end method
