.class public final Lcom/whoop/bot/settings/CoachSettingsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"\u00a8\u0006&\u00b2\u0006\u000c\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsFragment;",
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
        "onResume",
        "Lcom/whoop/bot/settings/CoachSettingsViewModel;",
        "viewModel$delegate",
        "Ll83/h;",
        "getViewModel",
        "()Lcom/whoop/bot/settings/CoachSettingsViewModel;",
        "viewModel",
        "Lxk0/a;",
        "analyticsHelper$delegate",
        "getAnalyticsHelper",
        "()Lxk0/a;",
        "analyticsHelper",
        "Lj02/o0;",
        "appNavigator$delegate",
        "getAppNavigator",
        "()Lj02/o0;",
        "appNavigator",
        "Lcom/whoop/bot/settings/CoachSettingsViewState;",
        "state",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final analyticsHelper$delegate:Ll83/h;

.field private final appNavigator$delegate:Ll83/h;

.field private final viewModel$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$viewModel$default$1;

    invoke-direct {v0, p0}, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$viewModel$default$1;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$viewModel$default$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$viewModel$default$2;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->viewModel$delegate:Ll83/h;

    new-instance v0, Lcj0/f;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lcj0/f;-><init>(I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$inject$default$1;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$inject$default$1;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->analyticsHelper$delegate:Ll83/h;

    new-instance v0, Lcom/whoop/bot/settings/b;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lcom/whoop/bot/settings/b;-><init>(Lcom/whoop/bot/settings/CoachSettingsFragment;I)V

    new-instance v2, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$inject$default$2;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/bot/settings/CoachSettingsFragment$special$$inlined$inject$default$2;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->appNavigator$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/bot/settings/CoachSettingsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->appNavigator_delegate$lambda$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->onCreateView$lambda$0$3$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->onCreateView$lambda$0$2$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/bot/settings/CoachSettingsFragment;->analyticsHelper_delegate$lambda$0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final analyticsHelper_delegate$lambda$0()Luf3/a;
    .locals 1

    const/4 v0, 0x0

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final appNavigator_delegate$lambda$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final getAnalyticsHelper()Lxk0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->analyticsHelper$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxk0/a;

    return-object v0
.end method

.method private final getAppNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->appNavigator$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method private final getViewModel()Lcom/whoop/bot/settings/CoachSettingsViewModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsFragment;->viewModel$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsViewModel;

    return-object v0
.end method

.method private static final onCreateView$lambda$0(Lcom/whoop/bot/settings/CoachSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->getViewModel()Lcom/whoop/bot/settings/CoachSettingsViewModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsViewModel;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsFragment;->onCreateView$lambda$0$0(Lp1/t2;)Lcom/whoop/bot/settings/CoachSettingsViewState;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lck1/c;

    const/4 p1, 0x3

    invoke-direct {p2, p0, p1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lcom/whoop/bot/settings/b;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lcom/whoop/bot/settings/b;-><init>(Lcom/whoop/bot/settings/CoachSettingsFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_5

    if-ne v2, v0, :cond_6

    :cond_5
    new-instance v2, Lcom/whoop/bot/settings/b;

    const/4 p1, 0x1

    invoke-direct {v2, p0, p1}, Lcom/whoop/bot/settings/b;-><init>(Lcom/whoop/bot/settings/CoachSettingsFragment;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v5, v2

    check-cast v5, Lc93/a;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v2, 0x0

    move-object v6, v4

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->CoachSettingsScreen(Lcom/whoop/bot/settings/CoachSettingsViewState;Leb/u0;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onCreateView$lambda$0$0(Lp1/t2;)Lcom/whoop/bot/settings/CoachSettingsViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/bot/settings/CoachSettingsViewState;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/bot/settings/CoachSettingsViewState;

    return-object p0
.end method

.method private static final onCreateView$lambda$0$1$0(Lcom/whoop/bot/settings/CoachSettingsFragment;Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->getViewModel()Lcom/whoop/bot/settings/CoachSettingsViewModel;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/whoop/bot/settings/CoachSettingsViewModel;->sendViewEvent(Lcom/whoop/bot/settings/CoachSettingsViewEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onCreateView$lambda$0$2$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;
    .locals 7

    invoke-direct {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->getAnalyticsHelper()Lxk0/a;

    move-result-object v0

    invoke-virtual {v0}, Lxk0/a;->v()V

    invoke-direct {p0}, Lcom/whoop/bot/settings/CoachSettingsFragment;->getAppNavigator()Lj02/o0;

    move-result-object p0

    new-instance v0, Lj02/m0$w1;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v1, "WHOOP_COACH_DATA_PRIVACY"

    const-string v2, "Coach Settings"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lj02/m0$w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final onCreateView$lambda$0$3$0(Lcom/whoop/bot/settings/CoachSettingsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/bot/settings/CoachSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsFragment;->onCreateView$lambda$0(Lcom/whoop/bot/settings/CoachSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/bot/settings/CoachSettingsFragment;Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/bot/settings/CoachSettingsFragment;->onCreateView$lambda$0$1$0(Lcom/whoop/bot/settings/CoachSettingsFragment;Lcom/whoop/bot/settings/CoachSettingsViewEvent;)Ll83/a0;

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lci0/a;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x6931f429

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

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

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class p2, Lfi0/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lfi0/a;

    const-string p2, "AI Coach Settings"

    invoke-interface {p1, p2}, Lfi0/a;->g(Ljava/lang/String;)V

    return-void
.end method
