.class public final Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;",
        "Landroidx/fragment/app/y;",
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
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onStart",
        "onStop",
        "Lj02/o0;",
        "w",
        "Ll83/h;",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
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


# instance fields
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    new-instance v0, Ldn2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldn2/a;-><init>(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->D(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->F(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->E(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_5

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lck1/c;

    const/16 p1, 0x17

    invoke-direct {p2, p0, p1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v1, p2

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Ldn2/a;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Ldn2/a;-><init>(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v2, p2

    check-cast v2, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lb70/d;->m(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->getNavigator()Lj02/o0;

    move-result-object v0

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic z(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;->G(Lcom/whoop/ui/onboarding/dayzero/DayZeroSplashDialogFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    sget v0, Lgy0/g;->b:I

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/y;->setStyle(II)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/y;->setCancelable(Z)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lci0/a;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x44d76316

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    const/16 v1, 0x200

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/y;->onStop()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
