.class public abstract Lu0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu0/y0;

.field public static final b:Lu2/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu0/y0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lu0/y0;-><init>(I)V

    sput-object v0, Lu0/n0;->a:Lu0/y0;

    new-instance v0, Lu2/a;

    const/16 v1, 0x3fe

    invoke-direct {v0, v1}, Lu2/a;-><init>(I)V

    sput-object v0, Lu0/n0;->b:Lu2/a;

    return-void
.end method

.method public static final a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0xeb2f629

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    move-object/from16 v10, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    move-object/from16 v12, p2

    if-nez v3, :cond_5

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    const v3, 0x1b6c00

    or-int/2addr v1, v3

    const/high16 v3, 0xc00000

    and-int/2addr v3, v9

    const/high16 v4, 0x800000

    if-nez v3, :cond_7

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v4

    goto :goto_4

    :cond_6
    const/high16 v3, 0x400000

    :goto_4
    or-int/2addr v1, v3

    :cond_7
    const v3, 0x492493

    and-int/2addr v3, v1

    const v5, 0x492492

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v3, v5, :cond_8

    move v3, v7

    goto :goto_5

    :cond_8
    move v3, v6

    :goto_5
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v0, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_9

    new-instance v3, Lu0/r;

    const/4 v11, 0x0

    invoke-direct {v3, v11}, Lu0/r;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_a

    const/4 v11, 0x0

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v11, Lp1/c1;

    const/high16 v13, 0x1c00000

    and-int/2addr v13, v1

    if-ne v13, v4, :cond_b

    move v4, v7

    goto :goto_6

    :cond_b
    move v4, v6

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_c

    if-ne v13, v5, :cond_d

    :cond_c
    new-instance v13, Lf1/k0;

    const/4 v4, 0x3

    invoke-direct {v13, v4, v11, v8}, Lf1/k0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v8, v13}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-interface {v2, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v13, 0x380000

    and-int v14, v1, v13

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_e

    move v6, v7

    :cond_e
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_f

    if-ne v7, v5, :cond_10

    :cond_f
    new-instance v7, Lp40/b;

    const/4 v5, 0x7

    invoke-direct {v7, v11, v3, v5}, Lp40/b;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const v5, 0xe38e

    and-int/2addr v5, v1

    const/high16 v6, 0x70000

    shl-int/lit8 v11, v1, 0x6

    and-int/2addr v6, v11

    or-int/2addr v5, v6

    shl-int/lit8 v1, v1, 0x3

    and-int/2addr v1, v13

    or-int v22, v5, v1

    const/16 v23, 0x780

    const/4 v14, 0x1

    const/4 v15, 0x1

    const v16, 0x7fffffff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v0

    move-object v11, v4

    move-object v13, v7

    invoke-static/range {v10 .. v23}, Lq83/g;->a(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Li2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v3

    move v5, v14

    move v4, v15

    move/from16 v6, v16

    goto :goto_7

    :cond_11
    move-object/from16 v21, v0

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    :goto_7
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_12

    new-instance v0, Ltp0/d;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v9}, Ltp0/d;-><init>(Ll3/g;Landroidx/compose/ui/Modifier;Ll3/v0;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final b(Lf1/w0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p2, Lp1/q;

    const v0, -0x38eb05b1

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

    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/2addr v0, v3

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x6237de0b

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lf1/t0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2, v1}, Lf1/t0;-><init>(Lf1/w0;Lq83/d;I)V

    invoke-static {v0}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->b(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget-object v1, p0, Lf1/w0;->g:Lro/i;

    new-instance v3, Lf1/t0;

    const/4 v5, 0x1

    invoke-direct {v3, p0, v2, v5}, Lf1/t0;-><init>(Lf1/w0;Lq83/d;I)V

    new-instance v5, Lf1/c0;

    const/4 v6, 0x3

    invoke-direct {v5, p0, v6}, Lf1/c0;-><init>(Lf1/w0;I)V

    invoke-static {v0, v1, v3, v2, v5}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->c(Landroidx/compose/ui/Modifier;Lro/i;Lkotlin/jvm/functions/Function1;Lf1/j1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v0, p1, p2, v1}, Ls2/a;->d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_3

    new-instance v0, Lpp2/o;

    const/16 v1, 0xd

    invoke-direct {v0, p0, p1, p3, v1}, Lpp2/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final c(Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x7c0599e6

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    const v1, -0x702c2f6c

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lf1/s1;->j()Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_5
    new-instance v1, Lf1/i1;

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, p0, v4, v2}, Lf1/i1;-><init>(Lf1/s1;Lq83/d;I)V

    invoke-static {v1}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->b(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget-object v2, p0, Lf1/s1;->y:Lro/i;

    new-instance v5, Lf1/i1;

    const/4 v6, 0x1

    invoke-direct {v5, p0, v4, v6}, Lf1/i1;-><init>(Lf1/s1;Lq83/d;I)V

    new-instance v6, Lf1/j1;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v4, v7}, Lf1/j1;-><init>(Lf1/s1;Lq83/d;I)V

    new-instance v4, Lf1/h1;

    invoke-direct {v4, p0, v7}, Lf1/h1;-><init>(Lf1/s1;I)V

    invoke-static {v1, v2, v5, v6, v4}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->c(Landroidx/compose/ui/Modifier;Lro/i;Lkotlin/jvm/functions/Function1;Lf1/j1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_4
    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p1, p2, v0}, Ls2/a;->d(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lso2/f;

    const/16 v1, 0x10

    invoke-direct {v0, p0, p1, p3, v1}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final d(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll3/v0;Lq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;ZIILq3/l;Lu0/q0;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 62

    move-object/from16 v3, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v6, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p6

    move/from16 v7, p8

    move/from16 v15, p9

    move-object/from16 v0, p11

    move-object/from16 v1, p12

    move/from16 v2, p13

    move/from16 v4, p14

    move/from16 v5, p17

    move/from16 v8, p18

    move-object/from16 v9, p16

    check-cast v9, Lp1/q;

    const v10, 0x1d9f981

    invoke-virtual {v9, v10}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v10, v5, 0x6

    const/16 v16, 0x2

    move/from16 p16, v10

    if-nez p16, :cond_1

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_0

    const/16 v17, 0x4

    goto :goto_0

    :cond_0
    move/from16 v17, v16

    :goto_0
    or-int v17, v5, v17

    goto :goto_1

    :cond_1
    move/from16 v17, v5

    :goto_1
    and-int/lit8 v18, v5, 0x30

    const/16 v19, 0x10

    if-nez v18, :cond_3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_2

    const/16 v18, 0x20

    goto :goto_2

    :cond_2
    move/from16 v18, v19

    :goto_2
    or-int v17, v17, v18

    :cond_3
    const/16 v18, 0x20

    and-int/lit16 v10, v5, 0x180

    const/16 v20, 0x80

    const/16 v21, 0x100

    if-nez v10, :cond_5

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move/from16 v10, v21

    goto :goto_3

    :cond_4
    move/from16 v10, v20

    :goto_3
    or-int v17, v17, v10

    :cond_5
    and-int/lit16 v10, v5, 0xc00

    const/16 v22, 0x400

    move/from16 v23, v10

    if-nez v23, :cond_7

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_6

    const/16 v23, 0x800

    goto :goto_4

    :cond_6
    move/from16 v23, v22

    :goto_4
    or-int v17, v17, v23

    :cond_7
    and-int/lit16 v10, v5, 0x6000

    const/16 v24, 0x2000

    move/from16 v25, v10

    if-nez v25, :cond_9

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_8

    const/16 v25, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v25, v24

    :goto_5
    or-int v17, v17, v25

    :cond_9
    const/high16 v25, 0x30000

    and-int v26, v5, v25

    const/high16 v27, 0x20000

    const/high16 v28, 0x10000

    move-object/from16 v10, p5

    if-nez v26, :cond_b

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_a

    move/from16 v29, v27

    goto :goto_6

    :cond_a
    move/from16 v29, v28

    :goto_6
    or-int v17, v17, v29

    :cond_b
    const/high16 v29, 0x180000

    and-int v30, v5, v29

    if-nez v30, :cond_d

    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_c

    const/high16 v30, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v30, 0x80000

    :goto_7
    or-int v17, v17, v30

    :cond_d
    const/high16 v30, 0xc00000

    and-int v30, v5, v30

    move-object/from16 v10, p7

    if-nez v30, :cond_f

    invoke-virtual {v9, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_e

    const/high16 v30, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v30, 0x400000

    :goto_8
    or-int v17, v17, v30

    :cond_f
    const/high16 v30, 0x6000000

    and-int v30, v5, v30

    if-nez v30, :cond_11

    invoke-virtual {v9, v7}, Lp1/q;->h(Z)Z

    move-result v30

    if-eqz v30, :cond_10

    const/high16 v30, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v30, 0x2000000

    :goto_9
    or-int v17, v17, v30

    :cond_11
    const/high16 v30, 0x30000000

    and-int v30, v5, v30

    if-nez v30, :cond_13

    invoke-virtual {v9, v15}, Lp1/q;->e(I)Z

    move-result v30

    if-eqz v30, :cond_12

    const/high16 v30, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v30, 0x10000000

    :goto_a
    or-int v17, v17, v30

    :cond_13
    and-int/lit8 v30, v8, 0x6

    move/from16 v10, p10

    if-nez v30, :cond_15

    invoke-virtual {v9, v10}, Lp1/q;->e(I)Z

    move-result v30

    if-eqz v30, :cond_14

    const/16 v16, 0x4

    :cond_14
    or-int v16, v8, v16

    goto :goto_b

    :cond_15
    move/from16 v16, v8

    :goto_b
    and-int/lit8 v30, v8, 0x30

    if-nez v30, :cond_17

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_16

    move/from16 v19, v18

    :cond_16
    or-int v16, v16, v19

    :cond_17
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_19

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    move/from16 v20, v21

    :cond_18
    or-int v16, v16, v20

    :cond_19
    and-int/lit16 v5, v8, 0xc00

    if-nez v5, :cond_1b

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1a

    const/16 v22, 0x800

    :cond_1a
    or-int v16, v16, v22

    :cond_1b
    and-int/lit16 v5, v8, 0x6000

    if-nez v5, :cond_1d

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1c

    const/16 v24, 0x4000

    :cond_1c
    or-int v16, v16, v24

    :cond_1d
    and-int v5, v8, v25

    if-nez v5, :cond_1f

    move-object/from16 v5, p15

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1e

    goto :goto_c

    :cond_1e
    move/from16 v27, v28

    :goto_c
    or-int v16, v16, v27

    goto :goto_d

    :cond_1f
    move-object/from16 v5, p15

    :goto_d
    or-int v10, v16, v29

    const v16, 0x12492493

    and-int v2, v17, v16

    const v4, 0x12492492

    move/from16 v16, v10

    if-ne v2, v4, :cond_21

    const v2, 0x92493

    and-int v2, v16, v2

    const v4, 0x92492

    if-eq v2, v4, :cond_20

    goto :goto_e

    :cond_20
    const/4 v2, 0x0

    goto :goto_f

    :cond_21
    :goto_e
    const/4 v2, 0x1

    :goto_f
    and-int/lit8 v4, v17, 0x1

    invoke-virtual {v9, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_75

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v2, p17, 0x1

    if-eqz v2, :cond_23

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_10

    :cond_22
    invoke-virtual {v9}, Lp1/q;->X()V

    :cond_23
    :goto_10
    invoke-virtual {v9}, Lp1/q;->r()V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_24

    invoke-static {v9}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v2

    :cond_24
    check-cast v2, Lg2/s;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_25

    sget-object v10, Ld1/n;->a:Ld1/m;

    new-instance v10, Ld1/b;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v10, Ld1/b;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_26

    new-instance v5, Lq3/z;

    invoke-direct {v5, v10}, Lq3/z;-><init>(Lq3/t;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v5, Lq3/z;

    move-object/from16 v21, v5

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    move-object/from16 v22, v5

    sget-object v5, Lb3/v1;->k:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp3/h;

    move-object/from16 v24, v5

    sget-object v5, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf1/y1;

    move-object/from16 v25, v10

    iget-wide v10, v5, Lf1/y1;->b:J

    sget-object v5, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg2/i;

    move-object/from16 v27, v5

    sget-object v5, Lb3/v1;->t:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb3/m3;

    move-object/from16 v28, v5

    sget-object v5, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb3/x2;

    const/4 v6, 0x1

    if-ne v15, v6, :cond_27

    if-nez v7, :cond_27

    iget-boolean v6, v0, Lq3/l;->a:Z

    if-eqz v6, :cond_27

    sget-object v6, Lh0/d2;->x:Lh0/d2;

    goto :goto_11

    :cond_27
    sget-object v6, Lh0/d2;->w:Lh0/d2;

    :goto_11
    const v7, -0xcbd7952

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lu0/n1;->g:Lp0/n0;

    move-wide/from16 v29, v10

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    invoke-virtual {v9, v10}, Lp1/q;->e(I)Z

    move-result v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_28

    if-ne v11, v4, :cond_29

    :cond_28
    new-instance v11, Lsc0/c;

    const/16 v10, 0xb

    invoke-direct {v11, v6, v10}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v11, Lc93/a;

    const/4 v10, 0x0

    invoke-static {v7, v8, v11, v9, v10}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Lu0/n1;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    iget-object v7, v11, Lu0/n1;->f:Lp1/k1;

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh0/d2;

    if-eq v7, v6, :cond_2b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    sget-object v1, Lh0/d2;->w:Lh0/d2;

    if-ne v6, v1, :cond_2a

    const-string v1, "only single-line, non-wrap text fields can scroll horizontally"

    goto :goto_12

    :cond_2a
    const-string v1, "single-line, non-wrap text fields can only scroll horizontally"

    :goto_12
    const-string v2, "Mismatching scroller orientation; "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2b
    and-int/lit8 v6, v17, 0xe

    const/4 v7, 0x4

    if-ne v6, v7, :cond_2c

    const/4 v8, 0x1

    goto :goto_13

    :cond_2c
    move v8, v10

    :goto_13
    const v19, 0xe000

    and-int v7, v17, v19

    const/16 v10, 0x4000

    if-ne v7, v10, :cond_2d

    const/4 v7, 0x1

    goto :goto_14

    :cond_2d
    const/4 v7, 0x0

    :goto_14
    or-int/2addr v7, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_2f

    if-ne v8, v4, :cond_2e

    goto :goto_15

    :cond_2e
    move-object/from16 v26, v11

    goto :goto_17

    :cond_2f
    :goto_15
    iget-object v7, v3, Lq3/y;->a:Ll3/g;

    invoke-static {v13, v7}, Lu0/u1;->a(Lq3/g0;Ll3/g;)Lq3/e0;

    move-result-object v7

    iget-object v8, v3, Lq3/y;->c:Ll3/u0;

    if-eqz v8, :cond_30

    move-object/from16 v26, v11

    iget-wide v10, v8, Ll3/u0;->a:J

    iget-object v8, v7, Lq3/e0;->b:Lq3/r;

    sget v31, Ll3/u0;->c:I

    move-wide/from16 v31, v10

    shr-long v10, v31, v18

    long-to-int v10, v10

    invoke-interface {v8, v10}, Lq3/r;->x(I)I

    move-result v10

    const-wide v33, 0xffffffffL

    and-long v11, v31, v33

    long-to-int v11, v11

    invoke-interface {v8, v11}, Lq3/r;->x(I)I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v12

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    new-instance v11, Ll3/d;

    iget-object v7, v7, Lq3/e0;->a:Ll3/g;

    invoke-direct {v11, v7}, Ll3/d;-><init>(Ll3/g;)V

    new-instance v31, Ll3/m0;

    const/16 v49, 0x0

    const v50, 0xefff

    const-wide/16 v32, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const-wide/16 v46, 0x0

    sget-object v48, Lw3/l;->c:Lw3/l;

    invoke-direct/range {v31 .. v50}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V

    move-object/from16 v7, v31

    invoke-virtual {v11, v7, v12, v10}, Ll3/d;->a(Ll3/m0;II)V

    invoke-virtual {v11}, Ll3/d;->k()Ll3/g;

    move-result-object v7

    new-instance v10, Lq3/e0;

    invoke-direct {v10, v7, v8}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    move-object v8, v10

    goto :goto_16

    :cond_30
    move-object/from16 v26, v11

    move-object v8, v7

    :goto_16
    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v11, v8

    check-cast v11, Lq3/e0;

    iget-object v7, v11, Lq3/e0;->a:Ll3/g;

    iget-object v12, v11, Lq3/e0;->b:Lq3/r;

    invoke-virtual {v9}, Lp1/q;->B()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_74

    iget v10, v8, Lp1/v1;->b:I

    const/16 v20, 0x1

    or-int/lit8 v10, v10, 0x1

    iput v10, v8, Lp1/v1;->b:I

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    move-object/from16 v31, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_32

    if-ne v5, v4, :cond_31

    goto :goto_18

    :cond_31
    move-object/from16 p16, v2

    move-object/from16 v54, v4

    move/from16 v53, v6

    move-object/from16 v33, v11

    move-object/from16 v18, v12

    move-object/from16 v8, v22

    move-object/from16 v51, v25

    move-object/from16 v0, v27

    move-object/from16 v52, v28

    move-wide/from16 v14, v29

    move-object/from16 v6, p3

    move-object v12, v5

    move-object v5, v7

    move-object v11, v9

    move-object/from16 v9, v24

    move/from16 v7, p8

    goto :goto_19

    :cond_32
    :goto_18
    new-instance v5, Lu0/s0;

    move-object v10, v4

    new-instance v4, Lu0/c1;

    move-object/from16 v32, v10

    const/4 v10, 0x0

    move-object/from16 p16, v2

    move/from16 v53, v6

    move-object v13, v8

    move-object/from16 v33, v11

    move-object/from16 v18, v12

    move-object/from16 v8, v22

    move-object/from16 v51, v25

    move-object/from16 v0, v27

    move-object/from16 v52, v28

    move-wide/from16 v14, v29

    move-object/from16 v2, v31

    move-object/from16 v54, v32

    move-object/from16 v6, p3

    move-object v12, v5

    move-object v5, v7

    move-object v11, v9

    move-object/from16 v9, v24

    move/from16 v7, p8

    invoke-direct/range {v4 .. v10}, Lu0/c1;-><init>(Ll3/g;Ll3/v0;ZLy3/c;Lp3/h;I)V

    invoke-direct {v12, v4, v13, v2}, Lu0/s0;-><init>(Lu0/c1;Lp1/v1;Lb3/x2;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    move-object v2, v12

    check-cast v2, Lu0/s0;

    iget-object v4, v3, Lq3/y;->a:Ll3/g;

    iget-wide v12, v3, Lq3/y;->b:J

    move-object/from16 v10, p1

    iput-object v10, v2, Lu0/s0;->u:Lkotlin/jvm/functions/Function1;

    iput-wide v14, v2, Lu0/s0;->z:J

    iget-object v14, v2, Lu0/s0;->r:Lu0/o0;

    iput-object v1, v14, Lu0/o0;->b:Lu0/q0;

    iput-object v0, v14, Lu0/o0;->c:Lg2/i;

    iput-object v4, v2, Lu0/s0;->j:Ll3/g;

    iget-object v4, v2, Lu0/s0;->a:Lu0/c1;

    iget-object v14, v4, Lu0/c1;->a:Ll3/g;

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_34

    iget-object v14, v4, Lu0/c1;->b:Ll3/v0;

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_34

    iget-boolean v14, v4, Lu0/c1;->e:Z

    if-ne v14, v7, :cond_34

    iget v14, v4, Lu0/c1;->f:I

    const/4 v15, 0x1

    if-ne v14, v15, :cond_34

    iget v14, v4, Lu0/c1;->c:I

    const v15, 0x7fffffff

    if-ne v14, v15, :cond_34

    iget v14, v4, Lu0/c1;->d:I

    const/4 v15, 0x1

    if-ne v14, v15, :cond_34

    iget-object v14, v4, Lu0/c1;->g:Ly3/c;

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_34

    iget-object v14, v4, Lu0/c1;->i:Ljava/util/List;

    sget-object v15, Lm83/y;->w:Lm83/y;

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_34

    iget-object v14, v4, Lu0/c1;->h:Lp3/h;

    if-eq v14, v9, :cond_33

    goto :goto_1b

    :cond_33
    :goto_1a
    move-object v14, v6

    move-object/from16 v22, v8

    goto :goto_1c

    :cond_34
    :goto_1b
    new-instance v4, Lu0/c1;

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v10}, Lu0/c1;-><init>(Ll3/g;Ll3/v0;ZLy3/c;Lp3/h;I)V

    goto :goto_1a

    :goto_1c
    iget-object v5, v2, Lu0/s0;->a:Lu0/c1;

    if-eq v5, v4, :cond_35

    const/4 v15, 0x1

    iput-boolean v15, v2, Lu0/s0;->p:Z

    :cond_35
    iput-object v4, v2, Lu0/s0;->a:Lu0/c1;

    iget-object v4, v2, Lu0/s0;->d:Lq3/i;

    iget-object v5, v2, Lu0/s0;->e:Lq3/d0;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v3, Lq3/y;->c:Ll3/u0;

    iget-object v7, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v7, Ldn/e;

    invoke-virtual {v7}, Ldn/e;->g()Ll3/u0;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    iget-object v8, v4, Lq3/i;->w:Ljava/lang/Object;

    check-cast v8, Lq3/y;

    iget-object v8, v8, Lq3/y;->a:Ll3/g;

    iget-object v8, v8, Ll3/g;->x:Ljava/lang/String;

    iget-object v9, v3, Lq3/y;->a:Ll3/g;

    iget-object v10, v9, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_36

    new-instance v8, Ldn/e;

    invoke-direct {v8, v9, v12, v13}, Ldn/e;-><init>(Ll3/g;J)V

    iput-object v8, v4, Lq3/i;->x:Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v10, 0x1

    goto :goto_1e

    :cond_36
    iget-object v8, v4, Lq3/i;->w:Ljava/lang/Object;

    check-cast v8, Lq3/y;

    iget-wide v8, v8, Lq3/y;->b:J

    invoke-static {v8, v9, v12, v13}, Ll3/u0;->b(JJ)Z

    move-result v8

    if-nez v8, :cond_37

    iget-object v8, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v8, Ldn/e;

    invoke-static {v12, v13}, Ll3/u0;->f(J)I

    move-result v9

    invoke-static {v12, v13}, Ll3/u0;->e(J)I

    move-result v10

    invoke-virtual {v8, v9, v10}, Ldn/e;->k(II)V

    const/4 v8, 0x1

    :goto_1d
    const/4 v10, 0x0

    goto :goto_1e

    :cond_37
    const/4 v8, 0x0

    goto :goto_1d

    :goto_1e
    const/4 v9, -0x1

    if-nez v6, :cond_38

    iget-object v6, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v6, Ldn/e;

    iput v9, v6, Ldn/e;->z:I

    iput v9, v6, Ldn/e;->E:I

    move-object/from16 v27, v0

    move v15, v10

    goto :goto_1f

    :cond_38
    move v15, v10

    iget-wide v9, v6, Ll3/u0;->a:J

    invoke-static {v9, v10}, Ll3/u0;->c(J)Z

    move-result v6

    if-nez v6, :cond_39

    iget-object v6, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v6, Ldn/e;

    move-object/from16 v27, v0

    invoke-static {v9, v10}, Ll3/u0;->f(J)I

    move-result v0

    invoke-static {v9, v10}, Ll3/u0;->e(J)I

    move-result v9

    invoke-virtual {v6, v0, v9}, Ldn/e;->j(II)V

    goto :goto_1f

    :cond_39
    move-object/from16 v27, v0

    :goto_1f
    const/4 v0, 0x3

    const-wide/16 v9, 0x0

    if-nez v15, :cond_3b

    if-nez v8, :cond_3a

    if-nez v7, :cond_3a

    goto :goto_20

    :cond_3a
    move-object v6, v3

    goto :goto_21

    :cond_3b
    :goto_20
    iget-object v6, v4, Lq3/i;->x:Ljava/lang/Object;

    check-cast v6, Ldn/e;

    const/4 v7, -0x1

    iput v7, v6, Ldn/e;->z:I

    iput v7, v6, Ldn/e;->E:I

    const/4 v6, 0x0

    invoke-static {v3, v6, v9, v10, v0}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v6

    :goto_21
    iget-object v7, v4, Lq3/i;->w:Ljava/lang/Object;

    check-cast v7, Lq3/y;

    iput-object v6, v4, Lq3/i;->w:Ljava/lang/Object;

    if-eqz v5, :cond_3c

    invoke-virtual {v5, v7, v6}, Lq3/d0;->a(Lq3/y;Lq3/y;)V

    :cond_3c
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v15, v54

    if-ne v4, v15, :cond_3d

    new-instance v4, Lu0/t1;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    check-cast v4, Lu0/t1;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-boolean v7, v4, Lu0/t1;->e:Z

    if-nez v7, :cond_3f

    iget-object v7, v4, Lu0/t1;->d:Ljava/lang/Long;

    if-eqz v7, :cond_3e

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :cond_3e
    const/16 v7, 0x1388

    int-to-long v7, v7

    add-long/2addr v9, v7

    cmp-long v7, v5, v9

    if-lez v7, :cond_40

    :cond_3f
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v4, Lu0/t1;->d:Ljava/lang/Long;

    invoke-virtual {v4, v3}, Lu0/t1;->a(Lq3/y;)V

    :cond_40
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_41

    invoke-static {v11}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v5

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_41
    move-object v9, v5

    check-cast v9, Lbc3/c0;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_42

    new-instance v5, Lr0/c;

    invoke-direct {v5}, Lr0/c;-><init>()V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_42
    move-object v10, v5

    check-cast v10, Lr0/a;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v15, :cond_43

    new-instance v5, Lf1/s1;

    invoke-direct {v5, v4}, Lf1/s1;-><init>(Lu0/t1;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_43
    move-object v8, v5

    check-cast v8, Lf1/s1;

    move-object/from16 v6, v18

    iput-object v6, v8, Lf1/s1;->b:Lq3/r;

    move-object/from16 v5, p4

    iput-object v5, v8, Lf1/s1;->f:Lq3/g0;

    iget-object v7, v2, Lu0/s0;->v:Lu0/v;

    iput-object v7, v8, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    iput-object v2, v8, Lf1/s1;->d:Lu0/s0;

    iget-object v7, v8, Lf1/s1;->e:Lp1/k1;

    invoke-virtual {v7, v3}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    new-instance v7, Ll3/u0;

    invoke-direct {v7, v12, v13}, Ll3/u0;-><init>(J)V

    iput-object v7, v8, Lf1/s1;->w:Ll3/u0;

    sget-object v7, Lb3/v1;->f:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb3/r1;

    iput-object v7, v8, Lf1/s1;->h:Lb3/r1;

    iput-object v9, v8, Lf1/s1;->i:Lbc3/c0;

    sget-object v7, Lb3/v1;->q:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb3/z2;

    sget-object v7, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq2/a;

    iput-object v7, v8, Lf1/s1;->k:Lq2/a;

    move-object/from16 v7, p16

    iput-object v7, v8, Lf1/s1;->l:Lg2/s;

    xor-int/lit8 v12, p14, 0x1

    iget-object v13, v8, Lf1/s1;->m:Lp1/k1;

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v13, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v8, Lf1/s1;->n:Lp1/k1;

    invoke-static/range {p13 .. p13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v0, v13}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    const v0, 0x753aa269

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lf1/s;->w:Lf1/s;

    iget-object v13, v14, Ll3/v0;->a:Ll3/m0;

    iget-object v13, v13, Ll3/m0;->k:Ls3/b;

    move/from16 v18, v12

    const/4 v12, 0x6

    invoke-static {v0, v13, v11, v12}, Lf1/q;->b(Lf1/s;Ls3/b;Landroidx/compose/runtime/Composer;I)Lf1/p;

    move-result-object v0

    iput-object v0, v8, Lf1/s1;->j:Lf1/p;

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v13, v16

    and-int/lit16 v12, v13, 0x1c00

    move/from16 v23, v13

    const/16 v13, 0x800

    if-ne v12, v13, :cond_44

    const/16 v24, 0x1

    goto :goto_22

    :cond_44
    const/16 v24, 0x0

    :goto_22
    or-int v0, v0, v24

    and-int v13, v23, v19

    const/16 v14, 0x4000

    if-ne v13, v14, :cond_45

    const/16 v19, 0x1

    goto :goto_23

    :cond_45
    const/16 v19, 0x0

    :goto_23
    or-int v0, v0, v19

    move-object/from16 v14, v21

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v0, v0, v19

    move/from16 v19, v12

    move/from16 v14, v53

    const/4 v12, 0x4

    if-ne v14, v12, :cond_46

    const/16 v24, 0x1

    goto :goto_24

    :cond_46
    const/16 v24, 0x0

    :goto_24
    or-int v0, v0, v24

    and-int/lit8 v24, v23, 0x70

    xor-int/lit8 v12, v24, 0x30

    move/from16 v53, v14

    const/16 v14, 0x20

    if-le v12, v14, :cond_48

    move-object/from16 v14, p11

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_47

    goto :goto_25

    :cond_47
    move/from16 v24, v0

    goto :goto_26

    :cond_48
    move-object/from16 v14, p11

    :goto_25
    move/from16 v24, v0

    and-int/lit8 v0, v23, 0x30

    const/16 v1, 0x20

    if-ne v0, v1, :cond_49

    :goto_26
    const/4 v0, 0x1

    goto :goto_27

    :cond_49
    const/4 v0, 0x0

    :goto_27
    or-int v0, v24, v0

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4b

    if-ne v1, v15, :cond_4a

    goto :goto_28

    :cond_4a
    move-object v0, v1

    move-object v1, v2

    move-object v5, v8

    move-object/from16 v24, v10

    move/from16 p16, v13

    move-object/from16 v2, v21

    move-object/from16 v55, v27

    const/4 v13, 0x3

    move/from16 v8, p13

    move-object/from16 v21, v4

    move-object v10, v9

    move-object v4, v14

    move-object v9, v6

    move-object v14, v7

    move-object v7, v3

    goto :goto_29

    :cond_4b
    :goto_28
    new-instance v0, Lu0/u;

    move-object/from16 p16, v21

    move-object/from16 v21, v4

    move-object/from16 v4, p16

    move-object/from16 p16, v7

    move-object v7, v6

    move-object v6, v14

    move-object/from16 v14, p16

    move-object v1, v2

    move-object v5, v3

    move/from16 p16, v13

    move-object/from16 v55, v27

    const/4 v13, 0x3

    move/from16 v2, p13

    move/from16 v3, p14

    invoke-direct/range {v0 .. v10}, Lu0/u;-><init>(Lu0/s0;ZZLq3/z;Lq3/y;Lq3/l;Lq3/r;Lf1/s1;Lbc3/c0;Lr0/a;)V

    move-object/from16 v24, v10

    move-object v10, v9

    move-object v9, v7

    move-object v7, v5

    move-object v5, v8

    move v8, v2

    move-object v2, v4

    move-object v4, v6

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_29
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v14}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v6, p6

    invoke-static {v0, v8, v6}, Landroidx/compose/foundation/c;->a(Landroidx/compose/ui/Modifier;ZLj0/i;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v8, :cond_4c

    if-nez p14, :cond_4c

    const/16 v25, 0x1

    goto :goto_2a

    :cond_4c
    const/16 v25, 0x0

    :goto_2a
    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v13, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v25

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v25, v25, v28

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v25, v25, v28

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v25, v25, v28

    move-object/from16 v28, v0

    const/16 v0, 0x20

    if-le v12, v0, :cond_4e

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-nez v29, :cond_4d

    goto :goto_2b

    :cond_4d
    move-object/from16 v29, v1

    goto :goto_2c

    :cond_4e
    :goto_2b
    move-object/from16 v29, v1

    and-int/lit8 v1, v23, 0x30

    if-ne v1, v0, :cond_4f

    :goto_2c
    const/4 v0, 0x1

    goto :goto_2d

    :cond_4f
    const/4 v0, 0x0

    :goto_2d
    or-int v0, v25, v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_51

    if-ne v1, v15, :cond_50

    goto :goto_2e

    :cond_50
    move-object v0, v1

    move-object v4, v5

    move-object/from16 v25, v14

    move-object/from16 v56, v28

    move-object/from16 v1, v29

    move-object v14, v6

    move-object/from16 v28, v13

    move-object v13, v3

    goto :goto_2f

    :cond_51
    :goto_2e
    new-instance v0, Lcz/d;

    const/4 v6, 0x0

    move-object v1, v3

    move-object v3, v2

    move-object v2, v13

    move-object v13, v1

    move-object v1, v5

    move-object v5, v4

    move-object v4, v1

    move-object/from16 v25, v14

    move-object/from16 v56, v28

    move-object/from16 v1, v29

    move-object/from16 v14, p6

    invoke-direct/range {v0 .. v6}, Lcz/d;-><init>(Lu0/s0;Lp1/c1;Lq3/z;Lf1/s1;Lq3/l;Lq83/d;)V

    move-object/from16 v28, v2

    move-object v2, v3

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2f
    check-cast v0, Lc93/m;

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v0, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_52

    if-ne v3, v15, :cond_53

    :cond_52
    new-instance v3, Lu0/v;

    const/4 v0, 0x0

    invoke-direct {v3, v1, v0}, Lu0/v;-><init>(Lu0/s0;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_53
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const v0, 0x845fed

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v5, La1/f;

    const/4 v6, 0x3

    invoke-direct {v5, v3, v6}, La1/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {v13, v0, v5}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    move/from16 v5, p16

    const/16 v6, 0x4000

    if-ne v5, v6, :cond_54

    const/4 v5, 0x1

    goto :goto_30

    :cond_54
    const/4 v5, 0x0

    :goto_30
    or-int/2addr v3, v5

    move/from16 v5, v19

    const/16 v6, 0x800

    if-ne v5, v6, :cond_55

    const/4 v6, 0x1

    goto :goto_31

    :cond_55
    const/4 v6, 0x0

    :goto_31
    or-int/2addr v3, v6

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_56

    if-ne v6, v15, :cond_57

    :cond_56
    move-object v3, v0

    goto :goto_32

    :cond_57
    move-object v8, v0

    move-object/from16 p16, v2

    move-object v0, v6

    move-object v6, v9

    move v9, v5

    goto :goto_33

    :goto_32
    new-instance v0, Lev2/s;

    move-object/from16 p16, v2

    move-object v6, v9

    move-object/from16 v2, v25

    move v9, v5

    move-object v5, v4

    move v4, v8

    move-object v8, v3

    move/from16 v3, p14

    invoke-direct/range {v0 .. v6}, Lev2/s;-><init>(Lu0/s0;Lg2/s;ZZLf1/s1;Lq3/r;)V

    move-object v4, v5

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_33
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x7

    if-eqz p13, :cond_58

    new-instance v3, Ld30/b0;

    invoke-direct {v3, v2, v0, v14}, Ld30/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v8, v3}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_34

    :cond_58
    move-object v0, v8

    :goto_34
    iget-object v3, v4, Lf1/s1;->A:Lf1/p1;

    iget-object v5, v4, Lf1/s1;->z:Lf1/n1;

    new-instance v8, Lf1/k0;

    const/4 v14, 0x0

    invoke-direct {v8, v14, v3, v5}, Lf1/k0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v34, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    const/16 v37, 0x0

    const/16 v39, 0x4

    move-object/from16 v35, v3

    move-object/from16 v36, v5

    move-object/from16 v38, v8

    invoke-direct/range {v34 .. v39}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    move-object/from16 v3, v34

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lu2/o;->a:Lu2/n;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lu2/q;->b:Lu2/a;

    invoke-static {v0, v3}, Lu2/d0;->i(Landroidx/compose/ui/Modifier;Lu2/a;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v3, v53

    const/4 v5, 0x4

    if-ne v3, v5, :cond_59

    const/4 v5, 0x1

    goto :goto_35

    :cond_59
    move v5, v14

    :goto_35
    or-int/2addr v0, v5

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_5a

    if-ne v5, v15, :cond_5b

    :cond_5a
    new-instance v5, Ls90/f;

    const/16 v0, 0xd

    invoke-direct {v5, v1, v7, v6, v0}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v5}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/16 v5, 0x800

    if-ne v9, v5, :cond_5c

    const/4 v5, 0x1

    goto :goto_36

    :cond_5c
    move v5, v14

    :goto_36
    or-int/2addr v0, v5

    move-object/from16 v5, v52

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    const/4 v9, 0x4

    if-ne v3, v9, :cond_5d

    const/4 v9, 0x1

    goto :goto_37

    :cond_5d
    move v9, v14

    :goto_37
    or-int/2addr v0, v9

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_5f

    if-ne v9, v15, :cond_5e

    goto :goto_38

    :cond_5e
    move v7, v2

    move/from16 v53, v3

    move-object/from16 v52, v5

    goto :goto_39

    :cond_5f
    :goto_38
    new-instance v0, Lmt2/c;

    move/from16 v53, v3

    move-object v3, v5

    move-object v5, v7

    move v7, v2

    move/from16 v2, p13

    invoke-direct/range {v0 .. v6}, Lmt2/c;-><init>(Lu0/s0;ZLb3/m3;Lf1/s1;Lq3/y;Lq3/r;)V

    move-object/from16 v52, v3

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v0

    :goto_39
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v9}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    move-object/from16 v0, p4

    move-object v9, v6

    instance-of v6, v0, Lq3/s;

    new-instance v0, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;

    move-object/from16 v2, p0

    move/from16 v5, p13

    move-object/from16 v14, p16

    move-object v3, v1

    move-object/from16 v58, v8

    move-object v7, v9

    move-object/from16 v57, v10

    move/from16 p16, v12

    move-object/from16 v10, v25

    move-object/from16 v1, v33

    move/from16 v12, v53

    move-object/from16 v9, p11

    move-object v8, v4

    move/from16 v4, p14

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;-><init>(Lq3/e0;Lq3/y;Lu0/s0;ZZZLq3/r;Lf1/s1;Lq3/l;Lg2/s;)V

    move-object v1, v3

    move v10, v5

    move-object v6, v9

    move-object v9, v0

    if-eqz v10, :cond_61

    if-nez p14, :cond_61

    move-object/from16 v5, v52

    check-cast v5, Lb3/n2;

    iget-object v0, v5, Lb3/n2;->c:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_61

    iget-object v0, v1, Lu0/s0;->A:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/u0;

    iget-wide v2, v0, Ll3/u0;->a:J

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v0

    if-eqz v0, :cond_61

    iget-object v0, v1, Lu0/s0;->B:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll3/u0;

    iget-wide v2, v0, Ll3/u0;->a:J

    invoke-static {v2, v3}, Ll3/u0;->c(J)Z

    move-result v0

    if-nez v0, :cond_60

    goto :goto_3a

    :cond_60
    const/4 v0, 0x1

    goto :goto_3b

    :cond_61
    :goto_3a
    const/4 v0, 0x0

    :goto_3b
    if-eqz v0, :cond_62

    new-instance v0, Ld30/e1;

    const/4 v5, 0x3

    move-object/from16 v3, p0

    move-object v2, v1

    move-object v4, v7

    move-object/from16 v1, p7

    invoke-direct/range {v0 .. v5}, Ld30/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v2

    invoke-static {v13, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v27, v3

    goto :goto_3c

    :cond_62
    move-object/from16 v27, v13

    :goto_3c
    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_63

    if-ne v2, v15, :cond_64

    :cond_63
    new-instance v2, Lf1/h1;

    const/4 v0, 0x1

    invoke-direct {v2, v8, v0}, Lf1/h1;-><init>(Lf1/s1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_64
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v2, v11}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    const/4 v5, 0x4

    if-ne v12, v5, :cond_65

    const/4 v2, 0x1

    goto :goto_3d

    :cond_65
    const/4 v2, 0x0

    :goto_3d
    or-int/2addr v0, v2

    move/from16 v2, p16

    const/16 v3, 0x20

    if-le v2, v3, :cond_66

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_67

    :cond_66
    and-int/lit8 v2, v23, 0x30

    if-ne v2, v3, :cond_68

    :cond_67
    const/4 v2, 0x1

    goto :goto_3e

    :cond_68
    const/4 v2, 0x0

    :goto_3e
    or-int/2addr v0, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6a

    if-ne v2, v15, :cond_69

    goto :goto_3f

    :cond_69
    move-object v12, v6

    goto :goto_40

    :cond_6a
    :goto_3f
    new-instance v0, Lry2/d;

    const/16 v5, 0xa

    move-object/from16 v3, p0

    move-object v4, v6

    move-object v2, v14

    invoke-direct/range {v0 .. v5}, Lry2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v12, v4

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :goto_40
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v2, v11}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    move-object v4, v8

    iget-object v8, v1, Lu0/s0;->v:Lu0/v;

    move/from16 v14, p9

    const/4 v0, 0x1

    if-ne v14, v0, :cond_6b

    const/4 v5, 0x1

    :goto_41
    move-object v0, v9

    goto :goto_42

    :cond_6b
    const/4 v5, 0x0

    goto :goto_41

    :goto_42
    iget v9, v12, Lq3/l;->e:I

    move-object v2, v0

    new-instance v0, Lu0/i1;

    move-object/from16 v3, p0

    move-object v14, v2

    move-object v2, v4

    move-object v6, v7

    move/from16 v4, v18

    move-object/from16 v7, v21

    invoke-direct/range {v0 .. v9}, Lu0/i1;-><init>(Lu0/s0;Lf1/s1;Lq3/y;ZZLq3/r;Lu0/t1;Lkotlin/jvm/functions/Function1;I)V

    move-object v4, v2

    invoke-static {v13, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget v2, v12, Lq3/l;->d:I

    const/16 v3, 0x8

    const/4 v7, 0x7

    if-ne v2, v7, :cond_6c

    goto :goto_43

    :cond_6c
    if-ne v2, v3, :cond_6d

    :goto_43
    const/4 v2, 0x0

    goto :goto_44

    :cond_6d
    const/4 v2, 0x1

    :goto_44
    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v7

    move-object/from16 v8, v51

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/4 v3, 0x5

    if-nez v7, :cond_6e

    if-ne v9, v15, :cond_6f

    :cond_6e
    new-instance v9, Lio/getstream/chat/android/client/b;

    invoke-direct {v9, v2, v8, v3}, Lio/getstream/chat/android/client/b;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6f
    check-cast v9, Lc93/a;

    invoke-static {v5, v2, v9}, Landroidx/compose/foundation/text/handwriting/a;->a(ZZLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lu0/g;->a:Lp1/b0;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    move-object v7, v4

    iget-wide v3, v5, Li2/x;->a:J

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11, v3, v4}, Lp1/q;->f(J)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_70

    if-ne v9, v15, :cond_71

    :cond_70
    new-instance v9, Lg1/d4;

    const/4 v5, 0x4

    invoke-direct {v9, v1, v3, v4, v5}, Lg1/d4;-><init>(Ljava/lang/Object;JI)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_71
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v9}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v5, v7

    invoke-static {v3, v8, v1, v5}, Landroidx/compose/foundation/text/input/internal/a;->a(Landroidx/compose/ui/Modifier;Ld1/b;Lu0/s0;Lf1/s1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v56

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Landroidx/room/d;

    const/16 v7, 0x9

    move-object/from16 v8, v55

    invoke-direct {v3, v7, v8, v1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Landroidx/room/d;

    const/16 v7, 0x8

    invoke-direct {v3, v7, v1, v5}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Lb30/v2;

    move-object/from16 v7, p6

    move-object v9, v6

    move-object/from16 v6, v26

    const/4 v15, 0x1

    invoke-direct {v2, v6, v10, v7, v15}, Lb30/v2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-static {v0, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v2, v58

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Ls;

    const/16 v3, 0x14

    invoke-direct {v2, v1, v3}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v2}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Lf01/f;

    move-object/from16 v3, v57

    const/4 v8, 0x6

    invoke-direct {v2, v8, v5, v3}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v2}, Landroidx/compose/foundation/text/contextmenu/modifier/a;->a(Landroidx/compose/ui/Modifier;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v10, :cond_72

    invoke-virtual {v1}, Lu0/s0;->b()Z

    move-result v2

    if-eqz v2, :cond_72

    iget-object v2, v1, Lu0/s0;->q:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_72

    move-object/from16 v2, v52

    check-cast v2, Lb3/n2;

    iget-object v2, v2, Lb3/n2;->c:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_72

    goto :goto_45

    :cond_72
    const/4 v15, 0x0

    :goto_45
    if-eqz v15, :cond_73

    sget-object v2, Lf0/y0;->a:Li3/y;

    new-instance v2, Lb30/o4;

    const/4 v3, 0x5

    invoke-direct {v2, v5, v3}, Lb30/o4;-><init>(Ljava/lang/Object;I)V

    invoke-static {v13, v2}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :goto_46
    move-object v2, v0

    goto :goto_47

    :cond_73
    move-object v3, v13

    goto :goto_46

    :goto_47
    new-instance v0, Lu0/z;

    move-object/from16 v7, p0

    move-object/from16 v8, p4

    move/from16 v4, p10

    move/from16 v16, p14

    move-object/from16 v60, v2

    move-object v12, v3

    move-object v14, v5

    move-object/from16 v18, v9

    move-object/from16 v59, v11

    move-object/from16 v10, v17

    move-object/from16 v11, v19

    move-object/from16 v19, v22

    move-object/from16 v13, v24

    move-object/from16 v9, v27

    move-object/from16 v3, p3

    move-object/from16 v17, p5

    move/from16 v5, p9

    move-object v2, v1

    move-object/from16 v1, p15

    invoke-direct/range {v0 .. v19}, Lu0/z;-><init>(Lkotlin/jvm/functions/Function3;Lu0/s0;Ll3/v0;IILu0/n1;Lq3/y;Lq3/g0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lr0/a;Lf1/s1;ZZLkotlin/jvm/functions/Function1;Lq3/r;Ly3/c;)V

    move-object v4, v14

    const v1, -0x308d4209

    move-object/from16 v11, v59

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x180

    move-object/from16 v2, v60

    invoke-static {v2, v4, v0, v11, v1}, Lu0/n0;->e(Landroidx/compose/ui/Modifier;Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_48

    :cond_74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "no recompose scope found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_75
    move-object v11, v9

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_48
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_76

    move-object v1, v0

    new-instance v0, Lu0/t;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v61, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lu0/t;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll3/v0;Lq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;ZIILq3/l;Lu0/q0;ZZLkotlin/jvm/functions/Function3;II)V

    move-object/from16 v1, v61

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_76
    return-void
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p3, Lp1/q;

    const v0, 0x795d8dec

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    const/4 v3, 0x1

    if-eq v1, v2, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, p3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p3, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v7, p3, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {p3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p3, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, p3, Lp1/q;->S:Z

    if-nez v4, :cond_4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v2, p3, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p3, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, p3, v0}, Lu0/n0;->c(Lf1/s1;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_7

    new-instance v0, Ljp1/k;

    const/16 v5, 0x19

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final f(Lf1/s1;ZLandroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p2, Lp1/q;

    const v0, 0x25552d88

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

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

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

    if-eqz v1, :cond_d

    if-eqz p1, :cond_c

    const v1, 0x5b2e7f11

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    iget-object v1, p0, Lf1/s1;->d:Lu0/s0;

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, v1, Lu0/p1;->a:Ll3/r0;

    iget-object v6, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v6, :cond_3

    iget-boolean v6, v6, Lu0/s0;->p:Z

    goto :goto_3

    :cond_3
    move v6, v4

    :goto_3
    if-nez v6, :cond_4

    move-object v3, v1

    :cond_4
    if-nez v3, :cond_6

    const v0, 0x5b336eeb

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    :cond_5
    :goto_4
    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_6
    const v1, 0x5b336eec

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-wide v6, v1, Lq3/y;->b:J

    invoke-static {v6, v7}, Ll3/u0;->c(J)Z

    move-result v1

    if-nez v1, :cond_9

    const v1, 0x7dc11ac6

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    iget-object v1, p0, Lf1/s1;->b:Lq3/r;

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v6

    iget-wide v6, v6, Lq3/y;->b:J

    shr-long/2addr v6, v2

    long-to-int v2, v6

    invoke-interface {v1, v2}, Lq3/r;->x(I)I

    move-result v1

    iget-object v2, p0, Lf1/s1;->b:Lq3/r;

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v6

    iget-wide v6, v6, Lq3/y;->b:J

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v6, v6

    invoke-interface {v2, v6}, Lq3/r;->x(I)I

    move-result v2

    invoke-virtual {v3, v1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v1

    sub-int/2addr v2, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v3, v2}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v2

    iget-object v3, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v3, :cond_7

    iget-object v3, v3, Lu0/s0;->m:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-ne v3, v4, :cond_7

    const v3, 0x7dc77b9a

    invoke-virtual {p2, v3}, Lp1/q;->e0(I)V

    shl-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/lit8 v3, v3, 0x6

    invoke-static {v4, v1, p0, p2, v3}, Lf1/y0;->h(ZLw3/j;Lf1/s1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const v1, 0x7dcb87ae

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_5
    iget-object v1, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lu0/s0;->n:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-ne v1, v4, :cond_8

    const v1, 0x7dcccf7b

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-static {v5, v2, p0, p2, v0}, Lf1/y0;->h(ZLw3/j;Lf1/s1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v0, 0x7dd0d7ce    # 3.4699993E37f

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v0, 0x7dd12d0e

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    :goto_7
    iget-object v0, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v0, :cond_5

    iget-object v1, v0, Lu0/s0;->l:Lp1/k1;

    iget-object v2, p0, Lf1/s1;->u:Lq3/y;

    iget-object v2, v2, Lq3/y;->a:Ll3/g;

    iget-object v2, v2, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v0}, Lu0/s0;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lf1/s1;->q()V

    goto/16 :goto_4

    :cond_b
    invoke-virtual {p0}, Lf1/s1;->n()V

    goto/16 :goto_4

    :goto_8
    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    const v0, 0x768ee72a

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Lf1/s1;->n()V

    goto :goto_9

    :cond_d
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v0, Lb30/t2;

    const/16 v1, 0x9

    invoke-direct {v0, p0, p1, p3, v1}, Lb30/t2;-><init>(Ljava/lang/Object;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final g(Lf1/s1;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v4, p1

    check-cast v4, Lp1/q;

    const p1, -0x5597ad88

    invoke-virtual {v4, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    const/4 v6, 0x0

    if-eq v1, v0, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/2addr p1, v2

    invoke-virtual {v4, p1, v1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz p1, :cond_b

    iget-object p1, p1, Lu0/s0;->o:Lp1/k1;

    invoke-virtual {p1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-ne p1, v2, :cond_b

    invoke-virtual {p0}, Lf1/s1;->l()Ll3/g;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_b

    const p1, -0x7de79b68

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_2

    if-ne v1, v2, :cond_3

    :cond_2
    new-instance v1, Lf1/l1;

    invoke-direct {v1, p0}, Lf1/l1;-><init>(Lf1/s1;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lu0/d1;

    sget-object p1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/c;

    iget-object v3, p0, Lf1/s1;->b:Lq3/r;

    invoke-virtual {p0}, Lf1/s1;->m()Lq3/y;

    move-result-object v5

    iget-wide v7, v5, Lq3/y;->b:J

    sget v5, Ll3/u0;->c:I

    const/16 v5, 0x20

    shr-long/2addr v7, v5

    long-to-int v7, v7

    invoke-interface {v3, v7}, Lq3/r;->x(I)I

    move-result v3

    iget-object v7, p0, Lf1/s1;->d:Lu0/s0;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lu0/s0;->d()Lu0/p1;

    move-result-object v7

    goto :goto_2

    :cond_4
    const/4 v7, 0x0

    :goto_2
    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v7, Lu0/p1;->a:Ll3/r0;

    iget-object v8, v7, Ll3/r0;->a:Ll3/q0;

    iget-object v8, v8, Ll3/q0;->a:Ll3/g;

    iget-object v8, v8, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v3, v6, v8}, Le93/b;->n(III)I

    move-result v3

    invoke-virtual {v7, v3}, Ll3/r0;->c(I)Lh2/c;

    move-result-object v3

    iget v7, v3, Lh2/c;->a:F

    sget v8, Lu0/e1;->a:F

    invoke-interface {p1, v8}, Ly3/c;->q0(F)F

    move-result p1

    int-to-float v8, v0

    div-float/2addr p1, v8

    add-float/2addr p1, v7

    iget v3, v3, Lh2/c;->d:F

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v7, p1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v9, p1

    shl-long/2addr v7, v5

    const-wide v11, 0xffffffffL

    and-long/2addr v9, v11

    or-long/2addr v7, v9

    invoke-virtual {v4, v7, v8}, Lp1/q;->f(J)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_5

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lu0/b0;

    invoke-direct {v3, v7, v8}, Lu0/b0;-><init>(J)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lf1/m;

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr p1, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_7

    if-ne v5, v2, :cond_8

    :cond_7
    new-instance v5, Lf1/k0;

    invoke-direct {v5, v1, p0}, Lf1/k0;-><init>(Lu0/d1;Lf1/s1;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v1, v5}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {v4, v7, v8}, Lp1/q;->f(J)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_9

    if-ne v5, v2, :cond_a

    :cond_9
    new-instance v5, Lsz0/p1;

    invoke-direct {v5, v7, v8, v0}, Lsz0/p1;-><init>(JI)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v6, v5}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v0, v3

    const-wide/16 v2, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lu0/b;->a(Lf1/m;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_b
    const p1, -0x7dd3a296

    invoke-virtual {v4, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_c
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Ltx0/a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p2, v1}, Ltx0/a;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final h(Ly2/i1;ILq3/e0;Ll3/r0;ZI)Lh2/c;
    .locals 1

    if-eqz p3, :cond_0

    iget-object p2, p2, Lq3/e0;->b:Lq3/r;

    invoke-interface {p2, p1}, Lq3/r;->x(I)I

    move-result p1

    invoke-virtual {p3, p1}, Ll3/r0;->c(I)Lh2/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lh2/c;->e:Lh2/c;

    :goto_0
    iget p2, p1, Lh2/c;->a:F

    sget p3, Lu0/e1;->a:F

    invoke-interface {p0, p3}, Ly3/c;->F(F)I

    move-result p0

    if-eqz p4, :cond_1

    int-to-float p3, p5

    sub-float/2addr p3, p2

    int-to-float v0, p0

    sub-float/2addr p3, v0

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    if-eqz p4, :cond_2

    int-to-float p0, p5

    sub-float/2addr p0, p2

    goto :goto_2

    :cond_2
    int-to-float p0, p0

    add-float/2addr p0, p2

    :goto_2
    const/4 p2, 0x0

    const/16 p4, 0xa

    invoke-static {p1, p3, p0, p2, p4}, Lh2/c;->b(Lh2/c;FFFI)Lh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final i(ILandroid/view/KeyEvent;)Z
    .locals 2

    invoke-static {p1}, Ls2/e;->D(Landroid/view/KeyEvent;)J

    move-result-wide v0

    const/16 p1, 0x20

    shr-long/2addr v0, p1

    long-to-int p1, v0

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "alternateText can\'t be an empty string."

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    const-string v0, "androidx.compose.foundation.text.inlineContent"

    invoke-virtual {p0, v0, p1}, Ll3/d;->h(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ll3/d;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll3/d;->e()V

    return-void
.end method

.method public static final k(Lu2/v;Lu0/d1;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lay/u;

    const/4 v1, 0x0

    const/16 v2, 0x16

    invoke-direct {v0, p0, p1, v1, v2}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Lu0/s0;)V
    .locals 7

    iget-object v0, p0, Lu0/s0;->e:Lq3/d0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lu0/s0;->d:Lq3/i;

    iget-object v3, p0, Lu0/s0;->v:Lu0/v;

    iget-object v2, v2, Lq3/i;->w:Ljava/lang/Object;

    check-cast v2, Lq3/y;

    const-wide/16 v4, 0x0

    const/4 v6, 0x3

    invoke-static {v2, v1, v4, v5, v6}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object v2

    invoke-virtual {v3, v2}, Lu0/v;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lq3/d0;->a:Lq3/z;

    iget-object v3, v2, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v0, v2, Lq3/z;->a:Lq3/t;

    invoke-interface {v0}, Lq3/t;->b()V

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    if-eq v4, v0, :cond_0

    :cond_2
    :goto_0
    iput-object v1, p0, Lu0/s0;->e:Lq3/d0;

    return-void
.end method

.method public static final m(ILjava/lang/String;)I
    .locals 11

    invoke-static {}, Lu0/n0;->q()Lh6/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lh6/j;->c()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    if-eqz v4, :cond_5

    const-string v2, "charSequence cannot be null"

    invoke-static {p1, v2}, Lwb3/f;->q(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lh6/j;->e:Lh6/e;

    iget-object v4, v0, Lh6/e;->b:La3/p;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, -0x1

    if-ltz p0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lt p0, v2, :cond_2

    :cond_1
    move-object v5, p1

    goto :goto_1

    :cond_2
    instance-of v2, p1, Landroid/text/Spanned;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/text/Spanned;

    add-int/lit8 v5, p0, 0x1

    const-class v6, Lh6/y;

    invoke-interface {v2, p0, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lh6/y;

    array-length v6, v5

    if-lez v6, :cond_3

    aget-object v3, v5, v3

    invoke-interface {v2, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    move-object v5, p1

    goto :goto_2

    :cond_3
    add-int/lit8 v2, p0, -0x10

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v3, p0, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v7

    new-instance v10, Lh6/q;

    invoke-direct {v10, p0}, Lh6/q;-><init>(I)V

    const v8, 0x7fffffff

    const/4 v9, 0x1

    move-object v5, p1

    invoke-virtual/range {v4 .. v10}, La3/p;->H(Ljava/lang/CharSequence;IIIZLh6/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh6/q;

    iget v2, p1, Lh6/q;->y:I

    goto :goto_2

    :goto_1
    move v2, v0

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    if-ne v2, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, p1

    goto :goto_3

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Not initialized yet"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    move-object v5, p1

    :goto_3
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_7
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/text/BreakIterator;->following(I)I

    move-result p0

    return p0
.end method

.method public static final n(ILjava/lang/CharSequence;)I
    .locals 3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    if-ge p0, v0, :cond_1

    invoke-interface {p1, p0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    return p0
.end method

.method public static final o(ILjava/lang/CharSequence;)I
    .locals 2

    :goto_0
    if-lez p0, :cond_1

    add-int/lit8 v0, p0, -0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final p(ILjava/lang/String;)I
    .locals 4

    invoke-static {}, Lu0/n0;->q()Lh6/j;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    add-int/lit8 v2, p0, -0x1

    const/4 v3, 0x0

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v0, v2, p1}, Lh6/j;->b(ILjava/lang/CharSequence;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_2
    invoke-static {}, Ljava/text/BreakIterator;->getCharacterInstance()Ljava/text/BreakIterator;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->setText(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p0

    return p0
.end method

.method public static final q()Lh6/j;
    .locals 3

    invoke-static {}, Lh6/j;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v0

    invoke-virtual {v0}, Lh6/j;->c()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final r(Ll3/r0;I)F
    .locals 3

    if-ltz p1, :cond_2

    iget-object v0, p0, Ll3/r0;->a:Ll3/q0;

    iget-object p0, p0, Ll3/r0;->b:Ll3/w;

    iget-object v0, v0, Ll3/q0;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ll3/w;->d(I)I

    move-result v0

    iget v1, p0, Ll3/w;->b:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Ll3/w;->f:I

    add-int/lit8 v2, v2, -0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Ll3/w;->c(IZ)I

    move-result v1

    if-le p1, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Ll3/w;->m(I)V

    iget-object p0, p0, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {v0, p0}, Ll3/s;->d(ILjava/util/List;)I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll3/y;

    iget-object p1, p0, Ll3/y;->a:Ll3/a;

    iget p0, p0, Ll3/y;->d:I

    sub-int/2addr v0, p0

    iget-object p0, p1, Ll3/a;->d:Lm3/m;

    invoke-virtual {p0, v0}, Lm3/m;->e(I)F

    move-result p1

    invoke-virtual {p0, v0}, Lm3/m;->g(I)F

    move-result p0

    sub-float/2addr p1, p0

    return p1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final s(Lu0/s0;Lq3/y;Lq3/r;)V
    .locals 11

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {v1}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v3

    :try_start_0
    invoke-virtual {p0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v8, p0, Lu0/s0;->e:Lq3/d0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v8, :cond_2

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_2
    :try_start_2
    invoke-virtual {p0}, Lu0/s0;->c()Ly2/y;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v7, :cond_3

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_3
    :try_start_3
    iget-object v5, p0, Lu0/s0;->a:Lu0/c1;

    iget-object v6, v0, Lu0/p1;->a:Ll3/r0;

    invoke-virtual {p0}, Lu0/s0;->b()Z

    move-result v9

    move-object v4, p1

    move-object v10, p2

    invoke-static/range {v4 .. v10}, Lu0/n0;->t(Lq3/y;Lu0/c1;Ll3/r0;Ly2/y;Lq3/d0;ZLq3/r;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p0
.end method

.method public static t(Lq3/y;Lu0/c1;Ll3/r0;Ly2/y;Lq3/d0;ZLq3/r;)V
    .locals 5

    if-nez p5, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-wide v0, p0, Lq3/y;->b:J

    invoke-static {v0, v1}, Ll3/u0;->e(J)I

    move-result p0

    invoke-interface {p6, p0}, Lq3/r;->x(I)I

    move-result p0

    sget-object p5, Lu0/f1;->a:Ljava/lang/String;

    iget-object p5, p2, Ll3/r0;->a:Ll3/q0;

    iget-object p5, p5, Ll3/q0;->a:Ll3/g;

    iget-object p5, p5, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result p5

    const-wide v0, 0xffffffffL

    if-ge p0, p5, :cond_1

    invoke-virtual {p2, p0}, Ll3/r0;->b(I)Lh2/c;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-eqz p0, :cond_2

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p2, p0}, Ll3/r0;->b(I)Lh2/c;

    move-result-object p0

    goto :goto_0

    :cond_2
    iget-object p0, p1, Lu0/c1;->b:Ll3/v0;

    iget-object p2, p1, Lu0/c1;->g:Ly3/c;

    iget-object p1, p1, Lu0/c1;->h:Lp3/h;

    invoke-static {p0, p2, p1}, Lu0/f1;->b(Ll3/v0;Ly3/c;Lp3/h;)J

    move-result-wide p0

    new-instance p2, Lh2/c;

    and-long/2addr p0, v0

    long-to-int p0, p0

    int-to-float p0, p0

    const/4 p1, 0x0

    const/high16 p5, 0x3f800000    # 1.0f

    invoke-direct {p2, p1, p1, p5, p0}, Lh2/c;-><init>(FFFF)V

    move-object p0, p2

    :goto_0
    iget p1, p0, Lh2/c;->b:F

    iget p2, p0, Lh2/c;->a:F

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p5

    int-to-long p5, p5

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v4, 0x20

    shl-long/2addr p5, v4

    and-long/2addr v2, v0

    or-long/2addr p5, v2

    invoke-interface {p3, p5, p6}, Ly2/y;->Z(J)J

    move-result-wide p5

    shr-long v2, p5, v4

    long-to-int p3, v2

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    and-long/2addr p5, v0

    long-to-int p5, p5

    invoke-static {p5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p5

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long v2, p3

    invoke-static {p5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long p5, p3

    shl-long/2addr v2, v4

    and-long/2addr p5, v0

    or-long/2addr p5, v2

    iget p3, p0, Lh2/c;->c:F

    sub-float/2addr p3, p2

    iget p0, p0, Lh2/c;->d:F

    sub-float/2addr p0, p1

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long p1, p1

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v2, p0

    shl-long p0, p1, v4

    and-long p2, v2, v0

    or-long/2addr p0, p2

    invoke-static {p5, p6, p0, p1}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object p0

    iget-object p1, p4, Lq3/d0;->a:Lq3/z;

    iget-object p1, p1, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq3/d0;

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p4, Lq3/d0;->b:Lq3/t;

    invoke-interface {p1, p0}, Lq3/t;->e(Lh2/c;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static final u(Lq3/z;Lu0/s0;Lq3/y;Lq3/l;Lq3/r;)V
    .locals 6

    iget-object v0, p1, Lu0/s0;->d:Lq3/i;

    iget-object v1, p1, Lu0/s0;->v:Lu0/v;

    iget-object v2, p1, Lu0/s0;->w:Lu0/v;

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Ls90/f;

    const/16 v5, 0xf

    invoke-direct {v4, v0, v1, v3, v5}, Ls90/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    iget-object v0, p0, Lq3/z;->a:Lq3/t;

    invoke-interface {v0, p2, p3, v4, v2}, Lq3/t;->f(Lq3/y;Lq3/l;Ls90/f;Lu0/v;)V

    new-instance p3, Lq3/d0;

    invoke-direct {p3, p0, v0}, Lq3/d0;-><init>(Lq3/z;Lq3/t;)V

    iget-object p0, p0, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0, p3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iput-object p3, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object p3, p1, Lu0/s0;->e:Lq3/d0;

    invoke-static {p1, p2, p4}, Lu0/n0;->s(Lu0/s0;Lq3/y;Lq3/r;)V

    return-void
.end method
