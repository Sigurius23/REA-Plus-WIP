.class public abstract Lg1/s6;
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1e

    int-to-float v0, v0

    sput v0, Lg1/s6;->a:F

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lg1/s6;->b:F

    const/16 v0, 0x8

    int-to-float v0, v0

    sput v0, Lg1/s6;->c:F

    const/4 v1, 0x6

    int-to-float v1, v1

    sput v1, Lg1/s6;->d:F

    sput v0, Lg1/s6;->e:F

    const/16 v0, 0x30

    int-to-float v0, v0

    sput v0, Lg1/s6;->f:F

    const/16 v0, 0x44

    int-to-float v0, v0

    sput v0, Lg1/s6;->g:F

    return-void
.end method

.method public static final a(Lx1/b;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x4da5add4    # 3.4745408E8f

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v4, v5

    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v3, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    const/4 v13, 0x0

    const/16 v14, 0xa

    sget-object v9, Lb2/t;->w:Lb2/t;

    sget v10, Lg1/s6;->b:F

    const/4 v11, 0x0

    sget v12, Lg1/s6;->c:F

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v6, v10, :cond_3

    new-instance v6, Lg1/d;

    const/4 v10, 0x3

    invoke-direct {v6, v10}, Lg1/d;-><init>(I)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v6, Ly2/r0;

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v3, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-nez v14, :cond_5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    :cond_5
    invoke-static {v10, v3, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "text"

    invoke-static {v9, v5}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v14, 0x0

    sget v15, Lg1/s6;->d:F

    invoke-static {v5, v14, v15, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v3}, Lp1/q;->i0()V

    move/from16 v16, v4

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-eqz v4, :cond_7

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v3, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v7, v3, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v16, 0xe

    const/4 v5, 0x1

    invoke-static {v4, v0, v3, v5}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    const-string v4, "action"

    invoke-static {v9, v4}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v14, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v3, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    invoke-static {v7, v3, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v3, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v16, 0x3

    and-int/lit8 v4, v4, 0xe

    const/4 v5, 0x1

    invoke-static {v4, v1, v3, v5, v5}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_6

    :cond_d
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_e

    new-instance v4, Lf01/f;

    const/16 v5, 0xe

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v2, p1

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, -0x27813828

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    move-object/from16 v11, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v10, 0x180

    const/4 v4, 0x0

    if-nez v3, :cond_5

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v10, 0xc00

    move-object/from16 v12, p2

    if-nez v3, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v1, v3

    :cond_7
    and-int/lit16 v3, v10, 0x6000

    move-wide/from16 v13, p3

    if-nez v3, :cond_9

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v1, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v10

    move-wide/from16 v6, p5

    if-nez v3, :cond_b

    invoke-virtual {v0, v6, v7}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v1, v3

    :cond_b
    const/high16 v3, 0x180000

    and-int v5, v10, v3

    move/from16 v8, p7

    if-nez v5, :cond_d

    invoke-virtual {v0, v8}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_c

    const/high16 v5, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v5, 0x80000

    :goto_7
    or-int/2addr v1, v5

    :cond_d
    const/high16 v5, 0xc00000

    and-int/2addr v5, v10

    if-nez v5, :cond_f

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v5, 0x400000

    :goto_8
    or-int/2addr v1, v5

    :cond_f
    const v5, 0x492493

    and-int/2addr v5, v1

    const v15, 0x492492

    if-eq v5, v15, :cond_10

    const/4 v4, 0x1

    :cond_10
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v0, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v4, v10, 0x1

    if-eqz v4, :cond_12

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_12
    :goto_9
    invoke-virtual {v0}, Lp1/q;->r()V

    new-instance v4, Lg1/i;

    const/4 v5, 0x4

    invoke-direct {v4, v2, v9, v5}, Lg1/i;-><init>(Lc93/m;Lx1/b;I)V

    const v5, -0x552ddae4

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    and-int/lit8 v4, v1, 0xe

    or-int/2addr v3, v4

    shr-int/lit8 v4, v1, 0x6

    and-int/lit8 v5, v4, 0x70

    or-int/2addr v3, v5

    and-int/lit16 v5, v4, 0x380

    or-int/2addr v3, v5

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shr-int/lit8 v1, v1, 0x3

    const/high16 v4, 0x70000

    and-int/2addr v1, v4

    or-int v21, v3, v1

    const/16 v22, 0x10

    const/16 v17, 0x0

    move-object/from16 v20, v0

    move-wide v15, v6

    move/from16 v18, v8

    invoke-static/range {v11 .. v22}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_13
    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_a
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_14

    new-instance v0, Lg1/j0;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Lg1/j0;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;JJFLx1/b;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final c(Lg1/l6;Landroidx/compose/ui/Modifier;Li2/a1;JJJFLandroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v1, p0

    move/from16 v11, p11

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v0, 0xf6ad9ce

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v11, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v11

    goto :goto_2

    :cond_2
    move v0, v11

    :goto_2
    or-int/lit16 v2, v0, 0x1b0

    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_3

    or-int/lit16 v2, v0, 0x5b0

    :cond_3
    and-int/lit16 v0, v11, 0x6000

    if-nez v0, :cond_4

    or-int/lit16 v2, v2, 0x2000

    :cond_4
    const/high16 v0, 0x30000

    and-int/2addr v0, v11

    if-nez v0, :cond_5

    const/high16 v0, 0x10000

    or-int/2addr v2, v0

    :cond_5
    const/high16 v0, 0x180000

    and-int/2addr v0, v11

    if-nez v0, :cond_6

    const/high16 v0, 0x80000

    or-int/2addr v2, v0

    :cond_6
    const/high16 v0, 0xc00000

    or-int/2addr v2, v0

    const v3, 0x492493

    and-int/2addr v3, v2

    const v4, 0x492492

    if-eq v3, v4, :cond_7

    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v9, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v3, v11, 0x1

    const v4, -0x3ffc01

    if-eqz v3, :cond_9

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/2addr v2, v4

    move-object/from16 v12, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v10, p9

    move v13, v2

    move-object/from16 v2, p2

    goto/16 :goto_6

    :cond_9
    :goto_4
    sget-object v3, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v9, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg1/l5;

    iget-object v3, v3, Lg1/l5;->a:Lt0/a;

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/c1;

    invoke-virtual {v7}, Lg1/c1;->e()J

    move-result-wide v7

    const v10, 0x3f4ccccd    # 0.8f

    invoke-static {v10, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->h()J

    move-result-wide v12

    invoke-static {v7, v8, v12, v13}, Li2/w0;->p(JJ)J

    move-result-wide v7

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg1/c1;

    invoke-virtual {v10}, Lg1/c1;->h()J

    move-result-wide v12

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/c1;

    invoke-virtual {v6}, Lg1/c1;->i()Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-virtual {v6}, Lg1/c1;->f()J

    move-result-wide v14

    move v10, v4

    invoke-virtual {v6}, Lg1/c1;->h()J

    move-result-wide v4

    const v6, 0x3f19999a    # 0.6f

    invoke-static {v6, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-static {v4, v5, v14, v15}, Li2/w0;->p(JJ)J

    move-result-wide v4

    goto :goto_5

    :cond_a
    move v10, v4

    iget-object v4, v6, Lg1/c1;->b:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v4, v4, Li2/x;->a:J

    :goto_5
    and-int/2addr v2, v10

    const/4 v6, 0x6

    int-to-float v6, v6

    sget-object v10, Lb2/t;->w:Lb2/t;

    move-wide/from16 v18, v12

    move v13, v2

    move-object v2, v3

    move-object v12, v10

    move v10, v6

    move-wide/from16 v20, v7

    move-wide v7, v4

    move-wide/from16 v3, v20

    move-wide/from16 v5, v18

    :goto_6
    invoke-virtual {v9}, Lp1/q;->r()V

    iget-object v14, v1, Lg1/l6;->b:Ljava/lang/String;

    if-eqz v14, :cond_b

    const v15, 0x23603ae4

    invoke-virtual {v9, v15}, Lp1/q;->e0(I)V

    new-instance v15, Lg1/r6;

    const/16 v16, 0x0

    move-object/from16 p2, v1

    move-wide/from16 p3, v7

    move-object/from16 p5, v14

    move-object/from16 p1, v15

    move/from16 p6, v16

    invoke-direct/range {p1 .. p6}, Lg1/r6;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    move-object/from16 v1, p1

    move-object/from16 v14, p2

    move-wide/from16 v15, p3

    const v7, 0x6de142b0

    invoke-static {v7, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    move-object v14, v1

    move-wide v15, v7

    const/4 v7, 0x0

    const v1, 0x2364cab8

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    :goto_7
    const/16 v7, 0xc

    int-to-float v7, v7

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v8, Lg1/k6;

    move/from16 p10, v0

    const/4 v0, 0x1

    invoke-direct {v8, v14, v0}, Lg1/k6;-><init>(Lg1/l6;I)V

    const v0, -0xf9b7319

    invoke-static {v0, v9, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    and-int/lit16 v0, v13, 0x380

    or-int v0, v0, p10

    shr-int/lit8 v13, v13, 0x3

    const/high16 v17, 0x380000

    and-int v13, v13, v17

    or-int/2addr v0, v13

    move/from16 v18, v10

    move v10, v0

    move-object v0, v7

    move/from16 v7, v18

    invoke-static/range {v0 .. v10}, Lg1/s6;->b(Landroidx/compose/ui/Modifier;Lc93/m;Li2/a1;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V

    move v10, v7

    move-object v0, v9

    move-wide v8, v15

    move-wide v6, v5

    move-wide v4, v3

    move-object v3, v2

    move-object v2, v12

    goto :goto_8

    :cond_c
    move-object v14, v1

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move/from16 v10, p9

    move-object v0, v9

    move-wide/from16 v8, p7

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_d

    new-instance v0, Lg1/o6;

    move-object v1, v14

    invoke-direct/range {v0 .. v11}, Lg1/o6;-><init>(Lg1/l6;Landroidx/compose/ui/Modifier;Li2/a1;JJJFI)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final d(Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    check-cast p1, Lp1/q;

    const v0, 0x147e2eba

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_2

    sget-object v1, Lg1/d;->d:Lg1/d;

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Ly2/r0;

    iget-wide v5, p1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {p1, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v9, p1, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {p1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_2
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {p1, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, p1, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v2, p1, v2, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p1, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v7, Lg1/s6;->b:F

    sget v10, Lg1/s6;->d:F

    invoke-static {v6, v7, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->w:Lb2/m;

    invoke-static {v7, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, p1, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {p1, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v11, p1, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {p1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_3
    invoke-static {p1, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, p1, Lp1/q;->S:Z

    if-nez v1, :cond_7

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    :cond_7
    invoke-static {v7, p1, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {p1, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lf1/z;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lf1/z;-><init>(Lx1/b;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method
