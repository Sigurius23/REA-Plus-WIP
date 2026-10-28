.class public final Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/data/local/room/dao/persistent/RawDataDao;


# instance fields
.field private final __db:Landroidx/room/z0;

.field private final __deleteAdapterOfRawDataDto:Landroidx/room/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/i;"
        }
    .end annotation
.end field

.field private final __insertAdapterOfRawDataDto:Landroidx/room/k;
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

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$1;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__insertAdapterOfRawDataDto:Landroidx/room/k;

    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$2;

    invoke-direct {p1, p0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl$2;-><init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__deleteAdapterOfRawDataDto:Landroidx/room/i;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$getOldestTimestampByPacketVersion$5(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$deleteAllData$7(Ltb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$insertList$0(Ljava/util/List;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$observeNewestTimestamp$6(Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILjava/lang/String;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p1, p0, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$getPacketsByRevisionAndCount$3(Ljava/lang/String;ILtb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$getNewestTimestampByPacketVersion$4(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$deleteByPacketsList$1(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;

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

.method public static synthetic h(JLtb/a;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$delete$8(JLtb/a;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Ltb/a;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->lambda$getPacketsByRevision$2(Ljava/lang/String;Ltb/a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$delete$8(JLtb/a;)Ljava/lang/Integer;
    .locals 2

    const-string v0, "DELETE FROM table_raw_data WHERE id = ?"

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

.method private static synthetic lambda$deleteAllData$7(Ltb/a;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "DELETE FROM table_raw_data"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_0
    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p0}, Lj93/l0;->H(Ltb/a;)I

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

.method private synthetic lambda$deleteByPacketsList$1(Ljava/util/List;Ltb/a;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__deleteAdapterOfRawDataDto:Landroidx/room/i;

    invoke-virtual {v0, p2, p1}, Landroidx/room/i;->handleMultiple(Ltb/a;Ljava/lang/Iterable;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic lambda$getNewestTimestampByPacketVersion$4(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;
    .locals 2

    const-string v0, "SELECT timestamp FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp DESC LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    invoke-interface {p1, v0, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getOldestTimestampByPacketVersion$5(Ljava/lang/String;Ltb/a;)Ljava/lang/Long;
    .locals 2

    const-string v0, "SELECT timestamp FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC LIMIT 1"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    invoke-interface {p1, v0, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_2
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic lambda$getPacketsByRevision$2(Ljava/lang/String;Ltb/a;)Ljava/util/List;
    .locals 24

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC"

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    invoke-interface {v1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const-string v0, "timestamp"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "hw_version"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "maxim_version"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "dsp_version"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "strap_id"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "binary_version"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "binary_flags"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "raw_data_version"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "payload"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "id"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_1

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v16, v12

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v17, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v17, v12

    :goto_3
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    const/16 v18, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    :goto_4
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v19, 0x0

    :goto_5
    move-wide/from16 p0, v14

    goto :goto_6

    :cond_4
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v12

    goto :goto_5

    :goto_6
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v14, v14

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v15

    if-eqz v15, :cond_5

    const/16 v22, 0x0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v22, v12

    :goto_7
    invoke-interface {v1, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v12

    invoke-static {v12}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v23

    move/from16 v20, v13

    new-instance v13, Ldu0/a;

    move/from16 v21, v14

    move-wide/from16 v14, p0

    invoke-direct/range {v13 .. v23}, Ldu0/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/nio/ByteBuffer;)V

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Ldu0/a;->k(J)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private static synthetic lambda$getPacketsByRevisionAndCount$3(Ljava/lang/String;ILtb/a;)Ljava/util/List;
    .locals 24

    move-object/from16 v0, p0

    const-string v1, "SELECT * FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC LIMIT ?"

    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v0, :cond_0

    :try_start_0
    invoke-interface {v1, v2}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    invoke-interface {v1, v2, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x2

    move/from16 v2, p1

    int-to-long v2, v2

    invoke-interface {v1, v0, v2, v3}, Ltb/c;->p(IJ)V

    const-string v0, "timestamp"

    invoke-static {v1, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v2, "hw_version"

    invoke-static {v1, v2}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v2

    const-string v3, "maxim_version"

    invoke-static {v1, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "dsp_version"

    invoke-static {v1, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "strap_id"

    invoke-static {v1, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "binary_version"

    invoke-static {v1, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "binary_flags"

    invoke-static {v1, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "raw_data_version"

    invoke-static {v1, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "payload"

    invoke-static {v1, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "id"

    invoke-static {v1, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-interface {v1}, Ltb/c;->e1()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v1, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-interface {v1, v2}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_1

    const/16 v16, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v1, v2}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v16, v12

    :goto_2
    invoke-interface {v1, v3}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v17, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v17, v12

    :goto_3
    invoke-interface {v1, v4}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_3

    const/16 v18, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v1, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    :goto_4
    invoke-interface {v1, v5}, Ltb/c;->isNull(I)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v19, 0x0

    :goto_5
    move-wide/from16 p0, v14

    goto :goto_6

    :cond_4
    invoke-interface {v1, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v19, v12

    goto :goto_5

    :goto_6
    invoke-interface {v1, v6}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v12, v13

    invoke-interface {v1, v7}, Ltb/c;->getLong(I)J

    move-result-wide v13

    long-to-int v13, v13

    invoke-interface {v1, v8}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_5

    const/16 v22, 0x0

    goto :goto_7

    :cond_5
    invoke-interface {v1, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v14

    move-object/from16 v22, v14

    :goto_7
    invoke-interface {v1, v9}, Ltb/c;->getBlob(I)[B

    move-result-object v14

    invoke-static {v14}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v23

    move/from16 v21, v13

    new-instance v13, Ldu0/a;

    move-wide/from16 v14, p0

    move/from16 v20, v12

    invoke-direct/range {v13 .. v23}, Ldu0/a;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/nio/ByteBuffer;)V

    invoke-interface {v1, v10}, Ltb/c;->getLong(I)J

    move-result-wide v14

    invoke-virtual {v13, v14, v15}, Ldu0/a;->k(J)V

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    return-object v11

    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic lambda$insertList$0(Ljava/util/List;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__insertAdapterOfRawDataDto:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Iterable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private static synthetic lambda$observeNewestTimestamp$6(Ltb/a;)Ljava/lang/Long;
    .locals 3

    const-string v0, "SELECT MAX(timestamp) FROM table_raw_data"

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

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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


# virtual methods
.method public delete(JLq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lai1/b;

    const/4 v2, 0x3

    invoke-direct {v1, p1, p2, v2}, Lai1/b;-><init>(JI)V

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAllData(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/i;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteByPacketsList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/g;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/g;-><init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getNewestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lb30/y4;

    const/4 v2, 0x6

    invoke-direct {v1, p1, v2}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getOldestTimestampByPacketVersion(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lb30/y4;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getPacketsByRevision(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lb30/y4;

    const/4 v2, 0x5

    invoke-direct {v1, p1, v2}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getPacketsByRevisionAndCount(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/h;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/whoop/data/local/room/dao/persistent/h;-><init>(Ljava/lang/String;II)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public insertList(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 3
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

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    new-instance v1, Lcom/whoop/data/local/room/dao/persistent/g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/local/room/dao/persistent/g;-><init>(Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;Ljava/util/List;I)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public observeNewestTimestamp()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/local/room/dao/persistent/RawDataDao_Impl;->__db:Landroidx/room/z0;

    const-string v1, "table_raw_data"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcj2/a;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lcj2/a;-><init>(I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method
