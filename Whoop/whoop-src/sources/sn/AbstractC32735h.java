package sn;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24543a;
import p408q.C29662f;
import p465rm.AbstractC31558o1;
import p556vm.C36137d;
import sm.C32713f;

/* JADX INFO: renamed from: sn.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32735h extends AbstractC32721a {

    /* JADX INFO: renamed from: h */
    public final HashMap f136089h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f136090i;

    /* JADX INFO: renamed from: j */
    public InterfaceC22625j0 f136091j;

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: c */
    public final void mo102686c() {
        for (C32733g c32733g : this.f136089h.values()) {
            c32733g.f136084a.m102685b(c32733g.f136085b);
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: e */
    public final void mo102688e() {
        for (C32733g c32733g : this.f136089h.values()) {
            c32733g.f136084a.m102687d(c32733g.f136085b);
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public void mo102690g() {
        Iterator it = this.f136089h.values().iterator();
        while (it.hasNext()) {
            ((C32733g) it.next()).f136084a.mo102690g();
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public void mo102696m() {
        HashMap map = this.f136089h;
        for (C32733g c32733g : map.values()) {
            AbstractC32721a abstractC32721a = c32733g.f136084a;
            C29662f c29662f = c32733g.f136086c;
            abstractC32721a.m102695l(c32733g.f136085b);
            abstractC32721a.m102698o(c29662f);
            abstractC32721a.m102697n(c29662f);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: p */
    public C32763v mo102710p(Object obj, C32763v c32763v) {
        return c32763v;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo102708q(Object obj, AbstractC32721a abstractC32721a, AbstractC31558o1 abstractC31558o1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [sn.f, sn.w] */
    /* JADX INFO: renamed from: r */
    public final void m102711r(final Object obj, AbstractC32721a abstractC32721a) {
        HashMap map = this.f136089h;
        AbstractC24543a.m71569e(!map.containsKey(obj));
        ?? r10 = new InterfaceC32765w() { // from class: sn.f
            @Override // sn.InterfaceC32765w
            /* JADX INFO: renamed from: a */
            public final void mo97193a(AbstractC32721a abstractC32721a2, AbstractC31558o1 abstractC31558o1) {
                this.f136074a.mo102708q(obj, abstractC32721a2, abstractC31558o1);
            }
        };
        C29662f c29662f = new C29662f(this, obj);
        map.put(obj, new C32733g(abstractC32721a, r10, c29662f));
        Handler handler = this.f136090i;
        handler.getClass();
        abstractC32721a.getClass();
        C32770z c32770z = abstractC32721a.f136027c;
        c32770z.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = c32770z.f136277c;
        C32769y c32769y = new C32769y();
        c32769y.f136273a = handler;
        c32769y.f136274b = c29662f;
        copyOnWriteArrayList.add(c32769y);
        this.f136090i.getClass();
        C32770z c32770z2 = abstractC32721a.f136028d;
        c32770z2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c32770z2.f136277c;
        C36137d c36137d = new C36137d();
        c36137d.f154642a = c29662f;
        copyOnWriteArrayList2.add(c36137d);
        InterfaceC22625j0 interfaceC22625j0 = this.f136091j;
        C32713f c32713f = this.f136031g;
        AbstractC24543a.m71574j(c32713f);
        abstractC32721a.m102691h(r10, interfaceC22625j0, c32713f);
        if (this.f136026b.isEmpty()) {
            abstractC32721a.m102685b(r10);
        }
    }
}
