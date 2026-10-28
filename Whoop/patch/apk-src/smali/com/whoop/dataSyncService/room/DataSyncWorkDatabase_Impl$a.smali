.class Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl$a;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl$a;->a:Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `data_sync_work_db` (`workerId` TEXT NOT NULL, `source` TEXT NOT NULL, `trigger_timestamp` INTEGER NOT NULL DEFAULT 0, `result_timestamp` INTEGER NOT NULL DEFAULT 0, `total_packet_upload` INTEGER NOT NULL DEFAULT 0, `upload_retry_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`workerId`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'6e44325657e90a9e8c8243a2dcaec30f\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `data_sync_work_db`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl$a;->a:Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;->c(Lcom/whoop/dataSyncService/room/DataSyncWorkDatabase_Impl;Ltb/a;)V

    return-void
.end method

.method public onPostMigrate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onPreMigrate(Ltb/a;)V
    .locals 0

    invoke-static {p1}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public onValidateSchema(Ltb/a;)Landroidx/room/f1;
    .locals 14

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Lob/h;

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x1

    const-string v5, "workerId"

    const-string v6, "TEXT"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "workerId"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "source"

    const-string v7, "TEXT"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "source"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const-string v9, "0"

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "trigger_timestamp"

    const-string v8, "INTEGER"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "trigger_timestamp"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const-string v10, "0"

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "result_timestamp"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "result_timestamp"

    invoke-virtual {v0, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const-string v11, "0"

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "total_packet_upload"

    const-string v10, "INTEGER"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "total_packet_upload"

    invoke-virtual {v0, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const-string v12, "0"

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "upload_retry_count"

    const-string v11, "INTEGER"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "upload_retry_count"

    const/4 v2, 0x0

    invoke-static {v0, v1, v7, v2}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v1

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v5, "data_sync_work_db"

    invoke-direct {v4, v5, v0, v1, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, p1}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object p1

    invoke-virtual {v4, p1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v1, "data_sync_work_db(com.whoop.dataSyncService.room.DataSyncWork).\n Expected:\n"

    const-string v3, "\n Found:\n"

    invoke-static {v1, v4, v3, p1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Landroidx/room/f1;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
