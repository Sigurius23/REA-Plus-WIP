.class public abstract Ll1/r1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lb2/t;->w:Lb2/t;

    sget v1, Lo1/w;->d:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Ll1/r1;->a:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v4, p3

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x7faffaf9

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move v8, v9

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v6, 0xc00

    const/16 v10, 0x800

    if-nez v8, :cond_7

    invoke-virtual {v0, v4, v5}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v10

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x493

    const/16 v11, 0x492

    const/4 v14, 0x0

    if-eq v8, v11, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v14

    :goto_5
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v8, v6, 0x1

    if-eqz v8, :cond_a

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_a
    :goto_6
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit16 v8, v7, 0x1c00

    xor-int/lit16 v8, v8, 0xc00

    if-le v8, v10, :cond_b

    invoke-virtual {v0, v4, v5}, Lp1/q;->f(J)Z

    move-result v8

    if-nez v8, :cond_c

    :cond_b
    and-int/lit16 v8, v7, 0xc00

    if-ne v8, v10, :cond_d

    :cond_c
    const/4 v8, 0x1

    goto :goto_7

    :cond_d
    move v8, v14

    :goto_7
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_e

    if-ne v10, v11, :cond_10

    :cond_e
    sget-wide v12, Li2/x;->n:J

    invoke-static {v4, v5, v12, v13}, Li2/x;->d(JJ)Z

    move-result v8

    if-eqz v8, :cond_f

    const/4 v8, 0x0

    :goto_8
    move-object v10, v8

    goto :goto_9

    :cond_f
    new-instance v8, Li2/p;

    const/4 v10, 0x5

    invoke-direct {v8, v4, v5, v10}, Li2/p;-><init>(JI)V

    goto :goto_8

    :goto_9
    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v12, v10

    check-cast v12, Li2/y;

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_14

    const v10, -0x2001d503

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v7, 0x70

    if-ne v7, v9, :cond_11

    const/4 v7, 0x1

    goto :goto_a

    :cond_11
    move v7, v14

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_12

    if-ne v10, v11, :cond_13

    :cond_12
    new-instance v10, Le61/g;

    const/4 v7, 0x4

    invoke-direct {v10, v2, v7}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v14, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object v15, v7

    goto :goto_b

    :cond_14
    const v7, -0x1fff68c5

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object v15, v8

    :goto_b
    invoke-virtual {v1}, Ln2/a;->h()J

    move-result-wide v10

    move-object/from16 v16, v15

    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v10, v11, v14, v15}, Lh2/e;->b(JJ)Z

    move-result v7

    if-nez v7, :cond_15

    invoke-virtual {v1}, Ln2/a;->h()J

    move-result-wide v10

    shr-long v13, v10, v9

    long-to-int v7, v13

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v7

    if-eqz v7, :cond_16

    const-wide v13, 0xffffffffL

    and-long v9, v10, v13

    long-to-int v7, v9

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v7

    if-eqz v7, :cond_16

    :cond_15
    sget-object v8, Ll1/r1;->a:Landroidx/compose/ui/Modifier;

    :cond_16
    invoke-interface {v3, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x0

    const/16 v13, 0x16

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->b:Ly2/b1;

    move-object v8, v1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/draw/a;->d(Landroidx/compose/ui/Modifier;Ln2/a;Lb2/h;Ly2/k;FLi2/y;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v7, v16

    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v0, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Ll1/q1;

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Ll1/q1;-><init>(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JI)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
    .locals 14

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x79033cc

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, v6, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v12, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v2, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v2, v6, 0x180

    if-nez v2, :cond_4

    move-object/from16 v2, p2

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_3

    :cond_6
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :goto_4
    and-int/lit16 v3, v6, 0xc00

    if-nez v3, :cond_9

    and-int/lit8 v3, p7, 0x8

    if-nez v3, :cond_7

    move-wide/from16 v3, p3

    invoke-virtual {v12, v3, v4}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    move-wide/from16 v3, p3

    :cond_8
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    goto :goto_6

    :cond_9
    move-wide/from16 v3, p3

    :goto_6
    and-int/lit16 v5, v0, 0x493

    const/16 v7, 0x492

    if-eq v5, v7, :cond_a

    const/4 v5, 0x1

    goto :goto_7

    :cond_a
    const/4 v5, 0x0

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v5, v6, 0x1

    if-eqz v5, :cond_d

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_c

    and-int/lit16 v0, v0, -0x1c01

    :cond_c
    move-object v9, v2

    :goto_8
    move-wide v10, v3

    goto :goto_b

    :cond_d
    :goto_9
    if-eqz v1, :cond_e

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_a

    :cond_e
    move-object v1, v2

    :goto_a
    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_f

    invoke-static {}, Ll1/s;->a()Lp1/b0;

    move-result-object v2

    invoke-virtual {v12, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    and-int/lit16 v0, v0, -0x1c01

    move-object v9, v1

    move-wide v10, v2

    goto :goto_b

    :cond_f
    move-object v9, v1

    goto :goto_8

    :goto_b
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-static {p0, v12}, Lo2/a;->c(Lo2/e;Landroidx/compose/runtime/Composer;)Landroidx/compose/ui/graphics/vector/VectorPainter;

    move-result-object v7

    and-int/lit8 v1, v0, 0x70

    const/16 v2, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v2, v0, 0x380

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x1c00

    or-int v13, v1, v0

    move-object v8, p1

    invoke-static/range {v7 .. v13}, Ll1/r1;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;I)V

    move-object v3, v9

    move-wide v4, v10

    goto :goto_c

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    move-wide v4, v3

    move-object v3, v2

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_11

    new-instance v0, Lg1/e3;

    const/4 v8, 0x1

    move-object v1, p0

    move-object v2, p1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lg1/e3;-><init>(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;JIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method
