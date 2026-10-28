package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.k */
/* JADX INFO: loaded from: classes.dex */
final class C6433k extends AbstractC25380b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC25379a f25238a;

    public C6433k() {
        super(8, 9);
        this.f25238a = new PersistentStrapPacketDatabase.C6421b();
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("DROP TABLE `table_raw_data`", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `sensor_data_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`, `packet_revision`))", interfaceC33687a);
        this.f25238a.mo19645f(interfaceC33687a);
    }
}
