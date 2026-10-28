.class public interface abstract Lcom/whoop/data/repositories/FeatureFlagRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/repositories/FeatureFlagChecker;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/FeatureFlagRepository$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u000b\u0010\u0004J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0008H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "",
        "resetFeatureFlagsToNormalFromDebugSettings",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "",
        "flags",
        "Ll83/a0;",
        "addValueToStreams",
        "(Ljava/util/Set;)V",
        "loadFeatureFlags",
        "featureFlagName",
        "isOnboardingFeatureFlagTurnedOn",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
        "featureFlag",
        "(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;",
        "isOnboardingFeatureFlagTurnedOnV2",
        "Lod1/a0;",
        "userSessionManager",
        "subscribeToUserChangeEvents",
        "(Lod1/a0;)V",
        "cancelFeatureFlagPeriodicFetch",
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
.method public static synthetic access$getFeatureFlagsFlow$jd(Lcom/whoop/data/repositories/FeatureFlagRepository;)Lec3/t1;
    .locals 0

    invoke-super {p0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->getFeatureFlagsFlow()Lec3/t1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract addValueToStreams(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract cancelFeatureFlagPeriodicFetch()V
.end method

.method public abstract isOnboardingFeatureFlagTurnedOn(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isOnboardingFeatureFlagTurnedOn(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isOnboardingFeatureFlagTurnedOnV2(Lcom/whoop/data/repositories/OnboardingFeatureFlag;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/OnboardingFeatureFlag;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isOnboardingFeatureFlagTurnedOnV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract loadFeatureFlags(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract resetFeatureFlagsToNormalFromDebugSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract subscribeToUserChangeEvents(Lod1/a0;)V
.end method
