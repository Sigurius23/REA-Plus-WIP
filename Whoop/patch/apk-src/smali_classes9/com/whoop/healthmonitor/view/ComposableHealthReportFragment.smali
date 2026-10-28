.class public final Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0003R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u001b\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u001b\u001a\u0004\u0008&\u0010\'\u00a8\u0006+\u00b2\u0006\u000c\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ljava/io/File;",
        "file",
        "Ll83/a0;",
        "K",
        "(Ljava/io/File;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
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
        "onDestroyView",
        "Lak1/c;",
        "w",
        "Ll83/h;",
        "E",
        "()Lak1/c;",
        "viewModel",
        "Lor2/k1;",
        "x",
        "D",
        "()Lor2/k1;",
        "shareUtil",
        "Lvj1/b;",
        "y",
        "C",
        "()Lvj1/b;",
        "analyticHelper",
        "Lck1/k;",
        "viewState",
        "health-monitor_release"
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

    new-instance v0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$c;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$d;-><init>(Landroidx/fragment/app/m0;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->x:Ll83/h;

    new-instance v1, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->H(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Ljava/io/File;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->I(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Ljava/io/File;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lvj1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvj1/b;

    return-object v0
.end method

.method private final D()Lor2/k1;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/k1;

    return-object v0
.end method

.method private final E()Lak1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lak1/c;

    return-object v0
.end method

.method private static final F(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->E()Lak1/c;

    move-result-object p1

    invoke-virtual {p1}, Lak1/c;->o()Lec3/f2;

    move-result-object p1

    invoke-static {p1, v7, v2}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->G(Lp1/t2;)Lck1/k;

    move-result-object v3

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, La1/j;

    const/16 p1, 0x11

    invoke-direct {p2, p0, p1}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v4, p2

    check-cast v4, Lc93/a;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lck1/c;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_5

    new-instance p0, Lcj2/a;

    const/16 p1, 0xb

    invoke-direct {p0, p1}, Lcj2/a;-><init>(I)V

    invoke-virtual {v7, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v6, p0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v8, 0xc00

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lck1/j;->g(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp1/t2;)Lck1/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lck1/k;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lck1/k;

    return-object p0
.end method

.method private static final H(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Ljava/io/File;)Ll83/a0;
    .locals 1

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->K(Ljava/io/File;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Ljava/lang/String;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final K(Ljava/io/File;)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->C()Lvj1/b;

    move-result-object v0

    sget-object v1, Lvj1/a$e;->b:Lvj1/a$e;

    invoke-virtual {v0, v1}, Lvj1/b;->a(Lvj1/a;)V

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->D()Lor2/k1;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lor2/k1;->a(Ljava/io/File;Landroid/content/Context;Landroid/content/IntentSender;)V

    return-void
.end method

.method public static synthetic y(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->J(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->F(Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x2d5fefbe

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->C()Lvj1/b;

    move-result-object v0

    sget-object v1, Lvj1/a$a;->b:Lvj1/a$a;

    invoke-virtual {v0, v1}, Lvj1/b;->a(Lvj1/a;)V

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->E()Lak1/c;

    move-result-object v0

    invoke-virtual {v0}, Lak1/c;->l()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/healthmonitor/view/ComposableHealthReportFragment;->E()Lak1/c;

    move-result-object p1

    invoke-virtual {p1}, Lak1/c;->n()V

    return-void
.end method
