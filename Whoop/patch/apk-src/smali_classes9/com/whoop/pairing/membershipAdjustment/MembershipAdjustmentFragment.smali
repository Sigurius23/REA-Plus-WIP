.class public final Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010!\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0016\u001a\u0004\u0008 \u0010\u001dR\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0016\u001a\u0004\u0008$\u0010%R\u001b\u0010*\u001a\u00020\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u0016\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;",
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
        "Lg22/d;",
        "w",
        "Ll83/h;",
        "I",
        "()Lg22/d;",
        "viewModel",
        "",
        "x",
        "G",
        "()Ljava/lang/String;",
        "strapSerial",
        "y",
        "H",
        "strapSignature",
        "Lc22/b;",
        "z",
        "F",
        "()Lc22/b;",
        "source",
        "Lf22/f;",
        "E",
        "()Lf22/f;",
        "navigationRouter",
        "pairing-ui_release"
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

    new-instance v0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->w:Ll83/h;

    new-instance v0, Lc22/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc22/a;-><init>(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->x:Ll83/h;

    new-instance v0, Lc22/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lc22/a;-><init>(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->y:Ll83/h;

    new-instance v0, Lc22/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lc22/a;-><init>(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->z:Ll83/h;

    new-instance v0, Lc22/a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lc22/a;-><init>(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->J(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->N(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->K(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Lc22/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->M(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Lc22/b;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lf22/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf22/f;

    return-object v0
.end method

.method private final F()Lc22/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc22/b;

    return-object v0
.end method

.method private final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final I()Lg22/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg22/d;

    return-object v0
.end method

.method private static final J(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v1

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->I()Lg22/d;

    move-result-object v3

    const/4 p1, 0x0

    const/4 p2, 0x6

    const-string v0, "MembershipAdjustmentNavHost"

    invoke-static {v0, p1, v10, p2, v2}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v4

    invoke-direct {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->F()Lc22/b;

    move-result-object p1

    sget-object p2, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v1, :cond_2

    if-ne p1, v2, :cond_1

    sget-object p1, Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;->PAIRING_FIRST_FLOW_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;

    :goto_1
    move-object v5, p1

    goto :goto_2

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p1, Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;->PAIRING_FLOW_MEMBERSHIP_ADJUSTMENT:Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;

    goto :goto_1

    :goto_2
    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_4

    :cond_3
    new-instance p2, La1/b;

    const/16 p1, 0x19

    invoke-direct {p2, p0, p1}, La1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v7

    const-string p1, "getParentFragmentManager(...)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->G()Ljava/lang/String;

    move-result-object v8

    invoke-direct {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->H()Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lf22/c;->o(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Lf22/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->E()Lf22/f;

    move-result-object p0

    invoke-virtual {p0, p1}, Lf22/f;->a(Lf22/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Lc22/b;
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    sget-object v0, Lc22/b;->PAIRING_FLOW:Lc22/b;

    invoke-static {}, Lc22/b;->values()[Lc22/b;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_3

    return-object v0

    :cond_3
    return-object v4
.end method

.method private static final N(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "strapSerial"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method private static final O(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "strapSignature"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Lf22/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->L(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;Lf22/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->O(Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;)Ljava/lang/String;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, La80/c;

    const/16 p2, 0x14

    invoke-direct {p1, p0, p2}, La80/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x7d97ea0a

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
