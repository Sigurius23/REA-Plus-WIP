.class public interface abstract Lcom/whoop/data/onboarding/OnboardingStatusChecker;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/onboarding/OnboardingStatusChecker$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/onboarding/OnboardingStatusChecker;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "type",
        "",
        "shouldGoToFeatureEducation",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;)Z",
        "Ll83/a0;",
        "retriggerOnboardingFetch",
        "()V",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$onCreate$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public static synthetic access$onDestroy$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public static synthetic access$onPause$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public static synthetic access$onResume$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public static synthetic access$onStart$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public static synthetic access$onStop$jd(Lcom/whoop/data/onboarding/OnboardingStatusChecker;Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method


# virtual methods
.method public abstract retriggerOnboardingFetch()V
.end method

.method public abstract shouldGoToFeatureEducation(Lcom/whoop/data/onboarding/FeatureEducationType;)Z
.end method
