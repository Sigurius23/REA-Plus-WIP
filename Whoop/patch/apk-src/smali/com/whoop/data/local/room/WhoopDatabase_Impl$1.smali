.class Lcom/whoop/data/local/room/WhoopDatabase_Impl$1;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/WhoopDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/WhoopDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/WhoopDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl$1;->this$0:Lcom/whoop/data/local/room/WhoopDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_teams` (`user_id` INTEGER, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `icon_url` TEXT NOT NULL, `banner_url` TEXT NOT NULL, `athlete_privacy_id` INTEGER NOT NULL, `scores` TEXT NOT NULL, `admin_id` INTEGER NOT NULL, `team_type` TEXT NOT NULL, `member_count` INTEGER NOT NULL, `rank` INTEGER NOT NULL, `chat_enable` INTEGER NOT NULL, `unread_count` INTEGER NOT NULL, `team_privacy_profile_id` INTEGER, `team_privacy_profile_name` TEXT, `basic` INTEGER, `stats` INTEGER, `comps` INTEGER, `overview` INTEGER, `intensity` INTEGER, `recovery` INTEGER, `sleep` INTEGER, `cid` TEXT, `channel_id` TEXT, `channel_type` TEXT, `channel_name` TEXT, PRIMARY KEY(`id`, `team_type`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_default_images` (`id` INTEGER NOT NULL, `banners` TEXT NOT NULL, `avatars` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_journal_answers` (`cycle_id` INTEGER NOT NULL, `is_journal_shown` INTEGER NOT NULL, `is_journal_answered` INTEGER NOT NULL, PRIMARY KEY(`cycle_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_log_stream` (`user_id` INTEGER, `utc_date_time` TEXT, `local_date_time` TEXT, `body` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_gps` (`time_stamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy` REAL NOT NULL, `vertical_accuracy` REAL NOT NULL, PRIMARY KEY(`time_stamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_gps_meta_data` (`start_date` INTEGER NOT NULL, `end_date` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_team_invites` (`id` INTEGER NOT NULL, `status` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `community_id` INTEGER NOT NULL, `sender_id` INTEGER NOT NULL, `recipient_id` INTEGER NOT NULL, `community` TEXT, `sender` TEXT, `community_invite_code` TEXT, `showBadge` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_console_packets` (`packet_time_stamp_utc` INTEGER NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `strap_id` TEXT NOT NULL, `hw_version` TEXT NOT NULL, `maxim_version` TEXT NOT NULL, `dsp_version` TEXT NOT NULL, `nordic_version` TEXT NOT NULL, `sequence_number` INTEGER NOT NULL, `received_packet_raw` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_feature_teams` (`name` TEXT NOT NULL, `description` TEXT, `iconUrl` TEXT NOT NULL, `bannerUrl` TEXT NOT NULL, `athletePrivacyId` INTEGER NOT NULL, `memberCount` INTEGER NOT NULL, `inviteCode` TEXT NOT NULL, `teamType` TEXT NOT NULL, `communityId` INTEGER NOT NULL, `showBadge` INTEGER NOT NULL DEFAULT 1, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_raw_data` (`timestamp` INTEGER NOT NULL, `hw_version` TEXT NOT NULL, `maxim_version` TEXT NOT NULL, `dsp_version` TEXT NOT NULL, `strap_id` TEXT NOT NULL, `binary_version` INTEGER NOT NULL, `binary_flags` INTEGER NOT NULL, `raw_data_version` TEXT NOT NULL, `payload` BLOB NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_table_raw_data_timestamp_raw_data_version` ON `table_raw_data` (`timestamp`, `raw_data_version`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_member_stories` (`memberStoryId` INTEGER NOT NULL, `created_at` TEXT NOT NULL, `updated_at` TEXT NOT NULL, `title` TEXT NOT NULL, `publish_date` TEXT NOT NULL, `url` TEXT NOT NULL, `image` TEXT NOT NULL, `content_type` TEXT NOT NULL, `showBadge` INTEGER NOT NULL DEFAULT 1, `description` TEXT NOT NULL, `deleted` INTEGER NOT NULL DEFAULT 0, `featured` INTEGER NOT NULL DEFAULT 0, `live` INTEGER NOT NULL DEFAULT 0, `archived` INTEGER NOT NULL DEFAULT 0, `live_time` TEXT NOT NULL, `host_id` INTEGER NOT NULL, `url_text` TEXT NOT NULL, `cta_text` TEXT NOT NULL DEFAULT \'Join the discussion\', `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER, `first_name` TEXT, `last_name` TEXT, `name` TEXT, `username` TEXT, `avatar_url` TEXT, `host_created_at` TEXT, `host_updated_at` TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_smart_alarm_diagnostics` (`event_type` TEXT NOT NULL, `alarm_trigger` TEXT, `timestamp_millis` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `isAckSuccess` INTEGER, `devicePlatform` TEXT NOT NULL, `deviceOs` TEXT NOT NULL, `deviceModel` TEXT NOT NULL, `strapId` TEXT NOT NULL, `maximVersion` TEXT NOT NULL, `nordicVersion` TEXT NOT NULL, `batteryOptimizationOn` INTEGER NOT NULL, `phoneSetAlarmTime` TEXT, `strapReportedAlarmTime` TEXT, `isStrapConnected` INTEGER)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'7f8f6cda74cddb64af0f9f3afdcd2fad\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `table_teams`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_default_images`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_journal_answers`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_log_stream`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_gps`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_gps_meta_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_team_invites`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_console_packets`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_feature_teams`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_raw_data`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_member_stories`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_smart_alarm_diagnostics`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/WhoopDatabase_Impl$1;->this$0:Lcom/whoop/data/local/room/WhoopDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/WhoopDatabase_Impl;->access$000(Lcom/whoop/data/local/room/WhoopDatabase_Impl;Ltb/a;)V

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
    .locals 26

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    const-string v6, "user_id"

    const-string v7, "INTEGER"

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "user_id"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x1

    const-string v8, "id"

    const-string v9, "INTEGER"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "id"

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "name"

    const-string v10, "TEXT"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v5, "name"

    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "description"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v6, "description"

    invoke-virtual {v1, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "icon_url"

    const-string v12, "TEXT"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "icon_url"

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "banner_url"

    const-string v13, "TEXT"

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "banner_url"

    invoke-virtual {v1, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "athlete_privacy_id"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "athlete_privacy_id"

    invoke-virtual {v1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "scores"

    const-string v15, "TEXT"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "scores"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "admin_id"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "admin_id"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x2

    const-string v16, "team_type"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "team_type"

    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "member_count"

    const-string v18, "INTEGER"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "member_count"

    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "rank"

    const-string v19, "INTEGER"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "rank"

    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "chat_enable"

    const-string v12, "INTEGER"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "chat_enable"

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "unread_count"

    const-string v13, "INTEGER"

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "unread_count"

    invoke-virtual {v1, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "team_privacy_profile_id"

    const-string v14, "INTEGER"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "team_privacy_profile_id"

    invoke-virtual {v1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "team_privacy_profile_name"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "team_privacy_profile_name"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "basic"

    const-string v16, "INTEGER"

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "basic"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "stats"

    const-string v17, "INTEGER"

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "stats"

    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "comps"

    const-string v18, "INTEGER"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "comps"

    invoke-virtual {v1, v7, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "overview"

    const-string v19, "INTEGER"

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "overview"

    invoke-virtual {v1, v7, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "intensity"

    const-string v12, "INTEGER"

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "intensity"

    invoke-virtual {v1, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "recovery"

    const-string v13, "INTEGER"

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "recovery"

    invoke-virtual {v1, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "sleep"

    const-string v14, "INTEGER"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "sleep"

    invoke-virtual {v1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "cid"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "cid"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "channel_id"

    const-string v16, "TEXT"

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "channel_id"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "channel_type"

    const-string v17, "TEXT"

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "channel_type"

    invoke-virtual {v1, v7, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "channel_name"

    const-string v18, "TEXT"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "channel_name"

    const/4 v8, 0x0

    invoke-static {v1, v7, v14, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v7

    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lob/k;

    const-string v11, "table_teams"

    invoke-direct {v10, v11, v1, v7, v9}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v11, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v9, "\n Found:\n"

    if-nez v7, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_teams(com.whoop.data.local.room.entity.TeamsDto).\n Expected:\n"

    invoke-static {v2, v10, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v7, 0x3

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x1

    const-string v13, "id"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "banners"

    const-string v15, "TEXT"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "banners"

    invoke-virtual {v1, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "avatars"

    const-string v16, "TEXT"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "avatars"

    invoke-static {v1, v10, v12, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lob/k;

    const-string v13, "table_default_images"

    invoke-direct {v12, v13, v1, v10, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v12, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_default_images(com.whoop.service.network.model.DefaultImages).\n Expected:\n"

    invoke-static {v2, v12, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x1

    const-string v13, "cycle_id"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "cycle_id"

    invoke-virtual {v1, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "is_journal_shown"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "is_journal_shown"

    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "is_journal_answered"

    const-string v17, "INTEGER"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "is_journal_answered"

    invoke-static {v1, v10, v13, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lob/k;

    const-string v13, "table_journal_answers"

    invoke-direct {v12, v13, v1, v10, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v12, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_journal_answers(com.whoop.data.local.room.entity.JournalAnsweredDto).\n Expected:\n"

    invoke-static {v2, v12, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    const/4 v10, 0x5

    invoke-direct {v1, v10}, Ljava/util/HashMap;-><init>(I)V

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "user_id"

    const-string v15, "INTEGER"

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v4, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "utc_date_time"

    const-string v16, "TEXT"

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "utc_date_time"

    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "local_date_time"

    const-string v17, "TEXT"

    const/16 v19, 0x0

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "local_date_time"

    invoke-virtual {v1, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "body"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "body"

    invoke-virtual {v1, v10, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const-string v18, "id"

    const-string v19, "INTEGER"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v3, v15, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lob/k;

    const-string v13, "table_log_stream"

    invoke-direct {v12, v13, v1, v10, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v12, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_log_stream(com.whoop.util.log.LogEventsDto).\n Expected:\n"

    invoke-static {v2, v12, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    const/4 v10, 0x6

    invoke-direct {v1, v10}, Ljava/util/HashMap;-><init>(I)V

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x1

    const-string v14, "time_stamp"

    const-string v15, "INTEGER"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "time_stamp"

    invoke-virtual {v1, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "latitude"

    const-string v16, "REAL"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "latitude"

    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "longitude"

    const-string v17, "REAL"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "longitude"

    invoke-virtual {v1, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "altitude"

    const-string v18, "REAL"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "altitude"

    invoke-virtual {v1, v10, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "horizontal_accuracy"

    const-string v19, "REAL"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "horizontal_accuracy"

    invoke-virtual {v1, v10, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "vertical_accuracy"

    const-string v20, "REAL"

    const/16 v22, 0x1

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v16

    const-string v11, "vertical_accuracy"

    invoke-static {v1, v11, v10, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v12, Lob/k;

    const-string v13, "table_gps"

    invoke-direct {v12, v13, v1, v10, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v13, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v12, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_gps(com.whoop.data.local.room.entity.GpsDto).\n Expected:\n"

    invoke-static {v2, v12, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "start_date"

    const-string v14, "INTEGER"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "start_date"

    invoke-virtual {v1, v7, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "end_date"

    const-string v15, "INTEGER"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "end_date"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const-string v15, "id"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v3, v12, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v7

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "table_gps_meta_data"

    invoke-direct {v11, v12, v1, v7, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_gps_meta_data(com.whoop.data.local.room.entity.GpsMetaDataDto).\n Expected:\n"

    invoke-static {v2, v11, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/HashMap;

    const/16 v7, 0xa

    invoke-direct {v1, v7}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/16 v16, 0x1

    const/4 v11, 0x1

    const-string v13, "id"

    const-string v14, "INTEGER"

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/16 v17, 0x1

    const/4 v12, 0x0

    const-string v14, "status"

    const-string v15, "TEXT"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "status"

    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/16 v18, 0x1

    const/4 v13, 0x0

    const-string v15, "deleted"

    const-string v16, "INTEGER"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "deleted"

    invoke-virtual {v1, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "community_id"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "community_id"

    invoke-virtual {v1, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "sender_id"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "sender_id"

    invoke-virtual {v1, v10, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "recipient_id"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "recipient_id"

    invoke-virtual {v1, v10, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x0

    const/16 v17, 0x0

    const-string v19, "community"

    const-string v20, "TEXT"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v16

    const-string v11, "community"

    invoke-virtual {v1, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/16 v18, 0x0

    const/4 v13, 0x0

    const-string v15, "sender"

    const-string v16, "TEXT"

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "sender"

    invoke-virtual {v1, v10, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x0

    const/4 v14, 0x0

    const-string v16, "community_invite_code"

    const-string v17, "TEXT"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "community_invite_code"

    invoke-virtual {v1, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const-string v19, "1"

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "showBadge"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "showBadge"

    invoke-static {v1, v10, v14, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v11

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/k;

    const-string v14, "table_team_invites"

    invoke-direct {v13, v14, v1, v11, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v14, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v13, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_team_invites(com.whoop.domain.model.teams.TeamInviteDto).\n Expected:\n"

    invoke-static {v2, v13, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v1, Ljava/util/HashMap;

    const/16 v11, 0xa

    invoke-direct {v1, v11}, Ljava/util/HashMap;-><init>(I)V

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "packet_time_stamp_utc"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "packet_time_stamp_utc"

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "packet_time_stamp"

    const-string v17, "INTEGER"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "packet_time_stamp"

    invoke-virtual {v1, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "strap_id"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "strap_id"

    invoke-virtual {v1, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "hw_version"

    const-string v19, "TEXT"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v12, "hw_version"

    invoke-virtual {v1, v12, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "maxim_version"

    const-string v20, "TEXT"

    const/16 v22, 0x1

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v13, v16

    const-string v14, "maxim_version"

    invoke-virtual {v1, v14, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "dsp_version"

    const-string v19, "TEXT"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v13, "dsp_version"

    invoke-virtual {v1, v13, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "nordic_version"

    const-string v20, "TEXT"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v15, v16

    const-string v2, "nordic_version"

    invoke-virtual {v1, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v22, 0x0

    const/16 v19, 0x1

    const/16 v18, 0x0

    const-string v20, "sequence_number"

    const-string v21, "INTEGER"

    const/16 v23, 0x1

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v15, "sequence_number"

    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const-string v20, "received_packet_raw"

    const-string v21, "BLOB"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    const-string v15, "received_packet_raw"

    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v17, Lob/h;

    const/16 v18, 0x1

    const-string v20, "id"

    const-string v21, "INTEGER"

    invoke-direct/range {v17 .. v23}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v17

    invoke-static {v1, v3, v2, v8}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v15, Ljava/util/HashSet;

    invoke-direct {v15, v8}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Lob/k;

    move-object/from16 v18, v4

    const-string v4, "table_console_packets"

    invoke-direct {v8, v4, v1, v2, v15}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v4, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_console_packets(com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsDto).\n Expected:\n"

    invoke-static {v2, v8, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_7
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v25, 0x1

    const/16 v20, 0x0

    const-string v22, "name"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v25, 0x0

    const-string v22, "description"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v25, 0x1

    const-string v22, "iconUrl"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "iconUrl"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "bannerUrl"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "bannerUrl"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "athletePrivacyId"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "athletePrivacyId"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "memberCount"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "memberCount"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "inviteCode"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "inviteCode"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "teamType"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "teamType"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "communityId"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "communityId"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "1"

    const-string v22, "showBadge"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v20, 0x1

    const-string v22, "id"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const/4 v4, 0x0

    invoke-static {v1, v3, v2, v4}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v15, Lob/k;

    const-string v4, "table_feature_teams"

    invoke-direct {v15, v4, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v4, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v15, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_feature_teams(com.whoop.domain.model.teams.FeatureTeam).\n Expected:\n"

    invoke-static {v2, v15, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v20, 0x0

    const-string v22, "timestamp"

    const-string v23, "INTEGER"

    const/16 v25, 0x1

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "timestamp"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "hw_version"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "maxim_version"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "dsp_version"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "strap_id"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "binary_version"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v8, "binary_version"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "binary_flags"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v8, "binary_flags"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "raw_data_version"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v8, "raw_data_version"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "payload"

    const-string v23, "BLOB"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v11, "payload"

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v20, 0x1

    const-string v22, "id"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const/4 v11, 0x0

    invoke-static {v1, v3, v2, v11}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v11, Ljava/util/HashSet;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/j;

    filled-new-array {v4, v8}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v8, "ASC"

    filled-new-array {v8, v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v14, "index_table_raw_data_timestamp_raw_data_version"

    invoke-direct {v13, v14, v4, v8, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v4, Lob/k;

    const-string v8, "table_raw_data"

    invoke-direct {v4, v8, v1, v2, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v8, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_raw_data(com.whoop.connectivityDataPacketsModels.firmware.rawdata.dto.RawDataDto).\n Expected:\n"

    invoke-static {v2, v4, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_9
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v25, 0x1

    const/16 v20, 0x0

    const-string v22, "memberStoryId"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "memberStoryId"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "created_at"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "created_at"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "updated_at"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "updated_at"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "title"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "title"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "publish_date"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "publish_date"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "url"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "url"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "image"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "image"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "content_type"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "content_type"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "1"

    const-string v22, "showBadge"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const-string v22, "description"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "0"

    const-string v22, "deleted"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "0"

    const-string v22, "featured"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "featured"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "0"

    const-string v22, "live"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "live"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "0"

    const-string v22, "archived"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "archived"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const-string v22, "live_time"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "live_time"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "host_id"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "host_id"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "url_text"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "url_text"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v24, "\'Join the discussion\'"

    const-string v22, "cta_text"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v4, "cta_text"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v20, 0x1

    const-string v22, "id"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v25, 0x0

    const/16 v20, 0x0

    const-string v22, "user_id"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v4, v18

    move-object/from16 v2, v19

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v24, 0x0

    const/16 v19, 0x0

    const-string v21, "first_name"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "first_name"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "last_name"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "last_name"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "name"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "username"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "username"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "avatar_url"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "avatar_url"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "host_created_at"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "host_created_at"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "host_updated_at"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "host_updated_at"

    const/4 v11, 0x0

    invoke-static {v1, v4, v2, v11}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v11}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Lob/k;

    const-string v6, "table_member_stories"

    invoke-direct {v5, v6, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_member_stories(com.whoop.domain.model.teams.MemberStory).\n Expected:\n"

    invoke-static {v2, v5, v9, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v11, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_a
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v18, Lob/h;

    const/16 v23, 0x0

    const/16 v20, 0x1

    const/16 v24, 0x1

    const/16 v19, 0x0

    const-string v21, "event_type"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "event_type"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v24, 0x0

    const-string v21, "alarm_trigger"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "alarm_trigger"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v24, 0x1

    const-string v21, "timestamp_millis"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v4, "timestamp_millis"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v19, 0x1

    const-string v21, "id"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v24, 0x0

    const/16 v19, 0x0

    const-string v21, "isAckSuccess"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "isAckSuccess"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v24, 0x1

    const-string v21, "devicePlatform"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "devicePlatform"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "deviceOs"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "deviceOs"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "deviceModel"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "deviceModel"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "strapId"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "strapId"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "maximVersion"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "maximVersion"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "nordicVersion"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "nordicVersion"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "batteryOptimizationOn"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "batteryOptimizationOn"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const/16 v24, 0x0

    const-string v21, "phoneSetAlarmTime"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "phoneSetAlarmTime"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "strapReportedAlarmTime"

    const-string v22, "TEXT"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "strapReportedAlarmTime"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v18, Lob/h;

    const-string v21, "isStrapConnected"

    const-string v22, "INTEGER"

    invoke-direct/range {v18 .. v24}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v18

    const-string v3, "isStrapConnected"

    const/4 v11, 0x0

    invoke-static {v1, v3, v2, v11}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v11}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v5, "table_smart_alarm_diagnostics"

    invoke-direct {v4, v5, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v4, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v1, Landroidx/room/f1;

    const-string v2, "table_smart_alarm_diagnostics(com.whoop.data.local.room.entity.SmartAlarmDiagnosticDto).\n Expected:\n"

    invoke-static {v2, v4, v9, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v11, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_b
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
