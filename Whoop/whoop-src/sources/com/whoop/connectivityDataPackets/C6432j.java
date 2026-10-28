package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.j */
/* JADX INFO: loaded from: classes.dex */
final class C6432j extends AbstractC25380b {
    public C6432j() {
        super(7, 8);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("ALTER TABLE `console_packets` ADD COLUMN `sequence_no` INTEGER NOT NULL DEFAULT -1", interfaceC33687a);
    }
}
