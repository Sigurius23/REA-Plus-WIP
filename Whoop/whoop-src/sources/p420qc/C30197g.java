package p420qc;

import androidx.room.AbstractC1848z0;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import java.util.List;
import p002a0.AbstractC0038m;
import p002a0.C0010c;
import p002a0.C0022g;
import p218ic.C18358g;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import se.AbstractC32411b;

/* JADX INFO: renamed from: qc.g */
/* JADX INFO: loaded from: classes.dex */
public final class C30197g {

    /* JADX INFO: renamed from: a */
    public final AbstractC1848z0 f123597a;

    public C30197g(AbstractC1848z0 abstractC1848z0) {
        this.f123597a = abstractC1848z0;
    }

    /* JADX INFO: renamed from: a */
    public final void m92419a(InterfaceC33687a interfaceC33687a, C0022g c0022g) {
        C0010c c0010c = (C0010c) c0022g.keySet();
        C0022g c0022g2 = c0010c.f25w;
        if (c0022g2.isEmpty()) {
            return;
        }
        if (c0022g.f50y > 999) {
            AbstractC32411b.m101080X(c0022g, new C30196f(this, interfaceC33687a, 0));
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
    public final void m92420b(InterfaceC33687a interfaceC33687a, C0022g c0022g) {
        C0010c c0010c = (C0010c) c0022g.keySet();
        C0022g c0022g2 = c0010c.f25w;
        if (c0022g2.isEmpty()) {
            return;
        }
        if (c0022g.f50y > 999) {
            AbstractC32411b.m101080X(c0022g, new C30196f(this, interfaceC33687a, 1));
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
}
