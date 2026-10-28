.class public abstract Lun1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u007f\u0010\u0014\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "quantity",
        "",
        "isVisible",
        "",
        "rotation",
        "isUpdating",
        "shouldAnimateTransition",
        "playShimmer",
        "highlightCounter",
        "Lun1/h;",
        "transitionState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onShimmerFinished",
        "Lc0/c1;",
        "enter",
        "onClick",
        "c",
        "(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;Landroidx/compose/runtime/Composer;III)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p16}, Lun1/c;->e(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lun1/h;IFZZZLc93/a;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lun1/c;->d(Lun1/h;IFZZZLc93/a;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;Landroidx/compose/runtime/Composer;III)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "IZFZZZZ",
            "Lun1/h;",
            "Lc93/a;",
            "Lc0/c1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v2, p1

    move/from16 v9, p2

    move/from16 v10, p5

    move-object/from16 v7, p9

    move-object/from16 v8, p11

    move/from16 v13, p13

    move/from16 v15, p15

    const-string v0, "transitionState"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShimmerFinished"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p12

    check-cast v11, Lp1/q;

    const v0, 0x61339650

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v15, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v5, v13, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v13, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v13

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v13

    :goto_1
    and-int/lit8 v12, v13, 0x30

    const/16 v16, 0x20

    if-nez v12, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_3

    move/from16 v12, v16

    goto :goto_2

    :cond_3
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v6, v12

    :cond_4
    and-int/lit16 v12, v13, 0x180

    if-nez v12, :cond_6

    invoke-virtual {v11, v9}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_5

    const/16 v12, 0x100

    goto :goto_3

    :cond_5
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v6, v12

    :cond_6
    and-int/lit16 v12, v13, 0xc00

    if-nez v12, :cond_8

    move/from16 v12, p3

    invoke-virtual {v11, v12}, Lp1/q;->d(F)Z

    move-result v17

    if-eqz v17, :cond_7

    const/16 v17, 0x800

    goto :goto_4

    :cond_7
    const/16 v17, 0x400

    :goto_4
    or-int v6, v6, v17

    goto :goto_5

    :cond_8
    move/from16 v12, p3

    :goto_5
    and-int/lit16 v14, v13, 0x6000

    if-nez v14, :cond_a

    move/from16 v14, p4

    invoke-virtual {v11, v14}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_9

    const/16 v17, 0x4000

    goto :goto_6

    :cond_9
    const/16 v17, 0x2000

    :goto_6
    or-int v6, v6, v17

    goto :goto_7

    :cond_a
    move/from16 v14, p4

    :goto_7
    const/high16 v17, 0x30000

    and-int v18, v13, v17

    if-nez v18, :cond_c

    invoke-virtual {v11, v10}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    const/high16 v18, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v18, 0x10000

    :goto_8
    or-int v6, v6, v18

    :cond_c
    const/high16 v18, 0x180000

    and-int v18, v13, v18

    move/from16 v3, p6

    if-nez v18, :cond_e

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_d

    const/high16 v19, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v19, 0x80000

    :goto_9
    or-int v6, v6, v19

    :cond_e
    const/high16 v19, 0xc00000

    and-int v19, v13, v19

    move/from16 v4, p7

    if-nez v19, :cond_10

    invoke-virtual {v11, v4}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_f

    const/high16 v20, 0x800000

    goto :goto_a

    :cond_f
    const/high16 v20, 0x400000

    :goto_a
    or-int v6, v6, v20

    :cond_10
    const/high16 v20, 0x6000000

    and-int v20, v13, v20

    if-nez v20, :cond_12

    move/from16 v20, v0

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v11, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_11

    const/high16 v0, 0x4000000

    goto :goto_b

    :cond_11
    const/high16 v0, 0x2000000

    :goto_b
    or-int/2addr v6, v0

    goto :goto_c

    :cond_12
    move/from16 v20, v0

    :goto_c
    const/high16 v0, 0x30000000

    and-int/2addr v0, v13

    if-nez v0, :cond_14

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/high16 v0, 0x20000000

    goto :goto_d

    :cond_13
    const/high16 v0, 0x10000000

    :goto_d
    or-int/2addr v6, v0

    :cond_14
    and-int/lit8 v0, p14, 0x6

    if-nez v0, :cond_17

    and-int/lit16 v0, v15, 0x400

    if-nez v0, :cond_15

    move-object/from16 v0, p10

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_16

    const/16 v21, 0x4

    goto :goto_e

    :cond_15
    move-object/from16 v0, p10

    :cond_16
    const/16 v21, 0x2

    :goto_e
    or-int v21, p14, v21

    goto :goto_f

    :cond_17
    move-object/from16 v0, p10

    move/from16 v21, p14

    :goto_f
    and-int/lit8 v22, p14, 0x30

    if-nez v22, :cond_19

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_18

    goto :goto_10

    :cond_18
    const/16 v16, 0x10

    :goto_10
    or-int v21, v21, v16

    :cond_19
    const v16, 0x12492493

    and-int v0, v6, v16

    const v1, 0x12492492

    const/16 v16, 0x0

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1b

    and-int/lit8 v0, v21, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_1a

    goto :goto_11

    :cond_1a
    move/from16 v0, v16

    goto :goto_12

    :cond_1b
    :goto_11
    move v0, v2

    :goto_12
    and-int/lit8 v1, v6, 0x1

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v0, v13, 0x1

    if-eqz v0, :cond_1e

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit16 v0, v15, 0x400

    if-eqz v0, :cond_1d

    and-int/lit8 v21, v21, -0xf

    :cond_1d
    move-object/from16 v18, p10

    move-object/from16 v20, v5

    :goto_13
    const/4 v0, 0x2

    goto :goto_16

    :cond_1e
    :goto_14
    if-eqz v20, :cond_1f

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_15

    :cond_1f
    move-object v0, v5

    :goto_15
    and-int/lit16 v1, v15, 0x400

    if-eqz v1, :cond_20

    sget-object v1, Lc0/c1;->a:Lc0/d1;

    and-int/lit8 v21, v21, -0xf

    move-object/from16 v20, v0

    move-object/from16 v18, v1

    goto :goto_13

    :cond_20
    move-object/from16 v18, p10

    move-object/from16 v20, v0

    goto :goto_13

    :goto_16
    invoke-virtual {v11}, Lp1/q;->r()V

    if-eqz v9, :cond_22

    if-nez v10, :cond_21

    if-lez p1, :cond_22

    :cond_21
    move/from16 v16, v2

    :cond_22
    if-eqz v10, :cond_23

    const/16 v1, 0x1f4

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-static {v2, v1, v5, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    invoke-static {v1, v0}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v0

    :goto_17
    move-object/from16 v19, v0

    goto :goto_18

    :cond_23
    sget-object v0, Lc0/e1;->a:Lc0/f1;

    goto :goto_17

    :goto_18
    new-instance v0, Lun1/a;

    move/from16 v2, p1

    move-object/from16 v1, p8

    move v6, v3

    move v3, v12

    move v5, v14

    invoke-direct/range {v0 .. v8}, Lun1/a;-><init>(Lun1/h;IFZZZLc93/a;Lc93/a;)V

    const v1, -0x7a99bd88

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shl-int/lit8 v1, v21, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int v23, v1, v17

    const/16 v24, 0x10

    move-object/from16 v17, v20

    const/16 v20, 0x0

    move-object/from16 v21, v0

    move-object/from16 v22, v11

    invoke-static/range {v16 .. v24}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v1, v17

    move-object/from16 v11, v18

    goto :goto_19

    :cond_24
    move-object/from16 v22, v11

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    move-object/from16 v11, p10

    move-object v1, v5

    :goto_19
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_25

    move-object v2, v0

    new-instance v0, Lun1/b;

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v12, p11

    move/from16 v14, p14

    move-object/from16 v25, v2

    move v3, v9

    move v6, v10

    move/from16 v2, p1

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v15}, Lun1/b;-><init>(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;III)V

    move-object/from16 v2, v25

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final d(Lun1/h;IFZZZLc93/a;Lc93/a;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    const-string v0, "$this$AnimatedVisibility"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lun1/h;->REPLAY:Lun1/h;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    :goto_0
    move v7, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    :goto_1
    const/16 v11, 0xc00

    const/4 v12, 0x1

    const/4 v0, 0x0

    const/16 v3, 0x1f4

    move v1, p1

    move v2, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p9

    invoke-static/range {v0 .. v12}, Lh01/f;->e(Landroidx/compose/ui/Modifier;IFIZZZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    or-int/lit8 v0, p12, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v14

    invoke-static/range {p13 .. p13}, Lp1/x;->L(I)I

    move-result v15

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p14

    move-object/from16 v13, p15

    invoke-static/range {v1 .. v16}, Lun1/c;->c(Landroidx/compose/ui/Modifier;IZFZZZZLun1/h;Lc93/a;Lc0/c1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
