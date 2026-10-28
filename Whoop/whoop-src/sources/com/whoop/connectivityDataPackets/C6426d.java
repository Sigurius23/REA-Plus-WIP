package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.d */
/* JADX INFO: loaded from: classes7.dex */
final class C6426d extends AbstractC25380b {
    public C6426d() {
        super(14, 15);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_rev2_raw_data` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `sequence_no` INTEGER NOT NULL, `metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_table_rev2_raw_data_packet_time_stamp_sequence_no` ON `table_rev2_raw_data` (`packet_time_stamp`, `sequence_no`)", interfaceC33687a);
    }
}
