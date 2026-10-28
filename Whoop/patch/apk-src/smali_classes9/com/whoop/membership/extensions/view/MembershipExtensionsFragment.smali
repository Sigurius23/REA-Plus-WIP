.class public final Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0018\u001a\u0004\u0008#\u0010$R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\u0018\u001a\u0004\u0008(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010\u0018\u001a\u0004\u0008-\u0010.R\u001b\u00102\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010\u0018\u001a\u0004\u00081\u0010.R\u001d\u00105\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u0010\u0018\u001a\u0004\u00084\u0010)R\u001d\u00108\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u0010\u0018\u001a\u0004\u00087\u0010)R\u001b\u0010;\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00089\u0010\u0018\u001a\u0004\u0008:\u0010.R\u001d\u0010>\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008<\u0010\u0018\u001a\u0004\u0008=\u0010)R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010\u0018\u001a\u0004\u0008A\u0010B\u00a8\u0006E\u00b2\u0006\u000c\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010D\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;",
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
        "onResume",
        "Liw1/i;",
        "viewState",
        "C0",
        "(Liw1/i;)V",
        "D0",
        "Liw1/h;",
        "w",
        "Ll83/h;",
        "f0",
        "()Liw1/h;",
        "viewModel",
        "Lq22/e;",
        "x",
        "c0",
        "()Lq22/e;",
        "paymentsFormValidator",
        "Lhw1/b;",
        "y",
        "Z",
        "()Lhw1/b;",
        "navigationRouter",
        "",
        "z",
        "d0",
        "()Ljava/lang/String;",
        "promoCode",
        "",
        "E",
        "i0",
        "()Z",
        "isOnTrial",
        "F",
        "k0",
        "isReactivationUpsell",
        "G",
        "e0",
        "sku",
        "H",
        "b0",
        "path",
        "I",
        "g0",
        "isFromLto",
        "J",
        "a0",
        "newTier",
        "Lew1/a;",
        "K",
        "Y",
        "()Lew1/a;",
        "analyticsHelper",
        "currentViewState",
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lkw1/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    new-instance v1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$h;

    invoke-direct {v1, p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$h;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$i;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$e;

    invoke-direct {v1, p0, v4, v4}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->x:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    new-instance v2, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$f;

    invoke-direct {v2, p0, v4, v1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->y:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->z:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->E:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->F:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->G:Ll83/h;

    new-instance v1, Lkw1/p;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->H:Ll83/h;

    new-instance v1, Lkw1/p;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->I:Ll83/h;

    new-instance v1, Lkw1/p;

    const/16 v2, 0x9

    invoke-direct {v1, p0, v2}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->J:Ll83/h;

    new-instance v1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$g;

    invoke-direct {v1, p0, v4, v4}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->K:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->m0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "path"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->j0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result p0

    return p0
.end method

.method private static final B0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "promoCode"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->t0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method private final C0(Liw1/i;)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkw1/q;->a(Liw1/i;)Z

    move-result p1

    if-nez p1, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object p1

    sget-object v0, Liw1/c$e;->a:Liw1/c$e;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v2}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    return-void
.end method

.method public static synthetic D(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->w0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final D0()V
    .locals 7

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    new-instance v1, Liw1/a$e;

    new-instance v2, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->e0()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_0

    move-object v3, v4

    :cond_0
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v5

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->a0()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v3, v5, v6}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->b0()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v3

    :goto_0
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v4, v3}, Liw1/a$e;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Liw1/h;->w(Liw1/h;Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)Lbc3/k1;

    return-void
.end method

