package com.whoop.straphistorysync.sync;

import bi2.EnumC3285a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.straphistorysync.sync.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/straphistorysync/sync/f;", "Lcom/whoop/straphistorysync/sync/f$b$e;", "c", "(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$e;", "Lbi2/a;", "reason", "Lcom/whoop/straphistorysync/sync/f$b$b;", "b", "(Lcom/whoop/straphistorysync/sync/f;Lbi2/a;)Lcom/whoop/straphistorysync/sync/f$b$b;", "Lcom/whoop/straphistorysync/sync/f$b$a;", "a", "(Lcom/whoop/straphistorysync/sync/f;)Lcom/whoop/straphistorysync/sync/f$b$a;", "strap-history-sync_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10279g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10278f.b.a m26286a(InterfaceC10278f interfaceC10278f) {
        return interfaceC10278f == null ? new InterfaceC10278f.b.a(null, 0, null, 7, null) : new InterfaceC10278f.b.a(interfaceC10278f.getSavedPacketCounts(), interfaceC10278f.getSuccessfulBurstCount(), interfaceC10278f.getGapSummary());
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC10278f.b.C41422b m26287b(InterfaceC10278f interfaceC10278f, EnumC3285a reason) {
        AbstractC22676k.m65750j(reason, "reason");
        return interfaceC10278f == null ? new InterfaceC10278f.b.C41422b(reason, null, 0, null, 14, null) : new InterfaceC10278f.b.C41422b(reason, interfaceC10278f.getSavedPacketCounts(), interfaceC10278f.getSuccessfulBurstCount(), interfaceC10278f.getGapSummary());
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC10278f.b.e m26288c(InterfaceC10278f interfaceC10278f) {
        return interfaceC10278f == null ? new InterfaceC10278f.b.e(null, 0, null, 7, null) : new InterfaceC10278f.b.e(interfaceC10278f.getSavedPacketCounts(), interfaceC10278f.getSuccessfulBurstCount(), interfaceC10278f.getGapSummary());
    }
}
