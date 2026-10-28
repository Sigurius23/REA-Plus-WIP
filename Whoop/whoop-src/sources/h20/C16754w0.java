package h20;

import a30.C0273a;
import a30.C0290f1;
import a30.C0307l0;
import a33.C0352d;
import androidx.lifecycle.C1601k1;
import as1.C1949j;
import b00.C2179a;
import b30.C2539i0;
import b30.C2624t0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import e30.AbstractC12605c;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import java.util.Iterator;
import java.util.List;
import k20.C22136a;
import k20.C22146k;
import l83.C23470p;
import n53.C26318e;
import n83.C26460c;
import p133f1.C13989w1;
import p352ny.C27232d;
import p470rv.AbstractC31834n;
import p547v8.AbstractC35785b;
import p599wz.AbstractC37760u0;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37736m0;
import p599wz.C37751r0;
import p599wz.EnumC37721h0;
import p631xz.C38721f0;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29828m;
import q20.C29838w;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import r20.C30866d;
import r20.C30868f;
import r20.C30869g;
import r20.C30874l;
import r20.C30877o;
import se.AbstractC32417h;
import u00.C34377e;
import ug.AbstractC34924m;
import v00.C35459c0;
import wb3.AbstractC37056f;
import y00.C38915o4;
import z20.C40013g;