.method public static synthetic E(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->F0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "sku"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->z0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Z()Lhw1/b;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->B0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->x0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->q0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->E0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->n0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->l0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic M(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->A0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->o0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->r0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->y0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->u0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static final synthetic R(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Lhw1/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Z()Lhw1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Liw1/h;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic U(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->g0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic V(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic W(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->k0()Z

    move-result p0

    return p0
.end method

.method public static final synthetic X(Lp1/t2;)Liw1/i;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object p0

    return-object p0
.end method

.method private final Y()Lew1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lew1/a;

    return-object v0
.end method

.method private final Z()Lhw1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhw1/b;

    return-object v0
.end method

.method private final a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final b0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final c0()Lq22/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq22/e;

    return-object v0
.end method

.method private final d0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final e0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final f0()Liw1/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liw1/h;

    return-object v0
.end method

.method private final g0()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static final h0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "isFromLto"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final i0()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static final j0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "isOnTrial"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final k0()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private static final l0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "isReactivationUpsell"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final m0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Luf3/a;
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

.method private static final n0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "newTier"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

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

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_19

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object p1

    invoke-virtual {p1}, Liw1/h;->getViewState()Lec3/l;

    move-result-object v4

    sget-object v5, Liw1/d$b;->a:Liw1/d$b;

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v4, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b;

    invoke-direct {v1, p0, v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$b;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lq83/d;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v7, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    if-ne v1, v4, :cond_4

    :cond_3
    new-instance v1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c;

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$c;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Lq83/d;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lc93/m;

    invoke-static {v7, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object v0

    invoke-static {v0, v7}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v2, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_5

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Ljp1/c;

    const/16 v2, 0xf

    invoke-direct {v5, v2, p0, v0}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5, v7}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object v0

    instance-of v1, v0, Liw1/k;

    if-eqz v1, :cond_b

    const v0, -0x3276775c

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ReactivationUpsellLandingViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Liw1/k;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    if-ne v1, v4, :cond_8

    :cond_7
    new-instance v1, Lkw1/o;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    if-ne v1, v4, :cond_a

    :cond_9
    new-instance v1, Lkw1/o;

    const/4 v0, 0x1

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v8, v7

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Y()Lew1/a;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, Lkw1/t;->q(Liw1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_b
    instance-of v1, v0, Liw1/d;

    if-eqz v1, :cond_10

    const v0, -0x3276386d

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsLandingV2ViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Liw1/d;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_c

    if-ne v1, v4, :cond_d

    :cond_c
    new-instance v1, Lkw1/o;

    const/4 v0, 0x2

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_e

    if-ne v1, v4, :cond_f

    :cond_e
    new-instance v1, Lkw1/o;

    const/4 v0, 0x3

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lkw1/j;->r(Liw1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_10
    instance-of v1, v0, Liw1/b;

    if-eqz v1, :cond_15

    const v0, -0x3275fdbc

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsCheckoutViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Liw1/b;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->c0()Lq22/e;

    move-result-object v5

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_11

    if-ne v1, v4, :cond_12

    :cond_11
    new-instance v1, Lkw1/o;

    const/4 v0, 0x4

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_13

    if-ne v1, v4, :cond_14

    :cond_13
    new-instance v1, Lkw1/p;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lkw1/p;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v1, Lc93/a;

    sget p0, Lq22/e;->d:I

    shl-int/lit8 v9, p0, 0x3

    const/4 v10, 0x0

    move-object v4, p1

    move-object v8, v7

    move-object v7, v1

    invoke-static/range {v4 .. v10}, Lkw1/d;->v(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_15
    instance-of v0, v0, Liw1/f;

    if-eqz v0, :cond_18

    const v0, -0x32758c50

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->p0(Lp1/t2;)Liw1/i;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsPostCheckoutViewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Liw1/f;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_16

    if-ne v1, v4, :cond_17

    :cond_16
    new-instance v1, Lkw1/o;

    const/4 v0, 0x5

    invoke-direct {v1, p0, v0}, Lkw1/o;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->g0()Z

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v9}, Lkw1/g;->f(Liw1/f;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_18
    const p0, -0x32767b12

    invoke-static {p0, v7, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_19
    invoke-virtual {v7}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final p0(Lp1/t2;)Liw1/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Liw1/i;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liw1/i;

    return-object p0
.end method

.method private static final q0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Ll83/a0;
    .locals 3

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    sget-object v1, Liw1/a$b;->a:Liw1/a$b;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, v2, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->g0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Z()Lhw1/b;

    move-result-object p0

    sget-object v0, Lhw1/a$a;->a:Lhw1/a$a;

    invoke-virtual {p0, v0}, Lhw1/b;->a(Lhw1/a;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    sget-object v1, Liw1/a$c;->a:Liw1/a$c;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, v1, v2, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/e;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s0(Lp1/t2;)Liw1/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Liw1/i;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liw1/i;

    return-object p0
.end method

.method private static final t0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Leu/k;

    const/4 v0, 0x5

    invoke-direct {p2, v0, p0, p1}, Leu/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$d;

    invoke-direct {p1, p0, p2}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$d;-><init>(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final u0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p2, p2, p3

    const/4 p3, 0x1

    if-eq p2, p3, :cond_1

    const/4 p3, 0x2

    if-eq p2, p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->g0()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->s0(Lp1/t2;)Liw1/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->C0(Liw1/i;)V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->g0()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->D0()V

    return-void

    :cond_2
    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->k0()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object p1

    sget-object p2, Liw1/j$c;->a:Liw1/j$c;

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p1, p2, p3, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    :cond_3
    :goto_0
    return-void
.end method

.method private static final v0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/j;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Z()Lhw1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lhw1/b;->a(Lhw1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/c;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->h0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;)Z

    move-result p0

    return p0
.end method

.method private static final y0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Lhw1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->Z()Lhw1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lhw1/b;->a(Lhw1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->v0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;Liw1/a;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->f0()Liw1/h;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->d0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->i0()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Liw1/h;->v(Liw1/g;Ljava/lang/String;Ljava/lang/Boolean;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lkk1/b;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x75438574

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
