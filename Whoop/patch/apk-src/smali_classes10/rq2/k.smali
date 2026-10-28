.class public abstract Lrq2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/f;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "f",
        "(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lrq2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrq2/k;->j(Lrq2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/k;->k(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrq2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    sget-object v0, Ll0/z;->a:Ll0/z;

    invoke-static {p0, v0, p1, p2}, Lrq2/k;->g(Lrq2/f;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrq2/k;->i(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lrq2/k;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x180a1c61

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_4

    move v5, v12

    goto :goto_3

    :cond_4
    move v5, v11

    :goto_3
    and-int/2addr v3, v12

    invoke-virtual {v7, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    if-eqz v1, :cond_b

    const v3, 0x7f666424

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    new-instance v3, Ld0/q0;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v5}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Ld0/q0;

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const-wide/high16 v8, 0x401a000000000000L    # 6.5

    double-to-float v5, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v15, v5, v8

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/4 v8, 0x3

    int-to-float v8, v8

    int-to-float v4, v4

    mul-float/2addr v8, v4

    sget-object v4, Lb2/e;->L:Lb2/l;

    invoke-static {v8, v4}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v4

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v4, v8, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v8, v7, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v6

    const-wide/16 v8, 0x0

    cmpl-double v4, v4, v8

    if-lez v4, :cond_9

    goto :goto_5

    :cond_9
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v6, v5

    if-lez v8, :cond_a

    goto :goto_6

    :cond_a
    move v5, v6

    :goto_6
    invoke-direct {v4, v5, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v4, Lrq2/j;

    invoke-direct {v4, v0, v11}, Lrq2/j;-><init>(Lrq2/f;I)V

    const v6, -0x67c82034

    invoke-static {v6, v7, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/16 v8, 0x180

    const/4 v9, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v9}, Lkr2/b;->n(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    sget-object v5, Lkr2/g;->BOTTOM:Lkr2/g;

    new-instance v3, Lrq2/j;

    invoke-direct {v3, v0, v12}, Lrq2/j;-><init>(Lrq2/f;I)V

    const v6, 0x2ddfbf03

    invoke-static {v6, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v9, 0xc30

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v7

    move-object v7, v3

    invoke-static/range {v4 .. v10}, Lkr2/b;->u(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const v3, 0x7f8bea63

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v4, Lrq2/h;

    invoke-direct {v4, v0, v1, v2, v12}, Lrq2/h;-><init>(Lrq2/f;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final g(Lrq2/f;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_5

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->i()Lv41/r0;

    move-result-object v5

    const/4 v0, 0x0

    if-nez v5, :cond_1

    const v4, -0x31dab5eb    # -6.932739E8f

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v4, v0

    goto :goto_1

    :cond_1
    const v4, -0x31dab5ea

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_2

    new-instance v4, Lri2/a;

    const/16 v7, 0x13

    invoke-direct {v4, v7}, Lri2/a;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v9, v4

    check-cast v9, Lc93/a;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_3

    new-instance v4, Lrm2/d;

    const/16 v6, 0xa

    invoke-direct {v4, v6}, Lrm2/d;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v4

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const v14, 0xdb6000

    const/16 v15, 0x10d

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    sget-object v11, Ly2/j;->b:Ly2/b1;

    const/4 v12, 0x0

    invoke-static/range {v4 .. v15}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v4, v1

    :goto_1
    if-nez v4, :cond_4

    const v4, -0x31d5e626

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->h()Lkd1/o;

    move-result-object v4

    sget v5, Lkd1/o;->a:I

    invoke-static {v4, v0, v13, v5, v3}, Lrq2/i;->n(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    return-object v1

    :cond_4
    const v0, 0x69bf20e5

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    return-object v1

    :cond_5
    invoke-virtual {v13}, Lp1/q;->X()V

    return-object v1
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lrq2/f;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_7

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v6, v5, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v7, v5, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v7, 0x4

    const/4 v8, 0x5

    const/4 v10, 0x0

    if-nez v0, :cond_4

    const v0, -0x1a3047d6

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    const v0, -0x1a3047d5

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v11, v8

    int-to-float v12, v7

    mul-float/2addr v11, v12

    invoke-static {v0, v11, v10, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v11, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v11, v6}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-interface {v0, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v6, "ImageFooterStepV2"

    invoke-static {v0, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v13, v12, 0x3

    shl-int/lit8 v12, v12, 0x6

    or-int/2addr v12, v13

    invoke-static {v0, v6, v11, v5, v12}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    move-object v0, v4

    :goto_2
    if-nez v0, :cond_6

    const v0, -0x1a286b60

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v5, v2}, Lrq2/i;->l(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const v0, 0x46c17ce

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v6, v5, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v6, v5, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v11

    int-to-float v6, v8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v9, v6, v10, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v6, "ImageStepV2Footer"

    invoke-static {v3, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v29, v3, 0x15

    const v30, 0x1fff8

    const-wide/16 v9, 0x0

    move-wide v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x30

    move-object/from16 v27, v5

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v27

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    move-object v0, v5

    const v3, 0x47355a1

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_3
    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v0, v5

    const v3, 0x30b41eba

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    return-object v4

    :cond_7
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    return-object v4
.end method

.method private static final k(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/k;->f(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
