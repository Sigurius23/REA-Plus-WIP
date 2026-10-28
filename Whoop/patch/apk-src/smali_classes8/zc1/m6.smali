.class public abstract Lzc1/m6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u000b\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0006\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0007\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0008\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "v",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "saving",
        "loading",
        "saved",
        "successAutoDismiss",
        "error",
        "errorSecondary",
        "errorLowSeverity",
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

.method private static final D(Lp1/c1;)Z
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

.method private static final E(Lp1/c1;Z)V
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

.method private static final F(Lp1/c1;Z)V
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

.method private static final G(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->c0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->e0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->y(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->A(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lzc1/m6;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->E(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Secondary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->F(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Secondary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->c0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->e0(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->y(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->y(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->A(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Y(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzc1/m6;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z(Landroid/content/Context;)Ll83/a0;
    .locals 2

    const-string v0, "Primary Error"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->J(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/m6;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->W(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lp1/c1;)Z
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

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->V(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c0(Lp1/c1;Z)V
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

.method public static synthetic d(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->O(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d0(Lp1/c1;)Z
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

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->I(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Lp1/c1;Z)V
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

.method public static synthetic f(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->R(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->S(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->Y(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->H(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->T(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/m6;->a0(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->G(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->X(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->K(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->U(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->Q(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->N(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->L(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->P(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->M(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Landroid/content/Context;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/m6;->Z(Landroid/content/Context;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Landroidx/compose/runtime/Composer;I)V
    .locals 40

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v1, -0x2a90eac4

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v14, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v14

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2e

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/content/Context;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_5

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_6

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_7

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v8, Lp1/c1;

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->E:Lb2/m;

    invoke-static {v13, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v17, v15

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v19, v3

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-eqz v3, :cond_8

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v10, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v10, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    move-object/from16 v20, v4

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v21, v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_2

    :cond_9
    move-object/from16 v21, v5

    :goto_2
    invoke-static {v14, v10, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v10, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->e:Ll0/h;

    move-object/from16 v18, v6

    const/16 v6, 0x36

    invoke-static {v14, v12, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object v12, v7

    move-object v14, v8

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v22, v11

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v7, v10, v7, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v10, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_e

    new-instance v3, Luz1/g;

    const/16 v4, 0x1d

    invoke-direct {v3, v4, v1}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v3, Lc93/a;

    sget-object v13, Lzc1/f1;->a:Lzc1/f1;

    invoke-virtual {v13}, Lzc1/f1;->h()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    move-object v7, v12

    const/16 v12, 0x1fe

    move-object v4, v2

    const/4 v2, 0x0

    move-object v5, v1

    move-object v1, v3

    const/4 v3, 0x0

    move-object v6, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object v15, v6

    const/4 v6, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v26, v14

    move-object v14, v15

    move-object/from16 v15, v19

    move-object/from16 v0, v20

    move-object/from16 v25, v23

    move-object/from16 v19, v18

    move-object/from16 v18, v13

    move-object/from16 v13, v22

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_f

    new-instance v2, Lzc1/l6;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v15}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->j()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    move v3, v1

    move-object v1, v2

    const/4 v2, 0x0

    move v4, v3

    const/4 v3, 0x0

    move v5, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v22, v15

    move/from16 v15, v20

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_10

    new-instance v1, Lzc1/l6;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v1, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->m()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_11

    new-instance v1, Lzc1/l6;

    const/4 v2, 0x2

    move-object/from16 v3, v21

    invoke-direct {v1, v2, v3}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_11
    move-object/from16 v3, v21

    :goto_4
    check-cast v1, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->i()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    const/4 v2, 0x0

    move-object/from16 v21, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_12

    new-instance v1, Lzc1/l6;

    const/4 v2, 0x3

    move-object/from16 v3, v19

    invoke-direct {v1, v2, v3}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_5

    :cond_12
    move-object/from16 v3, v19

    :goto_5
    check-cast v1, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->n()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    const/4 v2, 0x0

    move-object/from16 v19, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_13

    new-instance v1, Lzc1/l6;

    const/4 v2, 0x4

    move-object/from16 v3, v25

    invoke-direct {v1, v2, v3}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_6

    :cond_13
    move-object/from16 v3, v25

    :goto_6
    check-cast v1, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->l()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    const/4 v2, 0x0

    move-object v7, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v25, v23

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_14

    new-instance v1, Lzc1/l6;

    const/4 v2, 0x5

    move-object/from16 v3, v26

    invoke-direct {v1, v2, v3}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_7

    :cond_14
    move-object/from16 v3, v26

    :goto_7
    check-cast v1, Lc93/a;

    invoke-virtual/range {v18 .. v18}, Lzc1/f1;->k()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    const v11, 0x30000006

    const/16 v12, 0x1fe

    const/4 v2, 0x0

    move-object/from16 v26, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v18, v26

    invoke-static/range {v1 .. v12}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-static {v13, v15, v10, v1}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    invoke-static/range {v24 .. v24}, Lzc1/m6;->w(Lp1/c1;)Z

    move-result v2

    if-eqz v2, :cond_16

    const v2, -0x4a56c214

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    move v2, v1

    sget-object v1, Lsz0/p0$f;->e:Lsz0/p0$f;

    const-string v3, "Savings Support Text"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_15

    new-instance v4, Lzc1/l6;

    const/4 v5, 0x6

    move-object/from16 v8, v24

    invoke-direct {v4, v5, v8}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lc93/a;

    sget v5, Lsz0/p0$f;->f:I

    or-int/lit16 v5, v5, 0x180

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int/2addr v5, v6

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/16 v16, 0xff8

    move v7, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v8, v14

    move v14, v5

    const/4 v5, 0x0

    move v9, v6

    const/4 v6, 0x0

    move v11, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move/from16 v20, v13

    move-object v13, v10

    const/4 v10, 0x0

    move/from16 v23, v11

    const/4 v11, 0x0

    move-object/from16 v24, v12

    const/4 v12, 0x0

    move/from16 p0, v20

    move-object/from16 v20, v0

    move/from16 v0, p0

    move-object/from16 v27, v17

    move-object/from16 p0, v19

    move-object/from16 v19, v22

    move-object/from16 v28, v24

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_16
    move-object/from16 v20, v0

    move-object/from16 v28, v14

    move-object/from16 v27, v17

    move-object/from16 p0, v19

    move-object/from16 v19, v22

    const/4 v0, 0x0

    const v1, -0x4a537934

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-static/range {v19 .. v19}, Lzc1/m6;->b0(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_18

    const v1, -0x4a5304b6

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lsz0/p0$c;->e:Lsz0/p0$c;

    const-string v2, "Loading support text"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v28

    if-ne v3, v4, :cond_17

    new-instance v3, Lzc1/l6;

    const/4 v5, 0x7

    move-object/from16 v15, v19

    invoke-direct {v3, v5, v15}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lc93/a;

    sget v5, Lsz0/p0$c;->f:I

    or-int/lit16 v5, v5, 0x180

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v14, v5, v6

    const/4 v15, 0x0

    const/16 v16, 0xff8

    move-object v6, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v29, v24

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_18
    move-object/from16 v29, v28

    const v1, -0x4a4fb454

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-static/range {v20 .. v20}, Lzc1/m6;->d0(Lp1/c1;)Z

    move-result v1

    const-string v17, "Success support text"

    if-eqz v1, :cond_1a

    const v1, -0x4a4f4796

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lsz0/p0$h;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v29

    if-ne v3, v4, :cond_19

    new-instance v3, Lzc1/l6;

    const/16 v5, 0x9

    move-object/from16 v6, v20

    invoke-direct {v3, v5, v6}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lc93/a;

    sget v5, Lsz0/p0$h;->h:I

    or-int/lit16 v5, v5, 0x180

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v14, v5, v6

    const/4 v15, 0x0

    const/16 v16, 0xff8

    move-object v6, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v30, v24

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_1a
    move-object/from16 v30, v29

    const v1, -0x4a4bf734

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-static/range {v21 .. v21}, Lzc1/m6;->x(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_1d

    const v1, -0x4a4b3c99

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v30

    if-ne v1, v2, :cond_1b

    new-instance v1, Lzc1/l6;

    const/16 v3, 0x8

    move-object/from16 v5, v21

    invoke-direct {v1, v3, v5}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_b

    :cond_1b
    move-object/from16 v5, v21

    :goto_b
    move-object/from16 v32, v1

    check-cast v32, Lc93/a;

    new-instance v1, Lsz0/p0$h;

    const/16 v29, 0x0

    const-wide/16 v30, 0x7d0

    const/16 v33, 0x1

    const/16 v34, 0x0

    move-object/from16 v28, v1

    invoke-direct/range {v28 .. v34}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_1c

    new-instance v4, Lzc1/l6;

    const/16 v6, 0xa

    invoke-direct {v4, v6, v5}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v4, Lc93/a;

    sget v5, Lsz0/p0$h;->h:I

    or-int/lit16 v5, v5, 0x180

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x3

    or-int v14, v5, v6

    const/4 v15, 0x0

    const/16 v16, 0xff8

    move-object v6, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v35, v24

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1d
    move-object/from16 v35, v30

    const v1, -0x4a449814

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_c
    invoke-static/range {p0 .. p0}, Lzc1/m6;->z(Lp1/c1;)Z

    move-result v1

    const-string v17, "Error primary action"

    const-string v19, "Error support text"

    const-string v20, "Error Title"

    if-eqz v1, :cond_21

    const v1, -0x4a43dece

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lsz0/p0$b;

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v35

    if-ne v3, v5, :cond_1e

    new-instance v3, Lzc1/l6;

    const/16 v6, 0xb

    move-object/from16 v7, p0

    invoke-direct {v3, v6, v7}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v3, Lc93/a;

    move-object/from16 v6, v27

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_1f

    if-ne v8, v5, :cond_20

    :cond_1f
    new-instance v8, Lzc1/l1;

    const/16 v7, 0x14

    invoke-direct {v8, v6, v7}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v8, Lc93/a;

    sget v7, Lsz0/p0$b;->h:I

    or-int/lit16 v7, v7, 0x180

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v9, 0x3

    or-int/2addr v7, v11

    shl-int/lit8 v9, v9, 0x9

    or-int v14, v7, v9

    const/4 v15, 0x0

    const/16 v16, 0xfe0

    move-object/from16 v27, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v5

    move-object v5, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v37, v24

    move-object/from16 v36, v27

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_21
    move-object/from16 v36, v27

    move-object/from16 v37, v35

    const v1, -0x4a3db4f4

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-static/range {v25 .. v25}, Lzc1/m6;->B(Lp1/c1;)Z

    move-result v1

    const v21, 0x30180

    const-string v22, "Error secondary action"

    if-eqz v1, :cond_27

    const v1, -0x4a3cbb61

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lsz0/p0$b;

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v5, v37

    if-ne v3, v5, :cond_22

    new-instance v3, Lzc1/l6;

    const/16 v6, 0xc

    move-object/from16 v7, v25

    invoke-direct {v3, v6, v7}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v3, Lc93/a;

    move-object/from16 v6, v36

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_23

    if-ne v9, v5, :cond_24

    :cond_23
    new-instance v9, Lzc1/l1;

    const/16 v7, 0x15

    invoke-direct {v9, v6, v7}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v9, Lc93/a;

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_25

    if-ne v11, v5, :cond_26

    :cond_25
    new-instance v11, Lzc1/l1;

    const/16 v7, 0x16

    invoke-direct {v11, v6, v7}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v11, Lc93/a;

    sget v7, Lsz0/p0$b;->h:I

    or-int v7, v7, v21

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v13, v12, 0x3

    or-int/2addr v7, v13

    shl-int/lit8 v13, v12, 0x9

    or-int/2addr v7, v13

    shl-int/lit8 v12, v12, 0x15

    or-int v14, v7, v12

    const/4 v15, 0x0

    const/16 v16, 0xe40

    move-object/from16 v27, v6

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object/from16 v24, v5

    move-object v5, v9

    move-object v9, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v39, v24

    move-object/from16 v38, v27

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_27
    move-object/from16 v38, v36

    move-object/from16 v39, v37

    const v1, -0x4a330154

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-static/range {v18 .. v18}, Lzc1/m6;->D(Lp1/c1;)Z

    move-result v1

    if-eqz v1, :cond_2d

    const v1, -0x4a31fd19

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    new-instance v1, Lsz0/p0$b;

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v17 .. v17}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v6, v39

    if-ne v3, v6, :cond_28

    new-instance v3, Lzc1/l6;

    const/16 v5, 0xd

    move-object/from16 v14, v18

    invoke-direct {v3, v5, v14}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v3, Lc93/a;

    move-object/from16 v5, v38

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_29

    if-ne v9, v6, :cond_2a

    :cond_29
    new-instance v9, Lzc1/l1;

    const/16 v7, 0x17

    invoke-direct {v9, v5, v7}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v9, Lc93/a;

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_2b

    if-ne v11, v6, :cond_2c

    :cond_2b
    new-instance v11, Lzc1/l1;

    const/16 v6, 0x13

    invoke-direct {v11, v5, v6}, Lzc1/l1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v11, Lc93/a;

    sget v5, Lsz0/p0$b;->h:I

    or-int v5, v5, v21

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v6, 0x3

    or-int/2addr v5, v7

    shl-int/lit8 v7, v6, 0x9

    or-int/2addr v5, v7

    shl-int/lit8 v6, v6, 0x15

    or-int v14, v5, v6

    const/4 v15, 0x0

    const/16 v16, 0xe40

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move-object v5, v9

    move-object v9, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v10, v13

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v1, 0x1

    goto :goto_10

    :cond_2d
    const v1, -0x4a27e8f4    # -1.6099962E-6f

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_2e
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2f

    new-instance v1, Lzc1/g6;

    const/4 v2, 0x3

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/g6;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final w(Lp1/c1;)Z
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

.method private static final x(Lp1/c1;)Z
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

.method private static final y(Lp1/c1;Z)V
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
