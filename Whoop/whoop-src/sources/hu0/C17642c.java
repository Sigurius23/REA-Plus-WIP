package hu0;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import au0.C2054e;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: hu0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17642c implements InterfaceC17640a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f68400a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f68401b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f68402c = new b();

    /* JADX INFO: renamed from: hu0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C17643d c17643d) {
            interfaceC33689c.mo5356p(1, c17643d.getTimestamp());
            interfaceC33689c.mo5356p(2, c17643d.getPacketRevision());
            interfaceC33689c.mo5357q(3, c17643d.getPacketData().array());
            interfaceC33689c.mo5356p(4, c17643d.getVersionId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `sensor_data_packets` (`timestamp`,`packet_revision`,`packet_data`,`version_id`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: hu0.c$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C17643d c17643d) {
            interfaceC33689c.mo5356p(1, c17643d.getTimestamp());
            interfaceC33689c.mo5356p(2, c17643d.getPacketRevision());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `sensor_data_packets` WHERE `timestamp` = ? AND `packet_revision` = ?";
        }
    }

    public C17642c(AbstractC1848z0 abstractC1848z0) {
        this.f68400a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m50265g() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ C23454a0 m50266h(List list, InterfaceC33687a interfaceC33687a) {
        this.f68401b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Integer m50267i(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f68402c.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ List m50268j(int i13, int i14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM sensor_data_packets WHERE packet_revision == ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_revision");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_data");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "version_id");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C17643d(interfaceC33689cMo68212g1.getLong(iM60658N), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    @Override // hu0.InterfaceC17640a
    /* JADX INFO: renamed from: a */
    public Object mo50259a(List<C17643d> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f68400a, false, true, new C17641b(this, list, 1), interfaceC30057d);
    }

    @Override // hu0.InterfaceC17640a
    /* JADX INFO: renamed from: b */
    public Object mo50260b(int i13, int i14, InterfaceC30057d<? super List<C17643d>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f68400a, true, false, new C2054e(i13, i14, 1), interfaceC30057d);
    }

    @Override // hu0.InterfaceC17640a
    /* JADX INFO: renamed from: c */
    public Object mo50261c(List<C17643d> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f68400a, false, true, new C17641b(this, list, 0), interfaceC30057d);
    }
}
