.class public final Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;",
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
        "Lw22/c;",
        "w",
        "Ll83/h;",
        "B",
        "()Lw22/c;",
        "navRouter",
        "Lw22/a;",
        "x",
        "A",
        "()Lw22/a;",
        "actionRouter",
        "payments_release"
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


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lyy/b0;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->x:Ll83/h;

    return-void
.end method

.method private final A()Lw22/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw22/a;

    return-object v0
.end method

.method private final B()Lw22/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw22/c;

    return-object v0
.end method

.method private static final C(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;)Luf3/a;
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

.method private static final D(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

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

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    const-string v1, "source"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p2}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p2, :cond_3

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p2

    :cond_3
    :goto_2
    if-nez v0, :cond_4

    const-string p2, "unknown_source"

    goto :goto_3

    :cond_4
    move-object p2, v0

    :goto_3
    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Ljava/lang/String;

    invoke-direct {p0}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->B()Lw22/c;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->A()Lw22/a;

    move-result-object p0

    const/4 v1, 0x6

    invoke-static {p2, v0, p0, p1, v1}, Lz22/i;->e(Ljava/lang/String;Lw22/c;Lw22/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->C(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->D(Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/payments/feature/paymentmethodmanagement/view/PaymentMethodManagementFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x74fa517b

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
