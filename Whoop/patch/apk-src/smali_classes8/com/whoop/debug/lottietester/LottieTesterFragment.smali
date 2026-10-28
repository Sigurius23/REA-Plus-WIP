.class public final Lcom/whoop/debug/lottietester/LottieTesterFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/debug/lottietester/LottieTesterFragment;",
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
        "Ltx0/f;",
        "w",
        "Ll83/h;",
        "A",
        "()Ltx0/f;",
        "viewModel",
        "Ltx0/g;",
        "viewState",
        "debug-tools_release"
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

    new-instance v0, Lcom/whoop/debug/lottietester/LottieTesterFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/debug/lottietester/LottieTesterFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/debug/lottietester/LottieTesterFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/debug/lottietester/LottieTesterFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/debug/lottietester/LottieTesterFragment;->w:Ll83/h;

    return-void
.end method

.method private final A()Ltx0/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/debug/lottietester/LottieTesterFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltx0/f;

    return-object v0
.end method

.method private static final B(Lcom/whoop/debug/lottietester/LottieTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

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

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->A()Ltx0/f;

    move-result-object p1

    invoke-virtual {p1}, Ltx0/f;->getViewState()Lec3/f2;

    move-result-object p1

    new-instance v6, Ltx0/g;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Ltx0/g;-><init>(ZZLgv1/o;Li51/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget p2, Lgv1/o;->a:I

    sget v0, Li51/h;->a:I

    or-int/2addr p2, v0

    shl-int/lit8 v0, p2, 0x3

    invoke-static {p1, v6, v5, v0}, Lvp/c;->z(Lec3/l;Ljava/lang/Object;Lp1/q;I)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->C(Lp1/t2;)Ltx0/g;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->A()Ltx0/f;

    move-result-object p1

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    new-instance v2, Lcom/whoop/debug/lottietester/LottieTesterFragment$a;

    invoke-direct {v2, p1}, Lcom/whoop/debug/lottietester/LottieTesterFragment$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lj93/g;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->A()Ltx0/f;

    move-result-object p1

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v4, Lcom/whoop/debug/lottietester/LottieTesterFragment$b;

    invoke-direct {v4, p1}, Lcom/whoop/debug/lottietester/LottieTesterFragment$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lj93/g;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_5

    if-ne v0, v3, :cond_6

    :cond_5
    new-instance v0, Lsc0/c;

    const/16 p1, 0x9

    invoke-direct {v0, p0, p1}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lc93/a;

    move v6, p2

    move-object v3, v4

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Ltx0/d;->o(Ltx0/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/t2;)Ltx0/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ltx0/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltx0/g;

    return-object p0
.end method

.method private static final D(Lcom/whoop/debug/lottietester/LottieTesterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/debug/lottietester/LottieTesterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->D(Lcom/whoop/debug/lottietester/LottieTesterFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/debug/lottietester/LottieTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->B(Lcom/whoop/debug/lottietester/LottieTesterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/debug/lottietester/LottieTesterFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ltx0/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x384c3566

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
