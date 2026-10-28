.class public abstract Li40/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Li40/j;->a:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/l1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    sget-object v0, Lb2/e;->w:Lb2/m;

    sget-object v11, Lb2/e;->E:Lb2/m;

    const-string v12, "modifier"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p9

    check-cast v12, Lp1/q;

    const v13, -0x27b8b9b5

    invoke-virtual {v12, v13}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v13, v10, 0x6

    if-nez v13, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x4

    goto :goto_0

    :cond_0
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v10

    goto :goto_1

    :cond_1
    move v13, v10

    :goto_1
    and-int/lit8 v14, v10, 0x30

    if-nez v14, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    const/16 v14, 0x20

    goto :goto_2

    :cond_2
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v13, v14

    :cond_3
    and-int/lit16 v14, v10, 0x180

    if-nez v14, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x100

    goto :goto_3

    :cond_4
    const/16 v14, 0x80

    :goto_3
    or-int/2addr v13, v14

    :cond_5
    and-int/lit16 v14, v10, 0xc00

    if-nez v14, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x800

    goto :goto_4

    :cond_6
    const/16 v14, 0x400

    :goto_4
    or-int/2addr v13, v14

    :cond_7
    and-int/lit16 v14, v10, 0x6000

    if-nez v14, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x4000

    goto :goto_5

    :cond_8
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v13, v14

    :cond_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v10

    if-nez v14, :cond_b

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v14, 0x10000

    :goto_6
    or-int/2addr v13, v14

    :cond_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v10

    if-nez v14, :cond_d

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v14, 0x80000

    :goto_7
    or-int/2addr v13, v14

    :cond_d
    const/high16 v14, 0xc00000

    and-int/2addr v14, v10

    if-nez v14, :cond_f

    invoke-virtual {v12, v8}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x400000

    :goto_8
    or-int/2addr v13, v14

    :cond_f
    const/high16 v14, 0x6000000

    and-int/2addr v14, v10

    if-nez v14, :cond_11

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v14, 0x2000000

    :goto_9
    or-int/2addr v13, v14

    :cond_11
    const v14, 0x2492493

    and-int/2addr v14, v13

    const v15, 0x2492492

    if-ne v14, v15, :cond_13

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v5, v3

    goto/16 :goto_16

    :cond_13
    :goto_a
    const v14, 0x37318bc5

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    const/high16 v14, 0x380000

    and-int/2addr v14, v13

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_14

    const/4 v14, 0x1

    goto :goto_b

    :cond_14
    const/4 v14, 0x0

    :goto_b
    const/high16 v15, 0x1c00000

    and-int/2addr v15, v13

    const/high16 v10, 0x800000

    if-ne v15, v10, :cond_15

    const/4 v10, 0x1

    goto :goto_c

    :cond_15
    const/4 v10, 0x0

    :goto_c
    or-int/2addr v10, v14

    const/high16 v14, 0xe000000

    and-int/2addr v14, v13

    const/high16 v15, 0x4000000

    if-ne v14, v15, :cond_16

    const/4 v14, 0x1

    goto :goto_d

    :cond_16
    const/4 v14, 0x0

    :goto_d
    or-int/2addr v10, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v10, :cond_17

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v14, v10, :cond_18

    :cond_17
    new-instance v14, Li40/k;

    invoke-direct {v14, v7, v8, v9}, Li40/k;-><init>(ZFLl0/l1;)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v14, Li40/k;

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    sget-object v10, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v12, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/m;

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 p9, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_19

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v12, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x3e6878c9

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_1f

    const-string v7, "Leading"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, Li40/a;->d:Landroidx/compose/ui/Modifier;

    invoke-interface {v7, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v16, v0

    const/4 v15, 0x0

    invoke-static {v11, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v15, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v17, v15

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_1c

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v12, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, p9, 0xc

    and-int/lit8 v0, v0, 0xe

    const/4 v7, 0x1

    invoke-static {v0, v5, v12, v7}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    :goto_10
    const/4 v10, 0x0

    goto :goto_11

    :cond_1f
    move-object/from16 v16, v0

    move-object/from16 v17, v10

    goto :goto_10

    :goto_11
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    const v0, 0x3e689c6c

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    if-eqz v6, :cond_23

    const-string v0, "Trailing"

    invoke-static {v3, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Li40/a;->d:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_20

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_20
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_21

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_22

    :cond_21
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, p9, 0xf

    and-int/lit8 v0, v0, 0xe

    const/4 v7, 0x1

    invoke-static {v0, v6, v12, v7}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    const/4 v10, 0x0

    :cond_23
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object/from16 v9, p8

    move-object/from16 v15, v17

    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v0

    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v7

    if-eqz v5, :cond_24

    sget v11, Li40/a;->c:F

    sub-float/2addr v0, v11

    int-to-float v11, v10

    cmpg-float v15, v0, v11

    if-gez v15, :cond_24

    move v0, v11

    :cond_24
    move/from16 v19, v0

    if-eqz v6, :cond_25

    sget v0, Li40/a;->c:F

    sub-float/2addr v7, v0

    int-to-float v0, v10

    cmpg-float v10, v7, v0

    if-gez v10, :cond_25

    move v7, v0

    :cond_25
    move/from16 v21, v7

    const/16 v22, 0x0

    const/16 v23, 0xa

    const/16 v20, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v7, 0x3e691a2d

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    if-eqz v4, :cond_26

    const-string v7, "Hint"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shr-int/lit8 v10, p9, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v7, v12, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    const v7, 0x3e692a45

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    if-eqz p2, :cond_2a

    const-string v7, "Label"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v11, v16

    invoke-static {v11, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_27

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_27
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v12, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_28

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_29

    :cond_28
    invoke-static {v4, v12, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_29
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, p9, 0x6

    and-int/lit8 v4, v4, 0xe

    move-object/from16 v5, p2

    const/4 v7, 0x1

    invoke-static {v4, v5, v12, v7}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    const/4 v10, 0x0

    goto :goto_14

    :cond_2a
    move-object/from16 v5, p2

    move-object/from16 v11, v16

    const/4 v7, 0x1

    :goto_14
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    const-string v4, "TextField"

    invoke-static {v3, v4}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_2b

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_2b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v12, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_2c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    :cond_2c
    invoke-static {v4, v12, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2d
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, p9, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v2, p1

    invoke-virtual {v2, v12, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_2e

    new-instance v0, Lg1/s8;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p10

    move-object v3, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v10}, Lg1/s8;-><init>(Landroidx/compose/ui/Modifier;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/l1;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static final b(IZIIIIJFLl0/l1;)I
    .locals 2

    sget v0, Li40/j;->a:F

    mul-float/2addr v0, p8

    iget v1, p9, Ll0/l1;->b:F

    mul-float/2addr v1, p8

    iget p9, p9, Ll0/l1;->d:F

    mul-float/2addr p9, p8

    invoke-static {p0, p5}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-eqz p1, :cond_0

    int-to-float p1, p2

    add-float/2addr p1, v0

    int-to-float p0, p0

    add-float/2addr p1, p0

    add-float/2addr p1, p9

    goto :goto_0

    :cond_0
    int-to-float p0, p0

    add-float/2addr v1, p0

    add-float p1, v1, p9

    :goto_0
    invoke-static {p1}, Le93/b;->X(F)I

    move-result p0

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p6, p7}, Ly3/a;->j(J)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static final c(Ly2/q0;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ly2/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ly2/a0;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ly2/a0;->T()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method
