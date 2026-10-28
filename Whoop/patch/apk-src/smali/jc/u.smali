.class public final Ljc/u;
.super Landroidx/room/g1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    iput-object p1, p0, Ljc/u;->a:Landroidx/work/impl/WorkDatabase_Impl;

    const-string p1, "08b926448d86528e697981ddd30459f7"

    const-string v0, "149fd8ad55885d3fe3549a37a0163243"

    const/16 v1, 0x18

    invoke-direct {p0, v1, p1, v0}, Landroidx/room/g1;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final createAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x\'\', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'08b926448d86528e697981ddd30459f7\')"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final dropAllTables(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `Dependency`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `WorkSpec`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `WorkTag`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `SystemIdInfo`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `WorkName`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `WorkProgress`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    const-string v0, "DROP TABLE IF EXISTS `Preference`"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    return-void
.end method

.method public final onCreate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onOpen(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "PRAGMA foreign_keys = ON"

    invoke-static {v0, p1}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    iget-object v0, p0, Ljc/u;->a:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-virtual {v0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method

.method public final onPostMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final onPreMigrate(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lse/a;->I(Ltb/a;)V

    return-void
.end method

.method public final onValidateSchema(Ltb/a;)Landroidx/room/f1;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "connection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Lob/h;

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x1

    const-string v5, "work_spec_id"

    const-string v6, "TEXT"

    const/4 v8, 0x1

    invoke-direct/range {v2 .. v8}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v3, "work_spec_id"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lob/h;

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x2

    const-string v7, "prerequisite_id"

    const-string v8, "TEXT"

    const/4 v10, 0x1

    invoke-direct/range {v4 .. v10}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "prerequisite_id"

    invoke-static {v1, v2, v4}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v4

    new-instance v5, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v11, "id"

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v6, "WorkSpec"

    const-string v7, "CASCADE"

    const-string v9, "CASCADE"

    invoke-direct/range {v5 .. v10}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v12, Lob/i;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-string v13, "WorkSpec"

    const-string v14, "CASCADE"

    const-string v16, "CASCADE"

    invoke-direct/range {v12 .. v17}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v4, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "ASC"

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v10, "index_Dependency_work_spec_id"

    const/4 v12, 0x0

    invoke-direct {v6, v10, v7, v9, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v6, Lob/j;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v9, "index_Dependency_prerequisite_id"

    invoke-direct {v6, v9, v2, v7, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v5, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lob/k;

    const-string v6, "Dependency"

    invoke-direct {v2, v6, v1, v4, v5}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "\n Found:\n"

    if-nez v4, :cond_0

    new-instance v0, Landroidx/room/f1;

    const-string v3, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"

    invoke-static {v3, v2, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x1

    const-string v16, "id"

    const-string v17, "TEXT"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v11, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "state"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "state"

    invoke-interface {v1, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "worker_class_name"

    const-string v19, "TEXT"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "worker_class_name"

    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x1

    const/16 v17, 0x0

    const-string v19, "input_merger_class_name"

    const-string v20, "TEXT"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v16

    const-string v4, "input_merger_class_name"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "input"

    const-string v17, "BLOB"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "input"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "output"

    const-string v18, "BLOB"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "output"

    invoke-interface {v1, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "initial_delay"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "initial_delay"

    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "interval_duration"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v16

    const-string v4, "interval_duration"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "flex_duration"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "flex_duration"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "run_attempt_count"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "run_attempt_count"

    invoke-interface {v1, v2, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "backoff_policy"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "backoff_policy"

    invoke-interface {v1, v2, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "backoff_delay_duration"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v2, v16

    const-string v4, "backoff_delay_duration"

    invoke-interface {v1, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const-string v18, "-1"

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "last_enqueue_time"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "last_enqueue_time"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "minimum_retention_duration"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "minimum_retention_duration"

    invoke-interface {v1, v4, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "schedule_requested_at"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v4, "schedule_requested_at"

    invoke-interface {v1, v4, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "run_in_foreground"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v6, v16

    const-string v7, "run_in_foreground"

    invoke-interface {v1, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "out_of_quota_policy"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v6, "out_of_quota_policy"

    invoke-interface {v1, v6, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const-string v19, "0"

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "period_count"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v6, "period_count"

    invoke-interface {v1, v6, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const-string v20, "0"

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "generation"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v6, "generation"

    invoke-interface {v1, v6, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const-string v21, "9223372036854775807"

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "next_schedule_time_override"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v9, "next_schedule_time_override"

    invoke-interface {v1, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const-string v18, "0"

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "next_schedule_time_override_generation"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "next_schedule_time_override_generation"

    invoke-interface {v1, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const-string v19, "-256"

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "stop_reason"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "stop_reason"

    invoke-interface {v1, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x0

    const/16 v16, 0x0

    const-string v18, "trace_tag"

    const-string v19, "TEXT"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "trace_tag"

    invoke-interface {v1, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x0

    const/16 v17, 0x0

    const-string v19, "backoff_on_system_interruptions"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v9, "backoff_on_system_interruptions"

    invoke-interface {v1, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "required_network_type"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "required_network_type"

    invoke-interface {v1, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const-string v19, "x\'\'"

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "required_network_request"

    const-string v18, "BLOB"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "required_network_request"

    invoke-interface {v1, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "requires_charging"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "requires_charging"

    invoke-interface {v1, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v22, 0x1

    const/16 v17, 0x0

    const-string v19, "requires_device_idle"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v9, "requires_device_idle"

    invoke-interface {v1, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "requires_battery_not_low"

    const-string v17, "INTEGER"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "requires_battery_not_low"

    invoke-interface {v1, v7, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v20, 0x1

    const/4 v15, 0x0

    const-string v17, "requires_storage_not_low"

    const-string v18, "INTEGER"

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "requires_storage_not_low"

    invoke-interface {v1, v7, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v21, 0x1

    const/16 v16, 0x0

    const-string v18, "trigger_content_update_delay"

    const-string v19, "INTEGER"

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "trigger_content_update_delay"

    invoke-interface {v1, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v16, Lob/h;

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v17, 0x0

    const-string v19, "trigger_max_content_delay"

    const-string v20, "INTEGER"

    invoke-direct/range {v16 .. v22}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object/from16 v7, v16

    const-string v9, "trigger_max_content_delay"

    invoke-interface {v1, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/16 v19, 0x1

    const/4 v14, 0x0

    const-string v16, "content_uri_triggers"

    const-string v17, "BLOB"

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v7, "content_uri_triggers"

    invoke-static {v1, v7, v13}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v7

    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v10, Lob/j;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v14, "index_WorkSpec_schedule_requested_at"

    invoke-direct {v10, v14, v4, v13, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Lob/j;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v13, "index_WorkSpec_last_enqueue_time"

    invoke-direct {v4, v13, v2, v10, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v9, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v2, Lob/k;

    const-string v4, "WorkSpec"

    invoke-direct {v2, v4, v1, v7, v9}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v4, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v2, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v0, Landroidx/room/f1;

    const-string v3, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"

    invoke-static {v3, v2, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x1

    const-string v16, "tag"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "tag"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x2

    const-string v17, "work_spec_id"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v3, v14}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v13, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v17, "CASCADE"

    invoke-direct/range {v13 .. v18}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v7, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const-string v13, "index_WorkTag_work_spec_id"

    invoke-direct {v7, v13, v9, v10, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v7, Lob/k;

    const-string v9, "WorkTag"

    invoke-direct {v7, v9, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v9, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v7, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    new-instance v0, Landroidx/room/f1;

    const-string v2, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"

    invoke-static {v2, v7, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x1

    const-string v16, "work_spec_id"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v3, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const-string v19, "0"

    const/16 v16, 0x1

    const/4 v15, 0x2

    const-string v17, "generation"

    const-string v18, "INTEGER"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v6, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lob/h;

    const/16 v20, 0x0

    const/16 v17, 0x1

    const/16 v16, 0x0

    const-string v18, "system_id"

    const-string v19, "INTEGER"

    const/16 v21, 0x1

    invoke-direct/range {v15 .. v21}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "system_id"

    invoke-static {v1, v2, v15}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v13, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v17, "CASCADE"

    invoke-direct/range {v13 .. v18}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Lob/k;

    const-string v7, "SystemIdInfo"

    invoke-direct {v6, v7, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v7, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v0, Landroidx/room/f1;

    const-string v2, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"

    invoke-static {v2, v6, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x1

    const-string v16, "name"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "name"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x2

    const-string v17, "work_spec_id"

    const-string v18, "TEXT"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-static {v1, v3, v14}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v13, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v17, "CASCADE"

    invoke-direct/range {v13 .. v18}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v6, Lob/j;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v8}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v9, "index_WorkName_work_spec_id"

    invoke-direct {v6, v9, v7, v8, v12}, Lob/j;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V

    invoke-interface {v4, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v6, Lob/k;

    const-string v7, "WorkName"

    invoke-direct {v6, v7, v1, v2, v4}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v7, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v6, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v0, Landroidx/room/f1;

    const-string v2, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"

    invoke-static {v2, v6, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x1

    const-string v16, "work_spec_id"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v1, v3, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "progress"

    const-string v18, "BLOB"

    const/16 v20, 0x1

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "progress"

    invoke-static {v1, v2, v14}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v13, Lob/i;

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-static {v11}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v17, "CASCADE"

    invoke-direct/range {v13 .. v18}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v2, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v4, Lob/k;

    const-string v6, "WorkProgress"

    invoke-direct {v4, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v1

    invoke-virtual {v4, v1}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v0, Landroidx/room/f1;

    const-string v2, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"

    invoke-static {v2, v4, v5, v1}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_5
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v13, Lob/h;

    const/16 v18, 0x0

    const/4 v15, 0x1

    const/4 v14, 0x1

    const-string v16, "key"

    const-string v17, "TEXT"

    const/16 v19, 0x1

    invoke-direct/range {v13 .. v19}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "key"

    invoke-interface {v1, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, Lob/h;

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/4 v15, 0x0

    const-string v17, "long_value"

    const-string v18, "INTEGER"

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v20}, Lob/h;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const-string v2, "long_value"

    invoke-static {v1, v2, v14}, Lhc3/i;->i(Ljava/util/LinkedHashMap;Ljava/lang/String;Lob/h;)Ljava/util/LinkedHashSet;

    move-result-object v2

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v4, Lob/k;

    const-string v6, "Preference"

    invoke-direct {v4, v6, v1, v2, v3}, Lob/k;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    invoke-static {v6, v0}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object v0

    invoke-virtual {v4, v0}, Lob/k;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    new-instance v1, Landroidx/room/f1;

    const-string v2, "Preference(androidx.work.impl.model.Preference).\n Expected:\n"

    invoke-static {v2, v4, v5, v0}, Lhc3/i;->g(Ljava/lang/String;Lob/k;Ljava/lang/String;Lob/k;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v12, v0}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_6
    new-instance v0, Landroidx/room/f1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/room/f1;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
