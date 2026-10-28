.class public abstract Luz0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Luz0/n;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Luz0/n;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Luz0/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luz0/e;->c(Luz0/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Luz0/n;Landroidx/compose/runtime/Composer;I)V
    .locals 44

    move-object/from16 v0, p0

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x2ffe7e84

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v10, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v10

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v3, v10, :cond_2

    move v3, v12

    goto :goto_2

    :cond_2
    move v3, v11

    :goto_2
    and-int/2addr v2, v12

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Luz0/n;->g()Lkd1/o;

    move-result-object v3

    invoke-virtual {v0}, Luz0/n;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Luz0/n;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Luz0/n;->f()Li2/t;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Luz0/c;->b(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3, v4, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v12

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v13

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v5, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v7, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    int-to-float v5, v10

    invoke-static {v5, v3, v4, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Lb2/e;->L:Lb2/l;

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v13, v10, v7, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v7, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    :cond_4
    invoke-static {v11, v7, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Luz0/n;->a()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    const v5, -0x7a6c9e34

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    new-instance v5, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v0}, Luz0/n;->a()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v5, v13}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Luz0/n;->c()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_6

    new-instance v14, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v14, v13}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_4

    :cond_6
    const/4 v14, 0x0

    :goto_4
    sget-object v13, Lsz0/h1;->TEXT:Lsz0/h1;

    move-object/from16 v19, v10

    new-instance v10, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v0}, Luz0/n;->b()Ljava/lang/String;

    move-result-object v20

    if-nez v20, :cond_7

    const-string v20, ""

    :cond_7
    move-object/from16 v2, v20

    invoke-direct {v10, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v22

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->s()Lb91/a;

    move-result-object v2

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Lb91/d;->C()Lb91/a;

    move-result-object v25

    move/from16 v26, v8

    move-object v8, v13

    move-wide/from16 v42, v20

    move-object/from16 v21, v7

    move-object/from16 v20, v12

    move-object v7, v14

    move-wide/from16 v12, v42

    move-wide/from16 v42, v22

    move-object/from16 v22, v15

    move-wide/from16 v14, v42

    const/16 v23, 0x0

    move-object/from16 v17, v24

    const/16 v27, 0x1

    const v24, 0xc14b

    move/from16 v28, v3

    const/4 v3, 0x0

    move-object/from16 v29, v4

    const/4 v4, 0x0

    move-object/from16 v30, v6

    const/4 v6, 0x0

    move-object/from16 v31, v9

    const/4 v9, 0x0

    move-object/from16 v32, v11

    const/4 v11, 0x0

    move-object/from16 v33, v19

    const/16 v19, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v22

    const/high16 v22, 0x30000

    move-object/from16 v18, v2

    move-object/from16 v16, v25

    move/from16 v2, v28

    move-object/from16 v41, v29

    move-object/from16 v38, v32

    move-object/from16 v36, v33

    move-object/from16 v37, v34

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-static/range {v3 .. v24}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v21

    int-to-float v0, v0

    move-object/from16 v3, v41

    invoke-static {v0, v2, v3, v7, v1}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_5
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_8
    move v2, v3

    move-object v3, v4

    move-object/from16 v30, v6

    move-object/from16 v31, v9

    move-object/from16 v36, v10

    move-object/from16 v38, v11

    move-object/from16 v37, v12

    move-object/from16 v35, v15

    const/4 v1, 0x0

    const v0, -0x7a61f8de

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    float-to-double v4, v0

    const-wide/16 v8, 0x0

    cmpl-double v4, v4, v8

    if-lez v4, :cond_9

    goto :goto_7

    :cond_9
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v6, v0, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    move-object/from16 v9, v35

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v9, v31

    goto :goto_9

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v7, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v36

    invoke-static {v7, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    move-object/from16 v0, v37

    goto :goto_b

    :cond_c
    :goto_a
    move-object/from16 v0, v38

    goto :goto_c

    :goto_b
    invoke-static {v6, v7, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Luz0/n;->j()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v4, v30

    const/4 v6, 0x6

    invoke-virtual {v4, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Luz0/n;->h()Luz0/b;

    move-result-object v8

    invoke-static {v8, v7, v1}, Luz0/a;->a(Luz0/b;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v1, 0x5

    invoke-direct {v15, v1}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    move v13, v5

    move/from16 v40, v6

    move-object/from16 v21, v7

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v17, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v39, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x30

    move-object v1, v3

    move-object v3, v0

    move-object/from16 v0, v30

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    const/high16 v3, 0x3e800000    # 0.25f

    mul-float/2addr v3, v2

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Luz0/n;->i()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x6

    invoke-virtual {v0, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v5

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v0, 0x5

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    move-object/from16 v21, v7

    const-wide/16 v7, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    const/4 v13, 0x1

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_d
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lsl0/j2;

    const/16 v2, 0x11

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Luz0/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Luz0/e;->b(Luz0/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
