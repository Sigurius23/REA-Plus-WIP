.class public final Lcom/whoop/settings/language/LanguagePrefsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0018\u00b2\u0006\u000c\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/settings/language/LanguagePrefsFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lec2/b;",
        "viewModel",
        "Lec2/c;",
        "viewState",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    return-void
.end method

.method public static synthetic A(Ll83/h;Lfc2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/language/LanguagePrefsFragment;->F(Ll83/h;Lfc2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Ll83/h;)Lec2/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/language/LanguagePrefsFragment;->D(Ll83/h;)Lec2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lcom/whoop/settings/language/LanguagePrefsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_b

    const p1, -0x649fae96

    invoke-virtual {v7, p1}, Lp1/q;->f0(I)V

    sget-object p1, Lpf3/a;->b:Lnf3/a;

    if-eqz p1, :cond_a

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    iget-object p1, p1, Lwf3/a;->d:Lxf3/c;

    const v0, -0x649fad62

    const v1, -0x384098

    invoke-static {v7, v0, v7, v3, v1}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_1

    if-ne v4, v10, :cond_2

    :cond_1
    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v4, Lcom/whoop/settings/language/LanguagePrefsFragment$b;

    invoke-direct {v4, p1, v1, v1, v0}, Lcom/whoop/settings/language/LanguagePrefsFragment$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    move-object p1, v4

    check-cast p1, Ll83/h;

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    invoke-static {p1}, Lcom/whoop/settings/language/LanguagePrefsFragment;->D(Ll83/h;)Lec2/b;

    move-result-object v0

    invoke-virtual {v0}, Lec2/b;->getViewState()Lec3/l;

    move-result-object v4

    new-instance v5, Lec2/c;

    const/4 v0, 0x3

    invoke-direct {v5, v1, v1, v0, v1}, Lec2/c;-><init>(Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_3

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v2

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Leb/a0;

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p0, :cond_4

    if-ne v3, v10, :cond_5

    :cond_4
    new-instance v3, Lcom/whoop/settings/language/LanguagePrefsFragment$a;

    invoke-direct {v3, p1, v1}, Lcom/whoop/settings/language/LanguagePrefsFragment$a;-><init>(Ll83/h;Lq83/d;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lc93/m;

    invoke-static {v7, v3, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/settings/language/LanguagePrefsFragment;->E(Lp1/t2;)Lec2/c;

    move-result-object v4

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_6

    if-ne v0, v10, :cond_7

    :cond_6
    new-instance v0, Lno0/q;

    const/16 p0, 0x8

    invoke-direct {v0, p1, p0}, Lno0/q;-><init>(Ll83/h;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_8

    if-ne p1, v10, :cond_9

    :cond_8
    new-instance p1, Lmr1/h;

    const/4 p0, 0x2

    invoke-direct {p1, v2, p0}, Lmr1/h;-><init>(Leb/a0;I)V

    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, p1

    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lfc2/b;->g(Lec2/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    return-object p2

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    invoke-virtual {v7}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final D(Ll83/h;)Lec2/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lec2/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lec2/b;

    return-object p0
.end method

.method private static final E(Lp1/t2;)Lec2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lec2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lec2/c;

    return-object p0
.end method

.method private static final F(Ll83/h;Lfc2/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/settings/language/LanguagePrefsFragment;->D(Ll83/h;)Lec2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lec2/b;->n(Lfc2/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/settings/language/LanguagePrefsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/language/LanguagePrefsFragment;->C(Lcom/whoop/settings/language/LanguagePrefsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/language/LanguagePrefsFragment;->G(Leb/a0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "LanguagePrefsFragment"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/settings/language/LanguagePrefsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/16 p2, 0x9

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x46afb27a

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
