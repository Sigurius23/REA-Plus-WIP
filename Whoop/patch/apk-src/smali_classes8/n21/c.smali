.class public abstract Ln21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "Lk71/d;",
        "legends",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li2/x;",
        "labelColor",
        "Ll83/a0;",
        "e",
        "(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/util/List;JLo0/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln21/c;->h(Ljava/util/List;JLo0/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ln21/c;->i(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ln21/c;->f(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln21/c;->g(Ljava/util/List;JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lk71/d;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "J",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    sget-object v0, Lb2/e;->O:Lb2/k;

    const-string v2, "legends"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v2, 0x3f7af1b9

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_7

    and-int/lit8 v8, p6, 0x4

    if-nez v8, :cond_5

    move-wide/from16 v8, p2

    invoke-virtual {v14, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_4

    :cond_5
    move-wide/from16 v8, p2

    :cond_6
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    goto :goto_5

    :cond_7
    move-wide/from16 v8, p2

    :goto_5
    and-int/lit16 v10, v2, 0x93

    const/16 v11, 0x92

    const/4 v15, 0x1

    const/4 v12, 0x0

    if-eq v10, v11, :cond_8

    move v10, v15

    goto :goto_6

    :cond_8
    move v10, v12

    :goto_6
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v14, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v10, v5, 0x1

    sget-object v11, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x6

    if-eqz v10, :cond_b

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_a

    :goto_7
    and-int/lit16 v2, v2, -0x381

    :cond_a
    move/from16 v16, v2

    move-object v2, v7

    goto :goto_9

    :cond_b
    :goto_8
    if-eqz v6, :cond_c

    move-object v7, v11

    :cond_c
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_a

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    goto :goto_7

    :goto_9
    invoke-virtual {v14}, Lp1/q;->r()V

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_19

    new-instance v0, Ln21/a;

    const/4 v7, 0x0

    move/from16 v6, p6

    move-wide v3, v8

    invoke-direct/range {v0 .. v7}, Ln21/a;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;JIII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_d
    move-wide v5, v8

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v14, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-eqz v3, :cond_e

    invoke-virtual {v14, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_a
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v14, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v14, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-nez v7, :cond_f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    invoke-static {v12, v14, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    const/16 v12, 0x8

    const/high16 p3, 0xe000000

    if-eq v7, v15, :cond_17

    const/4 v15, 0x2

    if-eq v7, v15, :cond_16

    const/4 v8, 0x3

    if-eq v7, v8, :cond_11

    const v0, -0x986873a

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v15

    int-to-float v4, v12

    mul-float/2addr v3, v4

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v0, Ln21/b;

    invoke-direct {v0, v1, v5, v6}, Ln21/b;-><init>(Ljava/util/List;J)V

    const v4, 0x16179f4c

    invoke-static {v4, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v8, 0xc06

    const/4 v9, 0x6

    const/4 v4, 0x0

    move-wide v11, v5

    const/4 v5, 0x0

    move-object v6, v0

    move-object v7, v14

    move-wide v14, v11

    invoke-static/range {v3 .. v9}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    move-object v14, v7

    goto/16 :goto_d

    :cond_11
    move-object v7, v14

    move-wide v14, v5

    const/4 v5, 0x0

    const v6, -0x991ba9b

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    new-instance v6, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v6, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/4 v0, 0x2

    int-to-float v8, v0

    int-to-float v11, v12

    mul-float/2addr v8, v11

    const/4 v11, 0x0

    invoke-static {v6, v8, v11, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x1

    int-to-float v8, v6

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v8, v6

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v6, v8, v7, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_12

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v8, v7, v8, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v7, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x793ac6ab

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk71/d;

    invoke-virtual {v3}, Lk71/d;->b()Li91/a;

    move-result-object v4

    move v6, v5

    invoke-virtual {v3}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move v8, v6

    invoke-virtual {v3}, Lk71/d;->e()Ln21/i;

    move-result-object v6

    invoke-virtual {v3}, Lk71/d;->a()Lgz0/m0;

    move-result-object v3

    shl-int/lit8 v9, v16, 0x9

    const/high16 v10, 0x70000

    and-int v13, v9, v10

    move-wide v11, v14

    const/16 v14, 0xc1

    move v10, v8

    move-wide v8, v11

    move-object v12, v7

    move-object v7, v3

    const/4 v3, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Ln21/h;->n(Landroidx/compose/ui/Modifier;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLkotlin/jvm/functions/Function1;Lb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v12

    move v5, v15

    move-wide v14, v8

    goto :goto_c

    :cond_15
    move-wide v8, v14

    const/4 v6, 0x1

    move v15, v5

    move-object v14, v7

    invoke-static {v14, v15, v6, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-wide v11, v8

    goto/16 :goto_d

    :cond_16
    move-wide v8, v5

    const/4 v15, 0x0

    const v3, -0x99c1e8d

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/4 v0, 0x2

    int-to-float v4, v0

    int-to-float v5, v12

    mul-float/2addr v4, v5

    const/4 v11, 0x0

    invoke-static {v3, v4, v11, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk71/d;

    invoke-virtual {v0}, Lk71/d;->b()Li91/a;

    move-result-object v3

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk71/d;

    invoke-virtual {v0}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk71/d;

    invoke-virtual {v0}, Lk71/d;->e()Ln21/i;

    move-result-object v5

    invoke-interface {v1, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk71/d;

    invoke-virtual {v0}, Lk71/d;->a()Lgz0/m0;

    move-result-object v6

    const/4 v0, 0x1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk71/d;

    invoke-virtual {v7}, Lk71/d;->b()Li91/a;

    move-result-object v7

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lk71/d;

    invoke-virtual {v10}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lk71/d;

    invoke-virtual {v11}, Lk71/d;->e()Ln21/i;

    move-result-object v11

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lk71/d;

    invoke-virtual {v12}, Lk71/d;->a()Lgz0/m0;

    move-result-object v12

    shl-int/lit8 v16, v16, 0x12

    and-int v16, v16, p3

    move/from16 v17, v15

    move/from16 v15, v16

    const/16 v16, 0x0

    move/from16 v18, v0

    move/from16 v0, v17

    move-wide/from16 v19, v8

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-wide/from16 v11, v19

    invoke-static/range {v3 .. v16}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-wide v8, v11

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move/from16 v6, v18

    goto :goto_d

    :cond_17
    move-wide v8, v5

    move/from16 v18, v15

    const/4 v3, 0x0

    const v4, -0x9a39414

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    new-instance v4, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v4, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/4 v0, 0x2

    int-to-float v5, v0

    int-to-float v6, v12

    mul-float/2addr v5, v6

    const/4 v11, 0x0

    invoke-static {v4, v5, v11, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk71/d;

    invoke-virtual {v0}, Lk71/d;->b()Li91/a;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lk71/d;

    invoke-virtual {v4}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk71/d;

    invoke-virtual {v5}, Lk71/d;->e()Ln21/i;

    move-result-object v5

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lk71/d;

    invoke-virtual {v6}, Lk71/d;->a()Lgz0/m0;

    move-result-object v6

    shl-int/lit8 v7, v16, 0x12

    and-int v15, v7, p3

    const/16 v16, 0xf0

    const/4 v7, 0x0

    move-wide v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v19, v3

    move-object v3, v0

    move/from16 v0, v19

    invoke-static/range {v3 .. v16}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    :goto_d
    invoke-virtual {v14, v6}, Lp1/q;->q(Z)V

    move-wide v3, v11

    goto :goto_e

    :cond_18
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v2, v7

    move-wide v3, v8

    :goto_e
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Ln21/a;

    const/4 v7, 0x1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Ln21/a;-><init>(Ljava/util/List;Landroidx/compose/ui/Modifier;JIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final f(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ln21/c;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ljava/util/List;JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 21

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    const-string v4, "$this$BoxWithConstraints"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, p5, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p5, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p5

    :goto_1
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v5, v6, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v4, v7

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_5

    check-cast v3, Landroidx/compose/foundation/layout/c;

    iget-wide v3, v3, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v3, v4}, Ly3/a;->i(J)I

    move-result v3

    new-instance v8, Lo0/b;

    const/4 v4, 0x3

    invoke-direct {v8, v4}, Lo0/b;-><init>(I)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    const/4 v5, 0x0

    invoke-static {v4, v5, v3, v7}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v3, Ll0/m;->a:Ll0/e;

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/e;->K:Lb2/l;

    invoke-static {v3, v4}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v12

    sget-object v13, Ll0/m;->e:Ll0/h;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v1, v2}, Lp1/q;->f(J)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, Ljd2/a;

    invoke-direct {v4, v0, v7, v1, v2}, Ljd2/a;-><init>(Ljava/util/List;IJ)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v17, v4

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/high16 v19, 0x61b0000

    const/16 v20, 0x29c

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v6

    invoke-static/range {v8 .. v20}, Lse/h;->k(Lo0/b;Landroidx/compose/ui/Modifier;Lo0/y;Ll0/k1;Ll0/l;Ll0/i;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    move-object/from16 v18, v6

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Ljava/util/List;JLo0/s;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyVerticalGrid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln21/c$a;->w:Ln21/c$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ln21/c$b;

    invoke-direct {v2, v0, p0}, Ln21/c$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Ln21/c$c;

    invoke-direct {v0, p0, p1, p2}, Ln21/c$c;-><init>(Ljava/util/List;J)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, -0x4297e015

    invoke-direct {p0, v0, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Lo0/g;

    invoke-virtual {p3, v1, v2, p0}, Lo0/g;->q(ILkotlin/jvm/functions/Function1;Lx1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/util/List;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ln21/c;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
