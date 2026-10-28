.class public interface abstract Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\u0004\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;",
        "",
        "",
        "getSleepCoachOnBoardingStatus",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;",
        "sleepCoachOnBoardingRequestDto",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateSleepCoachOnBoardingStatus",
        "(Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;",
        "getAllSleepCoachOnBoardingStatus",
        "sleep-coach_release"
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
.method public abstract getAllSleepCoachOnBoardingStatus(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "coaching-service/v1/sleepneed/onboarding"
    .end annotation
.end method

.method public abstract getSleepCoachOnBoardingStatus(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "coaching-service/v1/sleepneed/onboarding/SLEEP_COACH"
    .end annotation
.end method

.method public abstract updateSleepCoachOnBoardingStatus(Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "coaching-service/v1/sleepneed/onboarding"
    .end annotation
.end method
