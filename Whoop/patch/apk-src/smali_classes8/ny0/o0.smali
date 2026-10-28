.class public abstract Lny0/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0083\u0001\u0010\u0015\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Lb91/a;",
        "buttonTextStyle",
        "Lg1/u0;",
        "buttonColors",
        "Lf0/t;",
        "border",
        "",
        "endIcon",
        "endIconModifier",
        "fillMaxWidth",
        "Ll0/k1;",
        "paddingValues",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "b",
        "(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p15}, Lny0/o0;->c(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lb91/a;",
            "Lg1/u0;",
            "Lf0/t;",
            "Ljava/lang/Integer;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Ll0/k1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v11, p10

    move/from16 v1, p12

    move/from16 v2, p14

    const-string v4, "buttonText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onClick"

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p11

    check-cast v4, Lp1/q;

    const v5, -0x48259c53

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v2, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v8, v1, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-virtual {v4, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v1

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v1

    :goto_1
    and-int/lit8 v10, v2, 0x2

    if-eqz v10, :cond_4

    or-int/lit8 v9, v9, 0x30

    :cond_3
    move/from16 v12, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v12, v1, 0x30

    if-nez v12, :cond_3

    move/from16 v12, p1

    invoke-virtual {v4, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_5

    const/16 v13, 0x20

    goto :goto_2

    :cond_5
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v9, v13

    :goto_3
    and-int/lit16 v13, v1, 0x180

    if-nez v13, :cond_7

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v13, 0x100

    goto :goto_4

    :cond_6
    const/16 v13, 0x80

    :goto_4
    or-int/2addr v9, v13

    :cond_7
    and-int/lit16 v13, v1, 0xc00

    if-nez v13, :cond_a

    and-int/lit8 v13, v2, 0x8

    if-nez v13, :cond_9

    and-int/lit16 v13, v1, 0x1000

    if-nez v13, :cond_8

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_5

    :cond_8
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    :goto_5
    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_6

    :cond_9
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v9, v13

    :cond_a
    and-int/lit16 v13, v1, 0x6000

    if-nez v13, :cond_d

    and-int/lit8 v13, v2, 0x10

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v4, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/16 v14, 0x4000

    goto :goto_7

    :cond_b
    move-object/from16 v13, p4

    :cond_c
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v9, v14

    goto :goto_8

    :cond_d
    move-object/from16 v13, p4

    :goto_8
    const/high16 v14, 0x30000

    and-int/2addr v14, v1

    if-nez v14, :cond_10

    and-int/lit8 v14, v2, 0x20

    if-nez v14, :cond_e

    move-object/from16 v14, p5

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_e
    move-object/from16 v14, p5

    :cond_f
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v9, v15

    goto :goto_a

    :cond_10
    move-object/from16 v14, p5

    :goto_a
    and-int/lit8 v23, v2, 0x40

    const/high16 v15, 0x180000

    if-eqz v23, :cond_12

    or-int/2addr v9, v15

    :cond_11
    move-object/from16 v15, p6

    goto :goto_c

    :cond_12
    and-int/2addr v15, v1

    if-nez v15, :cond_11

    move-object/from16 v15, p6

    invoke-virtual {v4, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_13
    const/high16 v16, 0x80000

    :goto_b
    or-int v9, v9, v16

    :goto_c
    and-int/lit16 v6, v2, 0x80

    const/high16 v16, 0xc00000

    if-eqz v6, :cond_14

    or-int v9, v9, v16

    move-object/from16 v7, p7

    goto :goto_e

    :cond_14
    and-int v16, v1, v16

    move-object/from16 v7, p7

    if-nez v16, :cond_16

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x800000

    goto :goto_d

    :cond_15
    const/high16 v16, 0x400000

    :goto_d
    or-int v9, v9, v16

    :cond_16
    :goto_e
    and-int/lit16 v0, v2, 0x100

    const/high16 v16, 0x6000000

    if-eqz v0, :cond_17

    or-int v9, v9, v16

    move/from16 v24, v0

    move/from16 v0, p8

    goto :goto_10

    :cond_17
    and-int v16, v1, v16

    move/from16 v24, v0

    move/from16 v0, p8

    if-nez v16, :cond_19

    invoke-virtual {v4, v0}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_18

    const/high16 v16, 0x4000000

    goto :goto_f

    :cond_18
    const/high16 v16, 0x2000000

    :goto_f
    or-int v9, v9, v16

    :cond_19
    :goto_10
    and-int/lit16 v0, v2, 0x200

    const/high16 v16, 0x30000000

    if-eqz v0, :cond_1a

    or-int v9, v9, v16

    move/from16 v25, v0

    move-object/from16 v0, p9

    goto :goto_12

    :cond_1a
    and-int v16, v1, v16

    move/from16 v25, v0

    move-object/from16 v0, p9

    if-nez v16, :cond_1c

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1b

    const/high16 v16, 0x20000000

    goto :goto_11

    :cond_1b
    const/high16 v16, 0x10000000

    :goto_11
    or-int v9, v9, v16

    :cond_1c
    :goto_12
    and-int/lit8 v16, p13, 0x6

    if-nez v16, :cond_1e

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1d

    const/16 v16, 0x4

    goto :goto_13

    :cond_1d
    const/16 v16, 0x2

    :goto_13
    or-int v16, p13, v16

    move/from16 v26, v16

    goto :goto_14

    :cond_1e
    move/from16 v26, p13

    :goto_14
    const v16, 0x12492493

    and-int v0, v9, v16

    const v1, 0x12492492

    if-ne v0, v1, :cond_20

    and-int/lit8 v0, v26, 0x3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1f

    goto :goto_15

    :cond_1f
    const/4 v0, 0x0

    goto :goto_16

    :cond_20
    :goto_15
    const/4 v0, 0x1

    :goto_16
    and-int/lit8 v1, v9, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-virtual {v4}, Lp1/q;->Z()V

    and-int/lit8 v0, p12, 0x1

    const v1, -0x70001

    const v27, -0xe001

    if-eqz v0, :cond_25

    invoke-virtual {v4}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_17

    :cond_21
    invoke-virtual {v4}, Lp1/q;->X()V

    and-int/lit8 v0, p14, 0x8

    if-eqz v0, :cond_22

    and-int/lit16 v9, v9, -0x1c01

    :cond_22
    and-int/lit8 v0, p14, 0x10

    if-eqz v0, :cond_23

    and-int v9, v9, v27

    :cond_23
    and-int/lit8 v0, p14, 0x20

    if-eqz v0, :cond_24

    and-int/2addr v9, v1

    :cond_24
    move/from16 v2, p8

    move-object/from16 v20, v4

    move-object v0, v8

    move v3, v9

    move v1, v12

    move-object v9, v13

    move-object v11, v14

    move-object v6, v15

    move-object/from16 v12, p3

    move-object/from16 v14, p9

    goto/16 :goto_1f

    :cond_25
    :goto_17
    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_26

    move-object v8, v0

    :cond_26
    if-eqz v10, :cond_27

    const/4 v5, 0x1

    goto :goto_18

    :cond_27
    move v5, v12

    :goto_18
    and-int/lit8 v10, p14, 0x8

    const/4 v12, 0x6

    if-eqz v10, :cond_28

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v4, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v10

    and-int/lit16 v9, v9, -0x1c01

    goto :goto_19

    :cond_28
    move-object/from16 v10, p3

    :goto_19
    and-int/lit8 v16, p14, 0x10

    if-eqz v16, :cond_29

    sget-object v13, Lg1/v0;->a:Ll0/l1;

    sget-wide v16, Li2/x;->m:J

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v4, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v13, v4, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->X0()J

    move-result-wide v20

    invoke-virtual {v13, v4, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v28

    move-wide/from16 v14, v18

    move-wide/from16 v18, v20

    const/16 v21, 0x6

    const/16 v22, 0x0

    move-object/from16 v20, v4

    move v4, v12

    move-wide/from16 v12, v16

    move-wide/from16 v16, v28

    invoke-static/range {v12 .. v22}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v12

    move-object/from16 v14, v20

    and-int v9, v9, v27

    goto :goto_1a

    :cond_29
    move-object v14, v4

    move v4, v12

    move-object v12, v13

    :goto_1a
    and-int/lit8 v13, p14, 0x20

    if-eqz v13, :cond_2a

    move/from16 v16, v1

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X0()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v1

    and-int v2, v9, v16

    move v9, v2

    goto :goto_1b

    :cond_2a
    move-object/from16 v1, p5

    :goto_1b
    if-eqz v23, :cond_2b

    const/4 v2, 0x0

    goto :goto_1c

    :cond_2b
    move-object/from16 v2, p6

    :goto_1c
    if-eqz v6, :cond_2c

    move-object v7, v0

    :cond_2c
    if-eqz v24, :cond_2d

    const/4 v0, 0x1

    goto :goto_1d

    :cond_2d
    move/from16 v0, p8

    :goto_1d
    if-eqz v25, :cond_2e

    const/4 v15, 0x1

    int-to-float v3, v15

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/4 v6, 0x2

    int-to-float v6, v6

    mul-float/2addr v6, v4

    new-instance v4, Ll0/l1;

    invoke-direct {v4, v3, v6, v3, v6}, Ll0/l1;-><init>(FFFF)V

    move-object v11, v1

    move-object v6, v2

    move v1, v5

    move v3, v9

    move-object v9, v12

    move-object/from16 v20, v14

    move v2, v0

    move-object v14, v4

    :goto_1e
    move-object v0, v8

    move-object v12, v10

    goto :goto_1f

    :cond_2e
    move-object v11, v1

    move-object v6, v2

    move v1, v5

    move v3, v9

    move-object v9, v12

    move-object/from16 v20, v14

    move-object/from16 v14, p9

    move v2, v0

    goto :goto_1e

    :goto_1f
    invoke-virtual/range {v20 .. v20}, Lp1/q;->r()V

    and-int/lit8 v4, v3, 0xe

    or-int/lit16 v4, v4, 0xc00

    and-int/lit8 v5, v3, 0x70

    or-int/2addr v4, v5

    shr-int/lit8 v5, v3, 0x12

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v3

    or-int/2addr v4, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v5, v3

    or-int/2addr v4, v5

    const/high16 v5, 0xe000000

    shl-int/lit8 v8, v3, 0x12

    and-int/2addr v5, v8

    or-int/2addr v4, v5

    shl-int/lit8 v5, v3, 0xf

    const/high16 v8, 0x70000000

    and-int/2addr v5, v8

    or-int v17, v4, v5

    shr-int/lit8 v4, v3, 0xc

    and-int/lit8 v4, v4, 0x70

    shr-int/lit8 v5, v3, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v4, v5

    const v5, 0xe000

    shr-int/lit8 v3, v3, 0xf

    and-int/2addr v3, v5

    or-int/2addr v3, v4

    const/high16 v4, 0x70000

    shl-int/lit8 v5, v26, 0xf

    and-int/2addr v4, v5

    or-int v18, v3, v4

    const/16 v19, 0x2430

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v8, p2

    move-object/from16 v15, p10

    move-object/from16 v16, v20

    invoke-static/range {v0 .. v19}, Lny0/z;->e(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;Lb91/a;FLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v7

    move-object v5, v9

    move-object v4, v12

    move-object v10, v14

    move v9, v2

    move-object v7, v6

    move-object v6, v11

    move v2, v1

    move-object v1, v0

    goto :goto_20

    :cond_2f
    move-object/from16 v20, v4

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object v1, v8

    move v2, v12

    move-object v5, v13

    move-object v8, v7

    move-object/from16 v7, p6

    :goto_20
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_30

    new-instance v0, Ld41/c;

    move-object/from16 v3, p2

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Ld41/c;-><init>(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;III)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, Lp1/x;->L(I)I

    move-result v14

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v15, p13

    move-object/from16 v12, p14

    invoke-static/range {v1 .. v15}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
