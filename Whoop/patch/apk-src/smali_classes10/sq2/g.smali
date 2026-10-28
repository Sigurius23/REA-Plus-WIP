.class public abstract Lsq2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsq2/d;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "e",
        "(Lsq2/d;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsq2/g;->g(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsq2/g;->f(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsq2/g;->i(Lsq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    sget-object v0, Ll0/z;->a:Ll0/z;

    invoke-static {p0, v0, p1, p2}, Lsq2/g;->h(Lsq2/d;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lsq2/d;ZLandroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x74c84578

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v12, 0x1

    if-eq v4, v5, :cond_4

    move v4, v12

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/2addr v3, v12

    invoke-virtual {v7, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_11

    if-eqz v1, :cond_10

    const v3, -0x15c930c0

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_5

    new-instance v3, Ld0/q0;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v4}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v3

    check-cast v4, Ld0/q0;

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v6, v8, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v7, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v8, v7, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v8, v3

    const-wide/16 v16, 0x0

    cmpl-double v5, v8, v16

    const-string v18, "invalid weight; must be greater than zero"

    if-lez v5, :cond_9

    goto :goto_5

    :cond_9
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v19, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v8, v3, v19

    if-lez v8, :cond_a

    move/from16 v8, v19

    goto :goto_6

    :cond_a
    move v8, v3

    :goto_6
    invoke-direct {v5, v8, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v5, Lsq2/f;

    const/4 v8, 0x0

    invoke-direct {v5, v0, v8}, Lsq2/f;-><init>(Lsq2/d;I)V

    const v8, -0x6dbf6997

    invoke-static {v8, v7, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/4 v9, 0x2

    move-object v8, v6

    move-object v6, v5

    const/4 v5, 0x0

    move-object/from16 v20, v8

    const/16 v8, 0x180

    move-object/from16 v12, v20

    invoke-static/range {v4 .. v9}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x3

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v5, v6, v10, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->E:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v6, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v9, v7, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v7, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Lsq2/f;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, Lsq2/f;-><init>(Lsq2/d;I)V

    const v6, -0x79212691

    invoke-static {v6, v7, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/4 v9, 0x2

    const/4 v5, 0x0

    const/16 v8, 0x180

    invoke-static/range {v4 .. v9}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    float-to-double v5, v3

    cmpl-double v5, v5, v16

    if-lez v5, :cond_e

    goto :goto_8

    :cond_e
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v19

    if-lez v6, :cond_f

    move/from16 v3, v19

    :cond_f
    const/4 v6, 0x1

    invoke-direct {v5, v3, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v5, Lkr2/g;->BOTTOM:Lkr2/g;

    new-instance v3, Lsq2/f;

    const/4 v6, 0x2

    invoke-direct {v3, v0, v6}, Lsq2/f;-><init>(Lsq2/d;I)V

    const v6, -0x4d78f95c

    invoke-static {v6, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v9, 0xc30

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v7

    move-object v7, v3

    invoke-static/range {v4 .. v10}, Lkr2/b;->u(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    const/4 v9, 0x0

    const v3, -0x159f0c06

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_11
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, Lam0/b;

    const/16 v5, 0xd

    invoke-direct {v4, v0, v1, v2, v5}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final f(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const-string v1, "DonutStepTitle"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v4, v0, v1

    const/4 v7, 0x0

    const/16 v8, 0xa

    const/4 v5, 0x0

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lsq2/d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v2, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fff8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    const/16 v23, 0x0

    const/16 v25, 0x30

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lsq2/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const/high16 p2, 0x3f800000    # 1.0f

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, p1, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v7, p1, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p1, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p1, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {p1, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, p1, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p1, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {p1, v1, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lsq2/d;->i()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Lsq2/d;->e()J

    move-result-wide v4

    invoke-static {p2, v4, v5, p1, v3}, Lsq2/a;->c(Ljava/util/List;JLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lsq2/d;->i()Ljava/util/List;

    move-result-object p0

    sget-object p2, Lb2/e;->z:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v0, p2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p0, p2, p1, v3, v3}, Lsq2/e;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lsq2/d;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v2, p3, 0x1

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lsq2/d;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-nez v0, :cond_1

    const v0, 0x6f1f4358

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lsq2/d;->h()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    sget-object v3, Lb2/e;->N:Lb2/k;

    move-object/from16 v5, p1

    check-cast v5, Ll0/z;

    invoke-virtual {v5, v2, v3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v2, 0x5

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v7, v2, v3

    const/4 v10, 0x0

    const/16 v11, 0x8

    move v8, v7

    move v9, v7

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "DonutFooterHighlightedText"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v28, v2, 0x15

    const v29, 0x1fffc

    const-wide/16 v6, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    move-object v0, v4

    const v4, 0x6f268169

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v2, v4, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    move-object/from16 v4, p1

    check-cast v4, Ll0/z;

    invoke-virtual {v4, v2, v3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "DonutFooterText"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lsq2/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lsq2/d;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    shl-int/lit8 v5, v5, 0x6

    or-int/2addr v5, v6

    invoke-static {v2, v3, v4, v0, v5}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lsq2/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsq2/g;->e(Lsq2/d;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
