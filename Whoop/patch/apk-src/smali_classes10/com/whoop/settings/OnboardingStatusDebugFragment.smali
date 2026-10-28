.class public final Lcom/whoop/settings/OnboardingStatusDebugFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/settings/OnboardingStatusDebugFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "G",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "w",
        "Ll83/h;",
        "I",
        "()Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "onboardingStatusDao",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "x",
        "H",
        "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "app_prodStandardRelease"
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
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lea2/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lea2/j;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/OnboardingStatusDebugFragment;->w:Ll83/h;

    new-instance v0, Lea2/j;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lea2/j;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/OnboardingStatusDebugFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->M(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/settings/OnboardingStatusDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->J(Lcom/whoop/settings/OnboardingStatusDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->P(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->O(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lcom/whoop/data/onboarding/OnboardingStatus;Lc93/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->N(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lcom/whoop/data/onboarding/OnboardingStatus;Lc93/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->I()Lcom/whoop/data/onboarding/OnboardingStatusDao;

    move-result-object p0

    return-object p0
.end method

.method private final G()V
    .locals 7

    const-class v0, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    const-string v1, "Cleared cache with "

    const-string v2, "Attempting to sync interactor cache"

    const-string v3, "OnboardingStatusDebug"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_0
    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v2

    instance-of v2, v2, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v2

    const-string v4, "null cannot be cast to non-null type com.whoop.data.onboarding.OnboardingStatusInteractor"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/whoop/data/onboarding/OnboardingStatusInteractor;

    const-string v4, "Found OnboardingStatusInteractor instance"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v4, 0x1

    :try_start_1
    const-string v5, "loadOnboardingStatusFromTable"

    const/4 v6, 0x0

    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "Successfully called loadOnboardingStatusFromTable()"

    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v5

    :try_start_2
    const-string v6, "Failed to call loadOnboardingStatusFromTable via reflection"

    invoke-static {v3, v6, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    const-string v5, "onboardingStatus"

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " entries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_4
    const-string v1, "Failed to clear cache via reflection"

    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v0

    invoke-interface {v0}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->retriggerOnboardingFetch()V

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v0, "OnboardingStatusChecker is not OnboardingStatusInteractor"

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v0

    invoke-interface {v0}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->retriggerOnboardingFetch()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    return-void

    :goto_1
    const-string v1, "Failed to sync interactor cache"

    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    move-result-object v0

    invoke-interface {v0}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->retriggerOnboardingFetch()V

    :goto_2
    return-void
.end method

.method private final H()Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/OnboardingStatusDebugFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    return-object v0
.end method

.method private final I()Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/OnboardingStatusDebugFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    return-object v0
.end method

.method private static final J(Lcom/whoop/settings/OnboardingStatusDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

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

    move-object v5, p1

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lea2/j;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lea2/j;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v1, p2

    check-cast v1, Lc93/a;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lea2/j;

    const/4 p1, 0x3

    invoke-direct {p2, p0, p1}, Lea2/j;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v2, p2

    check-cast v2, Lc93/a;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    if-ne p2, v0, :cond_6

    :cond_5
    new-instance p2, Lck1/c;

    const/16 p1, 0x1c

    invoke-direct {p2, p0, p1}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_7

    if-ne p2, v0, :cond_8

    :cond_7
    new-instance p2, Lea2/k;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lea2/k;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    invoke-virtual {v5, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v4, p2

    check-cast v4, Lc93/m;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lea2/n;->E(Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_9
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->G()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/OnboardingStatusDebugFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/settings/OnboardingStatusDebugFragment$a;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lcom/whoop/data/onboarding/OnboardingStatus;Lc93/m;)Ll83/a0;
    .locals 3

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/OnboardingStatusDebugFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/settings/OnboardingStatusDebugFragment$b;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;Lcom/whoop/data/onboarding/OnboardingStatus;Lc93/m;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {v0, v2, v2, v1, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusChecker;
    .locals 2

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    return-object p0
.end method

.method private static final P(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Lcom/whoop/data/onboarding/OnboardingStatusDao;
    .locals 2

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v0, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/onboarding/OnboardingStatusDao;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->K(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/OnboardingStatusDebugFragment;->L(Lcom/whoop/settings/OnboardingStatusDebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lea2/k;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lea2/k;-><init>(Lcom/whoop/settings/OnboardingStatusDebugFragment;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x24d7c93e

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
