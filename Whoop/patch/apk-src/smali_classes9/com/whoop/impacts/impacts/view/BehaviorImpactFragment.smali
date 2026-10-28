.class public final Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0019\u001a\u0004\u0008\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0019\u001a\u0004\u0008$\u0010%R\u001b\u0010+\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0019\u001a\u0004\u0008)\u0010*\u00a8\u0006.\u00b2\u0006\u000c\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;",
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
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Landroidx/fragment/app/r0;",
        "activity",
        "F",
        "(Landroidx/fragment/app/r0;)V",
        "Luq1/b;",
        "w",
        "Ll83/h;",
        "E",
        "()Luq1/b;",
        "viewModel",
        "Lgq1/a;",
        "x",
        "C",
        "()Lgq1/a;",
        "analyticsHelper",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "z",
        "D",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Luq1/c;",
        "viewState",
        "behavior-impact_release"
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

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->x:Ll83/h;

    new-instance v1, Lvv1/c;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$b;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->G(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Luq1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->J(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Luq1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lgq1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgq1/a;

    return-object v0
.end method

.method private final D()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final E()Luq1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luq1/b;

    return-object v0
.end method

.method private static final G(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Ltq1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->E()Luq1/b;

    move-result-object p2

    invoke-virtual {p2}, Luq1/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Luq1/c$b;->a:Luq1/c$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->I(Lp1/t2;)Luq1/c;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne p3, v0, :cond_2

    :cond_1
    new-instance p3, Luo1/b;

    const/16 p2, 0x14

    invoke-direct {p3, p0, p2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    if-ne p3, v0, :cond_4

    :cond_3
    new-instance p3, Luo1/b;

    const/16 p2, 0x15

    invoke-direct {p3, p1, p2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->D()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    const-string p1, "weekly-plan-home-tile-behavior-impacts"

    invoke-interface {p0, p1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v4

    move v4, p0

    invoke-static/range {v1 .. v7}, Lwq1/c;->r(Luq1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Luq1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Luq1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luq1/c;

    return-object p0
.end method

.method private static final J(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Luq1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->E()Luq1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Luq1/b;->n(Luq1/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ltq1/b;Ltq1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ltq1/b;->c(Ltq1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Ltq1/b;Ltq1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->K(Ltq1/b;Ltq1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Ltq1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->H(Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;Ltq1/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F(Landroidx/fragment/app/r0;)V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltq1/b;

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->C()Lgq1/a;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->getNavigator()Lj02/o0;

    move-result-object p3

    invoke-direct {p1, p0, p2, p3}, Ltq1/b;-><init>(Landroidx/fragment/app/m0;Lgq1/a;Lj02/o0;)V

    new-instance p2, Lpp2/o;

    const/16 p3, 0x1a

    invoke-direct {p2, p3, p0, p1}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x3920eee4

    invoke-direct {p1, p2, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p1}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->F(Landroidx/fragment/app/r0;)V

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->E()Luq1/b;

    move-result-object p1

    sget-object p2, Luq1/a$a;->a:Luq1/a$a;

    invoke-virtual {p1, p2}, Luq1/b;->n(Luq1/a;)Lbc3/k1;

    invoke-direct {p0}, Lcom/whoop/impacts/impacts/view/BehaviorImpactFragment;->C()Lgq1/a;

    move-result-object p1

    sget-object p2, Lgq1/a$c;->RECOVERY:Lgq1/a$c;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "source"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, ""

    invoke-virtual {p1, v1, p2, v0}, Lgq1/a;->d(Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V

    return-void
.end method
