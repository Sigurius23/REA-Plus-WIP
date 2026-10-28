package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.l */
/* JADX INFO: loaded from: classes.dex */
final class C6434l extends AbstractC25380b {
    public C6434l() {
        super(9, 10);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_battery_firmware_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `boot_count` INTEGER NOT NULL, `seconds_since_boot` INTEGER NOT NULL, `sequence_number` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `meta_battery_serial` TEXT NOT NULL, `meta_hardware_family` INTEGER NOT NULL, `meta_pcba_revision` INTEGER NOT NULL, `meta_firmware_major` INTEGER NOT NULL, `meta_firmware_minor` INTEGER NOT NULL, `meta_firmware_point` INTEGER NOT NULL, `meta_firmware_extra` INTEGER NOT NULL)", interfaceC33687a);
    }
}
