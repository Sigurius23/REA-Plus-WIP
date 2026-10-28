package com.whoop.labradorService.data;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p325mb.InterfaceC25379a;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.labradorService.data.b */
/* JADX INFO: loaded from: classes4.dex */
final class C9046b extends AbstractC25380b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC25379a f27089a;

    public C9046b() {
        super(2, 3);
        this.f27089a = new LabradorPacketDatabase.C9043a();
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("CREATE TABLE IF NOT EXISTS `ecg_packets` (`timestamp` INTEGER NOT NULL, `packet_revision` INTEGER NOT NULL, `packet_data` BLOB NOT NULL, `version_id` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))", interfaceC33687a);
        AbstractC17269i.m48864K("CREATE UNIQUE INDEX IF NOT EXISTS `index_ecg_packets_timestamp_packet_revision` ON `ecg_packets` (`timestamp`, `packet_revision`)", interfaceC33687a);
        this.f27089a.mo19645f(interfaceC33687a);
    }
}
