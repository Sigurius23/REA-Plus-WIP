package p333n4;

import java.util.ArrayList;
import java.util.Iterator;
import p319m4.C25013b;
import p319m4.C25016e;

/* JADX INFO: renamed from: n4.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C26255k extends AbstractC26260p {
    public C26255k(C25016e c25016e) {
        super(c25016e);
    }

    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        C25013b c25013b = (C25013b) this.f104406b;
        int i13 = c25013b.f97851t0;
        C26251g c26251g = this.f104412h;
        Iterator it = c26251g.f104391l.iterator();
        int i14 = 0;
        int i15 = -1;
        while (it.hasNext()) {
            int i16 = ((C26251g) it.next()).f104386g;
            if (i15 == -1 || i16 < i15) {
                i15 = i16;
            }
            if (i14 < i16) {
                i14 = i16;
            }
        }
        if (i13 == 0 || i13 == 2) {
            c26251g.mo77918d(i15 + c25013b.f97853v0);
        } else {
            c26251g.mo77918d(i14 + c25013b.f97853v0);
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: d */
    public final void mo77902d() {
        C25016e c25016e = this.f104406b;
        if (c25016e instanceof C25013b) {
            C26251g c26251g = this.f104412h;
            c26251g.f104381b = true;
            ArrayList arrayList = c26251g.f104391l;
            C25013b c25013b = (C25013b) c25016e;
            int i13 = c25013b.f97851t0;
            boolean z4 = c25013b.f97852u0;
            int i14 = 0;
            if (i13 == 0) {
                c26251g.f104384e = 4;
                while (i14 < c25013b.f98022s0) {
                    C25016e c25016e2 = c25013b.f98021r0[i14];
                    if (z4 || c25016e2.f97922h0 != 8) {
                        C26251g c26251g2 = c25016e2.f97913d.f104412h;
                        c26251g2.f104390k.add(c26251g);
                        arrayList.add(c26251g2);
                    }
                    i14++;
                }
                m77927m(this.f104406b.f97913d.f104412h);
                m77927m(this.f104406b.f97913d.f104413i);
                return;
            }
            if (i13 == 1) {
                c26251g.f104384e = 5;
                while (i14 < c25013b.f98022s0) {
                    C25016e c25016e3 = c25013b.f98021r0[i14];
                    if (z4 || c25016e3.f97922h0 != 8) {
                        C26251g c26251g3 = c25016e3.f97913d.f104413i;
                        c26251g3.f104390k.add(c26251g);
                        arrayList.add(c26251g3);
                    }
                    i14++;
                }
                m77927m(this.f104406b.f97913d.f104412h);
                m77927m(this.f104406b.f97913d.f104413i);
                return;
            }
            if (i13 == 2) {
                c26251g.f104384e = 6;
                while (i14 < c25013b.f98022s0) {
                    C25016e c25016e4 = c25013b.f98021r0[i14];
                    if (z4 || c25016e4.f97922h0 != 8) {
                        C26251g c26251g4 = c25016e4.f97915e.f104412h;
                        c26251g4.f104390k.add(c26251g);
                        arrayList.add(c26251g4);
                    }
                    i14++;
                }
                m77927m(this.f104406b.f97915e.f104412h);
                m77927m(this.f104406b.f97915e.f104413i);
                return;
            }
            if (i13 != 3) {
                return;
            }
            c26251g.f104384e = 7;
            while (i14 < c25013b.f98022s0) {
                C25016e c25016e5 = c25013b.f98021r0[i14];
                if (z4 || c25016e5.f97922h0 != 8) {
                    C26251g c26251g5 = c25016e5.f97915e.f104413i;
                    c26251g5.f104390k.add(c26251g);
                    arrayList.add(c26251g5);
                }
                i14++;
            }
            m77927m(this.f104406b.f97915e.f104412h);
            m77927m(this.f104406b.f97915e.f104413i);
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: e */
    public final void mo77903e() {
        C25016e c25016e = this.f104406b;
        if (c25016e instanceof C25013b) {
            int i13 = ((C25013b) c25016e).f97851t0;
            C26251g c26251g = this.f104412h;
            if (i13 == 0 || i13 == 1) {
                c25016e.f97906Z = c26251g.f104386g;
            } else {
                c25016e.f97908a0 = c26251g.f104386g;
            }
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: f */
    public final void mo77904f() {
        this.f104407c = null;
        this.f104412h.m77917c();
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: k */
    public final boolean mo77906k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m77927m(C26251g c26251g) {
        C26251g c26251g2 = this.f104412h;
        c26251g2.f104390k.add(c26251g);
        c26251g.f104391l.add(c26251g2);
    }
}
