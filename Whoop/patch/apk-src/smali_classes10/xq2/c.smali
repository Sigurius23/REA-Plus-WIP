.class public abstract Lxq2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lxq2/d;",
        "viewState",
        "Ll83/a0;",
        "c",
        "(Lxq2/d;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "e",
        "(Lxq2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "user-journey_release"
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
.method public static synthetic a(Lxq2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxq2/c;->d(Lxq2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxq2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxq2/c;->f(Lxq2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxq2/d;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    check-cast p1, Lp1/q;

    const v0, -0x71a3b8d0

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p2

    goto :goto_2

    :cond_2
    move v0, p2

    :goto_2
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_3

    move v1, v4

    goto :goto_3

    :cond_3
    move v1, v3

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v2, p1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, p1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p1, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v8, p1, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {p1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p1, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p1, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v5, p1, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p1, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x3ecccccd    # 0.4f

    float-to-double v5, v1

    const-wide/16 v7, 0x0

    cmpl-double v2, v5, v7

    const-string v5, "invalid weight; must be greater than zero"

    if-lez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v9, v1, v6

    if-lez v9, :cond_8

    move v1, v6

    :cond_8
    invoke-direct {v2, v1, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {p1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v1, 0x3f19999a    # 0.6f

    float-to-double v9, v1

    cmpl-double v2, v9, v7

    if-lez v2, :cond_9

    goto :goto_6

    :cond_9
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v1, v6

    if-lez v5, :cond_a

    goto :goto_7

    :cond_a
    move v6, v1

    :goto_7
    invoke-direct {v2, v6, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v0, v0, 0xe

    or-int/2addr v0, v1

    invoke-static {p0, v2, p1, v0, v3}, Lxq2/c;->e(Lxq2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Lxq2/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lxq2/b;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(Lxq2/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lxq2/c;->c(Lxq2/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lxq2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v0, 0x5c5e8dd6

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-virtual {v3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_6

    move v5, v12

    goto :goto_5

    :cond_6
    move v5, v11

    :goto_5
    and-int/2addr v0, v12

    invoke-virtual {v3, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v2, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v13, v0

    goto :goto_6

    :cond_7
    move-object v13, p1

    :goto_6
    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v2, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v3, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v3, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v3, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v2, v3, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lxq2/d;->b()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, -0x7bf62663

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    move-object v8, v3

    goto :goto_8

    :cond_b
    const v0, -0x7bf62662

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x5

    int-to-float v0, v0

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lxq2/d;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1, v3, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v1, Lb2/e;->z:Lb2/m;

    const/16 v9, 0xc30

    const/16 v10, 0xf1

    move-object v8, v3

    move v3, v0

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v10}, Lgz0/g;->n(Landroidx/compose/ui/Modifier;Lb2/h;Lo2/e;FFZLc93/m;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {p0}, Lxq2/d;->a()Lxq2/e;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v8, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->O()Lb91/a;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v3, v3, 0x3

    or-int v4, v2, v3

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v3, v8

    invoke-static/range {v0 .. v5}, Lqq2/b;->f(Lxq2/e;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v3, v13

    goto :goto_9

    :cond_c
    move-object v8, v3

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, p1

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lwq1/b;

    const/16 v5, 0x8

    move-object v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final f(Lxq2/d;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lxq2/c;->e(Lxq2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic g(Lxq2/d;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/c;->c(Lxq2/d;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
