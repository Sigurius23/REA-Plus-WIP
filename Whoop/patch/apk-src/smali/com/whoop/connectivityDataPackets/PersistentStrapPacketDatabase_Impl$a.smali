.class Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl$a;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl$a;->a:Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_metrics_data` (`packet_revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, `frame_revision` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_heart_data_versions` (`version_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hardware_family` INTEGER NOT NULL, `pcba_revision` INTEGER NOT NULL, `optical_revision` INTEGER NOT NULL, `firmware_major` INTEGER NOT NULL, `firmware_minor` INTEGER NOT NULL, `firmware_build` INTEGER NOT NULL, `firmware_unreleased` INTEGER NOT NULL, `firmware_version` TEXT NOT NULL DEFAULT \'\', `sigproc_major` INTEGER NOT NULL, `sigproc_minor` INTEGER NOT NULL, `sigproc_patch` INTEGER NOT NULL, `binary_version` INTEGER NOT NULL, `binary_flags` INTEGER NOT NULL, `strap_id` TEXT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_strap_firmware_events` (`timestamp` INTEGER NOT NULL, `type` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `type`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sequence_no` INTEGER NOT NULL DEFAULT -1, `packet_time_stamp` INTEGER NOT NULL, `console_packets_metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_research_packets` (`revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packetData` BLOB NOT NULL, `versionId` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `sensor_data_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `packet_revision`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `memfault_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serial_number` TEXT NOT NULL, `value` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_optical_revision` INTEGER NOT NULL DEFAULT 0, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_firmware_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_optical_revision` INTEGER NOT NULL DEFAULT 0, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_rev2_raw_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_raw_data_packet_time_stamp_sequence_no` ON `table_rev2_raw_data` (`packet_time_stamp`, `sequence_no`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_rev2_data_settings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `subtype` INTEGER NOT NULL, `received_packet_raw` BLOB NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_data_settings_packet_time_stamp_sequence_no` ON `table_rev2_data_settings` (`packet_time_stamp`, `sequence_no`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'6e6c7540db7fb622e48555d647c1c077\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `table_metrics_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_heart_data_versions`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_strap_firmware_events`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `console_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_research_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `sensor_data_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `memfault_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_battery_pack_relative_console_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_battery_pack_relative_firmware_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_rev2_raw_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_rev2_data_settings`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl$a;->a:Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;->m(Lcom/whoop/connectivityDataPackets/PersistentStrapPacketDatabase_Impl;Ltb/a;)V

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
    .locals 32

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "packet_revision"

    const-string v7, "INTEGER"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "packet_revision"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x1

    const-string v8, "timestamp"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "timestamp"

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "packet_data"

    const-string v10, "BLOB"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "packet_data"

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "version_id"

    const-string v11, "INTEGER"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v6, "version_id"

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const-string v13, "1"

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "frame_revision"

    const-string v12, "INTEGER"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "frame_revision"

    invoke-static {v1, v7, v8, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v7

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lob/k;

    const-string v11, "table_metrics_data"

    invoke-direct {v10, v11, v1, v7, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v11, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v8, "\n Found:\n"

    if-nez v7, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_metrics_data(com.whoop.connectivityDataPacketsModels.metrics.dto.MetricsDataDto).\n Expected:\n"

    invoke-static {v2, v10, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/16 v7, 0xf

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x1

    const/4 v11, 0x1

    const-string v13, "version_id"

    const-string v14, "INTEGER"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/16 v17, 0x1

    const/4 v12, 0x0

    const-string v14, "hardware_family"

    const-string v15, "INTEGER"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "hardware_family"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/16 v18, 0x1

    const/4 v13, 0x0

    const-string v15, "pcba_revision"

    const-string v16, "INTEGER"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "pcba_revision"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "optical_revision"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "optical_revision"

    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "firmware_major"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "firmware_major"

    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "firmware_minor"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "firmware_minor"

    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x1

    const/16 v17, 0x0

    const-string v19, "firmware_build"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v10, "firmware_build"

    invoke-virtual {v1, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/16 v17, 0x1

    const/4 v12, 0x0

    const-string v14, "firmware_unreleased"

    const-string v15, "INTEGER"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "firmware_unreleased"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const-string v17, "\'\'"

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "firmware_version"

    const-string v16, "TEXT"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "firmware_version"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "sigproc_major"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "sigproc_major"

    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "sigproc_minor"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "sigproc_minor"

    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "sigproc_patch"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "sigproc_patch"

    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "binary_version"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v10, "binary_version"

    invoke-virtual {v1, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/16 v17, 0x1

    const/4 v12, 0x0

    const-string v14, "binary_flags"

    const-string v15, "INTEGER"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "binary_flags"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "strap_id"

    const-string v16, "TEXT"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "strap_id"

    invoke-static {v1, v7, v12, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v7

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "table_heart_data_versions"

    invoke-direct {v11, v12, v1, v7, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_heart_data_versions(com.whoop.connectivityDataPacketsModels.metadata.dto.StrapMetadataDto).\n Expected:\n"

    invoke-static {v2, v11, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    const/4 v7, 0x4

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x1

    const-string v13, "timestamp"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x2

    const-string v14, "type"

    const-string v15, "INTEGER"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "type"

    invoke-virtual {v1, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "packet_data"

    const-string v16, "BLOB"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v5, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "version_id"

    const-string v17, "INTEGER"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v6, v13, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lob/k;

    const-string v13, "table_strap_firmware_events"

    invoke-direct {v12, v13, v1, v10, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v12, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_strap_firmware_events(com.whoop.connectivityDataPacketsModels.firmware.events.dto.StrapFirmwareEventDto).\n Expected:\n"

    invoke-static {v2, v12, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x1

    const-string v13, "id"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "id"

    invoke-virtual {v1, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const-string v17, "-1"

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "sequence_no"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "sequence_no"

    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "packet_time_stamp"

    const-string v17, "INTEGER"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v12, "packet_time_stamp"

    invoke-virtual {v1, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "console_packets_metadata"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v13, "console_packets_metadata"

    invoke-virtual {v1, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "received_packet_raw"

    const-string v19, "BLOB"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v13, "received_packet_raw"

    invoke-static {v1, v13, v15, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v14

    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Lob/k;

    const-string v7, "console_packets"

    invoke-direct {v2, v7, v1, v14, v15}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v7, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    new-instance v0, Landroidx/room/f1;

    const-string v3, "console_packets(com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsDtoNew).\n Expected:\n"

    invoke-static {v3, v2, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v19, 0x0

    const-string v21, "revision"

    const-string v22, "INTEGER"

    const/16 v24, 0x1

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v7, "revision"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v19, 0x1

    const-string v21, "timestamp"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v19, 0x0

    const-string v21, "packetData"

    const-string v22, "BLOB"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v7, "packetData"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "versionId"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v7, "versionId"

    invoke-static {v1, v7, v2, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v14, Lob/k;

    const-string v15, "table_research_packets"

    invoke-direct {v14, v15, v1, v2, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v15, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v14, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_research_packets(com.whoop.connectivityDataPacketsModels.research.dto.ResearchPacketDto).\n Expected:\n"

    invoke-static {v2, v14, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v18, 0x1

    const-string v20, "timestamp"

    const-string v21, "INTEGER"

    const/16 v23, 0x1

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v18, 0x2

    const-string v20, "packet_revision"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v18, 0x0

    const-string v20, "packet_data"

    const-string v21, "BLOB"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "version_id"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-static {v1, v6, v2, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v6, "sensor_data_packets"

    invoke-direct {v4, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v0, Landroidx/room/f1;

    const-string v2, "sensor_data_packets(com.whoop.connectivityDataPacketsModels.generic.SensorDataPacketDto).\n Expected:\n"

    invoke-static {v2, v4, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v18, 0x1

    const-string v20, "id"

    const-string v21, "INTEGER"

    const/16 v23, 0x1

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v18, 0x0

    const-string v20, "serial_number"

    const-string v21, "TEXT"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v3, "serial_number"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "value"

    const-string v21, "BLOB"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v3, "value"

    invoke-static {v1, v3, v2, v9}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v6, "memfault_packets"

    invoke-direct {v4, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    new-instance v0, Landroidx/room/f1;

    const-string v2, "memfault_packets(com.whoop.connectivityDataPacketsModels.memfault.MemfaultPacketDto).\n Expected:\n"

    invoke-static {v2, v4, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v23, 0x1

    const/16 v18, 0x1

    const-string v20, "id"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v18, 0x0

    const-string v20, "boot_count"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v3, "boot_count"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "seconds_since_boot"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v4, "seconds_since_boot"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "sequence_number"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v6, "sequence_number"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "packet_data"

    const-string v21, "BLOB"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "meta_battery_serial"

    const-string v21, "TEXT"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v7, "meta_battery_serial"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "meta_hardware_family"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v14, "meta_hardware_family"

    invoke-virtual {v1, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "meta_pcba_revision"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v15, "meta_pcba_revision"

    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v22, "0"

    const-string v20, "meta_optical_revision"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v9, "meta_optical_revision"

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v24, 0x1

    const/16 v19, 0x0

    const-string v21, "meta_firmware_major"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    move-object/from16 v18, v13

    const-string v13, "meta_firmware_major"

    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v25, 0x1

    const/16 v20, 0x0

    const-string v22, "meta_firmware_minor"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    move-object/from16 v19, v10

    const-string v10, "meta_firmware_minor"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v20, Lob/h;

    const/16 v25, 0x0

    const/16 v22, 0x1

    const/16 v26, 0x1

    const/16 v21, 0x0

    const-string v23, "meta_firmware_point"

    const-string v24, "INTEGER"

    invoke-direct/range {v20 .. v26}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v20

    move-object/from16 v20, v12

    const-string v12, "meta_firmware_point"

    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v21, Lob/h;

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v27, 0x1

    const/16 v22, 0x0

    const-string v24, "meta_firmware_extra"

    const-string v25, "INTEGER"

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v21

    move-object/from16 v21, v12

    const-string v12, "meta_firmware_extra"

    move-object/from16 v22, v10

    const/4 v10, 0x0

    invoke-static {v1, v12, v2, v10}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    move-object/from16 v23, v12

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v10}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lob/k;

    move-object/from16 v24, v13

    const-string v13, "table_battery_pack_relative_console_packets"

    invoke-direct {v10, v13, v1, v2, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_battery_pack_relative_console_packets(com.whoop.connectivityDataPacketsModels.puffin.dto.BatteryPackRelativeConsoleLogPacketEntity).\n Expected:\n"

    invoke-static {v2, v10, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_7
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v25, Lob/h;

    const/16 v30, 0x0

    const/16 v27, 0x1

    const/16 v31, 0x1

    const/16 v26, 0x1

    const-string v28, "id"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const/16 v26, 0x0

    const-string v28, "boot_count"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "seconds_since_boot"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "sequence_number"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "packet_data"

    const-string v29, "BLOB"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "meta_battery_serial"

    const-string v29, "TEXT"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "meta_hardware_family"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "meta_pcba_revision"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v30, "0"

    const-string v28, "meta_optical_revision"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const/16 v30, 0x0

    const-string v28, "meta_firmware_major"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v24

    move-object/from16 v2, v25

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v30, 0x1

    const/16 v25, 0x0

    const-string v27, "meta_firmware_minor"

    const-string v28, "INTEGER"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v22

    move-object/from16 v2, v24

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "meta_firmware_point"

    const-string v28, "INTEGER"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v21

    move-object/from16 v2, v24

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "meta_firmware_extra"

    const-string v28, "INTEGER"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v23

    move-object/from16 v2, v24

    const/4 v10, 0x0

    invoke-static {v1, v3, v2, v10}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v10}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v5, "table_battery_pack_relative_firmware_packets"

    invoke-direct {v4, v5, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_battery_pack_relative_firmware_packets(com.whoop.connectivityDataPacketsModels.puffin.dto.BatteryPackRelativeFirmwareEventPacketEntity).\n Expected:\n"

    invoke-static {v2, v4, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v21, Lob/h;

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v22, 0x1

    const-string v24, "id"

    const-string v25, "INTEGER"

    const/16 v27, 0x1

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v21

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v21, Lob/h;

    const/16 v22, 0x0

    const-string v24, "packet_time_stamp"

    const-string v25, "INTEGER"

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v20

    move-object/from16 v2, v21

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v20, Lob/h;

    const/16 v25, 0x0

    const/16 v22, 0x1

    const/16 v21, 0x0

    const-string v23, "sequence_no"

    const-string v24, "INTEGER"

    const/16 v26, 0x1

    invoke-direct/range {v20 .. v26}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v4, v19

    move-object/from16 v2, v20

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v20, 0x0

    const-string v22, "metadata"

    const-string v23, "TEXT"

    const/16 v25, 0x1

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v5, "metadata"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "received_packet_raw"

    const-string v23, "BLOB"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v18

    move-object/from16 v2, v19

    const/4 v10, 0x0

    invoke-static {v1, v6, v2, v10}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v7, Ljava/util/HashSet;

    const/4 v9, 0x1

    invoke-direct {v7, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lob/j;

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const-string v13, "ASC"

    filled-new-array {v13, v13}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const-string v15, "index_table_rev2_raw_data_packet_time_stamp_sequence_no"

    invoke-direct {v10, v15, v12, v14, v9}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v7, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v10, Lob/k;

    const-string v12, "table_rev2_raw_data"

    invoke-direct {v10, v12, v1, v2, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_rev2_raw_data(com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2RawDataDto).\n Expected:\n"

    invoke-static {v2, v10, v8, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v10, 0x0

    invoke-direct {v0, v10, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_9
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v19, 0x1

    const-string v21, "id"

    const-string v22, "INTEGER"

    const/16 v24, 0x1

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v19, 0x0

    const-string v21, "packet_time_stamp"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "sequence_no"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "metadata"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "subtype"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v5, "subtype"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "received_packet_raw"

    const-string v22, "BLOB"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const/4 v10, 0x0

    invoke-static {v1, v6, v2, v10}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Lob/j;

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    filled-new-array {v13, v13}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v7, "index_table_rev2_data_settings_packet_time_stamp_sequence_no"

    invoke-direct {v6, v7, v3, v4, v9}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v3, Lob/k;

    const-string v4, "table_rev2_data_settings"

    invoke-direct {v3, v4, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v4, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v3, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    new-instance v1, Landroidx/room/f1;

    const-string v2, "table_rev2_data_settings(com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsDto).\n Expected:\n"

    invoke-static {v2, v3, v8, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-direct {v1, v10, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_a
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v9, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
