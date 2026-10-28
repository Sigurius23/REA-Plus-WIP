.class public interface abstract Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/custombottomsheet/api/CustomBottomSheetApi;",
        "",
        "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
        "getCustomJournalBottomSheet",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "searchTerm",
        "",
        "",
        "getRelatedBehaviorTrackerIds",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "custombottomsheet_release"
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
.method public abstract getCustomJournalBottomSheet(Lq83/d;)Ljava/lang/Object;
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
