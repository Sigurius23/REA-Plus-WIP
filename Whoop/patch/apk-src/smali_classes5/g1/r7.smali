.class public abstract Lg1/r7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F

.field public static final g:F

.field public static final h:F

.field public static final i:Ld0/e2;

.field public static final j:F

.field public static final k:F

.field public static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x22

    int-to-float v0, v0

    sput v0, Lg1/r7;->a:F

    const/16 v1, 0xe

    int-to-float v1, v1

    sput v1, Lg1/r7;->b:F

    const/16 v1, 0x14

    int-to-float v1, v1

    sput v1, Lg1/r7;->c:F

    const/16 v2, 0x18

    int-to-float v2, v2

    sput v2, Lg1/r7;->d:F

    const/4 v2, 0x2

    int-to-float v2, v2

    sput v2, Lg1/r7;->e:F

    sput v0, Lg1/r7;->f:F

    sput v1, Lg1/r7;->g:F

    sub-float/2addr v0, v1

    sput v0, Lg1/r7;->h:F

    new-instance v0, Ld0/e2;

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v0, v1, v2, v3}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/r7;->i:Ld0/e2;

    const/4 v0, 0x1

    int-to-float v0, v0

    sput v0, Lg1/r7;->j:F

    int-to-float v0, v3

    sput v0, Lg1/r7;->k:F

    const/16 v0, 0x7d

    int-to-float v0, v0

    sput v0, Lg1/r7;->l:F

    return-void
.end method

