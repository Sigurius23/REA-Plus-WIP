.class public final Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\"\u00b2\u0006\u000c\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lvc0/b;",
        "w",
        "Ll83/h;",
        "E",
        "()Lvc0/b;",
        "viewModel",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lya0/a;",
        "y",
        "D",
        "()Lya0/a;",
        "analyticsHelper",
        "Lvc0/c;",
        "viewState",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$f;

    invoke-direct {v0, p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$f;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->w:Ll83/h;

    new-instance v0, Lvv1/c;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$d;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$e;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Luc0/b;Luc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->J(Luc0/b;Luc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->I(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;)Lvc0/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->E()Lvc0/b;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lya0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lya0/a;

    return-object v0
.end method

.method private final E()Lvc0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvc0/b;

    return-object v0
.end method

.method private static final F(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Luc0/b;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->getNavigator()Lj02/o0;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Luc0/b;-><init>(Leb/a0;Lj02/o0;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Luc0/b;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "insightsId"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, ""

    :cond_3
    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->E()Lvc0/b;

    move-result-object v1

    invoke-virtual {v1}, Lvc0/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lvc0/c$b;->b:Lvc0/c$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->E()Lvc0/b;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v3, :cond_4

    if-ne v5, p2, :cond_5

    :cond_4
    new-instance v5, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$a;

    invoke-direct {v5, p0, v0, v6}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$a;-><init>(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lc93/m;

    invoke-static {v2, v0, v5, v4}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->E()Lvc0/b;

    move-result-object v0

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    if-ne v3, p2, :cond_7

    :cond_6
    new-instance v3, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$b;

    invoke-direct {v3, p0, p1, v6}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$b;-><init>(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Luc0/b;Lq83/d;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lc93/m;

    invoke-static {v4, v3, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->H(Lp1/t2;)Lvc0/c;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v2, "source"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_8
    move-object v2, v6

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->E()Lvc0/b;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_9

    if-ne v5, p2, :cond_a

    :cond_9
    new-instance v5, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$c;

    invoke-direct {v5, v0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lj93/g;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_b

    if-ne v3, p2, :cond_c

    :cond_b
    new-instance v3, Lx30/h1;

    const/4 v0, 0x5

    invoke-direct {v3, p0, v0}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_d

    if-ne v0, p2, :cond_e

    :cond_d
    new-instance v0, Lx30/h1;

    const/4 p0, 0x6

    invoke-direct {v0, p1, p0}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v6, v4

    move-object v4, v5

    move-object v5, v0

    invoke-static/range {v1 .. v8}, Lxc0/a;->q(Lvc0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_f
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/t2;)Lvc0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lvc0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvc0/c;

    return-object p0
.end method

.method private static final I(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->D()Lya0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lya0/a;->e(Lkd0/a$c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Luc0/b;Luc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Luc0/b;->a(Luc0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->F(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->G(Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/16 p2, 0xa

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x761b3d81

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
