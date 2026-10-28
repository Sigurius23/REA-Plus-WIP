.class public abstract Lat2/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lys2/e$q;",
        "viewState",
        "Lkotlin/Function1;",
        "Lls2/a;",
        "Ll83/a0;",
        "onAnalyticEvent",
        "Lws2/i;",
        "onViewEvent",
        "m",
        "(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lws2/i$i;",
        "B",
        "(Lys2/e$q;)Lws2/i$i;",
        "",
        "enableDialog",
        "weekly-plan_release"
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
.method private static final A(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lat2/d1;->m(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lys2/e$q;)Lws2/i$i;
    .locals 9

    new-instance v0, Lws2/i$i;

    invoke-virtual {p0}, Lys2/e$q;->e()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->WEIGHT:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-virtual {p0}, Lys2/e$q;->g()D

    move-result-wide v3

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lws2/i$i;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/d1;->z(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/d1;->t(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d1;->o(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lat2/d1;->A(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lat2/d1;->x(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/d1;->u(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lls2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d1;->n(Lls2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d1;->s(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lat2/d1;->y(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d1;->w(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/d1;->v(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/d1;->r(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lys2/e$q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$q;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p0

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x5bbcbf6

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v0, v11

    :goto_5
    and-int/lit16 v11, v0, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_6

    :cond_8
    move v11, v13

    :goto_6
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_36

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_9

    new-instance v3, Laq0/p;

    const/16 v5, 0x1d

    invoke-direct {v3, v5}, Laq0/p;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v3, v5

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v11, :cond_b

    new-instance v5, Lat2/b1;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v5, v9

    :goto_8
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v7, v9}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, Lb2/e;->w:Lb2/m;

    invoke-static {v15, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move-object/from16 v33, v5

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_10

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lp1/c1;

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Ll0/m;->c:Ll0/g;

    move-object/from16 p1, v7

    sget-object v7, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x0

    invoke-static {v13, v7, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v34, v3

    move-object/from16 v35, v4

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_11

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    :cond_12
    invoke-static {v3, v10, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v36, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v2}, Lys2/e$q;->c()Lys2/f;

    move-result-object v3

    invoke-virtual {v3}, Lys2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-virtual {v2}, Lys2/e$q;->c()Lys2/f;

    move-result-object v3

    invoke-virtual {v3}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_14

    new-instance v3, Lo81/a;

    invoke-virtual {v2}, Lys2/e$q;->c()Lys2/f;

    move-result-object v6

    invoke-virtual {v6}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v12, 0x2

    invoke-direct {v3, v6, v9, v12, v4}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v38, v3

    goto :goto_b

    :cond_14
    const/4 v9, 0x0

    move-object/from16 v38, v4

    :goto_b
    new-instance v3, Ly71/g;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lih0/d0;->C(Lx81/d;)I

    move-result v6

    sget v12, Luv0/c;->E:I

    invoke-static {v10, v12}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-direct {v3, v6, v12}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v52, 0x7ff8

    const/16 v53, 0x0

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

    const/16 v51, 0x0

    move-object/from16 v39, v3

    invoke-direct/range {v36 .. v53}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v6, v0, 0x380

    const/16 v3, 0x100

    if-ne v6, v3, :cond_15

    const/4 v12, 0x1

    goto :goto_c

    :cond_15
    move v12, v9

    :goto_c
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v12, v12, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v12, :cond_17

    if-ne v3, v11, :cond_16

    goto :goto_d

    :cond_16
    move-object/from16 v19, v7

    move-object/from16 v7, v33

    goto :goto_e

    :cond_17
    :goto_d
    new-instance v3, Lat2/a1;

    const/4 v12, 0x1

    move-object/from16 v19, v7

    move-object/from16 v7, v33

    invoke-direct {v3, v7, v2, v12}, Lat2/a1;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v3, Lc93/a;

    sget v12, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v12, v12, 0x3

    move-object/from16 v20, v15

    const/16 v15, 0x35

    move-object/from16 v33, v7

    const/4 v7, 0x0

    move/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v14

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 p2, v33

    move/from16 v33, v0

    move-object v0, v8

    move-object/from16 v8, v36

    move-object/from16 v36, p2

    move-object/from16 p2, v1

    move-object/from16 v37, v5

    move/from16 v40, v6

    move-object/from16 v1, v19

    move-object/from16 v38, v20

    move-object/from16 v55, v22

    move-object/from16 v2, v23

    const/4 v5, 0x1

    move-object/from16 v6, p1

    move-object/from16 p1, v4

    move-object v4, v13

    move-object v13, v10

    move-object v10, v3

    move/from16 v3, v21

    invoke-static/range {v7 .. v15}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    invoke-static {v3, v10, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v8, 0xe

    invoke-static {v6, v7, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    double-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v7, v8, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v4, v1, v10, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_18

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_18
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v38

    invoke-static {v10, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1a

    :cond_19
    move-object/from16 v11, v37

    goto :goto_11

    :cond_1a
    move-object/from16 v11, v37

    :goto_10
    move-object/from16 v4, p2

    goto :goto_12

    :goto_11
    invoke-static {v4, v10, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x2

    int-to-float v7, v12

    mul-float/2addr v7, v9

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v10, v12}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$q;->c()Lys2/f;

    move-result-object v12

    invoke-virtual {v12}, Lys2/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v12, v10, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget v14, Lx81/d;->b:I

    move-object/from16 v15, p1

    invoke-virtual {v15, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v15, v10, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lb91/d;->P()Lb91/a;

    move-result-object v27

    sget v18, Lb91/a;->d:I

    shl-int/lit8 v31, v18, 0x12

    const v32, 0x2fffa

    move/from16 v18, v8

    const/4 v8, 0x0

    move/from16 v19, v7

    move-object/from16 v37, v11

    move-object v7, v12

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v9

    move-object/from16 v29, v10

    move-wide/from16 v9, v16

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    move/from16 v28, v21

    const-wide/16 v20, 0x0

    move-object/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v38, v23

    const/16 v23, 0x0

    move/from16 v39, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v42, v26

    const/16 v26, 0x0

    move/from16 v43, v28

    const/16 v28, 0x0

    move-object/from16 v44, v30

    const/16 v30, 0x0

    move-object/from16 p2, v4

    move/from16 v3, v38

    move/from16 v57, v39

    move-object/from16 v4, v44

    move-object/from16 v38, v1

    move-object/from16 v39, v2

    move/from16 v1, v41

    move/from16 v2, v42

    move-object/from16 v41, v0

    move/from16 v0, v43

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    int-to-float v7, v5

    mul-float/2addr v7, v3

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$q;->c()Lys2/f;

    move-result-object v7

    invoke-virtual {v7}, Lys2/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v4, v10, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    move-wide v9, v8

    const/4 v8, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$q;->d()Lbu2/d;

    move-result-object v11

    sget-object v25, Lbu2/c0;->WEIGHT:Lbu2/c0;

    const v29, 0xefff

    const/16 v30, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    invoke-static/range {v11 .. v30}, Lbu2/d;->b(Lbu2/d;FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILjava/lang/Object;)Lbu2/d;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v55

    if-ne v0, v1, :cond_1b

    new-instance v0, Lat2/b1;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v0}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v0, v40

    const/16 v4, 0x100

    if-ne v0, v4, :cond_1c

    move v13, v5

    :goto_13
    move/from16 v26, v2

    move-object/from16 v2, p0

    goto :goto_14

    :cond_1c
    const/4 v13, 0x0

    goto :goto_13

    :goto_14
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v9, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_1e

    if-ne v11, v1, :cond_1d

    goto :goto_15

    :cond_1d
    move-object/from16 v13, v36

    goto :goto_16

    :cond_1e
    :goto_15
    new-instance v11, Lat2/c1;

    const/4 v9, 0x0

    move-object/from16 v13, v36

    invoke-direct {v11, v13, v2, v9}, Lat2/c1;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    move-object v9, v11

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lbu2/g;->f(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v2}, Lys2/e$q;->a()Lys2/b;

    move-result-object v9

    invoke-virtual {v9}, Lys2/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-ne v0, v4, :cond_1f

    move v11, v5

    goto :goto_17

    :cond_1f
    const/4 v11, 0x0

    :goto_17
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_20

    if-ne v12, v1, :cond_21

    :cond_20
    new-instance v12, Lat2/a1;

    const/4 v11, 0x2

    invoke-direct {v12, v13, v2, v11}, Lat2/a1;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v20, v12

    check-cast v20, Lc93/a;

    shl-int/lit8 v11, v26, 0x12

    const/4 v12, 0x6

    or-int/lit8 v22, v11, 0x6

    const/16 v23, 0x0

    const/16 v24, 0x1fbe

    move/from16 v54, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-object/from16 v36, v13

    move-object v13, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v21, v29

    move-object/from16 v5, v36

    move/from16 v4, v54

    invoke-static/range {v7 .. v24}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    invoke-static {v7, v3, v6, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->f:Ll0/h;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v14, 0x6

    invoke-static {v4, v7, v10, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_22

    move-object/from16 v9, v41

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_18
    move-object/from16 v9, v39

    goto :goto_19

    :cond_22
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_18

    :goto_19
    invoke-static {v10, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v38

    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_23

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_24

    :cond_23
    move-object/from16 v11, v37

    goto :goto_1b

    :cond_24
    :goto_1a
    move-object/from16 v4, p2

    goto :goto_1c

    :goto_1b
    invoke-static {v7, v10, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1a

    :goto_1c
    invoke-static {v10, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lys2/e$q;->a()Lys2/b;

    move-result-object v3

    invoke-virtual {v3}, Lys2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-nez v9, :cond_25

    const v3, -0x69e6ad00

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_1d
    move/from16 v8, v57

    const/4 v3, 0x1

    goto :goto_1f

    :cond_25
    const v3, -0x69e6acff

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0x100

    if-ne v0, v3, :cond_26

    const/4 v13, 0x1

    goto :goto_1e

    :cond_26
    const/4 v13, 0x0

    :goto_1e
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_27

    if-ne v4, v1, :cond_28

    :cond_27
    new-instance v4, Lat2/c1;

    const/4 v3, 0x1

    invoke-direct {v4, v5, v2, v3}, Lat2/c1;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object/from16 v19, v4

    check-cast v19, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v21, v26, 0x6

    const/16 v22, 0x0

    const/16 v23, 0xffb

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v20, v29

    invoke-static/range {v7 .. v23}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v20

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1f
    invoke-static {v10, v3, v6, v8, v10}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-static/range {v35 .. v35}, Lat2/d1;->p(Lp1/c1;)Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-virtual {v2}, Lys2/e$q;->b()Lys2/c;

    move-result-object v4

    if-eqz v4, :cond_32

    const v4, -0x33bdeb38    # -5.0877216E7f

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    new-instance v4, Lls2/a$n;

    const-string v6, "View"

    invoke-direct {v4, v6}, Lls2/a$n;-><init>(Ljava/lang/String;)V

    move-object/from16 v6, v34

    invoke-interface {v6, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lys2/e$q;->b()Lys2/c;

    move-result-object v4

    invoke-virtual {v4}, Lys2/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v2}, Lys2/e$q;->b()Lys2/c;

    move-result-object v4

    invoke-virtual {v4}, Lys2/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2}, Lys2/e$q;->b()Lys2/c;

    move-result-object v4

    invoke-virtual {v4}, Lys2/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lys2/e$q;->b()Lys2/c;

    move-result-object v4

    invoke-virtual {v4}, Lys2/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_29

    new-instance v4, Lat2/n0;

    const/4 v12, 0x2

    move-object/from16 v13, v35

    invoke-direct {v4, v12, v13}, Lat2/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_20

    :cond_29
    move-object/from16 v13, v35

    :goto_20
    move-object/from16 v29, v4

    check-cast v29, Lc93/a;

    const/16 v4, 0x100

    if-ne v0, v4, :cond_2a

    move v12, v3

    goto :goto_21

    :cond_2a
    move v12, v9

    :goto_21
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    and-int/lit8 v14, v33, 0x70

    const/16 v15, 0x20

    if-ne v14, v15, :cond_2b

    move/from16 v17, v3

    goto :goto_22

    :cond_2b
    move/from16 v17, v9

    :goto_22
    or-int v12, v12, v17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v12, :cond_2c

    if-ne v3, v1, :cond_2d

    :cond_2c
    move/from16 v40, v0

    goto :goto_23

    :cond_2d
    move-object v12, v6

    move v6, v0

    move-object v0, v3

    move-object v3, v12

    move v12, v4

    move-object/from16 v33, v5

    move/from16 v45, v9

    move-object v4, v13

    const/16 v17, 0x1

    move-object v9, v1

    goto :goto_24

    :goto_23
    new-instance v0, Lat2/z0;

    move-object/from16 v33, v5

    const/4 v5, 0x0

    move v12, v4

    move-object v3, v6

    move/from16 v45, v9

    move-object v4, v13

    move/from16 v6, v40

    const/16 v17, 0x1

    move-object v9, v1

    move-object/from16 v1, v33

    invoke-direct/range {v0 .. v5}, Lat2/z0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    move-object/from16 v30, v0

    check-cast v30, Lc93/a;

    if-ne v6, v12, :cond_2e

    move/from16 v13, v17

    goto :goto_25

    :cond_2e
    move/from16 v13, v45

    :goto_25
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v13

    if-ne v14, v15, :cond_2f

    move/from16 v13, v17

    goto :goto_26

    :cond_2f
    move/from16 v13, v45

    :goto_26
    or-int/2addr v0, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_31

    if-ne v1, v9, :cond_30

    goto :goto_27

    :cond_30
    move-object v0, v1

    move-object/from16 v1, v33

    goto :goto_28

    :cond_31
    :goto_27
    new-instance v0, Lat2/z0;

    const/4 v5, 0x1

    move-object/from16 v1, v33

    invoke-direct/range {v0 .. v5}, Lat2/z0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_28
    move-object/from16 v31, v0

    check-cast v31, Lc93/a;

    shl-int/lit8 v0, v26, 0x3

    shl-int/lit8 v4, v26, 0x6

    or-int/2addr v0, v4

    shl-int/lit8 v4, v26, 0x9

    or-int/2addr v0, v4

    shl-int/lit8 v4, v26, 0x1b

    or-int v36, v0, v4

    const/16 v38, 0x180

    const v39, 0xe3ffdf1

    move-object/from16 v22, v9

    move-object v9, v7

    const/4 v7, 0x0

    move-object v13, v10

    move-object v10, v11

    const/4 v11, 0x0

    move/from16 v56, v12

    const/4 v12, 0x0

    move-object/from16 v35, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v5, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v55, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    move v4, v5

    move/from16 v5, v45

    move-object/from16 v0, v55

    invoke-static/range {v7 .. v39}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v10, v35

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_29

    :cond_32
    move v6, v0

    move-object v0, v1

    move v4, v3

    move-object v1, v5

    move v5, v9

    move-object/from16 v3, v34

    const v7, -0x33a6e596    # -5.6912296E7f

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_29
    invoke-static {v10, v4, v4, v4}, Lm4/a;->y(Lp1/q;ZZZ)V

    const/16 v12, 0x100

    if-ne v6, v12, :cond_33

    move v13, v4

    goto :goto_2a

    :cond_33
    move v13, v5

    :goto_2a
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_34

    if-ne v7, v0, :cond_35

    :cond_34
    new-instance v7, Lat2/a1;

    const/4 v0, 0x0

    invoke-direct {v7, v1, v2, v0}, Lat2/a1;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$q;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    check-cast v7, Lc93/a;

    invoke-static {v7, v5, v10, v5, v4}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_2b

    :cond_36
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v3, v5

    move-object v1, v9

    :goto_2b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_37

    new-instance v0, La01/e;

    const/4 v6, 0x6

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Lys2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_37
    return-void
.end method

.method private static final n(Lls2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final q(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$q;->f()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$clearAndSetSemantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SetUpWeight_Body_Slider_Weight"

    invoke-static {v0, p0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lbu2/o$a;

    if-eqz v0, :cond_0

    check-cast p2, Lbu2/o$a;

    invoke-virtual {p2}, Lbu2/o$a;->a()F

    move-result p2

    float-to-double v0, p2

    invoke-virtual {p1}, Lys2/e$q;->h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    new-instance p2, Lws2/i$m;

    invoke-direct {p2, p1, v0, v1}, Lws2/i$m;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lat2/d1;->B(Lys2/e$q;)Lws2/i$i;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lys2/e$q;Ljava/lang/Object;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lws2/i$c;

    invoke-virtual {p1}, Lys2/e$q;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$q;->h()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lws2/i$c;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lat2/d1;->q(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lat2/d1;->q(Lp1/c1;Z)V

    invoke-static {p1}, Lat2/d1;->B(Lys2/e$q;)Lws2/i$i;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lls2/a$n;

    const-string p1, "Dismiss"

    invoke-direct {p0, p1}, Lls2/a$n;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lls2/a$k;->a:Lls2/a$k;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lys2/e$q;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lat2/d1;->q(Lp1/c1;Z)V

    invoke-static {p1}, Lat2/d1;->B(Lys2/e$q;)Lws2/i$i;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lls2/a$n;

    const-string p1, "Confirm"

    invoke-direct {p0, p1}, Lls2/a$n;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lls2/a$l;->a:Lls2/a$l;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lys2/e$q;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$q;->f()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
