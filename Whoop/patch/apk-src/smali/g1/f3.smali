.class public abstract Lg1/f3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/ui/Modifier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x18

    int-to-float v0, v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lg1/f3;->a:Landroidx/compose/ui/Modifier;

    return-void
.end method

.method public static final a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x44202ba2

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    move-object/from16 v8, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    :goto_4
    and-int/lit16 v7, v6, 0xc00

    const/16 v9, 0x800

    if-nez v7, :cond_8

    and-int/lit8 v7, p7, 0x8

    move-wide/from16 v10, p3

    if-nez v7, :cond_7

    invoke-virtual {v0, v10, v11}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v9

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v1, v7

    goto :goto_6

    :cond_8
    move-wide/from16 v10, p3

    :goto_6
    and-int/lit16 v7, v1, 0x493

    const/16 v12, 0x492

    if-eq v7, v12, :cond_9

    const/4 v7, 0x1

    goto :goto_7

    :cond_9
    const/4 v7, 0x0

    :goto_7
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v0, v12, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v6, 0x1

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_a

    goto :goto_9

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_d

    :goto_8
    and-int/lit16 v1, v1, -0x1c01

    goto :goto_a

    :cond_b
    :goto_9
    if-eqz v3, :cond_c

    move-object v5, v12

    :cond_c
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_d

    sget-object v3, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/x;

    iget-wide v10, v3, Li2/x;->a:J

    sget-object v3, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-static {v3, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    goto :goto_8

    :cond_d
    :goto_a
    invoke-virtual {v0}, Lp1/q;->r()V

    and-int/lit16 v3, v1, 0x1c00

    xor-int/lit16 v3, v3, 0xc00

    if-le v3, v9, :cond_e

    invoke-virtual {v0, v10, v11}, Lp1/q;->f(J)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    and-int/lit16 v3, v1, 0xc00

    if-ne v3, v9, :cond_10

    :cond_f
    const/4 v3, 0x1

    goto :goto_b

    :cond_10
    const/4 v3, 0x0

    :goto_b
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_11

    if-ne v7, v9, :cond_13

    :cond_11
    sget-wide v13, Li2/x;->n:J

    invoke-static {v10, v11, v13, v14}, Li2/x;->d(JJ)Z

    move-result v7

    if-eqz v7, :cond_12

    const/4 v7, 0x0

    goto :goto_c

    :cond_12
    new-instance v7, Li2/p;

    const/4 v13, 0x5

    invoke-direct {v7, v10, v11, v13}, Li2/p;-><init>(JI)V

    :goto_c
    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v7, Li2/y;

    if-eqz v2, :cond_17

    const v13, 0x24502346

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v4, :cond_14

    const/4 v13, 0x1

    goto :goto_d

    :cond_14
    const/4 v13, 0x0

    :goto_d
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v13, :cond_15

    if-ne v1, v9, :cond_16

    :cond_15
    new-instance v1, Le61/g;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-static {v12, v3, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    const/4 v3, 0x0

    const v1, 0x24528f84

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    move-object v1, v12

    :goto_e
    invoke-virtual {v8}, Ln2/a;->h()J

    move-result-wide v13

    move v3, v4

    move-object/from16 p2, v5

    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    invoke-static {v13, v14, v4, v5}, Lh2/e;->b(JJ)Z

    move-result v4

    if-nez v4, :cond_19

    invoke-virtual {v8}, Ln2/a;->h()J

    move-result-wide v4

    shr-long v13, v4, v3

    long-to-int v3, v13

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v3

    if-eqz v3, :cond_18

    const-wide v13, 0xffffffffL

    and-long v3, v4, v13

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_10

    :cond_18
    :goto_f
    move-object/from16 v5, p2

    goto :goto_11

    :cond_19
    :goto_10
    sget-object v12, Lg1/f3;->a:Landroidx/compose/ui/Modifier;

    goto :goto_f

    :goto_11
    invoke-interface {v5, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-wide v9, v10

    const/4 v11, 0x0

    const/16 v13, 0x16

    move-wide v14, v9

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->b:Ly2/b1;

    move-object v12, v7

    move-object v7, v3

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/draw/a;->d(Landroidx/compose/ui/Modifier;Ln2/a;Lb2/h;Ly2/k;FLi2/y;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v0, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v5

    move-wide v4, v14

    goto :goto_12

    :cond_1a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, v5

    move-wide v4, v10

    :goto_12
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, Lg1/e3;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lg1/e3;-><init>(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;JIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
    .locals 8

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    sget-object p2, Lb2/t;->w:Lb2/t;

    :cond_0
    move-object v2, p2

    const/16 p2, 0x8

    and-int/2addr p7, p2

    if-eqz p7, :cond_1

    sget-object p3, Lg1/l1;->a:Lp1/b0;

    move-object p4, p5

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Li2/x;

    iget-wide v0, p3, Li2/x;->a:J

    sget-object p3, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {p4, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    invoke-static {p3, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide p3

    :cond_1
    move-wide v3, p3

    invoke-static {p0, p5}, Lo2/a;->c(Lo2/e;Landroidx/compose/runtime/Composer;)Landroidx/compose/ui/graphics/vector/VectorPainter;

    move-result-object v0

    and-int/lit8 p0, p6, 0x70

    or-int/2addr p0, p2

    and-int/lit16 p2, p6, 0x380

    or-int/2addr p0, p2

    and-int/lit16 p2, p6, 0x1c00

    or-int v6, p0, p2

    const/4 v7, 0x0

    move-object v1, p1

    move-object v5, p5

    invoke-static/range {v0 .. v7}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    return-void
.end method
