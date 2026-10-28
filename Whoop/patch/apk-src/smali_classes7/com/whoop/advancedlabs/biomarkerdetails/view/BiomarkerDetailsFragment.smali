.class public final Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0014R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0012\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0012\u001a\u0004\u0008 \u0010!R\u001b\u0010\'\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010\u0012\u001a\u0004\u0008%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010\u0012\u001a\u0004\u0008*\u0010+\u00a8\u0006/\u00b2\u0006\u000c\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;",
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
        "",
        "w",
        "Ll83/h;",
        "K",
        "()Ljava/lang/String;",
        "id",
        "x",
        "L",
        "source",
        "Lbb0/c;",
        "y",
        "M",
        "()Lbb0/c;",
        "viewModel",
        "Lj02/o0;",
        "z",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Ldp0/g;",
        "E",
        "J",
        "()Ldp0/g;",
        "globalCoachManager",
        "Lya0/a;",
        "F",
        "I",
        "()Lya0/a;",
        "analyticsHelper",
        "Lbb0/d;",
        "viewState",
        "advanced-labs_release"
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Ldb0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldb0/a;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->w:Ll83/h;

    new-instance v0, Ldb0/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ldb0/a;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->y:Ll83/h;

    new-instance v0, Ldb0/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ldb0/a;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$b;

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->z:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->E:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$d;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->F:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->V(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lbb0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->R(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lbb0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->N(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->O(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lcom/whoop/whoopaction/domain/models/Action;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->S(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lcom/whoop/whoopaction/domain/models/Action;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lkd0/a$c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->T(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lkd0/a$c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic G(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->K()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Lbb0/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->M()Lbb0/c;

    move-result-object p0

    return-object p0
.end method

.method private final I()Lya0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lya0/a;

    return-object v0
.end method

.method private final J()Ldp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    return-object v0
.end method

.method private final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final M()Lbb0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbb0/c;

    return-object v0
.end method

.method private static final N(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "biomarkerId"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final O(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final P(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

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

    if-eqz p1, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->getNavigator()Lj02/o0;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->J()Ldp0/g;

    move-result-object v1

    new-instance v2, Lab0/b;

    invoke-direct {v2, v0, p1, v1}, Lab0/b;-><init>(Lj02/o0;Leb/a0;Ldp0/g;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p1, v2

    :cond_1
    check-cast p1, Lab0/b;

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->M()Lbb0/c;

    move-result-object v0

    invoke-virtual {v0}, Lbb0/c;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lbb0/d$b;->b:Lbb0/d$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->M()Lbb0/c;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    if-ne v3, p2, :cond_3

    :cond_2
    new-instance v3, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment$a;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lq83/d;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lc93/m;

    invoke-static {v4, v3, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->Q(Lp1/t2;)Lbb0/d;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->L()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_4

    if-ne v3, p2, :cond_5

    :cond_4
    new-instance v3, Ldb0/b;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, Ldb0/b;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_6

    if-ne v5, p2, :cond_7

    :cond_6
    new-instance v5, Ldb0/b;

    const/4 v0, 0x1

    invoke-direct {v5, p0, v0}, Ldb0/b;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_8

    if-ne v6, p2, :cond_9

    :cond_8
    new-instance v6, Ldb0/b;

    const/4 v0, 0x2

    invoke-direct {v6, p0, v0}, Ldb0/b;-><init>(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p0, :cond_a

    if-ne v0, p2, :cond_b

    :cond_a
    new-instance v0, Lck1/c;

    const/16 p0, 0x13

    invoke-direct {v0, p1, p0}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v7, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v0

    invoke-static/range {v1 .. v9}, Ldb0/c;->O(Lbb0/d;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_c
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lp1/t2;)Lbb0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lbb0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbb0/d;

    return-object p0
.end method

.method private static final R(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lbb0/b;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->M()Lbb0/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lbb0/c;->p(Lbb0/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lcom/whoop/whoopaction/domain/models/Action;)Ll83/a0;
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->M()Lbb0/c;

    move-result-object p0

    new-instance v0, Lvw2/c;

    invoke-direct {v0, p1}, Lvw2/c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-virtual {p0, v0}, Lbb0/c;->o(Lvw2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Lkd0/a$c;)Ll83/a0;
    .locals 1

    const-string v0, "analyticEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->I()Lya0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lya0/a;->e(Lkd0/a$c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lab0/b;Lab0/a;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lab0/b;->a(Lab0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;)Ljava/lang/String;
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

    iget-object v0, p0, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->P(Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lab0/b;Lab0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->U(Lab0/b;Lab0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/biomarkerdetails/view/BiomarkerDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0x14

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x748e9c9a

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
