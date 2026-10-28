.class public final Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'R\u001b\u0010,\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008*\u0010+R\u001b\u00100\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0016\u001a\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;",
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
        "",
        "w",
        "Ll83/h;",
        "E",
        "()Ljava/lang/String;",
        "historyDate",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "x",
        "F",
        "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "Ltd2/h;",
        "y",
        "G",
        "()Ltd2/h;",
        "viewModel",
        "Lj02/o0;",
        "z",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "getNavigatorReducer",
        "()Lo02/d;",
        "navigatorReducer",
        "Lld2/a;",
        "D",
        "()Lld2/a;",
        "analytics",
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
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Loe2/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Loe2/b;-><init>(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->x:Ll83/h;

    new-instance v1, Loe2/b;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Loe2/b;-><init>(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;I)V

    new-instance v3, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$e;

    invoke-direct {v3, p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v4, Ll83/i;->y:Ll83/i;

    new-instance v5, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$f;

    invoke-direct {v5, p0, v2, v3, v1}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v4, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->y:Ll83/h;

    new-instance v1, Loe2/b;

    const/4 v3, 0x2

    invoke-direct {v1, p0, v3}, Loe2/b;-><init>(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;I)V

    new-instance v3, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$b;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->z:Ll83/h;

    new-instance v1, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$c;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->E:Ll83/h;

    new-instance v1, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$d;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->F:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->I(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->L(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->H(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lld2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lld2/a;

    return-object v0
.end method

.method private final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final F()Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    return-object v0
.end method

.method private final G()Ltd2/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd2/h;

    return-object v0
.end method

.method private static final H(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "date"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final I(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

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

    if-eqz p1, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Leb/a0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v0, p2, :cond_2

    new-instance v0, Lpe2/b;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v3

    const-class v4, Lfi0/a;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v3, v1, v4, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfi0/a;

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->getNavigator()Lj02/o0;

    move-result-object v4

    invoke-direct {v0, p1, v3, v4}, Lpe2/b;-><init>(Leb/a0;Lfi0/a;Lj02/o0;)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lpe2/b;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_5

    const-string v4, "education_name"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-static {}, Lcom/whoop/data/onboarding/FeatureEducationType;->values()[Lcom/whoop/data/onboarding/FeatureEducationType;

    move-result-object v5

    array-length v7, v5

    :goto_1
    if-ge v2, v7, :cond_4

    aget-object v8, v5, v2

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object v1, v8

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->F()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lpe2/a$f;

    const-string v2, "arrhythmiaDetails"

    invoke-direct {v1, v3, v2}, Lpe2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lpe2/b;->a(Lpe2/a;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_5
    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->G()Ltd2/h;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->D()Lld2/a;

    move-result-object v4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p0, v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_6

    if-ne v1, p2, :cond_7

    :cond_6
    new-instance v1, Loe2/a;

    const/4 p0, 0x1

    invoke-direct {v1, p1, v0, p0}, Loe2/a;-><init>(Leb/a0;Lpe2/b;I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lud2/e;->F(Ltd2/h;Lld2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Leb/a0;Lpe2/b;Ltd2/f$f;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltd2/f$c;->a:Ltd2/f$c;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leb/a0;->z()Z

    goto :goto_0

    :cond_0
    sget-object v0, Ltd2/f$i;->a:Ltd2/f$i;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Leb/a0;->z()Z

    goto :goto_0

    :cond_1
    instance-of p0, p2, Ltd2/f$h;

    if-eqz p0, :cond_2

    new-instance p0, Lpe2/a$d;

    check-cast p2, Ltd2/f$h;

    invoke-virtual {p2}, Ltd2/f$h;->a()Lcom/whoop/navigation/e;

    move-result-object p2

    invoke-direct {p0, p2}, Lpe2/a$d;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {p1, p0}, Lpe2/b;->a(Lpe2/a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final L(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;)Luf3/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->E()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Leb/a0;Lpe2/b;Ltd2/f$f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->K(Leb/a0;Lpe2/b;Ltd2/f$f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->J(Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/shepherd/fragment/ShepherdDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x2ae91352

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
