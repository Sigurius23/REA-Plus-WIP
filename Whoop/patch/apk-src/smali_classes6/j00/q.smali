.class public abstract Lj00/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x10

    int-to-float v4, v0

    const/4 v5, 0x0

    const/16 v6, 0xb

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lj00/q;->a:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, -0x569ee4a0

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_2

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->X()V

    goto/16 :goto_3

    :cond_2
    :goto_1
    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v4, 0x30

    invoke-static {v3, v2, v14, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v3, v14, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0xa

    int-to-float v2, v2

    const/16 v3, 0xc

    int-to-float v3, v3

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v2, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x14

    int-to-float v9, v6

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const v2, 0x7f08084a

    const/4 v9, 0x0

    invoke-static {v2, v14, v9}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v9

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->c()J

    move-result-wide v12

    const/16 v15, 0x1b0

    const/16 v16, 0x0

    const/4 v10, 0x0

    invoke-static/range {v9 .. v16}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static {v5, v9, v3, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->c()J

    move-result-wide v11

    sget-object v20, Lp3/r;->F:Lp3/r;

    const/16 v2, 0xe

    invoke-static {v2}, Lv63/c;->h(I)J

    move-result-wide v18

    invoke-static {v6}, Lv63/c;->h(I)J

    move-result-wide v28

    new-instance v15, Ll3/v0;

    const/16 v27, 0x0

    const v30, 0xfdffd9

    const-wide/16 v16, 0x0

    const/16 v21, 0x0

    sget-object v22, Lp3/i;->w:Lp3/f;

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v15 .. v30}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    and-int/2addr v1, v2

    or-int/lit8 v6, v1, 0x30

    move-object v1, v3

    move-wide v2, v11

    move-object v5, v14

    move-object v4, v15

    invoke-static/range {v0 .. v6}, Lx30/y0;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLl3/v0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lj00/m;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v7, v8, v3}, Lj00/m;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final b(Lg40/h1;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZLjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lg2/s;Lg2/s;Lg2/s;Landroidx/compose/runtime/Composer;III)V
    .locals 31

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v13, p3

    move-object/from16 v5, p4

    move-object/from16 v12, p11

    move/from16 v15, p17

    move/from16 v0, p18

    move/from16 v1, p19

    const-string v4, "emailController"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "phoneNumberController"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nameController"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "signUpState"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onShowingAllFields"

    invoke-static {v12, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p16

    check-cast v4, Lp1/q;

    const v6, -0x7609dcd4

    invoke-virtual {v4, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v15, 0x6

    if-nez v6, :cond_1

    move-object/from16 v6, p0

    invoke-virtual {v4, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    const/4 v9, 0x4

    goto :goto_0

    :cond_0
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v15

    goto :goto_1

    :cond_1
    move-object/from16 v6, p0

    move v9, v15

    :goto_1
    and-int/lit8 v10, v15, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_3
    and-int/lit16 v10, v15, 0x180

    const/16 v16, 0x80

    const/16 v17, 0x100

    if-nez v10, :cond_6

    and-int/lit16 v10, v15, 0x200

    if-nez v10, :cond_4

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_3

    :cond_4
    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_3
    if-eqz v10, :cond_5

    move/from16 v10, v17

    goto :goto_4

    :cond_5
    move/from16 v10, v16

    :goto_4
    or-int/2addr v9, v10

    :cond_6
    and-int/lit16 v10, v15, 0xc00

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-nez v10, :cond_8

    invoke-virtual {v4, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move/from16 v10, v19

    goto :goto_5

    :cond_7
    move/from16 v10, v18

    :goto_5
    or-int/2addr v9, v10

    :cond_8
    and-int/lit16 v10, v15, 0x6000

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-nez v10, :cond_a

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    move/from16 v10, v21

    goto :goto_6

    :cond_9
    move/from16 v10, v20

    :goto_6
    or-int/2addr v9, v10

    :cond_a
    const/high16 v10, 0x30000

    and-int v22, v15, v10

    const/high16 v23, 0x10000

    const/high16 v24, 0x20000

    move/from16 v7, p5

    if-nez v22, :cond_c

    invoke-virtual {v4, v7}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_b

    move/from16 v22, v24

    goto :goto_7

    :cond_b
    move/from16 v22, v23

    :goto_7
    or-int v9, v9, v22

    :cond_c
    const/high16 v22, 0x180000

    and-int v22, v15, v22

    move/from16 v8, p6

    if-nez v22, :cond_e

    invoke-virtual {v4, v8}, Lp1/q;->h(Z)Z

    move-result v25

    if-eqz v25, :cond_d

    const/high16 v25, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v25, 0x80000

    :goto_8
    or-int v9, v9, v25

    :cond_e
    const/high16 v25, 0xc00000

    and-int v25, v15, v25

    if-nez v25, :cond_10

    move/from16 v25, v10

    move/from16 v10, p7

    invoke-virtual {v4, v10}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_f

    const/high16 v26, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v26, 0x400000

    :goto_9
    or-int v9, v9, v26

    goto :goto_a

    :cond_10
    move/from16 v25, v10

    move/from16 v10, p7

    :goto_a
    const/high16 v26, 0x6000000

    and-int v26, v15, v26

    move/from16 v11, p8

    if-nez v26, :cond_12

    invoke-virtual {v4, v11}, Lp1/q;->h(Z)Z

    move-result v27

    if-eqz v27, :cond_11

    const/high16 v27, 0x4000000

    goto :goto_b

    :cond_11
    const/high16 v27, 0x2000000

    :goto_b
    or-int v9, v9, v27

    :cond_12
    const/high16 v27, 0x30000000

    and-int v27, v15, v27

    move-object/from16 v14, p9

    if-nez v27, :cond_14

    invoke-virtual {v4, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_13

    const/high16 v28, 0x20000000

    goto :goto_c

    :cond_13
    const/high16 v28, 0x10000000

    :goto_c
    or-int v9, v9, v28

    :cond_14
    move/from16 v10, p10

    move/from16 v28, v9

    invoke-virtual {v4, v10}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_15

    const/16 v22, 0x4

    goto :goto_d

    :cond_15
    const/16 v22, 0x2

    :goto_d
    or-int v9, v0, v22

    invoke-virtual {v4, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_16

    const/16 v26, 0x20

    goto :goto_e

    :cond_16
    const/16 v26, 0x10

    :goto_e
    or-int v9, v9, v26

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_17

    or-int/lit16 v9, v9, 0x180

    move/from16 v22, v2

    move-object/from16 v2, p12

    goto :goto_f

    :cond_17
    move/from16 v22, v2

    move-object/from16 v2, p12

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_18

    move/from16 v16, v17

    :cond_18
    or-int v9, v9, v16

    :goto_f
    and-int/lit16 v2, v0, 0xc00

    if-nez v2, :cond_1a

    move-object/from16 v2, p13

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_19

    move/from16 v18, v19

    :cond_19
    or-int v9, v9, v18

    goto :goto_10

    :cond_1a
    move-object/from16 v2, p13

    :goto_10
    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_1c

    or-int/lit16 v9, v9, 0x6000

    :cond_1b
    move-object/from16 v1, p14

    goto :goto_11

    :cond_1c
    and-int/lit16 v1, v0, 0x6000

    if-nez v1, :cond_1b

    move-object/from16 v1, p14

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1d

    move/from16 v20, v21

    :cond_1d
    or-int v9, v9, v20

    :goto_11
    const v16, 0x8000

    and-int v16, p19, v16

    if-eqz v16, :cond_1e

    or-int v9, v9, v25

    move-object/from16 v0, p15

    goto :goto_12

    :cond_1e
    and-int v17, v0, v25

    move-object/from16 v0, p15

    if-nez v17, :cond_20

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1f

    move/from16 v23, v24

    :cond_1f
    or-int v9, v9, v23

    :cond_20
    :goto_12
    const v17, 0x12492493

    and-int v0, v28, v17

    const v1, 0x12492492

    if-ne v0, v1, :cond_22

    const v0, 0x12493

    and-int/2addr v0, v9

    const v1, 0x12492

    if-ne v0, v1, :cond_22

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_13

    :cond_21
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v13, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object v10, v4

    goto/16 :goto_17

    :cond_22
    :goto_13
    if-eqz v22, :cond_23

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object/from16 v17, v0

    goto :goto_14

    :cond_23
    move-object/from16 v17, p12

    :goto_14
    const/4 v0, 0x0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_25

    const v2, -0x10b0e783

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_24

    invoke-static {v4}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v2

    :cond_24
    check-cast v2, Lg2/s;

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_25
    move-object/from16 v2, p14

    :goto_15
    if-eqz v16, :cond_27

    const v0, -0x10b0de83

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_26

    invoke-static {v4}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v0

    :cond_26
    check-cast v0, Lg2/s;

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_27
    move-object/from16 v0, p15

    :goto_16
    new-instance v1, Lj00/p;

    move-object v6, v2

    move-object v15, v4

    move-object v2, v5

    move v4, v7

    move/from16 v29, v9

    move-object v9, v14

    move-object/from16 v7, p1

    move-object v14, v0

    move-object v0, v1

    move-object v5, v3

    move v1, v8

    move v3, v11

    move-object v11, v12

    move/from16 v12, p7

    move-object/from16 v8, p13

    invoke-direct/range {v0 .. v14}, Lj00/p;-><init>(ZLn00/d;ZZLg40/z1;Lg2/s;Lg40/m3;Lg2/s;Ljava/lang/String;ZLc93/a;ZLg40/m3;Lg2/s;)V

    move-object v2, v6

    const v1, -0x1a8d294a

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    shl-int/lit8 v0, v28, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x6006

    move/from16 v1, v29

    and-int/lit16 v1, v1, 0x380

    or-int v11, v0, v1

    const/16 v12, 0x8

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v6, p0

    move-object v10, v15

    move-object/from16 v7, v17

    invoke-static/range {v5 .. v12}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v15, v2

    move-object v13, v7

    move-object/from16 v16, v14

    :goto_17
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_28

    move-object v1, v0

    new-instance v0, Lj00/l;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Lj00/l;-><init>(Lg40/h1;Lg40/m3;Lg40/z1;Lg40/m3;Ln00/d;ZZZZLjava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lg2/s;Lg2/s;Lg2/s;III)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method
