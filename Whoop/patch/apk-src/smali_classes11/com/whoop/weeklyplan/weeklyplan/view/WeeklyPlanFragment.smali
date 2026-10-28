.class public final Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0017\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0017\u001a\u0004\u0008\'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008+\u0010\u0017\u001a\u0004\u0008,\u0010-\u00a8\u00061\u00b2\u0006\u000c\u00100\u001a\u00020/8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;",
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
        "onResume",
        "Lwt2/p;",
        "w",
        "Ll83/h;",
        "B",
        "()Lwt2/p;",
        "viewModel",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lor2/y;",
        "y",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lls2/b;",
        "z",
        "A",
        "()Lls2/b;",
        "analytics",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "E",
        "getFeatureFlagChecker",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lwt2/q;",
        "viewState",
        "weekly-plan_release"
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
.field private final E:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->w:Ll83/h;

    new-instance v0, Lyt2/d;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lyt2/d;-><init>(Landroidx/fragment/app/m0;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$a;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->E:Ll83/h;

    return-void
.end method

.method private final A()Lls2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lls2/b;

    return-object v0
.end method

.method private final B()Lwt2/p;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwt2/p;

    return-object v0
.end method

.method private static final C(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v14, p1

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->B()Lwt2/p;

    move-result-object v0

    invoke-virtual {v0}, Lwt2/p;->getViewState()Lec3/l;

    move-result-object v4

    sget-object v5, Lwt2/q$b;->a:Lwt2/q$b;

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v6, 0x0

    move-object v7, v14

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    const-string v2, "WeeklyPlanFragmentWeeklyPlanFragmentNavHost"

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static {v2, v5, v14, v4, v3}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v6

    invoke-static/range {p0 .. p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v9

    move-object v8, v6

    new-instance v6, Lvt2/h;

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->getNavigator()Lj02/o0;

    move-result-object v10

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v11

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->A()Lls2/b;

    move-result-object v12

    move-object/from16 v7, p0

    invoke-direct/range {v6 .. v12}, Lvt2/h;-><init>(Landroidx/fragment/app/m0;Leb/a0;Leb/a0;Lj02/o0;Lor2/y;Lls2/b;)V

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->B()Lwt2/p;

    move-result-object v4

    invoke-static {v0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->E(Lp1/t2;)Lwt2/q;

    move-result-object v7

    move-object v0, v5

    move-object v5, v6

    move-object v6, v8

    invoke-direct/range {p0 .. p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->A()Lls2/b;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v1, "navigateToPresets"

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    :cond_1
    move v9, v1

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v0, "scrollId"

    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    move-object v10, v0

    const/high16 v15, 0xc00000

    const/16 v16, 0x300

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v4 .. v16}, Lvt2/f;->v(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_4
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final E(Lp1/t2;)Lwt2/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lwt2/q;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lwt2/q;

    return-object p0
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->C(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->D(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lyt2/j;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lyt2/j;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x79f3cd0e

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
    .locals 3

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->B()Lwt2/p;

    move-result-object p1

    new-instance p2, Lwt2/o$c;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "source"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-direct {p2, v1, v0}, Lwt2/o$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    return-void
.end method
