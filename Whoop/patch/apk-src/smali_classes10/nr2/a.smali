.class public abstract Lnr2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a=\u0010\u0008\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkc2/i;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onCloseClicked",
        "Lkotlin/Function1;",
        "",
        "showShareSheet",
        "e",
        "(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lnr2/a;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkc2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lnr2/a;->h(Lkotlin/jvm/functions/Function1;Lkc2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lnr2/a;->i(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnr2/a;->g(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkc2/i;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "showShareSheet"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x92197bd

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_5

    :cond_6
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v13, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_6

    :cond_8
    move v7, v13

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1f

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_9

    new-instance v5, Lno2/a;

    const/16 v6, 0xb

    invoke-direct {v5, v6}, Lno2/a;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lc93/a;

    goto :goto_7

    :cond_a
    move-object v5, v6

    :goto_7
    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-nez v14, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_d

    :cond_c
    invoke-static {v8, v10, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v10, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v14, Llq2/t$a;

    sget-object v11, Llq2/f;->PRIMARY:Llq2/f;

    invoke-direct {v14, v11}, Llq2/t$a;-><init>(Llq2/f;)V

    invoke-static {v8, v14}, Llq2/m;->h(Landroidx/compose/ui/Modifier;Llq2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v11, 0x0

    invoke-static {v8, v10, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    move-object v8, v5

    new-instance v5, Lkd1/o$a;

    sget v11, Lyp2/a;->f:I

    invoke-direct {v5, v11}, Lkd1/o$a;-><init>(I)V

    move-object v11, v9

    sget v9, Lkd1/o$a;->c:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    move-object/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v32, v11

    move-object/from16 v31, v21

    move-object/from16 v33, v22

    move-object v11, v8

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v6, v13

    const/16 v13, 0x61b0

    move v7, v14

    const/16 v14, 0x68

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 p1, v2

    move-object v4, v12

    move-object/from16 v7, v19

    move-object/from16 v3, v21

    move-object/from16 v2, v22

    move-object/from16 v12, v27

    const/16 v1, 0x20

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    new-instance v17, Lj0/j;

    invoke-direct/range {v17 .. v17}, Lj0/j;-><init>()V

    and-int/lit8 v5, v0, 0x70

    if-ne v5, v1, :cond_e

    const/4 v13, 0x1

    goto :goto_9

    :cond_e
    const/4 v13, 0x0

    :goto_9
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v13, :cond_f

    move-object/from16 v13, v33

    if-ne v1, v13, :cond_10

    goto :goto_a

    :cond_f
    move-object/from16 v13, v33

    :goto_a
    new-instance v1, Llq2/k;

    const/16 v5, 0xf

    invoke-direct {v1, v2, v5}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v21, v1

    check-cast v21, Lc93/a;

    const/16 v22, 0x1c

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, p1

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, v16

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v7, v6

    mul-float/2addr v5, v7

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x4

    int-to-float v8, v5

    mul-float v9, v7, v8

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lb2/e;->y:Lb2/m;

    sget-object v12, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v12, v1, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11}, Lx81/d;->d()Lgz0/o0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/a;->e()I

    move-result v12

    move-object/from16 p1, v1

    const/4 v1, 0x6

    invoke-static {v12, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v12

    sget v5, Lgy0/f;->K:I

    const/4 v1, 0x0

    invoke-static {v5, v10, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v33, v13

    sget v13, Lx81/d;->b:I

    invoke-virtual {v11, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v16

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v6

    move-object v6, v5

    move-object v5, v12

    const/4 v12, 0x0

    move/from16 v35, v7

    move/from16 v23, v8

    move/from16 v36, v9

    move-wide/from16 v8, v16

    move/from16 v37, v19

    const/16 v25, 0x4

    move-object/from16 v7, p1

    move-object/from16 p1, v18

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    if-nez p0, :cond_11

    const v0, 0xea7a467

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/4 v9, 0x1

    move-object/from16 v0, p0

    move-object/from16 v32, v2

    goto/16 :goto_11

    :cond_11
    const v1, 0xea7a468

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v7, v36

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->d:Ll0/g;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v5, v6, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v31

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    :cond_13
    move-object/from16 v11, v32

    invoke-static {v6, v10, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v10, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v20, v1, v35

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v14

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v3, 0xa

    int-to-float v3, v3

    mul-float v8, v3, v23

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o;->u()I

    move-result v1

    const/4 v4, 0x6

    invoke-static {v1, v10, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move-object/from16 v1, p1

    invoke-virtual {v1, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lkc2/i;->a()Lkc2/a;

    move-result-object v4

    if-eqz v4, :cond_15

    invoke-virtual {v4}, Lkc2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :cond_16
    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v1, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->N()Lb91/a;

    move-result-object v6

    const/4 v9, 0x1

    int-to-float v11, v9

    mul-float v20, v11, v35

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v31, v16

    new-instance v12, Lw3/k;

    const/4 v14, 0x3

    invoke-direct {v12, v14}, Lw3/k;-><init>(I)V

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v29, v15, 0x12

    const v30, 0x2fdf8

    move/from16 v18, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v23, v25

    move-object/from16 v25, v6

    move-object v6, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v34, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x30

    move-object/from16 v39, v33

    move/from16 v33, v3

    move/from16 v3, v32

    move-object/from16 v32, v2

    move v2, v5

    move-object v5, v4

    move/from16 v4, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lkc2/i;->a()Lkc2/a;

    move-result-object v5

    if-eqz v5, :cond_17

    invoke-virtual {v5}, Lkc2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_18

    :cond_17
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    :cond_18
    invoke-static {v5, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v1, v10, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const-wide/high16 v11, 0x401a000000000000L    # 6.5

    double-to-float v2, v11

    mul-float v20, v2, v35

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v2, Lw3/k;

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    const/16 v28, 0x30

    const v30, 0x2fdf8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    sget v2, Lyp2/c;->D:I

    const/4 v11, 0x0

    invoke-static {v2, v10, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v10, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v1

    mul-float v20, v33, v35

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {}, Lgb1/b0;->E0()Li2/t;

    move-result-object v4

    invoke-static {v3, v4}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit16 v3, v0, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_19

    const/4 v13, 0x1

    goto :goto_c

    :cond_19
    const/4 v13, 0x0

    :goto_c
    and-int/lit8 v3, v0, 0xe

    const/4 v4, 0x4

    if-eq v3, v4, :cond_1c

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_1a

    move-object/from16 v0, p0

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_d

    :cond_1a
    move-object/from16 v0, p0

    :cond_1b
    const/4 v3, 0x0

    goto :goto_e

    :cond_1c
    move-object/from16 v0, p0

    :goto_d
    const/4 v3, 0x1

    :goto_e
    or-int/2addr v3, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1e

    move-object/from16 v13, v39

    if-ne v4, v13, :cond_1d

    goto :goto_f

    :cond_1d
    move-object/from16 v8, p2

    goto :goto_10

    :cond_1e
    :goto_f
    new-instance v4, Lmi2/o;

    const/16 v3, 0xa

    move-object/from16 v8, p2

    invoke-direct {v4, v3, v8, v0}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v13, v4

    check-cast v13, Lc93/a;

    const/16 v15, 0x30

    const/16 v16, 0x68

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v14, v10

    move-wide v9, v1

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    const/4 v9, 0x1

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-object/from16 v2, v32

    goto :goto_12

    :cond_1f
    move-object v0, v1

    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v6

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v0, Lm31/h;

    const/16 v6, 0x17

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lkc2/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lkc2/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lnr2/a;->e(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
