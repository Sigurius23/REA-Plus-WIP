.class public abstract Lx11/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a;\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "ctaMessage",
        "buttonLabel",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClicked",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lx11/b;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lx11/b;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lx11/b;->f(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p5

    const-string v1, "ctaMessage"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p4

    check-cast v1, Lp1/q;

    const v4, 0x1e63a06

    invoke-virtual {v1, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p6, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v6, v0, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v7, v8

    :cond_6
    and-int/lit8 v8, p6, 0x8

    const/16 v9, 0x800

    if-eqz v8, :cond_8

    or-int/lit16 v7, v7, 0xc00

    :cond_7
    move-object/from16 v10, p3

    goto :goto_5

    :cond_8
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_7

    move-object/from16 v10, p3

    invoke-virtual {v1, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    move v11, v9

    goto :goto_4

    :cond_9
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v7, v11

    :goto_5
    and-int/lit16 v11, v7, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_a

    move v11, v14

    goto :goto_6

    :cond_a
    move v11, v13

    :goto_6
    and-int/lit8 v12, v7, 0x1

    invoke-virtual {v1, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_15

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_b

    move-object v4, v11

    goto :goto_7

    :cond_b
    move-object v4, v6

    :goto_7
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_d

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_c

    new-instance v8, Lwr1/f;

    const/16 v10, 0xd

    invoke-direct {v8, v10}, Lwr1/f;-><init>(I)V

    invoke-virtual {v1, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lc93/a;

    move-object v10, v8

    :cond_d
    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v12, v1, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 p0, v6

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v1, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v1, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v5, v1, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v5, v7, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v1, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const-wide/high16 v11, 0x3ff4000000000000L    # 1.25

    double-to-float v6, v11

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v16, v6, v8

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v11

    mul-float v19, v6, v8

    const/16 v20, 0x6

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v8, v1, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v8, v1, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object v15, v8

    move/from16 v16, v9

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v4

    move-object v4, v5

    move-object v5, v6

    move-wide/from16 v38, v11

    move v12, v7

    move-wide/from16 v6, v38

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    move-object/from16 v25, v18

    const-wide/16 v17, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v35, v27

    const/16 v27, 0x0

    move-object/from16 v37, p0

    move-object/from16 v3, v26

    move/from16 v36, v35

    move-object/from16 v26, v1

    move/from16 v1, v30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    if-nez p2, :cond_11

    const v5, -0x8d9e9f3

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v26, v3

    :goto_9
    const/4 v1, 0x1

    goto :goto_b

    :cond_11
    const v5, -0x8d9e9f2

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lny0/n0;->TextSmall:Lny0/n0;

    new-instance v7, Ly71/g;

    invoke-static/range {v32 .. v32}, Lih0/d0;->E(Lx81/d;)I

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct {v7, v6, v8, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v12, v36

    and-int/lit16 v6, v12, 0x1c00

    const/16 v8, 0x800

    if-ne v6, v8, :cond_12

    const/4 v13, 0x1

    goto :goto_a

    :cond_12
    move v13, v1

    :goto_a
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v13, :cond_13

    move-object/from16 v8, v37

    if-ne v6, v8, :cond_14

    :cond_13
    new-instance v6, Lpy0/a;

    const/16 v8, 0x17

    invoke-direct {v6, v3, v8}, Lpy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v15, v6

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x0

    const/16 v19, 0xfe9

    move-object/from16 v26, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x30

    move-object/from16 v16, v4

    move-object v4, v5

    move-object/from16 v5, p2

    invoke-static/range {v3 .. v19}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v16

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_b
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v26

    move-object/from16 v26, v4

    move-object v4, v1

    move-object/from16 v1, v34

    goto :goto_c

    :cond_15
    move-object v4, v1

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v26, v4

    move-object v1, v6

    move-object v4, v10

    :goto_c
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Lw71/k;

    const/4 v7, 0x6

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lx11/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
