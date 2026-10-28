.class Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl$1;
.super Landroidx/room/g1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->createOpenDelegate()Landroidx/room/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl$1;->this$0:Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;

    invoke-direct {p0, p2, p3, p4}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `active_activity_session_table` (`id` INTEGER NOT NULL, `activitySessionId` TEXT NOT NULL, `state` TEXT NOT NULL, `selectedActivityInternalName` TEXT NOT NULL, `gpsTrackingEnabled` INTEGER NOT NULL, `startTimeMs` INTEGER NOT NULL, `resumeNavigationJson` TEXT, `pauseSegmentsJson` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_activities_list` (`internal_name` TEXT NOT NULL, `display_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `category` TEXT NOT NULL, `score_type` TEXT NOT NULL, `has_gps` INTEGER NOT NULL, PRIMARY KEY(`internal_name`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `app_configuration_cache_table` (`id` INTEGER NOT NULL, `responseJson` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_configurations` (`configuration_key` TEXT NOT NULL, `configuration_value` TEXT NOT NULL, PRIMARY KEY(`configuration_key`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `entitlement_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `lastUpdated` INTEGER NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_hr_zone_list` (`zone_id` TEXT NOT NULL, `min` INTEGER NOT NULL, `max` INTEGER NOT NULL, PRIMARY KEY(`zone_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `labs_campaign` (`campaign_id` INTEGER NOT NULL, `description` TEXT NOT NULL, `name` TEXT NOT NULL, `subtitle` TEXT, `participation_cooldown_date` TEXT, `additional_collection_length` INTEGER, `bthr_additional_collection_length` INTEGER, `data_types` TEXT, `protocol_id` INTEGER, `protocol_name` TEXT, `pdf_url` TEXT, `campaign_session_id` INTEGER, PRIMARY KEY(`campaign_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `legal_document_to_campaign` (`campaign_id` INTEGER NOT NULL, `legal_id` INTEGER NOT NULL, PRIMARY KEY(`campaign_id`, `legal_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_session` (`campaign_session_id` INTEGER NOT NULL, PRIMARY KEY(`campaign_session_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_strap_info` (`whoop_strap_id` TEXT NOT NULL, `hardware_version` TEXT NOT NULL, `firmware_version` TEXT NOT NULL, `bluetooth_version` TEXT NOT NULL, `sig_proc_version` TEXT NOT NULL, PRIMARY KEY(`whoop_strap_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_legal_ducment` (`legal_id` INTEGER NOT NULL, `name` TEXT NOT NULL, `pdf_url` TEXT NOT NULL, `pdf_file_name` TEXT, PRIMARY KEY(`legal_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_onboarding_status` (`type` TEXT NOT NULL, `isCompleted` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`type`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `optimal_strain_mapping_table` (`recovery` INTEGER NOT NULL, `lower_optimal_strain` REAL NOT NULL, `optimal_strain` REAL NOT NULL, `upper_optimal_strain` REAL NOT NULL, `cycle_id` INTEGER NOT NULL, PRIMARY KEY(`recovery`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `pending_activity_save_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `activityInternalName` TEXT NOT NULL, `garmentId` INTEGER NOT NULL, `startTime` TEXT NOT NULL, `endTime` TEXT NOT NULL, `gpsEnabled` INTEGER NOT NULL, `queuedAtMs` INTEGER NOT NULL, `pauseSegmentsJson` TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `protocol_step` (`campaign_id` INTEGER NOT NULL, `step_id` INTEGER NOT NULL, `text` TEXT, `step_order` INTEGER NOT NULL, `typeform_url` TEXT, `image_url` TEXT, `image_alt` TEXT, `is_bp` INTEGER NOT NULL, `is_timer_active` INTEGER, `is_bthr` INTEGER NOT NULL, `title` TEXT, `sub_title` TEXT, `cta` TEXT, `typeform_title` TEXT, `systolic_label` TEXT, `systolic_too_low_text` TEXT, `systolic_too_high_text` TEXT, `systolic_required_text` TEXT, `systolic_max` INTEGER, `systolic_min` INTEGER, `systolic_suffix` TEXT, `systolic_required` INTEGER, `diastolic_label` TEXT, `diastolic_too_low_text` TEXT, `diastolic_too_high_text` TEXT, `diastolic_required_text` TEXT, `diastolic_max` INTEGER, `diastolic_min` INTEGER, `diastolic_suffix` TEXT, `diastolic_required` INTEGER, `heart_rate_label` TEXT, `heart_rate_too_low_text` TEXT, `heart_rate_too_high_text` TEXT, `heart_required_text` TEXT, `heart_rate_max` INTEGER, `heart_rate_min` INTEGER, `heart_rate_suffix` TEXT, `heart_rate_required` INTEGER, `input_type` TEXT, `input_required` INTEGER NOT NULL, `required_regex` TEXT, `blocked_regex` TEXT, `countdown_timer_required` INTEGER NOT NULL, `countdown_timer_seconds` INTEGER, `survey_form_id` TEXT, `survey_vendor_metadata` TEXT, `survey_provider` TEXT, PRIMARY KEY(`campaign_id`, `step_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_protocol_step_result` (`campaign_id` INTEGER NOT NULL, `result_id` INTEGER NOT NULL, `step_order` INTEGER NOT NULL, `start_timestamp` TEXT, `end_timestamp` TEXT, `typeform_submitted` INTEGER NOT NULL, `text_option` TEXT, `number_input` INTEGER, `text_input` TEXT, `timestamp_input` TEXT, `timestamp` TEXT, `systolic` INTEGER, `diastolic` INTEGER, `heart_rate` INTEGER, PRIMARY KEY(`campaign_id`, `result_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_recent_activities` (`internal_name` TEXT NOT NULL, `display_name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `deleted` INTEGER NOT NULL, `category` TEXT NOT NULL, `score_type` TEXT NOT NULL, `has_gps` INTEGER NOT NULL, PRIMARY KEY(`internal_name`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `smart_alarm_user_info_table` (`user_id` INTEGER NOT NULL, `window_minutes` INTEGER NOT NULL, `upper_time_bound` TEXT NOT NULL, `last_triggered_at` TEXT, `sleep_score_goal` INTEGER, `recovery_score_goal` INTEGER, `goal` TEXT NOT NULL DEFAULT \'EXACT_TIME_PEAK\', `enabled` INTEGER NOT NULL DEFAULT 0, `last_updated_at` INTEGER NOT NULL, `schedule_enabled` INTEGER NOT NULL DEFAULT 0, `day_of_week` TEXT, `enrolled_weekly_plan` INTEGER NOT NULL DEFAULT 0, `weekly_plan_goal` INTEGER, `time_zone_offset` TEXT, `alarm_bounds` TEXT, `weekly_plan_hour_goal` TEXT, PRIMARY KEY(`user_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_smart_alarm_triggered` (`composite_id` TEXT NOT NULL, PRIMARY KEY(`composite_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_user` (`id` INTEGER NOT NULL, `created_at` TEXT NOT NULL, `first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `full_name` TEXT NOT NULL, `email_address` TEXT NOT NULL, `password` TEXT NOT NULL, `username` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `city` TEXT, `admin_division` TEXT, `country` TEXT NOT NULL, `concealed` INTEGER NOT NULL DEFAULT 0, `age` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `table_user_profile` (`id` INTEGER NOT NULL, `gender` TEXT NOT NULL, `height` REAL NOT NULL, `weight` REAL NOT NULL, `birthday` TEXT NOT NULL, `time_zone_offset` TEXT NOT NULL, `unit_system` TEXT NOT NULL, `fitness_level` TEXT NOT NULL, `max_heart_rate` INTEGER NOT NULL, `min_heart_rate` INTEGER NOT NULL, `physiological_baseline` TEXT, `can_upload_data` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_hr_device` (`hr_device_id` TEXT NOT NULL, `device_name` TEXT, `hr_file_path` TEXT, PRIMARY KEY(`hr_device_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_study` (`study_id` INTEGER NOT NULL, `start_time` TEXT, `end_time` TEXT, `hr_device_connected` INTEGER NOT NULL, `status` TEXT NOT NULL, `campaign_id` INTEGER NOT NULL, `pdf_file_name` TEXT, `protocol_step` INTEGER NOT NULL, `protocol_completed` INTEGER NOT NULL, PRIMARY KEY(`study_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_study_tag` (`timestamp` TEXT NOT NULL, `note` TEXT, `campaign_id` INTEGER NOT NULL, `tag_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_input_option` (`step_id` INTEGER NOT NULL, `option_order` INTEGER NOT NULL, `option_key` TEXT NOT NULL, `option_value` TEXT NOT NULL, PRIMARY KEY(`step_id`, `option_key`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `whoop_labs_protocol_step_config` (`step_id` INTEGER NOT NULL, `input_label` TEXT, `min` INTEGER, `max` INTEGER, `min_error_text` TEXT, `max_error_text` TEXT, `hint` TEXT, `row_count` INTEGER, PRIMARY KEY(`step_id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `gps_locations` (`timestamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy_meters` REAL NOT NULL, `vertical_accuracy_meters` REAL NOT NULL, `speed_value` REAL, `speed_unit` TEXT, `speed_accuracy` REAL, `trigger` TEXT, PRIMARY KEY(`timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_gps_locations_timestamp` ON `gps_locations` (`timestamp`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `membership_type_table` (`id` INTEGER NOT NULL, `membershipType` TEXT NOT NULL, `lastUpdated` INTEGER NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `foreground_gps_route_points` (`sessionStartTimeMs` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL, `horizontal_accuracy_meters` REAL NOT NULL, `vertical_accuracy_meters` REAL NOT NULL, PRIMARY KEY(`sessionStartTimeMs`, `timestamp`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_foreground_gps_route_points_sessionStartTimeMs` ON `foreground_gps_route_points` (`sessionStartTimeMs`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'320843d67212caa754e8ddcd3a67c5df\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "DROP TABLE IF EXISTS `active_activity_session_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_activities_list`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `app_configuration_cache_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_configurations`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `entitlement_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_hr_zone_list`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `labs_campaign`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `legal_document_to_campaign`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_session`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_strap_info`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_legal_ducment`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_onboarding_status`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `optimal_strain_mapping_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `pending_activity_save_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `protocol_step`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_protocol_step_result`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_recent_activities`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `smart_alarm_user_info_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_smart_alarm_triggered`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_user`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `table_user_profile`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_hr_device`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_study`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_study_tag`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_input_option`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `whoop_labs_protocol_step_config`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `gps_locations`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `membership_type_table`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `foreground_gps_route_points`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public onCreate(Ltb/a;)V
    .locals 0

    return-void
.end method

.method public onOpen(Ltb/a;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl$1;->this$0:Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;

    invoke-static {v0, p1}, Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;->access$000(Lcom/whoop/data/local/room/PersistentWhoopDatabase_Impl;Ltb/a;)V

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
    .locals 40

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v3, Lob/h;

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x1

    const-string v6, "id"

    const-string v7, "INTEGER"

    const/4 v9, 0x1

    invoke-direct/range {v3 .. v9}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "id"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Lob/h;

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const-string v8, "activitySessionId"

    const-string v9, "TEXT"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v11}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "activitySessionId"

    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lob/h;

    const/4 v11, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    const-string v9, "state"

    const-string v10, "TEXT"

    const/4 v12, 0x1

    invoke-direct/range {v6 .. v12}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "state"

    invoke-virtual {v1, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Lob/h;

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v8, 0x0

    const-string v10, "selectedActivityInternalName"

    const-string v11, "TEXT"

    const/4 v13, 0x1

    invoke-direct/range {v7 .. v13}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "selectedActivityInternalName"

    invoke-virtual {v1, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "gpsTrackingEnabled"

    const-string v12, "INTEGER"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "gpsTrackingEnabled"

    invoke-virtual {v1, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "startTimeMs"

    const-string v13, "INTEGER"

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "startTimeMs"

    invoke-virtual {v1, v3, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "resumeNavigationJson"

    const-string v14, "TEXT"

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "resumeNavigationJson"

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "pauseSegmentsJson"

    const-string v15, "TEXT"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "pauseSegmentsJson"

    const/4 v5, 0x0

    invoke-static {v1, v3, v11, v5}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v6

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Lob/k;

    const-string v9, "active_activity_session_table"

    invoke-direct {v8, v9, v1, v6, v7}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v9, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "\n Found:\n"

    if-nez v6, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v2, "active_activity_session_table(com.whoop.activitysession.ActiveActivitySessionEntity).\n Expected:\n"

    invoke-static {v2, v8, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v5, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v6, 0x7

    invoke-direct {v1, v6}, Ljava/util/HashMap;-><init>(I)V

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x1

    const-string v11, "internal_name"

    const-string v12, "TEXT"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v9, "internal_name"

    invoke-virtual {v1, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "display_name"

    const-string v14, "TEXT"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v8, "display_name"

    invoke-virtual {v1, v8, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x0

    const-string v14, "icon_url"

    const-string v15, "TEXT"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v10, "icon_url"

    invoke-virtual {v1, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lob/h;

    const/16 v17, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    const-string v15, "deleted"

    const-string v16, "INTEGER"

    const/16 v18, 0x1

    invoke-direct/range {v12 .. v18}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v11, "deleted"

    invoke-virtual {v1, v11, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x0

    const-string v16, "category"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v12, "category"

    invoke-virtual {v1, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "score_type"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v13, "score_type"

    invoke-virtual {v1, v13, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "has_gps"

    const-string v19, "INTEGER"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v14, "has_gps"

    invoke-static {v1, v14, v15, v5}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v15

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Lob/k;

    const-string v5, "table_activities_list"

    invoke-direct {v2, v5, v1, v15, v6}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    new-instance v0, Landroidx/room/f1;

    const-string v3, "table_activities_list(com.whoop.addactivity.activitieslist.data.ActivityDto).\n Expected:\n"

    invoke-static {v3, v2, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v20, 0x1

    const-string v22, "id"

    const-string v23, "INTEGER"

    const/16 v25, 0x1

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v19

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v20, 0x0

    const-string v22, "responseJson"

    const-string v23, "TEXT"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v19

    const-string v6, "responseJson"

    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const-string v22, "lastUpdated"

    const-string v23, "INTEGER"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v19

    const-string v6, "lastUpdated"

    const/4 v15, 0x0

    invoke-static {v1, v6, v5, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v5

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v15, Lob/k;

    move-object/from16 v20, v14

    const-string v14, "app_configuration_cache_table"

    invoke-direct {v15, v14, v1, v5, v2}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v14, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v15, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v0, Landroidx/room/f1;

    const-string v2, "app_configuration_cache_table(com.whoop.appconfiguration.AppConfigurationCacheEntity).\n Expected:\n"

    invoke-static {v2, v15, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v21, Lob/h;

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v22, 0x1

    const-string v24, "configuration_key"

    const-string v25, "TEXT"

    const/16 v27, 0x1

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v21

    const-string v14, "configuration_key"

    invoke-virtual {v1, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v21, Lob/h;

    const/16 v22, 0x0

    const-string v24, "configuration_value"

    const-string v25, "TEXT"

    invoke-direct/range {v21 .. v27}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v21

    const-string v14, "configuration_value"

    const/4 v15, 0x0

    invoke-static {v1, v14, v5, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v5

    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Lob/k;

    const-string v15, "table_configurations"

    invoke-direct {v2, v15, v1, v5, v14}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v15, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    new-instance v0, Landroidx/room/f1;

    const-string v3, "table_configurations(com.whoop.data.local.room.entity.ConfigurationDto).\n Expected:\n"

    invoke-static {v3, v2, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v22, Lob/h;

    const/16 v27, 0x0

    const/16 v24, 0x1

    const/16 v23, 0x1

    const-string v25, "id"

    const-string v26, "INTEGER"

    const/16 v28, 0x1

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v22

    invoke-virtual {v1, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const/16 v23, 0x0

    const-string v25, "name"

    const-string v26, "TEXT"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v22

    const-string v14, "name"

    invoke-virtual {v1, v14, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const-string v25, "enabled"

    const-string v26, "INTEGER"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v22

    const-string v15, "enabled"

    invoke-virtual {v1, v15, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v22, Lob/h;

    const-string v25, "lastUpdated"

    const-string v26, "INTEGER"

    invoke-direct/range {v22 .. v28}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v5, v22

    const/4 v2, 0x0

    invoke-static {v1, v6, v5, v2}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v5

    move-object/from16 v23, v6

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v2, Lob/k;

    move-object/from16 v24, v15

    const-string v15, "entitlement_table"

    invoke-direct {v2, v15, v1, v5, v6}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v15, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    new-instance v0, Landroidx/room/f1;

    const-string v3, "entitlement_table(com.whoop.entitlements.EntitlementEntity).\n Expected:\n"

    invoke-static {v3, v2, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v25, Lob/h;

    const/16 v30, 0x0

    const/16 v27, 0x1

    const/16 v26, 0x1

    const-string v28, "zone_id"

    const-string v29, "TEXT"

    const/16 v31, 0x1

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    const-string v5, "zone_id"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const/16 v26, 0x0

    const-string v28, "min"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    const-string v5, "min"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v25, Lob/h;

    const-string v28, "max"

    const-string v29, "INTEGER"

    invoke-direct/range {v25 .. v31}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v25

    const-string v6, "max"

    const/4 v15, 0x0

    invoke-static {v1, v6, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    move-object/from16 v25, v6

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v15, Lob/k;

    move-object/from16 v26, v5

    const-string v5, "table_hr_zone_list"

    invoke-direct {v15, v5, v1, v2, v6}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v5, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v15, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_hr_zone_list(com.whoop.hrZones.db.HrZoneDto).\n Expected:\n"

    invoke-static {v2, v15, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v27, Lob/h;

    const/16 v32, 0x0

    const/16 v29, 0x1

    const/16 v33, 0x1

    const/16 v28, 0x1

    const-string v30, "campaign_id"

    const-string v31, "INTEGER"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v5, "campaign_id"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const/16 v28, 0x0

    const-string v30, "description"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "description"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "name"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    invoke-virtual {v1, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const/16 v33, 0x0

    const-string v30, "subtitle"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "subtitle"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "participation_cooldown_date"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "participation_cooldown_date"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "additional_collection_length"

    const-string v31, "INTEGER"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "additional_collection_length"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "bthr_additional_collection_length"

    const-string v31, "INTEGER"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "bthr_additional_collection_length"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "data_types"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "data_types"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "protocol_id"

    const-string v31, "INTEGER"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "protocol_id"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "protocol_name"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "protocol_name"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "pdf_url"

    const-string v31, "TEXT"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v6, "pdf_url"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v27, Lob/h;

    const-string v30, "campaign_session_id"

    const-string v31, "INTEGER"

    invoke-direct/range {v27 .. v33}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v27

    const-string v15, "campaign_session_id"

    move-object/from16 v27, v13

    const/4 v13, 0x0

    invoke-static {v1, v15, v2, v13}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    move-object/from16 v28, v12

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v13}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/k;

    move-object/from16 v29, v11

    const-string v11, "labs_campaign"

    invoke-direct {v13, v11, v1, v2, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v11, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v13, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    new-instance v0, Landroidx/room/f1;

    const-string v2, "labs_campaign(com.whoop.whooplabs.data.domain.LabsCampaign).\n Expected:\n"

    invoke-static {v2, v13, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v30, Lob/h;

    const/16 v35, 0x0

    const/16 v32, 0x1

    const/16 v31, 0x1

    const-string v33, "campaign_id"

    const-string v34, "INTEGER"

    const/16 v36, 0x1

    invoke-direct/range {v30 .. v36}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v30

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v30, Lob/h;

    const/16 v31, 0x2

    const-string v33, "legal_id"

    const-string v34, "INTEGER"

    invoke-direct/range {v30 .. v36}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v30

    const-string v11, "legal_id"

    const/4 v13, 0x0

    invoke-static {v1, v11, v2, v13}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v13}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/k;

    move-object/from16 v30, v10

    const-string v10, "legal_document_to_campaign"

    invoke-direct {v13, v10, v1, v2, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v10, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v13, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    new-instance v0, Landroidx/room/f1;

    const-string v2, "legal_document_to_campaign(com.whoop.whooplabs.data.room.entity.LabsCampaignToLegalDocumentCrossRef).\n Expected:\n"

    invoke-static {v2, v13, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_7
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v31, Lob/h;

    const/16 v36, 0x0

    const/16 v33, 0x1

    const/16 v32, 0x1

    const-string v34, "campaign_session_id"

    const-string v35, "INTEGER"

    const/16 v37, 0x1

    invoke-direct/range {v31 .. v37}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v31

    const/4 v13, 0x0

    invoke-static {v1, v15, v10, v13}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v13}, Ljava/util/HashSet;-><init>(I)V

    new-instance v15, Lob/k;

    const-string v2, "whoop_labs_session"

    invoke-direct {v15, v2, v1, v10, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v2, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v15, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_session(com.whoop.whooplabs.data.domain.LabsSession).\n Expected:\n"

    invoke-static {v2, v15, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v13, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_8
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "whoop_strap_id"

    const-string v36, "TEXT"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v32

    const-string v12, "whoop_strap_id"

    invoke-virtual {v1, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "hardware_version"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v32

    const-string v12, "hardware_version"

    invoke-virtual {v1, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "firmware_version"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v32

    const-string v12, "firmware_version"

    invoke-virtual {v1, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "bluetooth_version"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v32

    const-string v12, "bluetooth_version"

    invoke-virtual {v1, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "sig_proc_version"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v10, v32

    const-string v12, "sig_proc_version"

    const/4 v15, 0x0

    invoke-static {v1, v12, v10, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v10

    new-instance v12, Ljava/util/HashSet;

    invoke-direct {v12, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/k;

    const-string v2, "whoop_labs_strap_info"

    invoke-direct {v13, v2, v1, v10, v12}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v2, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v13, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_strap_info(com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo).\n Expected:\n"

    invoke-static {v2, v13, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_9
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v33, Lob/h;

    const/16 v38, 0x0

    const/16 v35, 0x1

    const/16 v34, 0x1

    const-string v36, "legal_id"

    const-string v37, "INTEGER"

    const/16 v39, 0x1

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v33, Lob/h;

    const/16 v34, 0x0

    const-string v36, "name"

    const-string v37, "TEXT"

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    invoke-virtual {v1, v14, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v33, Lob/h;

    const-string v36, "pdf_url"

    const-string v37, "TEXT"

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v33, Lob/h;

    const-string v36, "pdf_file_name"

    const-string v37, "TEXT"

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    const-string v6, "pdf_file_name"

    const/4 v15, 0x0

    invoke-static {v1, v6, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "whoop_labs_legal_ducment"

    invoke-direct {v11, v12, v1, v2, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_legal_ducment(com.whoop.whooplabs.data.domain.LegalDocument).\n Expected:\n"

    invoke-static {v2, v11, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_a
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v33, Lob/h;

    const/16 v38, 0x0

    const/16 v35, 0x1

    const/16 v34, 0x1

    const-string v36, "type"

    const-string v37, "TEXT"

    const/16 v39, 0x1

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    const-string v10, "type"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v33, Lob/h;

    const-string v38, "0"

    const/16 v34, 0x0

    const-string v36, "isCompleted"

    const-string v37, "INTEGER"

    invoke-direct/range {v33 .. v39}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v33

    const-string v10, "isCompleted"

    const/4 v15, 0x0

    invoke-static {v1, v10, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "table_onboarding_status"

    invoke-direct {v11, v12, v1, v2, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_onboarding_status(com.whoop.data.onboarding.OnboardingStatus).\n Expected:\n"

    invoke-static {v2, v11, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_b
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "recovery"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "recovery"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "lower_optimal_strain"

    const-string v36, "REAL"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "lower_optimal_strain"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "optimal_strain"

    const-string v36, "REAL"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "optimal_strain"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "upper_optimal_strain"

    const-string v36, "REAL"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "upper_optimal_strain"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "cycle_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "cycle_id"

    const/4 v15, 0x0

    invoke-static {v1, v10, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "optimal_strain_mapping_table"

    invoke-direct {v11, v12, v1, v2, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "optimal_strain_mapping_table"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    new-instance v0, Landroidx/room/f1;

    const-string v2, "optimal_strain_mapping_table(com.whoop.data.local.room.entity.OptimalStrainMapping).\n Expected:\n"

    invoke-static {v2, v11, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_c
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "id"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "activityInternalName"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "activityInternalName"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "garmentId"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "garmentId"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "startTime"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "startTime"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "endTime"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "endTime"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "gpsEnabled"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "gpsEnabled"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "queuedAtMs"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "queuedAtMs"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "pauseSegmentsJson"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const/4 v15, 0x0

    invoke-static {v1, v3, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Lob/k;

    const-string v11, "pending_activity_save_table"

    invoke-direct {v10, v11, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "pending_activity_save_table"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v10, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    new-instance v0, Landroidx/room/f1;

    const-string v2, "pending_activity_save_table(com.whoop.trackactivity.pendingsave.PendingActivitySaveEntity).\n Expected:\n"

    invoke-static {v2, v10, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_d
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x2f

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x1

    const-string v35, "campaign_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x2

    const-string v35, "step_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v3, "step_id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const/16 v33, 0x0

    const-string v35, "text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "step_order"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "step_order"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "typeform_url"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "typeform_url"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "image_url"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "image_url"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "image_alt"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "image_alt"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "is_bp"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "is_bp"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "is_timer_active"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "is_timer_active"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "is_bthr"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "is_bthr"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "title"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "title"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "sub_title"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "sub_title"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "cta"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "cta"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "typeform_title"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "typeform_title"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_label"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_label"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_too_low_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_too_low_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_too_high_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_too_high_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_required_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_required_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_max"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_max"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_min"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_min"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_suffix"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_suffix"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic_required"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "systolic_required"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_label"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_label"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_too_low_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_too_low_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_too_high_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_too_high_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_required_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_required_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_max"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_max"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_min"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_min"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_suffix"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_suffix"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic_required"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "diastolic_required"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_label"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_label"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_too_low_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_too_low_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_too_high_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_too_high_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_required_text"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_required_text"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_max"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_max"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_min"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_min"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_suffix"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_suffix"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate_required"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "heart_rate_required"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "input_type"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "input_type"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "input_required"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "input_required"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "required_regex"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "required_regex"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "blocked_regex"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "blocked_regex"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "countdown_timer_required"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "countdown_timer_required"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "countdown_timer_seconds"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "countdown_timer_seconds"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "survey_form_id"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "survey_form_id"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "survey_vendor_metadata"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "survey_vendor_metadata"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "survey_provider"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "survey_provider"

    const/4 v15, 0x0

    invoke-static {v1, v10, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Lob/k;

    const-string v12, "protocol_step"

    invoke-direct {v11, v12, v1, v2, v10}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v12, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v11, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    new-instance v0, Landroidx/room/f1;

    const-string v2, "protocol_step(com.whoop.whooplabs.data.domain.ProtocolStep).\n Expected:\n"

    invoke-static {v2, v11, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_e
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x1

    const-string v35, "campaign_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x2

    const-string v35, "result_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "result_id"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "step_order"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "step_order"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "start_timestamp"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "start_timestamp"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "end_timestamp"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "end_timestamp"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "typeform_submitted"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "typeform_submitted"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "text_option"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "text_option"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "number_input"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "number_input"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "text_input"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "text_input"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "timestamp_input"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "timestamp_input"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "timestamp"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v10, "timestamp"

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "systolic"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v11, "systolic"

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "diastolic"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v11, "diastolic"

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "heart_rate"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v11, "heart_rate"

    const/4 v15, 0x0

    invoke-static {v1, v11, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Lob/k;

    const-string v14, "whoop_labs_protocol_step_result"

    invoke-direct {v13, v14, v1, v2, v11}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_protocol_step_result"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v13, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_protocol_step_result(com.whoop.whooplabs.data.room.entity.ProtocolStepResult).\n Expected:\n"

    invoke-static {v2, v13, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_f
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "internal_name"

    const-string v36, "TEXT"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "display_name"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "icon_url"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v30

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "deleted"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v29

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "category"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v28

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "score_type"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v27

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "has_gps"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v20

    move-object/from16 v2, v32

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "table_recent_activities"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "table_recent_activities"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_recent_activities(com.whoop.addactivity.activitieslist.data.RecentActivityDto).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_10
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x1

    const-string v35, "user_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "user_id"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "window_minutes"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "window_minutes"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "upper_time_bound"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "upper_time_bound"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "last_triggered_at"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "last_triggered_at"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "sleep_score_goal"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "sleep_score_goal"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "recovery_score_goal"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "recovery_score_goal"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v37, "\'EXACT_TIME_PEAK\'"

    const/16 v38, 0x1

    const-string v35, "goal"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "goal"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v37, "0"

    const-string v35, "enabled"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v8, v24

    move-object/from16 v2, v32

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const-string v35, "last_updated_at"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "last_updated_at"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v37, "0"

    const-string v35, "schedule_enabled"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "schedule_enabled"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-string v35, "day_of_week"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "day_of_week"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v37, "0"

    const/16 v38, 0x1

    const-string v35, "enrolled_weekly_plan"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "enrolled_weekly_plan"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-string v35, "weekly_plan_goal"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "weekly_plan_goal"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "time_zone_offset"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "time_zone_offset"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "alarm_bounds"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "alarm_bounds"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "weekly_plan_hour_goal"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "weekly_plan_hour_goal"

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "smart_alarm_user_info_table"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "smart_alarm_user_info_table"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    new-instance v0, Landroidx/room/f1;

    const-string v2, "smart_alarm_user_info_table(com.whoop.data.local.room.entity.SmartAlarmUserInfo).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_11
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "composite_id"

    const-string v36, "TEXT"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "composite_id"

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "table_smart_alarm_triggered"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "table_smart_alarm_triggered"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_smart_alarm_triggered(com.whoop.smart.alarm.data.room.entity.SmartAlarmUserInfoCompositeId).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_12
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x1

    const-string v35, "id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "created_at"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "created_at"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "first_name"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "first_name"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "last_name"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "last_name"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "full_name"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "full_name"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "email_address"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "email_address"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "password"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "password"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "username"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "username"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "avatar_url"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "avatar_url"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "city"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "city"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "admin_division"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "admin_division"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "country"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "country"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v37, "0"

    const-string v35, "concealed"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "concealed"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const-string v35, "age"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "age"

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "table_user"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "table_user"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_user(com.whoop.service.store.user.dao.UserEntity).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_13
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v38, 0x1

    const/16 v33, 0x1

    const-string v35, "id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "gender"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "gender"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "height"

    const-string v36, "REAL"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "height"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "weight"

    const-string v36, "REAL"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "weight"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "birthday"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "birthday"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "time_zone_offset"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "time_zone_offset"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "unit_system"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "unit_system"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "fitness_level"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "fitness_level"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "max_heart_rate"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "max_heart_rate"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "min_heart_rate"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "min_heart_rate"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x0

    const-string v35, "physiological_baseline"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "physiological_baseline"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v38, 0x1

    const-string v35, "can_upload_data"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "can_upload_data"

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "table_user_profile"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "table_user_profile"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    new-instance v0, Landroidx/room/f1;

    const-string v2, "table_user_profile(com.whoop.service.store.user.dao.UserProfileEntity).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_14
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "hr_device_id"

    const-string v36, "TEXT"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "hr_device_id"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "device_name"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "device_name"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "hr_file_path"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "hr_file_path"

    const/4 v15, 0x0

    invoke-static {v1, v8, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, Lob/k;

    const-string v11, "whoop_labs_hr_device"

    invoke-direct {v9, v11, v1, v2, v8}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_hr_device"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v9, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_hr_device(com.whoop.whooplabs.data.room.entity.WhoopLabsHrDevice).\n Expected:\n"

    invoke-static {v2, v9, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_15
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "study_id"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "study_id"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "start_time"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "start_time"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "end_time"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "end_time"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "hr_device_connected"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "hr_device_connected"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "status"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v8, "status"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "campaign_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "pdf_file_name"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "protocol_step"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "protocol_completed"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v6, "protocol_completed"

    const/4 v15, 0x0

    invoke-static {v1, v6, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Lob/k;

    const-string v9, "whoop_labs_study"

    invoke-direct {v8, v9, v1, v2, v6}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_study"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v8, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_study(com.whoop.whooplabs.data.room.entity.WhoopLabsStudy).\n Expected:\n"

    invoke-static {v2, v8, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_16
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x0

    const-string v35, "timestamp"

    const-string v36, "TEXT"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "note"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v6, "note"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "campaign_id"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x1

    const-string v35, "tag_id"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v5, "tag_id"

    const/4 v15, 0x0

    invoke-static {v1, v5, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Lob/k;

    const-string v8, "whoop_labs_study_tag"

    invoke-direct {v6, v8, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_study_tag"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_study_tag(com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag).\n Expected:\n"

    invoke-static {v2, v6, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_17
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "step_id"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "option_order"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v5, "option_order"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x2

    const-string v35, "option_key"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v5, "option_key"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "option_value"

    const-string v36, "TEXT"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v5, "option_value"

    const/4 v15, 0x0

    invoke-static {v1, v5, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Lob/k;

    const-string v8, "whoop_labs_input_option"

    invoke-direct {v6, v8, v1, v2, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_input_option"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_input_option(com.whoop.whooplabs.data.domain.OptionSelection).\n Expected:\n"

    invoke-static {v2, v6, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_18
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v32, Lob/h;

    const/16 v37, 0x0

    const/16 v34, 0x1

    const/16 v33, 0x1

    const-string v35, "step_id"

    const-string v36, "INTEGER"

    const/16 v38, 0x1

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const/16 v33, 0x0

    const-string v35, "input_label"

    const-string v36, "TEXT"

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v32

    const-string v3, "input_label"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "min"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v26

    move-object/from16 v2, v32

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v32, Lob/h;

    const-string v35, "max"

    const-string v36, "INTEGER"

    invoke-direct/range {v32 .. v38}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v25

    move-object/from16 v2, v32

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v25, 0x0

    const-string v27, "min_error_text"

    const-string v28, "TEXT"

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "min_error_text"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "max_error_text"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "max_error_text"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "hint"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "hint"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "row_count"

    const-string v28, "INTEGER"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "row_count"

    const/4 v15, 0x0

    invoke-static {v1, v3, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Lob/k;

    const-string v6, "whoop_labs_protocol_step_config"

    invoke-direct {v5, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "whoop_labs_protocol_step_config"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    new-instance v0, Landroidx/room/f1;

    const-string v2, "whoop_labs_protocol_step_config(com.whoop.whooplabs.data.domain.ProtocolStepConfig).\n Expected:\n"

    invoke-static {v2, v5, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_19
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v24, Lob/h;

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v25, 0x1

    const-string v27, "timestamp"

    const-string v28, "INTEGER"

    const/16 v30, 0x1

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const/16 v25, 0x0

    const-string v27, "latitude"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "latitude"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "longitude"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "longitude"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "altitude"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "altitude"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "horizontal_accuracy_meters"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "horizontal_accuracy_meters"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "vertical_accuracy_meters"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "vertical_accuracy_meters"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "speed_value"

    const-string v28, "REAL"

    const/16 v30, 0x0

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "speed_value"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "speed_unit"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "speed_unit"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "speed_accuracy"

    const-string v28, "REAL"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "speed_accuracy"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "trigger"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "trigger"

    const/4 v15, 0x0

    invoke-static {v1, v3, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Lob/j;

    filled-new-array {v10}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v8, "ASC"

    filled-new-array {v8}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v9, "index_gps_locations_timestamp"

    invoke-direct {v5, v9, v6, v8, v15}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v5, Lob/k;

    const-string v6, "gps_locations"

    invoke-direct {v5, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "gps_locations"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v5, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    new-instance v0, Landroidx/room/f1;

    const-string v2, "gps_locations(com.whoop.gps.data.entity.GpsLocationDto).\n Expected:\n"

    invoke-static {v2, v5, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    const/4 v15, 0x0

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1a
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v24, Lob/h;

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v25, 0x1

    const-string v27, "id"

    const-string v28, "INTEGER"

    const/16 v30, 0x1

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const/16 v25, 0x0

    const-string v27, "membershipType"

    const-string v28, "TEXT"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v24

    const-string v3, "membershipType"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v24, Lob/h;

    const-string v27, "lastUpdated"

    const-string v28, "INTEGER"

    invoke-direct/range {v24 .. v30}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v3, v23

    move-object/from16 v2, v24

    const/4 v15, 0x0

    invoke-static {v1, v3, v2, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v15}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/k;

    const-string v5, "membership_type_table"

    invoke-direct {v4, v5, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "membership_type_table"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    new-instance v0, Landroidx/room/f1;

    const-string v2, "membership_type_table(com.whoop.entitlements.MembershipTypeEntity).\n Expected:\n"

    invoke-static {v2, v4, v7, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v15, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1b
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v11, Lob/h;

    const/16 v16, 0x0

    const/4 v13, 0x1

    const/4 v12, 0x1

    const-string v14, "sessionStartTimeMs"

    const-string v15, "INTEGER"

    const/16 v17, 0x1

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "sessionStartTimeMs"

    invoke-virtual {v1, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v24, 0x0

    const/16 v21, 0x1

    const/16 v20, 0x2

    const-string v22, "timestamp"

    const-string v23, "INTEGER"

    const/16 v25, 0x1

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v11, Lob/h;

    const/4 v12, 0x0

    const-string v14, "latitude"

    const-string v15, "REAL"

    invoke-direct/range {v11 .. v17}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "latitude"

    invoke-virtual {v1, v2, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v19, Lob/h;

    const/16 v20, 0x0

    const-string v22, "longitude"

    const-string v23, "REAL"

    invoke-direct/range {v19 .. v25}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v19

    const-string v3, "longitude"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v8, Lob/h;

    const/4 v13, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    const-string v11, "altitude"

    const-string v12, "REAL"

    const/4 v14, 0x1

    invoke-direct/range {v8 .. v14}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "altitude"

    invoke-virtual {v1, v2, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v9, Lob/h;

    const/4 v14, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    const-string v12, "horizontal_accuracy_meters"

    const-string v13, "REAL"

    const/4 v15, 0x1

    invoke-direct/range {v9 .. v15}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "horizontal_accuracy_meters"

    invoke-virtual {v1, v2, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Lob/h;

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x0

    const-string v13, "vertical_accuracy_meters"

    const-string v14, "REAL"

    const/16 v16, 0x1

    invoke-direct/range {v10 .. v16}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "vertical_accuracy_meters"

    const/4 v15, 0x0

    invoke-static {v1, v2, v10, v15}, Lvl/b;->o(Ljava/util/HashMap;Ljava/lang/String;Lob/h;I)Ljava/util/HashSet;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Lob/j;

    const-string v5, "sessionStartTimeMs"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v6, "ASC"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v8, "index_foreground_gps_route_points_sessionStartTimeMs"

    invoke-direct {v4, v8, v5, v6, v15}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v4, Lob/k;

    const-string v5, "foreground_gps_route_points"

    invoke-direct {v4, v5, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    const-string v1, "foreground_gps_route_points"

    invoke-static {v1, v0}, Lob/k;->a(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v4, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    new-instance v1, Landroidx/room/f1;

    const-string v2, "foreground_gps_route_points(com.whoop.gps.foreground.data.entity.ForegroundGpsRoutePointEntity).\n Expected:\n"

    invoke-static {v2, v4, v7, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    const/4 v15, 0x0

    invoke-direct {v1, v15, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_1c
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x0

    const/4 v5, 0x1

    invoke-direct {v0, v5, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
