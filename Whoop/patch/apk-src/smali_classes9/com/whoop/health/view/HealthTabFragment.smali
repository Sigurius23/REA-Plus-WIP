.class public final Lcom/whoop/health/view/HealthTabFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001b\u001a\u0004\u0008&\u0010\'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006-"
    }
    d2 = {
        "Lcom/whoop/health/view/HealthTabFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "isNavBarVisible",
        "Ll83/a0;",
        "H",
        "(Z)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onResume",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lbj1/c;",
        "w",
        "Ll83/h;",
        "D",
        "()Lbj1/c;",
        "navRouter",
        "Lbj1/a;",
        "x",
        "C",
        "()Lbj1/a;",
        "healthTabActionRouter",
        "Lj02/e;",
        "y",
        "B",
        "()Lj02/e;",
        "bffBottomNavTabEventPublisher",
        "Ltr2/n;",
        "z",
        "Ltr2/n;",
        "logger",
        "health_release"
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

.field private final z:Ltr2/n;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Ld1/i;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/health/view/HealthTabFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/health/view/HealthTabFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/health/view/HealthTabFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/health/view/HealthTabFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/health/view/HealthTabFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/health/view/HealthTabFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->y:Ll83/h;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "HealthTabFragment"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->z:Ltr2/n;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/health/view/HealthTabFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/health/view/HealthTabFragment;->E(Lcom/whoop/health/view/HealthTabFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lj02/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/e;

    return-object v0
.end method

.method private final C()Lbj1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbj1/a;

    return-object v0
.end method

.method private final D()Lbj1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/view/HealthTabFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbj1/c;

    return-object v0
.end method

.method private static final E(Lcom/whoop/health/view/HealthTabFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lcom/whoop/health/view/HealthTabFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

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

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "source"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v7, p1

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "bottom_navigation"

    goto :goto_1

    :goto_3
    invoke-direct {p0}, Lcom/whoop/health/view/HealthTabFragment;->D()Lbj1/c;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/health/view/HealthTabFragment;->C()Lbj1/a;

    move-result-object v3

    new-instance v1, Lcj1/g$k;

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v11}, Lcj1/g$k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_4

    :cond_3
    new-instance p2, Leg/j;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lej1/t;->f(Lcj1/g$k;Lbj1/c;Lbj1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/health/view/HealthTabFragment;Z)Ll83/a0;
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lcom/whoop/health/view/HealthTabFragment;->H(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final H(Z)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/health/view/HealthTabFragment;->B()Lj02/e;

    move-result-object v0

    new-instance v1, Lj02/d$a;

    xor-int/lit8 p1, p1, 0x1

    invoke-direct {v1, p1}, Lj02/d$a;-><init>(Z)V

    invoke-virtual {v0, v1}, Lj02/e;->c(Lj02/d;)V

    return-void
.end method

.method public static synthetic y(Lcom/whoop/health/view/HealthTabFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/health/view/HealthTabFragment;->F(Lcom/whoop/health/view/HealthTabFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/health/view/HealthTabFragment;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/health/view/HealthTabFragment;->G(Lcom/whoop/health/view/HealthTabFragment;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    iget-object p1, p0, Lcom/whoop/health/view/HealthTabFragment;->z:Ltr2/n;

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/health/view/HealthTabFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x26f2e366

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
