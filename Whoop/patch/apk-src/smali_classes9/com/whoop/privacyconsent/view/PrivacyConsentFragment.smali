.class public final Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010\'\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u0016\u001a\u0004\u0008%\u0010&\u00a8\u0006*\u00b2\u0006\u000c\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "Ln42/f;",
        "F",
        "(Landroid/os/Bundle;)Ln42/f;",
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
        "onResume",
        "Lp42/a;",
        "w",
        "Ll83/h;",
        "G",
        "()Lp42/a;",
        "viewModel",
        "Lor2/y;",
        "x",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lg42/a;",
        "y",
        "D",
        "()Lg42/a;",
        "privacyConsentAnalytics",
        "z",
        "E",
        "()Ln42/f;",
        "screenArgs",
        "Ln42/h;",
        "viewState",
        "privacy-consent_release"
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

    new-instance v0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$b;

    invoke-direct {v2, p0, v3, v3}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->x:Ll83/h;

    new-instance v2, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$c;

    invoke-direct {v2, p0, v3, v3}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->y:Ll83/h;

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/16 v2, 0x15

    invoke-direct {v0, p0, v2}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Ll42/b;Ll42/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->J(Ll42/b;Ll42/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->H(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;)Lg42/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->D()Lg42/a;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lg42/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg42/a;

    return-object v0
.end method

.method private final E()Ln42/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln42/f;

    return-object v0
.end method

.method private final F(Landroid/os/Bundle;)Ln42/f;
    .locals 3

    if-nez p1, :cond_0

    new-instance p1, Ln42/f;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0, v1}, Ln42/f;-><init>(Lj02/u0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    new-instance v0, Ln42/f;

    sget-object v1, Lj02/u0;->Companion:Lj02/u0$a;

    const-string v2, "mode"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lj02/u0$a;->a(Ljava/lang/String;)Lj02/u0;

    move-result-object p1

    invoke-direct {v0, p1}, Ln42/f;-><init>(Lj02/u0;)V

    return-object v0
.end method

.method private final G()Lp42/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp42/a;

    return-object v0
.end method

.method private static final H(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

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
    and-int/lit8 v1, p2, 0x1

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-direct {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->G()Lp42/a;

    move-result-object v0

    invoke-virtual {v0}, Lp42/a;->getViewState()Lec3/l;

    move-result-object v4

    new-instance v5, Ln42/h;

    const/4 v12, 0x5

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v13}, Ln42/h;-><init>(ZZLn42/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    new-instance v8, Ll42/b;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v9

    invoke-direct {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v10

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v11

    const-string v1, "requireActivity(...)"

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Lf42/a;->f:I

    invoke-virtual {p0, v1}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v12

    const-string v1, "getString(...)"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v4, Lf42/a;->q:I

    invoke-virtual {p0, v4}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {v8 .. v13}, Ll42/b;-><init>(Leb/a0;Lor2/y;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v4, 0x0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_1

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lp1/c1;

    invoke-static {v0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->I(Lp1/t2;)Ln42/h;

    move-result-object v6

    invoke-virtual {v6}, Ln42/h;->a()Ln42/g;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ln42/g;->i()Z

    move-result v6

    if-ne v6, v3, :cond_2

    move v2, v3

    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v7, v2}, Lp1/q;->h(Z)Z

    move-result v6

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_3

    if-ne v9, v5, :cond_4

    :cond_3
    new-instance v9, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$a;

    invoke-direct {v9, v2, v1, p0, v4}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment$a;-><init>(ZLp1/c1;Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Lq83/d;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lc93/m;

    invoke-static {v7, v9, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->I(Lp1/t2;)Ln42/h;

    move-result-object v4

    invoke-direct {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->E()Ln42/f;

    move-result-object v0

    invoke-virtual {v0}, Ln42/f;->a()Lj02/u0;

    move-result-object v0

    invoke-virtual {v7, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    if-ne v3, v5, :cond_6

    :cond_5
    new-instance v3, Llc0/c;

    const/16 v2, 0x16

    invoke-direct {v3, v8, v2}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v6, v3

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_7

    if-ne v3, v5, :cond_8

    :cond_7
    new-instance v3, Llq0/d;

    const/16 v2, 0x17

    invoke-direct {v3, v2, v1, p0}, Llq0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v0

    move-object v8, v7

    move-object v7, v3

    invoke-static/range {v4 .. v10}, Lo42/k;->f0(Ln42/h;Lj02/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_9
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Ln42/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ln42/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln42/h;

    return-object p0
.end method

.method private static final J(Ll42/b;Ll42/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ll42/b;->a(Ll42/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/c1;Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Lj42/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lj42/a$g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj42/a$g;

    invoke-virtual {v0}, Lj42/a$g;->a()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p1}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->G()Lp42/a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lp42/a;->o(Lj42/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;)Ln42/f;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->F(Landroid/os/Bundle;)Ln42/f;

    move-result-object p0

    return-object p0
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method public static synthetic y(Lp1/c1;Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Lj42/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->K(Lp1/c1;Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;Lj42/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;)Ln42/f;
    .locals 0

    invoke-static {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->L(Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;)Ln42/f;

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

    invoke-direct {p0}, Lcom/whoop/privacyconsent/view/PrivacyConsentFragment;->D()Lg42/a;

    move-result-object p1

    invoke-virtual {p1}, Lg42/a;->b()V

    new-instance p1, Lmw1/a;

    const/16 p2, 0x8

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x2aac3ea6

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
