package p299l9;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p047c9.C4323n;
import p171g9.C15586c;
import p171g9.C15587d;
import p516u8.AbstractC34609o0;
import p674z8.InterfaceC40178n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.j */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23507j extends AbstractC23481a {

    /* JADX INFO: renamed from: h */
    public final HashMap f93040h = new HashMap();

    /* JADX INFO: renamed from: i */
    public Handler f93041i;

    /* JADX INFO: renamed from: j */
    public InterfaceC40178n f93042j;

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: c */
    public final void mo68042c() {
        for (C23505i c23505i : this.f93040h.values()) {
            c23505i.f93037a.m68041b(c23505i.f93038b);
        }
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: e */
    public final void mo68044e() {
        for (C23505i c23505i : this.f93040h.values()) {
            c23505i.f93037a.m68043d(c23505i.f93038b);
        }
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public void mo36146i() {
        Iterator it = this.f93040h.values().iterator();
        while (it.hasNext()) {
            ((C23505i) it.next()).f93037a.mo36146i();
        }
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public void mo36149o() {
        HashMap map = this.f93040h;
        for (C23505i c23505i : map.values()) {
            AbstractC23481a abstractC23481a = c23505i.f93037a;
            C23502h c23502h = c23505i.f93039c;
            abstractC23481a.m68049n(c23505i.f93038b);
            abstractC23481a.m68051q(c23502h);
            abstractC23481a.m68050p(c23502h);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: s */
    public abstract C23488c0 mo68062s(Object obj, C23488c0 c23488c0);

    /* JADX INFO: renamed from: t */
    public long mo68063t(long j7, Object obj) {
        return j7;
    }

    /* JADX INFO: renamed from: u */
    public int mo68064u(int i13, Object obj) {
        return i13;
    }

    /* JADX INFO: renamed from: v */
    public abstract void mo68065v(Object obj, AbstractC23481a abstractC23481a, AbstractC34609o0 abstractC34609o0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [l9.d0, l9.g] */
    /* JADX INFO: renamed from: w */
    public final void m68068w(final Object obj, AbstractC23481a abstractC23481a) {
        HashMap map = this.f93040h;
        AbstractC35849g.m113802d(!map.containsKey(obj));
        ?? r10 = new InterfaceC23491d0() { // from class: l9.g
            @Override // p299l9.InterfaceC23491d0
            /* JADX INFO: renamed from: a */
            public final void mo8284a(AbstractC23481a abstractC23481a2, AbstractC34609o0 abstractC34609o0) {
                this.f93019a.mo68065v(obj, abstractC23481a2, abstractC34609o0);
            }
        };
        C23502h c23502h = new C23502h(this, obj);
        map.put(obj, new C23505i(abstractC23481a, r10, c23502h));
        Handler handler = this.f93041i;
        handler.getClass();
        abstractC23481a.getClass();
        C15587d c15587d = abstractC23481a.f92961c;
        c15587d.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = c15587d.f58539c;
        C23503h0 c23503h0 = new C23503h0();
        c23503h0.f93034a = handler;
        c23503h0.f93035b = c23502h;
        copyOnWriteArrayList.add(c23503h0);
        this.f93041i.getClass();
        C15587d c15587d2 = abstractC23481a.f92962d;
        c15587d2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = c15587d2.f58539c;
        C15586c c15586c = new C15586c();
        c15586c.f58536a = c23502h;
        copyOnWriteArrayList2.add(c15586c);
        InterfaceC40178n interfaceC40178n = this.f93042j;
        C4323n c4323n = this.f92965g;
        AbstractC35849g.m113808j(c4323n);
        abstractC23481a.m68047j(r10, interfaceC40178n, c4323n);
        if (this.f92960b.isEmpty()) {
            abstractC23481a.m68041b(r10);
        }
    }
}
