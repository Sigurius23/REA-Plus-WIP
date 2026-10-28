.class public interface abstract Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000f\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ.\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u00052\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u000cH\u0097@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J&\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u000cH\u0097@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;",
        "",
        "",
        "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
        "CachedMetricsDataDtoList",
        "Ll83/a0;",
        "insertList",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "getOldestPacketRevision",
        "(Lq83/d;)Ljava/lang/Object;",
        "packetRevision",
        "",
        "oldestTimeStamp",
        "newestTimeStamp",
        "getHeartDataByTimeRanges",
        "(IJJLq83/d;)Ljava/lang/Object;",
        "oldestTimeStampThreshold",
        "deleteAllHeartDataBeforeTimeStamp",
        "(JLq83/d;)Ljava/lang/Object;",
        "cachedMetricsDataDtoList",
        "insertAllThenDeleteOldHeartDataByTimeStamp",
        "(Ljava/util/List;JLq83/d;)Ljava/lang/Object;",
        "timeStampFrom",
        "timeStampTo",
        "getPacketRevisionThenHeartDataByTimeRanges",
        "(JJLq83/d;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic access$getPacketRevisionThenHeartDataByTimeRanges$jd(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;JJLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getPacketRevisionThenHeartDataByTimeRanges(JJLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$insertAllThenDeleteOldHeartDataByTimeStamp$jd(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->insertAllThenDeleteOldHeartDataByTimeStamp(Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getPacketRevisionThenHeartDataByTimeRanges$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;JJLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;",
            "JJ",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;

    iget v1, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;

    invoke-direct {v0, p0, p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p5, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p0, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p3, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$1:J

    iget-wide p1, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$0:J

    iget-object p0, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    move-object v1, p0

    move-wide v3, p1

    move-wide v5, p3

    goto :goto_2

    :cond_4
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->L$0:Ljava/lang/Object;

    iput-wide p1, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$0:J

    iput-wide p3, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$1:J

    iput v3, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->label:I

    invoke-interface {p0, v7}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getOldestPacketRevision(Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v0, :cond_3

    goto :goto_3

    :goto_2
    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result p0

    const/4 p1, 0x0

    iput-object p1, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->L$0:Ljava/lang/Object;

    iput-wide v3, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$0:J

    iput-wide v5, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->J$1:J

    iput p0, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->I$0:I

    iput v2, v7, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$getPacketRevisionThenHeartDataByTimeRanges$1;->label:I

    move v2, p0

    invoke-interface/range {v1 .. v7}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getHeartDataByTimeRanges(IJJLq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    return-object p0
.end method

.method public static insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;

    iget v1, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;

    invoke-direct {v0, p0, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-wide p2, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->J$0:J

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$1:Ljava/lang/Object;

    iput-wide p2, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->J$0:J

    iput v4, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->label:I

    invoke-interface {p0, p1, v0}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iput-object v5, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->L$1:Ljava/lang/Object;

    iput-wide p2, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->J$0:J

    iput v3, v0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$insertAllThenDeleteOldHeartDataByTimeStamp$1;->label:I

    invoke-interface {p0, p2, p3, v0}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->deleteAllHeartDataBeforeTimeStamp(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public abstract deleteAllHeartDataBeforeTimeStamp(JLq83/d;)Ljava/lang/Object;
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

.method public abstract getHeartDataByTimeRanges(IJJLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getOldestPacketRevision(Lq83/d;)Ljava/lang/Object;
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

.method public getPacketRevisionThenHeartDataByTimeRanges(JJLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getPacketRevisionThenHeartDataByTimeRanges$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertAllThenDeleteOldHeartDataByTimeStamp(Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->insertAllThenDeleteOldHeartDataByTimeStamp$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
