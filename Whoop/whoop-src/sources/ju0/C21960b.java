package ju0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.C6494e;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.C19212a;
import iu0.C20935a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jp1.C21851c;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ju0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21960b implements InterfaceC21959a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f84914a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f84915b = new a();

    /* JADX INFO: renamed from: ju0.b$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C20935a c20935a) {
            interfaceC33689c.mo5356p(1, c20935a.getId());
            if (c20935a.getSerialNumber() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c20935a.getSerialNumber());
            }
            if (c20935a.getValue() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5357q(3, c20935a.getValue());
            }
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR IGNORE INTO `memfault_packets` (`id`,`serial_number`,`value`) VALUES (nullif(?, 0),?,?)";
        }
    }

    public C21960b(AbstractC1848z0 abstractC1848z0) {
        this.f84914a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: g */
    public static List<Class<?>> m62693g() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C23454a0 m62694h(String str, List list, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(str);
        try {
            Iterator it = list.iterator();
            int i13 = 1;
            while (it.hasNext()) {
                Long l7 = (Long) it.next();
                if (l7 == null) {
                    interfaceC33689cMo68212g1.mo5359u(i13);
                } else {
                    interfaceC33689cMo68212g1.mo5356p(i13, l7.longValue());
                }
                i13++;
            }
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m62695i(int i13, InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM memfault_packets order by id limit ?");
        try {
            interfaceC33689cMo68212g1.mo5356p(1, i13);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "serial_number");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "value");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                long j7 = interfaceC33689cMo68212g1.getLong(iM60658N);
                byte[] blob = null;
                String strMo5353J0 = interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N3)) {
                    blob = interfaceC33689cMo68212g1.getBlob(iM60658N3);
                }
                arrayList.add(new C20935a(j7, strMo5353J0, blob));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ C23454a0 m62696j(C20935a c20935a, InterfaceC33687a interfaceC33687a) {
        this.f84915b.insert(interfaceC33687a, c20935a);
        return C23454a0.f92919a;
    }

    @Override // ju0.InterfaceC21959a
    /* JADX INFO: renamed from: a */
    public Object mo62687a(int i13, InterfaceC30057d<? super List<C20935a>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f84914a, true, false, new C6494e(i13, 20), interfaceC30057d);
    }

    @Override // ju0.InterfaceC21959a
    /* JADX INFO: renamed from: b */
    public Object mo62688b(List<Long> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("DELETE FROM memfault_packets WHERE id IN (");
        AbstractC29125c.m88533j(list.size(), sbM53374o);
        sbM53374o.append(")");
        return AbstractC15751g.m44434N(this.f84914a, false, true, new C19212a(3, sbM53374o.toString(), list), interfaceC30057d);
    }

    @Override // ju0.InterfaceC21959a
    /* JADX INFO: renamed from: c */
    public Object mo62689c(C20935a c20935a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c20935a.getClass();
        return AbstractC15751g.m44434N(this.f84914a, false, true, new C21851c(7, this, c20935a), interfaceC30057d);
    }
}
