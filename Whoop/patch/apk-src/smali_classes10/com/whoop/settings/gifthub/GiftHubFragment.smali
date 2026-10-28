.class public final Lcom/whoop/settings/gifthub/GiftHubFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"\u00a8\u0006&\u00b2\u0006\u000e\u0010%\u001a\u0004\u0018\u00010$8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/settings/gifthub/GiftHubFragment;",
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
        "Ltb2/a;",
        "w",
        "Ll83/h;",
        "G",
        "()Ltb2/a;",
        "viewModel",
        "Lpb2/c;",
        "x",
        "E",
        "()Lpb2/c;",
        "navRouter",
        "",
        "y",
        "F",
        "()Ljava/lang/String;",
        "source",
        "Lqb2/e;",
        "viewState",
        "settings_release"
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

    new-instance v0, Lcom/whoop/settings/gifthub/GiftHubFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/settings/gifthub/GiftHubFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/settings/gifthub/GiftHubFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/settings/gifthub/GiftHubFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->w:Ll83/h;

    new-instance v0, Lkb2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkb2/a;-><init>(Lcom/whoop/settings/gifthub/GiftHubFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/settings/gifthub/GiftHubFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/settings/gifthub/GiftHubFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->x:Ll83/h;

    new-instance v0, Lkb2/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lkb2/a;-><init>(Lcom/whoop/settings/gifthub/GiftHubFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/gifthub/GiftHubFragment;Lqb2/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->K(Lcom/whoop/settings/gifthub/GiftHubFragment;Lqb2/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/settings/gifthub/GiftHubFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->M(Lcom/whoop/settings/gifthub/GiftHubFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/settings/gifthub/GiftHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/gifthub/GiftHubFragment;->I(Lcom/whoop/settings/gifthub/GiftHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lp1/t2;)Lqb2/e;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->J(Lp1/t2;)Lqb2/e;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lpb2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpb2/c;

    return-object v0
.end method

.method private static final H(Lcom/whoop/settings/gifthub/GiftHubFragment;)Luf3/a;
    .locals 1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Lcom/whoop/settings/gifthub/GiftHubFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->G()Ltb2/a;

    move-result-object p1

    invoke-virtual {p1}, Ltb2/a;->n()Lec3/t1;

    move-result-object v4

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->J(Lp1/t2;)Lqb2/e;

    move-result-object p2

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/settings/gifthub/GiftHubFragment$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p1, v0}, Lcom/whoop/settings/gifthub/GiftHubFragment$a;-><init>(Lcom/whoop/settings/gifthub/GiftHubFragment;Lp1/t2;Lq83/d;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v7, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->J(Lp1/t2;)Lqb2/e;

    move-result-object p1

    if-nez p1, :cond_3

    const p0, 0x3b65e2c5

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const p2, 0x3b65e2c6

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_4

    if-ne v0, v2, :cond_5

    :cond_4
    new-instance v0, Lkb2/b;

    const/4 p2, 0x0

    invoke-direct {v0, p0, p2}, Lkb2/b;-><init>(Lcom/whoop/settings/gifthub/GiftHubFragment;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p2, :cond_6

    if-ne v1, v2, :cond_7

    :cond_6
    new-instance v1, Lkb2/b;

    const/4 p2, 0x1

    invoke-direct {v1, p0, p2}, Lkb2/b;-><init>(Lcom/whoop/settings/gifthub/GiftHubFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v1, v7, v3}, Lsb2/a;->d(Lqb2/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/t2;)Lqb2/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lqb2/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqb2/e;

    return-object p0
.end method

.method private static final K(Lcom/whoop/settings/gifthub/GiftHubFragment;Lqb2/d;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->G()Ltb2/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Ltb2/a;->o(Lqb2/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/settings/gifthub/GiftHubFragment;Lpb2/a;)Ll83/a0;
    .locals 1

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->E()Lpb2/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lpb2/c;->a(Lpb2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/settings/gifthub/GiftHubFragment;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "source"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_2

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/settings/gifthub/GiftHubFragment;Lpb2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/gifthub/GiftHubFragment;->L(Lcom/whoop/settings/gifthub/GiftHubFragment;Lpb2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/gifthub/GiftHubFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/gifthub/GiftHubFragment;->H(Lcom/whoop/settings/gifthub/GiftHubFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final G()Ltb2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/gifthub/GiftHubFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb2/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/settings/gifthub/GiftHubFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lhb2/f;

    const/16 p2, 0x1a

    invoke-direct {p1, p0, p2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x4cbf737f    # 1.00375544E8f

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
