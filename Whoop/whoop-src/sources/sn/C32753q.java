package sn;

import android.util.Pair;
import p284ko.C22631o;
import p284ko.InterfaceC22625j0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p465rm.AbstractC31558o1;
import p465rm.C31545k0;
import p465rm.C31552m1;
import p465rm.C31555n1;

/* JADX INFO: renamed from: sn.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C32753q extends AbstractC32735h {

    /* JADX INFO: renamed from: k */
    public final AbstractC32721a f136196k;

    /* JADX INFO: renamed from: l */
    public final boolean f136197l;

    /* JADX INFO: renamed from: m */
    public final C31555n1 f136198m;

    /* JADX INFO: renamed from: n */
    public final C31552m1 f136199n;

    /* JADX INFO: renamed from: o */
    public C32749o f136200o;

    /* JADX INFO: renamed from: p */
    public C32747n f136201p;

    /* JADX INFO: renamed from: q */
    public boolean f136202q;

    /* JADX INFO: renamed from: r */
    public boolean f136203r;

    /* JADX INFO: renamed from: s */
    public boolean f136204s;

    public C32753q(AbstractC32721a abstractC32721a, boolean z4) {
        boolean z13;
        this.f136196k = abstractC32721a;
        if (z4) {
            abstractC32721a.getClass();
            z13 = true;
        } else {
            z13 = false;
        }
        this.f136197l = z13;
        this.f136198m = new C31555n1();
        this.f136199n = new C31552m1();
        abstractC32721a.getClass();
        this.f136200o = new C32749o(new C32751p(abstractC32721a.mo102689f()), C31555n1.f130306R, C32749o.f136190E);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: f */
    public final C31545k0 mo102689f() {
        return this.f136196k.mo102689f();
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: g */
    public final void mo102690g() {
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: i */
    public final void mo102692i(InterfaceC22625j0 interfaceC22625j0) {
        this.f136091j = interfaceC22625j0;
        this.f136090i = AbstractC24567y.m71680k(null);
        if (this.f136197l) {
            return;
        }
        this.f136202q = true;
        m102711r(null, this.f136196k);
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: k */
    public final void mo102694k(InterfaceC32757s interfaceC32757s) {
        C32747n c32747n = (C32747n) interfaceC32757s;
        if (c32747n.f136171E != null) {
            AbstractC32721a abstractC32721a = c32747n.f136177z;
            abstractC32721a.getClass();
            abstractC32721a.mo102694k(c32747n.f136171E);
        }
        if (interfaceC32757s == this.f136201p) {
            this.f136201p = null;
        }
    }

    @Override // sn.AbstractC32735h, sn.AbstractC32721a
    /* JADX INFO: renamed from: m */
    public final void mo102696m() {
        this.f136203r = false;
        this.f136202q = false;
        super.mo102696m();
    }

    @Override // sn.AbstractC32735h
    /* JADX INFO: renamed from: p */
    public final C32763v mo102710p(Object obj, C32763v c32763v) {
        Object obj2 = c32763v.f136238a;
        Object obj3 = this.f136200o.f136192z;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = C32749o.f136190E;
        }
        return c32763v.m102755b(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // sn.AbstractC32735h
    /* JADX INFO: renamed from: q */
    public final void mo102708q(Object obj, AbstractC32721a abstractC32721a, AbstractC31558o1 abstractC31558o1) {
        long j7;
        C32749o c32749o;
        C32763v c32763vM102755b;
        C32749o c32749o2;
        if (this.f136203r) {
            C32749o c32749o3 = this.f136200o;
            this.f136200o = new C32749o(abstractC31558o1, c32749o3.f136191y, c32749o3.f136192z);
            C32747n c32747n = this.f136201p;
            if (c32747n != null) {
                m102729t(c32747n.f136173G);
            }
        } else {
            boolean zM97175p = abstractC31558o1.m97175p();
            Object obj2 = C32749o.f136190E;
            if (!zM97175p) {
                C31555n1 c31555n1 = this.f136198m;
                abstractC31558o1.m97174n(0, c31555n1);
                long j13 = c31555n1.f130317M;
                Object obj3 = c31555n1.f130322w;
                C32747n c32747n2 = this.f136201p;
                if (c32747n2 != null) {
                    long j14 = c32747n2.f136175x;
                    C32749o c32749o4 = this.f136200o;
                    Object obj4 = c32747n2.f136174w.f136238a;
                    C31552m1 c31552m1 = this.f136199n;
                    c32749o4.mo97132g(obj4, c31552m1);
                    long j15 = c31552m1.f130281E + j14;
                    this.f136200o.mo97136m(0, c31555n1, 0L);
                    if (j15 != c31555n1.f130317M) {
                        j7 = j15;
                    } else {
                        j7 = j13;
                    }
                } else {
                    j7 = j13;
                }
                Pair pairM97172i = abstractC31558o1.m97172i(this.f136198m, this.f136199n, 0, j7);
                Object obj5 = pairM97172i.first;
                long jLongValue = ((Long) pairM97172i.second).longValue();
                if (this.f136204s) {
                    C32749o c32749o5 = this.f136200o;
                    c32749o = new C32749o(abstractC31558o1, c32749o5.f136191y, c32749o5.f136192z);
                } else {
                    c32749o = new C32749o(abstractC31558o1, obj3, obj5);
                }
                this.f136200o = c32749o;
                C32747n c32747n3 = this.f136201p;
                if (c32747n3 != null) {
                    m102729t(jLongValue);
                    C32763v c32763v = c32747n3.f136174w;
                    Object obj6 = c32763v.f136238a;
                    if (this.f136200o.f136192z != null && obj6.equals(obj2)) {
                        obj6 = this.f136200o.f136192z;
                    }
                    c32763vM102755b = c32763v.m102755b(obj6);
                }
                this.f136204s = true;
                this.f136203r = true;
                m102693j(this.f136200o);
                if (c32763vM102755b != null) {
                    C32747n c32747n4 = this.f136201p;
                    c32747n4.getClass();
                    c32747n4.m102725l(c32763vM102755b);
                }
            }
            if (this.f136204s) {
                C32749o c32749o6 = this.f136200o;
                c32749o2 = new C32749o(abstractC31558o1, c32749o6.f136191y, c32749o6.f136192z);
            } else {
                c32749o2 = new C32749o(abstractC31558o1, C31555n1.f130306R, obj2);
            }
            this.f136200o = c32749o2;
        }
        c32763vM102755b = null;
        this.f136204s = true;
        this.f136203r = true;
        m102693j(this.f136200o);
        if (c32763vM102755b != null) {
            C32747n c32747n5 = this.f136201p;
            c32747n5.getClass();
            c32747n5.m102725l(c32763vM102755b);
        }
    }

    @Override // sn.AbstractC32721a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final C32747n mo102684a(C32763v c32763v, C22631o c22631o, long j7) {
        C32747n c32747n = new C32747n(c32763v, c22631o, j7);
        AbstractC24543a.m71573i(c32747n.f136177z == null);
        AbstractC32721a abstractC32721a = this.f136196k;
        c32747n.f136177z = abstractC32721a;
        if (!this.f136203r) {
            this.f136201p = c32747n;
            if (!this.f136202q) {
                this.f136202q = true;
                m102711r(null, abstractC32721a);
            }
            return c32747n;
        }
        Object obj = c32763v.f136238a;
        if (this.f136200o.f136192z != null && obj.equals(C32749o.f136190E)) {
            obj = this.f136200o.f136192z;
        }
        c32747n.m102725l(c32763v.m102755b(obj));
        return c32747n;
    }

    /* JADX INFO: renamed from: t */
    public final void m102729t(long j7) {
        C32747n c32747n = this.f136201p;
        int iMo97128b = this.f136200o.mo97128b(c32747n.f136174w.f136238a);
        if (iMo97128b == -1) {
            return;
        }
        C32749o c32749o = this.f136200o;
        C31552m1 c31552m1 = this.f136199n;
        c32749o.mo97131f(iMo97128b, c31552m1, false);
        long j13 = c31552m1.f130287z;
        if (j13 != -9223372036854775807L && j7 >= j13) {
            j7 = Math.max(0L, j13 - 1);
        }
        c32747n.f136173G = j7;
    }
}
