.class public abstract Lov2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001aE\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u00062\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lov2/a;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onShowMoreClicked",
        "d",
        "(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "onClick",
        "g",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "weightlifting_release"
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
.method public static synthetic a(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lov2/g;->h(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lov2/g;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lov2/g;->f(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lov2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowMoreClicked"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x28d6a8a8

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v5, 0x6

    move v6, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_9

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_5

    :cond_8
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v6, v9

    :cond_9
    move v13, v6

    and-int/lit16 v6, v13, 0x493

    const/16 v9, 0x492

    const/4 v14, 0x0

    if-eq v6, v9, :cond_a

    const/4 v6, 0x1

    goto :goto_6

    :cond_a
    move v6, v14

    :goto_6
    and-int/lit8 v9, v13, 0x1

    invoke-virtual {v10, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_b

    move-object v3, v6

    :cond_b
    if-eqz v7, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v0, v7, :cond_c

    new-instance v0, Lov2/f;

    const/4 v7, 0x0

    invoke-direct {v0, v7}, Lov2/f;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v9, v0

    goto :goto_7

    :cond_d
    move-object v9, v8

    :goto_7
    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v0, v7

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v0, v8, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-eqz v1, :cond_e

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v10, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v8, v10, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x2da836e6

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lov2/a;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    shl-int/lit8 v8, v13, 0x3

    and-int/lit16 v11, v8, 0x1c00

    const/4 v12, 0x6

    move v8, v7

    const/4 v7, 0x0

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v25, v6

    move-object v6, v1

    move-object/from16 v1, v25

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v1

    move v7, v15

    goto :goto_9

    :cond_11
    move-object v1, v6

    move v15, v7

    move-object/from16 v18, v9

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lov2/a;->f()Z

    move-result v0

    if-eqz v0, :cond_12

    const v0, -0x789f610f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v13, 0x9

    and-int/lit8 v0, v0, 0xe

    invoke-static {v4, v10, v0}, Lov2/g;->g(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_12
    const v0, -0x789e658c

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v2}, Lov2/a;->e()Z

    move-result v0

    if-eqz v0, :cond_16

    const v0, -0x789d9b52

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v23, v0, v15

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v7, v15, v1

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    :cond_14
    invoke-static {v6, v10, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lgy0/e;->d:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v7

    const/16 v16, 0x0

    const/16 v17, 0x1fd

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v0, v14

    const/4 v14, 0x0

    const/4 v1, 0x1

    invoke-static/range {v6 .. v17}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v15

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    move v0, v14

    const/4 v1, 0x1

    const v6, -0x78976b2c

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object/from16 v3, v18

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v8

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lo72/a;

    const/4 v7, 0x3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lov2/g;->d(Landroidx/compose/ui/Modifier;Lov2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    const v0, -0x3df583f7

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v11, 0x4

    const/4 v12, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v11

    goto :goto_0

    :cond_0
    move v0, v12

    :goto_0
    or-int v0, p2, v0

    move v15, v0

    goto :goto_1

    :cond_1
    move/from16 v15, p2

    :goto_1
    and-int/lit8 v0, v15, 0x3

    const/4 v1, 0x1

    if-eq v0, v12, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/lit8 v2, v15, 0x1

    invoke-virtual {v14, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget v0, Lcu2/h;->K1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v17

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/w;->g()I

    move-result v18

    sget-object v2, Lg1/v0;->a:Ll0/l1;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    invoke-virtual {v0, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v0, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X0()J

    move-result-wide v7

    invoke-virtual {v0, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v9

    move-wide/from16 v19, v5

    move v6, v1

    move-wide/from16 v22, v3

    move-object v3, v0

    move-wide/from16 v0, v22

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v21, v2

    move-wide v6, v7

    move-object v8, v14

    move-object v14, v3

    move-wide/from16 v2, v19

    invoke-static/range {v0 .. v10}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    int-to-float v0, v12

    int-to-float v1, v11

    mul-float v10, v0, v1

    move/from16 v0, v21

    invoke-virtual {v14, v8, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v12

    const/4 v6, 0x1

    int-to-float v0, v6

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    mul-float/2addr v2, v1

    new-instance v11, Ll0/l1;

    invoke-direct {v11, v0, v2, v0, v2}, Ll0/l1;-><init>(FFFF)V

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit8 v0, v0, 0x6

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v1, v1, 0x6

    or-int/lit8 v1, v1, 0x36

    shl-int/lit8 v2, v15, 0x9

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v1, v2

    move-object/from16 v6, v17

    const/16 v17, 0x336

    move v15, v0

    move-object/from16 v0, v16

    move/from16 v16, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v14, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v1, Lch0/t;

    const/16 v2, 0xf

    move/from16 v3, p2

    invoke-direct {v1, v3, v2, v13}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final h(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lov2/g;->g(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
