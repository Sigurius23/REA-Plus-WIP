.class public abstract Lkd1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\"\u0018\u0010\u0008\u001a\u00020\u0005*\u00020\u00048@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "h",
        "Landroid/view/View;",
        "",
        "k",
        "(Landroid/view/View;)Ljava/lang/Object;",
        "windowKey",
        "design_release"
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

    invoke-static {p0, p1, p2}, Lkd1/y;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkd1/y;->g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(La91/b;Ljava/lang/Object;Ljava/lang/Object;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkd1/y;->f(La91/b;Ljava/lang/Object;Ljava/lang/Object;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/view/View;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkd1/y;->i(Landroid/view/View;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p0, Lp1/q;

    const v0, 0x376ba8c7

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lx81/e;->q()Lp1/t1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La91/b;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Lkd1/y;->k(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2

    if-ne v5, v3, :cond_3

    :cond_2
    new-instance v5, Ljs2/h;

    const/4 v3, 0x2

    invoke-direct {v5, v0, v1, v2, v3}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v5, p0}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lk71/a0;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lk71/a0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final f(La91/b;Ljava/lang/Object;Ljava/lang/Object;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, La91/b;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Lkd1/y$a;

    invoke-direct {p3, p0, p1, p2}, Lkd1/y$a;-><init>(La91/b;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method private static final g(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lkd1/y;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p0, Lp1/q;

    const v0, 0x3a964be7

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-static {}, Lx81/e;->q()Lp1/t1;

    move-result-object v1

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La91/b;

    invoke-static {v0}, Lkd1/y;->k(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, La91/b;->c(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0, v1}, Lp1/q;->h(Z)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lio/getstream/chat/android/client/b;

    const/4 v2, 0x2

    invoke-direct {v3, v0, v1, v2}, Lio/getstream/chat/android/client/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lc93/a;

    invoke-static {v3, p0}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lk71/a0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lk71/a0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final i(Landroid/view/View;Z)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lh5/p0;->g(Landroid/view/View;)Lh5/v1;

    move-result-object p0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lh5/v1;->b(Z)V

    invoke-virtual {p0, p1}, Lh5/v1;->a(Z)V

    return-object v0
.end method

.method private static final j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lkd1/y;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroid/view/View;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    const-string v0, "getRootView(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
