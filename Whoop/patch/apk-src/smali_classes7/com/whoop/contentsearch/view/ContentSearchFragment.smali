.class public final Lcom/whoop/contentsearch/view/ContentSearchFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/contentsearch/view/ContentSearchFragment;",
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
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lpv0/c;",
        "w",
        "Ll83/h;",
        "E",
        "()Lpv0/c;",
        "viewModel",
        "Lfi0/a;",
        "x",
        "C",
        "()Lfi0/a;",
        "analytics",
        "",
        "y",
        "D",
        "()Ljava/lang/String;",
        "entryPoint",
        "content-search_release"
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

    new-instance v0, Lcom/whoop/contentsearch/view/ContentSearchFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/contentsearch/view/ContentSearchFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/contentsearch/view/ContentSearchFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/contentsearch/view/ContentSearchFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/contentsearch/view/ContentSearchFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->x:Ll83/h;

    new-instance v0, Lq80/h;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lsv0/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->G(Lsv0/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Lcom/whoop/contentsearch/view/ContentSearchFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "entryPoint"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lfi0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    return-object v0
.end method

.method private final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final E()Lpv0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/contentsearch/view/ContentSearchFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpv0/c;

    return-object v0
.end method

.method private static final F(Lcom/whoop/contentsearch/view/ContentSearchFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 15

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "ContentSearchNavHost"

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v4, v8, v3, v2}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v5

    new-instance v6, Llv0/b;

    invoke-direct {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->C()Lfi0/a;

    move-result-object v0

    invoke-direct {v6, v0}, Llv0/b;-><init>(Lfi0/a;)V

    new-instance v0, Lsv0/c;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v2

    invoke-direct {v0, v2, v5}, Lsv0/c;-><init>(Leb/a0;Leb/a0;)V

    new-instance v2, Lsv0/a;

    invoke-direct {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->E()Lpv0/c;

    move-result-object v3

    invoke-direct {v2, v3, v0, v6}, Lsv0/a;-><init>(Lpv0/c;Lsv0/c;Llv0/b;)V

    invoke-direct {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->E()Lpv0/c;

    move-result-object v0

    new-instance v3, Lpv0/b$b;

    invoke-direct {v3, v4, v1, v4}, Lpv0/b$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lpv0/c;->p(Lpv0/b;)V

    new-instance v9, Llv0/a$f;

    invoke-direct {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Llv0/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v9}, Llv0/b;->a(Llv0/a;)V

    invoke-direct {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->E()Lpv0/c;

    move-result-object v4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne v0, p0, :cond_2

    :cond_1
    new-instance v0, Lrq0/x;

    const/4 p0, 0x5

    invoke-direct {v0, v2, p0}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lsv0/b;->e(Lpv0/c;Leb/u0;Llv0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lsv0/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lsv0/a;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/contentsearch/view/ContentSearchFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->B(Lcom/whoop/contentsearch/view/ContentSearchFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/contentsearch/view/ContentSearchFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->F(Lcom/whoop/contentsearch/view/ContentSearchFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/contentsearch/view/ContentSearchFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lr12/a;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x325f62a1

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
