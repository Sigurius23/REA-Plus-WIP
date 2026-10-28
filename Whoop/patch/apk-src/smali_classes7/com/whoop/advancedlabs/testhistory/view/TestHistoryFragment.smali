.class public final Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;",
        "Landroidx/fragment/app/m0;",
        "Lof3/a;",
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
        "Loe0/d;",
        "w",
        "Ll83/h;",
        "F",
        "()Loe0/d;",
        "viewModel",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "y",
        "getBaseNavReducer",
        "()Lo02/d;",
        "baseNavReducer",
        "Lya0/a;",
        "z",
        "E",
        "()Lya0/a;",
        "analyticsHelper",
        "Loe0/e;",
        "viewState",
        "advanced-labs_release"
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

    new-instance v0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->w:Ll83/h;

    new-instance v0, Lq80/h;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->K(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Loe0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->L(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Loe0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lne0/b;Lne0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->J(Lne0/b;Lne0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;)Loe0/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->F()Loe0/d;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lya0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lya0/a;

    return-object v0
.end method

.method private final F()Loe0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loe0/d;

    return-object v0
.end method

.method private static final G(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lne0/b;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->getNavigator()Lj02/o0;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lne0/b;-><init>(Leb/a0;Lj02/o0;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->F()Loe0/d;

    move-result-object p2

    invoke-virtual {p2}, Loe0/d;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Loe0/e$b;->b:Loe0/e$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->F()Loe0/d;

    move-result-object v0

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    new-instance v2, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$a;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment$a;-><init>(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Lq83/d;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/m;

    invoke-static {v4, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->I(Lp1/t2;)Loe0/e;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_3

    if-ne v0, v3, :cond_4

    :cond_3
    new-instance v0, Lpf/b;

    const/16 p2, 0xc

    invoke-direct {v0, p1, p2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    if-ne p2, v3, :cond_6

    :cond_5
    new-instance p2, Lqe0/a;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lqe0/a;-><init>(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_7

    if-ne v0, v3, :cond_8

    :cond_7
    new-instance v0, Lqe0/a;

    const/4 p1, 0x1

    invoke-direct {v0, p0, p1}, Lqe0/a;-><init>(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p2

    move-object v5, v4

    move-object v4, v0

    invoke-static/range {v1 .. v7}, Lqe0/c;->G(Loe0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Loe0/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Loe0/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Loe0/e;

    return-object p0
.end method

.method private static final J(Lne0/b;Lne0/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lne0/b;->a(Lne0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->E()Lya0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lya0/a;->e(Lkd0/a$c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Loe0/c;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->F()Loe0/d;

    move-result-object p0

    invoke-virtual {p0, p1}, Loe0/d;->n(Loe0/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->H(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->G(Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/testhistory/view/TestHistoryFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x1174f866

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
