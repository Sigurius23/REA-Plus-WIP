.class public abstract Ltv0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lpv0/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "h",
        "content-search_release"
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
.method public static synthetic a(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltv0/b;->j(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltv0/b;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lpv0/d;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ltv0/b;->i(Lkotlin/jvm/functions/Function1;Lpv0/d;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltv0/b;->g(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpv0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x72d52927

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Lpv0/d;->p()Z

    move-result v1

    if-eqz v1, :cond_5

    const v0, -0x6f2b4b5d

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-static {p2, v5}, Ltv0/d;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_5
    invoke-virtual {p0}, Lpv0/d;->o()Z

    move-result v1

    if-eqz v1, :cond_9

    const v1, -0x6f2b4710

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_6

    goto :goto_4

    :cond_6
    move v4, v5

    :goto_4
    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_7

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_8

    :cond_7
    new-instance v0, Lsg2/i;

    const/16 v1, 0x10

    invoke-direct {v0, p1, v1}, Lsg2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lc93/a;

    invoke-static {v0, p2, v5}, Ltv0/c;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    const v1, -0x6f2b3dc6

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p0, p1, p2, v0}, Ltv0/b;->h(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Ltv0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Ltv0/a;-><init>(Lpv0/d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Lpv0/b$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lpv0/b$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltv0/b;->e(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpv0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v2, 0xaf43c0c

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    move v12, v2

    and-int/lit8 v2, v12, 0x13

    const/16 v13, 0x12

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v2, v13, :cond_4

    move v2, v15

    goto :goto_3

    :cond_4
    move v2, v14

    :goto_3
    and-int/lit8 v3, v12, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v6, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v6, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-eqz v3, :cond_5

    invoke-virtual {v6, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v6, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v6, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    :cond_6
    invoke-static {v8, v6, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v6, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x1df0ca4a

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v6, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    int-to-float v8, v15

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float v18, v8, v15

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v25, v18

    new-instance v26, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lpv0/d;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v27

    new-instance v8, Ly71/g;

    move/from16 v44, v12

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-static {v12}, Lih0/d0;->C(Lx81/d;)I

    move-result v11

    sget v17, Luv0/c;->E:I

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    invoke-direct {v8, v11, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v42, 0x7ffa

    const/16 v43, 0x0

    const/16 v28, 0x0

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

    const/16 v40, 0x0

    const/16 v41, 0x0

    move-object/from16 v29, v8

    invoke-direct/range {v26 .. v43}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v4, v44, 0x70

    const/16 v8, 0x20

    if-ne v4, v8, :cond_8

    const/4 v4, 0x1

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    :goto_5
    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_9

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v8, v4, :cond_a

    :cond_9
    new-instance v8, Lre1/k;

    const/4 v4, 0x6

    invoke-direct {v8, v4, v1, v0, v5}, Lre1/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v5, v8

    check-cast v5, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v11, 0x3

    shl-int/2addr v4, v11

    const/4 v8, 0x6

    or-int/2addr v4, v8

    move-object/from16 v17, v10

    const/16 v10, 0x34

    move-object/from16 v18, v9

    move v9, v4

    const/4 v4, 0x0

    move/from16 v19, v8

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v47, v3

    move-object/from16 v46, v17

    move-object/from16 v49, v18

    move-object/from16 v48, v20

    move-object/from16 v3, v26

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x2

    int-to-float v3, v2

    mul-float v17, v3, v15

    const/16 v18, 0x0

    const/16 v21, 0x2

    move/from16 v19, v17

    move/from16 v20, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v45, v2

    invoke-virtual {v0}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v1, v3

    invoke-virtual {v0}, Lpv0/d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    shl-int/lit8 v4, v14, 0x3

    const v5, 0x30000006

    or-int/2addr v4, v5

    shl-int/lit8 v5, v14, 0x6

    or-int v19, v4, v5

    shl-int/lit8 v4, v44, 0x9

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int/lit8 v20, v4, 0x30

    const/16 v21, 0x35f8

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v17, v11

    const-wide/16 v10, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x1

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v28, v14

    const/4 v14, 0x1

    move/from16 v29, v15

    const/4 v15, 0x0

    move-object/from16 v30, v16

    const/16 v16, 0x0

    move-object/from16 v17, p1

    move-object/from16 v51, v26

    move/from16 v50, v28

    move-object/from16 v0, v30

    const/16 v22, 0x12

    invoke-static/range {v1 .. v21}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v18

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x4012000000000000L    # 4.5

    double-to-float v2, v2

    mul-float v2, v2, v29

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->e:Ll0/h;

    const/16 v4, 0x36

    invoke-static {v3, v2, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    move-object/from16 v5, v46

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v5, v47

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v8, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v48

    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    move-object/from16 v2, v49

    goto :goto_9

    :cond_d
    :goto_8
    move-object/from16 v2, v27

    goto :goto_a

    :goto_9
    invoke-static {v3, v8, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v8, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float v20, v1, v29

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->f()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v8, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    sget v0, Lx81/d;->b:I

    move-object/from16 v9, v51

    invoke-virtual {v9, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->Y0()J

    move-result-wide v4

    const/16 v7, 0x1b0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    const/4 v2, 0x0

    move-object/from16 v6, v18

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v6

    const/16 v18, 0x0

    move/from16 v20, v25

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v3, v50

    invoke-static {v1, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v9, v8, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->P()Lb91/a;

    move-result-object v21

    new-instance v13, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v13, v6}, Lw3/k;-><init>(I)V

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v25, v7, 0x12

    const v26, 0x2fdf8

    move/from16 v28, v3

    move-wide v3, v4

    move/from16 v17, v6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move/from16 v52, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x30

    move/from16 p2, v0

    move/from16 v0, v28

    move-object/from16 v53, v51

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    invoke-virtual/range {p0 .. p0}, Lpv0/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v8, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v0, p2

    move-object/from16 v9, v53

    invoke-virtual {v9, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v3

    invoke-virtual {v9, v8, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v21

    new-instance v13, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v13, v6}, Lw3/k;-><init>(I)V

    const/16 v24, 0x0

    const v26, 0x2fdfa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v23

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v8, v1, v0, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_b

    :cond_e
    move-object v8, v6

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Ltv0/a;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Ltv0/a;-><init>(Lpv0/d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lpv0/d;Ljava/lang/String;)Ll83/a0;
    .locals 7

    new-instance v0, Lhy0/x0$b;

    invoke-virtual {p1}, Lpv0/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, p1}, Lhy0/x0$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Llv0/a$a;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Llv0/a$a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lpv0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltv0/b;->h(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
