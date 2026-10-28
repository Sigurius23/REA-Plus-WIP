.class public abstract Lqn0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ll0/u;",
        "Lf0/r1;",
        "scrollState",
        "Lcom/whoop/design/util/TextResource;",
        "toolbarTitle",
        "Lkotlin/Function1;",
        "Lln0/b;",
        "Ll83/a0;",
        "onNavigationEvent",
        "c",
        "(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "challenge-details_release"
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
.method public static synthetic a(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqn0/l;->e(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/l;->d(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll0/u;",
            "Lf0/r1;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v4, p5

    const-string v5, "<this>"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "scrollState"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "toolbarTitle"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    const v6, -0x4b7ba804

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_1
    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    and-int/lit16 v7, v4, 0x200

    if-nez v7, :cond_4

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_3

    :cond_4
    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_3
    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_6
    and-int/lit16 v7, v4, 0xc00

    if-nez v7, :cond_8

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_5

    :cond_7
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_8
    and-int/lit16 v7, v6, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    if-eq v7, v9, :cond_9

    const/4 v7, 0x1

    goto :goto_6

    :cond_9
    move v7, v10

    :goto_6
    and-int/lit8 v9, v6, 0x1

    invoke-virtual {v5, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Ll0/a1;->w:Ll0/a1;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->x:Lb2/m;

    invoke-interface {v1, v12, v13}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v5, v15, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v10, v5, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    iget-object v12, v2, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v12}, Lp1/h1;->x()I

    move-result v12

    int-to-float v12, v12

    const/high16 v18, 0x43480000    # 200.0f

    div-float v12, v12, v18

    invoke-static {v3, v12}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-static {v3, v10}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v10, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    move-object/from16 v18, v9

    move-object/from16 v19, v10

    invoke-virtual {v12}, Ly81/i;->n()J

    move-result-wide v9

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v9, v10, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x0

    invoke-static {v14, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    move-object v12, v10

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v5, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_e
    invoke-static {v9, v5, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v7, v18

    invoke-virtual {v3, v7, v13}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const-wide/high16 v7, 0x401a000000000000L    # 6.5

    double-to-float v3, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v22, v3, v7

    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v22

    new-instance v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static/range {v19 .. v19}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v7

    sget v8, Lgy0/f;->K:I

    invoke-static {v5, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const v20, 0xfff2

    const/16 v21, 0x0

    move-object v12, v5

    const/4 v5, 0x0

    move v9, v6

    move-object v6, v7

    move-object v7, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    const/16 v23, 0x800

    const/16 v17, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v4, p2

    move/from16 v2, v23

    move/from16 v1, v24

    invoke-direct/range {v3 .. v21}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v1, v1, 0x1c00

    if-ne v1, v2, :cond_10

    const/4 v10, 0x1

    goto :goto_9

    :cond_10
    const/4 v10, 0x0

    :goto_9
    invoke-virtual/range {v25 .. v25}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v10, :cond_12

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v12, v25

    goto :goto_b

    :cond_12
    :goto_a
    new-instance v1, Lqn0/j;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    move-object/from16 v12, v25

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    move-object v9, v1

    check-cast v9, Lc93/a;

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v13, v1, 0x3

    const/16 v14, 0x34

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v3

    move-object/from16 v6, v22

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_13
    move-object v12, v5

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lq51/a;

    const/16 v6, 0xc

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lq51/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lln0/b$a;->a:Lln0/b$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lqn0/l;->c(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
