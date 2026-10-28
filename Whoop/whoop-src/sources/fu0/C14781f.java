package fu0;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ec3.InterfaceC13058l;
import fq2.C14686c;
import ge3.AbstractC15751g;
import gu0.C16211c;
import gu0.C16212d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: fu0.f */
/* JADX INFO: loaded from: classes7.dex */
public final class C14781f implements InterfaceC14779d {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f54805a;

    /* JADX INFO: renamed from: c */
    private final C16212d f54807c = new C16212d();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f54806b = new a();

    /* JADX INFO: renamed from: d */
    private final AbstractC1794i f54808d = new b();

    /* JADX INFO: renamed from: fu0.f$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C16211c c16211c) {
            interfaceC33689c.mo5356p(1, c16211c.getId());
            interfaceC33689c.mo5356p(2, c16211c.getPacketTimeStampUtcMillis());
            interfaceC33689c.mo5356p(3, c16211c.getSequenceNo());
            String strM45901d = C14781f.this.f54807c.m45901d(c16211c.getMetadata());
            if (strM45901d == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strM45901d);
            }
            interfaceC33689c.mo5357q(5, c16211c.getReceivedPacketRaw().array());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `table_rev2_raw_data` (`id`,`packet_time_stamp`,`sequence_no`,`metadata`,`received_packet_raw`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fu0.f$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C16211c c16211c) {
            interfaceC33689c.mo5356p(1, c16211c.getId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_rev2_raw_data` WHERE `id` = ?";
        }
    }

    public C14781f(AbstractC1848z0 abstractC1848z0) {
        this.f54805a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m42409h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Integer m42410i(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f54808d.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ List m42411j(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_rev2_raw_data ORDER BY id ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_no");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "metadata");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C16211c(interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), this.f54807c.m45900b(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4)), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N5))));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ List m42412k(List list, InterfaceC33687a interfaceC33687a) {
        return this.f54806b.insertAndReturnIdsList(interfaceC33687a, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Long m42413l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(packet_time_stamp) FROM table_rev2_raw_data");
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

    @Override // fu0.InterfaceC14779d
    /* JADX INFO: renamed from: a */
    public Object mo42402a(List<C16211c> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f54805a, false, true, new C14780e(this, list, 1), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14779d
    /* JADX INFO: renamed from: b */
    public Object mo42403b(int i13, InterfaceC30057d<? super List<C16211c>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f54805a, true, false, new C6516c(this, i13, 4), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14779d
    public Object insertAll(List<C16211c> list, InterfaceC30057d<? super List<Long>> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f54805a, false, true, new C14780e(this, list, 0), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14779d
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f54805a, new String[]{"table_rev2_raw_data"}, new C14686c(11));
    }
}
