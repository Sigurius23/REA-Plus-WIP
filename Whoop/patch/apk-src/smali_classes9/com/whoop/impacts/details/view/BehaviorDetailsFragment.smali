.class public final Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0017\u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006&\u00b2\u0006\u000c\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;",
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
        "onResume",
        "Llq1/g;",
        "w",
        "Ll83/h;",
        "C",
        "()Llq1/g;",
        "viewModel",
        "Lgq1/a;",
        "x",
        "B",
        "()Lgq1/a;",
        "analytics",
        "Lkq1/b;",
        "y",
        "Lkq1/b;",
        "navigationRouter",
        "Llq1/h;",
        "viewState",
        "behavior-impact_release"
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

.field private final y:Lkq1/b;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->x:Ll83/h;

    new-instance v0, Lkq1/b;

    invoke-direct {p0}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->B()Lgq1/a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lkq1/b;-><init>(Landroidx/fragment/app/m0;Lgq1/a;)V

    iput-object v0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->y:Lkq1/b;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Llq1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->F(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Llq1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lgq1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgq1/a;

    return-object v0
.end method

.method private final C()Llq1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llq1/g;

    return-object v0
.end method

.method private static final D(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->C()Llq1/g;

    move-result-object p1

    invoke-virtual {p1}, Llq1/g;->getViewState()Lec3/l;

    move-result-object v3

    sget-object v4, Llq1/h$b;->a:Llq1/h$b;

    const/16 v7, 0x30

    const/4 v8, 0x2

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->E(Lp1/t2;)Llq1/h;

    move-result-object p1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Loq1/a;

    const/4 p2, 0x0

    invoke-direct {v0, p0, p2}, Loq1/a;-><init>(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, Loq1/a;

    const/4 p2, 0x1

    invoke-direct {v3, p0, p2}, Loq1/a;-><init>(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0, v3, v6, v2}, Loq1/f;->d(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/t2;)Llq1/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Llq1/h;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llq1/h;

    return-object p0
.end method

.method private static final F(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Llq1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->C()Llq1/g;

    move-result-object p0

    invoke-virtual {p0, p1}, Llq1/g;->n(Llq1/f;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Lkq1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->y:Lkq1/b;

    invoke-virtual {p0, p1}, Lkq1/b;->a(Lkq1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->D(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Lkq1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->G(Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;Lkq1/a;)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x4b6cdd5f

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

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "impactId"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_2

    const-string v0, "isNew"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    sget-object v0, Lgq1/a$b;->Companion:Lgq1/a$b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "source"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_3
    const-string v1, "Impacts Summary"

    :cond_4
    sget-object v2, Lgq1/a$b;->IMPACTS_SUMMARY:Lgq1/a$b;

    invoke-virtual {v0, v1, v2}, Lgq1/a$b$a;->a(Ljava/lang/String;Lgq1/a$b;)Lgq1/a$b;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/impacts/details/view/BehaviorDetailsFragment;->C()Llq1/g;

    move-result-object v1

    new-instance v2, Llq1/f$a;

    new-instance v3, Lhq1/f;

    invoke-direct {v3, p1, v0, p2}, Lhq1/f;-><init>(Ljava/lang/String;Lgq1/a$b;Z)V

    invoke-direct {v2, v3}, Llq1/f$a;-><init>(Lhq1/f;)V

    invoke-virtual {v1, v2}, Llq1/g;->n(Llq1/f;)Lbc3/k1;

    return-void
.end method
