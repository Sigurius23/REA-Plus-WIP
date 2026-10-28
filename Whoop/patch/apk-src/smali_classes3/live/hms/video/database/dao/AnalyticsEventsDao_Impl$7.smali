.class Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->getAllEvents(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Llive/hms/video/database/entity/AnalyticsEntityModel;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;

.field final synthetic val$_statement:Landroidx/room/n1;


# direct methods
.method public constructor <init>(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;Landroidx/room/n1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->this$0:Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;

    iput-object p2, p0, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->val$_statement:Landroidx/room/n1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->call()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public call()Ljava/util/List;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    .line 2
    iget-object v0, v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->this$0:Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;

    invoke-static {v0}, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;->access$000(Llive/hms/video/database/dao/AnalyticsEventsDao_Impl;)Landroidx/room/z0;

    move-result-object v0

    iget-object v2, v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->val$_statement:Landroidx/room/n1;

    .line 3
    const-string v3, "db"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "sqLiteQuery"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 4
    invoke-virtual {v0, v2, v3}, Landroidx/room/z0;->query(Lub/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    .line 5
    :try_start_0
    const-string v0, "timestamp"

    invoke-static {v2, v0}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    .line 6
    const-string v4, "eventId"

    invoke-static {v2, v4}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    .line 7
    const-string v5, "payload"

    invoke-static {v2, v5}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    .line 8
    const-string v6, "eventName"

    invoke-static {v2, v6}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    .line 9
    const-string v7, "token"

    invoke-static {v2, v7}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    .line 10
    const-string v8, "isQa"

    invoke-static {v2, v8}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    .line 11
    const-string v9, "peerId"

    invoke-static {v2, v9}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    .line 12
    const-string v10, "role"

    invoke-static {v2, v10}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    .line 13
    const-string v11, "joinedAt"

    invoke-static {v2, v11}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    .line 14
    const-string v12, "leftAt"

    invoke-static {v2, v12}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    .line 15
    const-string v13, "roomName"

    invoke-static {v2, v13}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    .line 16
    const-string v14, "sessionStartedAt"

    invoke-static {v2, v14}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    .line 17
    const-string v15, "userData"

    invoke-static {v2, v15}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    .line 18
    const-string v3, "userName"

    invoke-static {v2, v3}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    const-string v1, "templateId"

    invoke-static {v2, v1}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v8

    .line 20
    const-string v8, "sessionId"

    invoke-static {v2, v8}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    move/from16 v17, v7

    .line 21
    const-string v7, "websocketUrl"

    invoke-static {v2, v7}, Ls2/e;->y(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    move/from16 v18, v6

    .line 22
    new-instance v6, Ljava/util/ArrayList;

    move/from16 v19, v5

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_13

    .line 24
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto/16 :goto_16

    .line 25
    :cond_1
    :goto_1
    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v21, 0x0

    goto :goto_2

    .line 26
    :cond_2
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v5

    .line 27
    :goto_2
    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v22, 0x0

    goto :goto_3

    .line 28
    :cond_3
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v22, v5

    .line 29
    :goto_3
    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v23, 0x0

    goto :goto_4

    .line 30
    :cond_4
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v23, v5

    .line 31
    :goto_4
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v24, 0x0

    goto :goto_5

    .line 32
    :cond_5
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v24, v5

    .line 33
    :goto_5
    invoke-interface {v2, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v25, 0x0

    goto :goto_6

    .line 34
    :cond_6
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v25, v5

    .line 35
    :goto_6
    invoke-interface {v2, v14}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v26, 0x0

    goto :goto_7

    .line 36
    :cond_7
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    move-object/from16 v26, v5

    .line 37
    :goto_7
    invoke-interface {v2, v15}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v27, 0x0

    goto :goto_8

    .line 38
    :cond_8
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v27, v5

    .line 39
    :goto_8
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v28, 0x0

    goto :goto_9

    .line 40
    :cond_9
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v28, v5

    .line 41
    :goto_9
    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v29, 0x0

    goto :goto_a

    .line 42
    :cond_a
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v29, v5

    .line 43
    :goto_a
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_b

    const/16 v30, 0x0

    goto :goto_b

    .line 44
    :cond_b
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v30, v5

    .line 45
    :goto_b
    new-instance v20, Llive/hms/video/database/entity/AnalyticsPeer;

    invoke-direct/range {v20 .. v30}, Llive/hms/video/database/entity/AnalyticsPeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v5, v20

    .line 46
    :goto_c
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v20

    if-nez v20, :cond_d

    .line 47
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_c

    move/from16 v21, v1

    const/4 v1, 0x0

    :goto_d
    move/from16 v20, v3

    goto :goto_e

    .line 48
    :cond_c
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    move/from16 v21, v1

    move-object/from16 v1, v20

    goto :goto_d

    .line 49
    :goto_e
    new-instance v3, Llive/hms/video/database/entity/AnalyticsCluster;

    invoke-direct {v3, v1}, Llive/hms/video/database/entity/AnalyticsCluster;-><init>(Ljava/lang/String;)V

    goto :goto_f

    :cond_d
    move/from16 v21, v1

    move/from16 v20, v3

    const/4 v3, 0x0

    .line 50
    :goto_f
    new-instance v1, Llive/hms/video/database/entity/AnalyticsEntityModel;

    invoke-direct {v1}, Llive/hms/video/database/entity/AnalyticsEntityModel;-><init>()V

    move/from16 v23, v7

    move/from16 v22, v8

    .line 51
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 52
    invoke-virtual {v1, v7, v8}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setTimestamp(J)V

    .line 53
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_e

    const/4 v7, 0x0

    goto :goto_10

    .line 54
    :cond_e
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 55
    :goto_10
    invoke-virtual {v1, v7}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setEventId(Ljava/lang/String;)V

    move/from16 v7, v19

    .line 56
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_f

    const/4 v8, 0x0

    goto :goto_11

    .line 57
    :cond_f
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 58
    :goto_11
    invoke-static {v8}, Llive/hms/video/database/converters/TypeConverter;->toHashMap(Ljava/lang/String;)Ljava/util/HashMap;

    move-result-object v8

    .line 59
    invoke-virtual {v1, v8}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setPayload(Ljava/util/HashMap;)V

    move/from16 v8, v18

    .line 60
    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_10

    move/from16 v19, v0

    const/4 v0, 0x0

    goto :goto_12

    .line 61
    :cond_10
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v18

    move/from16 v19, v0

    move-object/from16 v0, v18

    .line 62
    :goto_12
    invoke-virtual {v1, v0}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setEventName(Ljava/lang/String;)V

    move/from16 v0, v17

    .line 63
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v17

    if-eqz v17, :cond_11

    move/from16 v18, v0

    const/4 v0, 0x0

    goto :goto_13

    .line 64
    :cond_11
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    move/from16 v18, v0

    move-object/from16 v0, v17

    .line 65
    :goto_13
    invoke-virtual {v1, v0}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setToken(Ljava/lang/String;)V

    move/from16 v0, v16

    .line 66
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    if-eqz v16, :cond_12

    const/16 v16, 0x1

    :goto_14
    move/from16 v17, v0

    move/from16 v0, v16

    goto :goto_15

    :cond_12
    const/16 v16, 0x0

    goto :goto_14

    .line 67
    :goto_15
    invoke-virtual {v1, v0}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setQa(Z)V

    .line 68
    invoke-virtual {v1, v5}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setAnalyticsPeer(Llive/hms/video/database/entity/AnalyticsPeer;)V

    .line 69
    invoke-virtual {v1, v3}, Llive/hms/video/database/entity/AnalyticsEntityModel;->setAnalyticsCluster(Llive/hms/video/database/entity/AnalyticsCluster;)V

    .line 70
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v0, v19

    move/from16 v3, v20

    move/from16 v1, v21

    move/from16 v19, v7

    move/from16 v18, v8

    move/from16 v8, v22

    move/from16 v7, v23

    goto/16 :goto_0

    .line 71
    :cond_13
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    move-object/from16 v1, p0

    .line 72
    iget-object v0, v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->val$_statement:Landroidx/room/n1;

    invoke-virtual {v0}, Landroidx/room/n1;->k()V

    return-object v6

    :catchall_1
    move-exception v0

    .line 73
    :goto_16
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 74
    iget-object v2, v1, Llive/hms/video/database/dao/AnalyticsEventsDao_Impl$7;->val$_statement:Landroidx/room/n1;

    invoke-virtual {v2}, Landroidx/room/n1;->k()V

    .line 75
    throw v0
.end method
