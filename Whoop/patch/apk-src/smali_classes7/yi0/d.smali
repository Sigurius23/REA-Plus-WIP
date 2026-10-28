.class public abstract Lyi0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0011\u001a\u001f\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a9\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a)\u0010\u001d\u001a\u0004\u0018\u00010\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0017H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\"\u00b2\u0006\u0018\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010!\u001a\u0004\u0018\u00010 8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lti0/d;",
        "contentState",
        "Lkotlin/Function1;",
        "Lri0/b;",
        "Ll83/a0;",
        "action",
        "m",
        "(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isForward",
        "isRtl",
        "Lc0/l0;",
        "B",
        "(ZZ)Lc0/l0;",
        "",
        "width",
        "E",
        "(ZIZ)I",
        "F",
        "previousStackSize",
        "currentStackSize",
        "G",
        "(II)Z",
        "",
        "",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "events",
        "I",
        "(Ljava/util/Map;II)Lcom/whoop/analytics/AnalyticEventModel;",
        "H",
        "(Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;",
        "currentAction",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "currentOnStartInteraction",
        "arch-v2_release"
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
.method public static final synthetic A(Lp1/t2;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 0

    invoke-static {p0}, Lyi0/d;->o(Lp1/t2;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    return-object p0
.end method

.method public static final B(ZZ)Lc0/l0;
    .locals 5

    new-instance v0, Lr20/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lr20/e;-><init>(IZZ)V

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lc0/w0;->n(ILkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v0

    new-instance v3, Lr20/e;

    const/4 v4, 0x3

    invoke-direct {v3, v4, p0, p1}, Lr20/e;-><init>(IZZ)V

    invoke-static {v3}, Lc0/w0;->r(Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object p0

    invoke-static {v1, v2}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(ZZI)I
    .locals 0

    invoke-static {p0, p2, p1}, Lyi0/d;->E(ZIZ)I

    move-result p0

    return p0
.end method

.method private static final D(ZZI)I
    .locals 0

    invoke-static {p0, p2, p1}, Lyi0/d;->F(ZIZ)I

    move-result p0

    return p0
.end method

.method public static final E(ZIZ)I
    .locals 0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    neg-int p1, p1

    :goto_0
    if-eqz p2, :cond_1

    neg-int p0, p1

    return p0

    :cond_1
    return p1
.end method

.method public static final F(ZIZ)I
    .locals 0

    if-eqz p0, :cond_0

    neg-int p1, p1

    :cond_0
    if-eqz p2, :cond_1

    neg-int p0, p1

    return p0

    :cond_1
    return p1
.end method

.method public static final G(II)Z
    .locals 1

    const/4 v0, -0x1

    if-eq p0, v0, :cond_1

    if-lt p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final H(Ljava/util/Map;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;)",
            "Lcom/whoop/analytics/AnalyticEventModel;"
        }
    .end annotation

    if-eqz p0, :cond_0

    const-string v0, "step_dismissed"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/AnalyticEventModel;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final I(Ljava/util/Map;II)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            ">;II)",
            "Lcom/whoop/analytics/AnalyticEventModel;"
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    if-le p2, p1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    if-eqz p0, :cond_2

    const-string p1, "step_entered"

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/AnalyticEventModel;

    return-object p0

    :cond_2
    return-object v1
.end method

.method public static synthetic a(IZZ)I
    .locals 0

    invoke-static {p1, p2, p0}, Lyi0/d;->D(ZZI)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lc0/o;Lcom/whoop/archv2/model/template/BackgroundModel;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-static {v0, p0, p1, p2, p3}, Lyi0/d;->t(Ll0/u;Lc0/o;Lcom/whoop/archv2/model/template/BackgroundModel;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZZLc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyi0/d;->u(ZZLc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/Map;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyi0/d;->p(Ljava/util/Map;Lp1/t2;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lyi0/d;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(IZZ)I
    .locals 0

    invoke-static {p1, p2, p0}, Lyi0/d;->C(ZZI)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lc0/o;Lti0/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyi0/d;->w(Lkotlin/jvm/functions/Function1;Lc0/o;Lti0/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lti0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyi0/d;->y(Lti0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lti0/d;Lti0/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lyi0/d;->v(Lti0/d;Lti0/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ZZLc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyi0/d;->r(ZZLc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lti0/d;Lcom/whoop/archv2/model/template/BackgroundModel;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lyi0/d;->s(Lti0/d;Lcom/whoop/archv2/model/template/BackgroundModel;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/design/models/ProgressButtonModel;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyi0/d;->x(Lcom/whoop/design/models/ProgressButtonModel;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lti0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "contentState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "action"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, 0x60b2b09e

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    const/16 v15, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v15

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v11, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_31

    invoke-virtual {v0}, Lti0/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lti0/d;->i()I

    move-result v6

    invoke-virtual {v0}, Lti0/d;->d()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v0}, Lti0/d;->g()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v8

    invoke-static {v1, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v9

    sget-object v10, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    invoke-static {v8, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v10, v14, :cond_5

    const/4 v10, -0x1

    invoke-static {v10, v11}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v10

    :cond_5
    check-cast v10, Lp1/a1;

    move-object/from16 v18, v10

    check-cast v18, Lp1/h1;

    invoke-virtual/range {v18 .. v18}, Lp1/h1;->x()I

    move-result v10

    invoke-static {v10, v6}, Lyi0/d;->G(II)Z

    move-result v10

    sget-object v12, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    sget-object v4, Ly3/m;->x:Ly3/m;

    if-ne v12, v4, :cond_6

    const/4 v12, 0x1

    goto :goto_4

    :cond_6
    const/4 v12, 0x0

    :goto_4
    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v6}, Lp1/q;->e(I)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v4, v4, v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_8

    if-ne v13, v14, :cond_7

    goto :goto_5

    :cond_7
    move-object v4, v5

    move-object v5, v7

    move-object v6, v9

    goto :goto_6

    :cond_8
    :goto_5
    new-instance v16, Lyi0/d$a;

    const/16 v23, 0x0

    move-object/from16 v17, v5

    move/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v22, v8

    move-object/from16 v21, v9

    invoke-direct/range {v16 .. v23}, Lyi0/d$a;-><init>(Ljava/lang/String;Lp1/a1;ILjava/util/Map;Lp1/t2;Lp1/t2;Lq83/d;)V

    move-object/from16 v13, v16

    move-object/from16 v4, v17

    move-object/from16 v5, v20

    move-object/from16 v6, v21

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_6
    check-cast v13, Lc93/m;

    invoke-static {v11, v13, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_9

    if-ne v8, v14, :cond_a

    :cond_9
    new-instance v8, Lx30/j1;

    const/16 v7, 0xa

    invoke-direct {v8, v7, v5, v6}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v8, v11}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v0}, Lti0/d;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lti0/d;->e()Lcom/whoop/archv2/model/template/BackBehavior;

    move-result-object v5

    sget-object v6, Lcom/whoop/archv2/model/template/BackBehavior;->POP:Lcom/whoop/archv2/model/template/BackBehavior;

    if-ne v5, v6, :cond_b

    if-eqz v4, :cond_b

    const/4 v5, 0x1

    goto :goto_7

    :cond_b
    const/4 v5, 0x0

    :goto_7
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v15, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v6, 0x0

    :goto_8
    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_d

    if-ne v7, v14, :cond_e

    :cond_d
    new-instance v7, Lc41/j0;

    const/16 v6, 0x11

    invoke-direct {v7, v1, v4, v6}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lc93/a;

    const/4 v4, 0x0

    invoke-static {v7, v5, v11, v4, v4}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lti0/d;->b()Lcom/whoop/archv2/model/template/BackgroundModel;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lcom/whoop/archv2/model/template/BackgroundModel;->getTheme()Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-static {v4}, Lsi0/b;->a(Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;)Lti0/l;

    move-result-object v4

    if-nez v4, :cond_10

    :cond_f
    sget-object v4, Lti0/l;->DEFAULT:Lti0/l;

    :cond_10
    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x6

    invoke-static {v13, v4, v11, v5}, Lti0/k;->a(Landroidx/compose/ui/Modifier;Lti0/l;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lti0/d;->j()Lcom/whoop/archv2/model/template/FlowStepTransition;

    move-result-object v5

    sget-object v6, Lcom/whoop/archv2/model/template/FlowStepTransition;->INSTANT:Lcom/whoop/archv2/model/template/FlowStepTransition;

    if-ne v5, v6, :cond_11

    const/16 v16, 0x1

    goto :goto_9

    :cond_11
    const/16 v16, 0x0

    :goto_9
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object v9, v6

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move-object/from16 v19, v7

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v20, v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto :goto_b

    :cond_13
    move-object/from16 v20, v8

    :goto_b
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0x8

    if-eqz v16, :cond_17

    const v7, -0x286cbe6b

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lti0/d;->b()Lcom/whoop/archv2/model/template/BackgroundModel;

    move-result-object v8

    if-eqz v8, :cond_15

    invoke-virtual {v8}, Lcom/whoop/archv2/model/template/BackgroundModel;->getUrl()Ljava/lang/String;

    move-result-object v8

    :goto_c
    move-object/from16 v27, v8

    goto :goto_d

    :cond_15
    const/4 v8, 0x0

    goto :goto_c

    :goto_d
    if-nez v27, :cond_16

    const v7, -0x286cbe6c

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move/from16 v18, v3

    move v2, v4

    move-object/from16 v33, v5

    move-object/from16 v21, v9

    move-object v9, v11

    move-object/from16 v27, v13

    move-object/from16 v1, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v6

    move v13, v10

    goto :goto_e

    :cond_16
    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    new-instance v26, Lkd1/o$c;

    const/16 v31, 0xe

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v26 .. v32}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lxi0/a;->l()F

    move-result v7

    move-object v8, v6

    new-instance v6, Ly3/f;

    invoke-direct {v6, v7}, Ly3/f;-><init>(F)V

    sget v7, Lkd1/o$c;->f:I

    shl-int/lit8 v7, v7, 0x3

    const/16 v21, 0x186

    or-int v7, v21, v7

    move-object/from16 v21, v9

    move-object v9, v11

    const/16 v11, 0xc

    move/from16 v22, v4

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move/from16 v23, v10

    move v10, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v18, v3

    move-object/from16 v33, v5

    move-object/from16 v27, v13

    move-object/from16 v1, v19

    move-object/from16 v3, v20

    move/from16 v2, v22

    move/from16 v13, v23

    move-object/from16 v19, v24

    move-object/from16 v5, v26

    invoke-static/range {v4 .. v11}, Lxi0/a;->f(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move v2, v7

    move/from16 v35, v12

    move/from16 v34, v13

    move-object/from16 v0, v27

    :goto_f
    const/high16 v4, 0x3f800000    # 1.0f

    goto/16 :goto_12

    :cond_17
    move/from16 v18, v3

    move v2, v4

    move-object/from16 v33, v5

    move-object/from16 v21, v9

    move-object v9, v11

    move-object/from16 v27, v13

    move-object/from16 v1, v19

    move-object/from16 v3, v20

    move-object/from16 v19, v6

    move v13, v10

    const v4, -0x286a0b75

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lti0/d;->b()Lcom/whoop/archv2/model/template/BackgroundModel;

    move-result-object v4

    invoke-virtual {v9, v13}, Lp1/q;->h(Z)Z

    move-result v5

    invoke-virtual {v9, v12}, Lp1/q;->h(Z)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_18

    if-ne v6, v14, :cond_19

    :cond_18
    new-instance v6, Lr20/e;

    const/4 v5, 0x4

    invoke-direct {v6, v5, v13, v12}, Lr20/e;-><init>(IZZ)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1b

    if-ne v7, v14, :cond_1a

    goto :goto_10

    :cond_1a
    const/4 v5, 0x0

    goto :goto_11

    :cond_1b
    :goto_10
    new-instance v7, Lyi0/c;

    const/4 v5, 0x0

    invoke-direct {v7, v0, v5}, Lyi0/c;-><init>(Lti0/d;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    new-instance v8, Ld30/c;

    invoke-direct {v8, v2}, Ld30/c;-><init>(I)V

    const v10, -0xc447242

    invoke-static {v10, v9, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    move v8, v12

    const v12, 0x186000

    move/from16 v23, v13

    const/16 v13, 0xa

    move/from16 v25, v5

    const/4 v5, 0x0

    move-object v11, v9

    move-object v9, v7

    const/4 v7, 0x0

    move/from16 v20, v8

    const-string v8, "FlowBackgroundTransition"

    move/from16 v35, v20

    move/from16 v34, v23

    move/from16 v2, v25

    move-object/from16 v0, v27

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :goto_12
    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_1c

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v9, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_1d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    :cond_1d
    move-object/from16 v6, v19

    goto :goto_15

    :cond_1e
    move-object/from16 v6, v19

    :goto_14
    move-object/from16 v7, v33

    goto :goto_16

    :goto_15
    invoke-static {v7, v9, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v9, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0xf0d2825

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    float-to-double v10, v4

    const-wide/16 v12, 0x0

    cmpl-double v5, v10, v12

    if-lez v5, :cond_1f

    :goto_17
    const/4 v5, 0x1

    goto :goto_18

    :cond_1f
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_17

    :goto_18
    invoke-static {v4, v4, v5}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lti0/d;->h()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v5

    if-eqz v5, :cond_20

    sget-object v5, Ll0/c2;->v:Ljava/util/WeakHashMap;

    invoke-static {v9}, Ll0/e;->e(Landroidx/compose/runtime/Composer;)Ll0/c2;

    move-result-object v5

    iget-object v5, v5, Ll0/c2;->e:Ll0/b;

    new-instance v10, Ll0/d2;

    invoke-direct {v10, v5, v2}, Ll0/d2;-><init>(Ll0/b2;I)V

    invoke-static {v0, v10}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v8, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    goto :goto_19

    :cond_20
    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    :goto_19
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v8, v21

    invoke-static {v8, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_21

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_21
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_22

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_23

    :cond_22
    invoke-static {v11, v9, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v9, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v16, :cond_25

    const v10, -0x48e4ca7c

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lti0/d;->a()Lti0/a;

    move-result-object v10

    if-nez v10, :cond_24

    const v10, -0x48e4ca7d

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v11, p1

    move/from16 v12, v18

    goto :goto_1b

    :cond_24
    const v11, -0x7e38edc2

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    move-object/from16 v11, p1

    move/from16 v12, v18

    invoke-static {v10, v11, v9, v12}, Lxi0/b;->b(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v24, v6

    move-object/from16 v36, v7

    move/from16 v18, v12

    move-object/from16 v16, v14

    move v7, v2

    move v2, v4

    move-object v14, v8

    :goto_1c
    const/4 v5, 0x1

    goto/16 :goto_1d

    :cond_25
    move-object/from16 v11, p1

    move/from16 v12, v18

    const v10, -0x48e328d5

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    move/from16 v18, v4

    invoke-virtual/range {p0 .. p0}, Lti0/d;->a()Lti0/a;

    move-result-object v4

    move/from16 v13, v34

    invoke-virtual {v9, v13}, Lp1/q;->h(Z)Z

    move-result v10

    move/from16 v2, v35

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v16

    or-int v10, v10, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_26

    if-ne v5, v14, :cond_27

    :cond_26
    new-instance v5, Lr20/e;

    const/4 v10, 0x5

    invoke-direct {v5, v10, v13, v2}, Lr20/e;-><init>(IZZ)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v2, p0

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_28

    if-ne v13, v14, :cond_29

    :cond_28
    new-instance v13, Lyi0/c;

    const/4 v10, 0x1

    invoke-direct {v13, v2, v10}, Lyi0/c;-><init>(Lti0/d;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v13, Lkotlin/jvm/functions/Function1;

    new-instance v10, Las1/j;

    move-object/from16 v19, v4

    const/16 v4, 0xb

    invoke-direct {v10, v11, v4}, Las1/j;-><init>(Ljava/lang/Object;I)V

    const v4, 0x5fbe75d

    invoke-static {v4, v9, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    move v4, v12

    const v12, 0x186000

    move-object v11, v9

    move-object v9, v13

    const/16 v13, 0xa

    move-object/from16 v24, v6

    move-object v6, v5

    const/4 v5, 0x0

    move-object/from16 v33, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const-string v8, "FlowStepTransition"

    move-object/from16 v16, v14

    move/from16 v2, v18

    move-object/from16 v14, v21

    move-object/from16 v36, v33

    move/from16 v18, v4

    move-object/from16 v4, v19

    invoke-static/range {v4 .. v13}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto/16 :goto_1c

    :goto_1d
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lti0/d;->h()Lcom/whoop/design/models/ProgressButtonModel;

    move-result-object v4

    if-nez v4, :cond_2a

    const v0, 0x2d7f0d8c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move-object/from16 v1, p1

    const/4 v5, 0x1

    goto/16 :goto_25

    :cond_2a
    const v5, 0x2d7f0d8d

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x2

    int-to-float v5, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v5, v2

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_2b

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1e

    :cond_2b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1e
    invoke-static {v9, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_2c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    :cond_2c
    move-object/from16 v6, v24

    goto :goto_20

    :cond_2d
    :goto_1f
    move-object/from16 v7, v36

    goto :goto_21

    :goto_20
    invoke-static {v5, v9, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1f

    :goto_21
    invoke-static {v9, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Llb1/t3;->g(Lcom/whoop/design/models/ProgressButtonModel;)Lc31/k;

    move-result-object v0

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v12, v18

    const/16 v2, 0x20

    if-ne v12, v2, :cond_2e

    const/4 v12, 0x1

    goto :goto_22

    :cond_2e
    const/4 v12, 0x0

    :goto_22
    or-int/2addr v1, v12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_30

    move-object/from16 v1, v16

    if-ne v2, v1, :cond_2f

    goto :goto_23

    :cond_2f
    move-object/from16 v1, p1

    goto :goto_24

    :cond_30
    :goto_23
    new-instance v2, Lx30/j1;

    move-object/from16 v1, p1

    const/16 v3, 0xb

    invoke-direct {v2, v3, v4, v1}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v3, Lc31/k;->r:I

    const/4 v7, 0x0

    invoke-static {v0, v2, v9, v3, v7}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    :goto_25
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_31
    move-object v9, v11

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_26
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_32

    new-instance v2, Lyf1/e;

    const/4 v5, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v2, v3, v1, v4, v5}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final n(Lp1/t2;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method private static final o(Lp1/t2;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/navigation/models/GenericInteraction;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/navigation/models/GenericInteraction;

    return-object p0
.end method

.method private static final p(Ljava/util/Map;Lp1/t2;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lyi0/d$b;

    invoke-direct {p2, p0, p1}, Lyi0/d$b;-><init>(Ljava/util/Map;Lp1/t2;)V

    return-object p2
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 2

    new-instance v0, Lri0/b$p;

    new-instance v1, Lcom/whoop/whoopaction/domain/models/StatePopAction;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v1, p1}, Lcom/whoop/whoopaction/domain/models/StatePopAction;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lri0/b$p;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(ZZLc0/q;)Lc0/l0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyi0/d;->B(ZZ)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final s(Lti0/d;Lcom/whoop/archv2/model/template/BackgroundModel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lti0/d;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Ll0/u;Lc0/o;Lcom/whoop/archv2/model/template/BackgroundModel;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string p4, "$this$AnimatedContent"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/whoop/archv2/model/template/BackgroundModel;->getUrl()Ljava/lang/String;

    move-result-object p1

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    check-cast p3, Lp1/q;

    if-nez v1, :cond_1

    const p0, 0x6ed47ffa

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_1
    const p2, 0x6ed47ffb

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    new-instance v0, Lkd1/o$c;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lxi0/a;->l()F

    move-result p2

    new-instance v2, Ly3/f;

    invoke-direct {v2, p2}, Ly3/f;-><init>(F)V

    sget p2, Lkd1/o$c;->f:I

    shl-int/lit8 p2, p2, 0x3

    or-int/lit16 v6, p2, 0x180

    const/16 v7, 0xc

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p3

    move-object v1, v0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lxi0/a;->f(Ll0/u;Lkd1/o;Ly3/f;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, p1}, Lp1/q;->q(Z)V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ZZLc0/q;)Lc0/l0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lyi0/d;->B(ZZ)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lti0/d;Lti0/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, Lti0/d;->c()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lc0/o;Lti0/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    check-cast p3, Lp1/q;

    if-nez p2, :cond_0

    const p0, 0x5d519e26

    invoke-virtual {p3, p0}, Lp1/q;->e0(I)V

    :goto_0
    invoke-virtual {p3, p1}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_0
    const v0, 0x769f893b

    invoke-virtual {p3, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 p4, p4, 0x3

    and-int/lit8 p4, p4, 0xe

    invoke-static {p2, p0, p3, p4}, Lxi0/b;->b(Lti0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_0

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lcom/whoop/design/models/ProgressButtonModel;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/ProgressButtonModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p2, Lri0/b$j;

    sget-object v0, Lyi0/a;->a:Lyi0/a;

    invoke-direct {p2, p0, v0}, Lri0/b$j;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lti0/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyi0/d;->m(Lti0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic z(Lp1/t2;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-static {p0}, Lyi0/d;->n(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method
