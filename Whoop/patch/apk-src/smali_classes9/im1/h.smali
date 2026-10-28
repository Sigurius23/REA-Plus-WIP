.class public abstract Lim1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a;\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lik2/a;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onDayOneTransitionOverlayShowing",
        "Lkotlin/Function0;",
        "onButtonClick",
        "f",
        "(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Lik2/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lik2/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lim1/h;->l(Lik2/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lim1/h;->g(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lim1/h;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lim1/h;->i(Lp1/c1;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lim1/h;->j(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v5, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onButtonClick"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0xad19ffc

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    and-int/lit16 v7, v1, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v2, v7

    :cond_7
    and-int/lit16 v7, v2, 0x93

    const/16 v9, 0x92

    const/4 v11, 0x1

    if-eq v7, v9, :cond_8

    move v7, v11

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    :goto_6
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v0, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_9

    new-instance v3, Lih0/t;

    const/16 v6, 0x10

    invoke-direct {v3, v6}, Lih0/t;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v3, v6

    :goto_7
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_b

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lp1/c1;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-virtual {v4}, Lik2/a;->c()Z

    move-result v9

    if-eqz v9, :cond_14

    const v9, -0x439e2b

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v3, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_c

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_c
    move-object v14, v9

    check-cast v14, Lj0/i;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_d

    new-instance v9, Lih1/b;

    const/16 v12, 0x16

    invoke-direct {v9, v12}, Lih1/b;-><init>(I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v18, v9

    check-cast v18, Lc93/a;

    const/16 v19, 0x1c

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v12, Ll0/m;->d:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v12, v13, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    :cond_f
    invoke-static {v13, v0, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v9, v2, 0x380

    if-ne v9, v8, :cond_11

    move v8, v11

    goto :goto_9

    :cond_11
    const/4 v8, 0x0

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_12

    if-ne v9, v7, :cond_13

    :cond_12
    new-instance v9, Lcp0/t0;

    invoke-direct {v9, v5, v6}, Lcp0/t0;-><init>(Lc93/a;Lp1/c1;)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lc93/a;

    sget v6, Lkd1/o;->a:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v6, v7

    or-int/2addr v6, v7

    or-int/2addr v6, v7

    or-int/2addr v6, v7

    and-int/lit8 v2, v2, 0xe

    or-int/2addr v2, v6

    invoke-static {v4, v9, v0, v2}, Lim1/h;->k(Lik2/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const/4 v2, 0x0

    const v6, -0x3bfa62

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    :goto_a
    move-object v6, v3

    goto :goto_b

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lhy0/v;

    const/16 v3, 0x10

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final g(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lp1/c1;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lim1/h;->f(Lik2/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lik2/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lik2/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move/from16 v13, p3

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v1, -0xe844d5b

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v13, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v13, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v13

    goto :goto_2

    :cond_2
    move v1, v13

    :goto_2
    and-int/lit8 v3, v13, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    move v8, v1

    and-int/lit8 v1, v8, 0x13

    const/4 v10, 0x0

    const/16 v11, 0x12

    if-eq v1, v11, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v10

    :goto_4
    and-int/lit8 v3, v8, 0x1

    invoke-virtual {v4, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Li2/t;->b:Li2/s;

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 v40, v8

    invoke-virtual/range {v16 .. v16}, Ly81/i;->V0()J

    move-result-wide v7

    move/from16 v41, v11

    new-instance v11, Li2/x;

    invoke-direct {v11, v7, v8}, Li2/x;-><init>(J)V

    invoke-virtual {v5, v4, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->w()J

    move-result-wide v7

    const v12, 0x3f733333    # 0.95f

    invoke-static {v12, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    new-instance v12, Li2/x;

    invoke-direct {v12, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v11, v12}, [Li2/x;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/high16 v8, 0x44610000    # 900.0f

    const/4 v11, 0x0

    const/16 v12, 0x8

    invoke-static {v3, v7, v11, v8, v12}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    const/4 v7, 0x0

    const/4 v8, 0x6

    invoke-static {v1, v3, v7, v11, v8}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v4, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v7, v4, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Lb2/e;->H:Lb2/m;

    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v12, v1, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v4}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v7

    iget-object v7, v7, Ll0/c2;->e:Ll0/b;

    invoke-static {v1, v7}, Ll0/f;->p(Landroidx/compose/ui/Modifier;Ll0/b2;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x2

    int-to-float v7, v7

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v7, v12

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v14, Lb2/e;->M:Lb2/k;

    move-object/from16 v17, v5

    const/16 v5, 0x36

    invoke-static {v7, v14, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move v14, v6

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v4, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v6, v4, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lik2/a;->f()Lkd1/o;

    move-result-object v1

    if-nez v1, :cond_c

    const v1, 0x65b94e26

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move v8, v14

    move-object v3, v15

    move-object/from16 v7, v17

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_c
    const v1, 0x65b94e27

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lik2/a;->f()Lkd1/o;

    move-result-object v1

    sget v5, Lkd1/o;->a:I

    const/4 v6, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v8, v14

    move-object/from16 v7, v17

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v14

    move-object/from16 v36, v4

    const/16 v22, 0x61b0

    const/16 v23, 0x68

    move-object/from16 v16, v15

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/16 v17, 0x0

    sget-object v18, Ly2/j;->a:Ly2/b1;

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v21, v36

    invoke-static/range {v14 .. v23}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v3, v16

    move-object/from16 v4, v21

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v0}, Lik2/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->N()Lb91/a;

    move-result-object v34

    invoke-virtual {v7, v4, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v16

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v38, v2, 0x12

    const v39, 0x2fffa

    const/4 v15, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v36, v4

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move/from16 v2, v38

    invoke-virtual {v0}, Lik2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v7, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v34

    invoke-virtual {v7, v4, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v16

    or-int/lit16 v2, v2, 0xc30

    const v39, 0x2d7fa

    const/16 v29, 0x2

    const/16 v31, 0x5

    move/from16 v38, v2

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v6

    mul-float/2addr v2, v12

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-static {v3, v6, v2, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v4, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v2

    invoke-static {v3, v2}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual {v0}, Lik2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/high16 v5, 0x1c00000

    shl-int/lit8 v6, v40, 0x12

    and-int/2addr v5, v6

    or-int/lit8 v11, v5, 0x30

    const/16 v12, 0x78

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    move/from16 v42, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p1

    move-object/from16 v10, v36

    move/from16 v15, v42

    const/4 v14, 0x4

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v10

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const/4 v14, 0x4

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lig0/d;

    invoke-direct {v2, v0, v9, v13, v14}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final l(Lik2/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lim1/h;->k(Lik2/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
