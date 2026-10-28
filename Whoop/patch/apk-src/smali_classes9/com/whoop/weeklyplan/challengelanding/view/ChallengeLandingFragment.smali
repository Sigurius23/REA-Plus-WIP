.class public final Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'\u00a8\u0006+\u00b2\u0006\u000c\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;",
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
        "F",
        "()Ljava/lang/String;",
        "source",
        "Lus2/e;",
        "x",
        "G",
        "()Lus2/e;",
        "viewModel",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lts2/b;",
        "z",
        "E",
        "()Lts2/b;",
        "navigationRouter",
        "Lus2/f;",
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lvs2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvs2/a;-><init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->x:Ll83/h;

    new-instance v0, Lvs2/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lvs2/a;-><init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$a;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->y:Ll83/h;

    new-instance v0, Lvs2/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lvs2/a;-><init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->J(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lus2/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->L(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lus2/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->N(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lts2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->M(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lts2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lts2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lts2/b;

    return-object v0
.end method

.method private final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final G()Lus2/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lus2/e;

    return-object v0
.end method

.method private static final H(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Lts2/b;
    .locals 2

    new-instance v0, Lts2/b;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->getNavigator()Lj02/o0;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lts2/b;-><init>(Leb/a0;Lj02/o0;)V

    return-object v0
.end method

.method private static final I(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->G()Lus2/e;

    move-result-object p1

    invoke-virtual {p1}, Lus2/e;->getViewState()Lec3/f2;

    move-result-object p1

    invoke-static {p1, v6, v2}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->K(Lp1/t2;)Lus2/f;

    move-result-object v3

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lvs2/b;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lvs2/b;-><init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v4, p2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lvs2/b;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lvs2/b;-><init>(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lvs2/e;->C(Lus2/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/t2;)Lus2/f;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lus2/f;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lus2/f;

    return-object p0
.end method

.method private static final L(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lus2/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->G()Lus2/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Lus2/e;->l(Lus2/d;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;Lts2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->E()Lts2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lts2/b;->c(Lts2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Lts2/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->H(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Lts2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->I(Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;)Luf3/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ltx0/a;

    const/16 p2, 0x1a

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x2836e6c8

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

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->G()Lus2/e;

    move-result-object p1

    new-instance p2, Lus2/d$a;

    invoke-direct {p0}, Lcom/whoop/weeklyplan/challengelanding/view/ChallengeLandingFragment;->F()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lus2/d$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lus2/e;->l(Lus2/d;)Lbc3/k1;

    return-void
.end method
