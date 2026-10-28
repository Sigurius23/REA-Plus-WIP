.class public interface abstract Lcom/whoop/data/local/room/dao/persistent/RawDataDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0012H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u000c2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0007J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u000bJ\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u000bJ\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001aH\'\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/persistent/RawDataDao;",
        "",
        "",
        "Ldu0/a;",
        "rawDataDtoList",
        "Ll83/a0;",
        "insertList",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "revision",
        "getPacketsByRevision",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "count",
        "getPacketsByRevisionAndCount",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "deleteAllData",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "delete",
        "(JLq83/d;)Ljava/lang/Object;",
        "deleteByPacketsList",
        "rawDataVersion",
        "getNewestTimestampByPacketVersion",
        "getOldestTimestampByPacketVersion",
        "Lec3/l;",
        "observeNewestTimestamp",
        "()Lec3/l;",
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
.method public abstract delete(JLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteAllData(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteByPacketsList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getNewestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getOldestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPacketsByRevision(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getPacketsByRevisionAndCount(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldu0/a;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract observeNewestTimestamp()Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation
.end method
