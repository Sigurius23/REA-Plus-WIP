.class public final Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onResume",
        "Landroid/view/View;",
        "view",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Ls12/a;",
        "w",
        "Ll83/h;",
        "D",
        "()Ls12/a;",
        "analytics",
        "Lcom/whoop/onboardingpersonalization/dayzero/a;",
        "x",
        "E",
        "()Lcom/whoop/onboardingpersonalization/dayzero/a;",
        "args",
        "onboarding-personalization_release"
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


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->w:Ll83/h;

    new-instance v0, Lr12/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lr12/b;-><init>(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->G(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->F(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Lcom/whoop/onboardingpersonalization/dayzero/a;
    .locals 1

    sget-object v0, Lcom/whoop/onboardingpersonalization/dayzero/a;->e:Lcom/whoop/onboardingpersonalization/dayzero/a$a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/whoop/onboardingpersonalization/dayzero/a$a;->a(Landroid/os/Bundle;)Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p0

    return-object p0
.end method

.method private final D()Ls12/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls12/a;

    return-object v0
.end method

.method private final E()Lcom/whoop/onboardingpersonalization/dayzero/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/onboardingpersonalization/dayzero/a;

    return-object v0
.end method

.method private static final F(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->E()Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/onboardingpersonalization/dayzero/a;->b()Lsl0/n0;

    move-result-object v4

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->E()Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/onboardingpersonalization/dayzero/a;->d()Lcom/whoop/navigation/models/ChatHeaderMetadata;

    move-result-object v6

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->E()Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/onboardingpersonalization/dayzero/a;->c()Z

    move-result p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-eqz p1, :cond_3

    const p1, 0x472db484

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_1

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, Lr12/b;

    const/4 p1, 0x1

    invoke-direct {v0, p0, p1}, Lr12/b;-><init>(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_1
    move-object v7, v0

    goto :goto_2

    :cond_3
    const p1, 0x472ed6e6

    invoke-virtual {v10, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p1, :cond_4

    if-ne v0, p2, :cond_5

    :cond_4
    new-instance v0, Lr12/b;

    const/4 p1, 0x2

    invoke-direct {v0, p0, p1}, Lr12/b;-><init>(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v8, v0

    check-cast v8, Lc93/a;

    sget p0, Lsl0/n0;->t:I

    sget p1, Lcom/whoop/navigation/models/ChatHeaderMetadata;->$stable:I

    shl-int/lit8 p1, p1, 0x6

    or-int v11, p0, p1

    const/16 v12, 0x22

    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-static/range {v4 .. v12}, Ly12/c;->l(Lsl0/n0;Landroidx/compose/ui/Modifier;Lcom/whoop/navigation/models/ChatHeaderMetadata;Lc93/a;Lc93/a;Lch0/v0;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->H(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Lcom/whoop/onboardingpersonalization/dayzero/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->C(Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;)Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lr12/a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5da01358

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->D()Ls12/a;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->E()Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/onboardingpersonalization/dayzero/a;->b()Lsl0/n0;

    move-result-object p2

    invoke-virtual {p2}, Lsl0/n0;->k()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ls12/a;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->E()Lcom/whoop/onboardingpersonalization/dayzero/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/onboardingpersonalization/dayzero/a;->e()Lr12/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/onboardingpersonalization/dayzero/DayZeroPersonalizationFragment;->D()Ls12/a;

    move-result-object p2

    invoke-virtual {p2, p1}, Ls12/a;->b(Lr12/c;)V

    :cond_0
    return-void
.end method
