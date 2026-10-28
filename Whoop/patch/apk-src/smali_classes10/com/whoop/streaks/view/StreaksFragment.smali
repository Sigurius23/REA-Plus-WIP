.class public final Lcom/whoop/streaks/view/StreaksFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/streaks/view/StreaksFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
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
        "Lti2/f;",
        "w",
        "Ll83/h;",
        "H",
        "()Lti2/f;",
        "viewModel",
        "Loi2/b;",
        "x",
        "F",
        "()Loi2/b;",
        "analyticsHelper",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lad3/c;",
        "z",
        "G",
        "()Lad3/c;",
        "interactionJson",
        "Lti2/g;",
        "viewState",
        "streaks_release"
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

    new-instance v0, Lcom/whoop/streaks/view/StreaksFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/streaks/view/StreaksFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/streaks/view/StreaksFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/streaks/view/StreaksFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/streaks/view/StreaksFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/streaks/view/StreaksFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/streaks/view/StreaksFragment;->x:Ll83/h;

    new-instance v1, Lvv1/c;

    const/16 v2, 0xd

    invoke-direct {v1, p0, v2}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lcom/whoop/streaks/view/StreaksFragment$c;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/streaks/view/StreaksFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/streaks/view/StreaksFragment;->y:Ll83/h;

    new-instance v1, Lvf3/c;

    const-string v2, "STREAKS_INTERACTION_JSON"

    invoke-direct {v1, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/streaks/view/StreaksFragment$d;

    invoke-direct {v2, p0, v1, v3}, Lcom/whoop/streaks/view/StreaksFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/streaks/view/StreaksFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/streaks/view/StreaksFragment;->J(Lcom/whoop/streaks/view/StreaksFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/streaks/view/StreaksFragment;Lti2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->L(Lcom/whoop/streaks/view/StreaksFragment;Lti2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lsi2/a;Lsi2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->M(Lsi2/a;Lsi2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/streaks/view/StreaksFragment;Loi2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->N(Lcom/whoop/streaks/view/StreaksFragment;Loi2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/streaks/view/StreaksFragment;)Lti2/f;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->H()Lti2/f;

    move-result-object p0

    return-object p0
.end method

.method private final F()Loi2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loi2/b;

    return-object v0
.end method

.method private final G()Lad3/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    return-object v0
.end method

.method private final H()Lti2/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lti2/f;

    return-object v0
.end method

.method private static final I(Lcom/whoop/streaks/view/StreaksFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Lcom/whoop/streaks/view/StreaksFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

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

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->H()Lti2/f;

    move-result-object p1

    invoke-virtual {p1}, Lti2/f;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lti2/g;

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v12}, Lti2/g;-><init>(ZZLui2/c;Lti2/g$a;Lti2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->getNavigator()Lj02/o0;

    move-result-object v1

    new-instance v2, Lsi2/a;

    invoke-direct {v2, v1, v0}, Lsi2/a;-><init>(Lj02/o0;Leb/a0;)V

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v3, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/streaks/view/StreaksFragment$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/streaks/view/StreaksFragment$a;-><init>(Lcom/whoop/streaks/view/StreaksFragment;Lq83/d;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v4, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/streaks/view/StreaksFragment;->K(Lp1/t2;)Lti2/g;

    move-result-object v1

    move-object p1, v2

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->G()Lad3/c;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_3

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, Lwi2/a;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, Lwi2/a;-><init>(Lcom/whoop/streaks/view/StreaksFragment;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_5

    if-ne v6, v3, :cond_6

    :cond_5
    new-instance v6, Luo1/b;

    const/16 v0, 0x13

    invoke-direct {v6, p1, v0}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_7

    if-ne v0, v3, :cond_8

    :cond_7
    new-instance v0, Lwi2/a;

    const/4 p1, 0x1

    invoke-direct {v0, p0, p1}, Lwi2/a;-><init>(Lcom/whoop/streaks/view/StreaksFragment;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez p1, :cond_9

    if-ne v7, v3, :cond_a

    :cond_9
    new-instance v7, Lwi2/a;

    const/4 p1, 0x2

    invoke-direct {v7, p0, p1}, Lwi2/a;-><init>(Lcom/whoop/streaks/view/StreaksFragment;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, v7

    move-object v7, v4

    move-object v4, v6

    move-object v6, v3

    move-object v3, v5

    move-object v5, v0

    invoke-static/range {v1 .. v9}, Lxi2/e;->h(Lti2/g;Lad3/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-object p2

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final K(Lp1/t2;)Lti2/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lti2/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lti2/g;

    return-object p0
.end method

.method private static final L(Lcom/whoop/streaks/view/StreaksFragment;Lti2/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->H()Lti2/f;

    move-result-object p0

    invoke-virtual {p0, p1}, Lti2/f;->n(Lti2/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lsi2/a;Lsi2/b;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lsi2/a;->a(Lsi2/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/streaks/view/StreaksFragment;Loi2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->F()Loi2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Loi2/b;->a(Loi2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/streaks/view/StreaksFragment;Lgv1/m;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/streaks/view/StreaksFragment;->H()Lti2/f;

    move-result-object p0

    invoke-virtual {p0, p1}, Lti2/f;->l(Lgv1/m;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/streaks/view/StreaksFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/streaks/view/StreaksFragment;Lgv1/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->O(Lcom/whoop/streaks/view/StreaksFragment;Lgv1/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/streaks/view/StreaksFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/streaks/view/StreaksFragment;->I(Lcom/whoop/streaks/view/StreaksFragment;)Luf3/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/streaks/view/StreaksFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x3751db23

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
