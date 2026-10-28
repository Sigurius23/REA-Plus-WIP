.class public abstract Lst0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "",
        "a",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z",
        "connectivity-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android-strap-lock-unlock-enabled"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->STRAP_LOCK_UNLOCK_ENABLED_ONBOARDING:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
