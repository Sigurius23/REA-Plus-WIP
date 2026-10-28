.class public interface abstract Lcom/whoop/data/onboarding/OnboardingStatusDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000f2\u0006\u0010\u000b\u001a\u00020\nH\'\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\t\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/onboarding/OnboardingStatusDao;",
        "",
        "Lcom/whoop/data/onboarding/OnboardingStatus;",
        "status",
        "Ll83/a0;",
        "updateTable",
        "(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;",
        "",
        "getOnboardingStatus",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/onboarding/FeatureEducationType;",
        "featureEducationType",
        "",
        "isCompleted",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "isCompletedFlow",
        "(Lcom/whoop/data/onboarding/FeatureEducationType;)Lec3/l;",
        "deleteAll",
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


# virtual methods
.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getOnboardingStatus(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isCompleted(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isCompletedFlow(Lcom/whoop/data/onboarding/FeatureEducationType;)Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/FeatureEducationType;",
            ")",
            "Lec3/l;"
        }
    .end annotation
.end method

.method public abstract updateTable(Lcom/whoop/data/onboarding/OnboardingStatus;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/onboarding/OnboardingStatus;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
