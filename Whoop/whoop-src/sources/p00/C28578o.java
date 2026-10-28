package p00;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bm.C3383g;
import c93.InterfaceC4339a;
import com.stripe.android.p056ui.core.elements.OTPSpec;
import d00.C11425d;
import d00.C11431j;
import d00.C11433l;
import d00.C11434m;
import d00.InterfaceC11432k;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13105z1;
import ec3.InterfaceC13075p1;
import g40.C15399o1;
import java.util.Iterator;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import m83.AbstractC25247g0;
import n53.C26318e;
import p322m7.C25158l0;
import p442qy.C30765d;
import p478s3.AbstractC32098d;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import p599wz.C37724i0;
import p599wz.C37727j0;
import p599wz.C37736m0;
import p599wz.C37738n;
import p599wz.C37755s1;
import p599wz.InterfaceC37739n0;
import p631xz.C38721f0;
import p631xz.C38747x;
import p665yz.C39899b;
import p665yz.C39902e;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: p00.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C28578o extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C30765d f115624E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC37739n0 f115625F;

    /* JADX INFO: renamed from: G */
    public final C37755s1 f115626G;

    /* JADX INFO: renamed from: H */
    public final C25158l0 f115627H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC4339a f115628I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC4339a f115629J;

    /* JADX INFO: renamed from: K */
    public final Function1 f115630K;

    /* JADX INFO: renamed from: L */
    public final C13045h2 f115631L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f115632M;

    /* JADX INFO: renamed from: N */
    public final C15399o1 f115633N;

    /* JADX INFO: renamed from: O */
    public final C13081r1 f115634O;

    /* JADX INFO: renamed from: P */
    public boolean f115635P;

    /* JADX INFO: renamed from: w */
    public final C11433l f115636w;

    /* JADX INFO: renamed from: x */
    public final C38721f0 f115637x;

    /* JADX INFO: renamed from: y */
    public final C38747x f115638y;

    /* JADX INFO: renamed from: z */
    public final C39899b f115639z;

    public C28578o(C11433l linkAccount, C38721f0 linkAccountHolder, C38747x linkAccountManager, C39899b linkEventsReporter, C30765d logger, InterfaceC37739n0 linkLaunchMode, C37755s1 webLinkAuthChannel, boolean z4, C25158l0 c25158l0, InterfaceC4339a onChangeEmailRequested, InterfaceC4339a onDismissClicked, Function1 dismissWithResult) {
        AbstractC22676k.m65750j(linkAccount, "linkAccount");
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(linkEventsReporter, "linkEventsReporter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(webLinkAuthChannel, "webLinkAuthChannel");
        AbstractC22676k.m65750j(onChangeEmailRequested, "onChangeEmailRequested");
        AbstractC22676k.m65750j(onDismissClicked, "onDismissClicked");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f115636w = linkAccount;
        this.f115637x = linkAccountHolder;
        this.f115638y = linkAccountManager;
        this.f115639z = linkEventsReporter;
        this.f115624E = logger;
        this.f115625F = linkLaunchMode;
        this.f115626G = webLinkAuthChannel;
        this.f115627H = c25158l0;
        this.f115628I = onChangeEmailRequested;
        this.f115629J = onDismissClicked;
        this.f115630K = dismissWithResult;
        boolean z13 = linkAccount.f36658M != null;
        String str = linkAccount.f36651F;
        String str2 = linkAccount.f36653H;
        boolean z14 = !z4 || (linkLaunchMode instanceof C37736m0);
        C11434m c11434m = linkAccount.f36662z;
        InterfaceC30057d interfaceC30057d = null;
        InterfaceC11432k interfaceC11432k = c11434m != null ? c11434m.f36664x : null;
        C11431j c11431j = interfaceC11432k instanceof C11431j ? (C11431j) interfaceC11432k : null;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C28580q(false, true, null, false, false, str, str2, z4, z14, null, c11431j != null ? c11431j.f36649w : null, z13));
        this.f115631L = c13045h2M36593c;
        this.f115632M = c13045h2M36593c;
        C15399o1 c15399o1Transform = OTPSpec.INSTANCE.transform();
        this.f115633N = c15399o1Transform;
        this.f115634O = AbstractC13091v.m36587M(new C3383g((C26318e) c15399o1Transform.mo43551e(), 4), AbstractC1640x1.m5043b(this), C13105z1.f45289b, null);
        if (((C28580q) c13045h2M36593c.getValue()).f115647L) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C28575l(this, interfaceC30057d, 3), 3);
        } else if (!AbstractC22676k.m65745e(linkAccount.f36657L, C11425d.f36645a)) {
            m86910p(false);
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C28575l(this, interfaceC30057d, 1), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C28575l(this, interfaceC30057d, 2), 3);
    }

    /* JADX INFO: renamed from: g */
    public final void m86905g() {
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        do {
            c13045h2 = this.f115631L;
            value = c13045h2.getValue();
            it = (C28580q) value;
            AbstractC22676k.m65750j(it, "it");
        } while (!c13045h2.m36569i(value, C28580q.m86911b(it, false, null, false, false, 4091)));
    }

    /* JADX INFO: renamed from: j */
    public final void m86906j() {
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        do {
            c13045h2 = this.f115631L;
            value = c13045h2.getValue();
            it = (C28580q) value;
            AbstractC22676k.m65750j(it, "it");
        } while (!c13045h2.m36569i(value, C28580q.m86911b(it, false, null, false, false, 4079)));
    }

    /* JADX INFO: renamed from: l */
    public final void m86907l() {
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        do {
            c13045h2 = this.f115631L;
            value = c13045h2.getValue();
            it = (C28580q) value;
            AbstractC22676k.m65750j(it, "it");
        } while (!c13045h2.m36569i(value, C28580q.m86911b(it, false, null, false, false, 4093)));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m86908n(String str, InterfaceC30057d interfaceC30057d) {
        C28576m c28576m;
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        Object objM124150a;
        C28578o c28578o;
        Object value2;
        C28580q it3;
        Object value3;
        C28580q it4;
        if (interfaceC30057d instanceof C28576m) {
            c28576m = (C28576m) interfaceC30057d;
            int i13 = c28576m.f115620z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28576m.f115620z = i13 - Integer.MIN_VALUE;
            } else {
                c28576m = new C28576m(this, interfaceC30057d);
            }
        } else {
            c28576m = new C28576m(this, interfaceC30057d);
        }
        Object obj = c28576m.f115618x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28576m.f115620z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            do {
                c13045h2 = this.f115631L;
                value = c13045h2.getValue();
                it = (C28580q) value;
                AbstractC22676k.m65750j(it, "it");
            } while (!c13045h2.m36569i(value, C28580q.m86911b(it, true, null, false, false, 4090)));
            boolean z13 = this.f115635P;
            Boolean boolValueOf = Boolean.valueOf(z13);
            if (!z13) {
                boolValueOf = null;
            }
            c28576m.f115617w = this;
            c28576m.f115620z = 1;
            objM124150a = this.f115638y.m124150a(str, boolValueOf, c28576m);
            if (objM124150a == enumC31071a) {
                return enumC31071a;
            }
            c28578o = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28578o = c28576m.f115617w;
            AbstractC34132o.m107864I(obj);
            objM124150a = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM124150a);
        if (thM68037a == null) {
            C11433l c11433l = (C11433l) objM124150a;
            C13045h2 c13045h3 = c28578o.f115631L;
            C38747x c38747x = c28578o.f115638y;
            Function1 function1 = c28578o.f115630K;
            do {
                value3 = c13045h3.getValue();
                it4 = (C28580q) value3;
                AbstractC22676k.m65750j(it4, "it");
            } while (!c13045h3.m36569i(value3, C28580q.m86911b(it4, false, null, false, false, 4094)));
            InterfaceC37739n0 interfaceC37739n0 = c28578o.f115625F;
            boolean z14 = interfaceC37739n0 instanceof C37724i0;
            if (interfaceC37739n0 instanceof C37727j0) {
                C11434m c11434m = c11433l.f36662z;
                if ((c11434m != null ? c11434m.f36664x : null) != null) {
                    if (!((c11434m != null ? c11434m.f36664x : null) instanceof C11431j)) {
                        z4 = false;
                    }
                }
            } else {
                z4 = false;
            }
            if (z14) {
                function1.invoke(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, null, 14));
            } else if (z4) {
                function1.invoke(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, Boolean.TRUE, 6));
            } else {
                c28578o.f115627H.invoke(null);
            }
        } else {
            Iterator it5 = c28578o.f115633N.f57854b.f57834b.iterator();
            while (it5.hasNext()) {
                C13045h2 c13045h4 = (C13045h2) ((InterfaceC13075p1) it5.next());
                c13045h4.getClass();
                c13045h4.m36571k(null, "");
            }
            InterfaceC41211c interfaceC41211cM113429x = AbstractC35785b.m113429x(thM68037a);
            c28578o.f115624E.m94512b("VerificationViewModel Error: ", thM68037a);
            C13045h2 c13045h5 = c28578o.f115631L;
            do {
                value2 = c13045h5.getValue();
                it3 = (C28580q) value2;
                AbstractC22676k.m65750j(it3, "it");
            } while (!c13045h5.m36569i(value2, C28580q.m86911b(it3, false, interfaceC41211cM113429x, false, false, 4090)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public final void m86909o() {
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        C39899b c39899b = this.f115639z;
        c39899b.getClass();
        c39899b.m128003a(new C39902e(), AbstractC25247g0.m73989X(new C23465k("verification_type", "SMS")));
        do {
            c13045h2 = this.f115631L;
            value = c13045h2.getValue();
            it = (C28580q) value;
            AbstractC22676k.m65750j(it, "it");
        } while (!c13045h2.m36569i(value, C28580q.m86911b(it, false, null, true, false, 4087)));
        m86910p(true);
    }

    /* JADX INFO: renamed from: p */
    public final void m86910p(boolean z4) {
        C13045h2 c13045h2;
        Object value;
        C28580q it;
        do {
            c13045h2 = this.f115631L;
            value = c13045h2.getValue();
            it = (C28580q) value;
            AbstractC22676k.m65750j(it, "it");
        } while (!c13045h2.m36569i(value, C28580q.m86911b(it, false, null, false, false, 4091)));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C28577n(this, z4, null), 3);
    }
}
