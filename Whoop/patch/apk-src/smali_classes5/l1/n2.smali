.class public abstract Ll1/n2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x30

    int-to-float v0, v0

    sput v0, Ll1/n2;->a:F

    const/16 v0, 0x18

    int-to-float v0, v0

    sput v0, Ll1/n2;->b:F

    const/high16 v0, 0x3f000000    # 0.5f

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li2/w0;->l(FF)J

    move-result-wide v0

    sput-wide v0, Ll1/n2;->c:J

    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;III)V
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v13, p6

    move/from16 v8, p18

    move/from16 v9, p19

    move/from16 v10, p20

    move-object/from16 v11, p17

    check-cast v11, Lp1/q;

    const v0, 0x7188eb30

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v2, v10, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit16 v7, v8, 0x180

    const/16 v16, 0x80

    if-nez v7, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    move/from16 v7, v16

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit8 v7, v10, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v7, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v4, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v4, v8, 0xc00

    if-nez v4, :cond_7

    move/from16 v4, p3

    invoke-virtual {v11, v4}, Lp1/q;->d(F)Z

    move-result v20

    if-eqz v20, :cond_9

    move/from16 v20, v18

    goto :goto_5

    :cond_9
    move/from16 v20, v17

    :goto_5
    or-int v0, v0, v20

    :goto_6
    and-int/lit8 v20, v10, 0x10

    if-eqz v20, :cond_b

    or-int/lit16 v0, v0, 0x6000

    :cond_a
    move/from16 v5, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v5, v8, 0x6000

    if-nez v5, :cond_a

    move/from16 v5, p4

    invoke-virtual {v11, v5}, Lp1/q;->h(Z)Z

    move-result v22

    if-eqz v22, :cond_c

    const/16 v22, 0x4000

    goto :goto_7

    :cond_c
    const/16 v22, 0x2000

    :goto_7
    or-int v0, v0, v22

    :goto_8
    const/high16 v22, 0x30000

    and-int v22, v8, v22

    if-nez v22, :cond_e

    and-int/lit8 v22, v10, 0x20

    move-object/from16 v12, p5

    if-nez v22, :cond_d

    invoke-virtual {v11, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_d

    const/high16 v23, 0x20000

    goto :goto_9

    :cond_d
    const/high16 v23, 0x10000

    :goto_9
    or-int v0, v0, v23

    goto :goto_a

    :cond_e
    move-object/from16 v12, p5

    :goto_a
    const/high16 v23, 0x180000

    and-int v23, v8, v23

    if-nez v23, :cond_10

    invoke-virtual {v11, v13, v14}, Lp1/q;->f(J)Z

    move-result v23

    if-eqz v23, :cond_f

    const/high16 v23, 0x100000

    goto :goto_b

    :cond_f
    const/high16 v23, 0x80000

    :goto_b
    or-int v0, v0, v23

    :cond_10
    const/high16 v23, 0xc00000

    and-int v23, v8, v23

    if-nez v23, :cond_12

    and-int/lit16 v15, v10, 0x80

    move-wide/from16 v4, p8

    if-nez v15, :cond_11

    invoke-virtual {v11, v4, v5}, Lp1/q;->f(J)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x800000

    goto :goto_c

    :cond_11
    const/high16 v15, 0x400000

    :goto_c
    or-int/2addr v0, v15

    goto :goto_d

    :cond_12
    move-wide/from16 v4, p8

    :goto_d
    and-int/lit16 v15, v10, 0x100

    const/high16 v24, 0x6000000

    if-eqz v15, :cond_14

    or-int v0, v0, v24

    :cond_13
    move/from16 v24, v0

    move/from16 v0, p10

    goto :goto_f

    :cond_14
    and-int v24, v8, v24

    if-nez v24, :cond_13

    move/from16 v24, v0

    move/from16 v0, p10

    invoke-virtual {v11, v0}, Lp1/q;->d(F)Z

    move-result v25

    if-eqz v25, :cond_15

    const/high16 v25, 0x4000000

    goto :goto_e

    :cond_15
    const/high16 v25, 0x2000000

    :goto_e
    or-int v24, v24, v25

    :goto_f
    const/high16 v25, 0x30000000

    and-int v25, v8, v25

    if-nez v25, :cond_17

    move/from16 v25, v7

    move-wide/from16 v7, p11

    invoke-virtual {v11, v7, v8}, Lp1/q;->f(J)Z

    move-result v26

    if-eqz v26, :cond_16

    const/high16 v26, 0x20000000

    goto :goto_10

    :cond_16
    const/high16 v26, 0x10000000

    :goto_10
    or-int v24, v24, v26

    goto :goto_11

    :cond_17
    move/from16 v25, v7

    move-wide/from16 v7, p11

    :goto_11
    and-int/lit8 v26, v9, 0x6

    move-object/from16 v7, p13

    if-nez v26, :cond_19

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_18

    const/4 v8, 0x4

    goto :goto_12

    :cond_18
    const/4 v8, 0x2

    :goto_12
    or-int/2addr v8, v9

    goto :goto_13

    :cond_19
    move v8, v9

    :goto_13
    and-int/lit8 v26, v9, 0x30

    if-nez v26, :cond_1c

    and-int/lit16 v0, v10, 0x800

    if-nez v0, :cond_1a

    move-object/from16 v0, p14

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_1b

    const/16 v19, 0x20

    goto :goto_14

    :cond_1a
    move-object/from16 v0, p14

    :cond_1b
    const/16 v19, 0x10

    :goto_14
    or-int v8, v8, v19

    goto :goto_15

    :cond_1c
    move-object/from16 v0, p14

    :goto_15
    and-int/lit16 v0, v10, 0x1000

    if-eqz v0, :cond_1e

    or-int/lit16 v8, v8, 0x180

    move/from16 v19, v0

    :cond_1d
    move-object/from16 v0, p15

    goto :goto_16

    :cond_1e
    move/from16 v19, v0

    and-int/lit16 v0, v9, 0x180

    if-nez v0, :cond_1d

    move-object/from16 v0, p15

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v16, 0x100

    :cond_1f
    or-int v8, v8, v16

    :goto_16
    and-int/lit16 v0, v9, 0xc00

    if-nez v0, :cond_21

    move-object/from16 v0, p16

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_20

    move/from16 v17, v18

    :cond_20
    or-int v8, v8, v17

    goto :goto_17

    :cond_21
    move-object/from16 v0, p16

    :goto_17
    const v16, 0x12492493

    and-int v0, v24, v16

    move/from16 v16, v2

    const v2, 0x12492492

    const/4 v7, 0x0

    const/16 v21, 0x1

    if-ne v0, v2, :cond_23

    and-int/lit16 v0, v8, 0x493

    const/16 v2, 0x492

    if-eq v0, v2, :cond_22

    goto :goto_18

    :cond_22
    move v0, v7

    goto :goto_19

    :cond_23
    :goto_18
    move/from16 v0, v21

    :goto_19
    and-int/lit8 v2, v24, 0x1

    invoke-virtual {v11, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_50

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v0, p18, 0x1

    const v2, -0x1c00001

    const v17, -0x70001

    if-eqz v0, :cond_28

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_24

    goto :goto_1a

    :cond_24
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v0, v10, 0x20

    if-eqz v0, :cond_25

    and-int v24, v24, v17

    :cond_25
    and-int/lit16 v0, v10, 0x80

    if-eqz v0, :cond_26

    and-int v24, v24, v2

    :cond_26
    and-int/lit16 v0, v10, 0x800

    if-eqz v0, :cond_27

    and-int/lit8 v8, v8, -0x71

    :cond_27
    move/from16 v10, p3

    move/from16 v16, p4

    move/from16 v15, p10

    move-object/from16 v19, p14

    move-object/from16 v20, p15

    move-wide/from16 v17, v4

    move v0, v8

    move/from16 v2, v24

    move-object v8, v6

    goto/16 :goto_21

    :cond_28
    :goto_1a
    if-eqz v16, :cond_29

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_1b

    :cond_29
    move-object v0, v6

    :goto_1b
    if-eqz v25, :cond_2a

    sget v6, Ll1/d;->b:F

    goto :goto_1c

    :cond_2a
    move/from16 v6, p3

    :goto_1c
    if-eqz v20, :cond_2b

    move/from16 v16, v21

    goto :goto_1d

    :cond_2b
    move/from16 v16, p4

    :goto_1d
    and-int/lit8 v18, v10, 0x20

    if-eqz v18, :cond_2c

    sget-object v12, Ll1/d;->a:Ll1/d;

    sget-object v12, Lo1/v;->a:Lo1/t;

    invoke-static {v12, v11}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v12

    and-int v24, v24, v17

    :cond_2c
    move/from16 v17, v2

    and-int/lit16 v2, v10, 0x80

    if-eqz v2, :cond_2d

    invoke-static {v13, v14, v11}, Ll1/n;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v4

    and-int v2, v24, v17

    move/from16 v24, v2

    :cond_2d
    if-eqz v15, :cond_2e

    int-to-float v2, v7

    goto :goto_1e

    :cond_2e
    move/from16 v2, p10

    :goto_1e
    and-int/lit16 v15, v10, 0x800

    if-eqz v15, :cond_2f

    sget-object v15, Ll1/o;->F:Ll1/o;

    and-int/lit8 v8, v8, -0x71

    goto :goto_1f

    :cond_2f
    move-object/from16 v15, p14

    :goto_1f
    move-object/from16 p1, v0

    if-eqz v19, :cond_30

    new-instance v0, Ll1/o2;

    invoke-direct {v0, v7}, Ll1/o2;-><init>(I)V

    move-object/from16 v20, v0

    :goto_20
    move-wide/from16 v17, v4

    move v10, v6

    move v0, v8

    move-object/from16 v19, v15

    move-object/from16 v8, p1

    move v15, v2

    move/from16 v2, v24

    goto :goto_21

    :cond_30
    move-object/from16 v20, p15

    goto :goto_20

    :goto_21
    invoke-virtual {v11}, Lp1/q;->r()V

    sget-object v4, Lo1/n;->w:Lo1/n;

    invoke-static {v4, v11}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v6

    invoke-static {v4, v11}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v4

    sget-object v5, Lo1/n;->z:Lo1/n;

    invoke-static {v5, v11}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v5

    and-int/lit16 v7, v2, 0x380

    xor-int/lit16 v7, v7, 0x180

    move/from16 p1, v0

    const/16 v0, 0x100

    if-le v7, v0, :cond_31

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_32

    :cond_31
    and-int/lit16 v3, v2, 0x180

    if-ne v3, v0, :cond_33

    :cond_32
    move/from16 v0, v21

    goto :goto_22

    :cond_33
    const/4 v0, 0x0

    :goto_22
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move/from16 v25, v7

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_34

    if-ne v3, v7, :cond_35

    :cond_34
    move v0, v2

    goto :goto_23

    :cond_35
    move v0, v2

    move-object v2, v3

    move-object v9, v7

    move-object/from16 p3, v8

    move/from16 v8, v25

    const/16 v24, 0x0

    move-object/from16 v3, p2

    goto :goto_24

    :goto_23
    new-instance v2, Lam2/d;

    move-object v3, v7

    const/16 v7, 0x17

    move-object v9, v3

    move-object/from16 p3, v8

    move/from16 v8, v25

    const/16 v24, 0x0

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v7}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v2, Lc93/a;

    invoke-static {v2, v11}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_36

    invoke-static {v11}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v2, Lbc3/c0;

    const/16 v4, 0x100

    if-le v8, v4, :cond_37

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_38

    :cond_37
    and-int/lit16 v5, v0, 0x180

    if-ne v5, v4, :cond_39

    :cond_38
    move/from16 v7, v21

    goto :goto_25

    :cond_39
    move/from16 v7, v24

    :goto_25
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v7

    and-int/lit8 v5, v0, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_3a

    move/from16 v7, v21

    goto :goto_26

    :cond_3a
    move/from16 v7, v24

    :goto_26
    or-int/2addr v4, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_3b

    if-ne v6, v9, :cond_3c

    :cond_3b
    new-instance v6, Lkf0/g;

    invoke-direct {v6, v3, v2, v1}, Lkf0/g;-><init>(Ll1/w3;Lbc3/c0;Lc93/a;)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3c
    check-cast v6, Lc93/a;

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v7, 0x100

    if-le v8, v7, :cond_3e

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_3d

    goto :goto_27

    :cond_3d
    move/from16 p4, v4

    goto :goto_28

    :cond_3e
    :goto_27
    move/from16 p4, v4

    and-int/lit16 v4, v0, 0x180

    if-ne v4, v7, :cond_3f

    :goto_28
    move/from16 v7, v21

    goto :goto_29

    :cond_3f
    move/from16 v7, v24

    :goto_29
    or-int v4, p4, v7

    const/4 v7, 0x4

    if-ne v5, v7, :cond_40

    move/from16 v7, v21

    goto :goto_2a

    :cond_40
    move/from16 v7, v24

    :goto_2a
    or-int/2addr v4, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_41

    if-ne v7, v9, :cond_42

    :cond_41
    new-instance v7, Ljs2/h;

    const/4 v4, 0x6

    invoke-direct {v7, v2, v3, v1, v4}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_42
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v9, :cond_43

    const/4 v4, 0x0

    invoke-static {v4}, Ld0/f;->a(F)Ld0/e;

    move-result-object v4

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_43
    check-cast v4, Ld0/e;

    move-object/from16 p4, v6

    const/16 v6, 0x100

    if-le v8, v6, :cond_44

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_45

    :cond_44
    and-int/lit16 v1, v0, 0x180

    if-ne v1, v6, :cond_46

    :cond_45
    move/from16 v1, v21

    goto :goto_2b

    :cond_46
    move/from16 v1, v24

    :goto_2b
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    or-int v1, v1, v23

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    or-int v1, v1, v23

    const/4 v6, 0x4

    if-ne v5, v6, :cond_47

    move/from16 v5, v21

    goto :goto_2c

    :cond_47
    move/from16 v5, v24

    :goto_2c
    or-int/2addr v1, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_48

    if-ne v5, v9, :cond_49

    :cond_48
    move v1, v0

    goto :goto_2d

    :cond_49
    move/from16 v6, p1

    move/from16 v24, v0

    move-object v3, v4

    goto :goto_2e

    :goto_2d
    new-instance v0, Lam2/d;

    const/16 v5, 0x18

    move/from16 v6, p1

    move/from16 v24, v1

    move-object v1, v3

    move-object v3, v4

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v5}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_2e
    move-object/from16 v25, v5

    check-cast v25, Lc93/a;

    new-instance v0, Ll1/l2;

    move-object/from16 v4, p2

    move/from16 v29, v6

    move/from16 v30, v8

    move-object/from16 v31, v9

    move-object/from16 v27, v11

    move/from16 v11, v16

    move-object/from16 v5, v20

    move/from16 v28, v24

    move-object/from16 v9, p3

    move-object/from16 v20, p16

    move-object v6, v3

    move-object v8, v7

    move-object/from16 v3, p4

    move-object v7, v2

    move-wide/from16 v1, p11

    move-wide/from16 v33, v17

    move-object/from16 v18, p13

    move/from16 v17, v15

    move-wide/from16 v15, v33

    invoke-direct/range {v0 .. v20}, Ll1/l2;-><init>(JLc93/a;Ll1/w3;Ll1/o2;Ld0/e;Lbc3/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;)V

    move-object v8, v4

    move-object v3, v5

    move-object v4, v6

    const v1, 0x3c33c970

    move-object/from16 v6, v27

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    move/from16 v13, v28

    shr-int/lit8 v0, v13, 0x12

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x6000

    move/from16 v1, v29

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    or-int/lit16 v7, v0, 0x1000

    move-wide v1, v15

    move-object/from16 v0, v25

    invoke-static/range {v0 .. v7}, Ll1/k3;->h(Lc93/a;JLl1/o2;Ld0/e;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v0, v6

    iget-object v1, v8, Ll1/w3;->e:Lm1/g;

    invoke-virtual {v1}, Lm1/g;->d()Lm1/b0;

    move-result-object v1

    sget-object v2, Ll1/x3;->x:Ll1/x3;

    iget-object v1, v1, Lm1/b0;->a:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4f

    const v1, 0x2c9c96f2

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    move/from16 v1, v30

    const/16 v4, 0x100

    if-le v1, v4, :cond_4a

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4b

    :cond_4a
    and-int/lit16 v1, v13, 0x180

    if-ne v1, v4, :cond_4c

    :cond_4b
    move/from16 v7, v21

    goto :goto_2f

    :cond_4c
    const/4 v7, 0x0

    :goto_2f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v7, :cond_4d

    move-object/from16 v2, v31

    if-ne v1, v2, :cond_4e

    :cond_4d
    new-instance v1, Ll1/k2;

    const/4 v2, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v8, v2, v4}, Ll1/k2;-><init>(Ll1/w3;Lq83/d;I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4e
    check-cast v1, Lc93/m;

    invoke-static {v0, v1, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_30

    :cond_4f
    const/4 v1, 0x0

    const v2, 0x2c9d8732

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_30
    move-object v2, v9

    move v4, v10

    move v5, v11

    move-wide v9, v15

    move/from16 v11, v17

    move-object/from16 v15, v19

    move-object/from16 v16, v3

    :goto_31
    move-object v6, v12

    goto :goto_32

    :cond_50
    move-object v8, v3

    move-object v0, v11

    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v11, p10

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-wide v9, v4

    move-object v2, v6

    move/from16 v4, p3

    move/from16 v5, p4

    goto :goto_31

    :goto_32
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_51

    move-object v1, v0

    new-instance v0, Ll1/i2;

    move-wide/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v32, v1

    move-object v3, v8

    move-object/from16 v1, p0

    move-wide/from16 v7, p6

    invoke-direct/range {v0 .. v20}, Ll1/i2;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;III)V

    move-object/from16 v1, v32

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_51
    return-void
.end method

.method public static final b(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p16

    check-cast v0, Lp1/q;

    const v1, 0x38db610c

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p17, v1

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v2, p2

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x100

    goto :goto_1

    :cond_1
    const/16 v4, 0x80

    :goto_1
    or-int/2addr v1, v4

    const v4, 0x32c82c00

    or-int/2addr v1, v4

    const v4, 0x12492493

    and-int/2addr v4, v1

    const v5, 0x12492492

    const/4 v6, 0x0

    if-ne v4, v5, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    const/4 v4, 0x1

    :goto_2
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v0, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v4, p17, 0x1

    const v5, -0xe38e001

    if-eqz v4, :cond_4

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/2addr v1, v5

    move/from16 v3, p3

    move-object/from16 v5, p4

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move v4, v1

    move-object/from16 v1, p1

    goto :goto_4

    :cond_4
    :goto_3
    sget v4, Ll1/d;->b:F

    sget-object v7, Ll1/d;->a:Ll1/d;

    sget-object v7, Lo1/v;->a:Lo1/t;

    invoke-static {v7, v0}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v7

    move-wide/from16 v8, p5

    invoke-static {v8, v9, v0}, Ll1/n;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v10

    int-to-float v6, v6

    sget-object v12, Lo1/s;->a:Lo1/f;

    invoke-static {v12, v0}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v12

    const v14, 0x3ea3d70a    # 0.32f

    invoke-static {v14, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    and-int/2addr v1, v5

    sget-object v5, Ll1/p;->a:Lx1/b;

    sget-object v14, Ll1/o;->G:Ll1/o;

    sget-object v15, Ll1/a2;->a:Ll1/o2;

    sget-object v16, Lb2/t;->w:Lb2/t;

    move v3, v4

    move-wide v8, v10

    move-wide v11, v12

    move v4, v1

    move-object v13, v5

    move v10, v6

    move-object v5, v7

    move-object/from16 v1, v16

    :goto_4
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit8 v6, v4, 0xe

    or-int/lit16 v6, v6, 0x6030

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v4, v6

    const v6, 0x6180c00

    or-int v18, v4, v6

    const/16 v19, 0xd86

    const/16 v20, 0x0

    const/4 v4, 0x1

    move-wide/from16 v6, p5

    move-object/from16 v16, p15

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v20}, Ll1/n2;->a(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object v4, v1

    move v6, v3

    move-object v7, v5

    move-object/from16 v16, v14

    move-object/from16 v0, v17

    move-object/from16 v17, v15

    move-object v15, v13

    move-wide v13, v11

    move v12, v10

    move-wide v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object/from16 v4, p1

    move/from16 v6, p3

    move-object/from16 v7, p4

    move-wide/from16 v10, p7

    move/from16 v12, p9

    move-wide/from16 v13, p10

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    :goto_5
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v2, Ll1/f2;

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-wide/from16 v8, p5

    move-object/from16 v18, p15

    move/from16 v19, p17

    invoke-direct/range {v2 .. v19}, Ll1/f2;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;Ll1/w3;FLi2/a1;JJFJLc93/m;Lc93/m;Ll1/o2;Lx1/b;I)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final c(Ld0/e;Lbc3/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v3, p5

    move/from16 v11, p6

    move/from16 v8, p7

    move-object/from16 v12, p17

    check-cast v12, Lp1/q;

    const v0, -0x23aaf70

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p18, v0

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x100

    goto :goto_1

    :cond_1
    const/16 v5, 0x80

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v5, p2

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    const/16 v16, 0x400

    if-eqz v14, :cond_2

    const/16 v14, 0x800

    goto :goto_2

    :cond_2
    move/from16 v14, v16

    :goto_2
    or-int/2addr v0, v14

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    const/16 v17, 0x2000

    if-eqz v14, :cond_3

    const/16 v14, 0x4000

    goto :goto_3

    :cond_3
    move/from16 v14, v17

    :goto_3
    or-int/2addr v0, v14

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    const/high16 v18, 0x10000

    const/high16 v19, 0x20000

    if-eqz v14, :cond_4

    move/from16 v14, v19

    goto :goto_4

    :cond_4
    move/from16 v14, v18

    :goto_4
    or-int/2addr v0, v14

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_5

    const/high16 v14, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v14, 0x80000

    :goto_5
    or-int/2addr v0, v14

    invoke-virtual {v12, v11}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_6

    const/high16 v14, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v14, 0x400000

    :goto_6
    or-int/2addr v0, v14

    invoke-virtual {v12, v8}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_7

    const/high16 v14, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v14, 0x2000000

    :goto_7
    or-int/2addr v0, v14

    move-object/from16 v14, p8

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_8

    const/high16 v21, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v21, 0x10000000

    :goto_8
    or-int v21, v0, v21

    move-wide/from16 v13, p9

    invoke-virtual {v12, v13, v14}, Lp1/q;->f(J)Z

    move-result v22

    if-eqz v22, :cond_9

    const/16 v22, 0x4

    :goto_9
    move-wide/from16 v4, p11

    goto :goto_a

    :cond_9
    const/16 v22, 0x2

    goto :goto_9

    :goto_a
    invoke-virtual {v12, v4, v5}, Lp1/q;->f(J)Z

    move-result v24

    if-eqz v24, :cond_a

    const/16 v24, 0x20

    goto :goto_b

    :cond_a
    const/16 v24, 0x10

    :goto_b
    or-int v22, v22, v24

    move/from16 v15, p13

    invoke-virtual {v12, v15}, Lp1/q;->d(F)Z

    move-result v24

    if-eqz v24, :cond_b

    const/16 v0, 0x100

    goto :goto_c

    :cond_b
    const/16 v0, 0x80

    :goto_c
    or-int v0, v22, v0

    move-object/from16 v2, p14

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_c

    const/16 v16, 0x800

    :cond_c
    or-int v0, v0, v16

    move-object/from16 v6, p15

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v17, 0x4000

    :cond_d
    or-int v0, v0, v17

    move/from16 v16, v0

    move-object/from16 v0, p16

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_e

    move/from16 v18, v19

    :cond_e
    or-int v16, v16, v18

    const v17, 0x12492493

    and-int v0, v21, v17

    const v2, 0x12492492

    const/4 v4, 0x1

    if-ne v0, v2, :cond_10

    const v0, 0x12493

    and-int v0, v16, v0

    const v2, 0x12492

    if-eq v0, v2, :cond_f

    goto :goto_d

    :cond_f
    const/4 v0, 0x0

    goto :goto_e

    :cond_10
    :goto_d
    move v0, v4

    :goto_e
    and-int/lit8 v2, v21, 0x1

    invoke-virtual {v12, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v0, p18, 0x1

    if-eqz v0, :cond_12

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_11

    goto :goto_f

    :cond_11
    invoke-virtual {v12}, Lp1/q;->X()V

    :cond_12
    :goto_f
    invoke-virtual {v12}, Lp1/q;->r()V

    const v0, 0x7f1407cc

    invoke-static {v12, v0}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lb2/e;->x:Lb2/m;

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v5, v10, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v2, v5, v11, v4}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v18, 0x380000

    sget-object v5, Lb2/t;->w:Lb2/t;

    sget-object v4, Lp1/l;->a:Lp1/v0;

    const/high16 v22, 0x180000

    if-eqz v8, :cond_18

    const v6, -0x5e4bf1b7

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    and-int v6, v21, v18

    xor-int v6, v6, v22

    const/high16 v7, 0x100000

    if-le v6, v7, :cond_13

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    and-int v6, v21, v22

    if-ne v6, v7, :cond_15

    :cond_14
    const/4 v6, 0x1

    goto :goto_10

    :cond_15
    const/4 v6, 0x0

    :goto_10
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_16

    if-ne v7, v4, :cond_17

    :cond_16
    sget-object v6, Lh0/d2;->w:Lh0/d2;

    sget v6, Ll1/t3;->a:F

    new-instance v7, Lg1/o2;

    invoke-direct {v7, v3, v9}, Lg1/o2;-><init>(Ll1/w3;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v7, Lt2/a;

    const/4 v6, 0x0

    invoke-static {v5, v7, v6}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_18
    const/4 v6, 0x0

    const v7, -0x5e4bb908

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    :goto_11
    invoke-interface {v2, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v5, v3, Ll1/w3;->e:Lm1/g;

    iget-object v6, v3, Ll1/w3;->e:Lm1/g;

    sget-object v27, Lh0/d2;->w:Lh0/d2;

    and-int v7, v21, v18

    xor-int v7, v7, v22

    const/high16 v8, 0x100000

    if-le v7, v8, :cond_19

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-nez v18, :cond_1a

    :cond_19
    and-int v10, v21, v22

    if-ne v10, v8, :cond_1b

    :cond_1a
    const/4 v8, 0x1

    goto :goto_12

    :cond_1b
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1c

    if-ne v10, v4, :cond_1d

    :cond_1c
    new-instance v10, Lkk1/b;

    const/16 v8, 0xa

    invoke-direct {v10, v3, v8}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v10, Lc93/m;

    invoke-static {v2, v5, v10}, Landroidx/compose/material3/internal/a;->b(Landroidx/compose/ui/Modifier;Lm1/g;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    iget-object v2, v6, Lm1/g;->f:Lg1/z;

    if-eqz p7, :cond_1e

    invoke-virtual {v3}, Ll1/w3;->e()Z

    move-result v5

    if-eqz v5, :cond_1e

    const/16 v28, 0x1

    goto :goto_13

    :cond_1e
    const/16 v28, 0x0

    :goto_13
    iget-object v5, v6, Lm1/g;->l:Lp1/k1;

    invoke-virtual {v5}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_1f

    const/16 v30, 0x1

    goto :goto_14

    :cond_1f
    const/16 v30, 0x0

    :goto_14
    const v10, 0xe000

    and-int v5, v21, v10

    const/16 v8, 0x4000

    if-ne v5, v8, :cond_20

    const/4 v5, 0x1

    goto :goto_15

    :cond_20
    const/4 v5, 0x0

    :goto_15
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_22

    if-ne v8, v4, :cond_21

    goto :goto_16

    :cond_21
    move/from16 v18, v10

    const/4 v5, 0x1

    goto :goto_17

    :cond_22
    :goto_16
    new-instance v8, Lg1/x5;

    move/from16 v18, v10

    const/4 v5, 0x1

    const/4 v10, 0x0

    invoke-direct {v8, v9, v10, v5}, Lg1/x5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object/from16 v32, v8

    check-cast v32, Lkotlin/jvm/functions/Function3;

    const/16 v33, 0x0

    const/16 v34, 0xa8

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v26, v2

    invoke-static/range {v25 .. v34}, Lh0/k1;->a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_23

    if-ne v10, v4, :cond_24

    :cond_23
    new-instance v10, Lht2/d;

    const/16 v8, 0x12

    invoke-direct {v10, v0, v8}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-static {v2, v0, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    iget-object v6, v6, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v6}, Lp1/g1;->x()F

    move-result v6

    float-to-int v6, v6

    if-gez v6, :cond_25

    move v6, v0

    :cond_25
    new-instance v8, Ll0/j0;

    invoke-direct {v8, v6}, Ll0/j0;-><init>(I)V

    new-instance v6, Ll0/d2;

    invoke-direct {v6, v8, v0}, Ll0/d2;-><init>(Ll0/b2;I)V

    invoke-static {v2, v6}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v8, 0x100000

    if-le v7, v8, :cond_26

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_27

    :cond_26
    and-int v2, v21, v22

    if-ne v2, v8, :cond_28

    :cond_27
    move v6, v5

    goto :goto_18

    :cond_28
    const/4 v6, 0x0

    :goto_18
    and-int/lit8 v2, v21, 0x70

    const/16 v7, 0x20

    if-eq v2, v7, :cond_2a

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    goto :goto_19

    :cond_29
    const/4 v5, 0x0

    :cond_2a
    :goto_19
    or-int v2, v6, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2b

    if-ne v5, v4, :cond_2c

    :cond_2b
    new-instance v5, Ljp1/c;

    const/16 v2, 0x13

    invoke-direct {v5, v2, v3, v1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v5}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Ll1/e;

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6}, Ll1/e;-><init>(Ll1/w3;I)V

    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v0, Ll1/m2;

    move-object/from16 v7, p1

    move-object/from16 v6, p2

    move/from16 v8, p7

    move-object/from16 v4, p14

    move-object/from16 v5, p16

    move-object v2, v1

    move-object/from16 v1, p15

    invoke-direct/range {v0 .. v8}, Ll1/m2;-><init>(Lc93/m;Ld0/e;Ll1/w3;Lc93/m;Lx1/b;Lc93/a;Lbc3/c0;Z)V

    const v1, 0x2b6fbd6b

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v1, v21, 0x18

    and-int/lit8 v1, v1, 0x70

    const/high16 v2, 0xc00000

    or-int/2addr v1, v2

    shl-int/lit8 v2, v16, 0x6

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v1, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v1, v3

    and-int v2, v2, v18

    or-int v23, v1, v2

    const/16 v24, 0x60

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-wide/from16 v16, p11

    move-object/from16 v21, v0

    move-object/from16 v22, v12

    move/from16 v18, v15

    move-object v12, v10

    move-wide v14, v13

    move-object/from16 v13, p8

    invoke-static/range {v12 .. v24}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1a

    :cond_2d
    move-object/from16 v22, v12

    invoke-virtual/range {v22 .. v22}, Lp1/q;->X()V

    :goto_1a
    invoke-virtual/range {v22 .. v22}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Ll1/h2;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-wide/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move-object/from16 v35, v1

    move-object v4, v9

    move v7, v11

    move-object/from16 v1, p0

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-direct/range {v0 .. v18}, Ll1/h2;-><init>(Ld0/e;Lbc3/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll1/w3;FZLi2/a1;JJFLc93/m;Lc93/m;Lx1/b;I)V

    move-object/from16 v1, v35

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static final d(JLc93/a;ZZLandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x17578dd7

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v1, v2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    const/16 v14, 0x20

    if-eqz v6, :cond_1

    move v6, v14

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v0, v6

    invoke-virtual {v10, v4}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v0, v6

    invoke-virtual {v10, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v0, v6

    and-int/lit16 v6, v0, 0x493

    const/16 v7, 0x492

    const/4 v15, 0x1

    const/4 v8, 0x0

    if-eq v6, v7, :cond_4

    move v6, v15

    goto :goto_4

    :cond_4
    move v6, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    const-wide/16 v6, 0x10

    cmp-long v6, v1, v6

    if-eqz v6, :cond_10

    const v6, -0x55bf0636

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v4, :cond_5

    move v7, v6

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    :goto_5
    sget-object v9, Lo1/n;->y:Lo1/n;

    invoke-static {v9, v10}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v9

    const/4 v11, 0x0

    const/16 v12, 0x1c

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v6

    move v6, v7

    move-object v7, v9

    const/4 v9, 0x0

    move/from16 v13, v16

    invoke-static/range {v6 .. v12}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v6

    const v7, 0x7f1402bf

    invoke-static {v10, v7}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_c

    const v11, -0x55ba773b

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    and-int/lit8 v11, v0, 0x70

    if-ne v11, v14, :cond_6

    move v12, v15

    goto :goto_6

    :cond_6
    move v12, v13

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_7

    if-ne v13, v9, :cond_8

    :cond_7
    new-instance v13, Lg1/l2;

    const/4 v12, 0x2

    invoke-direct {v13, v3, v12}, Lg1/l2;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v8, v3, v13}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-ne v11, v14, :cond_9

    move v11, v15

    goto :goto_7

    :cond_9
    const/4 v11, 0x0

    :goto_7
    or-int/2addr v11, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_a

    if-ne v13, v9, :cond_b

    :cond_a
    new-instance v13, Lg1/g2;

    const/4 v11, 0x2

    invoke-direct {v13, v11, v7, v3}, Lg1/g2;-><init>(ILjava/lang/String;Lc93/a;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v15, v13}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v13, 0x0

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_8
    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_c
    const v7, -0x55b3f66f

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v7, v8

    goto :goto_8

    :goto_9
    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit8 v0, v0, 0xe

    const/4 v8, 0x4

    if-ne v0, v8, :cond_d

    goto :goto_a

    :cond_d
    const/4 v15, 0x0

    :goto_a
    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_e

    if-ne v8, v9, :cond_f

    :cond_e
    new-instance v8, Lc11/g;

    const/4 v0, 0x3

    invoke-direct {v8, v1, v2, v6, v0}, Lc11/g;-><init>(JLp1/t2;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static {v7, v8, v10, v13}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_10
    move v13, v8

    const v0, -0x55b13247

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Ll1/g2;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Ll1/g2;-><init>(JLc93/a;ZZI)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final e(FLi2/g0;)F
    .locals 4

    move-object v0, p1

    check-cast v0, Li2/x0;

    iget-wide v0, v0, Li2/x0;->R:J

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_1

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Li2/x0;

    invoke-virtual {p1}, Li2/x0;->getDensity()F

    move-result p1

    sget v3, Ll1/n2;->a:F

    mul-float/2addr p1, v3

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v1, p1, p0}, Le93/b;->O(FFF)F

    move-result p0

    div-float/2addr p0, v0

    sub-float/2addr v2, p0

    :cond_1
    :goto_0
    return v2
.end method

.method public static final f(FLi2/g0;)F
    .locals 4

    move-object v0, p1

    check-cast v0, Li2/x0;

    iget-wide v0, v0, Li2/x0;->R:J

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-nez v1, :cond_1

    const/4 v1, 0x0

    cmpg-float v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Li2/x0;

    invoke-virtual {p1}, Li2/x0;->getDensity()F

    move-result p1

    sget v3, Ll1/n2;->b:F

    mul-float/2addr p1, v3

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v1, p1, p0}, Le93/b;->O(FFF)F

    move-result p0

    div-float/2addr p0, v0

    sub-float/2addr v2, p0

    :cond_1
    :goto_0
    return v2
.end method

.method public static final g(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll1/w3;
    .locals 3

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    and-int/lit8 p3, p3, 0x2

    const/16 v1, 0xe

    if-eqz p3, :cond_2

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p3, v2, :cond_1

    new-instance p3, Lkx1/b;

    invoke-direct {p3, v1}, Lkx1/b;-><init>(I)V

    invoke-virtual {p1, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object p1, p3

    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_2
    sget-object p3, Ll1/x3;->w:Ll1/x3;

    and-int/2addr p0, v1

    or-int/lit16 p0, p0, 0x180

    const/16 p3, 0x38

    invoke-static {v0, p1, p0, p2, p3}, Ll1/t3;->b(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object p0

    return-object p0
.end method
