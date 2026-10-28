.class public abstract Lsz0/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a?\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/c0;",
        "state",
        "",
        "maxLines",
        "minLines",
        "Lv63/c;",
        "overflow",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V",
        "Lgz0/m0;",
        "icon",
        "e",
        "(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V",
        "g",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsz0/b0;->h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsz0/b0;->f(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsz0/b0;->i(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V
    .locals 43

    move-object/from16 v2, p1

    move/from16 v6, p6

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x2419a8ea

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p7, 0x4

    if-nez v7, :cond_5

    move/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    move/from16 v7, p2

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    goto :goto_4

    :cond_7
    move/from16 v7, p2

    :goto_4
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p7, 0x8

    if-nez v8, :cond_8

    move/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_8
    move/from16 v8, p3

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v5, v9

    goto :goto_6

    :cond_a
    move/from16 v8, p3

    :goto_6
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_d

    and-int/lit8 v9, p7, 0x10

    if-nez v9, :cond_b

    move/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_b
    move/from16 v9, p4

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v5, v10

    goto :goto_8

    :cond_d
    move/from16 v9, p4

    :goto_8
    and-int/lit16 v10, v5, 0x2493

    const/16 v11, 0x2492

    const/4 v13, 0x1

    if-eq v10, v11, :cond_e

    move v10, v13

    goto :goto_9

    :cond_e
    const/4 v10, 0x0

    :goto_9
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2b

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v10, v6, 0x1

    sget-object v11, Lb2/t;->w:Lb2/t;

    const v14, -0xe001

    if-eqz v10, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_10

    and-int/lit16 v5, v5, -0x381

    :cond_10
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_11

    and-int/lit16 v5, v5, -0x1c01

    :cond_11
    and-int/lit8 v1, p7, 0x10

    if-eqz v1, :cond_12

    and-int/2addr v5, v14

    :cond_12
    move/from16 v33, v5

    move v1, v7

    :goto_a
    move v3, v8

    move v5, v9

    goto :goto_10

    :cond_13
    :goto_b
    if-eqz v1, :cond_14

    move-object v4, v11

    :cond_14
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_17

    invoke-virtual {v2}, Lsz0/c0;->j()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_c

    :cond_15
    invoke-virtual {v2}, Lsz0/c0;->h()Lgz0/m0;

    move-result-object v1

    if-eqz v1, :cond_16

    move v1, v13

    goto :goto_c

    :cond_16
    const v1, 0x7fffffff

    :goto_c
    and-int/lit16 v5, v5, -0x381

    goto :goto_d

    :cond_17
    move v1, v7

    :goto_d
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_19

    invoke-virtual {v2}, Lsz0/c0;->k()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_e

    :cond_18
    move v7, v13

    :goto_e
    and-int/lit16 v5, v5, -0x1c01

    move v8, v7

    :cond_19
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_1c

    invoke-virtual {v2}, Lsz0/c0;->j()Ljava/lang/Integer;

    move-result-object v7

    if-nez v7, :cond_1b

    invoke-virtual {v2}, Lsz0/c0;->h()Lgz0/m0;

    move-result-object v7

    if-eqz v7, :cond_1a

    goto :goto_f

    :cond_1a
    move v3, v13

    :cond_1b
    :goto_f
    and-int/2addr v5, v14

    move/from16 v33, v5

    move v5, v3

    move v3, v8

    goto :goto_10

    :cond_1c
    move/from16 v33, v5

    goto :goto_a

    :goto_10
    invoke-virtual {v0}, Lp1/q;->r()V

    if-ge v1, v13, :cond_1d

    move v7, v13

    goto :goto_11

    :cond_1d
    move v7, v1

    :goto_11
    invoke-static {v3, v13, v7}, Le93/b;->n(III)I

    move-result v34

    invoke-virtual {v2}, Lsz0/c0;->h()Lgz0/m0;

    move-result-object v8

    invoke-virtual {v2}, Lsz0/c0;->i()Lsz0/y;

    move-result-object v9

    sget-object v10, Lsz0/y;->LEADING:Lsz0/y;

    const/4 v14, 0x0

    if-ne v9, v10, :cond_1e

    goto :goto_12

    :cond_1e
    move-object v8, v14

    :goto_12
    invoke-virtual {v2}, Lsz0/c0;->h()Lgz0/m0;

    move-result-object v9

    invoke-virtual {v2}, Lsz0/c0;->i()Lsz0/y;

    move-result-object v10

    sget-object v15, Lsz0/y;->TRAILING:Lsz0/y;

    if-ne v10, v15, :cond_1f

    move-object v14, v9

    :cond_1f
    invoke-virtual {v2}, Lsz0/c0;->g()Z

    move-result v9

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v9, :cond_20

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    goto :goto_13

    :cond_20
    move-object v9, v4

    :goto_13
    sget-object v15, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v10, v15, v0, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 p3, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-eqz v1, :cond_21

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_21
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_14
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v0, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_22

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_23

    :cond_22
    invoke-static {v12, v0, v12, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x8

    if-nez v8, :cond_24

    const v8, 0x2127d508

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    goto :goto_15

    :cond_24
    const/4 v15, 0x0

    const v9, 0x2127d509

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    invoke-static {v8, v0, v15}, Lsz0/b0;->e(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x1

    int-to-float v9, v8

    int-to-float v10, v1

    invoke-static {v9, v10, v11, v0, v15}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_15
    invoke-virtual {v2}, Lsz0/c0;->g()Z

    move-result v9

    if-eqz v9, :cond_26

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v12, v9

    const-wide/16 v16, 0x0

    cmpl-double v10, v12, v16

    if-lez v10, :cond_25

    goto :goto_16

    :cond_25
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_16
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v15, 0x0

    invoke-direct {v10, v9, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    goto :goto_17

    :cond_26
    move-object v10, v11

    :goto_17
    invoke-virtual {v2}, Lsz0/c0;->f()Li2/t;

    move-result-object v9

    if-eqz v9, :cond_27

    invoke-static {v11, v9}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    if-nez v9, :cond_28

    :cond_27
    move-object v9, v11

    :cond_28
    invoke-interface {v10, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v35

    invoke-virtual {v2}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/4 v15, 0x0

    invoke-static {v9, v0, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v36

    invoke-virtual {v2}, Lsz0/c0;->h()Lgz0/m0;

    move-result-object v9

    if-nez v9, :cond_29

    invoke-virtual {v2}, Lsz0/c0;->g()Z

    move-result v9

    if-eqz v9, :cond_29

    move/from16 v37, v8

    :goto_18
    move v12, v7

    goto :goto_19

    :cond_29
    const/16 v37, 0x0

    goto :goto_18

    :goto_19
    sget-object v7, Liz0/l;->a:Liz0/l;

    sget-object v9, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v2}, Lsz0/c0;->l()Lb91/c;

    move-result-object v10

    invoke-virtual {v9, v10}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v16

    invoke-virtual {v2}, Lsz0/c0;->c()I

    move-result v25

    const/16 v29, 0x0

    const v30, 0xff7fff

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v16 .. v30}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v9

    invoke-virtual {v2}, Lsz0/c0;->e()Ly81/f;

    move-result-object v10

    const/4 v15, 0x0

    invoke-virtual {v10, v0, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    const/high16 v31, 0x30000

    const/16 v32, 0x7ffc

    move-object v10, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    move-object/from16 v19, v14

    const-wide/16 v13, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v22, v8

    move-object v8, v9

    move-object/from16 v21, v10

    move-wide/from16 v9, v16

    const-wide/16 v16, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    move/from16 v25, v20

    const-wide/16 v19, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    move/from16 v27, v23

    const-wide/16 v22, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x0

    move/from16 v39, v27

    const/16 v27, 0x0

    move/from16 v40, v28

    const/16 v28, 0x0

    move/from16 v41, v30

    const/16 v30, 0x0

    move-object/from16 v1, v29

    move-object/from16 v29, v0

    move-object v0, v1

    move-object/from16 v42, v38

    move/from16 v1, v41

    invoke-virtual/range {v7 .. v32}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v10

    shl-int/lit8 v7, v33, 0x9

    const/high16 v8, 0x1c00000

    and-int v17, v7, v8

    const/16 v18, 0x110

    const/4 v11, 0x0

    const/4 v15, 0x0

    move v14, v5

    move-object/from16 v16, v29

    move/from16 v13, v34

    move-object/from16 v8, v35

    move-object/from16 v7, v36

    move/from16 v9, v37

    move/from16 v12, v39

    invoke-static/range {v7 .. v18}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v5, v16

    if-nez v0, :cond_2a

    const v0, 0x21343e88

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    goto :goto_1a

    :cond_2a
    const v7, 0x21343e89

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    const/4 v8, 0x1

    int-to-float v7, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    move-object/from16 v10, v42

    invoke-static {v7, v9, v10, v5}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    invoke-static {v0, v5, v1}, Lsz0/b0;->e(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    move-object v1, v4

    move-object/from16 v29, v5

    move v5, v14

    move v4, v3

    move/from16 v3, p3

    goto :goto_1b

    :cond_2b
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v4

    move-object/from16 v29, v5

    move v3, v7

    move v4, v8

    move v5, v9

    :goto_1b
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2c

    new-instance v0, Lsz0/a0;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lsz0/a0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method private static final e(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x1f2131d3

    invoke-virtual {v5, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    const/4 v1, 0x4

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {v5, p1}, Lp1/q;->e(I)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v2, p1, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v0, :cond_2

    move v0, v4

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    and-int/2addr p1, v4

    invoke-virtual {v5, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p1

    const/4 v0, 0x6

    invoke-static {p1, v5, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p1, v2, :cond_3

    sget-object p1, Lsz0/b0$a;->w:Lsz0/b0$a;

    invoke-virtual {v5, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    invoke-interface {p1, v5, v3}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    int-to-float p1, v1

    mul-float/2addr p1, p1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lj50/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Lj50/b;-><init>(Lgz0/m0;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final f(Lgz0/m0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lsz0/b0;->e(Lgz0/m0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x7e6b0829

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lsz0/b0$b;

    invoke-direct {v1}, Lsz0/b0$b;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0x13

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lsz0/b0;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lsz0/c0;IIIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsz0/b0;->d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
