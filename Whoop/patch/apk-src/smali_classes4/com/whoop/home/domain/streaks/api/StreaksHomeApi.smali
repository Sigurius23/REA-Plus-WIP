.class public interface abstract Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/home/domain/streaks/api/StreaksHomeApi;",
        "",
        "Lcom/whoop/home/domain/models/StreakMetadata;",
        "fetchStreaks",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;",
        "body",
        "getUserStreak",
        "(Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;Lq83/d;)Ljava/lang/Object;",
        "home_release"
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
.method public abstract fetchStreaks(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/domain/models/StreakMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "streaks-service/v1/streaks/data-streak"
    .end annotation
.end method

.method public abstract getUserStreak(Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/models/CommunityStreaksRequestBody;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/domain/models/StreakMetadata;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "streaks-service/v1/streaks/data-streak/community"
    .end annotation
.end method
