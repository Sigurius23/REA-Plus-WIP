.class public interface abstract Lcom/whoop/data/onboarding/OnboardingStatusApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/onboarding/OnboardingStatusApi;",
        "",
        "",
        "userId",
        "",
        "",
        "",
        "getOnboardingStatus",
        "(ILq83/d;)Ljava/lang/Object;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;

.field public static final ONBOARDING_SERVICE_PATH:Ljava/lang/String; = "onboarding-service/v1/feature-education-state"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;->$$INSTANCE:Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;

    sput-object v0, Lcom/whoop/data/onboarding/OnboardingStatusApi;->Companion:Lcom/whoop/data/onboarding/OnboardingStatusApi$Companion;

    return-void
.end method


# virtual methods
.method public abstract getOnboardingStatus(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "userId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/feature-education-state"
    .end annotation
.end method
