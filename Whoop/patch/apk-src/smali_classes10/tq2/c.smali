.class public abstract Ltq2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Ltq2/g;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "d",
        "(Ltq2/g;ZLandroidx/compose/runtime/Composer;I)V",
        "Ltq2/h;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "g",
        "(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ltq2/g;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltq2/c;->e(Ltq2/g;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltq2/h;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltq2/c;->h(Ltq2/h;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltq2/g;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltq2/c;->f(Ltq2/g;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ltq2/g;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x3ac2d348

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v1, Llz1/a;

    const/16 v2, 0x1b

    invoke-direct {v1, p0, v2}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v2, -0x48c22412

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Ltq2/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Ltq2/b;-><init>(Ltq2/g;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final e(Ltq2/g;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p2

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x3

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v9, v5

    mul-float v5, v4, v9

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v4, v6

    mul-float/2addr v4, v9

    const/4 v7, 0x0

    const/16 v8, 0x8

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->d:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, v0, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object v8, v0

    check-cast v8, Lp1/q;

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    iget-object v10, v8, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_0

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_0
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    :cond_1
    invoke-static {v5, v8, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x2

    int-to-float v11, v3

    mul-float/2addr v11, v9

    const/4 v12, 0x0

    invoke-static {v2, v11, v12, v3}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v0, v13}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    float-to-double v13, v1

    const-wide/16 v15, 0x0

    cmpl-double v13, v13, v15

    const-string v14, "invalid weight; must be greater than zero"

    if-lez v13, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    move/from16 v17, v9

    const/4 v9, 0x1

    invoke-direct {v13, v1, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-wide/from16 v18, v15

    int-to-float v15, v9

    mul-float v15, v15, v17

    invoke-static {v13, v15, v12, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->e:Ll0/h;

    sget-object v3, Lb2/e;->L:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v15, v3, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object v15, v2

    iget-wide v1, v8, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v0, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v1, v8, v1, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v0, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ltq2/g;->g()Ltq2/h;

    move-result-object v1

    const/high16 v12, 0x3f800000    # 1.0f

    float-to-double v2, v12

    cmpl-double v2, v2, v18

    if-lez v2, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v12, v16

    if-lez v3, :cond_8

    move/from16 v3, v16

    goto :goto_4

    :cond_8
    move v3, v12

    :goto_4
    invoke-direct {v2, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v11, v4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v2, v0, v10}, Ltq2/c;->g(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Ltq2/g;->h()Ltq2/h;

    move-result-object v1

    float-to-double v2, v12

    cmpl-double v2, v2, v18

    if-lez v2, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v12, v16

    if-lez v3, :cond_a

    move/from16 v3, v16

    goto :goto_6

    :cond_a
    move v3, v12

    :goto_6
    invoke-direct {v2, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v2, v11, v4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2, v0, v10}, Ltq2/c;->g(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    double-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v4

    sget-object v2, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v4, v5, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0xa

    int-to-float v1, v1

    mul-float/2addr v1, v3

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float v6, v1, v17

    const/4 v7, 0x7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v15

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Ltq2/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v0, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->N()Lb91/a;

    move-result-object v20

    invoke-virtual {v11, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v24, v5, 0x12

    const v25, 0x2fff8

    move-object v0, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v13, v8

    const/4 v8, 0x0

    move v15, v9

    move v14, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    move/from16 v19, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x30

    move-object/from16 v32, v22

    move-object/from16 v30, v26

    move/from16 v31, v27

    move/from16 v33, v29

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Ltq2/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v14, v31

    invoke-static {v1, v0, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v32

    move/from16 v3, v33

    invoke-virtual {v2, v0, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v0, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v2

    const/16 v23, 0x0

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v15, 0x1

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Ltq2/g;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltq2/c;->d(Ltq2/g;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "state"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "modifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x76f17649

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, p3, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int v4, p3, v4

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v4, v7

    :cond_4
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    and-int/2addr v4, v10

    invoke-virtual {v3, v4, v7}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Ll0/m;->d:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v4, v7, v3, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v3, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v7, v3, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/e;->L:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v7, v6, v3, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move v7, v8

    iget-wide v8, v3, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    move/from16 v18, v7

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v3, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v3, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v8, v3, v8, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v3, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ltq2/h;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v3, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v3, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->x()Lb91/a;

    move-result-object v24

    invoke-virtual {v8, v3, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v20

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v28, v11, 0x12

    const v29, 0x2fffa

    move-object v11, v5

    const/4 v5, 0x0

    move-object/from16 v18, v8

    move/from16 v22, v9

    const-wide/16 v8, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v27, v14

    const/16 v30, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    const/16 v32, 0x4

    const/16 v16, 0x0

    move-object/from16 v33, v18

    const/16 v34, 0x1

    const-wide/16 v17, 0x0

    const/16 v35, 0x6

    const/16 v19, 0x0

    move-object/from16 v36, v4

    move-object v4, v6

    move-wide/from16 v43, v20

    move/from16 v21, v7

    move-wide/from16 v6, v43

    const/16 v20, 0x0

    move/from16 v37, v21

    const/16 v21, 0x0

    move/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v27

    const/16 v27, 0x0

    move-object/from16 v30, v26

    move-object/from16 v1, v33

    move/from16 v2, v37

    move/from16 v0, v38

    move-object/from16 v42, v40

    move-object/from16 v26, v3

    move/from16 v3, v34

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v18, v5, v6

    const/16 v20, 0x0

    const/16 v22, 0x6

    const/16 v19, 0x0

    move/from16 v21, v18

    move-object/from16 v17, v39

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v1, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v27, 0x30

    const v29, 0x2fff8

    move v10, v5

    move-object v5, v6

    move-object v4, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v18

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 v0, v39

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x2

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->b()Ly81/f;

    move-result-object v7

    const/4 v13, 0x0

    invoke-virtual {v7, v4, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v9, v10, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v4, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->c()F

    move-result v6

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->a()Li2/t;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x6

    invoke-static {v5, v6, v7, v9, v10}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    move-object/from16 v10, v41

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v10, v31

    goto :goto_8

    :cond_c
    invoke-virtual {v4}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v4, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v36

    invoke-static {v4, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    move-object/from16 v6, v30

    goto :goto_a

    :cond_e
    :goto_9
    move-object/from16 v11, v42

    goto :goto_b

    :goto_a
    invoke-static {v7, v4, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v4, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v19, v32, v8

    const/16 v21, 0x0

    const/16 v22, 0xd

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v2, v38

    invoke-virtual {v1, v4, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->D()Lb91/a;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Ltq2/h;->d()Ly81/f;

    move-result-object v1

    invoke-virtual {v1, v4, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    const/16 v27, 0x30

    const v29, 0x2fff8

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

    const/16 v25, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_f
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v1, Lso2/f;

    const/16 v2, 0xd

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final h(Ltq2/h;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltq2/c;->g(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
