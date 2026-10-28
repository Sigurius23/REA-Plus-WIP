.class public final Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static getPacketRevisionThenHeartDataByTimeRanges(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;JJLq83/d;)Ljava/lang/Object;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->access$getPacketRevisionThenHeartDataByTimeRanges$jd(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;JJLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static insertAllThenDeleteOldHeartDataByTimeStamp(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->access$insertAllThenDeleteOldHeartDataByTimeStamp$jd(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
