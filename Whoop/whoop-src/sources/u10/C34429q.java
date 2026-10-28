package u10;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import k20.C22136a;
import k20.C22144i;
import k20.C22146k;
import n53.C26318e;
import p510u0.C34350r;
import p715kotlin.NoWhenBranchMatchedException;
import p730qt2.C30599e;
import r20.C30865c;
import r20.C30866d;

/* JADX INFO: renamed from: u10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C34429q {

    /* JADX INFO: renamed from: a */
    public final C22136a f144666a;

    /* JADX INFO: renamed from: b */
    public final C30866d f144667b;

    /* JADX INFO: renamed from: c */
    public final C26318e f144668c;

    /* JADX INFO: renamed from: d */
    public final C13096w1 f144669d;

    /* JADX INFO: renamed from: e */
    public final C13078q1 f144670e;

    public C34429q(InterfaceC2994c0 interfaceC2994c0, AbstractC34428p abstractC34428p, C22136a c22136a) {
        C30866d c30866d = new C30866d(interfaceC2994c0, abstractC34428p, false, new C34350r(12));
        this.f144666a = c22136a;
        this.f144667b = c30866d;
        C26318e c26318e = c30866d.f127270g;
        this.f144668c = c26318e;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.f144669d = c13096w1M36592b;
        this.f144670e = AbstractC13091v.m36597g(c13096w1M36592b);
        AbstractC34428p abstractC34428p2 = (AbstractC34428p) ((InterfaceC4339a) c26318e.f104635y).invoke();
        if (abstractC34428p2 instanceof C34426n) {
            C22136a.m63387i(c22136a, new C22144i(c22136a.f85863a, 4));
        } else {
            if (!(abstractC34428p2 instanceof C34427o)) {
                throw new NoWhenBranchMatchedException();
            }
            C22136a.m63387i(c22136a, new C22146k(4));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m108796a(AbstractC34422j abstractC34422j) {
        boolean z4 = abstractC34422j instanceof C34423k;
        C22136a c22136a = this.f144666a;
        C13096w1 c13096w1 = this.f144669d;
        C26318e c26318e = this.f144668c;
        C30866d c30866d = this.f144667b;
        if (z4) {
            AbstractC34428p abstractC34428p = (AbstractC34428p) ((InterfaceC4339a) c26318e.f104635y).invoke();
            if (!(abstractC34428p instanceof C34426n)) {
                if (!(abstractC34428p instanceof C34427o)) {
                    throw new NoWhenBranchMatchedException();
                }
                c22136a.getClass();
                C22136a.m63387i(c22136a, new C22146k(3));
            }
            if (c30866d.m94918a()) {
                c30866d.m94919b();
                return;
            } else {
                c13096w1.mo36564a(null);
                return;
            }
        }
        if (abstractC34422j instanceof C34424l) {
            AbstractC34428p abstractC34428p2 = (AbstractC34428p) ((InterfaceC4339a) c26318e.f104635y).invoke();
            if (!(abstractC34428p2 instanceof C34426n)) {
                if (!(abstractC34428p2 instanceof C34427o)) {
                    throw new NoWhenBranchMatchedException();
                }
                c22136a.getClass();
                C22136a.m63387i(c22136a, new C22146k(3));
            }
            c13096w1.mo36564a(Boolean.valueOf(((C34424l) abstractC34422j).f144662b));
            return;
        }
        if (!(abstractC34422j instanceof C34425m)) {
            throw new NoWhenBranchMatchedException();
        }
        C34427o c34427o = ((C34425m) abstractC34422j).f144663b;
        c30866d.getClass();
        C30599e c30599e = new C30599e(7, c30866d, c34427o);
        if (!c30866d.f127268e.getAndSet(true)) {
            AbstractC3006f0.m8732z(c30866d.f127264a, null, null, new C30865c(c30599e, c30866d, null), 3);
        }
        c22136a.getClass();
        C22136a.m63387i(c22136a, new C22146k(4));
    }
}
