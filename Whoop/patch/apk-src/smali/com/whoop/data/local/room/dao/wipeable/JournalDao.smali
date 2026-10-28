.class public interface abstract Lcom/whoop/data/local/room/dao/wipeable/JournalDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/wipeable/JournalDao;",
        "",
        "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
        "journalAnswer",
        "Ll83/a0;",
        "saveJournalAnsweredDto",
        "(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Lq83/d;)Ljava/lang/Object;",
        "",
        "cycleId",
        "getJournalAnswer",
        "(JLq83/d;)Ljava/lang/Object;",
        "Landroidx/lifecycle/p0;",
        "getJournalAnswerLiveData",
        "(J)Landroidx/lifecycle/p0;",
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
.method public abstract getJournalAnswer(JLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getJournalAnswerLiveData(J)Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract saveJournalAnsweredDto(Lcom/whoop/data/local/room/entity/JournalAnsweredDto;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/JournalAnsweredDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
