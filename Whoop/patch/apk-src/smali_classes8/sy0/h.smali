.class public abstract Lsy0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001as\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0017\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00138\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "checked",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onCheckedChange",
        "enabled",
        "Lj0/i;",
        "interactionSource",
        "Lg1/a1;",
        "colors",
        "Ly71/g;",
        "icon",
        "Ly3/f;",
        "checkboxSize",
        "checkmarkSize",
        "c",
        "(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V",
        "Li2/x;",
        "checkColor",
        "boxColor",
        "borderColor",
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
.method public static synthetic a(ZLi3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy0/h;->g(ZLi3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lsy0/h;->h(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Lj0/i;",
            "Lg1/a1;",
            "Ly71/g;",
            "FF",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v5, p9

    check-cast v5, Lp1/q;

    const v0, 0x26c6a110

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v6, v10, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v10, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v10

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v10

    :goto_1
    and-int/lit8 v8, v10, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v5, v2}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v10, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v7, v7, 0xc00

    :cond_7
    move/from16 v12, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v12, v10, 0xc00

    if-nez v12, :cond_7

    move/from16 v12, p3

    invoke-virtual {v5, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_4

    :cond_9
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v7, v13

    :goto_5
    and-int/lit8 v13, v11, 0x10

    if-eqz v13, :cond_b

    or-int/lit16 v7, v7, 0x6000

    :cond_a
    move-object/from16 v14, p4

    goto :goto_7

    :cond_b
    and-int/lit16 v14, v10, 0x6000

    if-nez v14, :cond_a

    move-object/from16 v14, p4

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x4000

    goto :goto_6

    :cond_c
    const/16 v15, 0x2000

    :goto_6
    or-int/2addr v7, v15

    :goto_7
    const/high16 v15, 0x30000

    and-int/2addr v15, v10

    if-nez v15, :cond_f

    and-int/lit8 v15, v11, 0x20

    if-nez v15, :cond_d

    move-object/from16 v15, p5

    invoke-virtual {v5, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_8

    :cond_d
    move-object/from16 v15, p5

    :cond_e
    const/high16 v16, 0x10000

    :goto_8
    or-int v7, v7, v16

    goto :goto_9

    :cond_f
    move-object/from16 v15, p5

    :goto_9
    const/high16 v16, 0x180000

    and-int v16, v10, v16

    if-nez v16, :cond_11

    and-int/lit8 v16, v11, 0x40

    move-object/from16 v9, p6

    if-nez v16, :cond_10

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x80000

    :goto_a
    or-int v7, v7, v16

    goto :goto_b

    :cond_11
    move-object/from16 v9, p6

    :goto_b
    and-int/lit16 v4, v11, 0x80

    const/high16 v16, 0xc00000

    if-eqz v4, :cond_12

    or-int v7, v7, v16

    move/from16 v1, p7

    goto :goto_d

    :cond_12
    and-int v16, v10, v16

    move/from16 v1, p7

    if-nez v16, :cond_14

    invoke-virtual {v5, v1}, Lp1/q;->d(F)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x400000

    :goto_c
    or-int v7, v7, v16

    :cond_14
    :goto_d
    move/from16 v16, v0

    and-int/lit16 v0, v11, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_15

    or-int v7, v7, v17

    move/from16 v23, v0

    move/from16 v0, p8

    goto :goto_f

    :cond_15
    and-int v17, v10, v17

    move/from16 v23, v0

    move/from16 v0, p8

    if-nez v17, :cond_17

    invoke-virtual {v5, v0}, Lp1/q;->d(F)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x4000000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x2000000

    :goto_e
    or-int v7, v7, v17

    :cond_17
    :goto_f
    const v17, 0x2492493

    and-int v0, v7, v17

    const v1, 0x2492492

    move/from16 v24, v7

    if-eq v0, v1, :cond_18

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v1, v24, 0x1

    invoke-virtual {v5, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v0, v10, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget-object v7, Lp1/l;->a:Lp1/v0;

    const v25, -0x380001

    const v26, -0x70001

    const/4 v6, 0x6

    if-eqz v0, :cond_1c

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_11

    :cond_19
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v0, v11, 0x20

    if-eqz v0, :cond_1a

    and-int v0, v24, v26

    move/from16 v24, v0

    :cond_1a
    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1b

    and-int v24, v24, v25

    :cond_1b
    move-object/from16 v8, p0

    move/from16 v13, p7

    move v0, v12

    move-object v12, v5

    move-object v5, v15

    move/from16 v15, p8

    goto/16 :goto_17

    :cond_1c
    :goto_11
    if-eqz v16, :cond_1d

    move-object v0, v1

    goto :goto_12

    :cond_1d
    move-object/from16 v0, p0

    :goto_12
    if-eqz v8, :cond_1e

    const/4 v8, 0x1

    goto :goto_13

    :cond_1e
    move v8, v12

    :goto_13
    if-eqz v13, :cond_20

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v7, :cond_1f

    invoke-static {v5}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v12

    :cond_1f
    check-cast v12, Lj0/i;

    move-object/from16 v28, v12

    goto :goto_14

    :cond_20
    move-object/from16 v28, v14

    :goto_14
    and-int/lit8 v12, v11, 0x20

    if-eqz v12, :cond_21

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->w()J

    move-result-wide v16

    invoke-virtual {v12, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->X()J

    move-result-wide v13

    invoke-virtual {v12, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v18

    const/16 v21, 0x0

    const/16 v22, 0x18

    move-wide v12, v13

    move-wide/from16 v14, v18

    const-wide/16 v18, 0x0

    move-object/from16 v20, v5

    invoke-static/range {v12 .. v22}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v5

    move-object/from16 v12, v20

    and-int v13, v24, v26

    move/from16 v24, v13

    goto :goto_15

    :cond_21
    move-object v12, v5

    move-object v5, v15

    :goto_15
    and-int/lit8 v13, v11, 0x40

    if-eqz v13, :cond_22

    new-instance v9, Ly71/g;

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-static {v13}, Lb9/y;->c(Lx81/d;)I

    move-result v13

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v9, v13, v14, v15, v14}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int v13, v24, v25

    move/from16 v24, v13

    :cond_22
    if-eqz v4, :cond_23

    const/4 v4, 0x7

    int-to-float v4, v4

    const/4 v13, 0x4

    int-to-float v14, v13

    mul-float/2addr v4, v14

    goto :goto_16

    :cond_23
    const/4 v13, 0x4

    move/from16 v4, p7

    :goto_16
    if-eqz v23, :cond_24

    int-to-float v14, v13

    mul-float v13, v14, v14

    move v14, v8

    move-object v8, v0

    move v0, v14

    move v15, v13

    move-object/from16 v14, v28

    move v13, v4

    goto :goto_17

    :cond_24
    move v13, v8

    move-object v8, v0

    move v0, v13

    move/from16 v15, p8

    move v13, v4

    move-object/from16 v14, v28

    :goto_17
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-static {v2}, Lse/g;->j(Z)Lk3/a;

    move-result-object v4

    check-cast v5, Lg1/r1;

    invoke-virtual {v5, v4, v12}, Lg1/r1;->c(Lk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v4

    invoke-static {v2}, Lse/g;->j(Z)Lk3/a;

    move-result-object v6

    invoke-virtual {v5, v0, v6, v12}, Lg1/r1;->b(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v6

    move-object/from16 v17, v1

    invoke-static {v2}, Lse/g;->j(Z)Lk3/a;

    move-result-object v1

    invoke-virtual {v5, v0, v1, v12}, Lg1/r1;->a(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v1

    move/from16 p7, v0

    const v0, -0x705cf17a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    if-eqz v3, :cond_25

    const/16 v0, 0x18

    int-to-float v0, v0

    move-object/from16 p0, v1

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x4

    invoke-static {v1, v2, v7, v3, v0}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v0

    new-instance v1, Li3/i;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Li3/i;-><init>(I)V

    move/from16 p4, p1

    move-object/from16 p9, p2

    move-object/from16 p6, v0

    move-object/from16 p8, v1

    move-object/from16 p5, v14

    move-object/from16 p3, v17

    invoke-static/range {p3 .. p9}, Landroidx/compose/foundation/selection/d;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v3, p3

    move/from16 v14, p4

    move-object/from16 v28, p5

    move/from16 v1, p7

    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v2, v0

    const/4 v0, 0x0

    goto :goto_19

    :cond_25
    move-object/from16 p0, v1

    move-object/from16 v28, v14

    move-object/from16 v3, v17

    move/from16 v1, p7

    move v14, v2

    const/4 v2, 0x1

    and-int/lit8 v0, v24, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_26

    const/4 v0, 0x1

    goto :goto_18

    :cond_26
    const/4 v0, 0x0

    :goto_18
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_27

    if-ne v2, v7, :cond_28

    :cond_27
    new-instance v2, Lb30/x4;

    const/16 v0, 0x9

    invoke-direct {v2, v14, v0}, Lb30/x4;-><init>(ZI)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-static {v3, v0, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v8, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    :goto_19
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v7, v2

    move-object/from16 p3, v4

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v0, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v1}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 p4, v5

    invoke-static {v6}, Lsy0/h;->e(Lp1/t2;)J

    move-result-wide v4

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v4, v5, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lsy0/h;->f(Lp1/t2;)J

    move-result-wide v4

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v0, v2, v4, v5, v6}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v2, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_29

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_29
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1a
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_2a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2b

    :cond_2a
    invoke-static {v4, v12, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v14, :cond_2c

    const v0, -0x10d5fac2

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Ly71/g;->b()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v12, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-virtual {v9}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v1}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static/range {p3 .. p3}, Lsy0/h;->d(Lp1/t2;)J

    move-result-wide v5

    move/from16 v27, v4

    move-wide/from16 v29, v5

    move v5, v1

    move-object v1, v2

    move-object v2, v3

    move-wide/from16 v3, v29

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 p0, v12

    move v12, v5

    move-object/from16 v5, p0

    move-object/from16 v16, p4

    move-object/from16 v17, v8

    move-object/from16 p0, v9

    move/from16 v8, v27

    const/4 v9, 0x1

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_2c
    move-object/from16 v16, p4

    move-object/from16 v17, v8

    move-object/from16 p0, v9

    move-object v5, v12

    const/4 v8, 0x0

    const/4 v9, 0x1

    move v12, v1

    const v0, -0x10d114f4

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object/from16 v7, p0

    move-object/from16 v20, v5

    move v8, v13

    move v9, v15

    move-object/from16 v6, v16

    move-object/from16 v1, v17

    move-object/from16 v5, v28

    :goto_1c
    move v4, v12

    goto :goto_1d

    :cond_2d
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move/from16 v8, p7

    move-object/from16 v20, v5

    move-object v7, v9

    move-object v5, v14

    move-object v6, v15

    move/from16 v9, p8

    goto :goto_1c

    :goto_1d
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_2e

    new-instance v0, Ll1/s2;

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v11}, Ll1/s2;-><init>(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFII)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method private static final d(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final e(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final f(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final g(ZLi3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lse/g;->j(Z)Lk3/a;

    move-result-object p0

    invoke-static {p1, p0}, Li3/w;->m(Li3/z;Lk3/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lsy0/h;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
