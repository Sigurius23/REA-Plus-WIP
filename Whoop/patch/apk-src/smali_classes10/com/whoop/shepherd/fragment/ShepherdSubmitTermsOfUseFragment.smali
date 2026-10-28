.class public final Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;",
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
        "Lge2/b;",
        "w",
        "Ll83/h;",
        "B",
        "()Lge2/b;",
        "viewModel",
        "Lge2/c;",
        "viewState",
        "shepherd_release"
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

    new-instance v0, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment$a;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lfe2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->E(Lfe2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lge2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lge2/b;

    return-object v0
.end method

.method private static final C(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Lfe2/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p1, v0}, Lfe2/a;-><init>(Leb/a0;)V

    invoke-virtual {v4, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lfe2/a;

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->B()Lge2/b;

    move-result-object v0

    invoke-virtual {v0}, Lge2/b;->getViewState()Lec3/l;

    move-result-object v0

    sget-object v1, Lge2/c$b;->a:Lge2/c$b;

    const/16 v2, 0x30

    invoke-static {v0, v1, v4, v2}, Lvp/c;->z(Lec3/l;Ljava/lang/Object;Lp1/q;I)Lp1/c1;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->D(Lp1/t2;)Lge2/c;

    move-result-object v1

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    if-ne v2, p2, :cond_3

    :cond_2
    new-instance v2, Lnr0/e;

    const/16 v0, 0xe

    invoke-direct {v2, p1, v0}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lnr0/e;

    const/16 p1, 0xf

    invoke-direct {v0, p0, p1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v0

    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lhe2/d;->e(Lge2/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/t2;)Lge2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lge2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lge2/c;

    return-object p0
.end method

.method private static final E(Lfe2/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lfe2/a;->a()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->B()Lge2/b;

    move-result-object p0

    sget-object v0, Lge2/a$a;->a:Lge2/a$a;

    invoke-virtual {p0, v0}, Lge2/b;->l(Lge2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->F(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->C(Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/shepherd/fragment/ShepherdSubmitTermsOfUseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x1facc5b8

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
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
