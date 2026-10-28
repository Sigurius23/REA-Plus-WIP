package p324m9;

import p299l9.C23538y0;
import p470rv.AbstractC31834n;
import p499t9.C33638k;
import p499t9.InterfaceC33639k0;
import p516u8.C34610p;
import p619xl.C38445a;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C25283k extends AbstractC25273a {

    /* JADX INFO: renamed from: O */
    public final int f99235O;

    /* JADX INFO: renamed from: P */
    public final C34610p f99236P;

    /* JADX INFO: renamed from: Q */
    public long f99237Q;

    /* JADX INFO: renamed from: R */
    public boolean f99238R;

    public C25283k(InterfaceC40170f interfaceC40170f, C40171g c40171g, C34610p c34610p, int i13, Object obj, long j7, long j13, long j14, int i14, C34610p c34610p2) {
        super(interfaceC40170f, c40171g, c34610p, i13, obj, j7, j13, -9223372036854775807L, -9223372036854775807L, j14);
        this.f99235O = i14;
        this.f99236P = c34610p2;
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public final void mo68093b() {
        C40177m c40177m = this.f99189I;
        C38445a c38445a = this.f99167M;
        AbstractC35849g.m113808j(c38445a);
        for (C23538y0 c23538y0 : (C23538y0[]) c38445a.f164637y) {
            if (c23538y0.f93217E != 0) {
                c23538y0.f93217E = 0L;
                c23538y0.f93243z = true;
            }
        }
        InterfaceC33639k0 interfaceC33639k0M123169F = c38445a.m123169F(this.f99235O);
        interfaceC33639k0M123169F.mo36173a(this.f99236P);
        try {
            long jOpen = c40177m.open(this.f99191x.m128887a(this.f99237Q));
            if (jOpen != -1) {
                jOpen += this.f99237Q;
            }
            C33638k c33638k = new C33638k(this.f99189I, this.f99237Q, jOpen);
            for (int iMo36175c = 0; iMo36175c != -1; iMo36175c = interfaceC33639k0M123169F.mo36175c(c33638k, Integer.MAX_VALUE, true)) {
                this.f99237Q += (long) iMo36175c;
            }
            interfaceC33639k0M123169F.mo36174b(this.f99187G, 1, (int) this.f99237Q, 0, null);
            AbstractC31834n.m98896e(c40177m);
            this.f99238R = true;
        } catch (Throwable th3) {
            AbstractC31834n.m98896e(c40177m);
            throw th3;
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public final void mo68094c() {
    }

    @Override // p324m9.AbstractC25273a
    /* JADX INFO: renamed from: e */
    public final boolean mo74169e() {
        return this.f99238R;
    }
}
