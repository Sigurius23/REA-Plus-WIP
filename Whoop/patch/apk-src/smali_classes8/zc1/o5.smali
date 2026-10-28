.class public abstract Lzc1/o5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Ll83/a0;",
        "A",
        "(Landroidx/compose/runtime/Composer;I)V",
        "n",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final A(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, 0x69cfdc12

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v3, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p0, v0}, Lzc1/o5;->n(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/a5;

    const/16 v1, 0xf

    invoke-direct {v0, p1, v1}, Lzc1/a5;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/o5;->A(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/o5;->p(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o5;->z(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzc1/o5;->r(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/o5;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/o5;->u(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/o5;->x()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/o5;->s(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/o5;->B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzc1/o5;->y(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/o5;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/o5;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzc1/o5;->w(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/o5;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final n(Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move/from16 v0, p1

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, -0x126d3752

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v13, 0x0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v1, v15, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v10, v1

    check-cast v10, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_2

    invoke-static {v13, v7}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v1

    :cond_2
    move-object v11, v1

    check-cast v11, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_3

    const/16 v1, 0x9

    invoke-static {v1, v7}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v1

    :cond_3
    move-object v12, v1

    check-cast v12, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    if-ne v1, v15, :cond_4

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_5

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    const-string v2, "Standard"

    const/4 v4, 0x6

    invoke-static {v2, v7, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v11}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v15, :cond_6

    new-instance v9, Lzc1/n5;

    const/4 v4, 0x0

    invoke-direct {v9, v4, v1}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_7

    new-instance v1, Lz91/a;

    const/16 v4, 0x19

    invoke-direct {v1, v4}, Lz91/a;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lc93/a;

    move v4, v8

    const v8, 0x36000

    move-object/from16 v16, v3

    move-object v3, v6

    move-object v6, v1

    move v1, v2

    move v2, v5

    move-object v5, v9

    const/4 v9, 0x0

    move-object/from16 v14, v16

    const/4 v13, 0x6

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Custom Number Color"

    invoke-static {v1, v7, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->l0()J

    move-result-wide v5

    invoke-virtual {v1, v7, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b()J

    move-result-wide v1

    new-instance v3, Lo71/b;

    invoke-direct {v3, v11, v12, v14, v10}, Lo71/b;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V

    const v4, 0x90b6a67

    invoke-static {v4, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    move-object v3, v11

    const/16 v11, 0x6000

    move-object v4, v12

    const/4 v12, 0x3

    move-object v14, v10

    move-object v10, v7

    move-wide v7, v1

    const-wide/16 v1, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v12}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    const-string v1, "Range"

    invoke-static {v1, v7, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v3, 0x0

    invoke-static {v1, v2, v7, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v7, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v7, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v2, v7, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v18, 0x0

    cmpl-double v4, v4, v18

    const-string v20, "invalid weight; must be greater than zero"

    if-lez v4, :cond_b

    goto :goto_2

    :cond_b
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v21, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v3, v21

    if-lez v5, :cond_c

    move/from16 v5, v21

    :goto_3
    const/4 v6, 0x1

    goto :goto_4

    :cond_c
    move v5, v3

    goto :goto_3

    :goto_4
    invoke-direct {v4, v5, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v5, Ll0/a1;->x:Ll0/a1;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v6, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v22, v14

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v7, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v13, v7, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v7, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Min"

    const/4 v13, 0x6

    invoke-static {v3, v7, v13}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v16 .. v16}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-interface/range {v22 .. v22}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v15, :cond_10

    new-instance v9, Lzc1/n5;

    const/4 v13, 0x1

    move-object/from16 v14, v16

    invoke-direct {v9, v13, v14}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v15, :cond_11

    new-instance v13, Lz91/a;

    const/16 v14, 0x1a

    invoke-direct {v13, v14}, Lz91/a;-><init>(I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lc93/a;

    move-object v14, v8

    const v8, 0x36036

    move-object/from16 v16, v5

    move-object v5, v9

    const/4 v9, 0x0

    move-object/from16 v23, v1

    const/high16 v1, -0x80000000

    move-object/from16 v24, v2

    const v2, 0x7fffffff

    move-object/from16 v27, v6

    move-object v6, v13

    move-object/from16 v28, v14

    move-object/from16 v26, v16

    move-object/from16 v14, v23

    move-object/from16 v25, v24

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x1

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    float-to-double v1, v13

    cmpl-double v1, v1, v18

    if-lez v1, :cond_12

    goto :goto_6

    :cond_12
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v13, v21

    if-lez v2, :cond_13

    move/from16 v3, v21

    :goto_7
    const/4 v6, 0x1

    goto :goto_8

    :cond_13
    move v3, v13

    goto :goto_7

    :goto_8
    invoke-direct {v1, v3, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v2, v26

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, v27

    move-object/from16 v3, v28

    const/16 v4, 0x30

    invoke-static {v3, v2, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_14

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_14
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v7, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_b

    :cond_15
    :goto_a
    move-object/from16 v2, v25

    goto :goto_c

    :cond_16
    :goto_b
    invoke-static {v3, v7, v3, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Max"

    const/4 v13, 0x6

    invoke-static {v1, v7, v13}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v17 .. v17}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Integer;

    invoke-interface/range {v22 .. v22}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_17

    new-instance v1, Lzc1/n5;

    const/4 v2, 0x2

    move-object/from16 v5, v17

    invoke-direct {v1, v2, v5}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_18

    new-instance v1, Lz91/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Lz91/a;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v6, v1

    check-cast v6, Lc93/a;

    const v8, 0x36036

    const/4 v9, 0x0

    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x1

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    const-string v1, "Disable"

    const/4 v13, 0x6

    invoke-static {v1, v7, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lea2/g;

    const/16 v2, 0xe

    move-object/from16 v14, v22

    invoke-direct {v1, v2, v14}, Lea2/g;-><init>(ILp1/c1;)V

    const v2, 0x4a029e81    # 2140064.2f

    invoke-static {v2, v7, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    invoke-static {v1, v7, v13}, Lbd1/p;->c(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_19
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_1a

    new-instance v2, Lzc1/a5;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Lzc1/a5;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/o5;->n(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p5, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p5, v2

    move-object v7, p4

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p5, v0}, Lp1/q;->U(IZ)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/lang/Integer;

    invoke-interface {p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_1

    new-instance p0, Lzc1/n0;

    const/16 p3, 0x1d

    invoke-direct {p0, p3, p2}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v7, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v5, p0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p1, :cond_2

    new-instance p0, Lz91/a;

    const/16 p1, 0x18

    invoke-direct {p0, p1}, Lz91/a;-><init>(I)V

    invoke-virtual {v7, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v6, p0

    check-cast v6, Lc93/a;

    const v8, 0x36000

    const/4 v9, 0x0

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Lp1/c1;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$GalleryRowCard"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {p0 .. p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lzc1/n0;

    const/16 v1, 0x1c

    move-object/from16 v13, p0

    invoke-direct {v0, v1, v13}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move-object/from16 v13, p0

    :goto_1
    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/high16 v11, 0x180000

    const/16 v12, 0x3d

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Enabled"

    :goto_2
    move-object v2, v0

    goto :goto_3

    :cond_2
    const-string v0, "Disabled"

    goto :goto_2

    :goto_3
    const/16 v25, 0x0

    const v26, 0x1fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_4

    :cond_3
    move-object/from16 v23, v10

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final z(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
