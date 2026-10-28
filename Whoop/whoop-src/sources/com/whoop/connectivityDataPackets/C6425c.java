package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.c */
/* JADX INFO: loaded from: classes.dex */
final class C6425c extends AbstractC25380b {
    public C6425c() {
        super(12, 13);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("ALTER TABLE `table_battery_pack_relative_console_packets` ADD COLUMN `meta_optical_revision` INTEGER NOT NULL DEFAULT 0", interfaceC33687a);
        AbstractC17269i.m48864K("ALTER TABLE `table_battery_pack_relative_firmware_packets` ADD COLUMN `meta_optical_revision` INTEGER NOT NULL DEFAULT 0", interfaceC33687a);
    }
}
