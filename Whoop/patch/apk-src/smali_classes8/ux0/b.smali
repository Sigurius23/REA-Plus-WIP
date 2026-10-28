.class public abstract Lux0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u001a1\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavigateBack",
        "Lkotlin/Function1;",
        "",
        "onShowSheet",
        "d",
        "(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "path",
        "debug-tools_release"
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
.method public static synthetic a(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lux0/b;->g(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lux0/b;->i(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lux0/b;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v9, p1

    const-string v0, "onNavigateBack"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowSheet"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v0, -0x7a9e2e45

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    move/from16 v33, v0

    and-int/lit8 v0, v33, 0x13

    const/16 v14, 0x12

    const/4 v15, 0x0

    if-eq v0, v14, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v15

    :goto_3
    and-int/lit8 v2, v33, 0x1

    invoke-virtual {v6, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_5

    const-string v0, "/test/share/path"

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lp1/c1;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v11, v6, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v17, v2

    iget-wide v1, v6, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-eqz v4, :cond_6

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v6, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    :cond_7
    invoke-static {v1, v6, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v6, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v7, "SHARE DEBUG"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/w;->a()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v37

    const v51, 0xfffa

    const/16 v52, 0x0

    const/16 v36, 0x0

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

    const/16 v50, 0x0

    move-object/from16 v34, v1

    invoke-direct/range {v34 .. v52}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v7, v7, 0x3

    shl-int/lit8 v12, v33, 0x9

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v7, v12

    move-object v12, v8

    const/16 v8, 0x35

    move-object/from16 v23, v0

    const/4 v0, 0x0

    move-object/from16 v24, v2

    const/4 v2, 0x0

    move-object/from16 v25, v4

    const/4 v4, 0x0

    move-object/from16 v26, v5

    const/4 v5, 0x0

    move-object v10, v12

    move-object/from16 v16, v15

    move-object/from16 v53, v17

    move-object/from16 v9, v24

    move-object/from16 v12, v25

    const/high16 v15, 0x3f800000    # 1.0f

    move-object/from16 v17, v14

    move-object/from16 v14, v26

    invoke-static/range {v0 .. v8}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v11, v6, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    move-object/from16 v1, v17

    goto :goto_8

    :cond_b
    :goto_7
    invoke-static {v2, v6, v2, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v6, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v23 .. v23}, Lux0/b;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lg1/i8;->a:Lg1/i8;

    sget v2, Lx81/d;->b:I

    move-object/from16 v4, v16

    invoke-virtual {v4, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v4, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v4, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v9

    const v5, 0x3f19999a    # 0.6f

    invoke-static {v4, v6, v2, v5}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v16

    const-wide/16 v25, 0x0

    const v28, 0x1fff96

    move-object v5, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    move-wide/from16 v21, v16

    const/16 v17, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v27, v23

    const-wide/16 v23, 0x0

    move-object/from16 v17, v6

    move-object v6, v4

    move-object v4, v5

    move-object/from16 v5, v27

    move-object/from16 v27, v17

    move-wide/from16 v17, v7

    move/from16 v8, v19

    const/16 v7, 0x12

    move-wide/from16 v19, v9

    const/16 v9, 0x20

    const/4 v10, 0x2

    invoke-static/range {v11 .. v28}, Lg1/i8;->g(JJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v28

    move-object/from16 v11, v27

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v13, v53

    if-ne v12, v13, :cond_c

    new-instance v12, Lq12/c;

    invoke-direct {v12, v7, v5}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lkotlin/jvm/functions/Function1;

    sget-object v7, Lux0/a;->a:Lux0/a;

    invoke-virtual {v7}, Lux0/a;->c()Lc93/m;

    move-result-object v17

    const/16 v31, 0x0

    const v32, 0x7ffb8

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

    const v30, 0x1801b0

    move-object/from16 v29, v11

    move-object v11, v0

    move-object v0, v13

    move-object v13, v1

    invoke-static/range {v11 .. v32}, Lg1/j4;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    and-int/lit8 v1, v33, 0x70

    if-ne v1, v9, :cond_d

    const/4 v15, 0x1

    goto :goto_9

    :cond_d
    const/4 v15, 0x0

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v15, :cond_f

    if-ne v1, v0, :cond_e

    goto :goto_a

    :cond_e
    move-object/from16 v9, p1

    goto :goto_b

    :cond_f
    :goto_a
    new-instance v1, Lpj2/g;

    const/4 v0, 0x7

    move-object/from16 v9, p1

    invoke-direct {v1, v9, v5, v0}, Lpj2/g;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v1, Lc93/a;

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v6, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->n0()J

    move-result-wide v4

    const/16 v20, 0x0

    const/16 v21, 0xe

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v19, v11

    move-wide v11, v4

    invoke-static/range {v11 .. v21}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v17

    move-object/from16 v6, v19

    invoke-virtual {v7}, Lux0/a;->d()Lkotlin/jvm/functions/Function3;

    move-result-object v19

    const v21, 0x30000030

    const/16 v22, 0x17c

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v12, v0

    move-object v11, v1

    move-object/from16 v20, v6

    invoke-static/range {v11 .. v22}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_10
    const/4 v10, 0x2

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lea2/g0;

    move/from16 v2, p3

    invoke-direct {v1, v3, v9, v2, v10}, Lea2/g0;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final f(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lux0/b;->f(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lux0/b;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lux0/b;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
