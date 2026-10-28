package com.whoop.connectivityDataPackets;

import hg3.AbstractC17269i;
import p325mb.AbstractC25380b;
import p500tb.InterfaceC33687a;

/* JADX INFO: renamed from: com.whoop.connectivityDataPackets.f */
/* JADX INFO: loaded from: classes7.dex */
final class C6428f extends AbstractC25380b {
    public C6428f() {
        super(16, 17);
    }

    @Override // p325mb.AbstractC25380b
    public void migrate(InterfaceC33687a interfaceC33687a) {
        AbstractC17269i.m48864K("ALTER TABLE `table_metrics_data` ADD COLUMN `frame_revision` INTEGER NOT NULL DEFAULT 1", interfaceC33687a);
    }
}
