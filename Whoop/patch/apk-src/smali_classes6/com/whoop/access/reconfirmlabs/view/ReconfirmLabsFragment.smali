.class public final Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0011\u001a\u0004\u0008\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0011\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0011\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;",
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
        "",
        "w",
        "Ll83/h;",
        "getSource",
        "()Ljava/lang/String;",
        "source",
        "x",
        "I",
        "nextScreen",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lf60/b;",
        "z",
        "J",
        "()Lf60/b;",
        "viewModel",
        "Los1/b;",
        "E",
        "Los1/b;",
        "filePicker",
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
.field private final E:Los1/b;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lh60/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lh60/b;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->w:Ll83/h;

    new-instance v0, Lh60/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lh60/b;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->x:Ll83/h;

    new-instance v0, Lh60/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lh60/b;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->y:Ll83/h;

    new-instance v0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$c;

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->z:Ll83/h;

    new-instance v1, Los1/b;

    new-instance v3, Lh60/c;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Lh60/c;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    new-instance v4, Lh60/c;

    const/4 v0, 0x1

    invoke-direct {v4, p0, v0}, Lh60/c;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Los1/b;-><init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;[Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v2, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->E:Los1/b;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->K(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Lj/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->G(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Lj/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->H(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->N(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->O(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->M(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Lj/a;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->J()Lf60/b;

    move-result-object p0

    new-instance v0, Lf60/a$b;

    invoke-direct {v0, p1}, Lf60/a$b;-><init>(Lj/a;)V

    invoke-virtual {p0, v0}, Lf60/b;->n(Lf60/a$k;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Ljava/util/List;)Ll83/a0;
    .locals 1

    const-string v0, "uris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->J()Lf60/b;

    move-result-object p0

    new-instance v0, Lf60/a$d;

    invoke-direct {v0, p1}, Lf60/a$d;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lf60/b;->n(Lf60/a$k;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final J()Lf60/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf60/b;

    return-object v0
.end method

.method private static final K(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "nextScreen"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final M(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Le60/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->getNavigator()Lj02/o0;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Le60/a;-><init>(Leb/a0;Lj02/o0;)V

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p1

    check-cast v1, Le60/a;

    invoke-direct {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->J()Lf60/b;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_2

    if-ne v0, p2, :cond_3

    :cond_2
    new-instance v0, Lh60/b;

    const/4 p1, 0x3

    invoke-direct {v0, p0, p1}, Lh60/b;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v4, v0

    check-cast v4, Lc93/a;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lh60/b;

    const/4 p1, 0x4

    invoke-direct {v0, p0, p1}, Lh60/b;-><init>(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, v0

    check-cast v5, Lc93/a;

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Lh60/h;->e(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->E:Los1/b;

    invoke-virtual {p0}, Los1/b;->e()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->E:Los1/b;

    invoke-virtual {p0}, Los1/b;->f()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->P(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->L(Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/access/reconfirmlabs/view/ReconfirmLabsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/16 p2, 0x1b

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x49e49bad

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

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method
