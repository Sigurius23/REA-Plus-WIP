package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.h */
/* JADX INFO: loaded from: classes.dex */
final class C6430h extends AbstractC25380b {
    public C6430h() {
        super(5, 6);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `console_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `packet_time_stamp` INTEGER NOT NULL, `console_packets_metadata` TEXT NOT NULL, `received_packet_raw` BLOB NOT NULL)", interfaceC33687a);
    }
}
