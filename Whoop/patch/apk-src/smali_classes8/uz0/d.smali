.class public abstract Luz0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Luz0/m;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Luz0/m;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Luz0/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luz0/d;->c(Luz0/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Luz0/m;Landroidx/compose/runtime/Composer;I)V
    .locals 47

    move-object/from16 v0, p0

    sget-object v2, Lb2/e;->w:Lb2/m;

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v3, -0x792a35ab

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v11, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v3, 0x3

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v4, v11, :cond_2

    move v4, v12

    goto :goto_2

    :cond_2
    move v4, v13

    :goto_2
    and-int/2addr v3, v12

    invoke-virtual {v8, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual {v0}, Luz0/m;->g()Lkd1/o;

    move-result-object v4

    invoke-virtual {v0}, Luz0/m;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Luz0/m;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Luz0/m;->f()Li2/t;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Luz0/c;->b(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4, v5, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v12

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v7, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->W0()J

    move-result-wide v14

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v14, v15, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v8, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    int-to-float v6, v11

    invoke-static {v6, v4, v5, v8}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Lb2/e;->L:Lb2/l;

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v14, v11, v8, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v8, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v12, v8, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v8, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Luz0/m;->a()Ljava/lang/String;

    move-result-object v6

    const/16 v30, 0x0

    if-eqz v6, :cond_8

    const v6, 0x25fd259b

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v0}, Luz0/m;->a()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v6, v12}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/4 v12, 0x6

    invoke-virtual {v7, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v7, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->c1()J

    move-result-wide v22

    invoke-virtual {v0}, Luz0/m;->c()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_6

    new-instance v15, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v15, v12}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    :goto_4
    move-object v12, v9

    goto :goto_5

    :cond_6
    move-object/from16 v15, v30

    goto :goto_4

    :goto_5
    sget-object v9, Lsz0/h1;->TEXT:Lsz0/h1;

    move-object/from16 v24, v11

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v0}, Luz0/m;->b()Ljava/lang/String;

    move-result-object v25

    if-nez v25, :cond_7

    const-string v25, ""

    :cond_7
    move/from16 v26, v4

    move-object/from16 v4, v25

    invoke-direct {v11, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    const/4 v4, 0x6

    invoke-virtual {v7, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->s()Lb91/a;

    move-result-object v19

    invoke-virtual {v7, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v7, v8, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->C()Lb91/a;

    move-result-object v7

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v18, v25

    const/16 v28, 0x30

    const v25, 0xc14b

    move/from16 v29, v4

    const/4 v4, 0x0

    move-object/from16 v31, v5

    const/4 v5, 0x0

    move-object/from16 v17, v7

    const/16 v32, 0x1

    const/4 v7, 0x0

    move-object/from16 v33, v10

    const/4 v10, 0x0

    move-object/from16 v34, v12

    const/4 v12, 0x0

    move-object/from16 v35, v13

    move-wide/from16 v45, v20

    move-object/from16 v21, v14

    move-wide/from16 v13, v45

    const/16 v20, 0x0

    move-object/from16 v36, v21

    const/16 v21, 0x0

    move-wide/from16 v45, v22

    move-object/from16 v22, v8

    move-object v8, v15

    move-wide/from16 v15, v45

    const/16 v37, 0x0

    const/high16 v23, 0x30000

    move-object/from16 p1, v31

    move-object/from16 v31, v2

    move-object/from16 v2, p1

    move-object/from16 p1, v3

    move/from16 v1, v26

    move-object/from16 v39, v27

    move/from16 v3, v32

    move-object/from16 v42, v33

    move-object/from16 v41, v34

    move-object/from16 v40, v35

    move-object/from16 v38, v36

    const/4 v0, 0x4

    invoke-static/range {v4 .. v25}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v22

    int-to-float v0, v0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v8, v4}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_6
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_7

    :cond_8
    move-object/from16 v31, v2

    move-object/from16 p1, v3

    move v1, v4

    move-object v2, v5

    move-object/from16 v41, v9

    move-object/from16 v42, v10

    move-object/from16 v39, v11

    move-object/from16 v40, v13

    move-object/from16 v38, v14

    const/4 v3, 0x1

    const/4 v4, 0x0

    const v0, 0x2607caf1

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    float-to-double v4, v0

    const-wide/16 v6, 0x0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_9

    goto :goto_8

    :cond_9
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v0, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v0, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    move-object/from16 v7, p1

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v9, v38

    goto :goto_a

    :cond_a
    move-object/from16 v7, p1

    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v8, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v39

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    move-object/from16 v6, v40

    goto :goto_c

    :cond_c
    move-object/from16 v6, v40

    :goto_b
    move-object/from16 v12, v41

    goto :goto_d

    :goto_c
    invoke-static {v5, v8, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v8, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v4, v31

    const/4 v10, 0x0

    invoke-static {v4, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_d
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v10, v8, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v8, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0xc7786eb

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v0

    invoke-virtual {v0}, Luz0/o;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v13, 0x0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/16 v6, 0xa

    const/4 v7, 0x0

    if-eqz v5, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v31, v13, 0x1

    if-ltz v13, :cond_12

    check-cast v5, Luz0/p;

    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v9

    invoke-virtual {v9}, Luz0/o;->b()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    invoke-interface {v9, v10, v13}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Luz0/p;

    invoke-virtual {v9}, Luz0/p;->a()F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    move-result v9

    add-float/2addr v7, v9

    goto :goto_11

    :cond_11
    invoke-virtual {v5}, Luz0/p;->a()F

    move-result v6

    add-float/2addr v6, v7

    move-object v9, v4

    invoke-virtual {v5}, Luz0/p;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Luz0/p;->b()Luz0/k;

    move-result-object v5

    const/4 v10, 0x0

    invoke-static {v5, v8, v10}, Luz0/j;->a(Luz0/k;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v5, v8, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->F()Lb91/a;

    move-result-object v24

    add-float/2addr v7, v6

    const/high16 v5, 0x40000000    # 2.0f

    div-float v15, v7, v5

    sget-object v5, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v5}, Lp91/a$a;->b()Lp91/a;

    move-result-object v17

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v16, 0x0

    move-object v14, v2

    invoke-static/range {v14 .. v19}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lw3/k;

    const/4 v7, 0x3

    invoke-direct {v6, v7}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdf8

    move-object/from16 v22, v8

    move-object v7, v9

    const-wide/16 v8, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v16, v6

    move-wide/from16 v45, v11

    move-object v12, v7

    move-wide/from16 v6, v45

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v20, v17

    const-wide/16 v17, 0x0

    move/from16 v43, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v44, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    move/from16 v13, v31

    move-object/from16 v4, v44

    goto/16 :goto_f

    :cond_12
    invoke-static {}, Lwb3/f;->d0()V

    throw v30

    :cond_13
    move-object/from16 v44, v4

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float v4, v1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v2, v4, v8, v2, v0}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v12, 0x6

    int-to-float v0, v12

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x19

    invoke-static {v1}, Lt0/j;->b(I)Lt0/i;

    move-result-object v1

    invoke-static {v0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v9, v44

    invoke-static {v9, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_14

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_12
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    :cond_15
    invoke-static {v5, v8, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x2c9d5df8

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v0

    invoke-virtual {v0}, Luz0/o;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v13, 0x0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v5, v13, 0x1

    if-ltz v13, :cond_1c

    check-cast v1, Luz0/p;

    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v9

    invoke-virtual {v9}, Luz0/o;->b()Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    invoke-interface {v9, v10, v13}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Luz0/p;

    invoke-virtual {v11}, Luz0/p;->a()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_17
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move v15, v7

    :goto_15
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    add-float/2addr v15, v10

    goto :goto_15

    :cond_18
    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v9

    invoke-virtual {v9}, Luz0/o;->b()Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v9

    if-ge v13, v9, :cond_19

    invoke-virtual {v1}, Luz0/p;->a()F

    move-result v9

    const v10, 0x3ba3d70a    # 0.005f

    sub-float/2addr v9, v10

    goto :goto_16

    :cond_19
    invoke-virtual {v1}, Luz0/p;->a()F

    move-result v9

    :goto_16
    cmpg-float v10, v9, v7

    if-gez v10, :cond_1a

    move v9, v7

    :cond_1a
    const v10, 0x3b03126f    # 0.002f

    sub-float v17, v9, v10

    cmpl-float v9, v17, v7

    if-lez v9, :cond_1b

    const v9, 0x20f19099

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v20, 0x1a

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v1}, Luz0/p;->b()Luz0/k;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v8, v10}, Luz0/j;->a(Luz0/k;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    move-object/from16 v1, v42

    invoke-static {v9, v13, v14, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9, v8, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_1b
    move-object/from16 v1, v42

    const/4 v10, 0x0

    const v9, 0x20f89a79

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    :goto_17
    move-object/from16 v42, v1

    move v13, v5

    goto/16 :goto_13

    :cond_1c
    invoke-static {}, Lwb3/f;->d0()V

    throw v30

    :cond_1d
    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v8, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Luz0/m;->h()Luz0/o;

    move-result-object v0

    invoke-virtual {v0}, Luz0/o;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    invoke-virtual {v0, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v6

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v0, Lw3/k;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v29, 0x2fdf8

    move-object/from16 v22, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    move-object/from16 v16, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_1e
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1f

    new-instance v1, Lsl0/j2;

    const/16 v2, 0x10

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final c(Luz0/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Luz0/d;->b(Luz0/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
