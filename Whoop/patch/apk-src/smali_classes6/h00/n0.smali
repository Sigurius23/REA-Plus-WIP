.class public abstract Lh00/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    int-to-float v0, v0

    sput v0, Lh00/n0;->a:F

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lh00/n0;->b:F

    return-void
.end method

.method public static final a(Lh00/o0;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p3, Lp1/q;

    const v0, -0x3dbf81bb

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/16 v2, 0x800

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v3, 0x492

    if-ne v1, v3, :cond_4

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    goto :goto_5

    :cond_4
    :goto_3
    sget-object v1, Lh00/o0;->y:Lh00/o0;

    if-ne p0, v1, :cond_8

    if-eqz p1, :cond_8

    sget-object v1, Lb2/t;->w:Lb2/t;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v1}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v3, -0x700e641d

    invoke-virtual {p3, v3}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x1c00

    const/4 v3, 0x0

    if-ne v0, v2, :cond_5

    const/4 v0, 0x1

    goto :goto_4

    :cond_5
    move v0, v3

    :goto_4
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Lb30/h2;

    const/4 v0, 0x0

    const/4 v4, 0x1

    invoke-direct {v2, p2, v0, v4}, Lb30/h2;-><init>(Lc93/a;Lq83/d;I)V

    invoke-virtual {p3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    invoke-virtual {p3, v3}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v1, v0, v2}, Lu2/c0;->c(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lc93/m;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p3, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_8
    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_9

    new-instance v0, La31/c;

    const/4 v5, 0x5

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, La31/c;-><init>(Ljava/lang/Object;ZLl83/e;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lh00/o0;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    const-string v0, "label"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onButtonClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    const v0, 0x703c5a7c

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v7, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move/from16 v6, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v6, v7, 0x6000

    if-nez v6, :cond_8

    move/from16 v6, p4

    invoke-virtual {v8, v6}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_5

    :cond_a
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit8 v9, p8, 0x20

    const/high16 v10, 0x30000

    if-eqz v9, :cond_c

    or-int/2addr v0, v10

    :cond_b
    move-object/from16 v10, p5

    goto :goto_8

    :cond_c
    and-int/2addr v10, v7

    if-nez v10, :cond_b

    move-object/from16 v10, p5

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v0, v11

    :goto_8
    const/high16 v11, 0xd80000

    or-int/2addr v0, v11

    const v11, 0x492493

    and-int/2addr v0, v11

    const v11, 0x492492

    if-ne v0, v11, :cond_f

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    move v5, v6

    move-object v6, v10

    goto/16 :goto_f

    :cond_f
    :goto_9
    const/4 v0, 0x0

    if-eqz v5, :cond_10

    move v6, v0

    :cond_10
    if-eqz v9, :cond_12

    const v5, -0x7beebac3

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v5, v9, :cond_11

    new-instance v5, Lh00/d0;

    const/4 v9, 0x1

    invoke-direct {v5, v9}, Lh00/d0;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lc93/a;

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_12
    move-object v5, v10

    :goto_a
    sget-object v9, Lg1/j1;->a:Lp1/b0;

    sget-object v10, Lh00/o0;->y:Lh00/o0;

    if-ne v3, v10, :cond_14

    const v10, -0x7bee9f5d

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li2/x;

    iget-wide v10, v10, Li2/x;->a:J

    sget-object v12, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/c1;

    invoke-virtual {v12}, Lg1/c1;->i()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    goto :goto_b

    :cond_13
    invoke-static {v10, v11}, Li2/w0;->x(J)F

    :goto_b
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const v0, 0x3ec28f5c    # 0.38f

    goto :goto_e

    :cond_14
    const v10, -0x7bee9c01

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li2/x;

    iget-wide v10, v10, Li2/x;->a:J

    sget-object v12, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/c1;

    invoke-virtual {v12}, Lg1/c1;->i()Z

    move-result v12

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    if-eqz v12, :cond_15

    invoke-static {v10, v11}, Li2/w0;->x(J)F

    move-result v10

    float-to-double v10, v10

    cmpl-double v10, v10, v13

    if-lez v10, :cond_16

    goto :goto_c

    :cond_15
    invoke-static {v10, v11}, Li2/w0;->x(J)F

    move-result v10

    float-to-double v10, v10

    cmpg-double v10, v10, v13

    if-gez v10, :cond_16

    :goto_c
    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_16
    const v10, 0x3f5eb852    # 0.87f

    :goto_d
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move v0, v10

    :goto_e
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v9, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v9

    new-instance v0, Lh00/m0;

    move v15, v6

    move-object v6, v2

    move-object v2, v4

    move v4, v15

    invoke-direct/range {v0 .. v6}, Lh00/m0;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;Lh00/o0;ZLc93/a;Ljava/lang/String;)V

    const v1, 0xf443dbc

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {v9, v0, v8, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v6, v5

    move v5, v4

    :goto_f
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_17

    new-instance v0, Lb30/i2;

    const/4 v9, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZLc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p0, Lp1/q;

    const v0, -0x7ddbadfd

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p1, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p1

    goto :goto_1

    :cond_1
    move v0, p1

    :goto_1
    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lp1/q;->X()V

    goto :goto_4

    :cond_3
    :goto_2
    sget-object v0, Lb2/t;->w:Lb2/t;

    sget v1, Lh00/n0;->a:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lh00/n0;->b:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v3, p0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p0, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v6, p0, Lp1/q;->S:Z

    if-eqz v6, :cond_4

    invoke-virtual {p0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_3
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p0, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, p0, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v3, p0, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p0, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x10a14641

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v2}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lf01/c0;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lf01/c0;-><init>(BII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final d(Lh00/o0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v2, 0x25685b40

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p3, v2

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v2, v5

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v2, v7

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x800

    goto :goto_3

    :cond_3
    const/16 v5, 0x400

    :goto_3
    or-int/2addr v2, v5

    and-int/lit16 v5, v2, 0x493

    const/16 v7, 0x492

    if-ne v5, v7, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v10, v1

    goto/16 :goto_8

    :cond_5
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    sget-object v7, Lb2/t;->w:Lb2/t;

    sget-object v8, Lp1/l;->a:Lp1/v0;

    const v9, -0x1a6f7841

    const/4 v10, 0x0

    if-eq v5, v4, :cond_c

    const/4 v3, 0x3

    if-eq v5, v3, :cond_a

    const v4, -0x1afca39a

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v8, v7, v6, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v6, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v6, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v8, v6, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v6, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v5, v2, 0x6

    and-int/lit8 v5, v5, 0xe

    invoke-static {v6, v5}, Lh00/n0;->c(Landroidx/compose/runtime/Composer;I)V

    float-to-double v7, v4

    const-wide/16 v11, 0x0

    cmpl-double v5, v7, v11

    if-lez v5, :cond_9

    :goto_6
    move v5, v2

    goto :goto_7

    :cond_9
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v2, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v6, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    iget-wide v8, v4, Lg00/b;->t:J

    sget-object v4, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v6, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v4, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    new-instance v13, Lw3/k;

    invoke-direct {v13, v3}, Lw3/k;-><init>(I)V

    const v3, -0x548d6062

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg00/e;

    invoke-virtual {v6, v10}, Lp1/q;->q(Z)V

    iget-object v3, v3, Lg00/e;->c:Ll3/v0;

    shr-int/lit8 v4, v5, 0x3

    and-int/lit8 v23, v4, 0xe

    const/16 v24, 0x0

    const v25, 0xfdf8

    move v4, v5

    move-object/from16 v22, v6

    const-wide/16 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object/from16 v21, v3

    move-wide/from16 v29, v8

    move v9, v4

    move-wide/from16 v3, v29

    const/4 v8, 0x0

    move v12, v9

    const/4 v9, 0x0

    move v14, v10

    move v15, v11

    const-wide/16 v10, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v0, v26

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v1

    move-object/from16 v6, v22

    shr-int/lit8 v1, v27, 0x9

    and-int/lit8 v1, v1, 0xe

    invoke-static {v6, v1}, Lh00/n0;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_a
    move v14, v10

    move-object v10, v1

    const v0, -0x1afcd0fb

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const v0, 0x7f08085d

    invoke-static {v0, v6, v14}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, -0x1afcb7ca

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_b

    new-instance v2, Lh00/l0;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lh00/l0;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    invoke-static {v0, v14, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    sget-object v0, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v6, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg00/b;

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    iget-wide v4, v0, Lg00/b;->t:J

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    move-object v10, v1

    const v0, -0x44a2d311

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/16 v0, 0x14

    int-to-float v0, v0

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, -0x1afcf30a

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_d

    new-instance v1, Lgo1/a;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lgo1/a;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    invoke-static {v0, v14, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    sget-object v1, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v6, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg00/b;

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    iget-wide v4, v2, Lg00/b;->e:J

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    int-to-float v2, v3

    invoke-virtual {v6, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg00/b;

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    iget-wide v7, v1, Lg00/b;->t:J

    move v1, v2

    const/16 v2, 0xc00

    const/4 v3, 0x0

    move-wide/from16 v29, v7

    move-object v8, v6

    move-wide v6, v4

    move-wide/from16 v4, v29

    move-object v9, v0

    invoke-static/range {v1 .. v9}, Lup/d;->f(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v6, v8

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lf01/f;

    const/16 v2, 0x17

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v1, v3, v10, v4, v2}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final e(Ly00/c8;Lwz/n0;)Lzy/b;
    .locals 4

    const-string v0, "stripeIntent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkLaunchMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwz/l0;

    const v1, 0x7f140feb

    if-nez v0, :cond_3

    instance-of v0, p1, Lwz/k0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of p0, p1, Lwz/m0;

    if-nez p0, :cond_2

    instance-of p0, p1, Lwz/i0;

    if-nez p0, :cond_2

    instance-of p0, p1, Lwz/j0;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    :goto_0
    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_1
    instance-of p1, p0, Ly00/l3;

    if-eqz p1, :cond_6

    new-instance p1, Lu30/a;

    check-cast p0, Ly00/l3;

    iget-object v0, p0, Ly00/l3;->y:Ljava/lang/Long;

    const-string v1, "Required value was null."

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    iget-object p0, p0, Ly00/l3;->K:Ljava/lang/String;

    if-eqz p0, :cond_4

    invoke-direct {p1, v2, v3, p0}, Lu30/a;-><init>(JLjava/lang/String;)V

    invoke-virtual {p1}, Lu30/a;->b()Lzy/b;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    instance-of p0, p0, Ly00/g6;

    if-eqz p0, :cond_7

    invoke-static {v1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p0

    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
