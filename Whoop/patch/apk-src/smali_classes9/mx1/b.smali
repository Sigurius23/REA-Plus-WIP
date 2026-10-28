.class public abstract Lmx1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Ljx1/i;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmx1/b;->e(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljx1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmx1/b;->d(Lkotlin/jvm/functions/Function1;Ljx1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljx1/i;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x6616f942

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_5

    :cond_6
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v15, 0x1

    if-eq v8, v9, :cond_8

    move v8, v15

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_18

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_9

    move-object v4, v8

    goto :goto_7

    :cond_9
    move-object v4, v7

    :goto_7
    const/4 v7, 0x3

    int-to-float v7, v7

    int-to-float v9, v3

    invoke-static {v4, v7, v9}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 p1, v4

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v3

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v3, v4, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v4, v15

    const/16 v9, 0xc

    int-to-float v9, v9

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    sget-object v17, Li2/t;->b:Li2/s;

    sget-wide v14, Li2/x;->m:J

    new-instance v13, Li2/x;

    invoke-direct {v13, v14, v15}, Li2/x;-><init>(J)V

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v14

    new-instance v2, Li2/x;

    invoke-direct {v2, v14, v15}, Li2/x;-><init>(J)V

    filled-new-array {v13, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-wide/16 v21, 0x0

    const/16 v23, 0xe

    const-wide/16 v19, 0x0

    invoke-static/range {v17 .. v23}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v2

    invoke-static {v4, v3, v2, v9}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v4, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v10, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v9, v10, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x8

    int-to-float v3, v2

    mul-float/2addr v7, v3

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float/2addr v9, v3

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v33, v2

    sget-object v2, Lb2/e;->M:Lb2/k;

    move/from16 v17, v12

    const/4 v12, 0x6

    invoke-static {v7, v2, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 v18, v13

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v20, v11

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v11, v18

    goto :goto_a

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v10, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_e
    invoke-static {v12, v10, v12, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v12

    const/4 v9, 0x6

    invoke-static {v7, v3, v2, v10, v9}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_10

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    invoke-static {v7, v10, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v10, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljx1/i;->c()Lkd1/o;

    move-result-object v7

    const-wide/high16 v1, 0x3fc0000000000000L    # 0.125

    double-to-float v1, v1

    mul-float/2addr v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v8, v2, v1, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Lkd1/o;->a:I

    or-int/lit8 v11, v2, 0x30

    const/4 v12, 0x4

    const/4 v9, 0x0

    move-object v4, v8

    move/from16 v2, v17

    const/16 v34, 0x6

    move-object v8, v1

    move-object/from16 v1, v20

    invoke-static/range {v7 .. v12}, Lmx1/s;->b(Lkd1/o;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6}, Ljx1/i;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fffa

    move-object/from16 v29, v10

    move-wide v9, v8

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x100

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    const/16 v28, 0x0

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move/from16 v36, v30

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X0()J

    move-result-wide v7

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    const/16 v16, 0x0

    const/16 v17, 0xc

    const-wide/16 v13, 0x0

    move-object v15, v10

    move-wide v9, v1

    invoke-static/range {v7 .. v17}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v14

    move-object v10, v15

    invoke-virtual {v6}, Ljx1/i;->a()Ljx1/g;

    move-result-object v1

    invoke-virtual {v1}, Ljx1/g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int/lit16 v1, v0, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_13

    move v1, v3

    goto :goto_c

    :cond_13
    move/from16 v1, v35

    :goto_c
    and-int/lit8 v2, v0, 0xe

    const/4 v7, 0x4

    if-eq v2, v7, :cond_14

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_15

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    :cond_14
    move/from16 v35, v3

    :cond_15
    or-int v0, v1, v35

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_16

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_17

    :cond_16
    new-instance v1, Lmi2/o;

    const/4 v7, 0x4

    invoke-direct {v1, v7, v5, v6}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v20, v1

    check-cast v20, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit8 v22, v0, 0x6

    const/16 v23, 0x0

    const/16 v24, 0x1f3e

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v7, v4

    move-object/from16 v21, v29

    invoke-static/range {v7 .. v24}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v4, p1

    goto :goto_d

    :cond_18
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v7

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lm31/h;

    const/4 v3, 0x4

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljx1/i;)Ll83/a0;
    .locals 8

    new-instance v0, Lax1/a$d;

    invoke-virtual {p1}, Ljx1/i;->e()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x1b

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lax1/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljx1/i;->a()Ljx1/g;

    move-result-object p1

    invoke-virtual {p1}, Ljx1/g;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lmx1/b;->c(Ljx1/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
