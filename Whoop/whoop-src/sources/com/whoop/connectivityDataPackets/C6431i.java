package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.i */
/* JADX INFO: loaded from: classes.dex */
final class C6431i extends AbstractC25380b {
    public C6431i() {
        super(6, 7);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_research_packets` (`revision` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `packetData` BLOB NOT NULL, `versionId` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
    }
}
