.class public abstract Lc31/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a_\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000bH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "enabled",
        "Ly81/e;",
        "circleColor",
        "Li2/t;",
        "circleBrush",
        "iconColor",
        "Lgz0/m0;",
        "icon",
        "",
        "testTag",
        "Lkotlin/Function1;",
        "Lc31/c;",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc31/g;->f(Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc31/g;->h(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lc31/g;->i(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lq2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc31/g;->g(Lq2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ly81/e;",
            "Li2/t;",
            "Ly81/e;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p8

    const-string v0, "icon"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p7

    check-cast v11, Lp1/q;

    const v0, 0x23b81f79

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, v9, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_4
    and-int/lit16 v2, v9, 0x180

    if-nez v2, :cond_6

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v0, v2

    :cond_6
    and-int/lit16 v2, v9, 0xc00

    if-nez v2, :cond_9

    and-int/lit16 v2, v9, 0x1000

    if-nez v2, :cond_7

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_5

    :cond_7
    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_5
    if-eqz v2, :cond_8

    const/16 v2, 0x800

    goto :goto_6

    :cond_8
    const/16 v2, 0x400

    :goto_6
    or-int/2addr v0, v2

    :cond_9
    and-int/lit16 v2, v9, 0x6000

    if-nez v2, :cond_b

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v11, v2}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_a

    const/16 v2, 0x4000

    goto :goto_7

    :cond_a
    const/16 v2, 0x2000

    :goto_7
    or-int/2addr v0, v2

    :cond_b
    and-int/lit8 v2, p9, 0x20

    const/high16 v3, 0x30000

    if-eqz v2, :cond_d

    or-int/2addr v0, v3

    :cond_c
    move-object/from16 v3, p5

    goto :goto_9

    :cond_d
    and-int/2addr v3, v9

    if-nez v3, :cond_c

    move-object/from16 v3, p5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/high16 v4, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v4, 0x10000

    :goto_8
    or-int/2addr v0, v4

    :goto_9
    and-int/lit8 v4, p9, 0x40

    const/high16 v5, 0x100000

    const/high16 v13, 0x180000

    if-eqz v4, :cond_10

    or-int/2addr v0, v13

    :cond_f
    move-object/from16 v13, p6

    :goto_a
    move v14, v0

    goto :goto_c

    :cond_10
    and-int/2addr v13, v9

    if-nez v13, :cond_f

    move-object/from16 v13, p6

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    move v14, v5

    goto :goto_b

    :cond_11
    const/high16 v14, 0x80000

    :goto_b
    or-int/2addr v0, v14

    goto :goto_a

    :goto_c
    const v0, 0x92493

    and-int/2addr v0, v14

    const v15, 0x92492

    if-eq v0, v15, :cond_12

    const/4 v0, 0x1

    goto :goto_d

    :cond_12
    const/4 v0, 0x0

    :goto_d
    and-int/lit8 v15, v14, 0x1

    invoke-virtual {v11, v15, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_23

    if-eqz v2, :cond_13

    const/4 v3, 0x0

    :cond_13
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_14

    new-instance v2, Lbs1/n;

    const/16 v4, 0x1a

    invoke-direct {v2, v4}, Lbs1/n;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v13, v2

    :cond_15
    sget-object v2, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v11, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq2/a;

    invoke-static {}, Lc31/l;->b()F

    move-result v4

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    const/high16 v19, 0x380000

    and-int v12, v14, v19

    if-ne v12, v5, :cond_16

    const/4 v5, 0x1

    goto :goto_e

    :cond_16
    const/4 v5, 0x0

    :goto_e
    or-int v5, v18, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v5, :cond_17

    if-ne v12, v0, :cond_18

    :cond_17
    new-instance v12, Lbs1/v;

    const/4 v5, 0x5

    invoke-direct {v12, v2, v13, v5}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v12, Lc93/a;

    const/16 v5, 0xe

    const/4 v2, 0x0

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move-object v9, v0

    move-object v0, v4

    move-object v4, v12

    move-object/from16 v12, v18

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v12, :cond_1a

    const v1, -0x50606708

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_19

    new-instance v1, Lbs1/n;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lbs1/n;-><init>(I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-static {v15, v2, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v12}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1a
    const/4 v2, 0x0

    const v1, -0x505d3967

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object v1, v15

    :goto_f
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_1b

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_10
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    :cond_1c
    invoke-static {v2, v11, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v6, :cond_1e

    const v0, 0x50db8a45

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1e
    const v0, 0x50db8a46

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Lc31/l;->b()F

    move-result v0

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v2, v14, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-interface {v6, v11, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    sget-object v4, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v0, v11, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_11
    if-nez v7, :cond_1f

    const v0, 0x50e02d79

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    const/4 v5, 0x4

    goto :goto_12

    :cond_1f
    const v0, 0x50e02d7a

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-static {}, Lc31/l;->b()F

    move-result v0

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lt0/j;->a:Lt0/i;

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-static {v0, v7, v3, v4, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v11, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    :goto_12
    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v0, v15, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    int-to-float v2, v1

    int-to-float v3, v5

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v11, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    if-eqz p0, :cond_22

    const v3, 0x50e7cd25

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    if-nez v8, :cond_20

    const v3, 0x50e7f28f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    const/4 v15, 0x0

    goto :goto_13

    :cond_20
    const/4 v3, 0x0

    const v4, 0x342883b2

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v14, 0x9

    and-int/lit8 v4, v4, 0xe

    invoke-interface {v8, v11, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v11, v3, v4, v5}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v15

    :goto_13
    if-nez v15, :cond_21

    const v4, 0x342888c9

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v11, v1, v3}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_14

    :cond_21
    const v1, 0x3428827d

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    iget-wide v4, v15, Li2/x;->a:J

    :goto_14
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_15
    move-wide v14, v4

    goto :goto_16

    :cond_22
    const/4 v3, 0x0

    const v4, 0x50e90a4a

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v11, v1, v3}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_15

    :goto_16
    const/16 v17, 0x30

    const/16 v18, 0x0

    move-object v3, v12

    const/4 v12, 0x0

    move-object/from16 v16, v11

    move-object v11, v2

    move-object v2, v13

    move-object v13, v0

    const/4 v0, 0x1

    invoke-static/range {v11 .. v18}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move-object v7, v2

    goto :goto_17

    :cond_23
    move-object v1, v11

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v7, v13

    :goto_17
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v0, Lc31/f;

    move/from16 v1, p0

    move/from16 v9, p9

    move-object v2, v6

    move-object v4, v8

    move-object v5, v10

    move/from16 v8, p8

    move-object v6, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v9}, Lc31/f;-><init>(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final f(Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lq2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lq2/a;->a(I)V

    sget-object p0, Lc31/c;->FILLED_BUTTON:Lc31/c;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li3/x;->a(Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lc31/g;->e(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
