.class public final Lcom/whoop/membership/dunning/DunningBottomSheetFragment;
.super Lpq/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0015\u001a\u0004\u0008 \u0010!R\u001b\u0010\'\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u0015\u001a\u0004\u0008%\u0010&R \u0010.\u001a\u00020(8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008)\u0010*\u0012\u0004\u0008-\u0010\u0003\u001a\u0004\u0008+\u0010,\u00a8\u00061\u00b2\u0006\u000e\u00100\u001a\u0004\u0018\u00010/8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/membership/dunning/DunningBottomSheetFragment;",
        "Lpq/l;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "",
        "getTheme",
        "()I",
        "Lbw1/b;",
        "w",
        "Ll83/h;",
        "K",
        "()Lbw1/b;",
        "viewModel",
        "Law1/b;",
        "x",
        "J",
        "()Law1/b;",
        "navRouter",
        "Lwv1/b;",
        "y",
        "G",
        "()Lwv1/b;",
        "analyticsHelper",
        "Lvv1/a;",
        "z",
        "I",
        "()Lvv1/a;",
        "coordinator",
        "Lpq/c;",
        "E",
        "Lpq/c;",
        "H",
        "()Lpq/c;",
        "getBottomSheetBehaviorCallback$annotations",
        "bottomSheetBehaviorCallback",
        "Lbw1/c;",
        "viewState",
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
.field private final E:Lpq/c;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lpq/l;-><init>()V

    new-instance v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$g;

    invoke-direct {v0, p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$g;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$h;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->w:Ll83/h;

    new-instance v0, Lvv1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$d;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$e;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$f;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$a;-><init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)V

    iput-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->E:Lpq/c;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->P(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->M(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->O(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->L(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Lwv1/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->G()Lwv1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Lvv1/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->I()Lvv1/a;

    move-result-object p0

    return-object p0
.end method

.method private final G()Lwv1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwv1/b;

    return-object v0
.end method

.method private final I()Lvv1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvv1/a;

    return-object v0
.end method

.method private final J()Law1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Law1/b;

    return-object v0
.end method

.method private final K()Lbw1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbw1/b;

    return-object v0
.end method

.method private static final L(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;)Luf3/a;
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

.method private static final M(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->K()Lbw1/b;

    move-result-object p1

    invoke-virtual {p1}, Lbw1/b;->getViewState()Lec3/l;

    move-result-object v4

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->N(Lp1/t2;)Lbw1/c;

    move-result-object p1

    if-nez p1, :cond_1

    const p0, 0x56376cbd

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_1
    const v0, 0x56376cbe

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_2

    if-ne v1, v2, :cond_3

    :cond_2
    new-instance v1, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$c;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$c;-><init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Lq83/d;)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lc93/m;

    invoke-static {v7, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v0, p1, Lbw1/c$b;

    if-eqz v0, :cond_6

    const v0, 0x52813e2d

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    check-cast p1, Lbw1/c$b;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    if-ne v1, v2, :cond_5

    :cond_4
    new-instance v1, Lvv1/d;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lvv1/d;-><init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v7, v3, v3}, Ldw1/f;->j(Lbw1/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lbw1/c$a;

    if-eqz v0, :cond_9

    const v0, 0x5285d773

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    check-cast p1, Lbw1/c$a;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    if-ne v1, v2, :cond_8

    :cond_7
    new-instance v1, Lvv1/d;

    const/4 v0, 0x1

    invoke-direct {v1, p0, v0}, Lvv1/d;-><init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v7, v3, v3}, Ldw1/d;->j(Lbw1/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_1
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    return-object p2

    :cond_9
    const p0, -0x3f673b0a

    invoke-static {p0, v7, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_a
    invoke-virtual {v7}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final N(Lp1/t2;)Lbw1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lbw1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbw1/c;

    return-object p0
.end method

.method private static final O(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->J()Law1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Law1/b;->a(Law1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Law1/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->J()Law1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Law1/b;->a(Law1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final H()Lpq/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->E:Lpq/c;

    return-object v0
.end method

.method public getTheme()I
    .locals 1

    sget v0, Lgy0/g;->a:I

    return v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->getTheme()I

    move-result v0

    new-instance v1, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;

    invoke-direct {v1, p0, p1, v0}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment$b;-><init>(Lcom/whoop/membership/dunning/DunningBottomSheetFragment;Landroid/content/Context;I)V

    return-object v1
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/membership/dunning/DunningBottomSheetFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ltx0/a;

    const/16 p2, 0x1b

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x70abcf86

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
