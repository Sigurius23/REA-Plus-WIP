package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.a */
/* JADX INFO: loaded from: classes.dex */
final class C6423a extends AbstractC25380b {
    public C6423a() {
        super(10, 11);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `memfault_packets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `serial_number` TEXT NOT NULL, `value` BLOB NOT NULL)", interfaceC33687a);
    }
}
