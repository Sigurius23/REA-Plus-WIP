.class public final Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0017\u001a\u0004\u0008\"\u0010#\u00a8\u0006\'\u00b2\u0006\u000c\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lhn1/b;",
        "event",
        "Ll83/a0;",
        "G",
        "(Lhn1/b;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lin1/c;",
        "w",
        "Ll83/h;",
        "F",
        "()Lin1/c;",
        "viewModel",
        "Lhn1/c;",
        "x",
        "E",
        "()Lhn1/c;",
        "router",
        "Lbn1/a;",
        "y",
        "D",
        "()Lbn1/a;",
        "analyticsHelper",
        "Lin1/d;",
        "viewState",
        "home-customization_release"
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

    new-instance v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->w:Ll83/h;

    new-instance v0, Lln1/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lln1/j;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$a;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->H(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->M(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->L(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lbn1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn1/a;

    return-object v0
.end method

.method private final E()Lhn1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhn1/c;

    return-object v0
.end method

.method private final F()Lin1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lin1/c;

    return-object v0
.end method

.method private final G(Lhn1/b;)V
    .locals 0

    instance-of p1, p1, Lhn1/b$a;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->D()Lbn1/a;

    move-result-object p1

    invoke-virtual {p1}, Lbn1/a;->e()V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final H(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

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

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->F()Lin1/c;

    move-result-object p1

    invoke-virtual {p1}, Lin1/c;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lin1/d$b;->a:Lin1/d$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->I(Lp1/t2;)Lin1/d;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->D()Lbn1/a;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lln1/f;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lln1/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_3

    if-ne v3, v0, :cond_4

    :cond_3
    new-instance v3, Lln1/f;

    const/4 p1, 0x1

    invoke-direct {v3, p0, p1}, Lln1/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_5

    if-ne v3, v0, :cond_6

    :cond_5
    new-instance v3, Lln1/f;

    const/4 p1, 0x2

    invoke-direct {v3, p0, p1}, Lln1/f;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v3, 0x0

    move-object v7, v4

    move-object v4, p2

    invoke-static/range {v1 .. v9}, Lln1/q;->z(Lin1/d;Lbn1/a;Ln0/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Lin1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lin1/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lin1/d;

    return-object p0
.end method

.method private static final J(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lin1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->F()Lin1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lin1/c;->n(Lin1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->G(Lhn1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->E()Lhn1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lhn1/c;->a(Lhn1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->K(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lin1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->J(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lin1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lln1/e;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lln1/e;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5753312e

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

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

    invoke-direct {p0}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->F()Lin1/c;

    move-result-object p1

    sget-object p2, Lin1/b$c;->a:Lin1/b$c;

    invoke-virtual {p1, p2}, Lin1/c;->n(Lin1/b;)V

    return-void
.end method
