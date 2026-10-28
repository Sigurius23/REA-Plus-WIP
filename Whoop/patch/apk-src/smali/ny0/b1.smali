.class public abstract Lny0/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aA\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lny0/o;",
        "state",
        "",
        "contentDescription",
        "Landroidx/compose/ui/Modifier;",
        "initialModifier",
        "finalModifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isPressed",
        "design_release"
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
.method public static synthetic a(ZZZLny0/q;JLp1/t2;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lny0/b1;->g(ZZZLny0/q;JLp1/t2;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lny0/b1;->h(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/b1;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ModifierParameter"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lny0/o;",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move/from16 v10, p6

    const-string v3, "state"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "contentDescription"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v3, -0x65b5b506

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v10, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v10

    goto :goto_2

    :cond_2
    move v3, v10

    :goto_2
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    :goto_5
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :goto_7
    and-int/lit16 v9, v10, 0x6000

    if-nez v9, :cond_c

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_8

    :cond_b
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v3, v9

    :cond_c
    and-int/lit16 v9, v3, 0x2493

    const/16 v12, 0x2492

    if-eq v9, v12, :cond_d

    const/4 v9, 0x1

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_9
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v7, v12, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_22

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_e

    move-object v15, v9

    goto :goto_a

    :cond_e
    move-object v15, v5

    :goto_a
    if-eqz v6, :cond_f

    move-object v12, v9

    goto :goto_b

    :cond_f
    move-object v12, v8

    :goto_b
    invoke-virtual {v1}, Lny0/o;->a()Lny0/q;

    move-result-object v4

    invoke-virtual {v1}, Lny0/o;->c()I

    move-result v5

    invoke-virtual {v1}, Lny0/o;->d()Ly81/e;

    move-result-object v6

    invoke-virtual {v1}, Lny0/o;->e()Ly81/e;

    move-result-object v8

    invoke-virtual {v1}, Lny0/o;->f()Ly81/e;

    move-result-object v13

    invoke-virtual {v1}, Lny0/o;->g()Z

    move-result v11

    invoke-virtual {v1}, Lny0/o;->h()Z

    move-result v14

    invoke-virtual {v1}, Lny0/o;->i()Z

    move-result v24

    invoke-virtual {v1}, Lny0/o;->j()F

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lny0/o;->b()Z

    move-result v1

    const/4 v2, 0x0

    invoke-interface {v6, v7, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    if-nez v11, :cond_12

    if-eqz v14, :cond_10

    goto :goto_d

    :cond_10
    const v17, 0x3ecccccd    # 0.4f

    :cond_11
    :goto_c
    move/from16 v25, v3

    move-object/from16 p2, v4

    move/from16 p3, v5

    move/from16 v2, v17

    const/4 v3, 0x0

    goto :goto_f

    :cond_12
    :goto_d
    invoke-static/range {v18 .. v19}, Li2/x;->e(J)F

    move-result v2

    const/high16 v20, 0x3f800000    # 1.0f

    cmpg-float v2, v2, v20

    if-gez v2, :cond_11

    cmpg-float v2, v17, v20

    if-nez v2, :cond_13

    const/4 v2, 0x1

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    :goto_e
    if-eqz v2, :cond_11

    invoke-static/range {v18 .. v19}, Li2/x;->e(J)F

    move-result v17

    goto :goto_c

    :goto_f
    invoke-interface {v6, v7, v3}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    if-nez v8, :cond_14

    :goto_10
    move-wide/from16 v26, v4

    goto :goto_11

    :cond_14
    move-object v6, v8

    goto :goto_10

    :goto_11
    invoke-interface {v6, v7, v3}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_15

    invoke-static {v7}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_15
    check-cast v4, Lj0/i;

    const/4 v6, 0x6

    invoke-static {v4, v7, v6}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lny0/q;->e()Z

    move-result v17

    if-nez v17, :cond_16

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-wide/from16 v22, v2

    const-wide/16 v2, 0x0

    const/4 v10, 0x0

    invoke-static {v2, v3, v6, v10, v4}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v2

    goto :goto_12

    :cond_16
    move-wide/from16 v22, v2

    move-object/from16 v17, v4

    const/4 v10, 0x0

    const/4 v2, 0x0

    :goto_12
    if-eqz v11, :cond_17

    if-nez v14, :cond_17

    const/16 v18, 0x1

    goto :goto_13

    :cond_17
    move/from16 v18, v10

    :goto_13
    new-instance v3, Li3/i;

    invoke-direct {v3, v10}, Li3/i;-><init>(I)V

    const v4, 0xe000

    and-int v4, v25, v4

    const/16 v10, 0x4000

    if-ne v4, v10, :cond_18

    const/4 v4, 0x1

    goto :goto_14

    :cond_18
    const/4 v4, 0x0

    :goto_14
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_19

    if-ne v10, v5, :cond_1a

    :cond_19
    new-instance v10, Le61/e;

    const/16 v4, 0x8

    invoke-direct {v10, v0, v4}, Le61/e;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v20, v10

    check-cast v20, Lc93/a;

    const/16 v21, 0x8

    move-object/from16 v19, v3

    move-object/from16 v16, v17

    move-object/from16 v17, v2

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lny0/q;->d()F

    move-result v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object v10, v12

    move-object v4, v13

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-eqz v0, :cond_1b

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_15
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_1c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :cond_1c
    invoke-static {v12, v7, v12, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lny0/q;->a()F

    move-result v0

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7, v11}, Lp1/q;->h(Z)Z

    move-result v2

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v7, v14}, Lp1/q;->h(Z)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v3

    or-int/2addr v2, v3

    move-object/from16 v3, p2

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    move-wide/from16 v12, v22

    invoke-virtual {v7, v12, v13}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_1f

    if-ne v6, v5, :cond_1e

    goto :goto_16

    :cond_1e
    move-object/from16 v23, v8

    move/from16 v17, v11

    goto :goto_17

    :cond_1f
    :goto_16
    new-instance v16, Lny0/z0;

    move/from16 v19, v1

    move-object/from16 v20, v3

    move-object/from16 v23, v8

    move/from16 v17, v11

    move-wide/from16 v21, v12

    move/from16 v18, v14

    invoke-direct/range {v16 .. v23}, Lny0/z0;-><init>(ZZZLny0/q;JLp1/c1;)V

    move-object/from16 v6, v16

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v2}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move/from16 v0, p3

    const/4 v1, 0x6

    invoke-static {v0, v7, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-virtual {v3}, Lny0/q;->c()F

    move-result v1

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static/range {v23 .. v23}, Lny0/b1;->e(Lp1/t2;)Z

    move-result v5

    if-eqz v5, :cond_20

    if-eqz v17, :cond_20

    invoke-virtual {v3}, Lny0/q;->e()Z

    move-result v3

    if-eqz v3, :cond_20

    const v3, -0x257091f9

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-interface {v4, v7, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_18
    move-wide v5, v4

    goto :goto_19

    :cond_20
    if-eqz v24, :cond_21

    const v3, -0x257088e1

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    sget-wide v4, Li2/x;->n:J

    goto :goto_18

    :cond_21
    const v3, -0x2570845e

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-wide/from16 v5, v26

    :goto_19
    and-int/lit8 v8, v25, 0x70

    const/4 v9, 0x0

    move-object/from16 v3, p1

    move-object v2, v0

    move-object v4, v1

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object v4, v10

    move-object v3, v15

    goto :goto_1a

    :cond_22
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v5

    move-object v4, v8

    :goto_1a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_23

    new-instance v0, Lny0/a1;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lny0/a1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final e(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(ZZZLny0/q;JLp1/t2;Lk2/e;)Ll83/a0;
    .locals 10

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static/range {p6 .. p6}, Lny0/b1;->e(Lp1/t2;)Z

    move-result p0

    if-nez p0, :cond_2

    :cond_0
    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    new-instance v2, Lk2/i;

    invoke-virtual {p3}, Lny0/q;->b()F

    move-result v3

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    :goto_0
    move-object v8, v2

    goto :goto_2

    :cond_2
    :goto_1
    sget-object v2, Lk2/h;->a:Lk2/h;

    goto :goto_0

    :goto_2
    const/4 v7, 0x0

    const/16 v9, 0x6e

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move-wide v2, p4

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
