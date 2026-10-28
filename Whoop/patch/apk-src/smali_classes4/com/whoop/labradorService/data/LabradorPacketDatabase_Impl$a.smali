.class Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl$a;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl$a;->a:Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `ecg_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_ecg_packets_timestamp_packet_revision` ON `ecg_packets` (`timestamp`, `packet_revision`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'ee3afa1695f87777837a94798d759c94\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `ecg_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl$a;->a:Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;->c(Lcom/whoop/labradorService/data/LabradorPacketDatabase_Impl;Ltb/a;)V

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

    const/4 v3, 0x1

    const-string v5, "timestamp"

    const-string v6, "INTEGER"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "timestamp"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "packet_revision"

    const-string v7, "INTEGER"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "packet_revision"

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    const-string v7, "packet_data"

    const-string v8, "BLOB"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "packet_data"

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "version_id"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "version_id"

    const/4 v4, 0x0

    invoke-static {v0, v3, v5, v4}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v3

    new-instance v5, Ljava/util/HashSet;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, Lob/j;

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "ASC"

    filled-new-array {v2, v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v8, "index_ecg_packets_timestamp_packet_revision"

    invoke-direct {v7, v8, v1, v2, v6}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v1, Lob/k;

    const-string v2, "ecg_packets"

    invoke-direct {v1, v2, v0, v3, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v2, p1}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object p1

    invoke-virtual {v1, p1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "ecg_packets(com.whoop.labradorService.data.LabradorPacketDto).\n Expected:\n"

    const-string v3, "\n Found:\n"

    invoke-static {v2, v1, v3, p1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v4, p1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, Landroidx/room/f1;

    const/4 v0, 0x0

    invoke-direct {p1, v6, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
