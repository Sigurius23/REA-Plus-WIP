package com.whoop.connectivityDataPackets;

import androidx.room.AbstractC1788g1;
import androidx.room.C1784f1;
import androidx.room.C1835v;
import au0.C2055f;
import au0.InterfaceC2050a;
import com.whoop.service.network.model.UserSessionDto;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressField;
import com.whoop.whooplabs.data.room.entity.WhoopLabsHrDeviceKt;
import fu0.C14778c;
import fu0.C14781f;
import fu0.InterfaceC14776a;
import fu0.InterfaceC14779d;
import hc3.AbstractC17176i;
import hg3.AbstractC17269i;
import hu0.C17642c;
import hu0.InterfaceC17640a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju0.C21960b;
import ju0.InterfaceC21959a;
import ku0.C22835d;
import ku0.InterfaceC22832a;
import mu0.C25953e;
import mu0.InterfaceC25949a;
import ou0.C28373d;
import ou0.C28375f;
import ou0.InterfaceC28370a;
import ou0.InterfaceC28374e;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p363ob.C27785h;
import p363ob.C27787j;
import p363ob.C27788k;
import p500tb.InterfaceC33687a;
import p555vl.AbstractC36095b;
import qu0.C30624c;
import qu0.InterfaceC30622a;
import se.AbstractC32410a;
import yt0.C39767f;
import yt0.InterfaceC39765d;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentStrapPacketDatabase_Impl extends PersistentStrapPacketDatabase {

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC25949a f25225a;

    /* JADX INFO: renamed from: b */
    private volatile InterfaceC22832a f25226b;

    /* JADX INFO: renamed from: c */
    private volatile InterfaceC2050a f25227c;

    /* JADX INFO: renamed from: d */
    private volatile InterfaceC39765d f25228d;

    /* JADX INFO: renamed from: e */
    private volatile InterfaceC30622a f25229e;

    /* JADX INFO: renamed from: f */
    private volatile InterfaceC17640a f25230f;

    /* JADX INFO: renamed from: g */
    private volatile InterfaceC21959a f25231g;

    /* JADX INFO: renamed from: h */
    private volatile InterfaceC14779d f25232h;

    /* JADX INFO: renamed from: i */
    private volatile InterfaceC14776a f25233i;

    /* JADX INFO: renamed from: j */
    private volatile InterfaceC28370a f25234j;

    /* JADX INFO: renamed from: k */
    private volatile InterfaceC28374e f25235k;

    /* JADX INFO: renamed from: com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase_Impl$a */
    public class C6422a extends AbstractC1788g1 {
        public C6422a(int i13, String str, String str2) {
            super(i13, str, str2);
        }

        @Override // androidx.room.AbstractC1788g1
        public void createAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_metrics_data` (`packet_revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, `frame_revision` INTEGER NOT NULL DEFAULT 1, PRIMARY KEY(`timestamp`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_heart_data_versions` (`version_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hardware_family` INTEGER NOT NULL, `pcba_revision` INTEGER NOT NULL, `optical_revision` INTEGER NOT NULL, `firmware_major` INTEGER NOT NULL, `firmware_minor` INTEGER NOT NULL, `firmware_build` INTEGER NOT NULL, `firmware_unreleased` INTEGER NOT NULL, `firmware_version` TEXT NOT NULL DEFAULT '', `sigproc_major` INTEGER NOT NULL, `sigproc_minor` INTEGER NOT NULL, `sigproc_patch` INTEGER NOT NULL, `binary_version` INTEGER NOT NULL, `binary_flags` INTEGER NOT NULL, `strap_id` TEXT NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_strap_firmware_events` (`timestamp` INTEGER NOT NULL, `type` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `type`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sequence_no` INTEGER NOT NULL DEFAULT -1, `packet_time_stamp` INTEGER NOT NULL, `console_packets_metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_research_packets` (`revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packetData` BLOB NOT NULL, `versionId` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `sensor_data_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `packet_revision`))", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `memfault_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serial_number` TEXT NOT NULL, `value` BLOB NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_optical_revision` INTEGER NOT NULL DEFAULT 0, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_firmware_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_optical_revision` INTEGER NOT NULL DEFAULT 0, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_rev2_raw_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_raw_data_packet_time_stamp_sequence_no` ON `table_rev2_raw_data` (`packet_time_stamp`, `sequence_no`)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_rev2_data_settings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `subtype` INTEGER NOT NULL, `received_packet_raw` BLOB NOT NULL)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_data_settings_packet_time_stamp_sequence_no` ON `table_rev2_data_settings` (`packet_time_stamp`, `sequence_no`)", interfaceC33687a);
            AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", interfaceC33687a);
            AbstractC17269i.m48864K("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6e6c7540db7fb622e48555d647c1c077')", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void dropAllTables(InterfaceC33687a interfaceC33687a) {
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_metrics_data`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_heart_data_versions`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_strap_firmware_events`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `console_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_research_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `sensor_data_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `memfault_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_battery_pack_relative_console_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_battery_pack_relative_firmware_packets`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_rev2_raw_data`", interfaceC33687a);
            AbstractC17269i.m48864K("DROP TABLE IF EXISTS `table_rev2_data_settings`", interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onCreate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onOpen(InterfaceC33687a interfaceC33687a) {
            PersistentStrapPacketDatabase_Impl.this.internalInitInvalidationTracker(interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public void onPostMigrate(InterfaceC33687a interfaceC33687a) {
        }

        @Override // androidx.room.AbstractC1788g1
        public void onPreMigrate(InterfaceC33687a interfaceC33687a) {
            AbstractC32410a.m101001I(interfaceC33687a);
        }

        @Override // androidx.room.AbstractC1788g1
        public C1784f1 onValidateSchema(InterfaceC33687a interfaceC33687a) {
            HashMap map = new HashMap(5);
            map.put("packet_revision", new C27785h(0, 1, "packet_revision", "INTEGER", null, true));
            map.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
            map.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            map.put("version_id", new C27785h(0, 1, "version_id", "INTEGER", null, true));
            C27788k c27788k = new C27788k("table_metrics_data", map, AbstractC36095b.m114687o(map, "frame_revision", new C27785h(0, 1, "frame_revision", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, true), 0), new HashSet(0));
            C27788k c27788kM83879a = C27788k.m83879a("table_metrics_data", interfaceC33687a);
            if (!c27788k.equals(c27788kM83879a)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_metrics_data(com.whoop.connectivityDataPacketsModels.metrics.dto.MetricsDataDto).\n Expected:\n", c27788k, "\n Found:\n", c27788kM83879a));
            }
            HashMap map2 = new HashMap(15);
            map2.put("version_id", new C27785h(1, 1, "version_id", "INTEGER", null, true));
            map2.put("hardware_family", new C27785h(0, 1, "hardware_family", "INTEGER", null, true));
            map2.put("pcba_revision", new C27785h(0, 1, "pcba_revision", "INTEGER", null, true));
            map2.put("optical_revision", new C27785h(0, 1, "optical_revision", "INTEGER", null, true));
            map2.put("firmware_major", new C27785h(0, 1, "firmware_major", "INTEGER", null, true));
            map2.put("firmware_minor", new C27785h(0, 1, "firmware_minor", "INTEGER", null, true));
            map2.put("firmware_build", new C27785h(0, 1, "firmware_build", "INTEGER", null, true));
            map2.put("firmware_unreleased", new C27785h(0, 1, "firmware_unreleased", "INTEGER", null, true));
            map2.put("firmware_version", new C27785h(0, 1, "firmware_version", ShippingAddressField.TEXT_FIELD_TYPE, "''", true));
            map2.put("sigproc_major", new C27785h(0, 1, "sigproc_major", "INTEGER", null, true));
            map2.put("sigproc_minor", new C27785h(0, 1, "sigproc_minor", "INTEGER", null, true));
            map2.put("sigproc_patch", new C27785h(0, 1, "sigproc_patch", "INTEGER", null, true));
            map2.put("binary_version", new C27785h(0, 1, "binary_version", "INTEGER", null, true));
            map2.put("binary_flags", new C27785h(0, 1, "binary_flags", "INTEGER", null, true));
            C27788k c27788k2 = new C27788k("table_heart_data_versions", map2, AbstractC36095b.m114687o(map2, "strap_id", new C27785h(0, 1, "strap_id", ShippingAddressField.TEXT_FIELD_TYPE, null, true), 0), new HashSet(0));
            C27788k c27788kM83879a2 = C27788k.m83879a("table_heart_data_versions", interfaceC33687a);
            if (!c27788k2.equals(c27788kM83879a2)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_heart_data_versions(com.whoop.connectivityDataPacketsModels.metadata.dto.StrapMetadataDto).\n Expected:\n", c27788k2, "\n Found:\n", c27788kM83879a2));
            }
            HashMap map3 = new HashMap(4);
            map3.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
            map3.put("type", new C27785h(2, 1, "type", "INTEGER", null, true));
            map3.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            C27788k c27788k3 = new C27788k("table_strap_firmware_events", map3, AbstractC36095b.m114687o(map3, "version_id", new C27785h(0, 1, "version_id", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a3 = C27788k.m83879a("table_strap_firmware_events", interfaceC33687a);
            if (!c27788k3.equals(c27788kM83879a3)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_strap_firmware_events(com.whoop.connectivityDataPacketsModels.firmware.events.dto.StrapFirmwareEventDto).\n Expected:\n", c27788k3, "\n Found:\n", c27788kM83879a3));
            }
            HashMap map4 = new HashMap(5);
            map4.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map4.put("sequence_no", new C27785h(0, 1, "sequence_no", "INTEGER", WhoopLabsHrDeviceKt.NO_HR_DEVICE_ID, true));
            map4.put("packet_time_stamp", new C27785h(0, 1, "packet_time_stamp", "INTEGER", null, true));
            map4.put("console_packets_metadata", new C27785h(0, 1, "console_packets_metadata", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            C27788k c27788k4 = new C27788k("console_packets", map4, AbstractC36095b.m114687o(map4, "received_packet_raw", new C27785h(0, 1, "received_packet_raw", "BLOB", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a4 = C27788k.m83879a("console_packets", interfaceC33687a);
            if (!c27788k4.equals(c27788kM83879a4)) {
                return new C1784f1(false, AbstractC17176i.m48505g("console_packets(com.whoop.connectivityDataPacketsModels.console.dto.ConsolePacketsDtoNew).\n Expected:\n", c27788k4, "\n Found:\n", c27788kM83879a4));
            }
            HashMap map5 = new HashMap(4);
            map5.put("revision", new C27785h(0, 1, "revision", "INTEGER", null, true));
            map5.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
            map5.put("packetData", new C27785h(0, 1, "packetData", "BLOB", null, true));
            C27788k c27788k5 = new C27788k("table_research_packets", map5, AbstractC36095b.m114687o(map5, "versionId", new C27785h(0, 1, "versionId", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a5 = C27788k.m83879a("table_research_packets", interfaceC33687a);
            if (!c27788k5.equals(c27788kM83879a5)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_research_packets(com.whoop.connectivityDataPacketsModels.research.dto.ResearchPacketDto).\n Expected:\n", c27788k5, "\n Found:\n", c27788kM83879a5));
            }
            HashMap map6 = new HashMap(4);
            map6.put("timestamp", new C27785h(1, 1, "timestamp", "INTEGER", null, true));
            map6.put("packet_revision", new C27785h(2, 1, "packet_revision", "INTEGER", null, true));
            map6.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            C27788k c27788k6 = new C27788k("sensor_data_packets", map6, AbstractC36095b.m114687o(map6, "version_id", new C27785h(0, 1, "version_id", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a6 = C27788k.m83879a("sensor_data_packets", interfaceC33687a);
            if (!c27788k6.equals(c27788kM83879a6)) {
                return new C1784f1(false, AbstractC17176i.m48505g("sensor_data_packets(com.whoop.connectivityDataPacketsModels.generic.SensorDataPacketDto).\n Expected:\n", c27788k6, "\n Found:\n", c27788kM83879a6));
            }
            HashMap map7 = new HashMap(3);
            map7.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map7.put("serial_number", new C27785h(0, 1, "serial_number", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            C27788k c27788k7 = new C27788k("memfault_packets", map7, AbstractC36095b.m114687o(map7, "value", new C27785h(0, 1, "value", "BLOB", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a7 = C27788k.m83879a("memfault_packets", interfaceC33687a);
            if (!c27788k7.equals(c27788kM83879a7)) {
                return new C1784f1(false, AbstractC17176i.m48505g("memfault_packets(com.whoop.connectivityDataPacketsModels.memfault.MemfaultPacketDto).\n Expected:\n", c27788k7, "\n Found:\n", c27788kM83879a7));
            }
            HashMap map8 = new HashMap(13);
            map8.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map8.put("boot_count", new C27785h(0, 1, "boot_count", "INTEGER", null, true));
            map8.put("seconds_since_boot", new C27785h(0, 1, "seconds_since_boot", "INTEGER", null, true));
            map8.put("sequence_number", new C27785h(0, 1, "sequence_number", "INTEGER", null, true));
            map8.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            map8.put("meta_battery_serial", new C27785h(0, 1, "meta_battery_serial", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map8.put("meta_hardware_family", new C27785h(0, 1, "meta_hardware_family", "INTEGER", null, true));
            map8.put("meta_pcba_revision", new C27785h(0, 1, "meta_pcba_revision", "INTEGER", null, true));
            map8.put("meta_optical_revision", new C27785h(0, 1, "meta_optical_revision", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
            map8.put("meta_firmware_major", new C27785h(0, 1, "meta_firmware_major", "INTEGER", null, true));
            map8.put("meta_firmware_minor", new C27785h(0, 1, "meta_firmware_minor", "INTEGER", null, true));
            map8.put("meta_firmware_point", new C27785h(0, 1, "meta_firmware_point", "INTEGER", null, true));
            C27788k c27788k8 = new C27788k("table_battery_pack_relative_console_packets", map8, AbstractC36095b.m114687o(map8, "meta_firmware_extra", new C27785h(0, 1, "meta_firmware_extra", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a8 = C27788k.m83879a("table_battery_pack_relative_console_packets", interfaceC33687a);
            if (!c27788k8.equals(c27788kM83879a8)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_battery_pack_relative_console_packets(com.whoop.connectivityDataPacketsModels.puffin.dto.BatteryPackRelativeConsoleLogPacketEntity).\n Expected:\n", c27788k8, "\n Found:\n", c27788kM83879a8));
            }
            HashMap map9 = new HashMap(13);
            map9.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map9.put("boot_count", new C27785h(0, 1, "boot_count", "INTEGER", null, true));
            map9.put("seconds_since_boot", new C27785h(0, 1, "seconds_since_boot", "INTEGER", null, true));
            map9.put("sequence_number", new C27785h(0, 1, "sequence_number", "INTEGER", null, true));
            map9.put("packet_data", new C27785h(0, 1, "packet_data", "BLOB", null, true));
            map9.put("meta_battery_serial", new C27785h(0, 1, "meta_battery_serial", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map9.put("meta_hardware_family", new C27785h(0, 1, "meta_hardware_family", "INTEGER", null, true));
            map9.put("meta_pcba_revision", new C27785h(0, 1, "meta_pcba_revision", "INTEGER", null, true));
            map9.put("meta_optical_revision", new C27785h(0, 1, "meta_optical_revision", "INTEGER", UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE, true));
            map9.put("meta_firmware_major", new C27785h(0, 1, "meta_firmware_major", "INTEGER", null, true));
            map9.put("meta_firmware_minor", new C27785h(0, 1, "meta_firmware_minor", "INTEGER", null, true));
            map9.put("meta_firmware_point", new C27785h(0, 1, "meta_firmware_point", "INTEGER", null, true));
            C27788k c27788k9 = new C27788k("table_battery_pack_relative_firmware_packets", map9, AbstractC36095b.m114687o(map9, "meta_firmware_extra", new C27785h(0, 1, "meta_firmware_extra", "INTEGER", null, true), 0), new HashSet(0));
            C27788k c27788kM83879a9 = C27788k.m83879a("table_battery_pack_relative_firmware_packets", interfaceC33687a);
            if (!c27788k9.equals(c27788kM83879a9)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_battery_pack_relative_firmware_packets(com.whoop.connectivityDataPacketsModels.puffin.dto.BatteryPackRelativeFirmwareEventPacketEntity).\n Expected:\n", c27788k9, "\n Found:\n", c27788kM83879a9));
            }
            HashMap map10 = new HashMap(5);
            map10.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map10.put("packet_time_stamp", new C27785h(0, 1, "packet_time_stamp", "INTEGER", null, true));
            map10.put("sequence_no", new C27785h(0, 1, "sequence_no", "INTEGER", null, true));
            map10.put("metadata", new C27785h(0, 1, "metadata", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            HashSet hashSetM114687o = AbstractC36095b.m114687o(map10, "received_packet_raw", new C27785h(0, 1, "received_packet_raw", "BLOB", null, true), 0);
            HashSet hashSet = new HashSet(1);
            hashSet.add(new C27787j("index_table_rev2_raw_data_packet_time_stamp_sequence_no", Arrays.asList("packet_time_stamp", "sequence_no"), Arrays.asList("ASC", "ASC"), true));
            C27788k c27788k10 = new C27788k("table_rev2_raw_data", map10, hashSetM114687o, hashSet);
            C27788k c27788kM83879a10 = C27788k.m83879a("table_rev2_raw_data", interfaceC33687a);
            if (!c27788k10.equals(c27788kM83879a10)) {
                return new C1784f1(false, AbstractC17176i.m48505g("table_rev2_raw_data(com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2RawDataDto).\n Expected:\n", c27788k10, "\n Found:\n", c27788kM83879a10));
            }
            HashMap map11 = new HashMap(6);
            map11.put("id", new C27785h(1, 1, "id", "INTEGER", null, true));
            map11.put("packet_time_stamp", new C27785h(0, 1, "packet_time_stamp", "INTEGER", null, true));
            map11.put("sequence_no", new C27785h(0, 1, "sequence_no", "INTEGER", null, true));
            map11.put("metadata", new C27785h(0, 1, "metadata", ShippingAddressField.TEXT_FIELD_TYPE, null, true));
            map11.put("subtype", new C27785h(0, 1, "subtype", "INTEGER", null, true));
            HashSet hashSetM114687o2 = AbstractC36095b.m114687o(map11, "received_packet_raw", new C27785h(0, 1, "received_packet_raw", "BLOB", null, true), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new C27787j("index_table_rev2_data_settings_packet_time_stamp_sequence_no", Arrays.asList("packet_time_stamp", "sequence_no"), Arrays.asList("ASC", "ASC"), true));
            C27788k c27788k11 = new C27788k("table_rev2_data_settings", map11, hashSetM114687o2, hashSet2);
            C27788k c27788kM83879a11 = C27788k.m83879a("table_rev2_data_settings", interfaceC33687a);
            return !c27788k11.equals(c27788kM83879a11) ? new C1784f1(false, AbstractC17176i.m48505g("table_rev2_data_settings(com.whoop.connectivityDataPacketsModels.firmware.rawdata.rev2.dto.Rev2DataSettingsDto).\n Expected:\n", c27788k11, "\n Found:\n", c27788kM83879a11)) : new C1784f1(true, null);
        }
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: b */
    public InterfaceC39765d mo19633b() {
        InterfaceC39765d interfaceC39765d;
        if (this.f25228d != null) {
            return this.f25228d;
        }
        synchronized (this) {
            try {
                if (this.f25228d == null) {
                    this.f25228d = new C39767f(this);
                }
                interfaceC39765d = this.f25228d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC39765d;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: c */
    public InterfaceC21959a mo19634c() {
        InterfaceC21959a interfaceC21959a;
        if (this.f25231g != null) {
            return this.f25231g;
        }
        synchronized (this) {
            try {
                if (this.f25231g == null) {
                    this.f25231g = new C21960b(this);
                }
                interfaceC21959a = this.f25231g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC21959a;
    }

    @Override // androidx.room.AbstractC1848z0
    public void clearAllTables() {
        performClear(false, "table_metrics_data", "table_heart_data_versions", "table_strap_firmware_events", "console_packets", "table_research_packets", "sensor_data_packets", "memfault_packets", "table_battery_pack_relative_console_packets", "table_battery_pack_relative_firmware_packets", "table_rev2_raw_data", "table_rev2_data_settings");
    }

    @Override // androidx.room.AbstractC1848z0
    public C1835v createInvalidationTracker() {
        return new C1835v(this, new HashMap(0), new HashMap(0), "table_metrics_data", "table_heart_data_versions", "table_strap_firmware_events", "console_packets", "table_research_packets", "sensor_data_packets", "memfault_packets", "table_battery_pack_relative_console_packets", "table_battery_pack_relative_firmware_packets", "table_rev2_raw_data", "table_rev2_data_settings");
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: d */
    public InterfaceC25949a mo19635d() {
        InterfaceC25949a interfaceC25949a;
        if (this.f25225a != null) {
            return this.f25225a;
        }
        synchronized (this) {
            try {
                if (this.f25225a == null) {
                    this.f25225a = new C25953e(this);
                }
                interfaceC25949a = this.f25225a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC25949a;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: e */
    public InterfaceC28370a mo19636e() {
        InterfaceC28370a interfaceC28370a;
        if (this.f25234j != null) {
            return this.f25234j;
        }
        synchronized (this) {
            try {
                if (this.f25234j == null) {
                    this.f25234j = new C28373d(this);
                }
                interfaceC28370a = this.f25234j;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC28370a;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: f */
    public InterfaceC28374e mo19637f() {
        InterfaceC28374e interfaceC28374e;
        if (this.f25235k != null) {
            return this.f25235k;
        }
        synchronized (this) {
            try {
                if (this.f25235k == null) {
                    this.f25235k = new C28375f(this);
                }
                interfaceC28374e = this.f25235k;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC28374e;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: g */
    public InterfaceC30622a mo19638g() {
        InterfaceC30622a interfaceC30622a;
        if (this.f25229e != null) {
            return this.f25229e;
        }
        synchronized (this) {
            try {
                if (this.f25229e == null) {
                    this.f25229e = new C30624c(this);
                }
                interfaceC30622a = this.f25229e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC30622a;
    }

    @Override // androidx.room.AbstractC1848z0
    public List<AbstractC25380b> getAutoMigrations(Map<Class<? extends InterfaceC25379a>, InterfaceC25379a> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6429g());
        arrayList.add(new C6430h());
        arrayList.add(new C6431i());
        arrayList.add(new C6432j());
        arrayList.add(new C6433k());
        arrayList.add(new C6434l());
        arrayList.add(new C6423a());
        arrayList.add(new C6424b());
        arrayList.add(new C6425c());
        arrayList.add(new C6426d());
        arrayList.add(new C6427e());
        arrayList.add(new C6428f());
        return arrayList;
    }

    @Override // androidx.room.AbstractC1848z0
    public Set<Class<? extends InterfaceC25379a>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.AbstractC1848z0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC25949a.class, C25953e.m76821w());
        map.put(InterfaceC22832a.class, C22835d.m66214h());
        map.put(InterfaceC2050a.class, C2055f.m6467n());
        map.put(InterfaceC39765d.class, C39767f.m127306o());
        map.put(InterfaceC30622a.class, C30624c.m94015g());
        map.put(InterfaceC17640a.class, C17642c.m50265g());
        map.put(InterfaceC21959a.class, C21960b.m62693g());
        map.put(InterfaceC14779d.class, C14781f.m42409h());
        map.put(InterfaceC14776a.class, C14778c.m42395h());
        map.put(InterfaceC28370a.class, C28373d.m86049k());
        map.put(InterfaceC28374e.class, C28375f.m86066k());
        return map;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: h */
    public InterfaceC14776a mo19639h() {
        InterfaceC14776a interfaceC14776a;
        if (this.f25233i != null) {
            return this.f25233i;
        }
        synchronized (this) {
            try {
                if (this.f25233i == null) {
                    this.f25233i = new C14778c(this);
                }
                interfaceC14776a = this.f25233i;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC14776a;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: i */
    public InterfaceC14779d mo19640i() {
        InterfaceC14779d interfaceC14779d;
        if (this.f25232h != null) {
            return this.f25232h;
        }
        synchronized (this) {
            try {
                if (this.f25232h == null) {
                    this.f25232h = new C14781f(this);
                }
                interfaceC14779d = this.f25232h;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC14779d;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: j */
    public InterfaceC17640a mo19641j() {
        InterfaceC17640a interfaceC17640a;
        if (this.f25230f != null) {
            return this.f25230f;
        }
        synchronized (this) {
            try {
                if (this.f25230f == null) {
                    this.f25230f = new C17642c(this);
                }
                interfaceC17640a = this.f25230f;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC17640a;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: k */
    public InterfaceC2050a mo19642k() {
        InterfaceC2050a interfaceC2050a;
        if (this.f25227c != null) {
            return this.f25227c;
        }
        synchronized (this) {
            try {
                if (this.f25227c == null) {
                    this.f25227c = new C2055f(this);
                }
                interfaceC2050a = this.f25227c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC2050a;
    }

    @Override // com.whoop.connectivityDataPackets.PersistentStrapPacketDatabase
    /* JADX INFO: renamed from: l */
    public InterfaceC22832a mo19643l() {
        InterfaceC22832a interfaceC22832a;
        if (this.f25226b != null) {
            return this.f25226b;
        }
        synchronized (this) {
            try {
                if (this.f25226b == null) {
                    this.f25226b = new C22835d(this);
                }
                interfaceC22832a = this.f25226b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return interfaceC22832a;
    }

    @Override // androidx.room.AbstractC1848z0
    public AbstractC1788g1 createOpenDelegate() {
        return new C6422a(17, "6e6c7540db7fb622e48555d647c1c077", "c0f462397688da90d9dc22c8c3d1de88");
    }
}
