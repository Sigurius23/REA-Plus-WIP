.class public abstract Lg1/d3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    int-to-float v0, v0

    sput v0, Lg1/d3;->a:F

    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v6, p3

    move/from16 v1, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x4e7aa5a1

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x4

    move-object/from16 v12, p0

    if-nez v2, :cond_1

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    or-int/lit16 v2, v2, 0xc00

    and-int/lit16 v9, v1, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_6

    :cond_8
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v2, v9

    :cond_9
    and-int/lit16 v9, v2, 0x2493

    const/16 v10, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v9, v10, :cond_a

    move v9, v15

    goto :goto_7

    :cond_a
    move v9, v14

    :goto_7
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_11

    if-eqz v4, :cond_b

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_b
    move-object v4, v5

    :goto_8
    if-eqz v7, :cond_c

    move v10, v15

    goto :goto_9

    :cond_c
    move v10, v8

    :goto_9
    sget-object v5, Lg1/h3;->a:Lp1/u2;

    sget-object v5, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v5, Lg1/d3;->a:F

    const-wide/16 v8, 0x0

    invoke-static {v8, v9, v3, v14, v5}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v9

    new-instance v11, Li3/i;

    invoke-direct {v11, v14}, Li3/i;-><init>(I)V

    const/16 v13, 0x8

    const/4 v8, 0x0

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v7, v0, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v10, :cond_10

    const v3, -0x6fbd9c5e

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lg1/j1;->a:Lp1/b0;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_10
    const v3, -0x6fbd991d

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-static {v0}, Lds/p;->G(Landroidx/compose/runtime/Composer;)F

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    const v3, 0x3ec28f5c    # 0.38f

    :goto_b
    sget-object v5, Lg1/j1;->a:Lp1/b0;

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v3

    shr-int/lit8 v2, v2, 0x9

    and-int/lit8 v2, v2, 0x70

    const/16 v5, 0x8

    or-int/2addr v2, v5

    invoke-static {v3, v6, v0, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    move-object v5, v4

    move v7, v10

    goto :goto_c

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    move v7, v8

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lf61/e;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lf61/e;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method
