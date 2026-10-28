.class public final Lcom/whoop/health/monitor/view/HeartScreenerFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0015\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/health/monitor/view/HeartScreenerFragment;",
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
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lpi1/d;",
        "w",
        "Ll83/h;",
        "B",
        "()Lpi1/d;",
        "analyticsHelper",
        "",
        "x",
        "D",
        "()Ljava/lang/String;",
        "source",
        "Lxi1/b;",
        "y",
        "C",
        "()Lxi1/b;",
        "router",
        "kennel_release"
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


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/health/monitor/view/HeartScreenerFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/health/monitor/view/HeartScreenerFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->w:Ll83/h;

    new-instance v1, Laj1/a;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Laj1/a;-><init>(Lcom/whoop/health/monitor/view/HeartScreenerFragment;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->x:Ll83/h;

    new-instance v1, Laj1/a;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Laj1/a;-><init>(Lcom/whoop/health/monitor/view/HeartScreenerFragment;I)V

    new-instance v3, Lcom/whoop/health/monitor/view/HeartScreenerFragment$b;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/health/monitor/view/HeartScreenerFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->F(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lpi1/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi1/d;

    return-object v0
.end method

.method private final C()Lxi1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxi1/b;

    return-object v0
.end method

.method private final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final E(Lcom/whoop/health/monitor/view/HeartScreenerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

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

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lti1/d;->b:I

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1, v2, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->C()Lxi1/b;

    move-result-object p0

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    invoke-static {p2, p0, p1, v0}, Lzi1/i;->c(Lcom/whoop/design/util/TextResource;Lxi1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Luf3/a;
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

.method private static final G(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->G(Lcom/whoop/health/monitor/view/HeartScreenerFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/health/monitor/view/HeartScreenerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->E(Lcom/whoop/health/monitor/view/HeartScreenerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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

    invoke-direct {p0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->B()Lpi1/d;

    move-result-object p1

    new-instance p2, Lpi1/c$a;

    invoke-direct {p0}, Lcom/whoop/health/monitor/view/HeartScreenerFragment;->D()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lpi1/c$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lpi1/d;->a(Lpi1/c;)V

    new-instance p1, La80/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, La80/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x3328f72a

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

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
