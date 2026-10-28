.class public interface abstract Lcom/whoop/service/network/JournalApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\u0004J \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J*\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ*\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u001cH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 H\u00a7@\u00a2\u0006\u0004\u0008!\u0010\u0004J0\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0018\u0008\u0001\u0010%\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\u0008\u0012\u0004\u0012\u00020#`$H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\'J \u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010(\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008)\u0010\u0012J*\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u001d\u001a\u00020\u001cH\u00a7@\u00a2\u0006\u0004\u0008*\u0010+J\u001a\u0010-\u001a\u00020,2\u0008\u0008\u0001\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008-\u0010\u0012J \u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u001d\u001a\u00020.H\u00a7@\u00a2\u0006\u0004\u0008/\u00100\u00a8\u00061\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/JournalApi;",
        "",
        "Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;",
        "getJournalPreferences",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/JournalEnabled;",
        "journalEnabled",
        "Lpg3/v0;",
        "Ll83/a0;",
        "upsertJournalPreferences",
        "(Lcom/whoop/service/network/JournalEnabled;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;",
        "getUserSelectedJournalBehaviors",
        "",
        "date",
        "",
        "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;",
        "getUserSelectedJournalBehaviorsV2",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "cycleId",
        "",
        "hasAutoPopped",
        "setAutoPop",
        "(JZLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;",
        "getUserJournalHistory",
        "(JLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
        "request",
        "saveUserJournalBehaviorAnswers",
        "(JLcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;",
        "getJournalBehaviorsList",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "list",
        "updateUserSelectedJournalBehaviors",
        "(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;",
        "behaviorId",
        "addBehaviorTrackerForUser",
        "saveUserJournalBehaviorAnswersIntraday",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;",
        "getJournalEntryForDate",
        "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;",
        "savePartialJournalEntry",
        "(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract addBehaviorTrackerForUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "behaviorId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v1/journals/behaviors/{behaviorId}/user"
    .end annotation
.end method

.method public abstract getJournalBehaviorsList(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/JournalsBehaviorsListResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v1/journals/behaviors"
    .end annotation
.end method

.method public abstract getJournalEntryForDate(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/JournalEntryWrapperDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v3/journals/drafts/mobile/{date}"
    .end annotation
.end method

.method public abstract getJournalPreferences(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v1/journals/preferences"
    .end annotation
.end method

.method public abstract getUserJournalHistory(JLq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "cycleId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/BehaviourTrackerHistoryResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v1/journals/stats/user/{cycleId}"
    .end annotation
.end method

.method public abstract getUserSelectedJournalBehaviors(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/UserSelectedJournalBehaviorResponseDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v1/journals/behaviors/user"
    .end annotation
.end method

.method public abstract getUserSelectedJournalBehaviorsV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/remote/domain/dto/JournalBehaviorTrackerDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "journal-service/v2/journals/behaviors/user/{date}"
    .end annotation
.end method

.method public abstract savePartialJournalEntry(Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/PartialJournalEntryRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v2/journal/entry/partial"
    .end annotation
.end method

.method public abstract saveUserJournalBehaviorAnswers(JLcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "cycleId"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v1/journals/entries/user/cycle/{cycleId}"
    .end annotation
.end method

.method public abstract saveUserJournalBehaviorAnswersIntraday(Ljava/lang/String;Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/data/remote/domain/request/JournalTrackerRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v2/journals/entries/user/date/{date}"
    .end annotation
.end method

.method public abstract setAutoPop(JZLq83/d;)Ljava/lang/Object;
    .param p1    # J
        .annotation runtime Lwg3/s;
            value = "cycleId"
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lwg3/s;
            value = "hasAutoPopped"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZ",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v2/autopop/upsert/cycleId/{cycleId}/hasAutoPopped/{hasAutoPopped}"
    .end annotation
.end method

.method public abstract updateUserSelectedJournalBehaviors(Ljava/util/ArrayList;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/ArrayList;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v1/journals/behaviors/user"
    .end annotation
.end method

.method public abstract upsertJournalPreferences(Lcom/whoop/service/network/JournalEnabled;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/service/network/JournalEnabled;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/JournalEnabled;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "journal-service/v1/journals/preferences"
    .end annotation
.end method
