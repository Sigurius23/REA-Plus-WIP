.class public abstract Lux2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lux2/b;",
        "viewState",
        "Lkotlin/Function1;",
        "Lrx2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "k",
        "(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lux2/b$b;",
        "g",
        "(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lux2/a;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lux2/a;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lux2/a;->j(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lux2/a;->n(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lux2/a;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lux2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lux2/a;->l(Lkotlin/jvm/functions/Function1;Lux2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lux2/b$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    sget-object v0, Lb2/e;->M:Lb2/k;

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    move-object/from16 v5, p1

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onNavEvent"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v2, -0x6c20c1b6

    invoke-virtual {v13, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_3

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x100

    goto :goto_2

    :cond_2
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v2, v7

    :cond_3
    and-int/lit16 v7, v2, 0x83

    const/16 v9, 0x82

    const/4 v11, 0x0

    if-eq v7, v9, :cond_4

    const/4 v7, 0x1

    goto :goto_3

    :cond_4
    move v7, v11

    :goto_3
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v13, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1e

    sget-object v16, Lb2/t;->w:Lb2/t;

    invoke-static/range {v16 .. v16}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Ll0/m;->c:Ll0/g;

    invoke-static {v12, v0, v13, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v13, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v8, v13, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v13, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x2

    int-to-float v8, v7

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float v1, v8, v7

    move/from16 v20, v8

    const/4 v8, 0x0

    const/4 v4, 0x1

    invoke-static {v6, v8, v1, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v23, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v26

    sget v4, Lyw2/e;->b:I

    const/4 v8, 0x0

    invoke-static {v4, v13, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v27

    const v40, 0xfff2

    const/16 v41, 0x0

    const/16 v25, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v23 .. v41}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v2, v2, 0x380

    const/16 v4, 0x100

    if-ne v2, v4, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    move v2, v8

    :goto_5
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_9

    if-ne v4, v8, :cond_a

    :cond_9
    new-instance v4, Luf0/e;

    const/4 v2, 0x3

    invoke-direct {v4, v3, v2}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 p3, v8

    const/4 v8, 0x3

    shl-int/2addr v2, v8

    move-object/from16 v24, v14

    const/16 v14, 0x34

    move/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object v3, v13

    move v13, v2

    move-object v2, v12

    move-object v12, v3

    move-object/from16 v42, p3

    move-object/from16 p3, v1

    move/from16 v32, v7

    move-object/from16 v33, v9

    move-object/from16 v22, v15

    move-object/from16 v15, v16

    move-object/from16 v7, v23

    move-object/from16 v34, v24

    move-object/from16 v35, v26

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/16 v23, 0x2

    move-object v9, v4

    move-object/from16 v4, v27

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v12

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3, v13, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v6, v7, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v0, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_b

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v9, v35

    goto :goto_7

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v13, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v34

    invoke-static {v13, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    move-object/from16 v8, v33

    goto :goto_9

    :cond_d
    move-object/from16 v8, v33

    :goto_8
    move-object/from16 v7, v22

    goto :goto_a

    :goto_9
    invoke-static {v7, v13, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v13, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v5

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v18, v6, v10

    mul-float v25, v20, v10

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v25

    move-object/from16 v16, v15

    move/from16 v17, v25

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v33, v18

    const/4 v11, 0x6

    int-to-float v11, v11

    mul-float v11, v11, v32

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->g()I

    move-result v11

    invoke-static {v11, v13, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v11

    sget v12, Lx81/d;->b:I

    move-object/from16 v14, p3

    invoke-virtual {v14, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 p3, v6

    invoke-virtual/range {v16 .. v16}, Ly81/i;->b1()J

    move-result-wide v5

    move/from16 v16, v12

    new-instance v12, Li2/p;

    const/4 v3, 0x5

    invoke-direct {v12, v5, v6, v3}, Li2/p;-><init>(JI)V

    move-object v3, v14

    const/16 v14, 0x30

    move-object v5, v15

    const/16 v15, 0x38

    move-object/from16 v22, v7

    const-string v7, ""

    move-object/from16 v26, v9

    const/4 v9, 0x0

    move v6, v10

    const/4 v10, 0x0

    move/from16 v17, v6

    move-object v6, v11

    const/4 v11, 0x0

    move-object/from16 v37, v0

    move-object v1, v3

    move-object/from16 v38, v8

    move/from16 v0, v16

    move-object/from16 v43, v22

    move-object/from16 v3, v26

    move-object/from16 v8, p3

    move/from16 p3, v17

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v13, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v1, v13, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v7

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    mul-float v26, v10, p3

    const/16 v28, 0x0

    const/16 v29, 0x8

    move/from16 v27, v25

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v39, v25

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v30, v11, 0x12

    const v31, 0x2fff8

    move/from16 v12, v26

    move-object/from16 v26, v7

    move-object v7, v10

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v40, v29

    const/16 v29, 0x0

    move/from16 v44, v40

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->h()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v6, v13, v8}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v13, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v1, v13, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/16 v28, 0x0

    const/16 v29, 0x8

    move/from16 v27, v39

    move/from16 v26, v33

    move/from16 v25, v39

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v29, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    mul-float v26, v0, p3

    const/16 v28, 0x0

    const/16 v29, 0x8

    move/from16 v27, v39

    move/from16 v25, v39

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v25

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v6, v13, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v13, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    move-object/from16 v2, v38

    goto :goto_d

    :cond_10
    :goto_c
    move-object/from16 v7, v43

    goto :goto_e

    :goto_d
    invoke-static {v7, v13, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v13, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0xc024b46

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpx2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    move-object/from16 v4, v37

    const/4 v6, 0x0

    invoke-static {v3, v4, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_10
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_13

    :cond_12
    invoke-static {v6, v13, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v13, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lb2/e;->L:Lb2/l;

    sget-object v12, Ll0/m;->a:Ll0/e;

    invoke-static {v12, v9, v13, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_14

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v13, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {v12, v13, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v13, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lpx2/k;->b()Ll83/k;

    move-result-object v3

    iget-object v3, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/design/util/TextResource;

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v13, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v7, v13, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->C()Lb91/a;

    move-result-object v26

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v30, v11, 0x12

    const v31, 0x2fffa

    move-object v11, v7

    const/4 v7, 0x0

    move-wide v14, v9

    move-object v9, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move/from16 v17, v8

    move-wide/from16 v45, v14

    move-object v15, v9

    move-wide/from16 v8, v45

    const/4 v14, 0x0

    move-object/from16 v18, v15

    const/16 v19, 0x30

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v33, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move-object/from16 v38, v29

    const/16 v29, 0x0

    move/from16 v45, v33

    move-object/from16 v33, v0

    move-object/from16 v0, v38

    move/from16 v38, v37

    move-object/from16 v37, v2

    move/from16 v2, v45

    move/from16 v45, v6

    move-object v6, v3

    move/from16 v3, v45

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v6, v6, p3

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v13, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v37 .. v37}, Lpx2/k;->b()Ll83/k;

    move-result-object v7

    iget-object v7, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/design/util/TextResource;

    invoke-static {v7, v13, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v0, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    const/4 v7, 0x0

    const/4 v13, 0x0

    move/from16 v45, v6

    move-object v6, v3

    move/from16 v3, v45

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v6, 0x1

    invoke-static {v13, v6, v5, v3, v13}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {v37 .. v37}, Lpx2/k;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v0, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    const/4 v13, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v2, v10

    const-wide/16 v7, 0x0

    cmpl-double v0, v2, v7

    if-lez v0, :cond_17

    goto :goto_12

    :cond_17
    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    invoke-static {v10, v6, v13}, Ldc/b;->y(FZLp1/q;)V

    move-object/from16 v37, v4

    move-object/from16 v0, v33

    move/from16 v8, v38

    goto/16 :goto_f

    :cond_18
    move/from16 v38, v8

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    mul-float v7, v32, p3

    invoke-static {v5, v1, v7}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lhy0/g;->SOLID:Lhy0/g;

    const/16 v17, 0x30

    const/16 v18, 0xfc

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v28, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v28

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->d()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v13, v8}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v9

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-static {v5, v1, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v3, Liz0/m;->p:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit8 v16, v3, 0x30

    const/16 v17, 0x1f4

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_19

    const v3, -0x71073bec

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x3

    int-to-float v4, v3

    mul-float v4, v4, p3

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v13, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v13, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v13, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->X()J

    move-result-wide v9

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v11

    invoke-virtual {v11}, Lgz0/i0;->w()I

    move-result v11

    invoke-virtual {v6, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->Y()J

    move-result-wide v14

    move-wide v8, v9

    move v10, v11

    move-wide v11, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v15}, Lox2/b;->c(Ljava/lang/String;Ljava/lang/String;JIJLandroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x0

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_19
    const/4 v3, 0x3

    const/4 v4, 0x0

    const v6, -0x71006e1c

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->e()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1a

    const v6, -0x70ffacba

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1a
    const v7, -0x70ffacb9

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    int-to-float v7, v3

    move/from16 v8, p3

    invoke-static {v7, v8, v5, v13}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v13, v4}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v9

    invoke-static {v5, v1, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v14, 0x0

    const/16 v17, 0x1f4

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p0 .. p0}, Lux2/b$b;->f()Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_1b

    const v0, -0x70fadb82

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    :goto_15
    const/4 v6, 0x1

    goto :goto_17

    :cond_1b
    const v4, -0x70fadb81

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_16
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ly71/o;

    move/from16 v12, v44

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v13, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v5, v1, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v14, v42

    if-ne v8, v14, :cond_1c

    new-instance v8, Lut2/a;

    const/16 v9, 0x12

    invoke-direct {v8, v9}, Lut2/a;-><init>(I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v8, Lc93/a;

    sget v9, Ly71/o;->q:I

    shl-int/2addr v9, v3

    or-int/lit16 v10, v9, 0x186

    const/4 v11, 0x0

    move-object v9, v13

    invoke-static/range {v6 .. v11}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v44, v12

    move-object/from16 v42, v14

    goto :goto_16

    :cond_1d
    const/4 v8, 0x0

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_17
    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v0, Ls01/e;

    const/16 v5, 0x18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lux2/a;->g(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lux2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x327b4474

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x4

    const/4 v7, 0x2

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v8, v4, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v8, v9

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v5, v8

    :cond_4
    and-int/lit16 v8, v4, 0x180

    const/16 v10, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v10

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_6
    and-int/lit16 v8, v5, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x0

    if-eq v8, v11, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move v8, v13

    :goto_5
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v0, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v8, Lux2/b$c;->a:Lux2/b$c;

    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const v5, 0x694144fe

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    move-object/from16 v17, v0

    move/from16 v0, v21

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v17

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_8
    move-object v8, v0

    move v0, v13

    instance-of v11, v1, Lux2/b$a;

    if-eqz v11, :cond_11

    const v11, 0x6944f8cb

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    new-instance v13, Lsz0/p0$b;

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lyw2/e;->l:I

    const/4 v15, 0x0

    invoke-direct {v14, v11, v15, v7, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lyw2/e;->s:I

    invoke-direct {v14, v15, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lyw2/e;->B:I

    invoke-direct {v15, v12, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lyw2/e;->a:I

    invoke-direct {v12, v0, v11, v7, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, v5, 0x70

    if-ne v0, v9, :cond_9

    const/4 v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    :goto_6
    and-int/lit8 v7, v5, 0xe

    if-eq v7, v6, :cond_b

    and-int/lit8 v6, v5, 0x8

    if-eqz v6, :cond_a

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_7

    :cond_a
    const/4 v6, 0x0

    goto :goto_8

    :cond_b
    :goto_7
    const/4 v6, 0x1

    :goto_8
    or-int/2addr v0, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_c

    if-ne v6, v7, :cond_d

    :cond_c
    new-instance v6, Lui0/q;

    const/4 v0, 0x3

    invoke-direct {v6, v0, v2, v1}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v9, v6

    check-cast v9, Lc93/a;

    and-int/lit16 v0, v5, 0x380

    if-ne v0, v10, :cond_e

    const/4 v0, 0x1

    goto :goto_9

    :cond_e
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_f

    if-ne v5, v7, :cond_10

    :cond_f
    new-instance v5, Luf0/e;

    const/4 v0, 0x2

    invoke-direct {v5, v3, v0}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lc93/a;

    const/high16 v0, 0x30000

    sget v6, Lsz0/p0$b;->h:I

    or-int/2addr v0, v6

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v6, 0x3

    or-int/2addr v0, v7

    shl-int/lit8 v7, v6, 0x9

    or-int/2addr v0, v7

    shl-int/lit8 v6, v6, 0x15

    or-int v18, v0, v6

    const/16 v19, 0x6

    const/16 v20, 0xa44

    const/4 v7, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v14

    const/4 v14, 0x0

    move-object/from16 v17, v8

    move-object v8, v15

    const/4 v15, 0x1

    const/16 v16, 0x0

    move-object/from16 v21, v13

    move-object v13, v5

    move-object/from16 v5, v21

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v17

    const/4 v14, 0x0

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    move v14, v0

    instance-of v0, v1, Lux2/b$b;

    if-eqz v0, :cond_12

    const v0, 0x695012be

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Lux2/b$b;

    and-int/lit16 v5, v5, 0x3fe

    invoke-static {v0, v2, v3, v8, v5}, Lux2/a;->g(Lux2/b$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_12
    const v0, 0x7f4426e2

    invoke-static {v0, v8, v14}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_13
    move-object v8, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Ls01/e;

    const/16 v5, 0x17

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lux2/b;)Ll83/a0;
    .locals 1

    new-instance v0, Lrx2/a$a;

    check-cast p1, Lux2/b$a;

    invoke-virtual {p1}, Lux2/b$a;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lrx2/a$a;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/feature/navigation/c$a;->a:Lcom/whoop/whooplabs/feature/navigation/c$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lux2/a;->k(Lux2/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
