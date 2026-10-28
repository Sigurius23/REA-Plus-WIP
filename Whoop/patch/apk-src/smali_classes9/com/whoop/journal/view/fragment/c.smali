.class public final Lcom/whoop/journal/view/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/journal/view/fragment/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "Leb/a0;",
        "navController",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "onboardingStatusChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lj02/o0;Leb/a0;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/navigation/e;",
        "action",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/navigation/e;)V",
        "Lcom/whoop/journal/view/fragment/a;",
        "destination",
        "a",
        "(Lcom/whoop/journal/view/fragment/a;)V",
        "Lj02/o0;",
        "Leb/a0;",
        "c",
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "journal_release"
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
.field private final a:Lj02/o0;

.field private final b:Leb/a0;

.field private final c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lj02/o0;Leb/a0;Lcom/whoop/data/onboarding/OnboardingStatusChecker;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onboardingStatusChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/journal/view/fragment/c;->a:Lj02/o0;

    iput-object p2, p0, Lcom/whoop/journal/view/fragment/c;->b:Leb/a0;

    iput-object p3, p0, Lcom/whoop/journal/view/fragment/c;->c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    iput-object p4, p0, Lcom/whoop/journal/view/fragment/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/journal/view/fragment/a;)V
    .locals 1

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/journal/view/fragment/a$a;->a:Lcom/whoop/journal/view/fragment/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/journal/view/fragment/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/journal/view/fragment/c;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v0, "home-future-ia"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/journal/view/fragment/c;->c:Lcom/whoop/data/onboarding/OnboardingStatusChecker;

    sget-object v0, Lcom/whoop/data/onboarding/FeatureEducationType;->CUSTOMIZE_JOURNAL:Lcom/whoop/data/onboarding/FeatureEducationType;

    invoke-interface {p1, v0}, Lcom/whoop/data/onboarding/OnboardingStatusChecker;->shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/whoop/journal/view/fragment/c;->b:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Lcom/whoop/journal/view/fragment/c;->b:Leb/a0;

    const-string v0, "android-app://com.whoop/onboardingStoriesFragmentRedesign/CUSTOMIZE_JOURNAL"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/journal/view/fragment/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method
