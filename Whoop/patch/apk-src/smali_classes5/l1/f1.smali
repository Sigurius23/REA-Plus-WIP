.class public abstract Ll1/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:Ll0/l1;

.field public static final e:Ll0/l1;

.field public static final f:Ll0/l1;

.field public static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x30

    int-to-float v0, v0

    sput v0, Ll1/f1;->a:F

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Ll1/f1;->b:F

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Ll1/f1;->c:F

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v0, v1}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v1

    sput-object v1, Ll1/f1;->d:Ll0/l1;

    const/16 v1, 0x18

    int-to-float v1, v1

    const/16 v3, 0x10

    int-to-float v3, v3

    const/16 v4, 0x8

    invoke-static {v1, v3, v0, v2, v4}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v4

    sput-object v4, Ll1/f1;->e:Ll0/l1;

    const/4 v4, 0x2

    invoke-static {v1, v2, v0, v0, v4}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v0

    sput-object v0, Ll1/f1;->f:Ll0/l1;

    sput v3, Ll1/f1;->g:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Ll1/y;Ll3/v0;FLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v4, p4

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object/from16 v7, p8

    check-cast v7, Lp1/q;

    const v0, 0x5bbd4dd3

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    move-object/from16 v10, p0

    if-nez v0, :cond_1

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v1, v9, 0x30

    move-object/from16 v2, p1

    if-nez v1, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v9, 0x180

    if-nez v1, :cond_5

    move-object/from16 v1, p2

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    goto :goto_4

    :cond_5
    move-object/from16 v1, p2

    :goto_4
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_7

    move-object/from16 v3, p3

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    goto :goto_6

    :cond_7
    move-object/from16 v3, p3

    :goto_6
    and-int/lit16 v5, v9, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_7

    :cond_8
    const/16 v5, 0x2000

    :goto_7
    or-int/2addr v0, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v9

    move-object/from16 v6, p5

    if-nez v5, :cond_b

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v5, 0x10000

    :goto_8
    or-int/2addr v0, v5

    :cond_b
    const/high16 v5, 0x180000

    and-int/2addr v5, v9

    if-nez v5, :cond_d

    move/from16 v5, p6

    invoke-virtual {v7, v5}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v11, 0x80000

    :goto_9
    or-int/2addr v0, v11

    goto :goto_a

    :cond_d
    move/from16 v5, p6

    :goto_a
    const/high16 v11, 0xc00000

    and-int/2addr v11, v9

    if-nez v11, :cond_f

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v11, 0x400000

    :goto_b
    or-int/2addr v0, v11

    :cond_f
    move/from16 v19, v0

    const v0, 0x492493

    and-int v0, v19, v0

    const v11, 0x492492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v0, v11, :cond_10

    move v0, v13

    goto :goto_c

    :cond_10
    move v0, v12

    :goto_c
    and-int/lit8 v11, v19, 0x1

    invoke-virtual {v7, v11, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_15

    sget v11, Lo1/g;->d:F

    const/4 v14, 0x0

    const/16 v15, 0xe

    move v0, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v10, v12, :cond_11

    new-instance v10, Lkx1/b;

    const/16 v12, 0xb

    invoke-direct {v10, v12}, Lkx1/b;-><init>(I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v0, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    iget-wide v11, v4, Ll1/y;->a:J

    sget-object v13, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v7, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_12

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_d
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_14

    :cond_13
    invoke-static {v11, v7, v11, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v7, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-wide v11, v4, Ll1/y;->b:J

    iget-wide v13, v4, Ll1/y;->c:J

    new-instance v0, Lg1/e0;

    const/4 v6, 0x1

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg1/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x62d8ba5e

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    and-int/lit8 v0, v19, 0x70

    const v1, 0x30006

    or-int/2addr v0, v1

    const v1, 0xe000

    shr-int/lit8 v2, v19, 0x6

    and-int/2addr v1, v2

    or-int v18, v0, v1

    move-object/from16 v10, p1

    move/from16 v15, p6

    move-object/from16 v17, v7

    invoke-static/range {v10 .. v18}, Ll1/f1;->d(Lc93/m;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, v17

    shr-int/lit8 v1, v19, 0x15

    and-int/lit8 v1, v1, 0xe

    const/4 v2, 0x1

    invoke-static {v1, v8, v0, v2}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_e

    :cond_15
    move-object v0, v7

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_16

    new-instance v0, Lb30/q2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lb30/q2;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Ll1/y;Ll3/v0;FLx1/b;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final b(Ll1/g1;Landroidx/compose/ui/Modifier;Ll1/e0;Ll1/y;Lc93/m;Lc93/m;ZLg2/s;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v10, p6

    move/from16 v11, p9

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v0, 0x41e42a1f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    or-int/lit8 v2, v0, 0x30

    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_2

    or-int/lit16 v2, v0, 0xb0

    :cond_2
    and-int/lit16 v0, v11, 0xc00

    if-nez v0, :cond_4

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x800

    goto :goto_2

    :cond_3
    const/16 v0, 0x400

    :goto_2
    or-int/2addr v2, v0

    :cond_4
    const v0, 0x36000

    or-int/2addr v0, v2

    const/high16 v2, 0x180000

    and-int/2addr v2, v11

    if-nez v2, :cond_6

    invoke-virtual {v8, v10}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_5

    const/high16 v2, 0x100000

    goto :goto_3

    :cond_5
    const/high16 v2, 0x80000

    :goto_3
    or-int/2addr v0, v2

    :cond_6
    const/high16 v2, 0xc00000

    or-int/2addr v0, v2

    const v2, 0x492493

    and-int/2addr v2, v0

    const v3, 0x492492

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v2, v3, :cond_7

    move v2, v6

    goto :goto_4

    :cond_7
    move v2, v5

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v2, v11, 0x1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_9

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit16 v0, v0, -0x381

    move-object/from16 v13, p1

    move-object/from16 v2, p2

    move-object/from16 v7, p4

    move-object/from16 v9, p5

    move-object/from16 v12, p7

    :goto_5
    move v14, v0

    goto :goto_7

    :cond_9
    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_a

    sget-object v2, Ll1/b0;->a:Ll1/b0;

    new-instance v2, Ll1/e0;

    invoke-direct {v2}, Ll1/e0;-><init>()V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Ll1/e0;

    and-int/lit16 v0, v0, -0x381

    new-instance v7, Ll1/r0;

    invoke-direct {v7, v1, v4, v5}, Ll1/r0;-><init>(Ll1/g1;Ll1/y;I)V

    const v9, 0x62b01493

    invoke-static {v9, v8, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    new-instance v9, Lg1/f;

    const/4 v12, 0x7

    invoke-direct {v9, v1, v2, v4, v12}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v12, 0x55c9a7bd

    invoke-static {v12, v8, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_b

    invoke-static {v8}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v12

    :cond_b
    check-cast v12, Lg2/s;

    sget-object v13, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :goto_7
    invoke-virtual {v8}, Lp1/q;->r()V

    move-object v0, v1

    check-cast v0, Ll1/h1;

    iget-object v15, v0, Ll1/h1;->b:Ljava/util/Locale;

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v15, :cond_c

    if-ne v5, v3, :cond_e

    :cond_c
    instance-of v3, v1, Ll1/h1;

    if-eqz v3, :cond_d

    move-object v0, v1

    check-cast v0, Ll1/h1;

    iget-object v0, v0, Ll1/h1;->c:Lm1/q;

    move-object v5, v0

    goto :goto_8

    :cond_d
    iget-object v0, v0, Ll1/h1;->b:Ljava/util/Locale;

    new-instance v3, Lm1/q;

    invoke-direct {v3, v0}, Lm1/q;-><init>(Ljava/util/Locale;)V

    move-object v5, v3

    :goto_8
    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lm1/o;

    if-eqz v10, :cond_f

    const v0, -0x2928f949

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    new-instance v0, Ll1/r0;

    invoke-direct {v0, v1, v4, v6}, Ll1/r0;-><init>(Ll1/g1;Ll1/y;I)V

    const v3, -0x586b5eb3

    invoke-static {v3, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_9
    move-object v15, v0

    goto :goto_a

    :cond_f
    const/4 v3, 0x0

    const v0, -0x29230f21

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_9

    :goto_a
    sget-object v0, Lo1/g;->q:Lo1/c0;

    invoke-static {v0, v8}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v16

    sget v17, Lo1/g;->o:F

    new-instance v0, Lg1/e0;

    const/4 v6, 0x2

    move-object v3, v2

    move-object v2, v5

    move-object v5, v12

    invoke-direct/range {v0 .. v6}, Lg1/e0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v12, v3

    move-object/from16 v18, v5

    const v1, -0x50481e92

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v1, v14, 0x3

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0xd80000

    or-int/2addr v1, v2

    shr-int/lit8 v2, v14, 0x9

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v1, v3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v1, v2

    const v2, 0xe000

    shl-int/lit8 v3, v14, 0x3

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    move-object/from16 v4, p3

    move-object v2, v9

    move-object v3, v15

    move-object/from16 v5, v16

    move/from16 v6, v17

    move v9, v1

    move-object v1, v7

    move-object v7, v0

    move-object v0, v13

    invoke-static/range {v0 .. v9}, Ll1/f1;->a(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lc93/m;Ll1/y;Ll3/v0;FLx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v1

    move-object v6, v2

    move-object v3, v12

    move-object v2, v0

    move-object v0, v8

    move-object/from16 v8, v18

    goto :goto_b

    :cond_10
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object v0, v8

    move-object/from16 v8, p7

    :goto_b
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_11

    new-instance v0, Lb30/e2;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move v7, v10

    move v9, v11

    invoke-direct/range {v0 .. v9}, Lb30/e2;-><init>(Ll1/g1;Landroidx/compose/ui/Modifier;Ll1/e0;Ll1/y;Lc93/m;Lc93/m;ZLg2/s;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final c(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-wide/from16 v1, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v12, p10

    check-cast v12, Lp1/q;

    const v0, -0x19e570ba

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v4, p0

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p11, v0

    invoke-virtual {v12, v1, v2}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v0, v5

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x100

    goto :goto_2

    :cond_2
    const/16 v9, 0x80

    :goto_2
    or-int/2addr v0, v9

    move-object/from16 v9, p4

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    const/16 v11, 0x800

    goto :goto_3

    :cond_3
    const/16 v11, 0x400

    :goto_3
    or-int/2addr v0, v11

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x4000

    goto :goto_4

    :cond_4
    const/16 v11, 0x2000

    :goto_4
    or-int/2addr v0, v11

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/high16 v11, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v11, 0x10000

    :goto_5
    or-int/2addr v0, v11

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/high16 v11, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v11, 0x80000

    :goto_6
    or-int/2addr v0, v11

    move-object/from16 v11, p8

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/high16 v13, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v13, 0x400000

    :goto_7
    or-int/2addr v0, v13

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/high16 v13, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v13, 0x2000000

    :goto_8
    or-int/2addr v0, v13

    const v13, 0x2492493

    and-int/2addr v13, v0

    const v14, 0x2492492

    const/4 v3, 0x0

    if-eq v13, v14, :cond_9

    const/4 v13, 0x1

    goto :goto_9

    :cond_9
    move v13, v3

    :goto_9
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v12, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1f

    invoke-virtual {v6, v1, v2}, Lm1/o;->a(J)Lm1/r;

    move-result-object v13

    iget v14, v13, Lm1/r;->a:I

    const/16 v16, 0x1

    iget v15, v7, Li93/h;->w:I

    sub-int/2addr v14, v15

    mul-int/lit8 v14, v14, 0xc

    iget v15, v13, Lm1/r;->b:I

    add-int/2addr v14, v15

    add-int/lit8 v14, v14, -0x1

    if-gez v14, :cond_a

    move v14, v3

    :cond_a
    const/4 v15, 0x2

    invoke-static {v14, v3, v12, v15}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    invoke-virtual {v12, v14}, Lp1/q;->e(I)Z

    move-result v18

    or-int v17, v17, v18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    const/4 v7, 0x0

    if-nez v17, :cond_b

    if-ne v3, v5, :cond_c

    :cond_b
    new-instance v3, Ll1/t0;

    invoke-direct {v3, v14, v4, v7}, Ll1/t0;-><init>(ILn0/u;Lq83/d;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lc93/m;

    invoke-static {v12, v3, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_d

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lbc3/c0;

    const/4 v14, 0x0

    new-array v15, v14, [Ljava/lang/Object;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v5, :cond_e

    new-instance v14, Ll1/f0;

    const/4 v7, 0x0

    invoke-direct {v14, v7}, Ll1/f0;-><init>(I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v14, Lc93/a;

    const/16 v7, 0x30

    invoke-static {v15, v14, v12, v7}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/c1;

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v14, v15, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    move-object v9, v13

    move-object/from16 v17, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    move/from16 v22, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object/from16 v18, v9

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v19, v15

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    move-object/from16 v23, v10

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v24, v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    goto :goto_b

    :cond_10
    move-object/from16 v24, v11

    :goto_b
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v12, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v9, Ll1/f1;->c:F

    const/4 v11, 0x0

    const/4 v13, 0x2

    invoke-static {v0, v9, v11, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v25

    move-object v13, v10

    invoke-virtual {v4}, Ln0/u;->d()Z

    move-result v10

    move/from16 v26, v11

    invoke-virtual {v4}, Ln0/u;->c()Z

    move-result v11

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Ljava/lang/Boolean;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v27

    move/from16 v28, v9

    iget-object v9, v6, Lm1/o;->a:Ljava/util/Locale;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v29, v10

    const-string v10, "yMMMM"

    move/from16 v30, v11

    iget-object v11, v8, Ll1/e0;->a:Ljava/util/LinkedHashMap;

    invoke-static {v1, v2, v10, v9, v11}, Lm1/e0;->f(JLjava/lang/String;Ljava/util/Locale;Ljava/util/LinkedHashMap;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_12

    const-string v9, "-"

    :cond_12
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_13

    if-ne v11, v5, :cond_14

    :cond_13
    new-instance v11, Ll1/g0;

    const/4 v10, 0x0

    invoke-direct {v11, v3, v4, v10}, Ll1/g0;-><init>(Lbc3/c0;Ln0/u;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lc93/a;

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v31

    or-int v10, v10, v31

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v10, :cond_15

    if-ne v1, v5, :cond_16

    :cond_15
    new-instance v1, Ll1/g0;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v4, v2}, Ll1/g0;-><init>(Lbc3/c0;Ln0/u;I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v1, Lc93/a;

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_17

    if-ne v10, v5, :cond_18

    :cond_17
    new-instance v10, Ljt1/b;

    const/16 v2, 0x8

    invoke-direct {v10, v2, v7}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v10, Lc93/a;

    const/high16 v2, 0xe000000

    and-int v2, v22, v2

    move-object/from16 v5, v19

    or-int/lit8 v19, v2, 0x6

    move-object/from16 v6, v24

    move/from16 v24, v2

    move-object v2, v6

    move-object/from16 v16, v10

    move-object v8, v13

    move/from16 v6, v26

    move/from16 v10, v29

    move-object/from16 v26, v4

    move-object v13, v9

    move-object/from16 v4, v23

    move-object/from16 v9, v25

    move-object/from16 v25, v3

    move-object v3, v15

    move-object/from16 v23, v18

    move-object v15, v1

    move-object/from16 v18, v12

    move/from16 v12, v27

    move/from16 v1, v28

    move-object/from16 v28, v5

    move-object/from16 v27, v7

    move-object v7, v14

    move-object/from16 v5, v17

    move-object/from16 v17, p9

    move-object v14, v11

    move/from16 v11, v30

    invoke-static/range {v9 .. v19}, Ll1/f1;->j(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v10, v17

    move-object/from16 v12, v18

    sget-object v9, Lb2/e;->w:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v9, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_19

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    :cond_1a
    invoke-static {v11, v12, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v12, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v13, 0x2

    invoke-static {v0, v1, v6, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v6, v28

    const/4 v14, 0x0

    invoke-static {v5, v6, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1c

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_1c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    :cond_1d
    invoke-static {v6, v12, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v12, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v1, v22, 0x18

    const/16 v2, 0xe

    and-int/2addr v1, v2

    shr-int/lit8 v3, v22, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v1, v3

    move-object/from16 v6, p5

    invoke-static {v10, v6, v12, v1}, Ll1/f1;->l(Ll1/y;Lm1/o;Landroidx/compose/runtime/Composer;I)V

    shl-int/lit8 v1, v22, 0x3

    and-int/lit8 v1, v1, 0x70

    move/from16 v3, v22

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v1, v4

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v1, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v1, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v1, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v1, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int/2addr v1, v3

    or-int v1, v1, v24

    move-object/from16 v4, p0

    move-object/from16 v5, p3

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object v7, v6

    move-object v11, v10

    move v15, v13

    move-object/from16 v3, v26

    move-object/from16 v6, p4

    move-object/from16 v10, p8

    move v13, v1

    const/4 v1, 0x0

    invoke-static/range {v3 .. v13}, Ll1/f1;->g(Ln0/u;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v3

    const/4 v11, 0x1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    sget-object v3, Lo1/n;->y:Lo1/n;

    invoke-static {v3, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v4

    sget-object v6, Lo1/n;->z:Lo1/n;

    invoke-static {v6, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v6

    invoke-static {v3, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v3

    invoke-interface/range {v27 .. v27}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    invoke-static {v0}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {v3, v1, v2}, Lc0/w0;->d(Ld0/c0;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v0

    new-instance v7, Lc0/d1;

    new-instance v16, Lc0/u1;

    new-instance v8, Lc0/g1;

    const v9, 0x3f19999a    # 0.6f

    invoke-direct {v8, v9, v4}, Lc0/g1;-><init>(FLd0/c0;)V

    const/16 v21, 0x0

    const/16 v22, 0x3e

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v8

    invoke-direct/range {v16 .. v22}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    move-object/from16 v4, v16

    invoke-direct {v7, v4}, Lc0/d1;-><init>(Lc0/u1;)V

    invoke-virtual {v0, v7}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v16

    invoke-static {v3, v1, v1, v2}, Lc0/w0;->l(Ld0/c0;Lb2/l;Lkotlin/jvm/functions/Function1;I)Lc0/f1;

    move-result-object v0

    invoke-static {v6, v15}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v15

    new-instance v0, Ll1/w0;

    move-wide/from16 v1, p1

    move-object/from16 v9, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    move-object/from16 v7, v23

    move-object/from16 v4, v25

    move-object/from16 v3, v27

    invoke-direct/range {v0 .. v10}, Ll1/w0;-><init>(JLp1/c1;Lbc3/c0;Ln0/u;Li93/j;Lm1/r;Ll1/n3;Lm1/o;Ll1/y;)V

    const v1, 0x4726a972

    invoke-static {v1, v12, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const v7, 0x30030

    const/16 v8, 0x10

    const/4 v4, 0x0

    move-object v6, v12

    move v0, v13

    move-object v1, v14

    move-object v3, v15

    move-object/from16 v2, v16

    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_20

    new-instance v0, Ll1/h0;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ll1/h0;-><init>(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method public static final d(Lc93/m;JJFLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-wide/from16 v4, p3

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    const v0, 0x786e3e09

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-nez v0, :cond_1

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v8, 0x180

    move-wide/from16 v9, p1

    if-nez v3, :cond_5

    invoke-virtual {v13, v9, v10}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v8, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    and-int/lit16 v3, v8, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v13, v6}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v0, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v8

    if-nez v3, :cond_b

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v0, v3

    :cond_b
    const v3, 0x12493

    and-int/2addr v3, v0

    const v11, 0x12492

    const/4 v15, 0x0

    const/4 v12, 0x1

    if-eq v3, v11, :cond_c

    move v3, v12

    goto :goto_7

    :cond_c
    move v3, v15

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v13, v11, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_12

    if-eqz v1, :cond_d

    const/4 v3, 0x0

    invoke-static {v2, v3, v6, v12}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_8

    :cond_d
    move-object v3, v2

    :goto_8
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v3, v11, v13, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v13, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v8, v13, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v1, :cond_11

    const v2, 0x17a81feb

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lo1/g;->s:Lo1/c0;

    invoke-static {v2, v13}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v11

    new-instance v2, Lg1/e;

    const/4 v3, 0x6

    invoke-direct {v2, v3, v1}, Lg1/e;-><init>(ILc93/m;)V

    const v3, 0x5021d8c2

    invoke-static {v3, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v14, v3, 0x180

    move v9, v12

    move-object v12, v2

    move v2, v9

    move-wide/from16 v9, p1

    invoke-static/range {v9 .. v14}, Lm1/e0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    move v2, v12

    const v3, 0x17ac3b03

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    :goto_a
    sget-object v3, Ll1/s;->a:Lp1/b0;

    new-instance v8, Li2/x;

    invoke-direct {v8, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v3, v8}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    shr-int/lit8 v0, v0, 0xc

    and-int/lit8 v0, v0, 0x70

    const/16 v8, 0x8

    or-int/2addr v0, v8

    invoke-static {v3, v7, v13, v0}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_12
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v0, Ll1/o0;

    move-wide/from16 v2, p1

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Ll1/o0;-><init>(Lc93/m;JJFLx1/b;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final e(Ljava/lang/String;ZLc93/a;ZZZLjava/lang/String;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v0, p1

    move/from16 v11, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v12, p6

    move-object/from16 v8, p7

    move/from16 v13, p9

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    const v1, -0x3858f980    # -85517.0f

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v13

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v2, v13

    :goto_1
    and-int/lit8 v3, v13, 0x30

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-nez v3, :cond_3

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v13, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v9, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v13, 0xc00

    move-object/from16 v7, p2

    if-nez v3, :cond_7

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v13, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v9, v11}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v13

    if-nez v3, :cond_b

    invoke-virtual {v9, v5}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v2, v3

    :cond_b
    const/high16 v3, 0x180000

    and-int/2addr v3, v13

    if-nez v3, :cond_d

    invoke-virtual {v9, v6}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_c

    const/high16 v3, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v3, 0x80000

    :goto_7
    or-int/2addr v2, v3

    :cond_d
    const/high16 v3, 0xc00000

    and-int/2addr v3, v13

    const/4 v10, 0x0

    if-nez v3, :cond_f

    invoke-virtual {v9, v10}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_e

    const/high16 v3, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v3, 0x400000

    :goto_8
    or-int/2addr v2, v3

    :cond_f
    const/high16 v3, 0x6000000

    and-int/2addr v3, v13

    const/high16 v14, 0x4000000

    if-nez v3, :cond_11

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    move v3, v14

    goto :goto_9

    :cond_10
    const/high16 v3, 0x2000000

    :goto_9
    or-int/2addr v2, v3

    :cond_11
    const/high16 v3, 0x30000000

    and-int/2addr v3, v13

    if-nez v3, :cond_13

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/high16 v3, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v3, 0x10000000

    :goto_a
    or-int/2addr v2, v3

    :cond_13
    const v3, 0x12492493

    and-int/2addr v3, v2

    const v15, 0x12492492

    const/4 v10, 0x1

    if-eq v3, v15, :cond_14

    move v3, v10

    goto :goto_b

    :cond_14
    const/4 v3, 0x0

    :goto_b
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v9, v15, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1c

    const/high16 v3, 0xe000000

    and-int/2addr v3, v2

    if-ne v3, v14, :cond_15

    move v3, v10

    goto :goto_c

    :cond_15
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v3, :cond_16

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v14, v3, :cond_17

    :cond_16
    new-instance v14, Lht2/d;

    const/16 v3, 0xd

    invoke-direct {v14, v12, v3}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v10, v14}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v3, Lo1/g;->f:Lo1/t;

    invoke-static {v3, v9}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v21

    shr-int/lit8 v2, v2, 0x6

    if-eqz v0, :cond_19

    if-eqz v5, :cond_18

    iget-wide v3, v8, Ll1/y;->r:J

    :goto_d
    move-wide v14, v3

    goto :goto_e

    :cond_18
    iget-wide v3, v8, Ll1/y;->s:J

    goto :goto_d

    :cond_19
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-wide v3, Li2/x;->m:J

    goto :goto_d

    :goto_e
    if-eqz v11, :cond_1a

    const v3, -0x4eab6a60

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lo1/n;->y:Lo1/n;

    invoke-static {v3, v9}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v17, 0x0

    move-object/from16 v18, v9

    invoke-static/range {v14 .. v20}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1a
    const/4 v4, 0x0

    const v3, -0x4ea7f4f0

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    new-instance v3, Li2/x;

    invoke-direct {v3, v14, v15}, Li2/x;-><init>(J)V

    invoke-static {v3, v9}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_f
    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v14, v3, Li2/x;->a:J

    if-eqz v6, :cond_1b

    if-nez v0, :cond_1b

    sget v3, Lo1/g;->l:F

    iget-wide v0, v8, Ll1/y;->u:J

    invoke-static {v3, v0, v1}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    :goto_10
    move-object/from16 v16, v0

    goto :goto_11

    :cond_1b
    const/4 v0, 0x0

    goto :goto_10

    :goto_11
    new-instance v0, Ll1/x0;

    const/4 v6, 0x0

    move-object v1, v8

    move v8, v2

    move-object v2, v1

    move-object/from16 v1, p0

    move/from16 v4, p1

    move/from16 v3, p5

    invoke-direct/range {v0 .. v6}, Ll1/x0;-><init>(Ljava/lang/String;Ll1/y;ZZZI)V

    const v1, 0x4322b196

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    and-int/lit16 v1, v8, 0x1c7e

    move/from16 v3, p4

    move-object v8, v0

    move-object v2, v10

    move-wide v5, v14

    move-object/from16 v4, v21

    move/from16 v0, p1

    move v10, v1

    move-object v1, v7

    move-object/from16 v7, v16

    invoke-static/range {v0 .. v10}, Ll1/c4;->b(ZLc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_12

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1d

    new-instance v0, Ll1/m0;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move v4, v11

    move-object v7, v12

    move v9, v13

    invoke-direct/range {v0 .. v9}, Ll1/m0;-><init>(Ljava/lang/String;ZLc93/a;ZZZLjava/lang/String;Ll1/y;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final f(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p4, Lp1/q;

    const v0, -0x5718f185

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, p5

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x800

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x1

    if-eq v1, v2, :cond_3

    move v1, v3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_3
    and-int/2addr v0, v3

    invoke-virtual {p4, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ll1/s;->a:Lp1/b0;

    iget-wide v1, p3, Ll1/y;->c:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Ll1/y0;

    invoke-direct {v1, p1, p2, p0}, Ll1/y0;-><init>(ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)V

    const v2, -0x67628e45

    invoke-static {v2, p4, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p4, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_5

    new-instance v0, Lh02/i;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Ll1/y;I)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final g(Ln0/u;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p4

    move-object/from16 v6, p5

    move-object/from16 v11, p9

    check-cast v11, Lp1/q;

    const v0, -0x76e59735

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p10, v0

    and-int/lit8 v2, p10, 0x30

    move-object/from16 v7, p1

    if-nez v2, :cond_2

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    :cond_2
    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x100

    goto :goto_2

    :cond_3
    const/16 v2, 0x80

    :goto_2
    or-int/2addr v0, v2

    move-object/from16 v13, p3

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x800

    goto :goto_3

    :cond_4
    const/16 v2, 0x400

    :goto_3
    or-int/2addr v0, v2

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x4000

    goto :goto_4

    :cond_5
    const/16 v2, 0x2000

    :goto_4
    or-int/2addr v0, v2

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/high16 v2, 0x20000

    goto :goto_5

    :cond_6
    const/high16 v2, 0x10000

    :goto_5
    or-int/2addr v0, v2

    move-object/from16 v8, p6

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/high16 v2, 0x100000

    goto :goto_6

    :cond_7
    const/high16 v2, 0x80000

    :goto_6
    or-int/2addr v0, v2

    move-object/from16 v9, p7

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/high16 v2, 0x800000

    goto :goto_7

    :cond_8
    const/high16 v2, 0x400000

    :goto_7
    or-int/2addr v0, v2

    move-object/from16 v10, p8

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const/high16 v2, 0x4000000

    goto :goto_8

    :cond_9
    const/high16 v2, 0x2000000

    :goto_8
    or-int v15, v0, v2

    const v0, 0x2492493

    and-int/2addr v0, v15

    const v2, 0x2492492

    const/16 v16, 0x0

    const/4 v4, 0x1

    if-eq v0, v2, :cond_a

    move v0, v4

    goto :goto_9

    :cond_a
    move/from16 v0, v16

    :goto_9
    and-int/lit8 v2, v15, 0x1

    invoke-virtual {v11, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v3}, Lm1/o;->b()Lm1/n;

    move-result-object v0

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_b

    if-ne v14, v12, :cond_c

    :cond_b
    iget v2, v6, Li93/h;->w:I

    move-object v14, v3

    check-cast v14, Lm1/q;

    invoke-static {v2, v4, v4}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v14, v2}, Lm1/q;->e(Ljava/time/LocalDate;)Lm1/r;

    move-result-object v14

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v14, Lm1/r;

    sget-object v2, Lo1/g;->h:Lo1/c0;

    invoke-static {v2, v11}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v2

    move-object v6, v0

    new-instance v0, Ll1/a1;

    move-object v4, v14

    move-object v14, v2

    move-object/from16 v2, p5

    invoke-direct/range {v0 .. v10}, Ll1/a1;-><init>(Ln0/u;Li93/j;Lm1/o;Lm1/r;Lkotlin/jvm/functions/Function1;Lm1/n;Ljava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;)V

    move-object v6, v2

    const v1, 0x59a68b7a

    invoke-static {v1, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x30

    invoke-static {v14, v0, v11, v1}, Ll1/o4;->a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v0, v15, 0xe

    const/4 v1, 0x4

    if-ne v0, v1, :cond_d

    const/4 v4, 0x1

    goto :goto_a

    :cond_d
    move/from16 v4, v16

    :goto_a
    and-int/lit16 v0, v15, 0x1c00

    const/16 v1, 0x800

    if-ne v0, v1, :cond_e

    const/16 v16, 0x1

    :cond_e
    or-int v0, v4, v16

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_10

    if-ne v1, v12, :cond_f

    goto :goto_b

    :cond_f
    move-object v0, v1

    move-object/from16 v1, p0

    goto :goto_c

    :cond_10
    :goto_b
    new-instance v0, Lb2/y;

    const/4 v5, 0x0

    const/16 v6, 0x11

    move-object/from16 v1, p0

    move-object/from16 v4, p5

    move-object v2, v13

    invoke-direct/range {v0 .. v6}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v0, Lc93/m;

    invoke-static {v11, v0, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    goto :goto_d

    :cond_11
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_12

    new-instance v0, Ld42/n;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ld42/n;-><init>(Ln0/u;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final h(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
    .locals 12

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v0, -0x15f0259d

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_3

    or-int/lit16 v0, v0, 0xc00

    goto :goto_4

    :cond_3
    invoke-virtual {v6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x800

    goto :goto_3

    :cond_4
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_5

    or-int/lit16 v0, v0, 0x6000

    move/from16 v8, p4

    goto :goto_6

    :cond_5
    move/from16 v8, p4

    invoke-virtual {v6, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x4000

    goto :goto_5

    :cond_6
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x1

    if-eq v9, v10, :cond_7

    move v9, v11

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    :goto_7
    and-int/2addr v0, v11

    invoke-virtual {v6, v0, v9}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    if-eqz v4, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v2, v0

    goto :goto_8

    :cond_8
    move-object v2, p3

    :goto_8
    if-eqz v7, :cond_9

    move v8, v11

    :cond_9
    invoke-static {v6}, Ll1/r4;->a(Landroidx/compose/runtime/Composer;)Ll1/v4;

    move-result-object v7

    new-instance v0, Lg1/q6;

    const/4 v4, 0x3

    invoke-direct {v0, p2, v4}, Lg1/q6;-><init>(Ljava/lang/String;I)V

    const v4, -0x1b322ab2

    invoke-static {v4, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    invoke-static {v6}, Ll1/u4;->c(Landroidx/compose/runtime/Composer;)Ll1/x4;

    move-result-object v10

    new-instance v0, Lh00/e0;

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move v3, v8

    invoke-direct/range {v0 .. v5}, Lh00/e0;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLo2/e;Ljava/lang/String;)V

    move-object v8, v2

    move v11, v3

    const v1, -0x430cbc9a

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    move-object v0, v7

    const v7, 0x6000030

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v9

    move-object v2, v10

    invoke-static/range {v0 .. v7}, Ll1/u4;->b(Lc4/i0;Lx1/b;Ll1/x4;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v8

    move v5, v11

    goto :goto_9

    :cond_a
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v4, p3

    move v5, v8

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_b

    new-instance v0, Lb30/j2;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final i(Lm1/r;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v8, -0x13ddc37b

    invoke-virtual {v0, v8}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int v8, p10, v8

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/16 v10, 0x20

    goto :goto_1

    :cond_1
    const/16 v10, 0x10

    :goto_1
    or-int/2addr v8, v10

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x100

    goto :goto_2

    :cond_2
    const/16 v10, 0x80

    :goto_2
    or-int/2addr v8, v10

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x800

    goto :goto_3

    :cond_3
    const/16 v10, 0x400

    :goto_3
    or-int/2addr v8, v10

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/high16 v10, 0x100000

    goto :goto_4

    :cond_4
    const/high16 v10, 0x80000

    :goto_4
    or-int/2addr v8, v10

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/high16 v10, 0x800000

    goto :goto_5

    :cond_5
    const/high16 v10, 0x400000

    :goto_5
    or-int/2addr v8, v10

    move-object/from16 v10, p7

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/high16 v13, 0x4000000

    goto :goto_6

    :cond_6
    const/high16 v13, 0x2000000

    :goto_6
    or-int/2addr v8, v13

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    const/high16 v13, 0x20000000

    goto :goto_7

    :cond_7
    const/high16 v13, 0x10000000

    :goto_7
    or-int/2addr v8, v13

    const v13, 0x12492493

    and-int/2addr v13, v8

    const v14, 0x12492492

    const/4 v12, 0x0

    if-eq v13, v14, :cond_8

    const/4 v13, 0x1

    goto :goto_8

    :cond_8
    move v13, v12

    :goto_8
    and-int/lit8 v14, v8, 0x1

    invoke-virtual {v0, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_22

    const v13, 0x242a97dd

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    sget v13, Ll1/f1;->a:F

    const/4 v14, 0x6

    int-to-float v11, v14

    mul-float/2addr v13, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v11}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-interface {v13, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->f:Ll0/h;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v12, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_9

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v14, v0, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x288953a6

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v12, 0x6

    :goto_a
    if-ge v4, v12, :cond_21

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Ll0/m;->f:Ll0/h;

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v14, v15, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v20, v3

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v23, v4

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_c

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v14, v0, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x5bf28c75

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    move/from16 v3, v20

    const/4 v4, 0x0

    :goto_c
    const/4 v12, 0x7

    if-ge v4, v12, :cond_20

    iget v12, v1, Lm1/r;->d:I

    if-lt v3, v12, :cond_f

    iget v13, v1, Lm1/r;->c:I

    add-int/2addr v12, v13

    if-lt v3, v12, :cond_10

    :cond_f
    move/from16 v24, v3

    move/from16 v25, v4

    move/from16 v26, v8

    move-object v4, v11

    const/4 v2, 0x6

    const/4 v5, 0x0

    const/high16 v6, 0x800000

    const/4 v8, 0x1

    move-object v3, v0

    const/16 v0, 0x20

    goto/16 :goto_15

    :cond_10
    const v12, 0x22724843

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    iget v12, v1, Lm1/r;->d:I

    sub-int v12, v3, v12

    iget-wide v13, v1, Lm1/r;->e:J

    move/from16 v24, v3

    move/from16 v25, v4

    int-to-long v3, v12

    const-wide/32 v20, 0x5265c00

    mul-long v3, v3, v20

    add-long/2addr v3, v13

    cmp-long v13, v3, p2

    if-nez v13, :cond_11

    const/4 v15, 0x1

    goto :goto_d

    :cond_11
    const/4 v15, 0x0

    :goto_d
    if-nez v5, :cond_12

    goto :goto_e

    :cond_12
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v13, v3, v13

    if-nez v13, :cond_13

    move-object v13, v11

    const/4 v11, 0x1

    goto :goto_f

    :cond_13
    :goto_e
    move-object v13, v11

    const/4 v11, 0x0

    :goto_f
    const v14, 0x22812a3c

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x3a1adc2b

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    const-string v5, ", "

    if-eqz v15, :cond_15

    move/from16 v26, v8

    const v8, 0x54747da5

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v8

    if-lez v8, :cond_14

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_14
    const v8, 0x7f1407e2

    invoke-static {v0, v8}, Lm1/e0;->i(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v8, 0x0

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    move/from16 v26, v8

    const/4 v8, 0x0

    const v10, 0x3a1dc42b

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-nez v10, :cond_16

    const/4 v10, 0x0

    goto :goto_11

    :cond_16
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :goto_11
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    const/4 v8, 0x1

    invoke-virtual {v6, v14, v9, v8}, Ll1/e0;->a(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_17

    const-string v14, ""

    :cond_17
    add-int/lit8 v12, v12, 0x1

    invoke-static {v12, v9}, Ll1/j;->a(ILjava/util/Locale;)Ljava/lang/String;

    move-result-object v12

    and-int/lit8 v8, v26, 0x70

    const/16 v6, 0x20

    if-ne v8, v6, :cond_18

    const/4 v8, 0x1

    goto :goto_12

    :cond_18
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v16

    or-int v8, v8, v16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move/from16 v20, v8

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v20, :cond_19

    if-ne v6, v8, :cond_1a

    :cond_19
    new-instance v6, Ll1/k0;

    const/4 v9, 0x0

    invoke-direct {v6, v2, v3, v4, v9}, Ll1/k0;-><init>(Ljava/lang/Object;JI)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v6, Lc93/a;

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v9

    const/high16 v20, 0x1c00000

    and-int v2, v26, v20

    move-object/from16 v20, v6

    const/high16 v6, 0x800000

    if-ne v2, v6, :cond_1b

    const/4 v2, 0x1

    goto :goto_13

    :cond_1b
    const/4 v2, 0x0

    :goto_13
    or-int/2addr v2, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_1c

    if-ne v9, v8, :cond_1e

    :cond_1c
    iget v2, v1, Lm1/r;->a:I

    invoke-interface {v7, v2}, Ll1/n3;->isSelectableYear(I)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-interface {v7, v3, v4}, Ll1/n3;->isSelectableDate(J)Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v2, 0x1

    goto :goto_14

    :cond_1d
    const/4 v2, 0x0

    :goto_14
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v10, :cond_1f

    invoke-static {v10, v5, v14}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    :cond_1f
    shl-int/lit8 v3, v26, 0x3

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int/lit8 v3, v3, 0x30

    move-object v4, v13

    move v13, v11

    move-object/from16 v17, p7

    move-object/from16 v18, v0

    move/from16 v19, v3

    move-object v10, v12

    move-object/from16 v16, v14

    move-object/from16 v12, v20

    const/16 v0, 0x20

    const/4 v5, 0x0

    const/4 v8, 0x1

    move v14, v2

    const/4 v2, 0x6

    invoke-static/range {v10 .. v19}, Ll1/f1;->e(Ljava/lang/String;ZLc93/a;ZZZLjava/lang/String;Ll1/y;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v3, v18

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    move-object v13, v4

    goto :goto_16

    :goto_15
    const v9, 0x2261a7f0

    invoke-virtual {v3, v9}, Lp1/q;->e0(I)V

    sget v18, Lo1/g;->g:F

    sget v19, Lo1/g;->e:F

    const/16 v21, 0x0

    const/16 v22, 0xc

    const/16 v20, 0x0

    move-object/from16 v17, v4

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v13, v17

    sget-object v9, Ll1/w1;->c:Lp1/u2;

    invoke-virtual {v3, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/f;

    iget v10, v10, Ly3/f;->w:F

    invoke-virtual {v3, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/f;

    iget v9, v9, Ly3/f;->w:F

    invoke-static {v4, v10, v9}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    :goto_16
    add-int/lit8 v4, v24, 0x1

    add-int/lit8 v9, v25, 0x1

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p7

    move-object v0, v3

    move v3, v4

    move v4, v9

    move-object v11, v13

    move/from16 v8, v26

    move-object/from16 v9, p8

    goto/16 :goto_c

    :cond_20
    move/from16 v24, v3

    move/from16 v26, v8

    move-object v13, v11

    const/4 v2, 0x6

    const/4 v5, 0x0

    const/high16 v6, 0x800000

    const/4 v8, 0x1

    move-object v3, v0

    const/16 v0, 0x20

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    add-int/lit8 v4, v23, 0x1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p7

    move-object/from16 v9, p8

    move v12, v2

    move-object v0, v3

    move/from16 v3, v24

    move/from16 v8, v26

    move-object/from16 v2, p1

    goto/16 :goto_a

    :cond_21
    move-object v3, v0

    const/4 v5, 0x0

    const/4 v8, 0x1

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_22
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_17
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_23

    new-instance v0, Ll1/l0;

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ll1/l0;-><init>(Lm1/r;Lkotlin/jvm/functions/Function1;JLjava/lang/Long;Ll1/e0;Ll1/n3;Ll1/y;Ljava/util/Locale;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method public static final j(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p3

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p8

    move-object/from16 v8, p9

    check-cast v8, Lp1/q;

    const v4, -0x2e21392a

    invoke-virtual {v8, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v4, 0x20

    goto :goto_0

    :cond_0
    const/16 v4, 0x10

    :goto_0
    or-int v4, p10, v4

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x100

    goto :goto_1

    :cond_1
    const/16 v6, 0x80

    :goto_1
    or-int/2addr v4, v6

    invoke-virtual {v8, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x800

    goto :goto_2

    :cond_2
    const/16 v6, 0x400

    :goto_2
    or-int/2addr v4, v6

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x4000

    goto :goto_3

    :cond_3
    const/16 v6, 0x2000

    :goto_3
    or-int/2addr v4, v6

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/high16 v6, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v6, 0x10000

    :goto_4
    or-int/2addr v4, v6

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/high16 v6, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v6, 0x80000

    :goto_5
    or-int/2addr v4, v6

    move-object/from16 v6, p7

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/high16 v7, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v7, 0x400000

    :goto_6
    or-int/2addr v4, v7

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/high16 v7, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v7, 0x2000000

    :goto_7
    or-int/2addr v4, v7

    const v7, 0x2492493

    and-int/2addr v7, v4

    const v9, 0x2492492

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_8

    :cond_8
    const/4 v7, 0x0

    :goto_8
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_e

    const/high16 v7, 0x3f800000    # 1.0f

    move-object/from16 v14, p0

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v9, Ll1/f1;->b:F

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->k(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v5, :cond_9

    sget-object v9, Ll0/m;->a:Ll0/e;

    goto :goto_9

    :cond_9
    sget-object v9, Ll0/m;->g:Ll0/h;

    :goto_9
    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x30

    invoke-static {v9, v15, v8, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v17, v4

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_a

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    invoke-static {v12, v8, v12, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v4, Lb30/w2;

    const/16 v7, 0x13

    invoke-direct {v4, v7, v0, v11}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x24e659a6

    invoke-static {v7, v8, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    shr-int/lit8 v4, v17, 0x15

    and-int/lit8 v4, v4, 0xe

    or-int/lit16 v4, v4, 0xc00

    shr-int/lit8 v9, v17, 0x6

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v9, v4

    const/4 v6, 0x0

    move-object/from16 v4, p7

    invoke-static/range {v4 .. v9}, Ll1/f1;->o(Lc93/a;ZLandroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    if-nez p3, :cond_d

    const v4, 0x10c94108

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Ll1/s;->a:Lp1/b0;

    iget-wide v5, v11, Ll1/y;->f:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v7}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v5, Lb30/m4;

    invoke-direct {v5, v10, v3, v1, v2}, Lb30/m4;-><init>(Lc93/a;ZLc93/a;Z)V

    const v6, -0x7a5f709

    invoke-static {v6, v8, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v8, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v4, 0x1

    goto :goto_c

    :cond_d
    const/4 v15, 0x0

    const v4, 0x10d59250

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_e
    move-object/from16 v14, p0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_f

    new-instance v0, Ll1/i0;

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v8, p7

    move-object v6, v1

    move-object v7, v10

    move-object v9, v11

    move-object v1, v14

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ll1/i0;-><init>(Landroidx/compose/ui/Modifier;ZZZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Ll1/y;I)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final k(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move/from16 v4, p3

    move-object/from16 v12, p12

    check-cast v12, Lp1/q;

    const v0, -0x7a68bf25

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v14, p0

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p13, v0

    move-wide/from16 v5, p1

    invoke-virtual {v12, v5, v6}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    invoke-virtual {v12, v4}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x100

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v0, v3

    move-object/from16 v3, p4

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x800

    goto :goto_3

    :cond_3
    const/16 v7, 0x400

    :goto_3
    or-int/2addr v0, v7

    move-object/from16 v7, p5

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x4000

    goto :goto_4

    :cond_4
    const/16 v8, 0x2000

    :goto_4
    or-int/2addr v0, v8

    move-object/from16 v8, p6

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/high16 v9, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v9, 0x10000

    :goto_5
    or-int/2addr v0, v9

    move-object/from16 v9, p7

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/high16 v10, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v10, 0x80000

    :goto_6
    or-int/2addr v0, v10

    move-object/from16 v10, p8

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/high16 v11, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v11, 0x400000

    :goto_7
    or-int/2addr v0, v11

    move-object/from16 v11, p9

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/high16 v13, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v13, 0x2000000

    :goto_8
    or-int/2addr v0, v13

    move-object/from16 v13, p10

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_9

    const/high16 v15, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v15, 0x10000000

    :goto_9
    or-int/2addr v0, v15

    move-object/from16 v15, p11

    invoke-virtual {v12, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    goto :goto_a

    :cond_a
    const/4 v1, 0x2

    :goto_a
    const v16, 0x12492493

    and-int v2, v0, v16

    move/from16 v25, v0

    const v0, 0x12492492

    move/from16 v16, v1

    if-ne v2, v0, :cond_c

    and-int/lit8 v0, v16, 0x3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_b

    goto :goto_b

    :cond_b
    const/4 v0, 0x0

    goto :goto_c

    :cond_c
    :goto_b
    const/4 v0, 0x1

    :goto_c
    and-int/lit8 v2, v25, 0x1

    invoke-virtual {v12, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    const/16 v2, 0x30

    int-to-float v2, v2

    invoke-interface {v0, v2}, Ly3/c;->F(F)I

    move-result v0

    neg-int v0, v0

    sget-object v2, Lo1/n;->y:Lo1/n;

    invoke-static {v2, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v2

    sget-object v1, Lo1/n;->z:Lo1/n;

    invoke-static {v1, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v1

    sget-object v3, Lo1/n;->w:Lo1/n;

    invoke-static {v3, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v5

    invoke-static {v3, v12}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v3

    new-instance v6, Ll1/k1;

    invoke-direct {v6, v4}, Ll1/k1;-><init>(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v26, v6

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_d

    new-instance v4, Lkx1/b;

    const/16 v7, 0xc

    invoke-direct {v4, v7}, Lkx1/b;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v7, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x0

    invoke-static {v7, v8, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12, v0}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_e

    if-ne v8, v6, :cond_f

    :cond_e
    new-instance v16, Ll1/p0;

    move/from16 v20, v0

    move-object/from16 v19, v1

    move-object/from16 v18, v2

    move-object/from16 v21, v3

    move-object/from16 v17, v5

    invoke-direct/range {v16 .. v21}, Ll1/p0;-><init>(Ld0/i1;Ld0/i1;Ld0/i1;ILd0/i1;)V

    move-object/from16 v8, v16

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v7, v8

    check-cast v7, Lkotlin/jvm/functions/Function1;

    new-instance v13, Ll1/b1;

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    move-object/from16 v19, p6

    move-object/from16 v23, p10

    move-object/from16 v20, v9

    move-object/from16 v21, v10

    move-object/from16 v22, v11

    move-object/from16 v24, v15

    move-wide/from16 v15, p1

    invoke-direct/range {v13 .. v24}, Ll1/b1;-><init>(Ljava/lang/Long;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;)V

    const v0, 0x6d9548fb

    invoke-static {v0, v12, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v0, v25, 0x6

    and-int/lit8 v0, v0, 0xe

    const v1, 0x186000

    or-int v13, v0, v1

    const/16 v14, 0x28

    const/4 v8, 0x0

    const-string v9, "DatePickerDisplayModeAnimation"

    const/4 v10, 0x0

    move-object v6, v4

    move-object/from16 v5, v26

    invoke-static/range {v5 .. v14}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_11

    new-instance v0, Ll1/q0;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Ll1/q0;-><init>(Ljava/lang/Long;JILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm1/o;Li93/j;Ll1/e0;Ll1/n3;Ll1/y;Lg2/s;I)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final l(Ll1/y;Lm1/o;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x6e3c9a2f

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_10

    move-object v4, v1

    check-cast v4, Lm1/q;

    iget v5, v4, Lm1/q;->c:I

    iget-object v4, v4, Lm1/q;->d:Ljava/util/ArrayList;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sub-int/2addr v5, v8

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v9

    move v10, v5

    :goto_4
    if-ge v10, v9, :cond_5

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_5
    move v9, v7

    :goto_5
    if-ge v9, v5, :cond_6

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    sget-object v4, Lo1/g;->x:Lo1/c0;

    invoke-static {v4, v3}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v19

    sget v4, Ll1/f1;->a:F

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    invoke-static {v5, v9, v4, v8}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Ll0/m;->f:Ll0/h;

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x36

    invoke-static {v9, v10, v3, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v10, v3, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x176ce23

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v9, v7

    :goto_7
    if-ge v9, v4, :cond_f

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/k;

    invoke-virtual {v3, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_a

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v12, v11, :cond_b

    :cond_a
    new-instance v12, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v11, 0x16

    invoke-direct {v12, v10, v11}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v3, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v12}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v14, Lo1/g;->g:F

    sget v15, Lo1/g;->e:F

    const/16 v17, 0x0

    const/16 v18, 0xc

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/d;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Ll1/w1;->c:Lp1/u2;

    invoke-virtual {v3, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/f;

    iget v13, v13, Ly3/f;->w:F

    invoke-virtual {v3, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/f;

    iget v12, v12, Ly3/f;->w:F

    invoke-static {v11, v13, v12}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->E:Lb2/m;

    invoke-static {v12, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v3, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v3, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_8
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v3, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_d

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    :cond_d
    invoke-static {v13, v3, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v3, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v8, v10, Ll83/k;->x:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v5, v10, v7, v11}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object v13, v5

    move-object v12, v6

    iget-wide v5, v0, Ll1/y;->d:J

    move-object v14, v12

    new-instance v12, Lw3/k;

    invoke-direct {v12, v11}, Lw3/k;-><init>(I)V

    const/16 v22, 0x0

    const v23, 0x1fbf8

    move-object/from16 v20, v3

    move v11, v7

    move-object v3, v8

    const-wide/16 v7, 0x0

    move v15, v9

    const/4 v9, 0x0

    move/from16 v16, v4

    move-object v4, v10

    move/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v21, v13

    move-object/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v25, v16

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v27, v18

    const/16 v18, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x30

    const/4 v0, 0x1

    invoke-static/range {v3 .. v23}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v20

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    add-int/lit8 v9, v24, 0x1

    const/4 v7, 0x0

    move v8, v0

    move/from16 v4, v25

    move-object/from16 v6, v27

    move-object/from16 v5, v28

    move-object/from16 v0, p0

    goto/16 :goto_7

    :cond_f
    move v11, v7

    move v0, v8

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v3, Lkl2/f;

    const/16 v4, 0xb

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final m(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLc93/a;ZLjava/lang/String;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move/from16 v0, p2

    move/from16 v3, p3

    move/from16 v6, p5

    move-object/from16 v11, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    const v1, -0x44c65ce5

    invoke-virtual {v9, v1}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p9, v2

    invoke-virtual {v9, v0}, Lp1/q;->h(Z)Z

    move-result v4

    const/16 v5, 0x100

    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const/16 v4, 0x80

    :goto_1
    or-int/2addr v2, v4

    invoke-virtual {v9, v3}, Lp1/q;->h(Z)Z

    move-result v4

    const/16 v7, 0x800

    if-eqz v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    const/16 v4, 0x400

    :goto_2
    or-int/2addr v2, v4

    move-object/from16 v10, p4

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x4000

    goto :goto_3

    :cond_3
    const/16 v4, 0x2000

    :goto_3
    or-int/2addr v2, v4

    invoke-virtual {v9, v6}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/high16 v4, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v4, 0x10000

    :goto_4
    or-int/2addr v2, v4

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/high16 v12, 0x100000

    if-eqz v4, :cond_5

    move v4, v12

    goto :goto_5

    :cond_5
    const/high16 v4, 0x80000

    :goto_5
    or-int/2addr v2, v4

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v4, 0x400000

    :goto_6
    or-int/2addr v2, v4

    const v4, 0x492493

    and-int/2addr v4, v2

    const v13, 0x492492

    if-eq v4, v13, :cond_7

    const/4 v4, 0x1

    goto :goto_7

    :cond_7
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v9, v13, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    and-int/lit16 v4, v2, 0x1c00

    if-ne v4, v7, :cond_8

    const/4 v4, 0x1

    goto :goto_8

    :cond_8
    const/4 v4, 0x0

    :goto_8
    and-int/lit16 v7, v2, 0x380

    if-ne v7, v5, :cond_9

    const/4 v5, 0x1

    goto :goto_9

    :cond_9
    const/4 v5, 0x0

    :goto_9
    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_b

    if-ne v5, v7, :cond_a

    goto :goto_a

    :cond_a
    move-object v4, v5

    goto :goto_c

    :cond_b
    :goto_a
    if-eqz v3, :cond_c

    if-nez v0, :cond_c

    sget v4, Lo1/g;->l:F

    iget-wide v14, v8, Ll1/y;->u:J

    invoke-static {v4, v14, v15}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v4

    goto :goto_b

    :cond_c
    const/4 v4, 0x0

    :goto_b
    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object/from16 v19, v4

    check-cast v19, Lf0/t;

    const/high16 v4, 0x380000

    and-int/2addr v4, v2

    if-ne v4, v12, :cond_d

    const/4 v14, 0x1

    goto :goto_d

    :cond_d
    const/4 v14, 0x0

    :goto_d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_e

    if-ne v4, v7, :cond_f

    :cond_e
    new-instance v4, Lht2/d;

    const/16 v7, 0xe

    invoke-direct {v4, v11, v7}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v7, p1

    const/4 v5, 0x1

    invoke-static {v7, v5, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    sget-object v4, Lo1/g;->D:Lo1/t;

    invoke-static {v4, v9}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v21

    shr-int/lit8 v4, v2, 0x6

    and-int/lit8 v22, v4, 0xe

    if-eqz v0, :cond_11

    if-eqz v6, :cond_10

    iget-wide v12, v8, Ll1/y;->l:J

    goto :goto_e

    :cond_10
    iget-wide v12, v8, Ll1/y;->m:J

    goto :goto_e

    :cond_11
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-wide v12, Li2/x;->m:J

    :goto_e
    sget-object v5, Lo1/n;->y:Lo1/n;

    invoke-static {v5, v9}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v14

    const/16 v17, 0x0

    const/16 v18, 0xc

    const/4 v15, 0x0

    move-object/from16 v16, v9

    invoke-static/range {v12 .. v18}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v5

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v12, v5, Li2/x;->a:J

    new-instance v0, Ll1/x0;

    const/4 v6, 0x1

    move-object v5, v8

    move v8, v2

    move-object v2, v5

    move/from16 v5, p5

    move v14, v4

    move/from16 v4, p2

    invoke-direct/range {v0 .. v6}, Ll1/x0;-><init>(Ljava/lang/String;Ll1/y;ZZZI)V

    const v1, -0x21a4113b

    invoke-static {v1, v9, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x9

    and-int/lit8 v1, v1, 0x70

    or-int v1, v22, v1

    and-int/lit16 v2, v14, 0x1c00

    or-int/2addr v1, v2

    move-object v2, v10

    move v10, v1

    move-object v1, v2

    move/from16 v3, p5

    move-object v8, v0

    move-wide v5, v12

    move-object/from16 v7, v19

    move-object/from16 v2, v20

    move-object/from16 v4, v21

    move/from16 v0, p2

    invoke-static/range {v0 .. v10}, Ll1/c4;->b(ZLc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_f

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Ll1/n0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p9

    move-object v7, v11

    invoke-direct/range {v0 .. v9}, Ll1/n0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZLc93/a;ZLjava/lang/String;Ll1/y;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final n(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Ll1/n3;Lm1/o;Li93/j;Ll1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0x4cb48864

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, p1, p2}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int v1, p9, v1

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x100

    goto :goto_1

    :cond_1
    const/16 v2, 0x80

    :goto_1
    or-int/2addr v1, v2

    move-object/from16 v7, p4

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x800

    goto :goto_2

    :cond_2
    const/16 v2, 0x400

    :goto_2
    or-int/2addr v1, v2

    move-object/from16 v8, p5

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x4000

    goto :goto_3

    :cond_3
    const/16 v2, 0x2000

    :goto_3
    or-int/2addr v1, v2

    move-object/from16 v6, p6

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/high16 v2, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v2, 0x10000

    :goto_4
    or-int/2addr v1, v2

    move-object/from16 v10, p7

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/high16 v2, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v2, 0x80000

    :goto_5
    or-int/2addr v1, v2

    const v2, 0x92493

    and-int/2addr v2, v1

    const v3, 0x92492

    const/4 v4, 0x1

    if-eq v2, v3, :cond_6

    move v2, v4

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    and-int/2addr v1, v4

    invoke-virtual {v0, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lo1/g;->A:Lo1/c0;

    invoke-static {v1, v0}, Ll1/z4;->a(Lo1/c0;Landroidx/compose/runtime/Composer;)Ll3/v0;

    move-result-object v1

    new-instance v2, Ll1/e1;

    move-wide v4, p1

    move-object v9, p3

    move-object v3, v8

    move-object v8, v10

    move-object v10, v7

    move-object v7, p0

    invoke-direct/range {v2 .. v10}, Ll1/e1;-><init>(Lm1/o;JLi93/j;Landroidx/compose/ui/Modifier;Ll1/y;Lkotlin/jvm/functions/Function1;Ll1/n3;)V

    const v3, 0x4d99a88d    # 3.2224502E8f

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v1, v2, v0, v3}, Ll1/o4;->a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v2, Ll1/j0;

    move-object v3, p0

    move-wide v4, p1

    move-object v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p9

    invoke-direct/range {v2 .. v11}, Ll1/j0;-><init>(Landroidx/compose/ui/Modifier;JLkotlin/jvm/functions/Function1;Ll1/n3;Lm1/o;Li93/j;Ll1/y;I)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final o(Lc93/a;ZLandroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move/from16 v6, p1

    move-object/from16 v5, p3

    move/from16 v1, p5

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x2a509101

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    move-object/from16 v3, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v2, v1, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v14, v6}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    or-int/lit16 v0, v0, 0x180

    and-int/lit16 v2, v1, 0xc00

    if-nez v2, :cond_5

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x800

    goto :goto_3

    :cond_4
    const/16 v2, 0x400

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x493

    const/16 v4, 0x492

    if-eq v2, v4, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    const/4 v2, 0x0

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v14, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v10, Lt0/j;->a:Lt0/i;

    sget-object v2, Ll1/g;->a:Ll0/l1;

    sget-object v2, Ll1/s;->a:Lp1/b0;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v7, v2, Li2/x;->a:J

    sget-wide v16, Li2/x;->n:J

    sget-object v2, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/m;

    invoke-static {v2}, Ll1/g;->a(Ll1/m;)Ll1/f;

    move-result-object v15

    move-wide/from16 v20, v16

    move-wide/from16 v22, v16

    move-wide/from16 v18, v7

    invoke-virtual/range {v15 .. v23}, Ll1/f;->a(JJJJ)Ll1/f;

    move-result-object v11

    new-instance v2, Ld30/n0;

    invoke-direct {v2, v5, v6}, Ld30/n0;-><init>(Lx1/b;Z)V

    const v4, 0x7137ea62

    invoke-static {v4, v14, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    and-int/lit8 v2, v0, 0xe

    const/high16 v4, 0x301b0000

    or-int/2addr v2, v4

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int v15, v2, v0

    const/16 v16, 0x184

    sget-object v8, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v7, v3

    invoke-static/range {v7 .. v16}, Ll1/k3;->i(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    goto :goto_5

    :cond_7
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v4, p2

    :goto_5
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_8

    new-instance v0, Lar2/a;

    const/16 v2, 0x15

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final p(Ljava/lang/Long;Ljava/lang/Long;Li93/j;Ll1/n3;Lp1/q;I)Ll1/h1;
    .locals 7

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    move-object v1, p0

    and-int/lit8 p0, p5, 0x4

    if-eqz p0, :cond_1

    sget-object p2, Ll1/b0;->b:Li93/j;

    :cond_1
    move-object v3, p2

    const p0, 0x7c7adbf1

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    sget-object p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {p4, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/res/Configuration;

    invoke-virtual {p0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {p4, p2}, Lp1/q;->q(Z)V

    new-array p0, p2, [Ljava/lang/Object;

    new-instance p5, Lkf0/l;

    const/4 v0, 0x5

    invoke-direct {p5, v0}, Lkf0/l;-><init>(I)V

    new-instance v0, Ljp1/c;

    const/16 v2, 0x11

    invoke-direct {v0, v2, p3, v5}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p5, v0}, Ly1/k;->b(Lc93/m;Lkotlin/jvm/functions/Function1;)Lp0/n0;

    move-result-object p5

    invoke-virtual {p4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p4, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p4, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v4, p3

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v0, La00/h;

    const/16 v6, 0xd

    move-object v2, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :goto_1
    check-cast v2, Lc93/a;

    invoke-static {p0, p5, v2, p4, p2}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll1/h1;

    iget-object p1, p0, Ll1/h1;->d:Lp1/k1;

    invoke-virtual {p1, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object p0
.end method
