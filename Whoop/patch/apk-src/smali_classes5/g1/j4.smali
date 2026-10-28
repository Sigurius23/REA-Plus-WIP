.class public abstract Lg1/j4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lg1/j4;->a:F

    const/16 v0, 0x8

    invoke-static {v0}, Lv63/c;->h(I)J

    move-result-wide v0

    sput-wide v0, Lg1/j4;->b:J

    return-void
.end method

.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V
    .locals 43

    move-object/from16 v3, p2

    move-object/from16 v0, p17

    move/from16 v1, p19

    move/from16 v2, p20

    move/from16 v4, p21

    move-object/from16 v5, p18

    check-cast v5, Lp1/q;

    const v6, 0x2fbe4a64

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_1

    move-object/from16 v6, p0

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p0

    move v9, v1

    :goto_1
    and-int/lit8 v10, v1, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-virtual {v5, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v9, v11

    goto :goto_3

    :cond_3
    move-object/from16 v10, p1

    :goto_3
    and-int/lit16 v11, v1, 0x180

    if-nez v11, :cond_5

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_4

    :cond_4
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v9, v11

    :cond_5
    and-int/lit8 v11, v4, 0x8

    if-eqz v11, :cond_7

    or-int/lit16 v9, v9, 0xc00

    :cond_6
    move/from16 v14, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v14, v1, 0xc00

    if-nez v14, :cond_6

    move/from16 v14, p3

    invoke-virtual {v5, v14}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x800

    goto :goto_5

    :cond_8
    const/16 v15, 0x400

    :goto_5
    or-int/2addr v9, v15

    :goto_6
    and-int/lit8 v15, v4, 0x10

    const/16 v16, 0x2000

    const/16 v17, 0x4000

    if-eqz v15, :cond_a

    or-int/lit16 v9, v9, 0x6000

    :cond_9
    move/from16 v7, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v7, v1, 0x6000

    if-nez v7, :cond_9

    move/from16 v7, p4

    invoke-virtual {v5, v7}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_7

    :cond_b
    move/from16 v18, v16

    :goto_7
    or-int v9, v9, v18

    :goto_8
    const/high16 v18, 0x30000

    and-int v19, v1, v18

    const/high16 v20, 0x10000

    if-nez v19, :cond_d

    and-int/lit8 v19, v4, 0x20

    move-object/from16 v8, p5

    if-nez v19, :cond_c

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x20000

    goto :goto_9

    :cond_c
    move/from16 v21, v20

    :goto_9
    or-int v9, v9, v21

    goto :goto_a

    :cond_d
    move-object/from16 v8, p5

    :goto_a
    and-int/lit8 v21, v4, 0x40

    const/high16 v22, 0x180000

    if-eqz v21, :cond_e

    or-int v9, v9, v22

    move-object/from16 v12, p6

    goto :goto_c

    :cond_e
    and-int v22, v1, v22

    move-object/from16 v12, p6

    if-nez v22, :cond_10

    invoke-virtual {v5, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_f

    const/high16 v23, 0x100000

    goto :goto_b

    :cond_f
    const/high16 v23, 0x80000

    :goto_b
    or-int v9, v9, v23

    :cond_10
    :goto_c
    and-int/lit16 v13, v4, 0x80

    const/high16 v24, 0xc00000

    if-eqz v13, :cond_11

    or-int v9, v9, v24

    move-object/from16 v1, p7

    goto :goto_e

    :cond_11
    and-int v24, v1, v24

    move-object/from16 v1, p7

    if-nez v24, :cond_13

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_12

    const/high16 v24, 0x800000

    goto :goto_d

    :cond_12
    const/high16 v24, 0x400000

    :goto_d
    or-int v9, v9, v24

    :cond_13
    :goto_e
    const/high16 v24, 0x6000000

    or-int v25, v9, v24

    and-int/lit16 v1, v4, 0x200

    const/high16 v26, 0x10000000

    const/high16 v27, 0x20000000

    const/high16 v28, 0x30000000

    if-eqz v1, :cond_15

    const/high16 v25, 0x36000000

    or-int v25, v9, v25

    :cond_14
    move-object/from16 v9, p8

    goto :goto_10

    :cond_15
    and-int v9, p19, v28

    if-nez v9, :cond_14

    move-object/from16 v9, p8

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    move/from16 v29, v27

    goto :goto_f

    :cond_16
    move/from16 v29, v26

    :goto_f
    or-int v25, v25, v29

    :goto_10
    move/from16 v29, v1

    and-int/lit16 v1, v4, 0x400

    if-eqz v1, :cond_17

    or-int/lit8 v19, v2, 0x6

    move/from16 v30, v1

    :goto_11
    move/from16 v1, v19

    goto :goto_13

    :cond_17
    and-int/lit8 v30, v2, 0x6

    if-nez v30, :cond_19

    move/from16 v30, v1

    move/from16 v1, p9

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v31

    if-eqz v31, :cond_18

    const/16 v19, 0x4

    goto :goto_12

    :cond_18
    const/16 v19, 0x2

    :goto_12
    or-int v19, v2, v19

    goto :goto_11

    :cond_19
    move/from16 v30, v1

    move/from16 v1, p9

    move v1, v2

    :goto_13
    or-int/lit8 v19, v1, 0x30

    and-int/lit16 v6, v4, 0x1000

    if-eqz v6, :cond_1a

    or-int/lit16 v1, v1, 0x1b0

    goto :goto_16

    :cond_1a
    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_1c

    move-object/from16 v1, p11

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_1b

    const/16 v22, 0x100

    goto :goto_14

    :cond_1b
    const/16 v22, 0x80

    :goto_14
    or-int v19, v19, v22

    :goto_15
    move/from16 v1, v19

    goto :goto_16

    :cond_1c
    move-object/from16 v1, p11

    goto :goto_15

    :goto_16
    move/from16 v19, v6

    or-int/lit16 v6, v1, 0xc00

    move/from16 v22, v6

    and-int/lit16 v6, v4, 0x4000

    if-eqz v6, :cond_1d

    or-int/lit16 v1, v1, 0x6c00

    move/from16 v16, v1

    move/from16 v1, p13

    goto :goto_17

    :cond_1d
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_1f

    move/from16 v1, p13

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_1e

    move/from16 v16, v17

    :cond_1e
    or-int v16, v22, v16

    goto :goto_17

    :cond_1f
    move/from16 v1, p13

    move/from16 v16, v22

    :goto_17
    and-int v17, v2, v18

    if-nez v17, :cond_20

    or-int v16, v16, v20

    :cond_20
    const/high16 v17, 0xd80000

    or-int v16, v16, v17

    and-int v17, v2, v24

    const/high16 v20, 0x40000

    if-nez v17, :cond_22

    and-int v17, v4, v20

    move-object/from16 v1, p16

    if-nez v17, :cond_21

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_21

    const/high16 v17, 0x4000000

    goto :goto_18

    :cond_21
    const/high16 v17, 0x2000000

    :goto_18
    or-int v16, v16, v17

    goto :goto_19

    :cond_22
    move-object/from16 v1, p16

    :goto_19
    and-int v17, v2, v28

    if-nez v17, :cond_24

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_23

    move/from16 v26, v27

    :cond_23
    or-int v16, v16, v26

    :cond_24
    const v17, 0x12492493

    and-int v1, v25, v17

    const v2, 0x12492492

    if-ne v1, v2, :cond_26

    and-int v1, v16, v17

    if-eq v1, v2, :cond_25

    goto :goto_1a

    :cond_25
    const/4 v1, 0x0

    goto :goto_1b

    :cond_26
    :goto_1a
    const/4 v1, 0x1

    :goto_1b
    and-int/lit8 v2, v25, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3a

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v1, p19, 0x1

    const v2, -0xe070001

    const v17, -0x70001

    if-eqz v1, :cond_2a

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_27

    goto :goto_1c

    :cond_27
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v1, p21, 0x20

    if-eqz v1, :cond_28

    and-int v25, v25, v17

    :cond_28
    and-int v1, v16, v17

    and-int v6, p21, v20

    if-eqz v6, :cond_29

    and-int v1, v16, v2

    :cond_29
    move-object/from16 v11, p7

    move/from16 v6, p9

    move-object/from16 v16, p10

    move-object/from16 v13, p11

    move-object/from16 v15, p12

    move/from16 v17, p15

    move-object/from16 v19, p16

    move/from16 v20, v1

    move-object v1, v8

    move-object v2, v9

    move v8, v14

    move/from16 v14, p14

    move v9, v7

    move/from16 v7, p13

    goto/16 :goto_25

    :cond_2a
    :goto_1c
    if-eqz v11, :cond_2b

    const/4 v14, 0x1

    :cond_2b
    if-eqz v15, :cond_2c

    const/4 v7, 0x0

    :cond_2c
    and-int/lit8 v1, p21, 0x20

    if-eqz v1, :cond_2d

    sget-object v1, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/v0;

    and-int v25, v25, v17

    goto :goto_1d

    :cond_2d
    move-object v1, v8

    :goto_1d
    const/4 v8, 0x0

    if-eqz v21, :cond_2e

    move-object v12, v8

    :cond_2e
    if-eqz v13, :cond_2f

    move-object v11, v8

    goto :goto_1e

    :cond_2f
    move-object/from16 v11, p7

    :goto_1e
    if-eqz v29, :cond_30

    goto :goto_1f

    :cond_30
    move-object v8, v9

    :goto_1f
    if-eqz v30, :cond_31

    const/4 v9, 0x0

    goto :goto_20

    :cond_31
    move/from16 v9, p9

    :goto_20
    if-eqz v19, :cond_32

    sget-object v13, Lu0/r0;->e:Lu0/r0;

    goto :goto_21

    :cond_32
    move-object/from16 v13, p11

    :goto_21
    sget-object v15, Lu0/q0;->g:Lu0/q0;

    if-eqz v6, :cond_33

    const/4 v6, 0x0

    goto :goto_22

    :cond_33
    move/from16 v6, p13

    :goto_22
    if-eqz v6, :cond_34

    const/16 v19, 0x1

    goto :goto_23

    :cond_34
    const v19, 0x7fffffff

    :goto_23
    and-int v17, v16, v17

    and-int v20, p21, v20

    if-eqz v20, :cond_35

    sget-object v17, Lg1/i8;->a:Lg1/i8;

    invoke-static {v5}, Lg1/i8;->d(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v17

    and-int v2, v16, v2

    goto :goto_24

    :cond_35
    move/from16 v2, v17

    move-object/from16 v17, p16

    :goto_24
    sget-object v16, Lq3/f0;->w:Lg40/h2;

    move/from16 v20, v7

    move v7, v6

    move v6, v9

    move/from16 v9, v20

    move/from16 v20, v2

    move-object v2, v8

    move v8, v14

    move/from16 v14, v19

    move-object/from16 v19, v17

    const/16 v17, 0x1

    :goto_25
    invoke-virtual {v5}, Lp1/q;->r()V

    const v4, -0xe9cfce9

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p12, v2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_36

    invoke-static {v5}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_36
    check-cast v4, Lj0/i;

    move-object/from16 p8, v4

    const/4 v4, 0x0

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    const v4, 0x3955da32

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ll3/v0;->c()J

    move-result-wide v22

    const-wide/16 v26, 0x10

    cmp-long v4, v22, v26

    if-eqz v4, :cond_37

    move/from16 p6, v7

    move/from16 p5, v8

    move-wide/from16 v27, v22

    :goto_26
    const/4 v4, 0x0

    goto :goto_27

    :cond_37
    invoke-virtual {v0, v8, v5}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v4

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    move/from16 p6, v7

    move/from16 p5, v8

    iget-wide v7, v4, Li2/x;->a:J

    move-wide/from16 v27, v7

    goto :goto_26

    :goto_27
    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    new-instance v26, Ll3/v0;

    const-wide/16 v39, 0x0

    const v41, 0xfffffe

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v26 .. v41}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v4, v26

    invoke-virtual {v1, v4}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v4

    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v5, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v12, :cond_39

    move-object/from16 p15, v1

    const v1, -0xe95cc0b

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_38

    new-instance v1, Lfq2/c;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lfq2/c;-><init>(I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-static {v8, v2, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    sget-wide v1, Lg1/j4;->b:J

    invoke-interface {v7, v1, v2}, Ly3/c;->l(J)F

    move-result v28

    const/16 v30, 0x0

    const/16 v31, 0xd

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_28

    :cond_39
    move-object/from16 p15, v1

    const/4 v1, 0x0

    const v2, -0xe8feaba

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_28
    invoke-interface {v3, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v5, v2}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v6, v2}, Lg1/p8;->c(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Lg1/i8;->c:F

    sget v7, Lg1/i8;->b:F

    invoke-static {v1, v2, v7}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v1, Li2/c1;

    invoke-virtual {v0, v6, v5}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    invoke-direct {v1, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v2, Lg1/h4;

    move-object/from16 p4, p0

    move-object/from16 p14, v0

    move-object/from16 p3, v2

    move/from16 p9, v6

    move-object/from16 p11, v11

    move-object/from16 p10, v12

    move-object/from16 p7, v16

    move-object/from16 p13, v19

    invoke-direct/range {p3 .. p14}, Lg1/h4;-><init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;ZLc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V

    move-object/from16 v6, p3

    move/from16 v8, p5

    move/from16 v26, p9

    move-object/from16 v0, p10

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    move-object/from16 v27, p13

    move-object v11, v13

    move/from16 p3, v18

    move/from16 v13, p6

    move-object/from16 v18, p8

    const v12, -0x233b8479

    invoke-static {v12, v5, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v12, 0xfc7e

    and-int v12, v25, v12

    shl-int/lit8 v19, v20, 0xc

    const/high16 v21, 0x380000

    and-int v21, v19, v21

    or-int v12, v12, v21

    const/high16 v21, 0x1c00000

    and-int v21, v19, v21

    or-int v12, v12, v21

    const/high16 v21, 0xe000000

    and-int v19, v19, v21

    or-int v22, v12, v19

    shr-int/lit8 v12, v20, 0x12

    and-int/lit8 v12, v12, 0xe

    or-int v12, v12, p3

    and-int/lit8 v19, v20, 0x70

    or-int v23, v12, v19

    const/16 v24, 0x1000

    move-object v12, v15

    move/from16 v15, v17

    const/16 v17, 0x0

    move-object/from16 v19, v1

    move-object/from16 v21, v5

    move-object/from16 v20, v6

    move-object v6, v10

    move-object/from16 v5, p0

    move-object v10, v4

    invoke-static/range {v5 .. v24}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object v4, v12

    move-object v12, v11

    move-object/from16 v11, v16

    move/from16 v16, v15

    move v15, v14

    move v14, v13

    move-object v13, v4

    move-object/from16 v6, p15

    move-object v7, v0

    move v4, v8

    move v5, v9

    move/from16 v10, v26

    move-object/from16 v17, v27

    move-object v8, v2

    move-object v9, v3

    goto :goto_29

    :cond_3a
    move-object/from16 v21, v5

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v15, p14

    move/from16 v16, p15

    move-object/from16 v17, p16

    move v5, v7

    move-object v6, v8

    move-object v7, v12

    move v4, v14

    move-object/from16 v8, p7

    move-object/from16 v12, p11

    move/from16 v14, p13

    :goto_29
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3b

    move-object v1, v0

    new-instance v0, Lg1/c4;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v18, p17

    move/from16 v19, p19

    move/from16 v20, p20

    move/from16 v21, p21

    move-object/from16 v42, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, Lg1/c4;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;III)V

    move-object/from16 v1, v42

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_3b
    return-void
.end method

.method public static final b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILi2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;I)V
    .locals 43

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v0, p13

    check-cast v0, Lp1/q;

    const v1, -0x15cb6349

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p14, v2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v2, v6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v2, v6

    or-int/lit16 v2, v2, 0x6c00

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/high16 v6, 0x20000

    goto :goto_3

    :cond_3
    const/high16 v6, 0x10000

    :goto_3
    or-int/2addr v2, v6

    const/high16 v24, 0x180000

    or-int v2, v2, v24

    move-object/from16 v6, p5

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/high16 v7, 0x800000

    goto :goto_4

    :cond_4
    const/high16 v7, 0x400000

    :goto_4
    or-int/2addr v2, v7

    const/high16 v25, 0x36000000

    or-int v2, v2, v25

    move-object/from16 v7, p8

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x800

    goto :goto_5

    :cond_5
    const/16 v8, 0x400

    :goto_5
    const v9, 0x12db61b6

    or-int v26, v8, v9

    const v8, 0x12492493

    and-int v9, v2, v8

    const v10, 0x12492492

    const/4 v11, 0x0

    const/16 v27, 0x1

    if-ne v9, v10, :cond_7

    and-int v8, v26, v8

    if-eq v8, v10, :cond_6

    goto :goto_6

    :cond_6
    move v8, v11

    goto :goto_7

    :cond_7
    :goto_6
    move/from16 v8, v27

    :goto_7
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v8, p14, 0x1

    const v28, -0x7e000001

    if-eqz v8, :cond_9

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int v8, v26, v28

    move-object/from16 v17, p6

    move-object/from16 v12, p11

    move-object/from16 v6, p12

    move-object v14, v0

    move v15, v8

    move v0, v11

    move/from16 v8, p3

    goto :goto_9

    :cond_9
    :goto_8
    sget-object v8, Lg1/i8;->a:Lg1/i8;

    invoke-static {v0}, Lg1/i8;->d(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v29

    const-wide/16 v20, 0x0

    const v23, 0x1fffff

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move v12, v11

    const-wide/16 v10, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const-wide/16 v18, 0x0

    move/from16 v42, v22

    move-object/from16 v22, v0

    move/from16 v0, v42

    invoke-static/range {v6 .. v23}, Lg1/i8;->g(JJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v6

    move-object/from16 v14, v22

    and-int v8, v26, v28

    sget-object v7, Lq3/f0;->w:Lg40/h2;

    move-object/from16 v17, v7

    move v15, v8

    move/from16 v8, v27

    move-object/from16 v12, v29

    :goto_9
    invoke-virtual {v14}, Lp1/q;->r()V

    const v7, -0x3f66ad5c

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_a

    invoke-static {v14}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v7

    :cond_a
    move-object/from16 v19, v7

    check-cast v19, Lj0/i;

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    const v7, 0x2f80e505

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ll3/v0;->c()J

    move-result-wide v9

    const-wide/16 v20, 0x10

    cmp-long v7, v9, v20

    if-eqz v7, :cond_b

    :goto_a
    move-wide/from16 v27, v9

    goto :goto_b

    :cond_b
    move-object v7, v6

    check-cast v7, Lg1/y1;

    invoke-virtual {v7, v8, v14}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v9, v7, Li2/x;->a:J

    goto :goto_a

    :goto_b
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    new-instance v26, Ll3/v0;

    const-wide/16 v39, 0x0

    const v41, 0xfffffe

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-wide/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v26 .. v41}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v7, v26

    invoke-virtual {v5, v7}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v16

    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v14, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    const v7, -0x3f599b2d

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-interface {v3, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v9, 0x3

    invoke-static {v14, v9}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v0, v9}, Lg1/p8;->c(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v9, Lg1/i8;->c:F

    sget v10, Lg1/i8;->b:F

    invoke-static {v7, v9, v10}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v18

    new-instance v7, Li2/c1;

    move-object v13, v6

    check-cast v13, Lg1/y1;

    invoke-virtual {v13, v0, v14}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v9, v0, Li2/x;->a:J

    invoke-direct {v7, v9, v10}, Li2/c1;-><init>(J)V

    new-instance v6, Lg1/g4;

    move-object/from16 v11, p5

    move-object/from16 v20, v7

    move-object/from16 v9, v17

    move-object/from16 v10, v19

    move-object v7, v1

    invoke-direct/range {v6 .. v13}, Lg1/g4;-><init>(Lq3/y;ZLq3/g0;Lj0/i;Lc93/m;Li2/a1;Lg1/y1;)V

    move-object/from16 v29, v12

    move-object v0, v13

    const v1, -0x702b0526

    invoke-static {v1, v14, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v21

    const v1, 0xfc7e

    and-int/2addr v1, v2

    shl-int/lit8 v2, v15, 0xc

    or-int v1, v1, v24

    const/high16 v6, 0x1c00000

    and-int/2addr v2, v6

    or-int/2addr v1, v2

    or-int v23, v1, v25

    const v24, 0x30036

    const/16 v25, 0x1000

    const/4 v10, 0x0

    move-object/from16 v22, v14

    const/4 v14, 0x0

    move v9, v8

    move-object/from16 v8, v18

    const/16 v18, 0x0

    move-object/from16 v6, p0

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move/from16 v15, p9

    move-object v7, v4

    move-object/from16 v11, v16

    move/from16 v16, p10

    invoke-static/range {v6 .. v25}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move v8, v9

    move-object v13, v0

    move v4, v8

    move-object/from16 v7, v17

    move-object/from16 v12, v29

    goto :goto_c

    :cond_c
    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    :goto_c
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_d

    new-instance v0, Lg1/b4;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lg1/b4;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILi2/a1;Lg1/e8;I)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;ZFLkotlin/jvm/functions/Function1;Lx1/b;Ll0/k1;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p12

    sget-object v0, Lb2/e;->E:Lb2/m;

    move-object/from16 v13, p11

    check-cast v13, Lp1/q;

    const v14, 0x22a3420

    invoke-virtual {v13, v14}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v14, v12, 0x6

    if-nez v14, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    const/4 v14, 0x4

    goto :goto_0

    :cond_0
    const/4 v14, 0x2

    :goto_0
    or-int/2addr v14, v12

    goto :goto_1

    :cond_1
    move v14, v12

    :goto_1
    and-int/lit8 v16, v12, 0x30

    if-nez v16, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    const/16 v16, 0x20

    goto :goto_2

    :cond_2
    const/16 v16, 0x10

    :goto_2
    or-int v14, v14, v16

    :cond_3
    and-int/lit16 v15, v12, 0x180

    if-nez v15, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x100

    goto :goto_3

    :cond_4
    const/16 v15, 0x80

    :goto_3
    or-int/2addr v14, v15

    :cond_5
    and-int/lit16 v15, v12, 0xc00

    if-nez v15, :cond_7

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const/16 v15, 0x800

    goto :goto_4

    :cond_6
    const/16 v15, 0x400

    :goto_4
    or-int/2addr v14, v15

    :cond_7
    and-int/lit16 v15, v12, 0x6000

    if-nez v15, :cond_9

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x4000

    goto :goto_5

    :cond_8
    const/16 v15, 0x2000

    :goto_5
    or-int/2addr v14, v15

    :cond_9
    const/high16 v15, 0x30000

    and-int/2addr v15, v12

    if-nez v15, :cond_b

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    const/high16 v15, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v15, 0x10000

    :goto_6
    or-int/2addr v14, v15

    :cond_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v12

    if-nez v15, :cond_d

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_c

    const/high16 v15, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v15, 0x80000

    :goto_7
    or-int/2addr v14, v15

    :cond_d
    const/high16 v15, 0xc00000

    and-int v15, p12, v15

    if-nez v15, :cond_f

    invoke-virtual {v13, v8}, Lp1/q;->d(F)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v15, 0x400000

    :goto_8
    or-int/2addr v14, v15

    :cond_f
    const/high16 v15, 0x6000000

    and-int v15, p12, v15

    if-nez v15, :cond_11

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v15, 0x2000000

    :goto_9
    or-int/2addr v14, v15

    :cond_11
    const/high16 v15, 0x30000000

    and-int v15, p12, v15

    if-nez v15, :cond_13

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v15, 0x10000000

    :goto_a
    or-int/2addr v14, v15

    :cond_13
    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    const/4 v15, 0x4

    goto :goto_b

    :cond_14
    const/4 v15, 0x2

    :goto_b
    const v17, 0x12492493

    and-int v12, v14, v17

    move/from16 v17, v14

    const v14, 0x12492492

    move/from16 v18, v15

    if-ne v12, v14, :cond_16

    and-int/lit8 v12, v18, 0x3

    const/4 v14, 0x2

    if-eq v12, v14, :cond_15

    goto :goto_c

    :cond_15
    const/4 v12, 0x0

    goto :goto_d

    :cond_16
    :goto_c
    const/4 v12, 0x1

    :goto_d
    and-int/lit8 v14, v17, 0x1

    invoke-virtual {v13, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_32

    const/high16 v12, 0xe000000

    and-int v12, v17, v12

    const/high16 v14, 0x4000000

    if-ne v12, v14, :cond_17

    const/4 v12, 0x1

    goto :goto_e

    :cond_17
    const/4 v12, 0x0

    :goto_e
    const/high16 v14, 0x380000

    and-int v14, v17, v14

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_18

    const/4 v14, 0x1

    goto :goto_f

    :cond_18
    const/4 v14, 0x0

    :goto_f
    or-int/2addr v12, v14

    const/high16 v14, 0x1c00000

    and-int v14, v17, v14

    const/high16 v15, 0x800000

    if-ne v14, v15, :cond_19

    const/4 v14, 0x1

    goto :goto_10

    :cond_19
    const/4 v14, 0x0

    :goto_10
    or-int/2addr v12, v14

    and-int/lit8 v14, v18, 0xe

    const/4 v15, 0x4

    if-ne v14, v15, :cond_1a

    const/4 v14, 0x1

    goto :goto_11

    :cond_1a
    const/4 v14, 0x0

    :goto_11
    or-int/2addr v12, v14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_1b

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v14, v12, :cond_1c

    :cond_1b
    new-instance v14, Lg1/l4;

    invoke-direct {v14, v9, v7, v8, v11}, Lg1/l4;-><init>(Lkotlin/jvm/functions/Function1;ZFLl0/k1;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v14, Lg1/l4;

    sget-object v12, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v13, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/m;

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_1d

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_12
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_1e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    :cond_1e
    invoke-static {v7, v13, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v13, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v17, 0x1b

    and-int/lit8 v4, v4, 0xe

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v10, v13, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_23

    const v7, 0x4fb0ac4b

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    const-string v7, "Leading"

    invoke-static {v4, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, Lg1/h3;->a:Lp1/u2;

    sget-object v15, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v7, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v15, 0x0

    invoke-static {v0, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move-object v15, v12

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v16, v15

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_20

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_20
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v13, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_21

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_22

    :cond_21
    invoke-static {v11, v13, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v13, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v7, v17, 0xc

    and-int/lit8 v7, v7, 0xe

    const/4 v10, 0x1

    const/4 v15, 0x0

    invoke-static {v7, v5, v13, v10, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_14

    :cond_23
    move-object/from16 v16, v12

    const/4 v15, 0x0

    const v7, 0x4fb46d4b

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    :goto_14
    if-eqz v6, :cond_27

    const v7, 0x4fb51429

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    const-string v7, "Trailing"

    invoke-static {v4, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Lg1/h3;->a:Lp1/u2;

    sget-object v10, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v7, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v0, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_24

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_24
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v13, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_25

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    :cond_25
    invoke-static {v10, v13, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v13, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0xf

    and-int/lit8 v0, v0, 0xe

    const/4 v10, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v6, v13, v10, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    :goto_16
    move-object/from16 v11, p10

    move-object/from16 v12, v16

    goto :goto_17

    :cond_27
    const v0, 0x4fb8dcab    # 6.202939E9f

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_16

    :goto_17
    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v0

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v7

    if-eqz v5, :cond_28

    sget v10, Lg1/p8;->b:F

    sub-float/2addr v0, v10

    int-to-float v10, v15

    cmpg-float v12, v0, v10

    if-gez v12, :cond_28

    move v0, v10

    :cond_28
    move/from16 v20, v0

    if-eqz v6, :cond_29

    sget v0, Lg1/p8;->b:F

    sub-float/2addr v7, v0

    int-to-float v0, v15

    cmpg-float v10, v7, v0

    if-gez v10, :cond_29

    move v7, v0

    :cond_29
    move/from16 v22, v7

    const/16 v23, 0x0

    const/16 v24, 0xa

    const/16 v21, 0x0

    move-object/from16 v19, v4

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v3, :cond_2a

    const v7, 0x4fc5dcb0

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    const-string v7, "Hint"

    invoke-static {v4, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shr-int/lit8 v10, v17, 0x3

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v7, v13, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_2a
    const/4 v15, 0x0

    const v7, 0x4fc7324b

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    :goto_18
    const-string v7, "TextField"

    invoke-static {v4, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v10, 0x1

    invoke-static {v7, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_2b

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_2b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v13, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_2c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2d

    :cond_2c
    invoke-static {v5, v13, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2d
    invoke-static {v13, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x3

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v5, p1

    const/4 v10, 0x1

    invoke-static {v0, v5, v13, v10}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    if-eqz p3, :cond_31

    const v0, 0x4fcab7f5    # 6.802107E9f

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    const-string v0, "Label"

    invoke-static {v4, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v15, 0x0

    invoke-static {v7, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_2e

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v13, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_2f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    :cond_2f
    invoke-static {v6, v13, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_30
    invoke-static {v13, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v17, 0x9

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v4, p3

    const/4 v10, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v4, v13, v10, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_1b

    :cond_31
    move-object/from16 v4, p3

    const/4 v10, 0x1

    const/4 v15, 0x0

    const v0, 0x4fcbfacb

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_32
    move-object v5, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_33

    new-instance v0, Lg1/e4;

    move-object/from16 v1, p0

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v12, p12

    move-object v2, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v12}, Lg1/e4;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;ZFLkotlin/jvm/functions/Function1;Lx1/b;Ll0/k1;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method public static final d(IIIIIFJFLl0/k1;)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p5, p3, v0}, Le93/b;->P(FII)I

    move-result v0

    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p9}, Ll0/k1;->d()F

    move-result p4

    mul-float/2addr p4, p8

    int-to-float p3, p3

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p3, v0

    invoke-static {p4, p3}, Ljava/lang/Math;->max(FF)F

    move-result p3

    invoke-static {p4, p3, p5}, Le93/b;->O(FFF)F

    move-result p3

    invoke-interface {p9}, Ll0/k1;->a()F

    move-result p4

    mul-float/2addr p4, p8

    int-to-float p2, p2

    add-float/2addr p3, p2

    add-float/2addr p3, p4

    invoke-static {p3}, Le93/b;->X(F)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p6, p7}, Ly3/b;->f(IJ)I

    move-result p0

    return p0
.end method

.method public static final e(IIIIIFJFLl0/k1;)I
    .locals 1

    const/4 v0, 0x0

    invoke-static {p5, p3, v0}, Le93/b;->P(FII)I

    move-result v0

    invoke-static {v0, p4}, Ljava/lang/Math;->max(II)I

    move-result p4

    invoke-static {p2, p4}, Ljava/lang/Math;->max(II)I

    move-result p2

    add-int/2addr p2, p0

    add-int/2addr p2, p1

    sget-object p0, Ly3/m;->w:Ly3/m;

    invoke-interface {p9, p0}, Ll0/k1;->b(Ly3/m;)F

    move-result p1

    invoke-interface {p9, p0}, Ll0/k1;->c(Ly3/m;)F

    move-result p0

    add-float/2addr p0, p1

    mul-float/2addr p0, p8

    int-to-float p1, p3

    add-float/2addr p1, p0

    mul-float/2addr p1, p5

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p0

    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p6, p7}, Ly3/b;->g(IJ)I

    move-result p0

    return p0
.end method
