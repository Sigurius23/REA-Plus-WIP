.class public final Lcom/whoop/referafriend/ReferAFriendFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'\u00a8\u0006+\u00b2\u0006\u000c\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/referafriend/ReferAFriendFragment;",
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
        "H",
        "()Ljava/lang/String;",
        "source",
        "Ls62/a;",
        "x",
        "I",
        "()Ls62/a;",
        "viewModel",
        "Lh62/b;",
        "y",
        "F",
        "()Lh62/b;",
        "analytics",
        "Ll62/e;",
        "z",
        "G",
        "()Ll62/e;",
        "navRouter",
        "Lm62/g;",
        "viewState",
        "refer-a-friend_release"
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

    new-instance v0, Lg62/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lg62/a;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/referafriend/ReferAFriendFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/referafriend/ReferAFriendFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/referafriend/ReferAFriendFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/referafriend/ReferAFriendFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->x:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/referafriend/ReferAFriendFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/referafriend/ReferAFriendFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->y:Ll83/h;

    new-instance v1, Lg62/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg62/a;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V

    new-instance v2, Lcom/whoop/referafriend/ReferAFriendFragment$c;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/referafriend/ReferAFriendFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/referafriend/ReferAFriendFragment;Lm62/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->M(Lcom/whoop/referafriend/ReferAFriendFragment;Lm62/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/referafriend/ReferAFriendFragment;Lh62/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->O(Lcom/whoop/referafriend/ReferAFriendFragment;Lh62/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/referafriend/ReferAFriendFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/referafriend/ReferAFriendFragment;->K(Lcom/whoop/referafriend/ReferAFriendFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/referafriend/ReferAFriendFragment;Ll62/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->N(Lcom/whoop/referafriend/ReferAFriendFragment;Ll62/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/referafriend/ReferAFriendFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->H()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final G()Ll62/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll62/e;

    return-object v0
.end method

.method private final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final J(Lcom/whoop/referafriend/ReferAFriendFragment;)Luf3/a;
    .locals 2

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    const/4 v1, 0x0

    filled-new-array {v0, p0, v1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lcom/whoop/referafriend/ReferAFriendFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

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

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->I()Ls62/a;

    move-result-object p1

    invoke-virtual {p1}, Ls62/a;->n()Lec3/t1;

    move-result-object v1

    sget-object v2, Lm62/g$d;->a:Lm62/g$d;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/referafriend/ReferAFriendFragment$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/referafriend/ReferAFriendFragment$a;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;Lq83/d;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v4, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/referafriend/ReferAFriendFragment;->L(Lp1/t2;)Lm62/g;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_3

    if-ne v0, v2, :cond_4

    :cond_3
    new-instance v0, Lg62/b;

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Lg62/b;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_5

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lg62/b;

    const/4 p1, 0x1

    invoke-direct {v3, p0, p1}, Lg62/b;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_7

    if-ne v5, v2, :cond_8

    :cond_7
    new-instance v5, Lg62/b;

    const/4 p1, 0x2

    invoke-direct {v5, p0, p1}, Lg62/b;-><init>(Lcom/whoop/referafriend/ReferAFriendFragment;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    move-object v2, v5

    move-object v5, v4

    move-object v4, v2

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lp62/f;->c(Lm62/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object p2

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final L(Lp1/t2;)Lm62/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lm62/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm62/g;

    return-object p0
.end method

.method private static final M(Lcom/whoop/referafriend/ReferAFriendFragment;Lm62/j;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->I()Ls62/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Ls62/a;->o(Lm62/j;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/referafriend/ReferAFriendFragment;Ll62/a;)Ll83/a0;
    .locals 1

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->G()Ll62/e;

    move-result-object p0

    invoke-virtual {p0, p1}, Ll62/e;->a(Ll62/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/referafriend/ReferAFriendFragment;Lh62/a;)Ll83/a0;
    .locals 1

    const-string v0, "analyticsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->F()Lh62/b;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->H()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lh62/b;->a(Lh62/a;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/referafriend/ReferAFriendFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/referafriend/ReferAFriendFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->P(Lcom/whoop/referafriend/ReferAFriendFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/referafriend/ReferAFriendFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/referafriend/ReferAFriendFragment;->J(Lcom/whoop/referafriend/ReferAFriendFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Lh62/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh62/b;

    return-object v0
.end method

.method public final I()Ls62/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/ReferAFriendFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls62/a;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/referafriend/ReferAFriendFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x14fadd4

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
