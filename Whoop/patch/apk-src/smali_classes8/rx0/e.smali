.class public abstract Lrx0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrx0/c;",
        "renderResult",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavigateBack",
        "e",
        "(Lrx0/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrx0/e;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrx0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrx0/e;->g(Lrx0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lrx0/e;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lrx0/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrx0/e;->i(Lrx0/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lrx0/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrx0/c;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "renderResult"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x374a81a4

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v11, 0x0

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    move v5, v11

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_13

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_7

    new-instance v3, Lri2/a;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Lri2/a;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lc93/a;

    move-object v5, v3

    goto :goto_6

    :cond_8
    move-object v5, v4

    :goto_6
    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->o()J

    move-result-wide v9

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v9, v10, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v2, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v2, v7

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v7, v8, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v7, v8, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v8, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v7, "JSON Playground"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v2

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v7, v7, 0x3

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v7

    move-object v7, v10

    const/16 v10, 0x35

    move-object v14, v3

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v29, v9

    move v9, v0

    move-object v0, v14

    move-object/from16 v14, v29

    move-object/from16 v29, v17

    move-object/from16 v17, v13

    move-object/from16 v13, v19

    move/from16 v19, v18

    move-object/from16 v18, v29

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v28, v5

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v8, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v5, v8, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v8, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, v1, Lrx0/c$a;

    if-eqz v0, :cond_f

    const v0, 0x560ef845

    move-object/from16 v2, v18

    move/from16 v3, v19

    invoke-static {v8, v0, v2, v8, v3}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v2

    const/16 v26, 0x0

    const v27, 0x3fffa

    move/from16 v16, v4

    move-wide v4, v2

    const-string v2, "No content to render"

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v0, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x6

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v0, 0x1

    goto/16 :goto_a

    :cond_f
    move v0, v4

    move-object/from16 v2, v18

    move/from16 v3, v19

    instance-of v4, v1, Lrx0/c$b;

    if-eqz v4, :cond_10

    const v4, 0x560f1007

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    move-object v4, v1

    check-cast v4, Lrx0/c$b;

    invoke-virtual {v4}, Lrx0/c$b;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b()J

    move-result-wide v2

    const/16 v26, 0x0

    const v27, 0x3fffa

    move-wide/from16 v29, v2

    move-object v2, v4

    move-wide/from16 v4, v29

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    instance-of v2, v1, Lrx0/c$c;

    if-eqz v2, :cond_12

    const v2, 0x6bd60473

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, v17

    if-ne v2, v3, :cond_11

    sget-object v2, Lm91/t;->a:Lm91/t;

    invoke-virtual {v2}, Lm91/t;->b()Lm91/p;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lm91/p;

    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v3

    invoke-virtual {v3, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    new-instance v3, Lr12/a;

    const/16 v4, 0xe

    invoke-direct {v3, v1, v4}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    const v4, 0x334ea9e0

    invoke-static {v4, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v2, v3, v8, v4}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :goto_a
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_b

    :cond_12
    const v1, 0x560ef18b

    invoke-static {v1, v8, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_13
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v4

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Lqk2/i;

    const/16 v5, 0x9

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lrx0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    check-cast p0, Lrx0/c$c;

    invoke-virtual {p0}, Lrx0/c$c;->a()Lm91/o;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_1

    new-instance p0, Lrm2/d;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lrm2/d;-><init>(I)V

    invoke-virtual {v5, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v4, p0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget p0, Lm91/o;->c:I

    or-int/lit16 v6, p0, 0xc00

    const/4 v7, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lrx0/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrx0/e;->e(Lrx0/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
