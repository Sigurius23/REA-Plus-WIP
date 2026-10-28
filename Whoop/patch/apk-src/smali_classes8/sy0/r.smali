.class public abstract Lsy0/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u008b\u0001\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lsy0/k;",
        "whoopCheckboxType",
        "",
        "initialToggle",
        "isEnabled",
        "",
        "spacerSize",
        "Li2/x;",
        "textColor",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll0/k1;",
        "paddingValues",
        "Lb2/g;",
        "verticalAlignment",
        "checkedColor",
        "rowModifier",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onToggle",
        "c",
        "(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy0/r;->d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p18}, Lsy0/r;->e(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lsy0/k;",
            "ZZIJ",
            "Landroidx/compose/ui/Modifier;",
            "Ll0/k1;",
            "Lb2/g;",
            "J",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v0, p17

    const-string v3, "text"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "whoopCheckboxType"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onToggle"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p14

    check-cast v8, Lp1/q;

    const v3, 0x4df88791    # 5.2120426E8f

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_1
    move v3, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v15, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v8, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    :goto_5
    and-int/lit8 v11, v0, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v15, 0xc00

    if-nez v12, :cond_8

    move/from16 v12, p3

    invoke-virtual {v8, v12}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v3, v3, v16

    :goto_7
    and-int/lit8 v16, v0, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move/from16 v4, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v4, v15, 0x6000

    if-nez v4, :cond_b

    move/from16 v4, p4

    invoke-virtual {v8, v4}, Lp1/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_8

    :cond_d
    const/16 v17, 0x2000

    :goto_8
    or-int v3, v3, v17

    :goto_9
    const/high16 v17, 0x30000

    and-int v17, v15, v17

    move/from16 v18, v5

    move-wide/from16 v5, p5

    if-nez v17, :cond_f

    invoke-virtual {v8, v5, v6}, Lp1/q;->f(J)Z

    move-result v19

    if-eqz v19, :cond_e

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_e
    const/high16 v19, 0x10000

    :goto_a
    or-int v3, v3, v19

    :cond_f
    and-int/lit8 v19, v0, 0x40

    const/high16 v20, 0x180000

    if-eqz v19, :cond_10

    or-int v3, v3, v20

    move-object/from16 v13, p7

    goto :goto_c

    :cond_10
    and-int v20, v15, v20

    move-object/from16 v13, p7

    if-nez v20, :cond_12

    invoke-virtual {v8, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v20, 0x80000

    :goto_b
    or-int v3, v3, v20

    :cond_12
    :goto_c
    and-int/lit16 v9, v0, 0x80

    const/high16 v21, 0xc00000

    if-eqz v9, :cond_13

    or-int v3, v3, v21

    move-object/from16 v7, p8

    goto :goto_e

    :cond_13
    and-int v21, v15, v21

    move-object/from16 v7, p8

    if-nez v21, :cond_15

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_14

    const/high16 v22, 0x800000

    goto :goto_d

    :cond_14
    const/high16 v22, 0x400000

    :goto_d
    or-int v3, v3, v22

    :cond_15
    :goto_e
    move/from16 v22, v3

    and-int/lit16 v3, v0, 0x100

    const/high16 v23, 0x6000000

    if-eqz v3, :cond_17

    or-int v22, v22, v23

    :cond_16
    move/from16 v23, v3

    move-object/from16 v3, p9

    goto :goto_10

    :cond_17
    and-int v23, v15, v23

    if-nez v23, :cond_16

    move/from16 v23, v3

    move-object/from16 v3, p9

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_18

    const/high16 v24, 0x4000000

    goto :goto_f

    :cond_18
    const/high16 v24, 0x2000000

    :goto_f
    or-int v22, v22, v24

    :goto_10
    const/high16 v24, 0x30000000

    and-int v24, v15, v24

    if-nez v24, :cond_1b

    and-int/lit16 v3, v0, 0x200

    if-nez v3, :cond_19

    move-wide/from16 v3, p10

    invoke-virtual {v8, v3, v4}, Lp1/q;->f(J)Z

    move-result v24

    if-eqz v24, :cond_1a

    const/high16 v24, 0x20000000

    goto :goto_11

    :cond_19
    move-wide/from16 v3, p10

    :cond_1a
    const/high16 v24, 0x10000000

    :goto_11
    or-int v22, v22, v24

    goto :goto_12

    :cond_1b
    move-wide/from16 v3, p10

    :goto_12
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_1c

    or-int/lit8 v4, p16, 0x6

    move/from16 v24, v4

    move-object/from16 v4, p12

    goto :goto_14

    :cond_1c
    and-int/lit8 v4, p16, 0x6

    if-nez v4, :cond_1e

    move-object/from16 v4, p12

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1d

    const/16 v24, 0x4

    goto :goto_13

    :cond_1d
    const/16 v24, 0x2

    :goto_13
    or-int v24, p16, v24

    goto :goto_14

    :cond_1e
    move-object/from16 v4, p12

    move/from16 v24, p16

    :goto_14
    and-int/lit8 v25, p16, 0x30

    if-nez v25, :cond_20

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1f

    const/16 v17, 0x20

    goto :goto_15

    :cond_1f
    const/16 v17, 0x10

    :goto_15
    or-int v24, v24, v17

    :cond_20
    const v17, 0x12492493

    move/from16 v25, v3

    and-int v3, v22, v17

    const v4, 0x12492492

    const/4 v6, 0x1

    if-ne v3, v4, :cond_22

    and-int/lit8 v3, v24, 0x13

    const/16 v4, 0x12

    if-eq v3, v4, :cond_21

    goto :goto_16

    :cond_21
    const/4 v3, 0x0

    goto :goto_17

    :cond_22
    :goto_16
    move v3, v6

    :goto_17
    and-int/lit8 v4, v22, 0x1

    invoke-virtual {v8, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_37

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v3, v15, 0x1

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x3

    const v26, -0x70000001

    const/4 v4, 0x6

    if-eqz v3, :cond_25

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_23

    goto :goto_18

    :cond_23
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit16 v3, v0, 0x200

    if-eqz v3, :cond_24

    and-int v22, v22, v26

    :cond_24
    move-wide/from16 v18, p10

    move-object/from16 v11, p12

    move-object/from16 v16, v5

    move v3, v10

    move-object v9, v13

    move/from16 v5, v22

    move/from16 v13, p4

    move-object/from16 v10, p9

    goto :goto_1d

    :cond_25
    :goto_18
    if-eqz v18, :cond_26

    const/4 v10, 0x0

    :cond_26
    if-eqz v11, :cond_27

    move v12, v6

    :cond_27
    if-eqz v16, :cond_28

    move/from16 v3, v17

    goto :goto_19

    :cond_28
    move/from16 v3, p4

    :goto_19
    if-eqz v19, :cond_29

    move-object v13, v5

    :cond_29
    if-eqz v9, :cond_2a

    int-to-float v7, v6

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    new-instance v9, Ll0/l1;

    invoke-direct {v9, v7, v7, v7, v7}, Ll0/l1;-><init>(FFFF)V

    move-object v7, v9

    :cond_2a
    if-eqz v23, :cond_2b

    sget-object v9, Lb2/e;->K:Lb2/l;

    goto :goto_1a

    :cond_2b
    move-object/from16 v9, p9

    :goto_1a
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_2c

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v18

    and-int v22, v22, v26

    goto :goto_1b

    :cond_2c
    move-wide/from16 v18, p10

    :goto_1b
    move-object v11, v13

    move v13, v3

    move v3, v10

    move-object v10, v9

    move-object v9, v11

    if-eqz v25, :cond_2d

    move-object v11, v5

    move-object/from16 v16, v11

    :goto_1c
    move/from16 v5, v22

    goto :goto_1d

    :cond_2d
    move-object/from16 v11, p12

    move-object/from16 v16, v5

    goto :goto_1c

    :goto_1d
    invoke-virtual {v8}, Lp1/q;->r()V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_2e

    invoke-static {v8}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_2e
    move-object/from16 v29, v4

    check-cast v29, Lj0/i;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v12}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v28

    new-instance v4, Li3/i;

    const/4 v0, 0x1

    invoke-direct {v4, v0}, Li3/i;-><init>(I)V

    and-int/lit8 v0, v24, 0x70

    move-object/from16 v32, v4

    const/16 v4, 0x20

    if-ne v0, v4, :cond_2f

    const/4 v4, 0x1

    goto :goto_1e

    :cond_2f
    const/4 v4, 0x0

    :goto_1e
    move/from16 p2, v0

    and-int/lit16 v0, v5, 0x380

    move/from16 p3, v4

    const/16 v4, 0x100

    if-ne v0, v4, :cond_30

    const/4 v0, 0x1

    goto :goto_1f

    :cond_30
    const/4 v0, 0x0

    :goto_1f
    or-int v0, p3, v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_31

    if-ne v4, v6, :cond_32

    :cond_31
    new-instance v4, Lbv2/b;

    const/16 v0, 0x9

    invoke-direct {v4, v14, v3, v0}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    move-object/from16 v33, v4

    check-cast v33, Lc93/a;

    const/16 v34, 0x8

    const/16 v30, 0x0

    move/from16 v31, v12

    invoke-static/range {v28 .. v34}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v6, v31

    shr-int/lit8 v4, v5, 0x12

    and-int/lit16 v12, v4, 0x380

    move/from16 v20, v3

    sget-object v3, Ll0/m;->a:Ll0/e;

    shr-int/lit8 v12, v12, 0x3

    and-int/lit8 v12, v12, 0x70

    invoke-static {v3, v10, v8, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move v12, v5

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v17, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move-object/from16 p3, v9

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_33

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_20

    :cond_33
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_20
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_34

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_35

    :cond_34
    invoke-static {v5, v8, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_35
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, v2, Lsy0/k$i;

    if-eqz v0, :cond_36

    const v0, 0x38a9b150    # 8.091575E-5f

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v12, 0x6

    and-int/lit8 v3, v0, 0xe

    or-int/lit8 v3, v3, 0x30

    shr-int/lit8 v5, v12, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v3, v5

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    const v4, 0xe000

    and-int/2addr v0, v4

    or-int/2addr v0, v3

    move/from16 v22, v12

    const/4 v12, 0x0

    const/4 v5, 0x0

    move-object/from16 v9, p3

    move-object/from16 v44, v10

    move-object/from16 v42, v11

    move-object/from16 v3, v16

    move-object/from16 v43, v17

    move/from16 v4, v20

    move/from16 v6, v31

    const/4 v2, 0x0

    const/4 v14, 0x1

    move v11, v0

    move-object v10, v8

    move-wide/from16 v7, v18

    move/from16 v0, v22

    invoke-static/range {v4 .. v12}, Lsy0/j;->d(ZLkotlin/jvm/functions/Function1;ZJLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-wide/from16 v16, v7

    move-object v5, v9

    move-object v8, v10

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object v14, v3

    move-wide/from16 v11, v16

    goto :goto_21

    :cond_36
    move-object/from16 v5, p3

    move-object/from16 v44, v10

    move-object/from16 v42, v11

    move v0, v12

    move-object/from16 v3, v16

    move-object/from16 v43, v17

    move-wide/from16 v16, v18

    move/from16 v4, v20

    move/from16 v6, v31

    const/4 v2, 0x0

    const/4 v14, 0x1

    const v7, -0x236fad7b

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->w()J

    move-result-wide v20

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v18

    shr-int/lit8 v7, v0, 0x1b

    and-int/lit8 v25, v7, 0xe

    const/16 v26, 0x18

    const-wide/16 v22, 0x0

    move-object/from16 v24, v8

    invoke-static/range {v16 .. v26}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v7

    move-wide/from16 v11, v16

    shr-int/lit8 v9, v0, 0x6

    and-int/lit8 v9, v9, 0xe

    or-int v9, v9, p2

    shr-int/lit8 v10, v0, 0xc

    and-int/lit16 v10, v10, 0x380

    or-int/2addr v9, v10

    and-int/lit16 v10, v0, 0x1c00

    or-int/2addr v9, v10

    const/16 v10, 0x10

    move-object v14, v3

    move v3, v4

    move-object/from16 v4, p13

    invoke-static/range {v3 .. v10}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move v4, v3

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_21
    int-to-float v2, v13

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {v2, v3, v14, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    and-int/lit8 v2, v0, 0xe

    invoke-static {v1, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lsy0/k;->a()Lb91/a;

    move-result-object v36

    shr-int/lit8 v0, v0, 0x9

    and-int/lit16 v0, v0, 0x380

    const/16 v40, 0x0

    const v41, 0x2fffa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-wide/from16 v18, p5

    move/from16 v39, v0

    move-object/from16 v38, v8

    invoke-static/range {v16 .. v41}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/4 v14, 0x1

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    move v3, v4

    move v4, v6

    move-object/from16 v9, v43

    move-object/from16 v10, v44

    move-object v8, v5

    move v5, v13

    move-object/from16 v13, v42

    goto :goto_22

    :cond_37
    invoke-virtual {v8}, Lp1/q;->X()V

    move/from16 v5, p4

    move-object v9, v7

    move-object/from16 v38, v8

    move v3, v10

    move v4, v12

    move-object v8, v13

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    :goto_22
    invoke-virtual/range {v38 .. v38}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_38

    move-object v2, v0

    new-instance v0, Lsy0/q;

    move-wide/from16 v6, p5

    move-object/from16 v14, p13

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v45, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v17}, Lsy0/q;-><init>(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v2, v45

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

    or-int/lit8 v0, p14, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v16

    invoke-static/range {p15 .. p15}, Lp1/x;->L(I)I

    move-result v17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v18, p16

    move-object/from16 v15, p17

    invoke-static/range {v1 .. v18}, Lsy0/r;->c(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;Lb2/g;JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
