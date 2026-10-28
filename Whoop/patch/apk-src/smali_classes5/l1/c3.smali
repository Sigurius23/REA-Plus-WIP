.class public abstract Ll1/c3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Ll1/c3;->a:F

    return-void
.end method

.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;III)V
    .locals 37

    move-object/from16 v14, p13

    move/from16 v0, p16

    move-object/from16 v1, p14

    check-cast v1, Lp1/q;

    const v2, 0x71569c68

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v3, p0

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p15, v2

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/16 v6, 0x10

    const/16 v7, 0x20

    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    or-int/2addr v2, v5

    const v5, 0x36196c00

    or-int/2addr v2, v5

    or-int/lit16 v5, v0, 0x6db6

    const v8, 0x8000

    and-int v8, p17, v8

    const/high16 v9, 0x20000

    if-eqz v8, :cond_3

    const v5, 0x36db6

    or-int/2addr v5, v0

    :cond_2
    move-object/from16 v10, p7

    goto :goto_3

    :cond_3
    const/high16 v10, 0x30000

    and-int/2addr v10, v0

    if-nez v10, :cond_2

    move-object/from16 v10, p7

    invoke-virtual {v1, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move v11, v9

    goto :goto_2

    :cond_4
    const/high16 v11, 0x10000

    :goto_2
    or-int/2addr v5, v11

    :goto_3
    const/high16 v11, 0x180000

    or-int/2addr v11, v5

    and-int v9, p17, v9

    if-eqz v9, :cond_6

    const/high16 v11, 0xd80000

    or-int/2addr v11, v5

    :cond_5
    move/from16 v5, p9

    goto :goto_5

    :cond_6
    const/high16 v5, 0xc00000

    and-int/2addr v5, v0

    if-nez v5, :cond_5

    move/from16 v5, p9

    invoke-virtual {v1, v5}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_7

    const/high16 v12, 0x800000

    goto :goto_4

    :cond_7
    const/high16 v12, 0x400000

    :goto_4
    or-int/2addr v11, v12

    :goto_5
    const/high16 v12, 0x6000000

    and-int/2addr v12, v0

    const/high16 v13, 0x40000

    if-nez v12, :cond_a

    and-int v12, p17, v13

    if-nez v12, :cond_8

    move/from16 v12, p10

    invoke-virtual {v1, v12}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_9

    const/high16 v15, 0x4000000

    goto :goto_6

    :cond_8
    move/from16 v12, p10

    :cond_9
    const/high16 v15, 0x2000000

    :goto_6
    or-int/2addr v11, v15

    goto :goto_7

    :cond_a
    move/from16 v12, p10

    :goto_7
    const/high16 v15, 0x30000000

    or-int/2addr v11, v15

    move-object/from16 v15, p12

    invoke-virtual {v1, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_b

    move v6, v7

    :cond_b
    const/4 v7, 0x6

    or-int/2addr v6, v7

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/16 v7, 0x100

    goto :goto_8

    :cond_c
    const/16 v7, 0x80

    :goto_8
    or-int/2addr v6, v7

    const p14, 0x12492493

    and-int v7, v2, p14

    move/from16 v16, v13

    const v13, 0x12492492

    const/4 v0, 0x0

    const/16 v17, 0x1

    if-ne v7, v13, :cond_e

    and-int v7, v11, p14

    if-ne v7, v13, :cond_e

    and-int/lit16 v6, v6, 0x93

    const/16 v7, 0x92

    if-eq v6, v7, :cond_d

    goto :goto_9

    :cond_d
    move v6, v0

    goto :goto_a

    :cond_e
    :goto_9
    move/from16 v6, v17

    :goto_a
    and-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v2, p15, 0x1

    if-eqz v2, :cond_10

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v1}, Lp1/q;->X()V

    move-object/from16 v2, p4

    move-object/from16 v8, p8

    move/from16 v11, p11

    move v9, v5

    move-object v7, v10

    move v10, v12

    move/from16 v5, p3

    move-object/from16 v12, p6

    goto :goto_e

    :cond_10
    :goto_b
    sget-object v2, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {v1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/v0;

    if-eqz v8, :cond_11

    sget-object v6, Lu0/r0;->e:Lu0/r0;

    goto :goto_c

    :cond_11
    move-object v6, v10

    :goto_c
    sget-object v7, Lu0/q0;->g:Lu0/q0;

    if-eqz v9, :cond_12

    move v5, v0

    :cond_12
    and-int v8, p17, v16

    if-eqz v8, :cond_14

    if-eqz v5, :cond_13

    move/from16 v8, v17

    goto :goto_d

    :cond_13
    const v8, 0x7fffffff

    goto :goto_d

    :cond_14
    move v8, v12

    :goto_d
    sget-object v9, Lq3/f0;->w:Lg40/h2;

    move v10, v8

    move-object v12, v9

    move/from16 v11, v17

    move v9, v5

    move-object v8, v7

    move v5, v11

    move-object v7, v6

    :goto_e
    invoke-virtual {v1}, Lp1/q;->r()V

    const v6, 0x4e15cd93    # 6.283194E8f

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v6, v13, :cond_15

    invoke-static {v1}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_15
    move-object v13, v6

    check-cast v13, Lj0/i;

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    const v6, 0x7621d1a2

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ll3/v0;->c()J

    move-result-wide v16

    const-wide/16 v18, 0x10

    cmp-long v6, v16, v18

    if-eqz v6, :cond_16

    :goto_f
    move-wide/from16 v19, v16

    goto :goto_10

    :cond_16
    invoke-static {v13, v1, v0}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v14, v5, v0, v6}, Ll1/e4;->d(ZZZ)J

    move-result-wide v16

    goto :goto_f

    :goto_10
    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    new-instance v18, Ll3/v0;

    const-wide/16 v31, 0x0

    const v33, 0xfffffe

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v6

    sget-object v0, Lf1/a2;->a:Lp1/b0;

    move-object/from16 p14, v1

    iget-object v1, v14, Ll1/e4;->k:Lf1/y1;

    invoke-virtual {v0, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    move-object v1, v0

    new-instance v0, Ll1/a3;

    const/16 v16, 0x0

    move-object/from16 v34, p14

    move-object/from16 v35, v1

    move-object/from16 v17, v2

    move-object v2, v14

    move-object/from16 v1, p2

    move-object/from16 v14, p5

    invoke-direct/range {v0 .. v16}, Ll1/a3;-><init>(Landroidx/compose/ui/Modifier;Ll1/e4;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lj0/i;Lc93/m;Li2/a1;I)V

    const v1, 0x6fb38128

    move-object/from16 v2, v34

    invoke-static {v1, v2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v3, v35

    invoke-static {v3, v0, v2, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v8

    move-object v8, v7

    move-object v7, v12

    move v12, v11

    move v11, v10

    move v10, v9

    move-object v9, v4

    move v4, v5

    move-object/from16 v5, v17

    goto :goto_11

    :cond_17
    move-object v2, v1

    invoke-virtual {v2}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object v8, v10

    move v11, v12

    move/from16 v12, p11

    move v10, v5

    move-object/from16 v5, p4

    :goto_11
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    move-object v1, v0

    new-instance v0, Ll1/x2;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v36, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, Ll1/x2;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;III)V

    move-object/from16 v1, v36

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;I)V
    .locals 40

    move/from16 v3, p8

    move-object/from16 v4, p16

    move/from16 v0, p18

    move-object/from16 v1, p17

    check-cast v1, Lp1/q;

    const v2, 0x7a9fbaf5

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v0, 0x6

    move-object/from16 v5, p0

    if-nez v2, :cond_1

    invoke-virtual {v1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v0

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    goto :goto_3

    :cond_3
    move-object/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v0, 0x180

    const/16 v8, 0x80

    const/16 v9, 0x100

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move v10, v9

    goto :goto_4

    :cond_4
    move v10, v8

    :goto_4
    or-int/2addr v2, v10

    goto :goto_5

    :cond_5
    move-object/from16 v7, p2

    :goto_5
    or-int/lit16 v10, v2, 0x6c00

    const/high16 v11, 0x30000

    and-int/2addr v11, v0

    if-nez v11, :cond_6

    const v10, 0x16c00

    or-int/2addr v10, v2

    :cond_6
    const/high16 v2, 0x180000

    and-int/2addr v2, v0

    if-nez v2, :cond_8

    move-object/from16 v2, p5

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/high16 v11, 0x100000

    goto :goto_6

    :cond_7
    const/high16 v11, 0x80000

    :goto_6
    or-int/2addr v10, v11

    goto :goto_7

    :cond_8
    move-object/from16 v2, p5

    :goto_7
    const/high16 v11, 0xc00000

    and-int/2addr v11, v0

    if-nez v11, :cond_a

    move-object/from16 v11, p6

    invoke-virtual {v1, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/high16 v12, 0x800000

    goto :goto_8

    :cond_9
    const/high16 v12, 0x400000

    :goto_8
    or-int/2addr v10, v12

    goto :goto_9

    :cond_a
    move-object/from16 v11, p6

    :goto_9
    const/high16 v12, 0x36000000

    or-int/2addr v10, v12

    invoke-virtual {v1, v3}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_a

    :cond_b
    const/16 v12, 0x400

    :goto_a
    const v13, 0xc301b6

    or-int/2addr v12, v13

    move-object/from16 v14, p9

    invoke-virtual {v1, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/16 v13, 0x4000

    goto :goto_b

    :cond_c
    const/16 v13, 0x2000

    :goto_b
    or-int/2addr v12, v13

    const/high16 v13, 0x32180000

    or-int/2addr v12, v13

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    move v8, v9

    :cond_d
    const/16 v9, 0x16

    or-int/2addr v8, v9

    const v9, 0x12492493

    and-int v13, v10, v9

    const v15, 0x12492492

    move/from16 p17, v9

    const/16 v16, 0x1

    if-ne v13, v15, :cond_f

    and-int v12, v12, p17

    if-ne v12, v15, :cond_f

    and-int/lit16 v8, v8, 0x93

    const/16 v12, 0x92

    if-eq v8, v12, :cond_e

    goto :goto_c

    :cond_e
    const/4 v8, 0x0

    goto :goto_d

    :cond_f
    :goto_c
    move/from16 v8, v16

    :goto_d
    and-int/lit8 v10, v10, 0x1

    invoke-virtual {v1, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v8, v0, 0x1

    if-eqz v8, :cond_11

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_e

    :cond_10
    invoke-virtual {v1}, Lp1/q;->X()V

    move/from16 v8, p3

    move-object/from16 v10, p4

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v16, p14

    move-object/from16 v18, p15

    goto :goto_10

    :cond_11
    :goto_e
    sget-object v8, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {v1, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll3/v0;

    sget-object v10, Lu0/q0;->g:Lu0/q0;

    if-eqz p12, :cond_12

    move/from16 v12, v16

    goto :goto_f

    :cond_12
    const v12, 0x7fffffff

    :goto_f
    sget-object v13, Ll1/t2;->a:Ll1/t2;

    sget-object v13, Lo1/p;->b:Lo1/t;

    invoke-static {v13, v1}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v13

    move-object/from16 v18, v13

    move v13, v12

    move-object v12, v10

    move-object v10, v8

    move/from16 v8, v16

    :goto_10
    invoke-virtual {v1}, Lp1/q;->r()V

    const v15, -0x1defba1a

    invoke-virtual {v1, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v15, v9, :cond_13

    invoke-static {v1}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v15

    :cond_13
    check-cast v15, Lj0/i;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    const v9, 0x519d82ef

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Ll3/v0;->c()J

    move-result-wide v19

    const-wide/16 v21, 0x10

    cmp-long v9, v19, v21

    if-eqz v9, :cond_14

    :goto_11
    move-wide/from16 v22, v19

    const/4 v9, 0x0

    goto :goto_12

    :cond_14
    const/4 v9, 0x0

    invoke-static {v15, v1, v9}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v17

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/lang/Boolean;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v4, v8, v3, v9}, Ll1/e4;->d(ZZZ)J

    move-result-wide v19

    goto :goto_11

    :goto_12
    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    new-instance v21, Ll3/v0;

    const-wide/16 v34, 0x0

    const v36, 0xfffffe

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v21 .. v36}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v9, v21

    invoke-virtual {v10, v9}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v9

    sget-object v0, Lf1/a2;->a:Lp1/b0;

    move-object/from16 p17, v1

    iget-object v1, v4, Ll1/e4;->k:Lf1/y1;

    invoke-virtual {v0, v1}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    move-object v1, v0

    new-instance v0, Ll1/b3;

    move-object/from16 v17, p7

    move-object/from16 v37, p17

    move-object/from16 v38, v1

    move-object v1, v7

    move v7, v8

    move-object v8, v9

    move-object/from16 v19, v10

    move-object v10, v12

    move v12, v13

    move/from16 v13, v16

    move-object/from16 v9, p10

    move-object/from16 v16, v11

    move/from16 v11, p12

    invoke-direct/range {v0 .. v18}, Ll1/b3;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;ZLl1/e4;Lq3/y;Lkotlin/jvm/functions/Function1;ZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lj0/i;Lc93/m;Lc93/m;Li2/a1;)V

    const v1, -0x7cd4204b

    move-object/from16 v2, v37

    invoke-static {v1, v2, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    move-object/from16 v3, v38

    invoke-static {v3, v0, v2, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move v4, v7

    move v14, v12

    move v15, v13

    move-object/from16 v16, v18

    move-object/from16 v5, v19

    move-object v12, v10

    goto :goto_13

    :cond_15
    move-object v2, v1

    invoke-virtual {v2}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v12, p11

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    :goto_13
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_16

    move-object v1, v0

    new-instance v0, Ll1/w2;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v39, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Ll1/w2;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;I)V

    move-object/from16 v1, v39

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final c(Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lkotlin/jvm/functions/Function1;Lx1/b;Lc93/m;Ll0/k1;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v0, p11

    move-object/from16 v15, p12

    move-object/from16 v13, p13

    move/from16 v8, p15

    move/from16 v9, p16

    sget-object v11, Lb2/e;->E:Lb2/m;

    sget-object v12, Lb2/e;->w:Lb2/m;

    move-object/from16 v14, p14

    check-cast v14, Lp1/q;

    move-object/from16 v16, v11

    const v11, 0x2cec89be

    invoke-virtual {v14, v11}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v11, v8, 0x6

    move/from16 p14, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    move-object/from16 v17, v12

    if-nez p14, :cond_1

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_0

    const/16 v19, 0x4

    goto :goto_0

    :cond_0
    const/16 v19, 0x2

    :goto_0
    or-int v19, v8, v19

    goto :goto_1

    :cond_1
    move/from16 v19, v8

    :goto_1
    and-int/lit8 v20, v8, 0x30

    const/16 v21, 0x10

    if-nez v20, :cond_3

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2

    const/16 v20, 0x20

    goto :goto_2

    :cond_2
    move/from16 v20, v21

    :goto_2
    or-int v19, v19, v20

    :cond_3
    and-int/lit16 v12, v8, 0x180

    const/16 v22, 0x80

    const/16 v23, 0x100

    if-nez v12, :cond_5

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    move/from16 v12, v23

    goto :goto_3

    :cond_4
    move/from16 v12, v22

    :goto_3
    or-int v19, v19, v12

    :cond_5
    and-int/lit16 v12, v8, 0xc00

    const/16 v24, 0x400

    const/16 v25, 0x800

    if-nez v12, :cond_7

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    move/from16 v12, v25

    goto :goto_4

    :cond_6
    move/from16 v12, v24

    :goto_4
    or-int v19, v19, v12

    :cond_7
    and-int/lit16 v12, v8, 0x6000

    const/16 v26, 0x2000

    if-nez v12, :cond_9

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_5

    :cond_8
    move/from16 v12, v26

    :goto_5
    or-int v19, v19, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int v12, p15, v12

    if-nez v12, :cond_b

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v12, 0x10000

    :goto_6
    or-int v19, v19, v12

    :cond_b
    const/high16 v12, 0x180000

    and-int v12, p15, v12

    if-nez v12, :cond_d

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v12, 0x80000

    :goto_7
    or-int v19, v19, v12

    :cond_d
    const/high16 v12, 0xc00000

    and-int v12, p15, v12

    if-nez v12, :cond_f

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x400000

    :goto_8
    or-int v19, v19, v12

    :cond_f
    const/high16 v12, 0x6000000

    and-int v12, p15, v12

    if-nez v12, :cond_11

    move/from16 v12, p7

    invoke-virtual {v14, v12}, Lp1/q;->h(Z)Z

    move-result v28

    if-eqz v28, :cond_10

    const/high16 v28, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v28, 0x2000000

    :goto_9
    or-int v19, v19, v28

    goto :goto_a

    :cond_11
    move/from16 v12, p7

    :goto_a
    const/high16 v28, 0x30000000

    and-int v28, p15, v28

    move-object/from16 v8, p8

    if-nez v28, :cond_13

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_12

    const/high16 v30, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v30, 0x10000000

    :goto_b
    or-int v19, v19, v30

    :cond_13
    and-int/lit8 v30, v9, 0x6

    if-nez v30, :cond_16

    and-int/lit8 v30, v9, 0x8

    if-nez v30, :cond_14

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    goto :goto_c

    :cond_14
    invoke-virtual {v14, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v30

    :goto_c
    if-eqz v30, :cond_15

    const/16 v30, 0x4

    goto :goto_d

    :cond_15
    const/16 v30, 0x2

    :goto_d
    or-int v30, v9, v30

    goto :goto_e

    :cond_16
    move/from16 v30, v9

    :goto_e
    and-int/lit8 v31, v9, 0x30

    move-object/from16 v8, p10

    if-nez v31, :cond_18

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_17

    const/16 v21, 0x20

    :cond_17
    or-int v30, v30, v21

    :cond_18
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_1a

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    move/from16 v22, v23

    :cond_19
    or-int v30, v30, v22

    :cond_1a
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_1c

    invoke-virtual {v14, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    move/from16 v24, v25

    :cond_1b
    or-int v30, v30, v24

    :cond_1c
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_1e

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1d

    const/16 v26, 0x4000

    :cond_1d
    or-int v30, v30, v26

    :cond_1e
    move/from16 v8, v30

    const v21, 0x12492493

    and-int v9, v19, v21

    move-object/from16 v21, v11

    const v11, 0x12492492

    if-ne v9, v11, :cond_20

    and-int/lit16 v9, v8, 0x2493

    const/16 v11, 0x2492

    if-eq v9, v11, :cond_1f

    goto :goto_f

    :cond_1f
    const/4 v9, 0x0

    goto :goto_10

    :cond_20
    :goto_f
    const/4 v9, 0x1

    :goto_10
    and-int/lit8 v11, v19, 0x1

    invoke-virtual {v14, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_50

    invoke-static {v14}, Lm1/l0;->e(Landroidx/compose/runtime/Composer;)F

    move-result v9

    and-int/lit8 v11, v8, 0x70

    const/16 v15, 0x20

    if-ne v11, v15, :cond_21

    const/4 v11, 0x1

    goto :goto_11

    :cond_21
    const/4 v11, 0x0

    :goto_11
    const/high16 v15, 0xe000000

    and-int v15, v19, v15

    move/from16 v20, v8

    const/high16 v8, 0x4000000

    if-ne v15, v8, :cond_22

    const/4 v8, 0x1

    goto :goto_12

    :cond_22
    const/4 v8, 0x0

    :goto_12
    or-int/2addr v8, v11

    const/high16 v11, 0x70000000

    and-int v11, v19, v11

    const/high16 v15, 0x20000000

    if-ne v11, v15, :cond_23

    const/4 v11, 0x1

    goto :goto_13

    :cond_23
    const/4 v11, 0x0

    :goto_13
    or-int/2addr v8, v11

    and-int/lit8 v15, v20, 0xe

    const/4 v11, 0x4

    if-eq v15, v11, :cond_25

    and-int/lit8 v18, v20, 0x8

    if-eqz v18, :cond_24

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_24

    goto :goto_14

    :cond_24
    const/16 v18, 0x0

    goto :goto_15

    :cond_25
    :goto_14
    const/16 v18, 0x1

    :goto_15
    or-int v8, v8, v18

    const v18, 0xe000

    and-int v11, v20, v18

    move/from16 v18, v8

    const/16 v8, 0x4000

    if-ne v11, v8, :cond_26

    const/4 v8, 0x1

    goto :goto_16

    :cond_26
    const/4 v8, 0x0

    :goto_16
    or-int v8, v18, v8

    invoke-virtual {v14, v9}, Lp1/q;->d(F)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_28

    if-ne v11, v3, :cond_27

    goto :goto_17

    :cond_27
    move-object/from16 p14, v3

    move-object v1, v14

    move-object/from16 v3, v16

    move-object/from16 v2, v21

    const/4 v7, 0x2

    move v14, v9

    move/from16 v16, v15

    move-object/from16 v15, v17

    goto :goto_18

    :cond_28
    :goto_17
    new-instance v8, Ll1/e3;

    move/from16 p14, v12

    move-object v12, v10

    move/from16 v10, p14

    move-object/from16 v11, p8

    move-object/from16 p14, v3

    move-object v1, v14

    move-object/from16 v3, v16

    move-object/from16 v2, v21

    const/4 v7, 0x2

    move v14, v9

    move/from16 v16, v15

    move-object/from16 v15, v17

    move-object/from16 v9, p10

    invoke-direct/range {v8 .. v14}, Ll1/e3;-><init>(Lkotlin/jvm/functions/Function1;ZLl1/k4;Lm1/k0;Ll0/k1;F)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v8

    :goto_18
    check-cast v11, Ll1/e3;

    sget-object v8, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v1, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/m;

    move-object v12, v8

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v18, v12

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 v21, v14

    iget-boolean v14, v1, Lp1/q;->S:Z

    if-eqz v14, :cond_29

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_29
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_19
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v1, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v1, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-nez v10, :cond_2a

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v10, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2b

    :cond_2a
    invoke-static {v7, v1, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v1, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v7, v20, 0x6

    and-int/lit8 v7, v7, 0xe

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v0, v1, v7}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_2f

    const v7, 0x7fe3b06d

    invoke-virtual {v1, v7}, Lp1/q;->e0(I)V

    const-string v7, "Leading"

    invoke-static {v2, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v7, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v3, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move-object/from16 v24, v2

    move-object v9, v3

    iget-wide v2, v1, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-eqz v0, :cond_2c

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2c
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v1, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lp1/q;->S:Z

    if-nez v0, :cond_2d

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    :cond_2d
    invoke-static {v2, v1, v2, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    invoke-static {v1, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0xc

    and-int/lit8 v0, v0, 0xe

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v4, v1, v2, v3}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_1b

    :cond_2f
    move-object/from16 v24, v2

    move-object v9, v3

    const/4 v3, 0x0

    const v0, 0x7fe7716d

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v3}, Lp1/q;->q(Z)V

    :goto_1b
    if-eqz v5, :cond_33

    const v0, 0x7fe8184b

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    const-string v0, "Trailing"

    move-object/from16 v2, v24

    invoke-static {v2, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_30

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_30
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v1, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_31

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_32

    :cond_31
    invoke-static {v3, v1, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_32
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0xf

    and-int/lit8 v0, v0, 0xe

    const/4 v3, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v5, v1, v3, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    :goto_1d
    move-object/from16 v0, v18

    goto :goto_1e

    :cond_33
    move v9, v3

    move-object/from16 v2, v24

    const v0, 0x7febe0cd

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1e
    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v3

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v0

    if-eqz v4, :cond_34

    sub-float v3, v3, v21

    int-to-float v7, v9

    cmpg-float v10, v3, v7

    if-gez v10, :cond_34

    move v3, v7

    :cond_34
    move/from16 v25, v3

    if-eqz v5, :cond_35

    sub-float v0, v0, v21

    int-to-float v3, v9

    cmpg-float v7, v0, v3

    if-gez v7, :cond_35

    move v0, v3

    :cond_35
    const/4 v3, 0x0

    const/4 v7, 0x3

    const/4 v10, 0x0

    if-eqz p5, :cond_39

    const v9, 0x7ff69eb8

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    const-string v9, "Prefix"

    invoke-static {v2, v9}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v18, v0

    sget v0, Lm1/l0;->d:F

    const/4 v4, 0x2

    invoke-static {v9, v0, v3, v4}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v10, v7}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v24

    sget v27, Lm1/l0;->c:F

    const/16 v28, 0x0

    const/16 v29, 0xa

    const/16 v26, 0x0

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v15, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v3, v1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-eqz v7, :cond_36

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1f

    :cond_36
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1f
    invoke-static {v1, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_37

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_38

    :cond_37
    invoke-static {v3, v1, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_38
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0x12

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v3, p5

    const/4 v4, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v3, v1, v4, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_20

    :cond_39
    move-object/from16 v3, p5

    move/from16 v18, v0

    const/4 v9, 0x0

    const v0, 0x7ffb9ecd

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_20
    if-eqz p6, :cond_3d

    const v0, 0x7ffc47ba

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    const-string v0, "Suffix"

    invoke-static {v2, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v4, Lm1/l0;->d:F

    const/4 v7, 0x0

    const/4 v9, 0x2

    invoke-static {v0, v4, v7, v9}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    invoke-static {v0, v10, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v26

    sget v27, Lm1/l0;->c:F

    const/16 v30, 0x0

    const/16 v31, 0xa

    const/16 v28, 0x0

    move/from16 v29, v18

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v15, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-eqz v4, :cond_3a

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_21

    :cond_3a
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_21
    invoke-static {v1, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_3b

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3c

    :cond_3b
    invoke-static {v9, v1, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3c
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0x15

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v7, p6

    const/4 v4, 0x1

    const/4 v10, 0x0

    invoke-static {v0, v7, v1, v4, v10}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_22

    :cond_3d
    move-object/from16 v7, p6

    const/4 v10, 0x0

    const v0, -0x7ffebfb3

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    :goto_22
    sget v0, Lm1/l0;->d:F

    const/4 v4, 0x0

    const/4 v9, 0x2

    invoke-static {v2, v0, v4, v9}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    const/4 v9, 0x0

    invoke-static {v0, v9, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v26

    if-nez v3, :cond_3e

    move/from16 v27, v25

    goto :goto_23

    :cond_3e
    int-to-float v0, v10

    move/from16 v27, v0

    :goto_23
    if-nez v7, :cond_3f

    move/from16 v29, v18

    goto :goto_24

    :cond_3f
    int-to-float v0, v10

    move/from16 v29, v0

    :goto_24
    const/16 v30, 0x0

    const/16 v31, 0xa

    const/16 v28, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz p1, :cond_40

    const v9, -0x7ff91a72

    invoke-virtual {v1, v9}, Lp1/q;->e0(I)V

    const-string v9, "Hint"

    invoke-static {v2, v9}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-interface {v9, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    shr-int/lit8 v10, v19, 0x3

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object/from16 v4, p1

    invoke-interface {v4, v9, v1, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_40
    move-object/from16 v4, p1

    const/4 v9, 0x0

    const v10, -0x7ff7b5d3

    invoke-virtual {v1, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_25
    const-string v9, "TextField"

    invoke-static {v2, v9}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-interface {v9, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x1

    invoke-static {v15, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v3, v1, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_41

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_26

    :cond_41
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_26
    invoke-static {v1, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_42

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_43

    :cond_42
    invoke-static {v3, v1, v3, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_43
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v4, 0x1

    move-object/from16 v3, p0

    invoke-static {v0, v3, v1, v4}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    if-eqz p2, :cond_4b

    const v0, -0x7fedc0ae

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    move/from16 v0, v16

    const/4 v4, 0x4

    if-eq v0, v4, :cond_45

    and-int/lit8 v0, v20, 0x8

    move-object/from16 v10, p9

    if-eqz v0, :cond_44

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_27

    :cond_44
    const/4 v0, 0x0

    goto :goto_28

    :cond_45
    move-object/from16 v10, p9

    :goto_27
    const/4 v0, 0x1

    :goto_28
    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_46

    move-object/from16 v0, p14

    if-ne v4, v0, :cond_47

    :cond_46
    new-instance v4, Ll1/u2;

    const/4 v0, 0x0

    invoke-direct {v4, v10, v0}, Ll1/u2;-><init>(Lm1/k0;I)V

    invoke-virtual {v1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_47
    check-cast v4, Lc93/a;

    new-instance v0, Lfg2/l;

    const/4 v9, 0x1

    invoke-direct {v0, v4, v9}, Lfg2/l;-><init>(Lc93/a;I)V

    invoke-static {v2, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    const/4 v9, 0x0

    invoke-static {v0, v9, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v9, "Label"

    invoke-static {v0, v9}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v15, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-eqz v3, :cond_48

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_29

    :cond_48
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_29
    invoke-static {v1, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_49

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4a

    :cond_49
    invoke-static {v9, v1, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4a
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v19, 0x9

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v3, p2

    const/4 v4, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v3, v1, v4, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_2a

    :cond_4b
    move-object/from16 v3, p2

    const/4 v9, 0x0

    const v0, -0x7fe7b9d3

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_2a
    if-eqz p12, :cond_4f

    const v0, -0x7fe6fc50

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    const-string v0, "Supporting"

    invoke-static {v2, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v2, Lm1/l0;->f:F

    const/4 v4, 0x0

    const/4 v9, 0x2

    invoke-static {v0, v2, v4, v9}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    const/4 v9, 0x0

    invoke-static {v0, v9, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Ll1/h4;->d()Ll0/l1;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v9, 0x0

    invoke-static {v15, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_4c

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2b

    :cond_4c
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2b
    invoke-static {v1, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_4d

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    :cond_4d
    invoke-static {v4, v1, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4e
    invoke-static {v1, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v20, 0x9

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v15, p12

    const/4 v4, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v15, v1, v4, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_2c

    :cond_4f
    move-object/from16 v15, p12

    const/4 v4, 0x1

    const/4 v9, 0x0

    const v0, -0x7fe1de33

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v9}, Lp1/q;->q(Z)V

    :goto_2c
    invoke-virtual {v1, v4}, Lp1/q;->q(Z)V

    goto :goto_2d

    :cond_50
    move-object/from16 v15, p12

    move-object v1, v14

    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2d
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_51

    move-object v1, v0

    new-instance v0, Ll1/v2;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v16, p16

    move-object/from16 v32, v1

    move-object v14, v13

    move-object v13, v15

    move-object/from16 v1, p0

    move/from16 v15, p15

    invoke-direct/range {v0 .. v16}, Ll1/v2;-><init>(Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lkotlin/jvm/functions/Function1;Lx1/b;Lc93/m;Ll0/k1;II)V

    move-object/from16 v1, v32

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_51
    return-void
.end method
