package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.b */
/* JADX INFO: loaded from: classes.dex */
final class C6424b extends AbstractC25380b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC25379a f25237a;

    public C6424b() {
        super(11, 12);
        this.f25237a = new PersistentStrapPacketDatabase.C6420a();
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("DROP TABLE `table_battery_firmware_events`", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_battery_pack_relative_firmware_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)", interfaceC33687a);
        this.f25237a.mo19645f(interfaceC33687a);
    }
}
