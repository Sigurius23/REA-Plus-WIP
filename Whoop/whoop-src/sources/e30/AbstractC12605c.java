package e30;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import b30.C2624t0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import d30.C11529f;
import do0.C12229c;
import dw1.C12413a;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.InterfaceC13037f2;
import g40.C15352f4;
import h00.C16513l0;
import h20.C16622a0;
import h20.C16628b0;
import h20.C16634c0;
import h20.C16651f;
import h20.C16670i0;
import h20.C16759x;
import h20.C16761x1;
import h20.C16771z;
import h20.C16776z4;
import h20.EnumC16762x2;
import h20.InterfaceC16640d0;
import hc3.AbstractC17182o;
import i20.AbstractC17952j;
import i20.C17926a0;
import i20.C17988y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import k20.C22136a;
import k20.C22139d;
import kc3.C22365e;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import n53.C26318e;
import ou1.C28376a;
import p007a6.C0416e;
import p077d0.C11387o2;
import p078d1.C11457j;
import p133f1.C13968p1;
import p203hy.C17718g;
import p337n8.C26444a;
import p352ny.C27232d;
import p695zx.C41193o;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29838w;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r20.C30866d;
import r20.C30872j;
import u00.C34378f;
import v00.C35459c0;
import wb3.AbstractC37056f;
import x30.C37884e0;
import y00.C38915o4;
import y00.C38939r1;
import y00.C39013z3;
import y00.EnumC38828f4;
import y00.EnumC38853i;
import y00.EnumC38930q1;
import z20.C40013g;

