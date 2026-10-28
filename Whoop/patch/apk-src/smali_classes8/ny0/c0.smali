.class public abstract Lny0/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a[\u0010\u000f\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Lg1/u0;",
        "buttonColors",
        "Lf0/t;",
        "border",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "b",
        "(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p3

    move-object p3, p2

    move-object p2, p5

    move-object p5, p4

    move-object p4, v0

    invoke-static/range {p0 .. p10}, Lny0/c0;->c(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/util/TextResource;",
            "Lg1/u0;",
            "Lf0/t;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v8, p3

    move-object/from16 v7, p6

    move/from16 v0, p8

    const-string v1, "buttonText"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onClick"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p7

    check-cast v1, Lp1/q;

    const v2, -0x3935f60b

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p9, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, p9, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p1

    invoke-virtual {v1, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :goto_3
    and-int/lit8 v10, p9, 0x4

    if-eqz v10, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v0, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v1, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_a

    invoke-virtual {v1, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_6

    :cond_9
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v5, v12

    :cond_a
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_d

    and-int/lit8 v12, p9, 0x10

    if-nez v12, :cond_b

    move-object/from16 v12, p4

    invoke-virtual {v1, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_7

    :cond_b
    move-object/from16 v12, p4

    :cond_c
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v5, v13

    goto :goto_8

    :cond_d
    move-object/from16 v12, p4

    :goto_8
    and-int/lit8 v20, p9, 0x20

    const/high16 v13, 0x30000

    if-eqz v20, :cond_f

    or-int/2addr v5, v13

    :cond_e
    move-object/from16 v13, p5

    goto :goto_a

    :cond_f
    and-int/2addr v13, v0

    if-nez v13, :cond_e

    move-object/from16 v13, p5

    invoke-virtual {v1, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_10
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v5, v14

    :goto_a
    const/high16 v21, 0x180000

    and-int v14, v0, v21

    if-nez v14, :cond_12

    invoke-virtual {v1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v14, 0x80000

    :goto_b
    or-int/2addr v5, v14

    :cond_12
    const v14, 0x92493

    and-int/2addr v14, v5

    const v15, 0x92492

    const/16 v16, 0x1

    if-eq v14, v15, :cond_13

    move/from16 v14, v16

    goto :goto_c

    :cond_13
    const/4 v14, 0x0

    :goto_c
    and-int/lit8 v15, v5, 0x1

    invoke-virtual {v1, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_1c

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v14, v0, 0x1

    const v22, -0xe001

    const/4 v15, 0x6

    if-eqz v14, :cond_16

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v2, p9, 0x10

    if-eqz v2, :cond_15

    and-int v5, v5, v22

    :cond_15
    move-object v10, v1

    move-object v2, v4

    move-object/from16 v23, v11

    move-object v11, v13

    move v1, v15

    goto/16 :goto_13

    :cond_16
    :goto_d
    if-eqz v2, :cond_17

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_e

    :cond_17
    move-object v2, v4

    :goto_e
    if-eqz v6, :cond_18

    move/from16 v4, v16

    goto :goto_f

    :cond_18
    move v4, v9

    :goto_f
    const/4 v6, 0x0

    if-eqz v10, :cond_19

    move-object/from16 v23, v6

    goto :goto_10

    :cond_19
    move-object/from16 v23, v11

    :goto_10
    and-int/lit8 v9, p9, 0x10

    if-eqz v9, :cond_1a

    sget-object v9, Lg1/v0;->a:Ll0/l1;

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v1, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v9, v1, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->w()J

    move-result-wide v16

    invoke-virtual {v9, v1, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v18

    invoke-virtual {v9, v1, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v24

    move-wide v9, v10

    move v14, v15

    move-wide/from16 v11, v16

    move-wide/from16 v15, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v1

    move v1, v14

    move-wide/from16 v13, v24

    invoke-static/range {v9 .. v19}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v9

    move-object/from16 v10, v17

    and-int v5, v5, v22

    goto :goto_11

    :cond_1a
    move-object v10, v1

    move v1, v15

    move-object v9, v12

    :goto_11
    if-eqz v20, :cond_1b

    move-object v11, v6

    :goto_12
    move-object v12, v9

    move v9, v4

    goto :goto_13

    :cond_1b
    move-object/from16 v11, p5

    goto :goto_12

    :goto_13
    invoke-virtual {v10}, Lp1/q;->r()V

    const/4 v4, 0x3

    int-to-float v6, v4

    int-to-float v3, v3

    mul-float v13, v6, v3

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v1

    and-int/lit8 v3, v5, 0xe

    or-int v3, v3, v21

    and-int/lit8 v6, v5, 0x70

    or-int/2addr v3, v6

    shl-int/lit8 v6, v5, 0x3

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v3, v6

    shl-int/lit8 v6, v5, 0xf

    const/high16 v14, 0xe000000

    and-int/2addr v14, v6

    or-int/2addr v3, v14

    const/high16 v14, 0x70000000

    and-int/2addr v6, v14

    or-int v17, v3, v6

    shr-int/lit8 v3, v5, 0xc

    and-int/lit8 v3, v3, 0x70

    or-int/lit16 v3, v3, 0xc00

    const/high16 v6, 0x70000

    shr-int/lit8 v4, v5, 0x3

    and-int/2addr v4, v6

    or-int v18, v3, v4

    const/16 v19, 0x44b4

    move-object v0, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    const/4 v14, 0x0

    move-object v3, v12

    move-object v12, v1

    move v1, v9

    move-object v9, v3

    move-object/from16 v15, p6

    move-object/from16 v3, v23

    invoke-static/range {v0 .. v19}, Lny0/z;->e(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;Lb91/a;FLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move v2, v1

    move-object v5, v9

    move-object v6, v11

    move-object v1, v0

    goto :goto_14

    :cond_1c
    move-object/from16 v16, v1

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v1, v4

    move v2, v9

    move-object v3, v11

    move-object v5, v12

    :goto_14
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1d

    new-instance v0, Lny0/b0;

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lny0/b0;-><init>(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lny0/c0;->b(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
