.class public final Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/GpsDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfGpsDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfGpsMetaDataDto:Landroidx/room/k;
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

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__insertAdapterOfGpsDto:Landroidx/room/k;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl$2;-><init>(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__insertAdapterOfGpsMetaDataDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$getGpsMetaCount$6(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;Lcom/whoop/data/local/room/entity/GpsDto;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$saveGpsDto$0(Lcom/whoop/data/local/room/entity/GpsDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JJLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$getGpsData$3(JJLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;Lcom/whoop/data/local/room/entity/GpsMetaDataDto;Ltb/a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$saveGpsMetaData$1(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;Ltb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(JJLtb/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$removeGpsData$7(JJLtb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(JJLtb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$getGpsLiveData$4(JJLtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$getGpsMetaData$5(Ltb/a;)Ljava/util/List;

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

.method public static synthetic h(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$count$2(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(JLtb/a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->lambda$deleteGpsMeta$8(JLtb/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$count$2(Ltb/a;)Ljava/lang/Long;
    .locals 2

    const-string v0, "SELECT COUNT(*) FROM table_gps"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$deleteGpsMeta$8(JLtb/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM table_gps_meta_data WHERE id = ?"

    invoke-interface {p2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p2

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p2, v0, p0, p1}, Ltb/c;->p(IJ)V

    invoke-interface {p2}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getGpsData$3(JJLtb/a;)Ljava/util/List;
    .locals 22

    const-string v0, "SELECT * FROM table_gps WHERE time_stamp BETWEEN ? AND ?"

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move-wide/from16 v2, p0

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    move-wide/from16 v2, p2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "time_stamp"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "latitude"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "longitude"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "altitude"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "horizontal_accuracy"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "vertical_accuracy"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v10

    invoke-interface {v1, v2}, Ltb/c;->getDouble(I)D

    move-result-wide v12

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v14

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v16

    invoke-interface {v1, v5}, Ltb/c;->getDouble(I)D

    move-result-wide v18

    invoke-interface {v1, v6}, Ltb/c;->getDouble(I)D

    move-result-wide v20

    new-instance v9, Lcom/whoop/data/local/room/entity/GpsDto;

    invoke-direct/range {v9 .. v21}, Lcom/whoop/data/local/room/entity/GpsDto;-><init>(JDDDDD)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v7

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getGpsLiveData$4(JJLtb/a;)Ljava/util/List;
    .locals 22

    const-string v0, "SELECT * FROM table_gps WHERE time_stamp BETWEEN ? AND ?"

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v0, 0x1

    move-wide/from16 v2, p0

    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const/4 v0, 0x2

    move-wide/from16 v2, p2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "time_stamp"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "latitude"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "longitude"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "altitude"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "horizontal_accuracy"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "vertical_accuracy"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v10

    invoke-interface {v1, v2}, Ltb/c;->getDouble(I)D

    move-result-wide v12

    invoke-interface {v1, v3}, Ltb/c;->getDouble(I)D

    move-result-wide v14

    invoke-interface {v1, v4}, Ltb/c;->getDouble(I)D

    move-result-wide v16

    invoke-interface {v1, v5}, Ltb/c;->getDouble(I)D

    move-result-wide v18

    invoke-interface {v1, v6}, Ltb/c;->getDouble(I)D

    move-result-wide v20

    new-instance v9, Lcom/whoop/data/local/room/entity/GpsDto;

    invoke-direct/range {v9 .. v21}, Lcom/whoop/data/local/room/entity/GpsDto;-><init>(JDDDDD)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v7

    :goto_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getGpsMetaCount$6(Ltb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "SELECT COUNT(*) FROM table_gps_meta_data"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p0, v1}, Ltb/c;->getLong(I)J

    move-result-wide v0

    long-to-int v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getGpsMetaData$5(Ltb/a;)Ljava/util/List;
    .locals 9

    const-string v0, "SELECT * FROM table_gps_meta_data"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    const-string v0, "start_date"

    invoke-static {p0, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v1, "end_date"

    invoke-static {p0, v1}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v1

    const-string v2, "id"

    invoke-static {p0, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p0, v0}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-interface {p0, v1}, Ltb/c;->getLong(I)J

    move-result-wide v6

    new-instance v8, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;

    invoke-direct {v8, v4, v5, v6, v7}, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;-><init>(JJ)V

    invoke-interface {p0, v2}, Ltb/c;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v8, v4, v5}, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->setId(J)V

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v3

    :goto_1
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$removeGpsData$7(JJLtb/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "DELETE FROM table_gps WHERE time_stamp BETWEEN ? AND ?"

    invoke-interface {p4, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p4

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p4, v0, p0, p1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p4, p0, p2, p3}, Ltb/c;->p(IJ)V

    invoke-interface {p4}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p4}, Ljava/lang/AutoCloseable;->close()V

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p4}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private synthetic lambda$saveGpsDto$0(Lcom/whoop/data/local/room/entity/GpsDto;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__insertAdapterOfGpsDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic lambda$saveGpsMetaData$1(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;Ltb/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__insertAdapterOfGpsMetaDataDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public count()J
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public deleteGpsMeta(J)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/4 v2, 0x4

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public getGpsData(JJ)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/GpsDto;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbb2/a;

    const/4 v6, 0x4

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v1 .. v6}, Lbb2/a;-><init>(JJI)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public getGpsLiveData(JJ)Landroidx/lifecycle/p0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_gps"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lbb2/a;

    const/4 v7, 0x2

    move-wide v3, p1

    move-wide v5, p3

    invoke-direct/range {v2 .. v7}, Lbb2/a;-><init>(JJI)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object p1

    return-object p1
.end method

.method public getGpsMetaCount()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getGpsMetaData()Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    invoke-virtual {v0}, Landroidx/room/z0;->getInvalidationTracker()Landroidx/room/v;

    move-result-object v0

    const-string v1, "table_gps_meta_data"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/room/v;->b([Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)Landroidx/room/e1;

    move-result-object v0

    return-object v0
.end method

.method public removeGpsData(JJ)V
    .locals 7

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbb2/a;

    const/4 v6, 0x3

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v1 .. v6}, Lbb2/a;-><init>(JJI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public saveGpsDto(Lcom/whoop/data/local/room/entity/GpsDto;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x14

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method

.method public saveGpsMetaData(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/GpsDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbe1/c;

    const/16 v2, 0x15

    invoke-direct {v1, v2, p0, p1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
