package we1;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;
import um0.C35076b;
import wd3.C37168b;

/* JADX INFO: renamed from: we1.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C37227k implements InterfaceC37226j {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f159211a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f159212b = new a();

    /* JADX INFO: renamed from: we1.k$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C37228l c37228l) {
            interfaceC33689c.mo5356p(1, c37228l.getId());
            if (c37228l.getMembershipType() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c37228l.getMembershipType());
            }
            interfaceC33689c.mo5356p(3, c37228l.getLastUpdated());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `membership_type_table` (`id`,`membershipType`,`lastUpdated`) VALUES (?,?,?)";
        }
    }

    public C37227k(AbstractC1848z0 abstractC1848z0) {
        this.f159211a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: f */
    public static List<Class<?>> m119314f() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C23454a0 m119315g(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM membership_type_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C37228l m119316h(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM membership_type_table LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "membershipType");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastUpdated");
            C37228l c37228l = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N2)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                }
                c37228l = new C37228l(i13, strMo5353J0, interfaceC33689cMo68212g1.getLong(iM60658N3));
            }
            return c37228l;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C23454a0 m119317i(C37228l c37228l, InterfaceC33687a interfaceC33687a) {
        this.f159212b.insert(interfaceC33687a, c37228l);
        return C23454a0.f92919a;
    }

    @Override // we1.InterfaceC37226j
    /* JADX INFO: renamed from: a */
    public Object mo119309a(InterfaceC30057d<? super C37228l> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f159211a, true, false, new C37168b(11), interfaceC30057d);
    }

    @Override // we1.InterfaceC37226j
    /* JADX INFO: renamed from: b */
    public Object mo119310b(C37228l c37228l, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c37228l.getClass();
        return AbstractC15751g.m44434N(this.f159211a, false, true, new C35076b(24, this, c37228l), interfaceC30057d);
    }

    @Override // we1.InterfaceC37226j
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f159211a, false, true, new C37168b(10), interfaceC30057d);
    }
}
