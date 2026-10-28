package com.whoop.data.local.room.dao.persistent;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import bp0.C3526n;
import cj2.C4769a;
import com.whoop.data.local.room.entity.connectivity.CachedMetricsDataDto;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class CachedMetricsDataDao_Impl implements CachedMetricsDataDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfCachedMetricsDataDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `cached_table_metrics_data` (`packet_revision`,`timestamp`,`packet_data`,`version_id`) VALUES (?,?,?,?)";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, CachedMetricsDataDto cachedMetricsDataDto) {
            interfaceC33689c.mo5356p(1, cachedMetricsDataDto.getPacketRevision());
            interfaceC33689c.mo5356p(2, cachedMetricsDataDto.getTimestamp());
            interfaceC33689c.mo5357q(3, cachedMetricsDataDto.getPacketData().array());
            interfaceC33689c.mo5356p(4, cachedMetricsDataDto.getVersionId());
        }
    };

    public CachedMetricsDataDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAllHeartDataBeforeTimeStamp$5(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM cached_table_metrics_data WHERE timestamp < ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getHeartDataByTimeRanges$4(int i13, long j7, long j13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM cached_table_metrics_data WHERE packet_revision == ? AND timestamp >= ? AND timestamp <= ? ORDER BY timestamp ASC");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, j7);
            interfaceC33689cMo68212g1.mo5356p(3, j13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new CachedMetricsDataDto((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getOldestPacketRevision$3(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT packet_revision FROM cached_table_metrics_data ORDER BY timestamp ASC LIMIT 1");
        try {
            Integer numValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                numValueOf = Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(0));
            }
            return numValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getPacketRevisionThenHeartDataByTimeRanges$2(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        return super.getPacketRevisionThenHeartDataByTimeRanges(j7, j13, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$insertAllThenDeleteOldHeartDataByTimeStamp$1(List list, long j7, InterfaceC30057d interfaceC30057d) {
        return super.insertAllThenDeleteOldHeartDataByTimeStamp(list, j7, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insertList$0(List list, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfCachedMetricsDataDto.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object deleteAllHeartDataBeforeTimeStamp(long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6493d(j7, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object getHeartDataByTimeRanges(int i13, long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6491b(i13, j7, j13), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object getOldestPacketRevision(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C4769a(26), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object getPacketRevisionThenHeartDataByTimeRanges(long j7, long j13, InterfaceC30057d<? super List<CachedMetricsDataDto>> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new C6492c(j7, j13, this, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object insertAllThenDeleteOldHeartDataByTimeStamp(final List<CachedMetricsDataDto> list, final long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.__db, new Function1() { // from class: com.whoop.data.local.room.dao.persistent.a
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return this.f25376w.lambda$insertAllThenDeleteOldHeartDataByTimeStamp$1(list, j7, (InterfaceC30057d) obj);
            }
        }, interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.CachedMetricsDataDao
    public Object insertList(List<CachedMetricsDataDto> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C3526n(4, this, list), interfaceC30057d);
    }
}