/* JADX INFO: renamed from: h20.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16754w0 extends AbstractC12605c {

    /* JADX INFO: renamed from: c0 */
    public final C16652f0 f64344c0;

    /* JADX INFO: renamed from: d0 */
    public final C38721f0 f64345d0;

    /* JADX INFO: renamed from: e0 */
    public final C34377e f64346e0;

    /* JADX INFO: renamed from: f0 */
    public final C37751r0 f64347f0;

    /* JADX INFO: renamed from: g0 */
    public final C13096w1 f64348g0;

    /* JADX INFO: renamed from: h0 */
    public final C13096w1 f64349h0;

    /* JADX INFO: renamed from: i0 */
    public final C13045h2 f64350i0;

    /* JADX INFO: renamed from: j0 */
    public final C13045h2 f64351j0;

    /* JADX INFO: renamed from: k0 */
    public final C13081r1 f64352k0;

    /* JADX INFO: renamed from: l0 */
    public final C23470p f64353l0;

    /* JADX INFO: renamed from: m0 */
    public final C26318e f64354m0;

    /* JADX INFO: renamed from: n0 */
    public InterfaceC16640d0 f64355n0;

    /* JADX INFO: renamed from: o0 */
    public final C26318e f64356o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16754w0(C16652f0 c16652f0, C38721f0 linkAccountHolder, C34377e c34377e, C37751r0 linkPaymentLauncher, C22136a eventReporter, C40013g customerRepository, InterfaceC30063j workContext, C1601k1 c1601k1, C16759x linkHandler, C41193o c41193o, C27232d c27232d, EventReporter$Mode mode) {
        List listM118988k;
        super(c16652f0.f64031x, eventReporter, customerRepository, workContext, c1601k1, linkHandler, c41193o, false, c27232d, mode);
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(linkPaymentLauncher, "linkPaymentLauncher");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(customerRepository, "customerRepository");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(linkHandler, "linkHandler");
        AbstractC22676k.m65750j(mode, "mode");
        this.f64344c0 = c16652f0;
        this.f64345d0 = linkAccountHolder;
        this.f64346e0 = c34377e;
        this.f64347f0 = linkPaymentLauncher;
        C16761x1 c16761x1 = this.f43025w;
        C26318e c26318e = this.f43009M.f127270g;
        C26318e c26318e2 = this.f43024b0;
        C0290f1 c0290f1 = c16652f0.f64030w;
        C35459c0 c35459c0 = c0290f1.f1019E;
        C0273a c0273a = c0290f1.f1021x;
        C35459c0 c35459c1 = c0290f1.f1019E;
        C13081r1 c13081r1M9493Z = AbstractC3269g.m9493Z(c35459c0);
        C13081r1 c13081r1 = this.f43012P;
        C13045h2 c13045h2 = this.f43015S;
        C0352d c0352d = new C0352d(c16761x1, c26318e, c26318e2, c13081r1M9493Z, c13081r1, c13045h2, this.f43020X, new C13989w1(20, this, eventReporter), new C2539i0(0, this, C16754w0.class, "onDisabledClick", "onDisabledClick()V", 0, 8));
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, null, 6);
        this.f64348g0 = c13096w1M36592b;
        this.f64349h0 = c13096w1M36592b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f64350i0 = c13045h2M36593c;
        this.f64351j0 = c13045h2M36593c;
        this.f64352k0 = AbstractC13091v.m36598h(AbstractC13091v.m36593c(null));
        this.f64353l0 = AbstractC30060g.m92088H(new C16742u0(this, 0));
        this.f64354m0 = AbstractC3269g.m9511r(linkHandler.f64393c, linkHandler.f64391a.f161687c, this.f43024b0, this.f43012P, linkAccountHolder.f166664b, new C2624t0(this, 2));
        AbstractC29840y abstractC29840y = c0290f1.f1022y;
        this.f64355n0 = abstractC29840y instanceof AbstractC29835t ? new C16634c0((AbstractC29835t) abstractC29840y) : abstractC29840y instanceof C29818g ? new C16622a0((C29818g) abstractC29840y) : abstractC29840y instanceof C29822i ? new C16628b0((C29822i) abstractC29840y) : null;
        this.f64356o0 = AbstractC3269g.m9510q(c26318e, c26318e2, c13081r1, c13045h2, new C1949j(c0352d, 4));
        AbstractC31834n.m98894c(this, c1601k1);
        linkAccountHolder.m124147a(c16652f0.f64032y);
        linkHandler.m47278c(c35459c1.f150995l0);
        if (this.f43008L.getValue() == null) {
            this.f43007K.m36570j(c35459c1);
        }
        this.f43022Z.m47225a(c0273a);
        m35340z(abstractC29840y);
        C30866d c30866d = this.f43009M;
        C16651f c16651f = this.f43022Z;
        if (m35331o() != EnumC16762x2.f64427w) {
            listM118988k = AbstractC32417h.m101216y(this, c35459c1, c16651f);
        } else {
            Object c30869g = ((c0273a == null || c0273a.f935w.isEmpty()) && !c35459c1.f150974Q) ? new C30869g(AbstractC34924m.m110157r(this, c35459c1)) : new C30877o(AbstractC35785b.m113418m(this, c35459c1, c16651f, this.f43023a0), C30874l.f127308a);
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            c26460cM119000x.add(c30869g);
            if ((c30869g instanceof C30877o) && this.f64355n0 != null) {
                c26460cM119000x.add(new C30868f(AbstractC34924m.m110157r(this, c35459c1)));
            }
            listM118988k = AbstractC37056f.m118988k(c26460cM119000x);
        }
        c30866d.m94921d(listM118988k);
    }

    /* JADX INFO: renamed from: A */
    public final void m47264A() {
        mo35327g();
        AbstractC29840y abstractC29840y = (AbstractC29840y) this.f43012P.f45200w.getValue();
        if (abstractC29840y != null) {
            this.f43026x.m63399s(abstractC29840y);
            C16652f0 c16652f0 = this.f64344c0;
            C0307l0 c0307l0 = c16652f0.f64030w.f1019E.f150995l0;
            C38721f0 c38721f0 = this.f64345d0;
            if (c0307l0 != null) {
                C37718g0 configuration = c0307l0.f1058w;
                if (abstractC29840y instanceof C29828m) {
                    this.f64346e0.getClass();
                    AbstractC22676k.m65750j(configuration, "configuration");
                    C2179a c2179a = new C2179a(configuration);
                    if (c2179a.m6861b() && !c2179a.f8664d) {
                        C37718g0 c37718g0 = c0307l0.f1058w;
                        C35459c0 c35459c0 = c16652f0.f64030w.f1019E;
                        C37736m0 c37736m0 = new C37736m0(null);
                        this.f64347f0.m121159b(c35459c0, (C37708d) c38721f0.f166664b.f45200w.getValue(), c37718g0, EnumC37721h0.f161650x, c37736m0);
                        return;
                    }
                }
            }
            this.f64348g0.mo36564a(new C16694m0(m47265B(abstractC29840y), (C37708d) c38721f0.f166664b.f45200w.getValue(), (List) ((InterfaceC4339a) this.f43022Z.f64022c.f104635y).invoke()));
        }
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC29840y m47265B(AbstractC29840y abstractC29840y) {
        if (!(abstractC29840y instanceof C29828m)) {
            return abstractC29840y;
        }
        AbstractC37760u0 abstractC37760u0 = null;
        if (((C37708d) this.f64345d0.f166664b.f45200w.getValue()).f161571w == null) {
            return C29828m.m91328h((C29828m) abstractC29840y, null);
        }
        C29828m c29828m = (C29828m) abstractC29840y;
        AbstractC37760u0 abstractC37760u1 = c29828m.f121916y;
        if (abstractC37760u1 == null) {
            AbstractC29840y abstractC29840y2 = this.f64344c0.f64030w.f1022y;
            C29828m c29828m2 = abstractC29840y2 instanceof C29828m ? (C29828m) abstractC29840y2 : null;
            if (c29828m2 != null) {
                abstractC37760u0 = c29828m2.f121916y;
            }
        } else {
            abstractC37760u0 = abstractC37760u1;
        }
        return C29828m.m91328h(c29828m, abstractC37760u0);
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: g */
    public final void mo35327g() {
        this.f64350i0.m36570j(null);
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: j */
    public final InterfaceC13037f2 mo35328j() {
        return this.f64351j0;
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: n */
    public final InterfaceC16640d0 mo35330n() {
        return this.f64355n0;
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: p */
    public final C26318e mo35332p() {
        return this.f64356o0;
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: q */
    public final InterfaceC13037f2 mo35333q() {
        return this.f64352k0;
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: r */
    public final InterfaceC13037f2 mo35334r() {
        return this.f64354m0;
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: u */
    public final void mo35336u(AbstractC29840y abstractC29840y) {
        m35340z(abstractC29840y);
        if (abstractC29840y == null || !abstractC29840y.mo91323b()) {
            m47264A();
        }
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: v */
    public final void mo35337v(InterfaceC41211c interfaceC41211c) {
        this.f64350i0.m36570j(interfaceC41211c);
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: w */
    public final void mo35338w() {
        Object next;
        C22136a c22136a = this.f43026x;
        c22136a.getClass();
        C22136a.m63387i(c22136a, new C22146k(2));
        C37708d c37708d = (C37708d) this.f64345d0.f166664b.f45200w.getValue();
        AbstractC29840y abstractC29840y = this.f64344c0.f64030w.f1022y;
        AbstractC29840y abstractC29840yM47265B = abstractC29840y != null ? m47265B(abstractC29840y) : null;
        boolean z4 = abstractC29840yM47265B instanceof C29838w;
        C16651f c16651f = this.f43022Z;
        if (z4) {
            C29838w c29838w = (C29838w) abstractC29840yM47265B;
            Iterator it = ((List) ((InterfaceC4339a) c16651f.f64022c.f104635y).invoke()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((C38915o4) next).f167527w, c29838w.f121955x.f167527w));
            C38915o4 c38915o4 = (C38915o4) next;
            abstractC29840yM47265B = c38915o4 != null ? C29838w.m91333h(c29838w, c38915o4, null, 6) : null;
        }
        this.f64348g0.mo36564a(new C16688l0(null, abstractC29840yM47265B, (List) ((InterfaceC4339a) c16651f.f64022c.f104635y).invoke(), c37708d));
    }

    @Override // e30.AbstractC12605c
    /* JADX INFO: renamed from: y */
    public final void mo35339y(InterfaceC16640d0 interfaceC16640d0) {
        this.f64355n0 = interfaceC16640d0;
    }
}
