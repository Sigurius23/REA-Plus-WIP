package p333n4;

import p319m4.C25016e;
import p319m4.C25020i;

/* JADX INFO: renamed from: n4.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C26254j extends AbstractC26260p {
    public C26254j(C25020i c25020i) {
        super(c25020i);
        c25020i.f97913d.mo77904f();
        c25020i.f97915e.mo77904f();
        this.f104410f = c25020i.f98019v0;
    }

    @Override // p333n4.InterfaceC26249e
    /* JADX INFO: renamed from: a */
    public final void mo77901a(InterfaceC26249e interfaceC26249e) {
        C26251g c26251g = this.f104412h;
        if (c26251g.f104382c && !c26251g.f104389j) {
            c26251g.mo77918d((int) ((((C26251g) c26251g.f104391l.get(0)).f104386g * ((C25020i) this.f104406b).f98015r0) + 0.5f));
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: d */
    public final void mo77902d() {
        C25016e c25016e = this.f104406b;
        C25020i c25020i = (C25020i) c25016e;
        int i13 = c25020i.f98016s0;
        int i14 = c25020i.f98017t0;
        int i15 = c25020i.f98019v0;
        C26251g c26251g = this.f104412h;
        if (i15 == 1) {
            if (i13 != -1) {
                c26251g.f104391l.add(c25016e.f97901U.f97913d.f104412h);
                this.f104406b.f97901U.f97913d.f104412h.f104390k.add(c26251g);
                c26251g.f104385f = i13;
            } else if (i14 != -1) {
                c26251g.f104391l.add(c25016e.f97901U.f97913d.f104413i);
                this.f104406b.f97901U.f97913d.f104413i.f104390k.add(c26251g);
                c26251g.f104385f = -i14;
            } else {
                c26251g.f104381b = true;
                c26251g.f104391l.add(c25016e.f97901U.f97913d.f104413i);
                this.f104406b.f97901U.f97913d.f104413i.f104390k.add(c26251g);
            }
            m77926m(this.f104406b.f97913d.f104412h);
            m77926m(this.f104406b.f97913d.f104413i);
            return;
        }
        if (i13 != -1) {
            c26251g.f104391l.add(c25016e.f97901U.f97915e.f104412h);
            this.f104406b.f97901U.f97915e.f104412h.f104390k.add(c26251g);
            c26251g.f104385f = i13;
        } else if (i14 != -1) {
            c26251g.f104391l.add(c25016e.f97901U.f97915e.f104413i);
            this.f104406b.f97901U.f97915e.f104413i.f104390k.add(c26251g);
            c26251g.f104385f = -i14;
        } else {
            c26251g.f104381b = true;
            c26251g.f104391l.add(c25016e.f97901U.f97915e.f104413i);
            this.f104406b.f97901U.f97915e.f104413i.f104390k.add(c26251g);
        }
        m77926m(this.f104406b.f97915e.f104412h);
        m77926m(this.f104406b.f97915e.f104413i);
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: e */
    public final void mo77903e() {
        C25016e c25016e = this.f104406b;
        int i13 = ((C25020i) c25016e).f98019v0;
        C26251g c26251g = this.f104412h;
        if (i13 == 1) {
            c25016e.f97906Z = c26251g.f104386g;
        } else {
            c25016e.f97908a0 = c26251g.f104386g;
        }
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: f */
    public final void mo77904f() {
        this.f104412h.m77917c();
    }

    @Override // p333n4.AbstractC26260p
    /* JADX INFO: renamed from: k */
    public final boolean mo77906k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m77926m(C26251g c26251g) {
        C26251g c26251g2 = this.f104412h;
        c26251g2.f104390k.add(c26251g);
        c26251g.f104391l.add(c26251g2);
    }
}