.method public static final a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/o7;Landroidx/compose/runtime/Composer;II)V
    .locals 39

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p6

    move-object/from16 v5, p5

    check-cast v5, Lp1/q;

    const v0, 0x18ab249

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v4, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit8 v6, p7, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v5, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v0, v9

    :goto_4
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v10, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_7

    move/from16 v10, p3

    invoke-virtual {v5, v10}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_5

    :cond_9
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v0, v11

    :goto_6
    or-int/lit16 v0, v0, 0x6000

    const/high16 v11, 0x30000

    and-int/2addr v11, v7

    if-nez v11, :cond_c

    and-int/lit8 v11, p7, 0x20

    if-nez v11, :cond_a

    move-object/from16 v11, p4

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/high16 v12, 0x20000

    goto :goto_7

    :cond_a
    move-object/from16 v11, p4

    :cond_b
    const/high16 v12, 0x10000

    :goto_7
    or-int/2addr v0, v12

    goto :goto_8

    :cond_c
    move-object/from16 v11, p4

    :goto_8
    const v12, 0x12493

    and-int/2addr v12, v0

    const v13, 0x12492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_d

    move v12, v15

    goto :goto_9

    :cond_d
    move v12, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v5, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_26

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v12, v7, 0x1

    move/from16 v28, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    const v29, -0x70001

    if-eqz v12, :cond_10

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v6, p7, 0x20

    if-eqz v6, :cond_f

    and-int v6, v28, v29

    move-object v9, v5

    move/from16 v28, v6

    :goto_a
    move v5, v14

    goto/16 :goto_e

    :cond_f
    move-object v9, v5

    goto :goto_a

    :cond_10
    :goto_b
    if-eqz v6, :cond_11

    move-object v6, v0

    goto :goto_c

    :cond_11
    move-object v6, v8

    :goto_c
    if-eqz v9, :cond_12

    move/from16 v30, v15

    goto :goto_d

    :cond_12
    move/from16 v30, v10

    :goto_d
    and-int/lit8 v8, p7, 0x20

    if-eqz v8, :cond_13

    const-wide/16 v24, 0x0

    const/16 v27, 0x3ff

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    move/from16 v20, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v26, v22

    move/from16 v31, v23

    const-wide/16 v22, 0x0

    move/from16 v38, v26

    move-object/from16 v26, v5

    move/from16 v5, v38

    invoke-static/range {v8 .. v27}, Ltx/f;->A(JJFJJFJJJJLandroidx/compose/runtime/Composer;I)Lg1/x1;

    move-result-object v8

    move-object/from16 v9, v26

    and-int v10, v28, v29

    move-object v11, v8

    move/from16 v28, v10

    move/from16 v10, v30

    move-object v8, v6

    goto :goto_e

    :cond_13
    move-object v9, v5

    move v5, v14

    move-object v8, v6

    move/from16 v10, v30

    :goto_e
    invoke-virtual {v9}, Lp1/q;->r()V

    const v6, 0x6b471992

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v6, v12, :cond_14

    invoke-static {v9}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_14
    move-object/from16 v17, v6

    check-cast v17, Lj0/i;

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/c;

    sget v14, Lg1/r7;->h:F

    invoke-interface {v13, v14}, Ly3/c;->q0(F)F

    move-result v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v12, :cond_15

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v22, v14

    check-cast v22, Lp1/c1;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    sget v14, Lg1/r7;->l:F

    invoke-interface {v6, v14}, Ly3/c;->q0(F)F

    move-result v6

    invoke-virtual {v9, v13}, Lp1/q;->d(F)Z

    move-result v14

    invoke-virtual {v9, v6}, Lp1/q;->d(F)Z

    move-result v15

    or-int/2addr v14, v15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_16

    if-ne v15, v12, :cond_17

    :cond_16
    new-instance v14, Lg1/k3;

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v18, 0x0

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v15, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v15, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v14, v15}, Lg1/k3;-><init>(Ljava/util/Map;)V

    new-instance v32, Lg1/a0;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v33

    new-instance v3, Lg1/u4;

    invoke-direct {v3, v4}, Lg1/u4;-><init>(I)V

    new-instance v5, Lg1/p7;

    invoke-direct {v5, v6}, Lg1/p7;-><init>(F)V

    new-instance v6, Lgm1/b;

    const/16 v13, 0x1a

    invoke-direct {v6, v13}, Lgm1/b;-><init>(I)V

    sget-object v36, Lg1/r7;->i:Ld0/e2;

    move-object/from16 v34, v3

    move-object/from16 v35, v5

    move-object/from16 v37, v6

    invoke-direct/range {v32 .. v37}, Lg1/a0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/a;Ld0/l;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v15, v32

    move-object/from16 v3, v33

    iget-object v5, v15, Lg1/a0;->n:Lp1/k1;

    invoke-virtual {v5, v14}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v15, v3}, Lg1/a0;->j(Ljava/lang/Object;)Z

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v15, Lg1/a0;

    shr-int/lit8 v13, v28, 0x3

    invoke-static {v2, v9}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    and-int/lit8 v6, v28, 0xe

    invoke-static {v5, v9}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v5

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v14, v14, v18

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v14, v14, v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_19

    if-ne v4, v12, :cond_18

    goto :goto_f

    :cond_18
    move-object v14, v15

    goto :goto_10

    :cond_19
    :goto_f
    new-instance v18, Lb2/y;

    const/16 v23, 0x0

    const/16 v24, 0x7

    move-object/from16 v21, v3

    move-object/from16 v20, v5

    move-object/from16 v19, v15

    invoke-direct/range {v18 .. v24}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v4, v18

    move-object/from16 v14, v19

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v4, Lc93/m;

    invoke-static {v9, v4, v14}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface/range {v22 .. v22}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x4

    if-ne v6, v5, :cond_1a

    const/4 v5, 0x1

    goto :goto_11

    :cond_1a
    const/4 v5, 0x0

    :goto_11
    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    const/4 v15, 0x0

    if-nez v5, :cond_1b

    if-ne v6, v12, :cond_1c

    :cond_1b
    new-instance v6, Lf1/k1;

    invoke-direct {v6, v1, v14, v15}, Lf1/k1;-><init>(ZLg1/a0;Lq83/d;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v6, Lc93/m;

    invoke-static {v3, v4, v6, v9}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object v3, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v9, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Ly3/m;->x:Ly3/m;

    if-ne v3, v4, :cond_1d

    const/16 v21, 0x1

    goto :goto_12

    :cond_1d
    const/16 v21, 0x0

    :goto_12
    if-eqz v2, :cond_1e

    new-instance v5, Li3/i;

    const/4 v3, 0x2

    invoke-direct {v5, v3}, Li3/i;-><init>(I)V

    move/from16 v25, v3

    const/4 v3, 0x0

    move-object v6, v2

    move v4, v10

    move-object/from16 v2, v17

    move/from16 v10, v25

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/d;->a(Landroidx/compose/ui/Modifier;ZLj0/i;Lf0/v0;ZLi3/i;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v1, v4

    goto :goto_13

    :cond_1e
    move v1, v10

    const/4 v10, 0x2

    move-object v3, v0

    :goto_13
    if-eqz p1, :cond_1f

    sget-object v0, Lg1/h3;->a:Lp1/u2;

    sget-object v0, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    :cond_1f
    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lh0/d2;->x:Lh0/d2;

    if-eqz v1, :cond_20

    if-eqz p1, :cond_20

    const/16 v16, 0x1

    goto :goto_14

    :cond_20
    const/16 v16, 0x0

    :goto_14
    iget-object v3, v14, Lg1/a0;->f:Lg1/z;

    new-instance v4, Lg1/m;

    invoke-direct {v4, v14, v15}, Lg1/m;-><init>(Lg1/a0;Lq83/d;)V

    const/16 v22, 0x20

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v15, v2

    move-object/from16 v20, v4

    move v2, v13

    move-object v13, v0

    move-object v0, v14

    move-object v14, v3

    invoke-static/range {v13 .. v22}, Lh0/k1;->a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v3, v4, v5, v10}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v4, Lg1/r7;->e:F

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v4, Lg1/r7;->f:F

    sget v6, Lg1/r7;->g:F

    invoke-static {v3, v4, v6}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_21

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_21
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_15
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_22

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_23

    :cond_22
    invoke-static {v5, v9, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v3, v0, Lg1/a0;->h:Lp1/f0;

    invoke-virtual {v3}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_24

    if-ne v5, v12, :cond_25

    :cond_24
    new-instance v5, Lg1/t;

    const/4 v4, 0x5

    invoke-direct {v5, v0, v4}, Lg1/t;-><init>(Lg1/a0;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v5, Lc93/a;

    and-int/lit16 v0, v2, 0x380

    const/4 v2, 0x6

    or-int/2addr v0, v2

    shr-int/lit8 v2, v28, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int v6, v0, v2

    move v0, v3

    move-object v3, v5

    move-object v5, v9

    move-object v2, v11

    move-object/from16 v4, v17

    invoke-static/range {v0 .. v6}, Lg1/r7;->b(ZZLg1/o7;Lc93/a;Lj0/i;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move v4, v1

    move-object v5, v2

    :goto_16
    move-object v3, v8

    goto :goto_17

    :cond_26
    move-object v9, v5

    invoke-virtual {v9}, Lp1/q;->X()V

    move v4, v10

    move-object v5, v11

    goto :goto_16

    :goto_17
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_27

    new-instance v0, Lep1/p;

    const/4 v8, 0x4

    move/from16 v1, p0

    move-object/from16 v2, p1

    move v6, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method public static final b(ZZLg1/o7;Lc93/a;Lj0/i;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x439fbf2

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-nez v0, :cond_1

    invoke-virtual {v11, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v0, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v6

    const/high16 v8, 0x20000

    if-nez v7, :cond_b

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    move v7, v8

    goto :goto_6

    :cond_a
    const/high16 v7, 0x10000

    :goto_6
    or-int/2addr v0, v7

    :cond_b
    const v7, 0x12493

    and-int/2addr v7, v0

    const v9, 0x12492

    const/16 v16, 0x1

    const/4 v10, 0x0

    if-eq v7, v9, :cond_c

    move/from16 v7, v16

    goto :goto_7

    :cond_c
    move v7, v10

    :goto_7
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_d

    new-instance v7, Lz1/p;

    invoke-direct {v7}, Lz1/p;-><init>()V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lz1/p;

    const/high16 v12, 0x70000

    and-int/2addr v12, v0

    if-ne v12, v8, :cond_e

    move/from16 v8, v16

    goto :goto_8

    :cond_e
    move v8, v10

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_f

    if-ne v12, v9, :cond_10

    :cond_f
    new-instance v12, Lg1/o1;

    const/4 v8, 0x2

    const/4 v13, 0x0

    invoke-direct {v12, v5, v7, v13, v8}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v12, Lc93/m;

    invoke-static {v11, v12, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7}, Lz1/p;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_11

    sget v7, Lg1/r7;->k:F

    :goto_9
    move/from16 v18, v7

    goto :goto_a

    :cond_11
    sget v7, Lg1/r7;->j:F

    goto :goto_9

    :goto_a
    move-object v7, v3

    check-cast v7, Lg1/x1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, -0x461d9342

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_13

    if-eqz v1, :cond_12

    iget-wide v12, v7, Lg1/x1;->b:J

    goto :goto_b

    :cond_12
    iget-wide v12, v7, Lg1/x1;->d:J

    goto :goto_b

    :cond_13
    if-eqz v1, :cond_14

    iget-wide v12, v7, Lg1/x1;->f:J

    goto :goto_b

    :cond_14
    iget-wide v12, v7, Lg1/x1;->h:J

    :goto_b
    new-instance v8, Li2/x;

    invoke-direct {v8, v12, v13}, Li2/x;-><init>(J)V

    invoke-static {v8, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v8

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    sget-object v12, Lb2/e;->E:Lb2/m;

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-virtual {v15, v13, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v14, :cond_15

    if-ne v10, v9, :cond_16

    :cond_15
    new-instance v10, Lf1/a0;

    const/16 v14, 0x9

    invoke-direct {v10, v14, v8}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    invoke-static {v12, v10, v11, v8}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const v8, -0x3f58d77

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-eqz v2, :cond_18

    if-eqz v1, :cond_17

    iget-wide v7, v7, Lg1/x1;->a:J

    goto :goto_c

    :cond_17
    iget-wide v7, v7, Lg1/x1;->c:J

    goto :goto_c

    :cond_18
    if-eqz v1, :cond_19

    iget-wide v7, v7, Lg1/x1;->e:J

    goto :goto_c

    :cond_19
    iget-wide v7, v7, Lg1/x1;->g:J

    :goto_c
    new-instance v10, Li2/x;

    invoke-direct {v10, v7, v8}, Li2/x;-><init>(J)V

    invoke-static {v10, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    sget-object v10, Lg1/u2;->a:Lp1/u2;

    invoke-virtual {v11, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/s1;

    sget-object v12, Lg1/u2;->b:Lp1/b0;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/f;

    iget v12, v12, Ly3/f;->w:F

    add-float v12, v12, v18

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Li2/x;

    move-object/from16 v19, v9

    iget-wide v8, v14, Li2/x;->a:J

    sget-object v14, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v11, v14}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lg1/c1;

    move/from16 v21, v0

    invoke-virtual {v14}, Lg1/c1;->h()J

    move-result-wide v0

    invoke-static {v8, v9, v0, v1}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1a

    if-eqz v10, :cond_1a

    const v0, -0x2838f045

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v8, v0, Li2/x;->a:J

    move-object v7, v10

    move v10, v12

    const/4 v12, 0x0

    move-object/from16 v1, v19

    const/4 v0, 0x0

    invoke-virtual/range {v7 .. v12}, Lg1/s1;->a(JFLandroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_1a
    move-object/from16 v1, v19

    const/4 v0, 0x0

    const v8, -0x283794da

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v7, v7, Li2/x;->a:J

    :goto_d
    const/4 v12, 0x0

    move-object v9, v13

    const/16 v13, 0xe

    move-object v10, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move-object v0, v14

    const/16 v14, 0x4000

    invoke-static/range {v7 .. v13}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v7

    sget-object v8, Lb2/e;->z:Lb2/m;

    invoke-virtual {v15, v0, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v8, 0xe000

    and-int v8, v21, v8

    if-ne v8, v14, :cond_1b

    goto :goto_e

    :cond_1b
    const/16 v16, 0x0

    :goto_e
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v16, :cond_1c

    if-ne v8, v1, :cond_1d

    :cond_1c
    new-instance v8, Laz1/b;

    const/16 v1, 0x1d

    invoke-direct {v8, v4, v1}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/a;->l(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lg1/r7;->d:F

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    const/4 v12, 0x0

    invoke-static {v8, v9, v10, v12, v1}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v1

    invoke-static {v0, v5, v1}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lg1/r7;->c:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    sget-object v19, Lt0/j;->a:Lt0/i;

    const-wide/16 v23, 0x0

    const/16 v25, 0x18

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-static/range {v17 .. v25}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v7, v7, Li2/x;->a:J

    invoke-static {v0, v7, v8, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_f

    :cond_1e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Ld30/k0;

    const/4 v7, 0x1

    move/from16 v1, p0

    invoke-direct/range {v0 .. v7}, Ld30/k0;-><init>(ZZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method
