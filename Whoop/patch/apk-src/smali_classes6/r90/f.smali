.class public abstract Lr90/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aC\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a9\u0010\u0013\u001a\u00020\u00042\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000c\u001a\u00020\u00082\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lr90/g;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Lr90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectAllTitle",
        "",
        "isChecked",
        "analyticsName",
        "country",
        "x",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lr90/j;",
        "terms",
        "G",
        "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "termsInitialized",
        "showTermDetail",
        "enableButton",
        "activation_release"
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
.method private static final A(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lr90/f;->x(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic C(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lr90/f;->r(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic D(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lr90/f;->s(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic E(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lr90/f;->v(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic F(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lr90/f;->w(Lp1/c1;Z)V

    return-void
.end method

.method public static final G(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lr90/j;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v1, "terms"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "analyticsName"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr90/j;

    invoke-virtual {v5}, Lr90/j;->k()Z

    move-result v5

    if-nez v5, :cond_1

    move v2, v4

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lr90/j;

    invoke-virtual {v7}, Lr90/j;->c()Lr90/d;

    move-result-object v7

    sget-object v8, Lr90/d;->CONSENT_PROCESSING_OF_DATA:Lr90/d;

    if-ne v7, v8, :cond_3

    goto :goto_1

    :cond_4
    move-object v5, v6

    :goto_1
    check-cast v5, Lr90/j;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lr90/j;->k()Z

    move-result v1

    goto :goto_2

    :cond_5
    move v1, v4

    :goto_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lr90/j;

    invoke-virtual {v8}, Lr90/j;->c()Lr90/d;

    move-result-object v8

    sget-object v9, Lr90/d;->MARKETING_OPT_IN:Lr90/d;

    if-ne v8, v9, :cond_6

    goto :goto_3

    :cond_7
    move-object v7, v6

    :goto_3
    check-cast v7, Lr90/j;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lr90/j;->k()Z

    move-result v5

    move v11, v5

    goto :goto_4

    :cond_8
    move v11, v4

    :goto_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lr90/j;

    invoke-virtual {v7}, Lr90/j;->c()Lr90/d;

    move-result-object v7

    sget-object v8, Lr90/d;->RECOMMENDATION_OPT_IN:Lr90/d;

    if-ne v7, v8, :cond_9

    move-object v6, v5

    :cond_a
    check-cast v6, Lr90/j;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lr90/j;->k()Z

    move-result v4

    :cond_b
    move v0, v4

    if-eqz v2, :cond_c

    new-instance v2, Lh80/b$i;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "check_box"

    const-string v6, "select_all"

    const-string v7, "permissions"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    if-eqz v1, :cond_d

    new-instance v2, Lh80/b$i;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "check_box"

    const-string v6, "health_data"

    const-string v7, "permissions"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    if-eqz v11, :cond_e

    new-instance v2, Lh80/b$i;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "check_box"

    const-string v6, "marketing"

    const-string v7, "permissions"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    if-eqz v0, :cond_f

    new-instance v2, Lh80/b$i;

    const/16 v9, 0x22

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "check_box"

    const-string v6, "recommendation"

    const-string v7, "permissions"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    return-void
.end method

.method public static synthetic a(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr90/f;->A(Lc93/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr90/f;->z(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr90/f;->m(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr90/f;->p(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lr90/f;->B(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr90/f;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lr90/g;Lr90/j;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lr90/f;->o(Lkotlin/jvm/functions/Function1;Lr90/g;Lr90/j;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr90/f;->y(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lr90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr90/f;->q(Lr90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lr90/f;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lr90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr90/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x2e984559

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v9, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v9

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v10, 0x12

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v5, v10, :cond_5

    move v5, v11

    goto :goto_4

    :cond_5
    move v5, v12

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_31

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_6

    new-instance v3, Lr61/h;

    invoke-direct {v3, v2}, Lr61/h;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v2, v3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v8, v2

    goto :goto_5

    :cond_7
    move-object v8, v4

    :goto_5
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_8

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/4 v14, 0x0

    if-ne v3, v13, :cond_9

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v15, v3

    check-cast v15, Lp1/c1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_a

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lp1/c1;

    invoke-virtual {v1}, Lr90/g;->j()Lc31/k;

    move-result-object v4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v9, :cond_b

    move/from16 v16, v11

    goto :goto_6

    :cond_b
    move/from16 v16, v12

    :goto_6
    or-int v5, v5, v16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_c

    if-ne v10, v13, :cond_d

    :cond_c
    new-instance v10, Lr90/f$a;

    invoke-direct {v10, v1, v8, v14}, Lr90/f$a;-><init>(Lr90/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lc93/m;

    sget v5, Lc31/k;->r:I

    invoke-static {v7, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lr90/f;->r(Lp1/c1;)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    if-ne v6, v9, :cond_e

    move v5, v11

    goto :goto_7

    :cond_e
    move v5, v12

    :goto_7
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_f

    if-ne v10, v13, :cond_10

    :cond_f
    new-instance v10, Lr90/f$b;

    invoke-direct {v10, v8, v1, v2, v14}, Lr90/f$b;-><init>(Lkotlin/jvm/functions/Function1;Lr90/g;Lp1/c1;Lq83/d;)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v10, Lc93/m;

    invoke-static {v7, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr90/g;->o()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v6, v9, :cond_11

    move v5, v11

    goto :goto_8

    :cond_11
    move v5, v12

    :goto_8
    or-int/2addr v4, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_12

    if-ne v5, v13, :cond_13

    :cond_12
    new-instance v5, Lr90/f$c;

    invoke-direct {v5, v1, v8, v3, v14}, Lr90/f$c;-><init>(Lr90/g;Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lc93/m;

    invoke-static {v7, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lr90/f;->v(Lp1/c1;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-ne v6, v9, :cond_14

    move v4, v11

    goto :goto_9

    :cond_14
    move v4, v12

    :goto_9
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_15

    if-ne v5, v13, :cond_16

    :cond_15
    new-instance v5, Lr90/f$d;

    invoke-direct {v5, v8, v3, v14}, Lr90/f$d;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lc93/m;

    invoke-static {v7, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr90/g;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-ne v6, v9, :cond_17

    move v4, v11

    goto :goto_a

    :cond_17
    move v4, v12

    :goto_a
    or-int/2addr v3, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_18

    if-ne v4, v13, :cond_19

    :cond_18
    new-instance v4, Lr90/f$e;

    invoke-direct {v4, v1, v8, v14}, Lr90/f$e;-><init>(Lr90/g;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v4, Lc93/m;

    invoke-static {v7, v4, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v17, v2, v3

    const/4 v2, 0x7

    int-to-float v2, v2

    mul-float v18, v2, v3

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v7, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v5, 0xe

    invoke-static {v2, v4, v5}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->d:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v4, v5, v7, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v16, v15

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_1a

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_1a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v7, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_1b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1c

    :cond_1b
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr90/g;->g()Lkd1/o;

    move-result-object v2

    move v4, v3

    invoke-virtual {v1}, Lr90/g;->p()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move v5, v4

    invoke-virtual {v1}, Lr90/g;->n()Ljava/lang/String;

    move-result-object v4

    sget v11, Lkd1/o;->a:I

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v14, 0x3

    or-int/2addr v11, v14

    move v14, v5

    move-object v5, v7

    const/4 v7, 0x0

    move v15, v11

    move v11, v6

    move v6, v15

    move/from16 v15, v17

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lr90/g;->l()Ljava/lang/String;

    move-result-object v2

    const-string v15, ""

    if-nez v2, :cond_1d

    const v2, 0x587a71cf

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-object v4, v8

    goto/16 :goto_e

    :cond_1d
    const v2, 0x587a71d0

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lr90/g;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lr90/g;->o()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_1f

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1f

    :cond_1e
    const/4 v3, 0x1

    goto :goto_c

    :cond_1f
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_20
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr90/j;

    invoke-virtual {v4}, Lr90/j;->k()Z

    move-result v4

    if-nez v4, :cond_20

    move v3, v12

    :goto_c
    invoke-virtual {v1}, Lr90/g;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lr90/g;->o()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr90/j;

    if-eqz v6, :cond_21

    invoke-virtual {v6}, Lr90/j;->i()Ljava/lang/String;

    move-result-object v6

    goto :goto_d

    :cond_21
    const/4 v6, 0x0

    :goto_d
    if-nez v6, :cond_22

    move-object v6, v15

    :cond_22
    shl-int/lit8 v7, v0, 0x9

    const v17, 0xe000

    and-int v7, v7, v17

    move/from16 v22, v7

    move-object v7, v5

    move-object v5, v6

    move-object v6, v8

    move/from16 v8, v22

    invoke-static/range {v2 .. v8}, Lr90/f;->x(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v6

    move-object v5, v7

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_e
    const v2, 0x3ca94bb8

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lr90/g;->o()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_24

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr90/j;

    invoke-virtual {v1}, Lr90/g;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_23

    new-instance v6, Lq12/c;

    move-object/from16 v7, v16

    const/4 v9, 0x6

    invoke-direct {v6, v9, v7}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_23
    move-object/from16 v7, v16

    const/4 v9, 0x6

    :goto_10
    check-cast v6, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v9, v0, 0x3

    and-int/lit16 v9, v9, 0x380

    or-int/lit16 v9, v9, 0xc00

    move-object/from16 v22, v6

    move-object v6, v5

    move-object/from16 v5, v22

    move/from16 v22, v9

    move-object v9, v7

    move/from16 v7, v22

    invoke-static/range {v2 .. v7}, Lr90/c;->h(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v6

    move-object/from16 v16, v9

    const/16 v9, 0x20

    goto :goto_f

    :cond_24
    move-object v7, v5

    move-object/from16 v9, v16

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-static {v9}, Lr90/f;->t(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_25

    const v0, 0x58859325

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v11, v4

    move-object v5, v7

    goto/16 :goto_19

    :cond_25
    const v2, 0x58859326

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lr90/g;->o()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lr90/j;

    invoke-virtual {v5}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    goto :goto_11

    :cond_27
    const/4 v3, 0x0

    :goto_11
    check-cast v3, Lr90/j;

    if-nez v3, :cond_28

    const v0, 0x74b0429c

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v11, v4

    move-object v5, v7

    goto/16 :goto_18

    :cond_28
    const v2, 0x74b0429d

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lr90/g;->h()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lr90/g;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_29

    :goto_12
    const/16 v2, 0x20

    goto :goto_13

    :cond_29
    move-object v15, v2

    goto :goto_12

    :goto_13
    if-ne v11, v2, :cond_2a

    const/4 v2, 0x1

    goto :goto_14

    :cond_2a
    move v2, v12

    :goto_14
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2b

    if-ne v5, v13, :cond_2c

    :cond_2b
    new-instance v5, Lp90/h;

    const/16 v2, 0x15

    invoke-direct {v5, v4, v2}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object/from16 v17, v5

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v2, 0x20

    if-ne v11, v2, :cond_2d

    const/4 v2, 0x1

    goto :goto_15

    :cond_2d
    move v2, v12

    :goto_15
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2e

    if-ne v5, v13, :cond_2f

    :cond_2e
    move-object v6, v4

    move-object v4, v0

    goto :goto_16

    :cond_2f
    move-object v1, v3

    move-object v11, v4

    move-object v0, v5

    move-object v5, v9

    goto :goto_17

    :goto_16
    new-instance v0, La00/h;

    move-object v1, v6

    const/16 v6, 0x13

    move-object/from16 v2, p0

    move-object v5, v9

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v11, v1

    move-object v1, v3

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v0, Lc93/a;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_30

    new-instance v2, Lo0/i;

    const/16 v3, 0x12

    invoke-direct {v2, v3, v5}, Lo0/i;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    move-object v6, v2

    check-cast v6, Lc93/a;

    move-object v2, v8

    const/high16 v8, 0x30000

    const/4 v9, 0x0

    move-object v5, v0

    move-object v3, v15

    move-object/from16 v4, v17

    invoke-static/range {v1 .. v9}, Lr90/h;->k(Lr90/j;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_19
    const/16 v0, 0x11

    int-to-float v0, v0

    const/4 v1, 0x1

    invoke-static {v0, v14, v10, v5, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    move-object v3, v11

    goto :goto_1a

    :cond_31
    move-object v5, v7

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_1a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_32

    new-instance v0, Lqk2/i;

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lr90/f;->u(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lr90/g;Lr90/j;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 9

    new-instance v0, Lh80/b$i;

    invoke-virtual {p1}, Lr90/g;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lr90/j;->d()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v3, "toLowerCase(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ll83/k;

    const-string v5, "consent"

    invoke-direct {v4, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lr90/j;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ll83/k;

    const-string v2, "country"

    invoke-direct {p2, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    const-string v3, "accepted_terms"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, p2, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "check_box"

    const-string v4, "select_one"

    const-string v5, "permissions"

    invoke-direct/range {v0 .. v8}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lj80/d$a;

    invoke-direct {p1, p3}, Lj80/d$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p4, p0}, Lr90/f;->u(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lr90/f;->u(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lr90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lr90/f;->k(Lr90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Z
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

.method private static final s(Lp1/c1;Z)V
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

.method private static final t(Lp1/c1;)Ljava/lang/String;
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

.method private static final u(Lp1/c1;Ljava/lang/String;)V
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

.method private static final v(Lp1/c1;)Z
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

.method private static final w(Lp1/c1;Z)V
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

.method public static final x(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v12, p2

    move-object/from16 v13, p3

    move-object/from16 v14, p4

    move/from16 v15, p6

    const-string v2, "selectAllTitle"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "analyticsName"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "country"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onViewEvent"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p5

    check-cast v9, Lp1/q;

    const v2, 0xa39aeb1

    invoke-virtual {v9, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v15, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v15

    goto :goto_1

    :cond_1
    move v2, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v9, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v15, 0x180

    const/16 v7, 0x100

    if-nez v5, :cond_5

    invoke-virtual {v9, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v7

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v2, v5

    :cond_5
    and-int/lit16 v5, v15, 0xc00

    const/16 v8, 0x800

    if-nez v5, :cond_7

    invoke-virtual {v9, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move v5, v8

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v2, v5

    :cond_7
    and-int/lit16 v5, v15, 0x6000

    const/16 v10, 0x4000

    if-nez v5, :cond_9

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move v5, v10

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v2, v5

    :cond_9
    move v11, v2

    and-int/lit16 v2, v11, 0x2493

    const/16 v5, 0x2492

    const/16 v16, 0x0

    if-eq v2, v5, :cond_a

    const/4 v2, 0x1

    goto :goto_6

    :cond_a
    move/from16 v2, v16

    :goto_6
    and-int/lit8 v5, v11, 0x1

    invoke-virtual {v9, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_19

    const v2, 0xe000

    and-int/2addr v2, v11

    if-ne v2, v10, :cond_b

    const/4 v2, 0x1

    goto :goto_7

    :cond_b
    move/from16 v2, v16

    :goto_7
    and-int/lit16 v5, v11, 0x380

    if-ne v5, v7, :cond_c

    const/4 v5, 0x1

    goto :goto_8

    :cond_c
    move/from16 v5, v16

    :goto_8
    or-int/2addr v2, v5

    and-int/lit16 v5, v11, 0x1c00

    if-ne v5, v8, :cond_d

    const/4 v5, 0x1

    goto :goto_9

    :cond_d
    move/from16 v5, v16

    :goto_9
    or-int/2addr v2, v5

    and-int/lit8 v5, v11, 0x70

    if-ne v5, v6, :cond_e

    const/16 v16, 0x1

    :cond_e
    or-int v2, v2, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_f

    if-ne v5, v6, :cond_10

    :cond_f
    new-instance v5, Lpj2/j;

    invoke-direct {v5, v14, v12, v13, v1}, Lpj2/j;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lc93/a;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v8, "SelectAllRow"

    invoke-static {v2, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_11

    if-ne v8, v6, :cond_12

    :cond_11
    new-instance v8, Lot1/e;

    const/16 v2, 0x15

    invoke-direct {v8, v5, v2}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v8

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v27, v5

    invoke-virtual/range {v16 .. v16}, Ly81/i;->W0()J

    move-result-wide v4

    const-wide/high16 v0, 0x3ffc000000000000L    # 1.75

    double-to-float v0, v0

    int-to-float v1, v3

    invoke-static {v2, v0, v1, v4, v5}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v0, 0x1

    int-to-float v2, v0

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v17, v2, v3

    const/16 v19, 0x0

    const/16 v21, 0x4

    move/from16 v18, v17

    move/from16 v20, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/4 v5, 0x2

    int-to-float v5, v5

    const/16 v0, 0x36

    invoke-static {v5, v3, v4, v9, v0}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v3, v9, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 p5, v11

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_13

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    :cond_14
    invoke-static {v3, v9, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x7

    int-to-float v0, v0

    mul-float/2addr v0, v1

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    invoke-static {v0, v2, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v18

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v20

    const/16 v25, 0x0

    const/16 v26, 0x18

    const-wide/16 v22, 0x0

    move-object/from16 v24, v9

    invoke-static/range {v16 .. v26}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v5

    move-object/from16 v0, v27

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_16

    if-ne v2, v6, :cond_17

    :cond_16
    new-instance v2, Lpy0/a;

    const/16 v1, 0x11

    invoke-direct {v2, v0, v1}, Lpy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v2, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, p5, 0x3

    and-int/lit8 v7, v0, 0xe

    const/16 v8, 0x18

    const/4 v4, 0x0

    move/from16 v1, p1

    move-object v6, v9

    const/4 v0, 0x1

    invoke-static/range {v1 .. v8}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    const/high16 v1, 0x41200000    # 10.0f

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_18

    goto :goto_b

    :cond_18
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v1, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit8 v10, p5, 0xe

    const/16 v11, 0x1fc

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v12, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v11}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_19
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1a

    new-instance v0, Lb30/j2;

    const/16 v7, 0xc

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v13

    move-object v5, v14

    move v6, v15

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Z)Ll83/a0;
    .locals 9

    new-instance v0, Lh80/b$i;

    new-instance v1, Ll83/k;

    const-string v2, "country"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    xor-int/lit8 p2, p3, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance v2, Ll83/k;

    const-string v3, "selected_all"

    invoke-direct {v2, v3, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "check_box"

    const-string v4, "select_all"

    const-string v5, "permissions"

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    sget-object p1, Lj80/d$b;->a:Lj80/d$b;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p1, Lj80/d$e;->a:Lj80/d$e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
