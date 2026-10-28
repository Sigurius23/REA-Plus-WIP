.class public abstract Lmz1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "source",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "",
        "a",
        "(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z",
        "native-store_release"
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
.method public static final a(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->NATIVE_STORE_MATCH_ANY_IAJF_SOURCE_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "iajf"

    goto :goto_0

    :cond_0
    const-string p1, "iajf-prepaids"

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0, p1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    const/4 p1, 0x1

    if-ne p0, p1, :cond_1

    return p1

    :cond_1
    return v0
.end method
