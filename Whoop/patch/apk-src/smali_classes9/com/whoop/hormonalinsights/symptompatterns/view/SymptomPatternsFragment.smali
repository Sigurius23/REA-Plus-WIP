.class public final Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006#\u00b2\u0006\u000c\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;",
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
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lyp1/a;",
        "w",
        "Ll83/h;",
        "G",
        "()Lyp1/a;",
        "viewModel",
        "Lxp1/b;",
        "x",
        "F",
        "()Lxp1/b;",
        "router",
        "Lyn1/b;",
        "y",
        "E",
        "()Lyn1/b;",
        "analyticsHelper",
        "Lyp1/b;",
        "viewState",
        "hormonal-insights_release"
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
    .locals 5

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Laq1/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Laq1/a;-><init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V

    new-instance v1, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$c;

    invoke-direct {v1, p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$d;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4, v1, v0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->w:Ll83/h;

    new-instance v0, Laq1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Laq1/a;-><init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$a;

    invoke-direct {v2, p0, v4, v0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$b;

    invoke-direct {v0, p0, v4, v4}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->L(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lxp1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->K(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lxp1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lzp1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->J(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lzp1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->N(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lyn1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyn1/b;

    return-object v0
.end method

.method private final F()Lxp1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxp1/b;

    return-object v0
.end method

.method private final G()Lyp1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyp1/a;

    return-object v0
.end method

.method private static final H(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->G()Lyp1/a;

    move-result-object p1

    invoke-virtual {p1}, Lyp1/a;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lyp1/b$b;->b:Lyp1/b$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->I(Lp1/t2;)Lyp1/b;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Laq1/b;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Laq1/b;-><init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Laq1/b;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Laq1/b;-><init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p1, :cond_5

    if-ne v2, v0, :cond_6

    :cond_5
    new-instance v2, Laq1/b;

    const/4 p1, 0x2

    invoke-direct {v2, p0, p1}, Laq1/b;-><init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v5, v2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v2, 0x0

    move-object v6, v4

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Laq1/f;->l(Lyp1/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/t2;)Lyp1/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lyp1/b;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyp1/b;

    return-object p0
.end method

.method private static final J(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lzp1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->G()Lyp1/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyp1/a;->n(Lzp1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lxp1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->F()Lxp1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lxp1/b;->a(Lxp1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->E()Lyn1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyn1/b;->M(Lyn1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;
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

.method private static final N(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "featureType"

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v1, "pregnancyId"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->M(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->H(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, La80/c;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, La80/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0xb5c0719

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

    invoke-static {p0}, Lhj0/p;->a(Landroidx/fragment/app/m0;)Lsm2/a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->G()Lyp1/a;

    move-result-object p1

    sget-object p2, Lzp1/a$a;->a:Lzp1/a$a;

    invoke-virtual {p1, p2}, Lyp1/a;->n(Lzp1/a;)V

    return-void
.end method
