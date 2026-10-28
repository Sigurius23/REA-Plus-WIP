.class public abstract La61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "La61/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onBodyItemClicked",
        "h",
        "(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "p",
        "(Landroidx/compose/runtime/Composer;I)Z",
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
.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, La61/c;->l(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La61/c;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;La61/e;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, La61/c;->n(Lkotlin/jvm/functions/Function1;La61/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, La61/c;->k(La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, La61/c;->o(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La61/c;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;La61/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, La61/c;->j(Lkotlin/jvm/functions/Function1;La61/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "La61/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x2c25a8ee

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v6

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit16 v8, v3, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_8

    move v8, v11

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v14, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_10

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v1, v15

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_a

    new-instance v5, Lp;

    const/4 v7, 0x7

    invoke-direct {v5, v7}, Lp;-><init>(I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v5, v7

    :goto_6
    and-int/lit16 v3, v3, 0x380

    if-ne v3, v6, :cond_c

    goto :goto_7

    :cond_c
    move v11, v10

    :goto_7
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_d

    if-ne v6, v0, :cond_e

    :cond_d
    new-instance v6, Li;

    const/4 v0, 0x6

    invoke-direct {v6, v0, v5, v2}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v19, v6

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v10}, La61/c;->p(Landroidx/compose/runtime/Composer;I)Z

    move-result v3

    if-eqz v3, :cond_f

    const v3, -0x46a0aeeb

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-static {v3, v14, v6, v10}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v6

    :goto_8
    move-wide v7, v6

    goto :goto_9

    :cond_f
    const v3, -0x46a0a9ff

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, La61/e;->c()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v14, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    sget-object v3, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v3}, Lkd1/w;->a()Lk91/a;

    move-result-object v3

    invoke-virtual {v3}, Lk91/a;->c()Lt0/i;

    move-result-object v9

    new-instance v3, La0;

    const/4 v6, 0x1

    invoke-direct {v3, v6, v2, v5}, La0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x53038b82

    invoke-static {v6, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x72

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v21, v5

    move-object v5, v0

    move-object/from16 v0, v21

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    goto :goto_a

    :cond_10
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v7

    :goto_a
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, La01/e;

    const/4 v6, 0x1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;La61/e;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, La61/e;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 47

    move-object/from16 v1, p1

    sget-object v2, Lb2/e;->K:Lb2/l;

    and-int/lit8 v3, p3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq v3, v6, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    and-int/lit8 v7, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    if-eqz v3, :cond_21

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v8, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x2

    int-to-float v10, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v14, v10, v6

    const/16 v17, 0x0

    const/16 v18, 0x8

    move-object/from16 v16, v15

    move v15, v14

    move-object/from16 v19, v16

    move/from16 v16, v14

    move-object/from16 p2, v7

    move-object/from16 v7, v19

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object/from16 p3, v13

    move/from16 v20, v14

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v13, v13

    mul-float/2addr v13, v6

    invoke-static {v13, v8}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v14

    move/from16 v35, v6

    const/16 v6, 0x36

    invoke-static {v14, v2, v12, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move-object/from16 v36, v7

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v16, v8

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    move-object/from16 v8, v36

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    move-object/from16 v8, v36

    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v12, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    :cond_5
    invoke-static {v6, v12, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v12, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, La61/e;->g()Lp01/b;

    move-result-object v6

    const/4 v7, 0x6

    if-nez v6, :cond_9

    const v6, 0x38320323

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, La61/e;->f()Lk71/c;

    move-result-object v6

    if-nez v6, :cond_7

    const v6, -0x31f19ec2

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move-object/from16 v42, p3

    move-object/from16 v38, v8

    move-object/from16 v39, v9

    move/from16 v36, v10

    move-object/from16 v40, v11

    move/from16 p3, v13

    move/from16 v41, v20

    move v8, v6

    move-object/from16 v6, v16

    goto :goto_4

    :cond_7
    const v14, -0x31f19ec1

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->w()J

    move-result-wide v17

    invoke-virtual {v14, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->a()J

    move-result-wide v21

    invoke-static {v14}, Lb9/y;->c(Lx81/d;)I

    move-result v14

    sget-object v15, Lk71/c;->ENABLED:Lk71/c;

    if-ne v6, v15, :cond_8

    move v6, v13

    const/4 v13, 0x1

    goto :goto_3

    :cond_8
    move v6, v13

    const/4 v13, 0x0

    :goto_3
    const/4 v15, 0x0

    move/from16 v36, v14

    move-object v14, v12

    move/from16 v12, v36

    move-object/from16 v42, p3

    move/from16 p3, v6

    move-object/from16 v38, v8

    move-object/from16 v39, v9

    move/from16 v36, v10

    move-object/from16 v40, v11

    move-object/from16 v6, v16

    move-wide/from16 v8, v17

    move/from16 v41, v20

    move-wide/from16 v10, v21

    invoke-static/range {v8 .. v15}, Lk71/j;->q(JJIZLandroidx/compose/runtime/Composer;I)V

    move-object v12, v14

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    move-object/from16 v42, p3

    move-object/from16 v38, v8

    move-object/from16 v39, v9

    move/from16 v36, v10

    move-object/from16 v40, v11

    move/from16 p3, v13

    move-object/from16 v6, v16

    move/from16 v41, v20

    const/4 v8, 0x0

    const v9, -0x31eb8e36

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, La61/e;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    const/high16 v8, 0x3f800000    # 1.0f

    float-to-double v10, v8

    const-wide/16 v13, 0x0

    cmpl-double v10, v10, v13

    if-lez v10, :cond_a

    :goto_6
    move-object v10, v9

    goto :goto_7

    :cond_a
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v9, v8, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v11, v12, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    const/16 v32, 0x0

    const v33, 0x2fff8

    move v15, v8

    move-object v8, v10

    move-object/from16 v30, v12

    move-wide/from16 v45, v13

    move-object v14, v11

    move-wide/from16 v10, v45

    const-wide/16 v12, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move-object/from16 v19, v18

    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    move/from16 v24, v22

    const-wide/16 v21, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v43, v29

    const/16 v29, 0x0

    move-object/from16 v44, v31

    const/16 v31, 0x0

    move-object/from16 v0, v44

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    invoke-virtual/range {p0 .. p0}, La61/e;->g()Lp01/b;

    move-result-object v8

    const/4 v9, 0x0

    if-nez v8, :cond_b

    const v8, -0x31e6c4fd    # -6.4269536E8f

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object v8, v9

    move-object/from16 v13, v42

    goto :goto_8

    :cond_b
    const/4 v10, 0x0

    const v11, -0x31e6c4fc

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, La61/e;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {v11, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const-string v13, " "

    const-string v14, "_"

    invoke-static {v11, v13, v14, v10}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v11

    const-string v13, "PlanOverview_CircleProgress_"

    invoke-virtual {v13, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    move-object/from16 v13, v42

    invoke-static {v13, v11}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11, v8, v12, v10, v10}, Lp01/f;->i(Landroidx/compose/ui/Modifier;Lp01/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object/from16 v8, p2

    :goto_8
    if-nez v8, :cond_e

    const v8, -0x31e1bbb3

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, La61/e;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_c

    const v0, -0x1112a265

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move v8, v10

    move-object v0, v13

    goto :goto_b

    :cond_c
    const v11, -0x1112a264

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    invoke-static {v8, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v12, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->E()Lb91/a;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, La61/e;->f()Lk71/c;

    move-result-object v11

    sget-object v14, Lk71/c;->ENABLED:Lk71/c;

    if-ne v11, v14, :cond_d

    const v11, 0x5465d8a0

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v14

    :goto_9
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-wide v10, v14

    goto :goto_a

    :cond_d
    const v11, 0x5465dd1b

    invoke-static {v12, v11, v0, v12, v7}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v14

    goto :goto_9

    :goto_a
    const/16 v32, 0x0

    const v33, 0x2fffa

    move-object v0, v9

    const/4 v9, 0x0

    move-object/from16 v30, v12

    move-object/from16 v42, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v0, v42

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v11, 0x1

    goto :goto_d

    :cond_e
    move v8, v10

    move-object v0, v13

    const v9, 0x38325afb

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, La61/e;->i()Lk71/p;

    move-result-object v9

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_f

    const v9, -0x5b465fe1

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_f
    const v8, -0x5b465fe0

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lk71/p;->a()Lm91/u;

    move-result-object v8

    new-instance v10, Lf;

    const/4 v9, 0x1

    invoke-direct {v10, v9}, Lf;-><init>(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v15, :cond_10

    new-instance v9, Lp;

    const/16 v11, 0x8

    invoke-direct {v9, v11}, Lp;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v11, v9

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/16 v13, 0xc00

    const/4 v14, 0x2

    const/4 v9, 0x0

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual/range {p0 .. p0}, La61/e;->j()Ljava/util/List;

    move-result-object v9

    if-nez v9, :cond_11

    const v2, -0x5b42f709

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    move-object v7, v0

    move-object v0, v15

    move/from16 v6, v41

    goto/16 :goto_14

    :cond_11
    const v10, -0x5b42f708

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    move/from16 v11, v41

    const/4 v13, 0x2

    invoke-static {v0, v11, v10, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v3, v6, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_12

    move-object/from16 v13, v38

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v12, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v39

    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    move-object/from16 v3, v40

    invoke-static {v6, v12, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v12, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x60525385

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La61/f;

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v10, v36, v5

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v13, v0

    move-object v0, v15

    move v15, v10

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {p3 .. p3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    const/16 v9, 0x36

    invoke-static {v8, v2, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_15

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_11
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    :cond_16
    invoke-static {v10, v12, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, La61/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v6, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v12, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->D()Lb91/a;

    move-result-object v28

    invoke-virtual {v4}, La61/f;->a()Ly81/f;

    move-result-object v10

    invoke-virtual {v10, v12, v8}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    const/16 v32, 0x0

    const v33, 0x2fffa

    move-object v8, v9

    const/4 v9, 0x0

    move-object/from16 v30, v12

    move-object v10, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v11

    move-wide/from16 v45, v14

    move-object v15, v10

    move-wide/from16 v10, v45

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const-wide/16 v17, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v41, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const-wide/16 v21, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v38, v31

    const/16 v31, 0x0

    move-object/from16 v37, v2

    move-object v2, v8

    move-object/from16 v7, v38

    const/16 v39, 0x36

    move-object v8, v6

    move/from16 v6, v41

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    invoke-virtual {v4}, La61/f;->b()Lkd1/o;

    move-result-object v8

    if-nez v8, :cond_18

    const v8, -0x6db2ae25

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    goto :goto_12

    :cond_18
    const/4 v14, 0x0

    const v9, -0xbcbf51a

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    move-object/from16 v30, v12

    const/4 v12, 0x0

    const/4 v13, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v11, v30

    invoke-static/range {v8 .. v13}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v9

    move-object v12, v11

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object v8, v9

    :goto_12
    if-nez v8, :cond_19

    const v5, -0x6db22720

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move v5, v14

    goto :goto_13

    :cond_19
    const v9, -0x6db2271f

    invoke-static {v12, v9, v5, v5, v7}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v5, 0x6

    invoke-virtual {v2, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v15

    move/from16 v34, v14

    const/16 v14, 0x1b0

    move-object/from16 v30, v12

    move-wide v11, v15

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object/from16 v13, v30

    move/from16 v5, v34

    invoke-static/range {v8 .. v15}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v4}, La61/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v5, 0x6

    invoke-virtual {v2, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    invoke-virtual {v2, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v32, 0x0

    const v33, 0x2fffa

    const/4 v9, 0x0

    move-object/from16 v30, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v11, 0x1

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move-object v15, v0

    move v11, v6

    move-object v0, v7

    move-object/from16 v2, v37

    const/4 v7, 0x6

    goto/16 :goto_10

    :cond_1a
    move-object v7, v0

    move v6, v11

    move-object v0, v15

    const/4 v8, 0x0

    const/4 v11, 0x1

    invoke-static {v12, v8, v11, v8}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_14
    invoke-virtual/range {p0 .. p0}, La61/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_1b

    const v2, -0x5b2ccdcb

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_15

    :cond_1b
    const v3, -0x5b2ccdca

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-static {v2, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v3, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v10

    invoke-virtual {v3, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v13, p3

    invoke-static {v4, v6, v13}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v32, 0x0

    const v33, 0x2fff8

    move-object/from16 v30, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    move-object v8, v2

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual/range {p0 .. p0}, La61/e;->e()Lx11/c;

    move-result-object v2

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Lx11/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v10, v9

    goto :goto_16

    :cond_1c
    const/4 v10, 0x0

    :goto_16
    if-nez v10, :cond_1d

    const v0, -0x5b264c64

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    goto :goto_17

    :cond_1d
    const v2, -0x5b264c63

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    sget-object v9, Lny0/n0;->TextSmall:Lny0/n0;

    new-instance v2, Ly71/g;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lih0/d0;->E(Lx81/d;)I

    move-result v4

    const/4 v5, 0x0

    const/4 v13, 0x2

    invoke-direct {v2, v4, v5, v13, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v11, 0x1

    int-to-float v3, v11

    mul-float v17, v3, v35

    const/16 v19, 0x0

    const/16 v21, 0x6

    const/16 v18, 0x0

    move/from16 v20, v6

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    move-object/from16 v4, p0

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1e

    if-ne v5, v0, :cond_1f

    :cond_1e
    new-instance v5, La20/g;

    const/4 v0, 0x1

    invoke-direct {v5, v0, v1, v4}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v20, v5

    check-cast v20, Lkotlin/jvm/functions/Function1;

    const/16 v23, 0x0

    const/16 v24, 0xfe8

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x36

    move-object/from16 v21, v12

    move-object v12, v2

    invoke-static/range {v8 .. v24}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v21

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    move-object/from16 v9, p2

    :goto_17
    if-nez v9, :cond_20

    const v0, -0x5b1f6183

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v11, 0x1

    int-to-float v0, v11

    move/from16 v1, v35

    invoke-static {v0, v1, v7, v12, v8}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_18

    :cond_20
    const/4 v11, 0x1

    const v0, 0x4fa3e8df

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    return-object p2

    :cond_21
    move-object/from16 p2, v7

    invoke-virtual {v12}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final l(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x62ad8b8

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x2

    int-to-float p0, p0

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float/2addr p0, p2

    const/4 p2, 0x1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    invoke-static {v0, v1, p0, p2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;La61/e;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, La61/e;->e()Lx11/c;

    move-result-object p1

    invoke-virtual {p1}, Lx11/c;->getEvent()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, La61/c;->h(Landroidx/compose/ui/Modifier;La61/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/runtime/Composer;I)Z
    .locals 2

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p1

    check-cast p0, Lp1/q;

    invoke-virtual {p0, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v0, "home-future-ia"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const p1, 0x26980eb

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const p1, 0x52a89825

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    move p0, p1

    :goto_0
    return p0
.end method
