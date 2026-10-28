.class public abstract Lh01/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ay\u0010\u0010\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0017\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "quantity",
        "",
        "rotation",
        "duration",
        "",
        "highlightCounter",
        "inUpdatingState",
        "shouldPlayShimmer",
        "animateToReplayIcon",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onShimmerFinished",
        "onClick",
        "e",
        "(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "counterWidth",
        "checkmarkIconSize",
        "isAnimatingShimmer",
        "shimmerAlpha",
        "home-notifications-center_release"
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh01/f;->i(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lh01/f;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lh01/f;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lh01/f;->j(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "IFIZZZZ",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v11, p11

    move/from16 v12, p12

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v1, -0x1d304f56

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v11, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v11, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v11

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v11

    :goto_1
    and-int/lit8 v7, v11, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v11, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v6, v8

    goto :goto_4

    :cond_6
    move/from16 v7, p2

    :goto_4
    and-int/lit16 v8, v11, 0xc00

    if-nez v8, :cond_8

    move/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v6, v9

    goto :goto_6

    :cond_8
    move/from16 v8, p3

    :goto_6
    and-int/lit8 v9, v12, 0x10

    if-eqz v9, :cond_a

    or-int/lit16 v6, v6, 0x6000

    :cond_9
    move/from16 v10, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v10, v11, 0x6000

    if-nez v10, :cond_9

    move/from16 v10, p4

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x4000

    goto :goto_7

    :cond_b
    const/16 v13, 0x2000

    :goto_7
    or-int/2addr v6, v13

    :goto_8
    and-int/lit8 v13, v12, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_d

    or-int/2addr v6, v14

    :cond_c
    move/from16 v14, p5

    goto :goto_a

    :cond_d
    and-int/2addr v14, v11

    if-nez v14, :cond_c

    move/from16 v14, p5

    invoke-virtual {v0, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v6, v15

    :goto_a
    and-int/lit8 v15, v12, 0x40

    const/high16 v17, 0x180000

    if-eqz v15, :cond_f

    or-int v6, v6, v17

    move/from16 v3, p6

    goto :goto_c

    :cond_f
    and-int v17, v11, v17

    move/from16 v3, p6

    if-nez v17, :cond_11

    invoke-virtual {v0, v3}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x100000

    goto :goto_b

    :cond_10
    const/high16 v18, 0x80000

    :goto_b
    or-int v6, v6, v18

    :cond_11
    :goto_c
    and-int/lit16 v4, v12, 0x80

    const/high16 v19, 0xc00000

    if-eqz v4, :cond_12

    or-int v6, v6, v19

    move/from16 p10, v1

    move/from16 v1, p7

    goto :goto_e

    :cond_12
    and-int v19, v11, v19

    move/from16 p10, v1

    move/from16 v1, p7

    if-nez v19, :cond_14

    invoke-virtual {v0, v1}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x800000

    goto :goto_d

    :cond_13
    const/high16 v19, 0x400000

    :goto_d
    or-int v6, v6, v19

    :cond_14
    :goto_e
    and-int/lit16 v1, v12, 0x100

    move/from16 v19, v1

    const/high16 v20, 0x6000000

    if-eqz v19, :cond_15

    or-int v6, v6, v20

    move-object/from16 v1, p8

    goto :goto_10

    :cond_15
    and-int v20, v11, v20

    move-object/from16 v1, p8

    if-nez v20, :cond_17

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_16

    const/high16 v21, 0x4000000

    goto :goto_f

    :cond_16
    const/high16 v21, 0x2000000

    :goto_f
    or-int v6, v6, v21

    :cond_17
    :goto_10
    and-int/lit16 v1, v12, 0x200

    move/from16 v21, v1

    const/high16 v22, 0x30000000

    if-eqz v21, :cond_18

    or-int v6, v6, v22

    move-object/from16 v1, p9

    goto :goto_12

    :cond_18
    and-int v22, v11, v22

    move-object/from16 v1, p9

    if-nez v22, :cond_1a

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_19

    const/high16 v23, 0x20000000

    goto :goto_11

    :cond_19
    const/high16 v23, 0x10000000

    :goto_11
    or-int v6, v6, v23

    :cond_1a
    :goto_12
    const v23, 0x12492493

    and-int v1, v6, v23

    const v2, 0x12492492

    if-eq v1, v2, :cond_1b

    const/4 v1, 0x1

    goto :goto_13

    :cond_1b
    const/4 v1, 0x0

    :goto_13
    and-int/lit8 v2, v6, 0x1

    invoke-virtual {v0, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_42

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz p10, :cond_1c

    move-object v5, v1

    :cond_1c
    if-eqz v9, :cond_1d

    const/4 v10, 0x0

    :cond_1d
    if-eqz v13, :cond_1e

    const/4 v2, 0x0

    goto :goto_14

    :cond_1e
    move/from16 v2, p5

    :goto_14
    if-eqz v15, :cond_1f

    const/4 v3, 0x0

    :cond_1f
    if-eqz v4, :cond_20

    const/4 v4, 0x0

    goto :goto_15

    :cond_20
    move/from16 v4, p7

    :goto_15
    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v13, 0x6

    if-eqz v19, :cond_22

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v9, :cond_21

    new-instance v15, Lga1/b;

    invoke-direct {v15, v13}, Lga1/b;-><init>(I)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v15, Lc93/a;

    goto :goto_16

    :cond_22
    move-object/from16 v15, p8

    :goto_16
    if-eqz v21, :cond_24

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v9, :cond_23

    new-instance v14, Lga1/b;

    const/4 v13, 0x7

    invoke-direct {v14, v13}, Lga1/b;-><init>(I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    move-object v13, v14

    check-cast v13, Lc93/a;

    goto :goto_17

    :cond_24
    move-object/from16 v13, p9

    :goto_17
    const/16 v14, 0xc

    if-nez p1, :cond_25

    move-object/from16 v35, v0

    int-to-float v0, v14

    move/from16 v18, v0

    const/4 v14, 0x4

    int-to-float v0, v14

    mul-float v0, v0, v18

    move/from16 v39, v2

    goto :goto_18

    :cond_25
    move-object/from16 v35, v0

    move/from16 v39, v2

    const/4 v0, 0x6

    const/4 v14, 0x4

    int-to-float v2, v0

    int-to-float v0, v14

    mul-float/2addr v0, v2

    :goto_18
    const/16 v2, 0x180

    const/16 v18, 0xa

    const/16 v21, 0x0

    const-string v24, "buttonWidth"

    move/from16 p4, v0

    move/from16 p8, v2

    move/from16 p9, v18

    move-object/from16 p5, v21

    move-object/from16 p6, v24

    move-object/from16 p7, v35

    invoke-static/range {p4 .. p9}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    if-nez p1, :cond_26

    move-object/from16 v21, v0

    const/4 v2, 0x6

    int-to-float v0, v2

    int-to-float v2, v14

    mul-float/2addr v0, v2

    goto :goto_19

    :cond_26
    move-object/from16 v21, v0

    int-to-float v0, v14

    mul-float/2addr v0, v0

    :goto_19
    const/16 v2, 0x180

    const/16 v14, 0xa

    const/16 v24, 0x0

    const-string v25, "checkmarkIconSize"

    move/from16 p4, v0

    move/from16 p8, v2

    move/from16 p9, v14

    move-object/from16 p5, v24

    move-object/from16 p6, v25

    move-object/from16 p7, v35

    invoke-static/range {p4 .. p9}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v0

    move-object/from16 v2, p7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v9, :cond_27

    invoke-static {v2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v14

    :cond_27
    check-cast v14, Lj0/i;

    move-object/from16 v31, v0

    const/4 v0, 0x6

    invoke-static {v14, v2, v0}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v24

    sget-object v0, Li2/w0;->a:Li2/v0;

    move/from16 v25, v3

    if-eqz v4, :cond_28

    const v3, 0x6da69877

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    move/from16 v32, v4

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->r()J

    move-result-wide v3

    invoke-static {v1, v3, v4, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    :goto_1a
    move/from16 v33, v6

    goto :goto_1c

    :cond_28
    move/from16 v32, v4

    const/4 v3, 0x0

    invoke-interface/range {v24 .. v24}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_2a

    if-eqz p1, :cond_2a

    if-eqz v10, :cond_29

    goto :goto_1b

    :cond_29
    const v4, 0x6da6afef

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    const-wide v23, 0xff363b3eL

    invoke-static/range {v23 .. v24}, Li2/w0;->e(J)J

    move-result-wide v3

    invoke-static {v1, v3, v4, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_1a

    :cond_2a
    :goto_1b
    const v0, 0x6da6a793

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    const/4 v3, 0x0

    move/from16 v33, v6

    const/4 v4, 0x6

    const/4 v6, 0x0

    invoke-static {v1, v0, v6, v3, v4}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :goto_1c
    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    const/16 v6, 0xc

    int-to-float v6, v6

    move/from16 v24, v6

    const/4 v6, 0x4

    int-to-float v7, v6

    mul-float v6, v24, v7

    invoke-interface {v4, v6}, Ly3/c;->q0(F)F

    move-result v4

    move/from16 v34, v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_2b

    neg-float v7, v4

    invoke-static {v7}, Ld0/f;->a(F)Ld0/e;

    move-result-object v7

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v7, Ld0/e;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v9, :cond_2c

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v8, Lp1/c1;

    invoke-static {v8}, Lh01/f;->m(Lp1/c1;)Z

    move-result v24

    move-object/from16 v35, v2

    if-eqz v24, :cond_2d

    const/high16 v24, 0x3f800000    # 1.0f

    goto :goto_1d

    :cond_2d
    const v24, 0x3dcccccd    # 0.1f

    :goto_1d
    const/16 v2, 0x3e8

    move-object/from16 v26, v8

    move/from16 p0, v10

    const/4 v8, 0x6

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v11, v10, v8}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/16 v8, 0xc30

    const/16 v10, 0x14

    const-string v11, "shimmerTransparency"

    const/16 v27, 0x0

    move-object/from16 p5, v2

    move/from16 p9, v8

    move/from16 p10, v10

    move-object/from16 p6, v11

    move/from16 p4, v24

    move-object/from16 p7, v27

    move-object/from16 p8, v35

    invoke-static/range {p4 .. p10}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v2

    move-object/from16 v8, p8

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-interface {v3}, Ly3/c;->m0()F

    move-result v3

    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/high16 v11, 0x380000

    and-int v11, v33, v11

    move-object/from16 v35, v2

    const/high16 v2, 0x100000

    if-ne v11, v2, :cond_2e

    const/4 v2, 0x1

    goto :goto_1e

    :cond_2e
    const/4 v2, 0x0

    :goto_1e
    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v2, v11

    invoke-virtual {v8, v4}, Lp1/q;->d(F)Z

    move-result v11

    or-int/2addr v2, v11

    const/high16 v11, 0xe000000

    and-int v11, v33, v11

    move/from16 p4, v2

    const/high16 v2, 0x4000000

    if-ne v11, v2, :cond_2f

    const/4 v2, 0x1

    goto :goto_1f

    :cond_2f
    const/4 v2, 0x0

    :goto_1f
    or-int v2, p4, v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_31

    if-ne v11, v9, :cond_30

    goto :goto_20

    :cond_30
    move-object v4, v15

    move/from16 v2, v25

    move-object/from16 v15, v26

    goto :goto_21

    :cond_31
    :goto_20
    new-instance v2, Lh01/f$a;

    const/4 v11, 0x0

    move-object/from16 p4, v2

    move/from16 p7, v4

    move-object/from16 p6, v7

    move-object/from16 p10, v11

    move-object/from16 p8, v15

    move/from16 p5, v25

    move-object/from16 p9, v26

    invoke-direct/range {p4 .. p10}, Lh01/f$a;-><init>(ZLd0/e;FLc93/a;Lp1/c1;Lq83/d;)V

    move-object/from16 v11, p4

    move/from16 v2, p5

    move-object/from16 v4, p8

    move-object/from16 v15, p9

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    check-cast v11, Lc93/m;

    shr-int/lit8 v17, v33, 0x12

    invoke-static {v8, v11, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v10, 0x2

    int-to-float v10, v10

    mul-float v10, v10, v34

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v1, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-interface {v10, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {v21 .. v21}, Lh01/f;->k(Lp1/t2;)F

    move-result v10

    invoke-static {v0, v10, v6}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/high16 v0, 0x70000000

    and-int v0, v33, v0

    const/high16 v6, 0x20000000

    if-ne v0, v6, :cond_32

    const/4 v0, 0x1

    goto :goto_22

    :cond_32
    const/4 v0, 0x0

    :goto_22
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_33

    if-ne v6, v9, :cond_34

    :cond_33
    new-instance v6, Le61/e;

    const/4 v0, 0x4

    invoke-direct {v6, v13, v0}, Le61/e;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    move-object/from16 v29, v6

    check-cast v29, Lc93/a;

    const/16 v30, 0x1c

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v14

    invoke-static/range {v24 .. v30}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v6, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 p10, v2

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-eqz v2, :cond_35

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_23

    :cond_35
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_23
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v8, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    move/from16 p4, v3

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_36

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v40, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_37

    goto :goto_24

    :cond_36
    move-object/from16 v40, v4

    :goto_24
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_37
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15}, Lh01/f;->m(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_38

    const v0, -0x3bd2253c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-static/range {v35 .. v35}, Lh01/f;->h(Lp1/t2;)F

    move-result v0

    const/16 v4, 0x40

    invoke-static {v0, v7, v8, v4}, Lwn1/f;->b(FLd0/e;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_25
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_26

    :cond_38
    const/4 v0, 0x0

    const v4, -0x3bd0d362

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_25

    :goto_26
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v7, v5

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    mul-float v4, v4, v34

    div-float v4, v4, p4

    move-object v5, v13

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v12

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v10, v12

    div-float v12, v10, p4

    invoke-static {v0, v12, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-lez p1, :cond_39

    sget-object v4, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-static {v10, v4}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v4

    goto :goto_27

    :cond_39
    sget-object v4, Ll0/m;->e:Ll0/h;

    :goto_27
    sget-object v10, Lb2/e;->N:Lb2/k;

    const/16 v12, 0x30

    invoke-static {v4, v10, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_3a

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_28

    :cond_3a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_28
    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_3b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3c

    :cond_3b
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3c
    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v39, :cond_3d

    const v0, -0x754ac18c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-static {v8, v0}, Lwn1/e;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move v3, v0

    move/from16 v0, v32

    const/4 v1, 0x1

    goto/16 :goto_2a

    :cond_3d
    const/4 v0, 0x0

    const v4, -0x75495454

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-static {v6, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_3e

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_29

    :cond_3e
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_29
    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_3f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_40

    :cond_3f
    invoke-static {v0, v8, v0, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_40
    invoke-static {v8, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v31 .. v31}, Lh01/f;->l(Lp1/t2;)F

    move-result v0

    shr-int/lit8 v1, v33, 0x6

    and-int/lit8 v1, v1, 0xe

    and-int/lit8 v2, v17, 0x70

    or-int/2addr v1, v2

    shr-int/lit8 v2, v33, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    move/from16 p4, p2

    move/from16 p6, p3

    move/from16 p7, v0

    move/from16 p9, v1

    move-object/from16 p8, v8

    move/from16 p5, v32

    invoke-static/range {p4 .. p9}, Lwn1/c;->c(FZIFLandroidx/compose/runtime/Composer;I)V

    move-object/from16 v35, p8

    move/from16 v0, p9

    invoke-static/range {v31 .. v31}, Lh01/f;->l(Lp1/t2;)F

    move-result v1

    move/from16 p7, v1

    invoke-static/range {p4 .. p9}, Lwn1/d;->c(FZIFLandroidx/compose/runtime/Composer;I)V

    move/from16 v0, p5

    const/4 v1, 0x1

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_2a
    if-lez p1, :cond_41

    const v2, -0x753c70c4

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v15

    invoke-virtual {v2, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->E()Lb91/a;

    move-result-object v33

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v37, v2, 0x12

    const v38, 0x2fffa

    const/4 v14, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    move-object/from16 v35, v8

    invoke-static/range {v13 .. v38}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_2b

    :cond_41
    const v2, -0x753945ec

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_2b
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move-object v10, v5

    move-object v1, v7

    move-object/from16 v35, v8

    move/from16 v6, v39

    move-object/from16 v9, v40

    move/from16 v5, p0

    move/from16 v7, p10

    move v8, v0

    goto :goto_2c

    :cond_42
    move-object v8, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    move/from16 v6, p5

    move-object/from16 v9, p8

    move v7, v3

    move-object v1, v5

    move-object/from16 v35, v8

    move v5, v10

    move/from16 v8, p7

    move-object/from16 v10, p9

    :goto_2c
    invoke-virtual/range {v35 .. v35}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_43

    new-instance v0, Lh01/e;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, Lh01/e;-><init>(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_43
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lh01/f;->e(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final l(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final m(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
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

.method private static final n(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic o(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lh01/f;->n(Lp1/c1;Z)V

    return-void
.end method
