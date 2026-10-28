.class public final Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;",
        "Landroidx/fragment/app/m0;",
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
        "Lai0/b;",
        "w",
        "Ll83/h;",
        "C",
        "()Lai0/b;",
        "viewModel",
        "Lai0/c;",
        "viewState",
        "amoeba_release"
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

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lai0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->F(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lai0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;)Lai0/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->C()Lai0/b;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lai0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lai0/b;

    return-object v0
.end method

.method private static final D(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->C()Lai0/b;

    move-result-object p1

    invoke-virtual {p1}, Lai0/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lai0/c$b;->a:Lai0/c$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment$a;-><init>(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lq83/d;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v4, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->E(Lp1/t2;)Lai0/c;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_3

    if-ne v0, v2, :cond_4

    :cond_3
    new-instance v0, Lci0/b;

    const/4 p1, 0x0

    invoke-direct {v0, p0, p1}, Lci0/b;-><init>(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p1, :cond_5

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lci0/b;

    const/4 p1, 0x1

    invoke-direct {v3, p0, p1}, Lci0/b;-><init>(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lci0/d;->l(Lai0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-object p2

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final E(Lp1/t2;)Lai0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lai0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lai0/c;

    return-object p0
.end method

.method private static final F(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lai0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->C()Lai0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lai0/b;->l(Lai0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lzh0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lzh0/a$a;

    if-eqz p1, :cond_0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic y(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lzh0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->G(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Lzh0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->D(Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/amoeba/debug/view/AmoebaDebugFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x281cfd90

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
