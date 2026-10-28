.class public final Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\"\u00b2\u0006\u000c\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;",
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
        "Lqa0/b;",
        "w",
        "Ll83/h;",
        "E",
        "()Lqa0/b;",
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
        "Lqa0/c;",
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

    new-instance v0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->w:Ll83/h;

    new-instance v0, Lq80/h;

    const/16 v1, 0x1d

    invoke-direct {v0, p0, v1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$c;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->G(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->J(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;)Lqa0/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lya0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lya0/a;

    return-object v0
.end method

.method private final E()Lqa0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa0/b;

    return-object v0
.end method

.method private static final F(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v3, "testId"

    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v3, v9, :cond_2

    new-instance v3, Lpa0/a;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v4

    invoke-direct {v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->getNavigator()Lj02/o0;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lpa0/a;-><init>(Leb/a0;Lj02/o0;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v3

    check-cast v10, Lpa0/a;

    invoke-direct {v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object v3

    invoke-virtual {v3}, Lqa0/b;->getViewState()Lec3/l;

    move-result-object v3

    new-instance v4, Lqa0/c$a;

    sget-object v5, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v5}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lqa0/c$a;-><init>(Lsz0/q0;Lqa0/a;Lqa0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v3

    invoke-direct {v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object v4

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_3

    if-ne v7, v9, :cond_4

    :cond_3
    new-instance v7, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$a;

    invoke-direct {v7, v0, v1, v2}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$a;-><init>(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lc93/m;

    invoke-static {v4, v1, v7, v6}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-direct {v0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object v1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    if-ne v5, v9, :cond_6

    :cond_5
    new-instance v5, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$b;

    invoke-direct {v5, v0, v10, v2}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment$b;-><init>(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lpa0/a;Lq83/d;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/m;

    invoke-static {v6, v5, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->H(Lp1/t2;)Lqa0/c;

    move-result-object v3

    invoke-virtual {v6, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_7

    if-ne v2, v9, :cond_8

    :cond_7
    new-instance v2, Lq11/c;

    const/16 v1, 0x1c

    invoke-direct {v2, v1, v10, v0}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    if-ne v2, v9, :cond_a

    :cond_9
    new-instance v2, Lrq0/x;

    const/16 v1, 0xa

    invoke-direct {v2, v0, v1}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lsa0/b;->l(Lqa0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_b
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lp1/t2;)Lqa0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lqa0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqa0/c;

    return-object p0
.end method

.method private static final I(Lpa0/a;Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lqa0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lqa0/a$e;

    if-eqz v0, :cond_0

    check-cast p2, Lqa0/a$e;

    invoke-virtual {p0, p2}, Lpa0/a;->a(Lqa0/a$e;)V

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lqa0/a$g;

    if-eqz p0, :cond_1

    invoke-direct {p1}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object p0

    check-cast p2, Lqa0/a$g;

    invoke-virtual {p0, p2}, Lqa0/b;->r(Lqa0/a$g;)V

    goto :goto_0

    :cond_1
    instance-of p0, p2, Lqa0/a$b;

    if-eqz p0, :cond_2

    invoke-direct {p1}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->E()Lqa0/b;

    move-result-object p0

    check-cast p2, Lqa0/a$b;

    invoke-virtual {p2}, Lqa0/a$b;->a()Lvw2/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Lqa0/b;->q(Lvw2/a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final J(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->D()Lya0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lya0/a;->e(Lkd0/a$c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lpa0/a;Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lqa0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->I(Lpa0/a;Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;Lqa0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->F(Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;)Luf3/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/actionplan/view/ActionPlanFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lr12/a;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x399fccdb

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
