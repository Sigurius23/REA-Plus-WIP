.class public final Lcom/whoop/access/omronauth/view/OmronAuthFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0011\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/access/omronauth/view/OmronAuthFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onResume",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lj02/o0;",
        "w",
        "Ll83/h;",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lx50/b;",
        "x",
        "E",
        "()Lx50/b;",
        "viewModel",
        "Lbc3/c0;",
        "y",
        "C",
        "()Lbc3/c0;",
        "applicationScope",
        "Lu50/d;",
        "z",
        "D",
        "()Lu50/d;",
        "oauthPerformer",
        "access_release"
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
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lyy/b0;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/access/omronauth/view/OmronAuthFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/access/omronauth/view/OmronAuthFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v4, Lcom/whoop/access/omronauth/view/OmronAuthFragment$e;

    invoke-direct {v4, p0, v3, v0, v3}, Lcom/whoop/access/omronauth/view/OmronAuthFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/access/omronauth/view/OmronAuthFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/access/omronauth/view/OmronAuthFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/access/omronauth/view/OmronAuthFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/access/omronauth/view/OmronAuthFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Lx50/a$j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->I(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Lx50/a$j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->G(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    return-object v0
.end method

.method private final D()Lu50/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu50/d;

    return-object v0
.end method

.method private final E()Lx50/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx50/b;

    return-object v0
.end method

.method private static final F(Lcom/whoop/access/omronauth/view/OmronAuthFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 5

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

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_1

    new-instance p2, Lw50/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->getNavigator()Lj02/o0;

    move-result-object v3

    invoke-direct {p2, v1, v3}, Lw50/a;-><init>(Leb/a0;Lj02/o0;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lw50/a;

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->E()Lx50/b;

    move-result-object v1

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2

    if-ne v4, v0, :cond_3

    :cond_2
    new-instance v4, Lz50/a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lz50/a;-><init>(Lcom/whoop/access/omronauth/view/OmronAuthFragment;I)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, v4, p1, v2}, Lz50/e;->e(Lw50/a;Lx50/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Ljava/lang/String;)Ll83/a0;
    .locals 4

    const-string v0, "omronUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->D()Lu50/d;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->C()Lbc3/c0;

    move-result-object v1

    new-instance v2, Lz50/a;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lz50/a;-><init>(Lcom/whoop/access/omronauth/view/OmronAuthFragment;I)V

    invoke-virtual {v0, p1, v1, v2}, Lu50/d;->e(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Lx50/a$j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->E()Lx50/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lx50/b;->n(Lx50/a$j;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->H(Lcom/whoop/access/omronauth/view/OmronAuthFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/access/omronauth/view/OmronAuthFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->F(Lcom/whoop/access/omronauth/view/OmronAuthFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/16 p2, 0x16

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5d094a85

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-direct {p0}, Lcom/whoop/access/omronauth/view/OmronAuthFragment;->E()Lx50/b;

    move-result-object v0

    sget-object v1, Lx50/a$i;->a:Lx50/a$i;

    invoke-virtual {v0, v1}, Lx50/b;->n(Lx50/a$j;)V

    return-void
.end method
