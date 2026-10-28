.class public abstract Lqg0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Log0/c$d;",
        "viewState",
        "",
        "isPresented",
        "Lkotlin/Function1;",
        "Log0/a;",
        "Ll83/a0;",
        "onEvent",
        "i",
        "(Log0/c$d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lm91/u;",
        "item",
        "",
        "o",
        "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "advanced-labs-management_release"
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

    invoke-static {p0}, Lqg0/d;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqg0/d;->r(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqg0/d;->q(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Lqg0/d;->m(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Log0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqg0/d;->l(Log0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqg0/d;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Log0/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqg0/d;->k(Log0/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Log0/c$d;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqg0/d;->n(Log0/c$d;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Log0/c$d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Log0/c$d;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x26b1b982

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit16 v7, v4, 0x180

    const/16 v14, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v14

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v15, 0x0

    const/4 v9, 0x1

    if-eq v7, v8, :cond_7

    move v7, v9

    goto :goto_5

    :cond_7
    move v7, v15

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    if-eqz v5, :cond_8

    move/from16 v17, v15

    goto :goto_6

    :cond_8
    move/from16 v17, v6

    :goto_6
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v5}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v18, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Log0/c$d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    if-eqz v17, :cond_c

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lyb0/f;->a(Lx81/d;)I

    move-result v5

    goto :goto_8

    :cond_c
    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lih0/d0;->C(Lx81/d;)I

    move-result v5

    :goto_8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v21

    const v35, 0xfffa

    const/16 v36, 0x0

    const/16 v20, 0x0

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

    invoke-direct/range {v18 .. v36}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v5, v9

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v14, :cond_d

    move v8, v9

    goto :goto_9

    :cond_d
    move v8, v15

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_e

    if-ne v10, v12, :cond_f

    :cond_e
    new-instance v10, Lp62/h;

    const/16 v8, 0x1c

    invoke-direct {v10, v3, v8}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v8, v10

    check-cast v8, Lc93/a;

    sget v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v13, 0x3

    shl-int/2addr v10, v13

    or-int/lit8 v10, v10, 0x6

    move/from16 v16, v13

    const/16 v13, 0x34

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v21, v12

    move v12, v10

    const/4 v10, 0x0

    move-object v14, v6

    move/from16 v15, v16

    move-object/from16 v6, v18

    move-object/from16 v37, v21

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v14, v5, v6, v15, v6}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v2

    mul-float v7, v7, v19

    invoke-static {v6, v7, v5, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x1

    invoke-static {v5, v7, v6}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v7

    sget-object v9, Lb2/e;->N:Lb2/k;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/16 v8, 0x100

    if-ne v0, v8, :cond_10

    move v15, v6

    goto :goto_a

    :cond_10
    const/4 v15, 0x0

    :goto_a
    or-int v0, v5, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_11

    move-object/from16 v0, v37

    if-ne v5, v0, :cond_12

    :cond_11
    new-instance v5, Lq11/c;

    const/16 v0, 0x8

    invoke-direct {v5, v1, v3, v0}, Lq11/c;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const v15, 0x30180

    const/16 v16, 0x1da

    move/from16 v20, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v14, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v2

    move/from16 v0, v20

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move/from16 v2, v17

    goto :goto_b

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    move v2, v6

    :goto_b
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lbg0/h;

    const/16 v6, 0x1a

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Log0/a$e;->a:Log0/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Log0/c$d;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Log0/c$d;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Log0/c$b;

    new-instance v1, Loq1/c;

    const/16 v2, 0x8

    invoke-direct {v1, v2, v0, p1}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lx1/b;

    const/4 v2, 0x1

    const v3, 0x327954da    # 1.4513001E-8f

    invoke-direct {v0, v1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    goto :goto_0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Log0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    const-string v0, "$this$item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    and-int/2addr p4, v1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const p2, 0x79778d28

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Log0/c$b;->b()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lm91/u;

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_2

    :cond_1
    new-instance v3, La80/j;

    const/16 v1, 0x17

    invoke-direct {v3, p1, p4, v1}, La80/j;-><init>(Lkotlin/jvm/functions/Function1;Lm91/u;I)V

    invoke-virtual {p3, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p4, v3, p3, v2, v2}, Lqg0/d;->o(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 p4, 0x3

    int-to-float p4, p4

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {p4, v1, v0, p3}, Ld;->w(FFLb2/t;Lp1/q;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    invoke-virtual {p0}, Log0/c$b;->a()Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/advancedlabsmanagement/domain/models/AdvancedLabsManagementSectionSpacingType;->getSpacing-D9Ej5fM()F

    move-result p0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-static {p3, p0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Log0/a$f;

    invoke-direct {v0, p2, p1}, Log0/a$f;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Log0/c$d;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqg0/d;->i(Log0/c$d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "item"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, -0x1a718196

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_6

    new-instance v2, Lqe0/b;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lqe0/b;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    goto :goto_5

    :cond_7
    move-object v3, p1

    :goto_5
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_8

    new-instance v2, Lqe0/b;

    const/4 v5, 0x7

    invoke-direct {v2, v5}, Lqe0/b;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v2

    and-int/lit8 v5, v1, 0xe

    sget v6, Lm91/p;->b:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v5, v6

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v5, v1

    const/4 v6, 0x4

    move-object v1, v2

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_6

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, La80/k;

    const/16 v5, 0xa

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, La80/k;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lm91/q;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lm91/u;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqg0/d;->o(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
