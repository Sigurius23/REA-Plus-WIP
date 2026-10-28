.class public abstract Lzc1/n8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "g",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "secsUntilPhase2",
        "secsUntilPhase3",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/n8;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/n8;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/n8;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lzc1/n8;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n8;->n(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n8;->l(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/runtime/Composer;I)V
    .locals 69

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, -0x55e5de32

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v7, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x4

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_1

    invoke-static {v3, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v2

    :cond_1
    check-cast v2, Lp1/a1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/16 v6, 0x8

    if-ne v5, v4, :cond_2

    invoke-static {v6, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v5

    :cond_2
    check-cast v5, Lp1/a1;

    invoke-static {v2}, Lzc1/n8;->h(Lp1/a1;)I

    move-result v8

    invoke-static {v5}, Lzc1/n8;->j(Lp1/a1;)I

    move-result v9

    invoke-virtual {v7, v8}, Lp1/q;->e(I)Z

    move-result v8

    invoke-virtual {v7, v9}, Lp1/q;->e(I)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_3

    if-ne v9, v4, :cond_4

    :cond_3
    invoke-static {}, Ljava/time/Clock;->systemUTC()Ljava/time/Clock;

    move-result-object v8

    invoke-virtual {v8}, Ljava/time/Clock;->instant()Ljava/time/Instant;

    move-result-object v8

    new-instance v9, Lk41/d;

    new-instance v10, Lk41/a;

    invoke-static {v2}, Lzc1/n8;->h(Lp1/a1;)I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v8, v11, v12}, Ljava/time/Instant;->plusSeconds(J)Ljava/time/Instant;

    move-result-object v11

    new-instance v12, Lm91/o;

    new-instance v13, Lk81/e;

    invoke-static {v2}, Lzc1/n8;->h(Lp1/a1;)I

    move-result v14

    const-string v15, "Waiting for phase 2 threshold ("

    const-string v1, "s from load)"

    invoke-static {v14, v15, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    new-instance v14, Lm91/o;

    new-instance v17, Lhy0/h1;

    const-string v15, "Upcoming"

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const v40, 0x3ffffe

    const/16 v41, 0x0

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

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v17 .. v41}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lxz0/a;

    const-string v6, "Sep"

    const-string v3, "16"

    invoke-direct {v15, v6, v3}, Lxz0/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v18, Lxz0/b;

    sget-object v19, Lgz0/m0;->CROSS:Lgz0/m0;

    const/16 v23, 0xe

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v24}, Lxz0/b;-><init>(Lgz0/m0;Ljava/lang/Object;Lcom/whoop/whoopaction/domain/models/Action;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v17

    new-instance v17, Lxz0/f;

    const/16 v29, 0x6d1

    const/16 v30, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    const/16 v22, 0x0

    const/16 v28, 0x0

    const-string v21, "Today, 8:00 - 8:30 AM EST"

    const-string v23, "Dr. Drake Ramoray, MD, MPH"

    move-object/from16 v26, v15

    invoke-direct/range {v17 .. v30}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    const/4 v6, 0x2

    const/4 v15, 0x0

    invoke-direct {v14, v3, v15, v6, v15}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v23, 0x1f0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-string v14, ""

    const-string v15, "Phase 1"

    invoke-direct/range {v13 .. v24}, Lk81/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-direct {v12, v13, v6, v3, v6}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v11, v12}, Lk41/a;-><init>(Ljava/time/Instant;Lm91/o;)V

    new-instance v3, Lk41/a;

    invoke-static {v5}, Lzc1/n8;->j(Lp1/a1;)I

    move-result v6

    int-to-long v11, v6

    invoke-virtual {v8, v11, v12}, Ljava/time/Instant;->plusSeconds(J)Ljava/time/Instant;

    move-result-object v6

    new-instance v8, Lm91/o;

    new-instance v11, Lk81/e;

    invoke-static {v5}, Lzc1/n8;->j(Lp1/a1;)I

    move-result v12

    const-string v13, "Waiting for phase 3 threshold ("

    invoke-static {v12, v13, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v1, Lm91/o;

    new-instance v33, Lhy0/h1;

    const-string v12, "Available Now"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    const v56, 0x3ffffe

    const/16 v57, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

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

    invoke-direct/range {v33 .. v57}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lkd1/o$a;

    sget v13, Lgy0/a;->y:I

    invoke-direct {v12, v13}, Lkd1/o$a;-><init>(I)V

    new-instance v13, Lkd1/o$a;

    sget v15, Lvu1/c;->n:I

    invoke-direct {v13, v15}, Lkd1/o$a;-><init>(I)V

    new-instance v15, Lxz0/f;

    const/16 v27, 0x783

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const-string v19, "Video consultation"

    const-string v21, "Dr. April Kepner, MD"

    move-object/from16 v22, v12

    move-object/from16 v20, v13

    move-object/from16 v18, v33

    invoke-direct/range {v15 .. v28}, Lxz0/f;-><init>(Ljava/lang/String;Lxz0/b;Lhy0/h1;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lkd1/o;Lxz0/c;Lxz0/a;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-direct {v1, v15, v13, v12, v13}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v21, 0x1f0

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-string v12, ""

    const-string v13, "Phase 2"

    invoke-direct/range {v11 .. v22}, Lk81/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLk81/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    const/4 v12, 0x0

    invoke-direct {v8, v11, v12, v1, v12}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v6, v8}, Lk41/a;-><init>(Ljava/time/Instant;Lm91/o;)V

    filled-new-array {v10, v3}, [Lk41/a;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v9, v1}, Lk41/d;-><init>(Ljava/util/List;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object/from16 v22, v9

    check-cast v22, Lk41/d;

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x4

    int-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v10, v8, v7, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v7, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v15, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    :cond_6
    invoke-static {v10, v7, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v6, "Phase Thresholds (seconds from load)"

    const/4 v11, 0x6

    invoke-static {v6, v7, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, Lb2/e;->K:Lb2/l;

    move-object/from16 v17, v5

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v5, v15, v7, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    move-object/from16 v19, v12

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 v21, v2

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-eqz v2, :cond_8

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v7, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    :cond_9
    move-object/from16 v1, v19

    goto :goto_3

    :cond_a
    move-object/from16 v1, v19

    goto :goto_4

    :goto_3
    invoke-static {v11, v7, v11, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_4
    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    move-object/from16 v19, v1

    move-object/from16 v23, v2

    move-object/from16 v16, v3

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v24, 0x0

    cmpl-double v2, v2, v24

    const-string v26, "invalid weight; must be greater than zero"

    if-lez v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-static/range {v26 .. v26}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v27, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v1, v27

    if-lez v3, :cond_c

    move/from16 v3, v27

    :goto_6
    const/4 v1, 0x1

    goto :goto_7

    :cond_c
    move v3, v1

    goto :goto_6

    :goto_7
    invoke-direct {v2, v3, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v3, 0x30

    const/16 v20, 0x0

    move-object/from16 v29, v21

    const v21, 0x3fff8

    move/from16 v30, v1

    const-string v1, "Phase 1 \u2192 2"

    move-object/from16 v31, v5

    move/from16 v32, v6

    const-wide/16 v5, 0x0

    move-object/from16 v18, v7

    const/16 v33, 0x6

    const/4 v7, 0x0

    move-object/from16 v35, v8

    move/from16 v34, v9

    const-wide/16 v8, 0x0

    move-object/from16 v36, v10

    const/4 v10, 0x0

    move/from16 v38, v3

    move-object/from16 v37, v4

    move-wide v3, v11

    const-wide/16 v11, 0x0

    move-object/from16 v39, v13

    const/4 v13, 0x0

    move-object/from16 v40, v14

    const/4 v14, 0x0

    move-object/from16 v41, v15

    const/4 v15, 0x0

    move-object/from16 v42, v16

    const/16 v16, 0x0

    move-object/from16 v43, v17

    const/16 v17, 0x0

    move-object/from16 v44, v19

    const/16 v19, 0x6

    move-object/from16 v65, v23

    move-object/from16 v64, v31

    move/from16 v66, v32

    move-object/from16 v60, v35

    move-object/from16 v62, v36

    move-object/from16 v0, v37

    move-object/from16 v58, v39

    move-object/from16 v59, v40

    move-object/from16 v63, v41

    move-object/from16 v67, v42

    move-object/from16 v61, v44

    invoke-static/range {v1 .. v21}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-static/range {v29 .. v29}, Lzc1/n8;->h(Lp1/a1;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_d

    new-instance v1, Lfc0/f;

    const/16 v2, 0xd

    move-object/from16 v4, v29

    invoke-direct {v1, v4, v2}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_e

    new-instance v1, Lzc1/h6;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v1

    check-cast v6, Lc93/a;

    const v8, 0x36c36

    const/4 v9, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x12c

    const/4 v4, 0x1

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v1, v34

    move-object/from16 v3, v67

    const/4 v2, 0x1

    invoke-static {v7, v2, v3, v1, v7}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v1, v63

    move-object/from16 v5, v64

    const/16 v11, 0x30

    invoke-static {v5, v1, v7, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    move-object/from16 v8, v58

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v8, v59

    goto :goto_9

    :cond_f
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v7, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v60

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    move-object/from16 v1, v61

    goto :goto_b

    :cond_11
    :goto_a
    move-object/from16 v1, v62

    goto :goto_c

    :goto_b
    invoke-static {v5, v7, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v65

    move/from16 v4, v66

    invoke-virtual {v1, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v8, v1

    cmpl-double v6, v8, v24

    if-lez v6, :cond_12

    goto :goto_d

    :cond_12
    invoke-static/range {v26 .. v26}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v8, v1, v27

    if-lez v8, :cond_13

    move/from16 v1, v27

    :cond_13
    invoke-direct {v6, v1, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v20, 0x0

    const v21, 0x3fff8

    const-string v1, "Phase 2 \u2192 hidden"

    move/from16 v30, v2

    move-object/from16 v16, v3

    move-wide v3, v4

    move-object v2, v6

    const-wide/16 v5, 0x0

    move-object/from16 v18, v7

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v67, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x6

    move-object/from16 v68, v67

    invoke-static/range {v1 .. v21}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v18

    invoke-static/range {v43 .. v43}, Lzc1/n8;->j(Lp1/a1;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_14

    new-instance v1, Lfc0/f;

    const/16 v2, 0xe

    move-object/from16 v5, v43

    invoke-direct {v1, v5, v2}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_15

    new-instance v1, Lzc1/h6;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v6, v1

    check-cast v6, Lc93/a;

    const v8, 0x36c36

    const/4 v9, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x12c

    const/4 v4, 0x1

    invoke-static/range {v1 .. v9}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/16 v1, 0x10

    int-to-float v1, v1

    move-object/from16 v3, v68

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Preview"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_16

    new-instance v1, Lzc1/h7;

    const/4 v0, 0x6

    invoke-direct {v1, v0}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v0, Lk41/d;->b:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit16 v5, v0, 0x180

    const/4 v6, 0x1

    const/4 v1, 0x0

    move-object v4, v7

    move-object/from16 v2, v22

    invoke-static/range {v1 .. v6}, Lk41/c;->c(Landroidx/compose/ui/Modifier;Lk41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x15

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final h(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final i(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final j(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final l(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n8;->i(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/n8;->k(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/n8;->g(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
