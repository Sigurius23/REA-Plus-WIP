.class public abstract Lyz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lyz0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lyz0/b;->e(Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lyz0/b;->g(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyz0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyz0/b;->f(Lyz0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lyz0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0xd5f1f55

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_5

    and-int/lit8 v8, v1, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    move v8, v9

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v1, 0x180

    const/16 v11, 0x100

    if-nez v8, :cond_7

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v11

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v8, v12, :cond_8

    move v8, v14

    goto :goto_5

    :cond_8
    move v8, v13

    :goto_5
    and-int/lit8 v12, v7, 0x1

    invoke-virtual {v10, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v4, v15

    :cond_9
    const/16 v0, 0x32

    invoke-static {v0}, Lt0/j;->b(I)Lt0/i;

    move-result-object v0

    const/4 v8, 0x3

    const/4 v12, 0x0

    invoke-static {v4, v12, v13, v8}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v8, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Li91/c;->o(J)Li91/a;

    move-result-object v12

    invoke-static {v0, v12}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lyz0/c;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    if-eqz v12, :cond_a

    move v12, v14

    goto :goto_6

    :cond_a
    move v12, v13

    :goto_6
    and-int/lit8 v13, v7, 0x70

    if-eq v13, v9, :cond_c

    and-int/lit8 v9, v7, 0x40

    if-eqz v9, :cond_b

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    goto :goto_7

    :cond_b
    const/4 v9, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    move v9, v14

    :goto_8
    and-int/lit16 v7, v7, 0x380

    if-ne v7, v11, :cond_d

    move v13, v14

    goto :goto_9

    :cond_d
    const/4 v13, 0x0

    :goto_9
    or-int v7, v9, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_e

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_f

    :cond_e
    new-instance v9, Lx30/j1;

    const/16 v7, 0x10

    invoke-direct {v9, v7, v5, v6}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v12, v9}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v11

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    int-to-float v2, v2

    mul-float/2addr v2, v9

    new-instance v11, Ll0/l1;

    invoke-direct {v11, v7, v7, v2, v7}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v11, 0x3ff4000000000000L    # 1.25

    double-to-float v2, v11

    mul-float/2addr v2, v9

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v7, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v2, v7, v10, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v7, v10, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lyz0/c;->a()Lkd1/o;

    move-result-object v7

    const/4 v11, 0x0

    const/4 v12, 0x3

    move-object v0, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v2, 0x6

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    const/16 v8, 0x9

    int-to-float v8, v8

    int-to-float v3, v3

    mul-float/2addr v8, v3

    invoke-static {v8, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lt0/j;->a:Lt0/i;

    invoke-static {v3, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v15, 0x6030

    const/16 v16, 0x68

    const/4 v8, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    sget-object v11, Ly2/j;->a:Ly2/b1;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v3, v14

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    invoke-virtual {v5}, Lyz0/c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v31, 0xc30

    const v32, 0x2d7fa

    move-object/from16 v29, v10

    move-wide v9, v8

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lwr0/f;

    const/16 v3, 0x1d

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final e(Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$applyIf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyo1/b;

    const/4 v1, 0x6

    invoke-direct {v0, p0, p1, v1}, Lyo1/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    const/4 p0, 0x3

    const/4 p1, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, p0}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lyz0/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lyz0/c;->b()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lyz0/b;->d(Landroidx/compose/ui/Modifier;Lyz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
