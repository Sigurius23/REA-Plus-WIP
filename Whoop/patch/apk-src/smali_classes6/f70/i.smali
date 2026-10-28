.class public abstract Lf70/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a/\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lf70/e$b;",
        "Lod1/j;",
        "pendingUserSessionRepository",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "a",
        "(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;)Lf70/e$b;",
        "Lf70/l0;",
        "legacyResolution",
        "",
        "b",
        "(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;)Ljava/lang/String;",
        "activation_release"
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
.method public static final a(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;)Lf70/e$b;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "pendingUserSessionRepository"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "featureFlagChecker"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lf70/e$b;->c()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object v0

    :cond_0
    move-object v10, v0

    const v19, 0x1feff

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v1 .. v20}, Lf70/e$b;->b(Lf70/e$b;Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lf70/e$b;

    move-result-object v0

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static final b(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pendingUserSessionRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyResolution"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->APP_DESTINATION_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p2, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lf70/e$b;->c()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lod1/j;->b()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p1}, Lod1/j;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p2, Lf70/l0$a;->a:Lf70/l0$a;

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p0}, Lf70/e$b;->c()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v0

    :cond_5
    sget-object p2, Lf70/l0$b;->a:Lf70/l0$b;

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Lod1/j;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lf70/e$b;->c()Lcom/whoop/domain/model/AuthMaterial;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/domain/model/AuthMaterial;->getAccessToken()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    return-object v0

    :cond_7
    return-object p1

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic c(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    sget-object p3, Lf70/l0$a;->a:Lf70/l0$a;

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lf70/i;->b(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
