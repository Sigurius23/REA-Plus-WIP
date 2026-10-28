.class public final Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0011\u001a\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;",
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
        "Ljd0/c;",
        "w",
        "Ll83/h;",
        "B",
        "()Ljd0/c;",
        "navRouter",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "x",
        "C",
        "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "Ljd0/a;",
        "y",
        "A",
        "()Ljd0/a;",
        "actionRouter",
        "",
        "z",
        "Z",
        "hasNavigatedToOnboarding",
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$b;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->x:Ll83/h;

    new-instance v0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->y:Ll83/h;

    return-void
.end method

.method private final A()Ljd0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd0/a;

    return-object v0
.end method

.method private final B()Ljd0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd0/c;

    return-object v0
.end method

.method private final C()Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    return-object v0
.end method

.method private static final D(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;)Luf3/a;
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

.method private static final E(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "source"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-eqz p1, :cond_3

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p1

    :cond_3
    :goto_2
    if-nez v0, :cond_4

    const-string p1, "none"

    goto :goto_3

    :cond_4
    move-object p1, v0

    :goto_3
    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    iget-boolean p1, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->z:Z

    if-nez p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->C()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object p1

    sget-object v0, Lcom/whoop/data/onboarding/FeatureEducationType;->ADVANCED_LABS_EARLY_ACCESS_ONBOARDING:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-interface {p1, v0}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z

    move-result p1

    if-eqz p1, :cond_6

    iput-boolean v2, p0, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->z:Z

    invoke-direct {p0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->B()Ljd0/c;

    move-result-object p1

    sget-object v0, Lkd0/a$y;->a:Lkd0/a$y;

    invoke-virtual {p1, v0}, Ljd0/c;->e(Lkd0/a$a0;)V

    :cond_6
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_7

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/navigation/d;->k(Leb/a0;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v7, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->B()Ljd0/c;

    move-result-object v4

    invoke-direct {p0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->A()Ljd0/a;

    move-result-object v5

    xor-int/lit8 v6, p1, 0x1

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lkf0/h;->l(Ljava/lang/String;Ljd0/c;Ljd0/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->E(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->D(Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/advancedlabs/view/AdvancedLabsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lhb2/f;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x429d44e4

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
