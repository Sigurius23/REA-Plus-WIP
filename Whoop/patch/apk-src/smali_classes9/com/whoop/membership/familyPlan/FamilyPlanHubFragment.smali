.class public final Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'\u00a8\u0006+\u00b2\u0006\u000c\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;",
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
        "Luw1/f;",
        "w",
        "Ll83/h;",
        "F",
        "()Luw1/f;",
        "viewModel",
        "Lo02/d;",
        "x",
        "D",
        "()Lo02/d;",
        "baseNavReducer",
        "Ltw1/a;",
        "y",
        "C",
        "()Ltw1/a;",
        "actionRouter",
        "Lmw1/b;",
        "z",
        "E",
        "()Lmw1/b;",
        "startDestination",
        "Lcom/whoop/membership/familyPlan/navigation/b;",
        "navRouter",
        "membership_release"
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

    new-instance v0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->x:Ll83/h;

    new-instance v1, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->y:Ll83/h;

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Ll83/h;Lww1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->J(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Ll83/h;Lww1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->G(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Ltw1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltw1/a;

    return-object v0
.end method

.method private final D()Lo02/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo02/d;

    return-object v0
.end method

.method private final E()Lmw1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmw1/b;

    return-object v0
.end method

.method private final F()Luw1/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luw1/f;

    return-object v0
.end method

.method private static final G(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v1

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const-string p1, "FamilyPlanHubNavHost"

    const/4 p2, 0x6

    const/4 v0, 0x0

    invoke-static {p1, v0, v8, p2, v2}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v4

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v1, :cond_2

    :cond_1
    new-instance p2, Lmi2/o;

    const/4 p1, 0x3

    invoke-direct {p2, p1, p0, v4}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lc93/a;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$a;

    invoke-direct {v2, p0, v0, p2}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->F()Luw1/f;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v5

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->E()Lmw1/b;

    sget-object v6, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_3

    if-ne v0, v1, :cond_4

    :cond_3
    new-instance v0, Llq0/d;

    const/16 p2, 0x11

    invoke-direct {v0, p2, p0, p1}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/whoop/membership/familyPlan/navigation/a;->e(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Leb/u0;)Luf3/a;
    .locals 2

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->D()Lo02/d;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {v0, p1, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Ll83/h;)Lcom/whoop/membership/familyPlan/navigation/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lcom/whoop/membership/familyPlan/navigation/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/membership/familyPlan/navigation/b;

    return-object p0
.end method

.method private static final J(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Ll83/h;Lww1/c;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->C()Ltw1/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Ltw1/a;->c(Lww1/c;)Lww1/c;

    move-result-object p2

    instance-of v0, p2, Lww1/f;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->F()Luw1/f;

    move-result-object p0

    check-cast p2, Lww1/f;

    invoke-virtual {p0, p2}, Luw1/f;->n(Lww1/f;)V

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lww1/e;

    if-eqz p0, :cond_1

    invoke-static {p1}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->I(Ll83/h;)Lcom/whoop/membership/familyPlan/navigation/b;

    move-result-object p0

    check-cast p2, Lww1/e;

    invoke-virtual {p0, p2}, Lcom/whoop/membership/familyPlan/navigation/b;->d(Lww1/e;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;)Lmw1/b;
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "startDestination"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    sget-object v0, Lmw1/b;->FAMILY_PLAN_HUB:Lmw1/b;

    invoke-static {}, Lmw1/b;->values()[Lmw1/b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_3

    return-object v0

    :cond_3
    return-object v4
.end method

.method public static synthetic y(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;)Lmw1/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->K(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;)Lmw1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Leb/u0;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->H(Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;Leb/u0;)Luf3/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/membership/familyPlan/FamilyPlanHubFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x6d2fdc08

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
