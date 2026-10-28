package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.g */
/* JADX INFO: loaded from: classes.dex */
final class C6429g extends AbstractC25380b {
    public C6429g() {
        super(2, 3);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `table_strap_firmware_events` (`timestamp` INTEGER NOT NULL, `type` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
    }
}
