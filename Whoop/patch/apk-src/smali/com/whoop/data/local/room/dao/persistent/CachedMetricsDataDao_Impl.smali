.class public final Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfCachedMetricsDataDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__insertAdapterOfCachedMetricsDataDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$getOldestPacketRevision$3(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IJJLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$getHeartDataByTimeRanges$4(IJJLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$deleteAllHeartDataBeforeTimeStamp$5(JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$insertAllThenDeleteOldHeartDataByTimeStamp$1(Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;JJLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$getPacketRevisionThenHeartDataByTimeRanges$2(JJLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->lambda$insertList$0(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static getRequiredConverters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic lambda$deleteAllHeartDataBeforeTimeStamp$5(JLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM cached_table_metrics_data WHERE timestamp < ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    invoke-interface {v0, v1, p0, p1}, Ltb/c;->p(IJ)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p2}, Lj93/l0;->H(Ltb/a;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getHeartDataByTimeRanges$4(IJJLtb/a;)Ljava/util/List;
    .locals 8

    const-string v0, "SELECT * FROM cached_table_metrics_data WHERE packet_revision == ? AND timestamp >= ? AND timestamp <= ? ORDER BY timestamp ASC"

    invoke-interface {p5, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p5

    const/4 v0, 0x1

    int-to-long v1, p0

    :try_start_0
    invoke-interface {p5, v0, v1, v2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p5, p0, p1, p2}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    invoke-interface {p5, p0, p3, p4}, Ltb/c;->p(IJ)V

    const-string p0, "packet_revision"

    invoke-static {p5, p0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p0

    const-string p1, "timestamp"

    invoke-static {p5, p1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p1

    const-string p2, "packet_data"

    invoke-static {p5, p2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p2

    const-string p3, "version_id"

    invoke-static {p5, p3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result p3

    new-instance p4, Ljava/util/ArrayList;

    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p5}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p5, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v3, v0

    invoke-interface {p5, p1}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-interface {p5, p2}, Ltb/c;->getBlob(I)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-interface {p5, p3}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v7, v0

    new-instance v2, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/data/local/room/entity/connectivity/CachedMetricsDataDto;-><init>(IJLjava/nio/ByteBuffer;I)V

    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    return-object p4

    :goto_1
    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getOldestPacketRevision$3(Ltb/a;)Ljava/lang/Integer;
    .locals 3

    const-string v0, "SELECT packet_revision FROM cached_table_metrics_data ORDER BY timestamp ASC LIMIT 1"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getPacketRevisionThenHeartDataByTimeRanges$2(JJLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->getPacketRevisionThenHeartDataByTimeRanges(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private synthetic lambda$insertAllThenDeleteOldHeartDataByTimeStamp$1(Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao;->insertAllThenDeleteOldHeartDataByTimeStamp(Ljava/util/List;JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private synthetic lambda$insertList$0(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__insertAdapterOfCachedMetricsDataDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public deleteAllHeartDataBeforeTimeStamp(JLq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/persistent/d;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getHeartDataByTimeRanges(IJJLq83/d;)Ljava/lang/Object;
    .locals 7
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/b;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/local/room/dao/persistent/b;-><init>(IJJ)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p6}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOldestPacketRevision(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcj2/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lcj2/a;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getPacketRevisionThenHeartDataByTimeRanges(JJLq83/d;)Ljava/lang/Object;
    .locals 8
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/c;

    const/4 v7, 0x0

    move-object v6, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v1 .. v7}, Lcom/whoop/data/local/room/dao/persistent/c;-><init>(JJLjava/lang/Object;I)V

    invoke-static {v0, v1, p5}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertAllThenDeleteOldHeartDataByTimeStamp(Ljava/util/List;JLq83/d;)Ljava/lang/Object;
    .locals 2
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/a;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/whoop/data/local/room/dao/persistent/a;-><init>(Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;Ljava/util/List;J)V

    invoke-static {v0, v1, p4}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/CachedMetricsDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
