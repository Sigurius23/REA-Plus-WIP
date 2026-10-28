package p420qc;

import androidx.room.AbstractC1848z0;
import com.whoop.data.local.room.dao.persistent.C6497h;
import e61.C12764g;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import jx0.C22001d;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p218ic.C18358g;
import p218ic.EnumC18371m0;
import p249jc.AbstractC21598x;
import p392p3.C28761b0;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import se.AbstractC32411b;

/* JADX INFO: renamed from: qc.u */
/* JADX INFO: loaded from: classes.dex */
public final class C30211u {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f123665a;

    /* JADX INFO: renamed from: b */
    public final C30192b f123666b = new C30192b(5);

    /* JADX INFO: renamed from: c */
    public final C30210t f123667c = new C30210t();

    public C30211u(AbstractC1848z0 abstractC1848z0) {
        this.f123665a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: a */
    public final void m92430a(InterfaceC33687a interfaceC33687a, C0022g c0022g) {
        C0010c c0010c = (C0010c) c0022g.keySet();
        C0022g c0022g2 = c0010c.f25w;
        if (c0022g2.isEmpty()) {
            return;
        }
        if (c0022g.f50y > 999) {
            AbstractC32411b.m101080X(c0022g, new C30209s(this, interfaceC33687a, 0));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        AbstractC29125c.m88533j(c0022g2.f50y, sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(string);
        Iterator it = c0010c.iterator();
        int i13 = 1;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            }
            interfaceC33689cMo68212g1.mo5354L(i13, (String) abstractC0038m.next());
            i13++;
        }
        int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "work_spec_id");
        if (iM60657M == -1) {
            interfaceC33689cMo68212g1.close();
            return;
        }
        while (interfaceC33689cMo68212g1.mo5355e1()) {
            List list = (List) c0022g.get(interfaceC33689cMo68212g1.mo5353J0(iM60657M));
            if (list != null) {
                byte[] blob = interfaceC33689cMo68212g1.getBlob(0);
                C18358g c18358g = C18358g.f71479b;
                list.add(AbstractC29125c.m88543t(blob));
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m92431b(InterfaceC33687a interfaceC33687a, C0022g c0022g) {
        C0010c c0010c = (C0010c) c0022g.keySet();
        C0022g c0022g2 = c0010c.f25w;
        if (c0022g2.isEmpty()) {
            return;
        }
        if (c0022g.f50y > 999) {
            AbstractC32411b.m101080X(c0022g, new C30209s(this, interfaceC33687a, 1));
            return;
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        AbstractC29125c.m88533j(c0022g2.f50y, sbM53374o);
        sbM53374o.append(")");
        String string = sbM53374o.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        InterfaceC33689c interfaceC33689cMo68212g1 = interfaceC33687a.mo68212g1(string);
        Iterator it = c0010c.iterator();
        int i13 = 1;
        while (true) {
            AbstractC0038m abstractC0038m = (AbstractC0038m) it;
            if (!abstractC0038m.hasNext()) {
                try {
                    break;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g1.close();
                    throw th3;
                }
            }
            interfaceC33689cMo68212g1.mo5354L(i13, (String) abstractC0038m.next());
            i13++;
        }
        int iM60657M = AbstractC21598x.m60657M(interfaceC33689cMo68212g1, "work_spec_id");
        if (iM60657M == -1) {
            interfaceC33689cMo68212g1.close();
            return;
        }
        while (interfaceC33689cMo68212g1.mo5355e1()) {
            List list = (List) c0022g.get(interfaceC33689cMo68212g1.mo5353J0(iM60657M));
            if (list != null) {
                list.add(interfaceC33689cMo68212g1.mo5353J0(0));
            }
        }
        interfaceC33689cMo68212g1.close();
    }

    /* JADX INFO: renamed from: c */
    public final void m92432c(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC15751g.m44432L(this.f123665a, false, true, new C12764g(id4, 16));
    }

    /* JADX INFO: renamed from: d */
    public final EnumC18371m0 m92433d(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return (EnumC18371m0) AbstractC15751g.m44432L(this.f123665a, true, false, new C12764g(id4, 10));
    }

    /* JADX INFO: renamed from: e */
    public final C30207q m92434e(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return (C30207q) AbstractC15751g.m44432L(this.f123665a, true, false, new C12764g(id4, 9));
    }

    /* JADX INFO: renamed from: f */
    public final List m92435f(String name) {
        AbstractC22676k.m65750j(name, "name");
        return (List) AbstractC15751g.m44432L(this.f123665a, true, false, new C12764g(name, 17));
    }

    /* JADX INFO: renamed from: g */
    public final int m92436g(long j7, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return ((Number) AbstractC15751g.m44432L(this.f123665a, false, true, new C22001d(1, id4, j7))).intValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m92437h(int i13, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC15751g.m44432L(this.f123665a, false, true, new C6497h(id4, i13, 2));
    }

    /* JADX INFO: renamed from: i */
    public final void m92438i(long j7, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC15751g.m44432L(this.f123665a, false, true, new C22001d(2, id4, j7));
    }

    /* JADX INFO: renamed from: j */
    public final int m92439j(EnumC18371m0 enumC18371m0, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        return ((Number) AbstractC15751g.m44432L(this.f123665a, false, true, new C28761b0(5, enumC18371m0, id4))).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final void m92440k(int i13, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC15751g.m44432L(this.f123665a, false, true, new C6497h(i13, id4));
    }
}
