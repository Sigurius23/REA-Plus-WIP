.class public final Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;",
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
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "w",
        "Ll83/h;",
        "D",
        "()Ljava/lang/String;",
        "entryPoint",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "y",
        "getNavigatorReducer",
        "()Lo02/d;",
        "navigatorReducer",
        "shepherd_release"
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

    new-instance v0, Loe2/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Loe2/d;-><init>(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->w:Ll83/h;

    new-instance v0, Loe2/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Loe2/d;-><init>(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Leb/a0;Lpe2/b;Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Lme2/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->G(Leb/a0;Lpe2/b;Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Lme2/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->F(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "entryPoint"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method private final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final E(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Leb/a0;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    new-instance v1, Lpe2/b;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v3

    const-class v4, Lfi0/a;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v5, v4, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfi0/a;

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->getNavigator()Lj02/o0;

    move-result-object v4

    invoke-direct {v1, p2, v3, v4}, Lpe2/b;-><init>(Leb/a0;Lfi0/a;Lj02/o0;)V

    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lpe2/b;

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Lno0/j0;

    const/4 v0, 0x6

    invoke-direct {v4, p2, v1, p0, v0}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, p1, v2}, Lne2/a;->o(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Leb/a0;Lpe2/b;Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;Lme2/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lme2/a$a;->a:Lme2/a$a;

    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leb/a0;->z()Z

    goto :goto_0

    :cond_0
    sget-object p0, Lme2/a$b;->a:Lme2/a$b;

    invoke-virtual {p3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lpe2/a$j;

    invoke-direct {p2}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->D()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lpe2/a$j;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lpe2/b;->a(Lpe2/a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->C(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->E(Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/shepherd/fragment/ShepherdOnboardingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x25e20a94

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
