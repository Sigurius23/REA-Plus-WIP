.class public abstract Lwy0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwy0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ac\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aO\u0010\u001a\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly3/f;",
        "radius",
        "",
        "fillPercent",
        "Li91/a;",
        "background",
        "strokeWidth",
        "",
        "showIndicator",
        "startAngle",
        "",
        "cap",
        "Lwy0/d;",
        "indicatorType",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V",
        "Lk2/e;",
        "Li91/h;",
        "strokeWidthPx",
        "Lh2/e;",
        "arcSize",
        "Lh2/b;",
        "offset",
        "f",
        "(Lk2/e;FLi91/h;FJFIJ)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lwy0/c;->e(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLi91/h;FFFIFZLwy0/d;JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lwy0/c;->d(FLi91/h;FFFIFZLwy0/d;JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v10, p10

    move/from16 v11, p11

    const-string v0, "background"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x2dc38f49

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, v10, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v10, 0x6

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
    or-int/2addr v6, v10

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v10

    :goto_1
    and-int/lit8 v7, v10, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v10, 0x180

    move/from16 v13, p2

    if-nez v7, :cond_6

    invoke-virtual {v0, v13}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v10, 0xc00

    if-nez v7, :cond_8

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_4

    :cond_7
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_8
    and-int/lit8 v7, v11, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v6, v6, 0x6000

    :cond_9
    move/from16 v9, p4

    goto :goto_6

    :cond_a
    and-int/lit16 v9, v10, 0x6000

    if-nez v9, :cond_9

    move/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_5

    :cond_b
    const/16 v12, 0x2000

    :goto_5
    or-int/2addr v6, v12

    :goto_6
    and-int/lit8 v12, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v12, :cond_d

    or-int/2addr v6, v15

    :cond_c
    move/from16 v15, p5

    goto :goto_8

    :cond_d
    and-int/2addr v15, v10

    if-nez v15, :cond_c

    move/from16 v15, p5

    invoke-virtual {v0, v15}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_e
    const/high16 v16, 0x10000

    :goto_7
    or-int v6, v6, v16

    :goto_8
    and-int/lit8 v16, v11, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_f

    or-int v6, v6, v17

    move/from16 v14, p6

    goto :goto_a

    :cond_f
    and-int v17, v10, v17

    move/from16 v14, p6

    if-nez v17, :cond_11

    invoke-virtual {v0, v14}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v18, 0x80000

    :goto_9
    or-int v6, v6, v18

    :cond_11
    :goto_a
    const/high16 v18, 0xc00000

    and-int v19, v10, v18

    if-nez v19, :cond_14

    and-int/lit16 v8, v11, 0x80

    if-nez v8, :cond_12

    move/from16 v8, p7

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x800000

    goto :goto_b

    :cond_12
    move/from16 v8, p7

    :cond_13
    const/high16 v21, 0x400000

    :goto_b
    or-int v6, v6, v21

    goto :goto_c

    :cond_14
    move/from16 v8, p7

    :goto_c
    and-int/lit16 v3, v11, 0x100

    move/from16 v22, v1

    const/high16 v23, 0x6000000

    if-eqz v3, :cond_15

    or-int v6, v6, v23

    goto :goto_10

    :cond_15
    and-int v23, v10, v23

    if-nez v23, :cond_18

    if-nez p8, :cond_16

    const/16 v23, -0x1

    :goto_d
    move/from16 v1, v23

    goto :goto_e

    :cond_16
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v23

    goto :goto_d

    :goto_e
    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_17

    const/high16 v1, 0x4000000

    goto :goto_f

    :cond_17
    const/high16 v1, 0x2000000

    :goto_f
    or-int/2addr v6, v1

    :cond_18
    :goto_10
    const v1, 0x2492493

    and-int/2addr v1, v6

    move/from16 v23, v3

    const v3, 0x2492492

    const/16 v24, 0x1

    if-eq v1, v3, :cond_19

    move/from16 v1, v24

    goto :goto_11

    :cond_19
    const/4 v1, 0x0

    :goto_11
    and-int/lit8 v3, v6, 0x1

    invoke-virtual {v0, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2c

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, v10, 0x1

    const v25, -0x1c00001

    const/4 v3, 0x6

    if-eqz v1, :cond_1c

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit16 v1, v11, 0x80

    if-eqz v1, :cond_1b

    and-int v6, v6, v25

    :cond_1b
    move-object/from16 v1, p0

    move-object/from16 v21, p8

    move v7, v9

    move/from16 v17, v14

    :goto_12
    move/from16 v20, v15

    const/high16 v9, 0x100000

    const/4 v12, 0x2

    const/16 v14, 0x100

    goto :goto_17

    :cond_1c
    :goto_13
    if-eqz v22, :cond_1d

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_14

    :cond_1d
    move-object/from16 v1, p0

    :goto_14
    if-eqz v7, :cond_1e

    int-to-float v7, v3

    goto :goto_15

    :cond_1e
    move v7, v9

    :goto_15
    if-eqz v12, :cond_1f

    const/4 v15, 0x0

    :cond_1f
    if-eqz v16, :cond_20

    const/4 v9, 0x0

    goto :goto_16

    :cond_20
    move v9, v14

    :goto_16
    and-int/lit16 v12, v11, 0x80

    if-eqz v12, :cond_21

    and-int v6, v6, v25

    const/4 v8, 0x0

    :cond_21
    if-eqz v23, :cond_22

    sget-object v12, Lwy0/d;->ARC:Lwy0/d;

    move/from16 v17, v9

    move-object/from16 v21, v12

    goto :goto_12

    :cond_22
    move-object/from16 v21, p8

    move/from16 v17, v9

    goto :goto_12

    :goto_17
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly3/c;

    invoke-interface {v15, v7}, Ly3/c;->q0(F)F

    move-result v15

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-interface {v3, v2}, Ly3/c;->q0(F)F

    move-result v3

    int-to-float v12, v12

    mul-float/2addr v3, v12

    sub-float/2addr v3, v15

    const/high16 v16, 0x40000000    # 2.0f

    div-float v14, v15, v16

    shr-int/lit8 v16, v6, 0x9

    and-int/lit8 v5, v16, 0xe

    invoke-static {v4, v0, v5}, Li91/i;->a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;

    move-result-object v5

    mul-float/2addr v12, v2

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 p5, v1

    and-int/lit16 v1, v6, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_23

    move/from16 v1, v24

    goto :goto_18

    :cond_23
    const/4 v1, 0x0

    :goto_18
    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v15}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0, v3}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    const/high16 v2, 0x380000

    and-int/2addr v2, v6

    move/from16 p4, v1

    const/high16 v1, 0x100000

    if-ne v2, v1, :cond_24

    move/from16 v1, v24

    goto :goto_19

    :cond_24
    const/4 v1, 0x0

    :goto_19
    or-int v1, p4, v1

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v6

    xor-int v2, v2, v18

    move/from16 p0, v1

    const/high16 v1, 0x800000

    if-le v2, v1, :cond_25

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v2

    if-nez v2, :cond_26

    :cond_25
    and-int v2, v6, v18

    if-ne v2, v1, :cond_27

    :cond_26
    move/from16 v1, v24

    goto :goto_1a

    :cond_27
    const/4 v1, 0x0

    :goto_1a
    or-int v1, p0, v1

    invoke-virtual {v0, v14}, Lp1/q;->d(F)Z

    move-result v2

    or-int/2addr v1, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v6

    move/from16 p0, v1

    const/high16 v1, 0x20000

    if-ne v2, v1, :cond_28

    move/from16 v1, v24

    goto :goto_1b

    :cond_28
    const/4 v1, 0x0

    :goto_1b
    or-int v1, p0, v1

    const/high16 v2, 0xe000000

    and-int/2addr v2, v6

    const/high16 v6, 0x4000000

    if-ne v2, v6, :cond_29

    goto :goto_1c

    :cond_29
    const/16 v24, 0x0

    :goto_1c
    or-int v1, v1, v24

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2a

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2b

    :cond_2a
    move-object v1, v12

    goto :goto_1d

    :cond_2b
    move/from16 v18, v8

    move-object v1, v12

    goto :goto_1e

    :goto_1d
    new-instance v12, Lwy0/a;

    move/from16 v16, v3

    move/from16 v18, v8

    move-wide/from16 v22, v9

    move/from16 v19, v14

    move-object v14, v5

    invoke-direct/range {v12 .. v23}, Lwy0/a;-><init>(FLi91/h;FFFIFZLwy0/d;J)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v12

    :goto_1e
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v1, p5

    move v5, v7

    move/from16 v7, v17

    move/from16 v8, v18

    move/from16 v6, v20

    move-object/from16 v9, v21

    goto :goto_1f

    :cond_2c
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move v5, v9

    move v7, v14

    move v6, v15

    move-object/from16 v9, p8

    :goto_1f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2d

    new-instance v0, Lwy0/b;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v10, p10

    invoke-direct/range {v0 .. v11}, Lwy0/b;-><init>(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final d(FLi91/h;FFFIFZLwy0/d;JLk2/e;)Ll83/a0;
    .locals 16

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lk2/e;->B0()J

    move-result-wide v2

    invoke-interface {v1}, Lk2/e;->t0()La3/p;

    move-result-object v13

    invoke-virtual {v13}, La3/p;->A()J

    move-result-wide v14

    invoke-virtual {v13}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v13, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    const/high16 v4, -0x3d4c0000    # -90.0f

    invoke-virtual {v0, v4, v2, v3}, Laj/d;->v(FJ)V

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v11, 0xffffffffL

    and-long/2addr v4, v11

    or-long v5, v2, v4

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v7, v4

    shl-long/2addr v2, v0

    and-long/2addr v7, v11

    or-long v9, v2, v7

    move/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v7, p4

    move/from16 v8, p5

    invoke-static/range {v1 .. v10}, Lwy0/c;->f(Lk2/e;FLi91/h;FJFIJ)V

    if-eqz p7, :cond_2

    sget-object v1, Lwy0/c$a;->a:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    new-instance v3, Lk2/i;

    const/4 v1, 0x5

    int-to-float v1, v1

    sub-float v4, p2, v1

    const/4 v8, 0x0

    const/16 v9, 0x1a

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const v1, 0x3dcccccd    # 0.1f

    move v5, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    new-instance v1, Lk2/i;

    const/4 v6, 0x0

    const/16 v7, 0x1a

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v2, p2

    invoke-direct/range {v1 .. v7}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/high16 v2, 0x40400000    # 3.0f

    move-object v3, v1

    move v5, v2

    :goto_0
    const/high16 v1, 0x43b40000    # 360.0f

    mul-float v4, p0, v1

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    shl-long/2addr v1, v0

    and-long/2addr v6, v11

    or-long/2addr v6, v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static/range {p3 .. p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    shl-long v0, v1, v0

    and-long/2addr v8, v11

    or-long/2addr v8, v0

    const/4 v10, 0x0

    const/16 v12, 0x340

    move-object/from16 v1, p11

    move-object v11, v3

    move-wide/from16 v2, p9

    invoke-static/range {v1 .. v12}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_1
    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lk2/e;FLi91/h;FJFIJ)V
    .locals 27

    move-object/from16 v0, p2

    instance-of v1, v0, Li91/e;

    const/high16 v2, 0x43b40000    # 360.0f

    if-eqz v1, :cond_0

    check-cast v0, Li91/e;

    invoke-virtual {v0}, Li91/e;->a()Li2/t;

    move-result-object v4

    mul-float v6, p1, v2

    new-instance v7, Lk2/i;

    const/4 v12, 0x0

    const/16 v13, 0x1a

    const/4 v9, 0x0

    const/4 v11, 0x0

    move/from16 v8, p3

    move/from16 v10, p7

    invoke-direct/range {v7 .. v13}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/4 v13, 0x0

    const/16 v14, 0x340

    move-object v12, v7

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move-wide/from16 v10, p4

    move/from16 v5, p6

    move-wide/from16 v8, p8

    invoke-static/range {v3 .. v14}, Lk2/e;->X(Lk2/e;Li2/t;FFZJJLk2/i;II)V

    return-void

    :cond_0
    instance-of v1, v0, Li91/g;

    if-eqz v1, :cond_1

    check-cast v0, Li91/g;

    invoke-virtual {v0}, Li91/g;->a()J

    move-result-wide v16

    mul-float v19, p1, v2

    new-instance v25, Lk2/i;

    const/4 v8, 0x0

    const/16 v9, 0x1a

    const/4 v5, 0x0

    const/4 v7, 0x0

    move/from16 v4, p3

    move/from16 v6, p7

    move-object/from16 v3, v25

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v24, 0x0

    const/16 v26, 0x340

    move-object/from16 v15, p0

    move-wide/from16 v22, p4

    move/from16 v18, p6

    move-wide/from16 v20, p8

    invoke-static/range {v15 .. v26}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    return-void

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
