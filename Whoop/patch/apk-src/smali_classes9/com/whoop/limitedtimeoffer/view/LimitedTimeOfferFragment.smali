.class public final Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0011\u001a\u0004\u0008!\u0010\"R\u001d\u0010%\u001a\u0004\u0018\u00010\u001f8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0011\u001a\u0004\u0008$\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onResume",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lbv1/c;",
        "w",
        "Ll83/h;",
        "E",
        "()Lbv1/c;",
        "navRouter",
        "Lbv1/a;",
        "x",
        "C",
        "()Lbv1/a;",
        "actionRouter",
        "Lzu1/f;",
        "y",
        "D",
        "()Lzu1/f;",
        "ltoDismissHandler",
        "",
        "z",
        "G",
        "()Ljava/lang/String;",
        "source",
        "F",
        "offerId",
        "limited-time-offer_release"
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

    new-instance v0, Lev1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lev1/c;-><init>(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->y:Ll83/h;

    new-instance v0, Lev1/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lev1/c;-><init>(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->z:Ll83/h;

    new-instance v0, Lev1/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lev1/c;-><init>(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->I(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->K(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lbv1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbv1/a;

    return-object v0
.end method

.method private final D()Lzu1/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzu1/f;

    return-object v0
.end method

.method private final E()Lbv1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbv1/c;

    return-object v0
.end method

.method private static final H(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Luf3/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final I(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "offerId"

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

.method private static final J(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->E()Lbv1/c;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->C()Lbv1/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->D()Lzu1/f;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->F()Ljava/lang/String;

    move-result-object p1

    const-string p2, ""

    if-nez p1, :cond_1

    move-object v4, p2

    goto :goto_1

    :cond_1
    move-object v4, p1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->G()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2

    move-object v5, p2

    goto :goto_2

    :cond_2
    move-object v5, p0

    :goto_2
    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lev1/h;->e(Lbv1/c;Lbv1/a;Lzu1/f;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Ljava/lang/String;
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

.method public static synthetic y(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->H(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->J(Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/limitedtimeoffer/view/LimitedTimeOfferFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x334d1eef

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

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method
