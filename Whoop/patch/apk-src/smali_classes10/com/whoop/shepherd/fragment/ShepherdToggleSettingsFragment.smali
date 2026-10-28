.class public final Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0016\u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010\u0016\u001a\u0004\u0008&\u0010\'\u00a8\u0006+\u00b2\u0006\u000c\u0010*\u001a\u00020)8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lje2/b;",
        "w",
        "Ll83/h;",
        "C",
        "()Lje2/b;",
        "viewModel",
        "Lfi0/a;",
        "x",
        "getAnalytics",
        "()Lfi0/a;",
        "analytics",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "z",
        "getNavigatorReducer",
        "()Lo02/d;",
        "navigatorReducer",
        "Lje2/c;",
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

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->x:Ll83/h;

    new-instance v1, Lnr0/e;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$b;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Leb/a0;Lpe2/b;Lje2/a$e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->G(Leb/a0;Lpe2/b;Lje2/a$e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->D(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lje2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje2/b;

    return-object v0
.end method

.method private static final D(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    if-eqz p1, :cond_7

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

    if-ne v0, p2, :cond_2

    new-instance v0, Lpe2/b;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const-class v3, Lfi0/a;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->getNavigator()Lj02/o0;

    move-result-object v3

    invoke-direct {v0, p1, v1, v3}, Lpe2/b;-><init>(Leb/a0;Lfi0/a;Lj02/o0;)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lpe2/b;

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->C()Lje2/b;

    move-result-object v1

    invoke-virtual {v1}, Lje2/b;->getViewState()Lec3/l;

    move-result-object v3

    sget-object v1, Lje2/c$a;->h:Lje2/c$a$a;

    invoke-virtual {v1}, Lje2/c$a$a;->c()Lje2/c$a;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->F(Lp1/t2;)Lje2/c;

    move-result-object v1

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    if-ne v4, p2, :cond_4

    :cond_3
    new-instance v4, Loe2/a;

    const/4 v3, 0x2

    invoke-direct {v4, p1, v0, v3}, Loe2/a;-><init>(Leb/a0;Lpe2/b;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_5

    if-ne v0, p2, :cond_6

    :cond_5
    new-instance v0, Lno0/e0;

    const/16 p1, 0x11

    invoke-direct {v0, p0, p1}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v4, v0, v6, v2}, Lke2/c;->C(Lje2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/t2;)Lje2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lje2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lje2/c;

    return-object p0
.end method

.method private static final G(Leb/a0;Lpe2/b;Lje2/a$e;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lje2/a$b;->a:Lje2/a$b;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Leb/a0;->z()Z

    goto :goto_0

    :cond_0
    sget-object p0, Lje2/a$d;->a:Lje2/a$d;

    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lpe2/a$k;

    const-string p2, "arrhythmiaSettings"

    invoke-direct {p0, p2}, Lpe2/a$k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lpe2/b;->a(Lpe2/a;)V

    goto :goto_0

    :cond_1
    instance-of p0, p2, Lje2/a$c;

    if-eqz p0, :cond_2

    new-instance p0, Lpe2/a$a;

    check-cast p2, Lje2/a$c;

    invoke-virtual {p2}, Lje2/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p2

    invoke-direct {p0, p2}, Lpe2/a$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-virtual {p1, p0}, Lpe2/b;->a(Lpe2/a;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final H(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Lje2/a$j;)Ll83/a0;
    .locals 1

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->C()Lje2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lje2/b;->o(Lje2/a$j;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Lje2/a$j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->H(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Lje2/a$j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->E(Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

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

    new-instance p1, Loe2/c;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x4ab49604    # 5917442.0f

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onStart()V

    invoke-direct {p0}, Lcom/whoop/shepherd/fragment/ShepherdToggleSettingsFragment;->C()Lje2/b;

    move-result-object v0

    sget-object v1, Lje2/a$f;->a:Lje2/a$f;

    invoke-virtual {v0, v1}, Lje2/b;->o(Lje2/a$j;)Lbc3/k1;

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
