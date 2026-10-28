.class public abstract Lmm1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aG\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmm1/k;",
        "welcomeCardState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "fillPercentage",
        "",
        "gaugeDisplay",
        "Lgz0/m0;",
        "icon",
        "onClick",
        "k",
        "(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "home_release"
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
.method public static synthetic a(Lmm1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmm1/i;->j(Lmm1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmm1/i;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmm1/i;->i(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmm1/i;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmm1/i;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lmm1/i;->n(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm1/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "welcomeCardState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x15615f66

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v0, v8

    invoke-virtual {v9, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v3, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_6

    new-instance v0, Lmm1/h;

    const/4 v3, 0x1

    invoke-direct {v0, v3}, Lmm1/h;-><init>(I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v0, v4

    :goto_5
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x1e

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    const/16 v5, 0x37

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v3, v4, v5}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v14, v3, v4

    const/4 v15, 0x7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->V0()J

    move-result-wide v4

    int-to-float v6, v7

    mul-float v7, v6, v2

    new-instance v2, Lj21/d;

    const/16 v6, 0x12

    invoke-direct {v2, v6, v1, v0}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, 0x1cd570e3

    invoke-static {v6, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x1b0006

    const/16 v11, 0x1a

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v11}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    goto :goto_6

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v4

    :goto_6
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Llq2/c;

    const/16 v5, 0x10

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 32

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v1, Ll0/m;->g:Ll0/h;

    const/16 v4, 0x36

    invoke-static {v1, v0, v9, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lmm1/k;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9, v2}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const v0, 0x3f266666    # 0.65f

    float-to-double v1, v0

    const-wide/16 v30, 0x0

    cmpl-double v1, v1, v30

    const-string v2, "invalid weight; must be greater than zero"

    if-lez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v0, v1

    if-lez v6, :cond_5

    move v0, v1

    :cond_5
    invoke-direct {v5, v0, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->N()Lb91/a;

    move-result-object v24

    invoke-virtual {v0, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v0, v0, 0x12

    or-int/lit16 v0, v0, 0x6c00

    const v29, 0x29ff8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x5

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v28, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const v0, 0x3ee66666    # 0.45f

    float-to-double v4, v0

    cmpl-double v4, v4, v30

    if-lez v4, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v0, v1

    if-lez v4, :cond_7

    goto :goto_4

    :cond_7
    move v1, v0

    :goto_4
    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v0, 0x23

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lmm1/k;->b()D

    move-result-wide v0

    double-to-float v5, v0

    invoke-virtual/range {p0 .. p0}, Lmm1/k;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lmm1/k;->c()Lgz0/m0;

    move-result-object v7

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, p1

    move-object/from16 v9, v26

    invoke-static/range {v4 .. v11}, Lmm1/i;->k(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lmm1/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lmm1/i;->g(Lmm1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "F",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v6, p6

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x676a1b5e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    move-object/from16 v11, p0

    if-nez v0, :cond_1

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_3

    move/from16 v2, p1

    invoke-virtual {v10, v2}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v6, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_4

    :cond_4
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v6, 0xc00

    if-nez v4, :cond_8

    if-nez p3, :cond_6

    const/4 v4, -0x1

    goto :goto_5

    :cond_6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    :goto_5
    invoke-virtual {v10, v4}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x800

    goto :goto_6

    :cond_7
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v0, v4

    :cond_8
    and-int/lit8 v4, p7, 0x10

    const/16 v5, 0x4000

    if-eqz v4, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v7, p4

    goto :goto_8

    :cond_a
    and-int/lit16 v7, v6, 0x6000

    if-nez v7, :cond_9

    move-object/from16 v7, p4

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    move v8, v5

    goto :goto_7

    :cond_b
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v0, v8

    :goto_8
    and-int/lit16 v8, v0, 0x2493

    const/16 v9, 0x2492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v8, v9, :cond_c

    move v8, v13

    goto :goto_9

    :cond_c
    move v8, v12

    :goto_9
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_d

    new-instance v4, Lmm1/h;

    const/4 v7, 0x0

    invoke-direct {v4, v7}, Lmm1/h;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_e
    move-object v4, v7

    :goto_a
    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v25

    const v14, 0xe000

    and-int/2addr v14, v0

    if-ne v14, v5, :cond_f

    move v5, v13

    goto :goto_b

    :cond_f
    move v5, v12

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_10

    if-ne v14, v8, :cond_11

    :cond_10
    new-instance v14, Lmf2/e;

    const/4 v5, 0x7

    invoke-direct {v14, v4, v5}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v15, v14

    check-cast v15, Lc93/a;

    const/4 v14, 0x0

    const/16 v16, 0xf

    move v5, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->E:Lb2/m;

    invoke-static {v12, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_12

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v10, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move/from16 v27, v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_13
    move/from16 v27, v0

    :goto_d
    invoke-static {v13, v10, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v1, 0x16

    int-to-float v1, v1

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v1, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_15

    sget-object v13, Lmm1/i$a;->w:Lmm1/i$a;

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v13}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    invoke-static {v8}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v8

    const/4 v13, 0x6

    move/from16 p5, v1

    int-to-float v1, v13

    move/from16 v16, v11

    new-instance v11, Lj81/c;

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x778

    move/from16 v28, v24

    const/16 v24, 0x0

    move-object/from16 v33, v12

    move/from16 v12, p5

    move/from16 p5, v9

    move v9, v13

    move v13, v2

    move-object/from16 v2, v33

    move-object/from16 v33, v19

    move/from16 v19, v1

    move-object/from16 v1, v33

    move-object/from16 v33, v14

    move-object v14, v8

    move-object/from16 v8, v33

    move/from16 v33, v28

    invoke-direct/range {v11 .. v24}, Lj81/c;-><init>(FFLi91/a;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZFFLy81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v12, Lj81/c;->l:I

    const/4 v13, 0x3

    shl-int/2addr v12, v13

    or-int/2addr v12, v9

    move-object v14, v8

    move-object v8, v11

    move v11, v12

    const/4 v12, 0x4

    move-object v15, v7

    sget-object v7, Lb2/t;->w:Lb2/t;

    move/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v34, v14

    move-object v14, v15

    move/from16 v13, v16

    move/from16 v15, p5

    invoke-static/range {v7 .. v12}, Lj81/b;->c(Landroidx/compose/ui/Modifier;Lj81/c;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v7

    shr-int/lit8 v7, v27, 0x6

    and-int/lit8 v7, v7, 0xe

    invoke-static {v3, v10, v7}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v10, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->y()Lb91/a;

    move-result-object v27

    const/16 v9, 0x1c

    invoke-static {v9}, Lv63/c;->h(I)J

    move-result-wide v11

    invoke-static {v11, v12}, Ly3/o;->c(J)F

    move-result v9

    sget-object v11, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/c;

    move-object/from16 v16, v14

    const-wide v13, 0x100000000L

    invoke-static {v9, v13, v14, v12}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v18

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v31, v9, 0x12

    const v32, 0x2fff2

    move-object v9, v8

    const/4 v8, 0x0

    move-wide/from16 v20, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v12, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v23, 0x6

    const-wide/16 v16, 0x0

    move-object/from16 v24, v11

    move-wide/from16 v42, v18

    move/from16 v19, v12

    move-wide/from16 v11, v42

    const/16 v18, 0x0

    move/from16 v28, v19

    const/16 v19, 0x0

    move-wide/from16 v29, v20

    const-wide/16 v20, 0x0

    move-object/from16 v35, v22

    const/16 v22, 0x0

    move/from16 v36, v23

    const/16 v23, 0x0

    move-object/from16 v37, v24

    const/16 v24, 0x0

    move-wide/from16 v38, v29

    move-object/from16 v29, v10

    move-wide/from16 v42, v25

    move-object/from16 v26, v9

    move-wide/from16 v9, v42

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v40, v28

    const/16 v28, 0x0

    move-object/from16 v41, v30

    const/16 v30, 0x0

    move-object/from16 v3, v35

    move-object/from16 v6, v41

    move-object/from16 v35, v4

    move/from16 v4, v40

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-wide v7, v9

    move-object/from16 v10, v29

    sget-object v9, Lb2/e;->H:Lb2/m;

    sget-object v11, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v11, v6, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->K:Lb2/l;

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v12, v12

    const/16 v13, 0x8

    int-to-float v13, v13

    const/16 v14, 0x36

    invoke-static {v12, v13, v11, v10, v14}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v10, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    :cond_17
    move-object/from16 v14, v34

    invoke-static {v12, v10, v12, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v10, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lgy0/f;->E1:I

    invoke-static {v10, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v1

    iget-object v1, v1, Ll3/v0;->a:Ll3/m0;

    iget-wide v1, v1, Ll3/m0;->b:J

    invoke-static {v1, v2}, Ly3/o;->c(J)F

    move-result v1

    move-object/from16 v2, v37

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    const-wide v11, 0x100000000L

    invoke-static {v1, v11, v12, v2}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v11

    const/16 v30, 0x30

    const v32, 0x2fff0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v10

    move-wide v9, v7

    move-object v7, v0

    move-object v8, v6

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    if-eqz p3, :cond_19

    const v0, -0x3c1c6abc

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v0, v0, v33

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v13, 0x6

    invoke-static {v0, v10, v13}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual {v3, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v0

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    const/4 v8, 0x0

    move-object v12, v10

    move-wide v10, v0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v0, 0x1

    goto :goto_10

    :cond_19
    const/4 v5, 0x0

    const v0, -0x3c184df2

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v35

    goto :goto_11

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v5, v7

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Lc51/b;

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lc51/b;-><init>(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lz51/p;->HELP:Lz51/p;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lmm1/i;->k(Landroidx/compose/ui/Modifier;FLjava/lang/String;Lgz0/m0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
