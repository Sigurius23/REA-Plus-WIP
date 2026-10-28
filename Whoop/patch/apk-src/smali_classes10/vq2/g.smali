.class public abstract Lvq2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lvq2/c;",
        "stepState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lvq2/c;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lvq2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvq2/g;->d(Lvq2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lvq2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvq2/g;->e(Lvq2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lvq2/c;ZLandroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "stepState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x63b40998

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v7, 0x0

    const/4 v2, 0x1

    if-eq v0, v1, :cond_4

    move v0, v2

    goto :goto_3

    :cond_4
    move v0, v7

    :goto_3
    and-int/2addr p2, v2

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_7

    if-eqz p1, :cond_6

    const p2, 0x6bdaf87a

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_5

    new-instance p2, Ld0/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p2, v0}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v1, p2

    check-cast v1, Ld0/q0;

    new-instance p2, Ltx0/a;

    const/16 v0, 0x19

    invoke-direct {p2, p0, v0}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    const v0, 0x4b7dd81d    # 1.6635933E7f

    invoke-static {v0, v4, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x180

    const/4 v6, 0x2

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    const p2, 0x6c087c9a    # 6.600093E26f

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lvq2/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lvq2/e;-><init>(Lvq2/c;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d(Lvq2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, Ll0/m;->d:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v7, v12, v5, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-nez v14, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    :cond_2
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v5, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v14, 0x5

    int-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v0, v14, v15

    int-to-float v1, v3

    mul-float/2addr v1, v15

    invoke-static {v4, v0, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v3, Lb2/e;->J:Lb2/l;

    invoke-static {v4, v3, v5, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move/from16 p2, v13

    move v4, v14

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-eqz v2, :cond_4

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v13, v5, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v5, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->a()I

    move-result v2

    sget v3, Lyp2/c;->d:I

    invoke-static {v5, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lvq2/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v5, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v2, v3, v7, v5, v8}, Lvq2/f;->g(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/c0;->o()I

    move-result v2

    sget v3, Lyp2/c;->A:I

    invoke-static {v5, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lvq2/c;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v5, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v3, v7, v5, v8}, Lvq2/f;->g(ILjava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v10, v1

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v3, v6

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v6, 0xa

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/16 v8, 0x32

    int-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-static {v1, v6, v8}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    float-to-double v8, v2

    const-wide/16 v10, 0x0

    cmpl-double v6, v8, v10

    if-lez v6, :cond_7

    :goto_3
    const/4 v8, 0x0

    goto :goto_4

    :cond_7
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_3

    :goto_4
    invoke-static {v1, v8, v2}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-static {v2, v1, v5, v8, v8}, Lvq2/a;->h(Lvq2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2}, Lvq2/c;->i()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v6, 0x0

    if-nez v1, :cond_8

    const v1, 0x331f9cf2

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lvq2/c;->i()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sget v8, Lx81/d;->b:I

    invoke-virtual {v0, v5, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->N()Lb91/a;

    move-result-object v26

    mul-float/2addr v4, v7

    const/4 v9, 0x2

    invoke-static {v3, v4, v6, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v9, 0x3

    int-to-float v9, v9

    mul-float v18, v9, v7

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-string v9, "HorizontalSleepBarHighlightedText"

    invoke-static {v7, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v31, Lb91/a;->d:I

    shl-int/lit8 v29, v31, 0x15

    const v30, 0x1fffc

    move v10, v6

    move-object v6, v7

    move v9, v8

    const-wide/16 v7, 0x0

    move v11, v9

    move v12, v10

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    move/from16 v18, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v28

    const/16 v28, 0x30

    move/from16 v2, v27

    move-object/from16 v27, v5

    move-object v5, v1

    move/from16 v1, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual/range {p0 .. p0}, Lvq2/c;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->f0()J

    move-result-wide v7

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v3, v4, v10, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v17, 0x0

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v18, v4

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shl-int/lit8 v29, v31, 0x12

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v26, 0x0

    move-object v5, v1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move v10, v6

    move v1, v13

    const v0, 0x332cbbb9

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float/2addr v2, v15

    const/4 v9, 0x2

    invoke-static {v0, v2, v10, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v2, v12}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "HorizontalSleepBarFooterText"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lvq2/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lvq2/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    shl-int/lit8 v4, v1, 0x3

    shl-int/lit8 v1, v1, 0x6

    or-int/2addr v1, v4

    invoke-static {v0, v2, v3, v5, v1}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lvq2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lvq2/g;->c(Lvq2/c;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
