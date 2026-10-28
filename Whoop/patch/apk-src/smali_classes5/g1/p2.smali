.class public abstract Lg1/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lg1/p2;->a:F

    const/16 v0, 0x190

    int-to-float v0, v0

    sput v0, Lg1/p2;->b:F

    new-instance v0, Ld0/e2;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/16 v3, 0x100

    invoke-direct {v0, v3, v1, v2}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/p2;->c:Ld0/e2;

    return-void
.end method

.method public static final a(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/s0;ZLi2/a1;FJJJLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v2, p1

    move/from16 v14, p14

    move-object/from16 v7, p13

    check-cast v7, Lp1/q;

    const v0, -0x53a76414    # -3.0782E-12f

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v14, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v14

    goto :goto_1

    :cond_1
    move v0, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v14, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v4, v14, 0xc00

    if-nez v4, :cond_7

    move/from16 v4, p3

    invoke-virtual {v7, v4}, Lp1/q;->h(Z)Z

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
    move/from16 v4, p3

    :goto_6
    and-int/lit16 v5, v14, 0x6000

    if-nez v5, :cond_9

    move-object/from16 v5, p4

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_7

    :cond_8
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v0, v6

    goto :goto_8

    :cond_9
    move-object/from16 v5, p4

    :goto_8
    const/high16 v6, 0x30000

    or-int/2addr v0, v6

    const/high16 v6, 0x180000

    and-int/2addr v6, v14

    move-wide/from16 v8, p6

    if-nez v6, :cond_b

    invoke-virtual {v7, v8, v9}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x100000

    goto :goto_9

    :cond_a
    const/high16 v6, 0x80000

    :goto_9
    or-int/2addr v0, v6

    :cond_b
    const/high16 v6, 0xc00000

    and-int/2addr v6, v14

    move-wide/from16 v10, p8

    if-nez v6, :cond_d

    invoke-virtual {v7, v10, v11}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x800000

    goto :goto_a

    :cond_c
    const/high16 v6, 0x400000

    :goto_a
    or-int/2addr v0, v6

    :cond_d
    const/high16 v6, 0x6000000

    and-int/2addr v6, v14

    move-wide/from16 v12, p10

    if-nez v6, :cond_f

    invoke-virtual {v7, v12, v13}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x4000000

    goto :goto_b

    :cond_e
    const/high16 v6, 0x2000000

    :goto_b
    or-int/2addr v0, v6

    :cond_f
    const/high16 v6, 0x30000000

    and-int/2addr v6, v14

    if-nez v6, :cond_11

    move-object/from16 v6, p12

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000000

    goto :goto_c

    :cond_10
    const/high16 v15, 0x10000000

    :goto_c
    or-int/2addr v0, v15

    goto :goto_d

    :cond_11
    move-object/from16 v6, p12

    :goto_d
    const v15, 0x12492493

    and-int/2addr v15, v0

    move/from16 p13, v0

    const v0, 0x12492492

    const/16 v16, 0x1

    if-eq v15, v0, :cond_12

    move/from16 v0, v16

    goto :goto_e

    :cond_12
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v15, p13, 0x1

    invoke-virtual {v7, v15, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v0, v14, 0x1

    if-eqz v0, :cond_14

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v7}, Lp1/q;->X()V

    move/from16 v27, p5

    goto :goto_10

    :cond_14
    :goto_f
    sget v0, Lg1/e2;->b:F

    move/from16 v27, v0

    :goto_10
    invoke-virtual {v7}, Lp1/q;->r()V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v0, v15, :cond_15

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v21, v0

    check-cast v21, Lbc3/c0;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v15, Lg1/k2;

    move-object/from16 v28, v1

    move-object/from16 v17, v3

    move/from16 v16, v4

    move-object/from16 v22, v5

    move-object/from16 v18, v6

    move-wide/from16 v23, v8

    move-wide/from16 v25, v10

    move-wide/from16 v19, v12

    invoke-direct/range {v15 .. v28}, Lg1/k2;-><init>(ZLg1/s0;Lx1/b;JLbc3/c0;Li2/a1;JJFLx1/b;)V

    const v1, 0x1bf2a5d6

    invoke-static {v1, v7, v15}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v8, 0xc00

    const/4 v9, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v0

    invoke-static/range {v3 .. v9}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move/from16 v6, v27

    goto :goto_11

    :cond_16
    invoke-virtual {v7}, Lp1/q;->X()V

    move/from16 v6, p5

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_17

    new-instance v0, Lg1/f2;

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v7, p6

    move-wide/from16 v9, p8

    move-wide/from16 v11, p10

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v14}, Lg1/f2;-><init>(Lx1/b;Landroidx/compose/ui/Modifier;Lg1/s0;ZLi2/a1;FJJJLx1/b;I)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final b(JLc93/a;ZLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-wide/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x1e94c902

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v1, v2}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p5, v0

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/16 v13, 0x20

    if-eqz v5, :cond_1

    move v5, v13

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v0, v5

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v5, v6, :cond_3

    move v5, v14

    goto :goto_3

    :cond_3
    move v5, v15

    :goto_3
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    const-wide/16 v5, 0x10

    cmp-long v5, v1, v5

    if-eqz v5, :cond_f

    const v5, 0x3bb6c774

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    if-eqz v4, :cond_4

    move v6, v5

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    :goto_4
    new-instance v7, Ld0/e2;

    const/4 v8, 0x0

    const/4 v10, 0x7

    invoke-direct {v7, v15, v8, v10}, Ld0/e2;-><init>(ILd0/z;I)V

    const/16 v10, 0x30

    const/16 v11, 0x1c

    move v8, v5

    move v5, v6

    move-object v6, v7

    const/4 v7, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v12, v16

    invoke-static/range {v5 .. v11}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v5

    invoke-static {v9, v14}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    const v10, 0x3bba2430

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    and-int/lit8 v10, v0, 0x70

    if-ne v10, v13, :cond_5

    move v11, v14

    goto :goto_5

    :cond_5
    move v11, v15

    :goto_5
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_6

    if-ne v12, v8, :cond_7

    :cond_6
    new-instance v12, Lg1/l2;

    const/4 v11, 0x0

    invoke-direct {v12, v3, v11}, Lg1/l2;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v12, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    invoke-static {v7, v3, v12}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-ne v10, v13, :cond_8

    move v10, v14

    goto :goto_6

    :cond_8
    move v10, v15

    :goto_6
    or-int/2addr v10, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_9

    if-ne v12, v8, :cond_a

    :cond_9
    new-instance v12, Lg1/g2;

    const/4 v10, 0x0

    invoke-direct {v12, v10, v6, v3}, Lg1/g2;-><init>(ILjava/lang/String;Lc93/a;)V

    invoke-virtual {v9, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v14, v12}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_7
    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_b
    const v6, 0x3bbfb4bc

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    move-object v6, v7

    goto :goto_7

    :goto_8
    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    and-int/lit8 v0, v0, 0xe

    const/4 v7, 0x4

    if-ne v0, v7, :cond_c

    goto :goto_9

    :cond_c
    move v14, v15

    :goto_9
    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_d

    if-ne v7, v8, :cond_e

    :cond_d
    new-instance v7, Lc11/g;

    const/4 v0, 0x1

    invoke-direct {v7, v1, v2, v5, v0}, Lc11/g;-><init>(JLp1/t2;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7, v9, v15}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v0, 0x3bc24684

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lg1/h2;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lg1/h2;-><init>(JLc93/a;ZI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final c(Lg1/t0;Landroidx/compose/runtime/Composer;I)Lg1/s0;
    .locals 11

    move-object v0, p1

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_0

    new-instance v1, Lfq2/c;

    const/16 v3, 0x16

    invoke-direct {v1, v3}, Lfq2/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget-object v7, Lg1/e2;->a:Ld0/e2;

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ly3/c;

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ldw1/a;

    const/16 v3, 0x14

    invoke-direct {v1, v3}, Ldw1/a;-><init>(I)V

    new-instance v3, Lep1/g;

    const/16 v4, 0xa

    invoke-direct {v3, v5, v6, v7, v4}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v9, Lp0/n0;

    invoke-direct {v9, v4, v1, v3}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    and-int/lit8 v1, p2, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v3, 0x1

    const/4 v10, 0x0

    const/4 v4, 0x4

    if-le v1, v4, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {p1, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit8 v1, p2, 0x6

    if-ne v1, v4, :cond_3

    :cond_2
    move v1, v3

    goto :goto_0

    :cond_3
    move v1, v10

    :goto_0
    invoke-virtual {p1, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    and-int/lit8 v4, p2, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v8, 0x20

    if-le v4, v8, :cond_4

    invoke-virtual {p1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_4
    and-int/lit8 p2, p2, 0x30

    if-ne p2, v8, :cond_5

    goto :goto_1

    :cond_5
    move v3, v10

    :cond_6
    :goto_1
    or-int p2, v1, v3

    invoke-virtual {p1, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p2, v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_7

    if-ne v1, v2, :cond_8

    :cond_7
    new-instance v3, Lam2/d;

    const/16 v8, 0xa

    move-object v4, p0

    invoke-direct/range {v3 .. v8}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v3

    :cond_8
    check-cast v1, Lc93/a;

    invoke-static {v0, v9, v1, p1, v10}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/s0;

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;)Lg1/q2;
    .locals 8

    sget-object v0, Lg1/r2;->w:Lg1/r2;

    move-object v0, p0

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x15

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_0

    new-instance v1, Lfq2/c;

    invoke-direct {v1, v2}, Lfq2/c;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    new-instance v5, Ldw1/a;

    invoke-direct {v5, v2}, Ldw1/a;-><init>(I)V

    new-instance v2, Ldk2/i;

    const/16 v6, 0x1b

    invoke-direct {v2, v1, v6}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    new-instance v6, Lp0/n0;

    const/16 v7, 0xa

    invoke-direct {v6, v7, v5, v2}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v2, p0

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    check-cast p0, Lp1/q;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1

    if-ne v5, v3, :cond_2

    :cond_1
    new-instance v5, Lfa0/a;

    invoke-direct {v5, v1}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lc93/a;

    invoke-static {v4, v6, v5, p0, v0}, Ly1/k;->d([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/q2;

    return-object p0
.end method
