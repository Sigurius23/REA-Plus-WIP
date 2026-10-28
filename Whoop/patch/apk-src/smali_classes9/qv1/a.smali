.class public abstract Lqv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lqv1/g;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "c",
        "(Lqv1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "membership_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lqv1/a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqv1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqv1/a;->e(Lqv1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lqv1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqv1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x6b75ec91

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v11, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v11

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v7, :cond_4

    move v6, v13

    goto :goto_3

    :cond_4
    move v6, v12

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v5

    const/16 v9, 0x8

    int-to-float v15, v9

    mul-float/2addr v7, v15

    const/4 v9, 0x0

    invoke-static {v6, v7, v9, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v13

    int-to-float v4, v4

    mul-float/2addr v4, v6

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v4, v7, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v7, v8, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lqv1/g;->a()Ljava/util/List;

    move-result-object v4

    if-nez v4, :cond_8

    const v3, 0x5e0d6c72

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v3, 0x1

    goto/16 :goto_9

    :cond_8
    const v5, 0x5e0d6c73

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    check-cast v4, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v4, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_6
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm91/u;

    and-int/lit8 v5, v3, 0x70

    if-ne v5, v11, :cond_9

    const/4 v5, 0x1

    goto :goto_7

    :cond_9
    move v5, v12

    :goto_7
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_a

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_b

    :cond_a
    new-instance v7, Lp90/h;

    const/16 v5, 0x12

    invoke-direct {v7, v1, v5}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    move/from16 v17, v6

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    instance-of v4, v4, Lp31/l;

    if-eqz v4, :cond_c

    const v4, 0x588daec2

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    mul-float v6, v17, v15

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v8, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v4, 0x588eae06

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_8
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v6, v17

    goto :goto_6

    :cond_d
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_9
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_f

    new-instance v4, Lq81/e;

    const/16 v5, 0xd

    invoke-direct {v4, v0, v1, v2, v5}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lqv1/g;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lqv1/a;->c(Lqv1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
