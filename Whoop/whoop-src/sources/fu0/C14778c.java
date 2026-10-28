package fu0;

import androidx.room.AbstractC1794i;
import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import ec3.InterfaceC13058l;
import fq2.C14686c;
import ge3.AbstractC15751g;
import gu0.C16209a;
import gu0.C16210b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: fu0.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C14778c implements InterfaceC14776a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f54796a;

    /* JADX INFO: renamed from: c */
    private final C16210b f54798c = new C16210b();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f54797b = new a();

    /* JADX INFO: renamed from: d */
    private final AbstractC1794i f54799d = new b();

    /* JADX INFO: renamed from: fu0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C16209a c16209a) {
            interfaceC33689c.mo5356p(1, c16209a.getId());
            interfaceC33689c.mo5356p(2, c16209a.getPacketTimeStampUtcMillis());
            interfaceC33689c.mo5356p(3, c16209a.getSequenceNo());
            String strM45892d = C14778c.this.f54798c.m45892d(c16209a.getMetadata());
            if (strM45892d == null) {
                interfaceC33689c.mo5359u(4);
            } else {
                interfaceC33689c.mo5354L(4, strM45892d);
            }
            interfaceC33689c.mo5356p(5, c16209a.getSubtype());
            interfaceC33689c.mo5357q(6, c16209a.getReceivedPacketRaw().array());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `table_rev2_data_settings` (`id`,`packet_time_stamp`,`sequence_no`,`metadata`,`subtype`,`received_packet_raw`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: fu0.c$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C16209a c16209a) {
            interfaceC33689c.mo5356p(1, c16209a.getId());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_rev2_data_settings` WHERE `id` = ?";
        }
    }

    public C14778c(AbstractC1848z0 abstractC1848z0) {
        this.f54796a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m42395h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ Integer m42396i(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f54799d.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ List m42397j(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_rev2_data_settings ORDER BY id ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packet_time_stamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "sequence_no");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "metadata");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "subtype");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "received_packet_raw");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                long j7 = interfaceC33689cMo68212g1.getLong(iM60658N);
                int i14 = iM60658N;
                int i15 = iM60658N2;
                int i16 = iM60658N3;
                arrayList.add(new C16209a(j7, interfaceC33689cMo68212g1.getLong(iM60658N2), interfaceC33689cMo68212g1.getLong(iM60658N3), this.f54798c.m45891b(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4)), (int) interfaceC33689cMo68212g1.getLong(iM60658N5), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N6))));
                iM60658N2 = i15;
                iM60658N3 = i16;
                iM60658N = i14;
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ List m42398k(List list, InterfaceC33687a interfaceC33687a) {
        return this.f54797b.insertAndReturnIdsList(interfaceC33687a, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Long m42399l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT MAX(packet_time_stamp) FROM table_rev2_data_settings");
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

    @Override // fu0.InterfaceC14776a
    /* JADX INFO: renamed from: a */
    public Object mo42388a(List<C16209a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f54796a, false, true, new C14777b(this, list, 1), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14776a
    /* JADX INFO: renamed from: b */
    public Object mo42389b(int i13, InterfaceC30057d<? super List<C16209a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f54796a, true, false, new C6516c(this, i13, 3), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14776a
    public Object insertAll(List<C16209a> list, InterfaceC30057d<? super List<Long>> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f54796a, false, true, new C14777b(this, list, 0), interfaceC30057d);
    }

    @Override // fu0.InterfaceC14776a
    public InterfaceC13058l observeNewestTimestamp() {
        return AbstractC12350b.m34591l(this.f54796a, new String[]{"table_rev2_data_settings"}, new C14686c(10));
    }
}
