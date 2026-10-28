package qu0;

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
import ru0.C31817a;

/* JADX INFO: renamed from: qu0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C30624c implements InterfaceC30622a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f125910a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f125911b = new a();

    /* JADX INFO: renamed from: c */
    private final AbstractC1794i f125912c = new b();

    /* JADX INFO: renamed from: qu0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C31817a c31817a) {
            interfaceC33689c.mo5356p(1, c31817a.getRevision());
            interfaceC33689c.mo5356p(2, c31817a.getTimestamp());
            interfaceC33689c.mo5357q(3, c31817a.getPacketData().array());
            interfaceC33689c.mo5356p(4, c31817a.getVersionId());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_research_packets` (`revision`,`timestamp`,`packetData`,`versionId`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: renamed from: qu0.c$b */
    public class b extends AbstractC1794i {
        public b() {
        }

        @Override // androidx.room.AbstractC1794i
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C31817a c31817a) {
            interfaceC33689c.mo5356p(1, c31817a.getTimestamp());
        }

        @Override // androidx.room.AbstractC1794i
        public String createQuery() {
            return "DELETE FROM `table_research_packets` WHERE `timestamp` = ?";
        }
    }

    public C30624c(AbstractC1848z0 abstractC1848z0) {
        this.f125910a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m94015g() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Integer m94016h(List list, InterfaceC33687a interfaceC33687a) {
        return Integer.valueOf(this.f125912c.handleMultiple(interfaceC33687a, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m94017i(int i13, int i14, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_research_packets WHERE revision = ? ORDER BY timestamp ASC LIMIT ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            interfaceC33689cMo68212g1.mo5356p(2, i14);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "revision");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "timestamp");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "packetData");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "versionId");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C31817a((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.getLong(iM60658N2), ByteBuffer.wrap(interfaceC33689cMo68212g1.getBlob(iM60658N3)), (int) interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ C23454a0 m94018j(List list, InterfaceC33687a interfaceC33687a) {
        this.f125911b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    @Override // qu0.InterfaceC30622a
    /* JADX INFO: renamed from: a */
    public Object mo94009a(List<C31817a> list, InterfaceC30057d<? super Integer> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f125910a, false, true, new C30623b(this, list, 1), interfaceC30057d);
    }

    @Override // qu0.InterfaceC30622a
    /* JADX INFO: renamed from: b */
    public Object mo94010b(int i13, int i14, InterfaceC30057d<? super List<C31817a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f125910a, true, false, new C2054e(i13, i14, 2), interfaceC30057d);
    }

    @Override // qu0.InterfaceC30622a
    /* JADX INFO: renamed from: c */
    public Object mo94011c(List<C31817a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f125910a, false, true, new C30623b(this, list, 0), interfaceC30057d);
    }
}
