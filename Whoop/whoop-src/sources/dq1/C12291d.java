package dq1;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ck1.C4780c;
import dc1.C11906c;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: dq1.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C12291d implements InterfaceC12289b {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f41162a;

    /* JADX INFO: renamed from: c */
    private final C12292e f41164c = new C12292e();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f41163b = new a();

    /* JADX INFO: renamed from: dq1.d$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C12288a c12288a) {
            String strM34221a = C12291d.this.f41164c.m34221a(c12288a.getZoneID());
            if (strM34221a == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, strM34221a);
            }
            interfaceC33689c.mo5356p(2, c12288a.getMin());
            interfaceC33689c.mo5356p(3, c12288a.getMax());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_hr_zone_list` (`zone_id`,`min`,`max`) VALUES (?,?,?)";
        }
    }

    public C12291d(AbstractC1848z0 abstractC1848z0) {
        this.f41162a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m34215k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C23454a0 m34216l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_hr_zone_list");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ List m34217m(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_hr_zone_list ORDER BY min ASC");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "zone_id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "min");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "max");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                arrayList.add(new C12288a(this.f41164c.m34222b(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N)), (int) interfaceC33689cMo68212g1.getLong(iM60658N2), (int) interfaceC33689cMo68212g1.getLong(iM60658N3)));
            }
            return arrayList;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ Object m34218n(List list, InterfaceC33687a interfaceC33687a) {
        this.f41163b.insert(interfaceC33687a, (Iterable<Object>) list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m34219o(List list, InterfaceC30057d interfaceC30057d) {
        return super.mo34208d(list, interfaceC30057d);
    }

    @Override // dq1.InterfaceC12289b
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo34206a() {
        return AbstractC12350b.m34591l(this.f41162a, new String[]{"table_hr_zone_list"}, new C4780c(this, 24));
    }

    @Override // dq1.InterfaceC12289b
    /* JADX INFO: renamed from: b */
    public void mo34207b(List<C12288a> list) {
        list.getClass();
        AbstractC15751g.m44432L(this.f41162a, false, true, new C12290c(this, list, 1));
    }

    @Override // dq1.InterfaceC12289b
    /* JADX INFO: renamed from: d */
    public Object mo34208d(List<C12288a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f41162a, new C12290c(this, list, 0), interfaceC30057d);
    }

    @Override // dq1.InterfaceC12289b
    /* JADX INFO: renamed from: e */
    public Object mo34209e(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f41162a, false, true, new C11906c(17), interfaceC30057d);
    }
}
