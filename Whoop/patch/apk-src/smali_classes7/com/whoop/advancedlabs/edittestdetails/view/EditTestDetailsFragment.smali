.class public final Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0012\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0012\u001a\u0004\u0008\'\u0010(\u00a8\u0006,\u00b2\u0006\u000c\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;",
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
        "Lbc0/b;",
        "w",
        "Ll83/h;",
        "K",
        "()Lbc0/b;",
        "viewModel",
        "",
        "x",
        "J",
        "()Ljava/lang/String;",
        "testId",
        "Lor2/u0;",
        "y",
        "I",
        "()Lor2/u0;",
        "localizedDateTimeFormatter",
        "Lzr2/a;",
        "z",
        "H",
        "()Lzr2/a;",
        "dateAndTimeProvider",
        "Lya0/a;",
        "E",
        "G",
        "()Lya0/a;",
        "analyticsHelper",
        "Lbc0/c;",
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
.field private final E:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->w:Ll83/h;

    new-instance v0, Ldc0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldc0/a;-><init>(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->x:Ll83/h;

    new-instance v0, Ldc0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ldc0/a;-><init>(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lbc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->Q(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lbc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->L(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->R(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lac0/b;Lac0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->O(Lac0/b;Lac0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->J()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Lbc0/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->K()Lbc0/b;

    move-result-object p0

    return-object p0
.end method

.method private final G()Lya0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lya0/a;

    return-object v0
.end method

.method private final H()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    return-object v0
.end method

.method private final I()Lor2/u0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/u0;

    return-object v0
.end method

.method private final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final K()Lbc0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc0/b;

    return-object v0
.end method

.method private static final L(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final M(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

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

    if-eqz p1, :cond_a

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Lac0/b;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p1, v0}, Lac0/b;-><init>(Leb/a0;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lac0/b;

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->K()Lbc0/b;

    move-result-object v0

    invoke-virtual {v0}, Lbc0/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lbc0/c$b;->b:Lbc0/c$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->K()Lbc0/b;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    if-ne v3, p2, :cond_3

    :cond_2
    new-instance v3, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$a;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment$a;-><init>(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lq83/d;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lc93/m;

    invoke-static {v4, v3, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->N(Lp1/t2;)Lbc0/c;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->H()Lzr2/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->I()Lor2/u0;

    move-result-object v0

    invoke-virtual {v0}, Lor2/u0;->l()Z

    move-result v3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_4

    if-ne v5, p2, :cond_5

    :cond_4
    new-instance v5, Lck1/c;

    const/16 v0, 0x14

    invoke-direct {v5, p1, v0}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_6

    if-ne v0, p2, :cond_7

    :cond_6
    new-instance v0, Ldc0/b;

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Ldc0/b;-><init>(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez p1, :cond_8

    if-ne v6, p2, :cond_9

    :cond_8
    new-instance v6, Ldc0/b;

    const/4 p1, 0x1

    invoke-direct {v6, p0, p1}, Ldc0/b;-><init>(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v4

    move-object v4, v5

    move-object v5, v0

    invoke-static/range {v1 .. v9}, Ldc0/e;->p(Lbc0/c;Lzr2/a;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/t2;)Lbc0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lbc0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc0/c;

    return-object p0
.end method

.method private static final O(Lac0/b;Lac0/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lac0/b;->a(Lac0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->G()Lya0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lya0/a;->e(Lkd0/a$c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lbc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->K()Lbc0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbc0/b;->n(Lbc0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "testId"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->M(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->P(Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x76fbb3b6

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
