.class public abstract Lud2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a9\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00102\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a+\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a+\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00152\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ltd2/h;",
        "viewModel",
        "Lld2/a;",
        "analytics",
        "Lkotlin/Function1;",
        "Ltd2/f$f;",
        "Ll83/a0;",
        "onNavEvent",
        "F",
        "(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ltd2/i;",
        "viewState",
        "Ltd2/f;",
        "onEvent",
        "G",
        "(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ltd2/i$b;",
        "A",
        "(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "q",
        "(Ltd2/i$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ltd2/i$a;",
        "v",
        "(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "shepherd_release"
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
.method private static final A(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 61
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/i$b;",
            "Lld2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x7f92d71

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x0

    if-eq v7, v8, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move v7, v10

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    if-eqz v5, :cond_8

    const/4 v5, 0x0

    goto :goto_6

    :cond_8
    move-object v5, v6

    :goto_6
    and-int/lit8 v6, v0, 0xe

    shr-int/lit8 v7, v0, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    invoke-static {v1, v3, v11, v6}, Lud2/e;->q(Ltd2/i$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v6, v7}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v13, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v9, v11, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v31, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->f()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v34

    sget v8, Lkd2/a;->d:I

    invoke-static {v11, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v35

    const v48, 0xfff2

    const/16 v49, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v31 .. v49}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x380

    const/16 v15, 0x100

    if-ne v0, v15, :cond_c

    const/4 v8, 0x1

    goto :goto_8

    :cond_c
    const/4 v8, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v18, v14

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_d

    if-ne v9, v14, :cond_e

    :cond_d
    new-instance v9, Lsg2/i;

    const/16 v8, 0x1d

    invoke-direct {v9, v3, v8}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v8, v9

    check-cast v8, Lc93/a;

    sget v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v19, v14

    const/4 v14, 0x3

    shl-int/2addr v9, v14

    move-object/from16 v20, v13

    const/16 v13, 0x35

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v23, v12

    move v12, v9

    const/4 v9, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-object v14, v6

    move-object/from16 v53, v20

    move-object/from16 v51, v21

    move-object/from16 v54, v22

    move-object/from16 v52, v23

    move-object/from16 v55, v24

    move-object/from16 v6, v31

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x2

    int-to-float v6, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v6, v5

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->i()Ltd2/b;

    move-result-object v7

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v11, v8}, Lud2/b;->c(Ltd2/b;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v7, 0x0

    move v10, v6

    const/4 v9, 0x2

    invoke-static {v14, v10, v7, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v12, v11, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v13, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->c1()J

    move-result-wide v20

    invoke-virtual {v13, v11, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v29, v16, 0x12

    const v30, 0x2fff8

    move/from16 v22, v9

    move/from16 v16, v10

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move/from16 v23, v5

    move-object v5, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v28, v14

    move/from16 v26, v15

    const-wide/16 v14, 0x0

    move/from16 v31, v16

    const/16 v16, 0x0

    const/16 v32, 0x2

    const/16 v17, 0x0

    move-object/from16 v33, v18

    move-object/from16 v34, v19

    const-wide/16 v18, 0x0

    move/from16 v35, v7

    move-wide/from16 v59, v20

    move/from16 v21, v8

    move-wide/from16 v7, v59

    const/16 v20, 0x0

    move/from16 v36, v21

    const/16 v21, 0x0

    move/from16 v37, v22

    const/16 v22, 0x0

    move/from16 v38, v23

    const/16 v23, 0x0

    move-object/from16 v39, v24

    const/16 v24, 0x0

    move/from16 v40, v26

    const/16 v26, 0x0

    move-object/from16 v41, v28

    const/16 v28, 0x30

    move-object/from16 p1, v1

    move-object/from16 p3, v2

    move/from16 v1, v31

    move/from16 v3, v32

    move-object/from16 v56, v34

    move/from16 v4, v36

    move-object/from16 v2, v41

    move/from16 v31, v0

    const/4 v0, 0x3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    int-to-float v0, v0

    mul-float v0, v0, v38

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v11, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v5, 0x0

    invoke-static {v2, v1, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v11, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v8, v37

    move-object/from16 v7, v39

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    move-wide v7, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v58, v37

    move-object/from16 v57, v39

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v11, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->g()Ltd2/a;

    move-result-object v5

    if-nez v5, :cond_f

    const v5, 0x263bf625

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    move-object/from16 v13, p2

    move/from16 v9, v31

    move-object/from16 v7, v51

    move-object/from16 v8, v56

    const/16 v15, 0x100

    goto :goto_c

    :cond_f
    const/4 v6, 0x0

    const v7, 0x263bf626

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    move-object/from16 v7, v51

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    move/from16 v9, v31

    const/16 v15, 0x100

    if-ne v9, v15, :cond_10

    const/4 v10, 0x1

    goto :goto_9

    :cond_10
    move v10, v6

    :goto_9
    or-int/2addr v8, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_12

    move-object/from16 v8, v56

    if-ne v10, v8, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v13, p2

    goto :goto_b

    :cond_12
    move-object/from16 v8, v56

    :goto_a
    new-instance v10, Lsg2/t;

    const/16 v12, 0x19

    move-object/from16 v13, p2

    invoke-direct {v10, v12, v7, v13}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v10, v11, v6, v6}, Lud2/a;->d(Ltd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_c
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v21, v7

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v6, v0

    const-wide/16 v17, 0x0

    cmpl-double v5, v6, v17

    if-lez v5, :cond_13

    goto :goto_d

    :cond_13
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v7, 0x0

    invoke-static {v5, v1, v7, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v5, v52

    move-object/from16 v7, v53

    const/4 v10, 0x0

    invoke-static {v5, v7, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move v10, v1

    iget-wide v0, v11, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_14

    move-object/from16 v7, p3

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_e
    move-object/from16 v7, v33

    goto :goto_f

    :cond_14
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_e

    :goto_f
    invoke-static {v11, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v54

    invoke-static {v11, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    move-object/from16 v1, v55

    goto :goto_11

    :cond_16
    :goto_10
    move-object/from16 v0, p1

    goto :goto_12

    :goto_11
    invoke-static {v0, v11, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v11, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->e()Ltd2/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v11, v1}, Lud2/c;->f(Ltd2/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v2, v10, v11, v2, v0}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v23, v0, v38

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v26, v0, v38

    const/16 v27, 0x2

    const/16 v24, 0x0

    move/from16 v25, v23

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v50, v6

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Ltd2/i$b;->b()Ltd2/e;

    move-result-object v0

    invoke-virtual {v0}, Ltd2/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v11, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, v57

    move/from16 v2, v58

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v2

    if-ne v9, v15, :cond_17

    move/from16 v9, v50

    goto :goto_13

    :cond_17
    move v9, v1

    :goto_13
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_18

    if-ne v0, v8, :cond_19

    :cond_18
    new-instance v0, Lsg2/i;

    const/16 v1, 0x1b

    invoke-direct {v0, v13, v1}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v0, Lc93/a;

    const/16 v15, 0x36

    const/16 v16, 0x68

    const/4 v8, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v13, v0

    move-wide v9, v2

    move-object/from16 v14, v27

    move/from16 v0, v50

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v2, v21

    goto :goto_14

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v6

    :goto_14
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lt01/e;

    const/16 v6, 0x10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltd2/f$c;->a:Ltd2/f$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lld2/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "navAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lld2/a;->a()V

    :cond_0
    new-instance p0, Ltd2/f$h;

    invoke-direct {p0, p2}, Ltd2/f$h;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltd2/f$d;->a:Ltd2/f$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lud2/e;->A(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final F(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/h;",
            "Lld2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x731bfe09

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    const/16 v11, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v11

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v9, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v9, :cond_8

    move v7, v13

    goto :goto_6

    :cond_8
    move v7, v12

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    const/4 v14, 0x0

    if-eqz v2, :cond_9

    move-object v3, v14

    :cond_9
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_a

    new-instance v5, Lu71/c;

    const/16 v6, 0xf

    invoke-direct {v5, v6}, Lu71/c;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v15, v5

    goto :goto_7

    :cond_b
    move-object v15, v6

    :goto_7
    invoke-virtual {v1}, Ltd2/h;->getViewState()Lec3/l;

    move-result-object v5

    sget-object v6, Ltd2/i$a;->h:Ltd2/i$a$a;

    invoke-virtual {v6}, Ltd2/i$a$a;->d()Ltd2/i$a;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    if-ne v7, v2, :cond_d

    :cond_c
    new-instance v7, Lud2/e$b;

    invoke-direct {v7, v1, v14}, Lud2/e$b;-><init>(Ltd2/h;Lq83/d;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lud2/e;->I(Lp1/t2;)Ltd2/i;

    move-result-object v5

    and-int/lit16 v6, v0, 0x380

    if-ne v6, v11, :cond_e

    move v12, v13

    :cond_e
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_f

    if-ne v7, v2, :cond_10

    :cond_f
    new-instance v7, Lsg2/t;

    const/16 v2, 0x18

    invoke-direct {v7, v2, v15, v1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v9, v0, 0x70

    const/4 v10, 0x0

    move-object v6, v3

    invoke-static/range {v5 .. v10}, Lud2/e;->G(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v6

    move-object v3, v15

    goto :goto_8

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Lt01/e;

    const/16 v6, 0x11

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final G(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/i;",
            "Lld2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v2, "viewState"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onEvent"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p3

    check-cast v5, Lp1/q;

    const v2, 0x53156971

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, p4, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, p4

    goto :goto_2

    :cond_2
    move v2, p4

    :goto_2
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_5

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v2, v7

    :cond_5
    :goto_4
    and-int/lit16 v7, p4, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v5, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v2, v7

    :cond_7
    and-int/lit16 v7, v2, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_6

    :cond_8
    move v7, v9

    :goto_6
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v5, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v4, :cond_9

    const/4 v4, 0x0

    goto :goto_7

    :cond_9
    move-object v4, p1

    :goto_7
    instance-of v6, p0, Ltd2/i$a;

    if-eqz v6, :cond_a

    const v6, -0x1c9f0d66

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    move-object v6, p0

    check-cast v6, Ltd2/i$a;

    and-int/lit8 v7, v2, 0xe

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v7

    invoke-static {v6, p2, v5, v2}, Lud2/e;->v(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object v3, v4

    goto :goto_8

    :cond_a
    instance-of v6, p0, Ltd2/i$b;

    if-eqz v6, :cond_b

    const v6, -0x1c9f019d

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    move-object v6, p0

    check-cast v6, Ltd2/i$b;

    and-int/lit16 v2, v2, 0x3fe

    const/4 v7, 0x0

    move-object v3, v6

    move v6, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, p2

    invoke-static/range {v2 .. v7}, Lud2/e;->A(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    :goto_8
    move-object v2, v3

    goto :goto_9

    :cond_b
    const v0, -0x1c9f16a9

    invoke-static {v0, v5, v9}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, p1

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lt01/e;

    const/16 v6, 0x12

    move-object v1, p0

    move-object v3, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final H(Ltd2/f$f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Ltd2/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ltd2/i;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltd2/i;

    return-object p0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;Ltd2/h;Ltd2/f;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ltd2/f$f;

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p0, p2, Ltd2/f$j;

    if-eqz p0, :cond_1

    check-cast p2, Ltd2/f$j;

    invoke-virtual {p1, p2}, Ltd2/h;->p(Ltd2/f$j;)Lbc3/k1;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final K(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lud2/e;->F(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lud2/e;->G(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lud2/e;->r(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lud2/e;->s(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lud2/e;->x(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lud2/e;->y(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lud2/e;->L(Ltd2/i;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ltd2/h;Ltd2/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lud2/e;->J(Lkotlin/jvm/functions/Function1;Ltd2/h;Ltd2/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ltd2/i$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lud2/e;->z(Ltd2/i$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lud2/e;->K(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lud2/e;->B(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lud2/e;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lud2/e;->u(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ltd2/i$b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lud2/e;->t(Lkotlin/jvm/functions/Function1;Ltd2/i$b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lud2/e;->E(Ltd2/i$b;Lld2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lud2/e;->w(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ltd2/f$f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lud2/e;->H(Ltd2/f$f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lld2/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lud2/e;->C(Lld2/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Ltd2/i$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/i$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, -0x34e639e4    # -1.0077724E7f

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Ltd2/i$b;->c()Lxd2/b;

    move-result-object p2

    if-eqz p2, :cond_5

    move v2, v3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance p2, Loq1/c;

    const/16 v1, 0x17

    invoke-direct {p2, v1, p0, p1}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v1, -0x65f28803

    invoke-static {v1, v5, p2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const/16 v6, 0x6c00

    const/4 v7, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, ""

    invoke-static/range {v0 .. v7}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lso2/f;

    const/16 v1, 0x13

    invoke-direct {v0, p0, p1, p3, v1}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final r(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, p4, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    and-int/2addr v3, v6

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Ltd2/i$b;->c()Lxd2/b;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Ltd2/i$b;->e()Ltd2/c;

    move-result-object v2

    invoke-virtual {v2}, Ltd2/c;->a()Ltd2/d;

    move-result-object v2

    if-eqz v2, :cond_7

    const v2, 0x456092e6

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ltd2/i$b;->c()Lxd2/b;

    move-result-object v2

    invoke-virtual {v2}, Lxd2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v2}, Lxd2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v2}, Lxd2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lxd2/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_3

    if-ne v3, v4, :cond_4

    :cond_3
    new-instance v3, Lsg2/i;

    const/16 v2, 0x1c

    invoke-direct {v3, v1, v2}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v30, v3

    check-cast v30, Lc93/a;

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    if-ne v3, v4, :cond_6

    :cond_5
    new-instance v3, Ls51/f;

    const/16 v2, 0x1b

    invoke-direct {v3, v1, v0, v2}, Ls51/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v32, v3

    check-cast v32, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    shl-int/lit8 v2, v0, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v37, v1, v0

    const/16 v39, 0x0

    const v40, 0xebfedf1

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x180

    move-object/from16 v36, v5

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    move-object v0, v5

    const v1, 0x456a69c5

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ltd2/f$b;->a:Ltd2/f$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ltd2/i$b;)Ll83/a0;
    .locals 1

    new-instance v0, Ltd2/f$g;

    invoke-virtual {p1}, Ltd2/i$b;->e()Ltd2/c;

    move-result-object p1

    invoke-virtual {p1}, Ltd2/c;->a()Ltd2/d;

    move-result-object p1

    invoke-virtual {p1}, Ltd2/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ltd2/f$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ltd2/i$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lud2/e;->q(Ltd2/i$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/i$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, -0x5f8dc2b8

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/16 v19, 0x1

    const/4 v7, 0x0

    if-eq v4, v6, :cond_5

    move/from16 v4, v19

    goto :goto_4

    :cond_5
    move v4, v7

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v15, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-virtual {v0}, Ltd2/i$a;->n()Lsz0/p0;

    move-result-object v4

    instance-of v4, v4, Lsz0/p0$h;

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_9

    const v4, -0x94fb7d1

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ltd2/i$a;->n()Lsz0/p0;

    move-result-object v4

    invoke-virtual {v4}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_6

    goto :goto_5

    :cond_6
    move/from16 v19, v7

    :goto_5
    or-int v3, v4, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    if-ne v4, v6, :cond_8

    :cond_7
    new-instance v4, Lud2/d;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lud2/d;-><init>(Ltd2/i$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v12, v4

    check-cast v12, Lc93/a;

    new-instance v3, Lsz0/p0$h;

    const-wide/16 v10, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    move-object v8, v3

    invoke-direct/range {v8 .. v14}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Ltd2/i$a;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lsz0/p0$h;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v16, v5, v6

    const/16 v17, 0x0

    const/16 v18, 0xffc

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v2, v19

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object v4, v1

    goto/16 :goto_b

    :cond_9
    move v2, v7

    const v4, -0x94a5f18

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    move v4, v3

    invoke-virtual {v0}, Ltd2/i$a;->n()Lsz0/p0;

    move-result-object v3

    move v7, v4

    invoke-virtual {v0}, Ltd2/i$a;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Ltd2/i$a;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v7, v7, 0x70

    if-ne v7, v5, :cond_a

    move/from16 v10, v19

    goto :goto_6

    :cond_a
    move v10, v2

    :goto_6
    or-int/2addr v9, v10

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_b

    if-ne v10, v6, :cond_c

    :cond_b
    new-instance v10, Lud2/d;

    const/4 v9, 0x1

    invoke-direct {v10, v0, v1, v9}, Lud2/d;-><init>(Ltd2/i$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lc93/a;

    move-object v9, v10

    invoke-virtual {v0}, Ltd2/i$a;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-ne v7, v5, :cond_d

    move/from16 v12, v19

    goto :goto_7

    :cond_d
    move v12, v2

    :goto_7
    or-int/2addr v11, v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_e

    if-ne v12, v6, :cond_f

    :cond_e
    new-instance v12, Lud2/d;

    const/4 v11, 0x2

    invoke-direct {v12, v0, v1, v11}, Lud2/d;-><init>(Ltd2/i$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v11, v12

    check-cast v11, Lc93/a;

    const/high16 v12, 0x30000

    sget v13, Lsz0/p0;->d:I

    or-int/2addr v12, v13

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v13, 0x3

    or-int/2addr v12, v14

    shl-int/lit8 v14, v13, 0x9

    or-int/2addr v12, v14

    shl-int/lit8 v13, v13, 0x15

    or-int v16, v12, v13

    const/16 v17, 0x0

    const/16 v18, 0xe44

    move v12, v5

    const/4 v5, 0x0

    move-object v13, v6

    move-object v6, v8

    const/4 v8, 0x1

    move v14, v7

    move-object v7, v9

    const/4 v9, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v1, v20

    move/from16 v2, v22

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0}, Ltd2/i$a;->h()Ltd2/f;

    move-result-object v3

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v2, v1, :cond_10

    goto :goto_8

    :cond_10
    const/16 v19, 0x0

    :goto_8
    or-int v1, v4, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    move-object/from16 v13, v21

    if-ne v2, v13, :cond_11

    goto :goto_9

    :cond_11
    move-object/from16 v4, p1

    goto :goto_a

    :cond_12
    :goto_9
    new-instance v2, Lud2/e$a;

    const/4 v1, 0x0

    move-object/from16 v4, p1

    invoke-direct {v2, v0, v4, v1}, Lud2/e$a;-><init>(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v2, Lc93/m;

    invoke-static {v15, v2, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v15, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    move-object v4, v1

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_14

    new-instance v2, Lso2/f;

    const/16 v3, 0x14

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final w(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ltd2/i$a;->h()Ltd2/f;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ltd2/i$a;->i()Ltd2/f;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ltd2/i$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ltd2/i$a;->k()Ltd2/f;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ltd2/i$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lud2/e;->v(Ltd2/i$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
