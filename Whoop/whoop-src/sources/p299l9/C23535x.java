package p299l9;

import android.util.Pair;
import p031b9.C2834g1;
import p284ko.C22631o;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34626x;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: l9.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C23535x extends AbstractC23504h1 {

    /* JADX INFO: renamed from: l */
    public final boolean f93196l;

    /* JADX INFO: renamed from: m */
    public final C34607n0 f93197m;

    /* JADX INFO: renamed from: n */
    public final C34605m0 f93198n;

    /* JADX INFO: renamed from: o */
    public C23531v f93199o;

    /* JADX INFO: renamed from: p */
    public C23529u f93200p;

    /* JADX INFO: renamed from: q */
    public boolean f93201q;

    /* JADX INFO: renamed from: r */
    public boolean f93202r;

    /* JADX INFO: renamed from: s */
    public boolean f93203s;

    public C23535x(AbstractC23481a abstractC23481a, boolean z4) {
        super(abstractC23481a);
        this.f93196l = z4 && abstractC23481a.mo68046h();
        this.f93197m = new C34607n0();
        this.f93198n = new C34605m0();
        AbstractC34609o0 abstractC34609o0Mo68045f = abstractC23481a.mo68045f();
        if (abstractC34609o0Mo68045f == null) {
            this.f93199o = new C23531v(new C23533w(abstractC23481a.mo36145g()), C34607n0.f145699q, C23531v.f93172e);
        } else {
            this.f93199o = new C23531v(abstractC34609o0Mo68045f, null, null);
            this.f93203s = true;
        }
    }

    @Override // p299l9.AbstractC23504h1
    /* JADX INFO: renamed from: A */
    public final void mo68061A() {
        if (this.f93196l) {
            return;
        }
        this.f93201q = true;
        m68067z();
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C23529u mo36144a(C23488c0 c23488c0, C22631o c22631o, long j7) {
        C23529u c23529u = new C23529u(c23488c0, c22631o, j7);
        AbstractC35849g.m113807i(c23529u.f93166z == null);
        c23529u.f93166z = this.f93036k;
        if (!this.f93202r) {
            this.f93200p = c23529u;
            if (!this.f93201q) {
                this.f93201q = true;
                m68067z();
            }
            return c23529u;
        }
        Object obj = c23488c0.f92976a;
        if (this.f93199o.f93174d != null && obj.equals(C23531v.f93172e)) {
            obj = this.f93199o.f93174d;
        }
        c23529u.m68107g(c23488c0.m68053a(obj));
        return c23529u;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m68121C(long j7) {
        C23529u c23529u = this.f93200p;
        int iMo8132b = this.f93199o.mo8132b(c23529u.f93163w.f92976a);
        if (iMo8132b == -1) {
            return false;
        }
        C23531v c23531v = this.f93199o;
        C34605m0 c34605m0 = this.f93198n;
        c23531v.mo8128f(iMo8132b, c34605m0, false);
        long j13 = c34605m0.f145694d;
        if (j13 != -9223372036854775807L && j7 >= j13) {
            j7 = Math.max(0L, j13 - 1);
        }
        c23529u.f93162G = j7;
        return true;
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: i */
    public final void mo36146i() {
    }

    @Override // p299l9.AbstractC23481a
    /* JADX INFO: renamed from: m */
    public final void mo36148m(InterfaceC23482a0 interfaceC23482a0) {
        C23529u c23529u = (C23529u) interfaceC23482a0;
        if (c23529u.f93160E != null) {
            AbstractC23481a abstractC23481a = c23529u.f93166z;
            abstractC23481a.getClass();
            abstractC23481a.mo36148m(c23529u.f93160E);
        }
        if (interfaceC23482a0 == this.f93200p) {
            this.f93200p = null;
        }
    }

    @Override // p299l9.AbstractC23507j, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: o */
    public final void mo36149o() {
        this.f93202r = false;
        this.f93201q = false;
        super.mo36149o();
    }

    @Override // p299l9.AbstractC23504h1, p299l9.AbstractC23481a
    /* JADX INFO: renamed from: r */
    public final void mo36150r(C34626x c34626x) {
        if (this.f93203s) {
            C23531v c23531v = this.f93199o;
            this.f93199o = new C23531v(new C2834g1(this.f93199o.f93108b, c34626x), c23531v.f93173c, c23531v.f93174d);
        } else {
            this.f93199o = new C23531v(new C23533w(c34626x), C34607n0.f145699q, C23531v.f93172e);
        }
        this.f93036k.mo36150r(c34626x);
    }

    @Override // p299l9.AbstractC23504h1
    /* JADX INFO: renamed from: x */
    public final C23488c0 mo68066x(C23488c0 c23488c0) {
        Object obj = c23488c0.f92976a;
        Object obj2 = this.f93199o.f93174d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C23531v.f93172e;
        }
        return c23488c0.m68053a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // p299l9.AbstractC23504h1
    /* JADX INFO: renamed from: y */
    public final void mo68057y(AbstractC34609o0 abstractC34609o0) {
        long j7;
        C23531v c23531v;
        C23488c0 c23488c0M68053a;
        C23531v c23531v2;
        if (this.f93202r) {
            C23531v c23531v3 = this.f93199o;
            this.f93199o = new C23531v(abstractC34609o0, c23531v3.f93173c, c23531v3.f93174d);
            C23529u c23529u = this.f93200p;
            if (c23529u != null) {
                m68121C(c23529u.f93162G);
            }
        } else {
            if (!abstractC34609o0.m109408p()) {
                C34607n0 c34607n0 = this.f93197m;
                abstractC34609o0.m109407n(0, c34607n0);
                long j13 = c34607n0.f145712l;
                Object obj = c34607n0.f145701a;
                C23529u c23529u2 = this.f93200p;
                if (c23529u2 != null) {
                    long j14 = c23529u2.f93164x;
                    C23531v c23531v4 = this.f93199o;
                    Object obj2 = c23529u2.f93163w.f92976a;
                    C34605m0 c34605m0 = this.f93198n;
                    c23531v4.mo8135g(obj2, c34605m0);
                    long j15 = c34605m0.f145695e + j14;
                    this.f93199o.mo8129m(0, c34607n0, 0L);
                    if (j15 != c34607n0.f145712l) {
                        j7 = j15;
                    } else {
                        j7 = j13;
                    }
                } else {
                    j7 = j13;
                }
                Pair pairM109405i = abstractC34609o0.m109405i(this.f93197m, this.f93198n, 0, j7);
                Object obj3 = pairM109405i.first;
                long jLongValue = ((Long) pairM109405i.second).longValue();
                if (this.f93203s) {
                    C23531v c23531v5 = this.f93199o;
                    c23531v = new C23531v(abstractC34609o0, c23531v5.f93173c, c23531v5.f93174d);
                } else {
                    c23531v = new C23531v(abstractC34609o0, obj, obj3);
                }
                this.f93199o = c23531v;
                C23529u c23529u3 = this.f93200p;
                if (c23529u3 != null && m68121C(jLongValue)) {
                    C23488c0 c23488c0 = c23529u3.f93163w;
                    Object obj4 = c23488c0.f92976a;
                    if (this.f93199o.f93174d != null && obj4.equals(C23531v.f93172e)) {
                        obj4 = this.f93199o.f93174d;
                    }
                    c23488c0M68053a = c23488c0.m68053a(obj4);
                }
                this.f93203s = true;
                this.f93202r = true;
                m68048l(this.f93199o);
                if (c23488c0M68053a != null) {
                    C23529u c23529u4 = this.f93200p;
                    c23529u4.getClass();
                    c23529u4.m68107g(c23488c0M68053a);
                }
            }
            if (this.f93203s) {
                C23531v c23531v6 = this.f93199o;
                c23531v2 = new C23531v(abstractC34609o0, c23531v6.f93173c, c23531v6.f93174d);
            } else {
                c23531v2 = new C23531v(abstractC34609o0, C34607n0.f145699q, C23531v.f93172e);
            }
            this.f93199o = c23531v2;
        }
        c23488c0M68053a = null;
        this.f93203s = true;
        this.f93202r = true;
        m68048l(this.f93199o);
        if (c23488c0M68053a != null) {
            C23529u c23529u5 = this.f93200p;
            c23529u5.getClass();
            c23529u5.m68107g(c23488c0M68053a);
        }
    }
}