/* JADX INFO: renamed from: e30.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12605c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C16759x f43001E;

    /* JADX INFO: renamed from: F */
    public final C41193o f43002F;

    /* JADX INFO: renamed from: G */
    public final boolean f43003G;

    /* JADX INFO: renamed from: H */
    public final C27232d f43004H;

    /* JADX INFO: renamed from: I */
    public final EventReporter$Mode f43005I;

    /* JADX INFO: renamed from: J */
    public final C17988y0 f43006J;

    /* JADX INFO: renamed from: K */
    public final C13045h2 f43007K;

    /* JADX INFO: renamed from: L */
    public final C13045h2 f43008L;

    /* JADX INFO: renamed from: M */
    public final C30866d f43009M;

    /* JADX INFO: renamed from: N */
    public final C11457j f43010N;

    /* JADX INFO: renamed from: O */
    public final C13096w1 f43011O;

    /* JADX INFO: renamed from: P */
    public final C13081r1 f43012P;

    /* JADX INFO: renamed from: Q */
    public final C13081r1 f43013Q;

    /* JADX INFO: renamed from: R */
    public final C13045h2 f43014R;

    /* JADX INFO: renamed from: S */
    public final C13045h2 f43015S;

    /* JADX INFO: renamed from: T */
    public final C16771z f43016T;

    /* JADX INFO: renamed from: U */
    public final C13045h2 f43017U;

    /* JADX INFO: renamed from: V */
    public final C13045h2 f43018V;

    /* JADX INFO: renamed from: W */
    public final C13045h2 f43019W;

    /* JADX INFO: renamed from: X */
    public final C13045h2 f43020X;

    /* JADX INFO: renamed from: Y */
    public final C22139d f43021Y;

    /* JADX INFO: renamed from: Z */
    public final C16651f f43022Z;

    /* JADX INFO: renamed from: a0 */
    public final C16776z4 f43023a0;

    /* JADX INFO: renamed from: b0 */
    public final C26318e f43024b0;

    /* JADX INFO: renamed from: w */
    public final C16761x1 f43025w;

    /* JADX INFO: renamed from: x */
    public final C22136a f43026x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC30063j f43027y;

    /* JADX INFO: renamed from: z */
    public final C1601k1 f43028z;

    public AbstractC12605c(C16761x1 config, C22136a eventReporter, C40013g customerRepository, InterfaceC30063j workContext, C1601k1 savedStateHandle, C16759x linkHandler, C41193o cardAccountRangeRepositoryFactory, boolean z4, C27232d tapToAddCollectionHandler, EventReporter$Mode mode) {
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(customerRepository, "customerRepository");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(linkHandler, "linkHandler");
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(tapToAddCollectionHandler, "tapToAddCollectionHandler");
        AbstractC22676k.m65750j(mode, "mode");
        this.f43025w = config;
        this.f43026x = eventReporter;
        this.f43027y = workContext;
        this.f43028z = savedStateHandle;
        this.f43001E = linkHandler;
        this.f43002F = cardAccountRangeRepositoryFactory;
        this.f43003G = z4;
        this.f43004H = tapToAddCollectionHandler;
        this.f43005I = mode;
        C17988y0 c17988y0 = new C17988y0(new C17926a0(config.f64405H));
        this.f43006J = c17988y0;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f43007K = c13045h2M36593c;
        this.f43008L = c13045h2M36593c;
        C30866d c30866d = new C30866d(AbstractC1640x1.m5043b(this), C30872j.f127299w, true, new C11529f(this, 3));
        this.f43009M = c30866d;
        this.f43010N = new C11457j(c17988y0, new C13968p1(config.f64419V, AbstractC17952j.f69732a));
        this.f43011O = AbstractC13091v.m36592b(0, 0, null, 7);
        C13081r1 c13081r1M5002c = savedStateHandle.m5002c(null, "selection");
        this.f43012P = c13081r1M5002c;
        C13081r1 c13081r1M5002c2 = savedStateHandle.m5002c(Boolean.FALSE, "processing");
        this.f43013Q = c13081r1M5002c2;
        this.f43014R = AbstractC13091v.m36593c(null);
        this.f43015S = AbstractC13091v.m36593c(null);
        this.f43016T = new C16771z(AbstractC1640x1.m5043b(this), c13081r1M5002c, config.f64423w, new C12603a(this, 2), new C12603a(this, 3));
        int i13 = 4;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(new C37884e0(new C11387o2(10), AbstractC3269g.m9493Z(EnumC38853i.Unknown), i13));
        this.f43017U = c13045h2M36593c2;
        this.f43018V = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(Boolean.TRUE);
        this.f43019W = c13045h2M36593c3;
        this.f43020X = c13045h2M36593c3;
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        C12603a c12603a = new C12603a(this, 0);
        C26318e c26318e = c30866d.f127270g;
        this.f43021Y = new C22139d(savedStateHandle, eventReporter, c26318e, c26444aM5043b, c12603a);
        C16651f c16651f = new C16651f(AbstractC3269g.m9484M(c13045h2M36593c, new C16513l0(5)), savedStateHandle, c13081r1M5002c);
        this.f43022Z = c16651f;
        C26444a c26444aM5043b2 = AbstractC1640x1.m5043b(this);
        C22365e c22365e = AbstractC3050q0.f12077a;
        C16776z4 c16776z4 = new C16776z4(c13045h2M36593c, eventReporter, c26444aM5043b2, workContext, AbstractC17182o.f65999a, customerRepository, c13081r1M5002c, new C15352f4(1, this, AbstractC12605c.class, "updateSelection", "updateSelection(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0, 6), c16651f, new C0416e(this, null, i13), new C28376a(7), new C2624t0(this, 3), linkHandler.f64393c, !z4);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C16670i0(this, c16776z4, (InterfaceC30057d) null, 3), 3);
        this.f43023a0 = c16776z4;
        this.f43024b0 = AbstractC3269g.m9509p(c13081r1M5002c2, AbstractC3269g.m9518y(c26318e, new C12229c(18)), new C12413a(2));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C12604b(this, null, 0), 3);
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo35327g();

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC13037f2 mo35328j();

    /* JADX INFO: renamed from: l */
    public final String m35329l() {
        String strMo47220d;
        InterfaceC16640d0 interfaceC16640d0Mo35330n = mo35330n();
        if (interfaceC16640d0Mo35330n != null && (strMo47220d = interfaceC16640d0Mo35330n.mo47220d()) != null) {
            return strMo47220d;
        }
        Object value = this.f43008L.getValue();
        AbstractC22676k.m65747g(value);
        return (String) AbstractC25265s.m74096F0(((C35459c0) value).m112535S());
    }

    /* JADX INFO: renamed from: n */
    public abstract InterfaceC16640d0 mo35330n();

    /* JADX INFO: renamed from: o */
    public final EnumC16762x2 m35331o() {
        EnumC16762x2 enumC16762x2 = this.f43025w.f64412O;
        C35459c0 c35459c0 = (C35459c0) this.f43008L.getValue();
        C38939r1 c38939r1 = c35459c0 != null ? c35459c0.f150993j0 : null;
        if (c35459c0 != null && c38939r1 != null) {
            Map map = c38939r1.f167624x;
            if (enumC16762x2 == EnumC16762x2.f64429y) {
                for (EnumC38930q1 experiment : AbstractC37056f.m118959K(EnumC38930q1.OCS_MOBILE_HORIZONTAL_MODE_ANDROID_AA, EnumC38930q1.OCS_MOBILE_HORIZONTAL_MODE_AA, EnumC38930q1.OCS_MOBILE_HORIZONTAL_MODE)) {
                    String str = (String) map.get(experiment);
                    if (str != null) {
                        boolean z4 = !((Collection) ((InterfaceC4339a) this.f43022Z.f64022c.f104635y).invoke()).isEmpty();
                        AbstractC22676k.m65750j(experiment, "experiment");
                        EventReporter$Mode mode = this.f43005I;
                        AbstractC22676k.m65750j(mode, "mode");
                        String str2 = c38939r1.f167623w;
                        ArrayList arrayListM112532J = c35459c0.m112532J();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112532J, 10));
                        Iterator it = arrayListM112532J.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C34378f) it.next()).f144467a);
                        }
                        boolean z13 = c35459c0.f150974Q;
                        this.f43026x.m63391k(new C17718g(experiment, str2, str, AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("displayed_payment_method_types", AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62)), new C23465k("displayed_payment_method_types_including_wallets", AbstractC25265s.m74110N0(AbstractC25265s.m74092D0(AbstractC25265s.m74128f1(c35459c0.f150995l0 != null ? "link" : null, AbstractC25265s.m74128f1(z13 ? "google_pay" : null, arrayList))), ",", null, null, null, 62)), new C23465k("in_app_elements_integration_type", mode.f22386w)), AbstractC25247g0.m73989X(new C23465k("has_saved_payment_method", String.valueOf(z4))))));
                    }
                    enumC16762x2 = enumC16762x2;
                    c35459c0 = c35459c0;
                }
                EnumC16762x2 enumC16762x3 = enumC16762x2;
                String str3 = (String) map.get(EnumC38930q1.OCS_MOBILE_HORIZONTAL_MODE);
                if (str3 == null) {
                    return enumC16762x3;
                }
                if (str3.equals("control")) {
                    return EnumC16762x2.f64428x;
                }
                return str3.equals("treatment") ? EnumC16762x2.f64427w : enumC16762x3;
            }
        }
        return enumC16762x2;
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        super.onCleared();
        mo35339y(null);
        this.f43028z.m5004e(null, "selection");
    }

    /* JADX INFO: renamed from: p */
    public abstract C26318e mo35332p();

    /* JADX INFO: renamed from: q */
    public abstract InterfaceC13037f2 mo35333q();

    /* JADX INFO: renamed from: r */
    public abstract InterfaceC13037f2 mo35334r();

    /* JADX INFO: renamed from: t */
    public final void m35335t() {
        if (((Boolean) this.f43013Q.f45200w.getValue()).booleanValue()) {
            return;
        }
        C30866d c30866d = this.f43009M;
        if (c30866d.m94918a()) {
            c30866d.m94919b();
        } else {
            mo35338w();
        }
    }

    /* JADX INFO: renamed from: u */
    public abstract void mo35336u(AbstractC29840y abstractC29840y);

    /* JADX INFO: renamed from: v */
    public abstract void mo35337v(InterfaceC41211c interfaceC41211c);

    /* JADX INFO: renamed from: w */
    public abstract void mo35338w();

    /* JADX INFO: renamed from: y */
    public abstract void mo35339y(InterfaceC16640d0 interfaceC16640d0);

    /* JADX INFO: renamed from: z */
    public final void m35340z(AbstractC29840y abstractC29840y) {
        EnumC38853i enumC38853i;
        if (abstractC29840y instanceof AbstractC29835t) {
            mo35339y(new C16634c0((AbstractC29835t) abstractC29840y));
        } else if (abstractC29840y instanceof C29818g) {
            mo35339y(new C16622a0((C29818g) abstractC29840y));
        } else if (abstractC29840y instanceof C29822i) {
            mo35339y(new C16628b0((C29822i) abstractC29840y));
        }
        this.f43028z.m5004e(abstractC29840y, "selection");
        if (abstractC29840y instanceof C29838w) {
            C38915o4 c38915o4 = ((C29838w) abstractC29840y).f121955x;
            if (c38915o4.f167511E == EnumC38828f4.f167090I) {
                C11387o2 c11387o2 = new C11387o2(10);
                C39013z3 c39013z3 = c38915o4.f167514H;
                if (c39013z3 == null || (enumC38853i = c39013z3.f167918w) == null) {
                    enumC38853i = EnumC38853i.Unknown;
                }
                C37884e0 c37884e0 = new C37884e0(c11387o2, AbstractC3269g.m9493Z(enumC38853i), 4);
                C13045h2 c13045h2 = this.f43017U;
                c13045h2.getClass();
                c13045h2.m36571k(null, c37884e0);
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C12604b(this, null, 1), 3);
            }
        }
        mo35327g();
    }
}
