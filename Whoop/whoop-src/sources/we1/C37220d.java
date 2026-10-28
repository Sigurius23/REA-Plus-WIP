package we1;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;
import vb1.C35868a;
import wd3.C37168b;

/* JADX INFO: renamed from: we1.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C37220d implements InterfaceC37218b {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f159147a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f159148b = new a();

    /* JADX INFO: renamed from: we1.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C37221e c37221e) {
            interfaceC33689c.mo5356p(1, c37221e.getId());
            if (c37221e.getName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c37221e.getName());
            }
            interfaceC33689c.mo5356p(3, c37221e.getEnabled() ? 1L : 0L);
            interfaceC33689c.mo5356p(4, c37221e.getLastUpdated());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `entitlement_table` (`id`,`name`,`enabled`,`lastUpdated`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    public C37220d(AbstractC1848z0 abstractC1848z0) {
        this.f159147a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: h */
    public static List<Class<?>> m119280h() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C23454a0 m119281i(List list, InterfaceC33687a interfaceC33687a) {
        this.f159148b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C23454a0 m119282j(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM entitlement_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ List m119283k(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM entitlement_table");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enabled");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastUpdated");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C37221e((int) interfaceC33689cMo68212g1.getLong(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), ((int) interfaceC33689cMo68212g1.getLong(iM60658N3)) != 0, interfaceC33689cMo68212g1.getLong(iM60658N4)));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object m119284l(List list, InterfaceC30057d interfaceC30057d) {
        return super.mo119275b(list, interfaceC30057d);
    }

    @Override // we1.InterfaceC37218b
    /* JADX INFO: renamed from: a */
    public Object mo119274a(List<C37221e> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f159147a, false, true, new C37219c(this, list, 1), interfaceC30057d);
    }

    @Override // we1.InterfaceC37218b
    /* JADX INFO: renamed from: b */
    public Object mo119275b(List<C37221e> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f159147a, new C37219c(this, list, 0), interfaceC30057d);
    }

    @Override // we1.InterfaceC37218b
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f159147a, false, true, new C37168b(9), interfaceC30057d);
    }

    @Override // we1.InterfaceC37218b
    public Object getEntitlements(InterfaceC30057d<? super List<C37221e>> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f159147a, true, false, new C35868a(12), interfaceC30057d);
    }
}
