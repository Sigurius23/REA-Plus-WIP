.class public abstract Lj11/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u008b\u0001\u0010\u0011\u001a\u00020\r2\n\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "primaryActionText",
        "Ly81/e;",
        "primaryActionColor",
        "secondaryActionText",
        "",
        "useSolidButtons",
        "Lg1/u0;",
        "primaryButtonColors",
        "Lf0/t;",
        "primaryButtonBorder",
        "secondaryButtonBorder",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onApproveRequest",
        "onDismissRequest",
        "onSecondaryActionClicked",
        "d",
        "(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lj11/g;->g(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lj11/g;->f(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lj11/g;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ly81/e;",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Lg1/u0;",
            "Lf0/t;",
            "Lf0/t;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v8, p7

    move/from16 v12, p11

    move/from16 v13, p12

    const-string v1, "onApproveRequest"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v1, -0x5fbfdfe3

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v12, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v12

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v12

    :goto_1
    and-int/lit8 v5, v13, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v6, v12, 0x30

    if-nez v6, :cond_6

    and-int/lit8 v6, v12, 0x40

    if-nez v6, :cond_4

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_4
    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v4, v6

    :cond_6
    :goto_4
    and-int/lit8 v6, v13, 0x4

    if-eqz v6, :cond_8

    or-int/lit16 v4, v4, 0x180

    :cond_7
    move-object/from16 v7, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v12, 0x180

    if-nez v7, :cond_7

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x100

    goto :goto_5

    :cond_9
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v4, v11

    :goto_6
    and-int/lit8 v11, v13, 0x8

    if-eqz v11, :cond_b

    or-int/lit16 v4, v4, 0xc00

    :cond_a
    move/from16 v14, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v14, v12, 0xc00

    if-nez v14, :cond_a

    move/from16 v14, p3

    invoke-virtual {v9, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x800

    goto :goto_7

    :cond_c
    const/16 v15, 0x400

    :goto_7
    or-int/2addr v4, v15

    :goto_8
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_f

    and-int/lit8 v15, v13, 0x10

    if-nez v15, :cond_d

    move-object/from16 v15, p4

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_9

    :cond_d
    move-object/from16 v15, p4

    :cond_e
    const/16 v16, 0x2000

    :goto_9
    or-int v4, v4, v16

    goto :goto_a

    :cond_f
    move-object/from16 v15, p4

    :goto_a
    and-int/lit8 v25, v13, 0x20

    const/high16 v16, 0x30000

    if-eqz v25, :cond_10

    or-int v4, v4, v16

    move-object/from16 v10, p5

    goto :goto_c

    :cond_10
    and-int v16, v12, v16

    move-object/from16 v10, p5

    if-nez v16, :cond_12

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v16, 0x10000

    :goto_b
    or-int v4, v4, v16

    :cond_12
    :goto_c
    const/high16 v16, 0x180000

    and-int v16, v12, v16

    if-nez v16, :cond_14

    and-int/lit8 v16, v13, 0x40

    move-object/from16 v2, p6

    if-nez v16, :cond_13

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v16, 0x80000

    :goto_d
    or-int v4, v4, v16

    goto :goto_e

    :cond_14
    move-object/from16 v2, p6

    :goto_e
    const/high16 v16, 0xc00000

    and-int v16, v12, v16

    if-nez v16, :cond_16

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x800000

    goto :goto_f

    :cond_15
    const/high16 v16, 0x400000

    :goto_f
    or-int v4, v4, v16

    :cond_16
    and-int/lit16 v0, v13, 0x100

    const/high16 v16, 0x6000000

    if-eqz v0, :cond_17

    or-int v4, v4, v16

    move/from16 v27, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_17
    and-int v16, v12, v16

    move/from16 v27, v0

    move-object/from16 v0, p8

    if-nez v16, :cond_19

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    const/high16 v16, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v16, 0x2000000

    :goto_10
    or-int v4, v4, v16

    :cond_19
    :goto_11
    const/high16 v28, 0x30000000

    and-int v16, v12, v28

    move/from16 v17, v11

    if-nez v16, :cond_1c

    and-int/lit16 v11, v13, 0x200

    if-nez v11, :cond_1a

    move-object/from16 v11, p9

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1b

    const/high16 v16, 0x20000000

    goto :goto_12

    :cond_1a
    move-object/from16 v11, p9

    :cond_1b
    const/high16 v16, 0x10000000

    :goto_12
    or-int v4, v4, v16

    goto :goto_13

    :cond_1c
    move-object/from16 v11, p9

    :goto_13
    const v16, 0x12492493

    and-int v0, v4, v16

    move/from16 v16, v1

    const v1, 0x12492492

    if-eq v0, v1, :cond_1d

    const/4 v0, 0x1

    goto :goto_14

    :cond_1d
    const/4 v0, 0x0

    :goto_14
    and-int/lit8 v1, v4, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v0, v12, 0x1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    const v30, -0x70000001

    const v31, -0x380001

    const v32, -0xe001

    if-eqz v0, :cond_22

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_15

    :cond_1e
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1f

    and-int v4, v4, v32

    :cond_1f
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_20

    and-int v4, v4, v31

    :cond_20
    and-int/lit16 v0, v13, 0x200

    if-eqz v0, :cond_21

    and-int v4, v4, v30

    :cond_21
    move-object/from16 v12, p1

    move-object/from16 v18, p6

    move-object/from16 v32, p8

    move-object/from16 v19, p9

    move/from16 v20, v4

    move-object v5, v10

    move/from16 v31, v14

    move-object v4, v15

    move-object v15, v7

    move-object v14, v9

    goto/16 :goto_1c

    :cond_22
    :goto_15
    if-eqz v16, :cond_23

    const/4 v3, 0x0

    :cond_23
    if-eqz v5, :cond_24

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_16

    :cond_24
    move-object/from16 v5, p1

    :goto_16
    if-eqz v6, :cond_25

    const/4 v7, 0x0

    :cond_25
    if-eqz v17, :cond_26

    const/4 v6, 0x0

    goto :goto_17

    :cond_26
    move v6, v14

    :goto_17
    and-int/lit8 v14, v13, 0x10

    const/4 v0, 0x6

    if-eqz v14, :cond_27

    sget-object v14, Lg1/v0;->a:Ll0/l1;

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v14, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->w()J

    move-result-wide v17

    invoke-virtual {v14, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->X0()J

    move-result-wide v20

    invoke-virtual {v14, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v22

    move-wide v14, v15

    move-wide/from16 v16, v17

    move-wide/from16 v18, v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v22, v9

    invoke-static/range {v14 .. v24}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v9

    move-object/from16 v14, v22

    and-int v4, v4, v32

    goto :goto_18

    :cond_27
    move-object v14, v9

    move-object v9, v15

    :goto_18
    if-eqz v25, :cond_28

    const/4 v10, 0x0

    :cond_28
    and-int/lit8 v15, v13, 0x40

    move-object/from16 p0, v3

    if-eqz v15, :cond_29

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v11

    invoke-static {v2, v11, v12}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    and-int v2, v4, v31

    move v4, v2

    goto :goto_19

    :cond_29
    move-object/from16 v0, p6

    :goto_19
    if-eqz v27, :cond_2b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2a

    new-instance v2, Lj02/y0;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lj02/y0;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v2, Lc93/a;

    goto :goto_1a

    :cond_2b
    move-object/from16 v2, p8

    :goto_1a
    and-int/lit16 v3, v13, 0x200

    if-eqz v3, :cond_2c

    and-int v4, v4, v30

    move-object/from16 v3, p0

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move-object/from16 v32, v19

    :goto_1b
    move/from16 v20, v4

    move-object v12, v5

    move/from16 v31, v6

    move-object v15, v7

    move-object v4, v9

    move-object v5, v10

    goto :goto_1c

    :cond_2c
    move-object/from16 v3, p0

    move-object/from16 v19, p9

    move-object/from16 v18, v0

    move-object/from16 v32, v2

    goto :goto_1b

    :goto_1c
    invoke-virtual {v14}, Lp1/q;->r()V

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v6

    const/16 v2, 0x8

    int-to-float v10, v2

    mul-float/2addr v0, v10

    const/4 v2, 0x0

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x2

    invoke-static {v11, v0, v2, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->e:Ll0/h;

    const/16 v9, 0x36

    invoke-static {v7, v2, v14, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v21, v1

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-eqz v1, :cond_2d

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_2d
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1d
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v14, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_2e

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    :cond_2e
    invoke-static {v6, v14, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v22, 0x380000

    if-nez v3, :cond_30

    const v0, 0x25ba05f7

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move v13, v0

    move-object/from16 v35, v3

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    move-object/from16 v36, v11

    move-object/from16 p1, v12

    move-object v9, v14

    move-object/from16 v16, v15

    move-object/from16 v14, v21

    const/4 v15, 0x2

    move v12, v10

    goto/16 :goto_1f

    :cond_30
    const v0, 0x25ba05f8

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    if-eqz v31, :cond_31

    const v0, -0x68f5d9d

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const v0, 0x7e000

    and-int v0, v20, v0

    shr-int/lit8 v1, v20, 0x3

    and-int v1, v1, v22

    or-int/2addr v0, v1

    const/4 v9, 0x7

    move v8, v0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v6, p7

    move-object v7, v14

    move-object/from16 v14, v21

    const/4 v13, 0x1

    const/16 v16, 0x2

    invoke-static/range {v0 .. v9}, Lny0/c0;->b(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v3

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    move-object v9, v7

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move/from16 p1, v16

    move-object/from16 v16, v15

    move/from16 v15, p1

    move-object/from16 v35, v0

    move v13, v1

    move-object/from16 v36, v11

    move-object/from16 p1, v12

    move v12, v10

    goto/16 :goto_1e

    :cond_31
    move-object v0, v3

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    move-object v9, v14

    move-object/from16 v14, v21

    const/4 v1, 0x0

    const/4 v13, 0x1

    const/16 v16, 0x2

    const v2, -0x68b3f21

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "dialog primary button"

    invoke-static {v2, v3}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lny0/v;->TextMedium:Lny0/v;

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toUpperCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    shr-int/lit8 v5, v20, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-interface {v12, v9, v5}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    const/high16 v7, 0x1c00000

    and-int v7, v20, v7

    or-int/lit8 v7, v7, 0x30

    move-object v8, v11

    const/16 v11, 0x68

    move/from16 v17, v1

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v21, v0

    move-object v0, v2

    move-object v2, v4

    move-wide v4, v5

    const/4 v6, 0x0

    move/from16 v23, v10

    move v10, v7

    const/4 v7, 0x0

    move/from16 p1, v16

    move-object/from16 v16, v15

    move/from16 v15, p1

    move-object/from16 v36, v8

    move-object/from16 p1, v12

    move/from16 v13, v17

    move-object/from16 v35, v21

    move/from16 v12, v23

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v11}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_1f
    if-nez v16, :cond_32

    const v0, 0x25c61d9b

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object/from16 v6, v18

    move-object/from16 v2, v19

    :goto_20
    const/4 v13, 0x1

    goto/16 :goto_23

    :cond_32
    const v0, 0x25c61d9c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v15

    move-object/from16 v8, v36

    invoke-static {v0, v12, v8, v9}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/16 v0, 0x9

    if-eqz v31, :cond_33

    const v1, 0x7374313b

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v20, 0x6

    const v2, 0xe000

    and-int/2addr v1, v2

    shr-int/lit8 v0, v20, 0x9

    and-int v0, v0, v22

    or-int v10, v1, v0

    const/16 v11, 0x2b

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v4, v16

    move-object/from16 v6, v18

    move-object/from16 v8, v19

    invoke-static/range {v2 .. v11}, Lny0/q0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v8

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_33
    move-object/from16 v6, v18

    move-object/from16 v2, v19

    const v1, 0x7377c2a4

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const-string v1, "dialog secondary button"

    invoke-static {v8, v1}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v15, Lny0/n0;->TextSmall:Lny0/n0;

    const/high16 v3, 0x70000000

    and-int v3, v20, v3

    xor-int v3, v3, v28

    const/high16 v4, 0x20000000

    if-le v3, v4, :cond_34

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_35

    :cond_34
    and-int v3, v20, v28

    if-ne v3, v4, :cond_36

    :cond_35
    const/4 v11, 0x1

    goto :goto_21

    :cond_36
    move v11, v13

    :goto_21
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v11, :cond_37

    if-ne v3, v14, :cond_38

    :cond_37
    new-instance v3, Lh0/l0;

    invoke-direct {v3, v2, v0}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    move-object/from16 v26, v3

    check-cast v26, Lkotlin/jvm/functions/Function1;

    const/16 v29, 0x0

    const/16 v30, 0xff8

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

    move-object v14, v1

    move-object/from16 v27, v9

    invoke-static/range {v14 .. v30}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_22
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_20

    :goto_23
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v10, v2

    move-object v7, v6

    move-object/from16 v22, v9

    move-object/from16 v3, v16

    move/from16 v4, v31

    move-object/from16 v9, v32

    move-object/from16 v5, v33

    move-object/from16 v6, v34

    move-object/from16 v1, v35

    :goto_24
    move-object/from16 v2, p1

    goto :goto_25

    :cond_39
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v7

    move-object/from16 v22, v9

    move-object v6, v10

    move v4, v14

    move-object v5, v15

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    goto :goto_24

    :goto_25
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_3a

    new-instance v0, Lj11/f;

    move-object/from16 v8, p7

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lj11/f;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_3a
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lj11/g;->d(Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZLg1/u0;Lf0/t;Lf0/t;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
