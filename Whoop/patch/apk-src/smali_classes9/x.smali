.class public abstract Lx;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x68d44560

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x20

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_2

    move v1, v4

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p0}, Lpv0/d;->p()Z

    move-result v1

    if-eqz v1, :cond_3

    const v0, 0x5adb011c

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-static {p2, v5}, Ltv0/d;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_3
    invoke-virtual {p0}, Lpv0/d;->o()Z

    move-result v1

    if-eqz v1, :cond_7

    const v1, 0x5adb0569

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_4

    goto :goto_3

    :cond_4
    move v4, v5

    :goto_3
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_5

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_6

    :cond_5
    new-instance v0, Lo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lc93/a;

    invoke-static {v0, p2, v5}, Ltv0/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const v1, 0x5adb0eb4

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p0, p1, p2, v0}, Lx;->e(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lh;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lh;-><init>(Lpv0/d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, -0x63107f92

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v2, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_7

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v1, v4}, Lcom/whoop/design/util/TextResource;->resolve(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0, v7}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    const/16 v5, 0x8

    if-eqz v4, :cond_6

    const v4, -0x3cead282

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v4, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v4, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v11

    sget-object v4, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v4}, Lkd1/w;->a()Lk91/a;

    move-result-object v4

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v13

    int-to-float v4, v7

    int-to-float v5, v5

    mul-float v14, v4, v5

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v3, 0xe

    or-int v27, v4, v3

    const/16 v29, 0x0

    const v30, 0x7ff3f4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v26, v2

    move-wide v2, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v32, v11

    move v12, v6

    move-wide/from16 v5, v32

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v31, v28

    const/16 v28, 0x30

    move/from16 v0, v31

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v1, v26

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move-object v2, v1

    move-object/from16 v1, p1

    goto :goto_5

    :cond_6
    move-object v1, v2

    move v0, v6

    const v2, -0x3ce693d0

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v2}, Lkd1/w;->a()Lk91/a;

    move-result-object v2

    invoke-virtual {v2}, Lk91/a;->c()Lt0/i;

    move-result-object v13

    int-to-float v2, v7

    int-to-float v4, v5

    mul-float v14, v2, v4

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v3, 0xe

    or-int v27, v2, v3

    const/16 v29, 0x0

    const v30, 0x7ff3fe

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x30

    move-object/from16 v26, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v30}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v2, v26

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Lk;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v1, v4, v5, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, 0x6e0ce9da

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v6, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v5, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_3

    :cond_3
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_3
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_4

    :cond_4
    const/16 v7, 0x10

    :goto_4
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_8

    and-int/lit16 v7, v5, 0x200

    if-nez v7, :cond_6

    invoke-virtual {v15, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_5

    :cond_6
    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_5
    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_6

    :cond_7
    const/16 v7, 0x80

    :goto_6
    or-int/2addr v0, v7

    :cond_8
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_a

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_7

    :cond_9
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v0, v7

    :cond_a
    and-int/lit16 v7, v0, 0x493

    const/16 v10, 0x492

    const/16 v32, 0x0

    if-eq v7, v10, :cond_b

    const/4 v7, 0x1

    goto :goto_8

    :cond_b
    move/from16 v7, v32

    :goto_8
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v15, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_14

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v7, 0x3

    int-to-float v7, v7

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v20, v7, v12

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->e:Ll0/h;

    const/16 v8, 0x36

    invoke-static {v14, v13, v15, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v15, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v13, v15, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v6

    mul-float v20, v6, v12

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v10

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v8, v0, 0xe

    or-int/2addr v6, v8

    invoke-static {v1, v15, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v15, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    invoke-virtual {v8, v15, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v30, v10, 0x12

    const v31, 0x2fff8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v28, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x800

    const/16 v22, 0x0

    const/16 v25, 0x1

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move/from16 v34, v29

    const/16 v29, 0x30

    move/from16 v1, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v28

    sget-object v7, Lny0/v;->TextSmall:Lny0/v;

    invoke-static {v2}, Lcom/whoop/design/util/b;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v8

    and-int/lit16 v6, v0, 0x1c00

    if-ne v6, v1, :cond_f

    const/4 v11, 0x1

    goto :goto_a

    :cond_f
    move/from16 v11, v32

    :goto_a
    and-int/lit16 v1, v0, 0x380

    const/16 v6, 0x100

    if-eq v1, v6, :cond_10

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_11

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    :cond_10
    const/16 v32, 0x1

    :cond_11
    or-int v0, v11, v32

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_13

    :cond_12
    new-instance v1, Li;

    const/4 v0, 0x1

    invoke-direct {v1, v0, v4, v3}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v16, 0x30

    const/16 v17, 0x79

    const/4 v6, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_14
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lm;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lm;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, 0x1e3bd700

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v12, 0x1

    if-eqz p1, :cond_0

    move v0, v12

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x3

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v6, v0, v1

    const/4 v7, 0x7

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, p0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p0

    iget-wide v1, v9, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v9, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v9, v3, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->f:La3/i;

    invoke-static {v9, p0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v1, v9, v1, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p0, La3/k;->d:La3/i;

    invoke-static {v9, p0, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    const/4 v10, 0x0

    const/16 v11, 0x1fd

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Ln;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ln;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final e(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v3, Lb2/e;->w:Lb2/m;

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v4, -0x17b7ce3b

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    and-int/lit8 v5, v4, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    if-eq v5, v7, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    move v5, v8

    :goto_2
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v13, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_23

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v5, v7}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_3

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v27, v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_4

    :cond_4
    move/from16 v27, v4

    :goto_4
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v13, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v13, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const v9, -0xdd050ba

    invoke-virtual {v13, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x1

    int-to-float v10, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v18, v10, v9

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v5

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v28, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    invoke-virtual {v0}, Lpv0/d;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v29

    const/16 v32, 0x6

    const/16 v33, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v28 .. v33}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->c(Lcom/whoop/design/atomic/organism/toolbar/d$b;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v10

    move-object/from16 v17, v6

    and-int/lit8 v6, v27, 0x70

    move-object/from16 v19, v4

    const/16 v4, 0x20

    if-ne v6, v4, :cond_6

    const/16 v20, 0x1

    goto :goto_5

    :cond_6
    const/16 v20, 0x0

    :goto_5
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v21, v6

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v20, :cond_8

    if-ne v4, v6, :cond_7

    goto :goto_6

    :cond_7
    move-object/from16 v20, v5

    const/4 v5, 0x1

    goto :goto_7

    :cond_8
    :goto_6
    new-instance v4, Lo;

    move-object/from16 v20, v5

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v4, Lc93/a;

    sget v26, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v27, v13

    const/4 v13, 0x3

    shl-int/lit8 v26, v26, 0x3

    or-int/lit8 v26, v26, 0x6

    move-object/from16 v28, v12

    const/16 v12, 0x34

    move-object/from16 v29, v6

    const/4 v6, 0x0

    move-object/from16 v30, v8

    const/4 v8, 0x0

    move/from16 v31, v9

    const/4 v9, 0x0

    move-object/from16 v38, v7

    move-object v5, v10

    move-object/from16 v34, v11

    move-object/from16 v13, v16

    move-object/from16 v37, v17

    move/from16 v40, v18

    move-object/from16 v39, v19

    move/from16 v41, v21

    move/from16 v11, v26

    move-object/from16 v10, v27

    move-object/from16 v35, v28

    move-object/from16 v2, v29

    move-object/from16 v36, v30

    const/16 v0, 0x20

    move-object v7, v4

    move-object/from16 v4, v20

    invoke-static/range {v4 .. v12}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    sget-object v4, Ll0/a1;->w:Ll0/a1;

    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v4, 0x2

    int-to-float v5, v4

    mul-float v17, v5, v31

    const/16 v18, 0x0

    const/16 v21, 0x2

    move/from16 v19, v17

    move/from16 v20, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v25, v17

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    move-object/from16 v10, v36

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v11, v37

    goto :goto_9

    :cond_9
    move-object/from16 v10, v36

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v8, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v38

    invoke-static {v8, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v6, v8, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v8, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_c

    new-instance v9, Lp;

    const/4 v12, 0x0

    invoke-direct {v9, v12}, Lp;-><init>(I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_a

    :cond_c
    const/4 v12, 0x0

    :goto_a
    move-object/from16 v20, v9

    check-cast v20, Lkotlin/jvm/functions/Function1;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v16, v9, 0x3

    shl-int/lit8 v9, v9, 0x6

    or-int v22, v16, v9

    const/4 v9, 0x4

    const/16 v23, 0x6000

    const/16 v24, 0x3ff9

    move/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v38, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    move/from16 v17, v9

    const-wide/16 v8, 0x0

    move-object/from16 v30, v10

    const/4 v10, 0x0

    move-object/from16 v37, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move-object/from16 v19, v14

    const-wide/16 v13, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move/from16 v28, v16

    const/16 v16, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move-object/from16 v36, v19

    const/16 v19, 0x0

    move-object/from16 v0, v26

    move-object/from16 v46, v27

    move-object/from16 v43, v30

    move-object/from16 v47, v36

    move-object/from16 v44, v37

    move-object/from16 v45, v38

    move-object/from16 v27, v3

    move/from16 v3, v28

    invoke-static/range {v4 .. v24}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v21

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-wide v6, Li2/x;->m:J

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v6, v7, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v6, "ContentSearchSearchField"

    invoke-static {v5, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v5, v41

    const/16 v6, 0x20

    if-ne v5, v6, :cond_d

    const/4 v6, 0x1

    goto :goto_b

    :cond_d
    const/4 v6, 0x0

    :goto_b
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_e

    if-ne v7, v2, :cond_f

    :cond_e
    new-instance v7, Lo;

    invoke-direct {v7, v1, v3}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v13, v7

    check-cast v13, Lc93/a;

    const/16 v14, 0xf

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v34

    move-object/from16 v9, v35

    const/4 v10, 0x0

    invoke-static {v7, v9, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_10

    move-object/from16 v13, v43

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v14, v44

    goto :goto_d

    :cond_10
    move-object/from16 v13, v43

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v8, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v45

    invoke-static {v8, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    :cond_11
    move-object/from16 v12, v46

    goto :goto_f

    :cond_12
    move-object/from16 v12, v46

    :goto_e
    move-object/from16 v11, v47

    goto :goto_10

    :goto_f
    invoke-static {v11, v8, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v8, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x1

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    const/4 v15, 0x4

    int-to-float v15, v15

    mul-float v20, v15, v31

    const/16 v21, 0x2

    const/16 v18, 0x0

    move/from16 v19, v25

    move-object/from16 v16, v0

    move/from16 v17, v25

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v15, v40

    invoke-static {v15, v9}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v9

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v3, 0x36

    invoke-static {v9, v15, v8, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move/from16 v41, v5

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_13
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v8, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_15

    :cond_14
    invoke-static {v4, v8, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v8, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x70ffe0ec

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move/from16 v5, v41

    const/16 v4, 0x20

    if-ne v5, v4, :cond_16

    move v4, v6

    goto :goto_13

    :cond_16
    move v4, v10

    :goto_13
    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    move-object/from16 v7, p0

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_17

    if-ne v9, v2, :cond_18

    :cond_17
    new-instance v9, Lc;

    invoke-direct {v9, v1, v3, v7, v6}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v20, v9

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v13, v16

    move-object/from16 v9, v27

    invoke-static {v9, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v14, v8, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_19

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_19
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_14
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v8, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_1a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1b

    :cond_1a
    invoke-static {v12, v8, v12, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v8, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7}, Lpv0/d;->k()Ljava/lang/String;

    move-result-object v4

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v3, v8, v10}, Lx;->b(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    move/from16 v41, v5

    move-object/from16 v27, v9

    move-object/from16 v16, v13

    const/4 v10, 0x0

    goto/16 :goto_12

    :cond_1c
    move-object/from16 v7, p0

    move v12, v10

    move-object/from16 v13, v16

    move/from16 v5, v41

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    const/4 v0, 0x3

    invoke-static {v12, v12, v8, v0}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v21, 0x0

    const/16 v22, 0xa

    const/16 v19, 0x0

    move/from16 v20, v25

    move/from16 v18, v25

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Ll0/m;->a:Ll0/e;

    int-to-float v0, v0

    mul-float v0, v0, v31

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v0, v9}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v0

    sget-object v9, Lb2/e;->N:Lb2/k;

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    const/16 v11, 0x20

    if-ne v5, v11, :cond_1d

    move v11, v6

    goto :goto_15

    :cond_1d
    const/4 v11, 0x0

    :goto_15
    or-int/2addr v10, v11

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1f

    if-ne v11, v2, :cond_1e

    goto :goto_16

    :cond_1e
    const/4 v12, 0x0

    goto :goto_17

    :cond_1f
    :goto_16
    new-instance v11, Lq;

    const/4 v12, 0x0

    invoke-direct {v11, v7, v7, v1, v12}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v11, Lkotlin/jvm/functions/Function1;

    const v14, 0x36006

    const/16 v15, 0x1cc

    move/from16 v42, v6

    const/4 v6, 0x0

    move-object/from16 v21, v8

    move-object v8, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v24, v12

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v7

    move-object v7, v0

    move-object v0, v13

    move-object v13, v4

    move-object v4, v3

    move v3, v5

    move-object v5, v13

    move-object/from16 v13, v21

    invoke-static/range {v4 .. v15}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    move-object v8, v13

    invoke-virtual {v0}, Lpv0/d;->c()Ljava/lang/String;

    move-result-object v6

    const/16 v11, 0x20

    if-ne v3, v11, :cond_20

    const/4 v3, 0x1

    goto :goto_18

    :cond_20
    const/4 v3, 0x0

    :goto_18
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    move-object/from16 v5, v39

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v3, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_21

    if-ne v7, v2, :cond_22

    :cond_21
    new-instance v7, Lc;

    const/4 v3, 0x2

    invoke-direct {v7, v1, v0, v5, v3}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v7, Lc93/a;

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-static/range {v4 .. v9}, Lx;->f(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_23
    move v12, v8

    move-object v8, v13

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_19
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_24

    new-instance v3, Lh;

    move/from16 v4, p3

    invoke-direct {v3, v0, v1, v4, v12}, Lh;-><init>(Lpv0/d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method public static final f(Ln0/u;ILjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p4, Lp1/q;

    const v0, 0x796a105c

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    or-int/lit16 v0, v0, 0x1b0

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x800

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/16 v1, 0x400

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v3, 0x4000

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/16 v1, 0x2000

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x2493

    const/16 v4, 0x2492

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v1, v4, :cond_3

    move v1, v6

    goto :goto_3

    :cond_3
    move v1, v5

    :goto_3
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {p4, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    and-int/lit16 p1, v0, 0x1c00

    if-ne p1, v2, :cond_4

    move p1, v6

    goto :goto_4

    :cond_4
    move p1, v5

    :goto_4
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_5

    if-ne v1, v2, :cond_6

    :cond_5
    new-instance p1, Li;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0, p2}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v1

    invoke-virtual {p4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lp1/t2;

    invoke-virtual {p4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const v4, 0xe000

    and-int/2addr v0, v4

    if-ne v0, v3, :cond_7

    move v5, v6

    :cond_7
    or-int/2addr p1, v5

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_8

    if-ne v0, v2, :cond_9

    :cond_8
    new-instance v0, Le;

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, p3, p1, v2}, Le;-><init>(Lp1/t2;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lc93/m;

    invoke-static {p4, v0, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 p1, 0xa

    :goto_5
    move v2, p1

    goto :goto_6

    :cond_a
    invoke-virtual {p4}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v0, Lj;

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lj;-><init>(Ln0/u;ILjava/lang/String;Lc93/a;I)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method
