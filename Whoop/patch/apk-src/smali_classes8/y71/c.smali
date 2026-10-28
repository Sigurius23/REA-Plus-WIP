.class public abstract Ly71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ly71/d;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isPressed",
        "design_release"
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
.method public static synthetic a(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ly71/c;->h(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly71/c;->j(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly71/c;->g(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly71/c;->i(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ly71/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p4

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "itemState"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v1, -0x65ea0423

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    const/4 v12, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v12

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v9, 0x180

    const/16 v3, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x1

    const/4 v13, 0x0

    if-eq v2, v4, :cond_6

    move v2, v5

    goto :goto_4

    :cond_6
    move v2, v13

    :goto_4
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v10, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v2

    invoke-virtual {v10, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v4, "hal-strength-trainer-rounded-corners"

    invoke-interface {v2, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x3

    int-to-float v2, v2

    :goto_5
    int-to-float v4, v12

    mul-float/2addr v2, v4

    move v14, v2

    goto :goto_6

    :cond_7
    int-to-float v2, v5

    goto :goto_5

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_8

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v2

    :cond_8
    check-cast v2, Lj0/i;

    const/4 v6, 0x6

    invoke-static {v2, v10, v6}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v15

    invoke-static {v15}, Ly71/c;->f(Lp1/t2;)Z

    move-result v16

    if-eqz v16, :cond_9

    const v5, 0x6c86b047

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    goto :goto_7

    :cond_9
    const v5, 0x6c86b484

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v16

    :goto_7
    invoke-static {v15}, Ly71/c;->f(Lp1/t2;)Z

    move-result v5

    if-eqz v5, :cond_a

    const v5, 0x6c86bc47

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    goto :goto_8

    :cond_a
    const v5, 0x6c86c087

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    :goto_8
    invoke-static {v15}, Ly71/c;->f(Lp1/t2;)Z

    move-result v5

    if-eqz v5, :cond_b

    const v5, 0x6c86c887

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    :goto_9
    move-wide/from16 v20, v5

    goto :goto_a

    :cond_b
    const v5, 0x6c86ccc7

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5, v10, v6, v13}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    goto :goto_9

    :goto_a
    invoke-virtual {v7}, Ly71/d;->a()Z

    move-result v5

    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v5, :cond_c

    move v5, v15

    goto :goto_b

    :cond_c
    const v5, 0x3e4ccccd    # 0.2f

    :goto_b
    invoke-virtual {v7}, Ly71/d;->a()Z

    move-result v6

    new-instance v11, Li3/i;

    invoke-direct {v11, v13}, Li3/i;-><init>(I)V

    and-int/lit16 v1, v1, 0x380

    if-ne v1, v3, :cond_d

    const/4 v1, 0x1

    goto :goto_c

    :cond_d
    move v1, v13

    :goto_c
    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_e

    if-ne v3, v4, :cond_f

    :cond_e
    new-instance v3, Ly71/b;

    const/4 v1, 0x0

    invoke-direct {v3, v8, v7, v1}, Ly71/b;-><init>(Lkotlin/jvm/functions/Function1;Ly71/d;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v3, Lc93/a;

    move v1, v5

    move-object v5, v3

    move v3, v6

    const/16 v6, 0x8

    move v4, v1

    move-object v1, v2

    const/4 v2, 0x0

    move-object/from16 v22, v11

    move v11, v4

    move-object/from16 v4, v22

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0xe

    int-to-float v2, v2

    int-to-float v3, v12

    mul-float/2addr v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v12

    int-to-float v15, v13

    new-instance v0, Lb81/h;

    move-object v2, v1

    move-object v1, v7

    move-object v3, v8

    move-wide/from16 v6, v18

    move-wide/from16 v4, v20

    invoke-direct/range {v0 .. v7}, Lb81/h;-><init>(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJ)V

    const v1, -0x5f91f866

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/high16 v18, 0x1b0000

    const/16 v19, 0x18

    const/4 v14, 0x0

    move-wide/from16 v22, v16

    move-object/from16 v17, v10

    move-object v10, v11

    move-object v11, v12

    move-wide/from16 v12, v22

    move-object/from16 v16, v0

    invoke-static/range {v10 .. v19}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_10
    move-object/from16 v17, v10

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    :goto_d
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lvv2/c;

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v4, v9

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ly71/d;->c()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ly71/d;Lj0/i;Lkotlin/jvm/functions/Function1;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    and-int/lit8 v2, p8, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v6, p8, 0x1

    move-object/from16 v12, p7

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    sget-object v2, Ll0/a1;->x:Ll0/a1;

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v2, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v15, v2, v5

    const/4 v14, 0x0

    const/16 v18, 0x1

    move/from16 v16, v15

    move/from16 v17, v15

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/m;->g:Ll0/h;

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v5, v7, v12, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v13, v2

    const-wide/16 v16, 0x0

    cmpl-double v11, v13, v16

    if-lez v11, :cond_4

    goto :goto_2

    :cond_4
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v11, v2, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v11, v4

    invoke-static {v2, v15, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, Lb2/e;->z:Lb2/m;

    invoke-static {v11, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v12, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v13, v12, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ly71/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v2, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

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

    const/16 v30, 0x0

    move-wide/from16 v9, p5

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Ly71/d;->f()Z

    move-result v2

    if-eqz v2, :cond_a

    const v2, -0x582f50a

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget v2, Lgy0/a;->i0:I

    invoke-static {v2, v12, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    sget v2, Lgy0/f;->l1:I

    invoke-static {v12, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    int-to-float v2, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v0}, Ly71/d;->a()Z

    move-result v16

    new-instance v2, Li3/i;

    invoke-direct {v2, v4}, Li3/i;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_9

    :cond_8
    new-instance v6, Ly71/b;

    const/4 v5, 0x1

    invoke-direct {v6, v1, v0, v5}, Ly71/b;-><init>(Lkotlin/jvm/functions/Function1;Ly71/d;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    const/16 v19, 0x8

    const/4 v15, 0x0

    move-object/from16 v14, p1

    move-object/from16 v17, v2

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-wide/from16 v10, p3

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    const v0, -0x5784fb4

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ly71/d;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Ly71/d;->e()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ly71/c;->e(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
