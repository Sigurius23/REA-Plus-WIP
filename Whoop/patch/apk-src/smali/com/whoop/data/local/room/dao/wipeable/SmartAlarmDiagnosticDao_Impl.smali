.class public final Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __insertAdapterOfSmartAlarmDiagnosticDto:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final __smartAlarmDiagnosticDtoConverter:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;-><init>()V

    iput-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__smartAlarmDiagnosticDtoConverter:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__insertAdapterOfSmartAlarmDiagnosticDto:Landroidx/room/k;

    return-void
.end method

.method public static synthetic a(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->lambda$deleteAll$3(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->lambda$getAll$1(Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->lambda$insert$0(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(IJJLtb/a;)Ll83/a0;
    .locals 2

    move-wide v0, p3

    move p4, p0

    move-wide p0, p1

    move-wide p2, v0

    invoke-static/range {p0 .. p5}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->lambda$delete$2(JJILtb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;)Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__smartAlarmDiagnosticDtoConverter:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;

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

.method private static synthetic lambda$delete$2(JJILtb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_smart_alarm_diagnostics WHERE id IN(SELECT id FROM table_smart_alarm_diagnostics WHERE timestamp_millis >= ? AND timestamp_millis <= ? ORDER BY timestamp_millis ASC LIMIT ?)"

    invoke-interface {p5, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p5

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p5, v0, p0, p1}, Ltb/c;->p(IJ)V

    const/4 p0, 0x2

    invoke-interface {p5, p0, p2, p3}, Ltb/c;->p(IJ)V

    const/4 p0, 0x3

    int-to-long p1, p4

    invoke-interface {p5, p0, p1, p2}, Ltb/c;->p(IJ)V

    invoke-interface {p5}, Ltb/c;->e1()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-interface {p5}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$deleteAll$3(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM table_smart_alarm_diagnostics"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$getAll$1(Ltb/a;)Ljava/util/List;
    .locals 38

    const-string v0, "SELECT * FROM table_smart_alarm_diagnostics ORDER BY timestamp_millis ASC"

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    :try_start_0
    const-string v0, "event_type"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "alarm_trigger"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "timestamp_millis"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "id"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "isAckSuccess"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "devicePlatform"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "deviceOs"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "deviceModel"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "strapId"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "maximVersion"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "nordicVersion"

    invoke-static {v1, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "batteryOptimizationOn"

    invoke-static {v1, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "phoneSetAlarmTime"

    invoke-static {v1, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "strapReportedAlarmTime"

    invoke-static {v1, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "isStrapConnected"

    invoke-static {v1, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v4

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v16

    if-eqz v16, :cond_11

    invoke-interface {v1, v0}, Ltb/c;->isNull(I)Z

    move-result v16

    const/16 v17, 0x0

    if-eqz v16, :cond_0

    move/from16 v18, v0

    move-object/from16 v0, v17

    move-object/from16 v16, v4

    move/from16 v19, v15

    :goto_1
    move-object/from16 v4, p0

    goto :goto_2

    :cond_0
    invoke-interface {v1, v0}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v16

    move/from16 v18, v0

    move-object/from16 v0, v16

    move/from16 v19, v15

    move-object/from16 v16, v4

    goto :goto_1

    :goto_2
    iget-object v15, v4, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__smartAlarmDiagnosticDtoConverter:Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;

    invoke-virtual {v15, v0}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoConverter;->toSmartAlarmEventType(Ljava/lang/String;)Lf82/a;

    move-result-object v21

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v23, v17

    goto :goto_3

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v23, v0

    :goto_3
    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v24

    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    move v15, v3

    move-object/from16 v2, v17

    goto :goto_4

    :cond_2
    move v0, v2

    move v15, v3

    invoke-interface {v1, v5}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_4
    const/16 v20, 0x1

    if-nez v2, :cond_3

    move-object/from16 v27, v17

    goto :goto_6

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-eqz v2, :cond_4

    move/from16 v2, v20

    goto :goto_5

    :cond_4
    const/4 v2, 0x0

    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v27, v2

    :goto_6
    invoke-interface {v1, v6}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object/from16 v28, v17

    goto :goto_7

    :cond_5
    invoke-interface {v1, v6}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v28, v2

    :goto_7
    invoke-interface {v1, v7}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object/from16 v29, v17

    goto :goto_8

    :cond_6
    invoke-interface {v1, v7}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v29, v2

    :goto_8
    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 v30, v17

    goto :goto_9

    :cond_7
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v30, v2

    :goto_9
    invoke-interface {v1, v9}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object/from16 v31, v17

    goto :goto_a

    :cond_8
    invoke-interface {v1, v9}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v31, v2

    :goto_a
    invoke-interface {v1, v10}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_9

    move-object/from16 v32, v17

    goto :goto_b

    :cond_9
    invoke-interface {v1, v10}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v32, v2

    :goto_b
    invoke-interface {v1, v11}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_a

    move-object/from16 v33, v17

    goto :goto_c

    :cond_a
    invoke-interface {v1, v11}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v33, v2

    :goto_c
    invoke-interface {v1, v12}, Ltb/c;->getLong(I)J

    move-result-wide v3

    long-to-int v3, v3

    if-eqz v3, :cond_b

    move/from16 v34, v20

    goto :goto_d

    :cond_b
    const/16 v34, 0x0

    :goto_d
    invoke-interface {v1, v13}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object/from16 v35, v17

    goto :goto_e

    :cond_c
    invoke-interface {v1, v13}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v35, v3

    :goto_e
    invoke-interface {v1, v14}, Ltb/c;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_d

    move-object/from16 v36, v17

    :goto_f
    move/from16 v3, v19

    goto :goto_10

    :cond_d
    invoke-interface {v1, v14}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v36, v3

    goto :goto_f

    :goto_10
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_e

    move/from16 v19, v5

    move-object/from16 v4, v17

    goto :goto_11

    :cond_e
    move/from16 v19, v5

    invoke-interface {v1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_11
    if-nez v4, :cond_f

    :goto_12
    move-object/from16 v37, v17

    goto :goto_14

    :cond_f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v4, :cond_10

    move/from16 v2, v20

    goto :goto_13

    :cond_10
    const/4 v2, 0x0

    :goto_13
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v17

    goto :goto_12

    :goto_14
    new-instance v22, Lcom/whoop/service/network/model/MobileEventMetaData;

    move-object/from16 v26, v22

    invoke-direct/range {v26 .. v37}, Lcom/whoop/service/network/model/MobileEventMetaData;-><init>(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    move-object/from16 v22, v26

    new-instance v20, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    invoke-direct/range {v20 .. v25}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;-><init>(Lf82/a;Lcom/whoop/service/network/model/MobileEventMetaData;Ljava/lang/String;J)V

    move-object/from16 v2, v20

    move/from16 v4, p1

    move/from16 p1, v6

    invoke-interface {v1, v4}, Ltb/c;->getLong(I)J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->setId(J)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v2, v15

    move v15, v3

    move v3, v2

    move/from16 v6, p1

    move v2, v0

    move/from16 p1, v4

    move-object v4, v5

    move/from16 v0, v18

    move/from16 v5, v19

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_15

    :cond_11
    move-object v5, v4

    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v5

    :goto_15
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$insert$0(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__insertAdapterOfSmartAlarmDiagnosticDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public delete(IJJLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/b;

    move v6, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/local/room/dao/persistent/b;-><init>(JJI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p6}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, La6/i;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, La6/i;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insert(Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lbp0/n;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0, p1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
