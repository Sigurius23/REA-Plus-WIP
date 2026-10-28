package p076d;

import java.io.IOException;
import p031b9.AbstractC2875y;
import ro.C31624i;
import s30.AbstractC32103e;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: d.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11316u0 extends AbstractC11272b1 {

    /* JADX INFO: renamed from: a */
    public final C11312s0 f36258a;

    /* JADX INFO: renamed from: b */
    public final C11294j0 f36259b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11272b1 f36260c;

    /* JADX INFO: renamed from: d */
    public final int f36261d;

    /* JADX INFO: renamed from: e */
    public final AbstractC11272b1 f36262e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f36263f = 1;

    public C11316u0(C11321x c11321x) {
        AbstractC11272b1 abstractC11272b1Mo30482d;
        int i13 = 0;
        AbstractC11272b1 abstractC11272b1M30529l = m30529l(c11321x, 0);
        if (abstractC11272b1M30529l instanceof C11312s0) {
            this.f36258a = (C11312s0) abstractC11272b1M30529l;
            abstractC11272b1M30529l = m30529l(c11321x, 1);
            i13 = 1;
        }
        if (abstractC11272b1M30529l instanceof C11294j0) {
            this.f36259b = (C11294j0) abstractC11272b1M30529l;
            i13++;
            abstractC11272b1M30529l = m30529l(c11321x, i13);
        }
        if (!(abstractC11272b1M30529l instanceof C11277d0)) {
            this.f36260c = abstractC11272b1M30529l;
            i13++;
            abstractC11272b1M30529l = m30529l(c11321x, i13);
        }
        if (c11321x.f36215a.length != i13 + 1) {
            throw new IllegalArgumentException("input sequence too large");
        }
        if (!(abstractC11272b1M30529l instanceof C11277d0)) {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        C11277d0 c11277d0 = (C11277d0) abstractC11272b1M30529l;
        int i14 = c11277d0.f36194b;
        int i15 = c11277d0.f36195c;
        if (i15 < 0 || i15 > 2) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i15, "invalid encoding value: "));
        }
        this.f36261d = i15;
        if (i14 != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i14 != 64 ? i14 != 128 ? i14 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
        if (i15 != 0) {
            if (i15 == 1) {
                abstractC11272b1Mo30482d = (AbstractC11322x0) AbstractC11322x0.f36275b.m384d(c11277d0);
            } else {
                if (i15 != 2) {
                    throw new IllegalArgumentException("invalid tag: " + AbstractC37926s0.m121470h(i14, i15));
                }
                abstractC11272b1Mo30482d = (AbstractC11285g) AbstractC11285g.f36205b.m384d(c11277d0);
            }
        } else {
            if (!c11277d0.m30487l()) {
                throw new IllegalStateException("object implicit - explicit expected.");
            }
            InterfaceC11307q interfaceC11307q = c11277d0.f36196d;
            abstractC11272b1Mo30482d = interfaceC11307q instanceof AbstractC11272b1 ? (AbstractC11272b1) interfaceC11307q : interfaceC11307q.mo30482d();
            abstractC11272b1Mo30482d.getClass();
        }
        this.f36262e = abstractC11272b1Mo30482d;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC11272b1 m30529l(C11321x c11321x, int i13) {
        InterfaceC11307q[] interfaceC11307qArr = c11321x.f36215a;
        if (interfaceC11307qArr.length > i13) {
            return interfaceC11307qArr[i13].mo30482d();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        return m30530m().mo30479c(z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        c31624i.m97709n(40, z4);
        m30530m().mo30480f(c31624i, false);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: g */
    public final boolean mo30474g(AbstractC11272b1 abstractC11272b1) {
        Object obj;
        C11294j0 c11294j0;
        Object obj2;
        AbstractC11272b1 abstractC11272b2;
        if (this == abstractC11272b1) {
            return true;
        }
        if (!(abstractC11272b1 instanceof C11316u0)) {
            return false;
        }
        C11316u0 c11316u0 = (C11316u0) abstractC11272b1;
        Object obj3 = c11316u0.f36258a;
        C11312s0 c11312s0 = this.f36258a;
        if ((c11312s0 == obj3 || (c11312s0 != null && obj3 != null && c11312s0.equals(obj3))) && (((c11294j0 = this.f36259b) == (obj = c11316u0.f36259b) || (c11294j0 != null && obj != null && c11294j0.equals(obj))) && (((abstractC11272b2 = this.f36260c) == (obj2 = c11316u0.f36260c) || (abstractC11272b2 != null && obj2 != null && abstractC11272b2.equals(obj2))) && this.f36261d == c11316u0.f36261d))) {
            AbstractC11272b1 abstractC11272b3 = c11316u0.f36262e;
            AbstractC11272b1 abstractC11272b4 = this.f36262e;
            if (abstractC11272b4 == abstractC11272b3) {
                abstractC11272b4.getClass();
            } else if (abstractC11272b4.mo30474g(abstractC11272b3)) {
            }
            return true;
        }
        return false;
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: h */
    public final boolean mo30475h() {
        return true;
    }

    @Override // p076d.AbstractC11272b1
    public final int hashCode() {
        C11312s0 c11312s0 = this.f36258a;
        int iM99883e = c11312s0 == null ? 0 : AbstractC32103e.m99883e(c11312s0.f36248a);
        C11294j0 c11294j0 = this.f36259b;
        int iM99883e2 = iM99883e ^ (c11294j0 == null ? 0 : AbstractC32103e.m99883e(c11294j0.f36222a));
        AbstractC11272b1 abstractC11272b1 = this.f36260c;
        return (((abstractC11272b1 != null ? abstractC11272b1.hashCode() : 0) ^ iM99883e2) ^ this.f36261d) ^ this.f36262e.hashCode();
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public AbstractC11272b1 mo30476j() {
        switch (this.f36263f) {
            case 1:
                return this;
            default:
                return new C11316u0(this.f36258a, this.f36259b, this.f36260c, this.f36261d, this.f36262e);
        }
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        int i13 = this.f36263f;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC11290h1 m30530m() {
        switch (this.f36263f) {
            case 0:
                C11311s c11311s = new C11311s(4);
                C11312s0 c11312s0 = this.f36258a;
                if (c11312s0 != null) {
                    c11311s.m30522e(c11312s0);
                }
                C11294j0 c11294j0 = this.f36259b;
                if (c11294j0 != null) {
                    c11311s.m30522e(c11294j0);
                }
                AbstractC11272b1 abstractC11272b1 = this.f36260c;
                if (abstractC11272b1 != null) {
                    c11311s.m30522e(abstractC11272b1.mo30477k());
                }
                int i13 = this.f36261d;
                c11311s.m30522e(new C11277d0(i13 == 0, i13, this.f36262e, 2));
                C11321x c11321x = new C11321x(c11311s, 1);
                c11321x.f36274c = -1;
                return c11321x;
            default:
                C11311s c11311s2 = new C11311s(4);
                C11312s0 c11312s1 = this.f36258a;
                if (c11312s1 != null) {
                    c11311s2.m30522e(c11312s1);
                }
                C11294j0 c11294j1 = this.f36259b;
                if (c11294j1 != null) {
                    c11311s2.m30522e(c11294j1);
                }
                AbstractC11272b1 abstractC11272b2 = this.f36260c;
                if (abstractC11272b2 != null) {
                    c11311s2.m30522e(abstractC11272b2.mo30476j());
                }
                int i14 = this.f36261d;
                c11311s2.m30522e(new C11277d0(i14 == 0, i14, this.f36262e, 0));
                C11321x c11321x2 = new C11321x(c11311s2, 0);
                c11321x2.f36274c = -1;
                return c11321x2;
        }
    }

    public C11316u0(C11312s0 c11312s0, C11294j0 c11294j0, AbstractC11272b1 abstractC11272b1, int i13, AbstractC11272b1 abstractC11272b2) {
        this.f36258a = c11312s0;
        this.f36259b = c11294j0;
        this.f36260c = abstractC11272b1;
        if (i13 >= 0 && i13 <= 2) {
            this.f36261d = i13;
            if (i13 != 1) {
                if (i13 == 2 && !AbstractC11285g.class.isInstance(abstractC11272b2)) {
                    throw new IllegalStateException("unexpected object: ".concat(abstractC11272b2.getClass().getName()));
                }
            } else if (!AbstractC11322x0.class.isInstance(abstractC11272b2)) {
                throw new IllegalStateException("unexpected object: ".concat(abstractC11272b2.getClass().getName()));
            }
            this.f36262e = abstractC11272b2;
            return;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "invalid encoding value: "));
    }
}
