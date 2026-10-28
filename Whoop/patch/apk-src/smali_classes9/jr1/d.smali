.class public abstract Ljr1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aG\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017\u00b2\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0016\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lgr1/q;",
        "viewState",
        "Lkotlin/Function1;",
        "Lgr1/n;",
        "Ll83/a0;",
        "onViewEvent",
        "Lfr1/c;",
        "onNavigationEvent",
        "x",
        "(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lgr1/b;",
        "detailsScreen",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "M",
        "(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function0;",
        "onClick",
        "t",
        "(Lgr1/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isBackFromConnect",
        "showDisconnectDialog",
        "integrations_release"
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
.method private static final A(Lp1/c1;Z)V
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

.method private static final B(Lp1/c1;)Z
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

.method private static final C(Lp1/c1;Z)V
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

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Lfr1/c$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lfr1/c$a;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x5859328e

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lp1/q;->q(Z)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lhr1/a;->l(Ljava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Lfr1/c$g;

    invoke-direct {v0, p1}, Lfr1/c$g;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x4c635305    # 5.95917E7f

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final H(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 7

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lhr1/a;->l(Ljava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    move-object v0, p3

    goto :goto_1

    :cond_0
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p3

    sget-object v1, Lcom/whoop/navigation/AppScreen$a3;->w:Lcom/whoop/navigation/AppScreen$a3;

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance v1, Lcom/whoop/navigation/IntegrationsScreenModel;

    invoke-virtual {p0}, Lgr1/b;->q()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/IntegrationsScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    goto :goto_2

    :cond_1
    const/4 p0, 0x1

    invoke-static {p2, p0}, Ljr1/d;->A(Lp1/c1;Z)V

    :goto_2
    new-instance p0, Lfr1/c$g;

    invoke-direct {p0, v0}, Lfr1/c$g;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lgr1/b;->e()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    new-instance p3, Lgr1/n$d;

    invoke-virtual {p0}, Lgr1/b;->x()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p3, p0}, Lgr1/n$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, v1}, Ljr1/d;->C(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    new-instance p2, Lgr1/n$a;

    invoke-virtual {p0}, Lgr1/b;->x()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lgr1/n$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lgr1/b;->g()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lgr1/b;->y()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lgr1/b;->w()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    new-instance p4, Lfr1/c$h;

    invoke-virtual {p0}, Lgr1/b;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lgr1/b;->e()Z

    move-result p0

    invoke-direct {p4, p1, p2, v0, p0}, Lfr1/c$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {p4, v1}, Ljr1/d;->A(Lp1/c1;Z)V

    new-instance p0, Lfr1/c$b;

    invoke-direct {p0, p1}, Lfr1/c$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljr1/d;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lkotlin/jvm/functions/Function1;Lgr1/b;)Ll83/a0;
    .locals 2

    new-instance v0, Lgr1/n$c;

    invoke-virtual {p1}, Lgr1/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lgr1/b;->x()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lgr1/n$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ljr1/d;->x(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final M(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "detailsScreen"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, -0x74652605

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v6, 0x4

    const/4 v14, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, v14

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_2a

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v8, v14

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v17, v8, v11

    int-to-float v6, v6

    mul-float v20, v6, v11

    const/16 v21, 0x2

    const/16 v18, 0x0

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v14, v20

    invoke-static/range {v17 .. v17}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v7, v9, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v9, v10, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v5, v6

    invoke-virtual {v1}, Lgr1/b;->p()Lkd1/o;

    move-result-object v6

    move-object/from16 v28, v10

    sget v10, Lkd1/o;->a:I

    move v8, v11

    const/4 v11, 0x3

    move-object v9, v7

    const/4 v7, 0x0

    move/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v32, v5

    move-object/from16 v33, v9

    move/from16 v5, v22

    move-object/from16 v9, v28

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    sget-wide v9, Li2/x;->n:J

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v11, v12

    const/16 v12, 0xdb0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v36, v11

    move-object/from16 v35, v16

    move-object/from16 v37, v17

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v38, v9

    move-object v10, v11

    invoke-virtual {v1}, Lgr1/b;->z()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v8, v10, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->N()Lb91/a;

    move-result-object v26

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v30, v13, 0x12

    const v31, 0x2fffa

    move v13, v7

    const/4 v7, 0x0

    move/from16 v16, v9

    move-object/from16 v28, v10

    move-wide/from16 v50, v11

    move-object v12, v8

    move-wide/from16 v8, v50

    const-wide/16 v10, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    const/16 v25, 0x20

    const/16 v18, 0x0

    move/from16 v29, v19

    move/from16 v27, v20

    const-wide/16 v19, 0x0

    const/16 v40, 0x6

    const/16 v21, 0x0

    move-object/from16 v41, v22

    const/16 v22, 0x0

    move/from16 v42, v23

    const/16 v23, 0x0

    move-object/from16 v43, v24

    const/16 v24, 0x0

    move/from16 v44, v25

    const/16 v25, 0x0

    move/from16 v45, v27

    const/16 v27, 0x0

    move/from16 v46, v29

    const/16 v29, 0x0

    move/from16 v47, v5

    move-object/from16 v5, v41

    move/from16 v3, v42

    move-object/from16 v1, v43

    move/from16 v2, v46

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->e()Z

    move-result v6

    if-nez v6, :cond_c

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-eqz v6, :cond_d

    :cond_c
    const/4 v14, 0x0

    goto :goto_7

    :cond_d
    const v4, 0x2516b9fd

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move v5, v14

    move-object/from16 v48, v37

    const/4 v7, 0x1

    goto/16 :goto_d

    :goto_7
    const v6, 0x25057022

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    move-object/from16 v15, v37

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v7, v10, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    move-object/from16 v11, v35

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v33

    invoke-static {v10, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    :cond_f
    move-object/from16 v11, v36

    invoke-static {v8, v10, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->e()Z

    move-result v4

    if-eqz v4, :cond_11

    const v4, 0x41ab5e81

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    new-instance v6, Lkd1/o$a;

    sget v4, Lzq1/a;->a:I

    invoke-direct {v6, v4}, Lkd1/o$a;-><init>(I)V

    move-object/from16 v28, v10

    sget v10, Lkd1/o$a;->c:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, v28

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move/from16 v16, v12

    const/16 v12, 0xc30

    const/4 v13, 0x4

    move/from16 v4, v16

    move-object/from16 v11, v28

    move-wide/from16 v9, v38

    invoke-static/range {v6 .. v13}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    const/4 v5, 0x1

    int-to-float v6, v5

    mul-float v6, v6, v47

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->j()J

    move-result-wide v8

    invoke-virtual {v1, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->t()Lb91/a;

    move-result-object v26

    const/16 v29, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const-wide/16 v15, 0x0

    move/from16 v34, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v5, v34

    move-object/from16 v48, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_11
    move v4, v12

    move v5, v14

    move-object/from16 v48, v15

    const v6, 0x41b43d9e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_9
    float-to-double v6, v4

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_12

    goto :goto_a

    :cond_12
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_13

    const v4, 0x41b5a961

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v7, 0x1

    goto :goto_c

    :cond_13
    const v6, 0x41b5a962

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-static {v4, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v1, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->t()Lb91/a;

    move-result-object v26

    const/16 v29, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_d
    int-to-float v4, v7

    mul-float v11, v4, v47

    move-object/from16 v6, v48

    invoke-static {v11, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v1, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    const/16 v29, 0x0

    const v31, 0x2fffa

    move-object/from16 v37, v6

    move-object v6, v7

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v3, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->i()Lm91/u;

    move-result-object v6

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_14

    const v6, 0x251ae71f

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v15, p2

    const/16 v14, 0x100

    goto :goto_11

    :cond_14
    const v7, 0x251ae720

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v7, v0, 0x380

    const/16 v14, 0x100

    if-ne v7, v14, :cond_15

    const/4 v7, 0x1

    goto :goto_e

    :cond_15
    move v7, v5

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_17

    if-ne v8, v13, :cond_16

    goto :goto_f

    :cond_16
    move-object/from16 v15, p2

    goto :goto_10

    :cond_17
    :goto_f
    new-instance v8, Ljp1/n;

    const/4 v7, 0x2

    move-object/from16 v15, p2

    invoke-direct {v8, v15, v7}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v9, v8

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lgr1/b;->s()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_18

    const v1, 0x2521506d

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object/from16 v37, v3

    move/from16 v23, v4

    move-object v4, v13

    move v3, v14

    move-object v2, v15

    move/from16 v49, v32

    goto/16 :goto_14

    :cond_18
    const v6, 0x2521506e

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    sget-object v7, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v6, Ly71/g;

    invoke-static {v1}, Lih0/d0;->E(Lx81/d;)I

    move-result v1

    const/4 v9, 0x0

    const/4 v11, 0x2

    invoke-direct {v6, v1, v9, v11, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, -0x3

    int-to-float v1, v1

    mul-float v1, v1, v32

    const/4 v9, 0x0

    invoke-static {v3, v1, v9, v11}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit16 v9, v0, 0x380

    if-ne v9, v14, :cond_19

    const/4 v9, 0x1

    :goto_12
    move-object v11, v6

    move-object v6, v1

    move-object/from16 v1, p0

    goto :goto_13

    :cond_19
    move v9, v5

    goto :goto_12

    :goto_13
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_1a

    if-ne v12, v13, :cond_1b

    :cond_1a
    new-instance v12, Ljp1/c;

    const/4 v9, 0x3

    invoke-direct {v12, v9, v15, v1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v18, v12

    check-cast v18, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v2, v2, 0x6

    or-int/lit8 v2, v2, 0x36

    sget v9, Ly71/g;->c:I

    shl-int/lit8 v9, v9, 0xc

    or-int v20, v2, v9

    const/16 v21, 0x0

    const/16 v22, 0xfe8

    const/4 v9, 0x0

    move-object/from16 v28, v10

    move-object v10, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v2, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v37, v3

    move/from16 v23, v4

    move/from16 v3, v19

    move-object/from16 v19, v28

    move/from16 v49, v32

    move-object v4, v2

    move-object/from16 v2, p2

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v19

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v1}, Lgr1/b;->j()Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_1c

    const v6, 0x252840a1

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v15, p1

    const/16 v14, 0x20

    goto :goto_1a

    :cond_1c
    const v7, 0x252840a2

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_15
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/u;

    and-int/lit8 v7, v0, 0x70

    const/16 v14, 0x20

    if-ne v7, v14, :cond_1d

    const/4 v7, 0x1

    goto :goto_16

    :cond_1d
    move v7, v5

    :goto_16
    and-int/lit16 v8, v0, 0x380

    if-ne v8, v3, :cond_1e

    const/4 v8, 0x1

    goto :goto_17

    :cond_1e
    move v8, v5

    :goto_17
    or-int/2addr v7, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_20

    if-ne v8, v4, :cond_1f

    goto :goto_18

    :cond_1f
    move-object/from16 v15, p1

    goto :goto_19

    :cond_20
    :goto_18
    new-instance v8, Lb70/c;

    const/4 v7, 0x5

    move-object/from16 v15, p1

    invoke-direct {v8, v15, v7, v2}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    move-object v9, v8

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_15

    :cond_21
    move-object/from16 v15, p1

    const/16 v14, 0x20

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v1}, Lgr1/b;->v()Lgr1/s;

    move-result-object v6

    if-nez v6, :cond_22

    const v6, 0x25314203

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_22
    const v7, 0x25314204

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v7, v0, 0x70

    if-ne v7, v14, :cond_23

    const/4 v13, 0x1

    goto :goto_1b

    :cond_23
    move v13, v5

    :goto_1b
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_24

    if-ne v8, v4, :cond_25

    :cond_24
    new-instance v8, Lj21/d;

    invoke-direct {v8, v15, v1}, Lj21/d;-><init>(Lkotlin/jvm/functions/Function1;Lgr1/b;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v7, v8

    check-cast v7, Lc93/m;

    move-object/from16 v28, v10

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v11, 0x4

    const/4 v8, 0x0

    move-object/from16 v9, v28

    invoke-static/range {v6 .. v11}, Lkr1/d;->i(Lgr1/s;Lc93/m;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v9

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual {v1}, Lgr1/b;->A()Lm91/u;

    move-result-object v6

    if-nez v6, :cond_26

    const v0, 0x2538b7a9

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v13, v37

    :goto_1d
    move/from16 v0, v23

    move/from16 v5, v49

    const/4 v7, 0x1

    goto :goto_1f

    :cond_26
    const v7, 0x2538b7aa

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    move-object/from16 v13, v37

    move/from16 v14, v45

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v7, v6

    check-cast v7, Ld11/i;

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v3, :cond_27

    const/4 v0, 0x1

    goto :goto_1e

    :cond_27
    move v0, v5

    :goto_1e
    or-int/2addr v0, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_28

    if-ne v3, v4, :cond_29

    :cond_28
    new-instance v3, Lj11/q;

    const/16 v0, 0xa

    invoke-direct {v3, v6, v2, v0}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object v9, v3

    check-cast v9, Lc93/a;

    const/4 v11, 0x0

    const/4 v12, 0x6

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Ld11/f;->k(Ld11/i;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1f
    invoke-static {v0, v5, v13, v10, v7}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_20

    :cond_2a
    move-object v15, v2

    move-object v2, v3

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_20
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2b

    new-instance v0, Lj41/a;

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object v3, v2

    move-object v2, v15

    invoke-direct/range {v0 .. v5}, Lj41/a;-><init>(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lhr1/a;->l(Ljava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Lfr1/c$g;

    invoke-direct {v0, p1}, Lfr1/c$g;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lfr1/c$f;

    invoke-virtual {p1}, Lgr1/b;->s()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lfr1/c$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_0

    new-instance p1, Lgr1/n$l;

    check-cast p2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {p1, p2}, Lgr1/n$l;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-static {p2}, Lhr1/a;->l(Ljava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p2

    sget-object v0, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    new-instance p2, Lfr1/c$g;

    invoke-direct {p2, p0}, Lfr1/c$g;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/String;Z)Ll83/a0;
    .locals 1

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgr1/n$m;

    invoke-virtual {p1}, Lgr1/b;->q()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Lgr1/n$m;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    check-cast p0, Ld11/i;

    invoke-virtual {p0}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lfr1/c$g;

    invoke-direct {v0, p0}, Lfr1/c$g;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Ljr1/d;->M(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic T(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Ljr1/d;->z(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic U(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Ljr1/d;->A(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ljr1/d;->G(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljr1/d;->Q(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ljr1/d;->N(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljr1/d;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljr1/d;->S(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ljr1/d;->E(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljr1/d;->J(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljr1/d;->O(Lkotlin/jvm/functions/Function1;Lgr1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ljr1/d;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljr1/d;->P(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljr1/d;->H(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lgr1/b;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr1/d;->w(Lgr1/b;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljr1/d;->u(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljr1/d;->v(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljr1/d;->L(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Lgr1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljr1/d;->K(Lkotlin/jvm/functions/Function1;Lgr1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljr1/d;->I(Lgr1/b;Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljr1/d;->y(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljr1/d;->R(Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lgr1/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/b;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "detailsScreen"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, 0x6b23d642

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v15, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v15

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v4, v6, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    move v4, v8

    :goto_3
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v12, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_14

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v4, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v18, v4, v9

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lgr1/b;->u()Lm91/u;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x6

    if-eqz v9, :cond_d

    const v6, -0x5c50d6a6

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    :cond_6
    invoke-static {v9, v12, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lny0/n0;->TextLarge:Lny0/n0;

    invoke-virtual {v0}, Lgr1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lgr1/b;->e()Z

    move-result v9

    if-eqz v9, :cond_9

    const v9, -0x74ca2fd0

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_8

    sget-object v9, Ljr1/d$a;->w:Ljr1/d$a;

    :goto_5
    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v9, -0x74ca2bee

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_8

    sget-object v9, Ljr1/d$b;->w:Ljr1/d$b;

    goto :goto_5

    :goto_6
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v5, :cond_a

    move v3, v7

    goto :goto_7

    :cond_a
    move v3, v8

    :goto_7
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_b

    if-ne v5, v10, :cond_c

    :cond_b
    new-instance v5, Lh0/l0;

    const/16 v3, 0xc

    invoke-direct {v5, v1, v3}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v16, v5

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v3, v11

    or-int/lit8 v18, v3, 0x30

    const/16 v19, 0x0

    const/16 v20, 0xfb9

    move-object v5, v4

    const/4 v4, 0x0

    move v3, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move v11, v10

    move-object v10, v9

    const/4 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v0, v21

    invoke-static/range {v4 .. v20}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v17

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_d
    move/from16 v16, v7

    move v0, v8

    const v7, -0x5c4b7345

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v7, Lg1/v0;->a:Ll0/l1;

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->e()Z

    move-result v7

    if-eqz v7, :cond_e

    const v7, 0x4f9a96e7    # 5.1871616E9f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->o()J

    move-result-wide v13

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    const v7, 0x4f9a9c00    # 5.18783E9f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v7, v12, v9, v0}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lgr1/b;->e()Z

    move-result v7

    if-eqz v7, :cond_f

    const v7, 0x4f9aa57d

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v18

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    const v7, 0x4f9aa960

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-static {v7, v12, v9, v0}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v18

    :goto_9
    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v7, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->X0()J

    move-result-wide v20

    invoke-virtual {v7, v12, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->W0()J

    move-result-wide v22

    move/from16 v24, v5

    move-wide/from16 v28, v13

    move-object v14, v4

    move-wide/from16 v4, v28

    const/4 v13, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object v0, v7

    move/from16 v26, v9

    move-object/from16 v27, v10

    move-wide/from16 v10, v20

    move-wide/from16 v28, v18

    move/from16 v19, v6

    move/from16 v18, v8

    move-wide/from16 v6, v28

    move-wide/from16 v8, v22

    invoke-static/range {v4 .. v14}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lgr1/b;->e()Z

    move-result v4

    if-eqz v4, :cond_10

    const v4, 0x4f9ac223

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v15

    move/from16 v5, v26

    invoke-virtual {v0, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_a
    move-object v13, v0

    goto :goto_b

    :cond_10
    const/4 v13, 0x0

    const v0, -0x5c41bd19

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_a

    :goto_b
    and-int/lit8 v0, v3, 0x70

    const/16 v3, 0x20

    if-ne v0, v3, :cond_11

    move/from16 v7, v16

    goto :goto_c

    :cond_11
    const/4 v7, 0x0

    :goto_c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v7, :cond_13

    move-object/from16 v3, v27

    if-ne v0, v3, :cond_12

    goto :goto_d

    :cond_12
    const/4 v3, 0x6

    goto :goto_e

    :cond_13
    :goto_d
    new-instance v0, Liy0/a;

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v0, Lc93/a;

    shl-int/lit8 v4, v18, 0x12

    or-int/lit8 v19, v4, 0x6

    const/16 v20, 0x0

    const/16 v21, 0x1d3e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v10, v17

    move-object/from16 v4, v25

    move-object/from16 v17, v0

    invoke-static/range {v4 .. v21}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v18

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_14
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_15

    new-instance v3, Lig0/d;

    const/16 v4, 0xe

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final u(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lgr1/b;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ljr1/d;->t(Lgr1/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgr1/q;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, -0x58a97801

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v13, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v13

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    move v15, v0

    and-int/lit16 v0, v15, 0x93

    const/16 v5, 0x92

    const/4 v9, 0x0

    if-eq v0, v5, :cond_6

    const/4 v0, 0x1

    goto :goto_4

    :cond_6
    move v0, v9

    :goto_4
    and-int/lit8 v5, v15, 0x1

    invoke-virtual {v7, v5, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-virtual {v1}, Lgr1/q;->d()Lgr1/c;

    move-result-object v0

    if-eqz v0, :cond_7

    const v0, 0x4ec22142

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v15, 0x3fe

    invoke-static {v1, v2, v3, v7, v0}, Ljr1/e;->o(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_35

    new-instance v0, Ljr1/c;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Ljr1/c;-><init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    :goto_5
    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    const v0, 0x4ec4f5c3

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v2, v7, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    :cond_9
    invoke-static {v2, v7, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v7, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v3

    invoke-virtual {v1}, Lgr1/q;->c()Lgr1/b;

    move-result-object v3

    if-nez v3, :cond_b

    const v0, -0x670463e5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    move-object v4, v7

    move/from16 v34, v15

    const/4 v2, 0x1

    goto/16 :goto_29

    :cond_b
    const v4, -0x670463e4

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v4, v12, :cond_c

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lp1/c1;

    sget-object v14, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    and-int/lit8 v9, v15, 0x70

    if-ne v9, v13, :cond_d

    const/16 v18, 0x1

    goto :goto_7

    :cond_d
    const/16 v18, 0x0

    :goto_7
    or-int v16, v16, v18

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v16, :cond_e

    if-ne v13, v12, :cond_f

    :cond_e
    move-object v13, v0

    goto :goto_8

    :cond_f
    move-object v1, v3

    move/from16 v16, v9

    move/from16 v26, v15

    move-object v9, v0

    move-object v15, v2

    move-object v0, v13

    move-object v13, v5

    goto :goto_9

    :goto_8
    new-instance v0, Ljr1/d$c;

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v26, v16

    move/from16 v16, v9

    move-object v9, v13

    move-object/from16 v13, v26

    move/from16 v26, v15

    move-object v15, v2

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Ljr1/d$c;-><init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lgr1/b;Lp1/c1;Lq83/d;)V

    move-object v1, v3

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v0, Lkotlin/jvm/functions/Function3;

    const/4 v2, 0x6

    invoke-static {v14, v0, v7, v2}, Lkd1/e;->d(Landroidx/lifecycle/v;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_10

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v0

    check-cast v14, Lp1/c1;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v6, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object v6, v4

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-eqz v0, :cond_11

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v7, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    :cond_12
    invoke-static {v3, v7, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v7, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v1

    invoke-virtual {v3}, Lgr1/b;->c()Lkd1/o;

    move-result-object v1

    sget v5, Lkd1/o;->a:I

    move-object v4, v6

    const/4 v6, 0x3

    const/4 v2, 0x0

    move-object v0, v3

    const/4 v3, 0x0

    move-object/from16 v17, v7

    move-object v7, v4

    move-object/from16 v4, v17

    const/16 v17, 0x0

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v5, v9

    const/16 v9, 0x61b0

    move-object v6, v10

    const/16 v10, 0x68

    move/from16 v18, v2

    const/4 v2, 0x0

    move-object/from16 v29, v4

    const/4 v4, 0x0

    move-object/from16 v19, v5

    sget-object v5, Ly2/j;->d:Ly2/b1;

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v28, v12

    move-object/from16 v27, v14

    move/from16 v35, v16

    move/from16 v12, v18

    move-object/from16 v14, v19

    move-object/from16 v34, v21

    move-object/from16 v16, v0

    move-object v0, v8

    move-object/from16 v8, v29

    move-object/from16 v29, v11

    move-object/from16 v11, v20

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v10, v12, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_14

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_14
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v4, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_d

    :cond_15
    :goto_c
    move-object/from16 v2, v29

    goto :goto_e

    :cond_16
    :goto_d
    invoke-static {v3, v4, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v36, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget v1, Lzq1/b;->a:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v37

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-static {v1}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v39

    const v53, 0xfff2

    const/16 v54, 0x0

    const/16 v38, 0x0

    const-string v40, "Back button"

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

    const/16 v52, 0x0

    invoke-direct/range {v36 .. v54}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v11}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v3, v26

    and-int/lit16 v5, v3, 0x380

    const/16 v6, 0x100

    if-ne v5, v6, :cond_17

    const/4 v8, 0x1

    goto :goto_f

    :cond_17
    const/4 v8, 0x0

    :goto_f
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v7, v28

    if-nez v8, :cond_19

    if-ne v6, v7, :cond_18

    goto :goto_10

    :cond_18
    move-object/from16 v9, p2

    goto :goto_11

    :cond_19
    :goto_10
    new-instance v6, Ljp1/l;

    const/4 v8, 0x6

    move-object/from16 v9, p2

    invoke-direct {v6, v9, v8}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v6, Lc93/a;

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move/from16 v26, v3

    const/4 v3, 0x3

    shl-int/2addr v8, v3

    const/16 v9, 0x34

    move/from16 v17, v3

    const/4 v3, 0x0

    move/from16 v19, v5

    const/4 v5, 0x0

    move-object/from16 v29, v4

    move-object v4, v6

    const/4 v6, 0x0

    move/from16 v28, v26

    move-object/from16 v26, v15

    move/from16 v15, v28

    move-object/from16 v55, v2

    move-object/from16 v57, v7

    move-object/from16 v28, v14

    move/from16 v14, v17

    move/from16 v56, v19

    move-object/from16 v7, v29

    move-object/from16 v2, v36

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    move-object v4, v7

    invoke-virtual/range {p0 .. p0}, Lgr1/q;->c()Lgr1/b;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v4, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    const/16 v3, 0xe

    invoke-static {v11, v5, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_1a

    goto :goto_12

    :cond_1a
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    invoke-static {v3, v2, v5}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit16 v5, v15, 0x3f0

    move-object/from16 v2, p2

    move-object v6, v1

    move-object/from16 v8, v16

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v5}, Ljr1/d;->M(Lgr1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v2

    invoke-virtual {v8}, Lgr1/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lgr1/b;->o()Lm91/u;

    move-result-object v2

    if-nez v2, :cond_1c

    invoke-virtual {v8}, Lgr1/b;->u()Lm91/u;

    move-result-object v2

    if-nez v2, :cond_1c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1b

    invoke-virtual {v8}, Lgr1/b;->e()Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-virtual {v8}, Lgr1/b;->g()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1c

    :cond_1b
    const/4 v2, 0x0

    goto :goto_13

    :cond_1c
    const/4 v2, 0x1

    :goto_13
    invoke-static {v11}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v2, :cond_1d

    int-to-float v2, v14

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v18, v2, v5

    const/4 v2, 0x1

    int-to-float v7, v2

    mul-float v20, v7, v5

    const/16 v21, 0x5

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v11

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v14, v0

    move v7, v1

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    mul-float/2addr v0, v5

    const/4 v1, 0x0

    const/4 v5, 0x2

    invoke-static {v2, v0, v1, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_14

    :cond_1d
    move-object v14, v0

    move v7, v1

    move-object v0, v11

    :goto_14
    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v10, v12, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-eqz v5, :cond_1e

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1e
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v28

    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_1f

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_20

    :cond_1f
    move-object/from16 v1, v26

    goto :goto_17

    :cond_20
    :goto_16
    move-object/from16 v2, v55

    goto :goto_18

    :goto_17
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v4, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lgr1/b;->o()Lm91/u;

    move-result-object v1

    if-nez v1, :cond_21

    const v0, 0x315e3a21

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    move v12, v7

    move/from16 v0, v56

    move-object/from16 v10, v57

    goto :goto_1a

    :cond_21
    const v0, 0x315e3a22

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    new-instance v3, Lgf1/e;

    const/16 v0, 0xf

    invoke-direct {v3, v0}, Lgf1/e;-><init>(I)V

    move/from16 v0, v56

    const/16 v6, 0x100

    if-ne v0, v6, :cond_22

    const/4 v2, 0x1

    goto :goto_19

    :cond_22
    const/4 v2, 0x0

    :goto_19
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v10, v57

    if-nez v2, :cond_23

    if-ne v5, v10, :cond_24

    :cond_23
    new-instance v5, Ljp1/n;

    const/4 v2, 0x3

    invoke-direct {v5, v9, v2}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    move v2, v7

    const/4 v7, 0x2

    move v12, v2

    const/4 v2, 0x0

    move-object/from16 v58, v5

    move-object v5, v4

    move-object/from16 v4, v58

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    const/4 v2, 0x1

    int-to-float v1, v2

    const/4 v2, 0x4

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v2, v11, v4, v3}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_1a
    invoke-virtual {v8}, Lgr1/b;->u()Lm91/u;

    move-result-object v1

    if-nez v1, :cond_25

    const v1, 0x31694665

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    move-object v7, v4

    move-object/from16 v11, v34

    goto :goto_1e

    :cond_25
    const v2, 0x31694666

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    new-instance v3, Lgf1/e;

    const/16 v2, 0x10

    invoke-direct {v3, v2}, Lgf1/e;-><init>(I)V

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x100

    if-ne v0, v6, :cond_26

    const/4 v5, 0x1

    goto :goto_1b

    :cond_26
    const/4 v5, 0x0

    :goto_1b
    or-int/2addr v2, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_28

    if-ne v5, v10, :cond_27

    goto :goto_1c

    :cond_27
    move-object/from16 v11, v34

    goto :goto_1d

    :cond_28
    :goto_1c
    new-instance v5, Lig0/h;

    const/16 v2, 0x1a

    move-object/from16 v11, v34

    invoke-direct {v5, v8, v9, v11, v2}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v2, 0x0

    move-object/from16 v58, v5

    move-object v5, v4

    move-object/from16 v4, v58

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v5

    const/4 v3, 0x0

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_29

    invoke-virtual {v8}, Lgr1/b;->e()Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-virtual {v8}, Lgr1/b;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_29

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2a

    :cond_29
    move-object/from16 v1, p1

    move-object v3, v8

    move-object/from16 v2, v27

    move/from16 v14, v35

    const/4 v4, 0x0

    goto :goto_24

    :cond_2a
    const v1, 0x317ea31d

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lgr1/q;->c()Lgr1/b;

    move-result-object v13

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v14, v35

    const/16 v2, 0x20

    if-ne v14, v2, :cond_2b

    const/4 v2, 0x1

    goto :goto_1f

    :cond_2b
    const/4 v2, 0x0

    :goto_1f
    or-int/2addr v1, v2

    const/16 v6, 0x100

    if-ne v0, v6, :cond_2c

    const/4 v0, 0x1

    goto :goto_20

    :cond_2c
    const/4 v0, 0x0

    :goto_20
    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2e

    if-ne v1, v10, :cond_2d

    goto :goto_21

    :cond_2d
    move-object v0, v1

    move-object v3, v8

    move-object/from16 v2, v27

    move-object/from16 v1, p1

    goto :goto_22

    :cond_2e
    :goto_21
    new-instance v0, La00/h;

    const/16 v6, 0xb

    move-object/from16 v2, p1

    move-object v1, v8

    move-object v4, v9

    move-object v5, v11

    move-object/from16 v3, v27

    invoke-direct/range {v0 .. v6}, La00/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v58, v3

    move-object v3, v1

    move-object v1, v2

    move-object/from16 v2, v58

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    check-cast v0, Lc93/a;

    const/4 v4, 0x0

    invoke-static {v13, v0, v7, v4}, Ljr1/d;->t(Lgr1/b;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    :goto_23
    const/4 v0, 0x1

    goto :goto_25

    :goto_24
    const v0, 0x3192bdb8

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_25
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-static {v2}, Ljr1/d;->B(Lp1/c1;)Z

    move-result v5

    if-eqz v5, :cond_33

    const v5, -0x378e8e62

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lgr1/b;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lgr1/b;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move/from16 v30, v4

    invoke-virtual {v3}, Lgr1/b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v3}, Lgr1/b;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_2f

    new-instance v9, Lg11/b;

    const/16 v11, 0x19

    invoke-direct {v9, v11, v2}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    move-object/from16 v23, v9

    check-cast v23, Lc93/a;

    const/16 v2, 0x20

    if-ne v14, v2, :cond_30

    move v2, v0

    goto :goto_26

    :cond_30
    move/from16 v2, v30

    :goto_26
    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v2, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_31

    if-ne v9, v10, :cond_32

    :cond_31
    new-instance v9, Lj11/q;

    const/16 v2, 0xb

    invoke-direct {v9, v2, v1, v3}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    move-object/from16 v25, v9

    check-cast v25, Lc93/a;

    shl-int/lit8 v2, v12, 0x3

    shl-int/lit8 v3, v12, 0x6

    or-int/2addr v2, v3

    shl-int/lit8 v3, v12, 0x9

    or-int/2addr v2, v3

    shl-int/lit8 v3, v12, 0x1b

    or-int/2addr v2, v3

    const/16 v32, 0x180

    const v33, 0xebffdf1

    const/4 v1, 0x0

    move/from16 v3, v30

    move/from16 v30, v2

    move-object v2, v5

    const/4 v5, 0x0

    move/from16 v17, v3

    move-object v3, v6

    const/4 v6, 0x0

    move-object/from16 v29, v7

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v35, v31

    const/16 v31, 0x0

    move/from16 v0, v35

    invoke-static/range {v1 .. v33}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v4, v29

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_27
    const/4 v2, 0x1

    goto :goto_28

    :cond_33
    move v0, v4

    move-object v4, v7

    move/from16 v34, v15

    const v1, -0x378547bc

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_27

    :goto_28
    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_29
    and-int/lit8 v0, v34, 0x7e

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    invoke-static {v1, v3, v4, v0}, Ljr1/b;->c(Lgr1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_2a

    :cond_34
    move-object v3, v2

    move-object v4, v7

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_35

    new-instance v0, Ljr1/c;

    const/4 v5, 0x1

    move/from16 v4, p4

    move-object v2, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Ljr1/c;-><init>(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    goto/16 :goto_5

    :cond_35
    return-void
.end method

.method private static final y(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ljr1/d;->x(Lgr1/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/c1;)Z
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
