.class public abstract Lmf2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkf2/d$e;",
        "sleepScheduleListViewState",
        "Lkotlin/Function1;",
        "Lnf2/a;",
        "Ll83/a0;",
        "sleepScheduleListEventListener",
        "Lpf2/c;",
        "wakeTimeSchedulingViewEventListener",
        "Lwe2/a;",
        "sleepScheduleAnalyticEventListener",
        "h",
        "(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "sleep-coach_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmf2/b;->i(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmf2/b;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmf2/b;->j(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lmf2/b;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmf2/b;->k(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmf2/b;->m(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmf2/b;->o(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkf2/d$e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    sget-object v0, Lb2/e;->N:Lb2/k;

    sget-object v6, Lb2/e;->w:Lb2/m;

    const-string v7, "sleepScheduleListViewState"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sleepScheduleListEventListener"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "wakeTimeSchedulingViewEventListener"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sleepScheduleAnalyticEventListener"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v7, -0x260b0bc0

    invoke-virtual {v12, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_1
    move v7, v5

    :goto_1
    and-int/lit8 v9, v5, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    and-int/lit16 v9, v7, 0x493

    const/16 v13, 0x492

    const/4 v15, 0x0

    if-eq v9, v13, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v15

    :goto_5
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v12, v13, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    const/16 v18, 0x1

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x4

    int-to-float v5, v5

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v13, v5, v10

    move-object/from16 v34, v6

    const/4 v6, 0x3

    move/from16 v21, v10

    int-to-float v10, v6

    mul-float v10, v10, v21

    invoke-static {v14, v10, v13}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v6, 0x0

    move/from16 v22, v10

    const/4 v10, 0x3

    invoke-static {v13, v6, v10}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lkf2/d$e;->a()Lkf2/b;

    move-result-object v10

    invoke-virtual {v10}, Lkf2/b;->i()Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    invoke-static {v13, v10}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move/from16 v24, v5

    move/from16 v13, v18

    const/4 v6, 0x0

    invoke-static {v6, v12, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    const/16 v6, 0xe

    invoke-static {v10, v5, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v6, v0, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object v13, v11

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v26, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v12, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    move-object/from16 v13, v26

    invoke-static {v10, v12, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v12, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lkf2/d$e;->a()Lkf2/b;

    move-result-object v1

    invoke-virtual {v1}, Lkf2/b;->k()Z

    move-result v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    const/4 v15, 0x0

    if-eqz v5, :cond_1c

    const v5, -0x551b6bd1

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const v5, 0x3f51b874

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lkf2/b;->a()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkf2/a;

    new-instance v9, Lc41/w4;

    invoke-direct {v9}, Lc41/w4;-><init>()V

    const/4 v13, 0x1

    int-to-float v10, v13

    mul-float v10, v10, v21

    invoke-static {v14, v15, v10, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8}, Lkf2/a;->e()Ljava/util/List;

    move-result-object v38

    invoke-virtual {v8}, Lkf2/a;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v39

    new-instance v42, Lhy0/h1;

    invoke-virtual {v8}, Lkf2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v41

    move-object/from16 v40, v42

    invoke-virtual {v8}, Lkf2/a;->b()Ly71/g;

    move-result-object v42

    invoke-virtual {v8}, Lkf2/a;->a()Ly81/f;

    move-result-object v43

    invoke-virtual {v8}, Lkf2/a;->d()Ly81/f;

    move-result-object v45

    const v63, 0x3fffe8

    const/16 v64, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    invoke-direct/range {v40 .. v64}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lkf2/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v43

    invoke-virtual {v8}, Lkf2/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v44

    and-int/lit16 v11, v7, 0x1c00

    const/16 v13, 0x800

    if-ne v11, v13, :cond_f

    const/4 v13, 0x1

    goto :goto_9

    :cond_f
    const/4 v13, 0x0

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_10

    if-ne v15, v6, :cond_11

    :cond_10
    new-instance v15, Ll80/k;

    const/16 v13, 0x11

    invoke-direct {v15, v4, v13}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v45, v15

    check-cast v45, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v13, v7, 0x380

    const/16 v15, 0x100

    if-ne v13, v15, :cond_12

    const/4 v13, 0x1

    goto :goto_a

    :cond_12
    const/4 v13, 0x0

    :goto_a
    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    or-int v13, v13, v19

    const/16 v15, 0x800

    if-ne v11, v15, :cond_13

    const/4 v15, 0x1

    goto :goto_b

    :cond_13
    const/4 v15, 0x0

    :goto_b
    or-int/2addr v13, v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_14

    if-ne v15, v6, :cond_15

    :cond_14
    new-instance v15, Lmf2/a;

    const/4 v13, 0x0

    invoke-direct {v15, v3, v8, v4, v13}, Lmf2/a;-><init>(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v46, v15

    check-cast v46, Lc93/a;

    and-int/lit8 v13, v7, 0x70

    const/16 v15, 0x20

    if-ne v13, v15, :cond_16

    const/4 v13, 0x1

    goto :goto_c

    :cond_16
    const/4 v13, 0x0

    :goto_c
    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v13, v13, v16

    const/16 v15, 0x800

    if-ne v11, v15, :cond_17

    const/4 v11, 0x1

    goto :goto_d

    :cond_17
    const/4 v11, 0x0

    :goto_d
    or-int/2addr v11, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_18

    if-ne v13, v6, :cond_19

    :cond_18
    new-instance v13, Lmf2/a;

    const/4 v11, 0x1

    invoke-direct {v13, v2, v8, v4, v11}, Lmf2/a;-><init>(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v47, v13

    check-cast v47, Lc93/a;

    new-instance v36, Lc41/a5;

    const/16 v37, 0x0

    move-object/from16 v42, v40

    const/16 v40, 0x0

    const/16 v41, 0x1

    const/16 v48, 0x9

    const/16 v49, 0x0

    invoke-direct/range {v36 .. v49}, Lc41/a5;-><init>(Ly81/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZZLhy0/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_1a

    new-instance v8, Lm01/c;

    const/16 v11, 0x19

    invoke-direct {v8, v11}, Lm01/c;-><init>(I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v11, v8

    check-cast v11, Lkotlin/jvm/functions/Function1;

    sget v8, Lc41/a5;->l:I

    const/16 v35, 0x3

    shl-int/lit8 v8, v8, 0x3

    or-int/lit16 v8, v8, 0x186

    sget v13, Lc41/w4;->a:I

    shl-int/lit8 v13, v13, 0x9

    or-int/2addr v13, v8

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v10, v36

    const/16 v15, 0x100

    move/from16 v36, v21

    invoke-virtual/range {v8 .. v13}, Lc41/w4;->b(Landroidx/compose/ui/Modifier;Lc41/a5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v15, 0x0

    goto/16 :goto_8

    :cond_1b
    move/from16 v36, v21

    const/4 v13, 0x0

    const/16 v15, 0x100

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v5, 0x2

    int-to-float v8, v5

    move/from16 v9, v24

    invoke-static {v8, v9, v14, v12, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_e

    :cond_1c
    move/from16 v36, v21

    move/from16 v9, v24

    const/4 v5, 0x2

    const/4 v13, 0x0

    const/16 v15, 0x100

    const v8, -0x54fd0d7a

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v1}, Lkf2/b;->j()Z

    move-result v8

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    if-eqz v8, :cond_21

    const v8, -0x54fbb193

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    move/from16 v24, v9

    sget-object v9, Lny0/v;->TextLarge:Lny0/v;

    sget v8, Lqe2/g;->a0:I

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    double-to-float v5, v10

    mul-float v5, v5, v36

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-static {v14, v11, v5, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static {v5, v11, v10}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit16 v10, v7, 0x380

    if-ne v10, v15, :cond_1d

    const/4 v10, 0x1

    goto :goto_f

    :cond_1d
    move v10, v13

    :goto_f
    and-int/lit16 v7, v7, 0x1c00

    const/16 v15, 0x800

    if-ne v7, v15, :cond_1e

    const/4 v7, 0x1

    goto :goto_10

    :cond_1e
    move v7, v13

    :goto_10
    or-int/2addr v7, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_1f

    if-ne v10, v6, :cond_20

    :cond_1f
    new-instance v10, Ldc0/c;

    const/4 v7, 0x5

    invoke-direct {v10, v3, v7, v4}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v10, Lc93/a;

    const/4 v7, 0x1

    const/16 v18, 0x36

    const/16 v19, 0x78

    const/4 v11, 0x0

    move-object/from16 v30, v12

    move/from16 v20, v13

    const-wide/16 v12, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 p4, v1

    move v1, v7

    move-object/from16 v16, v10

    move/from16 v2, v20

    move-object/from16 v7, v21

    move-object/from16 v17, v30

    move-object v10, v8

    move-object v8, v5

    move/from16 v5, v22

    invoke-static/range {v8 .. v19}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_21
    move-object/from16 p4, v1

    move/from16 v24, v9

    move v2, v13

    move-object v7, v14

    move/from16 v5, v22

    const/4 v1, 0x1

    const v8, -0x54f39b7a

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p4 .. p4}, Lkf2/b;->g()Z

    move-result v8

    if-eqz v8, :cond_28

    const v8, -0x54f20bde

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    int-to-float v8, v1

    mul-float v8, v8, v36

    const/4 v11, 0x0

    invoke-static {v7, v11, v8, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x3

    const/4 v11, 0x0

    invoke-static {v8, v11, v10}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v9, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_22

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_22
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_23

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    :cond_23
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x6

    int-to-float v10, v8

    mul-float v10, v10, v24

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p4 .. p4}, Lkf2/b;->d()Ly81/f;

    move-result-object v15

    move-object/from16 v16, v9

    invoke-virtual {v15, v12, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v15, Lt0/j;->a:Lt0/i;

    invoke-static {v10, v8, v9, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->E:Lb2/m;

    invoke-static {v9, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_25

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_25
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v16

    invoke-static {v12, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_26

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    :cond_26
    invoke-static {v2, v12, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    mul-float v1, v1, v24

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p4 .. p4}, Lkf2/b;->b()Ly71/g;

    move-result-object v1

    invoke-virtual {v1}, Ly71/g;->b()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v12, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget-object v1, Ly81/f;->BRAND_BLACK:Ly81/f;

    invoke-virtual {v1, v12, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object v13, v12

    move-wide v11, v1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, v24

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v12, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p4 .. p4}, Lkf2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v12, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    invoke-virtual/range {p4 .. p4}, Lkf2/b;->d()Ly81/f;

    move-result-object v1

    const/4 v13, 0x0

    invoke-virtual {v1, v12, v13}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    new-instance v1, Lw3/k;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lw3/k;-><init>(I)V

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

    const v33, 0x2fdf8

    move-object/from16 v30, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    move-object/from16 v20, v1

    move-object v9, v7

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_28
    move v13, v2

    const v1, -0x54dd575a

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p4 .. p4}, Lkf2/b;->h()Z

    move-result v1

    if-eqz v1, :cond_29

    const v1, -0x54dbe71b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float v1, v1, v36

    invoke-static {v7, v5, v1}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual/range {p4 .. p4}, Lkf2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v12, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    invoke-virtual {v0, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v10

    new-instance v0, Lw3/k;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lw3/k;-><init>(I)V

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v32, v1, 0x12

    const v33, 0x2fdf8

    move-object/from16 v30, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v20, v0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_15
    const/4 v13, 0x1

    goto :goto_16

    :cond_29
    const/4 v13, 0x0

    const v0, -0x54d51b5a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_15

    :goto_16
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lkf2/d$e;->a()Lkf2/b;

    move-result-object v0

    invoke-virtual {v0}, Lkf2/b;->i()Z

    move-result v0

    if-eqz v0, :cond_2f

    const v0, 0x7a2b04d7

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2a

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v0

    :cond_2a
    move-object v14, v0

    check-cast v14, Lj0/i;

    new-instance v0, Li3/i;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Li3/i;-><init>(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_2b

    new-instance v1, Lm22/m;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lm22/m;-><init>(I)V

    invoke-virtual {v12, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    move-object/from16 v18, v1

    check-cast v18, Lc93/a;

    const/16 v19, 0x8

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object/from16 v17, v0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v1, v34

    const/4 v13, 0x0

    invoke-static {v1, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_2c

    invoke-virtual {v12, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_2c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_17
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v12, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_2d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2e

    :cond_2d
    invoke-static {v2, v12, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_2f
    const/4 v2, 0x0

    const/4 v13, 0x1

    const v0, 0x7a32217c

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_30
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_19
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_31

    new-instance v0, Llf0/p1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Llf0/p1;-><init>(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lwe2/a$d;

    const-string v0, "Expand"

    invoke-direct {p1, v0}, Lwe2/a$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    new-instance v0, Lpf2/c$d;

    invoke-virtual {p1}, Lkf2/a;->i()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lpf2/c$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lwe2/a$d;

    const-string p1, "Edit"

    invoke-direct {p0, p1}, Lwe2/a$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    new-instance v0, Lnf2/a$b;

    invoke-virtual {p1}, Lkf2/a;->i()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnf2/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lwe2/a$d;

    const-string p1, "Delete"

    invoke-direct {p0, p1}, Lwe2/a$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lpf2/c$c;->a:Lpf2/c$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lwe2/a$b;->a:Lwe2/a$b;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lmf2/b;->h(Lkf2/d$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
