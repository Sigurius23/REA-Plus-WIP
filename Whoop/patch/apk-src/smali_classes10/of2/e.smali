.class public abstract Lof2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llf2/j;",
        "wakeModeViewState",
        "Lkotlin/Function1;",
        "Llf2/b;",
        "Ll83/a0;",
        "wakeModeEventListener",
        "d",
        "(Llf2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "sleep-coach_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Llf2/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lof2/e;->f(Lkotlin/jvm/functions/Function1;Llf2/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llf2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lof2/e;->g(Llf2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Llf2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lof2/e;->e(Lkotlin/jvm/functions/Function1;Llf2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Llf2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llf2/j;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v3, Lb2/e;->N:Lb2/k;

    const-string v4, "wakeModeViewState"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "wakeModeEventListener"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v4, -0x10adf105

    invoke-virtual {v8, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x4

    const/4 v11, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v11

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v13, 0x12

    if-eq v6, v13, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    sget-object v6, Ll0/m;->f:Ll0/h;

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v7, v9

    move/from16 p2, v13

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    invoke-static {v13, v10, v15, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move/from16 v18, v10

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v14}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v12, 0x36

    invoke-static {v6, v3, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v21, La3/l;->a:La3/k;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    invoke-static {v10, v8, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x5

    int-to-float v6, v6

    int-to-float v11, v5

    mul-float/2addr v6, v11

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v5, -0x65a9b8a6

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Llf2/j;->a()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llf2/a;

    sget-object v23, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v5}, Llf2/a;->b()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v5}, Llf2/a;->a()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    const/16 v30, 0x3a

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v23 .. v31}, Ly71/o$c;->b(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;ZZLjava/lang/Object;ILjava/lang/Object;)Ly71/o;

    move-result-object v23

    const/4 v12, 0x2

    const/16 v21, 0x3

    int-to-float v10, v12

    mul-float/2addr v10, v9

    const/4 v15, 0x0

    const/16 v24, 0x6

    invoke-static {v13, v10, v15, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    and-int/lit8 v12, v4, 0x70

    const/16 v15, 0x20

    if-ne v12, v15, :cond_8

    const/4 v12, 0x1

    goto :goto_6

    :cond_8
    const/4 v12, 0x0

    :goto_6
    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v12, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_9

    if-ne v15, v6, :cond_a

    :cond_9
    new-instance v15, Lmi2/o;

    const/16 v6, 0x1a

    invoke-direct {v15, v6, v1, v5}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v15, Lc93/a;

    sget v5, Ly71/o;->q:I

    shl-int/lit8 v5, v5, 0x3

    or-int/lit8 v5, v5, 0x6

    move v6, v9

    move v9, v5

    move-object v5, v10

    const/4 v10, 0x0

    move/from16 v12, v18

    move/from16 v18, v4

    move v4, v12

    move v12, v7

    move-object v7, v15

    move v15, v6

    move-object/from16 v6, v23

    move-object/from16 v23, v14

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v10}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v11, v13, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move/from16 v7, v18

    move/from16 v18, v4

    move v4, v7

    move v7, v12

    move v9, v15

    move-object/from16 v14, v23

    goto/16 :goto_5

    :cond_b
    move/from16 v5, v18

    move/from16 v18, v4

    move v4, v5

    move v15, v9

    const/4 v5, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    const/16 v21, 0x3

    const/16 v24, 0x6

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    const/4 v12, 0x2

    int-to-float v7, v12

    mul-float v9, v7, v15

    const/4 v10, 0x0

    invoke-static {v13, v9, v10, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v25

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_c

    invoke-static {v8}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_c
    move-object/from16 v26, v9

    check-cast v26, Lj0/i;

    new-instance v9, Li3/i;

    invoke-direct {v9, v5}, Li3/i;-><init>(I)V

    and-int/lit8 v10, v18, 0x70

    const/16 v5, 0x20

    if-ne v10, v5, :cond_d

    const/16 v17, 0x1

    goto :goto_7

    :cond_d
    const/16 v17, 0x0

    :goto_7
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int v5, v17, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_e

    if-ne v10, v6, :cond_f

    :cond_e
    new-instance v10, Lmi2/o;

    const/16 v5, 0x1b

    invoke-direct {v10, v5, v1, v0}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v30, v10

    check-cast v30, Lc93/a;

    const/16 v31, 0xc

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v9

    invoke-static/range {v25 .. v31}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    move/from16 v10, v24

    invoke-static {v6, v9, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move v9, v11

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    move/from16 v17, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 v18, v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto :goto_9

    :cond_11
    move/from16 v18, v9

    :goto_9
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v8, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x1

    invoke-static {v13, v5}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v10, v5

    mul-float/2addr v10, v15

    new-instance v15, Ll0/l1;

    invoke-direct {v15, v4, v10, v4, v10}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v15, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3, v4}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v10, v9, v8, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    move-object v10, v6

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_13

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v8, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_14

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    :cond_14
    invoke-static {v5, v8, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v8, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Llf2/j;->d()Llf2/c;

    move-result-object v4

    invoke-virtual {v4}, Llf2/c;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v4, "toUpperCase(...)"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v29, v7, 0x12

    const v30, 0x2fffa

    move v7, v6

    const/4 v6, 0x0

    move v11, v7

    move-object/from16 v27, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move-object/from16 v22, v15

    const-wide/16 v14, 0x0

    const/16 v23, 0x1

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    move/from16 v31, v19

    const-wide/16 v18, 0x0

    const/16 v32, 0x2

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    const/16 v36, 0x6

    const/16 v24, 0x0

    move/from16 v37, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x0

    move/from16 v1, v31

    move/from16 v0, v32

    move-object/from16 v2, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    mul-float v7, v37, v38

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v5, Ly71/g;

    invoke-static {v4}, Lih0/d0;->E(Lx81/d;)I

    move-result v6

    const/4 v7, 0x0

    invoke-direct {v5, v6, v7, v0, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Ly71/g;->b()I

    move-result v0

    const/4 v10, 0x6

    invoke-static {v0, v8, v10}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    mul-float v11, v38, v38

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v4, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const-string v6, ""

    move-wide/from16 v39, v9

    move-object v10, v8

    move-wide/from16 v8, v39

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    new-instance v6, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v6, v3}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual/range {p0 .. p0}, Llf2/j;->d()Llf2/c;

    move-result-object v3

    invoke-virtual {v3}, Llf2/c;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v4, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v3

    new-instance v1, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v1, v7}, Lw3/k;-><init>(I)V

    const v30, 0x2fdf8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v17, v1

    move-object/from16 v27, v8

    move-wide v7, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/4 v7, 0x3

    int-to-float v1, v7

    move/from16 v9, v38

    invoke-static {v1, v9, v2, v8, v0}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_b

    :cond_16
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Lof2/d;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Llf2/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Llf2/a;->c()Llf2/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Llf2/j;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Llf2/j;->d()Llf2/c;

    move-result-object p1

    invoke-virtual {p1}, Llf2/c;->a()Llf2/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llf2/j;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lof2/e;->d(Llf2/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
