package com.whoop.data.local.room.dao.persistent;

import ai1.C0910b;
import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import b30.C2663y4;
import cj2.C4769a;
import du0.C12374a;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: loaded from: classes.dex */
public final class RawDataDao_Impl implements RawDataDao {
    private final AbstractC1848z0 __db;
    private final AbstractC1802k __insertAdapterOfRawDataDto = new AbstractC1802k() { // from class: com.whoop.data.local.room.dao.persistent.RawDataDao_Impl.1
        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_raw_data` (`timestamp`,`hw_version`,`maxim_version`,`dsp_version`,`strap_id`,`binary_version`,`binary_flags`,`raw_data_version`,`payload`,`id`) VALUES (?,?,?,?,?,?,?,?,?,nullif(?, 0))";
        }

        @Override // androidx.room.AbstractC1802k
        public void bind(InterfaceC33689c interfaceC33689c, C12374a c12374a) {
            interfaceC33689c.mo5356p(1, c12374a.getTimestamp());
            if (c12374a.getHardwareVersion() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c12374a.getHardwareVersion());
            }
            if (c12374a.getMaximVersion() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c12374a.getMaximVersion());
            }
            if (c12374a.getDspVersion() == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, c12374a.getDspVersion());
            }
            if (c12374a.getStrapId() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, c12374a.getStrapId());
            }
            interfaceC33689c.mo5356p(6, c12374a.getBinaryVersion());
            interfaceC33689c.mo5356p(7, c12374a.getBinaryFlags());
            if (c12374a.getRawDataVersion() == null) {
                interfaceC33689c.mo5359u(8);
            } else {
                interfaceC33689c.mo5354L(8, c12374a.getRawDataVersion());
            }
            interfaceC33689c.mo5357q(9, c12374a.getPayload().array());
            interfaceC33689c.mo5356p(10, c12374a.getId());
        }
    };
    private final AbstractC1794i __deleteAdapterOfRawDataDto = new AbstractC1794i() { // from class: com.whoop.data.local.room.dao.persistent.RawDataDao_Impl.2
        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_raw_data` WHERE `id` = ?";
        }

        @Override // androidx.room.AbstractC1794i
        public void bind(InterfaceC33689c interfaceC33689c, C12374a c12374a) {
            interfaceC33689c.mo5356p(1, c12374a.getId());
        }
    };

    public RawDataDao_Impl(AbstractC1848z0 abstractC1848z0) {
        this.__db = abstractC1848z0;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$delete$8(long j7, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_raw_data WHERE id = ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, j7);
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$deleteAllData$7(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_raw_data");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return Integer.valueOf(AbstractC21478l0.m60402H(interfaceC33687a));
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$deleteByPacketsList$1(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.__deleteAdapterOfRawDataDto.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getNewestTimestampByPacketVersion$4(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT timestamp FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp DESC LIMIT 1");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            interfaceC33689cMo68212g1.close();
            return lValueOf;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$getOldestTimestampByPacketVersion$5(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT timestamp FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC LIMIT 1");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            interfaceC33689cMo68212g1.close();
            return lValueOf;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getPacketsByRevision$2(String str, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hw_version");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxim_version");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "dsp_version");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strap_id");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_version");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_flags");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "raw_data_version");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "payload");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                C12374a c12374a = new C12374a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), (int) interfaceC33689cMo68212g1.getLong(iM60658N7), interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N9)));
                c12374a.m34722k(interfaceC33689cMo68212g1.getLong(iM60658N10));
                arrayList.add(c12374a);
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getPacketsByRevisionAndCount$3(String str, int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_raw_data WHERE raw_data_version = ? ORDER BY timestamp ASC LIMIT ?");
        try {
            if (str == null) {
                interfaceC33689cMo68212g1.mo5359u(1);
            } else {
                interfaceC33689cMo68212g1.mo5354L(1, str);
            }
            interfaceC33689cMo68212g1.mo5356p(2, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "hw_version");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxim_version");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "dsp_version");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "strap_id");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_version");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "binary_flags");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "raw_data_version");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "payload");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                C12374a c12374a = new C12374a(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4), interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), (int) interfaceC33689cMo68212g1.getLong(iM60658N6), (int) interfaceC33689cMo68212g1.getLong(iM60658N7), interfaceC33689cMo68212g1.isNull(iM60658N8) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N8), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N9)));
                c12374a.m34722k(interfaceC33689cMo68212g1.getLong(iM60658N10));
                arrayList.add(c12374a);
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C23454a0 lambda$insertList$0(List list, InterfaceC33687a interfaceC33687a) {
        this.__insertAdapterOfRawDataDto.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long lambda$observeNewestTimestamp$6(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(timestamp) FROM table_raw_data");
        try {
            Long lValueOf = null;
            if (interfaceC33689cMo68212g1.mo5355e1() && !interfaceC33689cMo68212g1.isNull(0)) {
                lValueOf = Long.valueOf(interfaceC33689cMo68212g1.getLong(0));
            }
            return lValueOf;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object delete(long j7, InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C0910b(j7, 3), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object deleteAllData(InterfaceC30057d<? super Integer> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, false, true, new C6498i(0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object deleteByPacketsList(List<C12374a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C6496g(this, list, 1), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object getNewestTimestampByPacketVersion(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C2663y4(str, 6), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object getOldestTimestampByPacketVersion(String str, InterfaceC30057d<? super Long> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C2663y4(str, 4), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object getPacketsByRevision(String str, InterfaceC30057d<? super List<C12374a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C2663y4(str, 5), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object getPacketsByRevisionAndCount(String str, int i13, InterfaceC30057d<? super List<C12374a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C6497h(str, i13, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public Object insertList(List<C12374a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.__db, false, true, new C6496g(this, list, 0), interfaceC30057d);
    }

    @Override // com.whoop.data.local.room.dao.persistent.RawDataDao
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.__db, new String[]{"table_raw_data"}, new C4769a(29));
    }
}
