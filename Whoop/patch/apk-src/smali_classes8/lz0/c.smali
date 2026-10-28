.class public abstract Llz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llz0/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\r*\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ls21/i;",
        "type",
        "",
        "Llz0/a;",
        "progressBars",
        "Llz0/b;",
        "labels",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V",
        "Llz0/d;",
        "Ly81/f;",
        "h",
        "(Llz0/d;)Ly81/f;",
        "Llz0/g;",
        "i",
        "(Llz0/g;)Ly81/f;",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Llz0/c;->g(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p2, p3, p0, p1, p4}, Llz0/c;->e(JFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llz0/c;->f(Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls21/i;",
            "Ljava/util/List<",
            "Llz0/a;",
            ">;",
            "Ljava/util/List<",
            "Llz0/b;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "progressBars"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x3fdd02a5

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    const/4 v2, 0x4

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, p6, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_6

    if-nez p1, :cond_4

    const/4 v9, -0x1

    goto :goto_2

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    :goto_2
    invoke-virtual {v0, v9}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_3

    :cond_5
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v7, v9

    :cond_6
    :goto_4
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_8

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_5

    :cond_7
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v7, v9

    :cond_8
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v7, v7, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v7, v11

    :goto_7
    and-int/lit16 v11, v7, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_c

    move v11, v14

    goto :goto_8

    :cond_c
    move v11, v13

    :goto_8
    and-int/2addr v7, v14

    invoke-virtual {v0, v7, v11}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_20

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_d

    move-object v1, v15

    goto :goto_9

    :cond_d
    move-object v1, v6

    :goto_9
    if-eqz v8, :cond_e

    sget-object v6, Ls21/i;->STEP_BAR:Ls21/i;

    move-object/from16 v32, v6

    goto :goto_a

    :cond_e
    move-object/from16 v32, p1

    :goto_a
    if-eqz v9, :cond_f

    const/4 v6, 0x0

    move-object/from16 v33, v6

    goto :goto_b

    :cond_f
    move-object/from16 v33, v10

    :goto_b
    const/16 v6, 0xd

    int-to-float v6, v6

    int-to-float v2, v2

    mul-float/2addr v6, v2

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_10

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v8, v0, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, 0x8d1db65

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    move-object v6, v3

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    sget-object v8, Li2/w0;->a:Li2/v0;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v10, 0x6

    if-eqz v7, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llz0/a;

    invoke-virtual {v7}, Llz0/a;->a()Ly81/f;

    move-result-object v11

    invoke-virtual {v11, v0, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    sget-object v16, Llz0/c$b;->a:[I

    invoke-virtual/range {v32 .. v32}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    aget v13, v16, v17

    if-eq v13, v14, :cond_14

    if-ne v13, v4, :cond_13

    const v13, 0x5b3e816c

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    sget-object v13, Ly81/f;->WHITE_10:Ly81/f;

    invoke-virtual {v13, v0, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    :goto_e
    move-wide/from16 v4, v16

    goto :goto_f

    :cond_13
    const/4 v10, 0x0

    const v1, 0x5b3e6733

    invoke-static {v1, v0, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_14
    const/4 v10, 0x0

    const v13, 0x5b3e6dee

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v7}, Llz0/a;->b()Ljava/lang/Float;

    move-result-object v10

    if-eqz v10, :cond_15

    const v10, 0x3e99999a    # 0.3f

    invoke-static {v10, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v16

    goto :goto_e

    :cond_15
    move-wide v4, v11

    :goto_f
    invoke-virtual {v7}, Llz0/a;->d()F

    move-result v16

    invoke-virtual {v7}, Llz0/a;->c()F

    move-result v10

    invoke-virtual {v7}, Llz0/a;->d()F

    move-result v13

    sub-float v18, v10, v13

    new-instance v19, Lp91/a;

    const/16 v24, 0xc

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v17, 0x3ee66666    # 0.45f

    move-object/from16 v20, v19

    const v19, 0x3dcccccd    # 0.1f

    invoke-static/range {v15 .. v20}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 p0, v15

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    double-to-float v14, v14

    mul-float/2addr v14, v2

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {v10, v15}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v4, v5, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v4, v0, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7}, Llz0/a;->b()Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_16

    const v4, 0xc9aeabd

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    move-object/from16 v15, p0

    goto :goto_10

    :cond_16
    const v4, 0xc9aeabe

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Llz0/a;->d()F

    move-result v16

    invoke-virtual {v7}, Llz0/a;->b()Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v7}, Llz0/a;->d()F

    move-result v5

    sub-float v18, v4, v5

    new-instance v19, Lp91/a;

    const/16 v24, 0xc

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v17, 0x3ee66666    # 0.45f

    move-object/from16 v20, v19

    const v19, 0x3dcccccd    # 0.1f

    move-object/from16 v15, p0

    invoke-static/range {v15 .. v20}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v4, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v11, v12, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v10, 0x0

    invoke-static {v4, v0, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v7}, Llz0/a;->e()Z

    move-result v4

    if-eqz v4, :cond_1a

    const v4, 0xca49890

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5, v2}, Ly3/c;->q0(F)F

    move-result v5

    invoke-virtual {v0, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    const/4 v8, 0x2

    int-to-float v10, v8

    invoke-interface {v4, v10}, Ly3/c;->q0(F)F

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_17

    sget-object v8, Llz0/c$a;->w:Llz0/c$a;

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/4 v10, 0x0

    invoke-interface {v8, v0, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual {v7}, Llz0/a;->c()F

    move-result v16

    const/16 v21, 0x14

    const/16 v22, 0x0

    const v17, 0x3dcccccd    # 0.1f

    const/16 v18, 0x0

    const v19, 0x3e8f5c29    # 0.28f

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v8

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v0, v4}, Lp1/q;->d(F)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_18

    if-ne v10, v9, :cond_19

    :cond_18
    new-instance v16, Le61/l;

    const/16 v21, 0x4

    move/from16 v20, v4

    move/from16 v19, v5

    move-wide/from16 v17, v11

    invoke-direct/range {v16 .. v21}, Le61/l;-><init>(JFFI)V

    move-object/from16 v10, v16

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    invoke-static {v7, v10, v0, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    const/4 v4, 0x0

    const v5, 0xcb0b189

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    :goto_11
    move/from16 v5, p5

    move v13, v4

    const/4 v4, 0x2

    const/4 v14, 0x1

    goto/16 :goto_d

    :cond_1b
    move v4, v13

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    if-nez v33, :cond_1c

    const v2, 0x118db8ac

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v4}, Lp1/q;->q(Z)V

    move-object v7, v0

    :goto_12
    const/4 v13, 0x1

    goto/16 :goto_15

    :cond_1c
    const v4, 0x118db8ad

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    move-object/from16 v4, v33

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llz0/b;

    invoke-virtual {v5}, Llz0/b;->d()Z

    move-result v6

    if-eqz v6, :cond_1e

    const v6, -0x6cb50e6d

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Llz0/b;->c()F

    move-result v6

    invoke-virtual {v5}, Llz0/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v11, 0x0

    invoke-static {v7, v0, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v34, 0x2

    rsub-int/lit8 v7, v7, 0x2

    int-to-float v7, v7

    const v11, 0x3c23d70a    # 0.01f

    mul-float/2addr v7, v11

    sub-float/2addr v6, v7

    new-instance v16, Lp91/a;

    const/16 v21, 0xc

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v16

    const v11, 0x3ecccccd    # 0.4f

    invoke-static {v15, v6, v11, v7}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_1d

    new-instance v7, Llive/hms/video/media/capturers/camera/utils/a;

    const/16 v11, 0x1c

    invoke-direct {v7, v11}, Llive/hms/video/media/capturers/camera/utils/a;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v11, 0x4002000000000000L    # 2.25

    double-to-float v7, v11

    mul-float/2addr v7, v2

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lt0/j;->a:Lt0/i;

    invoke-static {v6, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-virtual {v7, v0, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-static {v6, v11, v12, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v11, 0x0

    invoke-static {v6, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1e
    const/4 v11, 0x0

    const/16 v34, 0x2

    const v6, -0x6ca727b9

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v5}, Llz0/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v0, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v0, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->v()Lb91/a;

    move-result-object v26

    invoke-virtual {v5}, Llz0/b;->a()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v23

    invoke-virtual {v5}, Llz0/b;->c()F

    move-result v16

    const/16 v21, 0x1c

    const/16 v22, 0x0

    const v17, 0x3f333333    # 0.7f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v15 .. v22}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v5, v15

    const/16 v30, 0x0

    const v31, 0x2fff8

    move v12, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move v15, v12

    const/4 v12, 0x0

    const/16 v16, 0x1

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v29, v9

    move-wide/from16 v39, v23

    move-object/from16 v24, v8

    move-wide/from16 v8, v39

    const/16 v23, 0x0

    move-object/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move-object/from16 v38, v29

    const/16 v29, 0x0

    move/from16 v39, v28

    move-object/from16 v28, v0

    move/from16 v0, v39

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v15, v5

    move-object/from16 v0, v28

    move-object/from16 v8, v35

    move/from16 v10, v37

    move-object/from16 v9, v38

    goto/16 :goto_13

    :cond_1f
    move-object v7, v0

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :goto_15
    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    move-object/from16 v2, v32

    move-object/from16 v4, v33

    goto :goto_16

    :cond_20
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v1, v6

    move-object v4, v10

    :goto_16
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, Lkw1/c;

    const/16 v7, 0xb

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final e(JFFLk2/e;)Ll83/a0;
    .locals 12

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long/2addr v4, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v7

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v9, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v9, v6

    and-long/2addr v2, v7

    or-long v6, v9, v2

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p2, v2, v3

    const/4 p2, 0x1

    aput p3, v2, p2

    new-instance v10, Li2/k;

    new-instance p2, Landroid/graphics/DashPathEffect;

    invoke-direct {p2, v2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, p2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v11, 0x1d8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v2, p0

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lk2/e;)Ll83/a0;
    .locals 10

    const-string v0, "$this$drawBehind"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly81/f;->BLACK_20:Ly81/f;

    invoke-virtual {v0}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v2

    const-wide/high16 v0, 0x4002000000000000L    # 2.25

    double-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-interface {p0, v0}, Ly3/c;->q0(F)F

    move-result v4

    const/4 v8, 0x0

    const/16 v9, 0x7c

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Llz0/c;->d(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Llz0/d;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llz0/c$b;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Ly81/f;->WHITE_50:Ly81/f;

    return-object p0

    :pswitch_1
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :pswitch_2
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :pswitch_3
    sget-object p0, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object p0

    :pswitch_4
    sget-object p0, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p0

    :pswitch_5
    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final i(Llz0/g;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llz0/c$b;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->WHITE_50:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->RECOVERY:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object p0

    :cond_3
    sget-object p0, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p0

    :cond_4
    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0
.end method
