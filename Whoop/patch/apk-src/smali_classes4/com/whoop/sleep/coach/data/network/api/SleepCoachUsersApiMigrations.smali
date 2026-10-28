.class public interface abstract Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J$\u0010\t\u001a\u00020\u00082\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/data/network/api/SleepCoachUsersApiMigrations;",
        "",
        "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;",
        "fetchSleepAdviceV2",
        "(Lq83/d;)Ljava/lang/Object;",
        "harvardSleepAdviceDto",
        "",
        "format",
        "Lcom/whoop/sleep/coach/data/network/model/VowDto;",
        "fetchSleepCoachVow",
        "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract fetchSleepAdviceV2(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "coaching-service/v2/sleepneed"
    .end annotation
.end method

.method public abstract fetchSleepCoachVow(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "format"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/sleep/coach/data/network/model/VowDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "vow-service/v1/coaching/vows/sleepcoach"
    .end annotation
.end method
