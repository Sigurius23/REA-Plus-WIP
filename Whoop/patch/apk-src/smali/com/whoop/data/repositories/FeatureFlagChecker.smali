.class public interface abstract Lcom/whoop/data/repositories/FeatureFlagChecker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/FeatureFlagChecker$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0005\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "",
        "",
        "featureName",
        "",
        "isFeatureEnabled",
        "(Ljava/lang/String;)Z",
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        "featureFlag",
        "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z",
        "Lec3/t1;",
        "",
        "getFeatureFlagsFlow",
        "()Lec3/t1;",
        "featureFlagsFlow",
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


# direct methods
.method public static synthetic access$getFeatureFlagsFlow$jd(Lcom/whoop/data/repositories/FeatureFlagChecker;)Lec3/t1;
    .locals 0

    invoke-super {p0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getFeatureFlagsFlow()Lec3/t1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    return-object v0
.end method

.method public abstract isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z
.end method

.method public abstract isFeatureEnabled(Ljava/lang/String;)Z
.end method
