.class Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl$1;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl$1;->this$0:Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `cached_table_metrics_data` (`packet_revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'e588be881027354707d18b8b717dbf61\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `cached_table_metrics_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl$1;->this$0:Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;->access$000(Lcom/whoop/data/room/CachedStrapPacketDatabase_Impl;Ltb/a;)V

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
    .locals 12

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, Lob/h;

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    const-string v5, "packet_revision"

    const-string v6, "INTEGER"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "packet_revision"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const-string v6, "timestamp"

    const-string v7, "INTEGER"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "timestamp"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "packet_data"

    const-string v8, "BLOB"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "packet_data"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "version_id"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "version_id"

    const/4 v2, 0x0

    invoke-static {v0, v1, v5, v2}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v1

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v5, "cached_table_metrics_data"

    invoke-direct {v4, v5, v0, v1, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, p1}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object p1

    invoke-virtual {v4, p1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v1, "cached_table_metrics_data(com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto).\n Expected:\n"

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
