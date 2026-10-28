.class public abstract Ls51/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ls51/d;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "b",
        "(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ls51/c;->c(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ls51/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move/from16 v0, p4

    const-string v1, "state"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v1, 0x14d355cc

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v3, v0, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_6
    and-int/lit16 v6, v4, 0x93

    const/16 v7, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v6, v7, :cond_7

    move v6, v11

    goto :goto_4

    :cond_7
    move v6, v10

    :goto_4
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v13, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_19

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_8

    move-object v1, v12

    goto :goto_5

    :cond_8
    move-object v1, v3

    :goto_5
    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v7, v13, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v13, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v10, v11

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v7, v10, v3

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v13, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Ls51/d;->e()Ls51/m;

    move-result-object v11

    and-int/lit16 v4, v4, 0x380

    move-object/from16 v18, v8

    const/4 v8, 0x1

    move/from16 v19, v3

    const/4 v3, 0x0

    move/from16 v35, v7

    move v7, v4

    move-object v4, v11

    move-object v11, v6

    move-object v6, v13

    move/from16 v13, v35

    invoke-static/range {v3 .. v8}, Ls51/l;->m(Landroidx/compose/ui/Modifier;Ls51/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v20, v7

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Ls51/d;->f()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x6

    if-eqz v3, :cond_12

    const v3, 0x66cab9de

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ls51/d;->g()Lhy0/e;

    move-result-object v3

    if-nez v3, :cond_c

    const v3, 0x66cb02a4

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move-object/from16 v29, v1

    move v0, v5

    move-object/from16 v32, v9

    move/from16 v28, v10

    move-object/from16 v30, v11

    move-object v1, v12

    move v2, v13

    move-object/from16 v25, v14

    move-object/from16 v24, v15

    move-object/from16 v31, v18

    move/from16 v33, v19

    :goto_7
    const/high16 v3, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_c
    const/4 v5, 0x0

    const v7, 0x66cb02a5

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x2

    int-to-float v8, v7

    mul-float v8, v8, v19

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v6, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v3}, Lhy0/e;->b()Lhy0/g;

    move-result-object v16

    invoke-virtual {v3}, Lhy0/e;->a()Lhy0/f;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v22

    move-object v5, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/16 v15, 0xd1

    move-object/from16 v25, v5

    move-object v5, v3

    const/4 v3, 0x0

    move/from16 v26, v7

    const/4 v7, 0x0

    move/from16 v28, v10

    move-object/from16 v27, v11

    const-wide/16 v10, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v0, v29

    move-object/from16 v29, v1

    move-object v1, v0

    move-object/from16 v32, v9

    move v2, v13

    move-object/from16 v4, v16

    move-object/from16 v31, v18

    move/from16 v33, v19

    move-object/from16 v30, v27

    const/4 v0, 0x0

    move-object v13, v6

    move-object v6, v8

    move-wide/from16 v8, v22

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v13

    invoke-static {v1, v2, v6, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_7

    :goto_8
    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v3, v5, v6, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    move-object/from16 v8, v24

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v8, v25

    goto :goto_a

    :cond_d
    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v6, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v11, v30

    invoke-static {v6, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    move-object/from16 v3, v31

    goto :goto_c

    :cond_f
    :goto_b
    move-object/from16 v3, v32

    goto :goto_d

    :goto_c
    invoke-static {v5, v6, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v6, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x5bcabcfc

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ls51/d;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls51/o;

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v7, v5

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_10

    goto :goto_f

    :cond_10
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v5, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v7, v6, v0, v0}, Ls51/n;->b(Ls51/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :cond_11
    const/4 v8, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_12
    move-object/from16 v29, v1

    move/from16 v28, v10

    move-object v1, v12

    move v2, v13

    move/from16 v33, v19

    const/4 v0, 0x0

    const/4 v8, 0x1

    const v3, 0x66d8d520

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p1 .. p1}, Ls51/d;->b()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_17

    const v3, 0x66d9e3c5

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ls51/d;->c()Lhy0/e;

    move-result-object v3

    if-nez v3, :cond_13

    const v3, 0x66da4884

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move/from16 v30, v2

    move/from16 v19, v33

    goto :goto_11

    :cond_13
    const v4, 0x66da4885

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x2

    int-to-float v5, v4

    move/from16 v19, v33

    mul-float v5, v5, v19

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v6, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move/from16 v26, v4

    invoke-virtual {v3}, Lhy0/e;->b()Lhy0/g;

    move-result-object v4

    invoke-virtual {v3}, Lhy0/e;->a()Lhy0/f;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v6, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v11

    const/4 v14, 0x0

    const/16 v15, 0xd1

    move v9, v5

    move-object v5, v3

    const/4 v3, 0x0

    move-object v13, v6

    move-object v6, v7

    const/4 v7, 0x0

    move/from16 v17, v8

    move/from16 v34, v10

    move-wide/from16 v35, v11

    move v12, v9

    move-wide/from16 v8, v35

    const-wide/16 v10, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v30, v2

    move/from16 v2, v16

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v13

    invoke-static {v1, v2, v6, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_11
    invoke-virtual/range {p1 .. p1}, Ls51/d;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v10, v0

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v11, v10, 0x1

    if-ltz v10, :cond_15

    move-object v12, v3

    check-cast v12, Ls51/h;

    if-lez v10, :cond_14

    invoke-virtual/range {p1 .. p1}, Ls51/d;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v10, v3, :cond_14

    const v3, -0x7decd615

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x2

    int-to-float v3, v13

    mul-float v14, v3, v19

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v15, 0x6

    invoke-virtual {v3, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v4

    const/16 v9, 0x180

    const/16 v10, 0x9

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v8, v6

    move/from16 v6, v28

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    invoke-static {v1, v14, v6, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    goto :goto_13

    :cond_14
    const/4 v13, 0x2

    const/4 v15, 0x6

    const v3, -0x7de9b2bf

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_13
    sget v3, Lcom/whoop/navigation/e;->d:I

    shl-int/lit8 v3, v3, 0x3

    or-int v7, v3, v20

    const/4 v8, 0x1

    const/4 v3, 0x0

    move-object/from16 v5, p2

    move-object v4, v12

    invoke-static/range {v3 .. v8}, Ls51/g;->g(Landroidx/compose/ui/Modifier;Ls51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v10, v11

    goto :goto_12

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    const/4 v13, 0x2

    const/4 v15, 0x6

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_17
    move/from16 v30, v2

    move/from16 v19, v33

    const/4 v13, 0x2

    const/4 v15, 0x6

    const v2, 0x66e6f480    # 5.4532726E23f

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p1 .. p1}, Ls51/d;->a()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_18

    const v2, 0x66e76ecd

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_15
    move/from16 v13, v30

    const/4 v8, 0x1

    goto :goto_16

    :cond_18
    const v2, 0x66e76ece

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v13

    move/from16 v4, v19

    invoke-static {v2, v4, v1, v6}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v6, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object v13, v6

    move-wide v5, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v25, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    invoke-static {v1, v13, v6, v8}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    move-object/from16 v1, v29

    goto :goto_17

    :cond_19
    move-object v6, v13

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v3

    :goto_17
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Ls51/b;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ls51/c;->b(Landroidx/compose/ui/Modifier;Ls51/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
