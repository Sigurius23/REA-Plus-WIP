package p324m9;

import p299l9.C23538y0;
import p470rv.AbstractC31834n;
import p499t9.C33638k;
import p499t9.InterfaceC33639k0;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p607x8.C38059n;
import p619xl.C38445a;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C25280h extends AbstractC25273a {

    /* JADX INFO: renamed from: O */
    public final int f99224O;

    /* JADX INFO: renamed from: P */
    public final long f99225P;

    /* JADX INFO: renamed from: Q */
    public final C25275c f99226Q;

    /* JADX INFO: renamed from: R */
    public long f99227R;

    /* JADX INFO: renamed from: S */
    public volatile boolean f99228S;

    /* JADX INFO: renamed from: T */
    public boolean f99229T;

    public C25280h(InterfaceC40170f interfaceC40170f, C40171g c40171g, C34610p c34610p, int i13, Object obj, long j7, long j13, long j14, long j15, long j16, int i14, long j17, C25275c c25275c) {
        super(interfaceC40170f, c40171g, c34610p, i13, obj, j7, j13, j14, j15, j16);
        this.f99224O = i14;
        this.f99225P = j17;
        this.f99226Q = c25275c;
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public final void mo68093b() {
        C38445a c38445a = this.f99167M;
        AbstractC35849g.m113808j(c38445a);
        if (this.f99227R == 0) {
            long j7 = this.f99225P;
            for (C23538y0 c23538y0 : (C23538y0[]) c38445a.f164637y) {
                if (c23538y0.f93217E != j7) {
                    c23538y0.f93217E = j7;
                    c23538y0.f93243z = true;
                }
            }
            C25275c c25275c = this.f99226Q;
            long j13 = this.f99165K;
            long j14 = j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f99225P;
            long j15 = this.f99166L;
            c25275c.m74170a(c38445a, j14, j15 != -9223372036854775807L ? j15 - this.f99225P : -9223372036854775807L);
        }
        try {
            C40171g c40171gM128887a = this.f99191x.m128887a(this.f99227R);
            C40177m c40177m = this.f99189I;
            C33638k c33638k = new C33638k(c40177m, c40171gM128887a.f173347e, c40177m.open(c40171gM128887a));
            while (!this.f99228S) {
                try {
                    int iMo1543i = this.f99226Q.f99181w.mo1543i(c33638k, C25275c.f99175J);
                    AbstractC35849g.m113807i(iMo1543i != 1);
                    if (!(iMo1543i == 0)) {
                        break;
                    }
                } catch (Throwable th3) {
                    this.f99227R = c33638k.f140408z - this.f99191x.f173347e;
                    throw th3;
                }
            }
            C34610p c34610p = this.f99193z;
            String str = c34610p.f145782m;
            int i13 = c34610p.f145766K;
            int i14 = c34610p.f145767L;
            if (AbstractC34587d0.m109379l(str) && ((i13 > 1 || i14 > 1) && i13 != -1 && i14 != -1)) {
                InterfaceC33639k0 interfaceC33639k0M123169F = c38445a.m123169F(4);
                int i15 = i13 * i14;
                long j16 = (this.f99188H - this.f99187G) / ((long) i15);
                for (int i16 = 1; i16 < i15; i16++) {
                    interfaceC33639k0M123169F.mo36176d(new C38059n(), 0, 0);
                    interfaceC33639k0M123169F.mo36174b(((long) i16) * j16, 0, 0, 0, null);
                }
            }
            this.f99227R = c33638k.f140408z - this.f99191x.f173347e;
            AbstractC31834n.m98896e(this.f99189I);
            this.f99229T = !this.f99228S;
        } catch (Throwable th4) {
            AbstractC31834n.m98896e(this.f99189I);
            throw th4;
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public final void mo68094c() {
        this.f99228S = true;
    }

    @Override // p324m9.AbstractC25273a
    /* JADX INFO: renamed from: d */
    public final long mo74168d() {
        return this.f99164J + ((long) this.f99224O);
    }

    @Override // p324m9.AbstractC25273a
    /* JADX INFO: renamed from: e */
    public final boolean mo74169e() {
        return this.f99229T;
    }
}
