.class public interface abstract Lcom/whoop/journal/api/JournalApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00082\u000e\u0008\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0001\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0001\u0010\u0013\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/journal/api/JournalApi;",
        "",
        "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
        "getJournalBehaviors",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "",
        "list",
        "Lpg3/v0;",
        "Lcom/whoop/journal/api/SaveJournalBehaviorsResponse;",
        "updateUserSelectedJournalBehaviors",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "searchTerm",
        "getRelatedBehaviorTrackerIds",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "date",
        "",
        "isIntraday",
        "autopop",
        "Lcom/whoop/journal/api/TalkTextWidgetResponse;",
        "getTalkTextWidget",
        "(Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;",
        "journal_release"
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
.method public abstract getJournalBehaviors(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v3/journals/behaviors"
    .end annotation
.end method

.method public abstract getRelatedBehaviorTrackerIds(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "searchTerm"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "ai-conversation-service/v1/fuzzy-match/behavior-trackers/{searchTerm}?limit=3"
    .end annotation
.end method

.method public abstract getTalkTextWidget(Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p2    # Z
        .annotation runtime Lwg3/t;
            value = "isIntraday"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lwg3/t;
            value = "autopop"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lcom/whoop/journal/api/TalkTextWidgetResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v1/widget/talk-text/{date}"
    .end annotation
.end method

.method public abstract updateUserSelectedJournalBehaviors(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/journal/api/SaveJournalBehaviorsResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v1/journals/behaviors/user"
    .end annotation
.end method
