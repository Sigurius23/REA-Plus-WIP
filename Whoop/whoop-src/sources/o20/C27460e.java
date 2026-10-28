package o20;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import b30.C2562l;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import ch.C4594o;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13052j1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import g40.C15329c;
import g40.C15335d;
import g40.C15440w2;
import g40.InterfaceC15367i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import n53.C26318e;
import p007a6.C0456u;
import p279kd.C22379f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;
import q83.InterfaceC30057d;
import s20.C32077a;
import x30.C37913o;

/* JADX INFO: renamed from: o20.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C27460e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C26318e f110663E;

    /* JADX INFO: renamed from: w */
    public final List f110664w;

    /* JADX INFO: renamed from: x */
    public final C32077a f110665x;

    /* JADX INFO: renamed from: y */
    public final C26318e f110666y;

    /* JADX INFO: renamed from: z */
    public final C13052j1 f110667z;

    public C27460e(List elements, C32077a formArguments) {
        InterfaceC13037f2 interfaceC13037f2;
        AbstractC22676k.m65750j(elements, "elements");
        AbstractC22676k.m65750j(formArguments, "formArguments");
        this.f110664w = elements;
        this.f110665x = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof C15440w2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, ((C15440w2) it.next()).f58025b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof C37913o) {
                arrayList3.add(obj2);
            }
        }
        C37913o c37913o = (C37913o) AbstractC25265s.m74100H0(arrayList3);
        C25235a0 c25235a0 = C25235a0.f99113w;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(c25235a0);
        InterfaceC30057d interfaceC30057d = null;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C22379f(this, (InterfaceC30057d) null, 17), 3);
        C26318e c26318eM9509p = AbstractC3269g.m9509p((c37913o == null || (interfaceC13037f2 = c37913o.f162325h) == null) ? AbstractC3269g.m9493Z(c25235a0) : interfaceC13037f2, c13045h2M36593c, new C24947b(19));
        this.f110666y = c26318eM9509p;
        C4594o c4594o = new C4594o(m82869g(), 3);
        C4594o c4594o2 = new C4594o(m82869g(), 4);
        this.f110667z = AbstractC13091v.m36606p(c4594o2, c26318eM9509p, c4594o, new C2562l(new C27456a(c4594o2, c26318eM9509p, c4594o, (Map) this.f110665x.f133031j.getValue()), interfaceC30057d, 2));
        List list = this.f110664w;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((InterfaceC15367i1) it3.next()).mo43552f());
        }
        this.f110663E = AbstractC3269g.m9509p(this.f110666y, new C26318e(arrayList4.isEmpty() ? AbstractC3269g.m9493Z(AbstractC25267u.m74164j0(AbstractC25265s.m74093D1(C25271y.f99162w))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList4).toArray(new InterfaceC13058l[0]), 11), new C15335d(arrayList4, 12)), new C24947b(20));
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m82869g() {
        List list = this.f110664w;
        if (list.isEmpty()) {
            return new C0456u(C25271y.f99162w, 1);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC15367i1) it.next()).mo43551e());
        }
        return new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 10);
    }
}
