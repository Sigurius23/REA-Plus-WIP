.class public final Ln1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln1/g;

.field public static final b:Lt0/i;

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln1/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln1/g;->a:Ln1/g;

    sget-object v0, Lt0/j;->a:Lt0/i;

    sput-object v0, Ln1/g;->b:Lt0/i;

    const/16 v0, 0x50

    int-to-float v0, v0

    sput v0, Ln1/g;->c:F

    sput v0, Ln1/g;->d:F

    sget v0, Lo1/j;->c:F

    sput v0, Ln1/g;->e:F

    return-void
.end method


# virtual methods
.method public final a(Ln1/o;ZLandroidx/compose/ui/Modifier;JJFLandroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v2, p2

    move-object/from16 v10, p9

    check-cast v10, Lp1/q;

    const v0, -0x402fbc70

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p10, v0

    invoke-virtual {v10, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-object/from16 v3, p3

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    const v1, 0x12400

    or-int/2addr v0, v1

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/high16 v1, 0x100000

    goto :goto_3

    :cond_3
    const/high16 v1, 0x80000

    :goto_3
    or-int/2addr v0, v1

    const v1, 0x92493

    and-int/2addr v1, v0

    const v4, 0x92492

    if-eq v1, v4, :cond_4

    const/4 v1, 0x1

    goto :goto_4

    :cond_4
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v10, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v1, p10, 0x1

    const v4, -0x7fc01

    if-eqz v1, :cond_6

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/2addr v0, v4

    move-wide/from16 v6, p4

    move-wide/from16 v12, p6

    move/from16 v4, p8

    goto :goto_6

    :cond_6
    :goto_5
    sget-object v1, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll1/m;

    iget-wide v5, v5, Ll1/m;->G:J

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/m;

    iget-wide v7, v1, Ll1/m;->s:J

    and-int/2addr v0, v4

    sget v1, Ln1/g;->d:F

    move v4, v1

    move-wide v12, v7

    move-wide v6, v5

    :goto_6
    invoke-virtual {v10}, Lp1/q;->r()V

    new-instance v1, Lb30/f3;

    invoke-direct {v1, v2, v12, v13, p1}, Lb30/f3;-><init>(ZJLn1/o;)V

    const v5, 0x11c6ab49

    invoke-static {v5, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    and-int/lit8 v1, v0, 0xe

    const/high16 v5, 0xc00000

    or-int/2addr v1, v5

    and-int/lit8 v5, v0, 0x70

    or-int/2addr v1, v5

    and-int/lit16 v5, v0, 0x380

    or-int/2addr v1, v5

    shl-int/lit8 v0, v0, 0x6

    const/high16 v5, 0xe000000

    and-int/2addr v0, v5

    or-int v11, v1, v0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v11}, Ln1/g;->b(Ln1/o;ZLandroidx/compose/ui/Modifier;FLi2/a1;JFLx1/b;Landroidx/compose/runtime/Composer;I)V

    move v9, v4

    move-wide v5, v6

    move-wide v7, v12

    goto :goto_7

    :cond_7
    invoke-virtual {v10}, Lp1/q;->X()V

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move/from16 v9, p8

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_8

    new-instance v0, Ln1/c;

    move-object v1, p0

    move-object v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ln1/c;-><init>(Ln1/g;Ln1/o;ZLandroidx/compose/ui/Modifier;JJFI)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public final b(Ln1/o;ZLandroidx/compose/ui/Modifier;FLi2/a1;JFLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v0, p6

    move-object/from16 v2, p9

    move/from16 v11, p11

    move-object/from16 v3, p10

    check-cast v3, Lp1/q;

    const v6, -0x4ff03da9

    invoke-virtual {v3, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v11, 0x6

    if-nez v6, :cond_1

    move-object/from16 v6, p1

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v11

    goto :goto_1

    :cond_1
    move-object/from16 v6, p1

    move v8, v11

    :goto_1
    and-int/lit8 v9, v11, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p2

    invoke-virtual {v3, v9}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x20

    goto :goto_2

    :cond_2
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v8, v12

    goto :goto_3

    :cond_3
    move/from16 v9, p2

    :goto_3
    and-int/lit16 v12, v11, 0x180

    if-nez v12, :cond_5

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_4

    :cond_4
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v8, v12

    :cond_5
    and-int/lit16 v12, v11, 0xc00

    if-nez v12, :cond_7

    invoke-virtual {v3, v5}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_5

    :cond_6
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v8, v12

    :cond_7
    and-int/lit16 v12, v11, 0x6000

    if-nez v12, :cond_8

    or-int/lit16 v8, v8, 0x2000

    :cond_8
    const/high16 v12, 0x30000

    and-int/2addr v12, v11

    if-nez v12, :cond_a

    invoke-virtual {v3, v0, v1}, Lp1/q;->f(J)Z

    move-result v12

    if-eqz v12, :cond_9

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_9
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v8, v12

    :cond_a
    const/high16 v12, 0x180000

    and-int/2addr v12, v11

    if-nez v12, :cond_b

    const/high16 v12, 0x80000

    or-int/2addr v8, v12

    :cond_b
    const/high16 v12, 0xc00000

    and-int/2addr v12, v11

    if-nez v12, :cond_d

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x800000

    goto :goto_7

    :cond_c
    const/high16 v12, 0x400000

    :goto_7
    or-int/2addr v8, v12

    :cond_d
    const/high16 v12, 0x6000000

    and-int/2addr v12, v11

    if-nez v12, :cond_f

    move-object/from16 v12, p0

    invoke-virtual {v3, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x4000000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x2000000

    :goto_8
    or-int/2addr v8, v14

    goto :goto_9

    :cond_f
    move-object/from16 v12, p0

    :goto_9
    const v14, 0x2492493

    and-int/2addr v14, v8

    const v15, 0x2492492

    if-eq v14, v15, :cond_10

    const/4 v14, 0x1

    goto :goto_a

    :cond_10
    const/4 v14, 0x0

    :goto_a
    and-int/lit8 v15, v8, 0x1

    invoke-virtual {v3, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_1e

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v14, v11, 0x1

    const v15, -0x38e001

    if-eqz v14, :cond_12

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v14

    if-eqz v14, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int/2addr v8, v15

    move-object/from16 v14, p5

    move/from16 v9, p8

    :goto_b
    move v15, v8

    goto :goto_d

    :cond_12
    :goto_c
    and-int/2addr v8, v15

    sget-object v14, Ln1/g;->b:Lt0/i;

    sget v15, Ln1/g;->e:F

    move v9, v15

    goto :goto_b

    :goto_d
    invoke-virtual {v3}, Lp1/q;->r()V

    sget v8, Ln1/h;->d:F

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v13, v10, :cond_13

    new-instance v13, Lmx1/o;

    const/16 v7, 0x8

    invoke-direct {v13, v7}, Lmx1/o;-><init>(I)V

    invoke-virtual {v3, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v13}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v7, v15, 0xe

    const/4 v8, 0x4

    if-ne v7, v8, :cond_14

    const/4 v7, 0x1

    goto :goto_e

    :cond_14
    const/4 v7, 0x0

    :goto_e
    and-int/lit8 v8, v15, 0x70

    const/16 v4, 0x20

    if-ne v8, v4, :cond_15

    const/4 v4, 0x1

    goto :goto_f

    :cond_15
    const/4 v4, 0x0

    :goto_f
    or-int/2addr v4, v7

    and-int/lit16 v7, v15, 0x1c00

    xor-int/lit16 v7, v7, 0xc00

    const/16 v8, 0x800

    if-le v7, v8, :cond_16

    invoke-virtual {v3, v5}, Lp1/q;->d(F)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    and-int/lit16 v7, v15, 0xc00

    if-ne v7, v8, :cond_18

    :cond_17
    const/4 v7, 0x1

    goto :goto_10

    :cond_18
    const/4 v7, 0x0

    :goto_10
    or-int/2addr v4, v7

    invoke-virtual {v3, v9}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_1a

    if-ne v7, v10, :cond_19

    goto :goto_11

    :cond_19
    move-object v10, v14

    goto :goto_12

    :cond_1a
    :goto_11
    new-instance v5, Ln1/d;

    move/from16 v7, p2

    move/from16 v8, p4

    move-object v10, v14

    invoke-direct/range {v5 .. v10}, Ln1/d;-><init>(Ln1/o;ZFFLi2/a1;)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v5

    :goto_12
    check-cast v7, Lkotlin/jvm/functions/Function3;

    invoke-static {v13, v7}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v0, v1, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    shr-int/lit8 v6, v15, 0xc

    and-int/lit16 v6, v6, 0x1c00

    or-int/lit8 v6, v6, 0x30

    const/4 v7, 0x0

    invoke-static {v5, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_1b

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1b
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_13
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v3, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-nez v8, :cond_1c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    :cond_1c
    invoke-static {v7, v3, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v6, 0x6

    and-int/lit8 v4, v4, 0x70

    or-int/lit8 v4, v4, 0x6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v5, v3, v4}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    move-object v6, v10

    goto :goto_14

    :cond_1e
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move/from16 v9, p8

    :goto_14
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_1f

    new-instance v0, Ln1/e;

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v7, p6

    move-object v10, v2

    move-object v1, v12

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v11}, Ln1/e;-><init>(Ln1/g;Ln1/o;ZLandroidx/compose/ui/Modifier;FLi2/a1;JFLx1/b;I)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method
