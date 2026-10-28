.class public abstract Landroidx/compose/material/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Landroidx/compose/material/c;->a:F

    const/16 v0, 0x7d

    int-to-float v0, v0

    sput v0, Landroidx/compose/material/c;->b:F

    const/16 v0, 0x280

    int-to-float v0, v0

    sput v0, Landroidx/compose/material/c;->c:F

    return-void
.end method

.method public static final a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v6, p6

    move-object/from16 v0, p12

    move/from16 v2, p14

    move/from16 v4, p15

    move-object/from16 v12, p13

    check-cast v12, Lp1/q;

    const v5, -0x140aff0a

    invoke-virtual {v12, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v2, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v2

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_1
    and-int/lit8 v8, v4, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    :cond_2
    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v2, 0x30

    if-nez v9, :cond_2

    move-object/from16 v9, p1

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :goto_3
    and-int/lit16 v10, v2, 0x180

    if-nez v10, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v5, v10

    :cond_6
    and-int/lit8 v10, v4, 0x8

    if-eqz v10, :cond_8

    or-int/lit16 v5, v5, 0xc00

    :cond_7
    move/from16 v11, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v11, v2, 0xc00

    if-nez v11, :cond_7

    move/from16 v11, p3

    invoke-virtual {v12, v11}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_5

    :cond_9
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v5, v13

    :goto_6
    and-int/lit16 v13, v2, 0x6000

    if-nez v13, :cond_c

    and-int/lit8 v13, v4, 0x10

    if-nez v13, :cond_a

    move-object/from16 v13, p4

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x4000

    goto :goto_7

    :cond_a
    move-object/from16 v13, p4

    :cond_b
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v5, v14

    goto :goto_8

    :cond_c
    move-object/from16 v13, p4

    :goto_8
    const/high16 v14, 0x30000

    and-int/2addr v14, v2

    if-nez v14, :cond_f

    and-int/lit8 v14, v4, 0x20

    if-nez v14, :cond_d

    move/from16 v14, p5

    invoke-virtual {v12, v14}, Lp1/q;->d(F)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_9

    :cond_d
    move/from16 v14, p5

    :cond_e
    const/high16 v15, 0x10000

    :goto_9
    or-int/2addr v5, v15

    goto :goto_a

    :cond_f
    move/from16 v14, p5

    :goto_a
    const/high16 v15, 0x180000

    and-int v16, v2, v15

    if-nez v16, :cond_11

    invoke-virtual {v12, v6, v7}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_10
    const/high16 v16, 0x80000

    :goto_b
    or-int v5, v5, v16

    :cond_11
    const/high16 v16, 0xc00000

    and-int v16, v2, v16

    if-nez v16, :cond_14

    move/from16 p13, v15

    and-int/lit16 v15, v4, 0x80

    if-nez v15, :cond_12

    move v15, v8

    move-wide/from16 v8, p8

    invoke-virtual {v12, v8, v9}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x800000

    goto :goto_c

    :cond_12
    move v15, v8

    move-wide/from16 v8, p8

    :cond_13
    const/high16 v16, 0x400000

    :goto_c
    or-int v5, v5, v16

    goto :goto_d

    :cond_14
    move/from16 p13, v15

    move v15, v8

    move-wide/from16 v8, p8

    :goto_d
    const/high16 v16, 0x6000000

    and-int v16, v2, v16

    move-wide/from16 v8, p10

    if-nez v16, :cond_16

    invoke-virtual {v12, v8, v9}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_15

    const/high16 v16, 0x4000000

    goto :goto_e

    :cond_15
    const/high16 v16, 0x2000000

    :goto_e
    or-int v5, v5, v16

    :cond_16
    const/high16 v16, 0x30000000

    and-int v16, v2, v16

    if-nez v16, :cond_18

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x20000000

    goto :goto_f

    :cond_17
    const/high16 v16, 0x10000000

    :goto_f
    or-int v5, v5, v16

    :cond_18
    const v16, 0x12492493

    and-int v2, v5, v16

    move/from16 v16, v5

    const v5, 0x12492492

    const/4 v14, 0x0

    move/from16 v17, v15

    if-eq v2, v5, :cond_19

    const/4 v2, 0x1

    goto :goto_10

    :cond_19
    move v2, v14

    :goto_10
    and-int/lit8 v5, v16, 0x1

    invoke-virtual {v12, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_35

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v2, p14, 0x1

    sget-object v5, Lb2/t;->w:Lb2/t;

    const v18, -0x1c00001

    const v19, -0x70001

    const v20, -0xe001

    if-eqz v2, :cond_1e

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v2, v4, 0x10

    if-eqz v2, :cond_1b

    and-int v2, v16, v20

    move/from16 v16, v2

    :cond_1b
    and-int/lit8 v2, v4, 0x20

    if-eqz v2, :cond_1c

    and-int v16, v16, v19

    :cond_1c
    and-int/lit16 v2, v4, 0x80

    if-eqz v2, :cond_1d

    and-int v16, v16, v18

    :cond_1d
    move-object/from16 v2, p1

    move/from16 v18, p5

    move-wide/from16 v19, p8

    move-object v15, v13

    :goto_11
    move/from16 v21, v16

    move/from16 v16, v11

    goto :goto_17

    :cond_1e
    :goto_12
    if-eqz v17, :cond_1f

    move-object v2, v5

    goto :goto_13

    :cond_1f
    move-object/from16 v2, p1

    :goto_13
    if-eqz v10, :cond_20

    const/4 v11, 0x1

    :cond_20
    and-int/lit8 v10, v4, 0x10

    if-eqz v10, :cond_21

    sget-object v10, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v12, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/l5;

    iget-object v10, v10, Lg1/l5;->c:Lt0/i;

    and-int v13, v16, v20

    move/from16 v16, v13

    goto :goto_14

    :cond_21
    move-object v10, v13

    :goto_14
    and-int/lit8 v13, v4, 0x20

    if-eqz v13, :cond_22

    sget v13, Lg1/r3;->a:F

    and-int v16, v16, v19

    goto :goto_15

    :cond_22
    move/from16 v13, p5

    :goto_15
    and-int/lit16 v15, v4, 0x80

    if-eqz v15, :cond_23

    invoke-static {v6, v7, v12}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v19

    and-int v15, v16, v18

    move/from16 v16, v15

    goto :goto_16

    :cond_23
    move-wide/from16 v19, p8

    :goto_16
    move-object v15, v10

    move/from16 v18, v13

    goto :goto_11

    :goto_17
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_24

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v10

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v10, Lbc3/c0;

    sget-object v24, Lh0/d2;->w:Lh0/d2;

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move-object/from16 p1, v15

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 p3, v2

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-eqz v2, :cond_25

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_25
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_18
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v12, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_26

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_27

    :cond_26
    invoke-static {v14, v12, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v14, 0x0

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 p4, v7

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_28

    move-object/from16 v14, p4

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_28
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v12, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_29

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2a

    :cond_29
    invoke-static {v6, v12, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2a
    invoke-static {v12, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, v21, 0x1b

    and-int/lit8 v2, v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v12, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2b

    if-ne v4, v11, :cond_2c

    :cond_2b
    new-instance v4, Lbf0/h;

    const/16 v2, 0x8

    invoke-direct {v4, v3, v10, v2}, Lbf0/h;-><init>(Lg1/y3;Lbc3/c0;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v4, Lc93/a;

    iget-object v2, v3, Lg1/y3;->b:Lg1/a0;

    iget-object v6, v2, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v6}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lg1/z3;->w:Lg1/z3;

    if-eq v6, v7, :cond_2d

    move-object v6, v11

    const/4 v11, 0x1

    goto :goto_1a

    :cond_2d
    move-object v6, v11

    const/4 v11, 0x0

    :goto_1a
    shr-int/lit8 v8, v21, 0x18

    and-int/lit8 v13, v8, 0xe

    move-object v8, v10

    move-object v10, v4

    move-object v4, v8

    move-wide/from16 v8, p10

    invoke-static/range {v8 .. v13}, Landroidx/compose/material/c;->b(JLc93/a;ZLandroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x1

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    sget-object v8, Lb2/e;->x:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v5, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Landroidx/compose/material/c;->c:F

    const/4 v10, 0x0

    invoke-static {v8, v10, v9, v14}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    if-eqz v16, :cond_30

    const v9, 0x14f19132

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_2e

    if-ne v10, v6, :cond_2f

    :cond_2e
    new-instance v10, Lg1/v3;

    invoke-direct {v10, v2}, Lg1/v3;-><init>(Lg1/a0;)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v10, Lt2/a;

    const/4 v9, 0x0

    invoke-static {v5, v10, v9}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_30
    const/4 v10, 0x0

    const v9, 0x4affc3b8    # 8380892.0f

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object v9, v5

    :goto_1b
    invoke-interface {v8, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v9, Lej1/h;

    const/16 v10, 0x10

    invoke-direct {v9, v3, v10}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Landroidx/compose/material/DraggableAnchorsElement;

    invoke-direct {v10, v2, v9}, Landroidx/compose/material/DraggableAnchorsElement;-><init>(Lg1/a0;Lej1/h;)V

    invoke-interface {v8, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    iget-object v2, v3, Lg1/y3;->b:Lg1/a0;

    if-eqz v16, :cond_31

    iget-object v8, v2, Lg1/a0;->g:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eq v8, v7, :cond_31

    move/from16 v25, v14

    goto :goto_1c

    :cond_31
    const/16 v25, 0x0

    :goto_1c
    const/16 v26, 0x0

    const/16 v27, 0x38

    move-object/from16 v23, v2

    invoke-static/range {v22 .. v27}, Lcom/squareup/wire/n;->l(Landroidx/compose/ui/Modifier;Lg1/a0;Lh0/d2;ZZI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v16, :cond_34

    const v7, 0x1500d902

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_32

    if-ne v8, v6, :cond_33

    :cond_32
    new-instance v8, Lcd1/c;

    invoke-direct {v8, v3, v4}, Lcd1/c;-><init>(Lg1/y3;Lbc3/c0;)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_33
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    invoke-static {v5, v10, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_34
    const/4 v10, 0x0

    const v4, 0x4b00f618    # 8451608.0f

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-interface {v2, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v2, Lb30/l4;

    const/16 v5, 0xb

    invoke-direct {v2, v1, v5}, Lb30/l4;-><init>(Lx1/b;I)V

    const v5, -0x5cd6198c

    invoke-static {v5, v12, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    shr-int/lit8 v5, v21, 0x9

    and-int/lit8 v5, v5, 0x70

    or-int v5, v5, p13

    shr-int/lit8 v6, v21, 0xc

    and-int/lit16 v7, v6, 0x380

    or-int/2addr v5, v7

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v5, v6

    const/high16 v6, 0x70000

    and-int v6, v21, v6

    or-int/2addr v5, v6

    const/16 v15, 0x10

    const/4 v10, 0x0

    move-wide/from16 v6, p6

    move-object v13, v12

    move/from16 v11, v18

    move-wide/from16 v8, v19

    move-object v12, v2

    move v2, v14

    move v14, v5

    move-object/from16 v5, p1

    invoke-static/range {v4 .. v15}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    move-object/from16 v2, p3

    move-wide v9, v8

    move v6, v11

    move/from16 v4, v16

    goto :goto_1e

    :cond_35
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move/from16 v6, p5

    move-wide/from16 v9, p8

    move v4, v11

    move-object v5, v13

    :goto_1e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_36

    new-instance v0, Lg1/s3;

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v28, v7

    move-wide/from16 v7, p6

    invoke-direct/range {v0 .. v15}, Lg1/s3;-><init>(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/y3;ZLi2/a1;FJJJLx1/b;II)V

    move-object v1, v0

    move-object/from16 v0, v28

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method public static final b(JLc93/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x1f62403c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v13, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1, v2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    const/16 v15, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v15

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v10, v4}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v7, :cond_6

    move v6, v8

    goto :goto_4

    :cond_6
    move v6, v9

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    const-wide/16 v6, 0x10

    cmp-long v6, v1, v6

    if-eqz v6, :cond_12

    const v6, -0x2a8eebe0

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    if-eqz v4, :cond_7

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_7
    const/4 v7, 0x0

    :goto_5
    new-instance v11, Ld0/e2;

    const/4 v12, 0x0

    const/4 v6, 0x7

    invoke-direct {v11, v9, v12, v6}, Ld0/e2;-><init>(ILd0/z;I)V

    move v6, v7

    move-object v7, v11

    const/16 v11, 0x30

    const/16 v12, 0x1c

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v14, v16

    invoke-static/range {v6 .. v12}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v6

    invoke-static {v10, v13}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    const v11, -0x2a8b98b5

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    and-int/lit8 v11, v0, 0x70

    if-ne v11, v15, :cond_8

    move v12, v14

    goto :goto_6

    :cond_8
    const/4 v12, 0x0

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_9

    if-ne v13, v9, :cond_a

    :cond_9
    new-instance v13, Lg1/l2;

    const/4 v12, 0x1

    invoke-direct {v13, v3, v12}, Lg1/l2;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v13, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v8, v3, v13}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-ne v11, v15, :cond_b

    move v11, v14

    goto :goto_7

    :cond_b
    const/4 v11, 0x0

    :goto_7
    or-int/2addr v11, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_c

    if-ne v13, v9, :cond_d

    :cond_c
    new-instance v13, Lg1/g2;

    const/4 v11, 0x1

    invoke-direct {v13, v11, v7, v3}, Lg1/g2;-><init>(ILjava/lang/String;Lc93/a;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v14, v13}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_8
    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_e
    const/4 v11, 0x0

    const v7, -0x2a860bea

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object v7, v8

    goto :goto_8

    :goto_9
    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit8 v0, v0, 0xe

    const/4 v8, 0x4

    if-ne v0, v8, :cond_f

    move v8, v14

    goto :goto_a

    :cond_f
    move v8, v11

    :goto_a
    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_10

    if-ne v8, v9, :cond_11

    :cond_10
    new-instance v8, Lc11/g;

    const/4 v0, 0x2

    invoke-direct {v8, v1, v2, v6, v0}, Lc11/g;-><init>(JLp1/t2;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v8, v10, v11}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    move v11, v9

    const v0, -0x2a833842

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Lb30/a3;

    invoke-direct/range {v0 .. v5}, Lb30/a3;-><init>(JLc93/a;ZI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;
    .locals 8

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    sget-object p1, Lg1/r3;->b:Ld0/e2;

    :cond_0
    move-object v4, p1

    and-int/lit8 p1, p6, 0x4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz p1, :cond_2

    move-object p1, p4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    new-instance p2, Lfq2/c;

    const/16 v1, 0x18

    invoke-direct {p2, v1}, Lfq2/c;-><init>(I)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_2
    move-object v3, p2

    and-int/lit8 p1, p6, 0x8

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    move v5, p2

    goto :goto_0

    :cond_3
    move v5, p3

    :goto_0
    sget-object p1, Lb3/v1;->h:Lp1/u2;

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ly3/c;

    const p1, -0x48e4a4f9

    invoke-virtual {p4, p1, p0}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p0, v4, p1, v3, v2}, [Ljava/lang/Object;

    move-result-object p1

    new-instance p3, Ldw1/a;

    const/16 p6, 0x16

    invoke-direct {p3, p6}, Ldw1/a;-><init>(I)V

    new-instance p6, Lch0/e;

    invoke-direct {p6, v2, v3, v4, v5}, Lch0/e;-><init>(Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V

    new-instance v6, Lp0/n0;

    const/16 v1, 0xa

    invoke-direct {v6, v1, p3, p6}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    and-int/lit8 p3, p5, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 p6, 0x1

    const/4 v1, 0x4

    if-le p3, v1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-virtual {p4, p3}, Lp1/q;->e(I)Z

    move-result p3

    if-nez p3, :cond_5

    :cond_4
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v1, :cond_6

    :cond_5
    move p3, p6

    goto :goto_1

    :cond_6
    move p3, p2

    :goto_1
    invoke-virtual {p4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    and-int/lit16 v1, p5, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v7, 0x100

    if-le v1, v7, :cond_7

    invoke-virtual {p4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    and-int/lit16 v1, p5, 0x180

    if-ne v1, v7, :cond_9

    :cond_8
    move v1, p6

    goto :goto_2

    :cond_9
    move v1, p2

    :goto_2
    or-int/2addr p3, v1

    invoke-virtual {p4, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p3, v1

    and-int/lit16 v1, p5, 0x1c00

    xor-int/lit16 v1, v1, 0xc00

    const/16 v7, 0x800

    if-le v1, v7, :cond_a

    invoke-virtual {p4, v5}, Lp1/q;->h(Z)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_a
    and-int/lit16 p5, p5, 0xc00

    if-ne p5, v7, :cond_b

    goto :goto_3

    :cond_b
    move p6, p2

    :cond_c
    :goto_3
    or-int/2addr p3, p6

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_d

    if-ne p5, v0, :cond_e

    :cond_d
    new-instance v0, Lch0/x0;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lch0/x0;-><init>(Lg1/z3;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;Z)V

    invoke-virtual {p4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, v0

    :cond_e
    check-cast p5, Lc93/a;

    invoke-static {p1, v6, p5, p4, p2}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/y3;

    invoke-virtual {p4, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method
