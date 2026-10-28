.class public final Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
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
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lhp1/g;",
        "w",
        "Ll83/h;",
        "H",
        "()Lhp1/g;",
        "viewModel",
        "Lyn1/b;",
        "x",
        "E",
        "()Lyn1/b;",
        "analyticsHelper",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;",
        "y",
        "G",
        "()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;",
        "screen",
        "",
        "z",
        "F",
        "()Ljava/lang/String;",
        "id",
        "Lhp1/h;",
        "viewState",
        "hormonal-insights_release"
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

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->x:Ll83/h;

    new-instance v0, Ljp1/i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ljp1/i;-><init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->y:Ll83/h;

    new-instance v0, Ljp1/i;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljp1/i;-><init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->J(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->N(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->L(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->O(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lyn1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyn1/b;

    return-object v0
.end method

.method private final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final G()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    return-object v0
.end method

.method private final H()Lhp1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhp1/g;

    return-object v0
.end method

.method private static final I(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "id"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method private static final J(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->H()Lhp1/g;

    move-result-object p1

    invoke-virtual {p1}, Lhp1/g;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lhp1/h$d;->a:Lhp1/h$d;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-static {p1}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->K(Lp1/t2;)Lhp1/h;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Ljp1/j;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Ljp1/j;-><init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p2

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Ljp1/j;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Ljp1/j;-><init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    if-ne p2, v0, :cond_6

    :cond_5
    new-instance p2, Ljp1/i;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Ljp1/i;-><init>(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p2, Lc93/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, v4

    move-object v4, p2

    invoke-static/range {v1 .. v7}, Ljp1/o;->i(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lp1/t2;)Lhp1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lhp1/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhp1/h;

    return-object p0
.end method

.method private static final L(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->E()Lyn1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyn1/b;->M(Lyn1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lhp1/f;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhp1/f$b;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lhp1/f$a;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->G()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v0

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    if-eq v0, v1, :cond_1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->H()Lhp1/g;

    move-result-object p0

    invoke-virtual {p0, p1}, Lhp1/g;->o(Lhp1/f;)Lbc3/k1;

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->H()Lhp1/g;

    move-result-object p0

    invoke-virtual {p0, p1}, Lhp1/g;->o(Lhp1/f;)Lbc3/k1;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "screen"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

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

.method public static synthetic y(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->I(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->M(Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhb2/f;

    const/16 p2, 0x14

    invoke-direct {p1, p0, p2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x2cf43216

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-static {p0}, Lhj0/p;->a(Landroidx/fragment/app/m0;)Lsm2/a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->H()Lhp1/g;

    move-result-object p1

    new-instance p2, Lhp1/f$d;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->G()Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/postpartum/view/PostPartumFragment;->F()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lhp1/f$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lhp1/g;->o(Lhp1/f;)Lbc3/k1;

    return-void
.end method
