.class public final Lcom/whoop/settings/GiftWhoopFragment;
.super Lcom/whoop/settings/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001a\u001a\u0004\u0008 \u0010!R+\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/whoop/settings/GiftWhoopFragment;",
        "Lcom/whoop/settings/i;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "L",
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
        "",
        "x",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lcom/whoop/settings/m;",
        "y",
        "Ll83/h;",
        "K",
        "()Lcom/whoop/settings/m;",
        "viewModel",
        "Lor2/y;",
        "z",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lii0/o;",
        "<set-?>",
        "E",
        "Lcom/whoop/ui/b;",
        "J",
        "()Lii0/o;",
        "P",
        "(Lii0/o;)V",
        "binding",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic F:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final G:I


# instance fields
.field private final E:Lcom/whoop/ui/b;

.field private final x:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/settings/GiftWhoopFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/android/databinding/FragmentGiftWhoopLandingBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/settings/GiftWhoopFragment;->F:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/settings/GiftWhoopFragment;->G:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/settings/i;-><init>()V

    const-string v0, "GiftWhoopFragment"

    iput-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->x:Ljava/lang/String;

    new-instance v0, Lcom/whoop/settings/GiftWhoopFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/settings/GiftWhoopFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/settings/GiftWhoopFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/settings/GiftWhoopFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->y:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/settings/GiftWhoopFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/settings/GiftWhoopFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->z:Ll83/h;

    const/4 v0, 0x1

    invoke-static {p0, v3, v0, v3}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->E:Lcom/whoop/ui/b;

    return-void
.end method

.method public static synthetic G(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->O(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->N(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->M(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final J()Lii0/o;
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->E:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/settings/GiftWhoopFragment;->F:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii0/o;

    return-object v0
.end method

.method private final K()Lcom/whoop/settings/m;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/settings/m;

    return-object v0
.end method

.method private final L()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->J()Lii0/o;

    move-result-object v0

    iget-object v0, v0, Lii0/o;->h:Landroid/widget/TextView;

    const-string v1, "shareYourCode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lea2/h;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lea2/h;-><init>(Lcom/whoop/settings/GiftWhoopFragment;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->J()Lii0/o;

    move-result-object v0

    iget-object v0, v0, Lii0/o;->a:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v1, "btnGiftWhoop"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lea2/h;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lea2/h;-><init>(Lcom/whoop/settings/GiftWhoopFragment;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->J()Lii0/o;

    move-result-object v0

    iget-object v0, v0, Lii0/o;->b:Landroid/widget/ImageView;

    const-string v1, "giftWhoopBack"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lea2/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lea2/h;-><init>(Lcom/whoop/settings/GiftWhoopFragment;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final M(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->K()Lcom/whoop/settings/m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/m;->S()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Lhj0/m;->getEventDispatcher()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->S0()V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->K()Lcom/whoop/settings/m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/m;->S()Ljava/lang/String;

    move-result-object p1

    const-string v0, "?source=gift-page"

    invoke-static {p1, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "text/plain"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lxp0/d0;->g2:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final N(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhj0/m;->getEventDispatcher()Lz82/e;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "screen"

    const-string v2, "In App Gift Page"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "Click to webview"

    invoke-virtual {p1, v1, v0}, Lz82/e;->I0(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    const-string v0, "requireActivity(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lor2/y;->l(Landroid/app/Activity;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/settings/GiftWhoopFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final P(Lii0/o;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->E:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/settings/GiftWhoopFragment;->F:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/GiftWhoopFragment;->x:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lii0/o;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/o;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/settings/GiftWhoopFragment;->P(Lii0/o;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->J()Lii0/o;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/settings/GiftWhoopFragment;->L()V

    invoke-virtual {p0}, Lhj0/m;->getEventDispatcher()Lz82/e;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string v0, "screen"

    const-string v1, "In App Gift Page"

    invoke-direct {p2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    const-string v0, "Load"

    invoke-virtual {p1, v0, p2}, Lz82/e;->I0(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
