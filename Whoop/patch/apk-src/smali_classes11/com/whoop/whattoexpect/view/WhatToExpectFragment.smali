.class public final Lcom/whoop/whattoexpect/view/WhatToExpectFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0015\u001a\u0004\u0008 \u0010!\u00a8\u0006%\u00b2\u0006\u000c\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/whattoexpect/view/WhatToExpectFragment;",
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
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Llw2/b;",
        "w",
        "Ll83/h;",
        "E",
        "()Llw2/b;",
        "viewModel",
        "Lj02/o0;",
        "x",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lgw2/a;",
        "y",
        "D",
        "()Lgw2/a;",
        "analytics",
        "Llw2/c;",
        "viewState",
        "what-to-expect_release"
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

    new-instance v0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->w:Ll83/h;

    new-instance v0, Lnr0/e;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lkw2/a;Lkw2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->J(Lkw2/a;Lkw2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->F(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;)Llw2/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->E()Llw2/b;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lgw2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgw2/a;

    return-object v0
.end method

.method private final E()Llw2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llw2/b;

    return-object v0
.end method

.method private static final F(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 20

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_7

    new-instance v1, Lkw2/a;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v4

    invoke-direct {v0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->getNavigator()Lj02/o0;

    move-result-object v5

    invoke-direct {v0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->D()Lgw2/a;

    move-result-object v6

    invoke-direct {v1, v4, v5, v6}, Lkw2/a;-><init>(Leb/a0;Lj02/o0;Lgw2/a;)V

    invoke-direct {v0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->E()Llw2/b;

    move-result-object v4

    invoke-virtual {v4}, Llw2/b;->getViewState()Lec3/l;

    move-result-object v4

    new-instance v5, Llw2/c;

    const/16 v18, 0x1ff

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v5

    invoke-direct/range {v8 .. v19}, Llw2/c;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Ls21/h;Llw2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v4

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_1

    if-ne v6, v8, :cond_2

    :cond_1
    new-instance v6, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$a;

    const/4 v5, 0x0

    invoke-direct {v6, v0, v5}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment$a;-><init>(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Lq83/d;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lc93/m;

    invoke-static {v7, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->H(Lp1/t2;)Llw2/c;

    move-result-object v4

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    if-ne v6, v8, :cond_4

    :cond_3
    new-instance v6, Lno0/e0;

    const/4 v5, 0x5

    invoke-direct {v6, v0, v5}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_5

    if-ne v5, v8, :cond_6

    :cond_5
    new-instance v5, Lno0/e0;

    const/4 v0, 0x6

    invoke-direct {v5, v1, v0}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v6, v5, v7, v3}, Low2/c;->d(Llw2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-object v2

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    return-object v2
.end method

.method private static final H(Lp1/t2;)Llw2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Llw2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llw2/c;

    return-object p0
.end method

.method private static final I(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Llw2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->E()Llw2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Llw2/b;->n(Llw2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lkw2/a;Lkw2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkw2/a;->a(Lkw2/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->G(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Llw2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/whattoexpect/view/WhatToExpectFragment;->I(Lcom/whoop/whattoexpect/view/WhatToExpectFragment;Llw2/a;)Ll83/a0;

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

    new-instance p1, Lmw1/a;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x4cb78414    # 9.62152E7f

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
