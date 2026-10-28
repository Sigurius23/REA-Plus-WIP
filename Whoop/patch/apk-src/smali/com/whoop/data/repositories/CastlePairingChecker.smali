.class public final Lcom/whoop/data/repositories/CastlePairingChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/data/repositories/CastlePairingChecker;",
        "",
        "featureFlagChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "isPairingFeatureEnabled",
        "",
        "()Z",
        "feature-flag_release"
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
.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/repositories/CastlePairingChecker;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final isPairingFeatureEnabled()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/repositories/CastlePairingChecker;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "droid-castle-discovery"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/data/repositories/CastlePairingChecker;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ONBOARDING_CASTLE_DISCOVERY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
