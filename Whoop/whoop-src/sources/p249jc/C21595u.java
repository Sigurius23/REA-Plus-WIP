package p249jc;

import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.work.impl.WorkDatabase_Impl;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p363ob.C27785h;
import p363ob.C27786i;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32410a;
import se.AbstractC32417h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jc.u */
/* JADX INFO: loaded from: classes.dex */
public final class C21595u extends AbstractC1788g1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WorkDatabase_Impl f82801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21595u(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.f82801a = workDatabase_Impl;
    }

    @Override // androidx.room.AbstractC1788g1
    public final void createAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))", connection);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", connection);
        AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void dropAllTables(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `Dependency`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `WorkSpec`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `WorkTag`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `SystemIdInfo`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `WorkName`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `WorkProgress`", connection);
        AbstractC17269i.m48864K("DROP TABLE IF EXISTS `Preference`", connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onCreate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onOpen(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC17269i.m48864K("PRAGMA foreign_keys = ON", connection);
        this.f82801a.internalInitInvalidationTracker(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPostMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
    }

    @Override // androidx.room.AbstractC1788g1
    public final void onPreMigrate(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        AbstractC32410a.m101001I(connection);
    }

    @Override // androidx.room.AbstractC1788g1
    public final C1784f1 onValidateSchema(InterfaceC33687a connection) {
        AbstractC22676k.m65750j(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new C27785h(1, 1, "work_spec_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSetM48507i = AbstractC17176i.m48507i(linkedHashMap, "prerequisite_id", new C27785h(2, 1, "prerequisite_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashSetM48507i.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("work_spec_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        linkedHashSetM48507i.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("prerequisite_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new C27787j("index_Dependency_work_spec_id", AbstractC37056f.m118958J("work_spec_id"), AbstractC37056f.m118958J("ASC"), false));
        linkedHashSet.add(new C27787j("index_Dependency_prerequisite_id", AbstractC37056f.m118958J("prerequisite_id"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k = new C27788k("Dependency", linkedHashMap, linkedHashSetM48507i, linkedHashSet);
        C27788k c27788kM101188S = AbstractC32417h.m101188S("Dependency", connection);
        if (!c27788k.equals(c27788kM101188S)) {
            return new C1784f1(false, AbstractC17176i.m48505g("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", c27788k, "\n Found:\n", c27788kM101188S));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new C27785h(1, 1, "id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("state", new C27785h(0, 1, "state", "INTEGER", null, true));
        linkedHashMap2.put("worker_class_name", new C27785h(0, 1, "worker_class_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("input_merger_class_name", new C27785h(0, 1, "input_merger_class_name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap2.put("input", new C27785h(0, 1, "input", "BLOB", null, true));
        linkedHashMap2.put("output", new C27785h(0, 1, "output", "BLOB", null, true));
        linkedHashMap2.put("initial_delay", new C27785h(0, 1, "initial_delay", "INTEGER", null, true));
        linkedHashMap2.put("interval_duration", new C27785h(0, 1, "interval_duration", "INTEGER", null, true));
        linkedHashMap2.put("flex_duration", new C27785h(0, 1, "flex_duration", "INTEGER", null, true));
        linkedHashMap2.put("run_attempt_count", new C27785h(0, 1, "run_attempt_count", "INTEGER", null, true));
        linkedHashMap2.put("backoff_policy", new C27785h(0, 1, "backoff_policy", "INTEGER", null, true));
        linkedHashMap2.put("backoff_delay_duration", new C27785h(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        linkedHashMap2.put("last_enqueue_time", new C27785h(0, 1, "last_enqueue_time", "INTEGER", WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID, true));
        linkedHashMap2.put("minimum_retention_duration", new C27785h(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        linkedHashMap2.put("schedule_requested_at", new C27785h(0, 1, "schedule_requested_at", "INTEGER", null, true));
        linkedHashMap2.put("run_in_foreground", new C27785h(0, 1, "run_in_foreground", "INTEGER", null, true));
        linkedHashMap2.put("out_of_quota_policy", new C27785h(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        linkedHashMap2.put("period_count", new C27785h(0, 1, "period_count", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
        linkedHashMap2.put("generation", new C27785h(0, 1, "generation", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
        linkedHashMap2.put("next_schedule_time_override", new C27785h(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        linkedHashMap2.put("next_schedule_time_override_generation", new C27785h(0, 1, "next_schedule_time_override_generation", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
        linkedHashMap2.put("stop_reason", new C27785h(0, 1, "stop_reason", "INTEGER", "-256", true));
        linkedHashMap2.put("trace_tag", new C27785h(0, 1, "trace_tag", ShippingAddressField.TEXT_FIELD_TYPE, null, false));
        linkedHashMap2.put("backoff_on_system_interruptions", new C27785h(0, 1, "backoff_on_system_interruptions", "INTEGER", null, false));
        linkedHashMap2.put("required_network_type", new C27785h(0, 1, "required_network_type", "INTEGER", null, true));
        linkedHashMap2.put("required_network_request", new C27785h(0, 1, "required_network_request", "BLOB", "x''", true));
        linkedHashMap2.put("requires_charging", new C27785h(0, 1, "requires_charging", "INTEGER", null, true));
        linkedHashMap2.put("requires_device_idle", new C27785h(0, 1, "requires_device_idle", "INTEGER", null, true));
        linkedHashMap2.put("requires_battery_not_low", new C27785h(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        linkedHashMap2.put("requires_storage_not_low", new C27785h(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        linkedHashMap2.put("trigger_content_update_delay", new C27785h(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        linkedHashMap2.put("trigger_max_content_delay", new C27785h(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        LinkedHashSet linkedHashSetM48507i2 = AbstractC17176i.m48507i(linkedHashMap2, "content_uri_triggers", new C27785h(0, 1, "content_uri_triggers", "BLOB", null, true));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C27787j("index_WorkSpec_schedule_requested_at", AbstractC37056f.m118958J("schedule_requested_at"), AbstractC37056f.m118958J("ASC"), false));
        linkedHashSet2.add(new C27787j("index_WorkSpec_last_enqueue_time", AbstractC37056f.m118958J("last_enqueue_time"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k2 = new C27788k("WorkSpec", linkedHashMap2, linkedHashSetM48507i2, linkedHashSet2);
        C27788k c27788kM101188S2 = AbstractC32417h.m101188S("WorkSpec", connection);
        if (!c27788k2.equals(c27788kM101188S2)) {
            return new C1784f1(false, AbstractC17176i.m48505g("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM101188S2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new C27785h(1, 1, "tag", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSetM48507i3 = AbstractC17176i.m48507i(linkedHashMap3, "work_spec_id", new C27785h(2, 1, "work_spec_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashSetM48507i3.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("work_spec_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new C27787j("index_WorkTag_work_spec_id", AbstractC37056f.m118958J("work_spec_id"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k3 = new C27788k("WorkTag", linkedHashMap3, linkedHashSetM48507i3, linkedHashSet3);
        C27788k c27788kM101188S3 = AbstractC32417h.m101188S("WorkTag", connection);
        if (!c27788k3.equals(c27788kM101188S3)) {
            return new C1784f1(false, AbstractC17176i.m48505g("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", c27788k3, "\n Found:\n", c27788kM101188S3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new C27785h(1, 1, "work_spec_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashMap4.put("generation", new C27785h(2, 1, "generation", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
        LinkedHashSet linkedHashSetM48507i4 = AbstractC17176i.m48507i(linkedHashMap4, "system_id", new C27785h(0, 1, "system_id", "INTEGER", null, true));
        linkedHashSetM48507i4.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("work_spec_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        C27788k c27788k4 = new C27788k("SystemIdInfo", linkedHashMap4, linkedHashSetM48507i4, new LinkedHashSet());
        C27788k c27788kM101188S4 = AbstractC32417h.m101188S("SystemIdInfo", connection);
        if (!c27788k4.equals(c27788kM101188S4)) {
            return new C1784f1(false, AbstractC17176i.m48505g("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", c27788k4, "\n Found:\n", c27788kM101188S4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new C27785h(1, 1, "name", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSetM48507i5 = AbstractC17176i.m48507i(linkedHashMap5, "work_spec_id", new C27785h(2, 1, "work_spec_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        linkedHashSetM48507i5.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("work_spec_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new C27787j("index_WorkName_work_spec_id", AbstractC37056f.m118958J("work_spec_id"), AbstractC37056f.m118958J("ASC"), false));
        C27788k c27788k5 = new C27788k("WorkName", linkedHashMap5, linkedHashSetM48507i5, linkedHashSet4);
        C27788k c27788kM101188S5 = AbstractC32417h.m101188S("WorkName", connection);
        if (!c27788k5.equals(c27788kM101188S5)) {
            return new C1784f1(false, AbstractC17176i.m48505g("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", c27788k5, "\n Found:\n", c27788kM101188S5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new C27785h(1, 1, "work_spec_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        LinkedHashSet linkedHashSetM48507i6 = AbstractC17176i.m48507i(linkedHashMap6, NotificationCompat.CATEGORY_PROGRESS, new C27785h(0, 1, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true));
        linkedHashSetM48507i6.add(new C27786i("WorkSpec", "CASCADE", AbstractC37056f.m118958J("work_spec_id"), "CASCADE", AbstractC37056f.m118958J("id")));
        C27788k c27788k6 = new C27788k("WorkProgress", linkedHashMap6, linkedHashSetM48507i6, new LinkedHashSet());
        C27788k c27788kM101188S6 = AbstractC32417h.m101188S("WorkProgress", connection);
        if (!c27788k6.equals(c27788kM101188S6)) {
            return new C1784f1(false, AbstractC17176i.m48505g("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", c27788k6, "\n Found:\n", c27788kM101188S6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new C27785h(1, 1, "key", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
        C27788k c27788k7 = new C27788k("Preference", linkedHashMap7, AbstractC17176i.m48507i(linkedHashMap7, "long_value", new C27785h(0, 1, "long_value", "INTEGER", null, false)), new LinkedHashSet());
        C27788k c27788kM101188S7 = AbstractC32417h.m101188S("Preference", connection);
        return !c27788k7.equals(c27788kM101188S7) ? new C1784f1(false, AbstractC17176i.m48505g("Preference(androidx.work.impl.model.Preference).\n Expected:\n", c27788k7, "\n Found:\n", c27788kM101188S7)) : new C1784f1(true, null);
    }
}
