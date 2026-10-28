.class public abstract Lp62/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm62/g$c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lm62/j;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll62/a;",
        "onNavigationEvent",
        "Lh62/a;",
        "onAnalyticsEvent",
        "f",
        "(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "refer-a-friend_release"
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
.method public static synthetic a(Lm62/g$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp62/c;->g(Lm62/g$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp62/c;->k(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lm62/g$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp62/c;->i(Lkotlin/jvm/functions/Function1;Lm62/g$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp62/c;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lm62/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp62/c;->j(Lkotlin/jvm/functions/Function1;Lm62/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 62
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm62/g$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v5, p3

    move/from16 v9, p5

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onNavigationEvent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onAnalyticsEvent"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v3, -0x2f91944a    # -1.6000145E10f

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v7, v9, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v9, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :cond_5
    and-int/lit16 v7, v9, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v3, v7

    :cond_7
    and-int/lit16 v7, v3, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    if-eq v7, v10, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v11

    :goto_5
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v13, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_23

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v13, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v13, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v4, v13, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v14, v10

    invoke-virtual {v1}, Lm62/g$c;->d()Lkd1/o;

    move-result-object v10

    move-object v12, v14

    sget v14, Lkd1/o;->a:I

    move-object/from16 v18, v15

    const/4 v15, 0x3

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v8

    move-object/from16 v38, v18

    move-object/from16 v37, v19

    move-object/from16 v8, v21

    invoke-static/range {v10 .. v15}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v10

    const/16 v18, 0x6030

    const/16 v19, 0x68

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v32, v14

    sget-object v14, Ly2/j;->g:Ly2/b1;

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, v22

    move-object/from16 v17, v32

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x1

    invoke-static {v11, v13, v12}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v14

    const/16 v11, 0xe

    invoke-static {v10, v14, v11}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v10, 0x6

    int-to-float v11, v10

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v18, v11, v15

    const/16 v19, 0x7

    move v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    move/from16 v22, v10

    invoke-static {v7, v15, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v12, v37

    goto :goto_8

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v13, v12, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v38

    invoke-static {v13, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v8, v13, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v13, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x9

    int-to-float v2, v2

    mul-float v18, v2, v11

    const/16 v19, 0x7

    move-object v2, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v21

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v9, v14

    invoke-virtual {v1}, Lm62/g$c;->a()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v42

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14}, Lyb0/f;->a(Lx81/d;)I

    move-result v15

    move-object/from16 v16, v8

    sget v8, Lvu1/h;->e:I

    move-object/from16 v18, v10

    const/4 v10, 0x0

    invoke-static {v8, v13, v10}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v45

    new-instance v41, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v44

    new-instance v8, Lj21/d;

    const/16 v10, 0x1d

    invoke-direct {v8, v10, v1, v0}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v10, 0x1e59740

    invoke-static {v10, v13, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v51

    const v58, 0xfdf2

    const/16 v59, 0x0

    const/16 v43, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    invoke-direct/range {v41 .. v59}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v8, v3, 0x380

    const/16 v10, 0x100

    if-ne v8, v10, :cond_f

    const/4 v15, 0x1

    goto :goto_9

    :cond_f
    const/4 v15, 0x0

    :goto_9
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move/from16 v37, v8

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v15, :cond_10

    if-ne v10, v8, :cond_11

    :cond_10
    new-instance v10, Lnw0/n;

    const/16 v15, 0x1a

    invoke-direct {v10, v0, v15}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lc93/a;

    sget v15, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v38, v8

    const/4 v8, 0x3

    shl-int/2addr v15, v8

    or-int/lit8 v17, v15, 0x6

    move-object/from16 v15, v18

    const/16 v18, 0x34

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-object v0, v13

    move-object v13, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v0

    move/from16 v36, v3

    move v1, v11

    move-object/from16 v8, v19

    move-object/from16 v43, v21

    move-object/from16 v0, v22

    move-object/from16 v11, v41

    const/4 v3, 0x1

    const/16 v41, 0x100

    invoke-static/range {v10 .. v18}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v11, v10

    const-wide/16 v14, 0x0

    cmpl-double v11, v11, v14

    if-lez v11, :cond_12

    goto :goto_a

    :cond_12
    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v11, v10, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v12, 0x2

    int-to-float v14, v12

    mul-float/2addr v14, v1

    const/4 v15, 0x0

    invoke-static {v11, v14, v15, v12}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v13, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11, v14, v15, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v12, 0x30

    invoke-static {v7, v2, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v7, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_13

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v13, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_14
    invoke-static {v3, v13, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x7

    int-to-float v2, v2

    mul-float v18, v2, v1

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v61, v14

    move-object v14, v9

    move/from16 v9, v61

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v3, v14

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x1

    int-to-float v11, v12

    const/16 v12, 0x36

    invoke-static {v11, v1, v4, v13, v12}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v4

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_16

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v13, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-static {v11, v13, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v13, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v0, v10

    new-instance v10, Lkd1/o$a;

    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->c()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-direct {v10, v2}, Lkd1/o$a;-><init>(I)V

    sget v14, Lkd1/o$a;->c:I

    const/4 v15, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v10

    const/16 v18, 0x30

    const/16 v19, 0x7c

    const-string v11, ""

    move-object v14, v13

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v32

    invoke-static/range {v10 .. v19}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v17

    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->k()Ljava/lang/String;

    move-result-object v10

    sget v2, Lx81/d;->b:I

    move-object/from16 v4, v43

    invoke-virtual {v4, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v30

    invoke-virtual {v4, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    new-instance v7, Lw3/k;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lw3/k;-><init>(I)V

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v34, v11, 0x12

    const v35, 0x2fdfa

    const/4 v11, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v22, v7

    move-object/from16 v32, v13

    move-wide v12, v5

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->j()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v30

    invoke-virtual {v4, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    new-instance v7, Lw3/k;

    invoke-direct {v7, v8}, Lw3/k;-><init>(I)V

    move-object/from16 v22, v7

    move-wide v12, v5

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v32

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    move v5, v2

    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->h()Lm62/e;

    move-result-object v2

    if-nez v2, :cond_19

    const v2, -0x6ff07d7

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    move-object v14, v3

    move v12, v5

    move-object v6, v13

    move/from16 v0, v36

    move/from16 v11, v37

    move-object/from16 v60, v38

    const/4 v15, 0x3

    move v13, v10

    move-object v10, v4

    goto :goto_d

    :cond_19
    const/4 v10, 0x0

    const v6, -0x6ff07d6

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x3

    int-to-float v7, v6

    mul-float v18, v7, v1

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v3

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    shl-int/lit8 v7, v36, 0x3

    and-int/lit16 v7, v7, 0x380

    const/16 v40, 0x30

    or-int/lit8 v7, v7, 0x30

    move/from16 v8, v36

    and-int/lit16 v11, v8, 0x1c00

    or-int/2addr v7, v11

    const/4 v8, 0x0

    move v12, v5

    move v15, v6

    move-object v6, v13

    move/from16 v0, v36

    move/from16 v11, v37

    move-object/from16 v60, v38

    move-object/from16 v5, p3

    move v13, v10

    move-object v10, v4

    move-object/from16 v4, p1

    invoke-static/range {v2 .. v8}, Lq62/a;->c(Lm62/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->b()Lm62/c;

    move-result-object v2

    if-nez v2, :cond_1a

    const v1, -0x6fbce58

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    move-object v8, v14

    const/4 v1, 0x4

    goto :goto_e

    :cond_1a
    const v3, -0x6fbce57

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    int-to-float v3, v15

    mul-float v18, v3, v1

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v1, 0x4

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v8, v14

    const/16 v4, 0x30

    invoke-static {v2, v3, v6, v4, v13}, Lp62/d;->b(Lm62/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    :goto_e
    new-instance v14, Lny0/a0;

    invoke-virtual/range {p0 .. p0}, Lm62/g$c;->g()Lm62/f;

    move-result-object v2

    invoke-virtual {v2}, Lm62/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    invoke-virtual {v10, v6, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X0()J

    move-result-wide v3

    invoke-static {v2, v3, v4}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v18

    const/16 v25, 0x3f6

    const/16 v26, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v18, 0x0

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v19, v9

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x100

    if-ne v11, v3, :cond_1b

    const/4 v4, 0x1

    :goto_f
    move/from16 v39, v1

    move-object/from16 v1, p0

    goto :goto_10

    :cond_1b
    move v4, v13

    goto :goto_f

    :goto_10
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1d

    move-object/from16 v4, v60

    if-ne v5, v4, :cond_1c

    goto :goto_11

    :cond_1c
    move-object/from16 v15, p2

    goto :goto_12

    :cond_1d
    move-object/from16 v4, v60

    :goto_11
    new-instance v5, Lox0/b;

    const/16 v7, 0xb

    move-object/from16 v15, p2

    invoke-direct {v5, v7, v15, v1}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v5, Lc93/a;

    sget v7, Lny0/a0;->k:I

    const/16 v40, 0x30

    or-int/lit8 v7, v7, 0x30

    const/16 v16, 0x4

    move/from16 v17, v12

    const/4 v12, 0x0

    move v3, v13

    move-object v13, v5

    move-object v5, v10

    move-object v10, v14

    move-object v14, v6

    move v6, v11

    move-object v11, v2

    move-object v2, v15

    move v15, v7

    move/from16 v7, v17

    invoke-static/range {v10 .. v16}, Lny0/z;->h(Lny0/a0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    move/from16 v21, v15

    invoke-virtual {v1}, Lm62/g$c;->i()Lm62/f;

    move-result-object v10

    if-nez v10, :cond_1e

    const v4, -0x6eff628

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v12, 0x1

    goto/16 :goto_15

    :cond_1e
    const v11, -0x6eff627

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    new-instance v22, Lny0/a0;

    invoke-virtual {v10}, Lm62/f;->b()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    sget-object v11, Lg1/v0;->a:Ll0/l1;

    move-object v12, v10

    sget-wide v10, Li2/x;->m:J

    invoke-virtual {v5, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v5, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->X0()J

    move-result-wide v16

    invoke-virtual {v5, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v18

    move-object v5, v12

    move-object/from16 v32, v13

    move-wide v12, v14

    move-wide/from16 v14, v18

    const/16 v19, 0x6

    const/16 v20, 0x0

    move-object/from16 v18, v32

    invoke-static/range {v10 .. v20}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v24

    move-object/from16 v13, v18

    const/16 v33, 0x3fc

    const/16 v34, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v22 .. v34}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v22

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v18, 0x0

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v19, v9

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v7, 0x100

    if-ne v6, v7, :cond_1f

    const/4 v6, 0x1

    goto :goto_14

    :cond_1f
    move v6, v3

    :goto_14
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_20

    if-ne v7, v4, :cond_21

    :cond_20
    new-instance v7, Lox0/b;

    const/16 v4, 0xc

    invoke-direct {v7, v4, v2, v5}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v7, Lc93/a;

    const/16 v16, 0x4

    const/4 v12, 0x0

    move-object v14, v13

    move/from16 v15, v21

    move-object v13, v7

    invoke-static/range {v10 .. v16}, Lny0/z;->h(Lny0/a0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :goto_15
    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lm62/g$c;->e()Lm62/i;

    move-result-object v2

    if-nez v2, :cond_22

    const v0, 0x7a69b408

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_22
    const v4, 0x7a69b409

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v7, v0, 0x1ff0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move v10, v3

    move-object v6, v13

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lp62/g;->d(Lm62/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_23
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_17
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_24

    new-instance v0, Lot1/a;

    const/16 v6, 0xd

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final g(Lm62/g$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p3, v2

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lm62/g$c;->f()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const p0, -0x4342fd87

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p3, -0x4342fd86

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-static {p0, p1, p2, v3}, Lp62/e;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll62/a$a;->a:Ll62/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lm62/g$c;)Ll83/a0;
    .locals 1

    new-instance v0, Ll62/a$b;

    invoke-virtual {p1}, Lm62/g$c;->g()Lm62/f;

    move-result-object p1

    invoke-virtual {p1}, Lm62/f;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ll62/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lm62/f;)Ll83/a0;
    .locals 1

    new-instance v0, Ll62/a$b;

    invoke-virtual {p1}, Lm62/f;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ll62/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lp62/c;->f(Lm62/g$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
