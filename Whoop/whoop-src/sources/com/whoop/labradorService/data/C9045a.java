package com.whoop.labradorService.data;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.labradorService.data.a */
/* JADX INFO: loaded from: classes4.dex */
final class C9045a extends AbstractC25380b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC25379a f27088a;

    public C9045a() {
        super(1, 2);
        this.f27088a = new LabradorPacketDatabase.C9043a();
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `_new_ecg_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
        AbstractC17269i.m48864K("INSERT INTO `_new_ecg_packets` (`timestamp`,`packet_revision`,`packet_data`,`version_id`) SELECT `timestamp`,`packet_revision`,`packet_data`,`version_id` FROM `raw_ecg_packets`", interfaceC33687a);
        AbstractC17269i.m48864K("DROP TABLE `raw_ecg_packets`", interfaceC33687a);
        AbstractC17269i.m48864K("ALTER TABLE `_new_ecg_packets` RENAME TO `ecg_packets`", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_ecg_packets_timestamp_packet_revision` ON `ecg_packets` (`timestamp`, `packet_revision`)", interfaceC33687a);
        this.f27088a.mo19645f(interfaceC33687a);
    }
}
