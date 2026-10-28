.class public abstract Lpj2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lnj2/h;",
        "viewState",
        "",
        "selectedSpeed",
        "selectedCycle",
        "Lkotlin/Function1;",
        "Llj2/e;",
        "Ll83/a0;",
        "onEvent",
        "d",
        "(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "stress_release"
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

    invoke-static {p0}, Lpj2/r;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p0, p1}, Lpj2/r;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lpj2/r;->g(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 62
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x5f68b66a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_5

    :cond_8
    const/16 v12, 0x80

    :goto_5
    or-int/2addr v0, v12

    :goto_6
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_a

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    const/16 v12, 0x800

    goto :goto_7

    :cond_9
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v0, v12

    :cond_a
    and-int/lit16 v12, v0, 0x493

    const/16 v14, 0x492

    const/4 v2, 0x0

    if-eq v12, v14, :cond_b

    const/4 v12, 0x1

    goto :goto_8

    :cond_b
    move v12, v2

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v9, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_27

    const-string v12, ""

    if-eqz v6, :cond_c

    move-object v7, v12

    :cond_c
    if-eqz v8, :cond_d

    move-object v11, v12

    :cond_d
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p2, v11

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-eqz v3, :cond_e

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-nez v13, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    invoke-static {v10, v9, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v33, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v34

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-static {v10}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v36

    sget v12, Lgy0/f;->K:I

    invoke-static {v9, v12}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v37

    const v50, 0xfff2

    const/16 v51, 0x0

    const/16 v35, 0x0

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

    const/16 v48, 0x0

    const/16 v49, 0x0

    invoke-direct/range {v33 .. v51}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v12, v0, 0x1c00

    const/16 v13, 0x800

    if-ne v12, v13, :cond_11

    const/16 v20, 0x1

    goto :goto_a

    :cond_11
    const/16 v20, 0x0

    :goto_a
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v22, v6

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v20, :cond_12

    if-ne v13, v6, :cond_13

    :cond_12
    new-instance v13, Lp62/h;

    const/16 v5, 0xa

    invoke-direct {v13, v4, v5}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v13, Lc93/a;

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v5, v5, 0x3

    move-object/from16 v20, v14

    const/16 v14, 0x35

    move-object/from16 v23, v6

    const/4 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move-object/from16 p1, v33

    move-object/from16 v33, v7

    move-object/from16 v7, p1

    move-object/from16 v52, p2

    move/from16 v34, v0

    move-object/from16 p1, v1

    move/from16 v54, v12

    move-object/from16 v4, v20

    move-object/from16 v55, v23

    move-object/from16 v0, v24

    move-object/from16 v53, v25

    move-object/from16 v35, v26

    const/high16 v1, 0x3f800000    # 1.0f

    move-object v12, v9

    move-object v9, v13

    move v13, v5

    move-object/from16 v5, v22

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x2

    int-to-float v8, v7

    const/16 v10, 0x8

    int-to-float v12, v10

    mul-float v13, v8, v12

    const/4 v8, 0x0

    invoke-static {v6, v13, v8, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v4, v15, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v9, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    move-object/from16 v4, v35

    goto :goto_d

    :cond_16
    move-object/from16 v4, v35

    :goto_c
    move-object/from16 v14, p1

    goto :goto_e

    :goto_d
    invoke-static {v7, v9, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v9, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v6, v1

    const-wide/16 v10, 0x0

    cmpl-double v6, v6, v10

    if-lez v6, :cond_17

    const/4 v6, 0x1

    goto :goto_f

    :cond_17
    const/4 v6, 0x0

    :goto_f
    if-nez v6, :cond_18

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_18
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v15, 0x1

    invoke-direct {v6, v1, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v7, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v7, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_19

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_1a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    :cond_1a
    invoke-static {v8, v9, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v9, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->d()Lkd1/o;

    move-result-object v6

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v7, v14

    const/16 v14, 0x61b0

    move/from16 v17, v15

    const/16 v15, 0x68

    move-object v9, v7

    const/4 v7, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    sget-object v10, Ly2/j;->b:Ly2/b1;

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v57, v13

    move/from16 v1, v17

    move-object/from16 v56, v18

    move/from16 v35, v19

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v9, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget v8, Lx81/d;->b:I

    move-object/from16 v10, v53

    invoke-virtual {v10, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v10, v9, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v30, v13, 0x12

    const v31, 0x2fffa

    move v13, v7

    const/4 v7, 0x0

    move-object/from16 v28, v9

    move-object/from16 v25, v10

    move-wide/from16 v60, v11

    move v12, v8

    move-wide/from16 v8, v60

    const-wide/16 v10, 0x0

    move v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v53, v25

    const/16 v25, 0x0

    move/from16 v36, v27

    const/16 v27, 0x0

    move/from16 v37, v29

    const/16 v29, 0x0

    move/from16 v1, v36

    move/from16 v58, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6, v6, v0, v9}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v7, Lb2/e;->K:Lb2/l;

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v8, v10

    mul-float/2addr v8, v6

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/16 v11, 0x36

    invoke-static {v10, v7, v9, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_1c

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-nez v7, :cond_1e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    goto :goto_13

    :cond_1d
    :goto_12
    move-object/from16 v7, v56

    goto :goto_14

    :cond_1e
    :goto_13
    invoke-static {v10, v9, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v9, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, v53

    move/from16 v12, v58

    invoke-virtual {v11, v9, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v11, v9, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->s()Lb91/a;

    move-result-object v26

    const/16 v29, 0x0

    const v31, 0x2fffa

    move-object/from16 v56, v7

    const/4 v7, 0x0

    move v15, v6

    move-object v6, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v9

    move-wide/from16 v60, v13

    move v14, v8

    move-wide/from16 v8, v60

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move-object/from16 p4, v2

    move-object/from16 p2, v3

    move/from16 v3, v36

    move/from16 v2, v37

    move-object/from16 v59, v56

    move-object/from16 v36, v4

    move-object/from16 v37, v5

    move-object/from16 v4, v53

    move/from16 v5, v58

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v15, 0x1

    invoke-static {v9, v15, v0, v2, v9}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v4, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    move-wide v8, v7

    const/4 v7, 0x0

    const-wide/16 v15, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v2, 0x6

    int-to-float v2, v2

    invoke-static {v2, v3, v0, v9}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-wide/high16 v6, 0x4012000000000000L    # 4.5

    double-to-float v2, v6

    mul-float v2, v2, v35

    mul-float v6, v3, v35

    move/from16 v8, v57

    invoke-static {v0, v2, v8, v2, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v3, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1f

    move-object/from16 v10, p4

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v10, p2

    goto :goto_16

    :cond_1f
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v37

    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_20

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    :cond_20
    move-object/from16 v3, v36

    goto :goto_18

    :cond_21
    :goto_17
    move-object/from16 v10, v59

    goto :goto_19

    :goto_18
    invoke-static {v6, v9, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v9, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "disclaimerPrimaryButton"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v32, v7

    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lnj2/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v10

    move/from16 v0, v54

    const/16 v13, 0x800

    if-ne v0, v13, :cond_22

    const/4 v15, 0x1

    goto :goto_1a

    :cond_22
    move/from16 v15, v32

    :goto_1a
    and-int/lit8 v0, v34, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_23

    const/4 v0, 0x1

    goto :goto_1b

    :cond_23
    move/from16 v0, v32

    :goto_1b
    or-int/2addr v0, v15

    move/from16 v1, v34

    and-int/lit16 v1, v1, 0x380

    const/16 v2, 0x100

    if-ne v1, v2, :cond_24

    const/4 v2, 0x1

    goto :goto_1c

    :cond_24
    move/from16 v2, v32

    :goto_1c
    or-int/2addr v0, v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_26

    move-object/from16 v0, v55

    if-ne v1, v0, :cond_25

    goto :goto_1d

    :cond_25
    move-object/from16 v4, p3

    move-object/from16 v2, v33

    move-object/from16 v3, v52

    goto :goto_1e

    :cond_26
    :goto_1d
    new-instance v1, Ln0/j;

    const/16 v0, 0x12

    move-object/from16 v4, p3

    move-object/from16 v2, v33

    move-object/from16 v3, v52

    invoke-direct {v1, v4, v2, v3, v0}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v16, 0x36

    const/16 v17, 0x68

    move-object/from16 v28, v9

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v15, v28

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    const/4 v15, 0x1

    invoke-static {v9, v15, v15, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1f

    :cond_27
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v11

    :goto_1f
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_28

    new-instance v0, Lo72/a;

    const/16 v7, 0x8

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llj2/e$a;->a:Llj2/e$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Llj2/e$b;

    invoke-direct {v0, p1, p2}, Llj2/e$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lpj2/r;->d(Lnj2/h;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
