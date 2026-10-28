package ji0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p249jc.AbstractC21598x;
import p251jg.C21650c;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ji0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C21715c implements InterfaceC21713a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f83348a;

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f83349b = new a();

    /* JADX INFO: renamed from: ji0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C21716d c21716d) {
            interfaceC33689c.mo5356p(1, c21716d.getId());
            if (c21716d.getResponseJson() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c21716d.getResponseJson());
            }
            interfaceC33689c.mo5356p(3, c21716d.getLastUpdated());
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `app_configuration_cache_table` (`id`,`responseJson`,`lastUpdated`) VALUES (?,?,?)";
        }
    }

    public C21715c(AbstractC1848z0 abstractC1848z0) {
        this.f83348a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: f */
    public static List<Class<?>> m61168f() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C23454a0 m61169g(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM app_configuration_cache_table");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C21716d m61170h(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM app_configuration_cache_table LIMIT 1");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "responseJson");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "lastUpdated");
            C21716d c21716d = null;
            String strMo5353J0 = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N);
                if (!interfaceC33689cMo68212g1.isNull(iM60658N2)) {
                    strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                }
                c21716d = new C21716d(i13, strMo5353J0, interfaceC33689cMo68212g1.getLong(iM60658N3));
            }
            return c21716d;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ C23454a0 m61171i(C21716d c21716d, InterfaceC33687a interfaceC33687a) {
        this.f83349b.insert(interfaceC33687a, c21716d);
        return C23454a0.f92919a;
    }

    @Override // ji0.InterfaceC21713a
    /* JADX INFO: renamed from: a */
    public Object mo61163a(InterfaceC30057d<? super C21716d> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f83348a, true, false, new C21714b(0), interfaceC30057d);
    }

    @Override // ji0.InterfaceC21713a
    /* JADX INFO: renamed from: b */
    public Object mo61164b(C21716d c21716d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c21716d.getClass();
        return AbstractC15751g.m44434N(this.f83348a, false, true, new C19223a(28, this, c21716d), interfaceC30057d);
    }

    @Override // ji0.InterfaceC21713a
    public Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f83348a, false, true, new C21650c(8), interfaceC30057d);
    }
}
