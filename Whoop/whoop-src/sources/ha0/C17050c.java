package ha0;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ec3.InterfaceC13058l;
import eg.C13161j;
import ge3.AbstractC15751g;
import h01.C16554u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ha0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C17050c implements InterfaceC17048a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1848z0 f65552a;

    /* JADX INFO: renamed from: c */
    private final C17056i f65554c = new C17056i();

    /* JADX INFO: renamed from: b */
    private final AbstractC1802k f65553b = new a();

    /* JADX INFO: renamed from: ha0.c$a */
    public class a extends AbstractC1802k {
        public a() {
        }

        @Override // androidx.room.AbstractC1802k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(InterfaceC33689c interfaceC33689c, C17051d c17051d) {
            if (c17051d.getInternalName() == null) {
                interfaceC33689c.mo5359u(1);
            } else {
                interfaceC33689c.mo5354L(1, c17051d.getInternalName());
            }
            if (c17051d.getDisplayName() == null) {
                interfaceC33689c.mo5359u(2);
            } else {
                interfaceC33689c.mo5354L(2, c17051d.getDisplayName());
            }
            if (c17051d.getIconUrl() == null) {
                interfaceC33689c.mo5359u(3);
            } else {
                interfaceC33689c.mo5354L(3, c17051d.getIconUrl());
            }
            interfaceC33689c.mo5356p(4, c17051d.getDeleted() ? 1L : 0L);
            if (c17051d.getCategory() == null) {
                interfaceC33689c.mo5359u(5);
            } else {
                interfaceC33689c.mo5354L(5, c17051d.getCategory());
            }
            String strM48170a = C17050c.this.f65554c.m48170a(c17051d.getScoreType());
            if (strM48170a == null) {
                interfaceC33689c.mo5359u(6);
            } else {
                interfaceC33689c.mo5354L(6, strM48170a);
            }
            interfaceC33689c.mo5356p(7, c17051d.getHasGps() ? 1L : 0L);
        }

        @Override // androidx.room.AbstractC1802k
        public String createQuery() {
            return "INSERT OR REPLACE INTO `table_activities_list` (`internal_name`,`display_name`,`icon_url`,`deleted`,`category`,`score_type`,`has_gps`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public C17050c(AbstractC1848z0 abstractC1848z0) {
        this.f65552a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: k */
    public static List<Class<?>> m48134k() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ C23454a0 m48135l(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("DELETE FROM table_activities_list");
        try {
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ List m48136m(InterfaceC33687a interfaceC33687a) throws Exception {
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1("SELECT * FROM table_activities_list");
        try {
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "internal_name");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "display_name");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "icon_url");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "deleted");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "category");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "score_type");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "has_gps");
            ArrayList arrayList = new ArrayList();
            while (interfaceC33689cMo68212g1.mo5355e1()) {
                try {
                    int i13 = iM60658N2;
                    int i14 = iM60658N3;
                    arrayList.add(new C17051d(interfaceC33689cMo68212g1.isNull(iM60658N) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N), interfaceC33689cMo68212g1.isNull(iM60658N2) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N2), interfaceC33689cMo68212g1.isNull(iM60658N3) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N3), ((int) interfaceC33689cMo68212g1.getLong(iM60658N4)) != 0, interfaceC33689cMo68212g1.isNull(iM60658N5) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N5), this.f65554c.m48171b(interfaceC33689cMo68212g1.isNull(iM60658N6) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N6)), ((int) interfaceC33689cMo68212g1.getLong(iM60658N7)) != 0));
                    iM60658N2 = i13;
                    iM60658N3 = i14;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC33689cMo68212g1.close();
                    throw th;
                }
            }
            interfaceC33689cMo68212g1.close();
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ C23454a0 m48137n(List list, InterfaceC33687a interfaceC33687a) {
        this.f65553b.insert(interfaceC33687a, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object m48138o(List list, InterfaceC30057d interfaceC30057d) {
        return super.mo48126b(list, interfaceC30057d);
    }

    @Override // ha0.InterfaceC17048a
    /* JADX INFO: renamed from: a */
    public InterfaceC13058l mo48125a() {
        return AbstractC12350b.m34591l(this.f65552a, new String[]{"table_activities_list"}, new C13161j(this, 28));
    }

    @Override // ha0.InterfaceC17048a
    /* JADX INFO: renamed from: b */
    public Object mo48126b(List<C17051d> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44433M(this.f65552a, new C17049b(this, list, 0), interfaceC30057d);
    }

    @Override // ha0.InterfaceC17048a
    /* JADX INFO: renamed from: c */
    public Object mo48127c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.f65552a, false, true, new C16554u(2), interfaceC30057d);
    }

    @Override // ha0.InterfaceC17048a
    /* JADX INFO: renamed from: d */
    public Object mo48128d(List<C17051d> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        list.getClass();
        return AbstractC15751g.m44434N(this.f65552a, false, true, new C17049b(this, list, 1), interfaceC30057d);
    }
}
